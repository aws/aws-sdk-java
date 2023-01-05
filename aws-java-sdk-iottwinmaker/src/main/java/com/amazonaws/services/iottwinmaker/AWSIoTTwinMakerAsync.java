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
package com.amazonaws.services.iottwinmaker;

import javax.annotation.Generated;

import com.amazonaws.services.iottwinmaker.model.*;

/**
 * Interface for accessing AWS IoT TwinMaker asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iottwinmaker.AbstractAWSIoTTwinMakerAsync} instead.
 * </p>
 * <p>
 * <p>
 * IoT TwinMaker is a service that enables you to build operational digital twins of physical systems. IoT TwinMaker
 * overlays measurements and analysis from real-world sensors, cameras, and enterprise applications so you can create
 * data visualizations to monitor your physical factory, building, or industrial plant. You can use this real-world data
 * to monitor operations and diagnose and repair errors.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIoTTwinMakerAsync extends AWSIoTTwinMaker {

    /**
     * <p>
     * Sets values for multiple time series properties.
     * </p>
     * 
     * @param batchPutPropertyValuesRequest
     * @return A Java Future containing the result of the BatchPutPropertyValues operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.BatchPutPropertyValues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/BatchPutPropertyValues"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchPutPropertyValuesResult> batchPutPropertyValuesAsync(BatchPutPropertyValuesRequest batchPutPropertyValuesRequest);

    /**
     * <p>
     * Sets values for multiple time series properties.
     * </p>
     * 
     * @param batchPutPropertyValuesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchPutPropertyValues operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.BatchPutPropertyValues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/BatchPutPropertyValues"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchPutPropertyValuesResult> batchPutPropertyValuesAsync(BatchPutPropertyValuesRequest batchPutPropertyValuesRequest,
            com.amazonaws.handlers.AsyncHandler<BatchPutPropertyValuesRequest, BatchPutPropertyValuesResult> asyncHandler);

    /**
     * <p>
     * Creates a component type.
     * </p>
     * 
     * @param createComponentTypeRequest
     * @return A Java Future containing the result of the CreateComponentType operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.CreateComponentType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/CreateComponentType"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateComponentTypeResult> createComponentTypeAsync(CreateComponentTypeRequest createComponentTypeRequest);

    /**
     * <p>
     * Creates a component type.
     * </p>
     * 
     * @param createComponentTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateComponentType operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.CreateComponentType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/CreateComponentType"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateComponentTypeResult> createComponentTypeAsync(CreateComponentTypeRequest createComponentTypeRequest,
            com.amazonaws.handlers.AsyncHandler<CreateComponentTypeRequest, CreateComponentTypeResult> asyncHandler);

    /**
     * <p>
     * Creates an entity.
     * </p>
     * 
     * @param createEntityRequest
     * @return A Java Future containing the result of the CreateEntity operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.CreateEntity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/CreateEntity" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateEntityResult> createEntityAsync(CreateEntityRequest createEntityRequest);

    /**
     * <p>
     * Creates an entity.
     * </p>
     * 
     * @param createEntityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEntity operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.CreateEntity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/CreateEntity" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateEntityResult> createEntityAsync(CreateEntityRequest createEntityRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEntityRequest, CreateEntityResult> asyncHandler);

    /**
     * <p>
     * Creates a scene.
     * </p>
     * 
     * @param createSceneRequest
     * @return A Java Future containing the result of the CreateScene operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.CreateScene
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/CreateScene" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSceneResult> createSceneAsync(CreateSceneRequest createSceneRequest);

    /**
     * <p>
     * Creates a scene.
     * </p>
     * 
     * @param createSceneRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateScene operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.CreateScene
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/CreateScene" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSceneResult> createSceneAsync(CreateSceneRequest createSceneRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSceneRequest, CreateSceneResult> asyncHandler);

    /**
     * <p>
     * This action creates a SyncJob.
     * </p>
     * 
     * @param createSyncJobRequest
     * @return A Java Future containing the result of the CreateSyncJob operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.CreateSyncJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/CreateSyncJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSyncJobResult> createSyncJobAsync(CreateSyncJobRequest createSyncJobRequest);

    /**
     * <p>
     * This action creates a SyncJob.
     * </p>
     * 
     * @param createSyncJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSyncJob operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.CreateSyncJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/CreateSyncJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSyncJobResult> createSyncJobAsync(CreateSyncJobRequest createSyncJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSyncJobRequest, CreateSyncJobResult> asyncHandler);

    /**
     * <p>
     * Creates a workplace.
     * </p>
     * 
     * @param createWorkspaceRequest
     * @return A Java Future containing the result of the CreateWorkspace operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.CreateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/CreateWorkspace" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkspaceResult> createWorkspaceAsync(CreateWorkspaceRequest createWorkspaceRequest);

    /**
     * <p>
     * Creates a workplace.
     * </p>
     * 
     * @param createWorkspaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWorkspace operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.CreateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/CreateWorkspace" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkspaceResult> createWorkspaceAsync(CreateWorkspaceRequest createWorkspaceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWorkspaceRequest, CreateWorkspaceResult> asyncHandler);

    /**
     * <p>
     * Deletes a component type.
     * </p>
     * 
     * @param deleteComponentTypeRequest
     * @return A Java Future containing the result of the DeleteComponentType operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.DeleteComponentType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/DeleteComponentType"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteComponentTypeResult> deleteComponentTypeAsync(DeleteComponentTypeRequest deleteComponentTypeRequest);

    /**
     * <p>
     * Deletes a component type.
     * </p>
     * 
     * @param deleteComponentTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteComponentType operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.DeleteComponentType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/DeleteComponentType"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteComponentTypeResult> deleteComponentTypeAsync(DeleteComponentTypeRequest deleteComponentTypeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteComponentTypeRequest, DeleteComponentTypeResult> asyncHandler);

    /**
     * <p>
     * Deletes an entity.
     * </p>
     * 
     * @param deleteEntityRequest
     * @return A Java Future containing the result of the DeleteEntity operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.DeleteEntity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/DeleteEntity" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEntityResult> deleteEntityAsync(DeleteEntityRequest deleteEntityRequest);

    /**
     * <p>
     * Deletes an entity.
     * </p>
     * 
     * @param deleteEntityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEntity operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.DeleteEntity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/DeleteEntity" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEntityResult> deleteEntityAsync(DeleteEntityRequest deleteEntityRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEntityRequest, DeleteEntityResult> asyncHandler);

    /**
     * <p>
     * Deletes a scene.
     * </p>
     * 
     * @param deleteSceneRequest
     * @return A Java Future containing the result of the DeleteScene operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.DeleteScene
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/DeleteScene" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSceneResult> deleteSceneAsync(DeleteSceneRequest deleteSceneRequest);

    /**
     * <p>
     * Deletes a scene.
     * </p>
     * 
     * @param deleteSceneRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteScene operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.DeleteScene
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/DeleteScene" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSceneResult> deleteSceneAsync(DeleteSceneRequest deleteSceneRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSceneRequest, DeleteSceneResult> asyncHandler);

    /**
     * <p>
     * Delete the SyncJob.
     * </p>
     * 
     * @param deleteSyncJobRequest
     * @return A Java Future containing the result of the DeleteSyncJob operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.DeleteSyncJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/DeleteSyncJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSyncJobResult> deleteSyncJobAsync(DeleteSyncJobRequest deleteSyncJobRequest);

    /**
     * <p>
     * Delete the SyncJob.
     * </p>
     * 
     * @param deleteSyncJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSyncJob operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.DeleteSyncJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/DeleteSyncJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSyncJobResult> deleteSyncJobAsync(DeleteSyncJobRequest deleteSyncJobRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSyncJobRequest, DeleteSyncJobResult> asyncHandler);

    /**
     * <p>
     * Deletes a workspace.
     * </p>
     * 
     * @param deleteWorkspaceRequest
     * @return A Java Future containing the result of the DeleteWorkspace operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.DeleteWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/DeleteWorkspace" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkspaceResult> deleteWorkspaceAsync(DeleteWorkspaceRequest deleteWorkspaceRequest);

    /**
     * <p>
     * Deletes a workspace.
     * </p>
     * 
     * @param deleteWorkspaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWorkspace operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.DeleteWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/DeleteWorkspace" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkspaceResult> deleteWorkspaceAsync(DeleteWorkspaceRequest deleteWorkspaceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkspaceRequest, DeleteWorkspaceResult> asyncHandler);

    /**
     * <p>
     * Run queries to access information from your knowledge graph of entities within individual workspaces.
     * </p>
     * 
     * @param executeQueryRequest
     * @return A Java Future containing the result of the ExecuteQuery operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.ExecuteQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ExecuteQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExecuteQueryResult> executeQueryAsync(ExecuteQueryRequest executeQueryRequest);

    /**
     * <p>
     * Run queries to access information from your knowledge graph of entities within individual workspaces.
     * </p>
     * 
     * @param executeQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExecuteQuery operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.ExecuteQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ExecuteQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExecuteQueryResult> executeQueryAsync(ExecuteQueryRequest executeQueryRequest,
            com.amazonaws.handlers.AsyncHandler<ExecuteQueryRequest, ExecuteQueryResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a component type.
     * </p>
     * 
     * @param getComponentTypeRequest
     * @return A Java Future containing the result of the GetComponentType operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.GetComponentType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetComponentType" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetComponentTypeResult> getComponentTypeAsync(GetComponentTypeRequest getComponentTypeRequest);

    /**
     * <p>
     * Retrieves information about a component type.
     * </p>
     * 
     * @param getComponentTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetComponentType operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.GetComponentType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetComponentType" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetComponentTypeResult> getComponentTypeAsync(GetComponentTypeRequest getComponentTypeRequest,
            com.amazonaws.handlers.AsyncHandler<GetComponentTypeRequest, GetComponentTypeResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about an entity.
     * </p>
     * 
     * @param getEntityRequest
     * @return A Java Future containing the result of the GetEntity operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.GetEntity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetEntity" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEntityResult> getEntityAsync(GetEntityRequest getEntityRequest);

    /**
     * <p>
     * Retrieves information about an entity.
     * </p>
     * 
     * @param getEntityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEntity operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.GetEntity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetEntity" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEntityResult> getEntityAsync(GetEntityRequest getEntityRequest,
            com.amazonaws.handlers.AsyncHandler<GetEntityRequest, GetEntityResult> asyncHandler);

    /**
     * <p>
     * Gets the pricing plan.
     * </p>
     * 
     * @param getPricingPlanRequest
     * @return A Java Future containing the result of the GetPricingPlan operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.GetPricingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetPricingPlan" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPricingPlanResult> getPricingPlanAsync(GetPricingPlanRequest getPricingPlanRequest);

    /**
     * <p>
     * Gets the pricing plan.
     * </p>
     * 
     * @param getPricingPlanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPricingPlan operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.GetPricingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetPricingPlan" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPricingPlanResult> getPricingPlanAsync(GetPricingPlanRequest getPricingPlanRequest,
            com.amazonaws.handlers.AsyncHandler<GetPricingPlanRequest, GetPricingPlanResult> asyncHandler);

    /**
     * <p>
     * Gets the property values for a component, component type, entity, or workspace.
     * </p>
     * <p>
     * You must specify a value for either <code>componentName</code>, <code>componentTypeId</code>,
     * <code>entityId</code>, or <code>workspaceId</code>.
     * </p>
     * 
     * @param getPropertyValueRequest
     * @return A Java Future containing the result of the GetPropertyValue operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.GetPropertyValue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetPropertyValue" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPropertyValueResult> getPropertyValueAsync(GetPropertyValueRequest getPropertyValueRequest);

    /**
     * <p>
     * Gets the property values for a component, component type, entity, or workspace.
     * </p>
     * <p>
     * You must specify a value for either <code>componentName</code>, <code>componentTypeId</code>,
     * <code>entityId</code>, or <code>workspaceId</code>.
     * </p>
     * 
     * @param getPropertyValueRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPropertyValue operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.GetPropertyValue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetPropertyValue" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPropertyValueResult> getPropertyValueAsync(GetPropertyValueRequest getPropertyValueRequest,
            com.amazonaws.handlers.AsyncHandler<GetPropertyValueRequest, GetPropertyValueResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the history of a time series property value for a component, component type, entity,
     * or workspace.
     * </p>
     * <p>
     * You must specify a value for <code>workspaceId</code>. For entity-specific queries, specify values for
     * <code>componentName</code> and <code>entityId</code>. For cross-entity quries, specify a value for
     * <code>componentTypeId</code>.
     * </p>
     * 
     * @param getPropertyValueHistoryRequest
     * @return A Java Future containing the result of the GetPropertyValueHistory operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.GetPropertyValueHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetPropertyValueHistory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPropertyValueHistoryResult> getPropertyValueHistoryAsync(GetPropertyValueHistoryRequest getPropertyValueHistoryRequest);

    /**
     * <p>
     * Retrieves information about the history of a time series property value for a component, component type, entity,
     * or workspace.
     * </p>
     * <p>
     * You must specify a value for <code>workspaceId</code>. For entity-specific queries, specify values for
     * <code>componentName</code> and <code>entityId</code>. For cross-entity quries, specify a value for
     * <code>componentTypeId</code>.
     * </p>
     * 
     * @param getPropertyValueHistoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPropertyValueHistory operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.GetPropertyValueHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetPropertyValueHistory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPropertyValueHistoryResult> getPropertyValueHistoryAsync(GetPropertyValueHistoryRequest getPropertyValueHistoryRequest,
            com.amazonaws.handlers.AsyncHandler<GetPropertyValueHistoryRequest, GetPropertyValueHistoryResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a scene.
     * </p>
     * 
     * @param getSceneRequest
     * @return A Java Future containing the result of the GetScene operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.GetScene
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetScene" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSceneResult> getSceneAsync(GetSceneRequest getSceneRequest);

    /**
     * <p>
     * Retrieves information about a scene.
     * </p>
     * 
     * @param getSceneRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetScene operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.GetScene
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetScene" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSceneResult> getSceneAsync(GetSceneRequest getSceneRequest,
            com.amazonaws.handlers.AsyncHandler<GetSceneRequest, GetSceneResult> asyncHandler);

    /**
     * <p>
     * Gets the SyncJob.
     * </p>
     * 
     * @param getSyncJobRequest
     * @return A Java Future containing the result of the GetSyncJob operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.GetSyncJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetSyncJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSyncJobResult> getSyncJobAsync(GetSyncJobRequest getSyncJobRequest);

    /**
     * <p>
     * Gets the SyncJob.
     * </p>
     * 
     * @param getSyncJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSyncJob operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.GetSyncJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetSyncJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSyncJobResult> getSyncJobAsync(GetSyncJobRequest getSyncJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetSyncJobRequest, GetSyncJobResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a workspace.
     * </p>
     * 
     * @param getWorkspaceRequest
     * @return A Java Future containing the result of the GetWorkspace operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.GetWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWorkspaceResult> getWorkspaceAsync(GetWorkspaceRequest getWorkspaceRequest);

    /**
     * <p>
     * Retrieves information about a workspace.
     * </p>
     * 
     * @param getWorkspaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWorkspace operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.GetWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWorkspaceResult> getWorkspaceAsync(GetWorkspaceRequest getWorkspaceRequest,
            com.amazonaws.handlers.AsyncHandler<GetWorkspaceRequest, GetWorkspaceResult> asyncHandler);

    /**
     * <p>
     * Lists all component types in a workspace.
     * </p>
     * 
     * @param listComponentTypesRequest
     * @return A Java Future containing the result of the ListComponentTypes operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.ListComponentTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListComponentTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListComponentTypesResult> listComponentTypesAsync(ListComponentTypesRequest listComponentTypesRequest);

    /**
     * <p>
     * Lists all component types in a workspace.
     * </p>
     * 
     * @param listComponentTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListComponentTypes operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.ListComponentTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListComponentTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListComponentTypesResult> listComponentTypesAsync(ListComponentTypesRequest listComponentTypesRequest,
            com.amazonaws.handlers.AsyncHandler<ListComponentTypesRequest, ListComponentTypesResult> asyncHandler);

    /**
     * <p>
     * Lists all entities in a workspace.
     * </p>
     * 
     * @param listEntitiesRequest
     * @return A Java Future containing the result of the ListEntities operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.ListEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListEntities" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEntitiesResult> listEntitiesAsync(ListEntitiesRequest listEntitiesRequest);

    /**
     * <p>
     * Lists all entities in a workspace.
     * </p>
     * 
     * @param listEntitiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEntities operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.ListEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListEntities" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEntitiesResult> listEntitiesAsync(ListEntitiesRequest listEntitiesRequest,
            com.amazonaws.handlers.AsyncHandler<ListEntitiesRequest, ListEntitiesResult> asyncHandler);

    /**
     * <p>
     * Lists all scenes in a workspace.
     * </p>
     * 
     * @param listScenesRequest
     * @return A Java Future containing the result of the ListScenes operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.ListScenes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListScenes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListScenesResult> listScenesAsync(ListScenesRequest listScenesRequest);

    /**
     * <p>
     * Lists all scenes in a workspace.
     * </p>
     * 
     * @param listScenesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListScenes operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.ListScenes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListScenes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListScenesResult> listScenesAsync(ListScenesRequest listScenesRequest,
            com.amazonaws.handlers.AsyncHandler<ListScenesRequest, ListScenesResult> asyncHandler);

    /**
     * <p>
     * List all SyncJobs.
     * </p>
     * 
     * @param listSyncJobsRequest
     * @return A Java Future containing the result of the ListSyncJobs operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.ListSyncJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListSyncJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSyncJobsResult> listSyncJobsAsync(ListSyncJobsRequest listSyncJobsRequest);

    /**
     * <p>
     * List all SyncJobs.
     * </p>
     * 
     * @param listSyncJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSyncJobs operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.ListSyncJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListSyncJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSyncJobsResult> listSyncJobsAsync(ListSyncJobsRequest listSyncJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSyncJobsRequest, ListSyncJobsResult> asyncHandler);

    /**
     * <p>
     * Lists the sync resources.
     * </p>
     * 
     * @param listSyncResourcesRequest
     * @return A Java Future containing the result of the ListSyncResources operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.ListSyncResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListSyncResources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSyncResourcesResult> listSyncResourcesAsync(ListSyncResourcesRequest listSyncResourcesRequest);

    /**
     * <p>
     * Lists the sync resources.
     * </p>
     * 
     * @param listSyncResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSyncResources operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.ListSyncResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListSyncResources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSyncResourcesResult> listSyncResourcesAsync(ListSyncResourcesRequest listSyncResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSyncResourcesRequest, ListSyncResourcesResult> asyncHandler);

    /**
     * <p>
     * Lists all tags associated with a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all tags associated with a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about workspaces in the current account.
     * </p>
     * 
     * @param listWorkspacesRequest
     * @return A Java Future containing the result of the ListWorkspaces operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.ListWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListWorkspacesResult> listWorkspacesAsync(ListWorkspacesRequest listWorkspacesRequest);

    /**
     * <p>
     * Retrieves information about workspaces in the current account.
     * </p>
     * 
     * @param listWorkspacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWorkspaces operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.ListWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListWorkspacesResult> listWorkspacesAsync(ListWorkspacesRequest listWorkspacesRequest,
            com.amazonaws.handlers.AsyncHandler<ListWorkspacesRequest, ListWorkspacesResult> asyncHandler);

    /**
     * <p>
     * Adds tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates information in a component type.
     * </p>
     * 
     * @param updateComponentTypeRequest
     * @return A Java Future containing the result of the UpdateComponentType operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.UpdateComponentType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/UpdateComponentType"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateComponentTypeResult> updateComponentTypeAsync(UpdateComponentTypeRequest updateComponentTypeRequest);

    /**
     * <p>
     * Updates information in a component type.
     * </p>
     * 
     * @param updateComponentTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateComponentType operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.UpdateComponentType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/UpdateComponentType"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateComponentTypeResult> updateComponentTypeAsync(UpdateComponentTypeRequest updateComponentTypeRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateComponentTypeRequest, UpdateComponentTypeResult> asyncHandler);

    /**
     * <p>
     * Updates an entity.
     * </p>
     * 
     * @param updateEntityRequest
     * @return A Java Future containing the result of the UpdateEntity operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.UpdateEntity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/UpdateEntity" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateEntityResult> updateEntityAsync(UpdateEntityRequest updateEntityRequest);

    /**
     * <p>
     * Updates an entity.
     * </p>
     * 
     * @param updateEntityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEntity operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.UpdateEntity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/UpdateEntity" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateEntityResult> updateEntityAsync(UpdateEntityRequest updateEntityRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEntityRequest, UpdateEntityResult> asyncHandler);

    /**
     * <p>
     * Update the pricing plan.
     * </p>
     * 
     * @param updatePricingPlanRequest
     * @return A Java Future containing the result of the UpdatePricingPlan operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.UpdatePricingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/UpdatePricingPlan" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePricingPlanResult> updatePricingPlanAsync(UpdatePricingPlanRequest updatePricingPlanRequest);

    /**
     * <p>
     * Update the pricing plan.
     * </p>
     * 
     * @param updatePricingPlanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePricingPlan operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.UpdatePricingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/UpdatePricingPlan" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePricingPlanResult> updatePricingPlanAsync(UpdatePricingPlanRequest updatePricingPlanRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePricingPlanRequest, UpdatePricingPlanResult> asyncHandler);

    /**
     * <p>
     * Updates a scene.
     * </p>
     * 
     * @param updateSceneRequest
     * @return A Java Future containing the result of the UpdateScene operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.UpdateScene
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/UpdateScene" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSceneResult> updateSceneAsync(UpdateSceneRequest updateSceneRequest);

    /**
     * <p>
     * Updates a scene.
     * </p>
     * 
     * @param updateSceneRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateScene operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.UpdateScene
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/UpdateScene" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSceneResult> updateSceneAsync(UpdateSceneRequest updateSceneRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSceneRequest, UpdateSceneResult> asyncHandler);

    /**
     * <p>
     * Updates a workspace.
     * </p>
     * 
     * @param updateWorkspaceRequest
     * @return A Java Future containing the result of the UpdateWorkspace operation returned by the service.
     * @sample AWSIoTTwinMakerAsync.UpdateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/UpdateWorkspace" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkspaceResult> updateWorkspaceAsync(UpdateWorkspaceRequest updateWorkspaceRequest);

    /**
     * <p>
     * Updates a workspace.
     * </p>
     * 
     * @param updateWorkspaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWorkspace operation returned by the service.
     * @sample AWSIoTTwinMakerAsyncHandler.UpdateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/UpdateWorkspace" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkspaceResult> updateWorkspaceAsync(UpdateWorkspaceRequest updateWorkspaceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkspaceRequest, UpdateWorkspaceResult> asyncHandler);

}
