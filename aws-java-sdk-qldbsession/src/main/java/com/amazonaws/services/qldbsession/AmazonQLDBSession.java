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
package com.amazonaws.services.qldbsession;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.qldbsession.model.*;

/**
 * Interface for accessing QLDB Session.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.qldbsession.AbstractAmazonQLDBSession} instead.
 * </p>
 * <p>
 * <p>
 * The transactional data APIs for Amazon QLDB
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonQLDBSession {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "session.qldb";

    /**
     * <p>
     * Sends a command to an Amazon QLDB ledger.
     * </p>
     * 
     * @param sendCommandRequest
     * @return Result of the SendCommand operation returned by the service.
     * @throws BadRequestException
     *         Returned if the request is malformed or contains an error such as an invalid parameter value or a missing
     *         required parameter.
     * @throws InvalidSessionException
     *         Returned if the session doesn't exist anymore because it timed-out or expired.
     * @throws OccConflictException
     *         Returned when a transaction cannot be written to the journal due to a failure in the verification phase
     *         of Optimistic Concurrency Control.
     * @throws RateExceededException
     *         Returned when the rate of requests exceeds the allowed throughput.
     * @throws LimitExceededException
     *         Returned if a resource limit such as number of active sessions is exceeded.
     * @sample AmazonQLDBSession.SendCommand
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-session-2019-07-11/SendCommand" target="_top">AWS API
     *      Documentation</a>
     */
    SendCommandResult sendCommand(SendCommandRequest sendCommandRequest);

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
