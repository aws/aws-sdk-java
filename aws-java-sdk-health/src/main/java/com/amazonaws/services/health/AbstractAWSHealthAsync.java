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
package com.amazonaws.services.health;

import javax.annotation.Generated;

import com.amazonaws.services.health.model.*;

/**
 * Abstract implementation of {@code AWSHealthAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSHealthAsync extends AbstractAWSHealth implements AWSHealthAsync {

    protected AbstractAWSHealthAsync() {
    }

    @Override
    public java.util.concurrent.Future<DescribeAffectedAccountsForOrganizationResult> describeAffectedAccountsForOrganizationAsync(
            DescribeAffectedAccountsForOrganizationRequest request) {

        return describeAffectedAccountsForOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAffectedAccountsForOrganizationResult> describeAffectedAccountsForOrganizationAsync(
            DescribeAffectedAccountsForOrganizationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAffectedAccountsForOrganizationRequest, DescribeAffectedAccountsForOrganizationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAffectedEntitiesResult> describeAffectedEntitiesAsync(DescribeAffectedEntitiesRequest request) {

        return describeAffectedEntitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAffectedEntitiesResult> describeAffectedEntitiesAsync(DescribeAffectedEntitiesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAffectedEntitiesRequest, DescribeAffectedEntitiesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAffectedEntitiesForOrganizationResult> describeAffectedEntitiesForOrganizationAsync(
            DescribeAffectedEntitiesForOrganizationRequest request) {

        return describeAffectedEntitiesForOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAffectedEntitiesForOrganizationResult> describeAffectedEntitiesForOrganizationAsync(
            DescribeAffectedEntitiesForOrganizationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAffectedEntitiesForOrganizationRequest, DescribeAffectedEntitiesForOrganizationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEntityAggregatesResult> describeEntityAggregatesAsync(DescribeEntityAggregatesRequest request) {

        return describeEntityAggregatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEntityAggregatesResult> describeEntityAggregatesAsync(DescribeEntityAggregatesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEntityAggregatesRequest, DescribeEntityAggregatesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEventAggregatesResult> describeEventAggregatesAsync(DescribeEventAggregatesRequest request) {

        return describeEventAggregatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventAggregatesResult> describeEventAggregatesAsync(DescribeEventAggregatesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEventAggregatesRequest, DescribeEventAggregatesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEventDetailsResult> describeEventDetailsAsync(DescribeEventDetailsRequest request) {

        return describeEventDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventDetailsResult> describeEventDetailsAsync(DescribeEventDetailsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEventDetailsRequest, DescribeEventDetailsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEventDetailsForOrganizationResult> describeEventDetailsForOrganizationAsync(
            DescribeEventDetailsForOrganizationRequest request) {

        return describeEventDetailsForOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventDetailsForOrganizationResult> describeEventDetailsForOrganizationAsync(
            DescribeEventDetailsForOrganizationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEventDetailsForOrganizationRequest, DescribeEventDetailsForOrganizationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEventTypesResult> describeEventTypesAsync(DescribeEventTypesRequest request) {

        return describeEventTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventTypesResult> describeEventTypesAsync(DescribeEventTypesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEventTypesRequest, DescribeEventTypesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest request) {

        return describeEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEventsForOrganizationResult> describeEventsForOrganizationAsync(DescribeEventsForOrganizationRequest request) {

        return describeEventsForOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventsForOrganizationResult> describeEventsForOrganizationAsync(DescribeEventsForOrganizationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEventsForOrganizationRequest, DescribeEventsForOrganizationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeHealthServiceStatusForOrganizationResult> describeHealthServiceStatusForOrganizationAsync(
            DescribeHealthServiceStatusForOrganizationRequest request) {

        return describeHealthServiceStatusForOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHealthServiceStatusForOrganizationResult> describeHealthServiceStatusForOrganizationAsync(
            DescribeHealthServiceStatusForOrganizationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeHealthServiceStatusForOrganizationRequest, DescribeHealthServiceStatusForOrganizationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisableHealthServiceAccessForOrganizationResult> disableHealthServiceAccessForOrganizationAsync(
            DisableHealthServiceAccessForOrganizationRequest request) {

        return disableHealthServiceAccessForOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableHealthServiceAccessForOrganizationResult> disableHealthServiceAccessForOrganizationAsync(
            DisableHealthServiceAccessForOrganizationRequest request,
            com.amazonaws.handlers.AsyncHandler<DisableHealthServiceAccessForOrganizationRequest, DisableHealthServiceAccessForOrganizationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EnableHealthServiceAccessForOrganizationResult> enableHealthServiceAccessForOrganizationAsync(
            EnableHealthServiceAccessForOrganizationRequest request) {

        return enableHealthServiceAccessForOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableHealthServiceAccessForOrganizationResult> enableHealthServiceAccessForOrganizationAsync(
            EnableHealthServiceAccessForOrganizationRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableHealthServiceAccessForOrganizationRequest, EnableHealthServiceAccessForOrganizationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
