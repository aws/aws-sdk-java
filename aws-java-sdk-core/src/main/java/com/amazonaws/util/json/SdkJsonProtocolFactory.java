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
import com.amazonaws.transform.Unmarshaller;
import com.fasterxml.jackson.core.JsonFactory;

import java.util.List;
import java.util.Map;

import static com.amazonaws.util.json.SdkStructuredPlainJsonFactory.JSON_SCALAR_UNMARSHALLERS;

/**
 * Factory to generate the various JSON protocol handlers and generators depending on the wire
 * protocol to be used for communicating with the AWS service.
 */
@SdkProtectedApi
public class SdkJsonProtocolFactory {

    private static final SdkStructuredJsonFactory SDK_JSON_FACTORY = new SdkStructuredPlainJsonFactory();

    // TOOD Actually use CBOR in 1.11
    private static final SdkStructuredJsonFactory SDK_CBOR_FACTORY = new SdkStructuredPlainJsonFactory();

    @Deprecated
    public static final JsonFactory DEFAULT_FACTORY = SdkStructuredPlainJsonFactory.JSON_FACTORY;

    // TODO Remove in 1.11
    @Deprecated
    public static final String DEFAULT_CONTENT_TYPE = "application/x-amz-json-1.0";

    // TOOD Remove in 1.11
    @Deprecated
    public static final Map<Class<?>, Unmarshaller<?, JsonUnmarshallerContext>> DEFAULT_SCALAR_UNMARSHALLERS = JSON_SCALAR_UNMARSHALLERS;

    /**
     * Returns the {@link SdkJsonGenerator} to be used for marshalling the request.
     *
     * @param supportsCbor    true if cbor protocol is used; false otherwise
     * @param protocolVersion AWS JSON/CBOR protocol version.
     */
    public static StructuredJsonGenerator createWriter(final boolean supportsCbor,
                                                       final String protocolVersion) {
        return getSdkFactory(supportsCbor).createWriter(protocolVersion);
    }

    /**
     * Returns the response handler to be used for handling a successfull response.
     *
     * @param responseUnmarshaller response unmarshaller to unmarshall the specific response
     *                             object.
     * @param supportsCbor         true if cbor protocol is used; false otherwise
     */
    public static JsonResponseHandler createResponseHandler(
            final Unmarshaller<?, JsonUnmarshallerContext> responseUnmarshaller,
            final boolean supportsCbor) {
        return getSdkFactory(supportsCbor).createResponseHandler(responseUnmarshaller);
    }

    /**
     * Returns the error response handler for handling a error response.
     *
     * @param errorUnmarshallers response unmarshallers to unamrshall the error responses.
     * @param supportsCbor       true if cbor protocol is used; false otherwise
     */
    public static JsonErrorResponseHandlerV2 createErrorResponseHandler(
            final List<JsonErrorUnmarshallerV2> errorUnmarshallers, final boolean supportsCbor) {
        return getSdkFactory(supportsCbor).createErrorResponseHandler(errorUnmarshallers);
    }

    /**
     * @return Instance of {@link SdkStructuredJsonFactory} to use in creating handlers.
     */
    private static SdkStructuredJsonFactory getSdkFactory(final boolean supportsCbor) {
        return isCborEnabled(supportsCbor) ? SDK_CBOR_FACTORY : SDK_JSON_FACTORY;
    }

    private static boolean isCborEnabled(boolean supportsCbor) {
        return supportsCbor && !SDKGlobalConfiguration.isCborDisabled();
    }
}
