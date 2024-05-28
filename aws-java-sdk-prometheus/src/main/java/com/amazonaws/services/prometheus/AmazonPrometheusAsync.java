/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Amazon Managed Service for Prometheus is a serverless, Prometheus-compatible monitoring service for container metrics
 * that makes it easier to securely monitor container environments at scale. With Amazon Managed Service for Prometheus,
 * you can use the same open-source Prometheus data model and query language that you use today to monitor the
 * performance of your containerized workloads, and also enjoy improved scalability, availability, and security without
 * having to manage the underlying infrastructure.
 * </p>
 * <p>
 * For more information about Amazon Managed Service for Prometheus, see the <a
 * href="https://docs.aws.amazon.com/prometheus/latest/userguide/what-is-Amazon-Managed-Service-Prometheus.html">Amazon
 * Managed Service for Prometheus</a> User Guide.
 * </p>
 * <p>
 * Amazon Managed Service for Prometheus includes two APIs.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Use the Amazon Web Services API described in this guide to manage Amazon Managed Service for Prometheus resources,
 * such as workspaces, rule groups, and alert managers.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use the <a href=
 * "https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-APIReference.html#AMP-APIReference-Prometheus-Compatible-Apis"
 * >Prometheus-compatible API</a> to work within your Prometheus workspace.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonPrometheusAsync extends AmazonPrometheus {

    /**
     * <p>
     * The <code>CreateAlertManagerDefinition</code> operation creates the alert manager definition in a workspace. If a
     * workspace already has an alert manager definition, don't use this operation to update it. Instead, use
     * <code>PutAlertManagerDefinition</code>.
     * </p>
     * 
     * @param createAlertManagerDefinitionRequest
     *        Represents the input of a <code>CreateAlertManagerDefinition</code> operation.
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
     * The <code>CreateAlertManagerDefinition</code> operation creates the alert manager definition in a workspace. If a
     * workspace already has an alert manager definition, don't use this operation to update it. Instead, use
     * <code>PutAlertManagerDefinition</code>.
     * </p>
     * 
     * @param createAlertManagerDefinitionRequest
     *        Represents the input of a <code>CreateAlertManagerDefinition</code> operation.
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
     * The <code>CreateLoggingConfiguration</code> operation creates a logging configuration for the workspace. Use this
     * operation to set the CloudWatch log group to which the logs will be published to.
     * </p>
     * 
     * @param createLoggingConfigurationRequest
     *        Represents the input of a <code>CreateLoggingConfiguration</code> operation.
     * @return A Java Future containing the result of the CreateLoggingConfiguration operation returned by the service.
     * @sample AmazonPrometheusAsync.CreateLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateLoggingConfigurationResult> createLoggingConfigurationAsync(
            CreateLoggingConfigurationRequest createLoggingConfigurationRequest);

    /**
     * <p>
     * The <code>CreateLoggingConfiguration</code> operation creates a logging configuration for the workspace. Use this
     * operation to set the CloudWatch log group to which the logs will be published to.
     * </p>
     * 
     * @param createLoggingConfigurationRequest
     *        Represents the input of a <code>CreateLoggingConfiguration</code> operation.
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
     * The <code>CreateRuleGroupsNamespace</code> operation creates a rule groups namespace within a workspace. A rule
     * groups namespace is associated with exactly one rules file. A workspace can have multiple rule groups namespaces.
     * </p>
     * <p>
     * Use this operation only to create new rule groups namespaces. To update an existing rule groups namespace, use
     * <code>PutRuleGroupsNamespace</code>.
     * </p>
     * 
     * @param createRuleGroupsNamespaceRequest
     *        Represents the input of a <code>CreateRuleGroupsNamespace</code> operation.
     * @return A Java Future containing the result of the CreateRuleGroupsNamespace operation returned by the service.
     * @sample AmazonPrometheusAsync.CreateRuleGroupsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateRuleGroupsNamespace" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateRuleGroupsNamespaceResult> createRuleGroupsNamespaceAsync(
            CreateRuleGroupsNamespaceRequest createRuleGroupsNamespaceRequest);

    /**
     * <p>
     * The <code>CreateRuleGroupsNamespace</code> operation creates a rule groups namespace within a workspace. A rule
     * groups namespace is associated with exactly one rules file. A workspace can have multiple rule groups namespaces.
     * </p>
     * <p>
     * Use this operation only to create new rule groups namespaces. To update an existing rule groups namespace, use
     * <code>PutRuleGroupsNamespace</code>.
     * </p>
     * 
     * @param createRuleGroupsNamespaceRequest
     *        Represents the input of a <code>CreateRuleGroupsNamespace</code> operation.
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
     * The <code>CreateScraper</code> operation creates a scraper to collect metrics. A scraper pulls metrics from
     * Prometheus-compatible sources within an Amazon EKS cluster, and sends them to your Amazon Managed Service for
     * Prometheus workspace. You can configure the scraper to control what metrics are collected, and what
     * transformations are applied prior to sending them to your workspace.
     * </p>
     * <p>
     * If needed, an IAM role will be created for you that gives Amazon Managed Service for Prometheus access to the
     * metrics in your cluster. For more information, see <a href=
     * "https://docs.aws.amazon.com/prometheus/latest/userguide/using-service-linked-roles.html#using-service-linked-roles-prom-scraper"
     * >Using roles for scraping metrics from EKS</a> in the <i>Amazon Managed Service for Prometheus User Guide</i>.
     * </p>
     * <p>
     * You cannot update a scraper. If you want to change the configuration of the scraper, create a new scraper and
     * delete the old one.
     * </p>
     * <p>
     * The <code>scrapeConfiguration</code> parameter contains the base64-encoded version of the YAML configuration
     * file.
     * </p>
     * <note>
     * <p>
     * For more information about collectors, including what metrics are collected, and how to configure the scraper,
     * see <a href="https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-collector.html">Amazon Web Services
     * managed collectors</a> in the <i>Amazon Managed Service for Prometheus User Guide</i>.
     * </p>
     * </note>
     * 
     * @param createScraperRequest
     *        Represents the input of a <code>CreateScraper</code> operation.
     * @return A Java Future containing the result of the CreateScraper operation returned by the service.
     * @sample AmazonPrometheusAsync.CreateScraper
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateScraper" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateScraperResult> createScraperAsync(CreateScraperRequest createScraperRequest);

    /**
     * <p>
     * The <code>CreateScraper</code> operation creates a scraper to collect metrics. A scraper pulls metrics from
     * Prometheus-compatible sources within an Amazon EKS cluster, and sends them to your Amazon Managed Service for
     * Prometheus workspace. You can configure the scraper to control what metrics are collected, and what
     * transformations are applied prior to sending them to your workspace.
     * </p>
     * <p>
     * If needed, an IAM role will be created for you that gives Amazon Managed Service for Prometheus access to the
     * metrics in your cluster. For more information, see <a href=
     * "https://docs.aws.amazon.com/prometheus/latest/userguide/using-service-linked-roles.html#using-service-linked-roles-prom-scraper"
     * >Using roles for scraping metrics from EKS</a> in the <i>Amazon Managed Service for Prometheus User Guide</i>.
     * </p>
     * <p>
     * You cannot update a scraper. If you want to change the configuration of the scraper, create a new scraper and
     * delete the old one.
     * </p>
     * <p>
     * The <code>scrapeConfiguration</code> parameter contains the base64-encoded version of the YAML configuration
     * file.
     * </p>
     * <note>
     * <p>
     * For more information about collectors, including what metrics are collected, and how to configure the scraper,
     * see <a href="https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-collector.html">Amazon Web Services
     * managed collectors</a> in the <i>Amazon Managed Service for Prometheus User Guide</i>.
     * </p>
     * </note>
     * 
     * @param createScraperRequest
     *        Represents the input of a <code>CreateScraper</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateScraper operation returned by the service.
     * @sample AmazonPrometheusAsyncHandler.CreateScraper
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateScraper" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateScraperResult> createScraperAsync(CreateScraperRequest createScraperRequest,
            com.amazonaws.handlers.AsyncHandler<CreateScraperRequest, CreateScraperResult> asyncHandler);

    /**
     * <p>
     * Creates a Prometheus workspace. A workspace is a logical space dedicated to the storage and querying of
     * Prometheus metrics. You can have one or more workspaces in each Region in your account.
     * </p>
     * 
     * @param createWorkspaceRequest
     *        Represents the input of a <code>CreateWorkspace</code> operation.
     * @return A Java Future containing the result of the CreateWorkspace operation returned by the service.
     * @sample AmazonPrometheusAsync.CreateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkspaceResult> createWorkspaceAsync(CreateWorkspaceRequest createWorkspaceRequest);

    /**
     * <p>
     * Creates a Prometheus workspace. A workspace is a logical space dedicated to the storage and querying of
     * Prometheus metrics. You can have one or more workspaces in each Region in your account.
     * </p>
     * 
     * @param createWorkspaceRequest
     *        Represents the input of a <code>CreateWorkspace</code> operation.
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
     * Deletes the alert manager definition from a workspace.
     * </p>
     * 
     * @param deleteAlertManagerDefinitionRequest
     *        Represents the input of a <code>DeleteAlertManagerDefinition</code> operation.
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
     * Deletes the alert manager definition from a workspace.
     * </p>
     * 
     * @param deleteAlertManagerDefinitionRequest
     *        Represents the input of a <code>DeleteAlertManagerDefinition</code> operation.
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
     * Deletes the logging configuration for a workspace.
     * </p>
     * 
     * @param deleteLoggingConfigurationRequest
     *        Represents the input of a <code>DeleteLoggingConfiguration</code> operation.
     * @return A Java Future containing the result of the DeleteLoggingConfiguration operation returned by the service.
     * @sample AmazonPrometheusAsync.DeleteLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLoggingConfigurationResult> deleteLoggingConfigurationAsync(
            DeleteLoggingConfigurationRequest deleteLoggingConfigurationRequest);

    /**
     * <p>
     * Deletes the logging configuration for a workspace.
     * </p>
     * 
     * @param deleteLoggingConfigurationRequest
     *        Represents the input of a <code>DeleteLoggingConfiguration</code> operation.
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
     * Deletes one rule groups namespace and its associated rule groups definition.
     * </p>
     * 
     * @param deleteRuleGroupsNamespaceRequest
     *        Represents the input of a <code>DeleteRuleGroupsNamespace</code> operation.
     * @return A Java Future containing the result of the DeleteRuleGroupsNamespace operation returned by the service.
     * @sample AmazonPrometheusAsync.DeleteRuleGroupsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteRuleGroupsNamespace" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRuleGroupsNamespaceResult> deleteRuleGroupsNamespaceAsync(
            DeleteRuleGroupsNamespaceRequest deleteRuleGroupsNamespaceRequest);

    /**
     * <p>
     * Deletes one rule groups namespace and its associated rule groups definition.
     * </p>
     * 
     * @param deleteRuleGroupsNamespaceRequest
     *        Represents the input of a <code>DeleteRuleGroupsNamespace</code> operation.
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
     * The <code>DeleteScraper</code> operation deletes one scraper, and stops any metrics collection that the scraper
     * performs.
     * </p>
     * 
     * @param deleteScraperRequest
     *        Represents the input of a <code>DeleteScraper</code> operation.
     * @return A Java Future containing the result of the DeleteScraper operation returned by the service.
     * @sample AmazonPrometheusAsync.DeleteScraper
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteScraper" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteScraperResult> deleteScraperAsync(DeleteScraperRequest deleteScraperRequest);

    /**
     * <p>
     * The <code>DeleteScraper</code> operation deletes one scraper, and stops any metrics collection that the scraper
     * performs.
     * </p>
     * 
     * @param deleteScraperRequest
     *        Represents the input of a <code>DeleteScraper</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteScraper operation returned by the service.
     * @sample AmazonPrometheusAsyncHandler.DeleteScraper
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteScraper" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteScraperResult> deleteScraperAsync(DeleteScraperRequest deleteScraperRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteScraperRequest, DeleteScraperResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing workspace.
     * </p>
     * <note>
     * <p>
     * When you delete a workspace, the data that has been ingested into it is not immediately deleted. It will be
     * permanently deleted within one month.
     * </p>
     * </note>
     * 
     * @param deleteWorkspaceRequest
     *        Represents the input of a <code>DeleteWorkspace</code> operation.
     * @return A Java Future containing the result of the DeleteWorkspace operation returned by the service.
     * @sample AmazonPrometheusAsync.DeleteWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkspaceResult> deleteWorkspaceAsync(DeleteWorkspaceRequest deleteWorkspaceRequest);

    /**
     * <p>
     * Deletes an existing workspace.
     * </p>
     * <note>
     * <p>
     * When you delete a workspace, the data that has been ingested into it is not immediately deleted. It will be
     * permanently deleted within one month.
     * </p>
     * </note>
     * 
     * @param deleteWorkspaceRequest
     *        Represents the input of a <code>DeleteWorkspace</code> operation.
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
     * Retrieves the full information about the alert manager definition for a workspace.
     * </p>
     * 
     * @param describeAlertManagerDefinitionRequest
     *        Represents the input of a <code>DescribeAlertManagerDefinition</code> operation.
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
     * Retrieves the full information about the alert manager definition for a workspace.
     * </p>
     * 
     * @param describeAlertManagerDefinitionRequest
     *        Represents the input of a <code>DescribeAlertManagerDefinition</code> operation.
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
     * Returns complete information about the current logging configuration of the workspace.
     * </p>
     * 
     * @param describeLoggingConfigurationRequest
     *        Represents the input of a <code>DescribeLoggingConfiguration</code> operation.
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
     * Returns complete information about the current logging configuration of the workspace.
     * </p>
     * 
     * @param describeLoggingConfigurationRequest
     *        Represents the input of a <code>DescribeLoggingConfiguration</code> operation.
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
     * Returns complete information about one rule groups namespace. To retrieve a list of rule groups namespaces, use
     * <code>ListRuleGroupsNamespaces</code>.
     * </p>
     * 
     * @param describeRuleGroupsNamespaceRequest
     *        Represents the input of a <code>DescribeRuleGroupsNamespace</code> operation.
     * @return A Java Future containing the result of the DescribeRuleGroupsNamespace operation returned by the service.
     * @sample AmazonPrometheusAsync.DescribeRuleGroupsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeRuleGroupsNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRuleGroupsNamespaceResult> describeRuleGroupsNamespaceAsync(
            DescribeRuleGroupsNamespaceRequest describeRuleGroupsNamespaceRequest);

    /**
     * <p>
     * Returns complete information about one rule groups namespace. To retrieve a list of rule groups namespaces, use
     * <code>ListRuleGroupsNamespaces</code>.
     * </p>
     * 
     * @param describeRuleGroupsNamespaceRequest
     *        Represents the input of a <code>DescribeRuleGroupsNamespace</code> operation.
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
     * The <code>DescribeScraper</code> operation displays information about an existing scraper.
     * </p>
     * 
     * @param describeScraperRequest
     *        Represents the input of a <code>DescribeScraper</code> operation.
     * @return A Java Future containing the result of the DescribeScraper operation returned by the service.
     * @sample AmazonPrometheusAsync.DescribeScraper
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeScraper" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeScraperResult> describeScraperAsync(DescribeScraperRequest describeScraperRequest);

    /**
     * <p>
     * The <code>DescribeScraper</code> operation displays information about an existing scraper.
     * </p>
     * 
     * @param describeScraperRequest
     *        Represents the input of a <code>DescribeScraper</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeScraper operation returned by the service.
     * @sample AmazonPrometheusAsyncHandler.DescribeScraper
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeScraper" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeScraperResult> describeScraperAsync(DescribeScraperRequest describeScraperRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScraperRequest, DescribeScraperResult> asyncHandler);

    /**
     * <p>
     * Returns information about an existing workspace.
     * </p>
     * 
     * @param describeWorkspaceRequest
     *        Represents the input of a <code>DescribeWorkspace</code> operation.
     * @return A Java Future containing the result of the DescribeWorkspace operation returned by the service.
     * @sample AmazonPrometheusAsync.DescribeWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspaceResult> describeWorkspaceAsync(DescribeWorkspaceRequest describeWorkspaceRequest);

    /**
     * <p>
     * Returns information about an existing workspace.
     * </p>
     * 
     * @param describeWorkspaceRequest
     *        Represents the input of a <code>DescribeWorkspace</code> operation.
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
     * The <code>GetDefaultScraperConfiguration</code> operation returns the default scraper configuration used when
     * Amazon EKS creates a scraper for you.
     * </p>
     * 
     * @param getDefaultScraperConfigurationRequest
     *        Represents the input of a <code>GetDefaultScraperConfiguration</code> operation.
     * @return A Java Future containing the result of the GetDefaultScraperConfiguration operation returned by the
     *         service.
     * @sample AmazonPrometheusAsync.GetDefaultScraperConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/GetDefaultScraperConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDefaultScraperConfigurationResult> getDefaultScraperConfigurationAsync(
            GetDefaultScraperConfigurationRequest getDefaultScraperConfigurationRequest);

    /**
     * <p>
     * The <code>GetDefaultScraperConfiguration</code> operation returns the default scraper configuration used when
     * Amazon EKS creates a scraper for you.
     * </p>
     * 
     * @param getDefaultScraperConfigurationRequest
     *        Represents the input of a <code>GetDefaultScraperConfiguration</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDefaultScraperConfiguration operation returned by the
     *         service.
     * @sample AmazonPrometheusAsyncHandler.GetDefaultScraperConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/GetDefaultScraperConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDefaultScraperConfigurationResult> getDefaultScraperConfigurationAsync(
            GetDefaultScraperConfigurationRequest getDefaultScraperConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetDefaultScraperConfigurationRequest, GetDefaultScraperConfigurationResult> asyncHandler);

    /**
     * <p>
     * Returns a list of rule groups namespaces in a workspace.
     * </p>
     * 
     * @param listRuleGroupsNamespacesRequest
     *        Represents the input of a <code>ListRuleGroupsNamespaces</code> operation.
     * @return A Java Future containing the result of the ListRuleGroupsNamespaces operation returned by the service.
     * @sample AmazonPrometheusAsync.ListRuleGroupsNamespaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ListRuleGroupsNamespaces" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRuleGroupsNamespacesResult> listRuleGroupsNamespacesAsync(ListRuleGroupsNamespacesRequest listRuleGroupsNamespacesRequest);

    /**
     * <p>
     * Returns a list of rule groups namespaces in a workspace.
     * </p>
     * 
     * @param listRuleGroupsNamespacesRequest
     *        Represents the input of a <code>ListRuleGroupsNamespaces</code> operation.
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
     * The <code>ListScrapers</code> operation lists all of the scrapers in your account. This includes scrapers being
     * created or deleted. You can optionally filter the returned list.
     * </p>
     * 
     * @param listScrapersRequest
     *        Represents the input of a <code>ListScrapers</code> operation.
     * @return A Java Future containing the result of the ListScrapers operation returned by the service.
     * @sample AmazonPrometheusAsync.ListScrapers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ListScrapers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListScrapersResult> listScrapersAsync(ListScrapersRequest listScrapersRequest);

    /**
     * <p>
     * The <code>ListScrapers</code> operation lists all of the scrapers in your account. This includes scrapers being
     * created or deleted. You can optionally filter the returned list.
     * </p>
     * 
     * @param listScrapersRequest
     *        Represents the input of a <code>ListScrapers</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListScrapers operation returned by the service.
     * @sample AmazonPrometheusAsyncHandler.ListScrapers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ListScrapers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListScrapersResult> listScrapersAsync(ListScrapersRequest listScrapersRequest,
            com.amazonaws.handlers.AsyncHandler<ListScrapersRequest, ListScrapersResult> asyncHandler);

    /**
     * <p>
     * The <code>ListTagsForResource</code> operation returns the tags that are associated with an Amazon Managed
     * Service for Prometheus resource. Currently, the only resources that can be tagged are workspaces and rule groups
     * namespaces.
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
     * The <code>ListTagsForResource</code> operation returns the tags that are associated with an Amazon Managed
     * Service for Prometheus resource. Currently, the only resources that can be tagged are workspaces and rule groups
     * namespaces.
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
     * Lists all of the Amazon Managed Service for Prometheus workspaces in your account. This includes workspaces being
     * created or deleted.
     * </p>
     * 
     * @param listWorkspacesRequest
     *        Represents the input of a <code>ListWorkspaces</code> operation.
     * @return A Java Future containing the result of the ListWorkspaces operation returned by the service.
     * @sample AmazonPrometheusAsync.ListWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ListWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWorkspacesResult> listWorkspacesAsync(ListWorkspacesRequest listWorkspacesRequest);

    /**
     * <p>
     * Lists all of the Amazon Managed Service for Prometheus workspaces in your account. This includes workspaces being
     * created or deleted.
     * </p>
     * 
     * @param listWorkspacesRequest
     *        Represents the input of a <code>ListWorkspaces</code> operation.
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
     * Updates an existing alert manager definition in a workspace. If the workspace does not already have an alert
     * manager definition, don't use this operation to create it. Instead, use <code>CreateAlertManagerDefinition</code>
     * .
     * </p>
     * 
     * @param putAlertManagerDefinitionRequest
     *        Represents the input of a <code>PutAlertManagerDefinition</code> operation.
     * @return A Java Future containing the result of the PutAlertManagerDefinition operation returned by the service.
     * @sample AmazonPrometheusAsync.PutAlertManagerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/PutAlertManagerDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutAlertManagerDefinitionResult> putAlertManagerDefinitionAsync(
            PutAlertManagerDefinitionRequest putAlertManagerDefinitionRequest);

    /**
     * <p>
     * Updates an existing alert manager definition in a workspace. If the workspace does not already have an alert
     * manager definition, don't use this operation to create it. Instead, use <code>CreateAlertManagerDefinition</code>
     * .
     * </p>
     * 
     * @param putAlertManagerDefinitionRequest
     *        Represents the input of a <code>PutAlertManagerDefinition</code> operation.
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
     * Updates an existing rule groups namespace within a workspace. A rule groups namespace is associated with exactly
     * one rules file. A workspace can have multiple rule groups namespaces.
     * </p>
     * <p>
     * Use this operation only to update existing rule groups namespaces. To create a new rule groups namespace, use
     * <code>CreateRuleGroupsNamespace</code>.
     * </p>
     * <p>
     * You can't use this operation to add tags to an existing rule groups namespace. Instead, use
     * <code>TagResource</code>.
     * </p>
     * 
     * @param putRuleGroupsNamespaceRequest
     *        Represents the input of a <code>PutRuleGroupsNamespace</code> operation.
     * @return A Java Future containing the result of the PutRuleGroupsNamespace operation returned by the service.
     * @sample AmazonPrometheusAsync.PutRuleGroupsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/PutRuleGroupsNamespace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutRuleGroupsNamespaceResult> putRuleGroupsNamespaceAsync(PutRuleGroupsNamespaceRequest putRuleGroupsNamespaceRequest);

    /**
     * <p>
     * Updates an existing rule groups namespace within a workspace. A rule groups namespace is associated with exactly
     * one rules file. A workspace can have multiple rule groups namespaces.
     * </p>
     * <p>
     * Use this operation only to update existing rule groups namespaces. To create a new rule groups namespace, use
     * <code>CreateRuleGroupsNamespace</code>.
     * </p>
     * <p>
     * You can't use this operation to add tags to an existing rule groups namespace. Instead, use
     * <code>TagResource</code>.
     * </p>
     * 
     * @param putRuleGroupsNamespaceRequest
     *        Represents the input of a <code>PutRuleGroupsNamespace</code> operation.
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
     * The <code>TagResource</code> operation associates tags with an Amazon Managed Service for Prometheus resource.
     * The only resources that can be tagged are workspaces and rule groups namespaces.
     * </p>
     * <p>
     * If you specify a new tag key for the resource, this tag is appended to the list of tags associated with the
     * resource. If you specify a tag key that is already associated with the resource, the new tag value that you
     * specify replaces the previous value for that tag.
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
     * The <code>TagResource</code> operation associates tags with an Amazon Managed Service for Prometheus resource.
     * The only resources that can be tagged are workspaces and rule groups namespaces.
     * </p>
     * <p>
     * If you specify a new tag key for the resource, this tag is appended to the list of tags associated with the
     * resource. If you specify a tag key that is already associated with the resource, the new tag value that you
     * specify replaces the previous value for that tag.
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
     * Removes the specified tags from an Amazon Managed Service for Prometheus resource. The only resources that can be
     * tagged are workspaces and rule groups namespaces.
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
     * Removes the specified tags from an Amazon Managed Service for Prometheus resource. The only resources that can be
     * tagged are workspaces and rule groups namespaces.
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
     * Updates the log group ARN or the workspace ID of the current logging configuration.
     * </p>
     * 
     * @param updateLoggingConfigurationRequest
     *        Represents the input of an <code>UpdateLoggingConfiguration</code> operation.
     * @return A Java Future containing the result of the UpdateLoggingConfiguration operation returned by the service.
     * @sample AmazonPrometheusAsync.UpdateLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/UpdateLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLoggingConfigurationResult> updateLoggingConfigurationAsync(
            UpdateLoggingConfigurationRequest updateLoggingConfigurationRequest);

    /**
     * <p>
     * Updates the log group ARN or the workspace ID of the current logging configuration.
     * </p>
     * 
     * @param updateLoggingConfigurationRequest
     *        Represents the input of an <code>UpdateLoggingConfiguration</code> operation.
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
     * Updates the alias of an existing workspace.
     * </p>
     * 
     * @param updateWorkspaceAliasRequest
     *        Represents the input of an <code>UpdateWorkspaceAlias</code> operation.
     * @return A Java Future containing the result of the UpdateWorkspaceAlias operation returned by the service.
     * @sample AmazonPrometheusAsync.UpdateWorkspaceAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/UpdateWorkspaceAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkspaceAliasResult> updateWorkspaceAliasAsync(UpdateWorkspaceAliasRequest updateWorkspaceAliasRequest);

    /**
     * <p>
     * Updates the alias of an existing workspace.
     * </p>
     * 
     * @param updateWorkspaceAliasRequest
     *        Represents the input of an <code>UpdateWorkspaceAlias</code> operation.
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
