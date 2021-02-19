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

import com.pds.smartstone.exception.NoSuchPersistedAttributeException;
import com.pds.smartstone.model.PersistedAttribute;
import com.pds.smartstone.model.impl.PersistedAttributeImpl;
import com.pds.smartstone.model.impl.PersistedAttributeModelImpl;
import com.pds.smartstone.service.persistence.PersistedAttributePersistence;
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
 * The persistence implementation for the persisted attribute service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = PersistedAttributePersistence.class)
public class PersistedAttributePersistenceImpl
	extends BasePersistenceImpl<PersistedAttribute>
	implements PersistedAttributePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PersistedAttributeUtil</code> to access the persisted attribute persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PersistedAttributeImpl.class.getName();

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
	 * Returns all the persisted attributes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching persisted attributes
	 */
	@Override
	public List<PersistedAttribute> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<PersistedAttribute> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<PersistedAttribute> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<PersistedAttribute> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<PersistedAttribute> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<PersistedAttribute> orderByComparator,
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

		List<PersistedAttribute> list = null;

		if (useFinderCache) {
			list = (List<PersistedAttribute>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (PersistedAttribute persistedAttribute : list) {
					if (!uuid.equals(persistedAttribute.getUuid())) {
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

			sb.append(_SQL_SELECT_PERSISTEDATTRIBUTE_WHERE);

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
				sb.append(PersistedAttributeModelImpl.ORDER_BY_JPQL);
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

				list = (List<PersistedAttribute>)QueryUtil.list(
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
	 * Returns the first persisted attribute in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute
	 * @throws NoSuchPersistedAttributeException if a matching persisted attribute could not be found
	 */
	@Override
	public PersistedAttribute findByUuid_First(
			String uuid,
			OrderByComparator<PersistedAttribute> orderByComparator)
		throws NoSuchPersistedAttributeException {

		PersistedAttribute persistedAttribute = fetchByUuid_First(
			uuid, orderByComparator);

		if (persistedAttribute != null) {
			return persistedAttribute;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchPersistedAttributeException(sb.toString());
	}

	/**
	 * Returns the first persisted attribute in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute, or <code>null</code> if a matching persisted attribute could not be found
	 */
	@Override
	public PersistedAttribute fetchByUuid_First(
		String uuid, OrderByComparator<PersistedAttribute> orderByComparator) {

		List<PersistedAttribute> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last persisted attribute in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute
	 * @throws NoSuchPersistedAttributeException if a matching persisted attribute could not be found
	 */
	@Override
	public PersistedAttribute findByUuid_Last(
			String uuid,
			OrderByComparator<PersistedAttribute> orderByComparator)
		throws NoSuchPersistedAttributeException {

		PersistedAttribute persistedAttribute = fetchByUuid_Last(
			uuid, orderByComparator);

		if (persistedAttribute != null) {
			return persistedAttribute;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchPersistedAttributeException(sb.toString());
	}

	/**
	 * Returns the last persisted attribute in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute, or <code>null</code> if a matching persisted attribute could not be found
	 */
	@Override
	public PersistedAttribute fetchByUuid_Last(
		String uuid, OrderByComparator<PersistedAttribute> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<PersistedAttribute> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public PersistedAttribute[] findByUuid_PrevAndNext(
			long id, String uuid,
			OrderByComparator<PersistedAttribute> orderByComparator)
		throws NoSuchPersistedAttributeException {

		uuid = Objects.toString(uuid, "");

		PersistedAttribute persistedAttribute = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			PersistedAttribute[] array = new PersistedAttributeImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, persistedAttribute, uuid, orderByComparator, true);

			array[1] = persistedAttribute;

			array[2] = getByUuid_PrevAndNext(
				session, persistedAttribute, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected PersistedAttribute getByUuid_PrevAndNext(
		Session session, PersistedAttribute persistedAttribute, String uuid,
		OrderByComparator<PersistedAttribute> orderByComparator,
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

		sb.append(_SQL_SELECT_PERSISTEDATTRIBUTE_WHERE);

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
			sb.append(PersistedAttributeModelImpl.ORDER_BY_JPQL);
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
						persistedAttribute)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<PersistedAttribute> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the persisted attributes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (PersistedAttribute persistedAttribute :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(persistedAttribute);
		}
	}

	/**
	 * Returns the number of persisted attributes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching persisted attributes
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PERSISTEDATTRIBUTE_WHERE);

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
		"persistedAttribute.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(persistedAttribute.uuid IS NULL OR persistedAttribute.uuid = '')";

	private FinderPath _finderPathWithPaginationFindBytypeId;
	private FinderPath _finderPathWithoutPaginationFindBytypeId;
	private FinderPath _finderPathCountBytypeId;

	/**
	 * Returns all the persisted attributes where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @return the matching persisted attributes
	 */
	@Override
	public List<PersistedAttribute> findBytypeId(long typeId) {
		return findBytypeId(typeId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<PersistedAttribute> findBytypeId(
		long typeId, int start, int end) {

		return findBytypeId(typeId, start, end, null);
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
	@Override
	public List<PersistedAttribute> findBytypeId(
		long typeId, int start, int end,
		OrderByComparator<PersistedAttribute> orderByComparator) {

		return findBytypeId(typeId, start, end, orderByComparator, true);
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
	@Override
	public List<PersistedAttribute> findBytypeId(
		long typeId, int start, int end,
		OrderByComparator<PersistedAttribute> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBytypeId;
				finderArgs = new Object[] {typeId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBytypeId;
			finderArgs = new Object[] {typeId, start, end, orderByComparator};
		}

		List<PersistedAttribute> list = null;

		if (useFinderCache) {
			list = (List<PersistedAttribute>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (PersistedAttribute persistedAttribute : list) {
					if (typeId != persistedAttribute.getTypeId()) {
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

			sb.append(_SQL_SELECT_PERSISTEDATTRIBUTE_WHERE);

			sb.append(_FINDER_COLUMN_TYPEID_TYPEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PersistedAttributeModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(typeId);

				list = (List<PersistedAttribute>)QueryUtil.list(
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
	 * Returns the first persisted attribute in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute
	 * @throws NoSuchPersistedAttributeException if a matching persisted attribute could not be found
	 */
	@Override
	public PersistedAttribute findBytypeId_First(
			long typeId,
			OrderByComparator<PersistedAttribute> orderByComparator)
		throws NoSuchPersistedAttributeException {

		PersistedAttribute persistedAttribute = fetchBytypeId_First(
			typeId, orderByComparator);

		if (persistedAttribute != null) {
			return persistedAttribute;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("typeId=");
		sb.append(typeId);

		sb.append("}");

		throw new NoSuchPersistedAttributeException(sb.toString());
	}

	/**
	 * Returns the first persisted attribute in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute, or <code>null</code> if a matching persisted attribute could not be found
	 */
	@Override
	public PersistedAttribute fetchBytypeId_First(
		long typeId, OrderByComparator<PersistedAttribute> orderByComparator) {

		List<PersistedAttribute> list = findBytypeId(
			typeId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last persisted attribute in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute
	 * @throws NoSuchPersistedAttributeException if a matching persisted attribute could not be found
	 */
	@Override
	public PersistedAttribute findBytypeId_Last(
			long typeId,
			OrderByComparator<PersistedAttribute> orderByComparator)
		throws NoSuchPersistedAttributeException {

		PersistedAttribute persistedAttribute = fetchBytypeId_Last(
			typeId, orderByComparator);

		if (persistedAttribute != null) {
			return persistedAttribute;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("typeId=");
		sb.append(typeId);

		sb.append("}");

		throw new NoSuchPersistedAttributeException(sb.toString());
	}

	/**
	 * Returns the last persisted attribute in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute, or <code>null</code> if a matching persisted attribute could not be found
	 */
	@Override
	public PersistedAttribute fetchBytypeId_Last(
		long typeId, OrderByComparator<PersistedAttribute> orderByComparator) {

		int count = countBytypeId(typeId);

		if (count == 0) {
			return null;
		}

		List<PersistedAttribute> list = findBytypeId(
			typeId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public PersistedAttribute[] findBytypeId_PrevAndNext(
			long id, long typeId,
			OrderByComparator<PersistedAttribute> orderByComparator)
		throws NoSuchPersistedAttributeException {

		PersistedAttribute persistedAttribute = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			PersistedAttribute[] array = new PersistedAttributeImpl[3];

			array[0] = getBytypeId_PrevAndNext(
				session, persistedAttribute, typeId, orderByComparator, true);

			array[1] = persistedAttribute;

			array[2] = getBytypeId_PrevAndNext(
				session, persistedAttribute, typeId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected PersistedAttribute getBytypeId_PrevAndNext(
		Session session, PersistedAttribute persistedAttribute, long typeId,
		OrderByComparator<PersistedAttribute> orderByComparator,
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

		sb.append(_SQL_SELECT_PERSISTEDATTRIBUTE_WHERE);

		sb.append(_FINDER_COLUMN_TYPEID_TYPEID_2);

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
			sb.append(PersistedAttributeModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(typeId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						persistedAttribute)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<PersistedAttribute> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the persisted attributes where typeId = &#63; from the database.
	 *
	 * @param typeId the type ID
	 */
	@Override
	public void removeBytypeId(long typeId) {
		for (PersistedAttribute persistedAttribute :
				findBytypeId(
					typeId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(persistedAttribute);
		}
	}

	/**
	 * Returns the number of persisted attributes where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @return the number of matching persisted attributes
	 */
	@Override
	public int countBytypeId(long typeId) {
		FinderPath finderPath = _finderPathCountBytypeId;

		Object[] finderArgs = new Object[] {typeId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PERSISTEDATTRIBUTE_WHERE);

			sb.append(_FINDER_COLUMN_TYPEID_TYPEID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(typeId);

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

	private static final String _FINDER_COLUMN_TYPEID_TYPEID_2 =
		"persistedAttribute.typeId = ?";

	private FinderPath _finderPathWithPaginationFindByid;
	private FinderPath _finderPathWithoutPaginationFindByid;
	private FinderPath _finderPathCountByid;

	/**
	 * Returns all the persisted attributes where id = &#63;.
	 *
	 * @param id the ID
	 * @return the matching persisted attributes
	 */
	@Override
	public List<PersistedAttribute> findByid(long id) {
		return findByid(id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<PersistedAttribute> findByid(long id, int start, int end) {
		return findByid(id, start, end, null);
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
	@Override
	public List<PersistedAttribute> findByid(
		long id, int start, int end,
		OrderByComparator<PersistedAttribute> orderByComparator) {

		return findByid(id, start, end, orderByComparator, true);
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
	@Override
	public List<PersistedAttribute> findByid(
		long id, int start, int end,
		OrderByComparator<PersistedAttribute> orderByComparator,
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

		List<PersistedAttribute> list = null;

		if (useFinderCache) {
			list = (List<PersistedAttribute>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (PersistedAttribute persistedAttribute : list) {
					if (id != persistedAttribute.getId()) {
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

			sb.append(_SQL_SELECT_PERSISTEDATTRIBUTE_WHERE);

			sb.append(_FINDER_COLUMN_ID_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PersistedAttributeModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(id);

				list = (List<PersistedAttribute>)QueryUtil.list(
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
	 * Returns the first persisted attribute in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute
	 * @throws NoSuchPersistedAttributeException if a matching persisted attribute could not be found
	 */
	@Override
	public PersistedAttribute findByid_First(
			long id, OrderByComparator<PersistedAttribute> orderByComparator)
		throws NoSuchPersistedAttributeException {

		PersistedAttribute persistedAttribute = fetchByid_First(
			id, orderByComparator);

		if (persistedAttribute != null) {
			return persistedAttribute;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("id=");
		sb.append(id);

		sb.append("}");

		throw new NoSuchPersistedAttributeException(sb.toString());
	}

	/**
	 * Returns the first persisted attribute in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute, or <code>null</code> if a matching persisted attribute could not be found
	 */
	@Override
	public PersistedAttribute fetchByid_First(
		long id, OrderByComparator<PersistedAttribute> orderByComparator) {

		List<PersistedAttribute> list = findByid(id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last persisted attribute in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute
	 * @throws NoSuchPersistedAttributeException if a matching persisted attribute could not be found
	 */
	@Override
	public PersistedAttribute findByid_Last(
			long id, OrderByComparator<PersistedAttribute> orderByComparator)
		throws NoSuchPersistedAttributeException {

		PersistedAttribute persistedAttribute = fetchByid_Last(
			id, orderByComparator);

		if (persistedAttribute != null) {
			return persistedAttribute;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("id=");
		sb.append(id);

		sb.append("}");

		throw new NoSuchPersistedAttributeException(sb.toString());
	}

	/**
	 * Returns the last persisted attribute in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute, or <code>null</code> if a matching persisted attribute could not be found
	 */
	@Override
	public PersistedAttribute fetchByid_Last(
		long id, OrderByComparator<PersistedAttribute> orderByComparator) {

		int count = countByid(id);

		if (count == 0) {
			return null;
		}

		List<PersistedAttribute> list = findByid(
			id, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the persisted attributes where id = &#63; from the database.
	 *
	 * @param id the ID
	 */
	@Override
	public void removeByid(long id) {
		for (PersistedAttribute persistedAttribute :
				findByid(id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(persistedAttribute);
		}
	}

	/**
	 * Returns the number of persisted attributes where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching persisted attributes
	 */
	@Override
	public int countByid(long id) {
		FinderPath finderPath = _finderPathCountByid;

		Object[] finderArgs = new Object[] {id};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PERSISTEDATTRIBUTE_WHERE);

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
		"persistedAttribute.id = ?";

	private FinderPath _finderPathWithPaginationFindByidAndTypeId;
	private FinderPath _finderPathWithoutPaginationFindByidAndTypeId;
	private FinderPath _finderPathCountByidAndTypeId;

	/**
	 * Returns all the persisted attributes where typeId = &#63; and id = &#63;.
	 *
	 * @param typeId the type ID
	 * @param id the ID
	 * @return the matching persisted attributes
	 */
	@Override
	public List<PersistedAttribute> findByidAndTypeId(long typeId, long id) {
		return findByidAndTypeId(
			typeId, id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<PersistedAttribute> findByidAndTypeId(
		long typeId, long id, int start, int end) {

		return findByidAndTypeId(typeId, id, start, end, null);
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
	@Override
	public List<PersistedAttribute> findByidAndTypeId(
		long typeId, long id, int start, int end,
		OrderByComparator<PersistedAttribute> orderByComparator) {

		return findByidAndTypeId(
			typeId, id, start, end, orderByComparator, true);
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
	@Override
	public List<PersistedAttribute> findByidAndTypeId(
		long typeId, long id, int start, int end,
		OrderByComparator<PersistedAttribute> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByidAndTypeId;
				finderArgs = new Object[] {typeId, id};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByidAndTypeId;
			finderArgs = new Object[] {
				typeId, id, start, end, orderByComparator
			};
		}

		List<PersistedAttribute> list = null;

		if (useFinderCache) {
			list = (List<PersistedAttribute>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (PersistedAttribute persistedAttribute : list) {
					if ((typeId != persistedAttribute.getTypeId()) ||
						(id != persistedAttribute.getId())) {

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
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_PERSISTEDATTRIBUTE_WHERE);

			sb.append(_FINDER_COLUMN_IDANDTYPEID_TYPEID_2);

			sb.append(_FINDER_COLUMN_IDANDTYPEID_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PersistedAttributeModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(typeId);

				queryPos.add(id);

				list = (List<PersistedAttribute>)QueryUtil.list(
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
	 * Returns the first persisted attribute in the ordered set where typeId = &#63; and id = &#63;.
	 *
	 * @param typeId the type ID
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute
	 * @throws NoSuchPersistedAttributeException if a matching persisted attribute could not be found
	 */
	@Override
	public PersistedAttribute findByidAndTypeId_First(
			long typeId, long id,
			OrderByComparator<PersistedAttribute> orderByComparator)
		throws NoSuchPersistedAttributeException {

		PersistedAttribute persistedAttribute = fetchByidAndTypeId_First(
			typeId, id, orderByComparator);

		if (persistedAttribute != null) {
			return persistedAttribute;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("typeId=");
		sb.append(typeId);

		sb.append(", id=");
		sb.append(id);

		sb.append("}");

		throw new NoSuchPersistedAttributeException(sb.toString());
	}

	/**
	 * Returns the first persisted attribute in the ordered set where typeId = &#63; and id = &#63;.
	 *
	 * @param typeId the type ID
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted attribute, or <code>null</code> if a matching persisted attribute could not be found
	 */
	@Override
	public PersistedAttribute fetchByidAndTypeId_First(
		long typeId, long id,
		OrderByComparator<PersistedAttribute> orderByComparator) {

		List<PersistedAttribute> list = findByidAndTypeId(
			typeId, id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public PersistedAttribute findByidAndTypeId_Last(
			long typeId, long id,
			OrderByComparator<PersistedAttribute> orderByComparator)
		throws NoSuchPersistedAttributeException {

		PersistedAttribute persistedAttribute = fetchByidAndTypeId_Last(
			typeId, id, orderByComparator);

		if (persistedAttribute != null) {
			return persistedAttribute;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("typeId=");
		sb.append(typeId);

		sb.append(", id=");
		sb.append(id);

		sb.append("}");

		throw new NoSuchPersistedAttributeException(sb.toString());
	}

	/**
	 * Returns the last persisted attribute in the ordered set where typeId = &#63; and id = &#63;.
	 *
	 * @param typeId the type ID
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted attribute, or <code>null</code> if a matching persisted attribute could not be found
	 */
	@Override
	public PersistedAttribute fetchByidAndTypeId_Last(
		long typeId, long id,
		OrderByComparator<PersistedAttribute> orderByComparator) {

		int count = countByidAndTypeId(typeId, id);

		if (count == 0) {
			return null;
		}

		List<PersistedAttribute> list = findByidAndTypeId(
			typeId, id, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the persisted attributes where typeId = &#63; and id = &#63; from the database.
	 *
	 * @param typeId the type ID
	 * @param id the ID
	 */
	@Override
	public void removeByidAndTypeId(long typeId, long id) {
		for (PersistedAttribute persistedAttribute :
				findByidAndTypeId(
					typeId, id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(persistedAttribute);
		}
	}

	/**
	 * Returns the number of persisted attributes where typeId = &#63; and id = &#63;.
	 *
	 * @param typeId the type ID
	 * @param id the ID
	 * @return the number of matching persisted attributes
	 */
	@Override
	public int countByidAndTypeId(long typeId, long id) {
		FinderPath finderPath = _finderPathCountByidAndTypeId;

		Object[] finderArgs = new Object[] {typeId, id};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_PERSISTEDATTRIBUTE_WHERE);

			sb.append(_FINDER_COLUMN_IDANDTYPEID_TYPEID_2);

			sb.append(_FINDER_COLUMN_IDANDTYPEID_ID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(typeId);

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

	private static final String _FINDER_COLUMN_IDANDTYPEID_TYPEID_2 =
		"persistedAttribute.typeId = ? AND ";

	private static final String _FINDER_COLUMN_IDANDTYPEID_ID_2 =
		"persistedAttribute.id = ?";

	public PersistedAttributePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(PersistedAttribute.class);

		setModelImplClass(PersistedAttributeImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the persisted attribute in the entity cache if it is enabled.
	 *
	 * @param persistedAttribute the persisted attribute
	 */
	@Override
	public void cacheResult(PersistedAttribute persistedAttribute) {
		entityCache.putResult(
			PersistedAttributeImpl.class, persistedAttribute.getPrimaryKey(),
			persistedAttribute);

		persistedAttribute.resetOriginalValues();
	}

	/**
	 * Caches the persisted attributes in the entity cache if it is enabled.
	 *
	 * @param persistedAttributes the persisted attributes
	 */
	@Override
	public void cacheResult(List<PersistedAttribute> persistedAttributes) {
		for (PersistedAttribute persistedAttribute : persistedAttributes) {
			if (entityCache.getResult(
					PersistedAttributeImpl.class,
					persistedAttribute.getPrimaryKey()) == null) {

				cacheResult(persistedAttribute);
			}
			else {
				persistedAttribute.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all persisted attributes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PersistedAttributeImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the persisted attribute.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PersistedAttribute persistedAttribute) {
		entityCache.removeResult(
			PersistedAttributeImpl.class, persistedAttribute.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PersistedAttribute> persistedAttributes) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PersistedAttribute persistedAttribute : persistedAttributes) {
			entityCache.removeResult(
				PersistedAttributeImpl.class,
				persistedAttribute.getPrimaryKey());
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(PersistedAttributeImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new persisted attribute with the primary key. Does not add the persisted attribute to the database.
	 *
	 * @param id the primary key for the new persisted attribute
	 * @return the new persisted attribute
	 */
	@Override
	public PersistedAttribute create(long id) {
		PersistedAttribute persistedAttribute = new PersistedAttributeImpl();

		persistedAttribute.setNew(true);
		persistedAttribute.setPrimaryKey(id);

		String uuid = PortalUUIDUtil.generate();

		persistedAttribute.setUuid(uuid);

		return persistedAttribute;
	}

	/**
	 * Removes the persisted attribute with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the persisted attribute
	 * @return the persisted attribute that was removed
	 * @throws NoSuchPersistedAttributeException if a persisted attribute with the primary key could not be found
	 */
	@Override
	public PersistedAttribute remove(long id)
		throws NoSuchPersistedAttributeException {

		return remove((Serializable)id);
	}

	/**
	 * Removes the persisted attribute with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the persisted attribute
	 * @return the persisted attribute that was removed
	 * @throws NoSuchPersistedAttributeException if a persisted attribute with the primary key could not be found
	 */
	@Override
	public PersistedAttribute remove(Serializable primaryKey)
		throws NoSuchPersistedAttributeException {

		Session session = null;

		try {
			session = openSession();

			PersistedAttribute persistedAttribute =
				(PersistedAttribute)session.get(
					PersistedAttributeImpl.class, primaryKey);

			if (persistedAttribute == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPersistedAttributeException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(persistedAttribute);
		}
		catch (NoSuchPersistedAttributeException noSuchEntityException) {
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
	protected PersistedAttribute removeImpl(
		PersistedAttribute persistedAttribute) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(persistedAttribute)) {
				persistedAttribute = (PersistedAttribute)session.get(
					PersistedAttributeImpl.class,
					persistedAttribute.getPrimaryKeyObj());
			}

			if (persistedAttribute != null) {
				session.delete(persistedAttribute);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (persistedAttribute != null) {
			clearCache(persistedAttribute);
		}

		return persistedAttribute;
	}

	@Override
	public PersistedAttribute updateImpl(
		PersistedAttribute persistedAttribute) {

		boolean isNew = persistedAttribute.isNew();

		if (!(persistedAttribute instanceof PersistedAttributeModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(persistedAttribute.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					persistedAttribute);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in persistedAttribute proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom PersistedAttribute implementation " +
					persistedAttribute.getClass());
		}

		PersistedAttributeModelImpl persistedAttributeModelImpl =
			(PersistedAttributeModelImpl)persistedAttribute;

		if (Validator.isNull(persistedAttribute.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			persistedAttribute.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (persistedAttribute.isNew()) {
				session.save(persistedAttribute);

				persistedAttribute.setNew(false);
			}
			else {
				persistedAttribute = (PersistedAttribute)session.merge(
					persistedAttribute);
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
				persistedAttributeModelImpl.getUuid()
			};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {persistedAttributeModelImpl.getTypeId()};

			finderCache.removeResult(_finderPathCountBytypeId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindBytypeId, args);

			args = new Object[] {persistedAttributeModelImpl.getId()};

			finderCache.removeResult(_finderPathCountByid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByid, args);

			args = new Object[] {
				persistedAttributeModelImpl.getTypeId(),
				persistedAttributeModelImpl.getId()
			};

			finderCache.removeResult(_finderPathCountByidAndTypeId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByidAndTypeId, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((persistedAttributeModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					persistedAttributeModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {persistedAttributeModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((persistedAttributeModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindBytypeId.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					persistedAttributeModelImpl.getOriginalTypeId()
				};

				finderCache.removeResult(_finderPathCountBytypeId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindBytypeId, args);

				args = new Object[] {persistedAttributeModelImpl.getTypeId()};

				finderCache.removeResult(_finderPathCountBytypeId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindBytypeId, args);
			}

			if ((persistedAttributeModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					persistedAttributeModelImpl.getOriginalId()
				};

				finderCache.removeResult(_finderPathCountByid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByid, args);

				args = new Object[] {persistedAttributeModelImpl.getId()};

				finderCache.removeResult(_finderPathCountByid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByid, args);
			}

			if ((persistedAttributeModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByidAndTypeId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					persistedAttributeModelImpl.getOriginalTypeId(),
					persistedAttributeModelImpl.getOriginalId()
				};

				finderCache.removeResult(_finderPathCountByidAndTypeId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByidAndTypeId, args);

				args = new Object[] {
					persistedAttributeModelImpl.getTypeId(),
					persistedAttributeModelImpl.getId()
				};

				finderCache.removeResult(_finderPathCountByidAndTypeId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByidAndTypeId, args);
			}
		}

		entityCache.putResult(
			PersistedAttributeImpl.class, persistedAttribute.getPrimaryKey(),
			persistedAttribute, false);

		persistedAttribute.resetOriginalValues();

		return persistedAttribute;
	}

	/**
	 * Returns the persisted attribute with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the persisted attribute
	 * @return the persisted attribute
	 * @throws NoSuchPersistedAttributeException if a persisted attribute with the primary key could not be found
	 */
	@Override
	public PersistedAttribute findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPersistedAttributeException {

		PersistedAttribute persistedAttribute = fetchByPrimaryKey(primaryKey);

		if (persistedAttribute == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPersistedAttributeException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return persistedAttribute;
	}

	/**
	 * Returns the persisted attribute with the primary key or throws a <code>NoSuchPersistedAttributeException</code> if it could not be found.
	 *
	 * @param id the primary key of the persisted attribute
	 * @return the persisted attribute
	 * @throws NoSuchPersistedAttributeException if a persisted attribute with the primary key could not be found
	 */
	@Override
	public PersistedAttribute findByPrimaryKey(long id)
		throws NoSuchPersistedAttributeException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the persisted attribute with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the persisted attribute
	 * @return the persisted attribute, or <code>null</code> if a persisted attribute with the primary key could not be found
	 */
	@Override
	public PersistedAttribute fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the persisted attributes.
	 *
	 * @return the persisted attributes
	 */
	@Override
	public List<PersistedAttribute> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<PersistedAttribute> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<PersistedAttribute> findAll(
		int start, int end,
		OrderByComparator<PersistedAttribute> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<PersistedAttribute> findAll(
		int start, int end,
		OrderByComparator<PersistedAttribute> orderByComparator,
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

		List<PersistedAttribute> list = null;

		if (useFinderCache) {
			list = (List<PersistedAttribute>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PERSISTEDATTRIBUTE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PERSISTEDATTRIBUTE;

				sql = sql.concat(PersistedAttributeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<PersistedAttribute>)QueryUtil.list(
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
	 * Removes all the persisted attributes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PersistedAttribute persistedAttribute : findAll()) {
			remove(persistedAttribute);
		}
	}

	/**
	 * Returns the number of persisted attributes.
	 *
	 * @return the number of persisted attributes
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
					_SQL_COUNT_PERSISTEDATTRIBUTE);

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
		return _SQL_SELECT_PERSISTEDATTRIBUTE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PersistedAttributeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the persisted attribute persistence.
	 */
	@Activate
	public void activate() {
		_finderPathWithPaginationFindAll = new FinderPath(
			PersistedAttributeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			PersistedAttributeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			PersistedAttributeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			PersistedAttributeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			PersistedAttributeModelImpl.UUID_COLUMN_BITMASK |
			PersistedAttributeModelImpl.TYPEID_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByUuid", new String[] {String.class.getName()});

		_finderPathWithPaginationFindBytypeId = new FinderPath(
			PersistedAttributeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBytypeId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindBytypeId = new FinderPath(
			PersistedAttributeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBytypeId",
			new String[] {Long.class.getName()},
			PersistedAttributeModelImpl.TYPEID_COLUMN_BITMASK);

		_finderPathCountBytypeId = new FinderPath(
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBytypeId", new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByid = new FinderPath(
			PersistedAttributeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByid",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByid = new FinderPath(
			PersistedAttributeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByid",
			new String[] {Long.class.getName()},
			PersistedAttributeModelImpl.ID_COLUMN_BITMASK |
			PersistedAttributeModelImpl.TYPEID_COLUMN_BITMASK);

		_finderPathCountByid = new FinderPath(
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByid",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByidAndTypeId = new FinderPath(
			PersistedAttributeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByidAndTypeId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByidAndTypeId = new FinderPath(
			PersistedAttributeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByidAndTypeId",
			new String[] {Long.class.getName(), Long.class.getName()},
			PersistedAttributeModelImpl.TYPEID_COLUMN_BITMASK |
			PersistedAttributeModelImpl.ID_COLUMN_BITMASK);

		_finderPathCountByidAndTypeId = new FinderPath(
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByidAndTypeId",
			new String[] {Long.class.getName(), Long.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(PersistedAttributeImpl.class.getName());
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

	private static final String _SQL_SELECT_PERSISTEDATTRIBUTE =
		"SELECT persistedAttribute FROM PersistedAttribute persistedAttribute";

	private static final String _SQL_SELECT_PERSISTEDATTRIBUTE_WHERE =
		"SELECT persistedAttribute FROM PersistedAttribute persistedAttribute WHERE ";

	private static final String _SQL_COUNT_PERSISTEDATTRIBUTE =
		"SELECT COUNT(persistedAttribute) FROM PersistedAttribute persistedAttribute";

	private static final String _SQL_COUNT_PERSISTEDATTRIBUTE_WHERE =
		"SELECT COUNT(persistedAttribute) FROM PersistedAttribute persistedAttribute WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "persistedAttribute.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PersistedAttribute exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No PersistedAttribute exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PersistedAttributePersistenceImpl.class);

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