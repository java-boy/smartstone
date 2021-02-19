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

import com.pds.smartstone.exception.NoSuchPersistedAttributeException;
import com.pds.smartstone.model.PersistedAttribute;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the persisted attribute service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PersistedAttributeUtil
 * @generated
 */
@ProviderType
public interface PersistedAttributePersistence
	extends BasePersistence<PersistedAttribute> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PersistedAttributeUtil} to access the persisted attribute persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the persisted attributes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching persisted attributes
	 */
	public java.util.List<PersistedAttribute> findByUuid(String uuid);

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
	public java.util.List<PersistedAttribute> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<PersistedAttribute> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttribute>
			orderByComparator);

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
	public java.util.List<PersistedAttribute> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttribute>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first persisted attribute in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute
	 * @throws NoSuchPersistedAttributeException if a matching persisted attribute could not be found
	 */
	public PersistedAttribute findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<PersistedAttribute>
				orderByComparator)
		throws NoSuchPersistedAttributeException;

	/**
	 * Returns the first persisted attribute in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute, or <code>null</code> if a matching persisted attribute could not be found
	 */
	public PersistedAttribute fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttribute>
			orderByComparator);

	/**
	 * Returns the last persisted attribute in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute
	 * @throws NoSuchPersistedAttributeException if a matching persisted attribute could not be found
	 */
	public PersistedAttribute findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<PersistedAttribute>
				orderByComparator)
		throws NoSuchPersistedAttributeException;

	/**
	 * Returns the last persisted attribute in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute, or <code>null</code> if a matching persisted attribute could not be found
	 */
	public PersistedAttribute fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttribute>
			orderByComparator);

	/**
	 * Returns the persisted attributes before and after the current persisted attribute in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current persisted attribute
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next persisted attribute
	 * @throws NoSuchPersistedAttributeException if a persisted attribute with the primary key could not be found
	 */
	public PersistedAttribute[] findByUuid_PrevAndNext(
			long id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<PersistedAttribute>
				orderByComparator)
		throws NoSuchPersistedAttributeException;

	/**
	 * Removes all the persisted attributes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of persisted attributes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching persisted attributes
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the persisted attributes where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @return the matching persisted attributes
	 */
	public java.util.List<PersistedAttribute> findBytypeId(long typeId);

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
	public java.util.List<PersistedAttribute> findBytypeId(
		long typeId, int start, int end);

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
	public java.util.List<PersistedAttribute> findBytypeId(
		long typeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttribute>
			orderByComparator);

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
	public java.util.List<PersistedAttribute> findBytypeId(
		long typeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttribute>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first persisted attribute in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute
	 * @throws NoSuchPersistedAttributeException if a matching persisted attribute could not be found
	 */
	public PersistedAttribute findBytypeId_First(
			long typeId,
			com.liferay.portal.kernel.util.OrderByComparator<PersistedAttribute>
				orderByComparator)
		throws NoSuchPersistedAttributeException;

	/**
	 * Returns the first persisted attribute in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute, or <code>null</code> if a matching persisted attribute could not be found
	 */
	public PersistedAttribute fetchBytypeId_First(
		long typeId,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttribute>
			orderByComparator);

	/**
	 * Returns the last persisted attribute in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute
	 * @throws NoSuchPersistedAttributeException if a matching persisted attribute could not be found
	 */
	public PersistedAttribute findBytypeId_Last(
			long typeId,
			com.liferay.portal.kernel.util.OrderByComparator<PersistedAttribute>
				orderByComparator)
		throws NoSuchPersistedAttributeException;

	/**
	 * Returns the last persisted attribute in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute, or <code>null</code> if a matching persisted attribute could not be found
	 */
	public PersistedAttribute fetchBytypeId_Last(
		long typeId,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttribute>
			orderByComparator);

	/**
	 * Returns the persisted attributes before and after the current persisted attribute in the ordered set where typeId = &#63;.
	 *
	 * @param id the primary key of the current persisted attribute
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next persisted attribute
	 * @throws NoSuchPersistedAttributeException if a persisted attribute with the primary key could not be found
	 */
	public PersistedAttribute[] findBytypeId_PrevAndNext(
			long id, long typeId,
			com.liferay.portal.kernel.util.OrderByComparator<PersistedAttribute>
				orderByComparator)
		throws NoSuchPersistedAttributeException;

	/**
	 * Removes all the persisted attributes where typeId = &#63; from the database.
	 *
	 * @param typeId the type ID
	 */
	public void removeBytypeId(long typeId);

	/**
	 * Returns the number of persisted attributes where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @return the number of matching persisted attributes
	 */
	public int countBytypeId(long typeId);

	/**
	 * Returns all the persisted attributes where id = &#63;.
	 *
	 * @param id the ID
	 * @return the matching persisted attributes
	 */
	public java.util.List<PersistedAttribute> findByid(long id);

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
	public java.util.List<PersistedAttribute> findByid(
		long id, int start, int end);

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
	public java.util.List<PersistedAttribute> findByid(
		long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttribute>
			orderByComparator);

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
	public java.util.List<PersistedAttribute> findByid(
		long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttribute>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first persisted attribute in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute
	 * @throws NoSuchPersistedAttributeException if a matching persisted attribute could not be found
	 */
	public PersistedAttribute findByid_First(
			long id,
			com.liferay.portal.kernel.util.OrderByComparator<PersistedAttribute>
				orderByComparator)
		throws NoSuchPersistedAttributeException;

	/**
	 * Returns the first persisted attribute in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute, or <code>null</code> if a matching persisted attribute could not be found
	 */
	public PersistedAttribute fetchByid_First(
		long id,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttribute>
			orderByComparator);

	/**
	 * Returns the last persisted attribute in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute
	 * @throws NoSuchPersistedAttributeException if a matching persisted attribute could not be found
	 */
	public PersistedAttribute findByid_Last(
			long id,
			com.liferay.portal.kernel.util.OrderByComparator<PersistedAttribute>
				orderByComparator)
		throws NoSuchPersistedAttributeException;

	/**
	 * Returns the last persisted attribute in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute, or <code>null</code> if a matching persisted attribute could not be found
	 */
	public PersistedAttribute fetchByid_Last(
		long id,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttribute>
			orderByComparator);

	/**
	 * Removes all the persisted attributes where id = &#63; from the database.
	 *
	 * @param id the ID
	 */
	public void removeByid(long id);

	/**
	 * Returns the number of persisted attributes where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching persisted attributes
	 */
	public int countByid(long id);

	/**
	 * Returns all the persisted attributes where typeId = &#63; and id = &#63;.
	 *
	 * @param typeId the type ID
	 * @param id the ID
	 * @return the matching persisted attributes
	 */
	public java.util.List<PersistedAttribute> findByidAndTypeId(
		long typeId, long id);

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
	public java.util.List<PersistedAttribute> findByidAndTypeId(
		long typeId, long id, int start, int end);

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
	public java.util.List<PersistedAttribute> findByidAndTypeId(
		long typeId, long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttribute>
			orderByComparator);

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
	public java.util.List<PersistedAttribute> findByidAndTypeId(
		long typeId, long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttribute>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first persisted attribute in the ordered set where typeId = &#63; and id = &#63;.
	 *
	 * @param typeId the type ID
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute
	 * @throws NoSuchPersistedAttributeException if a matching persisted attribute could not be found
	 */
	public PersistedAttribute findByidAndTypeId_First(
			long typeId, long id,
			com.liferay.portal.kernel.util.OrderByComparator<PersistedAttribute>
				orderByComparator)
		throws NoSuchPersistedAttributeException;

	/**
	 * Returns the first persisted attribute in the ordered set where typeId = &#63; and id = &#63;.
	 *
	 * @param typeId the type ID
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute, or <code>null</code> if a matching persisted attribute could not be found
	 */
	public PersistedAttribute fetchByidAndTypeId_First(
		long typeId, long id,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttribute>
			orderByComparator);

	/**
	 * Returns the last persisted attribute in the ordered set where typeId = &#63; and id = &#63;.
	 *
	 * @param typeId the type ID
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute
	 * @throws NoSuchPersistedAttributeException if a matching persisted attribute could not be found
	 */
	public PersistedAttribute findByidAndTypeId_Last(
			long typeId, long id,
			com.liferay.portal.kernel.util.OrderByComparator<PersistedAttribute>
				orderByComparator)
		throws NoSuchPersistedAttributeException;

	/**
	 * Returns the last persisted attribute in the ordered set where typeId = &#63; and id = &#63;.
	 *
	 * @param typeId the type ID
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute, or <code>null</code> if a matching persisted attribute could not be found
	 */
	public PersistedAttribute fetchByidAndTypeId_Last(
		long typeId, long id,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttribute>
			orderByComparator);

	/**
	 * Removes all the persisted attributes where typeId = &#63; and id = &#63; from the database.
	 *
	 * @param typeId the type ID
	 * @param id the ID
	 */
	public void removeByidAndTypeId(long typeId, long id);

	/**
	 * Returns the number of persisted attributes where typeId = &#63; and id = &#63;.
	 *
	 * @param typeId the type ID
	 * @param id the ID
	 * @return the number of matching persisted attributes
	 */
	public int countByidAndTypeId(long typeId, long id);

	/**
	 * Caches the persisted attribute in the entity cache if it is enabled.
	 *
	 * @param persistedAttribute the persisted attribute
	 */
	public void cacheResult(PersistedAttribute persistedAttribute);

	/**
	 * Caches the persisted attributes in the entity cache if it is enabled.
	 *
	 * @param persistedAttributes the persisted attributes
	 */
	public void cacheResult(
		java.util.List<PersistedAttribute> persistedAttributes);

	/**
	 * Creates a new persisted attribute with the primary key. Does not add the persisted attribute to the database.
	 *
	 * @param id the primary key for the new persisted attribute
	 * @return the new persisted attribute
	 */
	public PersistedAttribute create(long id);

	/**
	 * Removes the persisted attribute with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the persisted attribute
	 * @return the persisted attribute that was removed
	 * @throws NoSuchPersistedAttributeException if a persisted attribute with the primary key could not be found
	 */
	public PersistedAttribute remove(long id)
		throws NoSuchPersistedAttributeException;

	public PersistedAttribute updateImpl(PersistedAttribute persistedAttribute);

	/**
	 * Returns the persisted attribute with the primary key or throws a <code>NoSuchPersistedAttributeException</code> if it could not be found.
	 *
	 * @param id the primary key of the persisted attribute
	 * @return the persisted attribute
	 * @throws NoSuchPersistedAttributeException if a persisted attribute with the primary key could not be found
	 */
	public PersistedAttribute findByPrimaryKey(long id)
		throws NoSuchPersistedAttributeException;

	/**
	 * Returns the persisted attribute with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the persisted attribute
	 * @return the persisted attribute, or <code>null</code> if a persisted attribute with the primary key could not be found
	 */
	public PersistedAttribute fetchByPrimaryKey(long id);

	/**
	 * Returns all the persisted attributes.
	 *
	 * @return the persisted attributes
	 */
	public java.util.List<PersistedAttribute> findAll();

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
	public java.util.List<PersistedAttribute> findAll(int start, int end);

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
	public java.util.List<PersistedAttribute> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttribute>
			orderByComparator);

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
	public java.util.List<PersistedAttribute> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PersistedAttribute>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the persisted attributes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of persisted attributes.
	 *
	 * @return the number of persisted attributes
	 */
	public int countAll();

}