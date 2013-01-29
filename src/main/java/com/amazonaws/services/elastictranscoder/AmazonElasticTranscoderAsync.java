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
            
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.elastictranscoder.model.*;

/**
 * Interface for accessing AmazonElasticTranscoder asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * AWS Elastic Transcoder Service <p>
 * The AWS Elastic Transcoder Service.
 * </p> 
 */       
public interface AmazonElasticTranscoderAsync extends AmazonElasticTranscoder {
    /**
     * <p>
     * To delete a pipeline, send a DELETE request to the
     * <code>/2012-09-25/pipelines/[pipelineId] </code> resource.
     * </p>
     * <p>
     * You can only delete a pipeline that has never been used or that is
     * not currently in use (doesn't contain any active jobs). If the
     * pipeline is currently in use, <code>DeletePipeline</code> returns an
     * error.
     * </p>
     *
     * @param deletePipelineRequest Container for the necessary parameters to
     *           execute the DeletePipeline operation on AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the
     *         DeletePipeline service method, as returned by AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeletePipelineResult> deletePipelineAsync(DeletePipelineRequest deletePipelineRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To delete a pipeline, send a DELETE request to the
     * <code>/2012-09-25/pipelines/[pipelineId] </code> resource.
     * </p>
     * <p>
     * You can only delete a pipeline that has never been used or that is
     * not currently in use (doesn't contain any active jobs). If the
     * pipeline is currently in use, <code>DeletePipeline</code> returns an
     * error.
     * </p>
     *
     * @param deletePipelineRequest Container for the necessary parameters to
     *           execute the DeletePipeline operation on AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeletePipeline service method, as returned by AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeletePipelineResult> deletePipelineAsync(DeletePipelineRequest deletePipelineRequest,
            AsyncHandler<DeletePipelineRequest, DeletePipelineResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To delete a job, send a DELETE request to the
     * <code>/2012-09-25/jobs/[jobId] </code> resource.
     * </p>
     * <p>
     * <b>NOTE:</b>You can only cancel a job that has a status of Submitted.
     * To prevent a pipeline from starting to process a job while you're
     * getting the job identifier, use UpdatePipelineStatus to temporarily
     * pause the pipeline.
     * </p>
     *
     * @param cancelJobRequest Container for the necessary parameters to
     *           execute the CancelJob operation on AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the
     *         CancelJob service method, as returned by AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CancelJobResult> cancelJobAsync(CancelJobRequest cancelJobRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To delete a job, send a DELETE request to the
     * <code>/2012-09-25/jobs/[jobId] </code> resource.
     * </p>
     * <p>
     * <b>NOTE:</b>You can only cancel a job that has a status of Submitted.
     * To prevent a pipeline from starting to process a job while you're
     * getting the job identifier, use UpdatePipelineStatus to temporarily
     * pause the pipeline.
     * </p>
     *
     * @param cancelJobRequest Container for the necessary parameters to
     *           execute the CancelJob operation on AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CancelJob service method, as returned by AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CancelJobResult> cancelJobAsync(CancelJobRequest cancelJobRequest,
            AsyncHandler<CancelJobRequest, CancelJobResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To get a list of all presets associated with the current AWS account,
     * send a GET request to the <code>/2012-09-25/presets</code> resource.
     * </p>
     *
     * @param listPresetsRequest Container for the necessary parameters to
     *           execute the ListPresets operation on AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the
     *         ListPresets service method, as returned by AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListPresetsResult> listPresetsAsync(ListPresetsRequest listPresetsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To get a list of all presets associated with the current AWS account,
     * send a GET request to the <code>/2012-09-25/presets</code> resource.
     * </p>
     *
     * @param listPresetsRequest Container for the necessary parameters to
     *           execute the ListPresets operation on AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListPresets service method, as returned by AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListPresetsResult> listPresetsAsync(ListPresetsRequest listPresetsRequest,
            AsyncHandler<ListPresetsRequest, ListPresetsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To get a list of the jobs that have a specified status, send a GET
     * request to the <code>/2012-09-25/jobsByStatus/[status] </code>
     * resource.
     * </p>
     * <p>
     * Elastic Transcoder returns all of the jobs that have the specified
     * status. The response body contains one element for each job that
     * satisfies the search criteria.
     * </p>
     *
     * @param listJobsByStatusRequest Container for the necessary parameters
     *           to execute the ListJobsByStatus operation on AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the
     *         ListJobsByStatus service method, as returned by
     *         AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListJobsByStatusResult> listJobsByStatusAsync(ListJobsByStatusRequest listJobsByStatusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To get a list of the jobs that have a specified status, send a GET
     * request to the <code>/2012-09-25/jobsByStatus/[status] </code>
     * resource.
     * </p>
     * <p>
     * Elastic Transcoder returns all of the jobs that have the specified
     * status. The response body contains one element for each job that
     * satisfies the search criteria.
     * </p>
     *
     * @param listJobsByStatusRequest Container for the necessary parameters
     *           to execute the ListJobsByStatus operation on AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListJobsByStatus service method, as returned by
     *         AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListJobsByStatusResult> listJobsByStatusAsync(ListJobsByStatusRequest listJobsByStatusRequest,
            AsyncHandler<ListJobsByStatusRequest, ListJobsByStatusResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To create a pipeline, send a POST request to the
     * <code>2012-09-25/pipelines</code> resource.
     * </p>
     *
     * @param createPipelineRequest Container for the necessary parameters to
     *           execute the CreatePipeline operation on AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the
     *         CreatePipeline service method, as returned by AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreatePipelineResult> createPipelineAsync(CreatePipelineRequest createPipelineRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To create a pipeline, send a POST request to the
     * <code>2012-09-25/pipelines</code> resource.
     * </p>
     *
     * @param createPipelineRequest Container for the necessary parameters to
     *           execute the CreatePipeline operation on AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreatePipeline service method, as returned by AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreatePipelineResult> createPipelineAsync(CreatePipelineRequest createPipelineRequest,
            AsyncHandler<CreatePipelineRequest, CreatePipelineResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To test the IAM role that's used by Elastic Transcoder to create the
     * pipeline, send a POST request to the
     * <code>/2012-09-25/roleTests</code> resource.
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
     *           execute the TestRole operation on AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the TestRole
     *         service method, as returned by AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<TestRoleResult> testRoleAsync(TestRoleRequest testRoleRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To test the IAM role that's used by Elastic Transcoder to create the
     * pipeline, send a POST request to the
     * <code>/2012-09-25/roleTests</code> resource.
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
     *           execute the TestRole operation on AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the TestRole
     *         service method, as returned by AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<TestRoleResult> testRoleAsync(TestRoleRequest testRoleRequest,
            AsyncHandler<TestRoleRequest, TestRoleResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To get a list of the pipelines associated with the current AWS
     * account, send a GET request to the <code>/2012-09-25/pipelines</code>
     * resource.
     * </p>
     *
     * @param listPipelinesRequest Container for the necessary parameters to
     *           execute the ListPipelines operation on AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the
     *         ListPipelines service method, as returned by AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListPipelinesResult> listPipelinesAsync(ListPipelinesRequest listPipelinesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To get a list of the pipelines associated with the current AWS
     * account, send a GET request to the <code>/2012-09-25/pipelines</code>
     * resource.
     * </p>
     *
     * @param listPipelinesRequest Container for the necessary parameters to
     *           execute the ListPipelines operation on AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListPipelines service method, as returned by AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListPipelinesResult> listPipelinesAsync(ListPipelinesRequest listPipelinesRequest,
            AsyncHandler<ListPipelinesRequest, ListPipelinesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To update Amazon Simple Notification Service (Amazon SNS)
     * notifications for a pipeline, send a POST request to the
     * <code>/2012-09-25/pipelines/[pipelineId]/notifications</code>
     * resource.
     * </p>
     * <p>
     * When you update notifications for a pipeline, Elastic Transcoder
     * returns the values that you specified in the request.
     * </p>
     *
     * @param updatePipelineNotificationsRequest Container for the necessary
     *           parameters to execute the UpdatePipelineNotifications operation on
     *           AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the
     *         UpdatePipelineNotifications service method, as returned by
     *         AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdatePipelineNotificationsResult> updatePipelineNotificationsAsync(UpdatePipelineNotificationsRequest updatePipelineNotificationsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To update Amazon Simple Notification Service (Amazon SNS)
     * notifications for a pipeline, send a POST request to the
     * <code>/2012-09-25/pipelines/[pipelineId]/notifications</code>
     * resource.
     * </p>
     * <p>
     * When you update notifications for a pipeline, Elastic Transcoder
     * returns the values that you specified in the request.
     * </p>
     *
     * @param updatePipelineNotificationsRequest Container for the necessary
     *           parameters to execute the UpdatePipelineNotifications operation on
     *           AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdatePipelineNotifications service method, as returned by
     *         AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdatePipelineNotificationsResult> updatePipelineNotificationsAsync(UpdatePipelineNotificationsRequest updatePipelineNotificationsRequest,
            AsyncHandler<UpdatePipelineNotificationsRequest, UpdatePipelineNotificationsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To get a list of the jobs currently in a pipeline, send a GET request
     * to the <code>/2012-09-25/jobsByPipeline/[pipelineId] </code> resource.
     * </p>
     * <p>
     * Elastic Transcoder returns all of the jobs currently in the specified
     * pipeline. The response body contains one element for each job that
     * satisfies the search criteria.
     * </p>
     *
     * @param listJobsByPipelineRequest Container for the necessary
     *           parameters to execute the ListJobsByPipeline operation on
     *           AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the
     *         ListJobsByPipeline service method, as returned by
     *         AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListJobsByPipelineResult> listJobsByPipelineAsync(ListJobsByPipelineRequest listJobsByPipelineRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To get a list of the jobs currently in a pipeline, send a GET request
     * to the <code>/2012-09-25/jobsByPipeline/[pipelineId] </code> resource.
     * </p>
     * <p>
     * Elastic Transcoder returns all of the jobs currently in the specified
     * pipeline. The response body contains one element for each job that
     * satisfies the search criteria.
     * </p>
     *
     * @param listJobsByPipelineRequest Container for the necessary
     *           parameters to execute the ListJobsByPipeline operation on
     *           AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListJobsByPipeline service method, as returned by
     *         AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListJobsByPipelineResult> listJobsByPipelineAsync(ListJobsByPipelineRequest listJobsByPipelineRequest,
            AsyncHandler<ListJobsByPipelineRequest, ListJobsByPipelineResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To create a job, send a POST request to the
     * <code>/2012-09-25/jobs</code> resource.
     * </p>
     * <p>
     * When you create a job, Elastic Transcoder returns JSON data that
     * includes the values that you specified plus information about the job
     * that is created.
     * </p>
     *
     * @param createJobRequest Container for the necessary parameters to
     *           execute the CreateJob operation on AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the
     *         CreateJob service method, as returned by AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateJobResult> createJobAsync(CreateJobRequest createJobRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To create a job, send a POST request to the
     * <code>/2012-09-25/jobs</code> resource.
     * </p>
     * <p>
     * When you create a job, Elastic Transcoder returns JSON data that
     * includes the values that you specified plus information about the job
     * that is created.
     * </p>
     *
     * @param createJobRequest Container for the necessary parameters to
     *           execute the CreateJob operation on AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateJob service method, as returned by AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateJobResult> createJobAsync(CreateJobRequest createJobRequest,
            AsyncHandler<CreateJobRequest, CreateJobResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To pause or reactivate a pipeline, so the pipeline stops or restarts
     * processing jobs, update the status for the pipeline. Send a POST
     * request to the <code>/2012-09-25/pipelines/[pipelineId]/status</code>
     * resource.
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
     *           parameters to execute the UpdatePipelineStatus operation on
     *           AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the
     *         UpdatePipelineStatus service method, as returned by
     *         AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdatePipelineStatusResult> updatePipelineStatusAsync(UpdatePipelineStatusRequest updatePipelineStatusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To pause or reactivate a pipeline, so the pipeline stops or restarts
     * processing jobs, update the status for the pipeline. Send a POST
     * request to the <code>/2012-09-25/pipelines/[pipelineId]/status</code>
     * resource.
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
     *           parameters to execute the UpdatePipelineStatus operation on
     *           AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdatePipelineStatus service method, as returned by
     *         AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdatePipelineStatusResult> updatePipelineStatusAsync(UpdatePipelineStatusRequest updatePipelineStatusRequest,
            AsyncHandler<UpdatePipelineStatusRequest, UpdatePipelineStatusResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To get detailed information about a pipeline, send a GET request to
     * the <code>/2012-09-25/pipelines/[pipelineId] </code> resource.
     * </p>
     *
     * @param readPipelineRequest Container for the necessary parameters to
     *           execute the ReadPipeline operation on AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the
     *         ReadPipeline service method, as returned by AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReadPipelineResult> readPipelineAsync(ReadPipelineRequest readPipelineRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To get detailed information about a pipeline, send a GET request to
     * the <code>/2012-09-25/pipelines/[pipelineId] </code> resource.
     * </p>
     *
     * @param readPipelineRequest Container for the necessary parameters to
     *           execute the ReadPipeline operation on AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ReadPipeline service method, as returned by AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReadPipelineResult> readPipelineAsync(ReadPipelineRequest readPipelineRequest,
            AsyncHandler<ReadPipelineRequest, ReadPipelineResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To get detailed information about a job, send a GET request to the
     * <code>/2012-09-25/jobs/[jobId] </code> resource.
     * </p>
     *
     * @param readJobRequest Container for the necessary parameters to
     *           execute the ReadJob operation on AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the ReadJob
     *         service method, as returned by AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReadJobResult> readJobAsync(ReadJobRequest readJobRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To get detailed information about a job, send a GET request to the
     * <code>/2012-09-25/jobs/[jobId] </code> resource.
     * </p>
     *
     * @param readJobRequest Container for the necessary parameters to
     *           execute the ReadJob operation on AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the ReadJob
     *         service method, as returned by AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReadJobResult> readJobAsync(ReadJobRequest readJobRequest,
            AsyncHandler<ReadJobRequest, ReadJobResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To delete a preset, send a DELETE request to the
     * <code>/2012-09-25/presets/[presetId] </code> resource.
     * </p>
     * <p>
     * <b>NOTE:</b> If the preset has been used, you cannot delete it.
     * </p>
     *
     * @param deletePresetRequest Container for the necessary parameters to
     *           execute the DeletePreset operation on AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the
     *         DeletePreset service method, as returned by AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeletePresetResult> deletePresetAsync(DeletePresetRequest deletePresetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To delete a preset, send a DELETE request to the
     * <code>/2012-09-25/presets/[presetId] </code> resource.
     * </p>
     * <p>
     * <b>NOTE:</b> If the preset has been used, you cannot delete it.
     * </p>
     *
     * @param deletePresetRequest Container for the necessary parameters to
     *           execute the DeletePreset operation on AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeletePreset service method, as returned by AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeletePresetResult> deletePresetAsync(DeletePresetRequest deletePresetRequest,
            AsyncHandler<DeletePresetRequest, DeletePresetResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To create a preset, send a POST request to the
     * <code>/2012-09-25/presets</code> resource.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>Elastic Transcoder checks the settings that you
     * specify to ensure that they meet Elastic Transcoder requirements and
     * to determine whether they comply with H.264 standards. If your
     * settings are not valid for Elastic Transcoder, Elastic Transcoder
     * returns an HTTP 400 response (ValidationException) and does not create
     * the preset. If the settings are valid for Elastic Transcoder but
     * aren't strictly compliant with the H.264 standard, Elastic Transcoder
     * creates the preset and returns a warning message in the response. This
     * helps you determine whether your settings comply with the H.264
     * standard while giving you greater flexibility with respect to the
     * video that Elastic Transcoder produces.
     * </p>
     * <p>
     * Elastic Transcoder uses the H.264 video-compression format. For more
     * information, see the International Telecommunication Union publication
     * <i>Recommendation ITU-T H.264: Advanced video coding for generic
     * audiovisual services</i> .
     * </p>
     *
     * @param createPresetRequest Container for the necessary parameters to
     *           execute the CreatePreset operation on AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the
     *         CreatePreset service method, as returned by AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreatePresetResult> createPresetAsync(CreatePresetRequest createPresetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To create a preset, send a POST request to the
     * <code>/2012-09-25/presets</code> resource.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>Elastic Transcoder checks the settings that you
     * specify to ensure that they meet Elastic Transcoder requirements and
     * to determine whether they comply with H.264 standards. If your
     * settings are not valid for Elastic Transcoder, Elastic Transcoder
     * returns an HTTP 400 response (ValidationException) and does not create
     * the preset. If the settings are valid for Elastic Transcoder but
     * aren't strictly compliant with the H.264 standard, Elastic Transcoder
     * creates the preset and returns a warning message in the response. This
     * helps you determine whether your settings comply with the H.264
     * standard while giving you greater flexibility with respect to the
     * video that Elastic Transcoder produces.
     * </p>
     * <p>
     * Elastic Transcoder uses the H.264 video-compression format. For more
     * information, see the International Telecommunication Union publication
     * <i>Recommendation ITU-T H.264: Advanced video coding for generic
     * audiovisual services</i> .
     * </p>
     *
     * @param createPresetRequest Container for the necessary parameters to
     *           execute the CreatePreset operation on AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreatePreset service method, as returned by AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreatePresetResult> createPresetAsync(CreatePresetRequest createPresetRequest,
            AsyncHandler<CreatePresetRequest, CreatePresetResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To get detailed information about a preset, send a GET request to the
     * <code>/2012-09-25/presets/[presetId] </code> resource.
     * </p>
     *
     * @param readPresetRequest Container for the necessary parameters to
     *           execute the ReadPreset operation on AmazonElasticTranscoder.
     * 
     * @return A Java Future object containing the response from the
     *         ReadPreset service method, as returned by AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReadPresetResult> readPresetAsync(ReadPresetRequest readPresetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To get detailed information about a preset, send a GET request to the
     * <code>/2012-09-25/presets/[presetId] </code> resource.
     * </p>
     *
     * @param readPresetRequest Container for the necessary parameters to
     *           execute the ReadPreset operation on AmazonElasticTranscoder.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ReadPreset service method, as returned by AmazonElasticTranscoder.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReadPresetResult> readPresetAsync(ReadPresetRequest readPresetRequest,
            AsyncHandler<ReadPresetRequest, ReadPresetResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

}
        