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
package com.amazonaws.services.devicefarm;

import javax.annotation.Generated;

import com.amazonaws.services.devicefarm.model.*;

/**
 * Interface for accessing AWS Device Farm asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.devicefarm.AbstractAWSDeviceFarmAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS Device Farm is a service that enables mobile app developers to test Android, iOS, and Fire OS apps on physical
 * phones, tablets, and other devices in the cloud.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateDevicePool" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateDevicePool" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDevicePoolResult> createDevicePoolAsync(CreateDevicePoolRequest createDevicePoolRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDevicePoolRequest, CreateDevicePoolResult> asyncHandler);

    /**
     * <p>
     * Creates a profile that can be applied to one or more private fleet device instances.
     * </p>
     * 
     * @param createInstanceProfileRequest
     * @return A Java Future containing the result of the CreateInstanceProfile operation returned by the service.
     * @sample AWSDeviceFarmAsync.CreateInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateInstanceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateInstanceProfileResult> createInstanceProfileAsync(CreateInstanceProfileRequest createInstanceProfileRequest);

    /**
     * <p>
     * Creates a profile that can be applied to one or more private fleet device instances.
     * </p>
     * 
     * @param createInstanceProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInstanceProfile operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.CreateInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateInstanceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateInstanceProfileResult> createInstanceProfileAsync(CreateInstanceProfileRequest createInstanceProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInstanceProfileRequest, CreateInstanceProfileResult> asyncHandler);

    /**
     * <p>
     * Creates a network profile.
     * </p>
     * 
     * @param createNetworkProfileRequest
     * @return A Java Future containing the result of the CreateNetworkProfile operation returned by the service.
     * @sample AWSDeviceFarmAsync.CreateNetworkProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateNetworkProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNetworkProfileResult> createNetworkProfileAsync(CreateNetworkProfileRequest createNetworkProfileRequest);

    /**
     * <p>
     * Creates a network profile.
     * </p>
     * 
     * @param createNetworkProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateNetworkProfile operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.CreateNetworkProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateNetworkProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNetworkProfileResult> createNetworkProfileAsync(CreateNetworkProfileRequest createNetworkProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateNetworkProfileRequest, CreateNetworkProfileResult> asyncHandler);

    /**
     * <p>
     * Creates a new project.
     * </p>
     * 
     * @param createProjectRequest
     *        Represents a request to the create project operation.
     * @return A Java Future containing the result of the CreateProject operation returned by the service.
     * @sample AWSDeviceFarmAsync.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateProject" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateProject" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateRemoteAccessSession"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateRemoteAccessSession"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateUpload" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateUpload" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUploadResult> createUploadAsync(CreateUploadRequest createUploadRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUploadRequest, CreateUploadResult> asyncHandler);

    /**
     * <p>
     * Creates a configuration record in Device Farm for your Amazon Virtual Private Cloud (VPC) endpoint.
     * </p>
     * 
     * @param createVPCEConfigurationRequest
     * @return A Java Future containing the result of the CreateVPCEConfiguration operation returned by the service.
     * @sample AWSDeviceFarmAsync.CreateVPCEConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateVPCEConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVPCEConfigurationResult> createVPCEConfigurationAsync(CreateVPCEConfigurationRequest createVPCEConfigurationRequest);

    /**
     * <p>
     * Creates a configuration record in Device Farm for your Amazon Virtual Private Cloud (VPC) endpoint.
     * </p>
     * 
     * @param createVPCEConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVPCEConfiguration operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.CreateVPCEConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateVPCEConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVPCEConfigurationResult> createVPCEConfigurationAsync(CreateVPCEConfigurationRequest createVPCEConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVPCEConfigurationRequest, CreateVPCEConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes a device pool given the pool ARN. Does not allow deletion of curated pools owned by the system.
     * </p>
     * 
     * @param deleteDevicePoolRequest
     *        Represents a request to the delete device pool operation.
     * @return A Java Future containing the result of the DeleteDevicePool operation returned by the service.
     * @sample AWSDeviceFarmAsync.DeleteDevicePool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteDevicePool" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteDevicePool" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDevicePoolResult> deleteDevicePoolAsync(DeleteDevicePoolRequest deleteDevicePoolRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDevicePoolRequest, DeleteDevicePoolResult> asyncHandler);

    /**
     * <p>
     * Deletes a profile that can be applied to one or more private device instances.
     * </p>
     * 
     * @param deleteInstanceProfileRequest
     * @return A Java Future containing the result of the DeleteInstanceProfile operation returned by the service.
     * @sample AWSDeviceFarmAsync.DeleteInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteInstanceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInstanceProfileResult> deleteInstanceProfileAsync(DeleteInstanceProfileRequest deleteInstanceProfileRequest);

    /**
     * <p>
     * Deletes a profile that can be applied to one or more private device instances.
     * </p>
     * 
     * @param deleteInstanceProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInstanceProfile operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.DeleteInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteInstanceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInstanceProfileResult> deleteInstanceProfileAsync(DeleteInstanceProfileRequest deleteInstanceProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInstanceProfileRequest, DeleteInstanceProfileResult> asyncHandler);

    /**
     * <p>
     * Deletes a network profile.
     * </p>
     * 
     * @param deleteNetworkProfileRequest
     * @return A Java Future containing the result of the DeleteNetworkProfile operation returned by the service.
     * @sample AWSDeviceFarmAsync.DeleteNetworkProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteNetworkProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNetworkProfileResult> deleteNetworkProfileAsync(DeleteNetworkProfileRequest deleteNetworkProfileRequest);

    /**
     * <p>
     * Deletes a network profile.
     * </p>
     * 
     * @param deleteNetworkProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteNetworkProfile operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.DeleteNetworkProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteNetworkProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNetworkProfileResult> deleteNetworkProfileAsync(DeleteNetworkProfileRequest deleteNetworkProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNetworkProfileRequest, DeleteNetworkProfileResult> asyncHandler);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteProject" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteProject" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteRemoteAccessSession"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteRemoteAccessSession"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteRun" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteRun" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteUpload" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteUpload" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUploadResult> deleteUploadAsync(DeleteUploadRequest deleteUploadRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUploadRequest, DeleteUploadResult> asyncHandler);

    /**
     * <p>
     * Deletes a configuration for your Amazon Virtual Private Cloud (VPC) endpoint.
     * </p>
     * 
     * @param deleteVPCEConfigurationRequest
     * @return A Java Future containing the result of the DeleteVPCEConfiguration operation returned by the service.
     * @sample AWSDeviceFarmAsync.DeleteVPCEConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteVPCEConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVPCEConfigurationResult> deleteVPCEConfigurationAsync(DeleteVPCEConfigurationRequest deleteVPCEConfigurationRequest);

    /**
     * <p>
     * Deletes a configuration for your Amazon Virtual Private Cloud (VPC) endpoint.
     * </p>
     * 
     * @param deleteVPCEConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVPCEConfiguration operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.DeleteVPCEConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteVPCEConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVPCEConfigurationResult> deleteVPCEConfigurationAsync(DeleteVPCEConfigurationRequest deleteVPCEConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVPCEConfigurationRequest, DeleteVPCEConfigurationResult> asyncHandler);

    /**
     * <p>
     * Returns the number of unmetered iOS and/or unmetered Android devices that have been purchased by the account.
     * </p>
     * 
     * @param getAccountSettingsRequest
     *        Represents the request sent to retrieve the account settings.
     * @return A Java Future containing the result of the GetAccountSettings operation returned by the service.
     * @sample AWSDeviceFarmAsync.GetAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetAccountSettings" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetAccountSettings" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetDevice" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetDevice" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDeviceResult> getDeviceAsync(GetDeviceRequest getDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeviceRequest, GetDeviceResult> asyncHandler);

    /**
     * <p>
     * Returns information about a device instance belonging to a private device fleet.
     * </p>
     * 
     * @param getDeviceInstanceRequest
     * @return A Java Future containing the result of the GetDeviceInstance operation returned by the service.
     * @sample AWSDeviceFarmAsync.GetDeviceInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetDeviceInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDeviceInstanceResult> getDeviceInstanceAsync(GetDeviceInstanceRequest getDeviceInstanceRequest);

    /**
     * <p>
     * Returns information about a device instance belonging to a private device fleet.
     * </p>
     * 
     * @param getDeviceInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeviceInstance operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.GetDeviceInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetDeviceInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDeviceInstanceResult> getDeviceInstanceAsync(GetDeviceInstanceRequest getDeviceInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeviceInstanceRequest, GetDeviceInstanceResult> asyncHandler);

    /**
     * <p>
     * Gets information about a device pool.
     * </p>
     * 
     * @param getDevicePoolRequest
     *        Represents a request to the get device pool operation.
     * @return A Java Future containing the result of the GetDevicePool operation returned by the service.
     * @sample AWSDeviceFarmAsync.GetDevicePool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetDevicePool" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetDevicePool" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetDevicePoolCompatibility"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetDevicePoolCompatibility"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDevicePoolCompatibilityResult> getDevicePoolCompatibilityAsync(
            GetDevicePoolCompatibilityRequest getDevicePoolCompatibilityRequest,
            com.amazonaws.handlers.AsyncHandler<GetDevicePoolCompatibilityRequest, GetDevicePoolCompatibilityResult> asyncHandler);

    /**
     * <p>
     * Returns information about the specified instance profile.
     * </p>
     * 
     * @param getInstanceProfileRequest
     * @return A Java Future containing the result of the GetInstanceProfile operation returned by the service.
     * @sample AWSDeviceFarmAsync.GetInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetInstanceProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceProfileResult> getInstanceProfileAsync(GetInstanceProfileRequest getInstanceProfileRequest);

    /**
     * <p>
     * Returns information about the specified instance profile.
     * </p>
     * 
     * @param getInstanceProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstanceProfile operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.GetInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetInstanceProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceProfileResult> getInstanceProfileAsync(GetInstanceProfileRequest getInstanceProfileRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstanceProfileRequest, GetInstanceProfileResult> asyncHandler);

    /**
     * <p>
     * Gets information about a job.
     * </p>
     * 
     * @param getJobRequest
     *        Represents a request to the get job operation.
     * @return A Java Future containing the result of the GetJob operation returned by the service.
     * @sample AWSDeviceFarmAsync.GetJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetJob" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJobResult> getJobAsync(GetJobRequest getJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetJobRequest, GetJobResult> asyncHandler);

    /**
     * <p>
     * Returns information about a network profile.
     * </p>
     * 
     * @param getNetworkProfileRequest
     * @return A Java Future containing the result of the GetNetworkProfile operation returned by the service.
     * @sample AWSDeviceFarmAsync.GetNetworkProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetNetworkProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetNetworkProfileResult> getNetworkProfileAsync(GetNetworkProfileRequest getNetworkProfileRequest);

    /**
     * <p>
     * Returns information about a network profile.
     * </p>
     * 
     * @param getNetworkProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetNetworkProfile operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.GetNetworkProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetNetworkProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetNetworkProfileResult> getNetworkProfileAsync(GetNetworkProfileRequest getNetworkProfileRequest,
            com.amazonaws.handlers.AsyncHandler<GetNetworkProfileRequest, GetNetworkProfileResult> asyncHandler);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetOfferingStatus" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetOfferingStatus" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetProject" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetProject" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetRemoteAccessSession"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetRemoteAccessSession"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetRun" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetRun" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetSuite" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetSuite" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetTest" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetTest" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetUpload" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetUpload" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetUploadResult> getUploadAsync(GetUploadRequest getUploadRequest,
            com.amazonaws.handlers.AsyncHandler<GetUploadRequest, GetUploadResult> asyncHandler);

    /**
     * <p>
     * Returns information about the configuration settings for your Amazon Virtual Private Cloud (VPC) endpoint.
     * </p>
     * 
     * @param getVPCEConfigurationRequest
     * @return A Java Future containing the result of the GetVPCEConfiguration operation returned by the service.
     * @sample AWSDeviceFarmAsync.GetVPCEConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetVPCEConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVPCEConfigurationResult> getVPCEConfigurationAsync(GetVPCEConfigurationRequest getVPCEConfigurationRequest);

    /**
     * <p>
     * Returns information about the configuration settings for your Amazon Virtual Private Cloud (VPC) endpoint.
     * </p>
     * 
     * @param getVPCEConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVPCEConfiguration operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.GetVPCEConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetVPCEConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVPCEConfigurationResult> getVPCEConfigurationAsync(GetVPCEConfigurationRequest getVPCEConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetVPCEConfigurationRequest, GetVPCEConfigurationResult> asyncHandler);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/InstallToRemoteAccessSession"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/InstallToRemoteAccessSession"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListArtifacts" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListArtifacts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListArtifactsResult> listArtifactsAsync(ListArtifactsRequest listArtifactsRequest,
            com.amazonaws.handlers.AsyncHandler<ListArtifactsRequest, ListArtifactsResult> asyncHandler);

    /**
     * <p>
     * Returns information about the private device instances associated with one or more AWS accounts.
     * </p>
     * 
     * @param listDeviceInstancesRequest
     * @return A Java Future containing the result of the ListDeviceInstances operation returned by the service.
     * @sample AWSDeviceFarmAsync.ListDeviceInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListDeviceInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDeviceInstancesResult> listDeviceInstancesAsync(ListDeviceInstancesRequest listDeviceInstancesRequest);

    /**
     * <p>
     * Returns information about the private device instances associated with one or more AWS accounts.
     * </p>
     * 
     * @param listDeviceInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDeviceInstances operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.ListDeviceInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListDeviceInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDeviceInstancesResult> listDeviceInstancesAsync(ListDeviceInstancesRequest listDeviceInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDeviceInstancesRequest, ListDeviceInstancesResult> asyncHandler);

    /**
     * <p>
     * Gets information about device pools.
     * </p>
     * 
     * @param listDevicePoolsRequest
     *        Represents the result of a list device pools request.
     * @return A Java Future containing the result of the ListDevicePools operation returned by the service.
     * @sample AWSDeviceFarmAsync.ListDevicePools
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListDevicePools" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListDevicePools" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListDevices" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListDevices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(ListDevicesRequest listDevicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDevicesRequest, ListDevicesResult> asyncHandler);

    /**
     * <p>
     * Returns information about all the instance profiles in an AWS account.
     * </p>
     * 
     * @param listInstanceProfilesRequest
     * @return A Java Future containing the result of the ListInstanceProfiles operation returned by the service.
     * @sample AWSDeviceFarmAsync.ListInstanceProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListInstanceProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListInstanceProfilesResult> listInstanceProfilesAsync(ListInstanceProfilesRequest listInstanceProfilesRequest);

    /**
     * <p>
     * Returns information about all the instance profiles in an AWS account.
     * </p>
     * 
     * @param listInstanceProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInstanceProfiles operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.ListInstanceProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListInstanceProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListInstanceProfilesResult> listInstanceProfilesAsync(ListInstanceProfilesRequest listInstanceProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<ListInstanceProfilesRequest, ListInstanceProfilesResult> asyncHandler);

    /**
     * <p>
     * Gets information about jobs for a given test run.
     * </p>
     * 
     * @param listJobsRequest
     *        Represents a request to the list jobs operation.
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AWSDeviceFarmAsync.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest);

    /**
     * <p>
     * Gets information about jobs for a given test run.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler);

    /**
     * <p>
     * Returns the list of available network profiles.
     * </p>
     * 
     * @param listNetworkProfilesRequest
     * @return A Java Future containing the result of the ListNetworkProfiles operation returned by the service.
     * @sample AWSDeviceFarmAsync.ListNetworkProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListNetworkProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListNetworkProfilesResult> listNetworkProfilesAsync(ListNetworkProfilesRequest listNetworkProfilesRequest);

    /**
     * <p>
     * Returns the list of available network profiles.
     * </p>
     * 
     * @param listNetworkProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNetworkProfiles operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.ListNetworkProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListNetworkProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListNetworkProfilesResult> listNetworkProfilesAsync(ListNetworkProfilesRequest listNetworkProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<ListNetworkProfilesRequest, ListNetworkProfilesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of offering promotions. Each offering promotion record contains the ID and description of the
     * promotion. The API returns a <code>NotEligible</code> error if the caller is not permitted to invoke the
     * operation. Contact <a href="mailto:aws-devicefarm-support@amazon.com">aws-devicefarm-support@amazon.com</a> if
     * you believe that you should be able to invoke this operation.
     * </p>
     * 
     * @param listOfferingPromotionsRequest
     * @return A Java Future containing the result of the ListOfferingPromotions operation returned by the service.
     * @sample AWSDeviceFarmAsync.ListOfferingPromotions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListOfferingPromotions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOfferingPromotionsResult> listOfferingPromotionsAsync(ListOfferingPromotionsRequest listOfferingPromotionsRequest);

    /**
     * <p>
     * Returns a list of offering promotions. Each offering promotion record contains the ID and description of the
     * promotion. The API returns a <code>NotEligible</code> error if the caller is not permitted to invoke the
     * operation. Contact <a href="mailto:aws-devicefarm-support@amazon.com">aws-devicefarm-support@amazon.com</a> if
     * you believe that you should be able to invoke this operation.
     * </p>
     * 
     * @param listOfferingPromotionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOfferingPromotions operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.ListOfferingPromotions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListOfferingPromotions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOfferingPromotionsResult> listOfferingPromotionsAsync(ListOfferingPromotionsRequest listOfferingPromotionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListOfferingPromotionsRequest, ListOfferingPromotionsResult> asyncHandler);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListOfferingTransactions"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListOfferingTransactions"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListOfferings" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListOfferings" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListProjects" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListProjects" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListRemoteAccessSessions"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListRemoteAccessSessions"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListRuns" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListRuns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRunsResult> listRunsAsync(ListRunsRequest listRunsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRunsRequest, ListRunsResult> asyncHandler);

    /**
     * <p>
     * Gets information about samples, given an AWS Device Farm job ARN.
     * </p>
     * 
     * @param listSamplesRequest
     *        Represents a request to the list samples operation.
     * @return A Java Future containing the result of the ListSamples operation returned by the service.
     * @sample AWSDeviceFarmAsync.ListSamples
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListSamples" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSamplesResult> listSamplesAsync(ListSamplesRequest listSamplesRequest);

    /**
     * <p>
     * Gets information about samples, given an AWS Device Farm job ARN.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListSamples" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSamplesResult> listSamplesAsync(ListSamplesRequest listSamplesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSamplesRequest, ListSamplesResult> asyncHandler);

    /**
     * <p>
     * Gets information about test suites for a given job.
     * </p>
     * 
     * @param listSuitesRequest
     *        Represents a request to the list suites operation.
     * @return A Java Future containing the result of the ListSuites operation returned by the service.
     * @sample AWSDeviceFarmAsync.ListSuites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListSuites" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSuitesResult> listSuitesAsync(ListSuitesRequest listSuitesRequest);

    /**
     * <p>
     * Gets information about test suites for a given job.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListSuites" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSuitesResult> listSuitesAsync(ListSuitesRequest listSuitesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSuitesRequest, ListSuitesResult> asyncHandler);

    /**
     * <p>
     * Gets information about tests in a given test suite.
     * </p>
     * 
     * @param listTestsRequest
     *        Represents a request to the list tests operation.
     * @return A Java Future containing the result of the ListTests operation returned by the service.
     * @sample AWSDeviceFarmAsync.ListTests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListTests" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTestsResult> listTestsAsync(ListTestsRequest listTestsRequest);

    /**
     * <p>
     * Gets information about tests in a given test suite.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListTests" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListUniqueProblems" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListUniqueProblems" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListUploads" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListUploads" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUploadsResult> listUploadsAsync(ListUploadsRequest listUploadsRequest,
            com.amazonaws.handlers.AsyncHandler<ListUploadsRequest, ListUploadsResult> asyncHandler);

    /**
     * <p>
     * Returns information about all Amazon Virtual Private Cloud (VPC) endpoint configurations in the AWS account.
     * </p>
     * 
     * @param listVPCEConfigurationsRequest
     * @return A Java Future containing the result of the ListVPCEConfigurations operation returned by the service.
     * @sample AWSDeviceFarmAsync.ListVPCEConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListVPCEConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVPCEConfigurationsResult> listVPCEConfigurationsAsync(ListVPCEConfigurationsRequest listVPCEConfigurationsRequest);

    /**
     * <p>
     * Returns information about all Amazon Virtual Private Cloud (VPC) endpoint configurations in the AWS account.
     * </p>
     * 
     * @param listVPCEConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVPCEConfigurations operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.ListVPCEConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListVPCEConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVPCEConfigurationsResult> listVPCEConfigurationsAsync(ListVPCEConfigurationsRequest listVPCEConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListVPCEConfigurationsRequest, ListVPCEConfigurationsResult> asyncHandler);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/PurchaseOffering" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/PurchaseOffering" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/RenewOffering" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/RenewOffering" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ScheduleRun" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ScheduleRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ScheduleRunResult> scheduleRunAsync(ScheduleRunRequest scheduleRunRequest,
            com.amazonaws.handlers.AsyncHandler<ScheduleRunRequest, ScheduleRunResult> asyncHandler);

    /**
     * <p>
     * Initiates a stop request for the current job. AWS Device Farm will immediately stop the job on the device where
     * tests have not started executing, and you will not be billed for this device. On the device where tests have
     * started executing, Setup Suite and Teardown Suite tests will run to completion before stopping execution on the
     * device. You will be billed for Setup, Teardown, and any tests that were in progress or already completed.
     * </p>
     * 
     * @param stopJobRequest
     * @return A Java Future containing the result of the StopJob operation returned by the service.
     * @sample AWSDeviceFarmAsync.StopJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/StopJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopJobResult> stopJobAsync(StopJobRequest stopJobRequest);

    /**
     * <p>
     * Initiates a stop request for the current job. AWS Device Farm will immediately stop the job on the device where
     * tests have not started executing, and you will not be billed for this device. On the device where tests have
     * started executing, Setup Suite and Teardown Suite tests will run to completion before stopping execution on the
     * device. You will be billed for Setup, Teardown, and any tests that were in progress or already completed.
     * </p>
     * 
     * @param stopJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopJob operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.StopJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/StopJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopJobResult> stopJobAsync(StopJobRequest stopJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopJobRequest, StopJobResult> asyncHandler);

    /**
     * <p>
     * Ends a specified remote access session.
     * </p>
     * 
     * @param stopRemoteAccessSessionRequest
     *        Represents the request to stop the remote access session.
     * @return A Java Future containing the result of the StopRemoteAccessSession operation returned by the service.
     * @sample AWSDeviceFarmAsync.StopRemoteAccessSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/StopRemoteAccessSession"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/StopRemoteAccessSession"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/StopRun" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/StopRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopRunResult> stopRunAsync(StopRunRequest stopRunRequest,
            com.amazonaws.handlers.AsyncHandler<StopRunRequest, StopRunResult> asyncHandler);

    /**
     * <p>
     * Updates information about an existing private device instance.
     * </p>
     * 
     * @param updateDeviceInstanceRequest
     * @return A Java Future containing the result of the UpdateDeviceInstance operation returned by the service.
     * @sample AWSDeviceFarmAsync.UpdateDeviceInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateDeviceInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDeviceInstanceResult> updateDeviceInstanceAsync(UpdateDeviceInstanceRequest updateDeviceInstanceRequest);

    /**
     * <p>
     * Updates information about an existing private device instance.
     * </p>
     * 
     * @param updateDeviceInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDeviceInstance operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.UpdateDeviceInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateDeviceInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDeviceInstanceResult> updateDeviceInstanceAsync(UpdateDeviceInstanceRequest updateDeviceInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDeviceInstanceRequest, UpdateDeviceInstanceResult> asyncHandler);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateDevicePool" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateDevicePool" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDevicePoolResult> updateDevicePoolAsync(UpdateDevicePoolRequest updateDevicePoolRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDevicePoolRequest, UpdateDevicePoolResult> asyncHandler);

    /**
     * <p>
     * Updates information about an existing private device instance profile.
     * </p>
     * 
     * @param updateInstanceProfileRequest
     * @return A Java Future containing the result of the UpdateInstanceProfile operation returned by the service.
     * @sample AWSDeviceFarmAsync.UpdateInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateInstanceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateInstanceProfileResult> updateInstanceProfileAsync(UpdateInstanceProfileRequest updateInstanceProfileRequest);

    /**
     * <p>
     * Updates information about an existing private device instance profile.
     * </p>
     * 
     * @param updateInstanceProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateInstanceProfile operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.UpdateInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateInstanceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateInstanceProfileResult> updateInstanceProfileAsync(UpdateInstanceProfileRequest updateInstanceProfileRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateInstanceProfileRequest, UpdateInstanceProfileResult> asyncHandler);

    /**
     * <p>
     * Updates the network profile with specific settings.
     * </p>
     * 
     * @param updateNetworkProfileRequest
     * @return A Java Future containing the result of the UpdateNetworkProfile operation returned by the service.
     * @sample AWSDeviceFarmAsync.UpdateNetworkProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateNetworkProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNetworkProfileResult> updateNetworkProfileAsync(UpdateNetworkProfileRequest updateNetworkProfileRequest);

    /**
     * <p>
     * Updates the network profile with specific settings.
     * </p>
     * 
     * @param updateNetworkProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateNetworkProfile operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.UpdateNetworkProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateNetworkProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNetworkProfileResult> updateNetworkProfileAsync(UpdateNetworkProfileRequest updateNetworkProfileRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateNetworkProfileRequest, UpdateNetworkProfileResult> asyncHandler);

    /**
     * <p>
     * Modifies the specified project name, given the project ARN and a new name.
     * </p>
     * 
     * @param updateProjectRequest
     *        Represents a request to the update project operation.
     * @return A Java Future containing the result of the UpdateProject operation returned by the service.
     * @sample AWSDeviceFarmAsync.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateProject" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest updateProjectRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProjectRequest, UpdateProjectResult> asyncHandler);

    /**
     * <p>
     * Update an uploaded test specification (test spec).
     * </p>
     * 
     * @param updateUploadRequest
     * @return A Java Future containing the result of the UpdateUpload operation returned by the service.
     * @sample AWSDeviceFarmAsync.UpdateUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateUpload" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUploadResult> updateUploadAsync(UpdateUploadRequest updateUploadRequest);

    /**
     * <p>
     * Update an uploaded test specification (test spec).
     * </p>
     * 
     * @param updateUploadRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUpload operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.UpdateUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateUpload" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUploadResult> updateUploadAsync(UpdateUploadRequest updateUploadRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUploadRequest, UpdateUploadResult> asyncHandler);

    /**
     * <p>
     * Updates information about an existing Amazon Virtual Private Cloud (VPC) endpoint configuration.
     * </p>
     * 
     * @param updateVPCEConfigurationRequest
     * @return A Java Future containing the result of the UpdateVPCEConfiguration operation returned by the service.
     * @sample AWSDeviceFarmAsync.UpdateVPCEConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateVPCEConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVPCEConfigurationResult> updateVPCEConfigurationAsync(UpdateVPCEConfigurationRequest updateVPCEConfigurationRequest);

    /**
     * <p>
     * Updates information about an existing Amazon Virtual Private Cloud (VPC) endpoint configuration.
     * </p>
     * 
     * @param updateVPCEConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateVPCEConfiguration operation returned by the service.
     * @sample AWSDeviceFarmAsyncHandler.UpdateVPCEConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateVPCEConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVPCEConfigurationResult> updateVPCEConfigurationAsync(UpdateVPCEConfigurationRequest updateVPCEConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVPCEConfigurationRequest, UpdateVPCEConfigurationResult> asyncHandler);

}
