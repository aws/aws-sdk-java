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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.pinpoint.model.*;

/**
 * Interface for accessing Amazon Pinpoint.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.pinpoint.AbstractAmazonPinpoint} instead.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonPinpoint {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "pinpoint";

    /**
     * Overrides the default endpoint for this client ("https://pinpoint.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "pinpoint.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://pinpoint.us-east-1.amazonaws.com"). If the protocol is not specified here, the default
     * protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "pinpoint.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://pinpoint.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonPinpoint#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * Creates or updates an app.
     * 
     * @param createAppRequest
     * @return Result of the CreateApp operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.CreateApp
     */
    CreateAppResult createApp(CreateAppRequest createAppRequest);

    /**
     * Creates or updates a campaign.
     * 
     * @param createCampaignRequest
     * @return Result of the CreateCampaign operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.CreateCampaign
     */
    CreateCampaignResult createCampaign(CreateCampaignRequest createCampaignRequest);

    /**
     * Creates or updates an import job.
     * 
     * @param createImportJobRequest
     * @return Result of the CreateImportJob operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.CreateImportJob
     */
    CreateImportJobResult createImportJob(CreateImportJobRequest createImportJobRequest);

    /**
     * Used to create or update a segment.
     * 
     * @param createSegmentRequest
     * @return Result of the CreateSegment operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.CreateSegment
     */
    CreateSegmentResult createSegment(CreateSegmentRequest createSegmentRequest);

    /**
     * Delete an ADM channel
     * 
     * @param deleteAdmChannelRequest
     * @return Result of the DeleteAdmChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.DeleteAdmChannel
     */
    DeleteAdmChannelResult deleteAdmChannel(DeleteAdmChannelRequest deleteAdmChannelRequest);

    /**
     * Deletes the APNs channel for an app.
     * 
     * @param deleteApnsChannelRequest
     * @return Result of the DeleteApnsChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.DeleteApnsChannel
     */
    DeleteApnsChannelResult deleteApnsChannel(DeleteApnsChannelRequest deleteApnsChannelRequest);

    /**
     * Delete an APNS sandbox channel
     * 
     * @param deleteApnsSandboxChannelRequest
     * @return Result of the DeleteApnsSandboxChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.DeleteApnsSandboxChannel
     */
    DeleteApnsSandboxChannelResult deleteApnsSandboxChannel(DeleteApnsSandboxChannelRequest deleteApnsSandboxChannelRequest);

    /**
     * Deletes an app.
     * 
     * @param deleteAppRequest
     * @return Result of the DeleteApp operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.DeleteApp
     */
    DeleteAppResult deleteApp(DeleteAppRequest deleteAppRequest);

    /**
     * Delete a BAIDU GCM channel
     * 
     * @param deleteBaiduChannelRequest
     * @return Result of the DeleteBaiduChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.DeleteBaiduChannel
     */
    DeleteBaiduChannelResult deleteBaiduChannel(DeleteBaiduChannelRequest deleteBaiduChannelRequest);

    /**
     * Deletes a campaign.
     * 
     * @param deleteCampaignRequest
     * @return Result of the DeleteCampaign operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.DeleteCampaign
     */
    DeleteCampaignResult deleteCampaign(DeleteCampaignRequest deleteCampaignRequest);

    /**
     * Delete an email channel
     * 
     * @param deleteEmailChannelRequest
     * @return Result of the DeleteEmailChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.DeleteEmailChannel
     */
    DeleteEmailChannelResult deleteEmailChannel(DeleteEmailChannelRequest deleteEmailChannelRequest);

    /**
     * Deletes the event stream for an app.
     * 
     * @param deleteEventStreamRequest
     *        DeleteEventStream Request
     * @return Result of the DeleteEventStream operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.DeleteEventStream
     */
    DeleteEventStreamResult deleteEventStream(DeleteEventStreamRequest deleteEventStreamRequest);

    /**
     * Deletes the GCM channel for an app.
     * 
     * @param deleteGcmChannelRequest
     * @return Result of the DeleteGcmChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.DeleteGcmChannel
     */
    DeleteGcmChannelResult deleteGcmChannel(DeleteGcmChannelRequest deleteGcmChannelRequest);

    /**
     * Deletes a segment.
     * 
     * @param deleteSegmentRequest
     * @return Result of the DeleteSegment operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.DeleteSegment
     */
    DeleteSegmentResult deleteSegment(DeleteSegmentRequest deleteSegmentRequest);

    /**
     * Delete an SMS channel
     * 
     * @param deleteSmsChannelRequest
     * @return Result of the DeleteSmsChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.DeleteSmsChannel
     */
    DeleteSmsChannelResult deleteSmsChannel(DeleteSmsChannelRequest deleteSmsChannelRequest);

    /**
     * Get an ADM channel
     * 
     * @param getAdmChannelRequest
     * @return Result of the GetAdmChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetAdmChannel
     */
    GetAdmChannelResult getAdmChannel(GetAdmChannelRequest getAdmChannelRequest);

    /**
     * Returns information about the APNs channel for an app.
     * 
     * @param getApnsChannelRequest
     * @return Result of the GetApnsChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetApnsChannel
     */
    GetApnsChannelResult getApnsChannel(GetApnsChannelRequest getApnsChannelRequest);

    /**
     * Get an APNS sandbox channel
     * 
     * @param getApnsSandboxChannelRequest
     * @return Result of the GetApnsSandboxChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetApnsSandboxChannel
     */
    GetApnsSandboxChannelResult getApnsSandboxChannel(GetApnsSandboxChannelRequest getApnsSandboxChannelRequest);

    /**
     * Returns information about an app.
     * 
     * @param getAppRequest
     * @return Result of the GetApp operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetApp
     */
    GetAppResult getApp(GetAppRequest getAppRequest);

    /**
     * Used to request the settings for an app.
     * 
     * @param getApplicationSettingsRequest
     * @return Result of the GetApplicationSettings operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetApplicationSettings
     */
    GetApplicationSettingsResult getApplicationSettings(GetApplicationSettingsRequest getApplicationSettingsRequest);

    /**
     * Returns information about your apps.
     * 
     * @param getAppsRequest
     * @return Result of the GetApps operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetApps
     */
    GetAppsResult getApps(GetAppsRequest getAppsRequest);

    /**
     * Get a BAIDU GCM channel
     * 
     * @param getBaiduChannelRequest
     * @return Result of the GetBaiduChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetBaiduChannel
     */
    GetBaiduChannelResult getBaiduChannel(GetBaiduChannelRequest getBaiduChannelRequest);

    /**
     * Returns information about a campaign.
     * 
     * @param getCampaignRequest
     * @return Result of the GetCampaign operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetCampaign
     */
    GetCampaignResult getCampaign(GetCampaignRequest getCampaignRequest);

    /**
     * Returns information about the activity performed by a campaign.
     * 
     * @param getCampaignActivitiesRequest
     * @return Result of the GetCampaignActivities operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetCampaignActivities
     */
    GetCampaignActivitiesResult getCampaignActivities(GetCampaignActivitiesRequest getCampaignActivitiesRequest);

    /**
     * Returns information about a specific version of a campaign.
     * 
     * @param getCampaignVersionRequest
     * @return Result of the GetCampaignVersion operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetCampaignVersion
     */
    GetCampaignVersionResult getCampaignVersion(GetCampaignVersionRequest getCampaignVersionRequest);

    /**
     * Returns information about your campaign versions.
     * 
     * @param getCampaignVersionsRequest
     * @return Result of the GetCampaignVersions operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetCampaignVersions
     */
    GetCampaignVersionsResult getCampaignVersions(GetCampaignVersionsRequest getCampaignVersionsRequest);

    /**
     * Returns information about your campaigns.
     * 
     * @param getCampaignsRequest
     * @return Result of the GetCampaigns operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetCampaigns
     */
    GetCampaignsResult getCampaigns(GetCampaignsRequest getCampaignsRequest);

    /**
     * Get an email channel
     * 
     * @param getEmailChannelRequest
     * @return Result of the GetEmailChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetEmailChannel
     */
    GetEmailChannelResult getEmailChannel(GetEmailChannelRequest getEmailChannelRequest);

    /**
     * Returns information about an endpoint.
     * 
     * @param getEndpointRequest
     * @return Result of the GetEndpoint operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetEndpoint
     */
    GetEndpointResult getEndpoint(GetEndpointRequest getEndpointRequest);

    /**
     * Returns the event stream for an app.
     * 
     * @param getEventStreamRequest
     *        GetEventStream Request
     * @return Result of the GetEventStream operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetEventStream
     */
    GetEventStreamResult getEventStream(GetEventStreamRequest getEventStreamRequest);

    /**
     * Returns information about the GCM channel for an app.
     * 
     * @param getGcmChannelRequest
     * @return Result of the GetGcmChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetGcmChannel
     */
    GetGcmChannelResult getGcmChannel(GetGcmChannelRequest getGcmChannelRequest);

    /**
     * Returns information about an import job.
     * 
     * @param getImportJobRequest
     * @return Result of the GetImportJob operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetImportJob
     */
    GetImportJobResult getImportJob(GetImportJobRequest getImportJobRequest);

    /**
     * Returns information about your import jobs.
     * 
     * @param getImportJobsRequest
     * @return Result of the GetImportJobs operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetImportJobs
     */
    GetImportJobsResult getImportJobs(GetImportJobsRequest getImportJobsRequest);

    /**
     * Returns information about a segment.
     * 
     * @param getSegmentRequest
     * @return Result of the GetSegment operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetSegment
     */
    GetSegmentResult getSegment(GetSegmentRequest getSegmentRequest);

    /**
     * Returns a list of import jobs for a specific segment.
     * 
     * @param getSegmentImportJobsRequest
     * @return Result of the GetSegmentImportJobs operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetSegmentImportJobs
     */
    GetSegmentImportJobsResult getSegmentImportJobs(GetSegmentImportJobsRequest getSegmentImportJobsRequest);

    /**
     * Returns information about a segment version.
     * 
     * @param getSegmentVersionRequest
     * @return Result of the GetSegmentVersion operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetSegmentVersion
     */
    GetSegmentVersionResult getSegmentVersion(GetSegmentVersionRequest getSegmentVersionRequest);

    /**
     * Returns information about your segment versions.
     * 
     * @param getSegmentVersionsRequest
     * @return Result of the GetSegmentVersions operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetSegmentVersions
     */
    GetSegmentVersionsResult getSegmentVersions(GetSegmentVersionsRequest getSegmentVersionsRequest);

    /**
     * Used to get information about your segments.
     * 
     * @param getSegmentsRequest
     * @return Result of the GetSegments operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetSegments
     */
    GetSegmentsResult getSegments(GetSegmentsRequest getSegmentsRequest);

    /**
     * Get an SMS channel
     * 
     * @param getSmsChannelRequest
     * @return Result of the GetSmsChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetSmsChannel
     */
    GetSmsChannelResult getSmsChannel(GetSmsChannelRequest getSmsChannelRequest);

    /**
     * Use to create or update the event stream for an app.
     * 
     * @param putEventStreamRequest
     *        PutEventStream Request
     * @return Result of the PutEventStream operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.PutEventStream
     */
    PutEventStreamResult putEventStream(PutEventStreamRequest putEventStreamRequest);

    /**
     * Send a batch of messages
     * 
     * @param sendMessagesRequest
     * @return Result of the SendMessages operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.SendMessages
     */
    SendMessagesResult sendMessages(SendMessagesRequest sendMessagesRequest);

    /**
     * Send a batch of messages to users
     * 
     * @param sendUsersMessagesRequest
     * @return Result of the SendUsersMessages operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.SendUsersMessages
     */
    SendUsersMessagesResult sendUsersMessages(SendUsersMessagesRequest sendUsersMessagesRequest);

    /**
     * Update an ADM channel
     * 
     * @param updateAdmChannelRequest
     * @return Result of the UpdateAdmChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.UpdateAdmChannel
     */
    UpdateAdmChannelResult updateAdmChannel(UpdateAdmChannelRequest updateAdmChannelRequest);

    /**
     * Use to update the APNs channel for an app.
     * 
     * @param updateApnsChannelRequest
     * @return Result of the UpdateApnsChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.UpdateApnsChannel
     */
    UpdateApnsChannelResult updateApnsChannel(UpdateApnsChannelRequest updateApnsChannelRequest);

    /**
     * Update an APNS sandbox channel
     * 
     * @param updateApnsSandboxChannelRequest
     * @return Result of the UpdateApnsSandboxChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.UpdateApnsSandboxChannel
     */
    UpdateApnsSandboxChannelResult updateApnsSandboxChannel(UpdateApnsSandboxChannelRequest updateApnsSandboxChannelRequest);

    /**
     * Used to update the settings for an app.
     * 
     * @param updateApplicationSettingsRequest
     * @return Result of the UpdateApplicationSettings operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.UpdateApplicationSettings
     */
    UpdateApplicationSettingsResult updateApplicationSettings(UpdateApplicationSettingsRequest updateApplicationSettingsRequest);

    /**
     * Update a BAIDU GCM channel
     * 
     * @param updateBaiduChannelRequest
     * @return Result of the UpdateBaiduChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.UpdateBaiduChannel
     */
    UpdateBaiduChannelResult updateBaiduChannel(UpdateBaiduChannelRequest updateBaiduChannelRequest);

    /**
     * Use to update a campaign.
     * 
     * @param updateCampaignRequest
     * @return Result of the UpdateCampaign operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.UpdateCampaign
     */
    UpdateCampaignResult updateCampaign(UpdateCampaignRequest updateCampaignRequest);

    /**
     * Update an email channel
     * 
     * @param updateEmailChannelRequest
     * @return Result of the UpdateEmailChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.UpdateEmailChannel
     */
    UpdateEmailChannelResult updateEmailChannel(UpdateEmailChannelRequest updateEmailChannelRequest);

    /**
     * Use to update an endpoint.
     * 
     * @param updateEndpointRequest
     * @return Result of the UpdateEndpoint operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.UpdateEndpoint
     */
    UpdateEndpointResult updateEndpoint(UpdateEndpointRequest updateEndpointRequest);

    /**
     * Use to update a batch of endpoints.
     * 
     * @param updateEndpointsBatchRequest
     * @return Result of the UpdateEndpointsBatch operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.UpdateEndpointsBatch
     */
    UpdateEndpointsBatchResult updateEndpointsBatch(UpdateEndpointsBatchRequest updateEndpointsBatchRequest);

    /**
     * Use to update the GCM channel for an app.
     * 
     * @param updateGcmChannelRequest
     * @return Result of the UpdateGcmChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.UpdateGcmChannel
     */
    UpdateGcmChannelResult updateGcmChannel(UpdateGcmChannelRequest updateGcmChannelRequest);

    /**
     * Use to update a segment.
     * 
     * @param updateSegmentRequest
     * @return Result of the UpdateSegment operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.UpdateSegment
     */
    UpdateSegmentResult updateSegment(UpdateSegmentRequest updateSegmentRequest);

    /**
     * Update an SMS channel
     * 
     * @param updateSmsChannelRequest
     * @return Result of the UpdateSmsChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.UpdateSmsChannel
     */
    UpdateSmsChannelResult updateSmsChannel(UpdateSmsChannelRequest updateSmsChannelRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
