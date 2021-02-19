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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PersistedAttributeTypeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PersistedAttributeTypeLocalService
 * @generated
 */
public class PersistedAttributeTypeLocalServiceWrapper
	implements PersistedAttributeTypeLocalService,
			   ServiceWrapper<PersistedAttributeTypeLocalService> {

	public PersistedAttributeTypeLocalServiceWrapper(
		PersistedAttributeTypeLocalService persistedAttributeTypeLocalService) {

		_persistedAttributeTypeLocalService =
			persistedAttributeTypeLocalService;
	}

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
	@Override
	public com.pds.smartstone.model.PersistedAttributeType
		addPersistedAttributeType(
			com.pds.smartstone.model.PersistedAttributeType
				persistedAttributeType) {

		return _persistedAttributeTypeLocalService.addPersistedAttributeType(
			persistedAttributeType);
	}

	/**
	 * Creates a new persisted attribute type with the primary key. Does not add the persisted attribute type to the database.
	 *
	 * @param id the primary key for the new persisted attribute type
	 * @return the new persisted attribute type
	 */
	@Override
	public com.pds.smartstone.model.PersistedAttributeType
		createPersistedAttributeType(long id) {

		return _persistedAttributeTypeLocalService.createPersistedAttributeType(
			id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _persistedAttributeTypeLocalService.createPersistedModel(
			primaryKeyObj);
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
	@Override
	public com.pds.smartstone.model.PersistedAttributeType
			deletePersistedAttributeType(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _persistedAttributeTypeLocalService.deletePersistedAttributeType(
			id);
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
	@Override
	public com.pds.smartstone.model.PersistedAttributeType
		deletePersistedAttributeType(
			com.pds.smartstone.model.PersistedAttributeType
				persistedAttributeType) {

		return _persistedAttributeTypeLocalService.deletePersistedAttributeType(
			persistedAttributeType);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _persistedAttributeTypeLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _persistedAttributeTypeLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _persistedAttributeTypeLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _persistedAttributeTypeLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _persistedAttributeTypeLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _persistedAttributeTypeLocalService.dynamicQueryCount(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _persistedAttributeTypeLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.pds.smartstone.model.PersistedAttributeType
		fetchPersistedAttributeType(long id) {

		return _persistedAttributeTypeLocalService.fetchPersistedAttributeType(
			id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _persistedAttributeTypeLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _persistedAttributeTypeLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _persistedAttributeTypeLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * Returns the persisted attribute type with the primary key.
	 *
	 * @param id the primary key of the persisted attribute type
	 * @return the persisted attribute type
	 * @throws PortalException if a persisted attribute type with the primary key could not be found
	 */
	@Override
	public com.pds.smartstone.model.PersistedAttributeType
			getPersistedAttributeType(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _persistedAttributeTypeLocalService.getPersistedAttributeType(
			id);
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
	@Override
	public java.util.List<com.pds.smartstone.model.PersistedAttributeType>
		getPersistedAttributeTypes(int start, int end) {

		return _persistedAttributeTypeLocalService.getPersistedAttributeTypes(
			start, end);
	}

	/**
	 * Returns the number of persisted attribute types.
	 *
	 * @return the number of persisted attribute types
	 */
	@Override
	public int getPersistedAttributeTypesCount() {
		return _persistedAttributeTypeLocalService.
			getPersistedAttributeTypesCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _persistedAttributeTypeLocalService.getPersistedModel(
			primaryKeyObj);
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
	@Override
	public com.pds.smartstone.model.PersistedAttributeType
		updatePersistedAttributeType(
			com.pds.smartstone.model.PersistedAttributeType
				persistedAttributeType) {

		return _persistedAttributeTypeLocalService.updatePersistedAttributeType(
			persistedAttributeType);
	}

	@Override
	public PersistedAttributeTypeLocalService getWrappedService() {
		return _persistedAttributeTypeLocalService;
	}

	@Override
	public void setWrappedService(
		PersistedAttributeTypeLocalService persistedAttributeTypeLocalService) {

		_persistedAttributeTypeLocalService =
			persistedAttributeTypeLocalService;
	}

	private PersistedAttributeTypeLocalService
		_persistedAttributeTypeLocalService;

}