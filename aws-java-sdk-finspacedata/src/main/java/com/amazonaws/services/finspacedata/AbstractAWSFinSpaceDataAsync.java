/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.finspacedata;

import javax.annotation.Generated;

import com.amazonaws.services.finspacedata.model.*;

/**
 * Abstract implementation of {@code AWSFinSpaceDataAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSFinSpaceDataAsync extends AbstractAWSFinSpaceData implements AWSFinSpaceDataAsync {

    protected AbstractAWSFinSpaceDataAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateChangesetResult> createChangesetAsync(CreateChangesetRequest request) {

        return createChangesetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateChangesetResult> createChangesetAsync(CreateChangesetRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateChangesetRequest, CreateChangesetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetProgrammaticAccessCredentialsResult> getProgrammaticAccessCredentialsAsync(
            GetProgrammaticAccessCredentialsRequest request) {

        return getProgrammaticAccessCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProgrammaticAccessCredentialsResult> getProgrammaticAccessCredentialsAsync(
            GetProgrammaticAccessCredentialsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetProgrammaticAccessCredentialsRequest, GetProgrammaticAccessCredentialsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetWorkingLocationResult> getWorkingLocationAsync(GetWorkingLocationRequest request) {

        return getWorkingLocationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkingLocationResult> getWorkingLocationAsync(GetWorkingLocationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetWorkingLocationRequest, GetWorkingLocationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
