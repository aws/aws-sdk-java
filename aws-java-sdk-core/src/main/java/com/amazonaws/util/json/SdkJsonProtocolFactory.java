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

import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.annotation.SdkProtectedApi;
import com.amazonaws.http.JsonErrorResponseHandlerV2;
import com.amazonaws.http.JsonResponseHandler;
import com.amazonaws.transform.JsonErrorUnmarshallerV2;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeCborUnmarshallers.BigDecimalCborUnmarshaller;
import com.amazonaws.transform.SimpleTypeCborUnmarshallers.BigIntegerCborUnmarshaller;
import com.amazonaws.transform.SimpleTypeCborUnmarshallers.BooleanCborUnmarshaller;
import com.amazonaws.transform.SimpleTypeCborUnmarshallers.ByteBufferCborUnmarshaller;
import com.amazonaws.transform.SimpleTypeCborUnmarshallers.ByteCborUnmarshaller;
import com.amazonaws.transform.SimpleTypeCborUnmarshallers.DateCborUnmarshaller;
import com.amazonaws.transform.SimpleTypeCborUnmarshallers.DoubleCborUnmarshaller;
import com.amazonaws.transform.SimpleTypeCborUnmarshallers.FloatCborUnmarshaller;
import com.amazonaws.transform.SimpleTypeCborUnmarshallers.IntegerCborUnmarshaller;
import com.amazonaws.transform.SimpleTypeCborUnmarshallers.LongCborUnmarshaller;
import com.amazonaws.transform.SimpleTypeCborUnmarshallers.ShortCborUnmarshaller;
import com.amazonaws.transform.SimpleTypeCborUnmarshallers.StringCborUnmarshaller;
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
import com.fasterxml.jackson.dataformat.cbor.CBORFactory;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Factory to generate the {@link SdkJsonGenerator} or {@link SdkCborGenerator} depending on the
 * wire protocol to be used for communicating with the AWS service.
 */

@SdkProtectedApi
public class SdkJsonProtocolFactory {

    /**
     * Recommended to share JsonFactory instances per http://wiki.fasterxml
     * .com/JacksonBestPracticesPerformance
     */
    private static final JsonFactory JSON_FACTORY = new JsonFactory();
    @Deprecated
    public static final JsonFactory DEFAULT_FACTORY = JSON_FACTORY;
    private static final JsonFactory CBOR_FACTORY = new CBORFactory();
    /**
     * The default AWS JSON protocol version to be used.
     */
    private static final String DEFAULT_JSON_VERSION = "1.0";

