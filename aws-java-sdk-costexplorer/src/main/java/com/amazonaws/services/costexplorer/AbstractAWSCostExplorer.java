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
package com.amazonaws.services.costexplorer;

import javax.annotation.Generated;

import com.amazonaws.services.costexplorer.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSCostExplorer}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSCostExplorer implements AWSCostExplorer {

    protected AbstractAWSCostExplorer() {
    }

    @Override
    public GetCostAndUsageResult getCostAndUsage(GetCostAndUsageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetCostForecastResult getCostForecast(GetCostForecastRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDimensionValuesResult getDimensionValues(GetDimensionValuesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetReservationCoverageResult getReservationCoverage(GetReservationCoverageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetReservationPurchaseRecommendationResult getReservationPurchaseRecommendation(GetReservationPurchaseRecommendationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetReservationUtilizationResult getReservationUtilization(GetReservationUtilizationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetTagsResult getTags(GetTagsRequest request) {
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
