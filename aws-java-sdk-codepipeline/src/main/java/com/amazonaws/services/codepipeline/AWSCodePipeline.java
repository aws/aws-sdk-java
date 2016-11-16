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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.codepipeline.model.*;

/**
 * Interface for accessing CodePipeline.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.codepipeline.AbstractAWSCodePipeline} instead.
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
public interface AWSCodePipeline {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "codepipeline";

    /**
     * Overrides the default endpoint for this client ("https://codepipeline.us-east-1.amazonaws.com"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "codepipeline.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://codepipeline.us-east-1.amazonaws.com"). If the protocol is not specified here, the default
     * protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "codepipeline.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://codepipeline.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSCodePipeline#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
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
     */
    void setRegion(Region region);

    /**
     * <p>
     * Returns information about a specified job and whether that job has been received by the job worker. Only used for
     * custom actions.
     * </p>
     * 
     * @param acknowledgeJobRequest
     *        Represents the input of an acknowledge job action.
     * @return Result of the AcknowledgeJob operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws InvalidNonceException
     *         The specified nonce was specified in an invalid format.
     * @throws JobNotFoundException
     *         The specified job was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.AcknowledgeJob
     */
    AcknowledgeJobResult acknowledgeJob(AcknowledgeJobRequest acknowledgeJobRequest);

    /**
     * <p>
     * Confirms a job worker has received the specified job. Only used for partner actions.
     * </p>
     * 
     * @param acknowledgeThirdPartyJobRequest
     *        Represents the input of an acknowledge third party job action.
     * @return Result of the AcknowledgeThirdPartyJob operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws InvalidNonceException
     *         The specified nonce was specified in an invalid format.
     * @throws JobNotFoundException
     *         The specified job was specified in an invalid format or cannot be found.
     * @throws InvalidClientTokenException
     *         The client token was specified in an invalid format
     * @sample AWSCodePipeline.AcknowledgeThirdPartyJob
     */
    AcknowledgeThirdPartyJobResult acknowledgeThirdPartyJob(AcknowledgeThirdPartyJobRequest acknowledgeThirdPartyJobRequest);

    /**
     * <p>
     * Creates a new custom action that can be used in all pipelines associated with the AWS account. Only used for
     * custom actions.
     * </p>
     * 
     * @param createCustomActionTypeRequest
     *        Represents the input of a create custom action operation.
     * @return Result of the CreateCustomActionType operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws LimitExceededException
     *         The number of pipelines associated with the AWS account has exceeded the limit allowed for the account.
     * @sample AWSCodePipeline.CreateCustomActionType
     */
    CreateCustomActionTypeResult createCustomActionType(CreateCustomActionTypeRequest createCustomActionTypeRequest);

    /**
     * <p>
     * Creates a pipeline.
     * </p>
     * 
     * @param createPipelineRequest
     *        Represents the input of a create pipeline action.
     * @return Result of the CreatePipeline operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNameInUseException
     *         The specified pipeline name is already in use.
     * @throws InvalidStageDeclarationException
     *         The specified stage declaration was specified in an invalid format.
     * @throws InvalidActionDeclarationException
     *         The specified action declaration was specified in an invalid format.
     * @throws InvalidBlockerDeclarationException
     *         Reserved for future use.
     * @throws InvalidStructureException
     *         The specified structure was specified in an invalid format.
     * @throws LimitExceededException
     *         The number of pipelines associated with the AWS account has exceeded the limit allowed for the account.
     * @sample AWSCodePipeline.CreatePipeline
     */
    CreatePipelineResult createPipeline(CreatePipelineRequest createPipelineRequest);

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
     * @return Result of the DeleteCustomActionType operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @sample AWSCodePipeline.DeleteCustomActionType
     */
    DeleteCustomActionTypeResult deleteCustomActionType(DeleteCustomActionTypeRequest deleteCustomActionTypeRequest);

    /**
     * <p>
     * Deletes the specified pipeline.
     * </p>
     * 
     * @param deletePipelineRequest
     *        Represents the input of a delete pipeline action.
     * @return Result of the DeletePipeline operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @sample AWSCodePipeline.DeletePipeline
     */
    DeletePipelineResult deletePipeline(DeletePipelineRequest deletePipelineRequest);

    /**
     * <p>
     * Prevents artifacts in a pipeline from transitioning to the next stage in the pipeline.
     * </p>
     * 
     * @param disableStageTransitionRequest
     *        Represents the input of a disable stage transition input action.
     * @return Result of the DisableStageTransition operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or cannot be found.
     * @throws StageNotFoundException
     *         The specified stage was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.DisableStageTransition
     */
    DisableStageTransitionResult disableStageTransition(DisableStageTransitionRequest disableStageTransitionRequest);

    /**
     * <p>
     * Enables artifacts in a pipeline to transition to a stage in a pipeline.
     * </p>
     * 
     * @param enableStageTransitionRequest
     *        Represents the input of an enable stage transition action.
     * @return Result of the EnableStageTransition operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or cannot be found.
     * @throws StageNotFoundException
     *         The specified stage was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.EnableStageTransition
     */
    EnableStageTransitionResult enableStageTransition(EnableStageTransitionRequest enableStageTransitionRequest);

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
     * @return Result of the GetJobDetails operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws JobNotFoundException
     *         The specified job was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.GetJobDetails
     */
    GetJobDetailsResult getJobDetails(GetJobDetailsRequest getJobDetailsRequest);

    /**
     * <p>
     * Returns the metadata, structure, stages, and actions of a pipeline. Can be used to return the entire structure of
     * a pipeline in JSON format, which can then be modified and used to update the pipeline structure with
     * <a>UpdatePipeline</a>.
     * </p>
     * 
     * @param getPipelineRequest
     *        Represents the input of a get pipeline action.
     * @return Result of the GetPipeline operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or cannot be found.
     * @throws PipelineVersionNotFoundException
     *         The specified pipeline version was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.GetPipeline
     */
    GetPipelineResult getPipeline(GetPipelineRequest getPipelineRequest);

    /**
     * <p>
     * Returns information about an execution of a pipeline, including details about artifacts, the pipeline execution
     * ID, and the name, version, and status of the pipeline.
     * </p>
     * 
     * @param getPipelineExecutionRequest
     *        Represents the input of a get pipeline execution action.
     * @return Result of the GetPipelineExecution operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or cannot be found.
     * @throws PipelineExecutionNotFoundException
     *         The pipeline execution was specified in an invalid format or cannot be found, or an execution ID does not
     *         belong to the specified pipeline.
     * @sample AWSCodePipeline.GetPipelineExecution
     */
    GetPipelineExecutionResult getPipelineExecution(GetPipelineExecutionRequest getPipelineExecutionRequest);

    /**
     * <p>
     * Returns information about the state of a pipeline, including the stages and actions.
     * </p>
     * 
     * @param getPipelineStateRequest
     *        Represents the input of a get pipeline state action.
     * @return Result of the GetPipelineState operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.GetPipelineState
     */
    GetPipelineStateResult getPipelineState(GetPipelineStateRequest getPipelineStateRequest);

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
     * @return Result of the GetThirdPartyJobDetails operation returned by the service.
     * @throws JobNotFoundException
     *         The specified job was specified in an invalid format or cannot be found.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws InvalidClientTokenException
     *         The client token was specified in an invalid format
     * @throws InvalidJobException
     *         The specified job was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.GetThirdPartyJobDetails
     */
    GetThirdPartyJobDetailsResult getThirdPartyJobDetails(GetThirdPartyJobDetailsRequest getThirdPartyJobDetailsRequest);

    /**
     * <p>
     * Gets a summary of all AWS CodePipeline action types associated with your account.
     * </p>
     * 
     * @param listActionTypesRequest
     *        Represents the input of a list action types action.
     * @return Result of the ListActionTypes operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format. Make sure that the next token you provided is the
     *         token returned by a previous call.
     * @sample AWSCodePipeline.ListActionTypes
     */
    ListActionTypesResult listActionTypes(ListActionTypesRequest listActionTypesRequest);

    /**
     * <p>
     * Gets a summary of all of the pipelines associated with your account.
     * </p>
     * 
     * @param listPipelinesRequest
     *        Represents the input of a list pipelines action.
     * @return Result of the ListPipelines operation returned by the service.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format. Make sure that the next token you provided is the
     *         token returned by a previous call.
     * @sample AWSCodePipeline.ListPipelines
     */
    ListPipelinesResult listPipelines(ListPipelinesRequest listPipelinesRequest);

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
     * @return Result of the PollForJobs operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws ActionTypeNotFoundException
     *         The specified action type cannot be found.
     * @sample AWSCodePipeline.PollForJobs
     */
    PollForJobsResult pollForJobs(PollForJobsRequest pollForJobsRequest);

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
     * @return Result of the PollForThirdPartyJobs operation returned by the service.
     * @throws ActionTypeNotFoundException
     *         The specified action type cannot be found.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @sample AWSCodePipeline.PollForThirdPartyJobs
     */
    PollForThirdPartyJobsResult pollForThirdPartyJobs(PollForThirdPartyJobsRequest pollForThirdPartyJobsRequest);

    /**
     * <p>
     * Provides information to AWS CodePipeline about new revisions to a source.
     * </p>
     * 
     * @param putActionRevisionRequest
     *        Represents the input of a put action revision action.
     * @return Result of the PutActionRevision operation returned by the service.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or cannot be found.
     * @throws StageNotFoundException
     *         The specified stage was specified in an invalid format or cannot be found.
     * @throws ActionNotFoundException
     *         The specified action cannot be found.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @sample AWSCodePipeline.PutActionRevision
     */
    PutActionRevisionResult putActionRevision(PutActionRevisionRequest putActionRevisionRequest);

    /**
     * <p>
     * Provides the response to a manual approval request to AWS CodePipeline. Valid responses include Approved and
     * Rejected.
     * </p>
     * 
     * @param putApprovalResultRequest
     *        Represents the input of a put approval result action.
     * @return Result of the PutApprovalResult operation returned by the service.
     * @throws InvalidApprovalTokenException
     *         The approval request already received a response or has expired.
     * @throws ApprovalAlreadyCompletedException
     *         The approval action has already been approved or rejected.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or cannot be found.
     * @throws StageNotFoundException
     *         The specified stage was specified in an invalid format or cannot be found.
     * @throws ActionNotFoundException
     *         The specified action cannot be found.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @sample AWSCodePipeline.PutApprovalResult
     */
    PutApprovalResultResult putApprovalResult(PutApprovalResultRequest putApprovalResultRequest);

    /**
     * <p>
     * Represents the failure of a job as returned to the pipeline by a job worker. Only used for custom actions.
     * </p>
     * 
     * @param putJobFailureResultRequest
     *        Represents the input of a put job failure result action.
     * @return Result of the PutJobFailureResult operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws JobNotFoundException
     *         The specified job was specified in an invalid format or cannot be found.
     * @throws InvalidJobStateException
     *         The specified job state was specified in an invalid format.
     * @sample AWSCodePipeline.PutJobFailureResult
     */
    PutJobFailureResultResult putJobFailureResult(PutJobFailureResultRequest putJobFailureResultRequest);

    /**
     * <p>
     * Represents the success of a job as returned to the pipeline by a job worker. Only used for custom actions.
     * </p>
     * 
     * @param putJobSuccessResultRequest
     *        Represents the input of a put job success result action.
     * @return Result of the PutJobSuccessResult operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws JobNotFoundException
     *         The specified job was specified in an invalid format or cannot be found.
     * @throws InvalidJobStateException
     *         The specified job state was specified in an invalid format.
     * @sample AWSCodePipeline.PutJobSuccessResult
     */
    PutJobSuccessResultResult putJobSuccessResult(PutJobSuccessResultRequest putJobSuccessResultRequest);

    /**
     * <p>
     * Represents the failure of a third party job as returned to the pipeline by a job worker. Only used for partner
     * actions.
     * </p>
     * 
     * @param putThirdPartyJobFailureResultRequest
     *        Represents the input of a third party job failure result action.
     * @return Result of the PutThirdPartyJobFailureResult operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws JobNotFoundException
     *         The specified job was specified in an invalid format or cannot be found.
     * @throws InvalidJobStateException
     *         The specified job state was specified in an invalid format.
     * @throws InvalidClientTokenException
     *         The client token was specified in an invalid format
     * @sample AWSCodePipeline.PutThirdPartyJobFailureResult
     */
    PutThirdPartyJobFailureResultResult putThirdPartyJobFailureResult(PutThirdPartyJobFailureResultRequest putThirdPartyJobFailureResultRequest);

    /**
     * <p>
     * Represents the success of a third party job as returned to the pipeline by a job worker. Only used for partner
     * actions.
     * </p>
     * 
     * @param putThirdPartyJobSuccessResultRequest
     *        Represents the input of a put third party job success result action.
     * @return Result of the PutThirdPartyJobSuccessResult operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws JobNotFoundException
     *         The specified job was specified in an invalid format or cannot be found.
     * @throws InvalidJobStateException
     *         The specified job state was specified in an invalid format.
     * @throws InvalidClientTokenException
     *         The client token was specified in an invalid format
     * @sample AWSCodePipeline.PutThirdPartyJobSuccessResult
     */
    PutThirdPartyJobSuccessResultResult putThirdPartyJobSuccessResult(PutThirdPartyJobSuccessResultRequest putThirdPartyJobSuccessResultRequest);

    /**
     * <p>
     * Resumes the pipeline execution by retrying the last failed actions in a stage.
     * </p>
     * 
     * @param retryStageExecutionRequest
     *        Represents the input of a retry stage execution action.
     * @return Result of the RetryStageExecution operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or cannot be found.
     * @throws StageNotFoundException
     *         The specified stage was specified in an invalid format or cannot be found.
     * @throws StageNotRetryableException
     *         The specified stage can't be retried because the pipeline structure or stage state changed after the
     *         stage was not completed; the stage contains no failed actions; one or more actions are still in progress;
     *         or another retry attempt is already in progress.
     * @throws NotLatestPipelineExecutionException
     *         The stage has failed in a later run of the pipeline and the pipelineExecutionId associated with the
     *         request is out of date.
     * @sample AWSCodePipeline.RetryStageExecution
     */
    RetryStageExecutionResult retryStageExecution(RetryStageExecutionRequest retryStageExecutionRequest);

    /**
     * <p>
     * Starts the specified pipeline. Specifically, it begins processing the latest commit to the source location
     * specified as part of the pipeline.
     * </p>
     * 
     * @param startPipelineExecutionRequest
     *        Represents the input of a start pipeline execution action.
     * @return Result of the StartPipelineExecution operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.StartPipelineExecution
     */
    StartPipelineExecutionResult startPipelineExecution(StartPipelineExecutionRequest startPipelineExecutionRequest);

    /**
     * <p>
     * Updates a specified pipeline with edits or changes to its structure. Use a JSON file with the pipeline structure
     * in conjunction with UpdatePipeline to provide the full structure of the pipeline. Updating the pipeline increases
     * the version number of the pipeline by 1.
     * </p>
     * 
     * @param updatePipelineRequest
     *        Represents the input of an update pipeline action.
     * @return Result of the UpdatePipeline operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws InvalidStageDeclarationException
     *         The specified stage declaration was specified in an invalid format.
     * @throws InvalidActionDeclarationException
     *         The specified action declaration was specified in an invalid format.
     * @throws InvalidBlockerDeclarationException
     *         Reserved for future use.
     * @throws InvalidStructureException
     *         The specified structure was specified in an invalid format.
     * @sample AWSCodePipeline.UpdatePipeline
     */
    UpdatePipelineResult updatePipeline(UpdatePipelineRequest updatePipelineRequest);

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
