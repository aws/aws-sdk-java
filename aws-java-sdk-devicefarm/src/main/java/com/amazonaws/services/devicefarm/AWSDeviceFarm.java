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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.devicefarm.model.*;

/**
 * Interface for accessing AWS Device Farm.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.devicefarm.AbstractAWSDeviceFarm} instead.
 * </p>
 * <p>
 * <p>
 * AWS Device Farm is a service that enables mobile app developers to test Android, iOS, and Fire OS apps on physical
 * phones, tablets, and other devices in the cloud.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSDeviceFarm {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "devicefarm";

    /**
     * Overrides the default endpoint for this client ("https://devicefarm.us-west-2.amazonaws.com"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "devicefarm.us-west-2.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://devicefarm.us-west-2.amazonaws.com"). If the protocol is not specified here, the default
     * protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "devicefarm.us-west-2.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://devicefarm.us-west-2.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSDeviceFarm#setEndpoint(String)}, sets the regional endpoint for this client's service
     * calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Creates a device pool.
     * </p>
     * 
     * @param createDevicePoolRequest
     *        Represents a request to the create device pool operation.
     * @return Result of the CreateDevicePool operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.CreateDevicePool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateDevicePool" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDevicePoolResult createDevicePool(CreateDevicePoolRequest createDevicePoolRequest);

    /**
     * <p>
     * Creates a profile that can be applied to one or more private fleet device instances.
     * </p>
     * 
     * @param createInstanceProfileRequest
     * @return Result of the CreateInstanceProfile operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.CreateInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateInstanceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    CreateInstanceProfileResult createInstanceProfile(CreateInstanceProfileRequest createInstanceProfileRequest);

    /**
     * <p>
     * Creates a network profile.
     * </p>
     * 
     * @param createNetworkProfileRequest
     * @return Result of the CreateNetworkProfile operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.CreateNetworkProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateNetworkProfile"
     *      target="_top">AWS API Documentation</a>
     */
    CreateNetworkProfileResult createNetworkProfile(CreateNetworkProfileRequest createNetworkProfileRequest);

    /**
     * <p>
     * Creates a new project.
     * </p>
     * 
     * @param createProjectRequest
     *        Represents a request to the create project operation.
     * @return Result of the CreateProject operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    CreateProjectResult createProject(CreateProjectRequest createProjectRequest);

    /**
     * <p>
     * Specifies and starts a remote access session.
     * </p>
     * 
     * @param createRemoteAccessSessionRequest
     *        Creates and submits a request to start a remote access session.
     * @return Result of the CreateRemoteAccessSession operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.CreateRemoteAccessSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateRemoteAccessSession"
     *      target="_top">AWS API Documentation</a>
     */
    CreateRemoteAccessSessionResult createRemoteAccessSession(CreateRemoteAccessSessionRequest createRemoteAccessSessionRequest);

    /**
     * <p>
     * Uploads an app or test scripts.
     * </p>
     * 
     * @param createUploadRequest
     *        Represents a request to the create upload operation.
     * @return Result of the CreateUpload operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.CreateUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateUpload" target="_top">AWS API
     *      Documentation</a>
     */
    CreateUploadResult createUpload(CreateUploadRequest createUploadRequest);

    /**
     * <p>
     * Creates a configuration record in Device Farm for your Amazon Virtual Private Cloud (VPC) endpoint.
     * </p>
     * 
     * @param createVPCEConfigurationRequest
     * @return Result of the CreateVPCEConfiguration operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.CreateVPCEConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateVPCEConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateVPCEConfigurationResult createVPCEConfiguration(CreateVPCEConfigurationRequest createVPCEConfigurationRequest);

    /**
     * <p>
     * Deletes a device pool given the pool ARN. Does not allow deletion of curated pools owned by the system.
     * </p>
     * 
     * @param deleteDevicePoolRequest
     *        Represents a request to the delete device pool operation.
     * @return Result of the DeleteDevicePool operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.DeleteDevicePool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteDevicePool" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDevicePoolResult deleteDevicePool(DeleteDevicePoolRequest deleteDevicePoolRequest);

    /**
     * <p>
     * Deletes a profile that can be applied to one or more private device instances.
     * </p>
     * 
     * @param deleteInstanceProfileRequest
     * @return Result of the DeleteInstanceProfile operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.DeleteInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteInstanceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteInstanceProfileResult deleteInstanceProfile(DeleteInstanceProfileRequest deleteInstanceProfileRequest);

    /**
     * <p>
     * Deletes a network profile.
     * </p>
     * 
     * @param deleteNetworkProfileRequest
     * @return Result of the DeleteNetworkProfile operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.DeleteNetworkProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteNetworkProfile"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteNetworkProfileResult deleteNetworkProfile(DeleteNetworkProfileRequest deleteNetworkProfileRequest);

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
     * @return Result of the DeleteProject operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteProjectResult deleteProject(DeleteProjectRequest deleteProjectRequest);

    /**
     * <p>
     * Deletes a completed remote access session and its results.
     * </p>
     * 
     * @param deleteRemoteAccessSessionRequest
     *        Represents the request to delete the specified remote access session.
     * @return Result of the DeleteRemoteAccessSession operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.DeleteRemoteAccessSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteRemoteAccessSession"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteRemoteAccessSessionResult deleteRemoteAccessSession(DeleteRemoteAccessSessionRequest deleteRemoteAccessSessionRequest);

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
     * @return Result of the DeleteRun operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.DeleteRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteRun" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteRunResult deleteRun(DeleteRunRequest deleteRunRequest);

    /**
     * <p>
     * Deletes an upload given the upload ARN.
     * </p>
     * 
     * @param deleteUploadRequest
     *        Represents a request to the delete upload operation.
     * @return Result of the DeleteUpload operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.DeleteUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteUpload" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteUploadResult deleteUpload(DeleteUploadRequest deleteUploadRequest);

    /**
     * <p>
     * Deletes a configuration for your Amazon Virtual Private Cloud (VPC) endpoint.
     * </p>
     * 
     * @param deleteVPCEConfigurationRequest
     * @return Result of the DeleteVPCEConfiguration operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @throws InvalidOperationException
     *         There was an error with the update request, or you do not have sufficient permissions to update this VPC
     *         endpoint configuration.
     * @sample AWSDeviceFarm.DeleteVPCEConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteVPCEConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVPCEConfigurationResult deleteVPCEConfiguration(DeleteVPCEConfigurationRequest deleteVPCEConfigurationRequest);

    /**
     * <p>
     * Returns the number of unmetered iOS and/or unmetered Android devices that have been purchased by the account.
     * </p>
     * 
     * @param getAccountSettingsRequest
     *        Represents the request sent to retrieve the account settings.
     * @return Result of the GetAccountSettings operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetAccountSettings" target="_top">AWS
     *      API Documentation</a>
     */
    GetAccountSettingsResult getAccountSettings(GetAccountSettingsRequest getAccountSettingsRequest);

    /**
     * <p>
     * Gets information about a unique device type.
     * </p>
     * 
     * @param getDeviceRequest
     *        Represents a request to the get device request.
     * @return Result of the GetDevice operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetDevice" target="_top">AWS API
     *      Documentation</a>
     */
    GetDeviceResult getDevice(GetDeviceRequest getDeviceRequest);

    /**
     * <p>
     * Returns information about a device instance belonging to a private device fleet.
     * </p>
     * 
     * @param getDeviceInstanceRequest
     * @return Result of the GetDeviceInstance operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetDeviceInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetDeviceInstance" target="_top">AWS
     *      API Documentation</a>
     */
    GetDeviceInstanceResult getDeviceInstance(GetDeviceInstanceRequest getDeviceInstanceRequest);

    /**
     * <p>
     * Gets information about a device pool.
     * </p>
     * 
     * @param getDevicePoolRequest
     *        Represents a request to the get device pool operation.
     * @return Result of the GetDevicePool operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetDevicePool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetDevicePool" target="_top">AWS API
     *      Documentation</a>
     */
    GetDevicePoolResult getDevicePool(GetDevicePoolRequest getDevicePoolRequest);

    /**
     * <p>
     * Gets information about compatibility with a device pool.
     * </p>
     * 
     * @param getDevicePoolCompatibilityRequest
     *        Represents a request to the get device pool compatibility operation.
     * @return Result of the GetDevicePoolCompatibility operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetDevicePoolCompatibility
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetDevicePoolCompatibility"
     *      target="_top">AWS API Documentation</a>
     */
    GetDevicePoolCompatibilityResult getDevicePoolCompatibility(GetDevicePoolCompatibilityRequest getDevicePoolCompatibilityRequest);

    /**
     * <p>
     * Returns information about the specified instance profile.
     * </p>
     * 
     * @param getInstanceProfileRequest
     * @return Result of the GetInstanceProfile operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetInstanceProfile" target="_top">AWS
     *      API Documentation</a>
     */
    GetInstanceProfileResult getInstanceProfile(GetInstanceProfileRequest getInstanceProfileRequest);

    /**
     * <p>
     * Gets information about a job.
     * </p>
     * 
     * @param getJobRequest
     *        Represents a request to the get job operation.
     * @return Result of the GetJob operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetJob" target="_top">AWS API
     *      Documentation</a>
     */
    GetJobResult getJob(GetJobRequest getJobRequest);

    /**
     * <p>
     * Returns information about a network profile.
     * </p>
     * 
     * @param getNetworkProfileRequest
     * @return Result of the GetNetworkProfile operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetNetworkProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetNetworkProfile" target="_top">AWS
     *      API Documentation</a>
     */
    GetNetworkProfileResult getNetworkProfile(GetNetworkProfileRequest getNetworkProfileRequest);

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
     * @return Result of the GetOfferingStatus operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws NotEligibleException
     *         Exception gets thrown when a user is not eligible to perform the specified transaction.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetOfferingStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetOfferingStatus" target="_top">AWS
     *      API Documentation</a>
     */
    GetOfferingStatusResult getOfferingStatus(GetOfferingStatusRequest getOfferingStatusRequest);

    /**
     * <p>
     * Gets information about a project.
     * </p>
     * 
     * @param getProjectRequest
     *        Represents a request to the get project operation.
     * @return Result of the GetProject operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetProject" target="_top">AWS API
     *      Documentation</a>
     */
    GetProjectResult getProject(GetProjectRequest getProjectRequest);

    /**
     * <p>
     * Returns a link to a currently running remote access session.
     * </p>
     * 
     * @param getRemoteAccessSessionRequest
     *        Represents the request to get information about the specified remote access session.
     * @return Result of the GetRemoteAccessSession operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetRemoteAccessSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetRemoteAccessSession"
     *      target="_top">AWS API Documentation</a>
     */
    GetRemoteAccessSessionResult getRemoteAccessSession(GetRemoteAccessSessionRequest getRemoteAccessSessionRequest);

    /**
     * <p>
     * Gets information about a run.
     * </p>
     * 
     * @param getRunRequest
     *        Represents a request to the get run operation.
     * @return Result of the GetRun operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetRun" target="_top">AWS API
     *      Documentation</a>
     */
    GetRunResult getRun(GetRunRequest getRunRequest);

    /**
     * <p>
     * Gets information about a suite.
     * </p>
     * 
     * @param getSuiteRequest
     *        Represents a request to the get suite operation.
     * @return Result of the GetSuite operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetSuite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetSuite" target="_top">AWS API
     *      Documentation</a>
     */
    GetSuiteResult getSuite(GetSuiteRequest getSuiteRequest);

    /**
     * <p>
     * Gets information about a test.
     * </p>
     * 
     * @param getTestRequest
     *        Represents a request to the get test operation.
     * @return Result of the GetTest operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetTest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetTest" target="_top">AWS API
     *      Documentation</a>
     */
    GetTestResult getTest(GetTestRequest getTestRequest);

    /**
     * <p>
     * Gets information about an upload.
     * </p>
     * 
     * @param getUploadRequest
     *        Represents a request to the get upload operation.
     * @return Result of the GetUpload operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetUpload" target="_top">AWS API
     *      Documentation</a>
     */
    GetUploadResult getUpload(GetUploadRequest getUploadRequest);

    /**
     * <p>
     * Returns information about the configuration settings for your Amazon Virtual Private Cloud (VPC) endpoint.
     * </p>
     * 
     * @param getVPCEConfigurationRequest
     * @return Result of the GetVPCEConfiguration operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetVPCEConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetVPCEConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetVPCEConfigurationResult getVPCEConfiguration(GetVPCEConfigurationRequest getVPCEConfigurationRequest);

    /**
     * <p>
     * Installs an application to the device in a remote access session. For Android applications, the file must be in
     * .apk format. For iOS applications, the file must be in .ipa format.
     * </p>
     * 
     * @param installToRemoteAccessSessionRequest
     *        Represents the request to install an Android application (in .apk format) or an iOS application (in .ipa
     *        format) as part of a remote access session.
     * @return Result of the InstallToRemoteAccessSession operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.InstallToRemoteAccessSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/InstallToRemoteAccessSession"
     *      target="_top">AWS API Documentation</a>
     */
    InstallToRemoteAccessSessionResult installToRemoteAccessSession(InstallToRemoteAccessSessionRequest installToRemoteAccessSessionRequest);

    /**
     * <p>
     * Gets information about artifacts.
     * </p>
     * 
     * @param listArtifactsRequest
     *        Represents a request to the list artifacts operation.
     * @return Result of the ListArtifacts operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListArtifacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListArtifacts" target="_top">AWS API
     *      Documentation</a>
     */
    ListArtifactsResult listArtifacts(ListArtifactsRequest listArtifactsRequest);

    /**
     * <p>
     * Returns information about the private device instances associated with one or more AWS accounts.
     * </p>
     * 
     * @param listDeviceInstancesRequest
     * @return Result of the ListDeviceInstances operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListDeviceInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListDeviceInstances" target="_top">AWS
     *      API Documentation</a>
     */
    ListDeviceInstancesResult listDeviceInstances(ListDeviceInstancesRequest listDeviceInstancesRequest);

    /**
     * <p>
     * Gets information about device pools.
     * </p>
     * 
     * @param listDevicePoolsRequest
     *        Represents the result of a list device pools request.
     * @return Result of the ListDevicePools operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListDevicePools
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListDevicePools" target="_top">AWS API
     *      Documentation</a>
     */
    ListDevicePoolsResult listDevicePools(ListDevicePoolsRequest listDevicePoolsRequest);

    /**
     * <p>
     * Gets information about unique device types.
     * </p>
     * 
     * @param listDevicesRequest
     *        Represents the result of a list devices request.
     * @return Result of the ListDevices operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListDevices" target="_top">AWS API
     *      Documentation</a>
     */
    ListDevicesResult listDevices(ListDevicesRequest listDevicesRequest);

    /**
     * <p>
     * Returns information about all the instance profiles in an AWS account.
     * </p>
     * 
     * @param listInstanceProfilesRequest
     * @return Result of the ListInstanceProfiles operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListInstanceProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListInstanceProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    ListInstanceProfilesResult listInstanceProfiles(ListInstanceProfilesRequest listInstanceProfilesRequest);

    /**
     * <p>
     * Gets information about jobs for a given test run.
     * </p>
     * 
     * @param listJobsRequest
     *        Represents a request to the list jobs operation.
     * @return Result of the ListJobs operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    ListJobsResult listJobs(ListJobsRequest listJobsRequest);

    /**
     * <p>
     * Returns the list of available network profiles.
     * </p>
     * 
     * @param listNetworkProfilesRequest
     * @return Result of the ListNetworkProfiles operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListNetworkProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListNetworkProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    ListNetworkProfilesResult listNetworkProfiles(ListNetworkProfilesRequest listNetworkProfilesRequest);

    /**
     * <p>
     * Returns a list of offering promotions. Each offering promotion record contains the ID and description of the
     * promotion. The API returns a <code>NotEligible</code> error if the caller is not permitted to invoke the
     * operation. Contact <a href="mailto:aws-devicefarm-support@amazon.com">aws-devicefarm-support@amazon.com</a> if
     * you believe that you should be able to invoke this operation.
     * </p>
     * 
     * @param listOfferingPromotionsRequest
     * @return Result of the ListOfferingPromotions operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws NotEligibleException
     *         Exception gets thrown when a user is not eligible to perform the specified transaction.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListOfferingPromotions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListOfferingPromotions"
     *      target="_top">AWS API Documentation</a>
     */
    ListOfferingPromotionsResult listOfferingPromotions(ListOfferingPromotionsRequest listOfferingPromotionsRequest);

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
     * @return Result of the ListOfferingTransactions operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws NotEligibleException
     *         Exception gets thrown when a user is not eligible to perform the specified transaction.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListOfferingTransactions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListOfferingTransactions"
     *      target="_top">AWS API Documentation</a>
     */
    ListOfferingTransactionsResult listOfferingTransactions(ListOfferingTransactionsRequest listOfferingTransactionsRequest);

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
     * @return Result of the ListOfferings operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws NotEligibleException
     *         Exception gets thrown when a user is not eligible to perform the specified transaction.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListOfferings" target="_top">AWS API
     *      Documentation</a>
     */
    ListOfferingsResult listOfferings(ListOfferingsRequest listOfferingsRequest);

    /**
     * <p>
     * Gets information about projects.
     * </p>
     * 
     * @param listProjectsRequest
     *        Represents a request to the list projects operation.
     * @return Result of the ListProjects operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    ListProjectsResult listProjects(ListProjectsRequest listProjectsRequest);

    /**
     * <p>
     * Returns a list of all currently running remote access sessions.
     * </p>
     * 
     * @param listRemoteAccessSessionsRequest
     *        Represents the request to return information about the remote access session.
     * @return Result of the ListRemoteAccessSessions operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListRemoteAccessSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListRemoteAccessSessions"
     *      target="_top">AWS API Documentation</a>
     */
    ListRemoteAccessSessionsResult listRemoteAccessSessions(ListRemoteAccessSessionsRequest listRemoteAccessSessionsRequest);

    /**
     * <p>
     * Gets information about runs, given an AWS Device Farm project ARN.
     * </p>
     * 
     * @param listRunsRequest
     *        Represents a request to the list runs operation.
     * @return Result of the ListRuns operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListRuns" target="_top">AWS API
     *      Documentation</a>
     */
    ListRunsResult listRuns(ListRunsRequest listRunsRequest);

    /**
     * <p>
     * Gets information about samples, given an AWS Device Farm job ARN.
     * </p>
     * 
     * @param listSamplesRequest
     *        Represents a request to the list samples operation.
     * @return Result of the ListSamples operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListSamples
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListSamples" target="_top">AWS API
     *      Documentation</a>
     */
    ListSamplesResult listSamples(ListSamplesRequest listSamplesRequest);

    /**
     * <p>
     * Gets information about test suites for a given job.
     * </p>
     * 
     * @param listSuitesRequest
     *        Represents a request to the list suites operation.
     * @return Result of the ListSuites operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListSuites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListSuites" target="_top">AWS API
     *      Documentation</a>
     */
    ListSuitesResult listSuites(ListSuitesRequest listSuitesRequest);

    /**
     * <p>
     * Gets information about tests in a given test suite.
     * </p>
     * 
     * @param listTestsRequest
     *        Represents a request to the list tests operation.
     * @return Result of the ListTests operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListTests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListTests" target="_top">AWS API
     *      Documentation</a>
     */
    ListTestsResult listTests(ListTestsRequest listTestsRequest);

    /**
     * <p>
     * Gets information about unique problems.
     * </p>
     * 
     * @param listUniqueProblemsRequest
     *        Represents a request to the list unique problems operation.
     * @return Result of the ListUniqueProblems operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListUniqueProblems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListUniqueProblems" target="_top">AWS
     *      API Documentation</a>
     */
    ListUniqueProblemsResult listUniqueProblems(ListUniqueProblemsRequest listUniqueProblemsRequest);

    /**
     * <p>
     * Gets information about uploads, given an AWS Device Farm project ARN.
     * </p>
     * 
     * @param listUploadsRequest
     *        Represents a request to the list uploads operation.
     * @return Result of the ListUploads operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListUploads
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListUploads" target="_top">AWS API
     *      Documentation</a>
     */
    ListUploadsResult listUploads(ListUploadsRequest listUploadsRequest);

    /**
     * <p>
     * Returns information about all Amazon Virtual Private Cloud (VPC) endpoint configurations in the AWS account.
     * </p>
     * 
     * @param listVPCEConfigurationsRequest
     * @return Result of the ListVPCEConfigurations operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListVPCEConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListVPCEConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    ListVPCEConfigurationsResult listVPCEConfigurations(ListVPCEConfigurationsRequest listVPCEConfigurationsRequest);

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
     * @return Result of the PurchaseOffering operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws NotEligibleException
     *         Exception gets thrown when a user is not eligible to perform the specified transaction.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.PurchaseOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/PurchaseOffering" target="_top">AWS
     *      API Documentation</a>
     */
    PurchaseOfferingResult purchaseOffering(PurchaseOfferingRequest purchaseOfferingRequest);

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
     * @return Result of the RenewOffering operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws NotEligibleException
     *         Exception gets thrown when a user is not eligible to perform the specified transaction.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.RenewOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/RenewOffering" target="_top">AWS API
     *      Documentation</a>
     */
    RenewOfferingResult renewOffering(RenewOfferingRequest renewOfferingRequest);

    /**
     * <p>
     * Schedules a run.
     * </p>
     * 
     * @param scheduleRunRequest
     *        Represents a request to the schedule run operation.
     * @return Result of the ScheduleRun operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws IdempotencyException
     *         An entity with the same name already exists.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ScheduleRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ScheduleRun" target="_top">AWS API
     *      Documentation</a>
     */
    ScheduleRunResult scheduleRun(ScheduleRunRequest scheduleRunRequest);

    /**
     * <p>
     * Initiates a stop request for the current job. AWS Device Farm will immediately stop the job on the device where
     * tests have not started executing, and you will not be billed for this device. On the device where tests have
     * started executing, Setup Suite and Teardown Suite tests will run to completion before stopping execution on the
     * device. You will be billed for Setup, Teardown, and any tests that were in progress or already completed.
     * </p>
     * 
     * @param stopJobRequest
     * @return Result of the StopJob operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.StopJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/StopJob" target="_top">AWS API
     *      Documentation</a>
     */
    StopJobResult stopJob(StopJobRequest stopJobRequest);

    /**
     * <p>
     * Ends a specified remote access session.
     * </p>
     * 
     * @param stopRemoteAccessSessionRequest
     *        Represents the request to stop the remote access session.
     * @return Result of the StopRemoteAccessSession operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.StopRemoteAccessSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/StopRemoteAccessSession"
     *      target="_top">AWS API Documentation</a>
     */
    StopRemoteAccessSessionResult stopRemoteAccessSession(StopRemoteAccessSessionRequest stopRemoteAccessSessionRequest);

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
     * @return Result of the StopRun operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.StopRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/StopRun" target="_top">AWS API
     *      Documentation</a>
     */
    StopRunResult stopRun(StopRunRequest stopRunRequest);

    /**
     * <p>
     * Updates information about an existing private device instance.
     * </p>
     * 
     * @param updateDeviceInstanceRequest
     * @return Result of the UpdateDeviceInstance operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.UpdateDeviceInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateDeviceInstance"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDeviceInstanceResult updateDeviceInstance(UpdateDeviceInstanceRequest updateDeviceInstanceRequest);

    /**
     * <p>
     * Modifies the name, description, and rules in a device pool given the attributes and the pool ARN. Rule updates
     * are all-or-nothing, meaning they can only be updated as a whole (or not at all).
     * </p>
     * 
     * @param updateDevicePoolRequest
     *        Represents a request to the update device pool operation.
     * @return Result of the UpdateDevicePool operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.UpdateDevicePool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateDevicePool" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateDevicePoolResult updateDevicePool(UpdateDevicePoolRequest updateDevicePoolRequest);

    /**
     * <p>
     * Updates information about an existing private device instance profile.
     * </p>
     * 
     * @param updateInstanceProfileRequest
     * @return Result of the UpdateInstanceProfile operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.UpdateInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateInstanceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateInstanceProfileResult updateInstanceProfile(UpdateInstanceProfileRequest updateInstanceProfileRequest);

    /**
     * <p>
     * Updates the network profile with specific settings.
     * </p>
     * 
     * @param updateNetworkProfileRequest
     * @return Result of the UpdateNetworkProfile operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.UpdateNetworkProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateNetworkProfile"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateNetworkProfileResult updateNetworkProfile(UpdateNetworkProfileRequest updateNetworkProfileRequest);

    /**
     * <p>
     * Modifies the specified project name, given the project ARN and a new name.
     * </p>
     * 
     * @param updateProjectRequest
     *        Represents a request to the update project operation.
     * @return Result of the UpdateProject operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateProjectResult updateProject(UpdateProjectRequest updateProjectRequest);

    /**
     * <p>
     * Update an uploaded test specification (test spec).
     * </p>
     * 
     * @param updateUploadRequest
     * @return Result of the UpdateUpload operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.UpdateUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateUpload" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateUploadResult updateUpload(UpdateUploadRequest updateUploadRequest);

    /**
     * <p>
     * Updates information about an existing Amazon Virtual Private Cloud (VPC) endpoint configuration.
     * </p>
     * 
     * @param updateVPCEConfigurationRequest
     * @return Result of the UpdateVPCEConfiguration operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @throws InvalidOperationException
     *         There was an error with the update request, or you do not have sufficient permissions to update this VPC
     *         endpoint configuration.
     * @sample AWSDeviceFarm.UpdateVPCEConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateVPCEConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateVPCEConfigurationResult updateVPCEConfiguration(UpdateVPCEConfigurationRequest updateVPCEConfigurationRequest);

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
