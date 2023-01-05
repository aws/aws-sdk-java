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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.cloudwatchevidently.model.*;

/**
 * Interface for accessing Amazon CloudWatch Evidently.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudwatchevidently.AbstractAmazonCloudWatchEvidently} instead.
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
public interface AmazonCloudWatchEvidently {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "evidently";

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
     * @return Result of the BatchEvaluateFeature operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.BatchEvaluateFeature
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/BatchEvaluateFeature" target="_top">AWS
     *      API Documentation</a>
     */
    BatchEvaluateFeatureResult batchEvaluateFeature(BatchEvaluateFeatureRequest batchEvaluateFeatureRequest);

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
     * @return Result of the CreateExperiment operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.CreateExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/CreateExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    CreateExperimentResult createExperiment(CreateExperimentRequest createExperimentRequest);

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
     * @return Result of the CreateFeature operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.CreateFeature
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/CreateFeature" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFeatureResult createFeature(CreateFeatureRequest createFeatureRequest);

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
     * @return Result of the CreateLaunch operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.CreateLaunch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/CreateLaunch" target="_top">AWS API
     *      Documentation</a>
     */
    CreateLaunchResult createLaunch(CreateLaunchRequest createLaunchRequest);

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
     * @return Result of the CreateProject operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    CreateProjectResult createProject(CreateProjectRequest createProjectRequest);

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
     * @return Result of the CreateSegment operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.CreateSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/CreateSegment" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSegmentResult createSegment(CreateSegmentRequest createSegmentRequest);

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
     * @return Result of the DeleteExperiment operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ServiceUnavailableException
     *         The service was unavailable. Retry the request.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.DeleteExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/DeleteExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteExperimentResult deleteExperiment(DeleteExperimentRequest deleteExperimentRequest);

    /**
     * <p>
     * Deletes an Evidently feature.
     * </p>
     * 
     * @param deleteFeatureRequest
     * @return Result of the DeleteFeature operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.DeleteFeature
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/DeleteFeature" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFeatureResult deleteFeature(DeleteFeatureRequest deleteFeatureRequest);

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
     * @return Result of the DeleteLaunch operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.DeleteLaunch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/DeleteLaunch" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteLaunchResult deleteLaunch(DeleteLaunchRequest deleteLaunchRequest);

    /**
     * <p>
     * Deletes an Evidently project. Before you can delete a project, you must delete all the features that the project
     * contains. To delete a feature, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_DeleteFeature.html"
     * >DeleteFeature</a>.
     * </p>
     * 
     * @param deleteProjectRequest
     * @return Result of the DeleteProject operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteProjectResult deleteProject(DeleteProjectRequest deleteProjectRequest);

    /**
     * <p>
     * Deletes a segment. You can't delete a segment that is being used in a launch or experiment, even if that launch
     * or experiment is not currently running.
     * </p>
     * 
     * @param deleteSegmentRequest
     * @return Result of the DeleteSegment operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.DeleteSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/DeleteSegment" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSegmentResult deleteSegment(DeleteSegmentRequest deleteSegmentRequest);

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
     * @return Result of the EvaluateFeature operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.EvaluateFeature
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/EvaluateFeature" target="_top">AWS API
     *      Documentation</a>
     */
    EvaluateFeatureResult evaluateFeature(EvaluateFeatureRequest evaluateFeatureRequest);

    /**
     * <p>
     * Returns the details about one experiment. You must already know the experiment name. To retrieve a list of
     * experiments in your account, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_ListExperiments.html"
     * >ListExperiments</a>.
     * </p>
     * 
     * @param getExperimentRequest
     * @return Result of the GetExperiment operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.GetExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/GetExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    GetExperimentResult getExperiment(GetExperimentRequest getExperimentRequest);

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
     * @return Result of the GetExperimentResults operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.GetExperimentResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/GetExperimentResults" target="_top">AWS
     *      API Documentation</a>
     */
    GetExperimentResultsResult getExperimentResults(GetExperimentResultsRequest getExperimentResultsRequest);

    /**
     * <p>
     * Returns the details about one feature. You must already know the feature name. To retrieve a list of features in
     * your account, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_ListFeatures.html"
     * >ListFeatures</a>.
     * </p>
     * 
     * @param getFeatureRequest
     * @return Result of the GetFeature operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.GetFeature
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/GetFeature" target="_top">AWS API
     *      Documentation</a>
     */
    GetFeatureResult getFeature(GetFeatureRequest getFeatureRequest);

    /**
     * <p>
     * Returns the details about one launch. You must already know the launch name. To retrieve a list of launches in
     * your account, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_ListLaunches.html"
     * >ListLaunches</a>.
     * </p>
     * 
     * @param getLaunchRequest
     * @return Result of the GetLaunch operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.GetLaunch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/GetLaunch" target="_top">AWS API
     *      Documentation</a>
     */
    GetLaunchResult getLaunch(GetLaunchRequest getLaunchRequest);

    /**
     * <p>
     * Returns the details about one launch. You must already know the project name. To retrieve a list of projects in
     * your account, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_ListProjects.html"
     * >ListProjects</a>.
     * </p>
     * 
     * @param getProjectRequest
     * @return Result of the GetProject operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.GetProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/GetProject" target="_top">AWS API
     *      Documentation</a>
     */
    GetProjectResult getProject(GetProjectRequest getProjectRequest);

    /**
     * <p>
     * Returns information about the specified segment. Specify the segment you want to view by specifying its ARN.
     * </p>
     * 
     * @param getSegmentRequest
     * @return Result of the GetSegment operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.GetSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/GetSegment" target="_top">AWS API
     *      Documentation</a>
     */
    GetSegmentResult getSegment(GetSegmentRequest getSegmentRequest);

    /**
     * <p>
     * Returns configuration details about all the experiments in the specified project.
     * </p>
     * 
     * @param listExperimentsRequest
     * @return Result of the ListExperiments operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.ListExperiments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListExperiments" target="_top">AWS API
     *      Documentation</a>
     */
    ListExperimentsResult listExperiments(ListExperimentsRequest listExperimentsRequest);

    /**
     * <p>
     * Returns configuration details about all the features in the specified project.
     * </p>
     * 
     * @param listFeaturesRequest
     * @return Result of the ListFeatures operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.ListFeatures
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListFeatures" target="_top">AWS API
     *      Documentation</a>
     */
    ListFeaturesResult listFeatures(ListFeaturesRequest listFeaturesRequest);

    /**
     * <p>
     * Returns configuration details about all the launches in the specified project.
     * </p>
     * 
     * @param listLaunchesRequest
     * @return Result of the ListLaunches operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.ListLaunches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListLaunches" target="_top">AWS API
     *      Documentation</a>
     */
    ListLaunchesResult listLaunches(ListLaunchesRequest listLaunchesRequest);

    /**
     * <p>
     * Returns configuration details about all the projects in the current Region in your account.
     * </p>
     * 
     * @param listProjectsRequest
     * @return Result of the ListProjects operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    ListProjectsResult listProjects(ListProjectsRequest listProjectsRequest);

    /**
     * <p>
     * Use this operation to find which experiments or launches are using a specified segment.
     * </p>
     * 
     * @param listSegmentReferencesRequest
     * @return Result of the ListSegmentReferences operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.ListSegmentReferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListSegmentReferences"
     *      target="_top">AWS API Documentation</a>
     */
    ListSegmentReferencesResult listSegmentReferences(ListSegmentReferencesRequest listSegmentReferencesRequest);

    /**
     * <p>
     * Returns a list of audience segments that you have created in your account in this Region.
     * </p>
     * 
     * @param listSegmentsRequest
     * @return Result of the ListSegments operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.ListSegments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListSegments" target="_top">AWS API
     *      Documentation</a>
     */
    ListSegmentsResult listSegments(ListSegmentsRequest listSegmentsRequest);

    /**
     * <p>
     * Displays the tags associated with an Evidently resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AmazonCloudWatchEvidently.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Sends performance events to Evidently. These events can be used to evaluate a launch or an experiment.
     * </p>
     * 
     * @param putProjectEventsRequest
     * @return Result of the PutProjectEvents operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.PutProjectEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/PutProjectEvents" target="_top">AWS API
     *      Documentation</a>
     */
    PutProjectEventsResult putProjectEvents(PutProjectEventsRequest putProjectEventsRequest);

    /**
     * <p>
     * Starts an existing experiment. To create an experiment, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_CreateExperiment.html"
     * >CreateExperiment</a>.
     * </p>
     * 
     * @param startExperimentRequest
     * @return Result of the StartExperiment operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.StartExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/StartExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    StartExperimentResult startExperiment(StartExperimentRequest startExperimentRequest);

    /**
     * <p>
     * Starts an existing launch. To create a launch, use <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_CreateLaunch.html"
     * >CreateLaunch</a>.
     * </p>
     * 
     * @param startLaunchRequest
     * @return Result of the StartLaunch operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.StartLaunch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/StartLaunch" target="_top">AWS API
     *      Documentation</a>
     */
    StartLaunchResult startLaunch(StartLaunchRequest startLaunchRequest);

    /**
     * <p>
     * Stops an experiment that is currently running. If you stop an experiment, you can't resume it or restart it.
     * </p>
     * 
     * @param stopExperimentRequest
     * @return Result of the StopExperiment operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.StopExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/StopExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    StopExperimentResult stopExperiment(StopExperimentRequest stopExperimentRequest);

    /**
     * <p>
     * Stops a launch that is currently running. After you stop a launch, you will not be able to resume it or restart
     * it. Also, it will not be evaluated as a rule for traffic allocation, and the traffic that was allocated to the
     * launch will instead be available to the feature's experiment, if there is one. Otherwise, all traffic will be
     * served the default variation after the launch is stopped.
     * </p>
     * 
     * @param stopLaunchRequest
     * @return Result of the StopLaunch operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.StopLaunch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/StopLaunch" target="_top">AWS API
     *      Documentation</a>
     */
    StopLaunchResult stopLaunch(StopLaunchRequest stopLaunchRequest);

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
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AmazonCloudWatchEvidently.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Use this operation to test a rules pattern that you plan to use to create an audience segment. For more
     * information about segments, see <a
     * href="https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_CreateSegment.html"
     * >CreateSegment</a>.
     * </p>
     * 
     * @param testSegmentPatternRequest
     * @return Result of the TestSegmentPattern operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.TestSegmentPattern
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/TestSegmentPattern" target="_top">AWS
     *      API Documentation</a>
     */
    TestSegmentPatternResult testSegmentPattern(TestSegmentPatternRequest testSegmentPatternRequest);

    /**
     * <p>
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AmazonCloudWatchEvidently.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
     * @return Result of the UpdateExperiment operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.UpdateExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/UpdateExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateExperimentResult updateExperiment(UpdateExperimentRequest updateExperimentRequest);

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
     * @return Result of the UpdateFeature operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.UpdateFeature
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/UpdateFeature" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateFeatureResult updateFeature(UpdateFeatureRequest updateFeatureRequest);

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
     * @return Result of the UpdateLaunch operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.UpdateLaunch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/UpdateLaunch" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateLaunchResult updateLaunch(UpdateLaunchRequest updateLaunchRequest);

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
     * @return Result of the UpdateProject operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateProjectResult updateProject(UpdateProjectRequest updateProjectRequest);

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
     * @return Result of the UpdateProjectDataDelivery operation returned by the service.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonCloudWatchEvidently.UpdateProjectDataDelivery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/UpdateProjectDataDelivery"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateProjectDataDeliveryResult updateProjectDataDelivery(UpdateProjectDataDeliveryRequest updateProjectDataDeliveryRequest);

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
