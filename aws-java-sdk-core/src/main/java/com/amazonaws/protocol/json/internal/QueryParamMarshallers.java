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
import com.amazonaws.protocol.MarshallLocation;

import com.amazonaws.protocol.MarshallingInfo;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.TimestampFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@SdkInternalApi
public class QueryParamMarshallers {

    public static final JsonMarshaller<String> STRING = new SimpleQueryParamMarshaller<String>(
            ValueToStringConverters.FROM_STRING);

    public static final JsonMarshaller<Integer> INTEGER = new SimpleQueryParamMarshaller<Integer>(
            ValueToStringConverters.FROM_INTEGER);

    public static final JsonMarshaller<Long> LONG = new SimpleQueryParamMarshaller<Long>(ValueToStringConverters.FROM_LONG);

    public static final JsonMarshaller<Short> SHORT = new SimpleQueryParamMarshaller<Short>(ValueToStringConverters.FROM_SHORT);

    public static final JsonMarshaller<Double> DOUBLE = new SimpleQueryParamMarshaller<Double>(
            ValueToStringConverters.FROM_DOUBLE);

    public static final JsonMarshaller<Float> FLOAT = new SimpleQueryParamMarshaller<Float>(
            ValueToStringConverters.FROM_FLOAT);

    public static final JsonMarshaller<Boolean> BOOLEAN = new SimpleQueryParamMarshaller<Boolean>(
            ValueToStringConverters.FROM_BOOLEAN);

    public static final JsonMarshaller<Date> DATE = new SimpleQueryParamMarshaller<Date>(ValueToStringConverters.FROM_DATE) {
        @Override
        public void marshall(Date val, JsonMarshallerContext context, MarshallingInfo<Date> marshallingInfo) {
            TimestampFormat timestampFormat = marshallingInfo.timestampFormat();
            context.request().addParameter(marshallingInfo.marshallLocationName(), StringUtils.fromDate(val, timestampFormat.getFormat()));
        }
    };

    public static final JsonMarshaller<List> LIST = new JsonMarshaller<List>() {
        @Override
        public void marshall(List list, JsonMarshallerContext context, MarshallingInfo<List> marshallingInfo) {
            for (Object listVal : list) {
                context.marshall(MarshallLocation.QUERY_PARAM, listVal, marshallingInfo);
            }
        }
    };

    public static final JsonMarshaller<Map> MAP = new JsonMarshaller<Map>() {

        @Override
        public void marshall(Map val, JsonMarshallerContext context, MarshallingInfo<Map> mapMarshallingInfo) {
            for (Map.Entry<String, ?> mapEntry : ((Map<String, ?>) val).entrySet()) {
                context.marshall(MarshallLocation.QUERY_PARAM, mapEntry.getValue(), mapEntry.getKey());
            }
        }
    };

    private static class SimpleQueryParamMarshaller<T> implements JsonMarshaller<T> {

        private final ValueToStringConverters.ValueToString<T> converter;

        private SimpleQueryParamMarshaller(ValueToStringConverters.ValueToString<T> converter) {
            this.converter = converter;
        }

        @Override
        public void marshall(T val, JsonMarshallerContext context, MarshallingInfo<T> marshallingInfo) {
            context.request().addParameter(marshallingInfo.marshallLocationName(), converter.convert(val));
        }
    }
}
