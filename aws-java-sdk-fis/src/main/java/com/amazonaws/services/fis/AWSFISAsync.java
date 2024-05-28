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
package com.amazonaws.services.fis;

import javax.annotation.Generated;

import com.amazonaws.services.fis.model.*;

/**
 * Interface for accessing FIS asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.fis.AbstractAWSFISAsync} instead.
 * </p>
 * <p>
 * <p>
 * Fault Injection Service is a managed service that enables you to perform fault injection experiments on your Amazon
 * Web Services workloads. For more information, see the <a
 * href="https://docs.aws.amazon.com/fis/latest/userguide/">Fault Injection Service User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSFISAsync extends AWSFIS {

    /**
     * <p>
     * Creates an experiment template.
     * </p>
     * <p>
     * An experiment template includes the following components:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Targets</b>: A target can be a specific resource in your Amazon Web Services environment, or one or more
     * resources that match criteria that you specify, for example, resources that have specific tags.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Actions</b>: The actions to carry out on the target. You can specify multiple actions, the duration of each
     * action, and when to start each action during an experiment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Stop conditions</b>: If a stop condition is triggered while an experiment is running, the experiment is
     * automatically stopped. You can define a stop condition as a CloudWatch alarm.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fis/latest/userguide/experiment-templates.html">experiment templates</a> in the
     * <i>Fault Injection Service User Guide</i>.
     * </p>
     * 
     * @param createExperimentTemplateRequest
     * @return A Java Future containing the result of the CreateExperimentTemplate operation returned by the service.
     * @sample AWSFISAsync.CreateExperimentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/CreateExperimentTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateExperimentTemplateResult> createExperimentTemplateAsync(CreateExperimentTemplateRequest createExperimentTemplateRequest);

    /**
     * <p>
     * Creates an experiment template.
     * </p>
     * <p>
     * An experiment template includes the following components:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Targets</b>: A target can be a specific resource in your Amazon Web Services environment, or one or more
     * resources that match criteria that you specify, for example, resources that have specific tags.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Actions</b>: The actions to carry out on the target. You can specify multiple actions, the duration of each
     * action, and when to start each action during an experiment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Stop conditions</b>: If a stop condition is triggered while an experiment is running, the experiment is
     * automatically stopped. You can define a stop condition as a CloudWatch alarm.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fis/latest/userguide/experiment-templates.html">experiment templates</a> in the
     * <i>Fault Injection Service User Guide</i>.
     * </p>
     * 
     * @param createExperimentTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateExperimentTemplate operation returned by the service.
     * @sample AWSFISAsyncHandler.CreateExperimentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/CreateExperimentTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateExperimentTemplateResult> createExperimentTemplateAsync(CreateExperimentTemplateRequest createExperimentTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateExperimentTemplateRequest, CreateExperimentTemplateResult> asyncHandler);

    /**
     * <p>
     * Creates a target account configuration for the experiment template. A target account configuration is required
     * when <code>accountTargeting</code> of <code>experimentOptions</code> is set to <code>multi-account</code>. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/fis/latest/userguide/experiment-options.html">experiment options</a> in the
     * <i>Fault Injection Service User Guide</i>.
     * </p>
     * 
     * @param createTargetAccountConfigurationRequest
     * @return A Java Future containing the result of the CreateTargetAccountConfiguration operation returned by the
     *         service.
     * @sample AWSFISAsync.CreateTargetAccountConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/CreateTargetAccountConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTargetAccountConfigurationResult> createTargetAccountConfigurationAsync(
            CreateTargetAccountConfigurationRequest createTargetAccountConfigurationRequest);

    /**
     * <p>
     * Creates a target account configuration for the experiment template. A target account configuration is required
     * when <code>accountTargeting</code> of <code>experimentOptions</code> is set to <code>multi-account</code>. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/fis/latest/userguide/experiment-options.html">experiment options</a> in the
     * <i>Fault Injection Service User Guide</i>.
     * </p>
     * 
     * @param createTargetAccountConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTargetAccountConfiguration operation returned by the
     *         service.
     * @sample AWSFISAsyncHandler.CreateTargetAccountConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/CreateTargetAccountConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTargetAccountConfigurationResult> createTargetAccountConfigurationAsync(
            CreateTargetAccountConfigurationRequest createTargetAccountConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTargetAccountConfigurationRequest, CreateTargetAccountConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified experiment template.
     * </p>
     * 
     * @param deleteExperimentTemplateRequest
     * @return A Java Future containing the result of the DeleteExperimentTemplate operation returned by the service.
     * @sample AWSFISAsync.DeleteExperimentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/DeleteExperimentTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteExperimentTemplateResult> deleteExperimentTemplateAsync(DeleteExperimentTemplateRequest deleteExperimentTemplateRequest);

    /**
     * <p>
     * Deletes the specified experiment template.
     * </p>
     * 
     * @param deleteExperimentTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteExperimentTemplate operation returned by the service.
     * @sample AWSFISAsyncHandler.DeleteExperimentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/DeleteExperimentTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteExperimentTemplateResult> deleteExperimentTemplateAsync(DeleteExperimentTemplateRequest deleteExperimentTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteExperimentTemplateRequest, DeleteExperimentTemplateResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified target account configuration of the experiment template.
     * </p>
     * 
     * @param deleteTargetAccountConfigurationRequest
     * @return A Java Future containing the result of the DeleteTargetAccountConfiguration operation returned by the
     *         service.
     * @sample AWSFISAsync.DeleteTargetAccountConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/DeleteTargetAccountConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTargetAccountConfigurationResult> deleteTargetAccountConfigurationAsync(
            DeleteTargetAccountConfigurationRequest deleteTargetAccountConfigurationRequest);

    /**
     * <p>
     * Deletes the specified target account configuration of the experiment template.
     * </p>
     * 
     * @param deleteTargetAccountConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTargetAccountConfiguration operation returned by the
     *         service.
     * @sample AWSFISAsyncHandler.DeleteTargetAccountConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/DeleteTargetAccountConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTargetAccountConfigurationResult> deleteTargetAccountConfigurationAsync(
            DeleteTargetAccountConfigurationRequest deleteTargetAccountConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTargetAccountConfigurationRequest, DeleteTargetAccountConfigurationResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified FIS action.
     * </p>
     * 
     * @param getActionRequest
     * @return A Java Future containing the result of the GetAction operation returned by the service.
     * @sample AWSFISAsync.GetAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/GetAction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetActionResult> getActionAsync(GetActionRequest getActionRequest);

    /**
     * <p>
     * Gets information about the specified FIS action.
     * </p>
     * 
     * @param getActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAction operation returned by the service.
     * @sample AWSFISAsyncHandler.GetAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/GetAction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetActionResult> getActionAsync(GetActionRequest getActionRequest,
            com.amazonaws.handlers.AsyncHandler<GetActionRequest, GetActionResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified experiment.
     * </p>
     * 
     * @param getExperimentRequest
     * @return A Java Future containing the result of the GetExperiment operation returned by the service.
     * @sample AWSFISAsync.GetExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/GetExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetExperimentResult> getExperimentAsync(GetExperimentRequest getExperimentRequest);

    /**
     * <p>
     * Gets information about the specified experiment.
     * </p>
     * 
     * @param getExperimentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetExperiment operation returned by the service.
     * @sample AWSFISAsyncHandler.GetExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/GetExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetExperimentResult> getExperimentAsync(GetExperimentRequest getExperimentRequest,
            com.amazonaws.handlers.AsyncHandler<GetExperimentRequest, GetExperimentResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified target account configuration of the experiment.
     * </p>
     * 
     * @param getExperimentTargetAccountConfigurationRequest
     * @return A Java Future containing the result of the GetExperimentTargetAccountConfiguration operation returned by
     *         the service.
     * @sample AWSFISAsync.GetExperimentTargetAccountConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/GetExperimentTargetAccountConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetExperimentTargetAccountConfigurationResult> getExperimentTargetAccountConfigurationAsync(
            GetExperimentTargetAccountConfigurationRequest getExperimentTargetAccountConfigurationRequest);

    /**
     * <p>
     * Gets information about the specified target account configuration of the experiment.
     * </p>
     * 
     * @param getExperimentTargetAccountConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetExperimentTargetAccountConfiguration operation returned by
     *         the service.
     * @sample AWSFISAsyncHandler.GetExperimentTargetAccountConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/GetExperimentTargetAccountConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetExperimentTargetAccountConfigurationResult> getExperimentTargetAccountConfigurationAsync(
            GetExperimentTargetAccountConfigurationRequest getExperimentTargetAccountConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetExperimentTargetAccountConfigurationRequest, GetExperimentTargetAccountConfigurationResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified experiment template.
     * </p>
     * 
     * @param getExperimentTemplateRequest
     * @return A Java Future containing the result of the GetExperimentTemplate operation returned by the service.
     * @sample AWSFISAsync.GetExperimentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/GetExperimentTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetExperimentTemplateResult> getExperimentTemplateAsync(GetExperimentTemplateRequest getExperimentTemplateRequest);

    /**
     * <p>
     * Gets information about the specified experiment template.
     * </p>
     * 
     * @param getExperimentTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetExperimentTemplate operation returned by the service.
     * @sample AWSFISAsyncHandler.GetExperimentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/GetExperimentTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetExperimentTemplateResult> getExperimentTemplateAsync(GetExperimentTemplateRequest getExperimentTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetExperimentTemplateRequest, GetExperimentTemplateResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified target account configuration of the experiment template.
     * </p>
     * 
     * @param getTargetAccountConfigurationRequest
     * @return A Java Future containing the result of the GetTargetAccountConfiguration operation returned by the
     *         service.
     * @sample AWSFISAsync.GetTargetAccountConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/GetTargetAccountConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTargetAccountConfigurationResult> getTargetAccountConfigurationAsync(
            GetTargetAccountConfigurationRequest getTargetAccountConfigurationRequest);

    /**
     * <p>
     * Gets information about the specified target account configuration of the experiment template.
     * </p>
     * 
     * @param getTargetAccountConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTargetAccountConfiguration operation returned by the
     *         service.
     * @sample AWSFISAsyncHandler.GetTargetAccountConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/GetTargetAccountConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTargetAccountConfigurationResult> getTargetAccountConfigurationAsync(
            GetTargetAccountConfigurationRequest getTargetAccountConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetTargetAccountConfigurationRequest, GetTargetAccountConfigurationResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified resource type.
     * </p>
     * 
     * @param getTargetResourceTypeRequest
     * @return A Java Future containing the result of the GetTargetResourceType operation returned by the service.
     * @sample AWSFISAsync.GetTargetResourceType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/GetTargetResourceType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTargetResourceTypeResult> getTargetResourceTypeAsync(GetTargetResourceTypeRequest getTargetResourceTypeRequest);

    /**
     * <p>
     * Gets information about the specified resource type.
     * </p>
     * 
     * @param getTargetResourceTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTargetResourceType operation returned by the service.
     * @sample AWSFISAsyncHandler.GetTargetResourceType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/GetTargetResourceType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTargetResourceTypeResult> getTargetResourceTypeAsync(GetTargetResourceTypeRequest getTargetResourceTypeRequest,
            com.amazonaws.handlers.AsyncHandler<GetTargetResourceTypeRequest, GetTargetResourceTypeResult> asyncHandler);

    /**
     * <p>
     * Lists the available FIS actions.
     * </p>
     * 
     * @param listActionsRequest
     * @return A Java Future containing the result of the ListActions operation returned by the service.
     * @sample AWSFISAsync.ListActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ListActions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListActionsResult> listActionsAsync(ListActionsRequest listActionsRequest);

    /**
     * <p>
     * Lists the available FIS actions.
     * </p>
     * 
     * @param listActionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListActions operation returned by the service.
     * @sample AWSFISAsyncHandler.ListActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ListActions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListActionsResult> listActionsAsync(ListActionsRequest listActionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListActionsRequest, ListActionsResult> asyncHandler);

    /**
     * <p>
     * Lists the resolved targets information of the specified experiment.
     * </p>
     * 
     * @param listExperimentResolvedTargetsRequest
     * @return A Java Future containing the result of the ListExperimentResolvedTargets operation returned by the
     *         service.
     * @sample AWSFISAsync.ListExperimentResolvedTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ListExperimentResolvedTargets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListExperimentResolvedTargetsResult> listExperimentResolvedTargetsAsync(
            ListExperimentResolvedTargetsRequest listExperimentResolvedTargetsRequest);

    /**
     * <p>
     * Lists the resolved targets information of the specified experiment.
     * </p>
     * 
     * @param listExperimentResolvedTargetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListExperimentResolvedTargets operation returned by the
     *         service.
     * @sample AWSFISAsyncHandler.ListExperimentResolvedTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ListExperimentResolvedTargets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListExperimentResolvedTargetsResult> listExperimentResolvedTargetsAsync(
            ListExperimentResolvedTargetsRequest listExperimentResolvedTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListExperimentResolvedTargetsRequest, ListExperimentResolvedTargetsResult> asyncHandler);

    /**
     * <p>
     * Lists the target account configurations of the specified experiment.
     * </p>
     * 
     * @param listExperimentTargetAccountConfigurationsRequest
     * @return A Java Future containing the result of the ListExperimentTargetAccountConfigurations operation returned
     *         by the service.
     * @sample AWSFISAsync.ListExperimentTargetAccountConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ListExperimentTargetAccountConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListExperimentTargetAccountConfigurationsResult> listExperimentTargetAccountConfigurationsAsync(
            ListExperimentTargetAccountConfigurationsRequest listExperimentTargetAccountConfigurationsRequest);

    /**
     * <p>
     * Lists the target account configurations of the specified experiment.
     * </p>
     * 
     * @param listExperimentTargetAccountConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListExperimentTargetAccountConfigurations operation returned
     *         by the service.
     * @sample AWSFISAsyncHandler.ListExperimentTargetAccountConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ListExperimentTargetAccountConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListExperimentTargetAccountConfigurationsResult> listExperimentTargetAccountConfigurationsAsync(
            ListExperimentTargetAccountConfigurationsRequest listExperimentTargetAccountConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListExperimentTargetAccountConfigurationsRequest, ListExperimentTargetAccountConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Lists your experiment templates.
     * </p>
     * 
     * @param listExperimentTemplatesRequest
     * @return A Java Future containing the result of the ListExperimentTemplates operation returned by the service.
     * @sample AWSFISAsync.ListExperimentTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ListExperimentTemplates" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListExperimentTemplatesResult> listExperimentTemplatesAsync(ListExperimentTemplatesRequest listExperimentTemplatesRequest);

    /**
     * <p>
     * Lists your experiment templates.
     * </p>
     * 
     * @param listExperimentTemplatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListExperimentTemplates operation returned by the service.
     * @sample AWSFISAsyncHandler.ListExperimentTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ListExperimentTemplates" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListExperimentTemplatesResult> listExperimentTemplatesAsync(ListExperimentTemplatesRequest listExperimentTemplatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListExperimentTemplatesRequest, ListExperimentTemplatesResult> asyncHandler);

    /**
     * <p>
     * Lists your experiments.
     * </p>
     * 
     * @param listExperimentsRequest
     * @return A Java Future containing the result of the ListExperiments operation returned by the service.
     * @sample AWSFISAsync.ListExperiments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ListExperiments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListExperimentsResult> listExperimentsAsync(ListExperimentsRequest listExperimentsRequest);

    /**
     * <p>
     * Lists your experiments.
     * </p>
     * 
     * @param listExperimentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListExperiments operation returned by the service.
     * @sample AWSFISAsyncHandler.ListExperiments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ListExperiments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListExperimentsResult> listExperimentsAsync(ListExperimentsRequest listExperimentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListExperimentsRequest, ListExperimentsResult> asyncHandler);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSFISAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSFISAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists the target account configurations of the specified experiment template.
     * </p>
     * 
     * @param listTargetAccountConfigurationsRequest
     * @return A Java Future containing the result of the ListTargetAccountConfigurations operation returned by the
     *         service.
     * @sample AWSFISAsync.ListTargetAccountConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ListTargetAccountConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTargetAccountConfigurationsResult> listTargetAccountConfigurationsAsync(
            ListTargetAccountConfigurationsRequest listTargetAccountConfigurationsRequest);

    /**
     * <p>
     * Lists the target account configurations of the specified experiment template.
     * </p>
     * 
     * @param listTargetAccountConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTargetAccountConfigurations operation returned by the
     *         service.
     * @sample AWSFISAsyncHandler.ListTargetAccountConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ListTargetAccountConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTargetAccountConfigurationsResult> listTargetAccountConfigurationsAsync(
            ListTargetAccountConfigurationsRequest listTargetAccountConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTargetAccountConfigurationsRequest, ListTargetAccountConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Lists the target resource types.
     * </p>
     * 
     * @param listTargetResourceTypesRequest
     * @return A Java Future containing the result of the ListTargetResourceTypes operation returned by the service.
     * @sample AWSFISAsync.ListTargetResourceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ListTargetResourceTypes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTargetResourceTypesResult> listTargetResourceTypesAsync(ListTargetResourceTypesRequest listTargetResourceTypesRequest);

    /**
     * <p>
     * Lists the target resource types.
     * </p>
     * 
     * @param listTargetResourceTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTargetResourceTypes operation returned by the service.
     * @sample AWSFISAsyncHandler.ListTargetResourceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ListTargetResourceTypes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTargetResourceTypesResult> listTargetResourceTypesAsync(ListTargetResourceTypesRequest listTargetResourceTypesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTargetResourceTypesRequest, ListTargetResourceTypesResult> asyncHandler);

    /**
     * <p>
     * Starts running an experiment from the specified experiment template.
     * </p>
     * 
     * @param startExperimentRequest
     * @return A Java Future containing the result of the StartExperiment operation returned by the service.
     * @sample AWSFISAsync.StartExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/StartExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartExperimentResult> startExperimentAsync(StartExperimentRequest startExperimentRequest);

    /**
     * <p>
     * Starts running an experiment from the specified experiment template.
     * </p>
     * 
     * @param startExperimentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartExperiment operation returned by the service.
     * @sample AWSFISAsyncHandler.StartExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/StartExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartExperimentResult> startExperimentAsync(StartExperimentRequest startExperimentRequest,
            com.amazonaws.handlers.AsyncHandler<StartExperimentRequest, StartExperimentResult> asyncHandler);

    /**
     * <p>
     * Stops the specified experiment.
     * </p>
     * 
     * @param stopExperimentRequest
     * @return A Java Future containing the result of the StopExperiment operation returned by the service.
     * @sample AWSFISAsync.StopExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/StopExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopExperimentResult> stopExperimentAsync(StopExperimentRequest stopExperimentRequest);

    /**
     * <p>
     * Stops the specified experiment.
     * </p>
     * 
     * @param stopExperimentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopExperiment operation returned by the service.
     * @sample AWSFISAsyncHandler.StopExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/StopExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopExperimentResult> stopExperimentAsync(StopExperimentRequest stopExperimentRequest,
            com.amazonaws.handlers.AsyncHandler<StopExperimentRequest, StopExperimentResult> asyncHandler);

    /**
     * <p>
     * Applies the specified tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSFISAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Applies the specified tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSFISAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSFISAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSFISAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the specified experiment template.
     * </p>
     * 
     * @param updateExperimentTemplateRequest
     * @return A Java Future containing the result of the UpdateExperimentTemplate operation returned by the service.
     * @sample AWSFISAsync.UpdateExperimentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/UpdateExperimentTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateExperimentTemplateResult> updateExperimentTemplateAsync(UpdateExperimentTemplateRequest updateExperimentTemplateRequest);

    /**
     * <p>
     * Updates the specified experiment template.
     * </p>
     * 
     * @param updateExperimentTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateExperimentTemplate operation returned by the service.
     * @sample AWSFISAsyncHandler.UpdateExperimentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/UpdateExperimentTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateExperimentTemplateResult> updateExperimentTemplateAsync(UpdateExperimentTemplateRequest updateExperimentTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateExperimentTemplateRequest, UpdateExperimentTemplateResult> asyncHandler);

    /**
     * <p>
     * Updates the target account configuration for the specified experiment template.
     * </p>
     * 
     * @param updateTargetAccountConfigurationRequest
     * @return A Java Future containing the result of the UpdateTargetAccountConfiguration operation returned by the
     *         service.
     * @sample AWSFISAsync.UpdateTargetAccountConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/UpdateTargetAccountConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTargetAccountConfigurationResult> updateTargetAccountConfigurationAsync(
            UpdateTargetAccountConfigurationRequest updateTargetAccountConfigurationRequest);

    /**
     * <p>
     * Updates the target account configuration for the specified experiment template.
     * </p>
     * 
     * @param updateTargetAccountConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTargetAccountConfiguration operation returned by the
     *         service.
     * @sample AWSFISAsyncHandler.UpdateTargetAccountConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/UpdateTargetAccountConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTargetAccountConfigurationResult> updateTargetAccountConfigurationAsync(
            UpdateTargetAccountConfigurationRequest updateTargetAccountConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTargetAccountConfigurationRequest, UpdateTargetAccountConfigurationResult> asyncHandler);

}
