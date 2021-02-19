package com.pds.headless.internal.graphql.servlet.v1_0;

import com.liferay.portal.vulcan.graphql.servlet.ServletData;

import com.pds.headless.internal.graphql.mutation.v1_0.Mutation;
import com.pds.headless.internal.graphql.query.v1_0.Query;
import com.pds.headless.resource.v1_0.AttributeResource;
import com.pds.headless.resource.v1_0.AttributeTypeResource;

import javax.annotation.Generated;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;

/**
 * @author reza
 * @generated
 */
@Component(immediate = true, service = ServletData.class)
@Generated("")
public class ServletDataImpl implements ServletData {

	@Activate
	public void activate(BundleContext bundleContext) {
		Mutation.setAttributeResourceComponentServiceObjects(
			_attributeResourceComponentServiceObjects);

		Query.setAttributeResourceComponentServiceObjects(
			_attributeResourceComponentServiceObjects);
		Query.setAttributeTypeResourceComponentServiceObjects(
			_attributeTypeResourceComponentServiceObjects);
	}

	@Override
	public Mutation getMutation() {
		return new Mutation();
	}

	@Override
	public String getPath() {
		return "/headless-smartstone-graphql/v1_0";
	}

	@Override
	public Query getQuery() {
		return new Query();
	}

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<AttributeResource>
		_attributeResourceComponentServiceObjects;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<AttributeTypeResource>
		_attributeTypeResourceComponentServiceObjects;

}