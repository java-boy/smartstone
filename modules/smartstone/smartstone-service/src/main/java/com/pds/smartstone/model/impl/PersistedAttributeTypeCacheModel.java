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

package com.pds.smartstone.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.pds.smartstone.model.PersistedAttributeType;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing PersistedAttributeType in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PersistedAttributeTypeCacheModel
	implements CacheModel<PersistedAttributeType>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PersistedAttributeTypeCacheModel)) {
			return false;
		}

		PersistedAttributeTypeCacheModel persistedAttributeTypeCacheModel =
			(PersistedAttributeTypeCacheModel)object;

		if (id == persistedAttributeTypeCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", id=");
		sb.append(id);
		sb.append(", name=");
		sb.append(name);
		sb.append(", code=");
		sb.append(code);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PersistedAttributeType toEntityModel() {
		PersistedAttributeTypeImpl persistedAttributeTypeImpl =
			new PersistedAttributeTypeImpl();

		if (uuid == null) {
			persistedAttributeTypeImpl.setUuid("");
		}
		else {
			persistedAttributeTypeImpl.setUuid(uuid);
		}

		persistedAttributeTypeImpl.setId(id);

		if (name == null) {
			persistedAttributeTypeImpl.setName("");
		}
		else {
			persistedAttributeTypeImpl.setName(name);
		}

		if (code == null) {
			persistedAttributeTypeImpl.setCode("");
		}
		else {
			persistedAttributeTypeImpl.setCode(code);
		}

		if (description == null) {
			persistedAttributeTypeImpl.setDescription("");
		}
		else {
			persistedAttributeTypeImpl.setDescription(description);
		}

		persistedAttributeTypeImpl.resetOriginalValues();

		return persistedAttributeTypeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		id = objectInput.readLong();
		name = objectInput.readUTF();
		code = objectInput.readUTF();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(id);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (code == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(code);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public String uuid;
	public long id;
	public String name;
	public String code;
	public String description;

}