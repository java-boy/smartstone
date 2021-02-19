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

import com.pds.smartstone.model.PersistedAttributeType;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the persisted attribute type service. This utility wraps <code>com.pds.smartstone.service.persistence.impl.PersistedAttributeTypePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PersistedAttributeTypePersistence
 * @generated
 */
public class PersistedAttributeTypeUtil {

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
	public static void clearCache(
		PersistedAttributeType persistedAttributeType) {

		getPersistence().clearCache(persistedAttributeType);
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
	public static Map<Serializable, PersistedAttributeType> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PersistedAttributeType> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PersistedAttributeType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PersistedAttributeType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PersistedAttributeType> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PersistedAttributeType update(
		PersistedAttributeType persistedAttributeType) {

		return getPersistence().update(persistedAttributeType);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PersistedAttributeType update(
		PersistedAttributeType persistedAttributeType,
		ServiceContext serviceContext) {

		return getPersistence().update(persistedAttributeType, serviceContext);
	}

	/**
	 * Returns all the persisted attribute types where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching persisted attribute types
	 */
	public static List<PersistedAttributeType> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the persisted attribute types where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAttributeTypeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of persisted attribute types
	 * @param end the upper bound of the range of persisted attribute types (not inclusive)
	 * @return the range of matching persisted attribute types
	 */
	public static List<PersistedAttributeType> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the persisted attribute types where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAttributeTypeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of persisted attribute types
	 * @param end the upper bound of the range of persisted attribute types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching persisted attribute types
	 */
	public static List<PersistedAttributeType> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<PersistedAttributeType> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the persisted attribute types where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAttributeTypeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of persisted attribute types
	 * @param end the upper bound of the range of persisted attribute types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching persisted attribute types
	 */
	public static List<PersistedAttributeType> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<PersistedAttributeType> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first persisted attribute type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute type
	 * @throws NoSuchPersistedAttributeTypeException if a matching persisted attribute type could not be found
	 */
	public static PersistedAttributeType findByUuid_First(
			String uuid,
			OrderByComparator<PersistedAttributeType> orderByComparator)
		throws com.pds.smartstone.exception.
			NoSuchPersistedAttributeTypeException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first persisted attribute type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute type, or <code>null</code> if a matching persisted attribute type could not be found
	 */
	public static PersistedAttributeType fetchByUuid_First(
		String uuid,
		OrderByComparator<PersistedAttributeType> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last persisted attribute type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute type
	 * @throws NoSuchPersistedAttributeTypeException if a matching persisted attribute type could not be found
	 */
	public static PersistedAttributeType findByUuid_Last(
			String uuid,
			OrderByComparator<PersistedAttributeType> orderByComparator)
		throws com.pds.smartstone.exception.
			NoSuchPersistedAttributeTypeException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last persisted attribute type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute type, or <code>null</code> if a matching persisted attribute type could not be found
	 */
	public static PersistedAttributeType fetchByUuid_Last(
		String uuid,
		OrderByComparator<PersistedAttributeType> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the persisted attribute types before and after the current persisted attribute type in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current persisted attribute type
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next persisted attribute type
	 * @throws NoSuchPersistedAttributeTypeException if a persisted attribute type with the primary key could not be found
	 */
	public static PersistedAttributeType[] findByUuid_PrevAndNext(
			long id, String uuid,
			OrderByComparator<PersistedAttributeType> orderByComparator)
		throws com.pds.smartstone.exception.
			NoSuchPersistedAttributeTypeException {

		return getPersistence().findByUuid_PrevAndNext(
			id, uuid, orderByComparator);
	}

	/**
	 * Removes all the persisted attribute types where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of persisted attribute types where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching persisted attribute types
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the persisted attribute types where id = &#63;.
	 *
	 * @param id the ID
	 * @return the matching persisted attribute types
	 */
	public static List<PersistedAttributeType> findByid(long id) {
		return getPersistence().findByid(id);
	}

	/**
	 * Returns a range of all the persisted attribute types where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAttributeTypeModelImpl</code>.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of persisted attribute types
	 * @param end the upper bound of the range of persisted attribute types (not inclusive)
	 * @return the range of matching persisted attribute types
	 */
	public static List<PersistedAttributeType> findByid(
		long id, int start, int end) {

		return getPersistence().findByid(id, start, end);
	}

	/**
	 * Returns an ordered range of all the persisted attribute types where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAttributeTypeModelImpl</code>.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of persisted attribute types
	 * @param end the upper bound of the range of persisted attribute types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching persisted attribute types
	 */
	public static List<PersistedAttributeType> findByid(
		long id, int start, int end,
		OrderByComparator<PersistedAttributeType> orderByComparator) {

		return getPersistence().findByid(id, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the persisted attribute types where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAttributeTypeModelImpl</code>.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of persisted attribute types
	 * @param end the upper bound of the range of persisted attribute types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching persisted attribute types
	 */
	public static List<PersistedAttributeType> findByid(
		long id, int start, int end,
		OrderByComparator<PersistedAttributeType> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByid(
			id, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first persisted attribute type in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute type
	 * @throws NoSuchPersistedAttributeTypeException if a matching persisted attribute type could not be found
	 */
	public static PersistedAttributeType findByid_First(
			long id,
			OrderByComparator<PersistedAttributeType> orderByComparator)
		throws com.pds.smartstone.exception.
			NoSuchPersistedAttributeTypeException {

		return getPersistence().findByid_First(id, orderByComparator);
	}

	/**
	 * Returns the first persisted attribute type in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute type, or <code>null</code> if a matching persisted attribute type could not be found
	 */
	public static PersistedAttributeType fetchByid_First(
		long id, OrderByComparator<PersistedAttributeType> orderByComparator) {

		return getPersistence().fetchByid_First(id, orderByComparator);
	}

	/**
	 * Returns the last persisted attribute type in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute type
	 * @throws NoSuchPersistedAttributeTypeException if a matching persisted attribute type could not be found
	 */
	public static PersistedAttributeType findByid_Last(
			long id,
			OrderByComparator<PersistedAttributeType> orderByComparator)
		throws com.pds.smartstone.exception.
			NoSuchPersistedAttributeTypeException {

		return getPersistence().findByid_Last(id, orderByComparator);
	}

	/**
	 * Returns the last persisted attribute type in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute type, or <code>null</code> if a matching persisted attribute type could not be found
	 */
	public static PersistedAttributeType fetchByid_Last(
		long id, OrderByComparator<PersistedAttributeType> orderByComparator) {

		return getPersistence().fetchByid_Last(id, orderByComparator);
	}

	/**
	 * Removes all the persisted attribute types where id = &#63; from the database.
	 *
	 * @param id the ID
	 */
	public static void removeByid(long id) {
		getPersistence().removeByid(id);
	}

	/**
	 * Returns the number of persisted attribute types where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching persisted attribute types
	 */
	public static int countByid(long id) {
		return getPersistence().countByid(id);
	}

	/**
	 * Returns all the persisted attribute types where code = &#63;.
	 *
	 * @param code the code
	 * @return the matching persisted attribute types
	 */
	public static List<PersistedAttributeType> findBycode(String code) {
		return getPersistence().findBycode(code);
	}

	/**
	 * Returns a range of all the persisted attribute types where code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAttributeTypeModelImpl</code>.
	 * </p>
	 *
	 * @param code the code
	 * @param start the lower bound of the range of persisted attribute types
	 * @param end the upper bound of the range of persisted attribute types (not inclusive)
	 * @return the range of matching persisted attribute types
	 */
	public static List<PersistedAttributeType> findBycode(
		String code, int start, int end) {

		return getPersistence().findBycode(code, start, end);
	}

	/**
	 * Returns an ordered range of all the persisted attribute types where code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAttributeTypeModelImpl</code>.
	 * </p>
	 *
	 * @param code the code
	 * @param start the lower bound of the range of persisted attribute types
	 * @param end the upper bound of the range of persisted attribute types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching persisted attribute types
	 */
	public static List<PersistedAttributeType> findBycode(
		String code, int start, int end,
		OrderByComparator<PersistedAttributeType> orderByComparator) {

		return getPersistence().findBycode(code, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the persisted attribute types where code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAttributeTypeModelImpl</code>.
	 * </p>
	 *
	 * @param code the code
	 * @param start the lower bound of the range of persisted attribute types
	 * @param end the upper bound of the range of persisted attribute types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching persisted attribute types
	 */
	public static List<PersistedAttributeType> findBycode(
		String code, int start, int end,
		OrderByComparator<PersistedAttributeType> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBycode(
			code, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first persisted attribute type in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute type
	 * @throws NoSuchPersistedAttributeTypeException if a matching persisted attribute type could not be found
	 */
	public static PersistedAttributeType findBycode_First(
			String code,
			OrderByComparator<PersistedAttributeType> orderByComparator)
		throws com.pds.smartstone.exception.
			NoSuchPersistedAttributeTypeException {

		return getPersistence().findBycode_First(code, orderByComparator);
	}

	/**
	 * Returns the first persisted attribute type in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute type, or <code>null</code> if a matching persisted attribute type could not be found
	 */
	public static PersistedAttributeType fetchBycode_First(
		String code,
		OrderByComparator<PersistedAttributeType> orderByComparator) {

		return getPersistence().fetchBycode_First(code, orderByComparator);
	}

	/**
	 * Returns the last persisted attribute type in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute type
	 * @throws NoSuchPersistedAttributeTypeException if a matching persisted attribute type could not be found
	 */
	public static PersistedAttributeType findBycode_Last(
			String code,
			OrderByComparator<PersistedAttributeType> orderByComparator)
		throws com.pds.smartstone.exception.
			NoSuchPersistedAttributeTypeException {

		return getPersistence().findBycode_Last(code, orderByComparator);
	}

	/**
	 * Returns the last persisted attribute type in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute type, or <code>null</code> if a matching persisted attribute type could not be found
	 */
	public static PersistedAttributeType fetchBycode_Last(
		String code,
		OrderByComparator<PersistedAttributeType> orderByComparator) {

		return getPersistence().fetchBycode_Last(code, orderByComparator);
	}

	/**
	 * Returns the persisted attribute types before and after the current persisted attribute type in the ordered set where code = &#63;.
	 *
	 * @param id the primary key of the current persisted attribute type
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next persisted attribute type
	 * @throws NoSuchPersistedAttributeTypeException if a persisted attribute type with the primary key could not be found
	 */
	public static PersistedAttributeType[] findBycode_PrevAndNext(
			long id, String code,
			OrderByComparator<PersistedAttributeType> orderByComparator)
		throws com.pds.smartstone.exception.
			NoSuchPersistedAttributeTypeException {

		return getPersistence().findBycode_PrevAndNext(
			id, code, orderByComparator);
	}

	/**
	 * Removes all the persisted attribute types where code = &#63; from the database.
	 *
	 * @param code the code
	 */
	public static void removeBycode(String code) {
		getPersistence().removeBycode(code);
	}

	/**
	 * Returns the number of persisted attribute types where code = &#63;.
	 *
	 * @param code the code
	 * @return the number of matching persisted attribute types
	 */
	public static int countBycode(String code) {
		return getPersistence().countBycode(code);
	}

	/**
	 * Caches the persisted attribute type in the entity cache if it is enabled.
	 *
	 * @param persistedAttributeType the persisted attribute type
	 */
	public static void cacheResult(
		PersistedAttributeType persistedAttributeType) {

		getPersistence().cacheResult(persistedAttributeType);
	}

	/**
	 * Caches the persisted attribute types in the entity cache if it is enabled.
	 *
	 * @param persistedAttributeTypes the persisted attribute types
	 */
	public static void cacheResult(
		List<PersistedAttributeType> persistedAttributeTypes) {

		getPersistence().cacheResult(persistedAttributeTypes);
	}

	/**
	 * Creates a new persisted attribute type with the primary key. Does not add the persisted attribute type to the database.
	 *
	 * @param id the primary key for the new persisted attribute type
	 * @return the new persisted attribute type
	 */
	public static PersistedAttributeType create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the persisted attribute type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the persisted attribute type
	 * @return the persisted attribute type that was removed
	 * @throws NoSuchPersistedAttributeTypeException if a persisted attribute type with the primary key could not be found
	 */
	public static PersistedAttributeType remove(long id)
		throws com.pds.smartstone.exception.
			NoSuchPersistedAttributeTypeException {

		return getPersistence().remove(id);
	}

	public static PersistedAttributeType updateImpl(
		PersistedAttributeType persistedAttributeType) {

		return getPersistence().updateImpl(persistedAttributeType);
	}

	/**
	 * Returns the persisted attribute type with the primary key or throws a <code>NoSuchPersistedAttributeTypeException</code> if it could not be found.
	 *
	 * @param id the primary key of the persisted attribute type
	 * @return the persisted attribute type
	 * @throws NoSuchPersistedAttributeTypeException if a persisted attribute type with the primary key could not be found
	 */
	public static PersistedAttributeType findByPrimaryKey(long id)
		throws com.pds.smartstone.exception.
			NoSuchPersistedAttributeTypeException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the persisted attribute type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the persisted attribute type
	 * @return the persisted attribute type, or <code>null</code> if a persisted attribute type with the primary key could not be found
	 */
	public static PersistedAttributeType fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the persisted attribute types.
	 *
	 * @return the persisted attribute types
	 */
	public static List<PersistedAttributeType> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the persisted attribute types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAttributeTypeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of persisted attribute types
	 * @param end the upper bound of the range of persisted attribute types (not inclusive)
	 * @return the range of persisted attribute types
	 */
	public static List<PersistedAttributeType> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the persisted attribute types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAttributeTypeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of persisted attribute types
	 * @param end the upper bound of the range of persisted attribute types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of persisted attribute types
	 */
	public static List<PersistedAttributeType> findAll(
		int start, int end,
		OrderByComparator<PersistedAttributeType> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the persisted attribute types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAttributeTypeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of persisted attribute types
	 * @param end the upper bound of the range of persisted attribute types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of persisted attribute types
	 */
	public static List<PersistedAttributeType> findAll(
		int start, int end,
		OrderByComparator<PersistedAttributeType> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the persisted attribute types from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of persisted attribute types.
	 *
	 * @return the number of persisted attribute types
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PersistedAttributeTypePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<PersistedAttributeTypePersistence, PersistedAttributeTypePersistence>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			PersistedAttributeTypePersistence.class);

		ServiceTracker
			<PersistedAttributeTypePersistence,
			 PersistedAttributeTypePersistence> serviceTracker =
				new ServiceTracker
					<PersistedAttributeTypePersistence,
					 PersistedAttributeTypePersistence>(
						 bundle.getBundleContext(),
						 PersistedAttributeTypePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}