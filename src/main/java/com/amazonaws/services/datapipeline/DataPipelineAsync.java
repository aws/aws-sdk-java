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
package com.amazonaws.services.datapipeline;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.datapipeline.model.*;

/**
 * Interface for accessing DataPipeline asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * <p>
 * This is the <i>AWS Data Pipeline API Reference</i> . This guide provides descriptions and samples of the AWS Data Pipeline API.
 * </p>
 * <p>
 * AWS Data Pipeline is a web service that configures and manages a data-driven workflow called a pipeline. AWS Data Pipeline handles the details of
 * scheduling and ensuring that data dependencies are met so your application can focus on processing the data.
 * </p>
 * <p>
 * The AWS Data Pipeline API implements two main sets of functionality. The first set of actions configure the pipeline in the web service. You call
 * these actions to create a pipeline and define data sources, schedules, dependencies, and the transforms to be performed on the data.
 * </p>
 * <p>
 * The second set of actions are used by a task runner application that calls the AWS Data Pipeline API to receive the next task ready for processing.
 * The logic for performing the task, such as querying the data, running data analysis, or converting the data from one format to another, is contained
 * within the task runner. The task runner performs the task assigned to it by the web service, reporting progress to the web service as it does so. When
 * the task is done, the task runner reports the final success or failure of the task to the web service.
 * </p>
 * <p>
 * AWS Data Pipeline provides an open-source implementation of a task runner called AWS Data Pipeline Task Runner. AWS Data Pipeline Task Runner
 * provides logic for common data management scenarios, such as performing database queries and running data analysis using Amazon Elastic MapReduce
 * (Amazon EMR). You can use AWS Data Pipeline Task Runner as your task runner, or you can write your own task runner to provide custom data management.
 * </p>
 * <p>
 * The AWS Data Pipeline API uses the Signature Version 4 protocol for signing requests. For more information about how to sign a request with this
 * protocol, see <a href="http://docs.amazonwebservices.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing Process </a> . In
 * the code examples in this reference, the Signature Version 4 Request parameters are represented as AuthParams.
 * </p>
 */
