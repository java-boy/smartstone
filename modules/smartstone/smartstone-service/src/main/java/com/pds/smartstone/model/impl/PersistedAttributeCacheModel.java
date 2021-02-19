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

import com.pds.smartstone.model.PersistedAttribute;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PersistedAttribute in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PersistedAttributeCacheModel
	implements CacheModel<PersistedAttribute>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PersistedAttributeCacheModel)) {
			return false;
		}

		PersistedAttributeCacheModel persistedAttributeCacheModel =
			(PersistedAttributeCacheModel)object;

		if (id == persistedAttributeCacheModel.id) {
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
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", id=");
		sb.append(id);
		sb.append(", typeId=");
		sb.append(typeId);
		sb.append(", value=");
		sb.append(value);
		sb.append(", description=");
		sb.append(description);
		sb.append(", languageId=");
		sb.append(languageId);
		sb.append(", createdOn=");
		sb.append(createdOn);
		sb.append(", createdBy=");
		sb.append(createdBy);
		sb.append(", modifiedOn=");
		sb.append(modifiedOn);
		sb.append(", modifiedBy=");
		sb.append(modifiedBy);
		sb.append(", deletedOn=");
		sb.append(deletedOn);
		sb.append(", deletedBy=");
		sb.append(deletedBy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PersistedAttribute toEntityModel() {
		PersistedAttributeImpl persistedAttributeImpl =
			new PersistedAttributeImpl();

		if (uuid == null) {
			persistedAttributeImpl.setUuid("");
		}
		else {
			persistedAttributeImpl.setUuid(uuid);
		}

		persistedAttributeImpl.setId(id);
		persistedAttributeImpl.setTypeId(typeId);

		if (value == null) {
			persistedAttributeImpl.setValue("");
		}
		else {
			persistedAttributeImpl.setValue(value);
		}

		if (description == null) {
			persistedAttributeImpl.setDescription("");
		}
		else {
			persistedAttributeImpl.setDescription(description);
		}

		persistedAttributeImpl.setLanguageId(languageId);

		if (createdOn == Long.MIN_VALUE) {
			persistedAttributeImpl.setCreatedOn(null);
		}
		else {
			persistedAttributeImpl.setCreatedOn(new Date(createdOn));
		}

		persistedAttributeImpl.setCreatedBy(createdBy);

		if (modifiedOn == Long.MIN_VALUE) {
			persistedAttributeImpl.setModifiedOn(null);
		}
		else {
			persistedAttributeImpl.setModifiedOn(new Date(modifiedOn));
		}

		persistedAttributeImpl.setModifiedBy(modifiedBy);

		if (deletedOn == Long.MIN_VALUE) {
			persistedAttributeImpl.setDeletedOn(null);
		}
		else {
			persistedAttributeImpl.setDeletedOn(new Date(deletedOn));
		}

		persistedAttributeImpl.setDeletedBy(deletedBy);

		persistedAttributeImpl.resetOriginalValues();

		return persistedAttributeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		id = objectInput.readLong();

		typeId = objectInput.readLong();
		value = objectInput.readUTF();
		description = objectInput.readUTF();

		languageId = objectInput.readLong();
		createdOn = objectInput.readLong();

		createdBy = objectInput.readLong();
		modifiedOn = objectInput.readLong();

		modifiedBy = objectInput.readLong();
		deletedOn = objectInput.readLong();

		deletedBy = objectInput.readLong();
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

		objectOutput.writeLong(typeId);

		if (value == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(value);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(languageId);
		objectOutput.writeLong(createdOn);

		objectOutput.writeLong(createdBy);
		objectOutput.writeLong(modifiedOn);

		objectOutput.writeLong(modifiedBy);
		objectOutput.writeLong(deletedOn);

		objectOutput.writeLong(deletedBy);
	}

	public String uuid;
	public long id;
	public long typeId;
	public String value;
	public String description;
	public long languageId;
	public long createdOn;
	public long createdBy;
	public long modifiedOn;
	public long modifiedBy;
	public long deletedOn;
	public long deletedBy;

}