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
package com.amazonaws.protocol.json.internal;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.util.Base64;
import com.amazonaws.util.StringUtils;
import java.nio.charset.Charset;
import java.util.Date;

/**
 * Converts various types to Strings. Used for Query Param/Header/Path marshalling.
 */
@SdkInternalApi
public class ValueToStringConverters {

    /**
     * Simple interface to convert a type to a String.
     *
     * @param <T> Type to convert.
     */
    public interface ValueToString<T> {
        String convert(T val);
    }

    /**
     * Identity converter.
     */
    public static final ValueToString<String> FROM_STRING = new ValueToString<String>() {
        @Override
        public String convert(String val) {
            return val;
        }
    };

    public static final ValueToString<Integer> FROM_INTEGER = new ValueToString<Integer>() {
        @Override
        public String convert(Integer val) {
            return StringUtils.fromInteger(val);
        }
    };

    public static final ValueToString<Long> FROM_LONG = new ValueToString<Long>() {
        @Override
        public String convert(Long val) {
            return StringUtils.fromLong(val);
        }
    };

    public static final ValueToString<Short> FROM_SHORT = new ValueToString<Short>() {
        @Override
        public String convert(Short val) {
            return StringUtils.fromShort(val);
        }
    };


    public static final ValueToString<Float> FROM_FLOAT = new ValueToString<Float>() {
        @Override
        public String convert(Float val) {
            return StringUtils.fromFloat(val);
        }
    };

    public static final ValueToString<Double> FROM_DOUBLE = new ValueToString<Double>() {
        @Override
        public String convert(Double val) {
            return StringUtils.fromDouble(val);
        }
    };

    /**
     * Marshalls boolean as a literal 'true' or 'false' string.
     */
    public static final ValueToString<Boolean> FROM_BOOLEAN = new ValueToString<Boolean>() {
        @Override
        public String convert(Boolean val) {
            return StringUtils.fromBoolean(val);
        }
    };

    /**
     * Marshalls date to an ISO8601 date string.
     */
    public static final ValueToString<Date> FROM_DATE = new ValueToString<Date>() {
        @Override
        public String convert(Date val) {
            return StringUtils.fromDate(val);
        }
    };

    /**
     * Converter for JSON value headers. JSON value headers are base-64 encoded.
     */
    public static final ValueToString<String> FROM_JSON_VALUE_HEADER = new ValueToString<String>() {
        @Override
        public String convert(String val) {
            return Base64.encodeAsString(val.getBytes(Charset.forName("utf-8")));
        }
    };
}
