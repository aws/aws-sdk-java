/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Example service documentation.
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
     * Provides the configuration to use for an agent of the profiling group.
     * </p>
     * 
     * @param configureAgentRequest
     *        Request for ConfigureAgent operation.
     * @return Result of the ConfigureAgent operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the constraints of the API.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @sample AmazonCodeGuruProfiler.ConfigureAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ConfigureAgent"
     *      target="_top">AWS API Documentation</a>
     */
    ConfigureAgentResult configureAgent(ConfigureAgentRequest configureAgentRequest);

    /**
     * <p>
     * Create a profiling group.
     * </p>
     * 
     * @param createProfilingGroupRequest
     *        Request for CreateProfilingGroup operation.
     * @return Result of the CreateProfilingGroup operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ConflictException
     *         Request can can cause an inconsistent state for the resource.
     * @throws ValidationException
     *         The input fails to satisfy the constraints of the API.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AmazonCodeGuruProfiler.CreateProfilingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/CreateProfilingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateProfilingGroupResult createProfilingGroup(CreateProfilingGroupRequest createProfilingGroupRequest);

    /**
     * <p>
     * Delete a profiling group.
     * </p>
     * 
     * @param deleteProfilingGroupRequest
     *        Request for DeleteProfilingGroup operation.
     * @return Result of the DeleteProfilingGroup operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the constraints of the API.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @sample AmazonCodeGuruProfiler.DeleteProfilingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/DeleteProfilingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteProfilingGroupResult deleteProfilingGroup(DeleteProfilingGroupRequest deleteProfilingGroupRequest);

    /**
     * <p>
     * Describe a profiling group.
     * </p>
     * 
     * @param describeProfilingGroupRequest
     *        Request for DescribeProfilingGroup operation.
     * @return Result of the DescribeProfilingGroup operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the constraints of the API.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @sample AmazonCodeGuruProfiler.DescribeProfilingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/DescribeProfilingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeProfilingGroupResult describeProfilingGroup(DescribeProfilingGroupRequest describeProfilingGroupRequest);

    /**
     * <p>
     * Get the aggregated profile of a profiling group for the specified time range. If the requested time range does
     * not align with the available aggregated profiles, it will be expanded to attain alignment. If aggregated profiles
     * are available only for part of the period requested, the profile is returned from the earliest available to the
     * latest within the requested time range. For instance, if the requested time range is from 00:00 to 00:20 and the
     * available profiles are from 00:15 to 00:25, then the returned profile will be from 00:15 to 00:20.
     * </p>
     * 
     * @param getProfileRequest
     *        Request for GetProfile operation.
     * @return Result of the GetProfile operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the constraints of the API.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @sample AmazonCodeGuruProfiler.GetProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/GetProfile" target="_top">AWS
     *      API Documentation</a>
     */
    GetProfileResult getProfile(GetProfileRequest getProfileRequest);

    /**
     * <p>
     * List the start times of the available aggregated profiles of a profiling group for an aggregation period within
     * the specified time range.
     * </p>
     * 
     * @param listProfileTimesRequest
     *        Request for ListProfileTimes operation.
     * @return Result of the ListProfileTimes operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the constraints of the API.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @sample AmazonCodeGuruProfiler.ListProfileTimes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ListProfileTimes"
     *      target="_top">AWS API Documentation</a>
     */
    ListProfileTimesResult listProfileTimes(ListProfileTimesRequest listProfileTimesRequest);

    /**
     * <p>
     * List profiling groups in the account.
     * </p>
     * 
     * @param listProfilingGroupsRequest
     *        Request for ListProfilingGroups operation.
     * @return Result of the ListProfilingGroups operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AmazonCodeGuruProfiler.ListProfilingGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ListProfilingGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListProfilingGroupsResult listProfilingGroups(ListProfilingGroupsRequest listProfilingGroupsRequest);

    /**
     * <p>
     * Submit profile collected by an agent belonging to a profiling group for aggregation.
     * </p>
     * 
     * @param postAgentProfileRequest
     *        Request for PostAgentProfile operation.
     * @return Result of the PostAgentProfile operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the constraints of the API.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @sample AmazonCodeGuruProfiler.PostAgentProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/PostAgentProfile"
     *      target="_top">AWS API Documentation</a>
     */
    PostAgentProfileResult postAgentProfile(PostAgentProfileRequest postAgentProfileRequest);

    /**
     * <p>
     * Update a profiling group.
     * </p>
     * 
     * @param updateProfilingGroupRequest
     *        Request for UpdateProfilingGroup operation.
     * @return Result of the UpdateProfilingGroup operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ConflictException
     *         Request can can cause an inconsistent state for the resource.
     * @throws ValidationException
     *         The input fails to satisfy the constraints of the API.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
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
