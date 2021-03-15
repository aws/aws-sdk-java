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
 * AWS Fault Injection Simulator is a managed service that enables you to perform fault injection experiments on your
 * AWS workloads. For more information, see the <a href="https://docs.aws.amazon.com/fis/latest/userguide/">AWS Fault
 * Injection Simulator User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSFISAsync extends AWSFIS {

    /**
     * <p>
     * Creates an experiment template.
     * </p>
     * <p>
     * To create a template, specify the following information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Targets</b>: A target can be a specific resource in your AWS environment, or one or more resources that match
     * criteria that you specify, for example, resources that have specific tags.
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
     * For more information, see the <a href="https://docs.aws.amazon.com/fis/latest/userguide/">AWS Fault Injection
     * Simulator User Guide</a>.
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
     * To create a template, specify the following information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Targets</b>: A target can be a specific resource in your AWS environment, or one or more resources that match
     * criteria that you specify, for example, resources that have specific tags.
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
     * For more information, see the <a href="https://docs.aws.amazon.com/fis/latest/userguide/">AWS Fault Injection
     * Simulator User Guide</a>.
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
     * Gets information about the specified AWS FIS action.
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
     * Gets information about the specified AWS FIS action.
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
     * Lists the available AWS FIS actions.
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
     * Lists the available AWS FIS actions.
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

}
