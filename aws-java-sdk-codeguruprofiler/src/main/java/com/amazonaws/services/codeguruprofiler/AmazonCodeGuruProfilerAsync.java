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

import com.amazonaws.services.codeguruprofiler.model.*;

/**
 * Interface for accessing Amazon CodeGuru Profiler asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.codeguruprofiler.AbstractAmazonCodeGuruProfilerAsync} instead.
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
public interface AmazonCodeGuruProfilerAsync extends AmazonCodeGuruProfiler {

    /**
     * <p>
     * Add up to 2 anomaly notifications channels for a profiling group.
     * </p>
     * 
     * @param addNotificationChannelsRequest
     *        The structure representing the AddNotificationChannelsRequest.
     * @return A Java Future containing the result of the AddNotificationChannels operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsync.AddNotificationChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/AddNotificationChannels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddNotificationChannelsResult> addNotificationChannelsAsync(AddNotificationChannelsRequest addNotificationChannelsRequest);

    /**
     * <p>
     * Add up to 2 anomaly notifications channels for a profiling group.
     * </p>
     * 
     * @param addNotificationChannelsRequest
     *        The structure representing the AddNotificationChannelsRequest.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddNotificationChannels operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsyncHandler.AddNotificationChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/AddNotificationChannels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddNotificationChannelsResult> addNotificationChannelsAsync(AddNotificationChannelsRequest addNotificationChannelsRequest,
            com.amazonaws.handlers.AsyncHandler<AddNotificationChannelsRequest, AddNotificationChannelsResult> asyncHandler);

    /**
     * <p>
     * Returns the time series of values for a requested list of frame metrics from a time period.
     * </p>
     * 
     * @param batchGetFrameMetricDataRequest
     *        The structure representing the BatchGetFrameMetricDataRequest.
     * @return A Java Future containing the result of the BatchGetFrameMetricData operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsync.BatchGetFrameMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/BatchGetFrameMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetFrameMetricDataResult> batchGetFrameMetricDataAsync(BatchGetFrameMetricDataRequest batchGetFrameMetricDataRequest);

    /**
     * <p>
     * Returns the time series of values for a requested list of frame metrics from a time period.
     * </p>
     * 
     * @param batchGetFrameMetricDataRequest
     *        The structure representing the BatchGetFrameMetricDataRequest.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetFrameMetricData operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsyncHandler.BatchGetFrameMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/BatchGetFrameMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetFrameMetricDataResult> batchGetFrameMetricDataAsync(BatchGetFrameMetricDataRequest batchGetFrameMetricDataRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetFrameMetricDataRequest, BatchGetFrameMetricDataResult> asyncHandler);

    /**
     * <p>
     * Used by profiler agents to report their current state and to receive remote configuration updates. For example,
     * <code>ConfigureAgent</code> can be used to tell an agent whether to profile or not and for how long to return
     * profiling data.
     * </p>
     * 
     * @param configureAgentRequest
     *        The structure representing the configureAgentRequest.
     * @return A Java Future containing the result of the ConfigureAgent operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsync.ConfigureAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ConfigureAgent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ConfigureAgentResult> configureAgentAsync(ConfigureAgentRequest configureAgentRequest);

    /**
     * <p>
     * Used by profiler agents to report their current state and to receive remote configuration updates. For example,
     * <code>ConfigureAgent</code> can be used to tell an agent whether to profile or not and for how long to return
     * profiling data.
     * </p>
     * 
     * @param configureAgentRequest
     *        The structure representing the configureAgentRequest.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ConfigureAgent operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsyncHandler.ConfigureAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ConfigureAgent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ConfigureAgentResult> configureAgentAsync(ConfigureAgentRequest configureAgentRequest,
            com.amazonaws.handlers.AsyncHandler<ConfigureAgentRequest, ConfigureAgentResult> asyncHandler);

    /**
     * <p>
     * Creates a profiling group.
     * </p>
     * 
     * @param createProfilingGroupRequest
     *        The structure representing the createProfiliingGroupRequest.
     * @return A Java Future containing the result of the CreateProfilingGroup operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsync.CreateProfilingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/CreateProfilingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateProfilingGroupResult> createProfilingGroupAsync(CreateProfilingGroupRequest createProfilingGroupRequest);

    /**
     * <p>
     * Creates a profiling group.
     * </p>
     * 
     * @param createProfilingGroupRequest
     *        The structure representing the createProfiliingGroupRequest.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProfilingGroup operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsyncHandler.CreateProfilingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/CreateProfilingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateProfilingGroupResult> createProfilingGroupAsync(CreateProfilingGroupRequest createProfilingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProfilingGroupRequest, CreateProfilingGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes a profiling group.
     * </p>
     * 
     * @param deleteProfilingGroupRequest
     *        The structure representing the deleteProfilingGroupRequest.
     * @return A Java Future containing the result of the DeleteProfilingGroup operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsync.DeleteProfilingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/DeleteProfilingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProfilingGroupResult> deleteProfilingGroupAsync(DeleteProfilingGroupRequest deleteProfilingGroupRequest);

    /**
     * <p>
     * Deletes a profiling group.
     * </p>
     * 
     * @param deleteProfilingGroupRequest
     *        The structure representing the deleteProfilingGroupRequest.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProfilingGroup operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsyncHandler.DeleteProfilingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/DeleteProfilingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProfilingGroupResult> deleteProfilingGroupAsync(DeleteProfilingGroupRequest deleteProfilingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProfilingGroupRequest, DeleteProfilingGroupResult> asyncHandler);

    /**
     * <p>
     * Returns a <a href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ProfilingGroupDescription.html">
     * <code>ProfilingGroupDescription</code> </a> object that contains information about the requested profiling group.
     * </p>
     * 
     * @param describeProfilingGroupRequest
     *        The structure representing the describeProfilingGroupRequest.
     * @return A Java Future containing the result of the DescribeProfilingGroup operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsync.DescribeProfilingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/DescribeProfilingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProfilingGroupResult> describeProfilingGroupAsync(DescribeProfilingGroupRequest describeProfilingGroupRequest);

    /**
     * <p>
     * Returns a <a href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ProfilingGroupDescription.html">
     * <code>ProfilingGroupDescription</code> </a> object that contains information about the requested profiling group.
     * </p>
     * 
     * @param describeProfilingGroupRequest
     *        The structure representing the describeProfilingGroupRequest.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProfilingGroup operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsyncHandler.DescribeProfilingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/DescribeProfilingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProfilingGroupResult> describeProfilingGroupAsync(DescribeProfilingGroupRequest describeProfilingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProfilingGroupRequest, DescribeProfilingGroupResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetFindingsReportAccountSummary operation returned by the
     *         service.
     * @sample AmazonCodeGuruProfilerAsync.GetFindingsReportAccountSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/GetFindingsReportAccountSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFindingsReportAccountSummaryResult> getFindingsReportAccountSummaryAsync(
            GetFindingsReportAccountSummaryRequest getFindingsReportAccountSummaryRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFindingsReportAccountSummary operation returned by the
     *         service.
     * @sample AmazonCodeGuruProfilerAsyncHandler.GetFindingsReportAccountSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/GetFindingsReportAccountSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFindingsReportAccountSummaryResult> getFindingsReportAccountSummaryAsync(
            GetFindingsReportAccountSummaryRequest getFindingsReportAccountSummaryRequest,
            com.amazonaws.handlers.AsyncHandler<GetFindingsReportAccountSummaryRequest, GetFindingsReportAccountSummaryResult> asyncHandler);

    /**
     * <p>
     * Get the current configuration for anomaly notifications for a profiling group.
     * </p>
     * 
     * @param getNotificationConfigurationRequest
     *        The structure representing the GetNotificationConfigurationRequest.
     * @return A Java Future containing the result of the GetNotificationConfiguration operation returned by the
     *         service.
     * @sample AmazonCodeGuruProfilerAsync.GetNotificationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/GetNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetNotificationConfigurationResult> getNotificationConfigurationAsync(
            GetNotificationConfigurationRequest getNotificationConfigurationRequest);

    /**
     * <p>
     * Get the current configuration for anomaly notifications for a profiling group.
     * </p>
     * 
     * @param getNotificationConfigurationRequest
     *        The structure representing the GetNotificationConfigurationRequest.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetNotificationConfiguration operation returned by the
     *         service.
     * @sample AmazonCodeGuruProfilerAsyncHandler.GetNotificationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/GetNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetNotificationConfigurationResult> getNotificationConfigurationAsync(
            GetNotificationConfigurationRequest getNotificationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetNotificationConfigurationRequest, GetNotificationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Returns the JSON-formatted resource-based policy on a profiling group.
     * </p>
     * 
     * @param getPolicyRequest
     *        The structure representing the <code>getPolicyRequest</code>.
     * @return A Java Future containing the result of the GetPolicy operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsync.GetPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/GetPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest getPolicyRequest);

    /**
     * <p>
     * Returns the JSON-formatted resource-based policy on a profiling group.
     * </p>
     * 
     * @param getPolicyRequest
     *        The structure representing the <code>getPolicyRequest</code>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPolicy operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsyncHandler.GetPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/GetPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest getPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetPolicyRequest, GetPolicyResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetProfile operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsync.GetProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/GetProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetProfileResult> getProfileAsync(GetProfileRequest getProfileRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetProfile operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsyncHandler.GetProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/GetProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetProfileResult> getProfileAsync(GetProfileRequest getProfileRequest,
            com.amazonaws.handlers.AsyncHandler<GetProfileRequest, GetProfileResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetRecommendations operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsync.GetRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/GetRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecommendationsResult> getRecommendationsAsync(GetRecommendationsRequest getRecommendationsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRecommendations operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsyncHandler.GetRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/GetRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecommendationsResult> getRecommendationsAsync(GetRecommendationsRequest getRecommendationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetRecommendationsRequest, GetRecommendationsResult> asyncHandler);

    /**
     * <p>
     * List the available reports for a given profiling group and time range.
     * </p>
     * 
     * @param listFindingsReportsRequest
     *        The structure representing the ListFindingsReportsRequest.
     * @return A Java Future containing the result of the ListFindingsReports operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsync.ListFindingsReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ListFindingsReports"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFindingsReportsResult> listFindingsReportsAsync(ListFindingsReportsRequest listFindingsReportsRequest);

    /**
     * <p>
     * List the available reports for a given profiling group and time range.
     * </p>
     * 
     * @param listFindingsReportsRequest
     *        The structure representing the ListFindingsReportsRequest.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFindingsReports operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsyncHandler.ListFindingsReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ListFindingsReports"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFindingsReportsResult> listFindingsReportsAsync(ListFindingsReportsRequest listFindingsReportsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFindingsReportsRequest, ListFindingsReportsResult> asyncHandler);

    /**
     * <p>
     * Lists the start times of the available aggregated profiles of a profiling group for an aggregation period within
     * the specified time range.
     * </p>
     * 
     * @param listProfileTimesRequest
     *        The structure representing the listProfileTimesRequest.
     * @return A Java Future containing the result of the ListProfileTimes operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsync.ListProfileTimes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ListProfileTimes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProfileTimesResult> listProfileTimesAsync(ListProfileTimesRequest listProfileTimesRequest);

    /**
     * <p>
     * Lists the start times of the available aggregated profiles of a profiling group for an aggregation period within
     * the specified time range.
     * </p>
     * 
     * @param listProfileTimesRequest
     *        The structure representing the listProfileTimesRequest.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProfileTimes operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsyncHandler.ListProfileTimes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ListProfileTimes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProfileTimesResult> listProfileTimesAsync(ListProfileTimesRequest listProfileTimesRequest,
            com.amazonaws.handlers.AsyncHandler<ListProfileTimesRequest, ListProfileTimesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of profiling groups. The profiling groups are returned as <a
     * href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ProfilingGroupDescription.html">
     * <code>ProfilingGroupDescription</code> </a> objects.
     * </p>
     * 
     * @param listProfilingGroupsRequest
     *        The structure representing the listProfilingGroupsRequest.
     * @return A Java Future containing the result of the ListProfilingGroups operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsync.ListProfilingGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ListProfilingGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProfilingGroupsResult> listProfilingGroupsAsync(ListProfilingGroupsRequest listProfilingGroupsRequest);

    /**
     * <p>
     * Returns a list of profiling groups. The profiling groups are returned as <a
     * href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ProfilingGroupDescription.html">
     * <code>ProfilingGroupDescription</code> </a> objects.
     * </p>
     * 
     * @param listProfilingGroupsRequest
     *        The structure representing the listProfilingGroupsRequest.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProfilingGroups operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsyncHandler.ListProfilingGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ListProfilingGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProfilingGroupsResult> listProfilingGroupsAsync(ListProfilingGroupsRequest listProfilingGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProfilingGroupsRequest, ListProfilingGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the tags that are assigned to a specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of the tags that are assigned to a specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the PostAgentProfile operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsync.PostAgentProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/PostAgentProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PostAgentProfileResult> postAgentProfileAsync(PostAgentProfileRequest postAgentProfileRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PostAgentProfile operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsyncHandler.PostAgentProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/PostAgentProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PostAgentProfileResult> postAgentProfileAsync(PostAgentProfileRequest postAgentProfileRequest,
            com.amazonaws.handlers.AsyncHandler<PostAgentProfileRequest, PostAgentProfileResult> asyncHandler);

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
     * @return A Java Future containing the result of the PutPermission operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsync.PutPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/PutPermission" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutPermissionResult> putPermissionAsync(PutPermissionRequest putPermissionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutPermission operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsyncHandler.PutPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/PutPermission" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutPermissionResult> putPermissionAsync(PutPermissionRequest putPermissionRequest,
            com.amazonaws.handlers.AsyncHandler<PutPermissionRequest, PutPermissionResult> asyncHandler);

    /**
     * <p>
     * Remove one anomaly notifications channel for a profiling group.
     * </p>
     * 
     * @param removeNotificationChannelRequest
     *        The structure representing the RemoveNotificationChannelRequest.
     * @return A Java Future containing the result of the RemoveNotificationChannel operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsync.RemoveNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/RemoveNotificationChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveNotificationChannelResult> removeNotificationChannelAsync(
            RemoveNotificationChannelRequest removeNotificationChannelRequest);

    /**
     * <p>
     * Remove one anomaly notifications channel for a profiling group.
     * </p>
     * 
     * @param removeNotificationChannelRequest
     *        The structure representing the RemoveNotificationChannelRequest.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveNotificationChannel operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsyncHandler.RemoveNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/RemoveNotificationChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveNotificationChannelResult> removeNotificationChannelAsync(
            RemoveNotificationChannelRequest removeNotificationChannelRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveNotificationChannelRequest, RemoveNotificationChannelResult> asyncHandler);

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
     * @return A Java Future containing the result of the RemovePermission operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsync.RemovePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/RemovePermission" target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(RemovePermissionRequest removePermissionRequest);

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
     * @param asyncHandler Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemovePermission operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsyncHandler.RemovePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/RemovePermission" target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(RemovePermissionRequest removePermissionRequest,
            com.amazonaws.handlers.AsyncHandler<RemovePermissionRequest, RemovePermissionResult> asyncHandler);

    /**
     * <p>
     * Sends feedback to CodeGuru Profiler about whether the anomaly detected by the analysis is useful or not.
     * </p>
     * 
     * @param submitFeedbackRequest
     *        The structure representing the SubmitFeedbackRequest.
     * @return A Java Future containing the result of the SubmitFeedback operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsync.SubmitFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/SubmitFeedback"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SubmitFeedbackResult> submitFeedbackAsync(SubmitFeedbackRequest submitFeedbackRequest);

    /**
     * <p>
     * Sends feedback to CodeGuru Profiler about whether the anomaly detected by the analysis is useful or not.
     * </p>
     * 
     * @param submitFeedbackRequest
     *        The structure representing the SubmitFeedbackRequest.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SubmitFeedback operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsyncHandler.SubmitFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/SubmitFeedback"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SubmitFeedbackResult> submitFeedbackAsync(SubmitFeedbackRequest submitFeedbackRequest,
            com.amazonaws.handlers.AsyncHandler<SubmitFeedbackRequest, SubmitFeedbackResult> asyncHandler);

    /**
     * <p>
     * Use to assign one or more tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Use to assign one or more tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Use to remove one or more tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Use to remove one or more tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a profiling group.
     * </p>
     * 
     * @param updateProfilingGroupRequest
     *        The structure representing the updateProfilingGroupRequest.
     * @return A Java Future containing the result of the UpdateProfilingGroup operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsync.UpdateProfilingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/UpdateProfilingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProfilingGroupResult> updateProfilingGroupAsync(UpdateProfilingGroupRequest updateProfilingGroupRequest);

    /**
     * <p>
     * Updates a profiling group.
     * </p>
     * 
     * @param updateProfilingGroupRequest
     *        The structure representing the updateProfilingGroupRequest.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProfilingGroup operation returned by the service.
     * @sample AmazonCodeGuruProfilerAsyncHandler.UpdateProfilingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/UpdateProfilingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProfilingGroupResult> updateProfilingGroupAsync(UpdateProfilingGroupRequest updateProfilingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProfilingGroupRequest, UpdateProfilingGroupResult> asyncHandler);

}
