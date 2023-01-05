/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.migrationhuborchestrator;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.migrationhuborchestrator.model.*;

/**
 * Interface for accessing AWS Migration Hub Orchestrator.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.migrationhuborchestrator.AbstractAWSMigrationHubOrchestrator} instead.
 * </p>
 * <p>
 * <p>
 * This API reference provides descriptions, syntax, and other details about each of the actions and data types for AWS
 * Migration Hub Orchestrator. he topic for each action shows the API request parameters and the response.
 * Alternatively, you can use one of the AWS SDKs to access an API that is tailored to the programming language or
 * platform that you're using.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMigrationHubOrchestrator {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "migrationhub-orchestrator";

    /**
     * <p>
     * Create a workflow to orchestrate your migrations.
     * </p>
     * 
     * @param createWorkflowRequest
     * @return Result of the CreateWorkflow operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSMigrationHubOrchestrator.CreateWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/CreateWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    CreateWorkflowResult createWorkflow(CreateWorkflowRequest createWorkflowRequest);

    /**
     * <p>
     * Create a step in the migration workflow.
     * </p>
     * 
     * @param createWorkflowStepRequest
     * @return Result of the CreateWorkflowStep operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSMigrationHubOrchestrator.CreateWorkflowStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/CreateWorkflowStep"
     *      target="_top">AWS API Documentation</a>
     */
    CreateWorkflowStepResult createWorkflowStep(CreateWorkflowStepRequest createWorkflowStepRequest);

    /**
     * <p>
     * Create a step group in a migration workflow.
     * </p>
     * 
     * @param createWorkflowStepGroupRequest
     * @return Result of the CreateWorkflowStepGroup operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSMigrationHubOrchestrator.CreateWorkflowStepGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/CreateWorkflowStepGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateWorkflowStepGroupResult createWorkflowStepGroup(CreateWorkflowStepGroupRequest createWorkflowStepGroupRequest);

    /**
     * <p>
     * Delete a migration workflow. You must pause a running workflow in Migration Hub Orchestrator console to delete
     * it.
     * </p>
     * 
     * @param deleteWorkflowRequest
     * @return Result of the DeleteWorkflow operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.DeleteWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/DeleteWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteWorkflowResult deleteWorkflow(DeleteWorkflowRequest deleteWorkflowRequest);

    /**
     * <p>
     * Delete a step in a migration workflow. Pause the workflow to delete a running step.
     * </p>
     * 
     * @param deleteWorkflowStepRequest
     * @return Result of the DeleteWorkflowStep operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.DeleteWorkflowStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/DeleteWorkflowStep"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteWorkflowStepResult deleteWorkflowStep(DeleteWorkflowStepRequest deleteWorkflowStepRequest);

    /**
     * <p>
     * Delete a step group in a migration workflow.
     * </p>
     * 
     * @param deleteWorkflowStepGroupRequest
     * @return Result of the DeleteWorkflowStepGroup operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.DeleteWorkflowStepGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/DeleteWorkflowStepGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteWorkflowStepGroupResult deleteWorkflowStepGroup(DeleteWorkflowStepGroupRequest deleteWorkflowStepGroupRequest);

    /**
     * <p>
     * Get the template you want to use for creating a migration workflow.
     * </p>
     * 
     * @param getTemplateRequest
     * @return Result of the GetTemplate operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.GetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/GetTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    GetTemplateResult getTemplate(GetTemplateRequest getTemplateRequest);

    /**
     * <p>
     * Get a specific step in a template.
     * </p>
     * 
     * @param getTemplateStepRequest
     * @return Result of the GetTemplateStep operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.GetTemplateStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/GetTemplateStep"
     *      target="_top">AWS API Documentation</a>
     */
    GetTemplateStepResult getTemplateStep(GetTemplateStepRequest getTemplateStepRequest);

    /**
     * <p>
     * Get a step group in a template.
     * </p>
     * 
     * @param getTemplateStepGroupRequest
     * @return Result of the GetTemplateStepGroup operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.GetTemplateStepGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/GetTemplateStepGroup"
     *      target="_top">AWS API Documentation</a>
     */
    GetTemplateStepGroupResult getTemplateStepGroup(GetTemplateStepGroupRequest getTemplateStepGroupRequest);

    /**
     * <p>
     * Get migration workflow.
     * </p>
     * 
     * @param getWorkflowRequest
     * @return Result of the GetWorkflow operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.GetWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/GetWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    GetWorkflowResult getWorkflow(GetWorkflowRequest getWorkflowRequest);

    /**
     * <p>
     * Get a step in the migration workflow.
     * </p>
     * 
     * @param getWorkflowStepRequest
     * @return Result of the GetWorkflowStep operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.GetWorkflowStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/GetWorkflowStep"
     *      target="_top">AWS API Documentation</a>
     */
    GetWorkflowStepResult getWorkflowStep(GetWorkflowStepRequest getWorkflowStepRequest);

    /**
     * <p>
     * Get the step group of a migration workflow.
     * </p>
     * 
     * @param getWorkflowStepGroupRequest
     * @return Result of the GetWorkflowStepGroup operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.GetWorkflowStepGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/GetWorkflowStepGroup"
     *      target="_top">AWS API Documentation</a>
     */
    GetWorkflowStepGroupResult getWorkflowStepGroup(GetWorkflowStepGroupRequest getWorkflowStepGroupRequest);

    /**
     * <p>
     * List AWS Migration Hub Orchestrator plugins.
     * </p>
     * 
     * @param listPluginsRequest
     * @return Result of the ListPlugins operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSMigrationHubOrchestrator.ListPlugins
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListPlugins"
     *      target="_top">AWS API Documentation</a>
     */
    ListPluginsResult listPlugins(ListPluginsRequest listPluginsRequest);

    /**
     * <p>
     * List the tags added to a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * List the step groups in a template.
     * </p>
     * 
     * @param listTemplateStepGroupsRequest
     * @return Result of the ListTemplateStepGroups operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.ListTemplateStepGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListTemplateStepGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListTemplateStepGroupsResult listTemplateStepGroups(ListTemplateStepGroupsRequest listTemplateStepGroupsRequest);

    /**
     * <p>
     * List the steps in a template.
     * </p>
     * 
     * @param listTemplateStepsRequest
     * @return Result of the ListTemplateSteps operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.ListTemplateSteps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListTemplateSteps"
     *      target="_top">AWS API Documentation</a>
     */
    ListTemplateStepsResult listTemplateSteps(ListTemplateStepsRequest listTemplateStepsRequest);

    /**
     * <p>
     * List the templates available in Migration Hub Orchestrator to create a migration workflow.
     * </p>
     * 
     * @param listTemplatesRequest
     * @return Result of the ListTemplates operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSMigrationHubOrchestrator.ListTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    ListTemplatesResult listTemplates(ListTemplatesRequest listTemplatesRequest);

    /**
     * <p>
     * List the step groups in a migration workflow.
     * </p>
     * 
     * @param listWorkflowStepGroupsRequest
     * @return Result of the ListWorkflowStepGroups operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.ListWorkflowStepGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListWorkflowStepGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListWorkflowStepGroupsResult listWorkflowStepGroups(ListWorkflowStepGroupsRequest listWorkflowStepGroupsRequest);

    /**
     * <p>
     * List the steps in a workflow.
     * </p>
     * 
     * @param listWorkflowStepsRequest
     * @return Result of the ListWorkflowSteps operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSMigrationHubOrchestrator.ListWorkflowSteps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListWorkflowSteps"
     *      target="_top">AWS API Documentation</a>
     */
    ListWorkflowStepsResult listWorkflowSteps(ListWorkflowStepsRequest listWorkflowStepsRequest);

    /**
     * <p>
     * List the migration workflows.
     * </p>
     * 
     * @param listWorkflowsRequest
     * @return Result of the ListWorkflows operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.ListWorkflows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListWorkflows"
     *      target="_top">AWS API Documentation</a>
     */
    ListWorkflowsResult listWorkflows(ListWorkflowsRequest listWorkflowsRequest);

    /**
     * <p>
     * Retry a failed step in a migration workflow.
     * </p>
     * 
     * @param retryWorkflowStepRequest
     * @return Result of the RetryWorkflowStep operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.RetryWorkflowStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/RetryWorkflowStep"
     *      target="_top">AWS API Documentation</a>
     */
    RetryWorkflowStepResult retryWorkflowStep(RetryWorkflowStepRequest retryWorkflowStepRequest);

    /**
     * <p>
     * Start a migration workflow.
     * </p>
     * 
     * @param startWorkflowRequest
     * @return Result of the StartWorkflow operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.StartWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/StartWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    StartWorkflowResult startWorkflow(StartWorkflowRequest startWorkflowRequest);

    /**
     * <p>
     * Stop an ongoing migration workflow.
     * </p>
     * 
     * @param stopWorkflowRequest
     * @return Result of the StopWorkflow operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.StopWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/StopWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    StopWorkflowResult stopWorkflow(StopWorkflowRequest stopWorkflowRequest);

    /**
     * <p>
     * Tag a resource by specifying its Amazon Resource Name (ARN).
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Deletes the tags for a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Update a migration workflow.
     * </p>
     * 
     * @param updateWorkflowRequest
     * @return Result of the UpdateWorkflow operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.UpdateWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/UpdateWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateWorkflowResult updateWorkflow(UpdateWorkflowRequest updateWorkflowRequest);

    /**
     * <p>
     * Update a step in a migration workflow.
     * </p>
     * 
     * @param updateWorkflowStepRequest
     * @return Result of the UpdateWorkflowStep operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSMigrationHubOrchestrator.UpdateWorkflowStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/UpdateWorkflowStep"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateWorkflowStepResult updateWorkflowStep(UpdateWorkflowStepRequest updateWorkflowStepRequest);

    /**
     * <p>
     * Update the step group in a migration workflow.
     * </p>
     * 
     * @param updateWorkflowStepGroupRequest
     * @return Result of the UpdateWorkflowStepGroup operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.UpdateWorkflowStepGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/UpdateWorkflowStepGroup"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateWorkflowStepGroupResult updateWorkflowStepGroup(UpdateWorkflowStepGroupRequest updateWorkflowStepGroupRequest);

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
