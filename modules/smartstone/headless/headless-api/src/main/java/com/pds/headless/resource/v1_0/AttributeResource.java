package com.pds.headless.resource.v1_0;

import com.liferay.portal.vulcan.accept.language.AcceptLanguage;

import com.pds.headless.dto.v1_0.Attribute;

import java.util.Locale;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * To access this resource, run:
 *
 *     curl -u your@email.com:yourpassword -D - http://localhost:8080/o/headless-smartstone/v1.0
 *
 * @author reza
 * @generated
 */
@Generated("")
@ProviderType
public interface AttributeResource {

	public static Builder builder() {
		return FactoryHolder.factory.create();
	}

	public void deleteAttribute(Long id) throws Exception;

	public Response deleteAttributeBatch(
			Long id, String callbackURL, Object object)
		throws Exception;

	public Attribute putAttribute(Long id, Attribute attribute)
		throws Exception;

	public Response putAttributeBatch(
			Long id, String callbackURL, Object object)
		throws Exception;

	public Attribute getAttributeById(Long id) throws Exception;

	public Attribute getAttributeByTypeId(Long typeId) throws Exception;

	public Attribute postAttribute(Attribute attribute) throws Exception;

	public Response postAttributeBatch(String callbackURL, Object object)
		throws Exception;

	public default void setContextAcceptLanguage(
		AcceptLanguage contextAcceptLanguage) {
	}

	public void setContextCompany(
		com.liferay.portal.kernel.model.Company contextCompany);

	public default void setContextHttpServletRequest(
		HttpServletRequest contextHttpServletRequest) {
	}

	public default void setContextHttpServletResponse(
		HttpServletResponse contextHttpServletResponse) {
	}

	public default void setContextUriInfo(UriInfo contextUriInfo) {
	}

	public void setContextUser(
		com.liferay.portal.kernel.model.User contextUser);

	public static class FactoryHolder {

		public static volatile Factory factory;

	}

	@ProviderType
	public interface Builder {

		public AttributeResource build();

		public Builder checkPermissions(boolean checkPermissions);

		public Builder httpServletRequest(
			HttpServletRequest httpServletRequest);

		public Builder preferredLocale(Locale preferredLocale);

		public Builder user(com.liferay.portal.kernel.model.User user);

	}

	@ProviderType
	public interface Factory {

		public Builder create();

	}

}