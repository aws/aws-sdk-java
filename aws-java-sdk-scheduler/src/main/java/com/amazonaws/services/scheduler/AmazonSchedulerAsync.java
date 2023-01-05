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

import com.amazonaws.services.scheduler.model.*;

/**
 * Interface for accessing Amazon EventBridge Scheduler asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.scheduler.AbstractAmazonSchedulerAsync} instead.
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
public interface AmazonSchedulerAsync extends AmazonScheduler {

    /**
     * <p>
     * Creates the specified schedule.
     * </p>
     * 
     * @param createScheduleRequest
     * @return A Java Future containing the result of the CreateSchedule operation returned by the service.
     * @sample AmazonSchedulerAsync.CreateSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/CreateSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateScheduleResult> createScheduleAsync(CreateScheduleRequest createScheduleRequest);

    /**
     * <p>
     * Creates the specified schedule.
     * </p>
     * 
     * @param createScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSchedule operation returned by the service.
     * @sample AmazonSchedulerAsyncHandler.CreateSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/CreateSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateScheduleResult> createScheduleAsync(CreateScheduleRequest createScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateScheduleRequest, CreateScheduleResult> asyncHandler);

    /**
     * <p>
     * Creates the specified schedule group.
     * </p>
     * 
     * @param createScheduleGroupRequest
     * @return A Java Future containing the result of the CreateScheduleGroup operation returned by the service.
     * @sample AmazonSchedulerAsync.CreateScheduleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/CreateScheduleGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateScheduleGroupResult> createScheduleGroupAsync(CreateScheduleGroupRequest createScheduleGroupRequest);

    /**
     * <p>
     * Creates the specified schedule group.
     * </p>
     * 
     * @param createScheduleGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateScheduleGroup operation returned by the service.
     * @sample AmazonSchedulerAsyncHandler.CreateScheduleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/CreateScheduleGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateScheduleGroupResult> createScheduleGroupAsync(CreateScheduleGroupRequest createScheduleGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateScheduleGroupRequest, CreateScheduleGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified schedule.
     * </p>
     * 
     * @param deleteScheduleRequest
     * @return A Java Future containing the result of the DeleteSchedule operation returned by the service.
     * @sample AmazonSchedulerAsync.DeleteSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/DeleteSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteScheduleResult> deleteScheduleAsync(DeleteScheduleRequest deleteScheduleRequest);

    /**
     * <p>
     * Deletes the specified schedule.
     * </p>
     * 
     * @param deleteScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSchedule operation returned by the service.
     * @sample AmazonSchedulerAsyncHandler.DeleteSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/DeleteSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteScheduleResult> deleteScheduleAsync(DeleteScheduleRequest deleteScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteScheduleRequest, DeleteScheduleResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteScheduleGroup operation returned by the service.
     * @sample AmazonSchedulerAsync.DeleteScheduleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/DeleteScheduleGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteScheduleGroupResult> deleteScheduleGroupAsync(DeleteScheduleGroupRequest deleteScheduleGroupRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteScheduleGroup operation returned by the service.
     * @sample AmazonSchedulerAsyncHandler.DeleteScheduleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/DeleteScheduleGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteScheduleGroupResult> deleteScheduleGroupAsync(DeleteScheduleGroupRequest deleteScheduleGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteScheduleGroupRequest, DeleteScheduleGroupResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified schedule.
     * </p>
     * 
     * @param getScheduleRequest
     * @return A Java Future containing the result of the GetSchedule operation returned by the service.
     * @sample AmazonSchedulerAsync.GetSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/GetSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetScheduleResult> getScheduleAsync(GetScheduleRequest getScheduleRequest);

    /**
     * <p>
     * Retrieves the specified schedule.
     * </p>
     * 
     * @param getScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSchedule operation returned by the service.
     * @sample AmazonSchedulerAsyncHandler.GetSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/GetSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetScheduleResult> getScheduleAsync(GetScheduleRequest getScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<GetScheduleRequest, GetScheduleResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified schedule group.
     * </p>
     * 
     * @param getScheduleGroupRequest
     * @return A Java Future containing the result of the GetScheduleGroup operation returned by the service.
     * @sample AmazonSchedulerAsync.GetScheduleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/GetScheduleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetScheduleGroupResult> getScheduleGroupAsync(GetScheduleGroupRequest getScheduleGroupRequest);

    /**
     * <p>
     * Retrieves the specified schedule group.
     * </p>
     * 
     * @param getScheduleGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetScheduleGroup operation returned by the service.
     * @sample AmazonSchedulerAsyncHandler.GetScheduleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/GetScheduleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetScheduleGroupResult> getScheduleGroupAsync(GetScheduleGroupRequest getScheduleGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetScheduleGroupRequest, GetScheduleGroupResult> asyncHandler);

    /**
     * <p>
     * Returns a paginated list of your schedule groups.
     * </p>
     * 
     * @param listScheduleGroupsRequest
     * @return A Java Future containing the result of the ListScheduleGroups operation returned by the service.
     * @sample AmazonSchedulerAsync.ListScheduleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/ListScheduleGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListScheduleGroupsResult> listScheduleGroupsAsync(ListScheduleGroupsRequest listScheduleGroupsRequest);

    /**
     * <p>
     * Returns a paginated list of your schedule groups.
     * </p>
     * 
     * @param listScheduleGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListScheduleGroups operation returned by the service.
     * @sample AmazonSchedulerAsyncHandler.ListScheduleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/ListScheduleGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListScheduleGroupsResult> listScheduleGroupsAsync(ListScheduleGroupsRequest listScheduleGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListScheduleGroupsRequest, ListScheduleGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns a paginated list of your EventBridge Scheduler schedules.
     * </p>
     * 
     * @param listSchedulesRequest
     * @return A Java Future containing the result of the ListSchedules operation returned by the service.
     * @sample AmazonSchedulerAsync.ListSchedules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/ListSchedules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSchedulesResult> listSchedulesAsync(ListSchedulesRequest listSchedulesRequest);

    /**
     * <p>
     * Returns a paginated list of your EventBridge Scheduler schedules.
     * </p>
     * 
     * @param listSchedulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSchedules operation returned by the service.
     * @sample AmazonSchedulerAsyncHandler.ListSchedules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/ListSchedules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSchedulesResult> listSchedulesAsync(ListSchedulesRequest listSchedulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSchedulesRequest, ListSchedulesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags associated with the Scheduler resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonSchedulerAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags associated with the Scheduler resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonSchedulerAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified EventBridge Scheduler resource. You can only assign
     * tags to schedule groups.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonSchedulerAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified EventBridge Scheduler resource. You can only assign
     * tags to schedule groups.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonSchedulerAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from the specified EventBridge Scheduler schedule group.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonSchedulerAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified EventBridge Scheduler schedule group.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonSchedulerAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateSchedule operation returned by the service.
     * @sample AmazonSchedulerAsync.UpdateSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/UpdateSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateScheduleResult> updateScheduleAsync(UpdateScheduleRequest updateScheduleRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSchedule operation returned by the service.
     * @sample AmazonSchedulerAsyncHandler.UpdateSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/UpdateSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateScheduleResult> updateScheduleAsync(UpdateScheduleRequest updateScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateScheduleRequest, UpdateScheduleResult> asyncHandler);

}