    private static final String CONTENT_TYPE_JSON_PREFIX =
            "application/x-amz-json-";
    @Deprecated
    public static final String DEFAULT_CONTENT_TYPE =
            CONTENT_TYPE_JSON_PREFIX + DEFAULT_JSON_VERSION;
    private static final String CONTENT_TYPE_CBOR_PREFIX =
            "application/x-amz-cbor-";
    /**
     * json unmarshallers for scalar types.
     */
    private static final Map<Class<?>, Unmarshaller<?,
            JsonUnmarshallerContext>> JSON_SCALAR_UNMARSHALLERS = new ImmutableMapParameter
            .Builder<Class<?>, Unmarshaller<?,
            JsonUnmarshallerContext>>().put(String.class,
            StringJsonUnmarshaller.getInstance()).put(Double.class,
            DoubleJsonUnmarshaller.getInstance()).put(Integer.class,
            IntegerJsonUnmarshaller.getInstance()).put(BigInteger.class,
            BigIntegerJsonUnmarshaller
                    .getInstance()).put(BigDecimal.class,
            BigDecimalJsonUnmarshaller
                    .getInstance()).put(Boolean.class, BooleanJsonUnmarshaller
            .getInstance()).put(Float.class, FloatJsonUnmarshaller
            .getInstance()).put(Long.class, LongJsonUnmarshaller
            .getInstance())
            .put(Byte.class, ByteJsonUnmarshaller.getInstance())
            .put(Date.class, DateJsonUnmarshaller.getInstance())
            .put(ByteBuffer.class, ByteBufferJsonUnmarshaller
                    .getInstance())
            .put(Character.class, CharacterJsonUnmarshaller.getInstance
                    ())
            .put(Short.class, ShortJsonUnmarshaller.getInstance()).build();
    @Deprecated
    public static final Map<Class<?>, Unmarshaller<?,
            JsonUnmarshallerContext>> DEFAULT_SCALAR_UNMARSHALLERS = JSON_SCALAR_UNMARSHALLERS;
    /**
     * cbor unmarshallers for scalar types.
     */
    private static final Map<Class<?>, Unmarshaller<?,
            JsonUnmarshallerContext>> CBOR_SCALAR_UNMARSHALLERS = new ImmutableMapParameter
            .Builder<Class<?>, Unmarshaller<?,
            JsonUnmarshallerContext>>()
            .put(String.class, StringCborUnmarshaller.getInstance())
            .put(Double.class, DoubleCborUnmarshaller.getInstance())
            .put(Integer.class, IntegerCborUnmarshaller.getInstance())
            .put(BigInteger.class, BigIntegerCborUnmarshaller
                    .getInstance())
            .put(BigDecimal.class, BigDecimalCborUnmarshaller
                    .getInstance())
            .put(Boolean.class, BooleanCborUnmarshaller.getInstance())
            .put(Float.class, FloatCborUnmarshaller.getInstance())
            .put(Long.class, LongCborUnmarshaller.getInstance())
            .put(Byte.class, ByteCborUnmarshaller.getInstance())
            .put(Date.class, DateCborUnmarshaller.getInstance())
            .put(ByteBuffer.class, ByteBufferCborUnmarshaller
                    .getInstance())
            .put(Short.class, ShortCborUnmarshaller.getInstance()).build();

    private static boolean isCborEnabled(boolean supportsCbor) {
        return supportsCbor && !SDKGlobalConfiguration.isCborDisabled();
    }

    /**
     * Returns the {@link SdkJsonGenerator} to be used for marshalling the request.
     *
     * @param supportsCbor     true if cbor protocol is used; false otherwise
     * @param protocolVersion AWS JSON/CBOR protocol version.
     */
    public static StructuredJsonGenerator createWriter(final boolean supportsCbor,
                                                       final String protocolVersion) {

        return isCborEnabled(supportsCbor)
                ? new SdkCborGenerator(CBOR_FACTORY, CONTENT_TYPE_CBOR_PREFIX +
                protocolVersion)
                : new SdkJsonGenerator(JSON_FACTORY, CONTENT_TYPE_JSON_PREFIX +
                protocolVersion);
    }

    /**
     * Returns the response handler to be used for handling a successfull response.
     *
     * @param responseUnmarshaller response unmarshaller to unmarshall the specific response
     *                             object.
     * @param supportsCbor                 true if cbor protocol is used; false otherwise
     */
    public static JsonResponseHandler createResponseHandler(final Unmarshaller<?,
            JsonUnmarshallerContext> responseUnmarshaller, final boolean supportsCbor) {

        return isCborEnabled(supportsCbor)
                ? new JsonResponseHandler(responseUnmarshaller, CBOR_SCALAR_UNMARSHALLERS,
                CBOR_FACTORY)
                : new JsonResponseHandler(responseUnmarshaller,
                JSON_SCALAR_UNMARSHALLERS, JSON_FACTORY);
    }

    /**
     * Returns the error response handler for handling a error response.
     *
     * @param errorUnmarshallers response unmarshallers to unamrshall the error responses.
     * @param supportsCbor               true if cbor protocol is used; false otherwise
     */
    public static JsonErrorResponseHandlerV2 createErrorResponseHandler(
            final List<JsonErrorUnmarshallerV2> errorUnmarshallers, final boolean supportsCbor) {
       return isCborEnabled(supportsCbor)
                ? new JsonErrorResponseHandlerV2(errorUnmarshallers,
                CBOR_FACTORY)
                : new JsonErrorResponseHandlerV2(errorUnmarshallers,
                JSON_FACTORY);
    }
}
