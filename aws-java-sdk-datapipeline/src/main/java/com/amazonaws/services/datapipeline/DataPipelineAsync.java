/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AWS Data Pipeline configures and manages a data-driven workflow called
 * a pipeline. AWS Data Pipeline handles the details of scheduling and
 * ensuring that data dependencies are met so that your application can
 * focus on processing the data.
 * </p>
 * <p>
 * AWS Data Pipeline provides a JAR implementation of a task runner
 * called AWS Data Pipeline Task Runner. AWS Data Pipeline Task Runner
 * provides logic for common data management scenarios, such as
 * performing database queries and running data analysis using Amazon
 * Elastic MapReduce (Amazon EMR). You can use AWS Data Pipeline Task
 * Runner as your task runner, or you can write your own task runner to
 * provide custom data management.
 * </p>
 * <p>
 * AWS Data Pipeline implements two main sets of functionality. Use the
 * first set to create a pipeline and define data sources, schedules,
 * dependencies, and the transforms to be performed on the data. Use the
 * second set in your task runner application to receive the next task
 * ready for processing. The logic for performing the task, such as
 * querying the data, running data analysis, or converting the data from
 * one format to another, is contained within the task runner. The task
 * runner performs the task assigned to it by the web service, reporting
 * progress to the web service as it does so. When the task is done, the
 * task runner reports the final success or failure of the task to the
 * web service.
 * </p>
 */
