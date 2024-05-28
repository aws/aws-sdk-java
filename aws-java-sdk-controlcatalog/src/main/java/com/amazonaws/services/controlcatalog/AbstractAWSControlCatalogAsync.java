/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.controlcatalog;

import javax.annotation.Generated;

import com.amazonaws.services.controlcatalog.model.*;

/**
 * Abstract implementation of {@code AWSControlCatalogAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSControlCatalogAsync extends AbstractAWSControlCatalog implements AWSControlCatalogAsync {

    protected AbstractAWSControlCatalogAsync() {
    }

    @Override
    public java.util.concurrent.Future<ListCommonControlsResult> listCommonControlsAsync(ListCommonControlsRequest request) {

        return listCommonControlsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCommonControlsResult> listCommonControlsAsync(ListCommonControlsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListCommonControlsRequest, ListCommonControlsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest request) {

        return listDomainsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListObjectivesResult> listObjectivesAsync(ListObjectivesRequest request) {

        return listObjectivesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListObjectivesResult> listObjectivesAsync(ListObjectivesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListObjectivesRequest, ListObjectivesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
