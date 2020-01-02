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
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Ground Station asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Welcome to the AWS Ground Station API Reference. AWS Ground Station is a fully managed service that enables you to
 * control satellite communications, downlink and process satellite data, and scale your satellite operations
 * efficiently and cost-effectively without having to build or manage your own ground station infrastructure.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSGroundStationAsyncClient extends AWSGroundStationClient implements AWSGroundStationAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSGroundStationAsyncClientBuilder asyncBuilder() {
        return AWSGroundStationAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Ground Station using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSGroundStationAsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<CancelContactResult> cancelContactAsync(CancelContactRequest request) {

        return cancelContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelContactResult> cancelContactAsync(final CancelContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelContactRequest, CancelContactResult> asyncHandler) {
        final CancelContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelContactResult>() {
            @Override
            public CancelContactResult call() throws Exception {
                CancelContactResult result = null;

                try {
                    result = executeCancelContact(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateConfigResult> createConfigAsync(CreateConfigRequest request) {

        return createConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConfigResult> createConfigAsync(final CreateConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConfigRequest, CreateConfigResult> asyncHandler) {
        final CreateConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConfigResult>() {
            @Override
            public CreateConfigResult call() throws Exception {
                CreateConfigResult result = null;

                try {
                    result = executeCreateConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDataflowEndpointGroupResult> createDataflowEndpointGroupAsync(CreateDataflowEndpointGroupRequest request) {

        return createDataflowEndpointGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataflowEndpointGroupResult> createDataflowEndpointGroupAsync(final CreateDataflowEndpointGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDataflowEndpointGroupRequest, CreateDataflowEndpointGroupResult> asyncHandler) {
        final CreateDataflowEndpointGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDataflowEndpointGroupResult>() {
            @Override
            public CreateDataflowEndpointGroupResult call() throws Exception {
                CreateDataflowEndpointGroupResult result = null;

                try {
                    result = executeCreateDataflowEndpointGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateMissionProfileResult> createMissionProfileAsync(CreateMissionProfileRequest request) {

        return createMissionProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMissionProfileResult> createMissionProfileAsync(final CreateMissionProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMissionProfileRequest, CreateMissionProfileResult> asyncHandler) {
        final CreateMissionProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMissionProfileResult>() {
            @Override
            public CreateMissionProfileResult call() throws Exception {
                CreateMissionProfileResult result = null;

                try {
                    result = executeCreateMissionProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigResult> deleteConfigAsync(DeleteConfigRequest request) {

        return deleteConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigResult> deleteConfigAsync(final DeleteConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConfigRequest, DeleteConfigResult> asyncHandler) {
        final DeleteConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConfigResult>() {
            @Override
            public DeleteConfigResult call() throws Exception {
                DeleteConfigResult result = null;

                try {
                    result = executeDeleteConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDataflowEndpointGroupResult> deleteDataflowEndpointGroupAsync(DeleteDataflowEndpointGroupRequest request) {

        return deleteDataflowEndpointGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataflowEndpointGroupResult> deleteDataflowEndpointGroupAsync(final DeleteDataflowEndpointGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDataflowEndpointGroupRequest, DeleteDataflowEndpointGroupResult> asyncHandler) {
        final DeleteDataflowEndpointGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDataflowEndpointGroupResult>() {
            @Override
            public DeleteDataflowEndpointGroupResult call() throws Exception {
                DeleteDataflowEndpointGroupResult result = null;

                try {
                    result = executeDeleteDataflowEndpointGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteMissionProfileResult> deleteMissionProfileAsync(DeleteMissionProfileRequest request) {

        return deleteMissionProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMissionProfileResult> deleteMissionProfileAsync(final DeleteMissionProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMissionProfileRequest, DeleteMissionProfileResult> asyncHandler) {
        final DeleteMissionProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMissionProfileResult>() {
            @Override
            public DeleteMissionProfileResult call() throws Exception {
                DeleteMissionProfileResult result = null;

                try {
                    result = executeDeleteMissionProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeContactResult> describeContactAsync(DescribeContactRequest request) {

        return describeContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeContactResult> describeContactAsync(final DescribeContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeContactRequest, DescribeContactResult> asyncHandler) {
        final DescribeContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeContactResult>() {
            @Override
            public DescribeContactResult call() throws Exception {
                DescribeContactResult result = null;

                try {
                    result = executeDescribeContact(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetConfigResult> getConfigAsync(GetConfigRequest request) {

        return getConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConfigResult> getConfigAsync(final GetConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConfigRequest, GetConfigResult> asyncHandler) {
        final GetConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConfigResult>() {
            @Override
            public GetConfigResult call() throws Exception {
                GetConfigResult result = null;

                try {
                    result = executeGetConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDataflowEndpointGroupResult> getDataflowEndpointGroupAsync(GetDataflowEndpointGroupRequest request) {

        return getDataflowEndpointGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataflowEndpointGroupResult> getDataflowEndpointGroupAsync(final GetDataflowEndpointGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDataflowEndpointGroupRequest, GetDataflowEndpointGroupResult> asyncHandler) {
        final GetDataflowEndpointGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDataflowEndpointGroupResult>() {
            @Override
            public GetDataflowEndpointGroupResult call() throws Exception {
                GetDataflowEndpointGroupResult result = null;

                try {
                    result = executeGetDataflowEndpointGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetMinuteUsageResult> getMinuteUsageAsync(GetMinuteUsageRequest request) {

        return getMinuteUsageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMinuteUsageResult> getMinuteUsageAsync(final GetMinuteUsageRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMinuteUsageRequest, GetMinuteUsageResult> asyncHandler) {
        final GetMinuteUsageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMinuteUsageResult>() {
            @Override
            public GetMinuteUsageResult call() throws Exception {
                GetMinuteUsageResult result = null;

                try {
                    result = executeGetMinuteUsage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetMissionProfileResult> getMissionProfileAsync(GetMissionProfileRequest request) {

        return getMissionProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMissionProfileResult> getMissionProfileAsync(final GetMissionProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMissionProfileRequest, GetMissionProfileResult> asyncHandler) {
        final GetMissionProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMissionProfileResult>() {
            @Override
            public GetMissionProfileResult call() throws Exception {
                GetMissionProfileResult result = null;

                try {
                    result = executeGetMissionProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSatelliteResult> getSatelliteAsync(GetSatelliteRequest request) {

        return getSatelliteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSatelliteResult> getSatelliteAsync(final GetSatelliteRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSatelliteRequest, GetSatelliteResult> asyncHandler) {
        final GetSatelliteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSatelliteResult>() {
            @Override
            public GetSatelliteResult call() throws Exception {
                GetSatelliteResult result = null;

                try {
                    result = executeGetSatellite(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListConfigsResult> listConfigsAsync(ListConfigsRequest request) {

        return listConfigsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConfigsResult> listConfigsAsync(final ListConfigsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConfigsRequest, ListConfigsResult> asyncHandler) {
        final ListConfigsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListConfigsResult>() {
            @Override
            public ListConfigsResult call() throws Exception {
                ListConfigsResult result = null;

                try {
                    result = executeListConfigs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListContactsResult> listContactsAsync(ListContactsRequest request) {

        return listContactsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListContactsResult> listContactsAsync(final ListContactsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListContactsRequest, ListContactsResult> asyncHandler) {
        final ListContactsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListContactsResult>() {
            @Override
            public ListContactsResult call() throws Exception {
                ListContactsResult result = null;

                try {
                    result = executeListContacts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDataflowEndpointGroupsResult> listDataflowEndpointGroupsAsync(ListDataflowEndpointGroupsRequest request) {

        return listDataflowEndpointGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataflowEndpointGroupsResult> listDataflowEndpointGroupsAsync(final ListDataflowEndpointGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDataflowEndpointGroupsRequest, ListDataflowEndpointGroupsResult> asyncHandler) {
        final ListDataflowEndpointGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDataflowEndpointGroupsResult>() {
            @Override
            public ListDataflowEndpointGroupsResult call() throws Exception {
                ListDataflowEndpointGroupsResult result = null;

                try {
                    result = executeListDataflowEndpointGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListGroundStationsResult> listGroundStationsAsync(ListGroundStationsRequest request) {

        return listGroundStationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGroundStationsResult> listGroundStationsAsync(final ListGroundStationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGroundStationsRequest, ListGroundStationsResult> asyncHandler) {
        final ListGroundStationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGroundStationsResult>() {
            @Override
            public ListGroundStationsResult call() throws Exception {
                ListGroundStationsResult result = null;

                try {
                    result = executeListGroundStations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListMissionProfilesResult> listMissionProfilesAsync(ListMissionProfilesRequest request) {

        return listMissionProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMissionProfilesResult> listMissionProfilesAsync(final ListMissionProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMissionProfilesRequest, ListMissionProfilesResult> asyncHandler) {
        final ListMissionProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMissionProfilesResult>() {
            @Override
            public ListMissionProfilesResult call() throws Exception {
                ListMissionProfilesResult result = null;

                try {
                    result = executeListMissionProfiles(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSatellitesResult> listSatellitesAsync(ListSatellitesRequest request) {

        return listSatellitesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSatellitesResult> listSatellitesAsync(final ListSatellitesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSatellitesRequest, ListSatellitesResult> asyncHandler) {
        final ListSatellitesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSatellitesResult>() {
            @Override
            public ListSatellitesResult call() throws Exception {
                ListSatellitesResult result = null;

                try {
                    result = executeListSatellites(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ReserveContactResult> reserveContactAsync(ReserveContactRequest request) {

        return reserveContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReserveContactResult> reserveContactAsync(final ReserveContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReserveContactRequest, ReserveContactResult> asyncHandler) {
        final ReserveContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReserveContactResult>() {
            @Override
            public ReserveContactResult call() throws Exception {
                ReserveContactResult result = null;

                try {
                    result = executeReserveContact(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigResult> updateConfigAsync(UpdateConfigRequest request) {

        return updateConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigResult> updateConfigAsync(final UpdateConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateConfigRequest, UpdateConfigResult> asyncHandler) {
        final UpdateConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateConfigResult>() {
            @Override
            public UpdateConfigResult call() throws Exception {
                UpdateConfigResult result = null;

                try {
                    result = executeUpdateConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateMissionProfileResult> updateMissionProfileAsync(UpdateMissionProfileRequest request) {

        return updateMissionProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMissionProfileResult> updateMissionProfileAsync(final UpdateMissionProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMissionProfileRequest, UpdateMissionProfileResult> asyncHandler) {
        final UpdateMissionProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMissionProfileResult>() {
            @Override
            public UpdateMissionProfileResult call() throws Exception {
                UpdateMissionProfileResult result = null;

                try {
                    result = executeUpdateMissionProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
