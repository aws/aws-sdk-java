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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.datapipeline.model.*;

/**
 * Interface for accessing AWS Data Pipeline.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.datapipeline.AbstractDataPipeline} instead.
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
public interface DataPipeline {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "datapipeline";

    /**
     * Overrides the default endpoint for this client ("datapipeline.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "datapipeline.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "datapipeline.us-east-1.amazonaws.com"). If the protocol is not specified here, the default
     * protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
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
     *        The endpoint (ex: "datapipeline.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "datapipeline.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link DataPipeline#setEndpoint(String)}, sets the regional endpoint for this client's service
     * calls. Callers can use this method to control which AWS region they want to work with.
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
     * @return Result of the ActivatePipeline operation returned by the service.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @sample DataPipeline.ActivatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ActivatePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    ActivatePipelineResult activatePipeline(ActivatePipelineRequest activatePipelineRequest);

    /**
     * <p>
     * Adds or modifies tags for the specified pipeline.
     * </p>
     * 
     * @param addTagsRequest
     *        Contains the parameters for AddTags.
     * @return Result of the AddTags operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @sample DataPipeline.AddTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/AddTags" target="_top">AWS API
     *      Documentation</a>
     */
    AddTagsResult addTags(AddTagsRequest addTagsRequest);

    /**
     * <p>
     * Creates a new, empty pipeline. Use <a>PutPipelineDefinition</a> to populate the pipeline.
     * </p>
     * 
     * @param createPipelineRequest
     *        Contains the parameters for CreatePipeline.
     * @return Result of the CreatePipeline operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @sample DataPipeline.CreatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/CreatePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    CreatePipelineResult createPipeline(CreatePipelineRequest createPipelineRequest);

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
     * @return Result of the DeactivatePipeline operation returned by the service.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @sample DataPipeline.DeactivatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/DeactivatePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    DeactivatePipelineResult deactivatePipeline(DeactivatePipelineRequest deactivatePipelineRequest);

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
     * @return Result of the DeletePipeline operation returned by the service.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @sample DataPipeline.DeletePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/DeletePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    DeletePipelineResult deletePipeline(DeletePipelineRequest deletePipelineRequest);

    /**
     * <p>
     * Gets the object definitions for a set of objects associated with the pipeline. Object definitions are composed of
     * a set of fields that define the properties of the object.
     * </p>
     * 
     * @param describeObjectsRequest
     *        Contains the parameters for DescribeObjects.
     * @return Result of the DescribeObjects operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @sample DataPipeline.DescribeObjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/DescribeObjects" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeObjectsResult describeObjects(DescribeObjectsRequest describeObjectsRequest);

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
     * @return Result of the DescribePipelines operation returned by the service.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @sample DataPipeline.DescribePipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/DescribePipelines" target="_top">AWS
     *      API Documentation</a>
     */
    DescribePipelinesResult describePipelines(DescribePipelinesRequest describePipelinesRequest);

    /**
     * <p>
     * Task runners call <code>EvaluateExpression</code> to evaluate a string in the context of the specified object.
     * For example, a task runner can evaluate SQL queries stored in Amazon S3.
     * </p>
     * 
     * @param evaluateExpressionRequest
     *        Contains the parameters for EvaluateExpression.
     * @return Result of the EvaluateExpression operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws TaskNotFoundException
     *         The specified task was not found.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @sample DataPipeline.EvaluateExpression
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/EvaluateExpression"
     *      target="_top">AWS API Documentation</a>
     */
    EvaluateExpressionResult evaluateExpression(EvaluateExpressionRequest evaluateExpressionRequest);

    /**
     * <p>
     * Gets the definition of the specified pipeline. You can call <code>GetPipelineDefinition</code> to retrieve the
     * pipeline definition that you provided using <a>PutPipelineDefinition</a>.
     * </p>
     * 
     * @param getPipelineDefinitionRequest
     *        Contains the parameters for GetPipelineDefinition.
     * @return Result of the GetPipelineDefinition operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @sample DataPipeline.GetPipelineDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/GetPipelineDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    GetPipelineDefinitionResult getPipelineDefinition(GetPipelineDefinitionRequest getPipelineDefinitionRequest);

    /**
     * <p>
     * Lists the pipeline identifiers for all active pipelines that you have permission to access.
     * </p>
     * 
     * @param listPipelinesRequest
     *        Contains the parameters for ListPipelines.
     * @return Result of the ListPipelines operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @sample DataPipeline.ListPipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ListPipelines" target="_top">AWS API
     *      Documentation</a>
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
     * @return Result of the PollForTask operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @throws TaskNotFoundException
     *         The specified task was not found.
     * @sample DataPipeline.PollForTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/PollForTask" target="_top">AWS API
     *      Documentation</a>
     */
    PollForTaskResult pollForTask(PollForTaskRequest pollForTaskRequest);

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
     * @return Result of the PutPipelineDefinition operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @sample DataPipeline.PutPipelineDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/PutPipelineDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    PutPipelineDefinitionResult putPipelineDefinition(PutPipelineDefinitionRequest putPipelineDefinitionRequest);

    /**
     * <p>
     * Queries the specified pipeline for the names of objects that match the specified set of conditions.
     * </p>
     * 
     * @param queryObjectsRequest
     *        Contains the parameters for QueryObjects.
     * @return Result of the QueryObjects operation returned by the service.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @sample DataPipeline.QueryObjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/QueryObjects" target="_top">AWS API
     *      Documentation</a>
     */
    QueryObjectsResult queryObjects(QueryObjectsRequest queryObjectsRequest);

    /**
     * <p>
     * Removes existing tags from the specified pipeline.
     * </p>
     * 
     * @param removeTagsRequest
     *        Contains the parameters for RemoveTags.
     * @return Result of the RemoveTags operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @sample DataPipeline.RemoveTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/RemoveTags" target="_top">AWS API
     *      Documentation</a>
     */
    RemoveTagsResult removeTags(RemoveTagsRequest removeTagsRequest);

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
     * @return Result of the ReportTaskProgress operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @throws TaskNotFoundException
     *         The specified task was not found.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @sample DataPipeline.ReportTaskProgress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ReportTaskProgress"
     *      target="_top">AWS API Documentation</a>
     */
    ReportTaskProgressResult reportTaskProgress(ReportTaskProgressRequest reportTaskProgressRequest);

    /**
     * <p>
     * Task runners call <code>ReportTaskRunnerHeartbeat</code> every 15 minutes to indicate that they are operational.
     * If the AWS Data Pipeline Task Runner is launched on a resource managed by AWS Data Pipeline, the web service can
     * use this call to detect when the task runner application has failed and restart a new instance.
     * </p>
     * 
     * @param reportTaskRunnerHeartbeatRequest
     *        Contains the parameters for ReportTaskRunnerHeartbeat.
     * @return Result of the ReportTaskRunnerHeartbeat operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @sample DataPipeline.ReportTaskRunnerHeartbeat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ReportTaskRunnerHeartbeat"
     *      target="_top">AWS API Documentation</a>
     */
    ReportTaskRunnerHeartbeatResult reportTaskRunnerHeartbeat(ReportTaskRunnerHeartbeatRequest reportTaskRunnerHeartbeatRequest);

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
     * @return Result of the SetStatus operation returned by the service.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @sample DataPipeline.SetStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/SetStatus" target="_top">AWS API
     *      Documentation</a>
     */
    SetStatusResult setStatus(SetStatusRequest setStatusRequest);

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
     * @return Result of the SetTaskStatus operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws TaskNotFoundException
     *         The specified task was not found.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @sample DataPipeline.SetTaskStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/SetTaskStatus" target="_top">AWS API
     *      Documentation</a>
     */
    SetTaskStatusResult setTaskStatus(SetTaskStatusRequest setTaskStatusRequest);

    /**
     * <p>
     * Validates the specified pipeline definition to ensure that it is well formed and can be run without error.
     * </p>
     * 
     * @param validatePipelineDefinitionRequest
     *        Contains the parameters for ValidatePipelineDefinition.
     * @return Result of the ValidatePipelineDefinition operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @sample DataPipeline.ValidatePipelineDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ValidatePipelineDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    ValidatePipelineDefinitionResult validatePipelineDefinition(ValidatePipelineDefinitionRequest validatePipelineDefinitionRequest);

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
