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
package com.amazonaws.protocol.json;

import com.amazonaws.annotation.SdkInternalApi;

/**
 * Interface to compute the content type to send in requests for JSON based protocols.
 */
@SdkInternalApi
interface JsonContentTypeResolver {

    /**
     * Content type resolver implementation for Ion-enabled services.
     */
    JsonContentTypeResolver ION_BINARY = new JsonContentTypeResolverImpl("application/x-amz-ion-");

    /**
     * Content type resolver implementation for debugging Ion-enabled services.
     */
    JsonContentTypeResolver ION_TEXT = new JsonContentTypeResolverImpl("text/x-amz-ion-");

    /**
     * Content type resolver implementation for CBOR enabled services.
     */
    JsonContentTypeResolver CBOR = new JsonContentTypeResolverImpl("application/x-amz-cbor-");

    /**
     * Content type resolver implementation for plain text JSON services.
     */
    JsonContentTypeResolver JSON = new JsonContentTypeResolverImpl("application/x-amz-json-");

    /**
     * Computes content type to send in requests.
     *
     * @param metadata Metadata about the client making the request.
     * @return Correct content type to send in request based on metadata about the client.
     */
    String resolveContentType(JsonClientMetadata metadata);
}
