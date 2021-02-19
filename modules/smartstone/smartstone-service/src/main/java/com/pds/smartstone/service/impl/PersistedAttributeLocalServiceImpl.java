/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 * <p>
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.pds.smartstone.service.impl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.model.SystemEventConstants;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.systemevent.SystemEvent;
import com.pds.smartstone.model.PersistedAttribute;

import com.pds.smartstone.service.base.PersistedAttributeLocalServiceBaseImpl;
import com.pds.smartstone.service.persistence.PersistedAttributePersistence;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * The implementation of the persisted attribute local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.pds.smartstone.service.PersistedAttributeLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PersistedAttributeLocalServiceBaseImpl
 */
@Component(
        property = "model.class.name=com.pds.smartstone.model.PersistedAttribute",
        service = AopService.class
)
public class PersistedAttributeLocalServiceImpl
        extends PersistedAttributeLocalServiceBaseImpl {

//
//    @Reference
//    protected PersistedAttributePersistence persistedAttributePersistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this class directly. Use <code>com.pds.smartstone.service.PersistedAttributeLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.pds.smartstone.service.PersistedAttributeLocalServiceUtil</code>.
     */

    @Indexable(type = IndexableType.REINDEX)
    @SystemEvent(type = SystemEventConstants.TYPE_DEFAULT)
    @Override
    public PersistedAttribute addPersistedAttribute(
            PersistedAttribute persistedAttribute) {

//        Long attributeId = counterLocalService.increment(PersistedAttribute.class.getName());

        PersistedAttribute entry;
//		PersistedAttribute entry = createPersistedAttribute(attributeId.intValue());

//        _validate(entry);

        entry = super.addPersistedAttribute(persistedAttribute);
        return entry;
    }

    public PersistedAttribute updateAttribute(final String oldId, final String id, final String typeId, final String value, final String description) {
        PersistedAttribute persistedAttribute = persistedAttributePersistence.fetchByPrimaryKey(Integer.valueOf(oldId));
        persistedAttribute.setTypeId(Integer.valueOf(typeId));
        persistedAttribute.setValue(value);
        persistedAttribute.setDescription(description);
        return super.updatePersistedAttribute(persistedAttribute);
    }

}