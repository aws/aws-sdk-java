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
package com.amazonaws.services.groundstation;

import javax.annotation.Generated;

import com.amazonaws.services.groundstation.model.*;

/**
 * Abstract implementation of {@code AWSGroundStationAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSGroundStationAsync extends AbstractAWSGroundStation implements AWSGroundStationAsync {

    protected AbstractAWSGroundStationAsync() {
    }

    @Override
    public java.util.concurrent.Future<CancelContactResult> cancelContactAsync(CancelContactRequest request) {

        return cancelContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelContactResult> cancelContactAsync(CancelContactRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelContactRequest, CancelContactResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateConfigResult> createConfigAsync(CreateConfigRequest request) {

        return createConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConfigResult> createConfigAsync(CreateConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateConfigRequest, CreateConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDataflowEndpointGroupResult> createDataflowEndpointGroupAsync(CreateDataflowEndpointGroupRequest request) {

        return createDataflowEndpointGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataflowEndpointGroupResult> createDataflowEndpointGroupAsync(CreateDataflowEndpointGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDataflowEndpointGroupRequest, CreateDataflowEndpointGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateMissionProfileResult> createMissionProfileAsync(CreateMissionProfileRequest request) {

        return createMissionProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMissionProfileResult> createMissionProfileAsync(CreateMissionProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateMissionProfileRequest, CreateMissionProfileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigResult> deleteConfigAsync(DeleteConfigRequest request) {

        return deleteConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigResult> deleteConfigAsync(DeleteConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteConfigRequest, DeleteConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDataflowEndpointGroupResult> deleteDataflowEndpointGroupAsync(DeleteDataflowEndpointGroupRequest request) {

        return deleteDataflowEndpointGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataflowEndpointGroupResult> deleteDataflowEndpointGroupAsync(DeleteDataflowEndpointGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDataflowEndpointGroupRequest, DeleteDataflowEndpointGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteMissionProfileResult> deleteMissionProfileAsync(DeleteMissionProfileRequest request) {

        return deleteMissionProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMissionProfileResult> deleteMissionProfileAsync(DeleteMissionProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteMissionProfileRequest, DeleteMissionProfileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeContactResult> describeContactAsync(DescribeContactRequest request) {

        return describeContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeContactResult> describeContactAsync(DescribeContactRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeContactRequest, DescribeContactResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
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
    public java.util.concurrent.Future<GetDataflowEndpointGroupResult> getDataflowEndpointGroupAsync(GetDataflowEndpointGroupRequest request) {

        return getDataflowEndpointGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataflowEndpointGroupResult> getDataflowEndpointGroupAsync(GetDataflowEndpointGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDataflowEndpointGroupRequest, GetDataflowEndpointGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetMinuteUsageResult> getMinuteUsageAsync(GetMinuteUsageRequest request) {

        return getMinuteUsageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMinuteUsageResult> getMinuteUsageAsync(GetMinuteUsageRequest request,
            com.amazonaws.handlers.AsyncHandler<GetMinuteUsageRequest, GetMinuteUsageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetMissionProfileResult> getMissionProfileAsync(GetMissionProfileRequest request) {

        return getMissionProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMissionProfileResult> getMissionProfileAsync(GetMissionProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<GetMissionProfileRequest, GetMissionProfileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSatelliteResult> getSatelliteAsync(GetSatelliteRequest request) {

        return getSatelliteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSatelliteResult> getSatelliteAsync(GetSatelliteRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSatelliteRequest, GetSatelliteResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListConfigsResult> listConfigsAsync(ListConfigsRequest request) {

        return listConfigsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConfigsResult> listConfigsAsync(ListConfigsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListConfigsRequest, ListConfigsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListContactsResult> listContactsAsync(ListContactsRequest request) {

        return listContactsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListContactsResult> listContactsAsync(ListContactsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListContactsRequest, ListContactsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDataflowEndpointGroupsResult> listDataflowEndpointGroupsAsync(ListDataflowEndpointGroupsRequest request) {

        return listDataflowEndpointGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataflowEndpointGroupsResult> listDataflowEndpointGroupsAsync(ListDataflowEndpointGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDataflowEndpointGroupsRequest, ListDataflowEndpointGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListGroundStationsResult> listGroundStationsAsync(ListGroundStationsRequest request) {

        return listGroundStationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGroundStationsResult> listGroundStationsAsync(ListGroundStationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListGroundStationsRequest, ListGroundStationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListMissionProfilesResult> listMissionProfilesAsync(ListMissionProfilesRequest request) {

        return listMissionProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMissionProfilesResult> listMissionProfilesAsync(ListMissionProfilesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListMissionProfilesRequest, ListMissionProfilesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSatellitesResult> listSatellitesAsync(ListSatellitesRequest request) {

        return listSatellitesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSatellitesResult> listSatellitesAsync(ListSatellitesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSatellitesRequest, ListSatellitesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
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
    public java.util.concurrent.Future<ReserveContactResult> reserveContactAsync(ReserveContactRequest request) {

        return reserveContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReserveContactResult> reserveContactAsync(ReserveContactRequest request,
            com.amazonaws.handlers.AsyncHandler<ReserveContactRequest, ReserveContactResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigResult> updateConfigAsync(UpdateConfigRequest request) {

        return updateConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigResult> updateConfigAsync(UpdateConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateConfigRequest, UpdateConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateMissionProfileResult> updateMissionProfileAsync(UpdateMissionProfileRequest request) {

        return updateMissionProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMissionProfileResult> updateMissionProfileAsync(UpdateMissionProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateMissionProfileRequest, UpdateMissionProfileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
