/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcampaign;

import javax.annotation.Generated;

import com.amazonaws.services.connectcampaign.model.*;

/**
 * Interface for accessing AmazonConnectCampaignService asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.connectcampaign.AbstractAmazonConnectCampaignAsync} instead.
 * </p>
 * <p>
 * <p>
 * Provide APIs to create and manage Amazon Connect Campaigns.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonConnectCampaignAsync extends AmazonConnectCampaign {

    /**
     * <p>
     * Creates a campaign for the specified Amazon Connect account. This API is idempotent.
     * </p>
     * 
     * @param createCampaignRequest
     *        The request for Create Campaign API.
     * @return A Java Future containing the result of the CreateCampaign operation returned by the service.
     * @sample AmazonConnectCampaignAsync.CreateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/CreateCampaign"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCampaignResult> createCampaignAsync(CreateCampaignRequest createCampaignRequest);

    /**
     * <p>
     * Creates a campaign for the specified Amazon Connect account. This API is idempotent.
     * </p>
     * 
     * @param createCampaignRequest
     *        The request for Create Campaign API.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCampaign operation returned by the service.
     * @sample AmazonConnectCampaignAsyncHandler.CreateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/CreateCampaign"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCampaignResult> createCampaignAsync(CreateCampaignRequest createCampaignRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCampaignRequest, CreateCampaignResult> asyncHandler);

    /**
     * <p>
     * Deletes a campaign from the specified Amazon Connect account.
     * </p>
     * 
     * @param deleteCampaignRequest
     *        DeleteCampaignRequest
     * @return A Java Future containing the result of the DeleteCampaign operation returned by the service.
     * @sample AmazonConnectCampaignAsync.DeleteCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/DeleteCampaign"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCampaignResult> deleteCampaignAsync(DeleteCampaignRequest deleteCampaignRequest);

    /**
     * <p>
     * Deletes a campaign from the specified Amazon Connect account.
     * </p>
     * 
     * @param deleteCampaignRequest
     *        DeleteCampaignRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCampaign operation returned by the service.
     * @sample AmazonConnectCampaignAsyncHandler.DeleteCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/DeleteCampaign"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCampaignResult> deleteCampaignAsync(DeleteCampaignRequest deleteCampaignRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCampaignRequest, DeleteCampaignResult> asyncHandler);

    /**
     * <p>
     * Deletes a connect instance config from the specified AWS account.
     * </p>
     * 
     * @param deleteConnectInstanceConfigRequest
     *        DeleteCampaignRequest
     * @return A Java Future containing the result of the DeleteConnectInstanceConfig operation returned by the service.
     * @sample AmazonConnectCampaignAsync.DeleteConnectInstanceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/DeleteConnectInstanceConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConnectInstanceConfigResult> deleteConnectInstanceConfigAsync(
            DeleteConnectInstanceConfigRequest deleteConnectInstanceConfigRequest);

    /**
     * <p>
     * Deletes a connect instance config from the specified AWS account.
     * </p>
     * 
     * @param deleteConnectInstanceConfigRequest
     *        DeleteCampaignRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConnectInstanceConfig operation returned by the service.
     * @sample AmazonConnectCampaignAsyncHandler.DeleteConnectInstanceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/DeleteConnectInstanceConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConnectInstanceConfigResult> deleteConnectInstanceConfigAsync(
            DeleteConnectInstanceConfigRequest deleteConnectInstanceConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConnectInstanceConfigRequest, DeleteConnectInstanceConfigResult> asyncHandler);

    /**
     * <p>
     * Delete the Connect Campaigns onboarding job for the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteInstanceOnboardingJobRequest
     *        The request for DeleteInstanceOnboardingJob API.
     * @return A Java Future containing the result of the DeleteInstanceOnboardingJob operation returned by the service.
     * @sample AmazonConnectCampaignAsync.DeleteInstanceOnboardingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/DeleteInstanceOnboardingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInstanceOnboardingJobResult> deleteInstanceOnboardingJobAsync(
            DeleteInstanceOnboardingJobRequest deleteInstanceOnboardingJobRequest);

    /**
     * <p>
     * Delete the Connect Campaigns onboarding job for the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteInstanceOnboardingJobRequest
     *        The request for DeleteInstanceOnboardingJob API.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInstanceOnboardingJob operation returned by the service.
     * @sample AmazonConnectCampaignAsyncHandler.DeleteInstanceOnboardingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/DeleteInstanceOnboardingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInstanceOnboardingJobResult> deleteInstanceOnboardingJobAsync(
            DeleteInstanceOnboardingJobRequest deleteInstanceOnboardingJobRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInstanceOnboardingJobRequest, DeleteInstanceOnboardingJobResult> asyncHandler);

    /**
     * <p>
     * Describes the specific campaign.
     * </p>
     * 
     * @param describeCampaignRequest
     *        DescribeCampaignRequests
     * @return A Java Future containing the result of the DescribeCampaign operation returned by the service.
     * @sample AmazonConnectCampaignAsync.DescribeCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/DescribeCampaign"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCampaignResult> describeCampaignAsync(DescribeCampaignRequest describeCampaignRequest);

    /**
     * <p>
     * Describes the specific campaign.
     * </p>
     * 
     * @param describeCampaignRequest
     *        DescribeCampaignRequests
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCampaign operation returned by the service.
     * @sample AmazonConnectCampaignAsyncHandler.DescribeCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/DescribeCampaign"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCampaignResult> describeCampaignAsync(DescribeCampaignRequest describeCampaignRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCampaignRequest, DescribeCampaignResult> asyncHandler);

    /**
     * <p>
     * Get state of a campaign for the specified Amazon Connect account.
     * </p>
     * 
     * @param getCampaignStateRequest
     *        GetCampaignStateRequest
     * @return A Java Future containing the result of the GetCampaignState operation returned by the service.
     * @sample AmazonConnectCampaignAsync.GetCampaignState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/GetCampaignState"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCampaignStateResult> getCampaignStateAsync(GetCampaignStateRequest getCampaignStateRequest);

    /**
     * <p>
     * Get state of a campaign for the specified Amazon Connect account.
     * </p>
     * 
     * @param getCampaignStateRequest
     *        GetCampaignStateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCampaignState operation returned by the service.
     * @sample AmazonConnectCampaignAsyncHandler.GetCampaignState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/GetCampaignState"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCampaignStateResult> getCampaignStateAsync(GetCampaignStateRequest getCampaignStateRequest,
            com.amazonaws.handlers.AsyncHandler<GetCampaignStateRequest, GetCampaignStateResult> asyncHandler);

    /**
     * <p>
     * Get state of campaigns for the specified Amazon Connect account.
     * </p>
     * 
     * @param getCampaignStateBatchRequest
     *        GetCampaignStateBatchRequest
     * @return A Java Future containing the result of the GetCampaignStateBatch operation returned by the service.
     * @sample AmazonConnectCampaignAsync.GetCampaignStateBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/GetCampaignStateBatch"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCampaignStateBatchResult> getCampaignStateBatchAsync(GetCampaignStateBatchRequest getCampaignStateBatchRequest);

    /**
     * <p>
     * Get state of campaigns for the specified Amazon Connect account.
     * </p>
     * 
     * @param getCampaignStateBatchRequest
     *        GetCampaignStateBatchRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCampaignStateBatch operation returned by the service.
     * @sample AmazonConnectCampaignAsyncHandler.GetCampaignStateBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/GetCampaignStateBatch"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCampaignStateBatchResult> getCampaignStateBatchAsync(GetCampaignStateBatchRequest getCampaignStateBatchRequest,
            com.amazonaws.handlers.AsyncHandler<GetCampaignStateBatchRequest, GetCampaignStateBatchResult> asyncHandler);

    /**
     * <p>
     * Get the specific Connect instance config.
     * </p>
     * 
     * @param getConnectInstanceConfigRequest
     *        GetConnectInstanceConfigRequest
     * @return A Java Future containing the result of the GetConnectInstanceConfig operation returned by the service.
     * @sample AmazonConnectCampaignAsync.GetConnectInstanceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/GetConnectInstanceConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConnectInstanceConfigResult> getConnectInstanceConfigAsync(GetConnectInstanceConfigRequest getConnectInstanceConfigRequest);

    /**
     * <p>
     * Get the specific Connect instance config.
     * </p>
     * 
     * @param getConnectInstanceConfigRequest
     *        GetConnectInstanceConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConnectInstanceConfig operation returned by the service.
     * @sample AmazonConnectCampaignAsyncHandler.GetConnectInstanceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/GetConnectInstanceConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConnectInstanceConfigResult> getConnectInstanceConfigAsync(GetConnectInstanceConfigRequest getConnectInstanceConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetConnectInstanceConfigRequest, GetConnectInstanceConfigResult> asyncHandler);

    /**
     * <p>
     * Get the specific instance onboarding job status.
     * </p>
     * 
     * @param getInstanceOnboardingJobStatusRequest
     *        GetInstanceOnboardingJobStatusRequest
     * @return A Java Future containing the result of the GetInstanceOnboardingJobStatus operation returned by the
     *         service.
     * @sample AmazonConnectCampaignAsync.GetInstanceOnboardingJobStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/GetInstanceOnboardingJobStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceOnboardingJobStatusResult> getInstanceOnboardingJobStatusAsync(
            GetInstanceOnboardingJobStatusRequest getInstanceOnboardingJobStatusRequest);

    /**
     * <p>
     * Get the specific instance onboarding job status.
     * </p>
     * 
     * @param getInstanceOnboardingJobStatusRequest
     *        GetInstanceOnboardingJobStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstanceOnboardingJobStatus operation returned by the
     *         service.
     * @sample AmazonConnectCampaignAsyncHandler.GetInstanceOnboardingJobStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/GetInstanceOnboardingJobStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceOnboardingJobStatusResult> getInstanceOnboardingJobStatusAsync(
            GetInstanceOnboardingJobStatusRequest getInstanceOnboardingJobStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstanceOnboardingJobStatusRequest, GetInstanceOnboardingJobStatusResult> asyncHandler);

    /**
     * <p>
     * Provides summary information about the campaigns under the specified Amazon Connect account.
     * </p>
     * 
     * @param listCampaignsRequest
     *        ListCampaignsRequest
     * @return A Java Future containing the result of the ListCampaigns operation returned by the service.
     * @sample AmazonConnectCampaignAsync.ListCampaigns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/ListCampaigns" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListCampaignsResult> listCampaignsAsync(ListCampaignsRequest listCampaignsRequest);

    /**
     * <p>
     * Provides summary information about the campaigns under the specified Amazon Connect account.
     * </p>
     * 
     * @param listCampaignsRequest
     *        ListCampaignsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCampaigns operation returned by the service.
     * @sample AmazonConnectCampaignAsyncHandler.ListCampaigns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/ListCampaigns" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListCampaignsResult> listCampaignsAsync(ListCampaignsRequest listCampaignsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCampaignsRequest, ListCampaignsResult> asyncHandler);

    /**
     * <p>
     * List tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        ListTagsForResource
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonConnectCampaignAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * List tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        ListTagsForResource
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonConnectCampaignAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Pauses a campaign for the specified Amazon Connect account.
     * </p>
     * 
     * @param pauseCampaignRequest
     *        PauseCampaignRequest
     * @return A Java Future containing the result of the PauseCampaign operation returned by the service.
     * @sample AmazonConnectCampaignAsync.PauseCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/PauseCampaign" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PauseCampaignResult> pauseCampaignAsync(PauseCampaignRequest pauseCampaignRequest);

    /**
     * <p>
     * Pauses a campaign for the specified Amazon Connect account.
     * </p>
     * 
     * @param pauseCampaignRequest
     *        PauseCampaignRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PauseCampaign operation returned by the service.
     * @sample AmazonConnectCampaignAsyncHandler.PauseCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/PauseCampaign" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PauseCampaignResult> pauseCampaignAsync(PauseCampaignRequest pauseCampaignRequest,
            com.amazonaws.handlers.AsyncHandler<PauseCampaignRequest, PauseCampaignResult> asyncHandler);

    /**
     * <p>
     * Creates dials requests for the specified campaign Amazon Connect account. This API is idempotent.
     * </p>
     * 
     * @param putDialRequestBatchRequest
     *        PutDialRequestBatchRequest
     * @return A Java Future containing the result of the PutDialRequestBatch operation returned by the service.
     * @sample AmazonConnectCampaignAsync.PutDialRequestBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/PutDialRequestBatch"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutDialRequestBatchResult> putDialRequestBatchAsync(PutDialRequestBatchRequest putDialRequestBatchRequest);

    /**
     * <p>
     * Creates dials requests for the specified campaign Amazon Connect account. This API is idempotent.
     * </p>
     * 
     * @param putDialRequestBatchRequest
     *        PutDialRequestBatchRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutDialRequestBatch operation returned by the service.
     * @sample AmazonConnectCampaignAsyncHandler.PutDialRequestBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/PutDialRequestBatch"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutDialRequestBatchResult> putDialRequestBatchAsync(PutDialRequestBatchRequest putDialRequestBatchRequest,
            com.amazonaws.handlers.AsyncHandler<PutDialRequestBatchRequest, PutDialRequestBatchResult> asyncHandler);

    /**
     * <p>
     * Stops a campaign for the specified Amazon Connect account.
     * </p>
     * 
     * @param resumeCampaignRequest
     *        ResumeCampaignRequest
     * @return A Java Future containing the result of the ResumeCampaign operation returned by the service.
     * @sample AmazonConnectCampaignAsync.ResumeCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/ResumeCampaign"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResumeCampaignResult> resumeCampaignAsync(ResumeCampaignRequest resumeCampaignRequest);

    /**
     * <p>
     * Stops a campaign for the specified Amazon Connect account.
     * </p>
     * 
     * @param resumeCampaignRequest
     *        ResumeCampaignRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResumeCampaign operation returned by the service.
     * @sample AmazonConnectCampaignAsyncHandler.ResumeCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/ResumeCampaign"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResumeCampaignResult> resumeCampaignAsync(ResumeCampaignRequest resumeCampaignRequest,
            com.amazonaws.handlers.AsyncHandler<ResumeCampaignRequest, ResumeCampaignResult> asyncHandler);

    /**
     * <p>
     * Starts a campaign for the specified Amazon Connect account.
     * </p>
     * 
     * @param startCampaignRequest
     *        StartCampaignRequest
     * @return A Java Future containing the result of the StartCampaign operation returned by the service.
     * @sample AmazonConnectCampaignAsync.StartCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/StartCampaign" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartCampaignResult> startCampaignAsync(StartCampaignRequest startCampaignRequest);

    /**
     * <p>
     * Starts a campaign for the specified Amazon Connect account.
     * </p>
     * 
     * @param startCampaignRequest
     *        StartCampaignRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartCampaign operation returned by the service.
     * @sample AmazonConnectCampaignAsyncHandler.StartCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/StartCampaign" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartCampaignResult> startCampaignAsync(StartCampaignRequest startCampaignRequest,
            com.amazonaws.handlers.AsyncHandler<StartCampaignRequest, StartCampaignResult> asyncHandler);

    /**
     * <p>
     * Onboard the specific Amazon Connect instance to Connect Campaigns.
     * </p>
     * 
     * @param startInstanceOnboardingJobRequest
     *        The request for StartInstanceOnboardingJob API.
     * @return A Java Future containing the result of the StartInstanceOnboardingJob operation returned by the service.
     * @sample AmazonConnectCampaignAsync.StartInstanceOnboardingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/StartInstanceOnboardingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartInstanceOnboardingJobResult> startInstanceOnboardingJobAsync(
            StartInstanceOnboardingJobRequest startInstanceOnboardingJobRequest);

    /**
     * <p>
     * Onboard the specific Amazon Connect instance to Connect Campaigns.
     * </p>
     * 
     * @param startInstanceOnboardingJobRequest
     *        The request for StartInstanceOnboardingJob API.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartInstanceOnboardingJob operation returned by the service.
     * @sample AmazonConnectCampaignAsyncHandler.StartInstanceOnboardingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/StartInstanceOnboardingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartInstanceOnboardingJobResult> startInstanceOnboardingJobAsync(
            StartInstanceOnboardingJobRequest startInstanceOnboardingJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartInstanceOnboardingJobRequest, StartInstanceOnboardingJobResult> asyncHandler);

    /**
     * <p>
     * Stops a campaign for the specified Amazon Connect account.
     * </p>
     * 
     * @param stopCampaignRequest
     *        StopCampaignRequest
     * @return A Java Future containing the result of the StopCampaign operation returned by the service.
     * @sample AmazonConnectCampaignAsync.StopCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/StopCampaign" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopCampaignResult> stopCampaignAsync(StopCampaignRequest stopCampaignRequest);

    /**
     * <p>
     * Stops a campaign for the specified Amazon Connect account.
     * </p>
     * 
     * @param stopCampaignRequest
     *        StopCampaignRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopCampaign operation returned by the service.
     * @sample AmazonConnectCampaignAsyncHandler.StopCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/StopCampaign" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopCampaignResult> stopCampaignAsync(StopCampaignRequest stopCampaignRequest,
            com.amazonaws.handlers.AsyncHandler<StopCampaignRequest, StopCampaignResult> asyncHandler);

    /**
     * <p>
     * Tag a resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        TagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonConnectCampaignAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Tag a resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        TagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonConnectCampaignAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Untag a resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        UntagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonConnectCampaignAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Untag a resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        UntagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonConnectCampaignAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the dialer config of a campaign. This API is idempotent.
     * </p>
     * 
     * @param updateCampaignDialerConfigRequest
     *        UpdateCampaignDialerConfigRequest
     * @return A Java Future containing the result of the UpdateCampaignDialerConfig operation returned by the service.
     * @sample AmazonConnectCampaignAsync.UpdateCampaignDialerConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/UpdateCampaignDialerConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCampaignDialerConfigResult> updateCampaignDialerConfigAsync(
            UpdateCampaignDialerConfigRequest updateCampaignDialerConfigRequest);

    /**
     * <p>
     * Updates the dialer config of a campaign. This API is idempotent.
     * </p>
     * 
     * @param updateCampaignDialerConfigRequest
     *        UpdateCampaignDialerConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCampaignDialerConfig operation returned by the service.
     * @sample AmazonConnectCampaignAsyncHandler.UpdateCampaignDialerConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/UpdateCampaignDialerConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCampaignDialerConfigResult> updateCampaignDialerConfigAsync(
            UpdateCampaignDialerConfigRequest updateCampaignDialerConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCampaignDialerConfigRequest, UpdateCampaignDialerConfigResult> asyncHandler);

    /**
     * <p>
     * Updates the name of a campaign. This API is idempotent.
     * </p>
     * 
     * @param updateCampaignNameRequest
     *        UpdateCampaignNameRequest
     * @return A Java Future containing the result of the UpdateCampaignName operation returned by the service.
     * @sample AmazonConnectCampaignAsync.UpdateCampaignName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/UpdateCampaignName"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCampaignNameResult> updateCampaignNameAsync(UpdateCampaignNameRequest updateCampaignNameRequest);

    /**
     * <p>
     * Updates the name of a campaign. This API is idempotent.
     * </p>
     * 
     * @param updateCampaignNameRequest
     *        UpdateCampaignNameRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCampaignName operation returned by the service.
     * @sample AmazonConnectCampaignAsyncHandler.UpdateCampaignName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/UpdateCampaignName"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCampaignNameResult> updateCampaignNameAsync(UpdateCampaignNameRequest updateCampaignNameRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCampaignNameRequest, UpdateCampaignNameResult> asyncHandler);

    /**
     * <p>
     * Updates the outbound call config of a campaign. This API is idempotent.
     * </p>
     * 
     * @param updateCampaignOutboundCallConfigRequest
     *        UpdateCampaignOutboundCallConfigRequest
     * @return A Java Future containing the result of the UpdateCampaignOutboundCallConfig operation returned by the
     *         service.
     * @sample AmazonConnectCampaignAsync.UpdateCampaignOutboundCallConfig
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/UpdateCampaignOutboundCallConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCampaignOutboundCallConfigResult> updateCampaignOutboundCallConfigAsync(
            UpdateCampaignOutboundCallConfigRequest updateCampaignOutboundCallConfigRequest);

    /**
     * <p>
     * Updates the outbound call config of a campaign. This API is idempotent.
     * </p>
     * 
     * @param updateCampaignOutboundCallConfigRequest
     *        UpdateCampaignOutboundCallConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCampaignOutboundCallConfig operation returned by the
     *         service.
     * @sample AmazonConnectCampaignAsyncHandler.UpdateCampaignOutboundCallConfig
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/UpdateCampaignOutboundCallConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCampaignOutboundCallConfigResult> updateCampaignOutboundCallConfigAsync(
            UpdateCampaignOutboundCallConfigRequest updateCampaignOutboundCallConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCampaignOutboundCallConfigRequest, UpdateCampaignOutboundCallConfigResult> asyncHandler);

}
