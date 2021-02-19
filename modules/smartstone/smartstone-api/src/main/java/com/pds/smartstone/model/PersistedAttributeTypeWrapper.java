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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PersistedAttributeType}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PersistedAttributeType
 * @generated
 */
public class PersistedAttributeTypeWrapper
	extends BaseModelWrapper<PersistedAttributeType>
	implements ModelWrapper<PersistedAttributeType>, PersistedAttributeType {

	public PersistedAttributeTypeWrapper(
		PersistedAttributeType persistedAttributeType) {

		super(persistedAttributeType);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("code", getCode());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	/**
	 * Returns the code of this persisted attribute type.
	 *
	 * @return the code of this persisted attribute type
	 */
	@Override
	public String getCode() {
		return model.getCode();
	}

	/**
	 * Returns the description of this persisted attribute type.
	 *
	 * @return the description of this persisted attribute type
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the ID of this persisted attribute type.
	 *
	 * @return the ID of this persisted attribute type
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the name of this persisted attribute type.
	 *
	 * @return the name of this persisted attribute type
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this persisted attribute type.
	 *
	 * @return the primary key of this persisted attribute type
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this persisted attribute type.
	 *
	 * @return the uuid of this persisted attribute type
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the code of this persisted attribute type.
	 *
	 * @param code the code of this persisted attribute type
	 */
	@Override
	public void setCode(String code) {
		model.setCode(code);
	}

	/**
	 * Sets the description of this persisted attribute type.
	 *
	 * @param description the description of this persisted attribute type
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the ID of this persisted attribute type.
	 *
	 * @param id the ID of this persisted attribute type
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the name of this persisted attribute type.
	 *
	 * @param name the name of this persisted attribute type
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this persisted attribute type.
	 *
	 * @param primaryKey the primary key of this persisted attribute type
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this persisted attribute type.
	 *
	 * @param uuid the uuid of this persisted attribute type
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected PersistedAttributeTypeWrapper wrap(
		PersistedAttributeType persistedAttributeType) {

		return new PersistedAttributeTypeWrapper(persistedAttributeType);
	}

}