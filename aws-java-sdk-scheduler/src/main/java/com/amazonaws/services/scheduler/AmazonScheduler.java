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
package com.amazonaws.services.scheduler;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.scheduler.model.*;

/**
 * Interface for accessing Amazon EventBridge Scheduler.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.scheduler.AbstractAmazonScheduler} instead.
 * </p>
 * <p>
 * <p>
 * Amazon EventBridge Scheduler is a serverless scheduler that allows you to create, run, and manage tasks from one
 * central, managed service. EventBridge Scheduler delivers your tasks reliably, with built-in mechanisms that adjust
 * your schedules based on the availability of downstream targets. The following reference lists the available API
 * actions, and data types for EventBridge Scheduler.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonScheduler {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "scheduler";

    /**
     * <p>
     * Creates the specified schedule.
     * </p>
     * 
     * @param createScheduleRequest
     * @return Result of the CreateSchedule operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error encountered while processing the request.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonScheduler.CreateSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/CreateSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    CreateScheduleResult createSchedule(CreateScheduleRequest createScheduleRequest);

    /**
     * <p>
     * Creates the specified schedule group.
     * </p>
     * 
     * @param createScheduleGroupRequest
     * @return Result of the CreateScheduleGroup operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error encountered while processing the request.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonScheduler.CreateScheduleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/CreateScheduleGroup" target="_top">AWS
     *      API Documentation</a>
     */
    CreateScheduleGroupResult createScheduleGroup(CreateScheduleGroupRequest createScheduleGroupRequest);

    /**
     * <p>
     * Deletes the specified schedule.
     * </p>
     * 
     * @param deleteScheduleRequest
     * @return Result of the DeleteSchedule operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error encountered while processing the request.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonScheduler.DeleteSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/DeleteSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteScheduleResult deleteSchedule(DeleteScheduleRequest deleteScheduleRequest);

    /**
     * <p>
     * Deletes the specified schedule group. Deleting a schedule group results in EventBridge Scheduler deleting all
     * schedules associated with the group. When you delete a group, it remains in a <code>DELETING</code> state until
     * all of its associated schedules are deleted. Schedules associated with the group that are set to run while the
     * schedule group is in the process of being deleted might continue to invoke their targets until the schedule group
     * and its associated schedules are deleted.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent.
     * </p>
     * </note>
     * 
     * @param deleteScheduleGroupRequest
     * @return Result of the DeleteScheduleGroup operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error encountered while processing the request.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonScheduler.DeleteScheduleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/DeleteScheduleGroup" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteScheduleGroupResult deleteScheduleGroup(DeleteScheduleGroupRequest deleteScheduleGroupRequest);

    /**
     * <p>
     * Retrieves the specified schedule.
     * </p>
     * 
     * @param getScheduleRequest
     * @return Result of the GetSchedule operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error encountered while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonScheduler.GetSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/GetSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    GetScheduleResult getSchedule(GetScheduleRequest getScheduleRequest);

    /**
     * <p>
     * Retrieves the specified schedule group.
     * </p>
     * 
     * @param getScheduleGroupRequest
     * @return Result of the GetScheduleGroup operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error encountered while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonScheduler.GetScheduleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/GetScheduleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    GetScheduleGroupResult getScheduleGroup(GetScheduleGroupRequest getScheduleGroupRequest);

    /**
     * <p>
     * Returns a paginated list of your schedule groups.
     * </p>
     * 
     * @param listScheduleGroupsRequest
     * @return Result of the ListScheduleGroups operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error encountered while processing the request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonScheduler.ListScheduleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/ListScheduleGroups" target="_top">AWS
     *      API Documentation</a>
     */
    ListScheduleGroupsResult listScheduleGroups(ListScheduleGroupsRequest listScheduleGroupsRequest);

    /**
     * <p>
     * Returns a paginated list of your EventBridge Scheduler schedules.
     * </p>
     * 
     * @param listSchedulesRequest
     * @return Result of the ListSchedules operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error encountered while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonScheduler.ListSchedules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/ListSchedules" target="_top">AWS API
     *      Documentation</a>
     */
    ListSchedulesResult listSchedules(ListSchedulesRequest listSchedulesRequest);

    /**
     * <p>
     * Lists the tags associated with the Scheduler resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error encountered while processing the request.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonScheduler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified EventBridge Scheduler resource. You can only assign
     * tags to schedule groups.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error encountered while processing the request.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonScheduler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified EventBridge Scheduler schedule group.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error encountered while processing the request.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonScheduler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the specified schedule. When you call <code>UpdateSchedule</code>, EventBridge Scheduler uses all values,
     * including empty values, specified in the request and overrides the existing schedule. This is by design. This
     * means that if you do not set an optional field in your request, that field will be set to its system-default
     * value after the update.
     * </p>
     * <p>
     * Before calling this operation, we recommend that you call the <code>GetSchedule</code> API operation and make a
     * note of all optional parameters for your <code>UpdateSchedule</code> call.
     * </p>
     * 
     * @param updateScheduleRequest
     * @return Result of the UpdateSchedule operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error encountered while processing the request.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonScheduler.UpdateSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/UpdateSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateScheduleResult updateSchedule(UpdateScheduleRequest updateScheduleRequest);

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
