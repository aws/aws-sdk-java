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
import com.amazonaws.*;
import com.amazonaws.services.opsworkscm.waiters.AWSOpsWorksCMWaiters;

/**
 * Abstract implementation of {@code AWSOpsWorksCM}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSOpsWorksCM implements AWSOpsWorksCM {

    protected AbstractAWSOpsWorksCM() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AssociateNodeResult associateNode(AssociateNodeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateBackupResult createBackup(CreateBackupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateServerResult createServer(CreateServerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteBackupResult deleteBackup(DeleteBackupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteServerResult deleteServer(DeleteServerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAccountAttributesResult describeAccountAttributes(DescribeAccountAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeBackupsResult describeBackups(DescribeBackupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeEventsResult describeEvents(DescribeEventsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeNodeAssociationStatusResult describeNodeAssociationStatus(DescribeNodeAssociationStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeServersResult describeServers(DescribeServersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisassociateNodeResult disassociateNode(DisassociateNodeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ExportServerEngineAttributeResult exportServerEngineAttribute(ExportServerEngineAttributeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RestoreServerResult restoreServer(RestoreServerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartMaintenanceResult startMaintenance(StartMaintenanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateServerResult updateServer(UpdateServerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateServerEngineAttributesResult updateServerEngineAttributes(UpdateServerEngineAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AWSOpsWorksCMWaiters waiters() {
        throw new java.lang.UnsupportedOperationException();
    }

}
