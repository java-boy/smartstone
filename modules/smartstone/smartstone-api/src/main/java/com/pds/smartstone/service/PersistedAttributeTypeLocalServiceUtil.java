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

package com.pds.smartstone.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for PersistedAttributeType. This utility wraps
 * <code>com.pds.smartstone.service.impl.PersistedAttributeTypeLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PersistedAttributeTypeLocalService
 * @generated
 */
public class PersistedAttributeTypeLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.pds.smartstone.service.impl.PersistedAttributeTypeLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the persisted attribute type to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PersistedAttributeTypeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param persistedAttributeType the persisted attribute type
	 * @return the persisted attribute type that was added
	 */
	public static com.pds.smartstone.model.PersistedAttributeType
		addPersistedAttributeType(
			com.pds.smartstone.model.PersistedAttributeType
				persistedAttributeType) {

		return getService().addPersistedAttributeType(persistedAttributeType);
	}

	/**
	 * Creates a new persisted attribute type with the primary key. Does not add the persisted attribute type to the database.
	 *
	 * @param id the primary key for the new persisted attribute type
	 * @return the new persisted attribute type
	 */
	public static com.pds.smartstone.model.PersistedAttributeType
		createPersistedAttributeType(long id) {

		return getService().createPersistedAttributeType(id);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the persisted attribute type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PersistedAttributeTypeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the persisted attribute type
	 * @return the persisted attribute type that was removed
	 * @throws PortalException if a persisted attribute type with the primary key could not be found
	 */
	public static com.pds.smartstone.model.PersistedAttributeType
			deletePersistedAttributeType(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedAttributeType(id);
	}

	/**
	 * Deletes the persisted attribute type from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PersistedAttributeTypeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param persistedAttributeType the persisted attribute type
	 * @return the persisted attribute type that was removed
	 */
	public static com.pds.smartstone.model.PersistedAttributeType
		deletePersistedAttributeType(
			com.pds.smartstone.model.PersistedAttributeType
				persistedAttributeType) {

		return getService().deletePersistedAttributeType(
			persistedAttributeType);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.pds.smartstone.model.impl.PersistedAttributeTypeModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.pds.smartstone.model.impl.PersistedAttributeTypeModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.pds.smartstone.model.PersistedAttributeType
		fetchPersistedAttributeType(long id) {

		return getService().fetchPersistedAttributeType(id);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * Returns the persisted attribute type with the primary key.
	 *
	 * @param id the primary key of the persisted attribute type
	 * @return the persisted attribute type
	 * @throws PortalException if a persisted attribute type with the primary key could not be found
	 */
	public static com.pds.smartstone.model.PersistedAttributeType
			getPersistedAttributeType(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedAttributeType(id);
	}

	/**
	 * Returns a range of all the persisted attribute types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.pds.smartstone.model.impl.PersistedAttributeTypeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of persisted attribute types
	 * @param end the upper bound of the range of persisted attribute types (not inclusive)
	 * @return the range of persisted attribute types
	 */
	public static java.util.List
		<com.pds.smartstone.model.PersistedAttributeType>
			getPersistedAttributeTypes(int start, int end) {

		return getService().getPersistedAttributeTypes(start, end);
	}

	/**
	 * Returns the number of persisted attribute types.
	 *
	 * @return the number of persisted attribute types
	 */
	public static int getPersistedAttributeTypesCount() {
		return getService().getPersistedAttributeTypesCount();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the persisted attribute type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PersistedAttributeTypeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param persistedAttributeType the persisted attribute type
	 * @return the persisted attribute type that was updated
	 */
	public static com.pds.smartstone.model.PersistedAttributeType
		updatePersistedAttributeType(
			com.pds.smartstone.model.PersistedAttributeType
				persistedAttributeType) {

		return getService().updatePersistedAttributeType(
			persistedAttributeType);
	}

	public static PersistedAttributeTypeLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<PersistedAttributeTypeLocalService, PersistedAttributeTypeLocalService>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			PersistedAttributeTypeLocalService.class);

		ServiceTracker
			<PersistedAttributeTypeLocalService,
			 PersistedAttributeTypeLocalService> serviceTracker =
				new ServiceTracker
					<PersistedAttributeTypeLocalService,
					 PersistedAttributeTypeLocalService>(
						 bundle.getBundleContext(),
						 PersistedAttributeTypeLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}