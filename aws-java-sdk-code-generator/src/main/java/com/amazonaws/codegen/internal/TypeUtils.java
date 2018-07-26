/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.codegen.internal;

import com.amazonaws.codegen.model.config.customization.CustomizationConfig;
import com.amazonaws.codegen.model.service.Shape;
import com.amazonaws.codegen.naming.NamingStrategy;
import com.amazonaws.internal.SdkInternalList;
import com.amazonaws.internal.SdkInternalMap;

import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.amazonaws.codegen.model.service.ShapeTypes.List;
import static com.amazonaws.codegen.model.service.ShapeTypes.Map;
import static com.amazonaws.codegen.model.service.ShapeTypes.Structure;

/**
 * Used to determine the Java types for the service model.
 */
public class TypeUtils {

    public static final String LIST_INTERFACE = "listInterface";

    public static final String LIST_DEFAULT_IMPL = "listDefaultImpl";

    public static final String LIST_AUTO_CONSTRUCT_IMPL = "listAutoConstructImpl";

    public static final String MAP_INTERFACE = "mapInterface";

    public static final String MAP_DEFAULT_IMPL = "mapDefaultImpl";

    public static final String MAP_AUTO_CONSTRUCT_IMPL = "mapAutoConstructImpl";

    private final static Map<String, String> dataTypeMappings = new HashMap<>();

    private final static Map<String, String> marshallingTypeMappings = new HashMap<>();

    static {
        dataTypeMappings.put("string", String.class.getSimpleName());
        dataTypeMappings.put("boolean", Boolean.class.getSimpleName());
        dataTypeMappings.put("int", Integer.class.getSimpleName());
        dataTypeMappings.put("any", Object.class.getSimpleName());
        dataTypeMappings.put("integer", Integer.class.getSimpleName());
        dataTypeMappings.put("double", Double.class.getSimpleName());
        dataTypeMappings.put("short", Short.class.getSimpleName());
        dataTypeMappings.put("long", Long.class.getSimpleName());
        dataTypeMappings.put("float", Float.class.getSimpleName());
        dataTypeMappings.put("byte", Byte.class.getSimpleName());
        dataTypeMappings.put("timestamp", Date.class.getName());
        dataTypeMappings.put("blob", ByteBuffer.class.getName());
        dataTypeMappings.put("stream", InputStream.class.getName());
        dataTypeMappings.put("bigdecimal", BigDecimal.class.getName());
        dataTypeMappings.put("biginteger", BigInteger.class.getName());
        dataTypeMappings.put("list", List.class.getSimpleName());
        dataTypeMappings.put("map", Map.class.getSimpleName());
        dataTypeMappings.put(LIST_INTERFACE, List.class.getName());
        dataTypeMappings.put(LIST_DEFAULT_IMPL, ArrayList.class.getName());
        dataTypeMappings.put(LIST_AUTO_CONSTRUCT_IMPL, SdkInternalList.class.getName());
        dataTypeMappings.put(MAP_INTERFACE, Map.class.getName());
        dataTypeMappings.put(MAP_DEFAULT_IMPL, HashMap.class.getName());
        dataTypeMappings.put(MAP_AUTO_CONSTRUCT_IMPL, SdkInternalMap.class.getName());
        dataTypeMappings.put(LIST_INTERFACE, List.class.getName());
        dataTypeMappings.put(LIST_DEFAULT_IMPL, ArrayList.class.getName());
        dataTypeMappings.put(LIST_AUTO_CONSTRUCT_IMPL, SdkInternalList.class.getName());
        dataTypeMappings.put(MAP_INTERFACE, Map.class.getName());
        dataTypeMappings.put(MAP_DEFAULT_IMPL, HashMap.class.getName());
        dataTypeMappings.put(MAP_AUTO_CONSTRUCT_IMPL, SdkInternalMap.class.getName());

        marshallingTypeMappings.put("String", "STRING");
        marshallingTypeMappings.put("Integer", "INTEGER");
        marshallingTypeMappings.put("Long", "LONG");
        marshallingTypeMappings.put("Float", "FLOAT");
        marshallingTypeMappings.put("Double", "DOUBLE");
        marshallingTypeMappings.put("Date", "DATE");
        marshallingTypeMappings.put("ByteBuffer", "BYTE_BUFFER");
        marshallingTypeMappings.put("Boolean", "BOOLEAN");
        marshallingTypeMappings.put("BigDecimal", "BIG_DECIMAL");
        marshallingTypeMappings.put("InputStream", "STREAM");
        marshallingTypeMappings.put("Short", "SHORT");
        marshallingTypeMappings.put(null, "NULL");
    }

    private final NamingStrategy namingStrategy;

    public TypeUtils(NamingStrategy namingStrategy) {
        this.namingStrategy = namingStrategy;
    }

    public static String getMarshallingType(String simpleType) {
        return marshallingTypeMappings.get(simpleType);
    }

    public static boolean isSimple(String type) {
        return dataTypeMappings.containsKey(type) || dataTypeMappings.containsValue(type);
    }

    public static String getDataTypeMapping(String type) {
        return dataTypeMappings.get(type);
    }

    /**
     * Returns the default Java type of the specified shape.
     */
    public String getJavaDataType(Map<String, Shape> shapes, String shapeName) {
        return getJavaDataType(shapes, shapeName, null);
    }

    /**
     * Returns the Java type of the specified shape with potential customization (such as
     * auto-construct list or map).
     */
    public String getJavaDataType(Map<String, Shape> shapes, String shapeName,
                                  CustomizationConfig customConfig) {

        if (shapeName == null || shapeName.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Cannot derive shape type. Shape name cannot be null or empty");
        }

        final Shape shape = shapes.get(shapeName);

        if (shape == null) {
            throw new IllegalArgumentException(
                    "Cannot derive shape type. No shape information available for " + shapeName);
        }

        final String shapeType = shape.getType();

        if (Structure.getName().equals(shapeType)) {
            return namingStrategy.getJavaClassName(shapeName);
        } else if (List.getName().equals(shapeType)) {
            String listType =
                    customConfig != null && customConfig.isUseAutoConstructList() ? LIST_AUTO_CONSTRUCT_IMPL : LIST_INTERFACE;
            final String listContainerType = dataTypeMappings.get(listType);
            return listContainerType + "<" +
                   getJavaDataType(shapes, shape.getListMember().getShape()) + ">";
        } else if (Map.getName().equals(shapeType)) {
            String mapType =
                    customConfig != null && customConfig.isUseAutoConstructMap() ? MAP_AUTO_CONSTRUCT_IMPL : MAP_INTERFACE;
            final String mapContainerType = dataTypeMappings.get(mapType);
            return mapContainerType + "<" +
                   getJavaDataType(shapes, shape.getMapKeyType().getShape()) + "," +
                   getJavaDataType(shapes, shape.getMapValueType().getShape()) + ">";
        } else {

            if (shape.isStreaming()) {
                return dataTypeMappings.get("stream");
            }

            // scalar type.
            final String dataType = dataTypeMappings.get(shapeType);
            if (dataType == null) {
                throw new RuntimeException(
                        "Equivalent Java data type cannot be found for data type : " + shapeType);
            }
            return dataType;
        }
    }
}
