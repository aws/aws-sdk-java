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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.connectcampaign.model.*;

/**
 * Interface for accessing AmazonConnectCampaignService.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.connectcampaign.AbstractAmazonConnectCampaign} instead.
 * </p>
 * <p>
 * <p>
 * Provide APIs to create and manage Amazon Connect Campaigns.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonConnectCampaign {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "connect-campaigns";

    /**
     * <p>
     * Creates a campaign for the specified Amazon Connect account. This API is idempotent.
     * </p>
     * 
     * @param createCampaignRequest
     *        The request for Create Campaign API.
     * @return Result of the CreateCampaign operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonConnectCampaign.CreateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/CreateCampaign"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCampaignResult createCampaign(CreateCampaignRequest createCampaignRequest);

    /**
     * <p>
     * Deletes a campaign from the specified Amazon Connect account.
     * </p>
     * 
     * @param deleteCampaignRequest
     *        DeleteCampaignRequest
     * @return Result of the DeleteCampaign operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCampaign.DeleteCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/DeleteCampaign"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCampaignResult deleteCampaign(DeleteCampaignRequest deleteCampaignRequest);

    /**
     * <p>
     * Deletes a connect instance config from the specified AWS account.
     * </p>
     * 
     * @param deleteConnectInstanceConfigRequest
     *        DeleteCampaignRequest
     * @return Result of the DeleteConnectInstanceConfig operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidStateException
     *         The request could not be processed because of conflict in the current state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonConnectCampaign.DeleteConnectInstanceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/DeleteConnectInstanceConfig"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteConnectInstanceConfigResult deleteConnectInstanceConfig(DeleteConnectInstanceConfigRequest deleteConnectInstanceConfigRequest);

    /**
     * <p>
     * Delete the Connect Campaigns onboarding job for the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteInstanceOnboardingJobRequest
     *        The request for DeleteInstanceOnboardingJob API.
     * @return Result of the DeleteInstanceOnboardingJob operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidStateException
     *         The request could not be processed because of conflict in the current state.
     * @sample AmazonConnectCampaign.DeleteInstanceOnboardingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/DeleteInstanceOnboardingJob"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteInstanceOnboardingJobResult deleteInstanceOnboardingJob(DeleteInstanceOnboardingJobRequest deleteInstanceOnboardingJobRequest);

    /**
     * <p>
     * Describes the specific campaign.
     * </p>
     * 
     * @param describeCampaignRequest
     *        DescribeCampaignRequests
     * @return Result of the DescribeCampaign operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCampaign.DescribeCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/DescribeCampaign"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeCampaignResult describeCampaign(DescribeCampaignRequest describeCampaignRequest);

    /**
     * <p>
     * Get state of a campaign for the specified Amazon Connect account.
     * </p>
     * 
     * @param getCampaignStateRequest
     *        GetCampaignStateRequest
     * @return Result of the GetCampaignState operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonConnectCampaign.GetCampaignState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/GetCampaignState"
     *      target="_top">AWS API Documentation</a>
     */
    GetCampaignStateResult getCampaignState(GetCampaignStateRequest getCampaignStateRequest);

    /**
     * <p>
     * Get state of campaigns for the specified Amazon Connect account.
     * </p>
     * 
     * @param getCampaignStateBatchRequest
     *        GetCampaignStateBatchRequest
     * @return Result of the GetCampaignStateBatch operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonConnectCampaign.GetCampaignStateBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/GetCampaignStateBatch"
     *      target="_top">AWS API Documentation</a>
     */
    GetCampaignStateBatchResult getCampaignStateBatch(GetCampaignStateBatchRequest getCampaignStateBatchRequest);

    /**
     * <p>
     * Get the specific Connect instance config.
     * </p>
     * 
     * @param getConnectInstanceConfigRequest
     *        GetConnectInstanceConfigRequest
     * @return Result of the GetConnectInstanceConfig operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCampaign.GetConnectInstanceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/GetConnectInstanceConfig"
     *      target="_top">AWS API Documentation</a>
     */
    GetConnectInstanceConfigResult getConnectInstanceConfig(GetConnectInstanceConfigRequest getConnectInstanceConfigRequest);

    /**
     * <p>
     * Get the specific instance onboarding job status.
     * </p>
     * 
     * @param getInstanceOnboardingJobStatusRequest
     *        GetInstanceOnboardingJobStatusRequest
     * @return Result of the GetInstanceOnboardingJobStatus operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCampaign.GetInstanceOnboardingJobStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/GetInstanceOnboardingJobStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetInstanceOnboardingJobStatusResult getInstanceOnboardingJobStatus(GetInstanceOnboardingJobStatusRequest getInstanceOnboardingJobStatusRequest);

    /**
     * <p>
     * Provides summary information about the campaigns under the specified Amazon Connect account.
     * </p>
     * 
     * @param listCampaignsRequest
     *        ListCampaignsRequest
     * @return Result of the ListCampaigns operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCampaign.ListCampaigns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/ListCampaigns" target="_top">AWS
     *      API Documentation</a>
     */
    ListCampaignsResult listCampaigns(ListCampaignsRequest listCampaignsRequest);

    /**
     * <p>
     * List tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        ListTagsForResource
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonConnectCampaign.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Pauses a campaign for the specified Amazon Connect account.
     * </p>
     * 
     * @param pauseCampaignRequest
     *        PauseCampaignRequest
     * @return Result of the PauseCampaign operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws InvalidCampaignStateException
     *         The request could not be processed because of conflict in the current state of the campaign.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonConnectCampaign.PauseCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/PauseCampaign" target="_top">AWS
     *      API Documentation</a>
     */
    PauseCampaignResult pauseCampaign(PauseCampaignRequest pauseCampaignRequest);

    /**
     * <p>
     * Creates dials requests for the specified campaign Amazon Connect account. This API is idempotent.
     * </p>
     * 
     * @param putDialRequestBatchRequest
     *        PutDialRequestBatchRequest
     * @return Result of the PutDialRequestBatch operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws InvalidCampaignStateException
     *         The request could not be processed because of conflict in the current state of the campaign.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonConnectCampaign.PutDialRequestBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/PutDialRequestBatch"
     *      target="_top">AWS API Documentation</a>
     */
    PutDialRequestBatchResult putDialRequestBatch(PutDialRequestBatchRequest putDialRequestBatchRequest);

    /**
     * <p>
     * Stops a campaign for the specified Amazon Connect account.
     * </p>
     * 
     * @param resumeCampaignRequest
     *        ResumeCampaignRequest
     * @return Result of the ResumeCampaign operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws InvalidCampaignStateException
     *         The request could not be processed because of conflict in the current state of the campaign.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonConnectCampaign.ResumeCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/ResumeCampaign"
     *      target="_top">AWS API Documentation</a>
     */
    ResumeCampaignResult resumeCampaign(ResumeCampaignRequest resumeCampaignRequest);

    /**
     * <p>
     * Starts a campaign for the specified Amazon Connect account.
     * </p>
     * 
     * @param startCampaignRequest
     *        StartCampaignRequest
     * @return Result of the StartCampaign operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws InvalidCampaignStateException
     *         The request could not be processed because of conflict in the current state of the campaign.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonConnectCampaign.StartCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/StartCampaign" target="_top">AWS
     *      API Documentation</a>
     */
    StartCampaignResult startCampaign(StartCampaignRequest startCampaignRequest);

    /**
     * <p>
     * Onboard the specific Amazon Connect instance to Connect Campaigns.
     * </p>
     * 
     * @param startInstanceOnboardingJobRequest
     *        The request for StartInstanceOnboardingJob API.
     * @return Result of the StartInstanceOnboardingJob operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonConnectCampaign.StartInstanceOnboardingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/StartInstanceOnboardingJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartInstanceOnboardingJobResult startInstanceOnboardingJob(StartInstanceOnboardingJobRequest startInstanceOnboardingJobRequest);

    /**
     * <p>
     * Stops a campaign for the specified Amazon Connect account.
     * </p>
     * 
     * @param stopCampaignRequest
     *        StopCampaignRequest
     * @return Result of the StopCampaign operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws InvalidCampaignStateException
     *         The request could not be processed because of conflict in the current state of the campaign.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonConnectCampaign.StopCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/StopCampaign" target="_top">AWS
     *      API Documentation</a>
     */
    StopCampaignResult stopCampaign(StopCampaignRequest stopCampaignRequest);

    /**
     * <p>
     * Tag a resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        TagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonConnectCampaign.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Untag a resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        UntagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonConnectCampaign.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the dialer config of a campaign. This API is idempotent.
     * </p>
     * 
     * @param updateCampaignDialerConfigRequest
     *        UpdateCampaignDialerConfigRequest
     * @return Result of the UpdateCampaignDialerConfig operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCampaign.UpdateCampaignDialerConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/UpdateCampaignDialerConfig"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateCampaignDialerConfigResult updateCampaignDialerConfig(UpdateCampaignDialerConfigRequest updateCampaignDialerConfigRequest);

    /**
     * <p>
     * Updates the name of a campaign. This API is idempotent.
     * </p>
     * 
     * @param updateCampaignNameRequest
     *        UpdateCampaignNameRequest
     * @return Result of the UpdateCampaignName operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCampaign.UpdateCampaignName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/UpdateCampaignName"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateCampaignNameResult updateCampaignName(UpdateCampaignNameRequest updateCampaignNameRequest);

    /**
     * <p>
     * Updates the outbound call config of a campaign. This API is idempotent.
     * </p>
     * 
     * @param updateCampaignOutboundCallConfigRequest
     *        UpdateCampaignOutboundCallConfigRequest
     * @return Result of the UpdateCampaignOutboundCallConfig operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonConnectCampaign.UpdateCampaignOutboundCallConfig
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/UpdateCampaignOutboundCallConfig"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateCampaignOutboundCallConfigResult updateCampaignOutboundCallConfig(UpdateCampaignOutboundCallConfigRequest updateCampaignOutboundCallConfigRequest);

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
