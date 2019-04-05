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
package com.amazonaws.services.cloudhsm;

import javax.annotation.Generated;

import com.amazonaws.services.cloudhsm.model.*;

/**
 * Abstract implementation of {@code AWSCloudHSMAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSCloudHSMAsync extends AbstractAWSCloudHSM implements AWSCloudHSMAsync {

    protected AbstractAWSCloudHSMAsync() {
    }

    @Override
    public java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest request) {

        return addTagsToResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<AddTagsToResourceRequest, AddTagsToResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateHapgResult> createHapgAsync(CreateHapgRequest request) {

        return createHapgAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHapgResult> createHapgAsync(CreateHapgRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateHapgRequest, CreateHapgResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateHsmResult> createHsmAsync(CreateHsmRequest request) {

        return createHsmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHsmResult> createHsmAsync(CreateHsmRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateHsmRequest, CreateHsmResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateLunaClientResult> createLunaClientAsync(CreateLunaClientRequest request) {

        return createLunaClientAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLunaClientResult> createLunaClientAsync(CreateLunaClientRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateLunaClientRequest, CreateLunaClientResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteHapgResult> deleteHapgAsync(DeleteHapgRequest request) {

        return deleteHapgAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteHapgResult> deleteHapgAsync(DeleteHapgRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteHapgRequest, DeleteHapgResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteHsmResult> deleteHsmAsync(DeleteHsmRequest request) {

        return deleteHsmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteHsmResult> deleteHsmAsync(DeleteHsmRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteHsmRequest, DeleteHsmResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteLunaClientResult> deleteLunaClientAsync(DeleteLunaClientRequest request) {

        return deleteLunaClientAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLunaClientResult> deleteLunaClientAsync(DeleteLunaClientRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteLunaClientRequest, DeleteLunaClientResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeHapgResult> describeHapgAsync(DescribeHapgRequest request) {

        return describeHapgAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHapgResult> describeHapgAsync(DescribeHapgRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeHapgRequest, DescribeHapgResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeHsmResult> describeHsmAsync(DescribeHsmRequest request) {

        return describeHsmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHsmResult> describeHsmAsync(DescribeHsmRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeHsmRequest, DescribeHsmResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeHsm operation.
     *
     * @see #describeHsmAsync(DescribeHsmRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeHsmResult> describeHsmAsync() {

        return describeHsmAsync(new DescribeHsmRequest());
    }

    /**
     * Simplified method form for invoking the DescribeHsm operation with an AsyncHandler.
     *
     * @see #describeHsmAsync(DescribeHsmRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeHsmResult> describeHsmAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeHsmRequest, DescribeHsmResult> asyncHandler) {

        return describeHsmAsync(new DescribeHsmRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeLunaClientResult> describeLunaClientAsync(DescribeLunaClientRequest request) {

        return describeLunaClientAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLunaClientResult> describeLunaClientAsync(DescribeLunaClientRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLunaClientRequest, DescribeLunaClientResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeLunaClient operation.
     *
     * @see #describeLunaClientAsync(DescribeLunaClientRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeLunaClientResult> describeLunaClientAsync() {

        return describeLunaClientAsync(new DescribeLunaClientRequest());
    }

    /**
     * Simplified method form for invoking the DescribeLunaClient operation with an AsyncHandler.
     *
     * @see #describeLunaClientAsync(DescribeLunaClientRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeLunaClientResult> describeLunaClientAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeLunaClientRequest, DescribeLunaClientResult> asyncHandler) {

        return describeLunaClientAsync(new DescribeLunaClientRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetConfigResult> getConfigAsync(GetConfigRequest request) {

        return getConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConfigResult> getConfigAsync(GetConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<GetConfigRequest, GetConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAvailableZonesResult> listAvailableZonesAsync(ListAvailableZonesRequest request) {

        return listAvailableZonesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAvailableZonesResult> listAvailableZonesAsync(ListAvailableZonesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAvailableZonesRequest, ListAvailableZonesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListAvailableZones operation.
     *
     * @see #listAvailableZonesAsync(ListAvailableZonesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListAvailableZonesResult> listAvailableZonesAsync() {

        return listAvailableZonesAsync(new ListAvailableZonesRequest());
    }

    /**
     * Simplified method form for invoking the ListAvailableZones operation with an AsyncHandler.
     *
     * @see #listAvailableZonesAsync(ListAvailableZonesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListAvailableZonesResult> listAvailableZonesAsync(
            com.amazonaws.handlers.AsyncHandler<ListAvailableZonesRequest, ListAvailableZonesResult> asyncHandler) {

        return listAvailableZonesAsync(new ListAvailableZonesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListHapgsResult> listHapgsAsync(ListHapgsRequest request) {

        return listHapgsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHapgsResult> listHapgsAsync(ListHapgsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListHapgsRequest, ListHapgsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListHapgs operation.
     *
     * @see #listHapgsAsync(ListHapgsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListHapgsResult> listHapgsAsync() {

        return listHapgsAsync(new ListHapgsRequest());
    }

    /**
     * Simplified method form for invoking the ListHapgs operation with an AsyncHandler.
     *
     * @see #listHapgsAsync(ListHapgsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListHapgsResult> listHapgsAsync(com.amazonaws.handlers.AsyncHandler<ListHapgsRequest, ListHapgsResult> asyncHandler) {

        return listHapgsAsync(new ListHapgsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListHsmsResult> listHsmsAsync(ListHsmsRequest request) {

        return listHsmsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHsmsResult> listHsmsAsync(ListHsmsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListHsmsRequest, ListHsmsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListHsms operation.
     *
     * @see #listHsmsAsync(ListHsmsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListHsmsResult> listHsmsAsync() {

        return listHsmsAsync(new ListHsmsRequest());
    }

    /**
     * Simplified method form for invoking the ListHsms operation with an AsyncHandler.
     *
     * @see #listHsmsAsync(ListHsmsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListHsmsResult> listHsmsAsync(com.amazonaws.handlers.AsyncHandler<ListHsmsRequest, ListHsmsResult> asyncHandler) {

        return listHsmsAsync(new ListHsmsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListLunaClientsResult> listLunaClientsAsync(ListLunaClientsRequest request) {

        return listLunaClientsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLunaClientsResult> listLunaClientsAsync(ListLunaClientsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListLunaClientsRequest, ListLunaClientsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListLunaClients operation.
     *
     * @see #listLunaClientsAsync(ListLunaClientsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListLunaClientsResult> listLunaClientsAsync() {

        return listLunaClientsAsync(new ListLunaClientsRequest());
    }

    /**
     * Simplified method form for invoking the ListLunaClients operation with an AsyncHandler.
     *
     * @see #listLunaClientsAsync(ListLunaClientsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListLunaClientsResult> listLunaClientsAsync(
            com.amazonaws.handlers.AsyncHandler<ListLunaClientsRequest, ListLunaClientsResult> asyncHandler) {

        return listLunaClientsAsync(new ListLunaClientsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyHapgResult> modifyHapgAsync(ModifyHapgRequest request) {

        return modifyHapgAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyHapgResult> modifyHapgAsync(ModifyHapgRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyHapgRequest, ModifyHapgResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyHsmResult> modifyHsmAsync(ModifyHsmRequest request) {

        return modifyHsmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyHsmResult> modifyHsmAsync(ModifyHsmRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyHsmRequest, ModifyHsmResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyLunaClientResult> modifyLunaClientAsync(ModifyLunaClientRequest request) {

        return modifyLunaClientAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyLunaClientResult> modifyLunaClientAsync(ModifyLunaClientRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyLunaClientRequest, ModifyLunaClientResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest request) {

        return removeTagsFromResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
