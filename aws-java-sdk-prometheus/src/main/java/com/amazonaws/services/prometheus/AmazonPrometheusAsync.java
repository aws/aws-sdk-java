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
     * Create an alert manager definition.
     * </p>
     * 
     * @param createAlertManagerDefinitionRequest
     *        Represents the input of a CreateAlertManagerDefinition operation.
     * @return A Java Future containing the result of the CreateAlertManagerDefinition operation returned by the
     *         service.
     * @sample AmazonPrometheusAsync.CreateAlertManagerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateAlertManagerDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAlertManagerDefinitionResult> createAlertManagerDefinitionAsync(
            CreateAlertManagerDefinitionRequest createAlertManagerDefinitionRequest);

    /**
     * <p>
     * Create an alert manager definition.
     * </p>
     * 
     * @param createAlertManagerDefinitionRequest
     *        Represents the input of a CreateAlertManagerDefinition operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAlertManagerDefinition operation returned by the
     *         service.
     * @sample AmazonPrometheusAsyncHandler.CreateAlertManagerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateAlertManagerDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAlertManagerDefinitionResult> createAlertManagerDefinitionAsync(
            CreateAlertManagerDefinitionRequest createAlertManagerDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAlertManagerDefinitionRequest, CreateAlertManagerDefinitionResult> asyncHandler);

    /**
     * <p>
     * Create logging configuration.
     * </p>
     * 
     * @param createLoggingConfigurationRequest
     *        Represents the input of a CreateLoggingConfiguration operation.
     * @return A Java Future containing the result of the CreateLoggingConfiguration operation returned by the service.
     * @sample AmazonPrometheusAsync.CreateLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateLoggingConfigurationResult> createLoggingConfigurationAsync(
            CreateLoggingConfigurationRequest createLoggingConfigurationRequest);

    /**
     * <p>
     * Create logging configuration.
     * </p>
     * 
     * @param createLoggingConfigurationRequest
     *        Represents the input of a CreateLoggingConfiguration operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLoggingConfiguration operation returned by the service.
     * @sample AmazonPrometheusAsyncHandler.CreateLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateLoggingConfigurationResult> createLoggingConfigurationAsync(
            CreateLoggingConfigurationRequest createLoggingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLoggingConfigurationRequest, CreateLoggingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Create a rule group namespace.
     * </p>
     * 
     * @param createRuleGroupsNamespaceRequest
     *        Represents the input of a CreateRuleGroupsNamespace operation.
     * @return A Java Future containing the result of the CreateRuleGroupsNamespace operation returned by the service.
     * @sample AmazonPrometheusAsync.CreateRuleGroupsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateRuleGroupsNamespace" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateRuleGroupsNamespaceResult> createRuleGroupsNamespaceAsync(
            CreateRuleGroupsNamespaceRequest createRuleGroupsNamespaceRequest);

    /**
     * <p>
     * Create a rule group namespace.
     * </p>
     * 
     * @param createRuleGroupsNamespaceRequest
     *        Represents the input of a CreateRuleGroupsNamespace operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRuleGroupsNamespace operation returned by the service.
     * @sample AmazonPrometheusAsyncHandler.CreateRuleGroupsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateRuleGroupsNamespace" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateRuleGroupsNamespaceResult> createRuleGroupsNamespaceAsync(
            CreateRuleGroupsNamespaceRequest createRuleGroupsNamespaceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRuleGroupsNamespaceRequest, CreateRuleGroupsNamespaceResult> asyncHandler);

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
     * Deletes an alert manager definition.
     * </p>
     * 
     * @param deleteAlertManagerDefinitionRequest
     *        Represents the input of a DeleteAlertManagerDefinition operation.
     * @return A Java Future containing the result of the DeleteAlertManagerDefinition operation returned by the
     *         service.
     * @sample AmazonPrometheusAsync.DeleteAlertManagerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteAlertManagerDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAlertManagerDefinitionResult> deleteAlertManagerDefinitionAsync(
            DeleteAlertManagerDefinitionRequest deleteAlertManagerDefinitionRequest);

    /**
     * <p>
     * Deletes an alert manager definition.
     * </p>
     * 
     * @param deleteAlertManagerDefinitionRequest
     *        Represents the input of a DeleteAlertManagerDefinition operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAlertManagerDefinition operation returned by the
     *         service.
     * @sample AmazonPrometheusAsyncHandler.DeleteAlertManagerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteAlertManagerDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAlertManagerDefinitionResult> deleteAlertManagerDefinitionAsync(
            DeleteAlertManagerDefinitionRequest deleteAlertManagerDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAlertManagerDefinitionRequest, DeleteAlertManagerDefinitionResult> asyncHandler);

    /**
     * <p>
     * Delete logging configuration.
     * </p>
     * 
     * @param deleteLoggingConfigurationRequest
     *        Represents the input of a DeleteLoggingConfiguration operation.
     * @return A Java Future containing the result of the DeleteLoggingConfiguration operation returned by the service.
     * @sample AmazonPrometheusAsync.DeleteLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLoggingConfigurationResult> deleteLoggingConfigurationAsync(
            DeleteLoggingConfigurationRequest deleteLoggingConfigurationRequest);

    /**
     * <p>
     * Delete logging configuration.
     * </p>
     * 
     * @param deleteLoggingConfigurationRequest
     *        Represents the input of a DeleteLoggingConfiguration operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLoggingConfiguration operation returned by the service.
     * @sample AmazonPrometheusAsyncHandler.DeleteLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLoggingConfigurationResult> deleteLoggingConfigurationAsync(
            DeleteLoggingConfigurationRequest deleteLoggingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLoggingConfigurationRequest, DeleteLoggingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Delete a rule groups namespace.
     * </p>
     * 
     * @param deleteRuleGroupsNamespaceRequest
     *        Represents the input of a DeleteRuleGroupsNamespace operation.
     * @return A Java Future containing the result of the DeleteRuleGroupsNamespace operation returned by the service.
     * @sample AmazonPrometheusAsync.DeleteRuleGroupsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteRuleGroupsNamespace" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRuleGroupsNamespaceResult> deleteRuleGroupsNamespaceAsync(
            DeleteRuleGroupsNamespaceRequest deleteRuleGroupsNamespaceRequest);

    /**
     * <p>
     * Delete a rule groups namespace.
     * </p>
     * 
     * @param deleteRuleGroupsNamespaceRequest
     *        Represents the input of a DeleteRuleGroupsNamespace operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRuleGroupsNamespace operation returned by the service.
     * @sample AmazonPrometheusAsyncHandler.DeleteRuleGroupsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteRuleGroupsNamespace" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRuleGroupsNamespaceResult> deleteRuleGroupsNamespaceAsync(
            DeleteRuleGroupsNamespaceRequest deleteRuleGroupsNamespaceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRuleGroupsNamespaceRequest, DeleteRuleGroupsNamespaceResult> asyncHandler);

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
     * Describes an alert manager definition.
     * </p>
     * 
     * @param describeAlertManagerDefinitionRequest
     *        Represents the input of a DescribeAlertManagerDefinition operation.
     * @return A Java Future containing the result of the DescribeAlertManagerDefinition operation returned by the
     *         service.
     * @sample AmazonPrometheusAsync.DescribeAlertManagerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeAlertManagerDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAlertManagerDefinitionResult> describeAlertManagerDefinitionAsync(
            DescribeAlertManagerDefinitionRequest describeAlertManagerDefinitionRequest);

    /**
     * <p>
     * Describes an alert manager definition.
     * </p>
     * 
     * @param describeAlertManagerDefinitionRequest
     *        Represents the input of a DescribeAlertManagerDefinition operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAlertManagerDefinition operation returned by the
     *         service.
     * @sample AmazonPrometheusAsyncHandler.DescribeAlertManagerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeAlertManagerDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAlertManagerDefinitionResult> describeAlertManagerDefinitionAsync(
            DescribeAlertManagerDefinitionRequest describeAlertManagerDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAlertManagerDefinitionRequest, DescribeAlertManagerDefinitionResult> asyncHandler);

    /**
     * <p>
     * Describes logging configuration.
     * </p>
     * 
     * @param describeLoggingConfigurationRequest
     *        Represents the input of a DescribeLoggingConfiguration operation.
     * @return A Java Future containing the result of the DescribeLoggingConfiguration operation returned by the
     *         service.
     * @sample AmazonPrometheusAsync.DescribeLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoggingConfigurationResult> describeLoggingConfigurationAsync(
            DescribeLoggingConfigurationRequest describeLoggingConfigurationRequest);

    /**
     * <p>
     * Describes logging configuration.
     * </p>
     * 
     * @param describeLoggingConfigurationRequest
     *        Represents the input of a DescribeLoggingConfiguration operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLoggingConfiguration operation returned by the
     *         service.
     * @sample AmazonPrometheusAsyncHandler.DescribeLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoggingConfigurationResult> describeLoggingConfigurationAsync(
            DescribeLoggingConfigurationRequest describeLoggingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLoggingConfigurationRequest, DescribeLoggingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Describe a rule groups namespace.
     * </p>
     * 
     * @param describeRuleGroupsNamespaceRequest
     *        Represents the input of a DescribeRuleGroupsNamespace operation.
     * @return A Java Future containing the result of the DescribeRuleGroupsNamespace operation returned by the service.
     * @sample AmazonPrometheusAsync.DescribeRuleGroupsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeRuleGroupsNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRuleGroupsNamespaceResult> describeRuleGroupsNamespaceAsync(
            DescribeRuleGroupsNamespaceRequest describeRuleGroupsNamespaceRequest);

    /**
     * <p>
     * Describe a rule groups namespace.
     * </p>
     * 
     * @param describeRuleGroupsNamespaceRequest
     *        Represents the input of a DescribeRuleGroupsNamespace operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRuleGroupsNamespace operation returned by the service.
     * @sample AmazonPrometheusAsyncHandler.DescribeRuleGroupsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeRuleGroupsNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRuleGroupsNamespaceResult> describeRuleGroupsNamespaceAsync(
            DescribeRuleGroupsNamespaceRequest describeRuleGroupsNamespaceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRuleGroupsNamespaceRequest, DescribeRuleGroupsNamespaceResult> asyncHandler);

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
     * Lists rule groups namespaces.
     * </p>
     * 
     * @param listRuleGroupsNamespacesRequest
     *        Represents the input of a ListRuleGroupsNamespaces operation.
     * @return A Java Future containing the result of the ListRuleGroupsNamespaces operation returned by the service.
     * @sample AmazonPrometheusAsync.ListRuleGroupsNamespaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ListRuleGroupsNamespaces" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRuleGroupsNamespacesResult> listRuleGroupsNamespacesAsync(ListRuleGroupsNamespacesRequest listRuleGroupsNamespacesRequest);

    /**
     * <p>
     * Lists rule groups namespaces.
     * </p>
     * 
     * @param listRuleGroupsNamespacesRequest
     *        Represents the input of a ListRuleGroupsNamespaces operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRuleGroupsNamespaces operation returned by the service.
     * @sample AmazonPrometheusAsyncHandler.ListRuleGroupsNamespaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ListRuleGroupsNamespaces" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRuleGroupsNamespacesResult> listRuleGroupsNamespacesAsync(ListRuleGroupsNamespacesRequest listRuleGroupsNamespacesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRuleGroupsNamespacesRequest, ListRuleGroupsNamespacesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags you have assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonPrometheusAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags you have assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonPrometheusAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

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
     * Update an alert manager definition.
     * </p>
     * 
     * @param putAlertManagerDefinitionRequest
     *        Represents the input of a PutAlertManagerDefinition operation.
     * @return A Java Future containing the result of the PutAlertManagerDefinition operation returned by the service.
     * @sample AmazonPrometheusAsync.PutAlertManagerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/PutAlertManagerDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutAlertManagerDefinitionResult> putAlertManagerDefinitionAsync(
            PutAlertManagerDefinitionRequest putAlertManagerDefinitionRequest);

    /**
     * <p>
     * Update an alert manager definition.
     * </p>
     * 
     * @param putAlertManagerDefinitionRequest
     *        Represents the input of a PutAlertManagerDefinition operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAlertManagerDefinition operation returned by the service.
     * @sample AmazonPrometheusAsyncHandler.PutAlertManagerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/PutAlertManagerDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutAlertManagerDefinitionResult> putAlertManagerDefinitionAsync(
            PutAlertManagerDefinitionRequest putAlertManagerDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<PutAlertManagerDefinitionRequest, PutAlertManagerDefinitionResult> asyncHandler);

    /**
     * <p>
     * Update a rule groups namespace.
     * </p>
     * 
     * @param putRuleGroupsNamespaceRequest
     *        Represents the input of a PutRuleGroupsNamespace operation.
     * @return A Java Future containing the result of the PutRuleGroupsNamespace operation returned by the service.
     * @sample AmazonPrometheusAsync.PutRuleGroupsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/PutRuleGroupsNamespace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutRuleGroupsNamespaceResult> putRuleGroupsNamespaceAsync(PutRuleGroupsNamespaceRequest putRuleGroupsNamespaceRequest);

    /**
     * <p>
     * Update a rule groups namespace.
     * </p>
     * 
     * @param putRuleGroupsNamespaceRequest
     *        Represents the input of a PutRuleGroupsNamespace operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutRuleGroupsNamespace operation returned by the service.
     * @sample AmazonPrometheusAsyncHandler.PutRuleGroupsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/PutRuleGroupsNamespace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutRuleGroupsNamespaceResult> putRuleGroupsNamespaceAsync(PutRuleGroupsNamespaceRequest putRuleGroupsNamespaceRequest,
            com.amazonaws.handlers.AsyncHandler<PutRuleGroupsNamespaceRequest, PutRuleGroupsNamespaceResult> asyncHandler);

    /**
     * <p>
     * Creates tags for the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonPrometheusAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Creates tags for the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonPrometheusAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Deletes tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonPrometheusAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Deletes tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonPrometheusAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Update logging configuration.
     * </p>
     * 
     * @param updateLoggingConfigurationRequest
     *        Represents the input of an UpdateLoggingConfiguration operation.
     * @return A Java Future containing the result of the UpdateLoggingConfiguration operation returned by the service.
     * @sample AmazonPrometheusAsync.UpdateLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/UpdateLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLoggingConfigurationResult> updateLoggingConfigurationAsync(
            UpdateLoggingConfigurationRequest updateLoggingConfigurationRequest);

    /**
     * <p>
     * Update logging configuration.
     * </p>
     * 
     * @param updateLoggingConfigurationRequest
     *        Represents the input of an UpdateLoggingConfiguration operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLoggingConfiguration operation returned by the service.
     * @sample AmazonPrometheusAsyncHandler.UpdateLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/UpdateLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLoggingConfigurationResult> updateLoggingConfigurationAsync(
            UpdateLoggingConfigurationRequest updateLoggingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLoggingConfigurationRequest, UpdateLoggingConfigurationResult> asyncHandler);

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
