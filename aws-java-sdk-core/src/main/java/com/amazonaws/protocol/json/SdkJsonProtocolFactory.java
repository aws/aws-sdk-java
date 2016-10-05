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
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

import java.util.ArrayList;
import java.util.List;

/**
 * Factory to generate the various JSON protocol handlers and generators depending on the wire
 * protocol to be used for communicating with the AWS service.
 */
@ThreadSafe
@SdkProtectedApi
public class SdkJsonProtocolFactory {

    private final JsonClientMetadata metadata;

    private final List<JsonErrorUnmarshaller> errorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();

    public SdkJsonProtocolFactory(JsonClientMetadata metadata) {
        this.metadata = metadata;
        createErrorUnmarshallers();
    }

    /**
     * Returns the {@link SdkJsonGenerator} to be used for marshalling the request.
     */
    public StructuredJsonGenerator createGenerator() {
        return getSdkFactory().createWriter(getContentType());
    }

    /**
     * Returns the response handler to be used for handling a successfull response.
     *
     * @param operationMetadata Additional context information about an operation to create the
     *                          appropriate response handler.
     */
    public <T> HttpResponseHandler<AmazonWebServiceResponse<T>> createResponseHandler(
            JsonOperationMetadata operationMetadata,
            Unmarshaller<T, JsonUnmarshallerContext> responseUnmarshaller) {
        return getSdkFactory().createResponseHandler(operationMetadata, responseUnmarshaller);
    }

    /**
     * Returns the error response handler for handling a error response.
     */
    public HttpResponseHandler<AmazonServiceException> createErrorResponseHandler(
            JsonErrorResponseMetadata errorResponsMetadata) {
        return getSdkFactory().createErrorResponseHandler(errorUnmarshallers, errorResponsMetadata
                .getCustomErrorCodeFieldName());
    }

    /**
     * @return Content type to send in requests.
     */
    public String getContentType() {
        return getContentTypeResolver().resolveContentType(metadata);
    }

    private void createErrorUnmarshallers() {
        for (JsonErrorShapeMetadata errorMetadata : metadata.getErrorShapeMetadata()) {
            errorUnmarshallers.add(new JsonErrorUnmarshaller(errorMetadata.getModeledClass(),
                                                             errorMetadata.getErrorCode()));

        }
        errorUnmarshallers
                .add(new JsonErrorUnmarshaller(metadata.getBaseServiceExceptionClass(), null));
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
        } else if (isIonEnabled()){
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
