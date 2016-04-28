/*
 *
 * Copyright (c) 2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 *
 */

package com.amazonaws.util.json;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.http.JsonErrorResponseHandlerV2;
import com.amazonaws.http.JsonResponseHandler;
import com.amazonaws.transform.JsonErrorUnmarshallerV2;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.BigDecimalJsonUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.BigIntegerJsonUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.ByteBufferJsonUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.ByteJsonUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.CharacterJsonUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.DoubleJsonUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.ShortJsonUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.ImmutableMapParameter;
import com.fasterxml.jackson.core.JsonFactory;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Creates generators and protocol handlers for plain text JSON wire format.
 */
@SdkInternalApi
class SdkStructuredPlainJsonFactory implements SdkStructuredJsonFactory {

    /**
     * Recommended to share JsonFactory instances per http://wiki.fasterxml
     * .com/JacksonBestPracticesPerformance
     */
    // TODO Make private in 1.11
    public static final JsonFactory JSON_FACTORY = new JsonFactory();

    private static final String CONTENT_TYPE_JSON_PREFIX = "application/x-amz-json-";

    // TODO Make private in 1.11
    public static final Map<Class<?>, Unmarshaller<?, JsonUnmarshallerContext>> JSON_SCALAR_UNMARSHALLERS = new ImmutableMapParameter.Builder<Class<?>, Unmarshaller<?, JsonUnmarshallerContext>>()
            .put(String.class, StringJsonUnmarshaller.getInstance())
            .put(Double.class, DoubleJsonUnmarshaller.getInstance())
            .put(Integer.class, IntegerJsonUnmarshaller.getInstance())
            .put(BigInteger.class, BigIntegerJsonUnmarshaller.getInstance())
            .put(BigDecimal.class, BigDecimalJsonUnmarshaller.getInstance())
            .put(Boolean.class, BooleanJsonUnmarshaller.getInstance())
            .put(Float.class, FloatJsonUnmarshaller.getInstance())
            .put(Long.class, LongJsonUnmarshaller.getInstance())
            .put(Byte.class, ByteJsonUnmarshaller.getInstance())
            .put(Date.class, DateJsonUnmarshaller.getInstance())
            .put(ByteBuffer.class, ByteBufferJsonUnmarshaller.getInstance())
            .put(Character.class, CharacterJsonUnmarshaller.getInstance())
            .put(Short.class, ShortJsonUnmarshaller.getInstance()).build();

    /**
     * Returns the {@link StructuredJsonGenerator} to be used for marshalling the request.
     *
     * @param protocolVersion AWS JSON/CBOR protocol version.
     */
    public StructuredJsonGenerator createWriter(final String protocolVersion) {

        return new SdkJsonGenerator(JSON_FACTORY, CONTENT_TYPE_JSON_PREFIX + protocolVersion);
    }

    /**
     * Returns the response handler to be used for handling a successfull response.
     *
     * @param responseUnmarshaller response unmarshaller to unmarshall the specific response
     *                             object.
     */
    public JsonResponseHandler createResponseHandler(
            final Unmarshaller<?, JsonUnmarshallerContext> responseUnmarshaller) {

        return new JsonResponseHandler(responseUnmarshaller, JSON_SCALAR_UNMARSHALLERS,
                                       JSON_FACTORY);
    }

    /**
     * Returns the error response handler for handling a error response.
     *
     * @param errorUnmarshallers response unmarshallers to unamrshall the error responses.
     */
    public JsonErrorResponseHandlerV2 createErrorResponseHandler(
            final List<JsonErrorUnmarshallerV2> errorUnmarshallers) {
        return new JsonErrorResponseHandlerV2(errorUnmarshallers, JSON_FACTORY);
    }
}
