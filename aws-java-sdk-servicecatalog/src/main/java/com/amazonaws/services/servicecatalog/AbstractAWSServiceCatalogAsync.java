/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog;

import com.amazonaws.services.servicecatalog.model.*;

/**
 * Abstract implementation of {@code AWSServiceCatalogAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
public class AbstractAWSServiceCatalogAsync extends AbstractAWSServiceCatalog implements AWSServiceCatalogAsync {

    protected AbstractAWSServiceCatalogAsync() {
    }

    @Override
    public java.util.concurrent.Future<DescribeProductResult> describeProductAsync(DescribeProductRequest request) {

        return describeProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProductResult> describeProductAsync(DescribeProductRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeProductRequest, DescribeProductResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeProductViewResult> describeProductViewAsync(DescribeProductViewRequest request) {

        return describeProductViewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProductViewResult> describeProductViewAsync(DescribeProductViewRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeProductViewRequest, DescribeProductViewResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeProvisioningParametersResult> describeProvisioningParametersAsync(DescribeProvisioningParametersRequest request) {

        return describeProvisioningParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProvisioningParametersResult> describeProvisioningParametersAsync(DescribeProvisioningParametersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeProvisioningParametersRequest, DescribeProvisioningParametersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeRecordResult> describeRecordAsync(DescribeRecordRequest request) {

        return describeRecordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRecordResult> describeRecordAsync(DescribeRecordRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRecordRequest, DescribeRecordResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListLaunchPathsResult> listLaunchPathsAsync(ListLaunchPathsRequest request) {

        return listLaunchPathsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLaunchPathsResult> listLaunchPathsAsync(ListLaunchPathsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListLaunchPathsRequest, ListLaunchPathsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRecordHistoryResult> listRecordHistoryAsync(ListRecordHistoryRequest request) {

        return listRecordHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecordHistoryResult> listRecordHistoryAsync(ListRecordHistoryRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRecordHistoryRequest, ListRecordHistoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ProvisionProductResult> provisionProductAsync(ProvisionProductRequest request) {

        return provisionProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ProvisionProductResult> provisionProductAsync(ProvisionProductRequest request,
            com.amazonaws.handlers.AsyncHandler<ProvisionProductRequest, ProvisionProductResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ScanProvisionedProductsResult> scanProvisionedProductsAsync(ScanProvisionedProductsRequest request) {

        return scanProvisionedProductsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ScanProvisionedProductsResult> scanProvisionedProductsAsync(ScanProvisionedProductsRequest request,
            com.amazonaws.handlers.AsyncHandler<ScanProvisionedProductsRequest, ScanProvisionedProductsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SearchProductsResult> searchProductsAsync(SearchProductsRequest request) {

        return searchProductsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchProductsResult> searchProductsAsync(SearchProductsRequest request,
            com.amazonaws.handlers.AsyncHandler<SearchProductsRequest, SearchProductsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TerminateProvisionedProductResult> terminateProvisionedProductAsync(TerminateProvisionedProductRequest request) {

        return terminateProvisionedProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateProvisionedProductResult> terminateProvisionedProductAsync(TerminateProvisionedProductRequest request,
            com.amazonaws.handlers.AsyncHandler<TerminateProvisionedProductRequest, TerminateProvisionedProductResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateProvisionedProductResult> updateProvisionedProductAsync(UpdateProvisionedProductRequest request) {

        return updateProvisionedProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProvisionedProductResult> updateProvisionedProductAsync(UpdateProvisionedProductRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateProvisionedProductRequest, UpdateProvisionedProductResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
