package com.pds.headless.internal.resource.v1_0;

import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.ResourceActionLocalService;
import com.liferay.portal.kernel.service.ResourcePermissionLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.batch.engine.VulcanBatchEngineTaskItemDelegate;
import com.liferay.portal.vulcan.batch.engine.resource.VulcanBatchEngineImportTaskResource;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;
import com.liferay.portal.vulcan.resource.EntityModelResource;
import com.liferay.portal.vulcan.util.ActionUtil;
import com.liferay.portal.vulcan.util.TransformUtil;

import com.pds.headless.dto.v1_0.Attribute;
import com.pds.headless.resource.v1_0.AttributeResource;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;

import java.io.Serializable;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.validation.constraints.NotNull;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 * @author reza
 * @generated
 */
@Generated("")
@Path("/v1.0")
public abstract class BaseAttributeResourceImpl
	implements AttributeResource, EntityModelResource,
			   VulcanBatchEngineTaskItemDelegate<Attribute> {

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -X 'DELETE' 'http://localhost:8080/o/headless-smartstone/v1.0/attribute/{id}'  -u 'test@liferay.com:test'
	 */
	@Override
	@DELETE
	@Operation(
		description = "Multiple status values can be provided with comma separated strings"
	)
	@Parameters(value = {@Parameter(in = ParameterIn.PATH, name = "id")})
	@Path("/attribute/{id}")
	@Produces({"application/json", "application/xml"})
	@Tags(value = {@Tag(name = "Attribute")})
	public void deleteAttribute(
			@NotNull @Parameter(hidden = true) @PathParam("id") Long id)
		throws Exception {
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -X 'DELETE' 'http://localhost:8080/o/headless-smartstone/v1.0/attribute/{id}/batch'  -u 'test@liferay.com:test'
	 */
	@Override
	@Consumes("application/json")
	@DELETE
	@Parameters(
		value = {
			@Parameter(in = ParameterIn.PATH, name = "id"),
			@Parameter(in = ParameterIn.QUERY, name = "callbackURL")
		}
	)
	@Path("/attribute/{id}/batch")
	@Produces("application/json")
	@Tags(value = {@Tag(name = "Attribute")})
	public Response deleteAttributeBatch(
			@NotNull @Parameter(hidden = true) @PathParam("id") Long id,
			@Parameter(hidden = true) @QueryParam("callbackURL") String
				callbackURL,
			Object object)
		throws Exception {

		vulcanBatchEngineImportTaskResource.setContextAcceptLanguage(
			contextAcceptLanguage);
		vulcanBatchEngineImportTaskResource.setContextCompany(contextCompany);
		vulcanBatchEngineImportTaskResource.setContextHttpServletRequest(
			contextHttpServletRequest);
		vulcanBatchEngineImportTaskResource.setContextUriInfo(contextUriInfo);
		vulcanBatchEngineImportTaskResource.setContextUser(contextUser);

		Response.ResponseBuilder responseBuilder = Response.accepted();

		return responseBuilder.entity(
			vulcanBatchEngineImportTaskResource.deleteImportTask(
				Attribute.class.getName(), callbackURL, object)
		).build();
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -X 'PUT' 'http://localhost:8080/o/headless-smartstone/v1.0/attribute/{id}' -d $'{"createdBy": ___, "createdOn": ___, "deletedBy": ___, "deletedOn": ___, "description": ___, "id": ___, "languageId": ___, "typeId": ___, "updatedBy": ___, "updatedOn": ___, "value": ___}' --header 'Content-Type: application/json' -u 'test@liferay.com:test'
	 */
	@Override
	@Consumes({"application/json", "application/xml"})
	@Operation(
		description = "Replaces the attribute with the information sent in the request body."
	)
	@PUT
	@Parameters(value = {@Parameter(in = ParameterIn.PATH, name = "id")})
	@Path("/attribute/{id}")
	@Produces({"application/json", "application/xml"})
	@Tags(value = {@Tag(name = "Attribute")})
	public Attribute putAttribute(
			@NotNull @Parameter(hidden = true) @PathParam("id") Long id,
			Attribute attribute)
		throws Exception {

		return new Attribute();
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -X 'PUT' 'http://localhost:8080/o/headless-smartstone/v1.0/attribute/{id}/batch'  -u 'test@liferay.com:test'
	 */
	@Override
	@Consumes("application/json")
	@PUT
	@Parameters(
		value = {
			@Parameter(in = ParameterIn.PATH, name = "id"),
			@Parameter(in = ParameterIn.QUERY, name = "callbackURL")
		}
	)
	@Path("/attribute/{id}/batch")
	@Produces("application/json")
	@Tags(value = {@Tag(name = "Attribute")})
	public Response putAttributeBatch(
			@NotNull @Parameter(hidden = true) @PathParam("id") Long id,
			@Parameter(hidden = true) @QueryParam("callbackURL") String
				callbackURL,
			Object object)
		throws Exception {

		vulcanBatchEngineImportTaskResource.setContextAcceptLanguage(
			contextAcceptLanguage);
		vulcanBatchEngineImportTaskResource.setContextCompany(contextCompany);
		vulcanBatchEngineImportTaskResource.setContextHttpServletRequest(
			contextHttpServletRequest);
		vulcanBatchEngineImportTaskResource.setContextUriInfo(contextUriInfo);
		vulcanBatchEngineImportTaskResource.setContextUser(contextUser);

		Response.ResponseBuilder responseBuilder = Response.accepted();

		return responseBuilder.entity(
			vulcanBatchEngineImportTaskResource.putImportTask(
				Attribute.class.getName(), callbackURL, object)
		).build();
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -X 'GET' 'http://localhost:8080/o/headless-smartstone/v1.0/attribute/id/{id}'  -u 'test@liferay.com:test'
	 */
	@Override
	@GET
	@Operation(
		description = "Multiple status values can be provided with comma separated strings"
	)
	@Parameters(value = {@Parameter(in = ParameterIn.PATH, name = "id")})
	@Path("/attribute/id/{id}")
	@Produces({"application/json", "application/xml"})
	@Tags(value = {@Tag(name = "Attribute")})
	public Attribute getAttributeById(
			@NotNull @Parameter(hidden = true) @PathParam("id") Long id)
		throws Exception {

		return new Attribute();
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -X 'GET' 'http://localhost:8080/o/headless-smartstone/v1.0/attribute/typeId/{typeId}'  -u 'test@liferay.com:test'
	 */
	@Override
	@GET
	@Operation(
		description = "Multiple status values can be provided with comma separated strings"
	)
	@Parameters(value = {@Parameter(in = ParameterIn.PATH, name = "typeId")})
	@Path("/attribute/typeId/{typeId}")
	@Produces({"application/json", "application/xml"})
	@Tags(value = {@Tag(name = "Attribute")})
	public Attribute getAttributeByTypeId(
			@NotNull @Parameter(hidden = true) @PathParam("typeId") Long typeId)
		throws Exception {

		return new Attribute();
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -X 'POST' 'http://localhost:8080/o/headless-smartstone/v1.0/attribute' -d $'{"createdBy": ___, "createdOn": ___, "deletedBy": ___, "deletedOn": ___, "description": ___, "id": ___, "languageId": ___, "typeId": ___, "updatedBy": ___, "updatedOn": ___, "value": ___}' --header 'Content-Type: application/json' -u 'test@liferay.com:test'
	 */
	@Override
	@Consumes({"application/json", "application/xml"})
	@Operation(description = "Create a new attribute.")
	@POST
	@Path("/attribute")
	@Produces({"application/json", "application/xml"})
	@Tags(value = {@Tag(name = "Attribute")})
	public Attribute postAttribute(Attribute attribute) throws Exception {
		return new Attribute();
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -X 'POST' 'http://localhost:8080/o/headless-smartstone/v1.0/attribute/batch'  -u 'test@liferay.com:test'
	 */
	@Override
	@Consumes("application/json")
	@POST
	@Parameters(
		value = {@Parameter(in = ParameterIn.QUERY, name = "callbackURL")}
	)
	@Path("/attribute/batch")
	@Produces("application/json")
	@Tags(value = {@Tag(name = "Attribute")})
	public Response postAttributeBatch(
			@Parameter(hidden = true) @QueryParam("callbackURL") String
				callbackURL,
			Object object)
		throws Exception {

		vulcanBatchEngineImportTaskResource.setContextAcceptLanguage(
			contextAcceptLanguage);
		vulcanBatchEngineImportTaskResource.setContextCompany(contextCompany);
		vulcanBatchEngineImportTaskResource.setContextHttpServletRequest(
			contextHttpServletRequest);
		vulcanBatchEngineImportTaskResource.setContextUriInfo(contextUriInfo);
		vulcanBatchEngineImportTaskResource.setContextUser(contextUser);

		Response.ResponseBuilder responseBuilder = Response.accepted();

		return responseBuilder.entity(
			vulcanBatchEngineImportTaskResource.postImportTask(
				Attribute.class.getName(), callbackURL, null, object)
		).build();
	}

	@Override
	@SuppressWarnings("PMD.UnusedLocalVariable")
	public void create(
			java.util.Collection<Attribute> attributes,
			Map<String, Serializable> parameters)
		throws Exception {

		for (Attribute attribute : attributes) {
			postAttribute(attribute);
		}
	}

	@Override
	public void delete(
			java.util.Collection<Attribute> attributes,
			Map<String, Serializable> parameters)
		throws Exception {

		for (Attribute attribute : attributes) {
			deleteAttribute(attribute.getId());
		}
	}

	@Override
	public EntityModel getEntityModel(Map<String, List<String>> multivaluedMap)
		throws Exception {

		return getEntityModel(
			new MultivaluedHashMap<String, Object>(multivaluedMap));
	}

	@Override
	public EntityModel getEntityModel(MultivaluedMap multivaluedMap)
		throws Exception {

		return null;
	}

	@Override
	public Page<Attribute> read(
			Filter filter, Pagination pagination, Sort[] sorts,
			Map<String, Serializable> parameters, String search)
		throws Exception {

		return null;
	}

	@Override
	public void setLanguageId(String languageId) {
		this.contextAcceptLanguage = new AcceptLanguage() {

			@Override
			public List<Locale> getLocales() {
				return null;
			}

			@Override
			public String getPreferredLanguageId() {
				return languageId;
			}

			@Override
			public Locale getPreferredLocale() {
				return LocaleUtil.fromLanguageId(languageId);
			}

		};
	}

	@Override
	public void update(
			java.util.Collection<Attribute> attributes,
			Map<String, Serializable> parameters)
		throws Exception {

		for (Attribute attribute : attributes) {
			putAttribute(
				attribute.getId() != null ? attribute.getId() :
				(Long)parameters.get("attributeId"),
				attribute);
		}
	}

	public void setContextAcceptLanguage(AcceptLanguage contextAcceptLanguage) {
		this.contextAcceptLanguage = contextAcceptLanguage;
	}

	public void setContextCompany(
		com.liferay.portal.kernel.model.Company contextCompany) {

		this.contextCompany = contextCompany;
	}

	public void setContextHttpServletRequest(
		HttpServletRequest contextHttpServletRequest) {

		this.contextHttpServletRequest = contextHttpServletRequest;
	}

	public void setContextHttpServletResponse(
		HttpServletResponse contextHttpServletResponse) {

		this.contextHttpServletResponse = contextHttpServletResponse;
	}

	public void setContextUriInfo(UriInfo contextUriInfo) {
		this.contextUriInfo = contextUriInfo;
	}

	public void setContextUser(
		com.liferay.portal.kernel.model.User contextUser) {

		this.contextUser = contextUser;
	}

	protected Map<String, String> addAction(
		String actionName, GroupedModel groupedModel, String methodName) {

		return ActionUtil.addAction(
			actionName, getClass(), groupedModel, methodName,
			contextScopeChecker, contextUriInfo);
	}

	protected Map<String, String> addAction(
		String actionName, Long id, String methodName, Long ownerId,
		String permissionName, Long siteId) {

		return ActionUtil.addAction(
			actionName, getClass(), id, methodName, contextScopeChecker,
			ownerId, permissionName, siteId, contextUriInfo);
	}

	protected Map<String, String> addAction(
		String actionName, String methodName, String permissionName,
		Long siteId) {

		return addAction(
			actionName, siteId, methodName, null, permissionName, siteId);
	}

	protected <T, R> List<R> transform(
		java.util.Collection<T> collection,
		UnsafeFunction<T, R, Exception> unsafeFunction) {

		return TransformUtil.transform(collection, unsafeFunction);
	}

	protected <T, R> R[] transform(
		T[] array, UnsafeFunction<T, R, Exception> unsafeFunction,
		Class<?> clazz) {

		return TransformUtil.transform(array, unsafeFunction, clazz);
	}

	protected <T, R> R[] transformToArray(
		java.util.Collection<T> collection,
		UnsafeFunction<T, R, Exception> unsafeFunction, Class<?> clazz) {

		return TransformUtil.transformToArray(
			collection, unsafeFunction, clazz);
	}

	protected <T, R> List<R> transformToList(
		T[] array, UnsafeFunction<T, R, Exception> unsafeFunction) {

		return TransformUtil.transformToList(array, unsafeFunction);
	}

	protected AcceptLanguage contextAcceptLanguage;
	protected com.liferay.portal.kernel.model.Company contextCompany;
	protected HttpServletRequest contextHttpServletRequest;
	protected HttpServletResponse contextHttpServletResponse;
	protected Object contextScopeChecker;
	protected UriInfo contextUriInfo;
	protected com.liferay.portal.kernel.model.User contextUser;
	protected GroupLocalService groupLocalService;
	protected ResourceActionLocalService resourceActionLocalService;
	protected ResourcePermissionLocalService resourcePermissionLocalService;
	protected RoleLocalService roleLocalService;
	protected VulcanBatchEngineImportTaskResource
		vulcanBatchEngineImportTaskResource;

}