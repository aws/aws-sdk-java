/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.devicefarm.model.*;

/**
 * Interface for accessing AWS Device Farm asynchronously. Each asynchronous
 * method will return a Java Future object representing the asynchronous
 * operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS Device Farm is a service that enables mobile app developers to test
 * Android, iOS, and Fire OS apps on physical phones, tablets, and other devices
 * in the cloud.
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
     * @return A Java Future containing the result of the CreateDevicePool
     *         operation returned by the service.
     */
    java.util.concurrent.Future<CreateDevicePoolResult> createDevicePoolAsync(
            CreateDevicePoolRequest createDevicePoolRequest);

    /**
     * <p>
     * Creates a device pool.
     * </p>
     * 
     * @param createDevicePoolRequest
     *        Represents a request to the create device pool operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDevicePool
     *         operation returned by the service.
     */
    java.util.concurrent.Future<CreateDevicePoolResult> createDevicePoolAsync(
            CreateDevicePoolRequest createDevicePoolRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDevicePoolRequest, CreateDevicePoolResult> asyncHandler);

    /**
     * <p>
     * Creates a new project.
     * </p>
     * 
     * @param createProjectRequest
     *        Represents a request to the create project operation.
     * @return A Java Future containing the result of the CreateProject
     *         operation returned by the service.
     */
    java.util.concurrent.Future<CreateProjectResult> createProjectAsync(
            CreateProjectRequest createProjectRequest);

    /**
     * <p>
     * Creates a new project.
     * </p>
     * 
     * @param createProjectRequest
     *        Represents a request to the create project operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProject
     *         operation returned by the service.
     */
    java.util.concurrent.Future<CreateProjectResult> createProjectAsync(
            CreateProjectRequest createProjectRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProjectRequest, CreateProjectResult> asyncHandler);

    /**
     * <p>
     * Uploads an app or test scripts.
     * </p>
     * 
     * @param createUploadRequest
     *        Represents a request to the create upload operation.
     * @return A Java Future containing the result of the CreateUpload operation
     *         returned by the service.
     */
    java.util.concurrent.Future<CreateUploadResult> createUploadAsync(
            CreateUploadRequest createUploadRequest);

    /**
     * <p>
     * Uploads an app or test scripts.
     * </p>
     * 
     * @param createUploadRequest
     *        Represents a request to the create upload operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUpload operation
     *         returned by the service.
     */
    java.util.concurrent.Future<CreateUploadResult> createUploadAsync(
            CreateUploadRequest createUploadRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUploadRequest, CreateUploadResult> asyncHandler);

    /**
     * <p>
     * Returns the number of unmetered iOS and/or unmetered Android devices that
     * have been purchased by the account.
     * </p>
     * 
     * @param getAccountSettingsRequest
     *        null
     * @return A Java Future containing the result of the GetAccountSettings
     *         operation returned by the service.
     */
    java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(
            GetAccountSettingsRequest getAccountSettingsRequest);

    /**
     * <p>
     * Returns the number of unmetered iOS and/or unmetered Android devices that
     * have been purchased by the account.
     * </p>
     * 
     * @param getAccountSettingsRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccountSettings
     *         operation returned by the service.
     */
    java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(
            GetAccountSettingsRequest getAccountSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccountSettingsRequest, GetAccountSettingsResult> asyncHandler);

    /**
     * <p>
     * Gets information about a unique device type.
     * </p>
     * 
     * @param getDeviceRequest
     *        Represents a request to the get device request.
     * @return A Java Future containing the result of the GetDevice operation
     *         returned by the service.
     */
    java.util.concurrent.Future<GetDeviceResult> getDeviceAsync(
            GetDeviceRequest getDeviceRequest);

    /**
     * <p>
     * Gets information about a unique device type.
     * </p>
     * 
     * @param getDeviceRequest
     *        Represents a request to the get device request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDevice operation
     *         returned by the service.
     */
    java.util.concurrent.Future<GetDeviceResult> getDeviceAsync(
            GetDeviceRequest getDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeviceRequest, GetDeviceResult> asyncHandler);

    /**
     * <p>
     * Gets information about a device pool.
     * </p>
     * 
     * @param getDevicePoolRequest
     *        Represents a request to the get device pool operation.
     * @return A Java Future containing the result of the GetDevicePool
     *         operation returned by the service.
     */
    java.util.concurrent.Future<GetDevicePoolResult> getDevicePoolAsync(
            GetDevicePoolRequest getDevicePoolRequest);

    /**
     * <p>
     * Gets information about a device pool.
     * </p>
     * 
     * @param getDevicePoolRequest
     *        Represents a request to the get device pool operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDevicePool
     *         operation returned by the service.
     */
    java.util.concurrent.Future<GetDevicePoolResult> getDevicePoolAsync(
            GetDevicePoolRequest getDevicePoolRequest,
            com.amazonaws.handlers.AsyncHandler<GetDevicePoolRequest, GetDevicePoolResult> asyncHandler);

    /**
     * <p>
     * Gets information about compatibility with a device pool.
     * </p>
     * 
     * @param getDevicePoolCompatibilityRequest
     *        Represents a request to the get device pool compatibility
     *        operation.
     * @return A Java Future containing the result of the
     *         GetDevicePoolCompatibility operation returned by the service.
     */
    java.util.concurrent.Future<GetDevicePoolCompatibilityResult> getDevicePoolCompatibilityAsync(
            GetDevicePoolCompatibilityRequest getDevicePoolCompatibilityRequest);

    /**
     * <p>
     * Gets information about compatibility with a device pool.
     * </p>
     * 
     * @param getDevicePoolCompatibilityRequest
     *        Represents a request to the get device pool compatibility
     *        operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         GetDevicePoolCompatibility operation returned by the service.
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
     * @return A Java Future containing the result of the GetJob operation
     *         returned by the service.
     */
    java.util.concurrent.Future<GetJobResult> getJobAsync(
            GetJobRequest getJobRequest);

    /**
     * <p>
     * Gets information about a job.
     * </p>
     * 
     * @param getJobRequest
     *        Represents a request to the get job operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetJob operation
     *         returned by the service.
     */
    java.util.concurrent.Future<GetJobResult> getJobAsync(
            GetJobRequest getJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetJobRequest, GetJobResult> asyncHandler);

    /**
     * <p>
     * Gets information about a project.
     * </p>
     * 
     * @param getProjectRequest
     *        Represents a request to the get project operation.
     * @return A Java Future containing the result of the GetProject operation
     *         returned by the service.
     */
    java.util.concurrent.Future<GetProjectResult> getProjectAsync(
            GetProjectRequest getProjectRequest);

    /**
     * <p>
     * Gets information about a project.
     * </p>
     * 
     * @param getProjectRequest
     *        Represents a request to the get project operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetProject operation
     *         returned by the service.
     */
    java.util.concurrent.Future<GetProjectResult> getProjectAsync(
            GetProjectRequest getProjectRequest,
            com.amazonaws.handlers.AsyncHandler<GetProjectRequest, GetProjectResult> asyncHandler);

    /**
     * <p>
     * Gets information about a run.
     * </p>
     * 
     * @param getRunRequest
     *        Represents a request to the get run operation.
     * @return A Java Future containing the result of the GetRun operation
     *         returned by the service.
     */
    java.util.concurrent.Future<GetRunResult> getRunAsync(
            GetRunRequest getRunRequest);

    /**
     * <p>
     * Gets information about a run.
     * </p>
     * 
     * @param getRunRequest
     *        Represents a request to the get run operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRun operation
     *         returned by the service.
     */
    java.util.concurrent.Future<GetRunResult> getRunAsync(
            GetRunRequest getRunRequest,
            com.amazonaws.handlers.AsyncHandler<GetRunRequest, GetRunResult> asyncHandler);

    /**
     * <p>
     * Gets information about a suite.
     * </p>
     * 
     * @param getSuiteRequest
     *        Represents a request to the get suite operation.
     * @return A Java Future containing the result of the GetSuite operation
     *         returned by the service.
     */
    java.util.concurrent.Future<GetSuiteResult> getSuiteAsync(
            GetSuiteRequest getSuiteRequest);

    /**
     * <p>
     * Gets information about a suite.
     * </p>
     * 
     * @param getSuiteRequest
     *        Represents a request to the get suite operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSuite operation
     *         returned by the service.
     */
    java.util.concurrent.Future<GetSuiteResult> getSuiteAsync(
            GetSuiteRequest getSuiteRequest,
            com.amazonaws.handlers.AsyncHandler<GetSuiteRequest, GetSuiteResult> asyncHandler);

    /**
     * <p>
     * Gets information about a test.
     * </p>
     * 
     * @param getTestRequest
     *        Represents a request to the get test operation.
     * @return A Java Future containing the result of the GetTest operation
     *         returned by the service.
     */
    java.util.concurrent.Future<GetTestResult> getTestAsync(
            GetTestRequest getTestRequest);

    /**
     * <p>
     * Gets information about a test.
     * </p>
     * 
     * @param getTestRequest
     *        Represents a request to the get test operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTest operation
     *         returned by the service.
     */
    java.util.concurrent.Future<GetTestResult> getTestAsync(
            GetTestRequest getTestRequest,
            com.amazonaws.handlers.AsyncHandler<GetTestRequest, GetTestResult> asyncHandler);

    /**
     * <p>
     * Gets information about an upload.
     * </p>
     * 
     * @param getUploadRequest
     *        Represents a request to the get upload operation.
     * @return A Java Future containing the result of the GetUpload operation
     *         returned by the service.
     */
    java.util.concurrent.Future<GetUploadResult> getUploadAsync(
            GetUploadRequest getUploadRequest);

    /**
     * <p>
     * Gets information about an upload.
     * </p>
     * 
     * @param getUploadRequest
     *        Represents a request to the get upload operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUpload operation
     *         returned by the service.
     */
    java.util.concurrent.Future<GetUploadResult> getUploadAsync(
            GetUploadRequest getUploadRequest,
            com.amazonaws.handlers.AsyncHandler<GetUploadRequest, GetUploadResult> asyncHandler);

    /**
     * <p>
     * Gets information about artifacts.
     * </p>
     * 
     * @param listArtifactsRequest
     *        Represents a request to the list artifacts operation.
     * @return A Java Future containing the result of the ListArtifacts
     *         operation returned by the service.
     */
    java.util.concurrent.Future<ListArtifactsResult> listArtifactsAsync(
            ListArtifactsRequest listArtifactsRequest);

    /**
     * <p>
     * Gets information about artifacts.
     * </p>
     * 
     * @param listArtifactsRequest
     *        Represents a request to the list artifacts operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListArtifacts
     *         operation returned by the service.
     */
    java.util.concurrent.Future<ListArtifactsResult> listArtifactsAsync(
            ListArtifactsRequest listArtifactsRequest,
            com.amazonaws.handlers.AsyncHandler<ListArtifactsRequest, ListArtifactsResult> asyncHandler);

    /**
     * <p>
     * Gets information about device pools.
     * </p>
     * 
     * @param listDevicePoolsRequest
     *        Represents the result of a list device pools request.
     * @return A Java Future containing the result of the ListDevicePools
     *         operation returned by the service.
     */
    java.util.concurrent.Future<ListDevicePoolsResult> listDevicePoolsAsync(
            ListDevicePoolsRequest listDevicePoolsRequest);

    /**
     * <p>
     * Gets information about device pools.
     * </p>
     * 
     * @param listDevicePoolsRequest
     *        Represents the result of a list device pools request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDevicePools
     *         operation returned by the service.
     */
    java.util.concurrent.Future<ListDevicePoolsResult> listDevicePoolsAsync(
            ListDevicePoolsRequest listDevicePoolsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDevicePoolsRequest, ListDevicePoolsResult> asyncHandler);

    /**
     * <p>
     * Gets information about unique device types.
     * </p>
     * 
     * @param listDevicesRequest
     *        Represents the result of a list devices request.
     * @return A Java Future containing the result of the ListDevices operation
     *         returned by the service.
     */
    java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(
            ListDevicesRequest listDevicesRequest);

    /**
     * <p>
     * Gets information about unique device types.
     * </p>
     * 
     * @param listDevicesRequest
     *        Represents the result of a list devices request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDevices operation
     *         returned by the service.
     */
    java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(
            ListDevicesRequest listDevicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDevicesRequest, ListDevicesResult> asyncHandler);

    /**
     * <p>
     * Gets information about jobs.
     * </p>
     * 
     * @param listJobsRequest
     *        Represents a request to the list jobs operation.
     * @return A Java Future containing the result of the ListJobs operation
     *         returned by the service.
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(
            ListJobsRequest listJobsRequest);

    /**
     * <p>
     * Gets information about jobs.
     * </p>
     * 
     * @param listJobsRequest
     *        Represents a request to the list jobs operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListJobs operation
     *         returned by the service.
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(
            ListJobsRequest listJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler);

    /**
     * <p>
     * Gets information about projects.
     * </p>
     * 
     * @param listProjectsRequest
     *        Represents a request to the list projects operation.
     * @return A Java Future containing the result of the ListProjects operation
     *         returned by the service.
     */
    java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(
            ListProjectsRequest listProjectsRequest);

    /**
     * <p>
     * Gets information about projects.
     * </p>
     * 
     * @param listProjectsRequest
     *        Represents a request to the list projects operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProjects operation
     *         returned by the service.
     */
    java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(
            ListProjectsRequest listProjectsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProjectsRequest, ListProjectsResult> asyncHandler);

    /**
     * <p>
     * Gets information about runs.
     * </p>
     * 
     * @param listRunsRequest
     *        Represents a request to the list runs operation.
     * @return A Java Future containing the result of the ListRuns operation
     *         returned by the service.
     */
    java.util.concurrent.Future<ListRunsResult> listRunsAsync(
            ListRunsRequest listRunsRequest);

    /**
     * <p>
     * Gets information about runs.
     * </p>
     * 
     * @param listRunsRequest
     *        Represents a request to the list runs operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRuns operation
     *         returned by the service.
     */
    java.util.concurrent.Future<ListRunsResult> listRunsAsync(
            ListRunsRequest listRunsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRunsRequest, ListRunsResult> asyncHandler);

    /**
     * <p>
     * Gets information about samples.
     * </p>
     * 
     * @param listSamplesRequest
     *        Represents a request to the list samples operation.
     * @return A Java Future containing the result of the ListSamples operation
     *         returned by the service.
     */
    java.util.concurrent.Future<ListSamplesResult> listSamplesAsync(
            ListSamplesRequest listSamplesRequest);

    /**
     * <p>
     * Gets information about samples.
     * </p>
     * 
     * @param listSamplesRequest
     *        Represents a request to the list samples operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSamples operation
     *         returned by the service.
     */
    java.util.concurrent.Future<ListSamplesResult> listSamplesAsync(
            ListSamplesRequest listSamplesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSamplesRequest, ListSamplesResult> asyncHandler);

    /**
     * <p>
     * Gets information about suites.
     * </p>
     * 
     * @param listSuitesRequest
     *        Represents a request to the list suites operation.
     * @return A Java Future containing the result of the ListSuites operation
     *         returned by the service.
     */
    java.util.concurrent.Future<ListSuitesResult> listSuitesAsync(
            ListSuitesRequest listSuitesRequest);

    /**
     * <p>
     * Gets information about suites.
     * </p>
     * 
     * @param listSuitesRequest
     *        Represents a request to the list suites operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSuites operation
     *         returned by the service.
     */
    java.util.concurrent.Future<ListSuitesResult> listSuitesAsync(
            ListSuitesRequest listSuitesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSuitesRequest, ListSuitesResult> asyncHandler);

    /**
     * <p>
     * Gets information about tests.
     * </p>
     * 
     * @param listTestsRequest
     *        Represents a request to the list tests operation.
     * @return A Java Future containing the result of the ListTests operation
     *         returned by the service.
     */
    java.util.concurrent.Future<ListTestsResult> listTestsAsync(
            ListTestsRequest listTestsRequest);

    /**
     * <p>
     * Gets information about tests.
     * </p>
     * 
     * @param listTestsRequest
     *        Represents a request to the list tests operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTests operation
     *         returned by the service.
     */
    java.util.concurrent.Future<ListTestsResult> listTestsAsync(
            ListTestsRequest listTestsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTestsRequest, ListTestsResult> asyncHandler);

    /**
     * <p>
     * Gets information about unique problems.
     * </p>
     * 
     * @param listUniqueProblemsRequest
     *        Represents a request to the list unique problems operation.
     * @return A Java Future containing the result of the ListUniqueProblems
     *         operation returned by the service.
     */
    java.util.concurrent.Future<ListUniqueProblemsResult> listUniqueProblemsAsync(
            ListUniqueProblemsRequest listUniqueProblemsRequest);

    /**
     * <p>
     * Gets information about unique problems.
     * </p>
     * 
     * @param listUniqueProblemsRequest
     *        Represents a request to the list unique problems operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUniqueProblems
     *         operation returned by the service.
     */
    java.util.concurrent.Future<ListUniqueProblemsResult> listUniqueProblemsAsync(
            ListUniqueProblemsRequest listUniqueProblemsRequest,
            com.amazonaws.handlers.AsyncHandler<ListUniqueProblemsRequest, ListUniqueProblemsResult> asyncHandler);

    /**
     * <p>
     * Gets information about uploads.
     * </p>
     * 
     * @param listUploadsRequest
     *        Represents a request to the list uploads operation.
     * @return A Java Future containing the result of the ListUploads operation
     *         returned by the service.
     */
    java.util.concurrent.Future<ListUploadsResult> listUploadsAsync(
            ListUploadsRequest listUploadsRequest);

    /**
     * <p>
     * Gets information about uploads.
     * </p>
     * 
     * @param listUploadsRequest
     *        Represents a request to the list uploads operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUploads operation
     *         returned by the service.
     */
    java.util.concurrent.Future<ListUploadsResult> listUploadsAsync(
            ListUploadsRequest listUploadsRequest,
            com.amazonaws.handlers.AsyncHandler<ListUploadsRequest, ListUploadsResult> asyncHandler);

    /**
     * <p>
     * Schedules a run.
     * </p>
     * 
     * @param scheduleRunRequest
     *        Represents a request to the schedule run operation.
     * @return A Java Future containing the result of the ScheduleRun operation
     *         returned by the service.
     */
    java.util.concurrent.Future<ScheduleRunResult> scheduleRunAsync(
            ScheduleRunRequest scheduleRunRequest);

    /**
     * <p>
     * Schedules a run.
     * </p>
     * 
     * @param scheduleRunRequest
     *        Represents a request to the schedule run operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ScheduleRun operation
     *         returned by the service.
     */
    java.util.concurrent.Future<ScheduleRunResult> scheduleRunAsync(
            ScheduleRunRequest scheduleRunRequest,
            com.amazonaws.handlers.AsyncHandler<ScheduleRunRequest, ScheduleRunResult> asyncHandler);

}
