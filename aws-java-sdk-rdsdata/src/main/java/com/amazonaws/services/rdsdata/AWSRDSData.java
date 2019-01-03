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
package com.amazonaws.services.rdsdata;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.rdsdata.model.*;

/**
 * Interface for accessing AWS RDS DataService.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.rdsdata.AbstractAWSRDSData} instead.
 * </p>
 * <p>
 * AWS RDS DataService provides Http Endpoint to query RDS databases.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSRDSData {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "rds-data";

    /**
     * Executes any SQL statement on the target database synchronously
     * 
     * @param executeSqlRequest
     *        Execute SQL Request
     * @return Result of the ExecuteSql operation returned by the service.
     * @throws BadRequestException
     *         Invalid Request exception
     * @throws ForbiddenException
     *         Access denied exception
     * @throws InternalServerErrorException
     *         Internal service error
     * @throws ServiceUnavailableErrorException
     *         Internal service unavailable error
     * @sample AWSRDSData.ExecuteSql
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/ExecuteSql" target="_top">AWS API
     *      Documentation</a>
     */
    ExecuteSqlResult executeSql(ExecuteSqlRequest executeSqlRequest);

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
