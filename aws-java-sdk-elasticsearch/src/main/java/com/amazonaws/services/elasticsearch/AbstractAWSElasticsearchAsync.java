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
package com.amazonaws.services.elasticsearch;

import javax.annotation.Generated;

import com.amazonaws.services.elasticsearch.model.*;

/**
 * Abstract implementation of {@code AWSElasticsearchAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSElasticsearchAsync extends AbstractAWSElasticsearch implements AWSElasticsearchAsync {

    protected AbstractAWSElasticsearchAsync() {
    }

    @Override
    public java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest request) {

        return addTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CancelElasticsearchServiceSoftwareUpdateResult> cancelElasticsearchServiceSoftwareUpdateAsync(
            CancelElasticsearchServiceSoftwareUpdateRequest request) {

        return cancelElasticsearchServiceSoftwareUpdateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelElasticsearchServiceSoftwareUpdateResult> cancelElasticsearchServiceSoftwareUpdateAsync(
            CancelElasticsearchServiceSoftwareUpdateRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelElasticsearchServiceSoftwareUpdateRequest, CancelElasticsearchServiceSoftwareUpdateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateElasticsearchDomainResult> createElasticsearchDomainAsync(CreateElasticsearchDomainRequest request) {

        return createElasticsearchDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateElasticsearchDomainResult> createElasticsearchDomainAsync(CreateElasticsearchDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateElasticsearchDomainRequest, CreateElasticsearchDomainResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteElasticsearchDomainResult> deleteElasticsearchDomainAsync(DeleteElasticsearchDomainRequest request) {

        return deleteElasticsearchDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteElasticsearchDomainResult> deleteElasticsearchDomainAsync(DeleteElasticsearchDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteElasticsearchDomainRequest, DeleteElasticsearchDomainResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteElasticsearchServiceRoleResult> deleteElasticsearchServiceRoleAsync(DeleteElasticsearchServiceRoleRequest request) {

        return deleteElasticsearchServiceRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteElasticsearchServiceRoleResult> deleteElasticsearchServiceRoleAsync(DeleteElasticsearchServiceRoleRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteElasticsearchServiceRoleRequest, DeleteElasticsearchServiceRoleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeElasticsearchDomainResult> describeElasticsearchDomainAsync(DescribeElasticsearchDomainRequest request) {

        return describeElasticsearchDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeElasticsearchDomainResult> describeElasticsearchDomainAsync(DescribeElasticsearchDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeElasticsearchDomainRequest, DescribeElasticsearchDomainResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeElasticsearchDomainConfigResult> describeElasticsearchDomainConfigAsync(
            DescribeElasticsearchDomainConfigRequest request) {

        return describeElasticsearchDomainConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeElasticsearchDomainConfigResult> describeElasticsearchDomainConfigAsync(
            DescribeElasticsearchDomainConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeElasticsearchDomainConfigRequest, DescribeElasticsearchDomainConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeElasticsearchDomainsResult> describeElasticsearchDomainsAsync(DescribeElasticsearchDomainsRequest request) {

        return describeElasticsearchDomainsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeElasticsearchDomainsResult> describeElasticsearchDomainsAsync(DescribeElasticsearchDomainsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeElasticsearchDomainsRequest, DescribeElasticsearchDomainsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeElasticsearchInstanceTypeLimitsResult> describeElasticsearchInstanceTypeLimitsAsync(
            DescribeElasticsearchInstanceTypeLimitsRequest request) {

        return describeElasticsearchInstanceTypeLimitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeElasticsearchInstanceTypeLimitsResult> describeElasticsearchInstanceTypeLimitsAsync(
            DescribeElasticsearchInstanceTypeLimitsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeElasticsearchInstanceTypeLimitsRequest, DescribeElasticsearchInstanceTypeLimitsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedElasticsearchInstanceOfferingsResult> describeReservedElasticsearchInstanceOfferingsAsync(
            DescribeReservedElasticsearchInstanceOfferingsRequest request) {

        return describeReservedElasticsearchInstanceOfferingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedElasticsearchInstanceOfferingsResult> describeReservedElasticsearchInstanceOfferingsAsync(
            DescribeReservedElasticsearchInstanceOfferingsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedElasticsearchInstanceOfferingsRequest, DescribeReservedElasticsearchInstanceOfferingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedElasticsearchInstancesResult> describeReservedElasticsearchInstancesAsync(
            DescribeReservedElasticsearchInstancesRequest request) {

        return describeReservedElasticsearchInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedElasticsearchInstancesResult> describeReservedElasticsearchInstancesAsync(
            DescribeReservedElasticsearchInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedElasticsearchInstancesRequest, DescribeReservedElasticsearchInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetCompatibleElasticsearchVersionsResult> getCompatibleElasticsearchVersionsAsync(
            GetCompatibleElasticsearchVersionsRequest request) {

        return getCompatibleElasticsearchVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCompatibleElasticsearchVersionsResult> getCompatibleElasticsearchVersionsAsync(
            GetCompatibleElasticsearchVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCompatibleElasticsearchVersionsRequest, GetCompatibleElasticsearchVersionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetUpgradeHistoryResult> getUpgradeHistoryAsync(GetUpgradeHistoryRequest request) {

        return getUpgradeHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUpgradeHistoryResult> getUpgradeHistoryAsync(GetUpgradeHistoryRequest request,
            com.amazonaws.handlers.AsyncHandler<GetUpgradeHistoryRequest, GetUpgradeHistoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetUpgradeStatusResult> getUpgradeStatusAsync(GetUpgradeStatusRequest request) {

        return getUpgradeStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUpgradeStatusResult> getUpgradeStatusAsync(GetUpgradeStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<GetUpgradeStatusRequest, GetUpgradeStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDomainNamesResult> listDomainNamesAsync(ListDomainNamesRequest request) {

        return listDomainNamesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDomainNamesResult> listDomainNamesAsync(ListDomainNamesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDomainNamesRequest, ListDomainNamesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListElasticsearchInstanceTypesResult> listElasticsearchInstanceTypesAsync(ListElasticsearchInstanceTypesRequest request) {

        return listElasticsearchInstanceTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListElasticsearchInstanceTypesResult> listElasticsearchInstanceTypesAsync(ListElasticsearchInstanceTypesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListElasticsearchInstanceTypesRequest, ListElasticsearchInstanceTypesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListElasticsearchVersionsResult> listElasticsearchVersionsAsync(ListElasticsearchVersionsRequest request) {

        return listElasticsearchVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListElasticsearchVersionsResult> listElasticsearchVersionsAsync(ListElasticsearchVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListElasticsearchVersionsRequest, ListElasticsearchVersionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest request) {

        return listTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PurchaseReservedElasticsearchInstanceOfferingResult> purchaseReservedElasticsearchInstanceOfferingAsync(
            PurchaseReservedElasticsearchInstanceOfferingRequest request) {

        return purchaseReservedElasticsearchInstanceOfferingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PurchaseReservedElasticsearchInstanceOfferingResult> purchaseReservedElasticsearchInstanceOfferingAsync(
            PurchaseReservedElasticsearchInstanceOfferingRequest request,
            com.amazonaws.handlers.AsyncHandler<PurchaseReservedElasticsearchInstanceOfferingRequest, PurchaseReservedElasticsearchInstanceOfferingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest request) {

        return removeTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsRequest, RemoveTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartElasticsearchServiceSoftwareUpdateResult> startElasticsearchServiceSoftwareUpdateAsync(
            StartElasticsearchServiceSoftwareUpdateRequest request) {

        return startElasticsearchServiceSoftwareUpdateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartElasticsearchServiceSoftwareUpdateResult> startElasticsearchServiceSoftwareUpdateAsync(
            StartElasticsearchServiceSoftwareUpdateRequest request,
            com.amazonaws.handlers.AsyncHandler<StartElasticsearchServiceSoftwareUpdateRequest, StartElasticsearchServiceSoftwareUpdateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateElasticsearchDomainConfigResult> updateElasticsearchDomainConfigAsync(
            UpdateElasticsearchDomainConfigRequest request) {

        return updateElasticsearchDomainConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateElasticsearchDomainConfigResult> updateElasticsearchDomainConfigAsync(
            UpdateElasticsearchDomainConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateElasticsearchDomainConfigRequest, UpdateElasticsearchDomainConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpgradeElasticsearchDomainResult> upgradeElasticsearchDomainAsync(UpgradeElasticsearchDomainRequest request) {

        return upgradeElasticsearchDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpgradeElasticsearchDomainResult> upgradeElasticsearchDomainAsync(UpgradeElasticsearchDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<UpgradeElasticsearchDomainRequest, UpgradeElasticsearchDomainResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