public interface DataPipelineAsync extends DataPipeline {
    /**
     * <p>
     * Validates a pipeline and initiates processing. If the pipeline does
     * not pass validation, activation fails.
     * </p>
     * <p>
     * Call this action to start processing pipeline tasks of a pipeline
     * you've created using the CreatePipeline and PutPipelineDefinition
     * actions. A pipeline cannot be modified after it has been successfully
     * activated.
     * </p>
     *
     * @param activatePipelineRequest Container for the necessary parameters
     *           to execute the ActivatePipeline operation on DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         ActivatePipeline service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ActivatePipelineResult> activatePipelineAsync(ActivatePipelineRequest activatePipelineRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Validates a pipeline and initiates processing. If the pipeline does
     * not pass validation, activation fails.
     * </p>
     * <p>
     * Call this action to start processing pipeline tasks of a pipeline
     * you've created using the CreatePipeline and PutPipelineDefinition
     * actions. A pipeline cannot be modified after it has been successfully
     * activated.
     * </p>
     *
     * @param activatePipelineRequest Container for the necessary parameters
     *           to execute the ActivatePipeline operation on DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ActivatePipeline service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ActivatePipelineResult> activatePipelineAsync(ActivatePipelineRequest activatePipelineRequest,
            AsyncHandler<ActivatePipelineRequest, ActivatePipelineResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of pipeline identifiers for all active pipelines.
     * Identifiers are returned only for pipelines you have permission to
     * access.
     * </p>
     *
     * @param listPipelinesRequest Container for the necessary parameters to
     *           execute the ListPipelines operation on DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         ListPipelines service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListPipelinesResult> listPipelinesAsync(ListPipelinesRequest listPipelinesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of pipeline identifiers for all active pipelines.
     * Identifiers are returned only for pipelines you have permission to
     * access.
     * </p>
     *
     * @param listPipelinesRequest Container for the necessary parameters to
     *           execute the ListPipelines operation on DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListPipelines service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListPipelinesResult> listPipelinesAsync(ListPipelinesRequest listPipelinesRequest,
            AsyncHandler<ListPipelinesRequest, ListPipelinesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the AWS Data Pipeline service on the progress of the calling
     * task runner. When the task runner is assigned a task, it should call
     * ReportTaskProgress to acknowledge that it has the task within 2
     * minutes. If the web service does not recieve this acknowledgement
     * within the 2 minute window, it will assign the task in a subsequent
     * PollForTask call. After this initial acknowledgement, the task runner
     * only needs to report progress every 15 minutes to maintain its
     * ownership of the task. You can change this reporting time from 15
     * minutes by specifying a <code>reportProgressTimeout</code> field in
     * your pipeline. If a task runner does not report its status after 5
     * minutes, AWS Data Pipeline will assume that the task runner is unable
     * to process the task and will reassign the task in a subsequent
     * response to PollForTask. task runners should call ReportTaskProgress
     * every 60 seconds.
     * </p>
     *
     * @param reportTaskProgressRequest Container for the necessary
     *           parameters to execute the ReportTaskProgress operation on
     *           DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         ReportTaskProgress service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReportTaskProgressResult> reportTaskProgressAsync(ReportTaskProgressRequest reportTaskProgressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the AWS Data Pipeline service on the progress of the calling
     * task runner. When the task runner is assigned a task, it should call
     * ReportTaskProgress to acknowledge that it has the task within 2
     * minutes. If the web service does not recieve this acknowledgement
     * within the 2 minute window, it will assign the task in a subsequent
     * PollForTask call. After this initial acknowledgement, the task runner
     * only needs to report progress every 15 minutes to maintain its
     * ownership of the task. You can change this reporting time from 15
     * minutes by specifying a <code>reportProgressTimeout</code> field in
     * your pipeline. If a task runner does not report its status after 5
     * minutes, AWS Data Pipeline will assume that the task runner is unable
     * to process the task and will reassign the task in a subsequent
     * response to PollForTask. task runners should call ReportTaskProgress
     * every 60 seconds.
     * </p>
     *
     * @param reportTaskProgressRequest Container for the necessary
     *           parameters to execute the ReportTaskProgress operation on
     *           DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ReportTaskProgress service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReportTaskProgressResult> reportTaskProgressAsync(ReportTaskProgressRequest reportTaskProgressRequest,
            AsyncHandler<ReportTaskProgressRequest, ReportTaskProgressResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Tests the pipeline definition with a set of validation checks to
     * ensure that it is well formed and can run without error.
     * </p>
     *
     * @param validatePipelineDefinitionRequest Container for the necessary
     *           parameters to execute the ValidatePipelineDefinition operation on
     *           DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         ValidatePipelineDefinition service method, as returned by
     *         DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ValidatePipelineDefinitionResult> validatePipelineDefinitionAsync(ValidatePipelineDefinitionRequest validatePipelineDefinitionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Tests the pipeline definition with a set of validation checks to
     * ensure that it is well formed and can run without error.
     * </p>
     *
     * @param validatePipelineDefinitionRequest Container for the necessary
     *           parameters to execute the ValidatePipelineDefinition operation on
     *           DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ValidatePipelineDefinition service method, as returned by
     *         DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ValidatePipelineDefinitionResult> validatePipelineDefinitionAsync(ValidatePipelineDefinitionRequest validatePipelineDefinitionRequest,
            AsyncHandler<ValidatePipelineDefinitionRequest, ValidatePipelineDefinitionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Task runners call this action to receive a task to perform from AWS
     * Data Pipeline. The task runner specifies which tasks it can perform by
     * setting a value for the workerGroup parameter of the PollForTask call.
     * The task returned by PollForTask may come from any of the pipelines
     * that match the workerGroup value passed in by the task runner and that
     * was launched using the IAM user credentials specified by the task
     * runner.
     * </p>
     * <p>
     * If tasks are ready in the work queue, PollForTask returns a response
     * immediately. If no tasks are available in the queue, PollForTask uses
     * long-polling and holds on to a poll connection for up to a 90 seconds
     * during which time the first newly scheduled task is handed to the task
     * runner. To accomodate this, set the socket timeout in your task runner
     * to 90 seconds. The task runner should not call PollForTask again on
     * the same <code>workerGroup</code> until it receives a response, and
     * this may take up to 90 seconds.
     * </p>
     *
     * @param pollForTaskRequest Container for the necessary parameters to
     *           execute the PollForTask operation on DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         PollForTask service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PollForTaskResult> pollForTaskAsync(PollForTaskRequest pollForTaskRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Task runners call this action to receive a task to perform from AWS
     * Data Pipeline. The task runner specifies which tasks it can perform by
     * setting a value for the workerGroup parameter of the PollForTask call.
     * The task returned by PollForTask may come from any of the pipelines
     * that match the workerGroup value passed in by the task runner and that
     * was launched using the IAM user credentials specified by the task
     * runner.
     * </p>
     * <p>
     * If tasks are ready in the work queue, PollForTask returns a response
     * immediately. If no tasks are available in the queue, PollForTask uses
     * long-polling and holds on to a poll connection for up to a 90 seconds
     * during which time the first newly scheduled task is handed to the task
     * runner. To accomodate this, set the socket timeout in your task runner
     * to 90 seconds. The task runner should not call PollForTask again on
     * the same <code>workerGroup</code> until it receives a response, and
     * this may take up to 90 seconds.
     * </p>
     *
     * @param pollForTaskRequest Container for the necessary parameters to
     *           execute the PollForTask operation on DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PollForTask service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PollForTaskResult> pollForTaskAsync(PollForTaskRequest pollForTaskRequest,
            AsyncHandler<PollForTaskRequest, PollForTaskResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Queries a pipeline for the names of objects that match a specified set
     * of conditions.
     * </p>
     * <p>
     * The objects returned by QueryObjects are paginated and then filtered
     * by the value you set for query. This means the action may return an
     * empty result set with a value set for marker. If
     * <code>HasMoreResults</code> is set to <code>True</code> , you should
     * continue to call QueryObjects, passing in the returned value for
     * marker, until <code>HasMoreResults</code> returns <code>False</code> .
     * </p>
     *
     * @param queryObjectsRequest Container for the necessary parameters to
     *           execute the QueryObjects operation on DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         QueryObjects service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<QueryObjectsResult> queryObjectsAsync(QueryObjectsRequest queryObjectsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Queries a pipeline for the names of objects that match a specified set
     * of conditions.
     * </p>
     * <p>
     * The objects returned by QueryObjects are paginated and then filtered
     * by the value you set for query. This means the action may return an
     * empty result set with a value set for marker. If
     * <code>HasMoreResults</code> is set to <code>True</code> , you should
     * continue to call QueryObjects, passing in the returned value for
     * marker, until <code>HasMoreResults</code> returns <code>False</code> .
     * </p>
     *
     * @param queryObjectsRequest Container for the necessary parameters to
     *           execute the QueryObjects operation on DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         QueryObjects service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<QueryObjectsResult> queryObjectsAsync(QueryObjectsRequest queryObjectsRequest,
            AsyncHandler<QueryObjectsRequest, QueryObjectsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Requests that the status of an array of physical or logical pipeline
     * objects be updated in the pipeline. This update may not occur
     * immediately, but is eventually consistent. The status that can be set
     * depends on the type of object.
     * </p>
     *
     * @param setStatusRequest Container for the necessary parameters to
     *           execute the SetStatus operation on DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         SetStatus service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setStatusAsync(SetStatusRequest setStatusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Requests that the status of an array of physical or logical pipeline
     * objects be updated in the pipeline. This update may not occur
     * immediately, but is eventually consistent. The status that can be set
     * depends on the type of object.
     * </p>
     *
     * @param setStatusRequest Container for the necessary parameters to
     *           execute the SetStatus operation on DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetStatus service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setStatusAsync(SetStatusRequest setStatusRequest,
            AsyncHandler<SetStatusRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Permanently deletes a pipeline, its pipeline definition and its run
     * history. You cannot query or restore a deleted pipeline. AWS Data
     * Pipeline will attempt to cancel instances associated with the pipeline
     * that are currently being processed by task runners. Deleting a
     * pipeline cannot be undone.
     * </p>
     * <p>
     * To temporarily pause a pipeline instead of deleting it, call
     * SetStatus with the status set to Pause on individual components.
     * Components that are paused by SetStatus can be resumed.
     * </p>
     *
     * @param deletePipelineRequest Container for the necessary parameters to
     *           execute the DeletePipeline operation on DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         DeletePipeline service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deletePipelineAsync(DeletePipelineRequest deletePipelineRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Permanently deletes a pipeline, its pipeline definition and its run
     * history. You cannot query or restore a deleted pipeline. AWS Data
     * Pipeline will attempt to cancel instances associated with the pipeline
     * that are currently being processed by task runners. Deleting a
     * pipeline cannot be undone.
     * </p>
     * <p>
     * To temporarily pause a pipeline instead of deleting it, call
     * SetStatus with the status set to Pause on individual components.
     * Components that are paused by SetStatus can be resumed.
     * </p>
     *
     * @param deletePipelineRequest Container for the necessary parameters to
     *           execute the DeletePipeline operation on DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeletePipeline service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deletePipelineAsync(DeletePipelineRequest deletePipelineRequest,
            AsyncHandler<DeletePipelineRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the definition of the specified pipeline. You can call
     * GetPipelineDefinition to retrieve the pipeline definition you provided
     * using PutPipelineDefinition.
     * </p>
     *
     * @param getPipelineDefinitionRequest Container for the necessary
     *           parameters to execute the GetPipelineDefinition operation on
     *           DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         GetPipelineDefinition service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetPipelineDefinitionResult> getPipelineDefinitionAsync(GetPipelineDefinitionRequest getPipelineDefinitionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the definition of the specified pipeline. You can call
     * GetPipelineDefinition to retrieve the pipeline definition you provided
     * using PutPipelineDefinition.
     * </p>
     *
     * @param getPipelineDefinitionRequest Container for the necessary
     *           parameters to execute the GetPipelineDefinition operation on
     *           DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetPipelineDefinition service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetPipelineDefinitionResult> getPipelineDefinitionAsync(GetPipelineDefinitionRequest getPipelineDefinitionRequest,
            AsyncHandler<GetPipelineDefinitionRequest, GetPipelineDefinitionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Notifies AWS Data Pipeline that a task is completed and provides
     * information about the final status. The task runner calls this action
     * regardless of whether the task was sucessful. The task runner does not
     * need to call SetTaskStatus for tasks that are canceled by the web
     * service during a call to ReportTaskProgress.
     * </p>
     *
     * @param setTaskStatusRequest Container for the necessary parameters to
     *           execute the SetTaskStatus operation on DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         SetTaskStatus service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SetTaskStatusResult> setTaskStatusAsync(SetTaskStatusRequest setTaskStatusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Notifies AWS Data Pipeline that a task is completed and provides
     * information about the final status. The task runner calls this action
     * regardless of whether the task was sucessful. The task runner does not
     * need to call SetTaskStatus for tasks that are canceled by the web
     * service during a call to ReportTaskProgress.
     * </p>
     *
     * @param setTaskStatusRequest Container for the necessary parameters to
     *           execute the SetTaskStatus operation on DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetTaskStatus service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SetTaskStatusResult> setTaskStatusAsync(SetTaskStatusRequest setTaskStatusRequest,
            AsyncHandler<SetTaskStatusRequest, SetTaskStatusResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Evaluates a string in the context of a specified object. A task runner
     * can use this action to evaluate SQL queries stored in Amazon S3.
     * </p>
     *
     * @param evaluateExpressionRequest Container for the necessary
     *           parameters to execute the EvaluateExpression operation on
     *           DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         EvaluateExpression service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EvaluateExpressionResult> evaluateExpressionAsync(EvaluateExpressionRequest evaluateExpressionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Evaluates a string in the context of a specified object. A task runner
     * can use this action to evaluate SQL queries stored in Amazon S3.
     * </p>
     *
     * @param evaluateExpressionRequest Container for the necessary
     *           parameters to execute the EvaluateExpression operation on
     *           DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         EvaluateExpression service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EvaluateExpressionResult> evaluateExpressionAsync(EvaluateExpressionRequest evaluateExpressionRequest,
            AsyncHandler<EvaluateExpressionRequest, EvaluateExpressionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieve metadata about one or more pipelines. The information
     * retrieved includes the name of the pipeline, the pipeline identifier,
     * its current state, and the user account that owns the pipeline. Using
     * account credentials, you can retrieve metadata about pipelines that
     * you or your IAM users have created. If you are using an IAM user
     * account, you can retrieve metadata about only those pipelines you have
     * read permission for.
     * </p>
     * <p>
     * To retrieve the full pipeline definition instead of metadata about
     * the pipeline, call the GetPipelineDefinition action.
     * </p>
     *
     * @param describePipelinesRequest Container for the necessary parameters
     *           to execute the DescribePipelines operation on DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         DescribePipelines service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribePipelinesResult> describePipelinesAsync(DescribePipelinesRequest describePipelinesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieve metadata about one or more pipelines. The information
     * retrieved includes the name of the pipeline, the pipeline identifier,
     * its current state, and the user account that owns the pipeline. Using
     * account credentials, you can retrieve metadata about pipelines that
     * you or your IAM users have created. If you are using an IAM user
     * account, you can retrieve metadata about only those pipelines you have
     * read permission for.
     * </p>
     * <p>
     * To retrieve the full pipeline definition instead of metadata about
     * the pipeline, call the GetPipelineDefinition action.
     * </p>
     *
     * @param describePipelinesRequest Container for the necessary parameters
     *           to execute the DescribePipelines operation on DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribePipelines service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribePipelinesResult> describePipelinesAsync(DescribePipelinesRequest describePipelinesRequest,
            AsyncHandler<DescribePipelinesRequest, DescribePipelinesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new empty pipeline. When this action succeeds, you can then
     * use the PutPipelineDefinition action to populate the pipeline.
     * </p>
     *
     * @param createPipelineRequest Container for the necessary parameters to
     *           execute the CreatePipeline operation on DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         CreatePipeline service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreatePipelineResult> createPipelineAsync(CreatePipelineRequest createPipelineRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new empty pipeline. When this action succeeds, you can then
     * use the PutPipelineDefinition action to populate the pipeline.
     * </p>
     *
     * @param createPipelineRequest Container for the necessary parameters to
     *           execute the CreatePipeline operation on DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreatePipeline service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreatePipelineResult> createPipelineAsync(CreatePipelineRequest createPipelineRequest,
            AsyncHandler<CreatePipelineRequest, CreatePipelineResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the object definitions for a set of objects associated with
     * the pipeline. Object definitions are composed of a set of fields that
     * define the properties of the object.
     * </p>
     *
     * @param describeObjectsRequest Container for the necessary parameters
     *           to execute the DescribeObjects operation on DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeObjects service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeObjectsResult> describeObjectsAsync(DescribeObjectsRequest describeObjectsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the object definitions for a set of objects associated with
     * the pipeline. Object definitions are composed of a set of fields that
     * define the properties of the object.
     * </p>
     *
     * @param describeObjectsRequest Container for the necessary parameters
     *           to execute the DescribeObjects operation on DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeObjects service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeObjectsResult> describeObjectsAsync(DescribeObjectsRequest describeObjectsRequest,
            AsyncHandler<DescribeObjectsRequest, DescribeObjectsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Task runners call ReportTaskRunnerHeartbeat every 15 minutes to
     * indicate that they are operational. In the case of AWS Data Pipeline
     * Task Runner launched on a resource managed by AWS Data Pipeline, the
     * web service can use this call to detect when the task runner
     * application has failed and restart a new instance.
     * </p>
     *
     * @param reportTaskRunnerHeartbeatRequest Container for the necessary
     *           parameters to execute the ReportTaskRunnerHeartbeat operation on
     *           DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         ReportTaskRunnerHeartbeat service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReportTaskRunnerHeartbeatResult> reportTaskRunnerHeartbeatAsync(ReportTaskRunnerHeartbeatRequest reportTaskRunnerHeartbeatRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Task runners call ReportTaskRunnerHeartbeat every 15 minutes to
     * indicate that they are operational. In the case of AWS Data Pipeline
     * Task Runner launched on a resource managed by AWS Data Pipeline, the
     * web service can use this call to detect when the task runner
     * application has failed and restart a new instance.
     * </p>
     *
     * @param reportTaskRunnerHeartbeatRequest Container for the necessary
     *           parameters to execute the ReportTaskRunnerHeartbeat operation on
     *           DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ReportTaskRunnerHeartbeat service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReportTaskRunnerHeartbeatResult> reportTaskRunnerHeartbeatAsync(ReportTaskRunnerHeartbeatRequest reportTaskRunnerHeartbeatRequest,
            AsyncHandler<ReportTaskRunnerHeartbeatRequest, ReportTaskRunnerHeartbeatResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds tasks, schedules, and preconditions that control the behavior of
     * the pipeline. You can use PutPipelineDefinition to populate a new
     * pipeline or to update an existing pipeline that has not yet been
     * activated.
     * </p>
     * <p>
     * PutPipelineDefinition also validates the configuration as it adds it
     * to the pipeline. Changes to the pipeline are saved unless one of the
     * following three validation errors exists in the pipeline. <ol> <li>An
     * object is missing a name or identifier field.</li>
     * <li>A string or reference field is empty.</li>
     * <li>The number of objects in the pipeline exceeds the maximum allowed
     * objects.</li>
     * </ol>
     * </p>
     * <p>
     * Pipeline object definitions are passed to the PutPipelineDefinition
     * action and returned by the GetPipelineDefinition action.
     * </p>
     *
     * @param putPipelineDefinitionRequest Container for the necessary
     *           parameters to execute the PutPipelineDefinition operation on
     *           DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         PutPipelineDefinition service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PutPipelineDefinitionResult> putPipelineDefinitionAsync(PutPipelineDefinitionRequest putPipelineDefinitionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds tasks, schedules, and preconditions that control the behavior of
     * the pipeline. You can use PutPipelineDefinition to populate a new
     * pipeline or to update an existing pipeline that has not yet been
     * activated.
     * </p>
     * <p>
     * PutPipelineDefinition also validates the configuration as it adds it
     * to the pipeline. Changes to the pipeline are saved unless one of the
     * following three validation errors exists in the pipeline. <ol> <li>An
     * object is missing a name or identifier field.</li>
     * <li>A string or reference field is empty.</li>
     * <li>The number of objects in the pipeline exceeds the maximum allowed
     * objects.</li>
     * </ol>
     * </p>
     * <p>
     * Pipeline object definitions are passed to the PutPipelineDefinition
     * action and returned by the GetPipelineDefinition action.
     * </p>
     *
     * @param putPipelineDefinitionRequest Container for the necessary
     *           parameters to execute the PutPipelineDefinition operation on
     *           DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PutPipelineDefinition service method, as returned by DataPipeline.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PutPipelineDefinitionResult> putPipelineDefinitionAsync(PutPipelineDefinitionRequest putPipelineDefinitionRequest,
            AsyncHandler<PutPipelineDefinitionRequest, PutPipelineDefinitionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

}
        