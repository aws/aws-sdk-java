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
package com.amazonaws.opensdk.protect.protocol;

import com.amazonaws.SdkBaseException;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.http.JsonResponseHandler;
import com.amazonaws.opensdk.BaseResult;
import com.amazonaws.opensdk.internal.BaseException;
import com.amazonaws.opensdk.internal.protocol.ApiGatewayErrorResponseHandler;
import com.amazonaws.opensdk.internal.protocol.ApiGatewayErrorUnmarshaller;
import com.amazonaws.opensdk.internal.protocol.ApiGatewayResponseHandler;
import com.amazonaws.protocol.MarshallLocation;
import com.amazonaws.protocol.MarshallingType;
import com.amazonaws.protocol.OperationInfo;
import com.amazonaws.protocol.ProtocolRequestMarshaller;
import com.amazonaws.protocol.json.JsonClientMetadata;
import com.amazonaws.protocol.json.JsonErrorResponseMetadata;
import com.amazonaws.protocol.json.JsonErrorShapeMetadata;
import com.amazonaws.protocol.json.JsonOperationMetadata;
import com.amazonaws.protocol.json.JsonProtocolMarshallerBuilder;
import com.amazonaws.protocol.json.SdkJsonMarshallerFactory;
import com.amazonaws.protocol.json.SdkStructuredJsonFactory;
import com.amazonaws.protocol.json.SdkStructuredPlainJsonFactory;
import com.amazonaws.protocol.json.StructuredJsonGenerator;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.DateUtils;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Protocol factory implementation for API Gateway clients.
 */
public final class ApiGatewayProtocolFactoryImpl implements SdkJsonMarshallerFactory {

    private static final SdkStructuredJsonFactory JSON_FACTORY = SdkStructuredPlainJsonFactory.SDK_JSON_FACTORY;
    private static final String CONTENT_TYPE = "application/json";

    private final JsonClientMetadata metadata;

    public ApiGatewayProtocolFactoryImpl(JsonClientMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public StructuredJsonGenerator createGenerator() {
        return JSON_FACTORY.createWriter(CONTENT_TYPE);
    }

    @Override
    public String getContentType() {
        return CONTENT_TYPE;
    }

    public <T> ProtocolRequestMarshaller<T> createProtocolMarshaller(OperationInfo operationInfo, T origRequest) {
        return JsonProtocolMarshallerBuilder.<T>standard()
                .jsonGenerator(operationInfo.hasPayloadMembers() ? createGenerator() : StructuredJsonGenerator.NO_OP)
                .contentType(getContentType())
                .operationInfo(operationInfo)
                .originalRequest(origRequest)
                .sendExplicitNullForPayload(true)
                .marshallerOverride(MarshallLocation.PAYLOAD, MarshallingType.DATE,
                                    (val, generator) -> generator.writeValue(DateUtils.formatISO8601Date(val)))
                .build();
    }

    /**
     * Creates a response handler to be used for handling a successful response.
     *
     * @param operationMetadata Additional context information about an operation to create the appropriate response handler.
     */
    public <T extends BaseResult> HttpResponseHandler<T> createResponseHandler(
            JsonOperationMetadata operationMetadata,
            Unmarshaller<T, JsonUnmarshallerContext> responseUnmarshaller) {
        final JsonResponseHandler<T> responseHandler = JSON_FACTORY
                .createResponseHandler(operationMetadata, responseUnmarshaller);
        return new ApiGatewayResponseHandler<>(responseHandler);
    }

    /**
     * Creates a response handler for handling a error response (non 2xx response).
     */
    public HttpResponseHandler<SdkBaseException> createErrorResponseHandler(
            JsonErrorResponseMetadata errorResponsMetadata) {
        return new ApiGatewayErrorResponseHandler(
                createErrorUnmarshallers(errorResponsMetadata.getErrorShapes().stream()),
                SdkStructuredPlainJsonFactory.JSON_FACTORY);
    }

    @SuppressWarnings("unchecked")
    private List<ApiGatewayErrorUnmarshaller> createErrorUnmarshallers(
            Stream<JsonErrorShapeMetadata> errorShapeMetadata) {
        final List<ApiGatewayErrorUnmarshaller> errorUnmarshallers = errorShapeMetadata
                .map(this::createErrorUnmarshaller).collect(Collectors.toList());
        // All unmodeled/unknown exceptions are unmarshalled into the service specific base
        // exception class.
        errorUnmarshallers.add(new ApiGatewayErrorUnmarshaller(
                (Class<? extends BaseException>) metadata.getBaseServiceExceptionClass(),
                Optional.empty()));
        return errorUnmarshallers;
    }

    @SuppressWarnings("unchecked")
    private ApiGatewayErrorUnmarshaller createErrorUnmarshaller(JsonErrorShapeMetadata errorShape) {
        return new ApiGatewayErrorUnmarshaller(
                (Class<? extends BaseException>) errorShape.getModeledClass(),
                Optional.of(errorShape.getHttpStatusCode()));
    }
}
