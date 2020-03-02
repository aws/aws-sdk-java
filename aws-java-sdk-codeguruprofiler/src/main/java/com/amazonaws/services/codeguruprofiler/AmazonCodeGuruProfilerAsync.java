/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonCodeGuruProfilerAsync extends AmazonCodeGuruProfiler {

    /**
     * <p/>
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
     * <p/>
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
     * Describes a profiling group.
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
     * Describes a profiling group.
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
     * Gets the aggregated profile of a profiling group for the specified time range. If the requested time range does
     * not align with the available aggregated profiles, it is expanded to attain alignment. If aggregated profiles are
     * available only for part of the period requested, the profile is returned from the earliest available to the
     * latest within the requested time range.
     * </p>
     * <p>
     * For example, if the requested time range is from 00:00 to 00:20 and the available profiles are from 00:15 to
     * 00:25, the returned profile will be from 00:15 to 00:20.
     * </p>
     * <p>
     * You must specify exactly two of the following parameters: <code>startTime</code>, <code>period</code>, and
     * <code>endTime</code>.
     * </p>
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
     * Gets the aggregated profile of a profiling group for the specified time range. If the requested time range does
     * not align with the available aggregated profiles, it is expanded to attain alignment. If aggregated profiles are
     * available only for part of the period requested, the profile is returned from the earliest available to the
     * latest within the requested time range.
     * </p>
     * <p>
     * For example, if the requested time range is from 00:00 to 00:20 and the available profiles are from 00:15 to
     * 00:25, the returned profile will be from 00:15 to 00:20.
     * </p>
     * <p>
     * You must specify exactly two of the following parameters: <code>startTime</code>, <code>period</code>, and
     * <code>endTime</code>.
     * </p>
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
     * List the start times of the available aggregated profiles of a profiling group for an aggregation period within
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
     * List the start times of the available aggregated profiles of a profiling group for an aggregation period within
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
     * Lists profiling groups.
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
     * Lists profiling groups.
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
     * <p/>
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
     * <p/>
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
