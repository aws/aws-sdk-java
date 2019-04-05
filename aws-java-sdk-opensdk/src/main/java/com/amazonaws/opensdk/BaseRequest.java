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
package com.amazonaws.opensdk;

import java.io.Serializable;

/**
 * Base class for all request objects.
 */
public abstract class BaseRequest implements Serializable, Cloneable {

    private SdkRequestConfig sdkRequestConfig = SdkRequestConfig.builder().build();

    /**
     * @return The configuration for this particular request.
     */
    public SdkRequestConfig sdkRequestConfig() {
        return sdkRequestConfig;
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig Request configuration.
     * @return This object for method chaining.
     */
    public BaseRequest sdkRequestConfig(SdkRequestConfig sdkRequestConfig) {
        this.sdkRequestConfig = sdkRequestConfig;
        return this;
    }

    /**
     * Creates a shallow clone of this request. Explicitly does <em>not</em> clone the deep
     * structure of the request object.
     *
     * @see Object#clone()
     */
    @Override
    public BaseRequest clone() {
        try {
            return (BaseRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() " +
                    "even though we're Cloneable!", e);
        }
    }
}
