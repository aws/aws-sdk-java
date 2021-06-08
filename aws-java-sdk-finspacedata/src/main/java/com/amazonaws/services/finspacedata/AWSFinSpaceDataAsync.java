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

import com.amazonaws.services.finspacedata.model.*;

/**
 * Interface for accessing FinSpace Data asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.finspacedata.AbstractAWSFinSpaceDataAsync} instead.
 * </p>
 * <p>
 * <p>
 * The FinSpace APIs let you take actions inside the FinSpace environment.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSFinSpaceDataAsync extends AWSFinSpaceData {

    /**
     * <p>
     * Creates a new changeset in a FinSpace dataset.
     * </p>
     * 
     * @param createChangesetRequest
     * @return A Java Future containing the result of the CreateChangeset operation returned by the service.
     * @sample AWSFinSpaceDataAsync.CreateChangeset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateChangeset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateChangesetResult> createChangesetAsync(CreateChangesetRequest createChangesetRequest);

    /**
     * <p>
     * Creates a new changeset in a FinSpace dataset.
     * </p>
     * 
     * @param createChangesetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateChangeset operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.CreateChangeset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateChangeset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateChangesetResult> createChangesetAsync(CreateChangesetRequest createChangesetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateChangesetRequest, CreateChangesetResult> asyncHandler);

    /**
     * <p>
     * Request programmatic credentials to use with Habanero SDK.
     * </p>
     * 
     * @param getProgrammaticAccessCredentialsRequest
     * @return A Java Future containing the result of the GetProgrammaticAccessCredentials operation returned by the
     *         service.
     * @sample AWSFinSpaceDataAsync.GetProgrammaticAccessCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetProgrammaticAccessCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetProgrammaticAccessCredentialsResult> getProgrammaticAccessCredentialsAsync(
            GetProgrammaticAccessCredentialsRequest getProgrammaticAccessCredentialsRequest);

    /**
     * <p>
     * Request programmatic credentials to use with Habanero SDK.
     * </p>
     * 
     * @param getProgrammaticAccessCredentialsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetProgrammaticAccessCredentials operation returned by the
     *         service.
     * @sample AWSFinSpaceDataAsyncHandler.GetProgrammaticAccessCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetProgrammaticAccessCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetProgrammaticAccessCredentialsResult> getProgrammaticAccessCredentialsAsync(
            GetProgrammaticAccessCredentialsRequest getProgrammaticAccessCredentialsRequest,
            com.amazonaws.handlers.AsyncHandler<GetProgrammaticAccessCredentialsRequest, GetProgrammaticAccessCredentialsResult> asyncHandler);

    /**
     * <p>
     * A temporary Amazon S3 location to copy your files from a source location to stage or use as a scratch space in
     * Habanero notebook.
     * </p>
     * 
     * @param getWorkingLocationRequest
     * @return A Java Future containing the result of the GetWorkingLocation operation returned by the service.
     * @sample AWSFinSpaceDataAsync.GetWorkingLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetWorkingLocation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetWorkingLocationResult> getWorkingLocationAsync(GetWorkingLocationRequest getWorkingLocationRequest);

    /**
     * <p>
     * A temporary Amazon S3 location to copy your files from a source location to stage or use as a scratch space in
     * Habanero notebook.
     * </p>
     * 
     * @param getWorkingLocationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWorkingLocation operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.GetWorkingLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetWorkingLocation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetWorkingLocationResult> getWorkingLocationAsync(GetWorkingLocationRequest getWorkingLocationRequest,
            com.amazonaws.handlers.AsyncHandler<GetWorkingLocationRequest, GetWorkingLocationResult> asyncHandler);

}
