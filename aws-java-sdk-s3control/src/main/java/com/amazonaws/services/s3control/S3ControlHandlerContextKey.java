/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control;

import com.amazonaws.handlers.HandlerContextKey;
import com.amazonaws.services.s3.S3ClientOptions;
import com.amazonaws.services.s3.internal.AWSS3V4Signer;

/**
 * Constants for {@link HandlerContextKey} pertaining to S3 control
 */
public final class S3ControlHandlerContextKey {

    /**
     * The optional value contains metadata for a request with a field that contains an ARN
     */
    public static final HandlerContextKey<S3ArnableField> S3_ARNABLE_FIELD = new HandlerContextKey<S3ArnableField>(
            "S3_ARNABLE_FIELD");

    private S3ControlHandlerContextKey() {
    }

}
