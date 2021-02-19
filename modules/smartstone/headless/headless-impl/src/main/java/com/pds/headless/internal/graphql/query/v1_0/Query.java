package com.pds.headless.internal.graphql.query.v1_0;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.pagination.Page;

import com.pds.headless.dto.v1_0.Attribute;
import com.pds.headless.dto.v1_0.AttributeType;
import com.pds.headless.resource.v1_0.AttributeResource;
import com.pds.headless.resource.v1_0.AttributeTypeResource;

import java.util.Map;
import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author reza
 * @generated
 */
@Generated("")
public class Query {

	public static void setAttributeResourceComponentServiceObjects(
		ComponentServiceObjects<AttributeResource>
			attributeResourceComponentServiceObjects) {

		_attributeResourceComponentServiceObjects =
			attributeResourceComponentServiceObjects;
	}

	public static void setAttributeTypeResourceComponentServiceObjects(
		ComponentServiceObjects<AttributeTypeResource>
			attributeTypeResourceComponentServiceObjects) {

		_attributeTypeResourceComponentServiceObjects =
			attributeTypeResourceComponentServiceObjects;
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {attributeTypeByCode(code: ___){id, name, code, description}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField(
		description = "Multiple status values can be provided with comma separated strings"
	)
	public AttributeType attributeTypeByCode(@GraphQLName("code") String code)
		throws Exception {

		return _applyComponentServiceObjects(
			_attributeTypeResourceComponentServiceObjects,
			this::_populateResourceContext,
			attributeTypeResource ->
				attributeTypeResource.getAttributeTypeByCode(code));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {attributeTypeById(id: ___){id, name, code, description}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField(
		description = "Multiple status values can be provided with comma separated strings"
	)
	public AttributeType attributeTypeById(@GraphQLName("id") Long id)
		throws Exception {

		return _applyComponentServiceObjects(
			_attributeTypeResourceComponentServiceObjects,
			this::_populateResourceContext,
			attributeTypeResource -> attributeTypeResource.getAttributeTypeById(
				id));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {attributeTypes{items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField(
		description = "Multiple status values can be provided with comma separated strings"
	)
	public AttributeTypePage attributeTypes() throws Exception {
		return _applyComponentServiceObjects(
			_attributeTypeResourceComponentServiceObjects,
			this::_populateResourceContext,
			attributeTypeResource -> new AttributeTypePage(
				attributeTypeResource.getAttributeTypesPage()));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {attributeById(id: ___){id, typeId, value, description, languageId, createdOn, createdBy, deletedOn, deletedBy, updatedOn, updatedBy}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField(
		description = "Multiple status values can be provided with comma separated strings"
	)
	public Attribute attributeById(@GraphQLName("id") Long id)
		throws Exception {

		return _applyComponentServiceObjects(
			_attributeResourceComponentServiceObjects,
			this::_populateResourceContext,
			attributeResource -> attributeResource.getAttributeById(id));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {attributeByTypeId(typeId: ___){id, typeId, value, description, languageId, createdOn, createdBy, deletedOn, deletedBy, updatedOn, updatedBy}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField(
		description = "Multiple status values can be provided with comma separated strings"
	)
	public Attribute attributeByTypeId(@GraphQLName("typeId") Long typeId)
		throws Exception {

		return _applyComponentServiceObjects(
			_attributeResourceComponentServiceObjects,
			this::_populateResourceContext,
			attributeResource -> attributeResource.getAttributeByTypeId(
				typeId));
	}

	@GraphQLName("AttributePage")
	public class AttributePage {

		public AttributePage(Page attributePage) {
			actions = attributePage.getActions();
			items = attributePage.getItems();
			lastPage = attributePage.getLastPage();
			page = attributePage.getPage();
			pageSize = attributePage.getPageSize();
			totalCount = attributePage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<Attribute> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	@GraphQLName("AttributeTypePage")
	public class AttributeTypePage {

		public AttributeTypePage(Page attributeTypePage) {
			actions = attributeTypePage.getActions();
			items = attributeTypePage.getItems();
			lastPage = attributeTypePage.getLastPage();
			page = attributeTypePage.getPage();
			pageSize = attributeTypePage.getPageSize();
			totalCount = attributeTypePage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<AttributeType> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

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

	private void _populateResourceContext(AttributeResource attributeResource)
		throws Exception {

		attributeResource.setContextAcceptLanguage(_acceptLanguage);
		attributeResource.setContextCompany(_company);
		attributeResource.setContextHttpServletRequest(_httpServletRequest);
		attributeResource.setContextHttpServletResponse(_httpServletResponse);
		attributeResource.setContextUriInfo(_uriInfo);
		attributeResource.setContextUser(_user);
	}

	private void _populateResourceContext(
			AttributeTypeResource attributeTypeResource)
		throws Exception {

		attributeTypeResource.setContextAcceptLanguage(_acceptLanguage);
		attributeTypeResource.setContextCompany(_company);
		attributeTypeResource.setContextHttpServletRequest(_httpServletRequest);
		attributeTypeResource.setContextHttpServletResponse(
			_httpServletResponse);
		attributeTypeResource.setContextUriInfo(_uriInfo);
		attributeTypeResource.setContextUser(_user);
	}

	private static ComponentServiceObjects<AttributeResource>
		_attributeResourceComponentServiceObjects;
	private static ComponentServiceObjects<AttributeTypeResource>
		_attributeTypeResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private BiFunction<Object, String, Filter> _filterBiFunction;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private com.liferay.portal.kernel.model.Company _company;
	private com.liferay.portal.kernel.model.User _user;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private UriInfo _uriInfo;

}