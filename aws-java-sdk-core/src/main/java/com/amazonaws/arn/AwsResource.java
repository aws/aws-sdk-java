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
 * An abstract representation of an AWS Resource. Provides an interface to properties that are common across all AWS
 * resource types. Services may provide concrete implementations that can be found in each service module.
 */
@SdkProtectedApi
public interface AwsResource {
    /**
     * Gets the partition associated with the AWS Resource (e.g.: 'aws').
     * @return the value for the partition.
     */
    String getPartition();

    /**
     * Gets the region associated with the AWS Resource (e.g.: 'us-east-1').
     * @return the value for the region.
     */
    String getRegion();

    /**
     * Gets the account ID associated with the AWS Resource.
     * @return the value for the account ID.
     */
    String getAccountId();
}
