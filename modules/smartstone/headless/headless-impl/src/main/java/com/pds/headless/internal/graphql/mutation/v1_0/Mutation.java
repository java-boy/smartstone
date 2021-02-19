package com.pds.headless.internal.graphql.mutation.v1_0;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;

import com.pds.headless.dto.v1_0.Attribute;
import com.pds.headless.resource.v1_0.AttributeResource;

import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author reza
 * @generated
 */
@Generated("")
public class Mutation {

	public static void setAttributeResourceComponentServiceObjects(
		ComponentServiceObjects<AttributeResource>
			attributeResourceComponentServiceObjects) {

		_attributeResourceComponentServiceObjects =
			attributeResourceComponentServiceObjects;
	}

	@GraphQLField(
		description = "Multiple status values can be provided with comma separated strings"
	)
	public boolean deleteAttribute(@GraphQLName("id") Long id)
		throws Exception {

		_applyVoidComponentServiceObjects(
			_attributeResourceComponentServiceObjects,
			this::_populateResourceContext,
			attributeResource -> attributeResource.deleteAttribute(id));

		return true;
	}

	@GraphQLField
	public Response deleteAttributeBatch(
			@GraphQLName("id") Long id,
			@GraphQLName("callbackURL") String callbackURL,
			@GraphQLName("object") Object object)
		throws Exception {

		return _applyComponentServiceObjects(
			_attributeResourceComponentServiceObjects,
			this::_populateResourceContext,
			attributeResource -> attributeResource.deleteAttributeBatch(
				id, callbackURL, object));
	}

	@GraphQLField(
		description = "Replaces the attribute with the information sent in the request body."
	)
	public Attribute updateAttribute(
			@GraphQLName("id") Long id,
			@GraphQLName("attribute") Attribute attribute)
		throws Exception {

		return _applyComponentServiceObjects(
			_attributeResourceComponentServiceObjects,
			this::_populateResourceContext,
			attributeResource -> attributeResource.putAttribute(id, attribute));
	}

	@GraphQLField
	public Response updateAttributeBatch(
			@GraphQLName("id") Long id,
			@GraphQLName("callbackURL") String callbackURL,
			@GraphQLName("object") Object object)
		throws Exception {

		return _applyComponentServiceObjects(
			_attributeResourceComponentServiceObjects,
			this::_populateResourceContext,
			attributeResource -> attributeResource.putAttributeBatch(
				id, callbackURL, object));
	}

	@GraphQLField(description = "Create a new attribute.")
	public Attribute createAttribute(
			@GraphQLName("attribute") Attribute attribute)
		throws Exception {

		return _applyComponentServiceObjects(
			_attributeResourceComponentServiceObjects,
			this::_populateResourceContext,
			attributeResource -> attributeResource.postAttribute(attribute));
	}

	@GraphQLField
	public Response createAttributeBatch(
			@GraphQLName("callbackURL") String callbackURL,
			@GraphQLName("object") Object object)
		throws Exception {

		return _applyComponentServiceObjects(
			_attributeResourceComponentServiceObjects,
			this::_populateResourceContext,
			attributeResource -> attributeResource.postAttributeBatch(
				callbackURL, object));
	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private <T, E1 extends Throwable, E2 extends Throwable> void
			_applyVoidComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeConsumer<T, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			unsafeFunction.accept(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(AttributeResource attributeResource)
		throws Exception {

		attributeResource.setContextAcceptLanguage(_acceptLanguage);
		attributeResource.setContextCompany(_company);
		attributeResource.setContextHttpServletRequest(_httpServletRequest);
		attributeResource.setContextHttpServletResponse(_httpServletResponse);
		attributeResource.setContextUriInfo(_uriInfo);
		attributeResource.setContextUser(_user);
	}

	private static ComponentServiceObjects<AttributeResource>
		_attributeResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private com.liferay.portal.kernel.model.User _user;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private UriInfo _uriInfo;

}