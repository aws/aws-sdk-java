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
package com.amazonaws.services.servermigration;

import javax.annotation.Generated;

import com.amazonaws.services.servermigration.model.*;

/**
 * Abstract implementation of {@code AWSServerMigrationAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSServerMigrationAsync extends AbstractAWSServerMigration implements AWSServerMigrationAsync {

    protected AbstractAWSServerMigrationAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateAppResult> createAppAsync(CreateAppRequest request) {

        return createAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAppResult> createAppAsync(CreateAppRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAppRequest, CreateAppResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateReplicationJobResult> createReplicationJobAsync(CreateReplicationJobRequest request) {

        return createReplicationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReplicationJobResult> createReplicationJobAsync(CreateReplicationJobRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateReplicationJobRequest, CreateReplicationJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest request) {

        return deleteAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAppRequest, DeleteAppResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAppLaunchConfigurationResult> deleteAppLaunchConfigurationAsync(DeleteAppLaunchConfigurationRequest request) {

        return deleteAppLaunchConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppLaunchConfigurationResult> deleteAppLaunchConfigurationAsync(DeleteAppLaunchConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAppLaunchConfigurationRequest, DeleteAppLaunchConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAppReplicationConfigurationResult> deleteAppReplicationConfigurationAsync(
            DeleteAppReplicationConfigurationRequest request) {

        return deleteAppReplicationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppReplicationConfigurationResult> deleteAppReplicationConfigurationAsync(
            DeleteAppReplicationConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAppReplicationConfigurationRequest, DeleteAppReplicationConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicationJobResult> deleteReplicationJobAsync(DeleteReplicationJobRequest request) {

        return deleteReplicationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicationJobResult> deleteReplicationJobAsync(DeleteReplicationJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteReplicationJobRequest, DeleteReplicationJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteServerCatalogResult> deleteServerCatalogAsync(DeleteServerCatalogRequest request) {

        return deleteServerCatalogAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteServerCatalogResult> deleteServerCatalogAsync(DeleteServerCatalogRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteServerCatalogRequest, DeleteServerCatalogResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateConnectorResult> disassociateConnectorAsync(DisassociateConnectorRequest request) {

        return disassociateConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateConnectorResult> disassociateConnectorAsync(DisassociateConnectorRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateConnectorRequest, DisassociateConnectorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GenerateChangeSetResult> generateChangeSetAsync(GenerateChangeSetRequest request) {

        return generateChangeSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GenerateChangeSetResult> generateChangeSetAsync(GenerateChangeSetRequest request,
            com.amazonaws.handlers.AsyncHandler<GenerateChangeSetRequest, GenerateChangeSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GenerateTemplateResult> generateTemplateAsync(GenerateTemplateRequest request) {

        return generateTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GenerateTemplateResult> generateTemplateAsync(GenerateTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<GenerateTemplateRequest, GenerateTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAppResult> getAppAsync(GetAppRequest request) {

        return getAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAppResult> getAppAsync(GetAppRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAppRequest, GetAppResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAppLaunchConfigurationResult> getAppLaunchConfigurationAsync(GetAppLaunchConfigurationRequest request) {

        return getAppLaunchConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAppLaunchConfigurationResult> getAppLaunchConfigurationAsync(GetAppLaunchConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAppLaunchConfigurationRequest, GetAppLaunchConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAppReplicationConfigurationResult> getAppReplicationConfigurationAsync(GetAppReplicationConfigurationRequest request) {

        return getAppReplicationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAppReplicationConfigurationResult> getAppReplicationConfigurationAsync(GetAppReplicationConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAppReplicationConfigurationRequest, GetAppReplicationConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetConnectorsResult> getConnectorsAsync(GetConnectorsRequest request) {

        return getConnectorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConnectorsResult> getConnectorsAsync(GetConnectorsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetConnectorsRequest, GetConnectorsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetReplicationJobsResult> getReplicationJobsAsync(GetReplicationJobsRequest request) {

        return getReplicationJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReplicationJobsResult> getReplicationJobsAsync(GetReplicationJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetReplicationJobsRequest, GetReplicationJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetReplicationRunsResult> getReplicationRunsAsync(GetReplicationRunsRequest request) {

        return getReplicationRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReplicationRunsResult> getReplicationRunsAsync(GetReplicationRunsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetReplicationRunsRequest, GetReplicationRunsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetServersResult> getServersAsync(GetServersRequest request) {

        return getServersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServersResult> getServersAsync(GetServersRequest request,
            com.amazonaws.handlers.AsyncHandler<GetServersRequest, GetServersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ImportServerCatalogResult> importServerCatalogAsync(ImportServerCatalogRequest request) {

        return importServerCatalogAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportServerCatalogResult> importServerCatalogAsync(ImportServerCatalogRequest request,
            com.amazonaws.handlers.AsyncHandler<ImportServerCatalogRequest, ImportServerCatalogResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<LaunchAppResult> launchAppAsync(LaunchAppRequest request) {

        return launchAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<LaunchAppResult> launchAppAsync(LaunchAppRequest request,
            com.amazonaws.handlers.AsyncHandler<LaunchAppRequest, LaunchAppResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAppsResult> listAppsAsync(ListAppsRequest request) {

        return listAppsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppsResult> listAppsAsync(ListAppsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAppsRequest, ListAppsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutAppLaunchConfigurationResult> putAppLaunchConfigurationAsync(PutAppLaunchConfigurationRequest request) {

        return putAppLaunchConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAppLaunchConfigurationResult> putAppLaunchConfigurationAsync(PutAppLaunchConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<PutAppLaunchConfigurationRequest, PutAppLaunchConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutAppReplicationConfigurationResult> putAppReplicationConfigurationAsync(PutAppReplicationConfigurationRequest request) {

        return putAppReplicationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAppReplicationConfigurationResult> putAppReplicationConfigurationAsync(PutAppReplicationConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<PutAppReplicationConfigurationRequest, PutAppReplicationConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartAppReplicationResult> startAppReplicationAsync(StartAppReplicationRequest request) {

        return startAppReplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartAppReplicationResult> startAppReplicationAsync(StartAppReplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<StartAppReplicationRequest, StartAppReplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartOnDemandReplicationRunResult> startOnDemandReplicationRunAsync(StartOnDemandReplicationRunRequest request) {

        return startOnDemandReplicationRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartOnDemandReplicationRunResult> startOnDemandReplicationRunAsync(StartOnDemandReplicationRunRequest request,
            com.amazonaws.handlers.AsyncHandler<StartOnDemandReplicationRunRequest, StartOnDemandReplicationRunResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopAppReplicationResult> stopAppReplicationAsync(StopAppReplicationRequest request) {

        return stopAppReplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopAppReplicationResult> stopAppReplicationAsync(StopAppReplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<StopAppReplicationRequest, StopAppReplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TerminateAppResult> terminateAppAsync(TerminateAppRequest request) {

        return terminateAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateAppResult> terminateAppAsync(TerminateAppRequest request,
            com.amazonaws.handlers.AsyncHandler<TerminateAppRequest, TerminateAppResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateAppResult> updateAppAsync(UpdateAppRequest request) {

        return updateAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAppResult> updateAppAsync(UpdateAppRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAppRequest, UpdateAppResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateReplicationJobResult> updateReplicationJobAsync(UpdateReplicationJobRequest request) {

        return updateReplicationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateReplicationJobResult> updateReplicationJobAsync(UpdateReplicationJobRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateReplicationJobRequest, UpdateReplicationJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
