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
package com.amazonaws.services.timestreaminfluxdb;

import javax.annotation.Generated;

import com.amazonaws.services.timestreaminfluxdb.model.*;

/**
 * Interface for accessing Timestream InfluxDB asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.timestreaminfluxdb.AbstractAWSTimestreamInfluxDBAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Timestream for InfluxDB is a managed time-series database engine that makes it easy for application developers
 * and DevOps teams to run InfluxDB databases on AWS for near real-time time-series applications using open-source APIs.
 * With Amazon Timestream for InfluxDB, it is easy to set up, operate, and scale time-series workloads that can answer
 * queries with single-digit millisecond query response time.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSTimestreamInfluxDBAsync extends AWSTimestreamInfluxDB {

    /**
     * <p>
     * Creates a new Timestream for InfluxDB DB instance.
     * </p>
     * 
     * @param createDbInstanceRequest
     * @return A Java Future containing the result of the CreateDbInstance operation returned by the service.
     * @sample AWSTimestreamInfluxDBAsync.CreateDbInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/CreateDbInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDbInstanceResult> createDbInstanceAsync(CreateDbInstanceRequest createDbInstanceRequest);

    /**
     * <p>
     * Creates a new Timestream for InfluxDB DB instance.
     * </p>
     * 
     * @param createDbInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDbInstance operation returned by the service.
     * @sample AWSTimestreamInfluxDBAsyncHandler.CreateDbInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/CreateDbInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDbInstanceResult> createDbInstanceAsync(CreateDbInstanceRequest createDbInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDbInstanceRequest, CreateDbInstanceResult> asyncHandler);

    /**
     * <p>
     * Creates a new Timestream for InfluxDB DB parameter group to associate with DB instances.
     * </p>
     * 
     * @param createDbParameterGroupRequest
     * @return A Java Future containing the result of the CreateDbParameterGroup operation returned by the service.
     * @sample AWSTimestreamInfluxDBAsync.CreateDbParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/CreateDbParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDbParameterGroupResult> createDbParameterGroupAsync(CreateDbParameterGroupRequest createDbParameterGroupRequest);

    /**
     * <p>
     * Creates a new Timestream for InfluxDB DB parameter group to associate with DB instances.
     * </p>
     * 
     * @param createDbParameterGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDbParameterGroup operation returned by the service.
     * @sample AWSTimestreamInfluxDBAsyncHandler.CreateDbParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/CreateDbParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDbParameterGroupResult> createDbParameterGroupAsync(CreateDbParameterGroupRequest createDbParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDbParameterGroupRequest, CreateDbParameterGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes a Timestream for InfluxDB DB instance.
     * </p>
     * 
     * @param deleteDbInstanceRequest
     * @return A Java Future containing the result of the DeleteDbInstance operation returned by the service.
     * @sample AWSTimestreamInfluxDBAsync.DeleteDbInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/DeleteDbInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDbInstanceResult> deleteDbInstanceAsync(DeleteDbInstanceRequest deleteDbInstanceRequest);

    /**
     * <p>
     * Deletes a Timestream for InfluxDB DB instance.
     * </p>
     * 
     * @param deleteDbInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDbInstance operation returned by the service.
     * @sample AWSTimestreamInfluxDBAsyncHandler.DeleteDbInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/DeleteDbInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDbInstanceResult> deleteDbInstanceAsync(DeleteDbInstanceRequest deleteDbInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDbInstanceRequest, DeleteDbInstanceResult> asyncHandler);

    /**
     * <p>
     * Returns a Timestream for InfluxDB DB instance.
     * </p>
     * 
     * @param getDbInstanceRequest
     * @return A Java Future containing the result of the GetDbInstance operation returned by the service.
     * @sample AWSTimestreamInfluxDBAsync.GetDbInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/GetDbInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDbInstanceResult> getDbInstanceAsync(GetDbInstanceRequest getDbInstanceRequest);

    /**
     * <p>
     * Returns a Timestream for InfluxDB DB instance.
     * </p>
     * 
     * @param getDbInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDbInstance operation returned by the service.
     * @sample AWSTimestreamInfluxDBAsyncHandler.GetDbInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/GetDbInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDbInstanceResult> getDbInstanceAsync(GetDbInstanceRequest getDbInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<GetDbInstanceRequest, GetDbInstanceResult> asyncHandler);

    /**
     * <p>
     * Returns a Timestream for InfluxDB DB parameter group.
     * </p>
     * 
     * @param getDbParameterGroupRequest
     * @return A Java Future containing the result of the GetDbParameterGroup operation returned by the service.
     * @sample AWSTimestreamInfluxDBAsync.GetDbParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/GetDbParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDbParameterGroupResult> getDbParameterGroupAsync(GetDbParameterGroupRequest getDbParameterGroupRequest);

    /**
     * <p>
     * Returns a Timestream for InfluxDB DB parameter group.
     * </p>
     * 
     * @param getDbParameterGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDbParameterGroup operation returned by the service.
     * @sample AWSTimestreamInfluxDBAsyncHandler.GetDbParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/GetDbParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDbParameterGroupResult> getDbParameterGroupAsync(GetDbParameterGroupRequest getDbParameterGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetDbParameterGroupRequest, GetDbParameterGroupResult> asyncHandler);

    /**
     * <p>
     * Returns a list of Timestream for InfluxDB DB instances.
     * </p>
     * 
     * @param listDbInstancesRequest
     * @return A Java Future containing the result of the ListDbInstances operation returned by the service.
     * @sample AWSTimestreamInfluxDBAsync.ListDbInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/ListDbInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDbInstancesResult> listDbInstancesAsync(ListDbInstancesRequest listDbInstancesRequest);

    /**
     * <p>
     * Returns a list of Timestream for InfluxDB DB instances.
     * </p>
     * 
     * @param listDbInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDbInstances operation returned by the service.
     * @sample AWSTimestreamInfluxDBAsyncHandler.ListDbInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/ListDbInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDbInstancesResult> listDbInstancesAsync(ListDbInstancesRequest listDbInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDbInstancesRequest, ListDbInstancesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of Timestream for InfluxDB DB parameter groups.
     * </p>
     * 
     * @param listDbParameterGroupsRequest
     * @return A Java Future containing the result of the ListDbParameterGroups operation returned by the service.
     * @sample AWSTimestreamInfluxDBAsync.ListDbParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/ListDbParameterGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDbParameterGroupsResult> listDbParameterGroupsAsync(ListDbParameterGroupsRequest listDbParameterGroupsRequest);

    /**
     * <p>
     * Returns a list of Timestream for InfluxDB DB parameter groups.
     * </p>
     * 
     * @param listDbParameterGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDbParameterGroups operation returned by the service.
     * @sample AWSTimestreamInfluxDBAsyncHandler.ListDbParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/ListDbParameterGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDbParameterGroupsResult> listDbParameterGroupsAsync(ListDbParameterGroupsRequest listDbParameterGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDbParameterGroupsRequest, ListDbParameterGroupsResult> asyncHandler);

    /**
     * <p>
     * A list of tags applied to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSTimestreamInfluxDBAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * A list of tags applied to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSTimestreamInfluxDBAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Tags are composed of a Key/Value pairs. You can use tags to categorize and track your Timestream for InfluxDB
     * resources.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSTimestreamInfluxDBAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Tags are composed of a Key/Value pairs. You can use tags to categorize and track your Timestream for InfluxDB
     * resources.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSTimestreamInfluxDBAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the tag from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSTimestreamInfluxDBAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the tag from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSTimestreamInfluxDBAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a Timestream for InfluxDB DB instance.
     * </p>
     * 
     * @param updateDbInstanceRequest
     * @return A Java Future containing the result of the UpdateDbInstance operation returned by the service.
     * @sample AWSTimestreamInfluxDBAsync.UpdateDbInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/UpdateDbInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDbInstanceResult> updateDbInstanceAsync(UpdateDbInstanceRequest updateDbInstanceRequest);

    /**
     * <p>
     * Updates a Timestream for InfluxDB DB instance.
     * </p>
     * 
     * @param updateDbInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDbInstance operation returned by the service.
     * @sample AWSTimestreamInfluxDBAsyncHandler.UpdateDbInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/UpdateDbInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDbInstanceResult> updateDbInstanceAsync(UpdateDbInstanceRequest updateDbInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDbInstanceRequest, UpdateDbInstanceResult> asyncHandler);

}
