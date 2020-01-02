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
package com.amazonaws.services.marketplacecatalog;

import javax.annotation.Generated;

import com.amazonaws.services.marketplacecatalog.model.*;

/**
 * Abstract implementation of {@code AWSMarketplaceCatalogAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSMarketplaceCatalogAsync extends AbstractAWSMarketplaceCatalog implements AWSMarketplaceCatalogAsync {

    protected AbstractAWSMarketplaceCatalogAsync() {
    }

    @Override
    public java.util.concurrent.Future<CancelChangeSetResult> cancelChangeSetAsync(CancelChangeSetRequest request) {

        return cancelChangeSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelChangeSetResult> cancelChangeSetAsync(CancelChangeSetRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelChangeSetRequest, CancelChangeSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeChangeSetResult> describeChangeSetAsync(DescribeChangeSetRequest request) {

        return describeChangeSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeChangeSetResult> describeChangeSetAsync(DescribeChangeSetRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeChangeSetRequest, DescribeChangeSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEntityResult> describeEntityAsync(DescribeEntityRequest request) {

        return describeEntityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEntityResult> describeEntityAsync(DescribeEntityRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEntityRequest, DescribeEntityResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListChangeSetsResult> listChangeSetsAsync(ListChangeSetsRequest request) {

        return listChangeSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListChangeSetsResult> listChangeSetsAsync(ListChangeSetsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListChangeSetsRequest, ListChangeSetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListEntitiesResult> listEntitiesAsync(ListEntitiesRequest request) {

        return listEntitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEntitiesResult> listEntitiesAsync(ListEntitiesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListEntitiesRequest, ListEntitiesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartChangeSetResult> startChangeSetAsync(StartChangeSetRequest request) {

        return startChangeSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartChangeSetResult> startChangeSetAsync(StartChangeSetRequest request,
            com.amazonaws.handlers.AsyncHandler<StartChangeSetRequest, StartChangeSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
