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

package com.pds.smartstone.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.pds.smartstone.model.PersistedAttribute;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the persisted attribute service. This utility wraps <code>com.pds.smartstone.service.persistence.impl.PersistedAttributePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PersistedAttributePersistence
 * @generated
 */
public class PersistedAttributeUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(PersistedAttribute persistedAttribute) {
		getPersistence().clearCache(persistedAttribute);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, PersistedAttribute> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PersistedAttribute> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PersistedAttribute> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PersistedAttribute> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PersistedAttribute> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PersistedAttribute update(
		PersistedAttribute persistedAttribute) {

		return getPersistence().update(persistedAttribute);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PersistedAttribute update(
		PersistedAttribute persistedAttribute, ServiceContext serviceContext) {

		return getPersistence().update(persistedAttribute, serviceContext);
	}

	/**
	 * Returns all the persisted attributes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching persisted attributes
	 */
	public static List<PersistedAttribute> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the persisted attributes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAttributeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of persisted attributes
	 * @param end the upper bound of the range of persisted attributes (not inclusive)
	 * @return the range of matching persisted attributes
	 */
	public static List<PersistedAttribute> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the persisted attributes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAttributeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of persisted attributes
	 * @param end the upper bound of the range of persisted attributes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching persisted attributes
	 */
	public static List<PersistedAttribute> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<PersistedAttribute> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the persisted attributes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAttributeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of persisted attributes
	 * @param end the upper bound of the range of persisted attributes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching persisted attributes
	 */
	public static List<PersistedAttribute> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<PersistedAttribute> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first persisted attribute in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute
	 * @throws NoSuchPersistedAttributeException if a matching persisted attribute could not be found
	 */
	public static PersistedAttribute findByUuid_First(
			String uuid,
			OrderByComparator<PersistedAttribute> orderByComparator)
		throws com.pds.smartstone.exception.NoSuchPersistedAttributeException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first persisted attribute in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute, or <code>null</code> if a matching persisted attribute could not be found
	 */
	public static PersistedAttribute fetchByUuid_First(
		String uuid, OrderByComparator<PersistedAttribute> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last persisted attribute in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute
	 * @throws NoSuchPersistedAttributeException if a matching persisted attribute could not be found
	 */
	public static PersistedAttribute findByUuid_Last(
			String uuid,
			OrderByComparator<PersistedAttribute> orderByComparator)
		throws com.pds.smartstone.exception.NoSuchPersistedAttributeException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last persisted attribute in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute, or <code>null</code> if a matching persisted attribute could not be found
	 */
	public static PersistedAttribute fetchByUuid_Last(
		String uuid, OrderByComparator<PersistedAttribute> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the persisted attributes before and after the current persisted attribute in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current persisted attribute
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next persisted attribute
	 * @throws NoSuchPersistedAttributeException if a persisted attribute with the primary key could not be found
	 */
	public static PersistedAttribute[] findByUuid_PrevAndNext(
			long id, String uuid,
			OrderByComparator<PersistedAttribute> orderByComparator)
		throws com.pds.smartstone.exception.NoSuchPersistedAttributeException {

		return getPersistence().findByUuid_PrevAndNext(
			id, uuid, orderByComparator);
	}

	/**
	 * Removes all the persisted attributes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of persisted attributes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching persisted attributes
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the persisted attributes where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @return the matching persisted attributes
	 */
	public static List<PersistedAttribute> findBytypeId(long typeId) {
		return getPersistence().findBytypeId(typeId);
	}

	/**
	 * Returns a range of all the persisted attributes where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAttributeModelImpl</code>.
	 * </p>
	 *
	 * @param typeId the type ID
	 * @param start the lower bound of the range of persisted attributes
	 * @param end the upper bound of the range of persisted attributes (not inclusive)
	 * @return the range of matching persisted attributes
	 */
	public static List<PersistedAttribute> findBytypeId(
		long typeId, int start, int end) {

		return getPersistence().findBytypeId(typeId, start, end);
	}

	/**
	 * Returns an ordered range of all the persisted attributes where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAttributeModelImpl</code>.
	 * </p>
	 *
	 * @param typeId the type ID
	 * @param start the lower bound of the range of persisted attributes
	 * @param end the upper bound of the range of persisted attributes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching persisted attributes
	 */
	public static List<PersistedAttribute> findBytypeId(
		long typeId, int start, int end,
		OrderByComparator<PersistedAttribute> orderByComparator) {

		return getPersistence().findBytypeId(
			typeId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the persisted attributes where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAttributeModelImpl</code>.
	 * </p>
	 *
	 * @param typeId the type ID
	 * @param start the lower bound of the range of persisted attributes
	 * @param end the upper bound of the range of persisted attributes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching persisted attributes
	 */
	public static List<PersistedAttribute> findBytypeId(
		long typeId, int start, int end,
		OrderByComparator<PersistedAttribute> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBytypeId(
			typeId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first persisted attribute in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute
	 * @throws NoSuchPersistedAttributeException if a matching persisted attribute could not be found
	 */
	public static PersistedAttribute findBytypeId_First(
			long typeId,
			OrderByComparator<PersistedAttribute> orderByComparator)
		throws com.pds.smartstone.exception.NoSuchPersistedAttributeException {

		return getPersistence().findBytypeId_First(typeId, orderByComparator);
	}

	/**
	 * Returns the first persisted attribute in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute, or <code>null</code> if a matching persisted attribute could not be found
	 */
	public static PersistedAttribute fetchBytypeId_First(
		long typeId, OrderByComparator<PersistedAttribute> orderByComparator) {

		return getPersistence().fetchBytypeId_First(typeId, orderByComparator);
	}

	/**
	 * Returns the last persisted attribute in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute
	 * @throws NoSuchPersistedAttributeException if a matching persisted attribute could not be found
	 */
	public static PersistedAttribute findBytypeId_Last(
			long typeId,
			OrderByComparator<PersistedAttribute> orderByComparator)
		throws com.pds.smartstone.exception.NoSuchPersistedAttributeException {

		return getPersistence().findBytypeId_Last(typeId, orderByComparator);
	}

	/**
	 * Returns the last persisted attribute in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute, or <code>null</code> if a matching persisted attribute could not be found
	 */
	public static PersistedAttribute fetchBytypeId_Last(
		long typeId, OrderByComparator<PersistedAttribute> orderByComparator) {

		return getPersistence().fetchBytypeId_Last(typeId, orderByComparator);
	}

	/**
	 * Returns the persisted attributes before and after the current persisted attribute in the ordered set where typeId = &#63;.
	 *
	 * @param id the primary key of the current persisted attribute
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next persisted attribute
	 * @throws NoSuchPersistedAttributeException if a persisted attribute with the primary key could not be found
	 */
	public static PersistedAttribute[] findBytypeId_PrevAndNext(
			long id, long typeId,
			OrderByComparator<PersistedAttribute> orderByComparator)
		throws com.pds.smartstone.exception.NoSuchPersistedAttributeException {

		return getPersistence().findBytypeId_PrevAndNext(
			id, typeId, orderByComparator);
	}

	/**
	 * Removes all the persisted attributes where typeId = &#63; from the database.
	 *
	 * @param typeId the type ID
	 */
	public static void removeBytypeId(long typeId) {
		getPersistence().removeBytypeId(typeId);
	}

	/**
	 * Returns the number of persisted attributes where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @return the number of matching persisted attributes
	 */
	public static int countBytypeId(long typeId) {
		return getPersistence().countBytypeId(typeId);
	}

	/**
	 * Returns all the persisted attributes where id = &#63;.
	 *
	 * @param id the ID
	 * @return the matching persisted attributes
	 */
	public static List<PersistedAttribute> findByid(long id) {
		return getPersistence().findByid(id);
	}

	/**
	 * Returns a range of all the persisted attributes where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAttributeModelImpl</code>.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of persisted attributes
	 * @param end the upper bound of the range of persisted attributes (not inclusive)
	 * @return the range of matching persisted attributes
	 */
	public static List<PersistedAttribute> findByid(
		long id, int start, int end) {

		return getPersistence().findByid(id, start, end);
	}

	/**
	 * Returns an ordered range of all the persisted attributes where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAttributeModelImpl</code>.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of persisted attributes
	 * @param end the upper bound of the range of persisted attributes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching persisted attributes
	 */
	public static List<PersistedAttribute> findByid(
		long id, int start, int end,
		OrderByComparator<PersistedAttribute> orderByComparator) {

		return getPersistence().findByid(id, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the persisted attributes where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAttributeModelImpl</code>.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of persisted attributes
	 * @param end the upper bound of the range of persisted attributes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching persisted attributes
	 */
	public static List<PersistedAttribute> findByid(
		long id, int start, int end,
		OrderByComparator<PersistedAttribute> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByid(
			id, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first persisted attribute in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute
	 * @throws NoSuchPersistedAttributeException if a matching persisted attribute could not be found
	 */
	public static PersistedAttribute findByid_First(
			long id, OrderByComparator<PersistedAttribute> orderByComparator)
		throws com.pds.smartstone.exception.NoSuchPersistedAttributeException {

		return getPersistence().findByid_First(id, orderByComparator);
	}

	/**
	 * Returns the first persisted attribute in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute, or <code>null</code> if a matching persisted attribute could not be found
	 */
	public static PersistedAttribute fetchByid_First(
		long id, OrderByComparator<PersistedAttribute> orderByComparator) {

		return getPersistence().fetchByid_First(id, orderByComparator);
	}

	/**
	 * Returns the last persisted attribute in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute
	 * @throws NoSuchPersistedAttributeException if a matching persisted attribute could not be found
	 */
	public static PersistedAttribute findByid_Last(
			long id, OrderByComparator<PersistedAttribute> orderByComparator)
		throws com.pds.smartstone.exception.NoSuchPersistedAttributeException {

		return getPersistence().findByid_Last(id, orderByComparator);
	}

	/**
	 * Returns the last persisted attribute in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute, or <code>null</code> if a matching persisted attribute could not be found
	 */
	public static PersistedAttribute fetchByid_Last(
		long id, OrderByComparator<PersistedAttribute> orderByComparator) {

		return getPersistence().fetchByid_Last(id, orderByComparator);
	}

	/**
	 * Removes all the persisted attributes where id = &#63; from the database.
	 *
	 * @param id the ID
	 */
	public static void removeByid(long id) {
		getPersistence().removeByid(id);
	}

	/**
	 * Returns the number of persisted attributes where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching persisted attributes
	 */
	public static int countByid(long id) {
		return getPersistence().countByid(id);
	}

	/**
	 * Returns all the persisted attributes where typeId = &#63; and id = &#63;.
	 *
	 * @param typeId the type ID
	 * @param id the ID
	 * @return the matching persisted attributes
	 */
	public static List<PersistedAttribute> findByidAndTypeId(
		long typeId, long id) {

		return getPersistence().findByidAndTypeId(typeId, id);
	}

	/**
	 * Returns a range of all the persisted attributes where typeId = &#63; and id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAttributeModelImpl</code>.
	 * </p>
	 *
	 * @param typeId the type ID
	 * @param id the ID
	 * @param start the lower bound of the range of persisted attributes
	 * @param end the upper bound of the range of persisted attributes (not inclusive)
	 * @return the range of matching persisted attributes
	 */
	public static List<PersistedAttribute> findByidAndTypeId(
		long typeId, long id, int start, int end) {

		return getPersistence().findByidAndTypeId(typeId, id, start, end);
	}

	/**
	 * Returns an ordered range of all the persisted attributes where typeId = &#63; and id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAttributeModelImpl</code>.
	 * </p>
	 *
	 * @param typeId the type ID
	 * @param id the ID
	 * @param start the lower bound of the range of persisted attributes
	 * @param end the upper bound of the range of persisted attributes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching persisted attributes
	 */
	public static List<PersistedAttribute> findByidAndTypeId(
		long typeId, long id, int start, int end,
		OrderByComparator<PersistedAttribute> orderByComparator) {

		return getPersistence().findByidAndTypeId(
			typeId, id, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the persisted attributes where typeId = &#63; and id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAttributeModelImpl</code>.
	 * </p>
	 *
	 * @param typeId the type ID
	 * @param id the ID
	 * @param start the lower bound of the range of persisted attributes
	 * @param end the upper bound of the range of persisted attributes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching persisted attributes
	 */
	public static List<PersistedAttribute> findByidAndTypeId(
		long typeId, long id, int start, int end,
		OrderByComparator<PersistedAttribute> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByidAndTypeId(
			typeId, id, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first persisted attribute in the ordered set where typeId = &#63; and id = &#63;.
	 *
	 * @param typeId the type ID
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute
	 * @throws NoSuchPersistedAttributeException if a matching persisted attribute could not be found
	 */
	public static PersistedAttribute findByidAndTypeId_First(
			long typeId, long id,
			OrderByComparator<PersistedAttribute> orderByComparator)
		throws com.pds.smartstone.exception.NoSuchPersistedAttributeException {

		return getPersistence().findByidAndTypeId_First(
			typeId, id, orderByComparator);
	}

	/**
	 * Returns the first persisted attribute in the ordered set where typeId = &#63; and id = &#63;.
	 *
	 * @param typeId the type ID
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute, or <code>null</code> if a matching persisted attribute could not be found
	 */
	public static PersistedAttribute fetchByidAndTypeId_First(
		long typeId, long id,
		OrderByComparator<PersistedAttribute> orderByComparator) {

		return getPersistence().fetchByidAndTypeId_First(
			typeId, id, orderByComparator);
	}

	/**
	 * Returns the last persisted attribute in the ordered set where typeId = &#63; and id = &#63;.
	 *
	 * @param typeId the type ID
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute
	 * @throws NoSuchPersistedAttributeException if a matching persisted attribute could not be found
	 */
	public static PersistedAttribute findByidAndTypeId_Last(
			long typeId, long id,
			OrderByComparator<PersistedAttribute> orderByComparator)
		throws com.pds.smartstone.exception.NoSuchPersistedAttributeException {

		return getPersistence().findByidAndTypeId_Last(
			typeId, id, orderByComparator);
	}

	/**
	 * Returns the last persisted attribute in the ordered set where typeId = &#63; and id = &#63;.
	 *
	 * @param typeId the type ID
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute, or <code>null</code> if a matching persisted attribute could not be found
	 */
	public static PersistedAttribute fetchByidAndTypeId_Last(
		long typeId, long id,
		OrderByComparator<PersistedAttribute> orderByComparator) {

		return getPersistence().fetchByidAndTypeId_Last(
			typeId, id, orderByComparator);
	}

	/**
	 * Removes all the persisted attributes where typeId = &#63; and id = &#63; from the database.
	 *
	 * @param typeId the type ID
	 * @param id the ID
	 */
	public static void removeByidAndTypeId(long typeId, long id) {
		getPersistence().removeByidAndTypeId(typeId, id);
	}

	/**
	 * Returns the number of persisted attributes where typeId = &#63; and id = &#63;.
	 *
	 * @param typeId the type ID
	 * @param id the ID
	 * @return the number of matching persisted attributes
	 */
	public static int countByidAndTypeId(long typeId, long id) {
		return getPersistence().countByidAndTypeId(typeId, id);
	}

	/**
	 * Caches the persisted attribute in the entity cache if it is enabled.
	 *
	 * @param persistedAttribute the persisted attribute
	 */
	public static void cacheResult(PersistedAttribute persistedAttribute) {
		getPersistence().cacheResult(persistedAttribute);
	}

	/**
	 * Caches the persisted attributes in the entity cache if it is enabled.
	 *
	 * @param persistedAttributes the persisted attributes
	 */
	public static void cacheResult(
		List<PersistedAttribute> persistedAttributes) {

		getPersistence().cacheResult(persistedAttributes);
	}

	/**
	 * Creates a new persisted attribute with the primary key. Does not add the persisted attribute to the database.
	 *
	 * @param id the primary key for the new persisted attribute
	 * @return the new persisted attribute
	 */
	public static PersistedAttribute create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the persisted attribute with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the persisted attribute
	 * @return the persisted attribute that was removed
	 * @throws NoSuchPersistedAttributeException if a persisted attribute with the primary key could not be found
	 */
	public static PersistedAttribute remove(long id)
		throws com.pds.smartstone.exception.NoSuchPersistedAttributeException {

		return getPersistence().remove(id);
	}

	public static PersistedAttribute updateImpl(
		PersistedAttribute persistedAttribute) {

		return getPersistence().updateImpl(persistedAttribute);
	}

	/**
	 * Returns the persisted attribute with the primary key or throws a <code>NoSuchPersistedAttributeException</code> if it could not be found.
	 *
	 * @param id the primary key of the persisted attribute
	 * @return the persisted attribute
	 * @throws NoSuchPersistedAttributeException if a persisted attribute with the primary key could not be found
	 */
	public static PersistedAttribute findByPrimaryKey(long id)
		throws com.pds.smartstone.exception.NoSuchPersistedAttributeException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the persisted attribute with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the persisted attribute
	 * @return the persisted attribute, or <code>null</code> if a persisted attribute with the primary key could not be found
	 */
	public static PersistedAttribute fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the persisted attributes.
	 *
	 * @return the persisted attributes
	 */
	public static List<PersistedAttribute> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the persisted attributes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAttributeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of persisted attributes
	 * @param end the upper bound of the range of persisted attributes (not inclusive)
	 * @return the range of persisted attributes
	 */
	public static List<PersistedAttribute> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the persisted attributes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAttributeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of persisted attributes
	 * @param end the upper bound of the range of persisted attributes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of persisted attributes
	 */
	public static List<PersistedAttribute> findAll(
		int start, int end,
		OrderByComparator<PersistedAttribute> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the persisted attributes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAttributeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of persisted attributes
	 * @param end the upper bound of the range of persisted attributes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of persisted attributes
	 */
	public static List<PersistedAttribute> findAll(
		int start, int end,
		OrderByComparator<PersistedAttribute> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the persisted attributes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of persisted attributes.
	 *
	 * @return the number of persisted attributes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PersistedAttributePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<PersistedAttributePersistence, PersistedAttributePersistence>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			PersistedAttributePersistence.class);

		ServiceTracker
			<PersistedAttributePersistence, PersistedAttributePersistence>
				serviceTracker =
					new ServiceTracker
						<PersistedAttributePersistence,
						 PersistedAttributePersistence>(
							 bundle.getBundleContext(),
							 PersistedAttributePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}