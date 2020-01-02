/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.arn;

import com.amazonaws.annotation.SdkProtectedApi;

/**
 * An interface for converting an AWS ARN into a service specific {@link AwsResource}. Services that model
 * their own AWS resources will provide a specific implementation of this ARN parser.
 * <p>
 * @param <T> The service specific representation of {@link AwsResource}.
 */
@SdkProtectedApi
public interface ArnConverter<T extends AwsResource> {
    /**
     * Converts an AWS ARN into a service specific {@link AwsResource}.
     *
     * @param arn The ARN to convert.
     * @return A service specific {@link AwsResource}.
     */
    T convertArn(Arn arn);
}
