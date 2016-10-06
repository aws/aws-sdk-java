/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devicefarm;

import com.amazonaws.services.devicefarm.model.*;

/**
 * Interface for accessing AWS Device Farm asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS Device Farm is a service that enables mobile app developers to test Android, iOS, and Fire OS apps on physical
 * phones, tablets, and other devices in the cloud.
 * </p>
 */
public interface AWSDeviceFarmAsync extends AWSDeviceFarm {

    /**
     * <p>
     * Creates a device pool.
     * </p>
     * 
     * @param createDevicePoolRequest
     *        Represents a request to the create device pool operation.
     * @return A Java Future containing the result of the CreateDevicePool operation returned by the service.
     * @sample AWSDeviceFarmAsync.CreateDevicePool
     */
    java.util.concurrent.Future<CreateDevicePoolResult> createDevicePoolAsync(CreateDevicePoolRequest createDevicePoolRequest);

    /**
     * <p>
     * Creates a device pool.
     * </p>
     * 
     * @param createDevicePoolRequest
     *        Represents a request to the create device pool operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDevicePool operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.CreateDevicePool
     */
    java.util.concurrent.Future<CreateDevicePoolResult> createDevicePoolAsync(CreateDevicePoolRequest createDevicePoolRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDevicePoolRequest, CreateDevicePoolResult> asyncHandler);

