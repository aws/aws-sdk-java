/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.devicefarm;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.devicefarm.model.*;

/**
 * Interface for accessing AWS Device Farm.
 * <p>
 * <p>
 * AWS Device Farm is a service that enables mobile app developers to test
 * Android, iOS, and Fire OS apps on physical phones, tablets, and other devices
 * in the cloud.
 * </p>
 */
public interface AWSDeviceFarm {

    /**
     * Overrides the default endpoint for this client
     * ("https://devicefarm.us-west-2.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "devicefarm.us-west-2.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://devicefarm.us-west-2.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "devicefarm.us-west-2.amazonaws.com") or a full
     *        URL, including the protocol (ex:
     *        "https://devicefarm.us-west-2.amazonaws.com") of the region
     *        specific AWS endpoint this client will communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSDeviceFarm#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See
     *        {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *        accessing a given region. Must not be null and must be a region
     *        where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
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
    CreateDevicePoolResult createDevicePool(
            CreateDevicePoolRequest createDevicePoolRequest);

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
     * Deletes a device pool given the pool ARN. Does not allow deletion of
     * curated pools owned by the system.
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
    DeleteDevicePoolResult deleteDevicePool(
            DeleteDevicePoolRequest deleteDevicePoolRequest);

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
     * Returns the number of unmetered iOS and/or unmetered Android devices that
     * have been purchased by the account.
     * </p>
     * 
     * @param getAccountSettingsRequest
     * @return Result of the GetAccountSettings operation returned by the
     *         service.
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
    GetAccountSettingsResult getAccountSettings(
            GetAccountSettingsRequest getAccountSettingsRequest);

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
     *        Represents a request to the get device pool compatibility
     *        operation.
     * @return Result of the GetDevicePoolCompatibility operation returned by
     *         the service.
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
    GetDevicePoolCompatibilityResult getDevicePoolCompatibility(
            GetDevicePoolCompatibilityRequest getDevicePoolCompatibilityRequest);

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
    ListDevicePoolsResult listDevicePools(
            ListDevicePoolsRequest listDevicePoolsRequest);

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
     * Gets information about runs.
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
     * Gets information about samples.
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
     * @return Result of the ListUniqueProblems operation returned by the
     *         service.
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
    ListUniqueProblemsResult listUniqueProblems(
            ListUniqueProblemsRequest listUniqueProblemsRequest);

    /**
     * <p>
     * Gets information about uploads.
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
     * Modifies the name, description, and rules in a device pool given the
     * attributes and the pool ARN. Rule updates are all-or-nothing, meaning
     * they can only be updated as a whole (or not at all).
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
    UpdateDevicePoolResult updateDevicePool(
            UpdateDevicePoolRequest updateDevicePoolRequest);

    /**
     * <p>
     * Modifies the specified project name, given the project ARN and a new
     * name.
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
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
