package com.pds.headless.internal.resource.v1_0;

import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.pds.headless.dto.v1_0.Attribute;
import com.pds.headless.internal.entity.v1_0.AttributeEntityModel;
import com.pds.headless.resource.v1_0.AttributeResource;
import com.pds.smartstone.model.PersistedAttribute;
import com.pds.smartstone.model.impl.PersistedAttributeImpl;
import com.pds.smartstone.service.PersistedAttributeLocalService;
//import com.pds.smartstone.service.PersistedAttributeService;
import io.swagger.v3.oas.annotations.Parameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import javax.validation.constraints.NotNull;
import javax.ws.rs.PathParam;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author reza
 */
@Component(
        properties = "OSGI-INF/liferay/rest/v1_0/attribute.properties",
        scope = ServiceScope.PROTOTYPE, service = AttributeResource.class
)
public class AttributeResourceImpl extends BaseAttributeResourceImpl {
    AttributeEntityModel attributeEntityModel = new AttributeEntityModel();

    @Reference
    private PersistedAttributeLocalService _attributeService;

    //    @Override
    public void deleteAttribute(@NotNull Integer id) throws Exception {
        try {
            _attributeService.deletePersistedAttribute(id);
        } catch (Exception e) {
            _log.error("Error occured while deleting participant: " + e.getMessage(), e);
            throw e;
        }
    }


    @Override
    public Attribute postAttribute(Attribute attribute) throws Exception {
        try {

            PersistedAttribute attributeModel = new PersistedAttributeImpl();

            attributeModel.setValue(attribute.getValue());
            attributeModel.setDescription(attribute.getDescription());
            attributeModel.setTypeId(attribute.getTypeId());

            ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

            attributeModel.setCreatedBy((int) serviceContext.getUserId());
            attributeModel.setCreatedOn(new Date());
            attributeModel.setLanguageId(10);

            attributeModel = _attributeService.addPersistedAttribute(attributeModel);
            Attribute serviceRes;
            serviceRes = convertPersistedAttributeToAttribute(attributeModel);
            return serviceRes;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Attribute putAttribute(@NotNull Long attributeId, Attribute attribute) throws Exception {
        try {
            PersistedAttribute pa = _attributeService.updatePersistedAttribute(
                    convertAttributeToPersistedAttribute(attribute));
            return convertPersistedAttributeToAttribute(pa);
        } catch (Exception e) {
            _log.error("Error occurred while updating booking: " + e.getMessage(), e);
            throw e;
        }

    }

    private Attribute convertPersistedAttributeToAttribute(PersistedAttribute persistedAttribute) {
        Attribute attribute = new Attribute();
        attribute.setValue(persistedAttribute.getValue());
        attribute.setDescription(persistedAttribute.getDescription());
        attribute.setTypeId(persistedAttribute.getTypeId());
        attribute.setCreatedBy(persistedAttribute.getCreatedBy());
        attribute.setCreatedOn(persistedAttribute.getCreatedOn().toString());
        attribute.setLanguageId(persistedAttribute.getLanguageId());
        attribute.setId(persistedAttribute.getId());
        attribute.setDeletedBy(persistedAttribute.getDeletedBy());
        attribute.setDeletedOn(persistedAttribute.getDeletedOn().toString());
        return attribute;
    }

    private PersistedAttribute convertAttributeToPersistedAttribute(Attribute attribute) {
        //This line has runtime error
        PersistedAttribute persistedAttribute = new PersistedAttributeImpl();
        persistedAttribute.setValue(attribute.getValue());
        persistedAttribute.setDescription(attribute.getDescription());
        persistedAttribute.setTypeId(attribute.getTypeId());
        persistedAttribute.setCreatedBy(attribute.getCreatedBy());
        persistedAttribute.setCreatedOn(dateStringConvert(attribute.getCreatedOn()));
        persistedAttribute.setLanguageId(attribute.getLanguageId());
        persistedAttribute.setId(attribute.getId());
        persistedAttribute.setDeletedBy(attribute.getDeletedBy());
        persistedAttribute.setDeletedOn(dateStringConvert(attribute.getDeletedOn()));
        return persistedAttribute;
    }

    public Date dateStringConvert(String date) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = new Date();
        try {
            date1 = formatter.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date1;

    }

    private static final Logger _log = LoggerFactory.getLogger(AttributeResourceImpl.class);

}