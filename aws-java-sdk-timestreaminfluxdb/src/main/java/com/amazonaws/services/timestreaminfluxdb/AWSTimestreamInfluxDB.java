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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.timestreaminfluxdb.model.*;

/**
 * Interface for accessing Timestream InfluxDB.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.timestreaminfluxdb.AbstractAWSTimestreamInfluxDB} instead.
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
public interface AWSTimestreamInfluxDB {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "timestream-influxdb";

    /**
     * <p>
     * Creates a new Timestream for InfluxDB DB instance.
     * </p>
     * 
     * @param createDbInstanceRequest
     * @return Result of the CreateDbInstance operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request exceeds the service quota.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Timestream for InfluxDB.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request conflicts with an existing resource in Timestream for InfluxDB.
     * @throws ResourceNotFoundException
     *         The requested resource was not found or does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTimestreamInfluxDB.CreateDbInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/CreateDbInstance"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDbInstanceResult createDbInstance(CreateDbInstanceRequest createDbInstanceRequest);

    /**
     * <p>
     * Creates a new Timestream for InfluxDB DB parameter group to associate with DB instances.
     * </p>
     * 
     * @param createDbParameterGroupRequest
     * @return Result of the CreateDbParameterGroup operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request exceeds the service quota.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Timestream for InfluxDB.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request conflicts with an existing resource in Timestream for InfluxDB.
     * @throws ResourceNotFoundException
     *         The requested resource was not found or does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTimestreamInfluxDB.CreateDbParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/CreateDbParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDbParameterGroupResult createDbParameterGroup(CreateDbParameterGroupRequest createDbParameterGroupRequest);

    /**
     * <p>
     * Deletes a Timestream for InfluxDB DB instance.
     * </p>
     * 
     * @param deleteDbInstanceRequest
     * @return Result of the DeleteDbInstance operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Timestream for InfluxDB.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request conflicts with an existing resource in Timestream for InfluxDB.
     * @throws ResourceNotFoundException
     *         The requested resource was not found or does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTimestreamInfluxDB.DeleteDbInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/DeleteDbInstance"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDbInstanceResult deleteDbInstance(DeleteDbInstanceRequest deleteDbInstanceRequest);

    /**
     * <p>
     * Returns a Timestream for InfluxDB DB instance.
     * </p>
     * 
     * @param getDbInstanceRequest
     * @return Result of the GetDbInstance operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Timestream for InfluxDB.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The requested resource was not found or does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTimestreamInfluxDB.GetDbInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/GetDbInstance"
     *      target="_top">AWS API Documentation</a>
     */
    GetDbInstanceResult getDbInstance(GetDbInstanceRequest getDbInstanceRequest);

    /**
     * <p>
     * Returns a Timestream for InfluxDB DB parameter group.
     * </p>
     * 
     * @param getDbParameterGroupRequest
     * @return Result of the GetDbParameterGroup operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Timestream for InfluxDB.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The requested resource was not found or does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTimestreamInfluxDB.GetDbParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/GetDbParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    GetDbParameterGroupResult getDbParameterGroup(GetDbParameterGroupRequest getDbParameterGroupRequest);

    /**
     * <p>
     * Returns a list of Timestream for InfluxDB DB instances.
     * </p>
     * 
     * @param listDbInstancesRequest
     * @return Result of the ListDbInstances operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Timestream for InfluxDB.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The requested resource was not found or does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTimestreamInfluxDB.ListDbInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/ListDbInstances"
     *      target="_top">AWS API Documentation</a>
     */
    ListDbInstancesResult listDbInstances(ListDbInstancesRequest listDbInstancesRequest);

    /**
     * <p>
     * Returns a list of Timestream for InfluxDB DB parameter groups.
     * </p>
     * 
     * @param listDbParameterGroupsRequest
     * @return Result of the ListDbParameterGroups operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Timestream for InfluxDB.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The requested resource was not found or does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTimestreamInfluxDB.ListDbParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/ListDbParameterGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListDbParameterGroupsResult listDbParameterGroups(ListDbParameterGroupsRequest listDbParameterGroupsRequest);

    /**
     * <p>
     * A list of tags applied to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found or does not exist.
     * @sample AWSTimestreamInfluxDB.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Tags are composed of a Key/Value pairs. You can use tags to categorize and track your Timestream for InfluxDB
     * resources.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found or does not exist.
     * @sample AWSTimestreamInfluxDB.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the tag from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found or does not exist.
     * @sample AWSTimestreamInfluxDB.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a Timestream for InfluxDB DB instance.
     * </p>
     * 
     * @param updateDbInstanceRequest
     * @return Result of the UpdateDbInstance operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Timestream for InfluxDB.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request conflicts with an existing resource in Timestream for InfluxDB.
     * @throws ResourceNotFoundException
     *         The requested resource was not found or does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSTimestreamInfluxDB.UpdateDbInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/UpdateDbInstance"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDbInstanceResult updateDbInstance(UpdateDbInstanceRequest updateDbInstanceRequest);

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
