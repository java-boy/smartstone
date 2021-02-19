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

package com.pds.smartstone.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import com.pds.smartstone.exception.NoSuchPersistedAttributeTypeException;
import com.pds.smartstone.model.PersistedAttributeType;
import com.pds.smartstone.model.impl.PersistedAttributeTypeImpl;
import com.pds.smartstone.model.impl.PersistedAttributeTypeModelImpl;
import com.pds.smartstone.service.persistence.PersistedAttributeTypePersistence;
import com.pds.smartstone.service.persistence.impl.constants.SmartStonePersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the persisted attribute type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = PersistedAttributeTypePersistence.class)
public class PersistedAttributeTypePersistenceImpl
	extends BasePersistenceImpl<PersistedAttributeType>
	implements PersistedAttributeTypePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PersistedAttributeTypeUtil</code> to access the persisted attribute type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PersistedAttributeTypeImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the persisted attribute types where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching persisted attribute types
	 */
	@Override
	public List<PersistedAttributeType> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<PersistedAttributeType> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<PersistedAttributeType> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<PersistedAttributeType> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<PersistedAttributeType> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<PersistedAttributeType> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<PersistedAttributeType> list = null;

		if (useFinderCache) {
			list = (List<PersistedAttributeType>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (PersistedAttributeType persistedAttributeType : list) {
					if (!uuid.equals(persistedAttributeType.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_PERSISTEDATTRIBUTETYPE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PersistedAttributeTypeModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<PersistedAttributeType>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first persisted attribute type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute type
	 * @throws NoSuchPersistedAttributeTypeException if a matching persisted attribute type could not be found
	 */
	@Override
	public PersistedAttributeType findByUuid_First(
			String uuid,
			OrderByComparator<PersistedAttributeType> orderByComparator)
		throws NoSuchPersistedAttributeTypeException {

		PersistedAttributeType persistedAttributeType = fetchByUuid_First(
			uuid, orderByComparator);

		if (persistedAttributeType != null) {
			return persistedAttributeType;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchPersistedAttributeTypeException(sb.toString());
	}

	/**
	 * Returns the first persisted attribute type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute type, or <code>null</code> if a matching persisted attribute type could not be found
	 */
	@Override
	public PersistedAttributeType fetchByUuid_First(
		String uuid,
		OrderByComparator<PersistedAttributeType> orderByComparator) {

		List<PersistedAttributeType> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last persisted attribute type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute type
	 * @throws NoSuchPersistedAttributeTypeException if a matching persisted attribute type could not be found
	 */
	@Override
	public PersistedAttributeType findByUuid_Last(
			String uuid,
			OrderByComparator<PersistedAttributeType> orderByComparator)
		throws NoSuchPersistedAttributeTypeException {

		PersistedAttributeType persistedAttributeType = fetchByUuid_Last(
			uuid, orderByComparator);

		if (persistedAttributeType != null) {
			return persistedAttributeType;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchPersistedAttributeTypeException(sb.toString());
	}

	/**
	 * Returns the last persisted attribute type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute type, or <code>null</code> if a matching persisted attribute type could not be found
	 */
	@Override
	public PersistedAttributeType fetchByUuid_Last(
		String uuid,
		OrderByComparator<PersistedAttributeType> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<PersistedAttributeType> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public PersistedAttributeType[] findByUuid_PrevAndNext(
			long id, String uuid,
			OrderByComparator<PersistedAttributeType> orderByComparator)
		throws NoSuchPersistedAttributeTypeException {

		uuid = Objects.toString(uuid, "");

		PersistedAttributeType persistedAttributeType = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			PersistedAttributeType[] array = new PersistedAttributeTypeImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, persistedAttributeType, uuid, orderByComparator, true);

			array[1] = persistedAttributeType;

			array[2] = getByUuid_PrevAndNext(
				session, persistedAttributeType, uuid, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected PersistedAttributeType getByUuid_PrevAndNext(
		Session session, PersistedAttributeType persistedAttributeType,
		String uuid,
		OrderByComparator<PersistedAttributeType> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PERSISTEDATTRIBUTETYPE_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(PersistedAttributeTypeModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						persistedAttributeType)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<PersistedAttributeType> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the persisted attribute types where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (PersistedAttributeType persistedAttributeType :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(persistedAttributeType);
		}
	}

	/**
	 * Returns the number of persisted attribute types where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching persisted attribute types
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PERSISTEDATTRIBUTETYPE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"persistedAttributeType.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(persistedAttributeType.uuid IS NULL OR persistedAttributeType.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByid;
	private FinderPath _finderPathWithoutPaginationFindByid;
	private FinderPath _finderPathCountByid;

	/**
	 * Returns all the persisted attribute types where id = &#63;.
	 *
	 * @param id the ID
	 * @return the matching persisted attribute types
	 */
	@Override
	public List<PersistedAttributeType> findByid(long id) {
		return findByid(id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<PersistedAttributeType> findByid(long id, int start, int end) {
		return findByid(id, start, end, null);
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
	@Override
	public List<PersistedAttributeType> findByid(
		long id, int start, int end,
		OrderByComparator<PersistedAttributeType> orderByComparator) {

		return findByid(id, start, end, orderByComparator, true);
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
	@Override
	public List<PersistedAttributeType> findByid(
		long id, int start, int end,
		OrderByComparator<PersistedAttributeType> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByid;
				finderArgs = new Object[] {id};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByid;
			finderArgs = new Object[] {id, start, end, orderByComparator};
		}

		List<PersistedAttributeType> list = null;

		if (useFinderCache) {
			list = (List<PersistedAttributeType>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (PersistedAttributeType persistedAttributeType : list) {
					if (id != persistedAttributeType.getId()) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_PERSISTEDATTRIBUTETYPE_WHERE);

			sb.append(_FINDER_COLUMN_ID_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PersistedAttributeTypeModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(id);

				list = (List<PersistedAttributeType>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first persisted attribute type in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute type
	 * @throws NoSuchPersistedAttributeTypeException if a matching persisted attribute type could not be found
	 */
	@Override
	public PersistedAttributeType findByid_First(
			long id,
			OrderByComparator<PersistedAttributeType> orderByComparator)
		throws NoSuchPersistedAttributeTypeException {

		PersistedAttributeType persistedAttributeType = fetchByid_First(
			id, orderByComparator);

		if (persistedAttributeType != null) {
			return persistedAttributeType;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("id=");
		sb.append(id);

		sb.append("}");

		throw new NoSuchPersistedAttributeTypeException(sb.toString());
	}

	/**
	 * Returns the first persisted attribute type in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute type, or <code>null</code> if a matching persisted attribute type could not be found
	 */
	@Override
	public PersistedAttributeType fetchByid_First(
		long id, OrderByComparator<PersistedAttributeType> orderByComparator) {

		List<PersistedAttributeType> list = findByid(
			id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last persisted attribute type in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute type
	 * @throws NoSuchPersistedAttributeTypeException if a matching persisted attribute type could not be found
	 */
	@Override
	public PersistedAttributeType findByid_Last(
			long id,
			OrderByComparator<PersistedAttributeType> orderByComparator)
		throws NoSuchPersistedAttributeTypeException {

		PersistedAttributeType persistedAttributeType = fetchByid_Last(
			id, orderByComparator);

		if (persistedAttributeType != null) {
			return persistedAttributeType;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("id=");
		sb.append(id);

		sb.append("}");

		throw new NoSuchPersistedAttributeTypeException(sb.toString());
	}

	/**
	 * Returns the last persisted attribute type in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute type, or <code>null</code> if a matching persisted attribute type could not be found
	 */
	@Override
	public PersistedAttributeType fetchByid_Last(
		long id, OrderByComparator<PersistedAttributeType> orderByComparator) {

		int count = countByid(id);

		if (count == 0) {
			return null;
		}

		List<PersistedAttributeType> list = findByid(
			id, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the persisted attribute types where id = &#63; from the database.
	 *
	 * @param id the ID
	 */
	@Override
	public void removeByid(long id) {
		for (PersistedAttributeType persistedAttributeType :
				findByid(id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(persistedAttributeType);
		}
	}

	/**
	 * Returns the number of persisted attribute types where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching persisted attribute types
	 */
	@Override
	public int countByid(long id) {
		FinderPath finderPath = _finderPathCountByid;

		Object[] finderArgs = new Object[] {id};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PERSISTEDATTRIBUTETYPE_WHERE);

			sb.append(_FINDER_COLUMN_ID_ID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(id);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_ID_ID_2 =
		"persistedAttributeType.id = ?";

	private FinderPath _finderPathWithPaginationFindBycode;
	private FinderPath _finderPathWithoutPaginationFindBycode;
	private FinderPath _finderPathCountBycode;

	/**
	 * Returns all the persisted attribute types where code = &#63;.
	 *
	 * @param code the code
	 * @return the matching persisted attribute types
	 */
	@Override
	public List<PersistedAttributeType> findBycode(String code) {
		return findBycode(code, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<PersistedAttributeType> findBycode(
		String code, int start, int end) {

		return findBycode(code, start, end, null);
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
	@Override
	public List<PersistedAttributeType> findBycode(
		String code, int start, int end,
		OrderByComparator<PersistedAttributeType> orderByComparator) {

		return findBycode(code, start, end, orderByComparator, true);
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
	@Override
	public List<PersistedAttributeType> findBycode(
		String code, int start, int end,
		OrderByComparator<PersistedAttributeType> orderByComparator,
		boolean useFinderCache) {

		code = Objects.toString(code, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBycode;
				finderArgs = new Object[] {code};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBycode;
			finderArgs = new Object[] {code, start, end, orderByComparator};
		}

		List<PersistedAttributeType> list = null;

		if (useFinderCache) {
			list = (List<PersistedAttributeType>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (PersistedAttributeType persistedAttributeType : list) {
					if (!code.equals(persistedAttributeType.getCode())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_PERSISTEDATTRIBUTETYPE_WHERE);

			boolean bindCode = false;

			if (code.isEmpty()) {
				sb.append(_FINDER_COLUMN_CODE_CODE_3);
			}
			else {
				bindCode = true;

				sb.append(_FINDER_COLUMN_CODE_CODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PersistedAttributeTypeModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCode) {
					queryPos.add(code);
				}

				list = (List<PersistedAttributeType>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first persisted attribute type in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute type
	 * @throws NoSuchPersistedAttributeTypeException if a matching persisted attribute type could not be found
	 */
	@Override
	public PersistedAttributeType findBycode_First(
			String code,
			OrderByComparator<PersistedAttributeType> orderByComparator)
		throws NoSuchPersistedAttributeTypeException {

		PersistedAttributeType persistedAttributeType = fetchBycode_First(
			code, orderByComparator);

		if (persistedAttributeType != null) {
			return persistedAttributeType;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("code=");
		sb.append(code);

		sb.append("}");

		throw new NoSuchPersistedAttributeTypeException(sb.toString());
	}

	/**
	 * Returns the first persisted attribute type in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute type, or <code>null</code> if a matching persisted attribute type could not be found
	 */
	@Override
	public PersistedAttributeType fetchBycode_First(
		String code,
		OrderByComparator<PersistedAttributeType> orderByComparator) {

		List<PersistedAttributeType> list = findBycode(
			code, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last persisted attribute type in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute type
	 * @throws NoSuchPersistedAttributeTypeException if a matching persisted attribute type could not be found
	 */
	@Override
	public PersistedAttributeType findBycode_Last(
			String code,
			OrderByComparator<PersistedAttributeType> orderByComparator)
		throws NoSuchPersistedAttributeTypeException {

		PersistedAttributeType persistedAttributeType = fetchBycode_Last(
			code, orderByComparator);

		if (persistedAttributeType != null) {
			return persistedAttributeType;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("code=");
		sb.append(code);

		sb.append("}");

		throw new NoSuchPersistedAttributeTypeException(sb.toString());
	}

	/**
	 * Returns the last persisted attribute type in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute type, or <code>null</code> if a matching persisted attribute type could not be found
	 */
	@Override
	public PersistedAttributeType fetchBycode_Last(
		String code,
		OrderByComparator<PersistedAttributeType> orderByComparator) {

		int count = countBycode(code);

		if (count == 0) {
			return null;
		}

		List<PersistedAttributeType> list = findBycode(
			code, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public PersistedAttributeType[] findBycode_PrevAndNext(
			long id, String code,
			OrderByComparator<PersistedAttributeType> orderByComparator)
		throws NoSuchPersistedAttributeTypeException {

		code = Objects.toString(code, "");

		PersistedAttributeType persistedAttributeType = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			PersistedAttributeType[] array = new PersistedAttributeTypeImpl[3];

			array[0] = getBycode_PrevAndNext(
				session, persistedAttributeType, code, orderByComparator, true);

			array[1] = persistedAttributeType;

			array[2] = getBycode_PrevAndNext(
				session, persistedAttributeType, code, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected PersistedAttributeType getBycode_PrevAndNext(
		Session session, PersistedAttributeType persistedAttributeType,
		String code,
		OrderByComparator<PersistedAttributeType> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PERSISTEDATTRIBUTETYPE_WHERE);

		boolean bindCode = false;

		if (code.isEmpty()) {
			sb.append(_FINDER_COLUMN_CODE_CODE_3);
		}
		else {
			bindCode = true;

			sb.append(_FINDER_COLUMN_CODE_CODE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(PersistedAttributeTypeModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCode) {
			queryPos.add(code);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						persistedAttributeType)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<PersistedAttributeType> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the persisted attribute types where code = &#63; from the database.
	 *
	 * @param code the code
	 */
	@Override
	public void removeBycode(String code) {
		for (PersistedAttributeType persistedAttributeType :
				findBycode(code, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(persistedAttributeType);
		}
	}

	/**
	 * Returns the number of persisted attribute types where code = &#63;.
	 *
	 * @param code the code
	 * @return the number of matching persisted attribute types
	 */
	@Override
	public int countBycode(String code) {
		code = Objects.toString(code, "");

		FinderPath finderPath = _finderPathCountBycode;

		Object[] finderArgs = new Object[] {code};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PERSISTEDATTRIBUTETYPE_WHERE);

			boolean bindCode = false;

			if (code.isEmpty()) {
				sb.append(_FINDER_COLUMN_CODE_CODE_3);
			}
			else {
				bindCode = true;

				sb.append(_FINDER_COLUMN_CODE_CODE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCode) {
					queryPos.add(code);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_CODE_CODE_2 =
		"persistedAttributeType.code = ?";

	private static final String _FINDER_COLUMN_CODE_CODE_3 =
		"(persistedAttributeType.code IS NULL OR persistedAttributeType.code = '')";

	public PersistedAttributeTypePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(PersistedAttributeType.class);

		setModelImplClass(PersistedAttributeTypeImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the persisted attribute type in the entity cache if it is enabled.
	 *
	 * @param persistedAttributeType the persisted attribute type
	 */
	@Override
	public void cacheResult(PersistedAttributeType persistedAttributeType) {
		entityCache.putResult(
			PersistedAttributeTypeImpl.class,
			persistedAttributeType.getPrimaryKey(), persistedAttributeType);

		persistedAttributeType.resetOriginalValues();
	}

	/**
	 * Caches the persisted attribute types in the entity cache if it is enabled.
	 *
	 * @param persistedAttributeTypes the persisted attribute types
	 */
	@Override
	public void cacheResult(
		List<PersistedAttributeType> persistedAttributeTypes) {

		for (PersistedAttributeType persistedAttributeType :
				persistedAttributeTypes) {

			if (entityCache.getResult(
					PersistedAttributeTypeImpl.class,
					persistedAttributeType.getPrimaryKey()) == null) {

				cacheResult(persistedAttributeType);
			}
			else {
				persistedAttributeType.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all persisted attribute types.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PersistedAttributeTypeImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the persisted attribute type.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PersistedAttributeType persistedAttributeType) {
		entityCache.removeResult(
			PersistedAttributeTypeImpl.class,
			persistedAttributeType.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<PersistedAttributeType> persistedAttributeTypes) {

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PersistedAttributeType persistedAttributeType :
				persistedAttributeTypes) {

			entityCache.removeResult(
				PersistedAttributeTypeImpl.class,
				persistedAttributeType.getPrimaryKey());
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				PersistedAttributeTypeImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new persisted attribute type with the primary key. Does not add the persisted attribute type to the database.
	 *
	 * @param id the primary key for the new persisted attribute type
	 * @return the new persisted attribute type
	 */
	@Override
	public PersistedAttributeType create(long id) {
		PersistedAttributeType persistedAttributeType =
			new PersistedAttributeTypeImpl();

		persistedAttributeType.setNew(true);
		persistedAttributeType.setPrimaryKey(id);

		String uuid = PortalUUIDUtil.generate();

		persistedAttributeType.setUuid(uuid);

		return persistedAttributeType;
	}

	/**
	 * Removes the persisted attribute type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the persisted attribute type
	 * @return the persisted attribute type that was removed
	 * @throws NoSuchPersistedAttributeTypeException if a persisted attribute type with the primary key could not be found
	 */
	@Override
	public PersistedAttributeType remove(long id)
		throws NoSuchPersistedAttributeTypeException {

		return remove((Serializable)id);
	}

	/**
	 * Removes the persisted attribute type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the persisted attribute type
	 * @return the persisted attribute type that was removed
	 * @throws NoSuchPersistedAttributeTypeException if a persisted attribute type with the primary key could not be found
	 */
	@Override
	public PersistedAttributeType remove(Serializable primaryKey)
		throws NoSuchPersistedAttributeTypeException {

		Session session = null;

		try {
			session = openSession();

			PersistedAttributeType persistedAttributeType =
				(PersistedAttributeType)session.get(
					PersistedAttributeTypeImpl.class, primaryKey);

			if (persistedAttributeType == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPersistedAttributeTypeException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(persistedAttributeType);
		}
		catch (NoSuchPersistedAttributeTypeException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected PersistedAttributeType removeImpl(
		PersistedAttributeType persistedAttributeType) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(persistedAttributeType)) {
				persistedAttributeType = (PersistedAttributeType)session.get(
					PersistedAttributeTypeImpl.class,
					persistedAttributeType.getPrimaryKeyObj());
			}

			if (persistedAttributeType != null) {
				session.delete(persistedAttributeType);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (persistedAttributeType != null) {
			clearCache(persistedAttributeType);
		}

		return persistedAttributeType;
	}

	@Override
	public PersistedAttributeType updateImpl(
		PersistedAttributeType persistedAttributeType) {

		boolean isNew = persistedAttributeType.isNew();

		if (!(persistedAttributeType instanceof
				PersistedAttributeTypeModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(persistedAttributeType.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					persistedAttributeType);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in persistedAttributeType proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom PersistedAttributeType implementation " +
					persistedAttributeType.getClass());
		}

		PersistedAttributeTypeModelImpl persistedAttributeTypeModelImpl =
			(PersistedAttributeTypeModelImpl)persistedAttributeType;

		if (Validator.isNull(persistedAttributeType.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			persistedAttributeType.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (persistedAttributeType.isNew()) {
				session.save(persistedAttributeType);

				persistedAttributeType.setNew(false);
			}
			else {
				persistedAttributeType = (PersistedAttributeType)session.merge(
					persistedAttributeType);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			Object[] args = new Object[] {
				persistedAttributeTypeModelImpl.getUuid()
			};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {persistedAttributeTypeModelImpl.getId()};

			finderCache.removeResult(_finderPathCountByid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByid, args);

			args = new Object[] {persistedAttributeTypeModelImpl.getCode()};

			finderCache.removeResult(_finderPathCountBycode, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindBycode, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((persistedAttributeTypeModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					persistedAttributeTypeModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {persistedAttributeTypeModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((persistedAttributeTypeModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					persistedAttributeTypeModelImpl.getOriginalId()
				};

				finderCache.removeResult(_finderPathCountByid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByid, args);

				args = new Object[] {persistedAttributeTypeModelImpl.getId()};

				finderCache.removeResult(_finderPathCountByid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByid, args);
			}

			if ((persistedAttributeTypeModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindBycode.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					persistedAttributeTypeModelImpl.getOriginalCode()
				};

				finderCache.removeResult(_finderPathCountBycode, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindBycode, args);

				args = new Object[] {persistedAttributeTypeModelImpl.getCode()};

				finderCache.removeResult(_finderPathCountBycode, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindBycode, args);
			}
		}

		entityCache.putResult(
			PersistedAttributeTypeImpl.class,
			persistedAttributeType.getPrimaryKey(), persistedAttributeType,
			false);

		persistedAttributeType.resetOriginalValues();

		return persistedAttributeType;
	}

	/**
	 * Returns the persisted attribute type with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the persisted attribute type
	 * @return the persisted attribute type
	 * @throws NoSuchPersistedAttributeTypeException if a persisted attribute type with the primary key could not be found
	 */
	@Override
	public PersistedAttributeType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPersistedAttributeTypeException {

		PersistedAttributeType persistedAttributeType = fetchByPrimaryKey(
			primaryKey);

		if (persistedAttributeType == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPersistedAttributeTypeException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return persistedAttributeType;
	}

	/**
	 * Returns the persisted attribute type with the primary key or throws a <code>NoSuchPersistedAttributeTypeException</code> if it could not be found.
	 *
	 * @param id the primary key of the persisted attribute type
	 * @return the persisted attribute type
	 * @throws NoSuchPersistedAttributeTypeException if a persisted attribute type with the primary key could not be found
	 */
	@Override
	public PersistedAttributeType findByPrimaryKey(long id)
		throws NoSuchPersistedAttributeTypeException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the persisted attribute type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the persisted attribute type
	 * @return the persisted attribute type, or <code>null</code> if a persisted attribute type with the primary key could not be found
	 */
	@Override
	public PersistedAttributeType fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the persisted attribute types.
	 *
	 * @return the persisted attribute types
	 */
	@Override
	public List<PersistedAttributeType> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<PersistedAttributeType> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<PersistedAttributeType> findAll(
		int start, int end,
		OrderByComparator<PersistedAttributeType> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<PersistedAttributeType> findAll(
		int start, int end,
		OrderByComparator<PersistedAttributeType> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<PersistedAttributeType> list = null;

		if (useFinderCache) {
			list = (List<PersistedAttributeType>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PERSISTEDATTRIBUTETYPE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PERSISTEDATTRIBUTETYPE;

				sql = sql.concat(PersistedAttributeTypeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<PersistedAttributeType>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the persisted attribute types from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PersistedAttributeType persistedAttributeType : findAll()) {
			remove(persistedAttributeType);
		}
	}

	/**
	 * Returns the number of persisted attribute types.
	 *
	 * @return the number of persisted attribute types
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_PERSISTEDATTRIBUTETYPE);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PERSISTEDATTRIBUTETYPE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PersistedAttributeTypeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the persisted attribute type persistence.
	 */
	@Activate
	public void activate() {
		_finderPathWithPaginationFindAll = new FinderPath(
			PersistedAttributeTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			PersistedAttributeTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			PersistedAttributeTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			PersistedAttributeTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			PersistedAttributeTypeModelImpl.UUID_COLUMN_BITMASK |
			PersistedAttributeTypeModelImpl.CODE_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByUuid", new String[] {String.class.getName()});

		_finderPathWithPaginationFindByid = new FinderPath(
			PersistedAttributeTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByid",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByid = new FinderPath(
			PersistedAttributeTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByid",
			new String[] {Long.class.getName()},
			PersistedAttributeTypeModelImpl.ID_COLUMN_BITMASK |
			PersistedAttributeTypeModelImpl.CODE_COLUMN_BITMASK);

		_finderPathCountByid = new FinderPath(
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByid",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindBycode = new FinderPath(
			PersistedAttributeTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycode",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindBycode = new FinderPath(
			PersistedAttributeTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycode",
			new String[] {String.class.getName()},
			PersistedAttributeTypeModelImpl.CODE_COLUMN_BITMASK);

		_finderPathCountBycode = new FinderPath(
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycode", new String[] {String.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(PersistedAttributeTypeImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	@Reference(
		target = SmartStonePersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = SmartStonePersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SmartStonePersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PERSISTEDATTRIBUTETYPE =
		"SELECT persistedAttributeType FROM PersistedAttributeType persistedAttributeType";

	private static final String _SQL_SELECT_PERSISTEDATTRIBUTETYPE_WHERE =
		"SELECT persistedAttributeType FROM PersistedAttributeType persistedAttributeType WHERE ";

	private static final String _SQL_COUNT_PERSISTEDATTRIBUTETYPE =
		"SELECT COUNT(persistedAttributeType) FROM PersistedAttributeType persistedAttributeType";

	private static final String _SQL_COUNT_PERSISTEDATTRIBUTETYPE_WHERE =
		"SELECT COUNT(persistedAttributeType) FROM PersistedAttributeType persistedAttributeType WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"persistedAttributeType.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PersistedAttributeType exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No PersistedAttributeType exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PersistedAttributeTypePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	static {
		try {
			Class.forName(SmartStonePersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException classNotFoundException) {
			throw new ExceptionInInitializerError(classNotFoundException);
		}
	}

}