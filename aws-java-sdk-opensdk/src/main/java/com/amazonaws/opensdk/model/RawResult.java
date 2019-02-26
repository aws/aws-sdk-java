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
package com.amazonaws.opensdk.model;

import com.amazonaws.opensdk.BaseResult;

import java.util.Optional;

/**
 * Corresponding result class for {@link RawRequest}.
 * <p>
 * Note: Content returned by the service must be
 * consumed by a {@link ResultContentConsumer} supplied to the client execute
 * method; it is not exposed as part of this object.
 */
public class RawResult extends BaseResult {

    /**
     * @return The status code of the underlying HTTP response.
     */
    public int statusCode() {
        return sdkResponseMetadata().httpStatusCode();
    }

    /**
     * Get a header value from the underlying HTTP response.
     *
     * @param name The name of header.
     *
     * @return The header value.
     */
    public Optional<String> header(String name) {
        return sdkResponseMetadata().header(name);
    }
}
