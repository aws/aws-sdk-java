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
package com.amazonaws.services.cloudwatchevidently;

import javax.annotation.Generated;

import com.amazonaws.services.cloudwatchevidently.model.*;

/**
 * Interface for accessing Amazon CloudWatch Evidently asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudwatchevidently.AbstractAmazonCloudWatchEvidentlyAsync} instead.
 * </p>
 * <p>
 * <p>
 * You can use Amazon CloudWatch Evidently to safely validate new features by serving them to a specified percentage of
 * your users while you roll out the feature. You can monitor the performance of the new feature to help you decide when
 * to ramp up traffic to your users. This helps you reduce risk and identify unintended consequences before you fully
 * launch the feature.
 * </p>
 * <p>
 * You can also conduct A/B experiments to make feature design decisions based on evidence and data. An experiment can
 * test as many as five variations at once. Evidently collects experiment data and analyzes it using statistical
 * methods. It also provides clear recommendations about which variations perform better. You can test both user-facing
 * features and backend features.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonCloudWatchEvidentlyAsync extends AmazonCloudWatchEvidently {

    /**
     * <p>
     * This operation assigns feature variation to user sessions. For each user session, you pass in an
     * <code>entityID</code> that represents the user. Evidently then checks the evaluation rules and assigns the
     * variation.
     * </p>
     * <p>
     * The first rules that are evaluated are the override rules. If the user's <code>entityID</code> matches an
     * override rule, the user is served the variation specified by that rule.
     * </p>
     * <p>
     * Next, if there is a launch of the feature, the user might be assigned to a variation in the launch. The chance of
     * this depends on the percentage of users that are allocated to that launch. If the user is enrolled in the launch,
     * the variation they are served depends on the allocation of the various feature variations used for the launch.
     * </p>
     * <p>
     * If the user is not assigned to a launch, and there is an ongoing experiment for this feature, the user might be
     * assigned to a variation in the experiment. The chance of this depends on the percentage of users that are
     * allocated to that experiment. If the user is enrolled in the experiment, the variation they are served depends on
     * the allocation of the various feature variations used for the experiment.
     * </p>
     * <p>
     * If the user is not assigned to a launch or experiment, they are served the default variation.
     * </p>
     * 
     * @param batchEvaluateFeatureRequest
     * @return A Java Future containing the result of the BatchEvaluateFeature operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.BatchEvaluateFeature
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/BatchEvaluateFeature" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchEvaluateFeatureResult> batchEvaluateFeatureAsync(BatchEvaluateFeatureRequest batchEvaluateFeatureRequest);

    /**
     * <p>
     * This operation assigns feature variation to user sessions. For each user session, you pass in an
     * <code>entityID</code> that represents the user. Evidently then checks the evaluation rules and assigns the
     * variation.
     * </p>
     * <p>
     * The first rules that are evaluated are the override rules. If the user's <code>entityID</code> matches an
     * override rule, the user is served the variation specified by that rule.
     * </p>
     * <p>
     * Next, if there is a launch of the feature, the user might be assigned to a variation in the launch. The chance of
     * this depends on the percentage of users that are allocated to that launch. If the user is enrolled in the launch,
     * the variation they are served depends on the allocation of the various feature variations used for the launch.
     * </p>
     * <p>
     * If the user is not assigned to a launch, and there is an ongoing experiment for this feature, the user might be
     * assigned to a variation in the experiment. The chance of this depends on the percentage of users that are
     * allocated to that experiment. If the user is enrolled in the experiment, the variation they are served depends on
     * the allocation of the various feature variations used for the experiment.
     * </p>
     * <p>
     * If the user is not assigned to a launch or experiment, they are served the default variation.
     * </p>
     * 
     * @param batchEvaluateFeatureRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchEvaluateFeature operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.BatchEvaluateFeature
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/BatchEvaluateFeature" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchEvaluateFeatureResult> batchEvaluateFeatureAsync(BatchEvaluateFeatureRequest batchEvaluateFeatureRequest,
            com.amazonaws.handlers.AsyncHandler<BatchEvaluateFeatureRequest, BatchEvaluateFeatureResult> asyncHandler);

    /**
     * <p>
     * Creates an Evidently <i>experiment</i>. Before you create an experiment, you must create the feature to use for
     * the experiment.
     * </p>
     * <p>
     * An experiment helps you make feature design decisions based on evidence and data. An experiment can test as many
     * as five variations at once. Evidently collects experiment data and analyzes it by statistical methods, and
     * provides clear recommendations about which variations perform better.
     * </p>
     * <p>
     * You can optionally specify a <code>segment</code> to have the experiment consider only certain audience types in
     * the experiment, such as using only user sessions from a certain location or who use a certain internet browser.
     * </p>
     * <p>
     * Don't use this operation to update an existing experiment. Instead, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_UpdateExperiment.html"
     * >UpdateExperiment</a>.
     * </p>
     * 
     * @param createExperimentRequest
     * @return A Java Future containing the result of the CreateExperiment operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.CreateExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/CreateExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateExperimentResult> createExperimentAsync(CreateExperimentRequest createExperimentRequest);

    /**
     * <p>
     * Creates an Evidently <i>experiment</i>. Before you create an experiment, you must create the feature to use for
     * the experiment.
     * </p>
     * <p>
     * An experiment helps you make feature design decisions based on evidence and data. An experiment can test as many
     * as five variations at once. Evidently collects experiment data and analyzes it by statistical methods, and
     * provides clear recommendations about which variations perform better.
     * </p>
     * <p>
     * You can optionally specify a <code>segment</code> to have the experiment consider only certain audience types in
     * the experiment, such as using only user sessions from a certain location or who use a certain internet browser.
     * </p>
     * <p>
     * Don't use this operation to update an existing experiment. Instead, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_UpdateExperiment.html"
     * >UpdateExperiment</a>.
     * </p>
     * 
     * @param createExperimentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateExperiment operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.CreateExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/CreateExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateExperimentResult> createExperimentAsync(CreateExperimentRequest createExperimentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateExperimentRequest, CreateExperimentResult> asyncHandler);

    /**
     * <p>
     * Creates an Evidently <i>feature</i> that you want to launch or test. You can define up to five variations of a
     * feature, and use these variations in your launches and experiments. A feature must be created in a project. For
     * information about creating a project, see <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_CreateProject.html"
     * >CreateProject</a>.
     * </p>
     * <p>
     * Don't use this operation to update an existing feature. Instead, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_UpdateFeature.html"
     * >UpdateFeature</a>.
     * </p>
     * 
     * @param createFeatureRequest
     * @return A Java Future containing the result of the CreateFeature operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.CreateFeature
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/CreateFeature" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFeatureResult> createFeatureAsync(CreateFeatureRequest createFeatureRequest);

    /**
     * <p>
     * Creates an Evidently <i>feature</i> that you want to launch or test. You can define up to five variations of a
     * feature, and use these variations in your launches and experiments. A feature must be created in a project. For
     * information about creating a project, see <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_CreateProject.html"
     * >CreateProject</a>.
     * </p>
     * <p>
     * Don't use this operation to update an existing feature. Instead, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_UpdateFeature.html"
     * >UpdateFeature</a>.
     * </p>
     * 
     * @param createFeatureRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFeature operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.CreateFeature
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/CreateFeature" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFeatureResult> createFeatureAsync(CreateFeatureRequest createFeatureRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFeatureRequest, CreateFeatureResult> asyncHandler);

    /**
     * <p>
     * Creates a <i>launch</i> of a given feature. Before you create a launch, you must create the feature to use for
     * the launch.
     * </p>
     * <p>
     * You can use a launch to safely validate new features by serving them to a specified percentage of your users
     * while you roll out the feature. You can monitor the performance of the new feature to help you decide when to
     * ramp up traffic to more users. This helps you reduce risk and identify unintended consequences before you fully
     * launch the feature.
     * </p>
     * <p>
     * Don't use this operation to update an existing launch. Instead, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_UpdateLaunch.html"
     * >UpdateLaunch</a>.
     * </p>
     * 
     * @param createLaunchRequest
     * @return A Java Future containing the result of the CreateLaunch operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.CreateLaunch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/CreateLaunch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLaunchResult> createLaunchAsync(CreateLaunchRequest createLaunchRequest);

    /**
     * <p>
     * Creates a <i>launch</i> of a given feature. Before you create a launch, you must create the feature to use for
     * the launch.
     * </p>
     * <p>
     * You can use a launch to safely validate new features by serving them to a specified percentage of your users
     * while you roll out the feature. You can monitor the performance of the new feature to help you decide when to
     * ramp up traffic to more users. This helps you reduce risk and identify unintended consequences before you fully
     * launch the feature.
     * </p>
     * <p>
     * Don't use this operation to update an existing launch. Instead, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_UpdateLaunch.html"
     * >UpdateLaunch</a>.
     * </p>
     * 
     * @param createLaunchRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLaunch operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.CreateLaunch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/CreateLaunch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLaunchResult> createLaunchAsync(CreateLaunchRequest createLaunchRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLaunchRequest, CreateLaunchResult> asyncHandler);

    /**
     * <p>
     * Creates a project, which is the logical object in Evidently that can contain features, launches, and experiments.
     * Use projects to group similar features together.
     * </p>
     * <p>
     * To update an existing project, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_UpdateProject.html"
     * >UpdateProject</a>.
     * </p>
     * 
     * @param createProjectRequest
     * @return A Java Future containing the result of the CreateProject operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest createProjectRequest);

    /**
     * <p>
     * Creates a project, which is the logical object in Evidently that can contain features, launches, and experiments.
     * Use projects to group similar features together.
     * </p>
     * <p>
     * To update an existing project, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_UpdateProject.html"
     * >UpdateProject</a>.
     * </p>
     * 
     * @param createProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProject operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest createProjectRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProjectRequest, CreateProjectResult> asyncHandler);

    /**
     * <p>
     * Use this operation to define a <i>segment</i> of your audience. A segment is a portion of your audience that
     * share one or more characteristics. Examples could be Chrome browser users, users in Europe, or Firefox browser
     * users in Europe who also fit other criteria that your application collects, such as age.
     * </p>
     * <p>
     * Using a segment in an experiment limits that experiment to evaluate only the users who match the segment
     * criteria. Using one or more segments in a launch allows you to define different traffic splits for the different
     * audience segments.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;For more information about segment pattern syntax, see &lt;a href=&quot;https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html#CloudWatch-Evidently-segments-syntax.html&quot;&gt; Segment rule pattern syntax&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;The pattern that you define for a segment is matched against the value of &lt;code&gt;evaluationContext&lt;/code&gt;, which is passed into Evidently in the &lt;a href=&quot;https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_EvaluateFeature.html&quot;&gt;EvaluateFeature&lt;/a&gt; operation, when Evidently assigns a feature variation to a user.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param createSegmentRequest
     * @return A Java Future containing the result of the CreateSegment operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.CreateSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/CreateSegment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSegmentResult> createSegmentAsync(CreateSegmentRequest createSegmentRequest);

    /**
     * <p>
     * Use this operation to define a <i>segment</i> of your audience. A segment is a portion of your audience that
     * share one or more characteristics. Examples could be Chrome browser users, users in Europe, or Firefox browser
     * users in Europe who also fit other criteria that your application collects, such as age.
     * </p>
     * <p>
     * Using a segment in an experiment limits that experiment to evaluate only the users who match the segment
     * criteria. Using one or more segments in a launch allows you to define different traffic splits for the different
     * audience segments.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;For more information about segment pattern syntax, see &lt;a href=&quot;https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html#CloudWatch-Evidently-segments-syntax.html&quot;&gt; Segment rule pattern syntax&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;The pattern that you define for a segment is matched against the value of &lt;code&gt;evaluationContext&lt;/code&gt;, which is passed into Evidently in the &lt;a href=&quot;https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_EvaluateFeature.html&quot;&gt;EvaluateFeature&lt;/a&gt; operation, when Evidently assigns a feature variation to a user.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param createSegmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSegment operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.CreateSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/CreateSegment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSegmentResult> createSegmentAsync(CreateSegmentRequest createSegmentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSegmentRequest, CreateSegmentResult> asyncHandler);

    /**
     * <p>
     * Deletes an Evidently experiment. The feature used for the experiment is not deleted.
     * </p>
     * <p>
     * To stop an experiment without deleting it, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_StopExperiment.html"
     * >StopExperiment</a>.
     * </p>
     * 
     * @param deleteExperimentRequest
     * @return A Java Future containing the result of the DeleteExperiment operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.DeleteExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/DeleteExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteExperimentResult> deleteExperimentAsync(DeleteExperimentRequest deleteExperimentRequest);

    /**
     * <p>
     * Deletes an Evidently experiment. The feature used for the experiment is not deleted.
     * </p>
     * <p>
     * To stop an experiment without deleting it, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_StopExperiment.html"
     * >StopExperiment</a>.
     * </p>
     * 
     * @param deleteExperimentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteExperiment operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.DeleteExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/DeleteExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteExperimentResult> deleteExperimentAsync(DeleteExperimentRequest deleteExperimentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteExperimentRequest, DeleteExperimentResult> asyncHandler);

    /**
     * <p>
     * Deletes an Evidently feature.
     * </p>
     * 
     * @param deleteFeatureRequest
     * @return A Java Future containing the result of the DeleteFeature operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.DeleteFeature
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/DeleteFeature" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFeatureResult> deleteFeatureAsync(DeleteFeatureRequest deleteFeatureRequest);

    /**
     * <p>
     * Deletes an Evidently feature.
     * </p>
     * 
     * @param deleteFeatureRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFeature operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.DeleteFeature
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/DeleteFeature" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFeatureResult> deleteFeatureAsync(DeleteFeatureRequest deleteFeatureRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFeatureRequest, DeleteFeatureResult> asyncHandler);

    /**
     * <p>
     * Deletes an Evidently launch. The feature used for the launch is not deleted.
     * </p>
     * <p>
     * To stop a launch without deleting it, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_StopLaunch.html">StopLaunch</a>.
     * </p>
     * 
     * @param deleteLaunchRequest
     * @return A Java Future containing the result of the DeleteLaunch operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.DeleteLaunch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/DeleteLaunch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLaunchResult> deleteLaunchAsync(DeleteLaunchRequest deleteLaunchRequest);

    /**
     * <p>
     * Deletes an Evidently launch. The feature used for the launch is not deleted.
     * </p>
     * <p>
     * To stop a launch without deleting it, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_StopLaunch.html">StopLaunch</a>.
     * </p>
     * 
     * @param deleteLaunchRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLaunch operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.DeleteLaunch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/DeleteLaunch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLaunchResult> deleteLaunchAsync(DeleteLaunchRequest deleteLaunchRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLaunchRequest, DeleteLaunchResult> asyncHandler);

    /**
     * <p>
     * Deletes an Evidently project. Before you can delete a project, you must delete all the features that the project
     * contains. To delete a feature, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_DeleteFeature.html"
     * >DeleteFeature</a>.
     * </p>
     * 
     * @param deleteProjectRequest
     * @return A Java Future containing the result of the DeleteProject operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest deleteProjectRequest);

    /**
     * <p>
     * Deletes an Evidently project. Before you can delete a project, you must delete all the features that the project
     * contains. To delete a feature, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_DeleteFeature.html"
     * >DeleteFeature</a>.
     * </p>
     * 
     * @param deleteProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProject operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest deleteProjectRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProjectRequest, DeleteProjectResult> asyncHandler);

    /**
     * <p>
     * Deletes a segment. You can't delete a segment that is being used in a launch or experiment, even if that launch
     * or experiment is not currently running.
     * </p>
     * 
     * @param deleteSegmentRequest
     * @return A Java Future containing the result of the DeleteSegment operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.DeleteSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/DeleteSegment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSegmentResult> deleteSegmentAsync(DeleteSegmentRequest deleteSegmentRequest);

    /**
     * <p>
     * Deletes a segment. You can't delete a segment that is being used in a launch or experiment, even if that launch
     * or experiment is not currently running.
     * </p>
     * 
     * @param deleteSegmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSegment operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.DeleteSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/DeleteSegment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSegmentResult> deleteSegmentAsync(DeleteSegmentRequest deleteSegmentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSegmentRequest, DeleteSegmentResult> asyncHandler);

    /**
     * <p>
     * This operation assigns a feature variation to one given user session. You pass in an <code>entityID</code> that
     * represents the user. Evidently then checks the evaluation rules and assigns the variation.
     * </p>
     * <p>
     * The first rules that are evaluated are the override rules. If the user's <code>entityID</code> matches an
     * override rule, the user is served the variation specified by that rule.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;If there is a current launch with this feature that uses segment overrides, and if the user session's &lt;code&gt;evaluationContext&lt;/code&gt; matches a segment rule defined in a segment override, the configuration in the segment overrides is used. For more information about segments, see &lt;a href=&quot;https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_CreateSegment.html&quot;&gt;CreateSegment&lt;/a&gt; and &lt;a href=&quot;https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html&quot;&gt;Use segments to focus your audience&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;If there is a launch with no segment overrides, the user might be assigned to a variation in the launch. The chance of this depends on the percentage of users that are allocated to that launch. If the user is enrolled in the launch, the variation they are served depends on the allocation of the various feature variations used for the launch.&lt;/p&gt; &lt;p&gt;If the user is not assigned to a launch, and there is an ongoing experiment for this feature, the user might be assigned to a variation in the experiment. The chance of this depends on the percentage of users that are allocated to that experiment.&lt;/p&gt; &lt;p&gt;If the experiment uses a segment, then only user sessions with &lt;code&gt;evaluationContext&lt;/code&gt; values that match the segment rule are used in the experiment.&lt;/p&gt; &lt;p&gt;If the user is enrolled in the experiment, the variation they are served depends on the allocation of the various feature variations used for the experiment. &lt;/p&gt; &lt;p&gt;If the user is not assigned to a launch or experiment, they are served the default variation.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param evaluateFeatureRequest
     * @return A Java Future containing the result of the EvaluateFeature operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.EvaluateFeature
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/EvaluateFeature" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EvaluateFeatureResult> evaluateFeatureAsync(EvaluateFeatureRequest evaluateFeatureRequest);

    /**
     * <p>
     * This operation assigns a feature variation to one given user session. You pass in an <code>entityID</code> that
     * represents the user. Evidently then checks the evaluation rules and assigns the variation.
     * </p>
     * <p>
     * The first rules that are evaluated are the override rules. If the user's <code>entityID</code> matches an
     * override rule, the user is served the variation specified by that rule.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;If there is a current launch with this feature that uses segment overrides, and if the user session's &lt;code&gt;evaluationContext&lt;/code&gt; matches a segment rule defined in a segment override, the configuration in the segment overrides is used. For more information about segments, see &lt;a href=&quot;https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_CreateSegment.html&quot;&gt;CreateSegment&lt;/a&gt; and &lt;a href=&quot;https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html&quot;&gt;Use segments to focus your audience&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;If there is a launch with no segment overrides, the user might be assigned to a variation in the launch. The chance of this depends on the percentage of users that are allocated to that launch. If the user is enrolled in the launch, the variation they are served depends on the allocation of the various feature variations used for the launch.&lt;/p&gt; &lt;p&gt;If the user is not assigned to a launch, and there is an ongoing experiment for this feature, the user might be assigned to a variation in the experiment. The chance of this depends on the percentage of users that are allocated to that experiment.&lt;/p&gt; &lt;p&gt;If the experiment uses a segment, then only user sessions with &lt;code&gt;evaluationContext&lt;/code&gt; values that match the segment rule are used in the experiment.&lt;/p&gt; &lt;p&gt;If the user is enrolled in the experiment, the variation they are served depends on the allocation of the various feature variations used for the experiment. &lt;/p&gt; &lt;p&gt;If the user is not assigned to a launch or experiment, they are served the default variation.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param evaluateFeatureRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EvaluateFeature operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.EvaluateFeature
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/EvaluateFeature" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EvaluateFeatureResult> evaluateFeatureAsync(EvaluateFeatureRequest evaluateFeatureRequest,
            com.amazonaws.handlers.AsyncHandler<EvaluateFeatureRequest, EvaluateFeatureResult> asyncHandler);

    /**
     * <p>
     * Returns the details about one experiment. You must already know the experiment name. To retrieve a list of
     * experiments in your account, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_ListExperiments.html"
     * >ListExperiments</a>.
     * </p>
     * 
     * @param getExperimentRequest
     * @return A Java Future containing the result of the GetExperiment operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.GetExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/GetExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetExperimentResult> getExperimentAsync(GetExperimentRequest getExperimentRequest);

    /**
     * <p>
     * Returns the details about one experiment. You must already know the experiment name. To retrieve a list of
     * experiments in your account, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_ListExperiments.html"
     * >ListExperiments</a>.
     * </p>
     * 
     * @param getExperimentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetExperiment operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.GetExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/GetExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetExperimentResult> getExperimentAsync(GetExperimentRequest getExperimentRequest,
            com.amazonaws.handlers.AsyncHandler<GetExperimentRequest, GetExperimentResult> asyncHandler);

    /**
     * <p>
     * Retrieves the results of a running or completed experiment. No results are available until there have been 100
     * events for each variation and at least 10 minutes have passed since the start of the experiment. To increase the
     * statistical power, Evidently performs an additional offline p-value analysis at the end of the experiment.
     * Offline p-value analysis can detect statistical significance in some cases where the anytime p-values used during
     * the experiment do not find statistical significance.
     * </p>
     * <p>
     * Experiment results are available up to 63 days after the start of the experiment. They are not available after
     * that because of CloudWatch data retention policies.
     * </p>
     * 
     * @param getExperimentResultsRequest
     * @return A Java Future containing the result of the GetExperimentResults operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.GetExperimentResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/GetExperimentResults" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetExperimentResultsResult> getExperimentResultsAsync(GetExperimentResultsRequest getExperimentResultsRequest);

    /**
     * <p>
     * Retrieves the results of a running or completed experiment. No results are available until there have been 100
     * events for each variation and at least 10 minutes have passed since the start of the experiment. To increase the
     * statistical power, Evidently performs an additional offline p-value analysis at the end of the experiment.
     * Offline p-value analysis can detect statistical significance in some cases where the anytime p-values used during
     * the experiment do not find statistical significance.
     * </p>
     * <p>
     * Experiment results are available up to 63 days after the start of the experiment. They are not available after
     * that because of CloudWatch data retention policies.
     * </p>
     * 
     * @param getExperimentResultsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetExperimentResults operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.GetExperimentResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/GetExperimentResults" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetExperimentResultsResult> getExperimentResultsAsync(GetExperimentResultsRequest getExperimentResultsRequest,
            com.amazonaws.handlers.AsyncHandler<GetExperimentResultsRequest, GetExperimentResultsResult> asyncHandler);

    /**
     * <p>
     * Returns the details about one feature. You must already know the feature name. To retrieve a list of features in
     * your account, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_ListFeatures.html"
     * >ListFeatures</a>.
     * </p>
     * 
     * @param getFeatureRequest
     * @return A Java Future containing the result of the GetFeature operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.GetFeature
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/GetFeature" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFeatureResult> getFeatureAsync(GetFeatureRequest getFeatureRequest);

    /**
     * <p>
     * Returns the details about one feature. You must already know the feature name. To retrieve a list of features in
     * your account, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_ListFeatures.html"
     * >ListFeatures</a>.
     * </p>
     * 
     * @param getFeatureRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFeature operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.GetFeature
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/GetFeature" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFeatureResult> getFeatureAsync(GetFeatureRequest getFeatureRequest,
            com.amazonaws.handlers.AsyncHandler<GetFeatureRequest, GetFeatureResult> asyncHandler);

    /**
     * <p>
     * Returns the details about one launch. You must already know the launch name. To retrieve a list of launches in
     * your account, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_ListLaunches.html"
     * >ListLaunches</a>.
     * </p>
     * 
     * @param getLaunchRequest
     * @return A Java Future containing the result of the GetLaunch operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.GetLaunch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/GetLaunch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLaunchResult> getLaunchAsync(GetLaunchRequest getLaunchRequest);

    /**
     * <p>
     * Returns the details about one launch. You must already know the launch name. To retrieve a list of launches in
     * your account, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_ListLaunches.html"
     * >ListLaunches</a>.
     * </p>
     * 
     * @param getLaunchRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLaunch operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.GetLaunch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/GetLaunch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLaunchResult> getLaunchAsync(GetLaunchRequest getLaunchRequest,
            com.amazonaws.handlers.AsyncHandler<GetLaunchRequest, GetLaunchResult> asyncHandler);

    /**
     * <p>
     * Returns the details about one launch. You must already know the project name. To retrieve a list of projects in
     * your account, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_ListProjects.html"
     * >ListProjects</a>.
     * </p>
     * 
     * @param getProjectRequest
     * @return A Java Future containing the result of the GetProject operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.GetProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/GetProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetProjectResult> getProjectAsync(GetProjectRequest getProjectRequest);

    /**
     * <p>
     * Returns the details about one launch. You must already know the project name. To retrieve a list of projects in
     * your account, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_ListProjects.html"
     * >ListProjects</a>.
     * </p>
     * 
     * @param getProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetProject operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.GetProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/GetProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetProjectResult> getProjectAsync(GetProjectRequest getProjectRequest,
            com.amazonaws.handlers.AsyncHandler<GetProjectRequest, GetProjectResult> asyncHandler);

    /**
     * <p>
     * Returns information about the specified segment. Specify the segment you want to view by specifying its ARN.
     * </p>
     * 
     * @param getSegmentRequest
     * @return A Java Future containing the result of the GetSegment operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.GetSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/GetSegment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSegmentResult> getSegmentAsync(GetSegmentRequest getSegmentRequest);

    /**
     * <p>
     * Returns information about the specified segment. Specify the segment you want to view by specifying its ARN.
     * </p>
     * 
     * @param getSegmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSegment operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.GetSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/GetSegment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSegmentResult> getSegmentAsync(GetSegmentRequest getSegmentRequest,
            com.amazonaws.handlers.AsyncHandler<GetSegmentRequest, GetSegmentResult> asyncHandler);

    /**
     * <p>
     * Returns configuration details about all the experiments in the specified project.
     * </p>
     * 
     * @param listExperimentsRequest
     * @return A Java Future containing the result of the ListExperiments operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.ListExperiments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListExperiments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListExperimentsResult> listExperimentsAsync(ListExperimentsRequest listExperimentsRequest);

    /**
     * <p>
     * Returns configuration details about all the experiments in the specified project.
     * </p>
     * 
     * @param listExperimentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListExperiments operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.ListExperiments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListExperiments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListExperimentsResult> listExperimentsAsync(ListExperimentsRequest listExperimentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListExperimentsRequest, ListExperimentsResult> asyncHandler);

    /**
     * <p>
     * Returns configuration details about all the features in the specified project.
     * </p>
     * 
     * @param listFeaturesRequest
     * @return A Java Future containing the result of the ListFeatures operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.ListFeatures
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListFeatures" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFeaturesResult> listFeaturesAsync(ListFeaturesRequest listFeaturesRequest);

    /**
     * <p>
     * Returns configuration details about all the features in the specified project.
     * </p>
     * 
     * @param listFeaturesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFeatures operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.ListFeatures
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListFeatures" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFeaturesResult> listFeaturesAsync(ListFeaturesRequest listFeaturesRequest,
            com.amazonaws.handlers.AsyncHandler<ListFeaturesRequest, ListFeaturesResult> asyncHandler);

    /**
     * <p>
     * Returns configuration details about all the launches in the specified project.
     * </p>
     * 
     * @param listLaunchesRequest
     * @return A Java Future containing the result of the ListLaunches operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.ListLaunches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListLaunches" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLaunchesResult> listLaunchesAsync(ListLaunchesRequest listLaunchesRequest);

    /**
     * <p>
     * Returns configuration details about all the launches in the specified project.
     * </p>
     * 
     * @param listLaunchesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLaunches operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.ListLaunches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListLaunches" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLaunchesResult> listLaunchesAsync(ListLaunchesRequest listLaunchesRequest,
            com.amazonaws.handlers.AsyncHandler<ListLaunchesRequest, ListLaunchesResult> asyncHandler);

    /**
     * <p>
     * Returns configuration details about all the projects in the current Region in your account.
     * </p>
     * 
     * @param listProjectsRequest
     * @return A Java Future containing the result of the ListProjects operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest listProjectsRequest);

    /**
     * <p>
     * Returns configuration details about all the projects in the current Region in your account.
     * </p>
     * 
     * @param listProjectsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProjects operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest listProjectsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProjectsRequest, ListProjectsResult> asyncHandler);

    /**
     * <p>
     * Use this operation to find which experiments or launches are using a specified segment.
     * </p>
     * 
     * @param listSegmentReferencesRequest
     * @return A Java Future containing the result of the ListSegmentReferences operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.ListSegmentReferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListSegmentReferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSegmentReferencesResult> listSegmentReferencesAsync(ListSegmentReferencesRequest listSegmentReferencesRequest);

    /**
     * <p>
     * Use this operation to find which experiments or launches are using a specified segment.
     * </p>
     * 
     * @param listSegmentReferencesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSegmentReferences operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.ListSegmentReferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListSegmentReferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSegmentReferencesResult> listSegmentReferencesAsync(ListSegmentReferencesRequest listSegmentReferencesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSegmentReferencesRequest, ListSegmentReferencesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of audience segments that you have created in your account in this Region.
     * </p>
     * 
     * @param listSegmentsRequest
     * @return A Java Future containing the result of the ListSegments operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.ListSegments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListSegments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSegmentsResult> listSegmentsAsync(ListSegmentsRequest listSegmentsRequest);

    /**
     * <p>
     * Returns a list of audience segments that you have created in your account in this Region.
     * </p>
     * 
     * @param listSegmentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSegments operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.ListSegments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListSegments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSegmentsResult> listSegmentsAsync(ListSegmentsRequest listSegmentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSegmentsRequest, ListSegmentsResult> asyncHandler);

    /**
     * <p>
     * Displays the tags associated with an Evidently resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Displays the tags associated with an Evidently resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Sends performance events to Evidently. These events can be used to evaluate a launch or an experiment.
     * </p>
     * 
     * @param putProjectEventsRequest
     * @return A Java Future containing the result of the PutProjectEvents operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.PutProjectEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/PutProjectEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutProjectEventsResult> putProjectEventsAsync(PutProjectEventsRequest putProjectEventsRequest);

    /**
     * <p>
     * Sends performance events to Evidently. These events can be used to evaluate a launch or an experiment.
     * </p>
     * 
     * @param putProjectEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutProjectEvents operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.PutProjectEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/PutProjectEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutProjectEventsResult> putProjectEventsAsync(PutProjectEventsRequest putProjectEventsRequest,
            com.amazonaws.handlers.AsyncHandler<PutProjectEventsRequest, PutProjectEventsResult> asyncHandler);

    /**
     * <p>
     * Starts an existing experiment. To create an experiment, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_CreateExperiment.html"
     * >CreateExperiment</a>.
     * </p>
     * 
     * @param startExperimentRequest
     * @return A Java Future containing the result of the StartExperiment operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.StartExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/StartExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartExperimentResult> startExperimentAsync(StartExperimentRequest startExperimentRequest);

    /**
     * <p>
     * Starts an existing experiment. To create an experiment, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_CreateExperiment.html"
     * >CreateExperiment</a>.
     * </p>
     * 
     * @param startExperimentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartExperiment operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.StartExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/StartExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartExperimentResult> startExperimentAsync(StartExperimentRequest startExperimentRequest,
            com.amazonaws.handlers.AsyncHandler<StartExperimentRequest, StartExperimentResult> asyncHandler);

    /**
     * <p>
     * Starts an existing launch. To create a launch, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_CreateLaunch.html"
     * >CreateLaunch</a>.
     * </p>
     * 
     * @param startLaunchRequest
     * @return A Java Future containing the result of the StartLaunch operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.StartLaunch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/StartLaunch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartLaunchResult> startLaunchAsync(StartLaunchRequest startLaunchRequest);

    /**
     * <p>
     * Starts an existing launch. To create a launch, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_CreateLaunch.html"
     * >CreateLaunch</a>.
     * </p>
     * 
     * @param startLaunchRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartLaunch operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.StartLaunch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/StartLaunch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartLaunchResult> startLaunchAsync(StartLaunchRequest startLaunchRequest,
            com.amazonaws.handlers.AsyncHandler<StartLaunchRequest, StartLaunchResult> asyncHandler);

    /**
     * <p>
     * Stops an experiment that is currently running. If you stop an experiment, you can't resume it or restart it.
     * </p>
     * 
     * @param stopExperimentRequest
     * @return A Java Future containing the result of the StopExperiment operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.StopExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/StopExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopExperimentResult> stopExperimentAsync(StopExperimentRequest stopExperimentRequest);

    /**
     * <p>
     * Stops an experiment that is currently running. If you stop an experiment, you can't resume it or restart it.
     * </p>
     * 
     * @param stopExperimentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopExperiment operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.StopExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/StopExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopExperimentResult> stopExperimentAsync(StopExperimentRequest stopExperimentRequest,
            com.amazonaws.handlers.AsyncHandler<StopExperimentRequest, StopExperimentResult> asyncHandler);

    /**
     * <p>
     * Stops a launch that is currently running. After you stop a launch, you will not be able to resume it or restart
     * it. Also, it will not be evaluated as a rule for traffic allocation, and the traffic that was allocated to the
     * launch will instead be available to the feature's experiment, if there is one. Otherwise, all traffic will be
     * served the default variation after the launch is stopped.
     * </p>
     * 
     * @param stopLaunchRequest
     * @return A Java Future containing the result of the StopLaunch operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.StopLaunch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/StopLaunch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopLaunchResult> stopLaunchAsync(StopLaunchRequest stopLaunchRequest);

    /**
     * <p>
     * Stops a launch that is currently running. After you stop a launch, you will not be able to resume it or restart
     * it. Also, it will not be evaluated as a rule for traffic allocation, and the traffic that was allocated to the
     * launch will instead be available to the feature's experiment, if there is one. Otherwise, all traffic will be
     * served the default variation after the launch is stopped.
     * </p>
     * 
     * @param stopLaunchRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopLaunch operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.StopLaunch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/StopLaunch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopLaunchResult> stopLaunchAsync(StopLaunchRequest stopLaunchRequest,
            com.amazonaws.handlers.AsyncHandler<StopLaunchRequest, StopLaunchResult> asyncHandler);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified CloudWatch Evidently resource. Projects, features,
     * launches, and experiments can be tagged.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     * characters.
     * </p>
     * <p>
     * You can use the <code>TagResource</code> action with a resource that already has tags. If you specify a new tag
     * key for the resource, this tag is appended to the list of tags associated with the alarm. If you specify a tag
     * key that is already associated with the resource, the new tag value that you specify replaces the previous value
     * for that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a resource.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon
     * Web Services resources</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified CloudWatch Evidently resource. Projects, features,
     * launches, and experiments can be tagged.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     * characters.
     * </p>
     * <p>
     * You can use the <code>TagResource</code> action with a resource that already has tags. If you specify a new tag
     * key for the resource, this tag is appended to the list of tags associated with the alarm. If you specify a tag
     * key that is already associated with the resource, the new tag value that you specify replaces the previous value
     * for that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a resource.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon
     * Web Services resources</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Use this operation to test a rules pattern that you plan to use to create an audience segment. For more
     * information about segments, see <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_CreateSegment.html"
     * >CreateSegment</a>.
     * </p>
     * 
     * @param testSegmentPatternRequest
     * @return A Java Future containing the result of the TestSegmentPattern operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.TestSegmentPattern
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/TestSegmentPattern" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TestSegmentPatternResult> testSegmentPatternAsync(TestSegmentPatternRequest testSegmentPatternRequest);

    /**
     * <p>
     * Use this operation to test a rules pattern that you plan to use to create an audience segment. For more
     * information about segments, see <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_CreateSegment.html"
     * >CreateSegment</a>.
     * </p>
     * 
     * @param testSegmentPatternRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TestSegmentPattern operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.TestSegmentPattern
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/TestSegmentPattern" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TestSegmentPatternResult> testSegmentPatternAsync(TestSegmentPatternRequest testSegmentPatternRequest,
            com.amazonaws.handlers.AsyncHandler<TestSegmentPatternRequest, TestSegmentPatternResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an Evidently experiment.
     * </p>
     * <p>
     * Don't use this operation to update an experiment's tag. Instead, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_TagResource.html">TagResource</a>.
     * </p>
     * 
     * @param updateExperimentRequest
     * @return A Java Future containing the result of the UpdateExperiment operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.UpdateExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/UpdateExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateExperimentResult> updateExperimentAsync(UpdateExperimentRequest updateExperimentRequest);

    /**
     * <p>
     * Updates an Evidently experiment.
     * </p>
     * <p>
     * Don't use this operation to update an experiment's tag. Instead, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_TagResource.html">TagResource</a>.
     * </p>
     * 
     * @param updateExperimentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateExperiment operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.UpdateExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/UpdateExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateExperimentResult> updateExperimentAsync(UpdateExperimentRequest updateExperimentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateExperimentRequest, UpdateExperimentResult> asyncHandler);

    /**
     * <p>
     * Updates an existing feature.
     * </p>
     * <p>
     * You can't use this operation to update the tags of an existing feature. Instead, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_TagResource.html">TagResource</a>.
     * </p>
     * 
     * @param updateFeatureRequest
     * @return A Java Future containing the result of the UpdateFeature operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.UpdateFeature
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/UpdateFeature" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFeatureResult> updateFeatureAsync(UpdateFeatureRequest updateFeatureRequest);

    /**
     * <p>
     * Updates an existing feature.
     * </p>
     * <p>
     * You can't use this operation to update the tags of an existing feature. Instead, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_TagResource.html">TagResource</a>.
     * </p>
     * 
     * @param updateFeatureRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFeature operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.UpdateFeature
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/UpdateFeature" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFeatureResult> updateFeatureAsync(UpdateFeatureRequest updateFeatureRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFeatureRequest, UpdateFeatureResult> asyncHandler);

    /**
     * <p>
     * Updates a launch of a given feature.
     * </p>
     * <p>
     * Don't use this operation to update the tags of an existing launch. Instead, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_TagResource.html">TagResource</a>.
     * </p>
     * 
     * @param updateLaunchRequest
     * @return A Java Future containing the result of the UpdateLaunch operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.UpdateLaunch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/UpdateLaunch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateLaunchResult> updateLaunchAsync(UpdateLaunchRequest updateLaunchRequest);

    /**
     * <p>
     * Updates a launch of a given feature.
     * </p>
     * <p>
     * Don't use this operation to update the tags of an existing launch. Instead, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_TagResource.html">TagResource</a>.
     * </p>
     * 
     * @param updateLaunchRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLaunch operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.UpdateLaunch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/UpdateLaunch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateLaunchResult> updateLaunchAsync(UpdateLaunchRequest updateLaunchRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLaunchRequest, UpdateLaunchResult> asyncHandler);

    /**
     * <p>
     * Updates the description of an existing project.
     * </p>
     * <p>
     * To create a new project, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_CreateProject.html"
     * >CreateProject</a>.
     * </p>
     * <p>
     * Don't use this operation to update the data storage options of a project. Instead, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_UpdateProjectDataDelivery.html"
     * >UpdateProjectDataDelivery</a>.
     * </p>
     * <p>
     * Don't use this operation to update the tags of a project. Instead, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_TagResource.html">TagResource</a>.
     * </p>
     * 
     * @param updateProjectRequest
     * @return A Java Future containing the result of the UpdateProject operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest updateProjectRequest);

    /**
     * <p>
     * Updates the description of an existing project.
     * </p>
     * <p>
     * To create a new project, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_CreateProject.html"
     * >CreateProject</a>.
     * </p>
     * <p>
     * Don't use this operation to update the data storage options of a project. Instead, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_UpdateProjectDataDelivery.html"
     * >UpdateProjectDataDelivery</a>.
     * </p>
     * <p>
     * Don't use this operation to update the tags of a project. Instead, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_TagResource.html">TagResource</a>.
     * </p>
     * 
     * @param updateProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProject operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest updateProjectRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProjectRequest, UpdateProjectResult> asyncHandler);

    /**
     * <p>
     * Updates the data storage options for this project. If you store evaluation events, you an keep them and analyze
     * them on your own. If you choose not to store evaluation events, Evidently deletes them after using them to
     * produce metrics and other experiment results that you can view.
     * </p>
     * <p>
     * You can't specify both <code>cloudWatchLogs</code> and <code>s3Destination</code> in the same operation.
     * </p>
     * 
     * @param updateProjectDataDeliveryRequest
     * @return A Java Future containing the result of the UpdateProjectDataDelivery operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsync.UpdateProjectDataDelivery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/UpdateProjectDataDelivery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProjectDataDeliveryResult> updateProjectDataDeliveryAsync(
            UpdateProjectDataDeliveryRequest updateProjectDataDeliveryRequest);

    /**
     * <p>
     * Updates the data storage options for this project. If you store evaluation events, you an keep them and analyze
     * them on your own. If you choose not to store evaluation events, Evidently deletes them after using them to
     * produce metrics and other experiment results that you can view.
     * </p>
     * <p>
     * You can't specify both <code>cloudWatchLogs</code> and <code>s3Destination</code> in the same operation.
     * </p>
     * 
     * @param updateProjectDataDeliveryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProjectDataDelivery operation returned by the service.
     * @sample AmazonCloudWatchEvidentlyAsyncHandler.UpdateProjectDataDelivery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/UpdateProjectDataDelivery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProjectDataDeliveryResult> updateProjectDataDeliveryAsync(
            UpdateProjectDataDeliveryRequest updateProjectDataDeliveryRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProjectDataDeliveryRequest, UpdateProjectDataDeliveryResult> asyncHandler);

}
