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
package com.amazonaws.services.opsworkscm;

import javax.annotation.Generated;

import com.amazonaws.services.opsworkscm.model.*;

/**
 * Abstract implementation of {@code AWSOpsWorksCMAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSOpsWorksCMAsync extends AbstractAWSOpsWorksCM implements AWSOpsWorksCMAsync {

    protected AbstractAWSOpsWorksCMAsync() {
    }

    @Override
    public java.util.concurrent.Future<AssociateNodeResult> associateNodeAsync(AssociateNodeRequest request) {

        return associateNodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateNodeResult> associateNodeAsync(AssociateNodeRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateNodeRequest, AssociateNodeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateBackupResult> createBackupAsync(CreateBackupRequest request) {

        return createBackupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBackupResult> createBackupAsync(CreateBackupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateBackupRequest, CreateBackupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateServerResult> createServerAsync(CreateServerRequest request) {

        return createServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateServerResult> createServerAsync(CreateServerRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateServerRequest, CreateServerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupResult> deleteBackupAsync(DeleteBackupRequest request) {

        return deleteBackupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupResult> deleteBackupAsync(DeleteBackupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteBackupRequest, DeleteBackupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteServerResult> deleteServerAsync(DeleteServerRequest request) {

        return deleteServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteServerResult> deleteServerAsync(DeleteServerRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteServerRequest, DeleteServerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(DescribeAccountAttributesRequest request) {

        return describeAccountAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(DescribeAccountAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountAttributesRequest, DescribeAccountAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeBackupsResult> describeBackupsAsync(DescribeBackupsRequest request) {

        return describeBackupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBackupsResult> describeBackupsAsync(DescribeBackupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeBackupsRequest, DescribeBackupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest request) {

        return describeEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeNodeAssociationStatusResult> describeNodeAssociationStatusAsync(DescribeNodeAssociationStatusRequest request) {

        return describeNodeAssociationStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNodeAssociationStatusResult> describeNodeAssociationStatusAsync(DescribeNodeAssociationStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeNodeAssociationStatusRequest, DescribeNodeAssociationStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeServersResult> describeServersAsync(DescribeServersRequest request) {

        return describeServersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeServersResult> describeServersAsync(DescribeServersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeServersRequest, DescribeServersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateNodeResult> disassociateNodeAsync(DisassociateNodeRequest request) {

        return disassociateNodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateNodeResult> disassociateNodeAsync(DisassociateNodeRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateNodeRequest, DisassociateNodeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ExportServerEngineAttributeResult> exportServerEngineAttributeAsync(ExportServerEngineAttributeRequest request) {

        return exportServerEngineAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportServerEngineAttributeResult> exportServerEngineAttributeAsync(ExportServerEngineAttributeRequest request,
            com.amazonaws.handlers.AsyncHandler<ExportServerEngineAttributeRequest, ExportServerEngineAttributeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RestoreServerResult> restoreServerAsync(RestoreServerRequest request) {

        return restoreServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreServerResult> restoreServerAsync(RestoreServerRequest request,
            com.amazonaws.handlers.AsyncHandler<RestoreServerRequest, RestoreServerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartMaintenanceResult> startMaintenanceAsync(StartMaintenanceRequest request) {

        return startMaintenanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartMaintenanceResult> startMaintenanceAsync(StartMaintenanceRequest request,
            com.amazonaws.handlers.AsyncHandler<StartMaintenanceRequest, StartMaintenanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateServerResult> updateServerAsync(UpdateServerRequest request) {

        return updateServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServerResult> updateServerAsync(UpdateServerRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateServerRequest, UpdateServerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateServerEngineAttributesResult> updateServerEngineAttributesAsync(UpdateServerEngineAttributesRequest request) {

        return updateServerEngineAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServerEngineAttributesResult> updateServerEngineAttributesAsync(UpdateServerEngineAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateServerEngineAttributesRequest, UpdateServerEngineAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
