package com.pds.headless.internal.entity.v1_0;

import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.odata.entity.EntityField;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.odata.entity.StringEntityField;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AttributeEntityModel implements EntityModel {

    public AttributeEntityModel() {
        _entityFieldsMap = Stream.of(
                new StringEntityField("name",
                        locale -> Field.getSortableFieldName("name"))
        ).collect(
                Collectors.toMap(EntityField::getName, Function.identity())
        );
    }

    @Override
    public Map<String, EntityField> getEntityFieldsMap() {
        return _entityFieldsMap;
    }

    private final Map<String, EntityField> _entityFieldsMap;

}
