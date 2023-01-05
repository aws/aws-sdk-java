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

import com.amazonaws.services.migrationhuborchestrator.model.*;

/**
 * Interface for accessing AWS Migration Hub Orchestrator asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.migrationhuborchestrator.AbstractAWSMigrationHubOrchestratorAsync} instead.
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
public interface AWSMigrationHubOrchestratorAsync extends AWSMigrationHubOrchestrator {

    /**
     * <p>
     * Create a workflow to orchestrate your migrations.
     * </p>
     * 
     * @param createWorkflowRequest
     * @return A Java Future containing the result of the CreateWorkflow operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsync.CreateWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/CreateWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkflowResult> createWorkflowAsync(CreateWorkflowRequest createWorkflowRequest);

    /**
     * <p>
     * Create a workflow to orchestrate your migrations.
     * </p>
     * 
     * @param createWorkflowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWorkflow operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsyncHandler.CreateWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/CreateWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkflowResult> createWorkflowAsync(CreateWorkflowRequest createWorkflowRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWorkflowRequest, CreateWorkflowResult> asyncHandler);

    /**
     * <p>
     * Create a step in the migration workflow.
     * </p>
     * 
     * @param createWorkflowStepRequest
     * @return A Java Future containing the result of the CreateWorkflowStep operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsync.CreateWorkflowStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/CreateWorkflowStep"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkflowStepResult> createWorkflowStepAsync(CreateWorkflowStepRequest createWorkflowStepRequest);

    /**
     * <p>
     * Create a step in the migration workflow.
     * </p>
     * 
     * @param createWorkflowStepRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWorkflowStep operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsyncHandler.CreateWorkflowStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/CreateWorkflowStep"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkflowStepResult> createWorkflowStepAsync(CreateWorkflowStepRequest createWorkflowStepRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWorkflowStepRequest, CreateWorkflowStepResult> asyncHandler);

    /**
     * <p>
     * Create a step group in a migration workflow.
     * </p>
     * 
     * @param createWorkflowStepGroupRequest
     * @return A Java Future containing the result of the CreateWorkflowStepGroup operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsync.CreateWorkflowStepGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/CreateWorkflowStepGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkflowStepGroupResult> createWorkflowStepGroupAsync(CreateWorkflowStepGroupRequest createWorkflowStepGroupRequest);

    /**
     * <p>
     * Create a step group in a migration workflow.
     * </p>
     * 
     * @param createWorkflowStepGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWorkflowStepGroup operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsyncHandler.CreateWorkflowStepGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/CreateWorkflowStepGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkflowStepGroupResult> createWorkflowStepGroupAsync(CreateWorkflowStepGroupRequest createWorkflowStepGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWorkflowStepGroupRequest, CreateWorkflowStepGroupResult> asyncHandler);

    /**
     * <p>
     * Delete a migration workflow. You must pause a running workflow in Migration Hub Orchestrator console to delete
     * it.
     * </p>
     * 
     * @param deleteWorkflowRequest
     * @return A Java Future containing the result of the DeleteWorkflow operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsync.DeleteWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/DeleteWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkflowResult> deleteWorkflowAsync(DeleteWorkflowRequest deleteWorkflowRequest);

    /**
     * <p>
     * Delete a migration workflow. You must pause a running workflow in Migration Hub Orchestrator console to delete
     * it.
     * </p>
     * 
     * @param deleteWorkflowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWorkflow operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsyncHandler.DeleteWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/DeleteWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkflowResult> deleteWorkflowAsync(DeleteWorkflowRequest deleteWorkflowRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkflowRequest, DeleteWorkflowResult> asyncHandler);

    /**
     * <p>
     * Delete a step in a migration workflow. Pause the workflow to delete a running step.
     * </p>
     * 
     * @param deleteWorkflowStepRequest
     * @return A Java Future containing the result of the DeleteWorkflowStep operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsync.DeleteWorkflowStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/DeleteWorkflowStep"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkflowStepResult> deleteWorkflowStepAsync(DeleteWorkflowStepRequest deleteWorkflowStepRequest);

    /**
     * <p>
     * Delete a step in a migration workflow. Pause the workflow to delete a running step.
     * </p>
     * 
     * @param deleteWorkflowStepRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWorkflowStep operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsyncHandler.DeleteWorkflowStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/DeleteWorkflowStep"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkflowStepResult> deleteWorkflowStepAsync(DeleteWorkflowStepRequest deleteWorkflowStepRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkflowStepRequest, DeleteWorkflowStepResult> asyncHandler);

    /**
     * <p>
     * Delete a step group in a migration workflow.
     * </p>
     * 
     * @param deleteWorkflowStepGroupRequest
     * @return A Java Future containing the result of the DeleteWorkflowStepGroup operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsync.DeleteWorkflowStepGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/DeleteWorkflowStepGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkflowStepGroupResult> deleteWorkflowStepGroupAsync(DeleteWorkflowStepGroupRequest deleteWorkflowStepGroupRequest);

    /**
     * <p>
     * Delete a step group in a migration workflow.
     * </p>
     * 
     * @param deleteWorkflowStepGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWorkflowStepGroup operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsyncHandler.DeleteWorkflowStepGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/DeleteWorkflowStepGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkflowStepGroupResult> deleteWorkflowStepGroupAsync(DeleteWorkflowStepGroupRequest deleteWorkflowStepGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkflowStepGroupRequest, DeleteWorkflowStepGroupResult> asyncHandler);

    /**
     * <p>
     * Get the template you want to use for creating a migration workflow.
     * </p>
     * 
     * @param getTemplateRequest
     * @return A Java Future containing the result of the GetTemplate operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsync.GetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/GetTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTemplateResult> getTemplateAsync(GetTemplateRequest getTemplateRequest);

    /**
     * <p>
     * Get the template you want to use for creating a migration workflow.
     * </p>
     * 
     * @param getTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTemplate operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsyncHandler.GetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/GetTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTemplateResult> getTemplateAsync(GetTemplateRequest getTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetTemplateRequest, GetTemplateResult> asyncHandler);

    /**
     * <p>
     * Get a specific step in a template.
     * </p>
     * 
     * @param getTemplateStepRequest
     * @return A Java Future containing the result of the GetTemplateStep operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsync.GetTemplateStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/GetTemplateStep"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTemplateStepResult> getTemplateStepAsync(GetTemplateStepRequest getTemplateStepRequest);

    /**
     * <p>
     * Get a specific step in a template.
     * </p>
     * 
     * @param getTemplateStepRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTemplateStep operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsyncHandler.GetTemplateStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/GetTemplateStep"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTemplateStepResult> getTemplateStepAsync(GetTemplateStepRequest getTemplateStepRequest,
            com.amazonaws.handlers.AsyncHandler<GetTemplateStepRequest, GetTemplateStepResult> asyncHandler);

    /**
     * <p>
     * Get a step group in a template.
     * </p>
     * 
     * @param getTemplateStepGroupRequest
     * @return A Java Future containing the result of the GetTemplateStepGroup operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsync.GetTemplateStepGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/GetTemplateStepGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTemplateStepGroupResult> getTemplateStepGroupAsync(GetTemplateStepGroupRequest getTemplateStepGroupRequest);

    /**
     * <p>
     * Get a step group in a template.
     * </p>
     * 
     * @param getTemplateStepGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTemplateStepGroup operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsyncHandler.GetTemplateStepGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/GetTemplateStepGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTemplateStepGroupResult> getTemplateStepGroupAsync(GetTemplateStepGroupRequest getTemplateStepGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetTemplateStepGroupRequest, GetTemplateStepGroupResult> asyncHandler);

    /**
     * <p>
     * Get migration workflow.
     * </p>
     * 
     * @param getWorkflowRequest
     * @return A Java Future containing the result of the GetWorkflow operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsync.GetWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/GetWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetWorkflowResult> getWorkflowAsync(GetWorkflowRequest getWorkflowRequest);

    /**
     * <p>
     * Get migration workflow.
     * </p>
     * 
     * @param getWorkflowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWorkflow operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsyncHandler.GetWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/GetWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetWorkflowResult> getWorkflowAsync(GetWorkflowRequest getWorkflowRequest,
            com.amazonaws.handlers.AsyncHandler<GetWorkflowRequest, GetWorkflowResult> asyncHandler);

    /**
     * <p>
     * Get a step in the migration workflow.
     * </p>
     * 
     * @param getWorkflowStepRequest
     * @return A Java Future containing the result of the GetWorkflowStep operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsync.GetWorkflowStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/GetWorkflowStep"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetWorkflowStepResult> getWorkflowStepAsync(GetWorkflowStepRequest getWorkflowStepRequest);

    /**
     * <p>
     * Get a step in the migration workflow.
     * </p>
     * 
     * @param getWorkflowStepRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWorkflowStep operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsyncHandler.GetWorkflowStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/GetWorkflowStep"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetWorkflowStepResult> getWorkflowStepAsync(GetWorkflowStepRequest getWorkflowStepRequest,
            com.amazonaws.handlers.AsyncHandler<GetWorkflowStepRequest, GetWorkflowStepResult> asyncHandler);

    /**
     * <p>
     * Get the step group of a migration workflow.
     * </p>
     * 
     * @param getWorkflowStepGroupRequest
     * @return A Java Future containing the result of the GetWorkflowStepGroup operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsync.GetWorkflowStepGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/GetWorkflowStepGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetWorkflowStepGroupResult> getWorkflowStepGroupAsync(GetWorkflowStepGroupRequest getWorkflowStepGroupRequest);

    /**
     * <p>
     * Get the step group of a migration workflow.
     * </p>
     * 
     * @param getWorkflowStepGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWorkflowStepGroup operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsyncHandler.GetWorkflowStepGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/GetWorkflowStepGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetWorkflowStepGroupResult> getWorkflowStepGroupAsync(GetWorkflowStepGroupRequest getWorkflowStepGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetWorkflowStepGroupRequest, GetWorkflowStepGroupResult> asyncHandler);

    /**
     * <p>
     * List AWS Migration Hub Orchestrator plugins.
     * </p>
     * 
     * @param listPluginsRequest
     * @return A Java Future containing the result of the ListPlugins operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsync.ListPlugins
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListPlugins"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPluginsResult> listPluginsAsync(ListPluginsRequest listPluginsRequest);

    /**
     * <p>
     * List AWS Migration Hub Orchestrator plugins.
     * </p>
     * 
     * @param listPluginsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPlugins operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsyncHandler.ListPlugins
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListPlugins"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPluginsResult> listPluginsAsync(ListPluginsRequest listPluginsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPluginsRequest, ListPluginsResult> asyncHandler);

    /**
     * <p>
     * List the tags added to a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * List the tags added to a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * List the step groups in a template.
     * </p>
     * 
     * @param listTemplateStepGroupsRequest
     * @return A Java Future containing the result of the ListTemplateStepGroups operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsync.ListTemplateStepGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListTemplateStepGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTemplateStepGroupsResult> listTemplateStepGroupsAsync(ListTemplateStepGroupsRequest listTemplateStepGroupsRequest);

    /**
     * <p>
     * List the step groups in a template.
     * </p>
     * 
     * @param listTemplateStepGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTemplateStepGroups operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsyncHandler.ListTemplateStepGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListTemplateStepGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTemplateStepGroupsResult> listTemplateStepGroupsAsync(ListTemplateStepGroupsRequest listTemplateStepGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTemplateStepGroupsRequest, ListTemplateStepGroupsResult> asyncHandler);

    /**
     * <p>
     * List the steps in a template.
     * </p>
     * 
     * @param listTemplateStepsRequest
     * @return A Java Future containing the result of the ListTemplateSteps operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsync.ListTemplateSteps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListTemplateSteps"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTemplateStepsResult> listTemplateStepsAsync(ListTemplateStepsRequest listTemplateStepsRequest);

    /**
     * <p>
     * List the steps in a template.
     * </p>
     * 
     * @param listTemplateStepsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTemplateSteps operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsyncHandler.ListTemplateSteps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListTemplateSteps"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTemplateStepsResult> listTemplateStepsAsync(ListTemplateStepsRequest listTemplateStepsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTemplateStepsRequest, ListTemplateStepsResult> asyncHandler);

    /**
     * <p>
     * List the templates available in Migration Hub Orchestrator to create a migration workflow.
     * </p>
     * 
     * @param listTemplatesRequest
     * @return A Java Future containing the result of the ListTemplates operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsync.ListTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTemplatesResult> listTemplatesAsync(ListTemplatesRequest listTemplatesRequest);

    /**
     * <p>
     * List the templates available in Migration Hub Orchestrator to create a migration workflow.
     * </p>
     * 
     * @param listTemplatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTemplates operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsyncHandler.ListTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTemplatesResult> listTemplatesAsync(ListTemplatesRequest listTemplatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTemplatesRequest, ListTemplatesResult> asyncHandler);

    /**
     * <p>
     * List the step groups in a migration workflow.
     * </p>
     * 
     * @param listWorkflowStepGroupsRequest
     * @return A Java Future containing the result of the ListWorkflowStepGroups operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsync.ListWorkflowStepGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListWorkflowStepGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWorkflowStepGroupsResult> listWorkflowStepGroupsAsync(ListWorkflowStepGroupsRequest listWorkflowStepGroupsRequest);

    /**
     * <p>
     * List the step groups in a migration workflow.
     * </p>
     * 
     * @param listWorkflowStepGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWorkflowStepGroups operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsyncHandler.ListWorkflowStepGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListWorkflowStepGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWorkflowStepGroupsResult> listWorkflowStepGroupsAsync(ListWorkflowStepGroupsRequest listWorkflowStepGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListWorkflowStepGroupsRequest, ListWorkflowStepGroupsResult> asyncHandler);

    /**
     * <p>
     * List the steps in a workflow.
     * </p>
     * 
     * @param listWorkflowStepsRequest
     * @return A Java Future containing the result of the ListWorkflowSteps operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsync.ListWorkflowSteps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListWorkflowSteps"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWorkflowStepsResult> listWorkflowStepsAsync(ListWorkflowStepsRequest listWorkflowStepsRequest);

    /**
     * <p>
     * List the steps in a workflow.
     * </p>
     * 
     * @param listWorkflowStepsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWorkflowSteps operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsyncHandler.ListWorkflowSteps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListWorkflowSteps"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWorkflowStepsResult> listWorkflowStepsAsync(ListWorkflowStepsRequest listWorkflowStepsRequest,
            com.amazonaws.handlers.AsyncHandler<ListWorkflowStepsRequest, ListWorkflowStepsResult> asyncHandler);

    /**
     * <p>
     * List the migration workflows.
     * </p>
     * 
     * @param listWorkflowsRequest
     * @return A Java Future containing the result of the ListWorkflows operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsync.ListWorkflows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListWorkflows"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWorkflowsResult> listWorkflowsAsync(ListWorkflowsRequest listWorkflowsRequest);

    /**
     * <p>
     * List the migration workflows.
     * </p>
     * 
     * @param listWorkflowsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWorkflows operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsyncHandler.ListWorkflows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListWorkflows"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWorkflowsResult> listWorkflowsAsync(ListWorkflowsRequest listWorkflowsRequest,
            com.amazonaws.handlers.AsyncHandler<ListWorkflowsRequest, ListWorkflowsResult> asyncHandler);

    /**
     * <p>
     * Retry a failed step in a migration workflow.
     * </p>
     * 
     * @param retryWorkflowStepRequest
     * @return A Java Future containing the result of the RetryWorkflowStep operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsync.RetryWorkflowStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/RetryWorkflowStep"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RetryWorkflowStepResult> retryWorkflowStepAsync(RetryWorkflowStepRequest retryWorkflowStepRequest);

    /**
     * <p>
     * Retry a failed step in a migration workflow.
     * </p>
     * 
     * @param retryWorkflowStepRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RetryWorkflowStep operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsyncHandler.RetryWorkflowStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/RetryWorkflowStep"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RetryWorkflowStepResult> retryWorkflowStepAsync(RetryWorkflowStepRequest retryWorkflowStepRequest,
            com.amazonaws.handlers.AsyncHandler<RetryWorkflowStepRequest, RetryWorkflowStepResult> asyncHandler);

    /**
     * <p>
     * Start a migration workflow.
     * </p>
     * 
     * @param startWorkflowRequest
     * @return A Java Future containing the result of the StartWorkflow operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsync.StartWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/StartWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartWorkflowResult> startWorkflowAsync(StartWorkflowRequest startWorkflowRequest);

    /**
     * <p>
     * Start a migration workflow.
     * </p>
     * 
     * @param startWorkflowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartWorkflow operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsyncHandler.StartWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/StartWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartWorkflowResult> startWorkflowAsync(StartWorkflowRequest startWorkflowRequest,
            com.amazonaws.handlers.AsyncHandler<StartWorkflowRequest, StartWorkflowResult> asyncHandler);

    /**
     * <p>
     * Stop an ongoing migration workflow.
     * </p>
     * 
     * @param stopWorkflowRequest
     * @return A Java Future containing the result of the StopWorkflow operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsync.StopWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/StopWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopWorkflowResult> stopWorkflowAsync(StopWorkflowRequest stopWorkflowRequest);

    /**
     * <p>
     * Stop an ongoing migration workflow.
     * </p>
     * 
     * @param stopWorkflowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopWorkflow operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsyncHandler.StopWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/StopWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopWorkflowResult> stopWorkflowAsync(StopWorkflowRequest stopWorkflowRequest,
            com.amazonaws.handlers.AsyncHandler<StopWorkflowRequest, StopWorkflowResult> asyncHandler);

    /**
     * <p>
     * Tag a resource by specifying its Amazon Resource Name (ARN).
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Tag a resource by specifying its Amazon Resource Name (ARN).
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Deletes the tags for a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Deletes the tags for a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Update a migration workflow.
     * </p>
     * 
     * @param updateWorkflowRequest
     * @return A Java Future containing the result of the UpdateWorkflow operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsync.UpdateWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/UpdateWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkflowResult> updateWorkflowAsync(UpdateWorkflowRequest updateWorkflowRequest);

    /**
     * <p>
     * Update a migration workflow.
     * </p>
     * 
     * @param updateWorkflowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWorkflow operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsyncHandler.UpdateWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/UpdateWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkflowResult> updateWorkflowAsync(UpdateWorkflowRequest updateWorkflowRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkflowRequest, UpdateWorkflowResult> asyncHandler);

    /**
     * <p>
     * Update a step in a migration workflow.
     * </p>
     * 
     * @param updateWorkflowStepRequest
     * @return A Java Future containing the result of the UpdateWorkflowStep operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsync.UpdateWorkflowStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/UpdateWorkflowStep"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkflowStepResult> updateWorkflowStepAsync(UpdateWorkflowStepRequest updateWorkflowStepRequest);

    /**
     * <p>
     * Update a step in a migration workflow.
     * </p>
     * 
     * @param updateWorkflowStepRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWorkflowStep operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsyncHandler.UpdateWorkflowStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/UpdateWorkflowStep"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkflowStepResult> updateWorkflowStepAsync(UpdateWorkflowStepRequest updateWorkflowStepRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkflowStepRequest, UpdateWorkflowStepResult> asyncHandler);

    /**
     * <p>
     * Update the step group in a migration workflow.
     * </p>
     * 
     * @param updateWorkflowStepGroupRequest
     * @return A Java Future containing the result of the UpdateWorkflowStepGroup operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsync.UpdateWorkflowStepGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/UpdateWorkflowStepGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkflowStepGroupResult> updateWorkflowStepGroupAsync(UpdateWorkflowStepGroupRequest updateWorkflowStepGroupRequest);

    /**
     * <p>
     * Update the step group in a migration workflow.
     * </p>
     * 
     * @param updateWorkflowStepGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWorkflowStepGroup operation returned by the service.
     * @sample AWSMigrationHubOrchestratorAsyncHandler.UpdateWorkflowStepGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/UpdateWorkflowStepGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkflowStepGroupResult> updateWorkflowStepGroupAsync(UpdateWorkflowStepGroupRequest updateWorkflowStepGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkflowStepGroupRequest, UpdateWorkflowStepGroupResult> asyncHandler);

}
