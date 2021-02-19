package com.pds.headless.internal.resource.v1_0;

import com.liferay.portal.vulcan.pagination.Page;
import com.pds.headless.dto.v1_0.AttributeType;
import com.pds.headless.resource.v1_0.AttributeTypeResource;
import com.pds.smartstone.model.PersistedAttributeType;
import com.pds.smartstone.model.impl.PersistedAttributeTypeImpl;
import com.pds.smartstone.service.PersistedAttributeTypeLocalService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import java.util.ArrayList;
import java.util.List;

/**
 * @author reza
 */
@Component(
        properties = "OSGI-INF/liferay/rest/v1_0/attribute-type.properties",
        scope = ServiceScope.PROTOTYPE, service = AttributeTypeResource.class
)
public class AttributeTypeResourceImpl extends BaseAttributeTypeResourceImpl {


    @Reference
    private PersistedAttributeTypeLocalService _AttributeTypeService;


    @Override
    public Page<AttributeType> getAttributeTypesPage() throws Exception {
//        PersistedAttributeTypeUtil util = new PersistedAttributeTypeUtil();

        List<PersistedAttributeType> persistedAttributeTypeList = new ArrayList<>();
        List<AttributeType> attributeTypes = new ArrayList<AttributeType>();
        try {
            int end = _AttributeTypeService.getPersistedAttributeTypesCount();
            persistedAttributeTypeList= _AttributeTypeService.getPersistedAttributeTypes(0,end);
//            persistedAttributeTypeList = PersistedAttributeTypeUtil.findAll();

            for (PersistedAttributeType persistedAttributeType : persistedAttributeTypeList) {
                attributeTypes.add(convertPersistedAttributeToAttribute(persistedAttributeType));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Page.of(attributeTypes);
    }


    private AttributeType convertPersistedAttributeToAttribute(PersistedAttributeType persistedAttributeType) {
        AttributeType attributeType = new AttributeType();
        attributeType.setId(persistedAttributeType.getId());
        attributeType.setDescription(persistedAttributeType.getDescription());
        attributeType.setCode(persistedAttributeType.getCode());
        attributeType.setName(persistedAttributeType.getName());
        return attributeType;
    }

    private PersistedAttributeType convertAttributeToPersistedAttribute(AttributeType attributeType) {
        PersistedAttributeType persistedAttributeType = new PersistedAttributeTypeImpl();
        persistedAttributeType.setId(attributeType.getId());
        persistedAttributeType.setDescription(attributeType.getDescription());
        persistedAttributeType.setCode(attributeType.getCode());
        persistedAttributeType.setName(attributeType.getName());
        return persistedAttributeType;
    }
}