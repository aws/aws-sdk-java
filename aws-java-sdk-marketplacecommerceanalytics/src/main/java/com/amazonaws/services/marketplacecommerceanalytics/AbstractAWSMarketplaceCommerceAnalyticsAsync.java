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
package com.amazonaws.services.marketplacecommerceanalytics;

import javax.annotation.Generated;

import com.amazonaws.services.marketplacecommerceanalytics.model.*;

/**
 * Abstract implementation of {@code AWSMarketplaceCommerceAnalyticsAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSMarketplaceCommerceAnalyticsAsync extends AbstractAWSMarketplaceCommerceAnalytics implements AWSMarketplaceCommerceAnalyticsAsync {

    protected AbstractAWSMarketplaceCommerceAnalyticsAsync() {
    }

    @Override
    public java.util.concurrent.Future<GenerateDataSetResult> generateDataSetAsync(GenerateDataSetRequest request) {

        return generateDataSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GenerateDataSetResult> generateDataSetAsync(GenerateDataSetRequest request,
            com.amazonaws.handlers.AsyncHandler<GenerateDataSetRequest, GenerateDataSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartSupportDataExportResult> startSupportDataExportAsync(StartSupportDataExportRequest request) {

        return startSupportDataExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartSupportDataExportResult> startSupportDataExportAsync(StartSupportDataExportRequest request,
            com.amazonaws.handlers.AsyncHandler<StartSupportDataExportRequest, StartSupportDataExportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
