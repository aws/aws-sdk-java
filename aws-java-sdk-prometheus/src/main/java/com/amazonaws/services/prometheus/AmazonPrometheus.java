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
     * The <code>CreateAlertManagerDefinition</code> operation creates the alert manager definition in a workspace. If a
     * workspace already has an alert manager definition, don't use this operation to update it. Instead, use
     * <code>PutAlertManagerDefinition</code>.
     * </p>
     * 
     * @param createAlertManagerDefinitionRequest
     *        Represents the input of a <code>CreateAlertManagerDefinition</code> operation.
     * @return Result of the CreateAlertManagerDefinition operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request would cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws ServiceQuotaExceededException
     *         Completing the request would cause a service quota to be exceeded.
     * @sample AmazonPrometheus.CreateAlertManagerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateAlertManagerDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAlertManagerDefinitionResult createAlertManagerDefinition(CreateAlertManagerDefinitionRequest createAlertManagerDefinitionRequest);

    /**
     * <p>
     * The <code>CreateLoggingConfiguration</code> operation creates a logging configuration for the workspace. Use this
     * operation to set the CloudWatch log group to which the logs will be published to.
     * </p>
     * 
     * @param createLoggingConfigurationRequest
     *        Represents the input of a <code>CreateLoggingConfiguration</code> operation.
     * @return Result of the CreateLoggingConfiguration operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AmazonPrometheus.CreateLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    CreateLoggingConfigurationResult createLoggingConfiguration(CreateLoggingConfigurationRequest createLoggingConfigurationRequest);

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
     * @return Result of the CreateRuleGroupsNamespace operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request would cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws ServiceQuotaExceededException
     *         Completing the request would cause a service quota to be exceeded.
     * @sample AmazonPrometheus.CreateRuleGroupsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateRuleGroupsNamespace" target="_top">AWS
     *      API Documentation</a>
     */
    CreateRuleGroupsNamespaceResult createRuleGroupsNamespace(CreateRuleGroupsNamespaceRequest createRuleGroupsNamespaceRequest);

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
     * @return Result of the CreateScraper operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request would cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws ServiceQuotaExceededException
     *         Completing the request would cause a service quota to be exceeded.
     * @sample AmazonPrometheus.CreateScraper
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateScraper" target="_top">AWS API
     *      Documentation</a>
     */
    CreateScraperResult createScraper(CreateScraperRequest createScraperRequest);

    /**
     * <p>
     * Creates a Prometheus workspace. A workspace is a logical space dedicated to the storage and querying of
     * Prometheus metrics. You can have one or more workspaces in each Region in your account.
     * </p>
     * 
     * @param createWorkspaceRequest
     *        Represents the input of a <code>CreateWorkspace</code> operation.
     * @return Result of the CreateWorkspace operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request would cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws ServiceQuotaExceededException
     *         Completing the request would cause a service quota to be exceeded.
     * @sample AmazonPrometheus.CreateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    CreateWorkspaceResult createWorkspace(CreateWorkspaceRequest createWorkspaceRequest);

    /**
     * <p>
     * Deletes the alert manager definition from a workspace.
     * </p>
     * 
     * @param deleteAlertManagerDefinitionRequest
     *        Represents the input of a <code>DeleteAlertManagerDefinition</code> operation.
     * @return Result of the DeleteAlertManagerDefinition operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request would cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AmazonPrometheus.DeleteAlertManagerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteAlertManagerDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAlertManagerDefinitionResult deleteAlertManagerDefinition(DeleteAlertManagerDefinitionRequest deleteAlertManagerDefinitionRequest);

    /**
     * <p>
     * Deletes the logging configuration for a workspace.
     * </p>
     * 
     * @param deleteLoggingConfigurationRequest
     *        Represents the input of a <code>DeleteLoggingConfiguration</code> operation.
     * @return Result of the DeleteLoggingConfiguration operation returned by the service.
     * @throws ConflictException
     *         The request would cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AmazonPrometheus.DeleteLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteLoggingConfigurationResult deleteLoggingConfiguration(DeleteLoggingConfigurationRequest deleteLoggingConfigurationRequest);

    /**
     * <p>
     * Deletes one rule groups namespace and its associated rule groups definition.
     * </p>
     * 
     * @param deleteRuleGroupsNamespaceRequest
     *        Represents the input of a <code>DeleteRuleGroupsNamespace</code> operation.
     * @return Result of the DeleteRuleGroupsNamespace operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request would cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AmazonPrometheus.DeleteRuleGroupsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteRuleGroupsNamespace" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteRuleGroupsNamespaceResult deleteRuleGroupsNamespace(DeleteRuleGroupsNamespaceRequest deleteRuleGroupsNamespaceRequest);

    /**
     * <p>
     * The <code>DeleteScraper</code> operation deletes one scraper, and stops any metrics collection that the scraper
     * performs.
     * </p>
     * 
     * @param deleteScraperRequest
     *        Represents the input of a <code>DeleteScraper</code> operation.
     * @return Result of the DeleteScraper operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request would cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AmazonPrometheus.DeleteScraper
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteScraper" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteScraperResult deleteScraper(DeleteScraperRequest deleteScraperRequest);

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
     * @return Result of the DeleteWorkspace operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request would cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AmazonPrometheus.DeleteWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteWorkspaceResult deleteWorkspace(DeleteWorkspaceRequest deleteWorkspaceRequest);

    /**
     * <p>
     * Retrieves the full information about the alert manager definition for a workspace.
     * </p>
     * 
     * @param describeAlertManagerDefinitionRequest
     *        Represents the input of a <code>DescribeAlertManagerDefinition</code> operation.
     * @return Result of the DescribeAlertManagerDefinition operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AmazonPrometheus.DescribeAlertManagerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeAlertManagerDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAlertManagerDefinitionResult describeAlertManagerDefinition(DescribeAlertManagerDefinitionRequest describeAlertManagerDefinitionRequest);

    /**
     * <p>
     * Returns complete information about the current logging configuration of the workspace.
     * </p>
     * 
     * @param describeLoggingConfigurationRequest
     *        Represents the input of a <code>DescribeLoggingConfiguration</code> operation.
     * @return Result of the DescribeLoggingConfiguration operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AmazonPrometheus.DescribeLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeLoggingConfigurationResult describeLoggingConfiguration(DescribeLoggingConfigurationRequest describeLoggingConfigurationRequest);

    /**
     * <p>
     * Returns complete information about one rule groups namespace. To retrieve a list of rule groups namespaces, use
     * <code>ListRuleGroupsNamespaces</code>.
     * </p>
     * 
     * @param describeRuleGroupsNamespaceRequest
     *        Represents the input of a <code>DescribeRuleGroupsNamespace</code> operation.
     * @return Result of the DescribeRuleGroupsNamespace operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AmazonPrometheus.DescribeRuleGroupsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeRuleGroupsNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeRuleGroupsNamespaceResult describeRuleGroupsNamespace(DescribeRuleGroupsNamespaceRequest describeRuleGroupsNamespaceRequest);

    /**
     * <p>
     * The <code>DescribeScraper</code> operation displays information about an existing scraper.
     * </p>
     * 
     * @param describeScraperRequest
     *        Represents the input of a <code>DescribeScraper</code> operation.
     * @return Result of the DescribeScraper operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AmazonPrometheus.DescribeScraper
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeScraper" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeScraperResult describeScraper(DescribeScraperRequest describeScraperRequest);

    /**
     * <p>
     * Returns information about an existing workspace.
     * </p>
     * 
     * @param describeWorkspaceRequest
     *        Represents the input of a <code>DescribeWorkspace</code> operation.
     * @return Result of the DescribeWorkspace operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AmazonPrometheus.DescribeWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeWorkspaceResult describeWorkspace(DescribeWorkspaceRequest describeWorkspaceRequest);

    /**
     * <p>
     * The <code>GetDefaultScraperConfiguration</code> operation returns the default scraper configuration used when
     * Amazon EKS creates a scraper for you.
     * </p>
     * 
     * @param getDefaultScraperConfigurationRequest
     *        Represents the input of a <code>GetDefaultScraperConfiguration</code> operation.
     * @return Result of the GetDefaultScraperConfiguration operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AmazonPrometheus.GetDefaultScraperConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/GetDefaultScraperConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetDefaultScraperConfigurationResult getDefaultScraperConfiguration(GetDefaultScraperConfigurationRequest getDefaultScraperConfigurationRequest);

    /**
     * <p>
     * Returns a list of rule groups namespaces in a workspace.
     * </p>
     * 
     * @param listRuleGroupsNamespacesRequest
     *        Represents the input of a <code>ListRuleGroupsNamespaces</code> operation.
     * @return Result of the ListRuleGroupsNamespaces operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AmazonPrometheus.ListRuleGroupsNamespaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ListRuleGroupsNamespaces" target="_top">AWS
     *      API Documentation</a>
     */
    ListRuleGroupsNamespacesResult listRuleGroupsNamespaces(ListRuleGroupsNamespacesRequest listRuleGroupsNamespacesRequest);

    /**
     * <p>
     * The <code>ListScrapers</code> operation lists all of the scrapers in your account. This includes scrapers being
     * created or deleted. You can optionally filter the returned list.
     * </p>
     * 
     * @param listScrapersRequest
     *        Represents the input of a <code>ListScrapers</code> operation.
     * @return Result of the ListScrapers operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AmazonPrometheus.ListScrapers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ListScrapers" target="_top">AWS API
     *      Documentation</a>
     */
    ListScrapersResult listScrapers(ListScrapersRequest listScrapersRequest);

    /**
     * <p>
     * The <code>ListTagsForResource</code> operation returns the tags that are associated with an Amazon Managed
     * Service for Prometheus resource. Currently, the only resources that can be tagged are workspaces and rule groups
     * namespaces.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AmazonPrometheus.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all of the Amazon Managed Service for Prometheus workspaces in your account. This includes workspaces being
     * created or deleted.
     * </p>
     * 
     * @param listWorkspacesRequest
     *        Represents the input of a <code>ListWorkspaces</code> operation.
     * @return Result of the ListWorkspaces operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AmazonPrometheus.ListWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ListWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    ListWorkspacesResult listWorkspaces(ListWorkspacesRequest listWorkspacesRequest);

    /**
     * <p>
     * Updates an existing alert manager definition in a workspace. If the workspace does not already have an alert
     * manager definition, don't use this operation to create it. Instead, use <code>CreateAlertManagerDefinition</code>
     * .
     * </p>
     * 
     * @param putAlertManagerDefinitionRequest
     *        Represents the input of a <code>PutAlertManagerDefinition</code> operation.
     * @return Result of the PutAlertManagerDefinition operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request would cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws ServiceQuotaExceededException
     *         Completing the request would cause a service quota to be exceeded.
     * @sample AmazonPrometheus.PutAlertManagerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/PutAlertManagerDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    PutAlertManagerDefinitionResult putAlertManagerDefinition(PutAlertManagerDefinitionRequest putAlertManagerDefinitionRequest);

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
     * @return Result of the PutRuleGroupsNamespace operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request would cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws ServiceQuotaExceededException
     *         Completing the request would cause a service quota to be exceeded.
     * @sample AmazonPrometheus.PutRuleGroupsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/PutRuleGroupsNamespace" target="_top">AWS API
     *      Documentation</a>
     */
    PutRuleGroupsNamespaceResult putRuleGroupsNamespace(PutRuleGroupsNamespaceRequest putRuleGroupsNamespaceRequest);

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
     * @return Result of the TagResource operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AmazonPrometheus.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from an Amazon Managed Service for Prometheus resource. The only resources that can be
     * tagged are workspaces and rule groups namespaces.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AmazonPrometheus.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the log group ARN or the workspace ID of the current logging configuration.
     * </p>
     * 
     * @param updateLoggingConfigurationRequest
     *        Represents the input of an <code>UpdateLoggingConfiguration</code> operation.
     * @return Result of the UpdateLoggingConfiguration operation returned by the service.
     * @throws ConflictException
     *         The request would cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AmazonPrometheus.UpdateLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/UpdateLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateLoggingConfigurationResult updateLoggingConfiguration(UpdateLoggingConfigurationRequest updateLoggingConfigurationRequest);

    /**
     * <p>
     * Updates the alias of an existing workspace.
     * </p>
     * 
     * @param updateWorkspaceAliasRequest
     *        Represents the input of an <code>UpdateWorkspaceAlias</code> operation.
     * @return Result of the UpdateWorkspaceAlias operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request would cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws ServiceQuotaExceededException
     *         Completing the request would cause a service quota to be exceeded.
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
