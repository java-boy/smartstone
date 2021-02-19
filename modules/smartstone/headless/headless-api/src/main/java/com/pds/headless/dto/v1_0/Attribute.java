package com.pds.headless.dto.v1_0;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.util.ObjectMapperUtil;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author reza
 * @generated
 */
@Generated("")
@GraphQLName("Attribute")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Attribute")
public class Attribute {

	public static Attribute toDTO(String json) {
		return ObjectMapperUtil.readValue(Attribute.class, json);
	}

	@Schema(description = "The atribute createdBy.")
	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	@JsonIgnore
	public void setCreatedBy(
		UnsafeSupplier<Long, Exception> createdByUnsafeSupplier) {

		try {
			createdBy = createdByUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The atribute createdBy.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long createdBy;

	@Schema(description = "The atribute createdOn.")
	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	@JsonIgnore
	public void setCreatedOn(
		UnsafeSupplier<String, Exception> createdOnUnsafeSupplier) {

		try {
			createdOn = createdOnUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The atribute createdOn.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String createdOn;

	@Schema(description = "The atribute deletedBy.")
	public Long getDeletedBy() {
		return deletedBy;
	}

	public void setDeletedBy(Long deletedBy) {
		this.deletedBy = deletedBy;
	}

	@JsonIgnore
	public void setDeletedBy(
		UnsafeSupplier<Long, Exception> deletedByUnsafeSupplier) {

		try {
			deletedBy = deletedByUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The atribute deletedBy.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long deletedBy;

	@Schema(description = "The atribute deletedOn.")
	public String getDeletedOn() {
		return deletedOn;
	}

	public void setDeletedOn(String deletedOn) {
		this.deletedOn = deletedOn;
	}

	@JsonIgnore
	public void setDeletedOn(
		UnsafeSupplier<String, Exception> deletedOnUnsafeSupplier) {

		try {
			deletedOn = deletedOnUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The atribute deletedOn.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String deletedOn;

	@Schema(description = "The attribute Description.")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@JsonIgnore
	public void setDescription(
		UnsafeSupplier<String, Exception> descriptionUnsafeSupplier) {

		try {
			description = descriptionUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The attribute Description.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String description;

	@Schema(description = "The Attribute id.")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@JsonIgnore
	public void setId(UnsafeSupplier<Long, Exception> idUnsafeSupplier) {
		try {
			id = idUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The Attribute id.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long id;

	@Schema(description = "The atribute language.")
	public Long getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
	}

	@JsonIgnore
	public void setLanguageId(
		UnsafeSupplier<Long, Exception> languageIdUnsafeSupplier) {

		try {
			languageId = languageIdUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The atribute language.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long languageId;

	@Schema(description = "The attribute type id.")
	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	@JsonIgnore
	public void setTypeId(
		UnsafeSupplier<Long, Exception> typeIdUnsafeSupplier) {

		try {
			typeId = typeIdUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The attribute type id.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long typeId;

	@Schema(description = "The atribute updatedBy.")
	public Long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	@JsonIgnore
	public void setUpdatedBy(
		UnsafeSupplier<Long, Exception> updatedByUnsafeSupplier) {

		try {
			updatedBy = updatedByUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The atribute updatedBy.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long updatedBy;

	@Schema(description = "The atribute updatedOn.")
	public String getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(String updatedOn) {
		this.updatedOn = updatedOn;
	}

	@JsonIgnore
	public void setUpdatedOn(
		UnsafeSupplier<String, Exception> updatedOnUnsafeSupplier) {

		try {
			updatedOn = updatedOnUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The atribute updatedOn.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String updatedOn;

	@Schema(description = "The attribute value.")
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@JsonIgnore
	public void setValue(
		UnsafeSupplier<String, Exception> valueUnsafeSupplier) {

		try {
			value = valueUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The attribute value.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String value;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Attribute)) {
			return false;
		}

		Attribute attribute = (Attribute)object;

		return Objects.equals(toString(), attribute.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (createdBy != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"createdBy\": ");

			sb.append(createdBy);
		}

		if (createdOn != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"createdOn\": ");

			sb.append("\"");

			sb.append(_escape(createdOn));

			sb.append("\"");
		}

		if (deletedBy != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"deletedBy\": ");

			sb.append(deletedBy);
		}

		if (deletedOn != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"deletedOn\": ");

			sb.append("\"");

			sb.append(_escape(deletedOn));

			sb.append("\"");
		}

		if (description != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"description\": ");

			sb.append("\"");

			sb.append(_escape(description));

			sb.append("\"");
		}

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		if (languageId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"languageId\": ");

			sb.append(languageId);
		}

		if (typeId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"typeId\": ");

			sb.append(typeId);
		}

		if (updatedBy != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"updatedBy\": ");

			sb.append(updatedBy);
		}

		if (updatedOn != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"updatedOn\": ");

			sb.append("\"");

			sb.append(_escape(updatedOn));

			sb.append("\"");
		}

		if (value != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"value\": ");

			sb.append("\"");

			sb.append(_escape(value));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		defaultValue = "com.pds.headless.dto.v1_0.Attribute",
		name = "x-class-name"
	)
	public String xClassName;

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		return string.replaceAll("\"", "\\\\\"");
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(entry.getKey());
			sb.append("\":");

			Object value = entry.getValue();

			Class<?> clazz = value.getClass();

			if (clazz.isArray()) {
				sb.append("[");

				Object[] valueArray = (Object[])value;

				for (int i = 0; i < valueArray.length; i++) {
					if (valueArray[i] instanceof String) {
						sb.append("\"");
						sb.append(valueArray[i]);
						sb.append("\"");
					}
					else {
						sb.append(valueArray[i]);
					}

					if ((i + 1) < valueArray.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof Map) {
				sb.append(_toJSON((Map<String, ?>)value));
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(value);
				sb.append("\"");
			}
			else {
				sb.append(value);
			}

			if (iterator.hasNext()) {
				sb.append(",");
			}
		}

		sb.append("}");

		return sb.toString();
	}

}