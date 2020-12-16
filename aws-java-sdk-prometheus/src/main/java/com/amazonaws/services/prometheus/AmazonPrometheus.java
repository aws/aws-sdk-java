/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * Deletes an AMP workspace.
     * </p>
     * 
     * @param deleteWorkspaceRequest
     *        Represents the input of a DeleteWorkspace operation.
     * @return Result of the DeleteWorkspace operation returned by the service.
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
     * @sample AmazonPrometheus.DeleteWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteWorkspaceResult deleteWorkspace(DeleteWorkspaceRequest deleteWorkspaceRequest);

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

}