public interface DataPipelineAsync extends DataPipeline {
    /**
     * <p>
     * Validates the specified pipeline and starts processing pipeline
     * tasks. If the pipeline does not pass validation, activation fails.
     * </p>
     * <p>
     * If you need to pause the pipeline to investigate an issue with a
     * component, such as a data source or script, call DeactivatePipeline.
     * </p>
     * <p>
     * To activate a finished pipeline, modify the end date for the pipeline
     * and then activate it.
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
     * Validates the specified pipeline and starts processing pipeline
     * tasks. If the pipeline does not pass validation, activation fails.
     * </p>
     * <p>
     * If you need to pause the pipeline to investigate an issue with a
     * component, such as a data source or script, call DeactivatePipeline.
     * </p>
     * <p>
     * To activate a finished pipeline, modify the end date for the pipeline
     * and then activate it.
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
     * Lists the pipeline identifiers for all active pipelines that you have
     * permission to access.
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
     * Lists the pipeline identifiers for all active pipelines that you have
     * permission to access.
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
     * Task runners call <code>ReportTaskProgress</code> when assigned a
     * task to acknowledge that it has the task. If the web service does not
     * receive this acknowledgement within 2 minutes, it assigns the task in
     * a subsequent PollForTask call. After this initial acknowledgement, the
     * task runner only needs to report progress every 15 minutes to maintain
     * its ownership of the task. You can change this reporting time from 15
     * minutes by specifying a <code>reportProgressTimeout</code> field in
     * your pipeline.
     * </p>
     * <p>
     * If a task runner does not report its status after 5 minutes, AWS Data
     * Pipeline assumes that the task runner is unable to process the task
     * and reassigns the task in a subsequent response to PollForTask. Task
     * runners should call <code>ReportTaskProgress</code> every 60 seconds.
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
     * Task runners call <code>ReportTaskProgress</code> when assigned a
     * task to acknowledge that it has the task. If the web service does not
     * receive this acknowledgement within 2 minutes, it assigns the task in
     * a subsequent PollForTask call. After this initial acknowledgement, the
     * task runner only needs to report progress every 15 minutes to maintain
     * its ownership of the task. You can change this reporting time from 15
     * minutes by specifying a <code>reportProgressTimeout</code> field in
     * your pipeline.
     * </p>
     * <p>
     * If a task runner does not report its status after 5 minutes, AWS Data
     * Pipeline assumes that the task runner is unable to process the task
     * and reassigns the task in a subsequent response to PollForTask. Task
     * runners should call <code>ReportTaskProgress</code> every 60 seconds.
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
     * Task runners call <code>PollForTask</code> to receive a task to
     * perform from AWS Data Pipeline. The task runner specifies which tasks
     * it can perform by setting a value for the <code>workerGroup</code>
     * parameter. The task returned can come from any of the pipelines that
     * match the <code>workerGroup</code> value passed in by the task runner
     * and that was launched using the IAM user credentials specified by the
     * task runner.
     * </p>
     * <p>
     * If tasks are ready in the work queue, <code>PollForTask</code>
     * returns a response immediately. If no tasks are available in the
     * queue, <code>PollForTask</code> uses long-polling and holds on to a
     * poll connection for up to a 90 seconds, during which time the first
     * newly scheduled task is handed to the task runner. To accomodate this,
     * set the socket timeout in your task runner to 90 seconds. The task
     * runner should not call <code>PollForTask</code> again on the same
     * <code>workerGroup</code> until it receives a response, and this can
     * take up to 90 seconds.
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
     * Task runners call <code>PollForTask</code> to receive a task to
     * perform from AWS Data Pipeline. The task runner specifies which tasks
     * it can perform by setting a value for the <code>workerGroup</code>
     * parameter. The task returned can come from any of the pipelines that
     * match the <code>workerGroup</code> value passed in by the task runner
     * and that was launched using the IAM user credentials specified by the
     * task runner.
     * </p>
     * <p>
     * If tasks are ready in the work queue, <code>PollForTask</code>
     * returns a response immediately. If no tasks are available in the
     * queue, <code>PollForTask</code> uses long-polling and holds on to a
     * poll connection for up to a 90 seconds, during which time the first
     * newly scheduled task is handed to the task runner. To accomodate this,
     * set the socket timeout in your task runner to 90 seconds. The task
     * runner should not call <code>PollForTask</code> again on the same
     * <code>workerGroup</code> until it receives a response, and this can
     * take up to 90 seconds.
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
     * Validates the specified pipeline definition to ensure that it is well
     * formed and can be run without error.
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
     * Validates the specified pipeline definition to ensure that it is well
     * formed and can be run without error.
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
     * Queries the specified pipeline for the names of objects that match
     * the specified set of conditions.
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
     * Queries the specified pipeline for the names of objects that match
     * the specified set of conditions.
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
     * Requests that the status of the specified physical or logical
     * pipeline objects be updated in the specified pipeline. This update
     * might not occur immediately, but is eventually consistent. The status
     * that can be set depends on the type of object (for example, DataNode
     * or Activity). You cannot perform this operation on
     * <code>FINISHED</code> pipelines and attempting to do so returns
     * <code>InvalidRequestException</code> .
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
     * Requests that the status of the specified physical or logical
     * pipeline objects be updated in the specified pipeline. This update
     * might not occur immediately, but is eventually consistent. The status
     * that can be set depends on the type of object (for example, DataNode
     * or Activity). You cannot perform this operation on
     * <code>FINISHED</code> pipelines and attempting to do so returns
     * <code>InvalidRequestException</code> .
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
     * Deletes a pipeline, its pipeline definition, and its run history. AWS
     * Data Pipeline attempts to cancel instances associated with the
     * pipeline that are currently being processed by task runners.
     * </p>
     * <p>
     * Deleting a pipeline cannot be undone. You cannot query or restore a
     * deleted pipeline. To temporarily pause a pipeline instead of deleting
     * it, call SetStatus with the status set to <code>PAUSE</code> on
     * individual components. Components that are paused by SetStatus can be
     * resumed.
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
     * Deletes a pipeline, its pipeline definition, and its run history. AWS
     * Data Pipeline attempts to cancel instances associated with the
     * pipeline that are currently being processed by task runners.
     * </p>
     * <p>
     * Deleting a pipeline cannot be undone. You cannot query or restore a
     * deleted pipeline. To temporarily pause a pipeline instead of deleting
     * it, call SetStatus with the status set to <code>PAUSE</code> on
     * individual components. Components that are paused by SetStatus can be
     * resumed.
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
     * Deactivates the specified running pipeline. The pipeline is set to
     * the <code>DEACTIVATING</code> state until the deactivation process
     * completes.
     * </p>
     * <p>
     * To resume a deactivated pipeline, use ActivatePipeline. By default,
     * the pipeline resumes from the last completed execution. Optionally,
     * you can specify the date and time to resume the pipeline.
     * </p>
     *
     * @param deactivatePipelineRequest Container for the necessary
     *           parameters to execute the DeactivatePipeline operation on
     *           DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         DeactivatePipeline service method, as returned by DataPipeline.
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
    public Future<DeactivatePipelineResult> deactivatePipelineAsync(DeactivatePipelineRequest deactivatePipelineRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deactivates the specified running pipeline. The pipeline is set to
     * the <code>DEACTIVATING</code> state until the deactivation process
     * completes.
     * </p>
     * <p>
     * To resume a deactivated pipeline, use ActivatePipeline. By default,
     * the pipeline resumes from the last completed execution. Optionally,
     * you can specify the date and time to resume the pipeline.
     * </p>
     *
     * @param deactivatePipelineRequest Container for the necessary
     *           parameters to execute the DeactivatePipeline operation on
     *           DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeactivatePipeline service method, as returned by DataPipeline.
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
    public Future<DeactivatePipelineResult> deactivatePipelineAsync(DeactivatePipelineRequest deactivatePipelineRequest,
            AsyncHandler<DeactivatePipelineRequest, DeactivatePipelineResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the definition of the specified pipeline. You can call
     * <code>GetPipelineDefinition</code> to retrieve the pipeline definition
     * that you provided using PutPipelineDefinition.
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
     * Gets the definition of the specified pipeline. You can call
     * <code>GetPipelineDefinition</code> to retrieve the pipeline definition
     * that you provided using PutPipelineDefinition.
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
     * Task runners call <code>SetTaskStatus</code> to notify AWS Data
     * Pipeline that a task is completed and provide information about the
     * final status. A task runner makes this call regardless of whether the
     * task was sucessful. A task runner does not need to call
     * <code>SetTaskStatus</code> for tasks that are canceled by the web
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
     * Task runners call <code>SetTaskStatus</code> to notify AWS Data
     * Pipeline that a task is completed and provide information about the
     * final status. A task runner makes this call regardless of whether the
     * task was sucessful. A task runner does not need to call
     * <code>SetTaskStatus</code> for tasks that are canceled by the web
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
     * Task runners call <code>EvaluateExpression</code> to evaluate a
     * string in the context of the specified object. For example, a task
     * runner can evaluate SQL queries stored in Amazon S3.
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
     * Task runners call <code>EvaluateExpression</code> to evaluate a
     * string in the context of the specified object. For example, a task
     * runner can evaluate SQL queries stored in Amazon S3.
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
     * Retrieves metadata about one or more pipelines. The information
     * retrieved includes the name of the pipeline, the pipeline identifier,
     * its current state, and the user account that owns the pipeline. Using
     * account credentials, you can retrieve metadata about pipelines that
     * you or your IAM users have created. If you are using an IAM user
     * account, you can retrieve metadata about only those pipelines for
     * which you have read permissions.
     * </p>
     * <p>
     * To retrieve the full pipeline definition instead of metadata about
     * the pipeline, call GetPipelineDefinition.
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
     * Retrieves metadata about one or more pipelines. The information
     * retrieved includes the name of the pipeline, the pipeline identifier,
     * its current state, and the user account that owns the pipeline. Using
     * account credentials, you can retrieve metadata about pipelines that
     * you or your IAM users have created. If you are using an IAM user
     * account, you can retrieve metadata about only those pipelines for
     * which you have read permissions.
     * </p>
     * <p>
     * To retrieve the full pipeline definition instead of metadata about
     * the pipeline, call GetPipelineDefinition.
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
     * Creates a new, empty pipeline. Use PutPipelineDefinition to populate
     * the pipeline.
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
     * Creates a new, empty pipeline. Use PutPipelineDefinition to populate
     * the pipeline.
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
     * Gets the object definitions for a set of objects associated with the
     * pipeline. Object definitions are composed of a set of fields that
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
     * Gets the object definitions for a set of objects associated with the
     * pipeline. Object definitions are composed of a set of fields that
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
     * Removes existing tags from the specified pipeline.
     * </p>
     *
     * @param removeTagsRequest Container for the necessary parameters to
     *           execute the RemoveTags operation on DataPipeline.
     * 
     * @return A Java Future object containing the response from the
     *         RemoveTags service method, as returned by DataPipeline.
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
    public Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest removeTagsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes existing tags from the specified pipeline.
     * </p>
     *
     * @param removeTagsRequest Container for the necessary parameters to
     *           execute the RemoveTags operation on DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RemoveTags service method, as returned by DataPipeline.
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
    public Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest removeTagsRequest,
            AsyncHandler<RemoveTagsRequest, RemoveTagsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Task runners call <code>ReportTaskRunnerHeartbeat</code> every 15
     * minutes to indicate that they are operational. If the AWS Data
     * Pipeline Task Runner is launched on a resource managed by AWS Data
     * Pipeline, the web service can use this call to detect when the task
     * runner application has failed and restart a new instance.
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
     * Task runners call <code>ReportTaskRunnerHeartbeat</code> every 15
     * minutes to indicate that they are operational. If the AWS Data
     * Pipeline Task Runner is launched on a resource managed by AWS Data
     * Pipeline, the web service can use this call to detect when the task
     * runner application has failed and restart a new instance.
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
     * Adds or modifies tags for the specified pipeline.
     * </p>
     *
     * @param addTagsRequest Container for the necessary parameters to
     *           execute the AddTags operation on DataPipeline.
     * 
     * @return A Java Future object containing the response from the AddTags
     *         service method, as returned by DataPipeline.
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
    public Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds or modifies tags for the specified pipeline.
     * </p>
     *
     * @param addTagsRequest Container for the necessary parameters to
     *           execute the AddTags operation on DataPipeline.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the AddTags
     *         service method, as returned by DataPipeline.
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
    public Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest,
            AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds tasks, schedules, and preconditions to the specified pipeline.
     * You can use <code>PutPipelineDefinition</code> to populate a new
     * pipeline.
     * </p>
     * <p>
     * <code>PutPipelineDefinition</code> also validates the configuration
     * as it adds it to the pipeline. Changes to the pipeline are saved
     * unless one of the following three validation errors exists in the
     * pipeline.
     * </p>
     * <ol> <li>An object is missing a name or identifier field.</li>
     * <li>A string or reference field is empty.</li>
     * <li>The number of objects in the pipeline exceeds the maximum allowed
     * objects.</li>
     * <li>The pipeline is in a FINISHED state.</li>
     * </ol> <p>
     * Pipeline object definitions are passed to the
     * <code>PutPipelineDefinition</code> action and returned by the
     * GetPipelineDefinition action.
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
     * Adds tasks, schedules, and preconditions to the specified pipeline.
     * You can use <code>PutPipelineDefinition</code> to populate a new
     * pipeline.
     * </p>
     * <p>
     * <code>PutPipelineDefinition</code> also validates the configuration
     * as it adds it to the pipeline. Changes to the pipeline are saved
     * unless one of the following three validation errors exists in the
     * pipeline.
     * </p>
     * <ol> <li>An object is missing a name or identifier field.</li>
     * <li>A string or reference field is empty.</li>
     * <li>The number of objects in the pipeline exceeds the maximum allowed
     * objects.</li>
     * <li>The pipeline is in a FINISHED state.</li>
     * </ol> <p>
     * Pipeline object definitions are passed to the
     * <code>PutPipelineDefinition</code> action and returned by the
     * GetPipelineDefinition action.
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
        