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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PersistedAttribute}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PersistedAttribute
 * @generated
 */
public class PersistedAttributeWrapper
	extends BaseModelWrapper<PersistedAttribute>
	implements ModelWrapper<PersistedAttribute>, PersistedAttribute {

	public PersistedAttributeWrapper(PersistedAttribute persistedAttribute) {
		super(persistedAttribute);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id", getId());
		attributes.put("typeId", getTypeId());
		attributes.put("value", getValue());
		attributes.put("description", getDescription());
		attributes.put("languageId", getLanguageId());
		attributes.put("createdOn", getCreatedOn());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("modifiedOn", getModifiedOn());
		attributes.put("modifiedBy", getModifiedBy());
		attributes.put("deletedOn", getDeletedOn());
		attributes.put("deletedBy", getDeletedBy());

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

		Long typeId = (Long)attributes.get("typeId");

		if (typeId != null) {
			setTypeId(typeId);
		}

		String value = (String)attributes.get("value");

		if (value != null) {
			setValue(value);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long languageId = (Long)attributes.get("languageId");

		if (languageId != null) {
			setLanguageId(languageId);
		}

		Date createdOn = (Date)attributes.get("createdOn");

		if (createdOn != null) {
			setCreatedOn(createdOn);
		}

		Long createdBy = (Long)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		Date modifiedOn = (Date)attributes.get("modifiedOn");

		if (modifiedOn != null) {
			setModifiedOn(modifiedOn);
		}

		Long modifiedBy = (Long)attributes.get("modifiedBy");

		if (modifiedBy != null) {
			setModifiedBy(modifiedBy);
		}

		Date deletedOn = (Date)attributes.get("deletedOn");

		if (deletedOn != null) {
			setDeletedOn(deletedOn);
		}

		Long deletedBy = (Long)attributes.get("deletedBy");

		if (deletedBy != null) {
			setDeletedBy(deletedBy);
		}
	}

	/**
	 * Returns the created by of this persisted attribute.
	 *
	 * @return the created by of this persisted attribute
	 */
	@Override
	public long getCreatedBy() {
		return model.getCreatedBy();
	}

	/**
	 * Returns the created on of this persisted attribute.
	 *
	 * @return the created on of this persisted attribute
	 */
	@Override
	public Date getCreatedOn() {
		return model.getCreatedOn();
	}

	/**
	 * Returns the deleted by of this persisted attribute.
	 *
	 * @return the deleted by of this persisted attribute
	 */
	@Override
	public long getDeletedBy() {
		return model.getDeletedBy();
	}

	/**
	 * Returns the deleted on of this persisted attribute.
	 *
	 * @return the deleted on of this persisted attribute
	 */
	@Override
	public Date getDeletedOn() {
		return model.getDeletedOn();
	}

	/**
	 * Returns the description of this persisted attribute.
	 *
	 * @return the description of this persisted attribute
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the ID of this persisted attribute.
	 *
	 * @return the ID of this persisted attribute
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the language ID of this persisted attribute.
	 *
	 * @return the language ID of this persisted attribute
	 */
	@Override
	public long getLanguageId() {
		return model.getLanguageId();
	}

	/**
	 * Returns the modified by of this persisted attribute.
	 *
	 * @return the modified by of this persisted attribute
	 */
	@Override
	public long getModifiedBy() {
		return model.getModifiedBy();
	}

	/**
	 * Returns the modified on of this persisted attribute.
	 *
	 * @return the modified on of this persisted attribute
	 */
	@Override
	public Date getModifiedOn() {
		return model.getModifiedOn();
	}

	/**
	 * Returns the primary key of this persisted attribute.
	 *
	 * @return the primary key of this persisted attribute
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the type ID of this persisted attribute.
	 *
	 * @return the type ID of this persisted attribute
	 */
	@Override
	public long getTypeId() {
		return model.getTypeId();
	}

	/**
	 * Returns the uuid of this persisted attribute.
	 *
	 * @return the uuid of this persisted attribute
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the value of this persisted attribute.
	 *
	 * @return the value of this persisted attribute
	 */
	@Override
	public String getValue() {
		return model.getValue();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the created by of this persisted attribute.
	 *
	 * @param createdBy the created by of this persisted attribute
	 */
	@Override
	public void setCreatedBy(long createdBy) {
		model.setCreatedBy(createdBy);
	}

	/**
	 * Sets the created on of this persisted attribute.
	 *
	 * @param createdOn the created on of this persisted attribute
	 */
	@Override
	public void setCreatedOn(Date createdOn) {
		model.setCreatedOn(createdOn);
	}

	/**
	 * Sets the deleted by of this persisted attribute.
	 *
	 * @param deletedBy the deleted by of this persisted attribute
	 */
	@Override
	public void setDeletedBy(long deletedBy) {
		model.setDeletedBy(deletedBy);
	}

	/**
	 * Sets the deleted on of this persisted attribute.
	 *
	 * @param deletedOn the deleted on of this persisted attribute
	 */
	@Override
	public void setDeletedOn(Date deletedOn) {
		model.setDeletedOn(deletedOn);
	}

	/**
	 * Sets the description of this persisted attribute.
	 *
	 * @param description the description of this persisted attribute
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the ID of this persisted attribute.
	 *
	 * @param id the ID of this persisted attribute
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the language ID of this persisted attribute.
	 *
	 * @param languageId the language ID of this persisted attribute
	 */
	@Override
	public void setLanguageId(long languageId) {
		model.setLanguageId(languageId);
	}

	/**
	 * Sets the modified by of this persisted attribute.
	 *
	 * @param modifiedBy the modified by of this persisted attribute
	 */
	@Override
	public void setModifiedBy(long modifiedBy) {
		model.setModifiedBy(modifiedBy);
	}

	/**
	 * Sets the modified on of this persisted attribute.
	 *
	 * @param modifiedOn the modified on of this persisted attribute
	 */
	@Override
	public void setModifiedOn(Date modifiedOn) {
		model.setModifiedOn(modifiedOn);
	}

	/**
	 * Sets the primary key of this persisted attribute.
	 *
	 * @param primaryKey the primary key of this persisted attribute
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the type ID of this persisted attribute.
	 *
	 * @param typeId the type ID of this persisted attribute
	 */
	@Override
	public void setTypeId(long typeId) {
		model.setTypeId(typeId);
	}

	/**
	 * Sets the uuid of this persisted attribute.
	 *
	 * @param uuid the uuid of this persisted attribute
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the value of this persisted attribute.
	 *
	 * @param value the value of this persisted attribute
	 */
	@Override
	public void setValue(String value) {
		model.setValue(value);
	}

	@Override
	protected PersistedAttributeWrapper wrap(
		PersistedAttribute persistedAttribute) {

		return new PersistedAttributeWrapper(persistedAttribute);
	}

}