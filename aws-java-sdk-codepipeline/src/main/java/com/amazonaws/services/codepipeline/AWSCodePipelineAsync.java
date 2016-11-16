/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codepipeline;

import com.amazonaws.services.codepipeline.model.*;

/**
 * Interface for accessing CodePipeline asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.codepipeline.AbstractAWSCodePipelineAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS CodePipeline</fullname>
 * <p>
 * <b>Overview</b>
 * </p>
 * <p>
 * This is the AWS CodePipeline API Reference. This guide provides descriptions of the actions and data types for AWS
 * CodePipeline. Some functionality for your pipeline is only configurable through the API. For additional information,
 * see the <a href="http://docs.aws.amazon.com/codepipeline/latest/userguide/welcome.html">AWS CodePipeline User
 * Guide</a>.
 * </p>
 * <p>
 * You can use the AWS CodePipeline API to work with pipelines, stages, actions, gates, and transitions, as described
 * below.
 * </p>
 * <p>
 * <i>Pipelines</i> are models of automated release processes. Each pipeline is uniquely named, and consists of actions,
 * gates, and stages.
 * </p>
 * <p>
 * You can work with pipelines by calling:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreatePipeline</a>, which creates a uniquely-named pipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeletePipeline</a>, which deletes the specified pipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetPipeline</a>, which returns information about a pipeline structure.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetPipelineExecution</a>, which returns information about a specific execution of a pipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetPipelineState</a>, which returns information about the current state of the stages and actions of a pipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListPipelines</a>, which gets a summary of all of the pipelines associated with your account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>StartPipelineExecution</a>, which runs the the most recent revision of an artifact through the pipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdatePipeline</a>, which updates a pipeline with edits or changes to the structure of the pipeline.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Pipelines include <i>stages</i>, which are which are logical groupings of gates and actions. Each stage contains one
 * or more actions that must complete before the next stage begins. A stage will result in success or failure. If a
 * stage fails, then the pipeline stops at that stage and will remain stopped until either a new version of an artifact
 * appears in the source location, or a user takes action to re-run the most recent artifact through the pipeline. You
 * can call <a>GetPipelineState</a>, which displays the status of a pipeline, including the status of stages in the
 * pipeline, or <a>GetPipeline</a>, which returns the entire structure of the pipeline, including the stages of that
 * pipeline. For more information about the structure of stages and actions, also refer to the <a
 * href="http://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-structure.html">AWS CodePipeline Pipeline
 * Structure Reference</a>.
 * </p>
 * <p>
 * Pipeline stages include <i>actions</i>, which are categorized into categories such as source or build actions
 * performed within a stage of a pipeline. For example, you can use a source action to import artifacts into a pipeline
 * from a source such as Amazon S3. Like stages, you do not work with actions directly in most cases, but you do define
 * and interact with actions when working with pipeline operations such as <a>CreatePipeline</a> and
 * <a>GetPipelineState</a>.
 * </p>
 * <p>
 * Pipelines also include <i>transitions</i>, which allow the transition of artifacts from one stage to the next in a
 * pipeline after the actions in one stage complete.
 * </p>
 * <p>
 * You can work with transitions by calling:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DisableStageTransition</a>, which prevents artifacts from transitioning to the next stage in a pipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>EnableStageTransition</a>, which enables transition of artifacts between stages in a pipeline.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Using the API to integrate with AWS CodePipeline</b>
 * </p>
 * <p>
 * For third-party integrators or developers who want to create their own integrations with AWS CodePipeline, the
 * expected sequence varies from the standard API user. In order to integrate with AWS CodePipeline, developers will
 * need to work with the following items:
 * </p>
 * <p>
 * <b>Jobs</b>, which are instances of an action. For example, a job for a source action might import a revision of an
 * artifact from a source.
 * </p>
 * <p>
 * You can work with jobs by calling:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>AcknowledgeJob</a>, which confirms whether a job worker has received the specified job,
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetJobDetails</a>, which returns the details of a job,
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PollForJobs</a>, which determines whether there are any jobs to act upon,
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutJobFailureResult</a>, which provides details of a job failure, and
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutJobSuccessResult</a>, which provides details of a job success.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Third party jobs</b>, which are instances of an action created by a partner action and integrated into AWS
 * CodePipeline. Partner actions are created by members of the AWS Partner Network.
 * </p>
 * <p>
 * You can work with third party jobs by calling:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>AcknowledgeThirdPartyJob</a>, which confirms whether a job worker has received the specified job,
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetThirdPartyJobDetails</a>, which requests the details of a job for a partner action,
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PollForThirdPartyJobs</a>, which determines whether there are any jobs to act upon,
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutThirdPartyJobFailureResult</a>, which provides details of a job failure, and
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutThirdPartyJobSuccessResult</a>, which provides details of a job success.
 * </p>
 * </li>
 * </ul>
 */
