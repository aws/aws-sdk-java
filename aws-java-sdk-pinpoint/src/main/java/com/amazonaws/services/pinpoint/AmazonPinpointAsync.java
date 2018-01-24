/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;

/**
 * Interface for accessing Amazon Pinpoint asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.pinpoint.AbstractAmazonPinpointAsync} instead.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonPinpointAsync extends AmazonPinpoint {

    /**
     * Creates or updates an app.
     * 
     * @param createAppRequest
     * @return A Java Future containing the result of the CreateApp operation returned by the service.
     * @sample AmazonPinpointAsync.CreateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAppResult> createAppAsync(CreateAppRequest createAppRequest);

    /**
     * Creates or updates an app.
     * 
     * @param createAppRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApp operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.CreateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAppResult> createAppAsync(CreateAppRequest createAppRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAppRequest, CreateAppResult> asyncHandler);

    /**
     * Creates or updates a campaign.
     * 
     * @param createCampaignRequest
     * @return A Java Future containing the result of the CreateCampaign operation returned by the service.
     * @sample AmazonPinpointAsync.CreateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateCampaignResult> createCampaignAsync(CreateCampaignRequest createCampaignRequest);

    /**
     * Creates or updates a campaign.
     * 
     * @param createCampaignRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCampaign operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.CreateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateCampaignResult> createCampaignAsync(CreateCampaignRequest createCampaignRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCampaignRequest, CreateCampaignResult> asyncHandler);

    /**
     * Creates or updates an import job.
     * 
     * @param createImportJobRequest
     * @return A Java Future containing the result of the CreateImportJob operation returned by the service.
     * @sample AmazonPinpointAsync.CreateImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateImportJobResult> createImportJobAsync(CreateImportJobRequest createImportJobRequest);

    /**
     * Creates or updates an import job.
     * 
     * @param createImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateImportJob operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.CreateImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateImportJobResult> createImportJobAsync(CreateImportJobRequest createImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateImportJobRequest, CreateImportJobResult> asyncHandler);

    /**
     * Used to create or update a segment.
     * 
     * @param createSegmentRequest
     * @return A Java Future containing the result of the CreateSegment operation returned by the service.
     * @sample AmazonPinpointAsync.CreateSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateSegment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSegmentResult> createSegmentAsync(CreateSegmentRequest createSegmentRequest);

    /**
     * Used to create or update a segment.
     * 
     * @param createSegmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSegment operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.CreateSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateSegment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSegmentResult> createSegmentAsync(CreateSegmentRequest createSegmentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSegmentRequest, CreateSegmentResult> asyncHandler);

    /**
     * Delete an ADM channel
     * 
     * @param deleteAdmChannelRequest
     * @return A Java Future containing the result of the DeleteAdmChannel operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteAdmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteAdmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAdmChannelResult> deleteAdmChannelAsync(DeleteAdmChannelRequest deleteAdmChannelRequest);

    /**
     * Delete an ADM channel
     * 
     * @param deleteAdmChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAdmChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteAdmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteAdmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAdmChannelResult> deleteAdmChannelAsync(DeleteAdmChannelRequest deleteAdmChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAdmChannelRequest, DeleteAdmChannelResult> asyncHandler);

    /**
     * Deletes the APNs channel for an app.
     * 
     * @param deleteApnsChannelRequest
     * @return A Java Future containing the result of the DeleteApnsChannel operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteApnsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApnsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteApnsChannelResult> deleteApnsChannelAsync(DeleteApnsChannelRequest deleteApnsChannelRequest);

    /**
     * Deletes the APNs channel for an app.
     * 
     * @param deleteApnsChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApnsChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteApnsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApnsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteApnsChannelResult> deleteApnsChannelAsync(DeleteApnsChannelRequest deleteApnsChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApnsChannelRequest, DeleteApnsChannelResult> asyncHandler);

    /**
     * Delete an APNS sandbox channel
     * 
     * @param deleteApnsSandboxChannelRequest
     * @return A Java Future containing the result of the DeleteApnsSandboxChannel operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteApnsSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApnsSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApnsSandboxChannelResult> deleteApnsSandboxChannelAsync(DeleteApnsSandboxChannelRequest deleteApnsSandboxChannelRequest);

    /**
     * Delete an APNS sandbox channel
     * 
     * @param deleteApnsSandboxChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApnsSandboxChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteApnsSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApnsSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApnsSandboxChannelResult> deleteApnsSandboxChannelAsync(DeleteApnsSandboxChannelRequest deleteApnsSandboxChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApnsSandboxChannelRequest, DeleteApnsSandboxChannelResult> asyncHandler);

    /**
     * Delete an APNS VoIP channel
     * 
     * @param deleteApnsVoipChannelRequest
     * @return A Java Future containing the result of the DeleteApnsVoipChannel operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteApnsVoipChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApnsVoipChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApnsVoipChannelResult> deleteApnsVoipChannelAsync(DeleteApnsVoipChannelRequest deleteApnsVoipChannelRequest);

    /**
     * Delete an APNS VoIP channel
     * 
     * @param deleteApnsVoipChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApnsVoipChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteApnsVoipChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApnsVoipChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApnsVoipChannelResult> deleteApnsVoipChannelAsync(DeleteApnsVoipChannelRequest deleteApnsVoipChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApnsVoipChannelRequest, DeleteApnsVoipChannelResult> asyncHandler);

    /**
     * Delete an APNS VoIP sandbox channel
     * 
     * @param deleteApnsVoipSandboxChannelRequest
     * @return A Java Future containing the result of the DeleteApnsVoipSandboxChannel operation returned by the
     *         service.
     * @sample AmazonPinpointAsync.DeleteApnsVoipSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApnsVoipSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApnsVoipSandboxChannelResult> deleteApnsVoipSandboxChannelAsync(
            DeleteApnsVoipSandboxChannelRequest deleteApnsVoipSandboxChannelRequest);

    /**
     * Delete an APNS VoIP sandbox channel
     * 
     * @param deleteApnsVoipSandboxChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApnsVoipSandboxChannel operation returned by the
     *         service.
     * @sample AmazonPinpointAsyncHandler.DeleteApnsVoipSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApnsVoipSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApnsVoipSandboxChannelResult> deleteApnsVoipSandboxChannelAsync(
            DeleteApnsVoipSandboxChannelRequest deleteApnsVoipSandboxChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApnsVoipSandboxChannelRequest, DeleteApnsVoipSandboxChannelResult> asyncHandler);

    /**
     * Deletes an app.
     * 
     * @param deleteAppRequest
     * @return A Java Future containing the result of the DeleteApp operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest deleteAppRequest);

    /**
     * Deletes an app.
     * 
     * @param deleteAppRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApp operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest deleteAppRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAppRequest, DeleteAppResult> asyncHandler);

    /**
     * Delete a BAIDU GCM channel
     * 
     * @param deleteBaiduChannelRequest
     * @return A Java Future containing the result of the DeleteBaiduChannel operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteBaiduChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteBaiduChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBaiduChannelResult> deleteBaiduChannelAsync(DeleteBaiduChannelRequest deleteBaiduChannelRequest);

    /**
     * Delete a BAIDU GCM channel
     * 
     * @param deleteBaiduChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBaiduChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteBaiduChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteBaiduChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBaiduChannelResult> deleteBaiduChannelAsync(DeleteBaiduChannelRequest deleteBaiduChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBaiduChannelRequest, DeleteBaiduChannelResult> asyncHandler);

    /**
     * Deletes a campaign.
     * 
     * @param deleteCampaignRequest
     * @return A Java Future containing the result of the DeleteCampaign operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteCampaignResult> deleteCampaignAsync(DeleteCampaignRequest deleteCampaignRequest);

    /**
     * Deletes a campaign.
     * 
     * @param deleteCampaignRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCampaign operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteCampaignResult> deleteCampaignAsync(DeleteCampaignRequest deleteCampaignRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCampaignRequest, DeleteCampaignResult> asyncHandler);

    /**
     * Delete an email channel
     * 
     * @param deleteEmailChannelRequest
     * @return A Java Future containing the result of the DeleteEmailChannel operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteEmailChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteEmailChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEmailChannelResult> deleteEmailChannelAsync(DeleteEmailChannelRequest deleteEmailChannelRequest);

    /**
     * Delete an email channel
     * 
     * @param deleteEmailChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEmailChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteEmailChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteEmailChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEmailChannelResult> deleteEmailChannelAsync(DeleteEmailChannelRequest deleteEmailChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEmailChannelRequest, DeleteEmailChannelResult> asyncHandler);

    /**
     * Deletes the event stream for an app.
     * 
     * @param deleteEventStreamRequest
     *        DeleteEventStream Request
     * @return A Java Future containing the result of the DeleteEventStream operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteEventStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteEventStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEventStreamResult> deleteEventStreamAsync(DeleteEventStreamRequest deleteEventStreamRequest);

    /**
     * Deletes the event stream for an app.
     * 
     * @param deleteEventStreamRequest
     *        DeleteEventStream Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEventStream operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteEventStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteEventStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEventStreamResult> deleteEventStreamAsync(DeleteEventStreamRequest deleteEventStreamRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEventStreamRequest, DeleteEventStreamResult> asyncHandler);

    /**
     * Deletes the GCM channel for an app.
     * 
     * @param deleteGcmChannelRequest
     * @return A Java Future containing the result of the DeleteGcmChannel operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteGcmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteGcmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGcmChannelResult> deleteGcmChannelAsync(DeleteGcmChannelRequest deleteGcmChannelRequest);

    /**
     * Deletes the GCM channel for an app.
     * 
     * @param deleteGcmChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGcmChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteGcmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteGcmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGcmChannelResult> deleteGcmChannelAsync(DeleteGcmChannelRequest deleteGcmChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGcmChannelRequest, DeleteGcmChannelResult> asyncHandler);

    /**
     * Deletes a segment.
     * 
     * @param deleteSegmentRequest
     * @return A Java Future containing the result of the DeleteSegment operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteSegment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSegmentResult> deleteSegmentAsync(DeleteSegmentRequest deleteSegmentRequest);

    /**
     * Deletes a segment.
     * 
     * @param deleteSegmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSegment operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteSegment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSegmentResult> deleteSegmentAsync(DeleteSegmentRequest deleteSegmentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSegmentRequest, DeleteSegmentResult> asyncHandler);

    /**
     * Delete an SMS channel
     * 
     * @param deleteSmsChannelRequest
     * @return A Java Future containing the result of the DeleteSmsChannel operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteSmsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteSmsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSmsChannelResult> deleteSmsChannelAsync(DeleteSmsChannelRequest deleteSmsChannelRequest);

    /**
     * Delete an SMS channel
     * 
     * @param deleteSmsChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSmsChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteSmsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteSmsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSmsChannelResult> deleteSmsChannelAsync(DeleteSmsChannelRequest deleteSmsChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSmsChannelRequest, DeleteSmsChannelResult> asyncHandler);

    /**
     * Get an ADM channel
     * 
     * @param getAdmChannelRequest
     * @return A Java Future containing the result of the GetAdmChannel operation returned by the service.
     * @sample AmazonPinpointAsync.GetAdmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetAdmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAdmChannelResult> getAdmChannelAsync(GetAdmChannelRequest getAdmChannelRequest);

    /**
     * Get an ADM channel
     * 
     * @param getAdmChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAdmChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetAdmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetAdmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAdmChannelResult> getAdmChannelAsync(GetAdmChannelRequest getAdmChannelRequest,
            com.amazonaws.handlers.AsyncHandler<GetAdmChannelRequest, GetAdmChannelResult> asyncHandler);

    /**
     * Returns information about the APNs channel for an app.
     * 
     * @param getApnsChannelRequest
     * @return A Java Future containing the result of the GetApnsChannel operation returned by the service.
     * @sample AmazonPinpointAsync.GetApnsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApnsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetApnsChannelResult> getApnsChannelAsync(GetApnsChannelRequest getApnsChannelRequest);

    /**
     * Returns information about the APNs channel for an app.
     * 
     * @param getApnsChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApnsChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetApnsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApnsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetApnsChannelResult> getApnsChannelAsync(GetApnsChannelRequest getApnsChannelRequest,
            com.amazonaws.handlers.AsyncHandler<GetApnsChannelRequest, GetApnsChannelResult> asyncHandler);

    /**
     * Get an APNS sandbox channel
     * 
     * @param getApnsSandboxChannelRequest
     * @return A Java Future containing the result of the GetApnsSandboxChannel operation returned by the service.
     * @sample AmazonPinpointAsync.GetApnsSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApnsSandboxChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetApnsSandboxChannelResult> getApnsSandboxChannelAsync(GetApnsSandboxChannelRequest getApnsSandboxChannelRequest);

    /**
     * Get an APNS sandbox channel
     * 
     * @param getApnsSandboxChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApnsSandboxChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetApnsSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApnsSandboxChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetApnsSandboxChannelResult> getApnsSandboxChannelAsync(GetApnsSandboxChannelRequest getApnsSandboxChannelRequest,
            com.amazonaws.handlers.AsyncHandler<GetApnsSandboxChannelRequest, GetApnsSandboxChannelResult> asyncHandler);

    /**
     * Get an APNS VoIP channel
     * 
     * @param getApnsVoipChannelRequest
     * @return A Java Future containing the result of the GetApnsVoipChannel operation returned by the service.
     * @sample AmazonPinpointAsync.GetApnsVoipChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApnsVoipChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetApnsVoipChannelResult> getApnsVoipChannelAsync(GetApnsVoipChannelRequest getApnsVoipChannelRequest);

    /**
     * Get an APNS VoIP channel
     * 
     * @param getApnsVoipChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApnsVoipChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetApnsVoipChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApnsVoipChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetApnsVoipChannelResult> getApnsVoipChannelAsync(GetApnsVoipChannelRequest getApnsVoipChannelRequest,
            com.amazonaws.handlers.AsyncHandler<GetApnsVoipChannelRequest, GetApnsVoipChannelResult> asyncHandler);

    /**
     * Get an APNS VoipSandbox channel
     * 
     * @param getApnsVoipSandboxChannelRequest
     * @return A Java Future containing the result of the GetApnsVoipSandboxChannel operation returned by the service.
     * @sample AmazonPinpointAsync.GetApnsVoipSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApnsVoipSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetApnsVoipSandboxChannelResult> getApnsVoipSandboxChannelAsync(
            GetApnsVoipSandboxChannelRequest getApnsVoipSandboxChannelRequest);

    /**
     * Get an APNS VoipSandbox channel
     * 
     * @param getApnsVoipSandboxChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApnsVoipSandboxChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetApnsVoipSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApnsVoipSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetApnsVoipSandboxChannelResult> getApnsVoipSandboxChannelAsync(
            GetApnsVoipSandboxChannelRequest getApnsVoipSandboxChannelRequest,
            com.amazonaws.handlers.AsyncHandler<GetApnsVoipSandboxChannelRequest, GetApnsVoipSandboxChannelResult> asyncHandler);

    /**
     * Returns information about an app.
     * 
     * @param getAppRequest
     * @return A Java Future containing the result of the GetApp operation returned by the service.
     * @sample AmazonPinpointAsync.GetApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAppResult> getAppAsync(GetAppRequest getAppRequest);

    /**
     * Returns information about an app.
     * 
     * @param getAppRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApp operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAppResult> getAppAsync(GetAppRequest getAppRequest,
            com.amazonaws.handlers.AsyncHandler<GetAppRequest, GetAppResult> asyncHandler);

    /**
     * Used to request the settings for an app.
     * 
     * @param getApplicationSettingsRequest
     * @return A Java Future containing the result of the GetApplicationSettings operation returned by the service.
     * @sample AmazonPinpointAsync.GetApplicationSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApplicationSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationSettingsResult> getApplicationSettingsAsync(GetApplicationSettingsRequest getApplicationSettingsRequest);

    /**
     * Used to request the settings for an app.
     * 
     * @param getApplicationSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApplicationSettings operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetApplicationSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApplicationSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationSettingsResult> getApplicationSettingsAsync(GetApplicationSettingsRequest getApplicationSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetApplicationSettingsRequest, GetApplicationSettingsResult> asyncHandler);

    /**
     * Returns information about your apps.
     * 
     * @param getAppsRequest
     * @return A Java Future containing the result of the GetApps operation returned by the service.
     * @sample AmazonPinpointAsync.GetApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAppsResult> getAppsAsync(GetAppsRequest getAppsRequest);

    /**
     * Returns information about your apps.
     * 
     * @param getAppsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApps operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAppsResult> getAppsAsync(GetAppsRequest getAppsRequest,
            com.amazonaws.handlers.AsyncHandler<GetAppsRequest, GetAppsResult> asyncHandler);

    /**
     * Get a BAIDU GCM channel
     * 
     * @param getBaiduChannelRequest
     * @return A Java Future containing the result of the GetBaiduChannel operation returned by the service.
     * @sample AmazonPinpointAsync.GetBaiduChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetBaiduChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBaiduChannelResult> getBaiduChannelAsync(GetBaiduChannelRequest getBaiduChannelRequest);

    /**
     * Get a BAIDU GCM channel
     * 
     * @param getBaiduChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBaiduChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetBaiduChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetBaiduChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBaiduChannelResult> getBaiduChannelAsync(GetBaiduChannelRequest getBaiduChannelRequest,
            com.amazonaws.handlers.AsyncHandler<GetBaiduChannelRequest, GetBaiduChannelResult> asyncHandler);

    /**
     * Returns information about a campaign.
     * 
     * @param getCampaignRequest
     * @return A Java Future containing the result of the GetCampaign operation returned by the service.
     * @sample AmazonPinpointAsync.GetCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCampaignResult> getCampaignAsync(GetCampaignRequest getCampaignRequest);

    /**
     * Returns information about a campaign.
     * 
     * @param getCampaignRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCampaign operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCampaignResult> getCampaignAsync(GetCampaignRequest getCampaignRequest,
            com.amazonaws.handlers.AsyncHandler<GetCampaignRequest, GetCampaignResult> asyncHandler);

    /**
     * Returns information about the activity performed by a campaign.
     * 
     * @param getCampaignActivitiesRequest
     * @return A Java Future containing the result of the GetCampaignActivities operation returned by the service.
     * @sample AmazonPinpointAsync.GetCampaignActivities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaignActivities" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCampaignActivitiesResult> getCampaignActivitiesAsync(GetCampaignActivitiesRequest getCampaignActivitiesRequest);

    /**
     * Returns information about the activity performed by a campaign.
     * 
     * @param getCampaignActivitiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCampaignActivities operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetCampaignActivities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaignActivities" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCampaignActivitiesResult> getCampaignActivitiesAsync(GetCampaignActivitiesRequest getCampaignActivitiesRequest,
            com.amazonaws.handlers.AsyncHandler<GetCampaignActivitiesRequest, GetCampaignActivitiesResult> asyncHandler);

    /**
     * Returns information about a specific version of a campaign.
     * 
     * @param getCampaignVersionRequest
     * @return A Java Future containing the result of the GetCampaignVersion operation returned by the service.
     * @sample AmazonPinpointAsync.GetCampaignVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaignVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCampaignVersionResult> getCampaignVersionAsync(GetCampaignVersionRequest getCampaignVersionRequest);

    /**
     * Returns information about a specific version of a campaign.
     * 
     * @param getCampaignVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCampaignVersion operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetCampaignVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaignVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCampaignVersionResult> getCampaignVersionAsync(GetCampaignVersionRequest getCampaignVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetCampaignVersionRequest, GetCampaignVersionResult> asyncHandler);

    /**
     * Returns information about your campaign versions.
     * 
     * @param getCampaignVersionsRequest
     * @return A Java Future containing the result of the GetCampaignVersions operation returned by the service.
     * @sample AmazonPinpointAsync.GetCampaignVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaignVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCampaignVersionsResult> getCampaignVersionsAsync(GetCampaignVersionsRequest getCampaignVersionsRequest);

    /**
     * Returns information about your campaign versions.
     * 
     * @param getCampaignVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCampaignVersions operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetCampaignVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaignVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCampaignVersionsResult> getCampaignVersionsAsync(GetCampaignVersionsRequest getCampaignVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetCampaignVersionsRequest, GetCampaignVersionsResult> asyncHandler);

    /**
     * Returns information about your campaigns.
     * 
     * @param getCampaignsRequest
     * @return A Java Future containing the result of the GetCampaigns operation returned by the service.
     * @sample AmazonPinpointAsync.GetCampaigns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaigns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCampaignsResult> getCampaignsAsync(GetCampaignsRequest getCampaignsRequest);

    /**
     * Returns information about your campaigns.
     * 
     * @param getCampaignsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCampaigns operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetCampaigns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaigns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCampaignsResult> getCampaignsAsync(GetCampaignsRequest getCampaignsRequest,
            com.amazonaws.handlers.AsyncHandler<GetCampaignsRequest, GetCampaignsResult> asyncHandler);

    /**
     * Get an email channel
     * 
     * @param getEmailChannelRequest
     * @return A Java Future containing the result of the GetEmailChannel operation returned by the service.
     * @sample AmazonPinpointAsync.GetEmailChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetEmailChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEmailChannelResult> getEmailChannelAsync(GetEmailChannelRequest getEmailChannelRequest);

    /**
     * Get an email channel
     * 
     * @param getEmailChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEmailChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetEmailChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetEmailChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEmailChannelResult> getEmailChannelAsync(GetEmailChannelRequest getEmailChannelRequest,
            com.amazonaws.handlers.AsyncHandler<GetEmailChannelRequest, GetEmailChannelResult> asyncHandler);

    /**
     * Returns information about an endpoint.
     * 
     * @param getEndpointRequest
     * @return A Java Future containing the result of the GetEndpoint operation returned by the service.
     * @sample AmazonPinpointAsync.GetEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEndpointResult> getEndpointAsync(GetEndpointRequest getEndpointRequest);

    /**
     * Returns information about an endpoint.
     * 
     * @param getEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEndpoint operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEndpointResult> getEndpointAsync(GetEndpointRequest getEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<GetEndpointRequest, GetEndpointResult> asyncHandler);

    /**
     * Returns the event stream for an app.
     * 
     * @param getEventStreamRequest
     *        GetEventStreamRequest
     * @return A Java Future containing the result of the GetEventStream operation returned by the service.
     * @sample AmazonPinpointAsync.GetEventStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetEventStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEventStreamResult> getEventStreamAsync(GetEventStreamRequest getEventStreamRequest);

    /**
     * Returns the event stream for an app.
     * 
     * @param getEventStreamRequest
     *        GetEventStreamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEventStream operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetEventStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetEventStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEventStreamResult> getEventStreamAsync(GetEventStreamRequest getEventStreamRequest,
            com.amazonaws.handlers.AsyncHandler<GetEventStreamRequest, GetEventStreamResult> asyncHandler);

    /**
     * Returns information about the GCM channel for an app.
     * 
     * @param getGcmChannelRequest
     * @return A Java Future containing the result of the GetGcmChannel operation returned by the service.
     * @sample AmazonPinpointAsync.GetGcmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetGcmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGcmChannelResult> getGcmChannelAsync(GetGcmChannelRequest getGcmChannelRequest);

    /**
     * Returns information about the GCM channel for an app.
     * 
     * @param getGcmChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGcmChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetGcmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetGcmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGcmChannelResult> getGcmChannelAsync(GetGcmChannelRequest getGcmChannelRequest,
            com.amazonaws.handlers.AsyncHandler<GetGcmChannelRequest, GetGcmChannelResult> asyncHandler);

    /**
     * Returns information about an import job.
     * 
     * @param getImportJobRequest
     * @return A Java Future containing the result of the GetImportJob operation returned by the service.
     * @sample AmazonPinpointAsync.GetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetImportJobResult> getImportJobAsync(GetImportJobRequest getImportJobRequest);

    /**
     * Returns information about an import job.
     * 
     * @param getImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetImportJob operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetImportJobResult> getImportJobAsync(GetImportJobRequest getImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetImportJobRequest, GetImportJobResult> asyncHandler);

    /**
     * Returns information about your import jobs.
     * 
     * @param getImportJobsRequest
     * @return A Java Future containing the result of the GetImportJobs operation returned by the service.
     * @sample AmazonPinpointAsync.GetImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetImportJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetImportJobsResult> getImportJobsAsync(GetImportJobsRequest getImportJobsRequest);

    /**
     * Returns information about your import jobs.
     * 
     * @param getImportJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetImportJobs operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetImportJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetImportJobsResult> getImportJobsAsync(GetImportJobsRequest getImportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<GetImportJobsRequest, GetImportJobsResult> asyncHandler);

    /**
     * Returns information about a segment.
     * 
     * @param getSegmentRequest
     * @return A Java Future containing the result of the GetSegment operation returned by the service.
     * @sample AmazonPinpointAsync.GetSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSegmentResult> getSegmentAsync(GetSegmentRequest getSegmentRequest);

    /**
     * Returns information about a segment.
     * 
     * @param getSegmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSegment operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSegmentResult> getSegmentAsync(GetSegmentRequest getSegmentRequest,
            com.amazonaws.handlers.AsyncHandler<GetSegmentRequest, GetSegmentResult> asyncHandler);

    /**
     * Returns a list of import jobs for a specific segment.
     * 
     * @param getSegmentImportJobsRequest
     * @return A Java Future containing the result of the GetSegmentImportJobs operation returned by the service.
     * @sample AmazonPinpointAsync.GetSegmentImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegmentImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSegmentImportJobsResult> getSegmentImportJobsAsync(GetSegmentImportJobsRequest getSegmentImportJobsRequest);

    /**
     * Returns a list of import jobs for a specific segment.
     * 
     * @param getSegmentImportJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSegmentImportJobs operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetSegmentImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegmentImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSegmentImportJobsResult> getSegmentImportJobsAsync(GetSegmentImportJobsRequest getSegmentImportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<GetSegmentImportJobsRequest, GetSegmentImportJobsResult> asyncHandler);

    /**
     * Returns information about a segment version.
     * 
     * @param getSegmentVersionRequest
     * @return A Java Future containing the result of the GetSegmentVersion operation returned by the service.
     * @sample AmazonPinpointAsync.GetSegmentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegmentVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSegmentVersionResult> getSegmentVersionAsync(GetSegmentVersionRequest getSegmentVersionRequest);

    /**
     * Returns information about a segment version.
     * 
     * @param getSegmentVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSegmentVersion operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetSegmentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegmentVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSegmentVersionResult> getSegmentVersionAsync(GetSegmentVersionRequest getSegmentVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetSegmentVersionRequest, GetSegmentVersionResult> asyncHandler);

    /**
     * Returns information about your segment versions.
     * 
     * @param getSegmentVersionsRequest
     * @return A Java Future containing the result of the GetSegmentVersions operation returned by the service.
     * @sample AmazonPinpointAsync.GetSegmentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegmentVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSegmentVersionsResult> getSegmentVersionsAsync(GetSegmentVersionsRequest getSegmentVersionsRequest);

    /**
     * Returns information about your segment versions.
     * 
     * @param getSegmentVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSegmentVersions operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetSegmentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegmentVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSegmentVersionsResult> getSegmentVersionsAsync(GetSegmentVersionsRequest getSegmentVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetSegmentVersionsRequest, GetSegmentVersionsResult> asyncHandler);

    /**
     * Used to get information about your segments.
     * 
     * @param getSegmentsRequest
     * @return A Java Future containing the result of the GetSegments operation returned by the service.
     * @sample AmazonPinpointAsync.GetSegments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSegmentsResult> getSegmentsAsync(GetSegmentsRequest getSegmentsRequest);

    /**
     * Used to get information about your segments.
     * 
     * @param getSegmentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSegments operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetSegments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSegmentsResult> getSegmentsAsync(GetSegmentsRequest getSegmentsRequest,
            com.amazonaws.handlers.AsyncHandler<GetSegmentsRequest, GetSegmentsResult> asyncHandler);

    /**
     * Get an SMS channel
     * 
     * @param getSmsChannelRequest
     * @return A Java Future containing the result of the GetSmsChannel operation returned by the service.
     * @sample AmazonPinpointAsync.GetSmsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSmsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSmsChannelResult> getSmsChannelAsync(GetSmsChannelRequest getSmsChannelRequest);

    /**
     * Get an SMS channel
     * 
     * @param getSmsChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSmsChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetSmsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSmsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSmsChannelResult> getSmsChannelAsync(GetSmsChannelRequest getSmsChannelRequest,
            com.amazonaws.handlers.AsyncHandler<GetSmsChannelRequest, GetSmsChannelResult> asyncHandler);

    /**
     * Use to create or update the event stream for an app.
     * 
     * @param putEventStreamRequest
     * @return A Java Future containing the result of the PutEventStream operation returned by the service.
     * @sample AmazonPinpointAsync.PutEventStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/PutEventStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutEventStreamResult> putEventStreamAsync(PutEventStreamRequest putEventStreamRequest);

    /**
     * Use to create or update the event stream for an app.
     * 
     * @param putEventStreamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutEventStream operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.PutEventStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/PutEventStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutEventStreamResult> putEventStreamAsync(PutEventStreamRequest putEventStreamRequest,
            com.amazonaws.handlers.AsyncHandler<PutEventStreamRequest, PutEventStreamResult> asyncHandler);

    /**
     * Send a batch of messages
     * 
     * @param sendMessagesRequest
     * @return A Java Future containing the result of the SendMessages operation returned by the service.
     * @sample AmazonPinpointAsync.SendMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SendMessages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendMessagesResult> sendMessagesAsync(SendMessagesRequest sendMessagesRequest);

    /**
     * Send a batch of messages
     * 
     * @param sendMessagesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendMessages operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.SendMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SendMessages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendMessagesResult> sendMessagesAsync(SendMessagesRequest sendMessagesRequest,
            com.amazonaws.handlers.AsyncHandler<SendMessagesRequest, SendMessagesResult> asyncHandler);

    /**
     * Send a batch of messages to users
     * 
     * @param sendUsersMessagesRequest
     * @return A Java Future containing the result of the SendUsersMessages operation returned by the service.
     * @sample AmazonPinpointAsync.SendUsersMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SendUsersMessages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendUsersMessagesResult> sendUsersMessagesAsync(SendUsersMessagesRequest sendUsersMessagesRequest);

    /**
     * Send a batch of messages to users
     * 
     * @param sendUsersMessagesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendUsersMessages operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.SendUsersMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SendUsersMessages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendUsersMessagesResult> sendUsersMessagesAsync(SendUsersMessagesRequest sendUsersMessagesRequest,
            com.amazonaws.handlers.AsyncHandler<SendUsersMessagesRequest, SendUsersMessagesResult> asyncHandler);

    /**
     * Update an ADM channel
     * 
     * @param updateAdmChannelRequest
     * @return A Java Future containing the result of the UpdateAdmChannel operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateAdmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateAdmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAdmChannelResult> updateAdmChannelAsync(UpdateAdmChannelRequest updateAdmChannelRequest);

    /**
     * Update an ADM channel
     * 
     * @param updateAdmChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAdmChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateAdmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateAdmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAdmChannelResult> updateAdmChannelAsync(UpdateAdmChannelRequest updateAdmChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAdmChannelRequest, UpdateAdmChannelResult> asyncHandler);

    /**
     * Use to update the APNs channel for an app.
     * 
     * @param updateApnsChannelRequest
     * @return A Java Future containing the result of the UpdateApnsChannel operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateApnsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApnsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateApnsChannelResult> updateApnsChannelAsync(UpdateApnsChannelRequest updateApnsChannelRequest);

    /**
     * Use to update the APNs channel for an app.
     * 
     * @param updateApnsChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApnsChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateApnsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApnsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateApnsChannelResult> updateApnsChannelAsync(UpdateApnsChannelRequest updateApnsChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApnsChannelRequest, UpdateApnsChannelResult> asyncHandler);

    /**
     * Update an APNS sandbox channel
     * 
     * @param updateApnsSandboxChannelRequest
     * @return A Java Future containing the result of the UpdateApnsSandboxChannel operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateApnsSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApnsSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApnsSandboxChannelResult> updateApnsSandboxChannelAsync(UpdateApnsSandboxChannelRequest updateApnsSandboxChannelRequest);

    /**
     * Update an APNS sandbox channel
     * 
     * @param updateApnsSandboxChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApnsSandboxChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateApnsSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApnsSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApnsSandboxChannelResult> updateApnsSandboxChannelAsync(UpdateApnsSandboxChannelRequest updateApnsSandboxChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApnsSandboxChannelRequest, UpdateApnsSandboxChannelResult> asyncHandler);

    /**
     * Update an APNS VoIP channel
     * 
     * @param updateApnsVoipChannelRequest
     * @return A Java Future containing the result of the UpdateApnsVoipChannel operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateApnsVoipChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApnsVoipChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApnsVoipChannelResult> updateApnsVoipChannelAsync(UpdateApnsVoipChannelRequest updateApnsVoipChannelRequest);

    /**
     * Update an APNS VoIP channel
     * 
     * @param updateApnsVoipChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApnsVoipChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateApnsVoipChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApnsVoipChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApnsVoipChannelResult> updateApnsVoipChannelAsync(UpdateApnsVoipChannelRequest updateApnsVoipChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApnsVoipChannelRequest, UpdateApnsVoipChannelResult> asyncHandler);

    /**
     * Update an APNS VoIP sandbox channel
     * 
     * @param updateApnsVoipSandboxChannelRequest
     * @return A Java Future containing the result of the UpdateApnsVoipSandboxChannel operation returned by the
     *         service.
     * @sample AmazonPinpointAsync.UpdateApnsVoipSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApnsVoipSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApnsVoipSandboxChannelResult> updateApnsVoipSandboxChannelAsync(
            UpdateApnsVoipSandboxChannelRequest updateApnsVoipSandboxChannelRequest);

    /**
     * Update an APNS VoIP sandbox channel
     * 
     * @param updateApnsVoipSandboxChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApnsVoipSandboxChannel operation returned by the
     *         service.
     * @sample AmazonPinpointAsyncHandler.UpdateApnsVoipSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApnsVoipSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApnsVoipSandboxChannelResult> updateApnsVoipSandboxChannelAsync(
            UpdateApnsVoipSandboxChannelRequest updateApnsVoipSandboxChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApnsVoipSandboxChannelRequest, UpdateApnsVoipSandboxChannelResult> asyncHandler);

    /**
     * Used to update the settings for an app.
     * 
     * @param updateApplicationSettingsRequest
     * @return A Java Future containing the result of the UpdateApplicationSettings operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateApplicationSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApplicationSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationSettingsResult> updateApplicationSettingsAsync(
            UpdateApplicationSettingsRequest updateApplicationSettingsRequest);

    /**
     * Used to update the settings for an app.
     * 
     * @param updateApplicationSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApplicationSettings operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateApplicationSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApplicationSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationSettingsResult> updateApplicationSettingsAsync(
            UpdateApplicationSettingsRequest updateApplicationSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationSettingsRequest, UpdateApplicationSettingsResult> asyncHandler);

    /**
     * Update a BAIDU GCM channel
     * 
     * @param updateBaiduChannelRequest
     * @return A Java Future containing the result of the UpdateBaiduChannel operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateBaiduChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateBaiduChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateBaiduChannelResult> updateBaiduChannelAsync(UpdateBaiduChannelRequest updateBaiduChannelRequest);

    /**
     * Update a BAIDU GCM channel
     * 
     * @param updateBaiduChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBaiduChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateBaiduChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateBaiduChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateBaiduChannelResult> updateBaiduChannelAsync(UpdateBaiduChannelRequest updateBaiduChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBaiduChannelRequest, UpdateBaiduChannelResult> asyncHandler);

    /**
     * Use to update a campaign.
     * 
     * @param updateCampaignRequest
     * @return A Java Future containing the result of the UpdateCampaign operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateCampaignResult> updateCampaignAsync(UpdateCampaignRequest updateCampaignRequest);

    /**
     * Use to update a campaign.
     * 
     * @param updateCampaignRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCampaign operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateCampaignResult> updateCampaignAsync(UpdateCampaignRequest updateCampaignRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCampaignRequest, UpdateCampaignResult> asyncHandler);

    /**
     * Update an email channel
     * 
     * @param updateEmailChannelRequest
     * @return A Java Future containing the result of the UpdateEmailChannel operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateEmailChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateEmailChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEmailChannelResult> updateEmailChannelAsync(UpdateEmailChannelRequest updateEmailChannelRequest);

    /**
     * Update an email channel
     * 
     * @param updateEmailChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEmailChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateEmailChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateEmailChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEmailChannelResult> updateEmailChannelAsync(UpdateEmailChannelRequest updateEmailChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEmailChannelRequest, UpdateEmailChannelResult> asyncHandler);

    /**
     * Use to update an endpoint.
     * 
     * @param updateEndpointRequest
     * @return A Java Future containing the result of the UpdateEndpoint operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateEndpointResult> updateEndpointAsync(UpdateEndpointRequest updateEndpointRequest);

    /**
     * Use to update an endpoint.
     * 
     * @param updateEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEndpoint operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateEndpointResult> updateEndpointAsync(UpdateEndpointRequest updateEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEndpointRequest, UpdateEndpointResult> asyncHandler);

    /**
     * Use to update a batch of endpoints.
     * 
     * @param updateEndpointsBatchRequest
     * @return A Java Future containing the result of the UpdateEndpointsBatch operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateEndpointsBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateEndpointsBatch" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEndpointsBatchResult> updateEndpointsBatchAsync(UpdateEndpointsBatchRequest updateEndpointsBatchRequest);

    /**
     * Use to update a batch of endpoints.
     * 
     * @param updateEndpointsBatchRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEndpointsBatch operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateEndpointsBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateEndpointsBatch" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEndpointsBatchResult> updateEndpointsBatchAsync(UpdateEndpointsBatchRequest updateEndpointsBatchRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEndpointsBatchRequest, UpdateEndpointsBatchResult> asyncHandler);

    /**
     * Use to update the GCM channel for an app.
     * 
     * @param updateGcmChannelRequest
     * @return A Java Future containing the result of the UpdateGcmChannel operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateGcmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateGcmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGcmChannelResult> updateGcmChannelAsync(UpdateGcmChannelRequest updateGcmChannelRequest);

    /**
     * Use to update the GCM channel for an app.
     * 
     * @param updateGcmChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGcmChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateGcmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateGcmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGcmChannelResult> updateGcmChannelAsync(UpdateGcmChannelRequest updateGcmChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGcmChannelRequest, UpdateGcmChannelResult> asyncHandler);

    /**
     * Use to update a segment.
     * 
     * @param updateSegmentRequest
     * @return A Java Future containing the result of the UpdateSegment operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateSegment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSegmentResult> updateSegmentAsync(UpdateSegmentRequest updateSegmentRequest);

    /**
     * Use to update a segment.
     * 
     * @param updateSegmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSegment operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateSegment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSegmentResult> updateSegmentAsync(UpdateSegmentRequest updateSegmentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSegmentRequest, UpdateSegmentResult> asyncHandler);

    /**
     * Update an SMS channel
     * 
     * @param updateSmsChannelRequest
     * @return A Java Future containing the result of the UpdateSmsChannel operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateSmsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateSmsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSmsChannelResult> updateSmsChannelAsync(UpdateSmsChannelRequest updateSmsChannelRequest);

    /**
     * Update an SMS channel
     * 
     * @param updateSmsChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSmsChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateSmsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateSmsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSmsChannelResult> updateSmsChannelAsync(UpdateSmsChannelRequest updateSmsChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSmsChannelRequest, UpdateSmsChannelResult> asyncHandler);

}
