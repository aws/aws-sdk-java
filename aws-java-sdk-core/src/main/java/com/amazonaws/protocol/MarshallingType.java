/*
 * Copyright 2011-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * Used when a value is null (and thus type can't be determined).
     */
    MarshallingType<Void> NULL = new MarshallingType<Void>() {
        @Override
        public Class<Void> getTargetClass() {
            return Void.class;
        }
    };

    MarshallingType<String> STRING = new MarshallingType<String>() {
        @Override
        public Class<String> getTargetClass() {
            return String.class;
        }
    };

    MarshallingType<Integer> INTEGER = new MarshallingType<Integer>() {
        @Override
        public Class<Integer> getTargetClass() {
            return Integer.class;
        }
    };

    MarshallingType<Long> LONG = new MarshallingType<Long>() {
        @Override
        public Class<Long> getTargetClass() {
            return Long.class;
        }
    };

    MarshallingType<Float> FLOAT = new MarshallingType<Float>() {
        @Override
        public Class<Float> getTargetClass() {
            return Float.class;
        }
    };

    MarshallingType<Double> DOUBLE = new MarshallingType<Double>() {
        @Override
        public Class<Double> getTargetClass() {
            return Double.class;
        }
    };

    MarshallingType<BigDecimal> BIG_DECIMAL = new MarshallingType<BigDecimal>() {
        @Override
        public Class<BigDecimal> getTargetClass() {
            return BigDecimal.class;
        }
    };

    MarshallingType<Boolean> BOOLEAN = new MarshallingType<Boolean>() {
        @Override
        public Class<Boolean> getTargetClass() {
            return Boolean.class;
        }
    };

    MarshallingType<Date> DATE = new MarshallingType<Date>() {
        @Override
        public Class<Date> getTargetClass() {
            return Date.class;
        }
    };

    MarshallingType<ByteBuffer> BYTE_BUFFER = new MarshallingType<ByteBuffer>() {
        @Override
        public Class<ByteBuffer> getTargetClass() {
            return ByteBuffer.class;
        }
    };

    MarshallingType<InputStream> STREAM = new MarshallingType<InputStream>() {
        @Override
        public Class<InputStream> getTargetClass() {
            return InputStream.class;
        }
    };

    MarshallingType<StructuredPojo> STRUCTURED = new MarshallingType<StructuredPojo>() {
        @Override
        public Class<StructuredPojo> getTargetClass() {
            return StructuredPojo.class;
        }
    };

    MarshallingType<List> LIST = new MarshallingType<List>() {
        @Override
        public Class<List> getTargetClass() {
            return List.class;
        }
    };

    MarshallingType<Map> MAP = new MarshallingType<Map>() {
        @Override
        public Class<Map> getTargetClass() {
            return Map.class;
        }
    };

    Class<T> getTargetClass();

}