public interface AWSCodePipelineAsync extends AWSCodePipeline {

    /**
     * <p>
     * Returns information about a specified job and whether that job has been received by the job worker. Only used for
     * custom actions.
     * </p>
     * 
     * @param acknowledgeJobRequest
     *        Represents the input of an acknowledge job action.
     * @return A Java Future containing the result of the AcknowledgeJob operation returned by the service.
     * @sample AWSCodePipelineAsync.AcknowledgeJob
     */
    java.util.concurrent.Future<AcknowledgeJobResult> acknowledgeJobAsync(AcknowledgeJobRequest acknowledgeJobRequest);

    /**
     * <p>
     * Returns information about a specified job and whether that job has been received by the job worker. Only used for
     * custom actions.
     * </p>
     * 
     * @param acknowledgeJobRequest
     *        Represents the input of an acknowledge job action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcknowledgeJob operation returned by the service.
     * @sample AWSCodePipelineAsyncHandler.AcknowledgeJob
     */
    java.util.concurrent.Future<AcknowledgeJobResult> acknowledgeJobAsync(AcknowledgeJobRequest acknowledgeJobRequest,
            com.amazonaws.handlers.AsyncHandler<AcknowledgeJobRequest, AcknowledgeJobResult> asyncHandler);

    /**
     * <p>
     * Confirms a job worker has received the specified job. Only used for partner actions.
     * </p>
     * 
     * @param acknowledgeThirdPartyJobRequest
     *        Represents the input of an acknowledge third party job action.
     * @return A Java Future containing the result of the AcknowledgeThirdPartyJob operation returned by the service.
     * @sample AWSCodePipelineAsync.AcknowledgeThirdPartyJob
     */
    java.util.concurrent.Future<AcknowledgeThirdPartyJobResult> acknowledgeThirdPartyJobAsync(AcknowledgeThirdPartyJobRequest acknowledgeThirdPartyJobRequest);

    /**
     * <p>
     * Confirms a job worker has received the specified job. Only used for partner actions.
     * </p>
     * 
     * @param acknowledgeThirdPartyJobRequest
     *        Represents the input of an acknowledge third party job action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcknowledgeThirdPartyJob operation returned by the service.
     * @sample AWSCodePipelineAsyncHandler.AcknowledgeThirdPartyJob
     */
    java.util.concurrent.Future<AcknowledgeThirdPartyJobResult> acknowledgeThirdPartyJobAsync(AcknowledgeThirdPartyJobRequest acknowledgeThirdPartyJobRequest,
            com.amazonaws.handlers.AsyncHandler<AcknowledgeThirdPartyJobRequest, AcknowledgeThirdPartyJobResult> asyncHandler);

    /**
     * <p>
     * Creates a new custom action that can be used in all pipelines associated with the AWS account. Only used for
     * custom actions.
     * </p>
     * 
     * @param createCustomActionTypeRequest
     *        Represents the input of a create custom action operation.
     * @return A Java Future containing the result of the CreateCustomActionType operation returned by the service.
     * @sample AWSCodePipelineAsync.CreateCustomActionType
     */
    java.util.concurrent.Future<CreateCustomActionTypeResult> createCustomActionTypeAsync(CreateCustomActionTypeRequest createCustomActionTypeRequest);

    /**
     * <p>
     * Creates a new custom action that can be used in all pipelines associated with the AWS account. Only used for
     * custom actions.
     * </p>
     * 
     * @param createCustomActionTypeRequest
     *        Represents the input of a create custom action operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCustomActionType operation returned by the service.
     * @sample AWSCodePipelineAsyncHandler.CreateCustomActionType
     */
    java.util.concurrent.Future<CreateCustomActionTypeResult> createCustomActionTypeAsync(CreateCustomActionTypeRequest createCustomActionTypeRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCustomActionTypeRequest, CreateCustomActionTypeResult> asyncHandler);

    /**
     * <p>
     * Creates a pipeline.
     * </p>
     * 
     * @param createPipelineRequest
     *        Represents the input of a create pipeline action.
     * @return A Java Future containing the result of the CreatePipeline operation returned by the service.
     * @sample AWSCodePipelineAsync.CreatePipeline
     */
    java.util.concurrent.Future<CreatePipelineResult> createPipelineAsync(CreatePipelineRequest createPipelineRequest);

