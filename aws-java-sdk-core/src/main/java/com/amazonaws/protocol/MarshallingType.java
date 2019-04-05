/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.protocol;

import com.amazonaws.annotation.SdkProtectedApi;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Represents the various types supported for marshalling.
 *
 * @param <T> Java type bound to the marshalling type.
 */
@SdkProtectedApi
public interface MarshallingType<T> {
    /**
     * Determine whether this marshalling type is the default marshaller for the provided class. This is used to automatically
     * determine the marshaller to be used in the contents of lists or maps.
     */
    boolean isDefaultMarshallerForType(Class<?> type);

    /**
     * Used when a value is null (and thus type can't be determined).
     */
    MarshallingType<Void> NULL = new DefaultMarshallingType<Void>(Void.class);

    MarshallingType<String> STRING = new DefaultMarshallingType<String>(String.class);

    MarshallingType<Integer> INTEGER = new DefaultMarshallingType<Integer>(Integer.class);

    MarshallingType<Long> LONG = new DefaultMarshallingType<Long>(Long.class);

    MarshallingType<Short> SHORT = new DefaultMarshallingType<Short>(Short.class);

    MarshallingType<Float> FLOAT = new DefaultMarshallingType<Float>(Float.class);

    MarshallingType<Double> DOUBLE = new DefaultMarshallingType<Double>(Double.class);

    MarshallingType<BigDecimal> BIG_DECIMAL = new DefaultMarshallingType<BigDecimal>(BigDecimal.class);

    MarshallingType<Boolean> BOOLEAN = new DefaultMarshallingType<Boolean>(Boolean.class);

    MarshallingType<Date> DATE = new DefaultMarshallingType<Date>(Date.class);

    MarshallingType<ByteBuffer> BYTE_BUFFER = new DefaultMarshallingType<ByteBuffer>(ByteBuffer.class);

    MarshallingType<InputStream> STREAM = new DefaultMarshallingType<InputStream>(InputStream.class);

    MarshallingType<StructuredPojo> STRUCTURED = new DefaultMarshallingType<StructuredPojo>(StructuredPojo.class);

    MarshallingType<List> LIST = new DefaultMarshallingType<List>(List.class);

    MarshallingType<Map> MAP = new DefaultMarshallingType<Map>(Map.class);

    /**
     * A serializer for strings that should be base-64 encoded when they are sent to AWS.
     */
    MarshallingType<String> JSON_VALUE = new MarshallingType<String>() {
        @Override
        public boolean isDefaultMarshallerForType(Class<?> type) {
            return false;
        }
    };

}
