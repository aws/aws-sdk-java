/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
package com.amazonaws.util;

import com.amazonaws.SdkClientException;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * No-op response metadata cache used when a client instance is configured
 * without response metadata caching enabled.
 */
@SdkInternalApi
public class NullResponseMetadataCache implements MetadataCache {

    @Override
    public void add(Object obj, ResponseMetadata metadata) {
        // deliberately left blank
    }

    @Override
    public ResponseMetadata get(Object obj) {
        throw new SdkClientException("Response metadata caching is not enabled");
    }

}
