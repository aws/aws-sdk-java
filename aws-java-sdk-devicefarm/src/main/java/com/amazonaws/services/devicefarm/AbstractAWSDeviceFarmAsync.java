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
 * Abstract implementation of {@code AWSDeviceFarmAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
public class AbstractAWSDeviceFarmAsync extends AbstractAWSDeviceFarm implements AWSDeviceFarmAsync {

    protected AbstractAWSDeviceFarmAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateDevicePoolResult> createDevicePoolAsync(CreateDevicePoolRequest request) {

        return createDevicePoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDevicePoolResult> createDevicePoolAsync(CreateDevicePoolRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDevicePoolRequest, CreateDevicePoolResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest request) {

        return createProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateProjectRequest, CreateProjectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateRemoteAccessSessionResult> createRemoteAccessSessionAsync(CreateRemoteAccessSessionRequest request) {

        return createRemoteAccessSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRemoteAccessSessionResult> createRemoteAccessSessionAsync(CreateRemoteAccessSessionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateRemoteAccessSessionRequest, CreateRemoteAccessSessionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateUploadResult> createUploadAsync(CreateUploadRequest request) {

        return createUploadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUploadResult> createUploadAsync(CreateUploadRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateUploadRequest, CreateUploadResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDevicePoolResult> deleteDevicePoolAsync(DeleteDevicePoolRequest request) {

        return deleteDevicePoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDevicePoolResult> deleteDevicePoolAsync(DeleteDevicePoolRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDevicePoolRequest, DeleteDevicePoolResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest request) {

        return deleteProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteProjectRequest, DeleteProjectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRemoteAccessSessionResult> deleteRemoteAccessSessionAsync(DeleteRemoteAccessSessionRequest request) {

        return deleteRemoteAccessSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRemoteAccessSessionResult> deleteRemoteAccessSessionAsync(DeleteRemoteAccessSessionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRemoteAccessSessionRequest, DeleteRemoteAccessSessionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRunResult> deleteRunAsync(DeleteRunRequest request) {

        return deleteRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRunResult> deleteRunAsync(DeleteRunRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRunRequest, DeleteRunResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteUploadResult> deleteUploadAsync(DeleteUploadRequest request) {

        return deleteUploadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUploadResult> deleteUploadAsync(DeleteUploadRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteUploadRequest, DeleteUploadResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(GetAccountSettingsRequest request) {

        return getAccountSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(GetAccountSettingsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAccountSettingsRequest, GetAccountSettingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDeviceResult> getDeviceAsync(GetDeviceRequest request) {

        return getDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeviceResult> getDeviceAsync(GetDeviceRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDeviceRequest, GetDeviceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDevicePoolResult> getDevicePoolAsync(GetDevicePoolRequest request) {

        return getDevicePoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDevicePoolResult> getDevicePoolAsync(GetDevicePoolRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDevicePoolRequest, GetDevicePoolResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDevicePoolCompatibilityResult> getDevicePoolCompatibilityAsync(GetDevicePoolCompatibilityRequest request) {

        return getDevicePoolCompatibilityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDevicePoolCompatibilityResult> getDevicePoolCompatibilityAsync(GetDevicePoolCompatibilityRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDevicePoolCompatibilityRequest, GetDevicePoolCompatibilityResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetJobResult> getJobAsync(GetJobRequest request) {

        return getJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetJobResult> getJobAsync(GetJobRequest request,
            com.amazonaws.handlers.AsyncHandler<GetJobRequest, GetJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetOfferingStatusResult> getOfferingStatusAsync(GetOfferingStatusRequest request) {

        return getOfferingStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOfferingStatusResult> getOfferingStatusAsync(GetOfferingStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<GetOfferingStatusRequest, GetOfferingStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetProjectResult> getProjectAsync(GetProjectRequest request) {

        return getProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProjectResult> getProjectAsync(GetProjectRequest request,
            com.amazonaws.handlers.AsyncHandler<GetProjectRequest, GetProjectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRemoteAccessSessionResult> getRemoteAccessSessionAsync(GetRemoteAccessSessionRequest request) {

        return getRemoteAccessSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRemoteAccessSessionResult> getRemoteAccessSessionAsync(GetRemoteAccessSessionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRemoteAccessSessionRequest, GetRemoteAccessSessionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRunResult> getRunAsync(GetRunRequest request) {

        return getRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRunResult> getRunAsync(GetRunRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRunRequest, GetRunResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSuiteResult> getSuiteAsync(GetSuiteRequest request) {

        return getSuiteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSuiteResult> getSuiteAsync(GetSuiteRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSuiteRequest, GetSuiteResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTestResult> getTestAsync(GetTestRequest request) {

        return getTestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTestResult> getTestAsync(GetTestRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTestRequest, GetTestResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetUploadResult> getUploadAsync(GetUploadRequest request) {

        return getUploadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUploadResult> getUploadAsync(GetUploadRequest request,
            com.amazonaws.handlers.AsyncHandler<GetUploadRequest, GetUploadResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<InstallToRemoteAccessSessionResult> installToRemoteAccessSessionAsync(InstallToRemoteAccessSessionRequest request) {

        return installToRemoteAccessSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InstallToRemoteAccessSessionResult> installToRemoteAccessSessionAsync(InstallToRemoteAccessSessionRequest request,
            com.amazonaws.handlers.AsyncHandler<InstallToRemoteAccessSessionRequest, InstallToRemoteAccessSessionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListArtifactsResult> listArtifactsAsync(ListArtifactsRequest request) {

        return listArtifactsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListArtifactsResult> listArtifactsAsync(ListArtifactsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListArtifactsRequest, ListArtifactsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDevicePoolsResult> listDevicePoolsAsync(ListDevicePoolsRequest request) {

        return listDevicePoolsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDevicePoolsResult> listDevicePoolsAsync(ListDevicePoolsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDevicePoolsRequest, ListDevicePoolsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(ListDevicesRequest request) {

        return listDevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(ListDevicesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDevicesRequest, ListDevicesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest request) {

        return listJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListOfferingTransactionsResult> listOfferingTransactionsAsync(ListOfferingTransactionsRequest request) {

        return listOfferingTransactionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOfferingTransactionsResult> listOfferingTransactionsAsync(ListOfferingTransactionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListOfferingTransactionsRequest, ListOfferingTransactionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListOfferingsResult> listOfferingsAsync(ListOfferingsRequest request) {

        return listOfferingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOfferingsResult> listOfferingsAsync(ListOfferingsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListOfferingsRequest, ListOfferingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest request) {

        return listProjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListProjectsRequest, ListProjectsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRemoteAccessSessionsResult> listRemoteAccessSessionsAsync(ListRemoteAccessSessionsRequest request) {

        return listRemoteAccessSessionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRemoteAccessSessionsResult> listRemoteAccessSessionsAsync(ListRemoteAccessSessionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRemoteAccessSessionsRequest, ListRemoteAccessSessionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRunsResult> listRunsAsync(ListRunsRequest request) {

        return listRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRunsResult> listRunsAsync(ListRunsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRunsRequest, ListRunsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSamplesResult> listSamplesAsync(ListSamplesRequest request) {

        return listSamplesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSamplesResult> listSamplesAsync(ListSamplesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSamplesRequest, ListSamplesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSuitesResult> listSuitesAsync(ListSuitesRequest request) {

        return listSuitesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSuitesResult> listSuitesAsync(ListSuitesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSuitesRequest, ListSuitesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTestsResult> listTestsAsync(ListTestsRequest request) {

        return listTestsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTestsResult> listTestsAsync(ListTestsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTestsRequest, ListTestsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListUniqueProblemsResult> listUniqueProblemsAsync(ListUniqueProblemsRequest request) {

        return listUniqueProblemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUniqueProblemsResult> listUniqueProblemsAsync(ListUniqueProblemsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListUniqueProblemsRequest, ListUniqueProblemsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListUploadsResult> listUploadsAsync(ListUploadsRequest request) {

        return listUploadsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUploadsResult> listUploadsAsync(ListUploadsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListUploadsRequest, ListUploadsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PurchaseOfferingResult> purchaseOfferingAsync(PurchaseOfferingRequest request) {

        return purchaseOfferingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PurchaseOfferingResult> purchaseOfferingAsync(PurchaseOfferingRequest request,
            com.amazonaws.handlers.AsyncHandler<PurchaseOfferingRequest, PurchaseOfferingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RenewOfferingResult> renewOfferingAsync(RenewOfferingRequest request) {

        return renewOfferingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RenewOfferingResult> renewOfferingAsync(RenewOfferingRequest request,
            com.amazonaws.handlers.AsyncHandler<RenewOfferingRequest, RenewOfferingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ScheduleRunResult> scheduleRunAsync(ScheduleRunRequest request) {

        return scheduleRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ScheduleRunResult> scheduleRunAsync(ScheduleRunRequest request,
            com.amazonaws.handlers.AsyncHandler<ScheduleRunRequest, ScheduleRunResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopRemoteAccessSessionResult> stopRemoteAccessSessionAsync(StopRemoteAccessSessionRequest request) {

        return stopRemoteAccessSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopRemoteAccessSessionResult> stopRemoteAccessSessionAsync(StopRemoteAccessSessionRequest request,
            com.amazonaws.handlers.AsyncHandler<StopRemoteAccessSessionRequest, StopRemoteAccessSessionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopRunResult> stopRunAsync(StopRunRequest request) {

        return stopRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopRunResult> stopRunAsync(StopRunRequest request,
            com.amazonaws.handlers.AsyncHandler<StopRunRequest, StopRunResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateDevicePoolResult> updateDevicePoolAsync(UpdateDevicePoolRequest request) {

        return updateDevicePoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDevicePoolResult> updateDevicePoolAsync(UpdateDevicePoolRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDevicePoolRequest, UpdateDevicePoolResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest request) {

        return updateProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateProjectRequest, UpdateProjectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
