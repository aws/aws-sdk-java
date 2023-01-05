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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.iottwinmaker.model.*;

/**
 * Interface for accessing AWS IoT TwinMaker.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iottwinmaker.AbstractAWSIoTTwinMaker} instead.
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
public interface AWSIoTTwinMaker {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "iottwinmaker";

    /**
     * <p>
     * Sets values for multiple time series properties.
     * </p>
     * 
     * @param batchPutPropertyValuesRequest
     * @return Result of the BatchPutPropertyValues operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @sample AWSIoTTwinMaker.BatchPutPropertyValues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/BatchPutPropertyValues"
     *      target="_top">AWS API Documentation</a>
     */
    BatchPutPropertyValuesResult batchPutPropertyValues(BatchPutPropertyValuesRequest batchPutPropertyValuesRequest);

    /**
     * <p>
     * Creates a component type.
     * </p>
     * 
     * @param createComponentTypeRequest
     * @return Result of the CreateComponentType operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ConflictException
     *         A conflict occurred.
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.CreateComponentType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/CreateComponentType"
     *      target="_top">AWS API Documentation</a>
     */
    CreateComponentTypeResult createComponentType(CreateComponentTypeRequest createComponentTypeRequest);

    /**
     * <p>
     * Creates an entity.
     * </p>
     * 
     * @param createEntityRequest
     * @return Result of the CreateEntity operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ConflictException
     *         A conflict occurred.
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.CreateEntity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/CreateEntity" target="_top">AWS API
     *      Documentation</a>
     */
    CreateEntityResult createEntity(CreateEntityRequest createEntityRequest);

    /**
     * <p>
     * Creates a scene.
     * </p>
     * 
     * @param createSceneRequest
     * @return Result of the CreateScene operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ConflictException
     *         A conflict occurred.
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.CreateScene
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/CreateScene" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSceneResult createScene(CreateSceneRequest createSceneRequest);

    /**
     * <p>
     * This action creates a SyncJob.
     * </p>
     * 
     * @param createSyncJobRequest
     * @return Result of the CreateSyncJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ConflictException
     *         A conflict occurred.
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.CreateSyncJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/CreateSyncJob" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSyncJobResult createSyncJob(CreateSyncJobRequest createSyncJobRequest);

    /**
     * <p>
     * Creates a workplace.
     * </p>
     * 
     * @param createWorkspaceRequest
     * @return Result of the CreateWorkspace operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ConflictException
     *         A conflict occurred.
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.CreateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/CreateWorkspace" target="_top">AWS
     *      API Documentation</a>
     */
    CreateWorkspaceResult createWorkspace(CreateWorkspaceRequest createWorkspaceRequest);

    /**
     * <p>
     * Deletes a component type.
     * </p>
     * 
     * @param deleteComponentTypeRequest
     * @return Result of the DeleteComponentType operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @sample AWSIoTTwinMaker.DeleteComponentType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/DeleteComponentType"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteComponentTypeResult deleteComponentType(DeleteComponentTypeRequest deleteComponentTypeRequest);

    /**
     * <p>
     * Deletes an entity.
     * </p>
     * 
     * @param deleteEntityRequest
     * @return Result of the DeleteEntity operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.DeleteEntity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/DeleteEntity" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteEntityResult deleteEntity(DeleteEntityRequest deleteEntityRequest);

    /**
     * <p>
     * Deletes a scene.
     * </p>
     * 
     * @param deleteSceneRequest
     * @return Result of the DeleteScene operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @sample AWSIoTTwinMaker.DeleteScene
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/DeleteScene" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSceneResult deleteScene(DeleteSceneRequest deleteSceneRequest);

    /**
     * <p>
     * Delete the SyncJob.
     * </p>
     * 
     * @param deleteSyncJobRequest
     * @return Result of the DeleteSyncJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.DeleteSyncJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/DeleteSyncJob" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSyncJobResult deleteSyncJob(DeleteSyncJobRequest deleteSyncJobRequest);

    /**
     * <p>
     * Deletes a workspace.
     * </p>
     * 
     * @param deleteWorkspaceRequest
     * @return Result of the DeleteWorkspace operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @sample AWSIoTTwinMaker.DeleteWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/DeleteWorkspace" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteWorkspaceResult deleteWorkspace(DeleteWorkspaceRequest deleteWorkspaceRequest);

    /**
     * <p>
     * Run queries to access information from your knowledge graph of entities within individual workspaces.
     * </p>
     * 
     * @param executeQueryRequest
     * @return Result of the ExecuteQuery operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws QueryTimeoutException
     *         The query timeout exception.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.ExecuteQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ExecuteQuery" target="_top">AWS API
     *      Documentation</a>
     */
    ExecuteQueryResult executeQuery(ExecuteQueryRequest executeQueryRequest);

    /**
     * <p>
     * Retrieves information about a component type.
     * </p>
     * 
     * @param getComponentTypeRequest
     * @return Result of the GetComponentType operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @sample AWSIoTTwinMaker.GetComponentType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetComponentType" target="_top">AWS
     *      API Documentation</a>
     */
    GetComponentTypeResult getComponentType(GetComponentTypeRequest getComponentTypeRequest);

    /**
     * <p>
     * Retrieves information about an entity.
     * </p>
     * 
     * @param getEntityRequest
     * @return Result of the GetEntity operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.GetEntity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetEntity" target="_top">AWS API
     *      Documentation</a>
     */
    GetEntityResult getEntity(GetEntityRequest getEntityRequest);

    /**
     * <p>
     * Gets the pricing plan.
     * </p>
     * 
     * @param getPricingPlanRequest
     * @return Result of the GetPricingPlan operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @sample AWSIoTTwinMaker.GetPricingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetPricingPlan" target="_top">AWS
     *      API Documentation</a>
     */
    GetPricingPlanResult getPricingPlan(GetPricingPlanRequest getPricingPlanRequest);

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
     * @return Result of the GetPropertyValue operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws ConnectorFailureException
     *         The connector failed.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ConnectorTimeoutException
     *         The connector timed out.
     * @sample AWSIoTTwinMaker.GetPropertyValue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetPropertyValue" target="_top">AWS
     *      API Documentation</a>
     */
    GetPropertyValueResult getPropertyValue(GetPropertyValueRequest getPropertyValueRequest);

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
     * @return Result of the GetPropertyValueHistory operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws ConnectorFailureException
     *         The connector failed.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ConnectorTimeoutException
     *         The connector timed out.
     * @sample AWSIoTTwinMaker.GetPropertyValueHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetPropertyValueHistory"
     *      target="_top">AWS API Documentation</a>
     */
    GetPropertyValueHistoryResult getPropertyValueHistory(GetPropertyValueHistoryRequest getPropertyValueHistoryRequest);

    /**
     * <p>
     * Retrieves information about a scene.
     * </p>
     * 
     * @param getSceneRequest
     * @return Result of the GetScene operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @sample AWSIoTTwinMaker.GetScene
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetScene" target="_top">AWS API
     *      Documentation</a>
     */
    GetSceneResult getScene(GetSceneRequest getSceneRequest);

    /**
     * <p>
     * Gets the SyncJob.
     * </p>
     * 
     * @param getSyncJobRequest
     * @return Result of the GetSyncJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.GetSyncJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetSyncJob" target="_top">AWS API
     *      Documentation</a>
     */
    GetSyncJobResult getSyncJob(GetSyncJobRequest getSyncJobRequest);

    /**
     * <p>
     * Retrieves information about a workspace.
     * </p>
     * 
     * @param getWorkspaceRequest
     * @return Result of the GetWorkspace operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.GetWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    GetWorkspaceResult getWorkspace(GetWorkspaceRequest getWorkspaceRequest);

    /**
     * <p>
     * Lists all component types in a workspace.
     * </p>
     * 
     * @param listComponentTypesRequest
     * @return Result of the ListComponentTypes operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @sample AWSIoTTwinMaker.ListComponentTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListComponentTypes"
     *      target="_top">AWS API Documentation</a>
     */
    ListComponentTypesResult listComponentTypes(ListComponentTypesRequest listComponentTypesRequest);

    /**
     * <p>
     * Lists all entities in a workspace.
     * </p>
     * 
     * @param listEntitiesRequest
     * @return Result of the ListEntities operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.ListEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListEntities" target="_top">AWS API
     *      Documentation</a>
     */
    ListEntitiesResult listEntities(ListEntitiesRequest listEntitiesRequest);

    /**
     * <p>
     * Lists all scenes in a workspace.
     * </p>
     * 
     * @param listScenesRequest
     * @return Result of the ListScenes operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @sample AWSIoTTwinMaker.ListScenes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListScenes" target="_top">AWS API
     *      Documentation</a>
     */
    ListScenesResult listScenes(ListScenesRequest listScenesRequest);

    /**
     * <p>
     * List all SyncJobs.
     * </p>
     * 
     * @param listSyncJobsRequest
     * @return Result of the ListSyncJobs operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.ListSyncJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListSyncJobs" target="_top">AWS API
     *      Documentation</a>
     */
    ListSyncJobsResult listSyncJobs(ListSyncJobsRequest listSyncJobsRequest);

    /**
     * <p>
     * Lists the sync resources.
     * </p>
     * 
     * @param listSyncResourcesRequest
     * @return Result of the ListSyncResources operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.ListSyncResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListSyncResources" target="_top">AWS
     *      API Documentation</a>
     */
    ListSyncResourcesResult listSyncResources(ListSyncResourcesRequest listSyncResourcesRequest);

    /**
     * <p>
     * Lists all tags associated with a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @sample AWSIoTTwinMaker.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Retrieves information about workspaces in the current account.
     * </p>
     * 
     * @param listWorkspacesRequest
     * @return Result of the ListWorkspaces operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.ListWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    ListWorkspacesResult listWorkspaces(ListWorkspacesRequest listWorkspacesRequest);

    /**
     * <p>
     * Adds tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws TooManyTagsException
     *         The number of tags exceeds the limit.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @sample AWSIoTTwinMaker.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @sample AWSIoTTwinMaker.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates information in a component type.
     * </p>
     * 
     * @param updateComponentTypeRequest
     * @return Result of the UpdateComponentType operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.UpdateComponentType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/UpdateComponentType"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateComponentTypeResult updateComponentType(UpdateComponentTypeRequest updateComponentTypeRequest);

    /**
     * <p>
     * Updates an entity.
     * </p>
     * 
     * @param updateEntityRequest
     * @return Result of the UpdateEntity operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ConflictException
     *         A conflict occurred.
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.UpdateEntity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/UpdateEntity" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateEntityResult updateEntity(UpdateEntityRequest updateEntityRequest);

    /**
     * <p>
     * Update the pricing plan.
     * </p>
     * 
     * @param updatePricingPlanRequest
     * @return Result of the UpdatePricingPlan operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @sample AWSIoTTwinMaker.UpdatePricingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/UpdatePricingPlan" target="_top">AWS
     *      API Documentation</a>
     */
    UpdatePricingPlanResult updatePricingPlan(UpdatePricingPlanRequest updatePricingPlanRequest);

    /**
     * <p>
     * Updates a scene.
     * </p>
     * 
     * @param updateSceneRequest
     * @return Result of the UpdateScene operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @sample AWSIoTTwinMaker.UpdateScene
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/UpdateScene" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateSceneResult updateScene(UpdateSceneRequest updateSceneRequest);

    /**
     * <p>
     * Updates a workspace.
     * </p>
     * 
     * @param updateWorkspaceRequest
     * @return Result of the UpdateWorkspace operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error has occurred.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ValidationException
     *         Failed
     * @throws ServiceQuotaExceededException
     *         The service quota was exceeded.
     * @sample AWSIoTTwinMaker.UpdateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/UpdateWorkspace" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateWorkspaceResult updateWorkspace(UpdateWorkspaceRequest updateWorkspaceRequest);

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
