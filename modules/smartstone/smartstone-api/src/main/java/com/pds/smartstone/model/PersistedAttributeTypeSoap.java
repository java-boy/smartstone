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
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class PersistedAttributeTypeSoap implements Serializable {

	public static PersistedAttributeTypeSoap toSoapModel(
		PersistedAttributeType model) {

		PersistedAttributeTypeSoap soapModel = new PersistedAttributeTypeSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId(model.getId());
		soapModel.setName(model.getName());
		soapModel.setCode(model.getCode());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static PersistedAttributeTypeSoap[] toSoapModels(
		PersistedAttributeType[] models) {

		PersistedAttributeTypeSoap[] soapModels =
			new PersistedAttributeTypeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PersistedAttributeTypeSoap[][] toSoapModels(
		PersistedAttributeType[][] models) {

		PersistedAttributeTypeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new PersistedAttributeTypeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PersistedAttributeTypeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PersistedAttributeTypeSoap[] toSoapModels(
		List<PersistedAttributeType> models) {

		List<PersistedAttributeTypeSoap> soapModels =
			new ArrayList<PersistedAttributeTypeSoap>(models.size());

		for (PersistedAttributeType model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(
			new PersistedAttributeTypeSoap[soapModels.size()]);
	}

	public PersistedAttributeTypeSoap() {
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

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getCode() {
		return _code;
	}

	public void setCode(String code) {
		_code = code;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private String _uuid;
	private long _id;
	private String _name;
	private String _code;
	private String _description;

}