/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.pds.smartstone.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the PersistedAttributeType service. Represents a row in the &quot;AttributeType&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.pds.smartstone.model.impl.PersistedAttributeTypeModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.pds.smartstone.model.impl.PersistedAttributeTypeImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PersistedAttributeType
 * @generated
 */
@ProviderType
public interface PersistedAttributeTypeModel
	extends BaseModel<PersistedAttributeType> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a persisted attribute type model instance should use the {@link PersistedAttributeType} interface instead.
	 */

	/**
	 * Returns the primary key of this persisted attribute type.
	 *
	 * @return the primary key of this persisted attribute type
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this persisted attribute type.
	 *
	 * @param primaryKey the primary key of this persisted attribute type
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this persisted attribute type.
	 *
	 * @return the uuid of this persisted attribute type
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this persisted attribute type.
	 *
	 * @param uuid the uuid of this persisted attribute type
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the ID of this persisted attribute type.
	 *
	 * @return the ID of this persisted attribute type
	 */
	public long getId();

	/**
	 * Sets the ID of this persisted attribute type.
	 *
	 * @param id the ID of this persisted attribute type
	 */
	public void setId(long id);

	/**
	 * Returns the name of this persisted attribute type.
	 *
	 * @return the name of this persisted attribute type
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this persisted attribute type.
	 *
	 * @param name the name of this persisted attribute type
	 */
	public void setName(String name);

	/**
	 * Returns the code of this persisted attribute type.
	 *
	 * @return the code of this persisted attribute type
	 */
	@AutoEscape
	public String getCode();

	/**
	 * Sets the code of this persisted attribute type.
	 *
	 * @param code the code of this persisted attribute type
	 */
	public void setCode(String code);

	/**
	 * Returns the description of this persisted attribute type.
	 *
	 * @return the description of this persisted attribute type
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this persisted attribute type.
	 *
	 * @param description the description of this persisted attribute type
	 */
	public void setDescription(String description);

}