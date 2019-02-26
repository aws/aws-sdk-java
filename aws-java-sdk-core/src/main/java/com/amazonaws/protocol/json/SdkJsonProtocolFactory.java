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

package com.amazonaws.protocol.json;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.annotation.SdkProtectedApi;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.protocol.OperationInfo;
import com.amazonaws.protocol.Protocol;
import com.amazonaws.protocol.ProtocolRequestMarshaller;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import java.util.ArrayList;
import java.util.List;

/**
 * Factory to generate the various JSON protocol handlers and generators depending on the wire protocol to be used for
 * communicating with the AWS service.
 */
@ThreadSafe
@SdkProtectedApi
public class SdkJsonProtocolFactory implements SdkJsonMarshallerFactory {

    private final JsonClientMetadata metadata;

    private final List<JsonErrorUnmarshaller> errorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();

    public SdkJsonProtocolFactory(JsonClientMetadata metadata) {
        this.metadata = metadata;
        createErrorUnmarshallers();
    }

    @Override
    public StructuredJsonGenerator createGenerator() {
        return getSdkFactory().createWriter(getContentType());
    }

    @Override
    public String getContentType() {
        return getContentTypeResolver().resolveContentType(metadata);
    }

    public <T> ProtocolRequestMarshaller<T> createProtocolMarshaller(OperationInfo operationInfo, T origRequest) {
        return JsonProtocolMarshallerBuilder.<T>standard()
                .jsonGenerator(createGenerator(operationInfo))
                .contentType(getContentType())
                .operationInfo(operationInfo)
                .originalRequest(origRequest)
                .sendExplicitNullForPayload(false)
                .build();
    }

    private StructuredJsonGenerator createGenerator(OperationInfo operationInfo) {
        if (operationInfo.hasPayloadMembers() || operationInfo.protocol() == Protocol.AWS_JSON) {
            return createGenerator();
        } else {
            return StructuredJsonGenerator.NO_OP;
        }
    }

    /**
     * Returns the response handler to be used for handling a successful response.
     *
     * @param operationMetadata Additional context information about an operation to create the appropriate response handler.
     */
    public <T> HttpResponseHandler<AmazonWebServiceResponse<T>> createResponseHandler(
            JsonOperationMetadata operationMetadata,
            Unmarshaller<T, JsonUnmarshallerContext> responseUnmarshaller) {
        return getSdkFactory().createResponseHandler(operationMetadata, responseUnmarshaller);
    }

    /**
     * Creates a response handler for handling a error response (non 2xx response).
     */
    public HttpResponseHandler<AmazonServiceException> createErrorResponseHandler(
            JsonErrorResponseMetadata errorResponsMetadata) {
        return getSdkFactory().createErrorResponseHandler(errorUnmarshallers, errorResponsMetadata
                .getCustomErrorCodeFieldName());
    }

    @SuppressWarnings("unchecked")
    private void createErrorUnmarshallers() {
        for (JsonErrorShapeMetadata errorMetadata : metadata.getErrorShapeMetadata()) {
            errorUnmarshallers.add(new JsonErrorUnmarshaller(
                    (Class<? extends AmazonServiceException>) errorMetadata.getModeledClass(),
                    errorMetadata.getErrorCode()));

        }
        errorUnmarshallers.add(new JsonErrorUnmarshaller(
                (Class<? extends AmazonServiceException>) metadata.getBaseServiceExceptionClass(),
                null));
    }

    /**
     * @return Instance of {@link SdkStructuredJsonFactory} to use in creating handlers.
     */
    private SdkStructuredJsonFactory getSdkFactory() {
        if (isCborEnabled()) {
            return SdkStructuredCborFactory.SDK_CBOR_FACTORY;
        } else if (isIonEnabled()) {
            return isIonBinaryEnabled()
                    ? SdkStructuredIonFactory.SDK_ION_BINARY_FACTORY
                    : SdkStructuredIonFactory.SDK_ION_TEXT_FACTORY;
        } else {
            return SdkStructuredPlainJsonFactory.SDK_JSON_FACTORY;
        }
    }

    /**
     * @return Content type resolver implementation to use.
     */
    private JsonContentTypeResolver getContentTypeResolver() {
        if (isCborEnabled()) {
            return JsonContentTypeResolver.CBOR;
        } else if (isIonEnabled()) {
            return isIonBinaryEnabled()
                    ? JsonContentTypeResolver.ION_BINARY
                    : JsonContentTypeResolver.ION_TEXT;
        } else {
            return JsonContentTypeResolver.JSON;
        }
    }

    private boolean isCborEnabled() {
        return metadata.isSupportsCbor() && !SDKGlobalConfiguration.isCborDisabled();
    }

    private boolean isIonEnabled() {
        return metadata.isSupportsIon();
    }

    boolean isIonBinaryEnabled() {
        return !SDKGlobalConfiguration.isIonBinaryDisabled();
    }
}
