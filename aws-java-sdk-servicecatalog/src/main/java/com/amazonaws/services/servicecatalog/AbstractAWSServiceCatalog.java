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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSServiceCatalog}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
public class AbstractAWSServiceCatalog implements AWSServiceCatalog {

    protected AbstractAWSServiceCatalog() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeProductResult describeProduct(DescribeProductRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeProductViewResult describeProductView(DescribeProductViewRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeProvisioningParametersResult describeProvisioningParameters(DescribeProvisioningParametersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeRecordResult describeRecord(DescribeRecordRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListLaunchPathsResult listLaunchPaths(ListLaunchPathsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListRecordHistoryResult listRecordHistory(ListRecordHistoryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ProvisionProductResult provisionProduct(ProvisionProductRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ScanProvisionedProductsResult scanProvisionedProducts(ScanProvisionedProductsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SearchProductsResult searchProducts(SearchProductsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TerminateProvisionedProductResult terminateProvisionedProduct(TerminateProvisionedProductRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateProvisionedProductResult updateProvisionedProduct(UpdateProvisionedProductRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
