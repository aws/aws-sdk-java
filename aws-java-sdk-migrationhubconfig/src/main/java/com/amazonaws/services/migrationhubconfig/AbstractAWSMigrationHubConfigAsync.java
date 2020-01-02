/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.migrationhubconfig;

import javax.annotation.Generated;

import com.amazonaws.services.migrationhubconfig.model.*;

/**
 * Abstract implementation of {@code AWSMigrationHubConfigAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSMigrationHubConfigAsync extends AbstractAWSMigrationHubConfig implements AWSMigrationHubConfigAsync {

    protected AbstractAWSMigrationHubConfigAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateHomeRegionControlResult> createHomeRegionControlAsync(CreateHomeRegionControlRequest request) {

        return createHomeRegionControlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHomeRegionControlResult> createHomeRegionControlAsync(CreateHomeRegionControlRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateHomeRegionControlRequest, CreateHomeRegionControlResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeHomeRegionControlsResult> describeHomeRegionControlsAsync(DescribeHomeRegionControlsRequest request) {

        return describeHomeRegionControlsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHomeRegionControlsResult> describeHomeRegionControlsAsync(DescribeHomeRegionControlsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeHomeRegionControlsRequest, DescribeHomeRegionControlsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetHomeRegionResult> getHomeRegionAsync(GetHomeRegionRequest request) {

        return getHomeRegionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHomeRegionResult> getHomeRegionAsync(GetHomeRegionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetHomeRegionRequest, GetHomeRegionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
