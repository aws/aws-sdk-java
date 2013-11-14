/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elastictranscoder;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.elastictranscoder.model.*;

/**
 * Interface for accessing AmazonElasticTranscoder.
 * AWS Elastic Transcoder Service <p>
 * The AWS Elastic Transcoder Service.
 * </p>
 */
public interface AmazonElasticTranscoder {

    /**
     * Overrides the default endpoint for this client ("https://elastictranscoder.us-east-1.amazonaws.com/").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "elastictranscoder.us-east-1.amazonaws.com/") or a full
     * URL, including the protocol (ex: "https://elastictranscoder.us-east-1.amazonaws.com/"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "elastictranscoder.us-east-1.amazonaws.com/") or a full URL,
     *            including the protocol (ex: "https://elastictranscoder.us-east-1.amazonaws.com/") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonElasticTranscoder#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * The UpdatePipelineStatus operation pauses or reactivates a pipeline,
     * so that the pipeline stops or restarts the processing of jobs.
     * </p>
     * <p>
     * Changing the pipeline status is useful if you want to cancel one or
     * more jobs. You can't cancel jobs after Elastic Transcoder has started
     * processing them; if you pause the pipeline to which you submitted the
     * jobs, you have more time to get the job IDs for the jobs that you want
     * to cancel, and to send a CancelJob request.
     * </p>
     *
     * @param updatePipelineStatusRequest Container for the necessary
     *           parameters to execute the UpdatePipelineStatus service method on
     *           AmazonElasticTranscoder.
     * 
     * @return The response from the UpdatePipelineStatus service method, as
     *         returned by AmazonElasticTranscoder.
     * 
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ResourceInUseException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdatePipelineStatusResult updatePipelineStatus(UpdatePipelineStatusRequest updatePipelineStatusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * With the UpdatePipelineNotifications operation, you can update Amazon
     * Simple Notification Service (Amazon SNS) notifications for a pipeline.
     * </p>
     * <p>
     * When you update notifications for a pipeline, Elastic Transcoder
     * returns the values that you specified in the request.
     * </p>
     *
     * @param updatePipelineNotificationsRequest Container for the necessary
     *           parameters to execute the UpdatePipelineNotifications service method
     *           on AmazonElasticTranscoder.
     * 
     * @return The response from the UpdatePipelineNotifications service
     *         method, as returned by AmazonElasticTranscoder.
     * 
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ResourceInUseException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdatePipelineNotificationsResult updatePipelineNotifications(UpdatePipelineNotificationsRequest updatePipelineNotificationsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The ReadJob operation returns detailed information about a job.
     * </p>
     *
     * @param readJobRequest Container for the necessary parameters to
     *           execute the ReadJob service method on AmazonElasticTranscoder.
     * 
     * @return The response from the ReadJob service method, as returned by
     *         AmazonElasticTranscoder.
     * 
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ReadJobResult readJob(ReadJobRequest readJobRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The ListJobsByStatus operation gets a list of jobs that have a
     * specified status. The response body contains one element for each job
     * that satisfies the search criteria.
     * </p>
     *
     * @param listJobsByStatusRequest Container for the necessary parameters
     *           to execute the ListJobsByStatus service method on
     *           AmazonElasticTranscoder.
     * 
     * @return The response from the ListJobsByStatus service method, as
     *         returned by AmazonElasticTranscoder.
     * 
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListJobsByStatusResult listJobsByStatus(ListJobsByStatusRequest listJobsByStatusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The ReadPreset operation gets detailed information about a preset.
     * </p>
     *
     * @param readPresetRequest Container for the necessary parameters to
     *           execute the ReadPreset service method on AmazonElasticTranscoder.
     * 
     * @return The response from the ReadPreset service method, as returned
     *         by AmazonElasticTranscoder.
     * 
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ReadPresetResult readPreset(ReadPresetRequest readPresetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The CreatePipeline operation creates a pipeline with settings that you
     * specify.
     * </p>
     *
     * @param createPipelineRequest Container for the necessary parameters to
     *           execute the CreatePipeline service method on AmazonElasticTranscoder.
     * 
     * @return The response from the CreatePipeline service method, as
     *         returned by AmazonElasticTranscoder.
     * 
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws LimitExceededException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreatePipelineResult createPipeline(CreatePipelineRequest createPipelineRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The CancelJob operation cancels an unfinished job.
     * </p>
     * <p>
     * <b>NOTE:</b>You can only cancel a job that has a status of Submitted.
     * To prevent a pipeline from starting to process a job while you're
     * getting the job identifier, use UpdatePipelineStatus to temporarily
     * pause the pipeline.
     * </p>
     *
     * @param cancelJobRequest Container for the necessary parameters to
     *           execute the CancelJob service method on AmazonElasticTranscoder.
     * 
     * @return The response from the CancelJob service method, as returned by
     *         AmazonElasticTranscoder.
     * 
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ResourceInUseException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CancelJobResult cancelJob(CancelJobRequest cancelJobRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Use the <code>UpdatePipeline</code> operation to update settings for
     * a pipeline. <p>
     * <b>IMPORTANT:</b>When you change pipeline settings, your changes take
     * effect immediately. Jobs that you have already submitted and that
     * Elastic Transcoder has not started to process are affected in addition
     * to jobs that you submit after you change settings.
     * </p>
     * 
     * </p>
     *
     * @param updatePipelineRequest Container for the necessary parameters to
     *           execute the UpdatePipeline service method on AmazonElasticTranscoder.
     * 
     * @return The response from the UpdatePipeline service method, as
     *         returned by AmazonElasticTranscoder.
     * 
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdatePipelineResult updatePipeline(UpdatePipelineRequest updatePipelineRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The ListPresets operation gets a list of the default presets included
     * with Elastic Transcoder and the presets that you've added in an AWS
     * region.
     * </p>
     *
     * @param listPresetsRequest Container for the necessary parameters to
     *           execute the ListPresets service method on AmazonElasticTranscoder.
     * 
     * @return The response from the ListPresets service method, as returned
     *         by AmazonElasticTranscoder.
     * 
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListPresetsResult listPresets(ListPresetsRequest listPresetsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The DeletePipeline operation removes a pipeline.
     * </p>
     * <p>
     * You can only delete a pipeline that has never been used or that is
     * not currently in use (doesn't contain any active jobs). If the
     * pipeline is currently in use, <code>DeletePipeline</code> returns an
     * error.
     * </p>
     *
     * @param deletePipelineRequest Container for the necessary parameters to
     *           execute the DeletePipeline service method on AmazonElasticTranscoder.
     * 
     * @return The response from the DeletePipeline service method, as
     *         returned by AmazonElasticTranscoder.
     * 
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ResourceInUseException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeletePipelineResult deletePipeline(DeletePipelineRequest deletePipelineRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The TestRole operation tests the IAM role used to create the pipeline.
     * </p>
     * <p>
     * The <code>TestRole</code> action lets you determine whether the IAM
     * role you are using has sufficient permissions to let Elastic
     * Transcoder perform tasks associated with the transcoding process. The
     * action attempts to assume the specified IAM role, checks read access
     * to the input and output buckets, and tries to send a test notification
     * to Amazon SNS topics that you specify.
     * </p>
     *
     * @param testRoleRequest Container for the necessary parameters to
     *           execute the TestRole service method on AmazonElasticTranscoder.
     * 
     * @return The response from the TestRole service method, as returned by
     *         AmazonElasticTranscoder.
     * 
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public TestRoleResult testRole(TestRoleRequest testRoleRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The ListPipelines operation gets a list of the pipelines associated
     * with the current AWS account.
     * </p>
     *
     * @param listPipelinesRequest Container for the necessary parameters to
     *           execute the ListPipelines service method on AmazonElasticTranscoder.
     * 
     * @return The response from the ListPipelines service method, as
     *         returned by AmazonElasticTranscoder.
     * 
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListPipelinesResult listPipelines(ListPipelinesRequest listPipelinesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The ReadPipeline operation gets detailed information about a pipeline.
     * </p>
     *
     * @param readPipelineRequest Container for the necessary parameters to
     *           execute the ReadPipeline service method on AmazonElasticTranscoder.
     * 
     * @return The response from the ReadPipeline service method, as returned
     *         by AmazonElasticTranscoder.
     * 
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ReadPipelineResult readPipeline(ReadPipelineRequest readPipelineRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The CreatePreset operation creates a preset with settings that you
     * specify.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>Elastic Transcoder checks the CreatePreset settings
     * to ensure that they meet Elastic Transcoder requirements and to
     * determine whether they comply with H.264 standards. If your settings
     * are not valid for Elastic Transcoder, Elastic Transcoder returns an
     * HTTP 400 response (ValidationException) and does not create the
     * preset. If the settings are valid for Elastic Transcoder but aren't
     * strictly compliant with the H.264 standard, Elastic Transcoder creates
     * the preset and returns a warning message in the response. This helps
     * you determine whether your settings comply with the H.264 standard
     * while giving you greater flexibility with respect to the video that
     * Elastic Transcoder produces.
     * </p>
     * <p>
     * Elastic Transcoder uses the H.264 video-compression format. For more
     * information, see the International Telecommunication Union publication
     * <i>Recommendation ITU-T H.264: Advanced video coding for generic
     * audiovisual services</i> .
     * </p>
     *
     * @param createPresetRequest Container for the necessary parameters to
     *           execute the CreatePreset service method on AmazonElasticTranscoder.
     * 
     * @return The response from the CreatePreset service method, as returned
     *         by AmazonElasticTranscoder.
     * 
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws LimitExceededException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreatePresetResult createPreset(CreatePresetRequest createPresetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The DeletePreset operation removes a preset that you've added in an
     * AWS region.
     * </p>
     * <p>
     * <b>NOTE:</b> You can't delete the default presets that are included
     * with Elastic Transcoder.
     * </p>
     *
     * @param deletePresetRequest Container for the necessary parameters to
     *           execute the DeletePreset service method on AmazonElasticTranscoder.
     * 
     * @return The response from the DeletePreset service method, as returned
     *         by AmazonElasticTranscoder.
     * 
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeletePresetResult deletePreset(DeletePresetRequest deletePresetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * When you create a job, Elastic Transcoder returns JSON data that
     * includes the values that you specified plus information about the job
     * that is created.
     * </p>
     * <p>
     * If you have specified more than one output for your jobs (for example,
     * one output for the Kindle Fire and another output for the Apple iPhone
     * 4s), you currently must use the Elastic Transcoder API to list the
     * jobs (as opposed to the AWS Console).
     * </p>
     *
     * @param createJobRequest Container for the necessary parameters to
     *           execute the CreateJob service method on AmazonElasticTranscoder.
     * 
     * @return The response from the CreateJob service method, as returned by
     *         AmazonElasticTranscoder.
     * 
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws LimitExceededException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateJobResult createJob(CreateJobRequest createJobRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The ListJobsByPipeline operation gets a list of the jobs currently in
     * a pipeline.
     * </p>
     * <p>
     * Elastic Transcoder returns all of the jobs currently in the specified
     * pipeline. The response body contains one element for each job that
     * satisfies the search criteria.
     * </p>
     *
     * @param listJobsByPipelineRequest Container for the necessary
     *           parameters to execute the ListJobsByPipeline service method on
     *           AmazonElasticTranscoder.
     * 
     * @return The response from the ListJobsByPipeline service method, as
     *         returned by AmazonElasticTranscoder.
     * 
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListJobsByPipelineResult listJobsByPipeline(ListJobsByPipelineRequest listJobsByPipelineRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The ListPresets operation gets a list of the default presets included
     * with Elastic Transcoder and the presets that you've added in an AWS
     * region.
     * </p>
     * 
     * @return The response from the ListPresets service method, as returned
     *         by AmazonElasticTranscoder.
     * 
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListPresetsResult listPresets() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The ListPipelines operation gets a list of the pipelines associated
     * with the current AWS account.
     * </p>
     * 
     * @return The response from the ListPipelines service method, as
     *         returned by AmazonElasticTranscoder.
     * 
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListPipelinesResult listPipelines() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
        