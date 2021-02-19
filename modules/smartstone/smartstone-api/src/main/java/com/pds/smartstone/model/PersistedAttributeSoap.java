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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class PersistedAttributeSoap implements Serializable {

	public static PersistedAttributeSoap toSoapModel(PersistedAttribute model) {
		PersistedAttributeSoap soapModel = new PersistedAttributeSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId(model.getId());
		soapModel.setTypeId(model.getTypeId());
		soapModel.setValue(model.getValue());
		soapModel.setDescription(model.getDescription());
		soapModel.setLanguageId(model.getLanguageId());
		soapModel.setCreatedOn(model.getCreatedOn());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setModifiedOn(model.getModifiedOn());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setDeletedOn(model.getDeletedOn());
		soapModel.setDeletedBy(model.getDeletedBy());

		return soapModel;
	}

	public static PersistedAttributeSoap[] toSoapModels(
		PersistedAttribute[] models) {

		PersistedAttributeSoap[] soapModels =
			new PersistedAttributeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PersistedAttributeSoap[][] toSoapModels(
		PersistedAttribute[][] models) {

		PersistedAttributeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new PersistedAttributeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PersistedAttributeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PersistedAttributeSoap[] toSoapModels(
		List<PersistedAttribute> models) {

		List<PersistedAttributeSoap> soapModels =
			new ArrayList<PersistedAttributeSoap>(models.size());

		for (PersistedAttribute model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(
			new PersistedAttributeSoap[soapModels.size()]);
	}

	public PersistedAttributeSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getTypeId() {
		return _typeId;
	}

	public void setTypeId(long typeId) {
		_typeId = typeId;
	}

	public String getValue() {
		return _value;
	}

	public void setValue(String value) {
		_value = value;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public long getLanguageId() {
		return _languageId;
	}

	public void setLanguageId(long languageId) {
		_languageId = languageId;
	}

	public Date getCreatedOn() {
		return _createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		_createdOn = createdOn;
	}

	public long getCreatedBy() {
		return _createdBy;
	}

	public void setCreatedBy(long createdBy) {
		_createdBy = createdBy;
	}

	public Date getModifiedOn() {
		return _modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		_modifiedOn = modifiedOn;
	}

	public long getModifiedBy() {
		return _modifiedBy;
	}

	public void setModifiedBy(long modifiedBy) {
		_modifiedBy = modifiedBy;
	}

	public Date getDeletedOn() {
		return _deletedOn;
	}

	public void setDeletedOn(Date deletedOn) {
		_deletedOn = deletedOn;
	}

	public long getDeletedBy() {
		return _deletedBy;
	}

	public void setDeletedBy(long deletedBy) {
		_deletedBy = deletedBy;
	}

	private String _uuid;
	private long _id;
	private long _typeId;
	private String _value;
	private String _description;
	private long _languageId;
	private Date _createdOn;
	private long _createdBy;
	private Date _modifiedOn;
	private long _modifiedBy;
	private Date _deletedOn;
	private long _deletedBy;

}