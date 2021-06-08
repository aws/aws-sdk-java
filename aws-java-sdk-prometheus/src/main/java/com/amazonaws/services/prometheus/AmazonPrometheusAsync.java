/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.prometheus.model.*;

/**
 * Interface for accessing Amazon Prometheus Service asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.prometheus.AbstractAmazonPrometheusAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Managed Service for Prometheus
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonPrometheusAsync extends AmazonPrometheus {

    /**
     * <p>
     * Creates a new AMP workspace.
     * </p>
     * 
     * @param createWorkspaceRequest
     *        Represents the input of a CreateWorkspace operation.
     * @return A Java Future containing the result of the CreateWorkspace operation returned by the service.
     * @sample AmazonPrometheusAsync.CreateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkspaceResult> createWorkspaceAsync(CreateWorkspaceRequest createWorkspaceRequest);

    /**
     * <p>
     * Creates a new AMP workspace.
     * </p>
     * 
     * @param createWorkspaceRequest
     *        Represents the input of a CreateWorkspace operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWorkspace operation returned by the service.
     * @sample AmazonPrometheusAsyncHandler.CreateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkspaceResult> createWorkspaceAsync(CreateWorkspaceRequest createWorkspaceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWorkspaceRequest, CreateWorkspaceResult> asyncHandler);

    /**
     * <p>
     * Deletes an AMP workspace.
     * </p>
     * 
     * @param deleteWorkspaceRequest
     *        Represents the input of a DeleteWorkspace operation.
     * @return A Java Future containing the result of the DeleteWorkspace operation returned by the service.
     * @sample AmazonPrometheusAsync.DeleteWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkspaceResult> deleteWorkspaceAsync(DeleteWorkspaceRequest deleteWorkspaceRequest);

    /**
     * <p>
     * Deletes an AMP workspace.
     * </p>
     * 
     * @param deleteWorkspaceRequest
     *        Represents the input of a DeleteWorkspace operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWorkspace operation returned by the service.
     * @sample AmazonPrometheusAsyncHandler.DeleteWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkspaceResult> deleteWorkspaceAsync(DeleteWorkspaceRequest deleteWorkspaceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkspaceRequest, DeleteWorkspaceResult> asyncHandler);

    /**
     * <p>
     * Describes an existing AMP workspace.
     * </p>
     * 
     * @param describeWorkspaceRequest
     *        Represents the input of a DescribeWorkspace operation.
     * @return A Java Future containing the result of the DescribeWorkspace operation returned by the service.
     * @sample AmazonPrometheusAsync.DescribeWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspaceResult> describeWorkspaceAsync(DescribeWorkspaceRequest describeWorkspaceRequest);

    /**
     * <p>
     * Describes an existing AMP workspace.
     * </p>
     * 
     * @param describeWorkspaceRequest
     *        Represents the input of a DescribeWorkspace operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWorkspace operation returned by the service.
     * @sample AmazonPrometheusAsyncHandler.DescribeWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspaceResult> describeWorkspaceAsync(DescribeWorkspaceRequest describeWorkspaceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceRequest, DescribeWorkspaceResult> asyncHandler);

    /**
     * <p>
     * Lists all AMP workspaces, including workspaces being created or deleted.
     * </p>
     * 
     * @param listWorkspacesRequest
     *        Represents the input of a ListWorkspaces operation.
     * @return A Java Future containing the result of the ListWorkspaces operation returned by the service.
     * @sample AmazonPrometheusAsync.ListWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ListWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWorkspacesResult> listWorkspacesAsync(ListWorkspacesRequest listWorkspacesRequest);

    /**
     * <p>
     * Lists all AMP workspaces, including workspaces being created or deleted.
     * </p>
     * 
     * @param listWorkspacesRequest
     *        Represents the input of a ListWorkspaces operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWorkspaces operation returned by the service.
     * @sample AmazonPrometheusAsyncHandler.ListWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ListWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWorkspacesResult> listWorkspacesAsync(ListWorkspacesRequest listWorkspacesRequest,
            com.amazonaws.handlers.AsyncHandler<ListWorkspacesRequest, ListWorkspacesResult> asyncHandler);

    /**
     * <p>
     * Updates an AMP workspace alias.
     * </p>
     * 
     * @param updateWorkspaceAliasRequest
     *        Represents the input of an UpdateWorkspaceAlias operation.
     * @return A Java Future containing the result of the UpdateWorkspaceAlias operation returned by the service.
     * @sample AmazonPrometheusAsync.UpdateWorkspaceAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/UpdateWorkspaceAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkspaceAliasResult> updateWorkspaceAliasAsync(UpdateWorkspaceAliasRequest updateWorkspaceAliasRequest);

    /**
     * <p>
     * Updates an AMP workspace alias.
     * </p>
     * 
     * @param updateWorkspaceAliasRequest
     *        Represents the input of an UpdateWorkspaceAlias operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWorkspaceAlias operation returned by the service.
     * @sample AmazonPrometheusAsyncHandler.UpdateWorkspaceAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/UpdateWorkspaceAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkspaceAliasResult> updateWorkspaceAliasAsync(UpdateWorkspaceAliasRequest updateWorkspaceAliasRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkspaceAliasRequest, UpdateWorkspaceAliasResult> asyncHandler);

}
