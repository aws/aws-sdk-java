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

import com.amazonaws.annotation.SdkProtectedApi;
import com.amazonaws.arn.Arn;

/**
 * Indicating a field that can be an ARN
 */
@SdkProtectedApi
public class S3ArnableField {
    private Arn arn;

    /**
     * @return the ARN
     */
    public Arn getArn() {
        return arn;
    }

    /**
     * Sets the arn
     *
     * @param arn The new arn value.
     * @return This object for method chaining.
     */
    public S3ArnableField withArn(Arn arn) {
        this.arn = arn;
        return this;
    }
}
