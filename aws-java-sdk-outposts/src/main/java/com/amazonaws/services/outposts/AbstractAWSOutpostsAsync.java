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
package com.amazonaws.services.outposts;

import javax.annotation.Generated;

import com.amazonaws.services.outposts.model.*;

/**
 * Abstract implementation of {@code AWSOutpostsAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSOutpostsAsync extends AbstractAWSOutposts implements AWSOutpostsAsync {

    protected AbstractAWSOutpostsAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateOutpostResult> createOutpostAsync(CreateOutpostRequest request) {

        return createOutpostAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateOutpostResult> createOutpostAsync(CreateOutpostRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateOutpostRequest, CreateOutpostResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteOutpostResult> deleteOutpostAsync(DeleteOutpostRequest request) {

        return deleteOutpostAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteOutpostResult> deleteOutpostAsync(DeleteOutpostRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteOutpostRequest, DeleteOutpostResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSiteResult> deleteSiteAsync(DeleteSiteRequest request) {

        return deleteSiteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSiteResult> deleteSiteAsync(DeleteSiteRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSiteRequest, DeleteSiteResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetOutpostResult> getOutpostAsync(GetOutpostRequest request) {

        return getOutpostAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOutpostResult> getOutpostAsync(GetOutpostRequest request,
            com.amazonaws.handlers.AsyncHandler<GetOutpostRequest, GetOutpostResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetOutpostInstanceTypesResult> getOutpostInstanceTypesAsync(GetOutpostInstanceTypesRequest request) {

        return getOutpostInstanceTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOutpostInstanceTypesResult> getOutpostInstanceTypesAsync(GetOutpostInstanceTypesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetOutpostInstanceTypesRequest, GetOutpostInstanceTypesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListOutpostsResult> listOutpostsAsync(ListOutpostsRequest request) {

        return listOutpostsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOutpostsResult> listOutpostsAsync(ListOutpostsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListOutpostsRequest, ListOutpostsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSitesResult> listSitesAsync(ListSitesRequest request) {

        return listSitesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSitesResult> listSitesAsync(ListSitesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSitesRequest, ListSitesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
