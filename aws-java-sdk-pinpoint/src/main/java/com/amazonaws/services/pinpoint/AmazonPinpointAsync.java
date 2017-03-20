/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * Creates or updates a campaign.
     * 
     * @param createCampaignRequest
     * @return A Java Future containing the result of the CreateCampaign operation returned by the service.
     * @sample AmazonPinpointAsync.CreateCampaign
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
     */
    java.util.concurrent.Future<CreateCampaignResult> createCampaignAsync(CreateCampaignRequest createCampaignRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCampaignRequest, CreateCampaignResult> asyncHandler);

    /**
     * Creates or updates an import job.
     * 
     * @param createImportJobRequest
     * @return A Java Future containing the result of the CreateImportJob operation returned by the service.
     * @sample AmazonPinpointAsync.CreateImportJob
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
     */
    java.util.concurrent.Future<CreateImportJobResult> createImportJobAsync(CreateImportJobRequest createImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateImportJobRequest, CreateImportJobResult> asyncHandler);

    /**
     * Used to create or update a segment.
     * 
     * @param createSegmentRequest
     * @return A Java Future containing the result of the CreateSegment operation returned by the service.
     * @sample AmazonPinpointAsync.CreateSegment
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
     */
    java.util.concurrent.Future<CreateSegmentResult> createSegmentAsync(CreateSegmentRequest createSegmentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSegmentRequest, CreateSegmentResult> asyncHandler);

    /**
     * Deletes the APNs channel for an app.
     * 
     * @param deleteApnsChannelRequest
     * @return A Java Future containing the result of the DeleteApnsChannel operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteApnsChannel
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
     */
    java.util.concurrent.Future<DeleteApnsChannelResult> deleteApnsChannelAsync(DeleteApnsChannelRequest deleteApnsChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApnsChannelRequest, DeleteApnsChannelResult> asyncHandler);

    /**
     * Deletes a campaign.
     * 
     * @param deleteCampaignRequest
     * @return A Java Future containing the result of the DeleteCampaign operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteCampaign
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
     */
    java.util.concurrent.Future<DeleteCampaignResult> deleteCampaignAsync(DeleteCampaignRequest deleteCampaignRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCampaignRequest, DeleteCampaignResult> asyncHandler);

    /**
     * Deletes the event stream for an app.
     * 
     * @param deleteEventStreamRequest
     *        DeleteEventStream Request
     * @return A Java Future containing the result of the DeleteEventStream operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteEventStream
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
     */
    java.util.concurrent.Future<DeleteEventStreamResult> deleteEventStreamAsync(DeleteEventStreamRequest deleteEventStreamRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEventStreamRequest, DeleteEventStreamResult> asyncHandler);

    /**
     * Deletes the GCM channel for an app.
     * 
     * @param deleteGcmChannelRequest
     * @return A Java Future containing the result of the DeleteGcmChannel operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteGcmChannel
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
     */
    java.util.concurrent.Future<DeleteGcmChannelResult> deleteGcmChannelAsync(DeleteGcmChannelRequest deleteGcmChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGcmChannelRequest, DeleteGcmChannelResult> asyncHandler);

    /**
     * Deletes a segment.
     * 
     * @param deleteSegmentRequest
     * @return A Java Future containing the result of the DeleteSegment operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteSegment
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
     */
    java.util.concurrent.Future<DeleteSegmentResult> deleteSegmentAsync(DeleteSegmentRequest deleteSegmentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSegmentRequest, DeleteSegmentResult> asyncHandler);

    /**
     * Returns information about the APNs channel for an app.
     * 
     * @param getApnsChannelRequest
     * @return A Java Future containing the result of the GetApnsChannel operation returned by the service.
     * @sample AmazonPinpointAsync.GetApnsChannel
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
     */
    java.util.concurrent.Future<GetApnsChannelResult> getApnsChannelAsync(GetApnsChannelRequest getApnsChannelRequest,
            com.amazonaws.handlers.AsyncHandler<GetApnsChannelRequest, GetApnsChannelResult> asyncHandler);

    /**
     * Used to request the settings for an app.
     * 
     * @param getApplicationSettingsRequest
     * @return A Java Future containing the result of the GetApplicationSettings operation returned by the service.
     * @sample AmazonPinpointAsync.GetApplicationSettings
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
     */
    java.util.concurrent.Future<GetApplicationSettingsResult> getApplicationSettingsAsync(GetApplicationSettingsRequest getApplicationSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetApplicationSettingsRequest, GetApplicationSettingsResult> asyncHandler);

    /**
     * Returns information about a campaign.
     * 
     * @param getCampaignRequest
     * @return A Java Future containing the result of the GetCampaign operation returned by the service.
     * @sample AmazonPinpointAsync.GetCampaign
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
     */
    java.util.concurrent.Future<GetCampaignResult> getCampaignAsync(GetCampaignRequest getCampaignRequest,
            com.amazonaws.handlers.AsyncHandler<GetCampaignRequest, GetCampaignResult> asyncHandler);

    /**
     * Returns information about the activity performed by a campaign.
     * 
     * @param getCampaignActivitiesRequest
     * @return A Java Future containing the result of the GetCampaignActivities operation returned by the service.
     * @sample AmazonPinpointAsync.GetCampaignActivities
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
     */
    java.util.concurrent.Future<GetCampaignActivitiesResult> getCampaignActivitiesAsync(GetCampaignActivitiesRequest getCampaignActivitiesRequest,
            com.amazonaws.handlers.AsyncHandler<GetCampaignActivitiesRequest, GetCampaignActivitiesResult> asyncHandler);

    /**
     * Returns information about a specific version of a campaign.
     * 
     * @param getCampaignVersionRequest
     * @return A Java Future containing the result of the GetCampaignVersion operation returned by the service.
     * @sample AmazonPinpointAsync.GetCampaignVersion
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
     */
    java.util.concurrent.Future<GetCampaignVersionResult> getCampaignVersionAsync(GetCampaignVersionRequest getCampaignVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetCampaignVersionRequest, GetCampaignVersionResult> asyncHandler);

    /**
     * Returns information about your campaign versions.
     * 
     * @param getCampaignVersionsRequest
     * @return A Java Future containing the result of the GetCampaignVersions operation returned by the service.
     * @sample AmazonPinpointAsync.GetCampaignVersions
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
     */
    java.util.concurrent.Future<GetCampaignVersionsResult> getCampaignVersionsAsync(GetCampaignVersionsRequest getCampaignVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetCampaignVersionsRequest, GetCampaignVersionsResult> asyncHandler);

    /**
     * Returns information about your campaigns.
     * 
     * @param getCampaignsRequest
     * @return A Java Future containing the result of the GetCampaigns operation returned by the service.
     * @sample AmazonPinpointAsync.GetCampaigns
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
     */
    java.util.concurrent.Future<GetCampaignsResult> getCampaignsAsync(GetCampaignsRequest getCampaignsRequest,
            com.amazonaws.handlers.AsyncHandler<GetCampaignsRequest, GetCampaignsResult> asyncHandler);

    /**
     * Returns information about an endpoint.
     * 
     * @param getEndpointRequest
     * @return A Java Future containing the result of the GetEndpoint operation returned by the service.
     * @sample AmazonPinpointAsync.GetEndpoint
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
     */
    java.util.concurrent.Future<GetEndpointResult> getEndpointAsync(GetEndpointRequest getEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<GetEndpointRequest, GetEndpointResult> asyncHandler);

    /**
     * Returns the event stream for an app.
     * 
     * @param getEventStreamRequest
     *        GetEventStream Request
     * @return A Java Future containing the result of the GetEventStream operation returned by the service.
     * @sample AmazonPinpointAsync.GetEventStream
     */
    java.util.concurrent.Future<GetEventStreamResult> getEventStreamAsync(GetEventStreamRequest getEventStreamRequest);

    /**
     * Returns the event stream for an app.
     * 
     * @param getEventStreamRequest
     *        GetEventStream Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEventStream operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetEventStream
     */
    java.util.concurrent.Future<GetEventStreamResult> getEventStreamAsync(GetEventStreamRequest getEventStreamRequest,
            com.amazonaws.handlers.AsyncHandler<GetEventStreamRequest, GetEventStreamResult> asyncHandler);

    /**
     * Returns information about the GCM channel for an app.
     * 
     * @param getGcmChannelRequest
     * @return A Java Future containing the result of the GetGcmChannel operation returned by the service.
     * @sample AmazonPinpointAsync.GetGcmChannel
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
     */
    java.util.concurrent.Future<GetGcmChannelResult> getGcmChannelAsync(GetGcmChannelRequest getGcmChannelRequest,
            com.amazonaws.handlers.AsyncHandler<GetGcmChannelRequest, GetGcmChannelResult> asyncHandler);

    /**
     * Returns information about an import job.
     * 
     * @param getImportJobRequest
     * @return A Java Future containing the result of the GetImportJob operation returned by the service.
     * @sample AmazonPinpointAsync.GetImportJob
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
     */
    java.util.concurrent.Future<GetImportJobResult> getImportJobAsync(GetImportJobRequest getImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetImportJobRequest, GetImportJobResult> asyncHandler);

    /**
     * Returns information about your import jobs.
     * 
     * @param getImportJobsRequest
     * @return A Java Future containing the result of the GetImportJobs operation returned by the service.
     * @sample AmazonPinpointAsync.GetImportJobs
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
     */
    java.util.concurrent.Future<GetImportJobsResult> getImportJobsAsync(GetImportJobsRequest getImportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<GetImportJobsRequest, GetImportJobsResult> asyncHandler);

    /**
     * Returns information about a segment.
     * 
     * @param getSegmentRequest
     * @return A Java Future containing the result of the GetSegment operation returned by the service.
     * @sample AmazonPinpointAsync.GetSegment
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
     */
    java.util.concurrent.Future<GetSegmentResult> getSegmentAsync(GetSegmentRequest getSegmentRequest,
            com.amazonaws.handlers.AsyncHandler<GetSegmentRequest, GetSegmentResult> asyncHandler);

    /**
     * Returns a list of import jobs for a specific segment.
     * 
     * @param getSegmentImportJobsRequest
     * @return A Java Future containing the result of the GetSegmentImportJobs operation returned by the service.
     * @sample AmazonPinpointAsync.GetSegmentImportJobs
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
     */
    java.util.concurrent.Future<GetSegmentImportJobsResult> getSegmentImportJobsAsync(GetSegmentImportJobsRequest getSegmentImportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<GetSegmentImportJobsRequest, GetSegmentImportJobsResult> asyncHandler);

    /**
     * Returns information about a segment version.
     * 
     * @param getSegmentVersionRequest
     * @return A Java Future containing the result of the GetSegmentVersion operation returned by the service.
     * @sample AmazonPinpointAsync.GetSegmentVersion
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
     */
    java.util.concurrent.Future<GetSegmentVersionResult> getSegmentVersionAsync(GetSegmentVersionRequest getSegmentVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetSegmentVersionRequest, GetSegmentVersionResult> asyncHandler);

    /**
     * Returns information about your segment versions.
     * 
     * @param getSegmentVersionsRequest
     * @return A Java Future containing the result of the GetSegmentVersions operation returned by the service.
     * @sample AmazonPinpointAsync.GetSegmentVersions
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
     */
    java.util.concurrent.Future<GetSegmentVersionsResult> getSegmentVersionsAsync(GetSegmentVersionsRequest getSegmentVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetSegmentVersionsRequest, GetSegmentVersionsResult> asyncHandler);

    /**
     * Used to get information about your segments.
     * 
     * @param getSegmentsRequest
     * @return A Java Future containing the result of the GetSegments operation returned by the service.
     * @sample AmazonPinpointAsync.GetSegments
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
     */
    java.util.concurrent.Future<GetSegmentsResult> getSegmentsAsync(GetSegmentsRequest getSegmentsRequest,
            com.amazonaws.handlers.AsyncHandler<GetSegmentsRequest, GetSegmentsResult> asyncHandler);

    /**
     * Use to create or update the event stream for an app.
     * 
     * @param putEventStreamRequest
     *        PutEventStream Request
     * @return A Java Future containing the result of the PutEventStream operation returned by the service.
     * @sample AmazonPinpointAsync.PutEventStream
     */
    java.util.concurrent.Future<PutEventStreamResult> putEventStreamAsync(PutEventStreamRequest putEventStreamRequest);

    /**
     * Use to create or update the event stream for an app.
     * 
     * @param putEventStreamRequest
     *        PutEventStream Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutEventStream operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.PutEventStream
     */
    java.util.concurrent.Future<PutEventStreamResult> putEventStreamAsync(PutEventStreamRequest putEventStreamRequest,
            com.amazonaws.handlers.AsyncHandler<PutEventStreamRequest, PutEventStreamResult> asyncHandler);

    /**
     * Use to update the APNs channel for an app.
     * 
     * @param updateApnsChannelRequest
     * @return A Java Future containing the result of the UpdateApnsChannel operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateApnsChannel
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
     */
    java.util.concurrent.Future<UpdateApnsChannelResult> updateApnsChannelAsync(UpdateApnsChannelRequest updateApnsChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApnsChannelRequest, UpdateApnsChannelResult> asyncHandler);

    /**
     * Used to update the settings for an app.
     * 
     * @param updateApplicationSettingsRequest
     * @return A Java Future containing the result of the UpdateApplicationSettings operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateApplicationSettings
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
     */
    java.util.concurrent.Future<UpdateApplicationSettingsResult> updateApplicationSettingsAsync(
            UpdateApplicationSettingsRequest updateApplicationSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationSettingsRequest, UpdateApplicationSettingsResult> asyncHandler);

    /**
     * Use to update a campaign.
     * 
     * @param updateCampaignRequest
     * @return A Java Future containing the result of the UpdateCampaign operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateCampaign
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
     */
    java.util.concurrent.Future<UpdateCampaignResult> updateCampaignAsync(UpdateCampaignRequest updateCampaignRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCampaignRequest, UpdateCampaignResult> asyncHandler);

    /**
     * Use to update an endpoint.
     * 
     * @param updateEndpointRequest
     * @return A Java Future containing the result of the UpdateEndpoint operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateEndpoint
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
     */
    java.util.concurrent.Future<UpdateEndpointResult> updateEndpointAsync(UpdateEndpointRequest updateEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEndpointRequest, UpdateEndpointResult> asyncHandler);

    /**
     * Use to update a batch of endpoints.
     * 
     * @param updateEndpointsBatchRequest
     * @return A Java Future containing the result of the UpdateEndpointsBatch operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateEndpointsBatch
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
     */
    java.util.concurrent.Future<UpdateEndpointsBatchResult> updateEndpointsBatchAsync(UpdateEndpointsBatchRequest updateEndpointsBatchRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEndpointsBatchRequest, UpdateEndpointsBatchResult> asyncHandler);

    /**
     * Use to update the GCM channel for an app.
     * 
     * @param updateGcmChannelRequest
     * @return A Java Future containing the result of the UpdateGcmChannel operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateGcmChannel
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
     */
    java.util.concurrent.Future<UpdateGcmChannelResult> updateGcmChannelAsync(UpdateGcmChannelRequest updateGcmChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGcmChannelRequest, UpdateGcmChannelResult> asyncHandler);

    /**
     * Use to update a segment.
     * 
     * @param updateSegmentRequest
     * @return A Java Future containing the result of the UpdateSegment operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateSegment
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
     */
    java.util.concurrent.Future<UpdateSegmentResult> updateSegmentAsync(UpdateSegmentRequest updateSegmentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSegmentRequest, UpdateSegmentResult> asyncHandler);

}
