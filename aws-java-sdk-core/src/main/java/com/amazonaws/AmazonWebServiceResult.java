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
package com.amazonaws;

import com.amazonaws.http.SdkHttpMetadata;

/**
 * Base type for all AWS response objects. Exposes metadata about the request such as the request
 * id and access to details in the HTTP response.
 *
 * @param <T> Type of {@link ResponseMetadata}.
 */
public class AmazonWebServiceResult<T extends ResponseMetadata> {

    private T sdkResponseMetadata;

    private SdkHttpMetadata sdkHttpMetadata;

    /**
     * @return The response metadata associated with this request.
     */
    public T getSdkResponseMetadata() {
        return sdkResponseMetadata;
    }

    public AmazonWebServiceResult<T> setSdkResponseMetadata(T sdkResponseMetadata) {
        this.sdkResponseMetadata = sdkResponseMetadata;
        return this;
    }

    /**
     * @return HTTP related metadata like headers and status code.
     */
    public SdkHttpMetadata getSdkHttpMetadata() {
        return sdkHttpMetadata;
    }

    public AmazonWebServiceResult<T> setSdkHttpMetadata(SdkHttpMetadata sdkHttpMetadata) {
        this.sdkHttpMetadata = sdkHttpMetadata;
        return this;
    }
}
