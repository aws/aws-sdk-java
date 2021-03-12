/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediatailor;

import javax.annotation.Generated;

import com.amazonaws.services.mediatailor.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing MediaTailor asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Use the AWS Elemental MediaTailor SDKs and CLI to configure scalable ad insertion and linear channels. With
 * MediaTailor, you can assemble existing content into a linear stream and serve targeted ads to viewers while
 * maintaining broadcast quality in over-the-top (OTT) video applications. For information about using the service,
 * including detailed information about the settings covered in this guide, see the <a
 * href="https://docs.aws.amazon.com/mediatailor/latest/ug/">AWS Elemental MediaTailor User Guide</a>.
 * </p>
 * <p>
 * Through the SDKs and the CLI you manage AWS Elemental MediaTailor configurations and channels the same as you do
 * through the console. For example, you specify ad insertion behavior and mapping information for the origin server and
 * the ad decision server (ADS).
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMediaTailorAsyncClient extends AWSMediaTailorClient implements AWSMediaTailorAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSMediaTailorAsyncClientBuilder asyncBuilder() {
        return AWSMediaTailorAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on MediaTailor using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSMediaTailorAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on MediaTailor using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSMediaTailorAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
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
    public java.util.concurrent.Future<CreateChannelResult> createChannelAsync(CreateChannelRequest request) {

        return createChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateChannelResult> createChannelAsync(final CreateChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateChannelRequest, CreateChannelResult> asyncHandler) {
        final CreateChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateChannelResult>() {
            @Override
            public CreateChannelResult call() throws Exception {
                CreateChannelResult result = null;

                try {
                    result = executeCreateChannel(finalRequest);
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
    public java.util.concurrent.Future<CreateProgramResult> createProgramAsync(CreateProgramRequest request) {

        return createProgramAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProgramResult> createProgramAsync(final CreateProgramRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProgramRequest, CreateProgramResult> asyncHandler) {
        final CreateProgramRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateProgramResult>() {
            @Override
            public CreateProgramResult call() throws Exception {
                CreateProgramResult result = null;

                try {
                    result = executeCreateProgram(finalRequest);
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
    public java.util.concurrent.Future<CreateSourceLocationResult> createSourceLocationAsync(CreateSourceLocationRequest request) {

        return createSourceLocationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSourceLocationResult> createSourceLocationAsync(final CreateSourceLocationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSourceLocationRequest, CreateSourceLocationResult> asyncHandler) {
        final CreateSourceLocationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSourceLocationResult>() {
            @Override
            public CreateSourceLocationResult call() throws Exception {
                CreateSourceLocationResult result = null;

                try {
                    result = executeCreateSourceLocation(finalRequest);
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
    public java.util.concurrent.Future<CreateVodSourceResult> createVodSourceAsync(CreateVodSourceRequest request) {

        return createVodSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVodSourceResult> createVodSourceAsync(final CreateVodSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVodSourceRequest, CreateVodSourceResult> asyncHandler) {
        final CreateVodSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVodSourceResult>() {
            @Override
            public CreateVodSourceResult call() throws Exception {
                CreateVodSourceResult result = null;

                try {
                    result = executeCreateVodSource(finalRequest);
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
    public java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(DeleteChannelRequest request) {

        return deleteChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(final DeleteChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteChannelRequest, DeleteChannelResult> asyncHandler) {
        final DeleteChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteChannelResult>() {
            @Override
            public DeleteChannelResult call() throws Exception {
                DeleteChannelResult result = null;

                try {
                    result = executeDeleteChannel(finalRequest);
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
    public java.util.concurrent.Future<DeleteChannelPolicyResult> deleteChannelPolicyAsync(DeleteChannelPolicyRequest request) {

        return deleteChannelPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteChannelPolicyResult> deleteChannelPolicyAsync(final DeleteChannelPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteChannelPolicyRequest, DeleteChannelPolicyResult> asyncHandler) {
        final DeleteChannelPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteChannelPolicyResult>() {
            @Override
            public DeleteChannelPolicyResult call() throws Exception {
                DeleteChannelPolicyResult result = null;

                try {
                    result = executeDeleteChannelPolicy(finalRequest);
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
    public java.util.concurrent.Future<DeletePlaybackConfigurationResult> deletePlaybackConfigurationAsync(DeletePlaybackConfigurationRequest request) {

        return deletePlaybackConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePlaybackConfigurationResult> deletePlaybackConfigurationAsync(final DeletePlaybackConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePlaybackConfigurationRequest, DeletePlaybackConfigurationResult> asyncHandler) {
        final DeletePlaybackConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePlaybackConfigurationResult>() {
            @Override
            public DeletePlaybackConfigurationResult call() throws Exception {
                DeletePlaybackConfigurationResult result = null;

                try {
                    result = executeDeletePlaybackConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DeleteProgramResult> deleteProgramAsync(DeleteProgramRequest request) {

        return deleteProgramAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProgramResult> deleteProgramAsync(final DeleteProgramRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProgramRequest, DeleteProgramResult> asyncHandler) {
        final DeleteProgramRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProgramResult>() {
            @Override
            public DeleteProgramResult call() throws Exception {
                DeleteProgramResult result = null;

                try {
                    result = executeDeleteProgram(finalRequest);
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
    public java.util.concurrent.Future<DeleteSourceLocationResult> deleteSourceLocationAsync(DeleteSourceLocationRequest request) {

        return deleteSourceLocationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSourceLocationResult> deleteSourceLocationAsync(final DeleteSourceLocationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSourceLocationRequest, DeleteSourceLocationResult> asyncHandler) {
        final DeleteSourceLocationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSourceLocationResult>() {
            @Override
            public DeleteSourceLocationResult call() throws Exception {
                DeleteSourceLocationResult result = null;

                try {
                    result = executeDeleteSourceLocation(finalRequest);
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
    public java.util.concurrent.Future<DeleteVodSourceResult> deleteVodSourceAsync(DeleteVodSourceRequest request) {

        return deleteVodSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVodSourceResult> deleteVodSourceAsync(final DeleteVodSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVodSourceRequest, DeleteVodSourceResult> asyncHandler) {
        final DeleteVodSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVodSourceResult>() {
            @Override
            public DeleteVodSourceResult call() throws Exception {
                DeleteVodSourceResult result = null;

                try {
                    result = executeDeleteVodSource(finalRequest);
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
    public java.util.concurrent.Future<DescribeChannelResult> describeChannelAsync(DescribeChannelRequest request) {

        return describeChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeChannelResult> describeChannelAsync(final DescribeChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeChannelRequest, DescribeChannelResult> asyncHandler) {
        final DescribeChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeChannelResult>() {
            @Override
            public DescribeChannelResult call() throws Exception {
                DescribeChannelResult result = null;

                try {
                    result = executeDescribeChannel(finalRequest);
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
    public java.util.concurrent.Future<DescribeProgramResult> describeProgramAsync(DescribeProgramRequest request) {

        return describeProgramAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProgramResult> describeProgramAsync(final DescribeProgramRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeProgramRequest, DescribeProgramResult> asyncHandler) {
        final DescribeProgramRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeProgramResult>() {
            @Override
            public DescribeProgramResult call() throws Exception {
                DescribeProgramResult result = null;

                try {
                    result = executeDescribeProgram(finalRequest);
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
    public java.util.concurrent.Future<DescribeSourceLocationResult> describeSourceLocationAsync(DescribeSourceLocationRequest request) {

        return describeSourceLocationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSourceLocationResult> describeSourceLocationAsync(final DescribeSourceLocationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSourceLocationRequest, DescribeSourceLocationResult> asyncHandler) {
        final DescribeSourceLocationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSourceLocationResult>() {
            @Override
            public DescribeSourceLocationResult call() throws Exception {
                DescribeSourceLocationResult result = null;

                try {
                    result = executeDescribeSourceLocation(finalRequest);
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
    public java.util.concurrent.Future<DescribeVodSourceResult> describeVodSourceAsync(DescribeVodSourceRequest request) {

        return describeVodSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVodSourceResult> describeVodSourceAsync(final DescribeVodSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVodSourceRequest, DescribeVodSourceResult> asyncHandler) {
        final DescribeVodSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVodSourceResult>() {
            @Override
            public DescribeVodSourceResult call() throws Exception {
                DescribeVodSourceResult result = null;

                try {
                    result = executeDescribeVodSource(finalRequest);
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
    public java.util.concurrent.Future<GetChannelPolicyResult> getChannelPolicyAsync(GetChannelPolicyRequest request) {

        return getChannelPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetChannelPolicyResult> getChannelPolicyAsync(final GetChannelPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetChannelPolicyRequest, GetChannelPolicyResult> asyncHandler) {
        final GetChannelPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetChannelPolicyResult>() {
            @Override
            public GetChannelPolicyResult call() throws Exception {
                GetChannelPolicyResult result = null;

                try {
                    result = executeGetChannelPolicy(finalRequest);
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
    public java.util.concurrent.Future<GetChannelScheduleResult> getChannelScheduleAsync(GetChannelScheduleRequest request) {

        return getChannelScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetChannelScheduleResult> getChannelScheduleAsync(final GetChannelScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetChannelScheduleRequest, GetChannelScheduleResult> asyncHandler) {
        final GetChannelScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetChannelScheduleResult>() {
            @Override
            public GetChannelScheduleResult call() throws Exception {
                GetChannelScheduleResult result = null;

                try {
                    result = executeGetChannelSchedule(finalRequest);
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
    public java.util.concurrent.Future<GetPlaybackConfigurationResult> getPlaybackConfigurationAsync(GetPlaybackConfigurationRequest request) {

        return getPlaybackConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPlaybackConfigurationResult> getPlaybackConfigurationAsync(final GetPlaybackConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPlaybackConfigurationRequest, GetPlaybackConfigurationResult> asyncHandler) {
        final GetPlaybackConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPlaybackConfigurationResult>() {
            @Override
            public GetPlaybackConfigurationResult call() throws Exception {
                GetPlaybackConfigurationResult result = null;

                try {
                    result = executeGetPlaybackConfiguration(finalRequest);
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
    public java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest request) {

        return listChannelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(final ListChannelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListChannelsRequest, ListChannelsResult> asyncHandler) {
        final ListChannelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListChannelsResult>() {
            @Override
            public ListChannelsResult call() throws Exception {
                ListChannelsResult result = null;

                try {
                    result = executeListChannels(finalRequest);
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
    public java.util.concurrent.Future<ListPlaybackConfigurationsResult> listPlaybackConfigurationsAsync(ListPlaybackConfigurationsRequest request) {

        return listPlaybackConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPlaybackConfigurationsResult> listPlaybackConfigurationsAsync(final ListPlaybackConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPlaybackConfigurationsRequest, ListPlaybackConfigurationsResult> asyncHandler) {
        final ListPlaybackConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPlaybackConfigurationsResult>() {
            @Override
            public ListPlaybackConfigurationsResult call() throws Exception {
                ListPlaybackConfigurationsResult result = null;

                try {
                    result = executeListPlaybackConfigurations(finalRequest);
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
    public java.util.concurrent.Future<ListProgramsResult> listProgramsAsync(ListProgramsRequest request) {

        return listProgramsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProgramsResult> listProgramsAsync(final ListProgramsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProgramsRequest, ListProgramsResult> asyncHandler) {
        final ListProgramsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProgramsResult>() {
            @Override
            public ListProgramsResult call() throws Exception {
                ListProgramsResult result = null;

                try {
                    result = executeListPrograms(finalRequest);
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
    public java.util.concurrent.Future<ListSourceLocationsResult> listSourceLocationsAsync(ListSourceLocationsRequest request) {

        return listSourceLocationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSourceLocationsResult> listSourceLocationsAsync(final ListSourceLocationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSourceLocationsRequest, ListSourceLocationsResult> asyncHandler) {
        final ListSourceLocationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSourceLocationsResult>() {
            @Override
            public ListSourceLocationsResult call() throws Exception {
                ListSourceLocationsResult result = null;

                try {
                    result = executeListSourceLocations(finalRequest);
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
    public java.util.concurrent.Future<ListVodSourcesResult> listVodSourcesAsync(ListVodSourcesRequest request) {

        return listVodSourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVodSourcesResult> listVodSourcesAsync(final ListVodSourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVodSourcesRequest, ListVodSourcesResult> asyncHandler) {
        final ListVodSourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVodSourcesResult>() {
            @Override
            public ListVodSourcesResult call() throws Exception {
                ListVodSourcesResult result = null;

                try {
                    result = executeListVodSources(finalRequest);
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
    public java.util.concurrent.Future<PutChannelPolicyResult> putChannelPolicyAsync(PutChannelPolicyRequest request) {

        return putChannelPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutChannelPolicyResult> putChannelPolicyAsync(final PutChannelPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutChannelPolicyRequest, PutChannelPolicyResult> asyncHandler) {
        final PutChannelPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutChannelPolicyResult>() {
            @Override
            public PutChannelPolicyResult call() throws Exception {
                PutChannelPolicyResult result = null;

                try {
                    result = executePutChannelPolicy(finalRequest);
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
    public java.util.concurrent.Future<PutPlaybackConfigurationResult> putPlaybackConfigurationAsync(PutPlaybackConfigurationRequest request) {

        return putPlaybackConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutPlaybackConfigurationResult> putPlaybackConfigurationAsync(final PutPlaybackConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutPlaybackConfigurationRequest, PutPlaybackConfigurationResult> asyncHandler) {
        final PutPlaybackConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutPlaybackConfigurationResult>() {
            @Override
            public PutPlaybackConfigurationResult call() throws Exception {
                PutPlaybackConfigurationResult result = null;

                try {
                    result = executePutPlaybackConfiguration(finalRequest);
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
    public java.util.concurrent.Future<StartChannelResult> startChannelAsync(StartChannelRequest request) {

        return startChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartChannelResult> startChannelAsync(final StartChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartChannelRequest, StartChannelResult> asyncHandler) {
        final StartChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartChannelResult>() {
            @Override
            public StartChannelResult call() throws Exception {
                StartChannelResult result = null;

                try {
                    result = executeStartChannel(finalRequest);
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
    public java.util.concurrent.Future<StopChannelResult> stopChannelAsync(StopChannelRequest request) {

        return stopChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopChannelResult> stopChannelAsync(final StopChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopChannelRequest, StopChannelResult> asyncHandler) {
        final StopChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopChannelResult>() {
            @Override
            public StopChannelResult call() throws Exception {
                StopChannelResult result = null;

                try {
                    result = executeStopChannel(finalRequest);
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
    public java.util.concurrent.Future<UpdateChannelResult> updateChannelAsync(UpdateChannelRequest request) {

        return updateChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateChannelResult> updateChannelAsync(final UpdateChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateChannelRequest, UpdateChannelResult> asyncHandler) {
        final UpdateChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateChannelResult>() {
            @Override
            public UpdateChannelResult call() throws Exception {
                UpdateChannelResult result = null;

                try {
                    result = executeUpdateChannel(finalRequest);
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
    public java.util.concurrent.Future<UpdateSourceLocationResult> updateSourceLocationAsync(UpdateSourceLocationRequest request) {

        return updateSourceLocationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSourceLocationResult> updateSourceLocationAsync(final UpdateSourceLocationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSourceLocationRequest, UpdateSourceLocationResult> asyncHandler) {
        final UpdateSourceLocationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSourceLocationResult>() {
            @Override
            public UpdateSourceLocationResult call() throws Exception {
                UpdateSourceLocationResult result = null;

                try {
                    result = executeUpdateSourceLocation(finalRequest);
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
    public java.util.concurrent.Future<UpdateVodSourceResult> updateVodSourceAsync(UpdateVodSourceRequest request) {

        return updateVodSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVodSourceResult> updateVodSourceAsync(final UpdateVodSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateVodSourceRequest, UpdateVodSourceResult> asyncHandler) {
        final UpdateVodSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateVodSourceResult>() {
            @Override
            public UpdateVodSourceResult call() throws Exception {
                UpdateVodSourceResult result = null;

                try {
                    result = executeUpdateVodSource(finalRequest);
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
