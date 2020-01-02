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
package com.amazonaws.services.migrationhubconfig;

import javax.annotation.Generated;

import com.amazonaws.services.migrationhubconfig.model.*;

/**
 * Interface for accessing AWS Migration Hub Config asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.migrationhubconfig.AbstractAWSMigrationHubConfigAsync} instead.
 * </p>
 * <p>
 * <p>
 * The AWS Migration Hub home region APIs are available specifically for working with your Migration Hub home region.
 * You can use these APIs to determine a home region, as well as to create and work with controls that describe the home
 * region.
 * </p>
 * <p>
 * You can use these APIs within your home region only. If you call these APIs from outside your home region, your calls
 * are rejected, except for the ability to register your agents and connectors.
 * </p>
 * <p>
 * You must call <code>GetHomeRegion</code> at least once before you call any other AWS Application Discovery Service
 * and AWS Migration Hub APIs, to obtain the account's Migration Hub home region.
 * </p>
 * <p>
 * The <code>StartDataCollection</code> API call in AWS Application Discovery Service allows your agents and connectors
 * to begin collecting data that flows directly into the home region, and it will prevent you from enabling data
 * collection information to be sent outside the home region.
 * </p>
 * <p>
 * For specific API usage, see the sections that follow in this AWS Migration Hub Home Region API reference.
 * </p>
 * <note>
 * <p>
 * The Migration Hub Home Region APIs do not support AWS Organizations.
 * </p>
 * </note>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMigrationHubConfigAsync extends AWSMigrationHubConfig {

    /**
     * <p>
     * This API sets up the home region for the calling account only.
     * </p>
     * 
     * @param createHomeRegionControlRequest
     * @return A Java Future containing the result of the CreateHomeRegionControl operation returned by the service.
     * @sample AWSMigrationHubConfigAsync.CreateHomeRegionControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhub-config-2019-06-30/CreateHomeRegionControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateHomeRegionControlResult> createHomeRegionControlAsync(CreateHomeRegionControlRequest createHomeRegionControlRequest);

    /**
     * <p>
     * This API sets up the home region for the calling account only.
     * </p>
     * 
     * @param createHomeRegionControlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateHomeRegionControl operation returned by the service.
     * @sample AWSMigrationHubConfigAsyncHandler.CreateHomeRegionControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhub-config-2019-06-30/CreateHomeRegionControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateHomeRegionControlResult> createHomeRegionControlAsync(CreateHomeRegionControlRequest createHomeRegionControlRequest,
            com.amazonaws.handlers.AsyncHandler<CreateHomeRegionControlRequest, CreateHomeRegionControlResult> asyncHandler);

    /**
     * <p>
     * This API permits filtering on the <code>ControlId</code>, <code>HomeRegion</code>, and
     * <code>RegionControlScope</code> fields.
     * </p>
     * 
     * @param describeHomeRegionControlsRequest
     * @return A Java Future containing the result of the DescribeHomeRegionControls operation returned by the service.
     * @sample AWSMigrationHubConfigAsync.DescribeHomeRegionControls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhub-config-2019-06-30/DescribeHomeRegionControls"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeHomeRegionControlsResult> describeHomeRegionControlsAsync(
            DescribeHomeRegionControlsRequest describeHomeRegionControlsRequest);

    /**
     * <p>
     * This API permits filtering on the <code>ControlId</code>, <code>HomeRegion</code>, and
     * <code>RegionControlScope</code> fields.
     * </p>
     * 
     * @param describeHomeRegionControlsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeHomeRegionControls operation returned by the service.
     * @sample AWSMigrationHubConfigAsyncHandler.DescribeHomeRegionControls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhub-config-2019-06-30/DescribeHomeRegionControls"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeHomeRegionControlsResult> describeHomeRegionControlsAsync(
            DescribeHomeRegionControlsRequest describeHomeRegionControlsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeHomeRegionControlsRequest, DescribeHomeRegionControlsResult> asyncHandler);

    /**
     * <p>
     * Returns the calling account’s home region, if configured. This API is used by other AWS services to determine the
     * regional endpoint for calling AWS Application Discovery Service and Migration Hub. You must call
     * <code>GetHomeRegion</code> at least once before you call any other AWS Application Discovery Service and AWS
     * Migration Hub APIs, to obtain the account's Migration Hub home region.
     * </p>
     * 
     * @param getHomeRegionRequest
     * @return A Java Future containing the result of the GetHomeRegion operation returned by the service.
     * @sample AWSMigrationHubConfigAsync.GetHomeRegion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhub-config-2019-06-30/GetHomeRegion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetHomeRegionResult> getHomeRegionAsync(GetHomeRegionRequest getHomeRegionRequest);

    /**
     * <p>
     * Returns the calling account’s home region, if configured. This API is used by other AWS services to determine the
     * regional endpoint for calling AWS Application Discovery Service and Migration Hub. You must call
     * <code>GetHomeRegion</code> at least once before you call any other AWS Application Discovery Service and AWS
     * Migration Hub APIs, to obtain the account's Migration Hub home region.
     * </p>
     * 
     * @param getHomeRegionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetHomeRegion operation returned by the service.
     * @sample AWSMigrationHubConfigAsyncHandler.GetHomeRegion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhub-config-2019-06-30/GetHomeRegion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetHomeRegionResult> getHomeRegionAsync(GetHomeRegionRequest getHomeRegionRequest,
            com.amazonaws.handlers.AsyncHandler<GetHomeRegionRequest, GetHomeRegionResult> asyncHandler);

}