    /**
     * <p>
     * Creates a pipeline.
     * </p>
     * 
     * @param createPipelineRequest
     *        Represents the input of a create pipeline action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePipeline operation returned by the service.
     * @sample AWSCodePipelineAsyncHandler.CreatePipeline
     */
    java.util.concurrent.Future<CreatePipelineResult> createPipelineAsync(CreatePipelineRequest createPipelineRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePipelineRequest, CreatePipelineResult> asyncHandler);

    /**
     * <p>
     * Marks a custom action as deleted. PollForJobs for the custom action will fail after the action is marked for
     * deletion. Only used for custom actions.
     * </p>
     * <important>
     * <p>
     * You cannot recreate a custom action after it has been deleted unless you increase the version number of the
     * action.
     * </p>
     * </important>
     * 
     * @param deleteCustomActionTypeRequest
     *        Represents the input of a delete custom action operation. The custom action will be marked as deleted.
     * @return A Java Future containing the result of the DeleteCustomActionType operation returned by the service.
     * @sample AWSCodePipelineAsync.DeleteCustomActionType
     */
    java.util.concurrent.Future<DeleteCustomActionTypeResult> deleteCustomActionTypeAsync(DeleteCustomActionTypeRequest deleteCustomActionTypeRequest);

    /**
     * <p>
     * Marks a custom action as deleted. PollForJobs for the custom action will fail after the action is marked for
     * deletion. Only used for custom actions.
     * </p>
     * <important>
     * <p>
     * You cannot recreate a custom action after it has been deleted unless you increase the version number of the
     * action.
     * </p>
     * </important>
     * 
     * @param deleteCustomActionTypeRequest
     *        Represents the input of a delete custom action operation. The custom action will be marked as deleted.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCustomActionType operation returned by the service.
     * @sample AWSCodePipelineAsyncHandler.DeleteCustomActionType
     */
    java.util.concurrent.Future<DeleteCustomActionTypeResult> deleteCustomActionTypeAsync(DeleteCustomActionTypeRequest deleteCustomActionTypeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCustomActionTypeRequest, DeleteCustomActionTypeResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified pipeline.
     * </p>
     * 
     * @param deletePipelineRequest
     *        Represents the input of a delete pipeline action.
     * @return A Java Future containing the result of the DeletePipeline operation returned by the service.
     * @sample AWSCodePipelineAsync.DeletePipeline
     */
    java.util.concurrent.Future<DeletePipelineResult> deletePipelineAsync(DeletePipelineRequest deletePipelineRequest);

    /**
     * <p>
     * Deletes the specified pipeline.
     * </p>
     * 
     * @param deletePipelineRequest
     *        Represents the input of a delete pipeline action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePipeline operation returned by the service.
     * @sample AWSCodePipelineAsyncHandler.DeletePipeline
     */
    java.util.concurrent.Future<DeletePipelineResult> deletePipelineAsync(DeletePipelineRequest deletePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePipelineRequest, DeletePipelineResult> asyncHandler);

    /**
     * <p>
     * Prevents artifacts in a pipeline from transitioning to the next stage in the pipeline.
     * </p>
     * 
     * @param disableStageTransitionRequest
     *        Represents the input of a disable stage transition input action.
     * @return A Java Future containing the result of the DisableStageTransition operation returned by the service.
     * @sample AWSCodePipelineAsync.DisableStageTransition
     */
    java.util.concurrent.Future<DisableStageTransitionResult> disableStageTransitionAsync(DisableStageTransitionRequest disableStageTransitionRequest);

    /**
     * <p>
     * Prevents artifacts in a pipeline from transitioning to the next stage in the pipeline.
     * </p>
     * 
     * @param disableStageTransitionRequest
     *        Represents the input of a disable stage transition input action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableStageTransition operation returned by the service.
     * @sample AWSCodePipelineAsyncHandler.DisableStageTransition
     */
    java.util.concurrent.Future<DisableStageTransitionResult> disableStageTransitionAsync(DisableStageTransitionRequest disableStageTransitionRequest,
            com.amazonaws.handlers.AsyncHandler<DisableStageTransitionRequest, DisableStageTransitionResult> asyncHandler);

    /**
     * <p>
     * Enables artifacts in a pipeline to transition to a stage in a pipeline.
     * </p>
     * 
     * @param enableStageTransitionRequest
     *        Represents the input of an enable stage transition action.
     * @return A Java Future containing the result of the EnableStageTransition operation returned by the service.
     * @sample AWSCodePipelineAsync.EnableStageTransition
     */
    java.util.concurrent.Future<EnableStageTransitionResult> enableStageTransitionAsync(EnableStageTransitionRequest enableStageTransitionRequest);

    /**
     * <p>
     * Enables artifacts in a pipeline to transition to a stage in a pipeline.
     * </p>
     * 
     * @param enableStageTransitionRequest
     *        Represents the input of an enable stage transition action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableStageTransition operation returned by the service.
     * @sample AWSCodePipelineAsyncHandler.EnableStageTransition
     */
    java.util.concurrent.Future<EnableStageTransitionResult> enableStageTransitionAsync(EnableStageTransitionRequest enableStageTransitionRequest,
            com.amazonaws.handlers.AsyncHandler<EnableStageTransitionRequest, EnableStageTransitionResult> asyncHandler);

    /**
     * <p>
     * Returns information about a job. Only used for custom actions.
     * </p>
     * <important>
     * <p>
     * When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store
     * artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts.
     * Additionally, this API returns any secret values defined for the action.
     * </p>
     * </important>
     * 
     * @param getJobDetailsRequest
     *        Represents the input of a get job details action.
     * @return A Java Future containing the result of the GetJobDetails operation returned by the service.
     * @sample AWSCodePipelineAsync.GetJobDetails
     */
    java.util.concurrent.Future<GetJobDetailsResult> getJobDetailsAsync(GetJobDetailsRequest getJobDetailsRequest);

    /**
     * <p>
     * Returns information about a job. Only used for custom actions.
     * </p>
     * <important>
     * <p>
     * When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store
     * artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts.
     * Additionally, this API returns any secret values defined for the action.
     * </p>
     * </important>
     * 
     * @param getJobDetailsRequest
     *        Represents the input of a get job details action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetJobDetails operation returned by the service.
     * @sample AWSCodePipelineAsyncHandler.GetJobDetails
     */
    java.util.concurrent.Future<GetJobDetailsResult> getJobDetailsAsync(GetJobDetailsRequest getJobDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<GetJobDetailsRequest, GetJobDetailsResult> asyncHandler);

    /**
     * <p>
     * Returns the metadata, structure, stages, and actions of a pipeline. Can be used to return the entire structure of
     * a pipeline in JSON format, which can then be modified and used to update the pipeline structure with
     * <a>UpdatePipeline</a>.
     * </p>
     * 
     * @param getPipelineRequest
     *        Represents the input of a get pipeline action.
     * @return A Java Future containing the result of the GetPipeline operation returned by the service.
     * @sample AWSCodePipelineAsync.GetPipeline
     */
    java.util.concurrent.Future<GetPipelineResult> getPipelineAsync(GetPipelineRequest getPipelineRequest);

    /**
     * <p>
     * Returns the metadata, structure, stages, and actions of a pipeline. Can be used to return the entire structure of
     * a pipeline in JSON format, which can then be modified and used to update the pipeline structure with
     * <a>UpdatePipeline</a>.
     * </p>
     * 
     * @param getPipelineRequest
     *        Represents the input of a get pipeline action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPipeline operation returned by the service.
     * @sample AWSCodePipelineAsyncHandler.GetPipeline
     */
    java.util.concurrent.Future<GetPipelineResult> getPipelineAsync(GetPipelineRequest getPipelineRequest,
            com.amazonaws.handlers.AsyncHandler<GetPipelineRequest, GetPipelineResult> asyncHandler);

    /**
     * <p>
     * Returns information about an execution of a pipeline, including details about artifacts, the pipeline execution
     * ID, and the name, version, and status of the pipeline.
     * </p>
     * 
     * @param getPipelineExecutionRequest
     *        Represents the input of a get pipeline execution action.
     * @return A Java Future containing the result of the GetPipelineExecution operation returned by the service.
     * @sample AWSCodePipelineAsync.GetPipelineExecution
     */
    java.util.concurrent.Future<GetPipelineExecutionResult> getPipelineExecutionAsync(GetPipelineExecutionRequest getPipelineExecutionRequest);

    /**
     * <p>
     * Returns information about an execution of a pipeline, including details about artifacts, the pipeline execution
     * ID, and the name, version, and status of the pipeline.
     * </p>
     * 
     * @param getPipelineExecutionRequest
     *        Represents the input of a get pipeline execution action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPipelineExecution operation returned by the service.
     * @sample AWSCodePipelineAsyncHandler.GetPipelineExecution
     */
    java.util.concurrent.Future<GetPipelineExecutionResult> getPipelineExecutionAsync(GetPipelineExecutionRequest getPipelineExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<GetPipelineExecutionRequest, GetPipelineExecutionResult> asyncHandler);

    /**
     * <p>
     * Returns information about the state of a pipeline, including the stages and actions.
     * </p>
     * 
     * @param getPipelineStateRequest
     *        Represents the input of a get pipeline state action.
     * @return A Java Future containing the result of the GetPipelineState operation returned by the service.
     * @sample AWSCodePipelineAsync.GetPipelineState
     */
    java.util.concurrent.Future<GetPipelineStateResult> getPipelineStateAsync(GetPipelineStateRequest getPipelineStateRequest);

    /**
     * <p>
     * Returns information about the state of a pipeline, including the stages and actions.
     * </p>
     * 
     * @param getPipelineStateRequest
     *        Represents the input of a get pipeline state action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPipelineState operation returned by the service.
     * @sample AWSCodePipelineAsyncHandler.GetPipelineState
     */
    java.util.concurrent.Future<GetPipelineStateResult> getPipelineStateAsync(GetPipelineStateRequest getPipelineStateRequest,
            com.amazonaws.handlers.AsyncHandler<GetPipelineStateRequest, GetPipelineStateResult> asyncHandler);

    /**
     * <p>
     * Requests the details of a job for a third party action. Only used for partner actions.
     * </p>
     * <important>
     * <p>
     * When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store
     * artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts.
     * Additionally, this API returns any secret values defined for the action.
     * </p>
     * </important>
     * 
     * @param getThirdPartyJobDetailsRequest
     *        Represents the input of a get third party job details action.
     * @return A Java Future containing the result of the GetThirdPartyJobDetails operation returned by the service.
     * @sample AWSCodePipelineAsync.GetThirdPartyJobDetails
     */
    java.util.concurrent.Future<GetThirdPartyJobDetailsResult> getThirdPartyJobDetailsAsync(GetThirdPartyJobDetailsRequest getThirdPartyJobDetailsRequest);

    /**
     * <p>
     * Requests the details of a job for a third party action. Only used for partner actions.
     * </p>
     * <important>
     * <p>
     * When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store
     * artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts.
     * Additionally, this API returns any secret values defined for the action.
     * </p>
     * </important>
     * 
     * @param getThirdPartyJobDetailsRequest
     *        Represents the input of a get third party job details action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetThirdPartyJobDetails operation returned by the service.
     * @sample AWSCodePipelineAsyncHandler.GetThirdPartyJobDetails
     */
    java.util.concurrent.Future<GetThirdPartyJobDetailsResult> getThirdPartyJobDetailsAsync(GetThirdPartyJobDetailsRequest getThirdPartyJobDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<GetThirdPartyJobDetailsRequest, GetThirdPartyJobDetailsResult> asyncHandler);

    /**
     * <p>
     * Gets a summary of all AWS CodePipeline action types associated with your account.
     * </p>
     * 
     * @param listActionTypesRequest
     *        Represents the input of a list action types action.
     * @return A Java Future containing the result of the ListActionTypes operation returned by the service.
     * @sample AWSCodePipelineAsync.ListActionTypes
     */
    java.util.concurrent.Future<ListActionTypesResult> listActionTypesAsync(ListActionTypesRequest listActionTypesRequest);

    /**
     * <p>
     * Gets a summary of all AWS CodePipeline action types associated with your account.
     * </p>
     * 
     * @param listActionTypesRequest
     *        Represents the input of a list action types action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListActionTypes operation returned by the service.
     * @sample AWSCodePipelineAsyncHandler.ListActionTypes
     */
    java.util.concurrent.Future<ListActionTypesResult> listActionTypesAsync(ListActionTypesRequest listActionTypesRequest,
            com.amazonaws.handlers.AsyncHandler<ListActionTypesRequest, ListActionTypesResult> asyncHandler);

    /**
     * <p>
     * Gets a summary of all of the pipelines associated with your account.
     * </p>
     * 
     * @param listPipelinesRequest
     *        Represents the input of a list pipelines action.
     * @return A Java Future containing the result of the ListPipelines operation returned by the service.
     * @sample AWSCodePipelineAsync.ListPipelines
     */
    java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(ListPipelinesRequest listPipelinesRequest);

    /**
     * <p>
     * Gets a summary of all of the pipelines associated with your account.
     * </p>
     * 
     * @param listPipelinesRequest
     *        Represents the input of a list pipelines action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPipelines operation returned by the service.
     * @sample AWSCodePipelineAsyncHandler.ListPipelines
     */
    java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(ListPipelinesRequest listPipelinesRequest,
            com.amazonaws.handlers.AsyncHandler<ListPipelinesRequest, ListPipelinesResult> asyncHandler);

    /**
     * <p>
     * Returns information about any jobs for AWS CodePipeline to act upon.
     * </p>
     * <important>
     * <p>
     * When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store
     * artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts.
     * Additionally, this API returns any secret values defined for the action.
     * </p>
     * </important>
     * 
     * @param pollForJobsRequest
     *        Represents the input of a poll for jobs action.
     * @return A Java Future containing the result of the PollForJobs operation returned by the service.
     * @sample AWSCodePipelineAsync.PollForJobs
     */
    java.util.concurrent.Future<PollForJobsResult> pollForJobsAsync(PollForJobsRequest pollForJobsRequest);

    /**
     * <p>
     * Returns information about any jobs for AWS CodePipeline to act upon.
     * </p>
     * <important>
     * <p>
     * When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store
     * artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts.
     * Additionally, this API returns any secret values defined for the action.
     * </p>
     * </important>
     * 
     * @param pollForJobsRequest
     *        Represents the input of a poll for jobs action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PollForJobs operation returned by the service.
     * @sample AWSCodePipelineAsyncHandler.PollForJobs
     */
    java.util.concurrent.Future<PollForJobsResult> pollForJobsAsync(PollForJobsRequest pollForJobsRequest,
            com.amazonaws.handlers.AsyncHandler<PollForJobsRequest, PollForJobsResult> asyncHandler);

    /**
     * <p>
     * Determines whether there are any third party jobs for a job worker to act on. Only used for partner actions.
     * </p>
     * <important>
     * <p>
     * When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store
     * artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts.
     * </p>
     * </important>
     * 
     * @param pollForThirdPartyJobsRequest
     *        Represents the input of a poll for third party jobs action.
     * @return A Java Future containing the result of the PollForThirdPartyJobs operation returned by the service.
     * @sample AWSCodePipelineAsync.PollForThirdPartyJobs
     */
    java.util.concurrent.Future<PollForThirdPartyJobsResult> pollForThirdPartyJobsAsync(PollForThirdPartyJobsRequest pollForThirdPartyJobsRequest);

    /**
     * <p>
     * Determines whether there are any third party jobs for a job worker to act on. Only used for partner actions.
     * </p>
     * <important>
     * <p>
     * When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store
     * artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts.
     * </p>
     * </important>
     * 
     * @param pollForThirdPartyJobsRequest
     *        Represents the input of a poll for third party jobs action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PollForThirdPartyJobs operation returned by the service.
     * @sample AWSCodePipelineAsyncHandler.PollForThirdPartyJobs
     */
    java.util.concurrent.Future<PollForThirdPartyJobsResult> pollForThirdPartyJobsAsync(PollForThirdPartyJobsRequest pollForThirdPartyJobsRequest,
            com.amazonaws.handlers.AsyncHandler<PollForThirdPartyJobsRequest, PollForThirdPartyJobsResult> asyncHandler);

    /**
     * <p>
     * Provides information to AWS CodePipeline about new revisions to a source.
     * </p>
     * 
     * @param putActionRevisionRequest
     *        Represents the input of a put action revision action.
     * @return A Java Future containing the result of the PutActionRevision operation returned by the service.
     * @sample AWSCodePipelineAsync.PutActionRevision
     */
    java.util.concurrent.Future<PutActionRevisionResult> putActionRevisionAsync(PutActionRevisionRequest putActionRevisionRequest);

    /**
     * <p>
     * Provides information to AWS CodePipeline about new revisions to a source.
     * </p>
     * 
     * @param putActionRevisionRequest
     *        Represents the input of a put action revision action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutActionRevision operation returned by the service.
     * @sample AWSCodePipelineAsyncHandler.PutActionRevision
     */
    java.util.concurrent.Future<PutActionRevisionResult> putActionRevisionAsync(PutActionRevisionRequest putActionRevisionRequest,
            com.amazonaws.handlers.AsyncHandler<PutActionRevisionRequest, PutActionRevisionResult> asyncHandler);

    /**
     * <p>
     * Provides the response to a manual approval request to AWS CodePipeline. Valid responses include Approved and
     * Rejected.
     * </p>
     * 
     * @param putApprovalResultRequest
     *        Represents the input of a put approval result action.
     * @return A Java Future containing the result of the PutApprovalResult operation returned by the service.
     * @sample AWSCodePipelineAsync.PutApprovalResult
     */
    java.util.concurrent.Future<PutApprovalResultResult> putApprovalResultAsync(PutApprovalResultRequest putApprovalResultRequest);

    /**
     * <p>
     * Provides the response to a manual approval request to AWS CodePipeline. Valid responses include Approved and
     * Rejected.
     * </p>
     * 
     * @param putApprovalResultRequest
     *        Represents the input of a put approval result action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutApprovalResult operation returned by the service.
     * @sample AWSCodePipelineAsyncHandler.PutApprovalResult
     */
    java.util.concurrent.Future<PutApprovalResultResult> putApprovalResultAsync(PutApprovalResultRequest putApprovalResultRequest,
            com.amazonaws.handlers.AsyncHandler<PutApprovalResultRequest, PutApprovalResultResult> asyncHandler);

    /**
     * <p>
     * Represents the failure of a job as returned to the pipeline by a job worker. Only used for custom actions.
     * </p>
     * 
     * @param putJobFailureResultRequest
     *        Represents the input of a put job failure result action.
     * @return A Java Future containing the result of the PutJobFailureResult operation returned by the service.
     * @sample AWSCodePipelineAsync.PutJobFailureResult
     */
    java.util.concurrent.Future<PutJobFailureResultResult> putJobFailureResultAsync(PutJobFailureResultRequest putJobFailureResultRequest);

    /**
     * <p>
     * Represents the failure of a job as returned to the pipeline by a job worker. Only used for custom actions.
     * </p>
     * 
     * @param putJobFailureResultRequest
     *        Represents the input of a put job failure result action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutJobFailureResult operation returned by the service.
     * @sample AWSCodePipelineAsyncHandler.PutJobFailureResult
     */
    java.util.concurrent.Future<PutJobFailureResultResult> putJobFailureResultAsync(PutJobFailureResultRequest putJobFailureResultRequest,
            com.amazonaws.handlers.AsyncHandler<PutJobFailureResultRequest, PutJobFailureResultResult> asyncHandler);

    /**
     * <p>
     * Represents the success of a job as returned to the pipeline by a job worker. Only used for custom actions.
     * </p>
     * 
     * @param putJobSuccessResultRequest
     *        Represents the input of a put job success result action.
     * @return A Java Future containing the result of the PutJobSuccessResult operation returned by the service.
     * @sample AWSCodePipelineAsync.PutJobSuccessResult
     */
    java.util.concurrent.Future<PutJobSuccessResultResult> putJobSuccessResultAsync(PutJobSuccessResultRequest putJobSuccessResultRequest);

    /**
     * <p>
     * Represents the success of a job as returned to the pipeline by a job worker. Only used for custom actions.
     * </p>
     * 
     * @param putJobSuccessResultRequest
     *        Represents the input of a put job success result action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutJobSuccessResult operation returned by the service.
     * @sample AWSCodePipelineAsyncHandler.PutJobSuccessResult
     */
    java.util.concurrent.Future<PutJobSuccessResultResult> putJobSuccessResultAsync(PutJobSuccessResultRequest putJobSuccessResultRequest,
            com.amazonaws.handlers.AsyncHandler<PutJobSuccessResultRequest, PutJobSuccessResultResult> asyncHandler);

    /**
     * <p>
     * Represents the failure of a third party job as returned to the pipeline by a job worker. Only used for partner
     * actions.
     * </p>
     * 
     * @param putThirdPartyJobFailureResultRequest
     *        Represents the input of a third party job failure result action.
     * @return A Java Future containing the result of the PutThirdPartyJobFailureResult operation returned by the
     *         service.
     * @sample AWSCodePipelineAsync.PutThirdPartyJobFailureResult
     */
    java.util.concurrent.Future<PutThirdPartyJobFailureResultResult> putThirdPartyJobFailureResultAsync(
            PutThirdPartyJobFailureResultRequest putThirdPartyJobFailureResultRequest);

    /**
     * <p>
     * Represents the failure of a third party job as returned to the pipeline by a job worker. Only used for partner
     * actions.
     * </p>
     * 
     * @param putThirdPartyJobFailureResultRequest
     *        Represents the input of a third party job failure result action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutThirdPartyJobFailureResult operation returned by the
     *         service.
     * @sample AWSCodePipelineAsyncHandler.PutThirdPartyJobFailureResult
     */
    java.util.concurrent.Future<PutThirdPartyJobFailureResultResult> putThirdPartyJobFailureResultAsync(
            PutThirdPartyJobFailureResultRequest putThirdPartyJobFailureResultRequest,
            com.amazonaws.handlers.AsyncHandler<PutThirdPartyJobFailureResultRequest, PutThirdPartyJobFailureResultResult> asyncHandler);

    /**
     * <p>
     * Represents the success of a third party job as returned to the pipeline by a job worker. Only used for partner
     * actions.
     * </p>
     * 
     * @param putThirdPartyJobSuccessResultRequest
     *        Represents the input of a put third party job success result action.
     * @return A Java Future containing the result of the PutThirdPartyJobSuccessResult operation returned by the
     *         service.
     * @sample AWSCodePipelineAsync.PutThirdPartyJobSuccessResult
     */
    java.util.concurrent.Future<PutThirdPartyJobSuccessResultResult> putThirdPartyJobSuccessResultAsync(
            PutThirdPartyJobSuccessResultRequest putThirdPartyJobSuccessResultRequest);

    /**
     * <p>
     * Represents the success of a third party job as returned to the pipeline by a job worker. Only used for partner
     * actions.
     * </p>
     * 
     * @param putThirdPartyJobSuccessResultRequest
     *        Represents the input of a put third party job success result action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutThirdPartyJobSuccessResult operation returned by the
     *         service.
     * @sample AWSCodePipelineAsyncHandler.PutThirdPartyJobSuccessResult
     */
    java.util.concurrent.Future<PutThirdPartyJobSuccessResultResult> putThirdPartyJobSuccessResultAsync(
            PutThirdPartyJobSuccessResultRequest putThirdPartyJobSuccessResultRequest,
            com.amazonaws.handlers.AsyncHandler<PutThirdPartyJobSuccessResultRequest, PutThirdPartyJobSuccessResultResult> asyncHandler);

    /**
     * <p>
     * Resumes the pipeline execution by retrying the last failed actions in a stage.
     * </p>
     * 
     * @param retryStageExecutionRequest
     *        Represents the input of a retry stage execution action.
     * @return A Java Future containing the result of the RetryStageExecution operation returned by the service.
     * @sample AWSCodePipelineAsync.RetryStageExecution
     */
    java.util.concurrent.Future<RetryStageExecutionResult> retryStageExecutionAsync(RetryStageExecutionRequest retryStageExecutionRequest);

    /**
     * <p>
     * Resumes the pipeline execution by retrying the last failed actions in a stage.
     * </p>
     * 
     * @param retryStageExecutionRequest
     *        Represents the input of a retry stage execution action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RetryStageExecution operation returned by the service.
     * @sample AWSCodePipelineAsyncHandler.RetryStageExecution
     */
    java.util.concurrent.Future<RetryStageExecutionResult> retryStageExecutionAsync(RetryStageExecutionRequest retryStageExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<RetryStageExecutionRequest, RetryStageExecutionResult> asyncHandler);

    /**
     * <p>
     * Starts the specified pipeline. Specifically, it begins processing the latest commit to the source location
     * specified as part of the pipeline.
     * </p>
     * 
     * @param startPipelineExecutionRequest
     *        Represents the input of a start pipeline execution action.
     * @return A Java Future containing the result of the StartPipelineExecution operation returned by the service.
     * @sample AWSCodePipelineAsync.StartPipelineExecution
     */
    java.util.concurrent.Future<StartPipelineExecutionResult> startPipelineExecutionAsync(StartPipelineExecutionRequest startPipelineExecutionRequest);

    /**
     * <p>
     * Starts the specified pipeline. Specifically, it begins processing the latest commit to the source location
     * specified as part of the pipeline.
     * </p>
     * 
     * @param startPipelineExecutionRequest
     *        Represents the input of a start pipeline execution action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartPipelineExecution operation returned by the service.
     * @sample AWSCodePipelineAsyncHandler.StartPipelineExecution
     */
    java.util.concurrent.Future<StartPipelineExecutionResult> startPipelineExecutionAsync(StartPipelineExecutionRequest startPipelineExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<StartPipelineExecutionRequest, StartPipelineExecutionResult> asyncHandler);

    /**
     * <p>
     * Updates a specified pipeline with edits or changes to its structure. Use a JSON file with the pipeline structure
     * in conjunction with UpdatePipeline to provide the full structure of the pipeline. Updating the pipeline increases
     * the version number of the pipeline by 1.
     * </p>
     * 
     * @param updatePipelineRequest
     *        Represents the input of an update pipeline action.
     * @return A Java Future containing the result of the UpdatePipeline operation returned by the service.
     * @sample AWSCodePipelineAsync.UpdatePipeline
     */
    java.util.concurrent.Future<UpdatePipelineResult> updatePipelineAsync(UpdatePipelineRequest updatePipelineRequest);

    /**
     * <p>
     * Updates a specified pipeline with edits or changes to its structure. Use a JSON file with the pipeline structure
     * in conjunction with UpdatePipeline to provide the full structure of the pipeline. Updating the pipeline increases
     * the version number of the pipeline by 1.
     * </p>
     * 
     * @param updatePipelineRequest
     *        Represents the input of an update pipeline action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePipeline operation returned by the service.
     * @sample AWSCodePipelineAsyncHandler.UpdatePipeline
     */
    java.util.concurrent.Future<UpdatePipelineResult> updatePipelineAsync(UpdatePipelineRequest updatePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePipelineRequest, UpdatePipelineResult> asyncHandler);

}