    /**
     * <p>
     * Creates a new project.
     * </p>
     * 
     * @param createProjectRequest
     *        Represents a request to the create project operation.
     * @return A Java Future containing the result of the CreateProject operation returned by the service.
     * @sample AWSDeviceFarmAsync.CreateProject
     */
    java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest createProjectRequest);

    /**
     * <p>
     * Creates a new project.
     * </p>
     * 
     * @param createProjectRequest
     *        Represents a request to the create project operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProject operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.CreateProject
     */
    java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest createProjectRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProjectRequest, CreateProjectResult> asyncHandler);

    /**
     * <p>
     * Specifies and starts a remote access session.
     * </p>
     * 
     * @param createRemoteAccessSessionRequest
     *        Creates and submits a request to start a remote access session.
     * @return A Java Future containing the result of the CreateRemoteAccessSession operation returned by the service.
     * @sample AWSDeviceFarmAsync.CreateRemoteAccessSession
     */
    java.util.concurrent.Future<CreateRemoteAccessSessionResult> createRemoteAccessSessionAsync(
            CreateRemoteAccessSessionRequest createRemoteAccessSessionRequest);

    /**
     * <p>
     * Specifies and starts a remote access session.
     * </p>
     * 
     * @param createRemoteAccessSessionRequest
     *        Creates and submits a request to start a remote access session.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRemoteAccessSession operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.CreateRemoteAccessSession
     */
    java.util.concurrent.Future<CreateRemoteAccessSessionResult> createRemoteAccessSessionAsync(
            CreateRemoteAccessSessionRequest createRemoteAccessSessionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRemoteAccessSessionRequest, CreateRemoteAccessSessionResult> asyncHandler);

    /**
     * <p>
     * Uploads an app or test scripts.
     * </p>
     * 
     * @param createUploadRequest
     *        Represents a request to the create upload operation.
     * @return A Java Future containing the result of the CreateUpload operation returned by the service.
     * @sample AWSDeviceFarmAsync.CreateUpload
     */
    java.util.concurrent.Future<CreateUploadResult> createUploadAsync(CreateUploadRequest createUploadRequest);

    /**
     * <p>
     * Uploads an app or test scripts.
     * </p>
     * 
     * @param createUploadRequest
     *        Represents a request to the create upload operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUpload operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.CreateUpload
     */
    java.util.concurrent.Future<CreateUploadResult> createUploadAsync(CreateUploadRequest createUploadRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUploadRequest, CreateUploadResult> asyncHandler);

    /**
     * <p>
     * Deletes a device pool given the pool ARN. Does not allow deletion of curated pools owned by the system.
     * </p>
     * 
     * @param deleteDevicePoolRequest
     *        Represents a request to the delete device pool operation.
     * @return A Java Future containing the result of the DeleteDevicePool operation returned by the service.
     * @sample AWSDeviceFarmAsync.DeleteDevicePool
     */
    java.util.concurrent.Future<DeleteDevicePoolResult> deleteDevicePoolAsync(DeleteDevicePoolRequest deleteDevicePoolRequest);

    /**
     * <p>
     * Deletes a device pool given the pool ARN. Does not allow deletion of curated pools owned by the system.
     * </p>
     * 
     * @param deleteDevicePoolRequest
     *        Represents a request to the delete device pool operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDevicePool operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.DeleteDevicePool
     */
    java.util.concurrent.Future<DeleteDevicePoolResult> deleteDevicePoolAsync(DeleteDevicePoolRequest deleteDevicePoolRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDevicePoolRequest, DeleteDevicePoolResult> asyncHandler);

    /**
     * <p>
     * Deletes an AWS Device Farm project, given the project ARN.
     * </p>
     * <p>
     * <b>Note</b> Deleting this resource does not stop an in-progress run.
     * </p>
     * 
     * @param deleteProjectRequest
     *        Represents a request to the delete project operation.
     * @return A Java Future containing the result of the DeleteProject operation returned by the service.
     * @sample AWSDeviceFarmAsync.DeleteProject
     */
    java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest deleteProjectRequest);

    /**
     * <p>
     * Deletes an AWS Device Farm project, given the project ARN.
     * </p>
     * <p>
     * <b>Note</b> Deleting this resource does not stop an in-progress run.
     * </p>
     * 
     * @param deleteProjectRequest
     *        Represents a request to the delete project operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProject operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.DeleteProject
     */
    java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest deleteProjectRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProjectRequest, DeleteProjectResult> asyncHandler);

    /**
     * <p>
     * Deletes a completed remote access session and its results.
     * </p>
     * 
     * @param deleteRemoteAccessSessionRequest
     *        Represents the request to delete the specified remote access session.
     * @return A Java Future containing the result of the DeleteRemoteAccessSession operation returned by the service.
     * @sample AWSDeviceFarmAsync.DeleteRemoteAccessSession
     */
    java.util.concurrent.Future<DeleteRemoteAccessSessionResult> deleteRemoteAccessSessionAsync(
            DeleteRemoteAccessSessionRequest deleteRemoteAccessSessionRequest);

    /**
     * <p>
     * Deletes a completed remote access session and its results.
     * </p>
     * 
     * @param deleteRemoteAccessSessionRequest
     *        Represents the request to delete the specified remote access session.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRemoteAccessSession operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.DeleteRemoteAccessSession
     */
    java.util.concurrent.Future<DeleteRemoteAccessSessionResult> deleteRemoteAccessSessionAsync(
            DeleteRemoteAccessSessionRequest deleteRemoteAccessSessionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRemoteAccessSessionRequest, DeleteRemoteAccessSessionResult> asyncHandler);

    /**
     * <p>
     * Deletes the run, given the run ARN.
     * </p>
     * <p>
     * <b>Note</b> Deleting this resource does not stop an in-progress run.
     * </p>
     * 
     * @param deleteRunRequest
     *        Represents a request to the delete run operation.
     * @return A Java Future containing the result of the DeleteRun operation returned by the service.
     * @sample AWSDeviceFarmAsync.DeleteRun
     */
    java.util.concurrent.Future<DeleteRunResult> deleteRunAsync(DeleteRunRequest deleteRunRequest);

    /**
     * <p>
     * Deletes the run, given the run ARN.
     * </p>
     * <p>
     * <b>Note</b> Deleting this resource does not stop an in-progress run.
     * </p>
     * 
     * @param deleteRunRequest
     *        Represents a request to the delete run operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRun operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.DeleteRun
     */
    java.util.concurrent.Future<DeleteRunResult> deleteRunAsync(DeleteRunRequest deleteRunRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRunRequest, DeleteRunResult> asyncHandler);

    /**
     * <p>
     * Deletes an upload given the upload ARN.
     * </p>
     * 
     * @param deleteUploadRequest
     *        Represents a request to the delete upload operation.
     * @return A Java Future containing the result of the DeleteUpload operation returned by the service.
     * @sample AWSDeviceFarmAsync.DeleteUpload
     */
    java.util.concurrent.Future<DeleteUploadResult> deleteUploadAsync(DeleteUploadRequest deleteUploadRequest);

    /**
     * <p>
     * Deletes an upload given the upload ARN.
     * </p>
     * 
     * @param deleteUploadRequest
     *        Represents a request to the delete upload operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUpload operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.DeleteUpload
     */
    java.util.concurrent.Future<DeleteUploadResult> deleteUploadAsync(DeleteUploadRequest deleteUploadRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUploadRequest, DeleteUploadResult> asyncHandler);

    /**
     * <p>
     * Returns the number of unmetered iOS and/or unmetered Android devices that have been purchased by the account.
     * </p>
     * 
     * @param getAccountSettingsRequest
     *        Represents the request sent to retrieve the account settings.
     * @return A Java Future containing the result of the GetAccountSettings operation returned by the service.
     * @sample AWSDeviceFarmAsync.GetAccountSettings
     */
    java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(GetAccountSettingsRequest getAccountSettingsRequest);

    /**
     * <p>
     * Returns the number of unmetered iOS and/or unmetered Android devices that have been purchased by the account.
     * </p>
     * 
     * @param getAccountSettingsRequest
     *        Represents the request sent to retrieve the account settings.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccountSettings operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.GetAccountSettings
     */
    java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(GetAccountSettingsRequest getAccountSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccountSettingsRequest, GetAccountSettingsResult> asyncHandler);

    /**
     * <p>
     * Gets information about a unique device type.
     * </p>
     * 
     * @param getDeviceRequest
     *        Represents a request to the get device request.
     * @return A Java Future containing the result of the GetDevice operation returned by the service.
     * @sample AWSDeviceFarmAsync.GetDevice
     */
    java.util.concurrent.Future<GetDeviceResult> getDeviceAsync(GetDeviceRequest getDeviceRequest);

    /**
     * <p>
     * Gets information about a unique device type.
     * </p>
     * 
     * @param getDeviceRequest
     *        Represents a request to the get device request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDevice operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.GetDevice
     */
    java.util.concurrent.Future<GetDeviceResult> getDeviceAsync(GetDeviceRequest getDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeviceRequest, GetDeviceResult> asyncHandler);

    /**
     * <p>
     * Gets information about a device pool.
     * </p>
     * 
     * @param getDevicePoolRequest
     *        Represents a request to the get device pool operation.
     * @return A Java Future containing the result of the GetDevicePool operation returned by the service.
     * @sample AWSDeviceFarmAsync.GetDevicePool
     */
    java.util.concurrent.Future<GetDevicePoolResult> getDevicePoolAsync(GetDevicePoolRequest getDevicePoolRequest);

    /**
     * <p>
     * Gets information about a device pool.
     * </p>
     * 
     * @param getDevicePoolRequest
     *        Represents a request to the get device pool operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDevicePool operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.GetDevicePool
     */
    java.util.concurrent.Future<GetDevicePoolResult> getDevicePoolAsync(GetDevicePoolRequest getDevicePoolRequest,
            com.amazonaws.handlers.AsyncHandler<GetDevicePoolRequest, GetDevicePoolResult> asyncHandler);

    /**
     * <p>
     * Gets information about compatibility with a device pool.
     * </p>
     * 
     * @param getDevicePoolCompatibilityRequest
     *        Represents a request to the get device pool compatibility operation.
     * @return A Java Future containing the result of the GetDevicePoolCompatibility operation returned by the service.
     * @sample AWSDeviceFarmAsync.GetDevicePoolCompatibility
     */
    java.util.concurrent.Future<GetDevicePoolCompatibilityResult> getDevicePoolCompatibilityAsync(
            GetDevicePoolCompatibilityRequest getDevicePoolCompatibilityRequest);

    /**
     * <p>
     * Gets information about compatibility with a device pool.
     * </p>
     * 
     * @param getDevicePoolCompatibilityRequest
     *        Represents a request to the get device pool compatibility operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDevicePoolCompatibility operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.GetDevicePoolCompatibility
     */
    java.util.concurrent.Future<GetDevicePoolCompatibilityResult> getDevicePoolCompatibilityAsync(
            GetDevicePoolCompatibilityRequest getDevicePoolCompatibilityRequest,
            com.amazonaws.handlers.AsyncHandler<GetDevicePoolCompatibilityRequest, GetDevicePoolCompatibilityResult> asyncHandler);

    /**
     * <p>
     * Gets information about a job.
     * </p>
     * 
     * @param getJobRequest
     *        Represents a request to the get job operation.
     * @return A Java Future containing the result of the GetJob operation returned by the service.
     * @sample AWSDeviceFarmAsync.GetJob
     */
    java.util.concurrent.Future<GetJobResult> getJobAsync(GetJobRequest getJobRequest);

    /**
     * <p>
     * Gets information about a job.
     * </p>
     * 
     * @param getJobRequest
     *        Represents a request to the get job operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetJob operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.GetJob
     */
    java.util.concurrent.Future<GetJobResult> getJobAsync(GetJobRequest getJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetJobRequest, GetJobResult> asyncHandler);

    /**
     * <p>
     * Gets the current status and future status of all offerings purchased by an AWS account. The response indicates
     * how many offerings are currently available and the offerings that will be available in the next period. The API
     * returns a <code>NotEligible</code> error if the user is not permitted to invoke the operation. Please contact <a
     * href="mailto:aws-devicefarm-support@amazon.com">aws-devicefarm-support@amazon.com</a> if you believe that you
     * should be able to invoke this operation.
     * </p>
     * 
     * @param getOfferingStatusRequest
     *        Represents the request to retrieve the offering status for the specified customer or account.
     * @return A Java Future containing the result of the GetOfferingStatus operation returned by the service.
     * @sample AWSDeviceFarmAsync.GetOfferingStatus
     */
    java.util.concurrent.Future<GetOfferingStatusResult> getOfferingStatusAsync(GetOfferingStatusRequest getOfferingStatusRequest);

    /**
     * <p>
     * Gets the current status and future status of all offerings purchased by an AWS account. The response indicates
     * how many offerings are currently available and the offerings that will be available in the next period. The API
     * returns a <code>NotEligible</code> error if the user is not permitted to invoke the operation. Please contact <a
     * href="mailto:aws-devicefarm-support@amazon.com">aws-devicefarm-support@amazon.com</a> if you believe that you
     * should be able to invoke this operation.
     * </p>
     * 
     * @param getOfferingStatusRequest
     *        Represents the request to retrieve the offering status for the specified customer or account.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOfferingStatus operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.GetOfferingStatus
     */
    java.util.concurrent.Future<GetOfferingStatusResult> getOfferingStatusAsync(GetOfferingStatusRequest getOfferingStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetOfferingStatusRequest, GetOfferingStatusResult> asyncHandler);

    /**
     * <p>
     * Gets information about a project.
     * </p>
     * 
     * @param getProjectRequest
     *        Represents a request to the get project operation.
     * @return A Java Future containing the result of the GetProject operation returned by the service.
     * @sample AWSDeviceFarmAsync.GetProject
     */
    java.util.concurrent.Future<GetProjectResult> getProjectAsync(GetProjectRequest getProjectRequest);

    /**
     * <p>
     * Gets information about a project.
     * </p>
     * 
     * @param getProjectRequest
     *        Represents a request to the get project operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetProject operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.GetProject
     */
    java.util.concurrent.Future<GetProjectResult> getProjectAsync(GetProjectRequest getProjectRequest,
            com.amazonaws.handlers.AsyncHandler<GetProjectRequest, GetProjectResult> asyncHandler);

    /**
     * <p>
     * Returns a link to a currently running remote access session.
     * </p>
     * 
     * @param getRemoteAccessSessionRequest
     *        Represents the request to get information about the specified remote access session.
     * @return A Java Future containing the result of the GetRemoteAccessSession operation returned by the service.
     * @sample AWSDeviceFarmAsync.GetRemoteAccessSession
     */
    java.util.concurrent.Future<GetRemoteAccessSessionResult> getRemoteAccessSessionAsync(GetRemoteAccessSessionRequest getRemoteAccessSessionRequest);

    /**
     * <p>
     * Returns a link to a currently running remote access session.
     * </p>
     * 
     * @param getRemoteAccessSessionRequest
     *        Represents the request to get information about the specified remote access session.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRemoteAccessSession operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.GetRemoteAccessSession
     */
    java.util.concurrent.Future<GetRemoteAccessSessionResult> getRemoteAccessSessionAsync(GetRemoteAccessSessionRequest getRemoteAccessSessionRequest,
            com.amazonaws.handlers.AsyncHandler<GetRemoteAccessSessionRequest, GetRemoteAccessSessionResult> asyncHandler);

    /**
     * <p>
     * Gets information about a run.
     * </p>
     * 
     * @param getRunRequest
     *        Represents a request to the get run operation.
     * @return A Java Future containing the result of the GetRun operation returned by the service.
     * @sample AWSDeviceFarmAsync.GetRun
     */
    java.util.concurrent.Future<GetRunResult> getRunAsync(GetRunRequest getRunRequest);

    /**
     * <p>
     * Gets information about a run.
     * </p>
     * 
     * @param getRunRequest
     *        Represents a request to the get run operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRun operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.GetRun
     */
    java.util.concurrent.Future<GetRunResult> getRunAsync(GetRunRequest getRunRequest,
            com.amazonaws.handlers.AsyncHandler<GetRunRequest, GetRunResult> asyncHandler);

    /**
     * <p>
     * Gets information about a suite.
     * </p>
     * 
     * @param getSuiteRequest
     *        Represents a request to the get suite operation.
     * @return A Java Future containing the result of the GetSuite operation returned by the service.
     * @sample AWSDeviceFarmAsync.GetSuite
     */
    java.util.concurrent.Future<GetSuiteResult> getSuiteAsync(GetSuiteRequest getSuiteRequest);

    /**
     * <p>
     * Gets information about a suite.
     * </p>
     * 
     * @param getSuiteRequest
     *        Represents a request to the get suite operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSuite operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.GetSuite
     */
    java.util.concurrent.Future<GetSuiteResult> getSuiteAsync(GetSuiteRequest getSuiteRequest,
            com.amazonaws.handlers.AsyncHandler<GetSuiteRequest, GetSuiteResult> asyncHandler);

    /**
     * <p>
     * Gets information about a test.
     * </p>
     * 
     * @param getTestRequest
     *        Represents a request to the get test operation.
     * @return A Java Future containing the result of the GetTest operation returned by the service.
     * @sample AWSDeviceFarmAsync.GetTest
     */
    java.util.concurrent.Future<GetTestResult> getTestAsync(GetTestRequest getTestRequest);

    /**
     * <p>
     * Gets information about a test.
     * </p>
     * 
     * @param getTestRequest
     *        Represents a request to the get test operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTest operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.GetTest
     */
    java.util.concurrent.Future<GetTestResult> getTestAsync(GetTestRequest getTestRequest,
            com.amazonaws.handlers.AsyncHandler<GetTestRequest, GetTestResult> asyncHandler);

    /**
     * <p>
     * Gets information about an upload.
     * </p>
     * 
     * @param getUploadRequest
     *        Represents a request to the get upload operation.
     * @return A Java Future containing the result of the GetUpload operation returned by the service.
     * @sample AWSDeviceFarmAsync.GetUpload
     */
    java.util.concurrent.Future<GetUploadResult> getUploadAsync(GetUploadRequest getUploadRequest);

    /**
     * <p>
     * Gets information about an upload.
     * </p>
     * 
     * @param getUploadRequest
     *        Represents a request to the get upload operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUpload operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.GetUpload
     */
    java.util.concurrent.Future<GetUploadResult> getUploadAsync(GetUploadRequest getUploadRequest,
            com.amazonaws.handlers.AsyncHandler<GetUploadRequest, GetUploadResult> asyncHandler);

    /**
     * <p>
     * Installs an application to the device in a remote access session. For Android applications, the file must be in
     * .apk format. For iOS applications, the file must be in .ipa format.
     * </p>
     * 
     * @param installToRemoteAccessSessionRequest
     *        Represents the request to install an Android application (in .apk format) or an iOS application (in .ipa
     *        format) as part of a remote access session.
     * @return A Java Future containing the result of the InstallToRemoteAccessSession operation returned by the
     *         service.
     * @sample AWSDeviceFarmAsync.InstallToRemoteAccessSession
     */
    java.util.concurrent.Future<InstallToRemoteAccessSessionResult> installToRemoteAccessSessionAsync(
            InstallToRemoteAccessSessionRequest installToRemoteAccessSessionRequest);

    /**
     * <p>
     * Installs an application to the device in a remote access session. For Android applications, the file must be in
     * .apk format. For iOS applications, the file must be in .ipa format.
     * </p>
     * 
     * @param installToRemoteAccessSessionRequest
     *        Represents the request to install an Android application (in .apk format) or an iOS application (in .ipa
     *        format) as part of a remote access session.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InstallToRemoteAccessSession operation returned by the
     *         service.
     * @sample AWSDeviceFarmAsyncHandler.InstallToRemoteAccessSession
     */
    java.util.concurrent.Future<InstallToRemoteAccessSessionResult> installToRemoteAccessSessionAsync(
            InstallToRemoteAccessSessionRequest installToRemoteAccessSessionRequest,
            com.amazonaws.handlers.AsyncHandler<InstallToRemoteAccessSessionRequest, InstallToRemoteAccessSessionResult> asyncHandler);

    /**
     * <p>
     * Gets information about artifacts.
     * </p>
     * 
     * @param listArtifactsRequest
     *        Represents a request to the list artifacts operation.
     * @return A Java Future containing the result of the ListArtifacts operation returned by the service.
     * @sample AWSDeviceFarmAsync.ListArtifacts
     */
    java.util.concurrent.Future<ListArtifactsResult> listArtifactsAsync(ListArtifactsRequest listArtifactsRequest);

    /**
     * <p>
     * Gets information about artifacts.
     * </p>
     * 
     * @param listArtifactsRequest
     *        Represents a request to the list artifacts operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListArtifacts operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.ListArtifacts
     */
    java.util.concurrent.Future<ListArtifactsResult> listArtifactsAsync(ListArtifactsRequest listArtifactsRequest,
            com.amazonaws.handlers.AsyncHandler<ListArtifactsRequest, ListArtifactsResult> asyncHandler);

    /**
     * <p>
     * Gets information about device pools.
     * </p>
     * 
     * @param listDevicePoolsRequest
     *        Represents the result of a list device pools request.
     * @return A Java Future containing the result of the ListDevicePools operation returned by the service.
     * @sample AWSDeviceFarmAsync.ListDevicePools
     */
    java.util.concurrent.Future<ListDevicePoolsResult> listDevicePoolsAsync(ListDevicePoolsRequest listDevicePoolsRequest);

    /**
     * <p>
     * Gets information about device pools.
     * </p>
     * 
     * @param listDevicePoolsRequest
     *        Represents the result of a list device pools request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDevicePools operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.ListDevicePools
     */
    java.util.concurrent.Future<ListDevicePoolsResult> listDevicePoolsAsync(ListDevicePoolsRequest listDevicePoolsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDevicePoolsRequest, ListDevicePoolsResult> asyncHandler);

    /**
     * <p>
     * Gets information about unique device types.
     * </p>
     * 
     * @param listDevicesRequest
     *        Represents the result of a list devices request.
     * @return A Java Future containing the result of the ListDevices operation returned by the service.
     * @sample AWSDeviceFarmAsync.ListDevices
     */
    java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(ListDevicesRequest listDevicesRequest);

    /**
     * <p>
     * Gets information about unique device types.
     * </p>
     * 
     * @param listDevicesRequest
     *        Represents the result of a list devices request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDevices operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.ListDevices
     */
    java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(ListDevicesRequest listDevicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDevicesRequest, ListDevicesResult> asyncHandler);

    /**
     * <p>
     * Gets information about jobs.
     * </p>
     * 
     * @param listJobsRequest
     *        Represents a request to the list jobs operation.
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AWSDeviceFarmAsync.ListJobs
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest);

    /**
     * <p>
     * Gets information about jobs.
     * </p>
     * 
     * @param listJobsRequest
     *        Represents a request to the list jobs operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.ListJobs
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all historical purchases, renewals, and system renewal transactions for an AWS account. The
     * list is paginated and ordered by a descending timestamp (most recent transactions are first). The API returns a
     * <code>NotEligible</code> error if the user is not permitted to invoke the operation. Please contact <a
     * href="mailto:aws-devicefarm-support@amazon.com">aws-devicefarm-support@amazon.com</a> if you believe that you
     * should be able to invoke this operation.
     * </p>
     * 
     * @param listOfferingTransactionsRequest
     *        Represents the request to list the offering transaction history.
     * @return A Java Future containing the result of the ListOfferingTransactions operation returned by the service.
     * @sample AWSDeviceFarmAsync.ListOfferingTransactions
     */
    java.util.concurrent.Future<ListOfferingTransactionsResult> listOfferingTransactionsAsync(ListOfferingTransactionsRequest listOfferingTransactionsRequest);

    /**
     * <p>
     * Returns a list of all historical purchases, renewals, and system renewal transactions for an AWS account. The
     * list is paginated and ordered by a descending timestamp (most recent transactions are first). The API returns a
     * <code>NotEligible</code> error if the user is not permitted to invoke the operation. Please contact <a
     * href="mailto:aws-devicefarm-support@amazon.com">aws-devicefarm-support@amazon.com</a> if you believe that you
     * should be able to invoke this operation.
     * </p>
     * 
     * @param listOfferingTransactionsRequest
     *        Represents the request to list the offering transaction history.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOfferingTransactions operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.ListOfferingTransactions
     */
    java.util.concurrent.Future<ListOfferingTransactionsResult> listOfferingTransactionsAsync(ListOfferingTransactionsRequest listOfferingTransactionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListOfferingTransactionsRequest, ListOfferingTransactionsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of products or offerings that the user can manage through the API. Each offering record indicates
     * the recurring price per unit and the frequency for that offering. The API returns a <code>NotEligible</code>
     * error if the user is not permitted to invoke the operation. Please contact <a
     * href="mailto:aws-devicefarm-support@amazon.com">aws-devicefarm-support@amazon.com</a> if you believe that you
     * should be able to invoke this operation.
     * </p>
     * 
     * @param listOfferingsRequest
     *        Represents the request to list all offerings.
     * @return A Java Future containing the result of the ListOfferings operation returned by the service.
     * @sample AWSDeviceFarmAsync.ListOfferings
     */
    java.util.concurrent.Future<ListOfferingsResult> listOfferingsAsync(ListOfferingsRequest listOfferingsRequest);

    /**
     * <p>
     * Returns a list of products or offerings that the user can manage through the API. Each offering record indicates
     * the recurring price per unit and the frequency for that offering. The API returns a <code>NotEligible</code>
     * error if the user is not permitted to invoke the operation. Please contact <a
     * href="mailto:aws-devicefarm-support@amazon.com">aws-devicefarm-support@amazon.com</a> if you believe that you
     * should be able to invoke this operation.
     * </p>
     * 
     * @param listOfferingsRequest
     *        Represents the request to list all offerings.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOfferings operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.ListOfferings
     */
    java.util.concurrent.Future<ListOfferingsResult> listOfferingsAsync(ListOfferingsRequest listOfferingsRequest,
            com.amazonaws.handlers.AsyncHandler<ListOfferingsRequest, ListOfferingsResult> asyncHandler);

    /**
     * <p>
     * Gets information about projects.
     * </p>
     * 
     * @param listProjectsRequest
     *        Represents a request to the list projects operation.
     * @return A Java Future containing the result of the ListProjects operation returned by the service.
     * @sample AWSDeviceFarmAsync.ListProjects
     */
    java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest listProjectsRequest);

    /**
     * <p>
     * Gets information about projects.
     * </p>
     * 
     * @param listProjectsRequest
     *        Represents a request to the list projects operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProjects operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.ListProjects
     */
    java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest listProjectsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProjectsRequest, ListProjectsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all currently running remote access sessions.
     * </p>
     * 
     * @param listRemoteAccessSessionsRequest
     *        Represents the request to return information about the remote access session.
     * @return A Java Future containing the result of the ListRemoteAccessSessions operation returned by the service.
     * @sample AWSDeviceFarmAsync.ListRemoteAccessSessions
     */
    java.util.concurrent.Future<ListRemoteAccessSessionsResult> listRemoteAccessSessionsAsync(ListRemoteAccessSessionsRequest listRemoteAccessSessionsRequest);

    /**
     * <p>
     * Returns a list of all currently running remote access sessions.
     * </p>
     * 
     * @param listRemoteAccessSessionsRequest
     *        Represents the request to return information about the remote access session.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRemoteAccessSessions operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.ListRemoteAccessSessions
     */
    java.util.concurrent.Future<ListRemoteAccessSessionsResult> listRemoteAccessSessionsAsync(ListRemoteAccessSessionsRequest listRemoteAccessSessionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRemoteAccessSessionsRequest, ListRemoteAccessSessionsResult> asyncHandler);

    /**
     * <p>
     * Gets information about runs, given an AWS Device Farm project ARN.
     * </p>
     * 
     * @param listRunsRequest
     *        Represents a request to the list runs operation.
     * @return A Java Future containing the result of the ListRuns operation returned by the service.
     * @sample AWSDeviceFarmAsync.ListRuns
     */
    java.util.concurrent.Future<ListRunsResult> listRunsAsync(ListRunsRequest listRunsRequest);

    /**
     * <p>
     * Gets information about runs, given an AWS Device Farm project ARN.
     * </p>
     * 
     * @param listRunsRequest
     *        Represents a request to the list runs operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRuns operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.ListRuns
     */
    java.util.concurrent.Future<ListRunsResult> listRunsAsync(ListRunsRequest listRunsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRunsRequest, ListRunsResult> asyncHandler);

    /**
     * <p>
     * Gets information about samples, given an AWS Device Farm project ARN
     * </p>
     * 
     * @param listSamplesRequest
     *        Represents a request to the list samples operation.
     * @return A Java Future containing the result of the ListSamples operation returned by the service.
     * @sample AWSDeviceFarmAsync.ListSamples
     */
    java.util.concurrent.Future<ListSamplesResult> listSamplesAsync(ListSamplesRequest listSamplesRequest);

    /**
     * <p>
     * Gets information about samples, given an AWS Device Farm project ARN
     * </p>
     * 
     * @param listSamplesRequest
     *        Represents a request to the list samples operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSamples operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.ListSamples
     */
    java.util.concurrent.Future<ListSamplesResult> listSamplesAsync(ListSamplesRequest listSamplesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSamplesRequest, ListSamplesResult> asyncHandler);

    /**
     * <p>
     * Gets information about suites.
     * </p>
     * 
     * @param listSuitesRequest
     *        Represents a request to the list suites operation.
     * @return A Java Future containing the result of the ListSuites operation returned by the service.
     * @sample AWSDeviceFarmAsync.ListSuites
     */
    java.util.concurrent.Future<ListSuitesResult> listSuitesAsync(ListSuitesRequest listSuitesRequest);

    /**
     * <p>
     * Gets information about suites.
     * </p>
     * 
     * @param listSuitesRequest
     *        Represents a request to the list suites operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSuites operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.ListSuites
     */
    java.util.concurrent.Future<ListSuitesResult> listSuitesAsync(ListSuitesRequest listSuitesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSuitesRequest, ListSuitesResult> asyncHandler);

    /**
     * <p>
     * Gets information about tests.
     * </p>
     * 
     * @param listTestsRequest
     *        Represents a request to the list tests operation.
     * @return A Java Future containing the result of the ListTests operation returned by the service.
     * @sample AWSDeviceFarmAsync.ListTests
     */
    java.util.concurrent.Future<ListTestsResult> listTestsAsync(ListTestsRequest listTestsRequest);

    /**
     * <p>
     * Gets information about tests.
     * </p>
     * 
     * @param listTestsRequest
     *        Represents a request to the list tests operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTests operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.ListTests
     */
    java.util.concurrent.Future<ListTestsResult> listTestsAsync(ListTestsRequest listTestsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTestsRequest, ListTestsResult> asyncHandler);

    /**
     * <p>
     * Gets information about unique problems.
     * </p>
     * 
     * @param listUniqueProblemsRequest
     *        Represents a request to the list unique problems operation.
     * @return A Java Future containing the result of the ListUniqueProblems operation returned by the service.
     * @sample AWSDeviceFarmAsync.ListUniqueProblems
     */
    java.util.concurrent.Future<ListUniqueProblemsResult> listUniqueProblemsAsync(ListUniqueProblemsRequest listUniqueProblemsRequest);

    /**
     * <p>
     * Gets information about unique problems.
     * </p>
     * 
     * @param listUniqueProblemsRequest
     *        Represents a request to the list unique problems operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUniqueProblems operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.ListUniqueProblems
     */
    java.util.concurrent.Future<ListUniqueProblemsResult> listUniqueProblemsAsync(ListUniqueProblemsRequest listUniqueProblemsRequest,
            com.amazonaws.handlers.AsyncHandler<ListUniqueProblemsRequest, ListUniqueProblemsResult> asyncHandler);

    /**
     * <p>
     * Gets information about uploads, given an AWS Device Farm project ARN.
     * </p>
     * 
     * @param listUploadsRequest
     *        Represents a request to the list uploads operation.
     * @return A Java Future containing the result of the ListUploads operation returned by the service.
     * @sample AWSDeviceFarmAsync.ListUploads
     */
    java.util.concurrent.Future<ListUploadsResult> listUploadsAsync(ListUploadsRequest listUploadsRequest);

    /**
     * <p>
     * Gets information about uploads, given an AWS Device Farm project ARN.
     * </p>
     * 
     * @param listUploadsRequest
     *        Represents a request to the list uploads operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUploads operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.ListUploads
     */
    java.util.concurrent.Future<ListUploadsResult> listUploadsAsync(ListUploadsRequest listUploadsRequest,
            com.amazonaws.handlers.AsyncHandler<ListUploadsRequest, ListUploadsResult> asyncHandler);

    /**
     * <p>
     * Immediately purchases offerings for an AWS account. Offerings renew with the latest total purchased quantity for
     * an offering, unless the renewal was overridden. The API returns a <code>NotEligible</code> error if the user is
     * not permitted to invoke the operation. Please contact <a
     * href="mailto:aws-devicefarm-support@amazon.com">aws-devicefarm-support@amazon.com</a> if you believe that you
     * should be able to invoke this operation.
     * </p>
     * 
     * @param purchaseOfferingRequest
     *        Represents a request for a purchase offering.
     * @return A Java Future containing the result of the PurchaseOffering operation returned by the service.
     * @sample AWSDeviceFarmAsync.PurchaseOffering
     */
    java.util.concurrent.Future<PurchaseOfferingResult> purchaseOfferingAsync(PurchaseOfferingRequest purchaseOfferingRequest);

    /**
     * <p>
     * Immediately purchases offerings for an AWS account. Offerings renew with the latest total purchased quantity for
     * an offering, unless the renewal was overridden. The API returns a <code>NotEligible</code> error if the user is
     * not permitted to invoke the operation. Please contact <a
     * href="mailto:aws-devicefarm-support@amazon.com">aws-devicefarm-support@amazon.com</a> if you believe that you
     * should be able to invoke this operation.
     * </p>
     * 
     * @param purchaseOfferingRequest
     *        Represents a request for a purchase offering.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PurchaseOffering operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.PurchaseOffering
     */
    java.util.concurrent.Future<PurchaseOfferingResult> purchaseOfferingAsync(PurchaseOfferingRequest purchaseOfferingRequest,
            com.amazonaws.handlers.AsyncHandler<PurchaseOfferingRequest, PurchaseOfferingResult> asyncHandler);

    /**
     * <p>
     * Explicitly sets the quantity of devices to renew for an offering, starting from the <code>effectiveDate</code> of
     * the next period. The API returns a <code>NotEligible</code> error if the user is not permitted to invoke the
     * operation. Please contact <a
     * href="mailto:aws-devicefarm-support@amazon.com">aws-devicefarm-support@amazon.com</a> if you believe that you
     * should be able to invoke this operation.
     * </p>
     * 
     * @param renewOfferingRequest
     *        A request representing an offering renewal.
     * @return A Java Future containing the result of the RenewOffering operation returned by the service.
     * @sample AWSDeviceFarmAsync.RenewOffering
     */
    java.util.concurrent.Future<RenewOfferingResult> renewOfferingAsync(RenewOfferingRequest renewOfferingRequest);

    /**
     * <p>
     * Explicitly sets the quantity of devices to renew for an offering, starting from the <code>effectiveDate</code> of
     * the next period. The API returns a <code>NotEligible</code> error if the user is not permitted to invoke the
     * operation. Please contact <a
     * href="mailto:aws-devicefarm-support@amazon.com">aws-devicefarm-support@amazon.com</a> if you believe that you
     * should be able to invoke this operation.
     * </p>
     * 
     * @param renewOfferingRequest
     *        A request representing an offering renewal.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RenewOffering operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.RenewOffering
     */
    java.util.concurrent.Future<RenewOfferingResult> renewOfferingAsync(RenewOfferingRequest renewOfferingRequest,
            com.amazonaws.handlers.AsyncHandler<RenewOfferingRequest, RenewOfferingResult> asyncHandler);

    /**
     * <p>
     * Schedules a run.
     * </p>
     * 
     * @param scheduleRunRequest
     *        Represents a request to the schedule run operation.
     * @return A Java Future containing the result of the ScheduleRun operation returned by the service.
     * @sample AWSDeviceFarmAsync.ScheduleRun
     */
    java.util.concurrent.Future<ScheduleRunResult> scheduleRunAsync(ScheduleRunRequest scheduleRunRequest);

    /**
     * <p>
     * Schedules a run.
     * </p>
     * 
     * @param scheduleRunRequest
     *        Represents a request to the schedule run operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ScheduleRun operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.ScheduleRun
     */
    java.util.concurrent.Future<ScheduleRunResult> scheduleRunAsync(ScheduleRunRequest scheduleRunRequest,
            com.amazonaws.handlers.AsyncHandler<ScheduleRunRequest, ScheduleRunResult> asyncHandler);

    /**
     * <p>
     * Ends a specified remote access session.
     * </p>
     * 
     * @param stopRemoteAccessSessionRequest
     *        Represents the request to stop the remote access session.
     * @return A Java Future containing the result of the StopRemoteAccessSession operation returned by the service.
     * @sample AWSDeviceFarmAsync.StopRemoteAccessSession
     */
    java.util.concurrent.Future<StopRemoteAccessSessionResult> stopRemoteAccessSessionAsync(StopRemoteAccessSessionRequest stopRemoteAccessSessionRequest);

    /**
     * <p>
     * Ends a specified remote access session.
     * </p>
     * 
     * @param stopRemoteAccessSessionRequest
     *        Represents the request to stop the remote access session.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopRemoteAccessSession operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.StopRemoteAccessSession
     */
    java.util.concurrent.Future<StopRemoteAccessSessionResult> stopRemoteAccessSessionAsync(StopRemoteAccessSessionRequest stopRemoteAccessSessionRequest,
            com.amazonaws.handlers.AsyncHandler<StopRemoteAccessSessionRequest, StopRemoteAccessSessionResult> asyncHandler);

    /**
     * <p>
     * Initiates a stop request for the current test run. AWS Device Farm will immediately stop the run on devices where
     * tests have not started executing, and you will not be billed for these devices. On devices where tests have
     * started executing, Setup Suite and Teardown Suite tests will run to completion before stopping execution on those
     * devices. You will be billed for Setup, Teardown, and any tests that were in progress or already completed.
     * </p>
     * 
     * @param stopRunRequest
     *        Represents the request to stop a specific run.
     * @return A Java Future containing the result of the StopRun operation returned by the service.
     * @sample AWSDeviceFarmAsync.StopRun
     */
    java.util.concurrent.Future<StopRunResult> stopRunAsync(StopRunRequest stopRunRequest);

    /**
     * <p>
     * Initiates a stop request for the current test run. AWS Device Farm will immediately stop the run on devices where
     * tests have not started executing, and you will not be billed for these devices. On devices where tests have
     * started executing, Setup Suite and Teardown Suite tests will run to completion before stopping execution on those
     * devices. You will be billed for Setup, Teardown, and any tests that were in progress or already completed.
     * </p>
     * 
     * @param stopRunRequest
     *        Represents the request to stop a specific run.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopRun operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.StopRun
     */
    java.util.concurrent.Future<StopRunResult> stopRunAsync(StopRunRequest stopRunRequest,
            com.amazonaws.handlers.AsyncHandler<StopRunRequest, StopRunResult> asyncHandler);

    /**
     * <p>
     * Modifies the name, description, and rules in a device pool given the attributes and the pool ARN. Rule updates
     * are all-or-nothing, meaning they can only be updated as a whole (or not at all).
     * </p>
     * 
     * @param updateDevicePoolRequest
     *        Represents a request to the update device pool operation.
     * @return A Java Future containing the result of the UpdateDevicePool operation returned by the service.
     * @sample AWSDeviceFarmAsync.UpdateDevicePool
     */
    java.util.concurrent.Future<UpdateDevicePoolResult> updateDevicePoolAsync(UpdateDevicePoolRequest updateDevicePoolRequest);

    /**
     * <p>
     * Modifies the name, description, and rules in a device pool given the attributes and the pool ARN. Rule updates
     * are all-or-nothing, meaning they can only be updated as a whole (or not at all).
     * </p>
     * 
     * @param updateDevicePoolRequest
     *        Represents a request to the update device pool operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDevicePool operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.UpdateDevicePool
     */
    java.util.concurrent.Future<UpdateDevicePoolResult> updateDevicePoolAsync(UpdateDevicePoolRequest updateDevicePoolRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDevicePoolRequest, UpdateDevicePoolResult> asyncHandler);

    /**
     * <p>
     * Modifies the specified project name, given the project ARN and a new name.
     * </p>
     * 
     * @param updateProjectRequest
     *        Represents a request to the update project operation.
     * @return A Java Future containing the result of the UpdateProject operation returned by the service.
     * @sample AWSDeviceFarmAsync.UpdateProject
     */
    java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest updateProjectRequest);

    /**
     * <p>
     * Modifies the specified project name, given the project ARN and a new name.
     * </p>
     * 
     * @param updateProjectRequest
     *        Represents a request to the update project operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProject operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.UpdateProject
     */
    java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest updateProjectRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProjectRequest, UpdateProjectResult> asyncHandler);

}
