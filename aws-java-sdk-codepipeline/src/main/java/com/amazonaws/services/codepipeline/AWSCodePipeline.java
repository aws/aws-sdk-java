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
package com.amazonaws.services.codepipeline;

import javax.annotation.Generated;

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
 * see the <a href="https://docs.aws.amazon.com/codepipeline/latest/userguide/welcome.html">AWS CodePipeline User
 * Guide</a>.
 * </p>
 * <p>
 * You can use the AWS CodePipeline API to work with pipelines, stages, actions, and transitions, as described below.
 * </p>
 * <p>
 * <i>Pipelines</i> are models of automated release processes. Each pipeline is uniquely named, and consists of stages,
 * actions, and transitions.
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
 * <a>GetPipeline</a>, which returns information about the pipeline structure and pipeline metadata, including the
 * pipeline Amazon Resource Name (ARN).
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
 * <a>ListPipelineExecutions</a>, which gets a summary of the most recent executions for a pipeline.
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
 * Pipelines include <i>stages</i>. Each stage contains one or more actions that must complete before the next stage
 * begins. A stage will result in success or failure. If a stage fails, then the pipeline stops at that stage and will
 * remain stopped until either a new version of an artifact appears in the source location, or a user takes action to
 * re-run the most recent artifact through the pipeline. You can call <a>GetPipelineState</a>, which displays the status
 * of a pipeline, including the status of stages in the pipeline, or <a>GetPipeline</a>, which returns the entire
 * structure of the pipeline, including the stages of that pipeline. For more information about the structure of stages
 * and actions, also refer to the <a
 * href="https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-structure.html">AWS CodePipeline Pipeline
 * Structure Reference</a>.
 * </p>
 * <p>
 * Pipeline stages include <i>actions</i>, which are categorized into categories such as source or build actions
 * performed within a stage of a pipeline. For example, you can use a source action to import artifacts into a pipeline
 * from a source such as Amazon S3. Like stages, you do not work with actions directly in most cases, but you do define
 * and interact with actions when working with pipeline operations such as <a>CreatePipeline</a> and
 * <a>GetPipelineState</a>. Valid action categories are:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Source
 * </p>
 * </li>
 * <li>
 * <p>
 * Build
 * </p>
 * </li>
 * <li>
 * <p>
 * Test
 * </p>
 * </li>
 * <li>
 * <p>
 * Deploy
 * </p>
 * </li>
 * <li>
 * <p>
 * Approval
 * </p>
 * </li>
 * <li>
 * <p>
 * Invoke
 * </p>
 * </li>
 * </ul>
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
@Generated("com.amazonaws:aws-java-sdk-code-generator")
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
     *        The endpoint (ex: "codepipeline.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://codepipeline.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
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
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Returns information about a specified job and whether that job has been received by the job worker. Only used for
     * custom actions.
     * </p>
     * 
     * @param acknowledgeJobRequest
     *        Represents the input of an AcknowledgeJob action.
     * @return Result of the AcknowledgeJob operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws InvalidNonceException
     *         The specified nonce was specified in an invalid format.
     * @throws JobNotFoundException
     *         The specified job was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.AcknowledgeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/AcknowledgeJob" target="_top">AWS
     *      API Documentation</a>
     */
    AcknowledgeJobResult acknowledgeJob(AcknowledgeJobRequest acknowledgeJobRequest);

    /**
     * <p>
     * Confirms a job worker has received the specified job. Only used for partner actions.
     * </p>
     * 
     * @param acknowledgeThirdPartyJobRequest
     *        Represents the input of an AcknowledgeThirdPartyJob action.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/AcknowledgeThirdPartyJob"
     *      target="_top">AWS API Documentation</a>
     */
    AcknowledgeThirdPartyJobResult acknowledgeThirdPartyJob(AcknowledgeThirdPartyJobRequest acknowledgeThirdPartyJobRequest);

    /**
     * <p>
     * Creates a new custom action that can be used in all pipelines associated with the AWS account. Only used for
     * custom actions.
     * </p>
     * 
     * @param createCustomActionTypeRequest
     *        Represents the input of a CreateCustomActionType operation.
     * @return Result of the CreateCustomActionType operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws LimitExceededException
     *         The number of pipelines associated with the AWS account has exceeded the limit allowed for the account.
     * @sample AWSCodePipeline.CreateCustomActionType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/CreateCustomActionType"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCustomActionTypeResult createCustomActionType(CreateCustomActionTypeRequest createCustomActionTypeRequest);

    /**
     * <p>
     * Creates a pipeline.
     * </p>
     * 
     * @param createPipelineRequest
     *        Represents the input of a CreatePipeline action.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/CreatePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    CreatePipelineResult createPipeline(CreatePipelineRequest createPipelineRequest);

    /**
     * <p>
     * Marks a custom action as deleted. PollForJobs for the custom action will fail after the action is marked for
     * deletion. Only used for custom actions.
     * </p>
     * <important>
     * <p>
     * To re-create a custom action after it has been deleted you must use a string in the version field that has never
     * been used before. This string can be an incremented version number, for example. To restore a deleted custom
     * action, use a JSON file that is identical to the deleted action, including the original string in the version
     * field.
     * </p>
     * </important>
     * 
     * @param deleteCustomActionTypeRequest
     *        Represents the input of a DeleteCustomActionType operation. The custom action will be marked as deleted.
     * @return Result of the DeleteCustomActionType operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @sample AWSCodePipeline.DeleteCustomActionType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/DeleteCustomActionType"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCustomActionTypeResult deleteCustomActionType(DeleteCustomActionTypeRequest deleteCustomActionTypeRequest);

    /**
     * <p>
     * Deletes the specified pipeline.
     * </p>
     * 
     * @param deletePipelineRequest
     *        Represents the input of a DeletePipeline action.
     * @return Result of the DeletePipeline operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @sample AWSCodePipeline.DeletePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/DeletePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    DeletePipelineResult deletePipeline(DeletePipelineRequest deletePipelineRequest);

    /**
     * <p>
     * Deletes a previously created webhook by name. Deleting the webhook stops AWS CodePipeline from starting a
     * pipeline every time an external event occurs. The API will return successfully when trying to delete a webhook
     * that is already deleted. If a deleted webhook is re-created by calling PutWebhook with the same name, it will
     * have a different URL.
     * </p>
     * 
     * @param deleteWebhookRequest
     * @return Result of the DeleteWebhook operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @sample AWSCodePipeline.DeleteWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/DeleteWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteWebhookResult deleteWebhook(DeleteWebhookRequest deleteWebhookRequest);

    /**
     * <p>
     * Removes the connection between the webhook that was created by CodePipeline and the external tool with events to
     * be detected. Currently only supported for webhooks that target an action type of GitHub.
     * </p>
     * 
     * @param deregisterWebhookWithThirdPartyRequest
     * @return Result of the DeregisterWebhookWithThirdParty operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws WebhookNotFoundException
     *         The specified webhook was entered in an invalid format or cannot be found.
     * @sample AWSCodePipeline.DeregisterWebhookWithThirdParty
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/DeregisterWebhookWithThirdParty"
     *      target="_top">AWS API Documentation</a>
     */
    DeregisterWebhookWithThirdPartyResult deregisterWebhookWithThirdParty(DeregisterWebhookWithThirdPartyRequest deregisterWebhookWithThirdPartyRequest);

    /**
     * <p>
     * Prevents artifacts in a pipeline from transitioning to the next stage in the pipeline.
     * </p>
     * 
     * @param disableStageTransitionRequest
     *        Represents the input of a DisableStageTransition action.
     * @return Result of the DisableStageTransition operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or cannot be found.
     * @throws StageNotFoundException
     *         The specified stage was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.DisableStageTransition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/DisableStageTransition"
     *      target="_top">AWS API Documentation</a>
     */
    DisableStageTransitionResult disableStageTransition(DisableStageTransitionRequest disableStageTransitionRequest);

    /**
     * <p>
     * Enables artifacts in a pipeline to transition to a stage in a pipeline.
     * </p>
     * 
     * @param enableStageTransitionRequest
     *        Represents the input of an EnableStageTransition action.
     * @return Result of the EnableStageTransition operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or cannot be found.
     * @throws StageNotFoundException
     *         The specified stage was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.EnableStageTransition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/EnableStageTransition"
     *      target="_top">AWS API Documentation</a>
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
     *        Represents the input of a GetJobDetails action.
     * @return Result of the GetJobDetails operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws JobNotFoundException
     *         The specified job was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.GetJobDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/GetJobDetails" target="_top">AWS API
     *      Documentation</a>
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
     *        Represents the input of a GetPipeline action.
     * @return Result of the GetPipeline operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or cannot be found.
     * @throws PipelineVersionNotFoundException
     *         The specified pipeline version was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.GetPipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/GetPipeline" target="_top">AWS API
     *      Documentation</a>
     */
    GetPipelineResult getPipeline(GetPipelineRequest getPipelineRequest);

    /**
     * <p>
     * Returns information about an execution of a pipeline, including details about artifacts, the pipeline execution
     * ID, and the name, version, and status of the pipeline.
     * </p>
     * 
     * @param getPipelineExecutionRequest
     *        Represents the input of a GetPipelineExecution action.
     * @return Result of the GetPipelineExecution operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or cannot be found.
     * @throws PipelineExecutionNotFoundException
     *         The pipeline execution was specified in an invalid format or cannot be found, or an execution ID does not
     *         belong to the specified pipeline.
     * @sample AWSCodePipeline.GetPipelineExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/GetPipelineExecution"
     *      target="_top">AWS API Documentation</a>
     */
    GetPipelineExecutionResult getPipelineExecution(GetPipelineExecutionRequest getPipelineExecutionRequest);

    /**
     * <p>
     * Returns information about the state of a pipeline, including the stages and actions.
     * </p>
     * <note>
     * <p>
     * Values returned in the revisionId and revisionUrl fields indicate the source revision information, such as the
     * commit ID, for the current state.
     * </p>
     * </note>
     * 
     * @param getPipelineStateRequest
     *        Represents the input of a GetPipelineState action.
     * @return Result of the GetPipelineState operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.GetPipelineState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/GetPipelineState" target="_top">AWS
     *      API Documentation</a>
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
     *        Represents the input of a GetThirdPartyJobDetails action.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/GetThirdPartyJobDetails"
     *      target="_top">AWS API Documentation</a>
     */
    GetThirdPartyJobDetailsResult getThirdPartyJobDetails(GetThirdPartyJobDetailsRequest getThirdPartyJobDetailsRequest);

    /**
     * <p>
     * Lists the action executions that have occurred in a pipeline.
     * </p>
     * 
     * @param listActionExecutionsRequest
     * @return Result of the ListActionExecutions operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or cannot be found.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format. Make sure that the next token you provided is the
     *         token returned by a previous call.
     * @throws PipelineExecutionNotFoundException
     *         The pipeline execution was specified in an invalid format or cannot be found, or an execution ID does not
     *         belong to the specified pipeline.
     * @sample AWSCodePipeline.ListActionExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ListActionExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    ListActionExecutionsResult listActionExecutions(ListActionExecutionsRequest listActionExecutionsRequest);

    /**
     * <p>
     * Gets a summary of all AWS CodePipeline action types associated with your account.
     * </p>
     * 
     * @param listActionTypesRequest
     *        Represents the input of a ListActionTypes action.
     * @return Result of the ListActionTypes operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format. Make sure that the next token you provided is the
     *         token returned by a previous call.
     * @sample AWSCodePipeline.ListActionTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ListActionTypes" target="_top">AWS
     *      API Documentation</a>
     */
    ListActionTypesResult listActionTypes(ListActionTypesRequest listActionTypesRequest);

    /**
     * <p>
     * Gets a summary of the most recent executions for a pipeline.
     * </p>
     * 
     * @param listPipelineExecutionsRequest
     *        Represents the input of a ListPipelineExecutions action.
     * @return Result of the ListPipelineExecutions operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or cannot be found.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format. Make sure that the next token you provided is the
     *         token returned by a previous call.
     * @sample AWSCodePipeline.ListPipelineExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ListPipelineExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    ListPipelineExecutionsResult listPipelineExecutions(ListPipelineExecutionsRequest listPipelineExecutionsRequest);

    /**
     * <p>
     * Gets a summary of all of the pipelines associated with your account.
     * </p>
     * 
     * @param listPipelinesRequest
     *        Represents the input of a ListPipelines action.
     * @return Result of the ListPipelines operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format. Make sure that the next token you provided is the
     *         token returned by a previous call.
     * @sample AWSCodePipeline.ListPipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ListPipelines" target="_top">AWS API
     *      Documentation</a>
     */
    ListPipelinesResult listPipelines(ListPipelinesRequest listPipelinesRequest);

    /**
     * <p>
     * Gets a listing of all the webhooks in this region for this account. The output lists all webhooks and includes
     * the webhook URL and ARN, as well the configuration for each webhook.
     * </p>
     * 
     * @param listWebhooksRequest
     * @return Result of the ListWebhooks operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws InvalidNextTokenException
     *         The next token was specified in an invalid format. Make sure that the next token you provided is the
     *         token returned by a previous call.
     * @sample AWSCodePipeline.ListWebhooks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ListWebhooks" target="_top">AWS API
     *      Documentation</a>
     */
    ListWebhooksResult listWebhooks(ListWebhooksRequest listWebhooksRequest);

    /**
     * <p>
     * Returns information about any jobs for AWS CodePipeline to act upon. PollForJobs is only valid for action types
     * with "Custom" in the owner field. If the action type contains "AWS" or "ThirdParty" in the owner field, the
     * PollForJobs action returns an error.
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
     *        Represents the input of a PollForJobs action.
     * @return Result of the PollForJobs operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws ActionTypeNotFoundException
     *         The specified action type cannot be found.
     * @sample AWSCodePipeline.PollForJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PollForJobs" target="_top">AWS API
     *      Documentation</a>
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
     *        Represents the input of a PollForThirdPartyJobs action.
     * @return Result of the PollForThirdPartyJobs operation returned by the service.
     * @throws ActionTypeNotFoundException
     *         The specified action type cannot be found.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @sample AWSCodePipeline.PollForThirdPartyJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PollForThirdPartyJobs"
     *      target="_top">AWS API Documentation</a>
     */
    PollForThirdPartyJobsResult pollForThirdPartyJobs(PollForThirdPartyJobsRequest pollForThirdPartyJobsRequest);

    /**
     * <p>
     * Provides information to AWS CodePipeline about new revisions to a source.
     * </p>
     * 
     * @param putActionRevisionRequest
     *        Represents the input of a PutActionRevision action.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PutActionRevision" target="_top">AWS
     *      API Documentation</a>
     */
    PutActionRevisionResult putActionRevision(PutActionRevisionRequest putActionRevisionRequest);

    /**
     * <p>
     * Provides the response to a manual approval request to AWS CodePipeline. Valid responses include Approved and
     * Rejected.
     * </p>
     * 
     * @param putApprovalResultRequest
     *        Represents the input of a PutApprovalResult action.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PutApprovalResult" target="_top">AWS
     *      API Documentation</a>
     */
    PutApprovalResultResult putApprovalResult(PutApprovalResultRequest putApprovalResultRequest);

    /**
     * <p>
     * Represents the failure of a job as returned to the pipeline by a job worker. Only used for custom actions.
     * </p>
     * 
     * @param putJobFailureResultRequest
     *        Represents the input of a PutJobFailureResult action.
     * @return Result of the PutJobFailureResult operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws JobNotFoundException
     *         The specified job was specified in an invalid format or cannot be found.
     * @throws InvalidJobStateException
     *         The specified job state was specified in an invalid format.
     * @sample AWSCodePipeline.PutJobFailureResult
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PutJobFailureResult"
     *      target="_top">AWS API Documentation</a>
     */
    PutJobFailureResultResult putJobFailureResult(PutJobFailureResultRequest putJobFailureResultRequest);

    /**
     * <p>
     * Represents the success of a job as returned to the pipeline by a job worker. Only used for custom actions.
     * </p>
     * 
     * @param putJobSuccessResultRequest
     *        Represents the input of a PutJobSuccessResult action.
     * @return Result of the PutJobSuccessResult operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws JobNotFoundException
     *         The specified job was specified in an invalid format or cannot be found.
     * @throws InvalidJobStateException
     *         The specified job state was specified in an invalid format.
     * @sample AWSCodePipeline.PutJobSuccessResult
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PutJobSuccessResult"
     *      target="_top">AWS API Documentation</a>
     */
    PutJobSuccessResultResult putJobSuccessResult(PutJobSuccessResultRequest putJobSuccessResultRequest);

    /**
     * <p>
     * Represents the failure of a third party job as returned to the pipeline by a job worker. Only used for partner
     * actions.
     * </p>
     * 
     * @param putThirdPartyJobFailureResultRequest
     *        Represents the input of a PutThirdPartyJobFailureResult action.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PutThirdPartyJobFailureResult"
     *      target="_top">AWS API Documentation</a>
     */
    PutThirdPartyJobFailureResultResult putThirdPartyJobFailureResult(PutThirdPartyJobFailureResultRequest putThirdPartyJobFailureResultRequest);

    /**
     * <p>
     * Represents the success of a third party job as returned to the pipeline by a job worker. Only used for partner
     * actions.
     * </p>
     * 
     * @param putThirdPartyJobSuccessResultRequest
     *        Represents the input of a PutThirdPartyJobSuccessResult action.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PutThirdPartyJobSuccessResult"
     *      target="_top">AWS API Documentation</a>
     */
    PutThirdPartyJobSuccessResultResult putThirdPartyJobSuccessResult(PutThirdPartyJobSuccessResultRequest putThirdPartyJobSuccessResultRequest);

    /**
     * <p>
     * Defines a webhook and returns a unique webhook URL generated by CodePipeline. This URL can be supplied to third
     * party source hosting providers to call every time there's a code change. When CodePipeline receives a POST
     * request on this URL, the pipeline defined in the webhook is started as long as the POST request satisfied the
     * authentication and filtering requirements supplied when defining the webhook. RegisterWebhookWithThirdParty and
     * DeregisterWebhookWithThirdParty APIs can be used to automatically configure supported third parties to call the
     * generated webhook URL.
     * </p>
     * 
     * @param putWebhookRequest
     * @return Result of the PutWebhook operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws LimitExceededException
     *         The number of pipelines associated with the AWS account has exceeded the limit allowed for the account.
     * @throws InvalidWebhookFilterPatternException
     *         The specified event filter rule is in an invalid format.
     * @throws InvalidWebhookAuthenticationParametersException
     *         The specified authentication type is in an invalid format.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.PutWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PutWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    PutWebhookResult putWebhook(PutWebhookRequest putWebhookRequest);

    /**
     * <p>
     * Configures a connection between the webhook that was created and the external tool with events to be detected.
     * </p>
     * 
     * @param registerWebhookWithThirdPartyRequest
     * @return Result of the RegisterWebhookWithThirdParty operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws WebhookNotFoundException
     *         The specified webhook was entered in an invalid format or cannot be found.
     * @sample AWSCodePipeline.RegisterWebhookWithThirdParty
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/RegisterWebhookWithThirdParty"
     *      target="_top">AWS API Documentation</a>
     */
    RegisterWebhookWithThirdPartyResult registerWebhookWithThirdParty(RegisterWebhookWithThirdPartyRequest registerWebhookWithThirdPartyRequest);

    /**
     * <p>
     * Resumes the pipeline execution by retrying the last failed actions in a stage.
     * </p>
     * 
     * @param retryStageExecutionRequest
     *        Represents the input of a RetryStageExecution action.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/RetryStageExecution"
     *      target="_top">AWS API Documentation</a>
     */
    RetryStageExecutionResult retryStageExecution(RetryStageExecutionRequest retryStageExecutionRequest);

    /**
     * <p>
     * Starts the specified pipeline. Specifically, it begins processing the latest commit to the source location
     * specified as part of the pipeline.
     * </p>
     * 
     * @param startPipelineExecutionRequest
     *        Represents the input of a StartPipelineExecution action.
     * @return Result of the StartPipelineExecution operation returned by the service.
     * @throws ValidationException
     *         The validation was specified in an invalid format.
     * @throws PipelineNotFoundException
     *         The specified pipeline was specified in an invalid format or cannot be found.
     * @sample AWSCodePipeline.StartPipelineExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/StartPipelineExecution"
     *      target="_top">AWS API Documentation</a>
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
     *        Represents the input of an UpdatePipeline action.
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
     * @throws LimitExceededException
     *         The number of pipelines associated with the AWS account has exceeded the limit allowed for the account.
     * @sample AWSCodePipeline.UpdatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/UpdatePipeline" target="_top">AWS
     *      API Documentation</a>
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
