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
package com.amazonaws.services.datapipeline;

import javax.annotation.Generated;

import com.amazonaws.services.datapipeline.model.*;

/**
 * Interface for accessing AWS Data Pipeline asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.datapipeline.AbstractDataPipelineAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS Data Pipeline configures and manages a data-driven workflow called a pipeline. AWS Data Pipeline handles the
 * details of scheduling and ensuring that data dependencies are met so that your application can focus on processing
 * the data.
 * </p>
 * <p>
 * AWS Data Pipeline provides a JAR implementation of a task runner called AWS Data Pipeline Task Runner. AWS Data
 * Pipeline Task Runner provides logic for common data management scenarios, such as performing database queries and
 * running data analysis using Amazon Elastic MapReduce (Amazon EMR). You can use AWS Data Pipeline Task Runner as your
 * task runner, or you can write your own task runner to provide custom data management.
 * </p>
 * <p>
 * AWS Data Pipeline implements two main sets of functionality. Use the first set to create a pipeline and define data
 * sources, schedules, dependencies, and the transforms to be performed on the data. Use the second set in your task
 * runner application to receive the next task ready for processing. The logic for performing the task, such as querying
 * the data, running data analysis, or converting the data from one format to another, is contained within the task
 * runner. The task runner performs the task assigned to it by the web service, reporting progress to the web service as
 * it does so. When the task is done, the task runner reports the final success or failure of the task to the web
 * service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface DataPipelineAsync extends DataPipeline {

    /**
     * <p>
     * Validates the specified pipeline and starts processing pipeline tasks. If the pipeline does not pass validation,
     * activation fails.
     * </p>
     * <p>
     * If you need to pause the pipeline to investigate an issue with a component, such as a data source or script, call
     * <a>DeactivatePipeline</a>.
     * </p>
     * <p>
     * To activate a finished pipeline, modify the end date for the pipeline and then activate it.
     * </p>
     * 
     * @param activatePipelineRequest
     *        Contains the parameters for ActivatePipeline.
     * @return A Java Future containing the result of the ActivatePipeline operation returned by the service.
     * @sample DataPipelineAsync.ActivatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ActivatePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ActivatePipelineResult> activatePipelineAsync(ActivatePipelineRequest activatePipelineRequest);

    /**
     * <p>
     * Validates the specified pipeline and starts processing pipeline tasks. If the pipeline does not pass validation,
     * activation fails.
     * </p>
     * <p>
     * If you need to pause the pipeline to investigate an issue with a component, such as a data source or script, call
     * <a>DeactivatePipeline</a>.
     * </p>
     * <p>
     * To activate a finished pipeline, modify the end date for the pipeline and then activate it.
     * </p>
     * 
     * @param activatePipelineRequest
     *        Contains the parameters for ActivatePipeline.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ActivatePipeline operation returned by the service.
     * @sample DataPipelineAsyncHandler.ActivatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ActivatePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ActivatePipelineResult> activatePipelineAsync(ActivatePipelineRequest activatePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<ActivatePipelineRequest, ActivatePipelineResult> asyncHandler);

    /**
     * <p>
     * Adds or modifies tags for the specified pipeline.
     * </p>
     * 
     * @param addTagsRequest
     *        Contains the parameters for AddTags.
     * @return A Java Future containing the result of the AddTags operation returned by the service.
     * @sample DataPipelineAsync.AddTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/AddTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest);

    /**
     * <p>
     * Adds or modifies tags for the specified pipeline.
     * </p>
     * 
     * @param addTagsRequest
     *        Contains the parameters for AddTags.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddTags operation returned by the service.
     * @sample DataPipelineAsyncHandler.AddTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/AddTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest,
            com.amazonaws.handlers.AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler);

    /**
     * <p>
     * Creates a new, empty pipeline. Use <a>PutPipelineDefinition</a> to populate the pipeline.
     * </p>
     * 
     * @param createPipelineRequest
     *        Contains the parameters for CreatePipeline.
     * @return A Java Future containing the result of the CreatePipeline operation returned by the service.
     * @sample DataPipelineAsync.CreatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/CreatePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePipelineResult> createPipelineAsync(CreatePipelineRequest createPipelineRequest);

    /**
     * <p>
     * Creates a new, empty pipeline. Use <a>PutPipelineDefinition</a> to populate the pipeline.
     * </p>
     * 
     * @param createPipelineRequest
     *        Contains the parameters for CreatePipeline.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePipeline operation returned by the service.
     * @sample DataPipelineAsyncHandler.CreatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/CreatePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePipelineResult> createPipelineAsync(CreatePipelineRequest createPipelineRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePipelineRequest, CreatePipelineResult> asyncHandler);

    /**
     * <p>
     * Deactivates the specified running pipeline. The pipeline is set to the <code>DEACTIVATING</code> state until the
     * deactivation process completes.
     * </p>
     * <p>
     * To resume a deactivated pipeline, use <a>ActivatePipeline</a>. By default, the pipeline resumes from the last
     * completed execution. Optionally, you can specify the date and time to resume the pipeline.
     * </p>
     * 
     * @param deactivatePipelineRequest
     *        Contains the parameters for DeactivatePipeline.
     * @return A Java Future containing the result of the DeactivatePipeline operation returned by the service.
     * @sample DataPipelineAsync.DeactivatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/DeactivatePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeactivatePipelineResult> deactivatePipelineAsync(DeactivatePipelineRequest deactivatePipelineRequest);

    /**
     * <p>
     * Deactivates the specified running pipeline. The pipeline is set to the <code>DEACTIVATING</code> state until the
     * deactivation process completes.
     * </p>
     * <p>
     * To resume a deactivated pipeline, use <a>ActivatePipeline</a>. By default, the pipeline resumes from the last
     * completed execution. Optionally, you can specify the date and time to resume the pipeline.
     * </p>
     * 
     * @param deactivatePipelineRequest
     *        Contains the parameters for DeactivatePipeline.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeactivatePipeline operation returned by the service.
     * @sample DataPipelineAsyncHandler.DeactivatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/DeactivatePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeactivatePipelineResult> deactivatePipelineAsync(DeactivatePipelineRequest deactivatePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<DeactivatePipelineRequest, DeactivatePipelineResult> asyncHandler);

    /**
     * <p>
     * Deletes a pipeline, its pipeline definition, and its run history. AWS Data Pipeline attempts to cancel instances
     * associated with the pipeline that are currently being processed by task runners.
     * </p>
     * <p>
     * Deleting a pipeline cannot be undone. You cannot query or restore a deleted pipeline. To temporarily pause a
     * pipeline instead of deleting it, call <a>SetStatus</a> with the status set to <code>PAUSE</code> on individual
     * components. Components that are paused by <a>SetStatus</a> can be resumed.
     * </p>
     * 
     * @param deletePipelineRequest
     *        Contains the parameters for DeletePipeline.
     * @return A Java Future containing the result of the DeletePipeline operation returned by the service.
     * @sample DataPipelineAsync.DeletePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/DeletePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeletePipelineResult> deletePipelineAsync(DeletePipelineRequest deletePipelineRequest);

    /**
     * <p>
     * Deletes a pipeline, its pipeline definition, and its run history. AWS Data Pipeline attempts to cancel instances
     * associated with the pipeline that are currently being processed by task runners.
     * </p>
     * <p>
     * Deleting a pipeline cannot be undone. You cannot query or restore a deleted pipeline. To temporarily pause a
     * pipeline instead of deleting it, call <a>SetStatus</a> with the status set to <code>PAUSE</code> on individual
     * components. Components that are paused by <a>SetStatus</a> can be resumed.
     * </p>
     * 
     * @param deletePipelineRequest
     *        Contains the parameters for DeletePipeline.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePipeline operation returned by the service.
     * @sample DataPipelineAsyncHandler.DeletePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/DeletePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeletePipelineResult> deletePipelineAsync(DeletePipelineRequest deletePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePipelineRequest, DeletePipelineResult> asyncHandler);

    /**
     * <p>
     * Gets the object definitions for a set of objects associated with the pipeline. Object definitions are composed of
     * a set of fields that define the properties of the object.
     * </p>
     * 
     * @param describeObjectsRequest
     *        Contains the parameters for DescribeObjects.
     * @return A Java Future containing the result of the DescribeObjects operation returned by the service.
     * @sample DataPipelineAsync.DescribeObjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/DescribeObjects" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeObjectsResult> describeObjectsAsync(DescribeObjectsRequest describeObjectsRequest);

    /**
     * <p>
     * Gets the object definitions for a set of objects associated with the pipeline. Object definitions are composed of
     * a set of fields that define the properties of the object.
     * </p>
     * 
     * @param describeObjectsRequest
     *        Contains the parameters for DescribeObjects.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeObjects operation returned by the service.
     * @sample DataPipelineAsyncHandler.DescribeObjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/DescribeObjects" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeObjectsResult> describeObjectsAsync(DescribeObjectsRequest describeObjectsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeObjectsRequest, DescribeObjectsResult> asyncHandler);

    /**
     * <p>
     * Retrieves metadata about one or more pipelines. The information retrieved includes the name of the pipeline, the
     * pipeline identifier, its current state, and the user account that owns the pipeline. Using account credentials,
     * you can retrieve metadata about pipelines that you or your IAM users have created. If you are using an IAM user
     * account, you can retrieve metadata about only those pipelines for which you have read permissions.
     * </p>
     * <p>
     * To retrieve the full pipeline definition instead of metadata about the pipeline, call
     * <a>GetPipelineDefinition</a>.
     * </p>
     * 
     * @param describePipelinesRequest
     *        Contains the parameters for DescribePipelines.
     * @return A Java Future containing the result of the DescribePipelines operation returned by the service.
     * @sample DataPipelineAsync.DescribePipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/DescribePipelines" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribePipelinesResult> describePipelinesAsync(DescribePipelinesRequest describePipelinesRequest);

    /**
     * <p>
     * Retrieves metadata about one or more pipelines. The information retrieved includes the name of the pipeline, the
     * pipeline identifier, its current state, and the user account that owns the pipeline. Using account credentials,
     * you can retrieve metadata about pipelines that you or your IAM users have created. If you are using an IAM user
     * account, you can retrieve metadata about only those pipelines for which you have read permissions.
     * </p>
     * <p>
     * To retrieve the full pipeline definition instead of metadata about the pipeline, call
     * <a>GetPipelineDefinition</a>.
     * </p>
     * 
     * @param describePipelinesRequest
     *        Contains the parameters for DescribePipelines.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePipelines operation returned by the service.
     * @sample DataPipelineAsyncHandler.DescribePipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/DescribePipelines" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribePipelinesResult> describePipelinesAsync(DescribePipelinesRequest describePipelinesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePipelinesRequest, DescribePipelinesResult> asyncHandler);

    /**
     * <p>
     * Task runners call <code>EvaluateExpression</code> to evaluate a string in the context of the specified object.
     * For example, a task runner can evaluate SQL queries stored in Amazon S3.
     * </p>
     * 
     * @param evaluateExpressionRequest
     *        Contains the parameters for EvaluateExpression.
     * @return A Java Future containing the result of the EvaluateExpression operation returned by the service.
     * @sample DataPipelineAsync.EvaluateExpression
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/EvaluateExpression"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EvaluateExpressionResult> evaluateExpressionAsync(EvaluateExpressionRequest evaluateExpressionRequest);

    /**
     * <p>
     * Task runners call <code>EvaluateExpression</code> to evaluate a string in the context of the specified object.
     * For example, a task runner can evaluate SQL queries stored in Amazon S3.
     * </p>
     * 
     * @param evaluateExpressionRequest
     *        Contains the parameters for EvaluateExpression.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EvaluateExpression operation returned by the service.
     * @sample DataPipelineAsyncHandler.EvaluateExpression
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/EvaluateExpression"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EvaluateExpressionResult> evaluateExpressionAsync(EvaluateExpressionRequest evaluateExpressionRequest,
            com.amazonaws.handlers.AsyncHandler<EvaluateExpressionRequest, EvaluateExpressionResult> asyncHandler);

    /**
     * <p>
     * Gets the definition of the specified pipeline. You can call <code>GetPipelineDefinition</code> to retrieve the
     * pipeline definition that you provided using <a>PutPipelineDefinition</a>.
     * </p>
     * 
     * @param getPipelineDefinitionRequest
     *        Contains the parameters for GetPipelineDefinition.
     * @return A Java Future containing the result of the GetPipelineDefinition operation returned by the service.
     * @sample DataPipelineAsync.GetPipelineDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/GetPipelineDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPipelineDefinitionResult> getPipelineDefinitionAsync(GetPipelineDefinitionRequest getPipelineDefinitionRequest);

    /**
     * <p>
     * Gets the definition of the specified pipeline. You can call <code>GetPipelineDefinition</code> to retrieve the
     * pipeline definition that you provided using <a>PutPipelineDefinition</a>.
     * </p>
     * 
     * @param getPipelineDefinitionRequest
     *        Contains the parameters for GetPipelineDefinition.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPipelineDefinition operation returned by the service.
     * @sample DataPipelineAsyncHandler.GetPipelineDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/GetPipelineDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPipelineDefinitionResult> getPipelineDefinitionAsync(GetPipelineDefinitionRequest getPipelineDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<GetPipelineDefinitionRequest, GetPipelineDefinitionResult> asyncHandler);

    /**
     * <p>
     * Lists the pipeline identifiers for all active pipelines that you have permission to access.
     * </p>
     * 
     * @param listPipelinesRequest
     *        Contains the parameters for ListPipelines.
     * @return A Java Future containing the result of the ListPipelines operation returned by the service.
     * @sample DataPipelineAsync.ListPipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ListPipelines" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(ListPipelinesRequest listPipelinesRequest);

    /**
     * <p>
     * Lists the pipeline identifiers for all active pipelines that you have permission to access.
     * </p>
     * 
     * @param listPipelinesRequest
     *        Contains the parameters for ListPipelines.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPipelines operation returned by the service.
     * @sample DataPipelineAsyncHandler.ListPipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ListPipelines" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(ListPipelinesRequest listPipelinesRequest,
            com.amazonaws.handlers.AsyncHandler<ListPipelinesRequest, ListPipelinesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListPipelines operation.
     *
     * @see #listPipelinesAsync(ListPipelinesRequest)
     */
    java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync();

    /**
     * Simplified method form for invoking the ListPipelines operation with an AsyncHandler.
     *
     * @see #listPipelinesAsync(ListPipelinesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(
            com.amazonaws.handlers.AsyncHandler<ListPipelinesRequest, ListPipelinesResult> asyncHandler);

    /**
     * <p>
     * Task runners call <code>PollForTask</code> to receive a task to perform from AWS Data Pipeline. The task runner
     * specifies which tasks it can perform by setting a value for the <code>workerGroup</code> parameter. The task
     * returned can come from any of the pipelines that match the <code>workerGroup</code> value passed in by the task
     * runner and that was launched using the IAM user credentials specified by the task runner.
     * </p>
     * <p>
     * If tasks are ready in the work queue, <code>PollForTask</code> returns a response immediately. If no tasks are
     * available in the queue, <code>PollForTask</code> uses long-polling and holds on to a poll connection for up to a
     * 90 seconds, during which time the first newly scheduled task is handed to the task runner. To accomodate this,
     * set the socket timeout in your task runner to 90 seconds. The task runner should not call
     * <code>PollForTask</code> again on the same <code>workerGroup</code> until it receives a response, and this can
     * take up to 90 seconds.
     * </p>
     * 
     * @param pollForTaskRequest
     *        Contains the parameters for PollForTask.
     * @return A Java Future containing the result of the PollForTask operation returned by the service.
     * @sample DataPipelineAsync.PollForTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/PollForTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PollForTaskResult> pollForTaskAsync(PollForTaskRequest pollForTaskRequest);

    /**
     * <p>
     * Task runners call <code>PollForTask</code> to receive a task to perform from AWS Data Pipeline. The task runner
     * specifies which tasks it can perform by setting a value for the <code>workerGroup</code> parameter. The task
     * returned can come from any of the pipelines that match the <code>workerGroup</code> value passed in by the task
     * runner and that was launched using the IAM user credentials specified by the task runner.
     * </p>
     * <p>
     * If tasks are ready in the work queue, <code>PollForTask</code> returns a response immediately. If no tasks are
     * available in the queue, <code>PollForTask</code> uses long-polling and holds on to a poll connection for up to a
     * 90 seconds, during which time the first newly scheduled task is handed to the task runner. To accomodate this,
     * set the socket timeout in your task runner to 90 seconds. The task runner should not call
     * <code>PollForTask</code> again on the same <code>workerGroup</code> until it receives a response, and this can
     * take up to 90 seconds.
     * </p>
     * 
     * @param pollForTaskRequest
     *        Contains the parameters for PollForTask.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PollForTask operation returned by the service.
     * @sample DataPipelineAsyncHandler.PollForTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/PollForTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PollForTaskResult> pollForTaskAsync(PollForTaskRequest pollForTaskRequest,
            com.amazonaws.handlers.AsyncHandler<PollForTaskRequest, PollForTaskResult> asyncHandler);

    /**
     * <p>
     * Adds tasks, schedules, and preconditions to the specified pipeline. You can use
     * <code>PutPipelineDefinition</code> to populate a new pipeline.
     * </p>
     * <p>
     * <code>PutPipelineDefinition</code> also validates the configuration as it adds it to the pipeline. Changes to the
     * pipeline are saved unless one of the following three validation errors exists in the pipeline.
     * </p>
     * <ol>
     * <li>An object is missing a name or identifier field.</li>
     * <li>A string or reference field is empty.</li>
     * <li>The number of objects in the pipeline exceeds the maximum allowed objects.</li>
     * <li>The pipeline is in a FINISHED state.</li>
     * </ol>
     * <p>
     * Pipeline object definitions are passed to the <code>PutPipelineDefinition</code> action and returned by the
     * <a>GetPipelineDefinition</a> action.
     * </p>
     * 
     * @param putPipelineDefinitionRequest
     *        Contains the parameters for PutPipelineDefinition.
     * @return A Java Future containing the result of the PutPipelineDefinition operation returned by the service.
     * @sample DataPipelineAsync.PutPipelineDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/PutPipelineDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutPipelineDefinitionResult> putPipelineDefinitionAsync(PutPipelineDefinitionRequest putPipelineDefinitionRequest);

    /**
     * <p>
     * Adds tasks, schedules, and preconditions to the specified pipeline. You can use
     * <code>PutPipelineDefinition</code> to populate a new pipeline.
     * </p>
     * <p>
     * <code>PutPipelineDefinition</code> also validates the configuration as it adds it to the pipeline. Changes to the
     * pipeline are saved unless one of the following three validation errors exists in the pipeline.
     * </p>
     * <ol>
     * <li>An object is missing a name or identifier field.</li>
     * <li>A string or reference field is empty.</li>
     * <li>The number of objects in the pipeline exceeds the maximum allowed objects.</li>
     * <li>The pipeline is in a FINISHED state.</li>
     * </ol>
     * <p>
     * Pipeline object definitions are passed to the <code>PutPipelineDefinition</code> action and returned by the
     * <a>GetPipelineDefinition</a> action.
     * </p>
     * 
     * @param putPipelineDefinitionRequest
     *        Contains the parameters for PutPipelineDefinition.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutPipelineDefinition operation returned by the service.
     * @sample DataPipelineAsyncHandler.PutPipelineDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/PutPipelineDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutPipelineDefinitionResult> putPipelineDefinitionAsync(PutPipelineDefinitionRequest putPipelineDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<PutPipelineDefinitionRequest, PutPipelineDefinitionResult> asyncHandler);

    /**
     * <p>
     * Queries the specified pipeline for the names of objects that match the specified set of conditions.
     * </p>
     * 
     * @param queryObjectsRequest
     *        Contains the parameters for QueryObjects.
     * @return A Java Future containing the result of the QueryObjects operation returned by the service.
     * @sample DataPipelineAsync.QueryObjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/QueryObjects" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<QueryObjectsResult> queryObjectsAsync(QueryObjectsRequest queryObjectsRequest);

    /**
     * <p>
     * Queries the specified pipeline for the names of objects that match the specified set of conditions.
     * </p>
     * 
     * @param queryObjectsRequest
     *        Contains the parameters for QueryObjects.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the QueryObjects operation returned by the service.
     * @sample DataPipelineAsyncHandler.QueryObjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/QueryObjects" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<QueryObjectsResult> queryObjectsAsync(QueryObjectsRequest queryObjectsRequest,
            com.amazonaws.handlers.AsyncHandler<QueryObjectsRequest, QueryObjectsResult> asyncHandler);

    /**
     * <p>
     * Removes existing tags from the specified pipeline.
     * </p>
     * 
     * @param removeTagsRequest
     *        Contains the parameters for RemoveTags.
     * @return A Java Future containing the result of the RemoveTags operation returned by the service.
     * @sample DataPipelineAsync.RemoveTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/RemoveTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest removeTagsRequest);

    /**
     * <p>
     * Removes existing tags from the specified pipeline.
     * </p>
     * 
     * @param removeTagsRequest
     *        Contains the parameters for RemoveTags.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTags operation returned by the service.
     * @sample DataPipelineAsyncHandler.RemoveTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/RemoveTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest removeTagsRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsRequest, RemoveTagsResult> asyncHandler);

    /**
     * <p>
     * Task runners call <code>ReportTaskProgress</code> when assigned a task to acknowledge that it has the task. If
     * the web service does not receive this acknowledgement within 2 minutes, it assigns the task in a subsequent
     * <a>PollForTask</a> call. After this initial acknowledgement, the task runner only needs to report progress every
     * 15 minutes to maintain its ownership of the task. You can change this reporting time from 15 minutes by
     * specifying a <code>reportProgressTimeout</code> field in your pipeline.
     * </p>
     * <p>
     * If a task runner does not report its status after 5 minutes, AWS Data Pipeline assumes that the task runner is
     * unable to process the task and reassigns the task in a subsequent response to <a>PollForTask</a>. Task runners
     * should call <code>ReportTaskProgress</code> every 60 seconds.
     * </p>
     * 
     * @param reportTaskProgressRequest
     *        Contains the parameters for ReportTaskProgress.
     * @return A Java Future containing the result of the ReportTaskProgress operation returned by the service.
     * @sample DataPipelineAsync.ReportTaskProgress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ReportTaskProgress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReportTaskProgressResult> reportTaskProgressAsync(ReportTaskProgressRequest reportTaskProgressRequest);

    /**
     * <p>
     * Task runners call <code>ReportTaskProgress</code> when assigned a task to acknowledge that it has the task. If
     * the web service does not receive this acknowledgement within 2 minutes, it assigns the task in a subsequent
     * <a>PollForTask</a> call. After this initial acknowledgement, the task runner only needs to report progress every
     * 15 minutes to maintain its ownership of the task. You can change this reporting time from 15 minutes by
     * specifying a <code>reportProgressTimeout</code> field in your pipeline.
     * </p>
     * <p>
     * If a task runner does not report its status after 5 minutes, AWS Data Pipeline assumes that the task runner is
     * unable to process the task and reassigns the task in a subsequent response to <a>PollForTask</a>. Task runners
     * should call <code>ReportTaskProgress</code> every 60 seconds.
     * </p>
     * 
     * @param reportTaskProgressRequest
     *        Contains the parameters for ReportTaskProgress.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReportTaskProgress operation returned by the service.
     * @sample DataPipelineAsyncHandler.ReportTaskProgress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ReportTaskProgress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReportTaskProgressResult> reportTaskProgressAsync(ReportTaskProgressRequest reportTaskProgressRequest,
            com.amazonaws.handlers.AsyncHandler<ReportTaskProgressRequest, ReportTaskProgressResult> asyncHandler);

    /**
     * <p>
     * Task runners call <code>ReportTaskRunnerHeartbeat</code> every 15 minutes to indicate that they are operational.
     * If the AWS Data Pipeline Task Runner is launched on a resource managed by AWS Data Pipeline, the web service can
     * use this call to detect when the task runner application has failed and restart a new instance.
     * </p>
     * 
     * @param reportTaskRunnerHeartbeatRequest
     *        Contains the parameters for ReportTaskRunnerHeartbeat.
     * @return A Java Future containing the result of the ReportTaskRunnerHeartbeat operation returned by the service.
     * @sample DataPipelineAsync.ReportTaskRunnerHeartbeat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ReportTaskRunnerHeartbeat"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReportTaskRunnerHeartbeatResult> reportTaskRunnerHeartbeatAsync(
            ReportTaskRunnerHeartbeatRequest reportTaskRunnerHeartbeatRequest);

    /**
     * <p>
     * Task runners call <code>ReportTaskRunnerHeartbeat</code> every 15 minutes to indicate that they are operational.
     * If the AWS Data Pipeline Task Runner is launched on a resource managed by AWS Data Pipeline, the web service can
     * use this call to detect when the task runner application has failed and restart a new instance.
     * </p>
     * 
     * @param reportTaskRunnerHeartbeatRequest
     *        Contains the parameters for ReportTaskRunnerHeartbeat.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReportTaskRunnerHeartbeat operation returned by the service.
     * @sample DataPipelineAsyncHandler.ReportTaskRunnerHeartbeat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ReportTaskRunnerHeartbeat"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ReportTaskRunnerHeartbeatResult> reportTaskRunnerHeartbeatAsync(
            ReportTaskRunnerHeartbeatRequest reportTaskRunnerHeartbeatRequest,
            com.amazonaws.handlers.AsyncHandler<ReportTaskRunnerHeartbeatRequest, ReportTaskRunnerHeartbeatResult> asyncHandler);

    /**
     * <p>
     * Requests that the status of the specified physical or logical pipeline objects be updated in the specified
     * pipeline. This update might not occur immediately, but is eventually consistent. The status that can be set
     * depends on the type of object (for example, DataNode or Activity). You cannot perform this operation on
     * <code>FINISHED</code> pipelines and attempting to do so returns <code>InvalidRequestException</code>.
     * </p>
     * 
     * @param setStatusRequest
     *        Contains the parameters for SetStatus.
     * @return A Java Future containing the result of the SetStatus operation returned by the service.
     * @sample DataPipelineAsync.SetStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/SetStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SetStatusResult> setStatusAsync(SetStatusRequest setStatusRequest);

    /**
     * <p>
     * Requests that the status of the specified physical or logical pipeline objects be updated in the specified
     * pipeline. This update might not occur immediately, but is eventually consistent. The status that can be set
     * depends on the type of object (for example, DataNode or Activity). You cannot perform this operation on
     * <code>FINISHED</code> pipelines and attempting to do so returns <code>InvalidRequestException</code>.
     * </p>
     * 
     * @param setStatusRequest
     *        Contains the parameters for SetStatus.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetStatus operation returned by the service.
     * @sample DataPipelineAsyncHandler.SetStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/SetStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SetStatusResult> setStatusAsync(SetStatusRequest setStatusRequest,
            com.amazonaws.handlers.AsyncHandler<SetStatusRequest, SetStatusResult> asyncHandler);

    /**
     * <p>
     * Task runners call <code>SetTaskStatus</code> to notify AWS Data Pipeline that a task is completed and provide
     * information about the final status. A task runner makes this call regardless of whether the task was sucessful. A
     * task runner does not need to call <code>SetTaskStatus</code> for tasks that are canceled by the web service
     * during a call to <a>ReportTaskProgress</a>.
     * </p>
     * 
     * @param setTaskStatusRequest
     *        Contains the parameters for SetTaskStatus.
     * @return A Java Future containing the result of the SetTaskStatus operation returned by the service.
     * @sample DataPipelineAsync.SetTaskStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/SetTaskStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SetTaskStatusResult> setTaskStatusAsync(SetTaskStatusRequest setTaskStatusRequest);

    /**
     * <p>
     * Task runners call <code>SetTaskStatus</code> to notify AWS Data Pipeline that a task is completed and provide
     * information about the final status. A task runner makes this call regardless of whether the task was sucessful. A
     * task runner does not need to call <code>SetTaskStatus</code> for tasks that are canceled by the web service
     * during a call to <a>ReportTaskProgress</a>.
     * </p>
     * 
     * @param setTaskStatusRequest
     *        Contains the parameters for SetTaskStatus.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetTaskStatus operation returned by the service.
     * @sample DataPipelineAsyncHandler.SetTaskStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/SetTaskStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SetTaskStatusResult> setTaskStatusAsync(SetTaskStatusRequest setTaskStatusRequest,
            com.amazonaws.handlers.AsyncHandler<SetTaskStatusRequest, SetTaskStatusResult> asyncHandler);

    /**
     * <p>
     * Validates the specified pipeline definition to ensure that it is well formed and can be run without error.
     * </p>
     * 
     * @param validatePipelineDefinitionRequest
     *        Contains the parameters for ValidatePipelineDefinition.
     * @return A Java Future containing the result of the ValidatePipelineDefinition operation returned by the service.
     * @sample DataPipelineAsync.ValidatePipelineDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ValidatePipelineDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ValidatePipelineDefinitionResult> validatePipelineDefinitionAsync(
            ValidatePipelineDefinitionRequest validatePipelineDefinitionRequest);

    /**
     * <p>
     * Validates the specified pipeline definition to ensure that it is well formed and can be run without error.
     * </p>
     * 
     * @param validatePipelineDefinitionRequest
     *        Contains the parameters for ValidatePipelineDefinition.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ValidatePipelineDefinition operation returned by the service.
     * @sample DataPipelineAsyncHandler.ValidatePipelineDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ValidatePipelineDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ValidatePipelineDefinitionResult> validatePipelineDefinitionAsync(
            ValidatePipelineDefinitionRequest validatePipelineDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<ValidatePipelineDefinitionRequest, ValidatePipelineDefinitionResult> asyncHandler);

}
