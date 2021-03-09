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
package com.amazonaws.services.codeguruprofiler;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.codeguruprofiler.model.*;

/**
 * Interface for accessing Amazon CodeGuru Profiler.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.codeguruprofiler.AbstractAmazonCodeGuruProfiler} instead.
 * </p>
 * <p>
 * <p>
 * This section provides documentation for the Amazon CodeGuru Profiler API operations.
 * </p>
 * <p>
 * Amazon CodeGuru Profiler collects runtime performance data from your live applications, and provides recommendations
 * that can help you fine-tune your application performance. Using machine learning algorithms, CodeGuru Profiler can
 * help you find your most expensive lines of code and suggest ways you can improve efficiency and remove CPU
 * bottlenecks.
 * </p>
 * <p>
 * Amazon CodeGuru Profiler provides different visualizations of profiling data to help you identify what code is
 * running on the CPU, see how much time is consumed, and suggest ways to reduce CPU utilization.
 * </p>
 * <note>
 * <p>
 * Amazon CodeGuru Profiler currently supports applications written in all Java virtual machine (JVM) languages and
 * Python. While CodeGuru Profiler supports both visualizations and recommendations for applications written in Java, it
 * can also generate visualizations and a subset of recommendations for applications written in other JVM languages and
 * Python.
 * </p>
 * </note>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/codeguru/latest/profiler-ug/what-is-codeguru-profiler.html">What is Amazon CodeGuru
 * Profiler</a> in the <i>Amazon CodeGuru Profiler User Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonCodeGuruProfiler {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "codeguru-profiler";

    /**
     * <p>
     * Add up to 2 anomaly notifications channels for a profiling group.
     * </p>
     * 
     * @param addNotificationChannelsRequest
     *        The structure representing the AddNotificationChannelsRequest.
     * @return Result of the AddNotificationChannels operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         You have exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or use <a href="https://docs.aws.amazon.com/servicequotas/latest/userguide/intro.html">Service
     *         Quotas</a> to request a service quota increase.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AmazonCodeGuruProfiler.AddNotificationChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/AddNotificationChannels"
     *      target="_top">AWS API Documentation</a>
     */
    AddNotificationChannelsResult addNotificationChannels(AddNotificationChannelsRequest addNotificationChannelsRequest);

    /**
     * <p>
     * Returns the time series of values for a requested list of frame metrics from a time period.
     * </p>
     * 
     * @param batchGetFrameMetricDataRequest
     *        The structure representing the BatchGetFrameMetricDataRequest.
     * @return Result of the BatchGetFrameMetricData operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AmazonCodeGuruProfiler.BatchGetFrameMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/BatchGetFrameMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    BatchGetFrameMetricDataResult batchGetFrameMetricData(BatchGetFrameMetricDataRequest batchGetFrameMetricDataRequest);

    /**
     * <p>
     * Used by profiler agents to report their current state and to receive remote configuration updates. For example,
     * <code>ConfigureAgent</code> can be used to tell an agent whether to profile or not and for how long to return
     * profiling data.
     * </p>
     * 
     * @param configureAgentRequest
     *        The structure representing the configureAgentRequest.
     * @return Result of the ConfigureAgent operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AmazonCodeGuruProfiler.ConfigureAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ConfigureAgent"
     *      target="_top">AWS API Documentation</a>
     */
    ConfigureAgentResult configureAgent(ConfigureAgentRequest configureAgentRequest);

    /**
     * <p>
     * Creates a profiling group.
     * </p>
     * 
     * @param createProfilingGroupRequest
     *        The structure representing the createProfiliingGroupRequest.
     * @return Result of the CreateProfilingGroup operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         You have exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or use <a href="https://docs.aws.amazon.com/servicequotas/latest/userguide/intro.html">Service
     *         Quotas</a> to request a service quota increase.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonCodeGuruProfiler.CreateProfilingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/CreateProfilingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateProfilingGroupResult createProfilingGroup(CreateProfilingGroupRequest createProfilingGroupRequest);

    /**
     * <p>
     * Deletes a profiling group.
     * </p>
     * 
     * @param deleteProfilingGroupRequest
     *        The structure representing the deleteProfilingGroupRequest.
     * @return Result of the DeleteProfilingGroup operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AmazonCodeGuruProfiler.DeleteProfilingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/DeleteProfilingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteProfilingGroupResult deleteProfilingGroup(DeleteProfilingGroupRequest deleteProfilingGroupRequest);

    /**
     * <p>
     * Returns a <a href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ProfilingGroupDescription.html">
     * <code>ProfilingGroupDescription</code> </a> object that contains information about the requested profiling group.
     * </p>
     * 
     * @param describeProfilingGroupRequest
     *        The structure representing the describeProfilingGroupRequest.
     * @return Result of the DescribeProfilingGroup operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AmazonCodeGuruProfiler.DescribeProfilingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/DescribeProfilingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeProfilingGroupResult describeProfilingGroup(DescribeProfilingGroupRequest describeProfilingGroupRequest);

    /**
     * <p>
     * Returns a list of <a
     * href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_FindingsReportSummary.html">
     * <code>FindingsReportSummary</code> </a> objects that contain analysis results for all profiling groups in your
     * AWS account.
     * </p>
     * 
     * @param getFindingsReportAccountSummaryRequest
     *        The structure representing the GetFindingsReportAccountSummaryRequest.
     * @return Result of the GetFindingsReportAccountSummary operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonCodeGuruProfiler.GetFindingsReportAccountSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/GetFindingsReportAccountSummary"
     *      target="_top">AWS API Documentation</a>
     */
    GetFindingsReportAccountSummaryResult getFindingsReportAccountSummary(GetFindingsReportAccountSummaryRequest getFindingsReportAccountSummaryRequest);

    /**
     * <p>
     * Get the current configuration for anomaly notifications for a profiling group.
     * </p>
     * 
     * @param getNotificationConfigurationRequest
     *        The structure representing the GetNotificationConfigurationRequest.
     * @return Result of the GetNotificationConfiguration operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AmazonCodeGuruProfiler.GetNotificationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/GetNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetNotificationConfigurationResult getNotificationConfiguration(GetNotificationConfigurationRequest getNotificationConfigurationRequest);

    /**
     * <p>
     * Returns the JSON-formatted resource-based policy on a profiling group.
     * </p>
     * 
     * @param getPolicyRequest
     *        The structure representing the <code>getPolicyRequest</code>.
     * @return Result of the GetPolicy operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AmazonCodeGuruProfiler.GetPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/GetPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    GetPolicyResult getPolicy(GetPolicyRequest getPolicyRequest);

    /**
     * <p>
     * Gets the aggregated profile of a profiling group for a specified time range. Amazon CodeGuru Profiler collects
     * posted agent profiles for a profiling group into aggregated profiles.
     * </p>
     * 
     * <pre>
     * <code> &lt;note&gt; &lt;p&gt; Because aggregated profiles expire over time &lt;code&gt;GetProfile&lt;/code&gt; is not idempotent. &lt;/p&gt; &lt;/note&gt; &lt;p&gt; Specify the time range for the requested aggregated profile using 1 or 2 of the following parameters: &lt;code&gt;startTime&lt;/code&gt;, &lt;code&gt;endTime&lt;/code&gt;, &lt;code&gt;period&lt;/code&gt;. The maximum time range allowed is 7 days. If you specify all 3 parameters, an exception is thrown. If you specify only &lt;code&gt;period&lt;/code&gt;, the latest aggregated profile is returned. &lt;/p&gt; &lt;p&gt; Aggregated profiles are available with aggregation periods of 5 minutes, 1 hour, and 1 day, aligned to UTC. The aggregation period of an aggregated profile determines how long it is retained. For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_AggregatedProfileTime.html&quot;&gt; &lt;code&gt;AggregatedProfileTime&lt;/code&gt; &lt;/a&gt;. The aggregated profile's aggregation period determines how long it is retained by CodeGuru Profiler. &lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; If the aggregation period is 5 minutes, the aggregated profile is retained for 15 days. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; If the aggregation period is 1 hour, the aggregated profile is retained for 60 days. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; If the aggregation period is 1 day, the aggregated profile is retained for 3 years. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;There are two use cases for calling &lt;code&gt;GetProfile&lt;/code&gt;.&lt;/p&gt; &lt;ol&gt; &lt;li&gt; &lt;p&gt; If you want to return an aggregated profile that already exists, use &lt;a href=&quot;https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ListProfileTimes.html&quot;&gt; &lt;code&gt;ListProfileTimes&lt;/code&gt; &lt;/a&gt; to view the time ranges of existing aggregated profiles. Use them in a &lt;code&gt;GetProfile&lt;/code&gt; request to return a specific, existing aggregated profile. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; If you want to return an aggregated profile for a time range that doesn't align with an existing aggregated profile, then CodeGuru Profiler makes a best effort to combine existing aggregated profiles from the requested time range and return them as one aggregated profile. &lt;/p&gt; &lt;p&gt; If aggregated profiles do not exist for the full time range requested, then aggregated profiles for a smaller time range are returned. For example, if the requested time range is from 00:00 to 00:20, and the existing aggregated profiles are from 00:15 and 00:25, then the aggregated profiles from 00:15 to 00:20 are returned. &lt;/p&gt; &lt;/li&gt; &lt;/ol&gt; </code>
     * </pre>
     * 
     * @param getProfileRequest
     *        The structure representing the getProfileRequest.
     * @return Result of the GetProfile operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AmazonCodeGuruProfiler.GetProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/GetProfile" target="_top">AWS
     *      API Documentation</a>
     */
    GetProfileResult getProfile(GetProfileRequest getProfileRequest);

    /**
     * <p>
     * Returns a list of <a href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_Recommendation.html">
     * <code>Recommendation</code> </a> objects that contain recommendations for a profiling group for a given time
     * period. A list of <a href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_Anomaly.html">
     * <code>Anomaly</code> </a> objects that contains details about anomalies detected in the profiling group for the
     * same time period is also returned.
     * </p>
     * 
     * @param getRecommendationsRequest
     *        The structure representing the GetRecommendationsRequest.
     * @return Result of the GetRecommendations operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AmazonCodeGuruProfiler.GetRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/GetRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    GetRecommendationsResult getRecommendations(GetRecommendationsRequest getRecommendationsRequest);

    /**
     * <p>
     * List the available reports for a given profiling group and time range.
     * </p>
     * 
     * @param listFindingsReportsRequest
     *        The structure representing the ListFindingsReportsRequest.
     * @return Result of the ListFindingsReports operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AmazonCodeGuruProfiler.ListFindingsReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ListFindingsReports"
     *      target="_top">AWS API Documentation</a>
     */
    ListFindingsReportsResult listFindingsReports(ListFindingsReportsRequest listFindingsReportsRequest);

    /**
     * <p>
     * Lists the start times of the available aggregated profiles of a profiling group for an aggregation period within
     * the specified time range.
     * </p>
     * 
     * @param listProfileTimesRequest
     *        The structure representing the listProfileTimesRequest.
     * @return Result of the ListProfileTimes operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AmazonCodeGuruProfiler.ListProfileTimes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ListProfileTimes"
     *      target="_top">AWS API Documentation</a>
     */
    ListProfileTimesResult listProfileTimes(ListProfileTimesRequest listProfileTimesRequest);

    /**
     * <p>
     * Returns a list of profiling groups. The profiling groups are returned as <a
     * href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ProfilingGroupDescription.html">
     * <code>ProfilingGroupDescription</code> </a> objects.
     * </p>
     * 
     * @param listProfilingGroupsRequest
     *        The structure representing the listProfilingGroupsRequest.
     * @return Result of the ListProfilingGroups operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonCodeGuruProfiler.ListProfilingGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ListProfilingGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListProfilingGroupsResult listProfilingGroups(ListProfilingGroupsRequest listProfilingGroupsRequest);

    /**
     * <p>
     * Returns a list of the tags that are assigned to a specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AmazonCodeGuruProfiler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Submits profiling data to an aggregated profile of a profiling group. To get an aggregated profile that is
     * created with this profiling data, use <a
     * href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_GetProfile.html"> <code>GetProfile</code>
     * </a>.
     * </p>
     * 
     * @param postAgentProfileRequest
     *        The structure representing the postAgentProfileRequest.
     * @return Result of the PostAgentProfile operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AmazonCodeGuruProfiler.PostAgentProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/PostAgentProfile"
     *      target="_top">AWS API Documentation</a>
     */
    PostAgentProfileResult postAgentProfile(PostAgentProfileRequest postAgentProfileRequest);

    /**
     * <p>
     * Adds permissions to a profiling group's resource-based policy that are provided using an action group. If a
     * profiling group doesn't have a resource-based policy, one is created for it using the permissions in the action
     * group and the roles and users in the <code>principals</code> parameter.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt; The one supported action group that can be added is &lt;code&gt;agentPermission&lt;/code&gt; which grants &lt;code&gt;ConfigureAgent&lt;/code&gt; and &lt;code&gt;PostAgent&lt;/code&gt; permissions. For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/codeguru/latest/profiler-ug/resource-based-policies.html&quot;&gt;Resource-based policies in CodeGuru Profiler&lt;/a&gt; in the &lt;i&gt;Amazon CodeGuru Profiler User Guide&lt;/i&gt;, &lt;a href=&quot;https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ConfigureAgent.html&quot;&gt; &lt;code&gt;ConfigureAgent&lt;/code&gt; &lt;/a&gt;, and &lt;a href=&quot;https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_PostAgentProfile.html&quot;&gt; &lt;code&gt;PostAgentProfile&lt;/code&gt; &lt;/a&gt;. &lt;/p&gt; &lt;p&gt; The first time you call &lt;code&gt;PutPermission&lt;/code&gt; on a profiling group, do not specify a &lt;code&gt;revisionId&lt;/code&gt; because it doesn't have a resource-based policy. Subsequent calls must provide a &lt;code&gt;revisionId&lt;/code&gt; to specify which revision of the resource-based policy to add the permissions to. &lt;/p&gt; &lt;p&gt; The response contains the profiling group's JSON-formatted resource policy. &lt;/p&gt; </code>
     * </pre>
     * 
     * @param putPermissionRequest
     *        The structure representing the <code>putPermissionRequest</code>.
     * @return Result of the PutPermission operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AmazonCodeGuruProfiler.PutPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/PutPermission" target="_top">AWS
     *      API Documentation</a>
     */
    PutPermissionResult putPermission(PutPermissionRequest putPermissionRequest);

    /**
     * <p>
     * Remove one anomaly notifications channel for a profiling group.
     * </p>
     * 
     * @param removeNotificationChannelRequest
     *        The structure representing the RemoveNotificationChannelRequest.
     * @return Result of the RemoveNotificationChannel operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AmazonCodeGuruProfiler.RemoveNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/RemoveNotificationChannel"
     *      target="_top">AWS API Documentation</a>
     */
    RemoveNotificationChannelResult removeNotificationChannel(RemoveNotificationChannelRequest removeNotificationChannelRequest);

    /**
     * <p>
     * Removes permissions from a profiling group's resource-based policy that are provided using an action group. The
     * one supported action group that can be removed is <code>agentPermission</code> which grants
     * <code>ConfigureAgent</code> and <code>PostAgent</code> permissions. For more information, see <a
     * href="https://docs.aws.amazon.com/codeguru/latest/profiler-ug/resource-based-policies.html">Resource-based
     * policies in CodeGuru Profiler</a> in the <i>Amazon CodeGuru Profiler User Guide</i>, <a
     * href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ConfigureAgent.html">
     * <code>ConfigureAgent</code> </a>, and <a
     * href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_PostAgentProfile.html">
     * <code>PostAgentProfile</code> </a>.
     * </p>
     * 
     * @param removePermissionRequest
     *        <pre>
     * <code> The structure representing the &lt;code&gt;removePermissionRequest&lt;/code&gt;.&lt;/p&gt; </code>
     * @return Result of the RemovePermission operation returned by the service.
     * @throws InternalServerException The server encountered an internal error and is unable to complete the request.
     * @throws ConflictException The requested operation would cause a conflict with the current state of a service resource associated with the request. Resolve the conflict before retrying this request.
     * @throws ValidationException The parameter is not valid.
     * @throws ThrottlingException The request was denied due to request throttling.
     * @throws ResourceNotFoundException The resource specified in the request does not exist.
     * @sample AmazonCodeGuruProfiler.RemovePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/RemovePermission" target="_top">AWS API Documentation</a>
     */
    RemovePermissionResult removePermission(RemovePermissionRequest removePermissionRequest);

    /**
     * <p>
     * Sends feedback to CodeGuru Profiler about whether the anomaly detected by the analysis is useful or not.
     * </p>
     * 
     * @param submitFeedbackRequest
     *        The structure representing the SubmitFeedbackRequest.
     * @return Result of the SubmitFeedback operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AmazonCodeGuruProfiler.SubmitFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/SubmitFeedback"
     *      target="_top">AWS API Documentation</a>
     */
    SubmitFeedbackResult submitFeedback(SubmitFeedbackRequest submitFeedbackRequest);

    /**
     * <p>
     * Use to assign one or more tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AmazonCodeGuruProfiler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Use to remove one or more tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AmazonCodeGuruProfiler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a profiling group.
     * </p>
     * 
     * @param updateProfilingGroupRequest
     *        The structure representing the updateProfilingGroupRequest.
     * @return Result of the UpdateProfilingGroup operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @sample AmazonCodeGuruProfiler.UpdateProfilingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/UpdateProfilingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateProfilingGroupResult updateProfilingGroup(UpdateProfilingGroupRequest updateProfilingGroupRequest);

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
