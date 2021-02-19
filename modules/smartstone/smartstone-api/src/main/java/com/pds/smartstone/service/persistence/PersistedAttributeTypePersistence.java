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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.pds.smartstone.exception.NoSuchPersistedAttributeTypeException;
import com.pds.smartstone.model.PersistedAttributeType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the persisted attribute type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PersistedAttributeTypeUtil
 * @generated
 */
@ProviderType
public interface PersistedAttributeTypePersistence
	extends BasePersistence<PersistedAttributeType> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PersistedAttributeTypeUtil} to access the persisted attribute type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the persisted attribute types where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching persisted attribute types
	 */
	public java.util.List<PersistedAttributeType> findByUuid(String uuid);

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
	public java.util.List<PersistedAttributeType> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<PersistedAttributeType> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttributeType>
			orderByComparator);

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
	public java.util.List<PersistedAttributeType> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttributeType>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first persisted attribute type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute type
	 * @throws NoSuchPersistedAttributeTypeException if a matching persisted attribute type could not be found
	 */
	public PersistedAttributeType findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<PersistedAttributeType> orderByComparator)
		throws NoSuchPersistedAttributeTypeException;

	/**
	 * Returns the first persisted attribute type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute type, or <code>null</code> if a matching persisted attribute type could not be found
	 */
	public PersistedAttributeType fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttributeType>
			orderByComparator);

	/**
	 * Returns the last persisted attribute type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute type
	 * @throws NoSuchPersistedAttributeTypeException if a matching persisted attribute type could not be found
	 */
	public PersistedAttributeType findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<PersistedAttributeType> orderByComparator)
		throws NoSuchPersistedAttributeTypeException;

	/**
	 * Returns the last persisted attribute type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute type, or <code>null</code> if a matching persisted attribute type could not be found
	 */
	public PersistedAttributeType fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttributeType>
			orderByComparator);

	/**
	 * Returns the persisted attribute types before and after the current persisted attribute type in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current persisted attribute type
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next persisted attribute type
	 * @throws NoSuchPersistedAttributeTypeException if a persisted attribute type with the primary key could not be found
	 */
	public PersistedAttributeType[] findByUuid_PrevAndNext(
			long id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<PersistedAttributeType> orderByComparator)
		throws NoSuchPersistedAttributeTypeException;

	/**
	 * Removes all the persisted attribute types where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of persisted attribute types where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching persisted attribute types
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the persisted attribute types where id = &#63;.
	 *
	 * @param id the ID
	 * @return the matching persisted attribute types
	 */
	public java.util.List<PersistedAttributeType> findByid(long id);

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
	public java.util.List<PersistedAttributeType> findByid(
		long id, int start, int end);

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
	public java.util.List<PersistedAttributeType> findByid(
		long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttributeType>
			orderByComparator);

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
	public java.util.List<PersistedAttributeType> findByid(
		long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttributeType>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first persisted attribute type in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute type
	 * @throws NoSuchPersistedAttributeTypeException if a matching persisted attribute type could not be found
	 */
	public PersistedAttributeType findByid_First(
			long id,
			com.liferay.portal.kernel.util.OrderByComparator
				<PersistedAttributeType> orderByComparator)
		throws NoSuchPersistedAttributeTypeException;

	/**
	 * Returns the first persisted attribute type in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute type, or <code>null</code> if a matching persisted attribute type could not be found
	 */
	public PersistedAttributeType fetchByid_First(
		long id,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttributeType>
			orderByComparator);

	/**
	 * Returns the last persisted attribute type in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute type
	 * @throws NoSuchPersistedAttributeTypeException if a matching persisted attribute type could not be found
	 */
	public PersistedAttributeType findByid_Last(
			long id,
			com.liferay.portal.kernel.util.OrderByComparator
				<PersistedAttributeType> orderByComparator)
		throws NoSuchPersistedAttributeTypeException;

	/**
	 * Returns the last persisted attribute type in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute type, or <code>null</code> if a matching persisted attribute type could not be found
	 */
	public PersistedAttributeType fetchByid_Last(
		long id,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttributeType>
			orderByComparator);

	/**
	 * Removes all the persisted attribute types where id = &#63; from the database.
	 *
	 * @param id the ID
	 */
	public void removeByid(long id);

	/**
	 * Returns the number of persisted attribute types where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching persisted attribute types
	 */
	public int countByid(long id);

	/**
	 * Returns all the persisted attribute types where code = &#63;.
	 *
	 * @param code the code
	 * @return the matching persisted attribute types
	 */
	public java.util.List<PersistedAttributeType> findBycode(String code);

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
	public java.util.List<PersistedAttributeType> findBycode(
		String code, int start, int end);

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
	public java.util.List<PersistedAttributeType> findBycode(
		String code, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttributeType>
			orderByComparator);

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
	public java.util.List<PersistedAttributeType> findBycode(
		String code, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttributeType>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first persisted attribute type in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute type
	 * @throws NoSuchPersistedAttributeTypeException if a matching persisted attribute type could not be found
	 */
	public PersistedAttributeType findBycode_First(
			String code,
			com.liferay.portal.kernel.util.OrderByComparator
				<PersistedAttributeType> orderByComparator)
		throws NoSuchPersistedAttributeTypeException;

	/**
	 * Returns the first persisted attribute type in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute type, or <code>null</code> if a matching persisted attribute type could not be found
	 */
	public PersistedAttributeType fetchBycode_First(
		String code,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttributeType>
			orderByComparator);

	/**
	 * Returns the last persisted attribute type in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute type
	 * @throws NoSuchPersistedAttributeTypeException if a matching persisted attribute type could not be found
	 */
	public PersistedAttributeType findBycode_Last(
			String code,
			com.liferay.portal.kernel.util.OrderByComparator
				<PersistedAttributeType> orderByComparator)
		throws NoSuchPersistedAttributeTypeException;

	/**
	 * Returns the last persisted attribute type in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute type, or <code>null</code> if a matching persisted attribute type could not be found
	 */
	public PersistedAttributeType fetchBycode_Last(
		String code,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttributeType>
			orderByComparator);

	/**
	 * Returns the persisted attribute types before and after the current persisted attribute type in the ordered set where code = &#63;.
	 *
	 * @param id the primary key of the current persisted attribute type
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next persisted attribute type
	 * @throws NoSuchPersistedAttributeTypeException if a persisted attribute type with the primary key could not be found
	 */
	public PersistedAttributeType[] findBycode_PrevAndNext(
			long id, String code,
			com.liferay.portal.kernel.util.OrderByComparator
				<PersistedAttributeType> orderByComparator)
		throws NoSuchPersistedAttributeTypeException;

	/**
	 * Removes all the persisted attribute types where code = &#63; from the database.
	 *
	 * @param code the code
	 */
	public void removeBycode(String code);

	/**
	 * Returns the number of persisted attribute types where code = &#63;.
	 *
	 * @param code the code
	 * @return the number of matching persisted attribute types
	 */
	public int countBycode(String code);

	/**
	 * Caches the persisted attribute type in the entity cache if it is enabled.
	 *
	 * @param persistedAttributeType the persisted attribute type
	 */
	public void cacheResult(PersistedAttributeType persistedAttributeType);

	/**
	 * Caches the persisted attribute types in the entity cache if it is enabled.
	 *
	 * @param persistedAttributeTypes the persisted attribute types
	 */
	public void cacheResult(
		java.util.List<PersistedAttributeType> persistedAttributeTypes);

	/**
	 * Creates a new persisted attribute type with the primary key. Does not add the persisted attribute type to the database.
	 *
	 * @param id the primary key for the new persisted attribute type
	 * @return the new persisted attribute type
	 */
	public PersistedAttributeType create(long id);

	/**
	 * Removes the persisted attribute type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the persisted attribute type
	 * @return the persisted attribute type that was removed
	 * @throws NoSuchPersistedAttributeTypeException if a persisted attribute type with the primary key could not be found
	 */
	public PersistedAttributeType remove(long id)
		throws NoSuchPersistedAttributeTypeException;

	public PersistedAttributeType updateImpl(
		PersistedAttributeType persistedAttributeType);

	/**
	 * Returns the persisted attribute type with the primary key or throws a <code>NoSuchPersistedAttributeTypeException</code> if it could not be found.
	 *
	 * @param id the primary key of the persisted attribute type
	 * @return the persisted attribute type
	 * @throws NoSuchPersistedAttributeTypeException if a persisted attribute type with the primary key could not be found
	 */
	public PersistedAttributeType findByPrimaryKey(long id)
		throws NoSuchPersistedAttributeTypeException;

	/**
	 * Returns the persisted attribute type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the persisted attribute type
	 * @return the persisted attribute type, or <code>null</code> if a persisted attribute type with the primary key could not be found
	 */
	public PersistedAttributeType fetchByPrimaryKey(long id);

	/**
	 * Returns all the persisted attribute types.
	 *
	 * @return the persisted attribute types
	 */
	public java.util.List<PersistedAttributeType> findAll();

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
	public java.util.List<PersistedAttributeType> findAll(int start, int end);

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
	public java.util.List<PersistedAttributeType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttributeType>
			orderByComparator);

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
	public java.util.List<PersistedAttributeType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttributeType>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the persisted attribute types from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of persisted attribute types.
	 *
	 * @return the number of persisted attribute types
	 */
	public int countAll();

}