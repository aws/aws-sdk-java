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
package com.amazonaws.services.elastictranscoder;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.services.elastictranscoder.waiters.AmazonElasticTranscoderWaiters;

/**
 * Interface for accessing Amazon Elastic Transcoder.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.elastictranscoder.AbstractAmazonElasticTranscoder} instead.
 * </p>
 * <p>
 * <fullname>AWS Elastic Transcoder Service</fullname>
 * <p>
 * The AWS Elastic Transcoder Service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonElasticTranscoder {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "elastictranscoder";

    /**
     * Overrides the default endpoint for this client ("elastictranscoder.us-east-1.amazonaws.com/"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "elastictranscoder.us-east-1.amazonaws.com/") or a full URL, including
     * the protocol (ex: "elastictranscoder.us-east-1.amazonaws.com/"). If the protocol is not specified here, the
     * default protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "elastictranscoder.us-east-1.amazonaws.com/") or a full URL, including the protocol (ex:
     *        "elastictranscoder.us-east-1.amazonaws.com/") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonElasticTranscoder#setEndpoint(String)}, sets the regional endpoint for this
     * client's service calls. Callers can use this method to control which AWS region they want to work with.
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
     * <p>
     * The CancelJob operation cancels an unfinished job.
     * </p>
     * <note>
     * <p>
     * You can only cancel a job that has a status of <code>Submitted</code>. To prevent a pipeline from starting to
     * process a job while you're getting the job identifier, use <a>UpdatePipelineStatus</a> to temporarily pause the
     * pipeline.
     * </p>
     * </note>
     * 
     * @param cancelJobRequest
     *        The <code>CancelJobRequest</code> structure.
     * @return Result of the CancelJob operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For example, the pipeline to which you're
     *         trying to add a job doesn't exist or is still being created.
     * @throws ResourceInUseException
     *         The resource you are attempting to change is in use. For example, you are attempting to delete a pipeline
     *         that is currently in use.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.CancelJob
     */
    CancelJobResult cancelJob(CancelJobRequest cancelJobRequest);

    /**
     * <p>
     * When you create a job, Elastic Transcoder returns JSON data that includes the values that you specified plus
     * information about the job that is created.
     * </p>
     * <p>
     * If you have specified more than one output for your jobs (for example, one output for the Kindle Fire and another
     * output for the Apple iPhone 4s), you currently must use the Elastic Transcoder API to list the jobs (as opposed
     * to the AWS Console).
     * </p>
     * 
     * @param createJobRequest
     *        The <code>CreateJobRequest</code> structure.
     * @return Result of the CreateJob operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For example, the pipeline to which you're
     *         trying to add a job doesn't exist or is still being created.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws LimitExceededException
     *         Too many operations for a given AWS account. For example, the number of pipelines exceeds the maximum
     *         allowed.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.CreateJob
     */
    CreateJobResult createJob(CreateJobRequest createJobRequest);

    /**
     * <p>
     * The CreatePipeline operation creates a pipeline with settings that you specify.
     * </p>
     * 
     * @param createPipelineRequest
     *        The <code>CreatePipelineRequest</code> structure.
     * @return Result of the CreatePipeline operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For example, the pipeline to which you're
     *         trying to add a job doesn't exist or is still being created.
     * @throws LimitExceededException
     *         Too many operations for a given AWS account. For example, the number of pipelines exceeds the maximum
     *         allowed.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.CreatePipeline
     */
    CreatePipelineResult createPipeline(CreatePipelineRequest createPipelineRequest);

    /**
     * <p>
     * The CreatePreset operation creates a preset with settings that you specify.
     * </p>
     * <important>
     * <p>
     * Elastic Transcoder checks the CreatePreset settings to ensure that they meet Elastic Transcoder requirements and
     * to determine whether they comply with H.264 standards. If your settings are not valid for Elastic Transcoder,
     * Elastic Transcoder returns an HTTP 400 response (<code>ValidationException</code>) and does not create the
     * preset. If the settings are valid for Elastic Transcoder but aren't strictly compliant with the H.264 standard,
     * Elastic Transcoder creates the preset and returns a warning message in the response. This helps you determine
     * whether your settings comply with the H.264 standard while giving you greater flexibility with respect to the
     * video that Elastic Transcoder produces.
     * </p>
     * </important>
     * <p>
     * Elastic Transcoder uses the H.264 video-compression format. For more information, see the International
     * Telecommunication Union publication <i>Recommendation ITU-T H.264: Advanced video coding for generic audiovisual
     * services</i>.
     * </p>
     * 
     * @param createPresetRequest
     *        The <code>CreatePresetRequest</code> structure.
     * @return Result of the CreatePreset operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws LimitExceededException
     *         Too many operations for a given AWS account. For example, the number of pipelines exceeds the maximum
     *         allowed.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.CreatePreset
     */
    CreatePresetResult createPreset(CreatePresetRequest createPresetRequest);

    /**
     * <p>
     * The DeletePipeline operation removes a pipeline.
     * </p>
     * <p>
     * You can only delete a pipeline that has never been used or that is not currently in use (doesn't contain any
     * active jobs). If the pipeline is currently in use, <code>DeletePipeline</code> returns an error.
     * </p>
     * 
     * @param deletePipelineRequest
     *        The <code>DeletePipelineRequest</code> structure.
     * @return Result of the DeletePipeline operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For example, the pipeline to which you're
     *         trying to add a job doesn't exist or is still being created.
     * @throws ResourceInUseException
     *         The resource you are attempting to change is in use. For example, you are attempting to delete a pipeline
     *         that is currently in use.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.DeletePipeline
     */
    DeletePipelineResult deletePipeline(DeletePipelineRequest deletePipelineRequest);

    /**
     * <p>
     * The DeletePreset operation removes a preset that you've added in an AWS region.
     * </p>
     * <note>
     * <p>
     * You can't delete the default presets that are included with Elastic Transcoder.
     * </p>
     * </note>
     * 
     * @param deletePresetRequest
     *        The <code>DeletePresetRequest</code> structure.
     * @return Result of the DeletePreset operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For example, the pipeline to which you're
     *         trying to add a job doesn't exist or is still being created.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.DeletePreset
     */
    DeletePresetResult deletePreset(DeletePresetRequest deletePresetRequest);

    /**
     * <p>
     * The ListJobsByPipeline operation gets a list of the jobs currently in a pipeline.
     * </p>
     * <p>
     * Elastic Transcoder returns all of the jobs currently in the specified pipeline. The response body contains one
     * element for each job that satisfies the search criteria.
     * </p>
     * 
     * @param listJobsByPipelineRequest
     *        The <code>ListJobsByPipelineRequest</code> structure.
     * @return Result of the ListJobsByPipeline operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For example, the pipeline to which you're
     *         trying to add a job doesn't exist or is still being created.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.ListJobsByPipeline
     */
    ListJobsByPipelineResult listJobsByPipeline(ListJobsByPipelineRequest listJobsByPipelineRequest);

    /**
     * <p>
     * The ListJobsByStatus operation gets a list of jobs that have a specified status. The response body contains one
     * element for each job that satisfies the search criteria.
     * </p>
     * 
     * @param listJobsByStatusRequest
     *        The <code>ListJobsByStatusRequest</code> structure.
     * @return Result of the ListJobsByStatus operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For example, the pipeline to which you're
     *         trying to add a job doesn't exist or is still being created.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.ListJobsByStatus
     */
    ListJobsByStatusResult listJobsByStatus(ListJobsByStatusRequest listJobsByStatusRequest);

    /**
     * <p>
     * The ListPipelines operation gets a list of the pipelines associated with the current AWS account.
     * </p>
     * 
     * @param listPipelinesRequest
     *        The <code>ListPipelineRequest</code> structure.
     * @return Result of the ListPipelines operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.ListPipelines
     */
    ListPipelinesResult listPipelines(ListPipelinesRequest listPipelinesRequest);

    /**
     * Simplified method form for invoking the ListPipelines operation.
     *
     * @see #listPipelines(ListPipelinesRequest)
     */
    ListPipelinesResult listPipelines();

    /**
     * <p>
     * The ListPresets operation gets a list of the default presets included with Elastic Transcoder and the presets
     * that you've added in an AWS region.
     * </p>
     * 
     * @param listPresetsRequest
     *        The <code>ListPresetsRequest</code> structure.
     * @return Result of the ListPresets operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.ListPresets
     */
    ListPresetsResult listPresets(ListPresetsRequest listPresetsRequest);

    /**
     * Simplified method form for invoking the ListPresets operation.
     *
     * @see #listPresets(ListPresetsRequest)
     */
    ListPresetsResult listPresets();

    /**
     * <p>
     * The ReadJob operation returns detailed information about a job.
     * </p>
     * 
     * @param readJobRequest
     *        The <code>ReadJobRequest</code> structure.
     * @return Result of the ReadJob operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For example, the pipeline to which you're
     *         trying to add a job doesn't exist or is still being created.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.ReadJob
     */
    ReadJobResult readJob(ReadJobRequest readJobRequest);

    /**
     * <p>
     * The ReadPipeline operation gets detailed information about a pipeline.
     * </p>
     * 
     * @param readPipelineRequest
     *        The <code>ReadPipelineRequest</code> structure.
     * @return Result of the ReadPipeline operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For example, the pipeline to which you're
     *         trying to add a job doesn't exist or is still being created.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.ReadPipeline
     */
    ReadPipelineResult readPipeline(ReadPipelineRequest readPipelineRequest);

    /**
     * <p>
     * The ReadPreset operation gets detailed information about a preset.
     * </p>
     * 
     * @param readPresetRequest
     *        The <code>ReadPresetRequest</code> structure.
     * @return Result of the ReadPreset operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For example, the pipeline to which you're
     *         trying to add a job doesn't exist or is still being created.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.ReadPreset
     */
    ReadPresetResult readPreset(ReadPresetRequest readPresetRequest);

    /**
     * <p>
     * The TestRole operation tests the IAM role used to create the pipeline.
     * </p>
     * <p>
     * The <code>TestRole</code> action lets you determine whether the IAM role you are using has sufficient permissions
     * to let Elastic Transcoder perform tasks associated with the transcoding process. The action attempts to assume
     * the specified IAM role, checks read access to the input and output buckets, and tries to send a test notification
     * to Amazon SNS topics that you specify.
     * </p>
     * 
     * @param testRoleRequest
     *        The <code>TestRoleRequest</code> structure.
     * @return Result of the TestRole operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For example, the pipeline to which you're
     *         trying to add a job doesn't exist or is still being created.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.TestRole
     */
    @Deprecated
    TestRoleResult testRole(TestRoleRequest testRoleRequest);

    /**
     * <p>
     * Use the <code>UpdatePipeline</code> operation to update settings for a pipeline.
     * </p>
     * <important>
     * <p>
     * When you change pipeline settings, your changes take effect immediately. Jobs that you have already submitted and
     * that Elastic Transcoder has not started to process are affected in addition to jobs that you submit after you
     * change settings.
     * </p>
     * </important>
     * 
     * @param updatePipelineRequest
     *        The <code>UpdatePipelineRequest</code> structure.
     * @return Result of the UpdatePipeline operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws ResourceInUseException
     *         The resource you are attempting to change is in use. For example, you are attempting to delete a pipeline
     *         that is currently in use.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For example, the pipeline to which you're
     *         trying to add a job doesn't exist or is still being created.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.UpdatePipeline
     */
    UpdatePipelineResult updatePipeline(UpdatePipelineRequest updatePipelineRequest);

    /**
     * <p>
     * With the UpdatePipelineNotifications operation, you can update Amazon Simple Notification Service (Amazon SNS)
     * notifications for a pipeline.
     * </p>
     * <p>
     * When you update notifications for a pipeline, Elastic Transcoder returns the values that you specified in the
     * request.
     * </p>
     * 
     * @param updatePipelineNotificationsRequest
     *        The <code>UpdatePipelineNotificationsRequest</code> structure.
     * @return Result of the UpdatePipelineNotifications operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For example, the pipeline to which you're
     *         trying to add a job doesn't exist or is still being created.
     * @throws ResourceInUseException
     *         The resource you are attempting to change is in use. For example, you are attempting to delete a pipeline
     *         that is currently in use.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.UpdatePipelineNotifications
     */
    UpdatePipelineNotificationsResult updatePipelineNotifications(UpdatePipelineNotificationsRequest updatePipelineNotificationsRequest);

    /**
     * <p>
     * The UpdatePipelineStatus operation pauses or reactivates a pipeline, so that the pipeline stops or restarts the
     * processing of jobs.
     * </p>
     * <p>
     * Changing the pipeline status is useful if you want to cancel one or more jobs. You can't cancel jobs after
     * Elastic Transcoder has started processing them; if you pause the pipeline to which you submitted the jobs, you
     * have more time to get the job IDs for the jobs that you want to cancel, and to send a <a>CancelJob</a> request.
     * </p>
     * 
     * @param updatePipelineStatusRequest
     *        The <code>UpdatePipelineStatusRequest</code> structure.
     * @return Result of the UpdatePipelineStatus operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For example, the pipeline to which you're
     *         trying to add a job doesn't exist or is still being created.
     * @throws ResourceInUseException
     *         The resource you are attempting to change is in use. For example, you are attempting to delete a pipeline
     *         that is currently in use.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.UpdatePipelineStatus
     */
    UpdatePipelineStatusResult updatePipelineStatus(UpdatePipelineStatusRequest updatePipelineStatusRequest);

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

    AmazonElasticTranscoderWaiters waiters();

}
