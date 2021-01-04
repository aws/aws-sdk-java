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
package com.amazonaws.services.migrationhubconfig;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.migrationhubconfig.model.*;

/**
 * Interface for accessing AWS Migration Hub Config.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.migrationhubconfig.AbstractAWSMigrationHubConfig} instead.
 * </p>
 * <p>
 * <p>
 * The AWS Migration Hub home region APIs are available specifically for working with your Migration Hub home region.
 * You can use these APIs to determine a home region, as well as to create and work with controls that describe the home
 * region.
 * </p>
 * <ul>
 * <li>
 * <p>
 * You must make API calls for write actions (create, notify, associate, disassociate, import, or put) while in your
 * home region, or a <code>HomeRegionNotSetException</code> error is returned.
 * </p>
 * </li>
 * <li>
 * <p>
 * API calls for read actions (list, describe, stop, and delete) are permitted outside of your home region.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you call a write API outside the home region, an <code>InvalidInputException</code> is returned.
 * </p>
 * </li>
 * <li>
 * <p>
 * You can call <code>GetHomeRegion</code> action to obtain the account's Migration Hub home region.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For specific API usage, see the sections that follow in this AWS Migration Hub Home Region API reference.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMigrationHubConfig {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "migrationhub-config";

    /**
     * <p>
     * This API sets up the home region for the calling account only.
     * </p>
     * 
     * @param createHomeRegionControlRequest
     * @return Result of the CreateHomeRegionControl operation returned by the service.
     * @throws InternalServerErrorException
     *         Exception raised when an internal, configuration, or dependency error is encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when a request fails due to temporary unavailability of the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws DryRunOperationException
     *         Exception raised to indicate that authorization of an action was successful, when the <code>DryRun</code>
     *         flag is set to true.
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @sample AWSMigrationHubConfig.CreateHomeRegionControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhub-config-2019-06-30/CreateHomeRegionControl"
     *      target="_top">AWS API Documentation</a>
     */
    CreateHomeRegionControlResult createHomeRegionControl(CreateHomeRegionControlRequest createHomeRegionControlRequest);

    /**
     * <p>
     * This API permits filtering on the <code>ControlId</code> and <code>HomeRegion</code> fields.
     * </p>
     * 
     * @param describeHomeRegionControlsRequest
     * @return Result of the DescribeHomeRegionControls operation returned by the service.
     * @throws InternalServerErrorException
     *         Exception raised when an internal, configuration, or dependency error is encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when a request fails due to temporary unavailability of the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @sample AWSMigrationHubConfig.DescribeHomeRegionControls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhub-config-2019-06-30/DescribeHomeRegionControls"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeHomeRegionControlsResult describeHomeRegionControls(DescribeHomeRegionControlsRequest describeHomeRegionControlsRequest);

    /**
     * <p>
     * Returns the calling account’s home region, if configured. This API is used by other AWS services to determine the
     * regional endpoint for calling AWS Application Discovery Service and Migration Hub. You must call
     * <code>GetHomeRegion</code> at least once before you call any other AWS Application Discovery Service and AWS
     * Migration Hub APIs, to obtain the account's Migration Hub home region.
     * </p>
     * 
     * @param getHomeRegionRequest
     * @return Result of the GetHomeRegion operation returned by the service.
     * @throws InternalServerErrorException
     *         Exception raised when an internal, configuration, or dependency error is encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when a request fails due to temporary unavailability of the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @sample AWSMigrationHubConfig.GetHomeRegion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhub-config-2019-06-30/GetHomeRegion"
     *      target="_top">AWS API Documentation</a>
     */
    GetHomeRegionResult getHomeRegion(GetHomeRegionRequest getHomeRegionRequest);

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
