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
package com.amazonaws.services.finspacedata;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.finspacedata.model.*;

/**
 * Interface for accessing FinSpace Data.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.finspacedata.AbstractAWSFinSpaceData} instead.
 * </p>
 * <p>
 * <p>
 * The FinSpace APIs let you take actions inside the FinSpace environment.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSFinSpaceData {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "finspace-api";

    /**
     * <p>
     * Creates a new changeset in a FinSpace dataset.
     * </p>
     * 
     * @param createChangesetRequest
     * @return Result of the CreateChangeset operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSFinSpaceData.CreateChangeset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateChangeset" target="_top">AWS API
     *      Documentation</a>
     */
    CreateChangesetResult createChangeset(CreateChangesetRequest createChangesetRequest);

    /**
     * <p>
     * Request programmatic credentials to use with Habanero SDK.
     * </p>
     * 
     * @param getProgrammaticAccessCredentialsRequest
     * @return Result of the GetProgrammaticAccessCredentials operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSFinSpaceData.GetProgrammaticAccessCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetProgrammaticAccessCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    GetProgrammaticAccessCredentialsResult getProgrammaticAccessCredentials(GetProgrammaticAccessCredentialsRequest getProgrammaticAccessCredentialsRequest);

    /**
     * <p>
     * A temporary Amazon S3 location to copy your files from a source location to stage or use as a scratch space in
     * Habanero notebook.
     * </p>
     * 
     * @param getWorkingLocationRequest
     * @return Result of the GetWorkingLocation operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSFinSpaceData.GetWorkingLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetWorkingLocation" target="_top">AWS
     *      API Documentation</a>
     */
    GetWorkingLocationResult getWorkingLocation(GetWorkingLocationRequest getWorkingLocationRequest);

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
