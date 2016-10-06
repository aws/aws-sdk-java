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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.devicefarm.model.*;

/**
 * Interface for accessing AWS Device Farm.
 * <p>
 * <p>
 * AWS Device Farm is a service that enables mobile app developers to test Android, iOS, and Fire OS apps on physical
 * phones, tablets, and other devices in the cloud.
 * </p>
 */
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
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "devicefarm.us-west-2.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://devicefarm.us-west-2.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     */
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
     */
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
     */
    CreateDevicePoolResult createDevicePool(CreateDevicePoolRequest createDevicePoolRequest);

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
     */
    CreateUploadResult createUpload(CreateUploadRequest createUploadRequest);

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
     */
    DeleteDevicePoolResult deleteDevicePool(DeleteDevicePoolRequest deleteDevicePoolRequest);

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
     */
    DeleteUploadResult deleteUpload(DeleteUploadRequest deleteUploadRequest);

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
     */
    GetDeviceResult getDevice(GetDeviceRequest getDeviceRequest);

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
     */
    GetDevicePoolCompatibilityResult getDevicePoolCompatibility(GetDevicePoolCompatibilityRequest getDevicePoolCompatibilityRequest);

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
     */
    GetJobResult getJob(GetJobRequest getJobRequest);

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
     */
    GetUploadResult getUpload(GetUploadRequest getUploadRequest);

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
     */
    ListArtifactsResult listArtifacts(ListArtifactsRequest listArtifactsRequest);

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
     */
    ListDevicesResult listDevices(ListDevicesRequest listDevicesRequest);

    /**
     * <p>
     * Gets information about jobs.
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
     */
    ListJobsResult listJobs(ListJobsRequest listJobsRequest);

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
     */
    ListRunsResult listRuns(ListRunsRequest listRunsRequest);

    /**
     * <p>
     * Gets information about samples, given an AWS Device Farm project ARN
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
     */
    ListSamplesResult listSamples(ListSamplesRequest listSamplesRequest);

    /**
     * <p>
     * Gets information about suites.
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
     */
    ListSuitesResult listSuites(ListSuitesRequest listSuitesRequest);

    /**
     * <p>
     * Gets information about tests.
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
     */
    ListUploadsResult listUploads(ListUploadsRequest listUploadsRequest);

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
     */
    ScheduleRunResult scheduleRun(ScheduleRunRequest scheduleRunRequest);

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
     */
    StopRunResult stopRun(StopRunRequest stopRunRequest);

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
     */
    UpdateDevicePoolResult updateDevicePool(UpdateDevicePoolRequest updateDevicePoolRequest);

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
     */
    UpdateProjectResult updateProject(UpdateProjectRequest updateProjectRequest);

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
