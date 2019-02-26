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
package com.amazonaws.services.mediaconvert;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.mediaconvert.model.*;

/**
 * Interface for accessing MediaConvert.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mediaconvert.AbstractAWSMediaConvert} instead.
 * </p>
 * <p>
 * AWS Elemental MediaConvert
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMediaConvert {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "mediaconvert";

    /**
     * Associates an AWS Certificate Manager (ACM) Amazon Resource Name (ARN) with AWS Elemental MediaConvert.
     * 
     * @param associateCertificateRequest
     * @return Result of the AssociateCertificate operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and cannot fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested does not exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service could not complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.AssociateCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/AssociateCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateCertificateResult associateCertificate(AssociateCertificateRequest associateCertificateRequest);

    /**
     * Permanently cancel a job. Once you have canceled a job, you can't start it again.
     * 
     * @param cancelJobRequest
     * @return Result of the CancelJob operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.CancelJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CancelJob" target="_top">AWS API
     *      Documentation</a>
     */
    CancelJobResult cancelJob(CancelJobRequest cancelJobRequest);

    /**
     * Create a new transcoding job. For information about jobs and job settings, see the User Guide at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * 
     * @param createJobRequest
     * @return Result of the CreateJob operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.CreateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CreateJob" target="_top">AWS API
     *      Documentation</a>
     */
    CreateJobResult createJob(CreateJobRequest createJobRequest);

    /**
     * Create a new job template. For information about job templates see the User Guide at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * 
     * @param createJobTemplateRequest
     * @return Result of the CreateJobTemplate operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.CreateJobTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CreateJobTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    CreateJobTemplateResult createJobTemplate(CreateJobTemplateRequest createJobTemplateRequest);

    /**
     * Create a new preset. For information about job templates see the User Guide at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * 
     * @param createPresetRequest
     * @return Result of the CreatePreset operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.CreatePreset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CreatePreset" target="_top">AWS API
     *      Documentation</a>
     */
    CreatePresetResult createPreset(CreatePresetRequest createPresetRequest);

    /**
     * Create a new transcoding queue. For information about queues, see Working With Queues in the User Guide at
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html
     * 
     * @param createQueueRequest
     * @return Result of the CreateQueue operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.CreateQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CreateQueue" target="_top">AWS API
     *      Documentation</a>
     */
    CreateQueueResult createQueue(CreateQueueRequest createQueueRequest);

    /**
     * Permanently delete a job template you have created.
     * 
     * @param deleteJobTemplateRequest
     * @return Result of the DeleteJobTemplate operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.DeleteJobTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DeleteJobTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteJobTemplateResult deleteJobTemplate(DeleteJobTemplateRequest deleteJobTemplateRequest);

    /**
     * Permanently delete a preset you have created.
     * 
     * @param deletePresetRequest
     * @return Result of the DeletePreset operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.DeletePreset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DeletePreset" target="_top">AWS API
     *      Documentation</a>
     */
    DeletePresetResult deletePreset(DeletePresetRequest deletePresetRequest);

    /**
     * Permanently delete a queue you have created.
     * 
     * @param deleteQueueRequest
     * @return Result of the DeleteQueue operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.DeleteQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DeleteQueue" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteQueueResult deleteQueue(DeleteQueueRequest deleteQueueRequest);

    /**
     * Send an request with an empty body to the regional API endpoint to get your account API endpoint.
     * 
     * @param describeEndpointsRequest
     *        DescribeEndpointsRequest
     * @return Result of the DescribeEndpoints operation returned by the service.
     * @throws BadRequestException
     *         BadRequestException
     * @throws InternalServerErrorException
     *         InternalServiceException
     * @throws ForbiddenException
     *         AccessDeniedException
     * @throws NotFoundException
     *         ResourceNotFoundException
     * @throws TooManyRequestsException
     *         LimitExceededException
     * @throws ConflictException
     *         ResourceInUseException
     * @sample AWSMediaConvert.DescribeEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DescribeEndpoints" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeEndpointsResult describeEndpoints(DescribeEndpointsRequest describeEndpointsRequest);

    /**
     * Removes an association between the Amazon Resource Name (ARN) of an AWS Certificate Manager (ACM) certificate and
     * an AWS Elemental MediaConvert resource.
     * 
     * @param disassociateCertificateRequest
     * @return Result of the DisassociateCertificate operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and cannot fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested does not exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service could not complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.DisassociateCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DisassociateCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateCertificateResult disassociateCertificate(DisassociateCertificateRequest disassociateCertificateRequest);

    /**
     * Retrieve the JSON for a specific completed transcoding job.
     * 
     * @param getJobRequest
     * @return Result of the GetJob operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.GetJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/GetJob" target="_top">AWS API
     *      Documentation</a>
     */
    GetJobResult getJob(GetJobRequest getJobRequest);

    /**
     * Retrieve the JSON for a specific job template.
     * 
     * @param getJobTemplateRequest
     * @return Result of the GetJobTemplate operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.GetJobTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/GetJobTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    GetJobTemplateResult getJobTemplate(GetJobTemplateRequest getJobTemplateRequest);

    /**
     * Retrieve the JSON for a specific preset.
     * 
     * @param getPresetRequest
     * @return Result of the GetPreset operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.GetPreset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/GetPreset" target="_top">AWS API
     *      Documentation</a>
     */
    GetPresetResult getPreset(GetPresetRequest getPresetRequest);

    /**
     * Retrieve the JSON for a specific queue.
     * 
     * @param getQueueRequest
     * @return Result of the GetQueue operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.GetQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/GetQueue" target="_top">AWS API
     *      Documentation</a>
     */
    GetQueueResult getQueue(GetQueueRequest getQueueRequest);

    /**
     * Retrieve a JSON array of up to twenty of your job templates. This will return the templates themselves, not just
     * a list of them. To retrieve the next twenty templates, use the nextToken string returned with the array
     * 
     * @param listJobTemplatesRequest
     * @return Result of the ListJobTemplates operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.ListJobTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ListJobTemplates" target="_top">AWS
     *      API Documentation</a>
     */
    ListJobTemplatesResult listJobTemplates(ListJobTemplatesRequest listJobTemplatesRequest);

    /**
     * Retrieve a JSON array of up to twenty of your most recently created jobs. This array includes in-process,
     * completed, and errored jobs. This will return the jobs themselves, not just a list of the jobs. To retrieve the
     * twenty next most recent jobs, use the nextToken string returned with the array.
     * 
     * @param listJobsRequest
     * @return Result of the ListJobs operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    ListJobsResult listJobs(ListJobsRequest listJobsRequest);

    /**
     * Retrieve a JSON array of up to twenty of your presets. This will return the presets themselves, not just a list
     * of them. To retrieve the next twenty presets, use the nextToken string returned with the array.
     * 
     * @param listPresetsRequest
     * @return Result of the ListPresets operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.ListPresets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ListPresets" target="_top">AWS API
     *      Documentation</a>
     */
    ListPresetsResult listPresets(ListPresetsRequest listPresetsRequest);

    /**
     * Retrieve a JSON array of up to twenty of your queues. This will return the queues themselves, not just a list of
     * them. To retrieve the next twenty queues, use the nextToken string returned with the array.
     * 
     * @param listQueuesRequest
     * @return Result of the ListQueues operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.ListQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ListQueues" target="_top">AWS API
     *      Documentation</a>
     */
    ListQueuesResult listQueues(ListQueuesRequest listQueuesRequest);

    /**
     * Retrieve the tags for a MediaConvert resource.
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * Add tags to a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide at
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * Remove tags from a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide
     * at https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * Modify one of your existing job templates.
     * 
     * @param updateJobTemplateRequest
     * @return Result of the UpdateJobTemplate operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.UpdateJobTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/UpdateJobTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateJobTemplateResult updateJobTemplate(UpdateJobTemplateRequest updateJobTemplateRequest);

    /**
     * Modify one of your existing presets.
     * 
     * @param updatePresetRequest
     * @return Result of the UpdatePreset operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.UpdatePreset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/UpdatePreset" target="_top">AWS API
     *      Documentation</a>
     */
    UpdatePresetResult updatePreset(UpdatePresetRequest updatePresetRequest);

    /**
     * Modify one of your existing queues.
     * 
     * @param updateQueueRequest
     * @return Result of the UpdateQueue operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.UpdateQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/UpdateQueue" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateQueueResult updateQueue(UpdateQueueRequest updateQueueRequest);

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
