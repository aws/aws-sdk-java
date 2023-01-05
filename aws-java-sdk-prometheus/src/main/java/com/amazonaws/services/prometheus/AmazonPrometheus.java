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
package com.amazonaws.services.prometheus;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.prometheus.model.*;
import com.amazonaws.services.prometheus.waiters.AmazonPrometheusWaiters;

/**
 * Interface for accessing Amazon Prometheus Service.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.prometheus.AbstractAmazonPrometheus} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Managed Service for Prometheus
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonPrometheus {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "aps";

    /**
     * <p>
     * Create an alert manager definition.
     * </p>
     * 
     * @param createAlertManagerDefinitionRequest
     *        Represents the input of a CreateAlertManagerDefinition operation.
     * @return Result of the CreateAlertManagerDefinition operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @sample AmazonPrometheus.CreateAlertManagerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateAlertManagerDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAlertManagerDefinitionResult createAlertManagerDefinition(CreateAlertManagerDefinitionRequest createAlertManagerDefinitionRequest);

    /**
     * <p>
     * Create logging configuration.
     * </p>
     * 
     * @param createLoggingConfigurationRequest
     *        Represents the input of a CreateLoggingConfiguration operation.
     * @return Result of the CreateLoggingConfiguration operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.CreateLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    CreateLoggingConfigurationResult createLoggingConfiguration(CreateLoggingConfigurationRequest createLoggingConfigurationRequest);

    /**
     * <p>
     * Create a rule group namespace.
     * </p>
     * 
     * @param createRuleGroupsNamespaceRequest
     *        Represents the input of a CreateRuleGroupsNamespace operation.
     * @return Result of the CreateRuleGroupsNamespace operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @sample AmazonPrometheus.CreateRuleGroupsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateRuleGroupsNamespace" target="_top">AWS
     *      API Documentation</a>
     */
    CreateRuleGroupsNamespaceResult createRuleGroupsNamespace(CreateRuleGroupsNamespaceRequest createRuleGroupsNamespaceRequest);

    /**
     * <p>
     * Creates a new AMP workspace.
     * </p>
     * 
     * @param createWorkspaceRequest
     *        Represents the input of a CreateWorkspace operation.
     * @return Result of the CreateWorkspace operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @sample AmazonPrometheus.CreateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    CreateWorkspaceResult createWorkspace(CreateWorkspaceRequest createWorkspaceRequest);

    /**
     * <p>
     * Deletes an alert manager definition.
     * </p>
     * 
     * @param deleteAlertManagerDefinitionRequest
     *        Represents the input of a DeleteAlertManagerDefinition operation.
     * @return Result of the DeleteAlertManagerDefinition operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.DeleteAlertManagerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteAlertManagerDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAlertManagerDefinitionResult deleteAlertManagerDefinition(DeleteAlertManagerDefinitionRequest deleteAlertManagerDefinitionRequest);

    /**
     * <p>
     * Delete logging configuration.
     * </p>
     * 
     * @param deleteLoggingConfigurationRequest
     *        Represents the input of a DeleteLoggingConfiguration operation.
     * @return Result of the DeleteLoggingConfiguration operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.DeleteLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteLoggingConfigurationResult deleteLoggingConfiguration(DeleteLoggingConfigurationRequest deleteLoggingConfigurationRequest);

    /**
     * <p>
     * Delete a rule groups namespace.
     * </p>
     * 
     * @param deleteRuleGroupsNamespaceRequest
     *        Represents the input of a DeleteRuleGroupsNamespace operation.
     * @return Result of the DeleteRuleGroupsNamespace operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.DeleteRuleGroupsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteRuleGroupsNamespace" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteRuleGroupsNamespaceResult deleteRuleGroupsNamespace(DeleteRuleGroupsNamespaceRequest deleteRuleGroupsNamespaceRequest);

    /**
     * <p>
     * Deletes an AMP workspace.
     * </p>
     * 
     * @param deleteWorkspaceRequest
     *        Represents the input of a DeleteWorkspace operation.
     * @return Result of the DeleteWorkspace operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.DeleteWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteWorkspaceResult deleteWorkspace(DeleteWorkspaceRequest deleteWorkspaceRequest);

    /**
     * <p>
     * Describes an alert manager definition.
     * </p>
     * 
     * @param describeAlertManagerDefinitionRequest
     *        Represents the input of a DescribeAlertManagerDefinition operation.
     * @return Result of the DescribeAlertManagerDefinition operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.DescribeAlertManagerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeAlertManagerDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAlertManagerDefinitionResult describeAlertManagerDefinition(DescribeAlertManagerDefinitionRequest describeAlertManagerDefinitionRequest);

    /**
     * <p>
     * Describes logging configuration.
     * </p>
     * 
     * @param describeLoggingConfigurationRequest
     *        Represents the input of a DescribeLoggingConfiguration operation.
     * @return Result of the DescribeLoggingConfiguration operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.DescribeLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeLoggingConfigurationResult describeLoggingConfiguration(DescribeLoggingConfigurationRequest describeLoggingConfigurationRequest);

    /**
     * <p>
     * Describe a rule groups namespace.
     * </p>
     * 
     * @param describeRuleGroupsNamespaceRequest
     *        Represents the input of a DescribeRuleGroupsNamespace operation.
     * @return Result of the DescribeRuleGroupsNamespace operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.DescribeRuleGroupsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeRuleGroupsNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeRuleGroupsNamespaceResult describeRuleGroupsNamespace(DescribeRuleGroupsNamespaceRequest describeRuleGroupsNamespaceRequest);

    /**
     * <p>
     * Describes an existing AMP workspace.
     * </p>
     * 
     * @param describeWorkspaceRequest
     *        Represents the input of a DescribeWorkspace operation.
     * @return Result of the DescribeWorkspace operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.DescribeWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeWorkspaceResult describeWorkspace(DescribeWorkspaceRequest describeWorkspaceRequest);

    /**
     * <p>
     * Lists rule groups namespaces.
     * </p>
     * 
     * @param listRuleGroupsNamespacesRequest
     *        Represents the input of a ListRuleGroupsNamespaces operation.
     * @return Result of the ListRuleGroupsNamespaces operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.ListRuleGroupsNamespaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ListRuleGroupsNamespaces" target="_top">AWS
     *      API Documentation</a>
     */
    ListRuleGroupsNamespacesResult listRuleGroupsNamespaces(ListRuleGroupsNamespacesRequest listRuleGroupsNamespacesRequest);

    /**
     * <p>
     * Lists the tags you have assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all AMP workspaces, including workspaces being created or deleted.
     * </p>
     * 
     * @param listWorkspacesRequest
     *        Represents the input of a ListWorkspaces operation.
     * @return Result of the ListWorkspaces operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.ListWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ListWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    ListWorkspacesResult listWorkspaces(ListWorkspacesRequest listWorkspacesRequest);

    /**
     * <p>
     * Update an alert manager definition.
     * </p>
     * 
     * @param putAlertManagerDefinitionRequest
     *        Represents the input of a PutAlertManagerDefinition operation.
     * @return Result of the PutAlertManagerDefinition operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @sample AmazonPrometheus.PutAlertManagerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/PutAlertManagerDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    PutAlertManagerDefinitionResult putAlertManagerDefinition(PutAlertManagerDefinitionRequest putAlertManagerDefinitionRequest);

    /**
     * <p>
     * Update a rule groups namespace.
     * </p>
     * 
     * @param putRuleGroupsNamespaceRequest
     *        Represents the input of a PutRuleGroupsNamespace operation.
     * @return Result of the PutRuleGroupsNamespace operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @sample AmazonPrometheus.PutRuleGroupsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/PutRuleGroupsNamespace" target="_top">AWS API
     *      Documentation</a>
     */
    PutRuleGroupsNamespaceResult putRuleGroupsNamespace(PutRuleGroupsNamespaceRequest putRuleGroupsNamespaceRequest);

    /**
     * <p>
     * Creates tags for the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Deletes tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Update logging configuration.
     * </p>
     * 
     * @param updateLoggingConfigurationRequest
     *        Represents the input of an UpdateLoggingConfiguration operation.
     * @return Result of the UpdateLoggingConfiguration operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.UpdateLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/UpdateLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateLoggingConfigurationResult updateLoggingConfiguration(UpdateLoggingConfigurationRequest updateLoggingConfigurationRequest);

    /**
     * <p>
     * Updates an AMP workspace alias.
     * </p>
     * 
     * @param updateWorkspaceAliasRequest
     *        Represents the input of an UpdateWorkspaceAlias operation.
     * @return Result of the UpdateWorkspaceAlias operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @sample AmazonPrometheus.UpdateWorkspaceAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/UpdateWorkspaceAlias" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateWorkspaceAliasResult updateWorkspaceAlias(UpdateWorkspaceAliasRequest updateWorkspaceAliasRequest);

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

    AmazonPrometheusWaiters waiters();

}
