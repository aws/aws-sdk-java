/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.signer;

import javax.annotation.Generated;

import com.amazonaws.services.signer.model.*;

/**
 * Abstract implementation of {@code AWSsignerAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSsignerAsync extends AbstractAWSsigner implements AWSsignerAsync {

    protected AbstractAWSsignerAsync() {
    }

    @Override
    public java.util.concurrent.Future<CancelSigningProfileResult> cancelSigningProfileAsync(CancelSigningProfileRequest request) {

        return cancelSigningProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelSigningProfileResult> cancelSigningProfileAsync(CancelSigningProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelSigningProfileRequest, CancelSigningProfileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSigningJobResult> describeSigningJobAsync(DescribeSigningJobRequest request) {

        return describeSigningJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSigningJobResult> describeSigningJobAsync(DescribeSigningJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSigningJobRequest, DescribeSigningJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSigningPlatformResult> getSigningPlatformAsync(GetSigningPlatformRequest request) {

        return getSigningPlatformAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSigningPlatformResult> getSigningPlatformAsync(GetSigningPlatformRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSigningPlatformRequest, GetSigningPlatformResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSigningProfileResult> getSigningProfileAsync(GetSigningProfileRequest request) {

        return getSigningProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSigningProfileResult> getSigningProfileAsync(GetSigningProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSigningProfileRequest, GetSigningProfileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSigningJobsResult> listSigningJobsAsync(ListSigningJobsRequest request) {

        return listSigningJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSigningJobsResult> listSigningJobsAsync(ListSigningJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSigningJobsRequest, ListSigningJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSigningPlatformsResult> listSigningPlatformsAsync(ListSigningPlatformsRequest request) {

        return listSigningPlatformsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSigningPlatformsResult> listSigningPlatformsAsync(ListSigningPlatformsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSigningPlatformsRequest, ListSigningPlatformsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSigningProfilesResult> listSigningProfilesAsync(ListSigningProfilesRequest request) {

        return listSigningProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSigningProfilesResult> listSigningProfilesAsync(ListSigningProfilesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSigningProfilesRequest, ListSigningProfilesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutSigningProfileResult> putSigningProfileAsync(PutSigningProfileRequest request) {

        return putSigningProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutSigningProfileResult> putSigningProfileAsync(PutSigningProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<PutSigningProfileRequest, PutSigningProfileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartSigningJobResult> startSigningJobAsync(StartSigningJobRequest request) {

        return startSigningJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartSigningJobResult> startSigningJobAsync(StartSigningJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartSigningJobRequest, StartSigningJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
