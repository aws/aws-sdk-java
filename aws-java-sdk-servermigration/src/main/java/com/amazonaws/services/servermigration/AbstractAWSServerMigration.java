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
package com.amazonaws.services.servermigration;

import com.amazonaws.services.servermigration.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSServerMigration}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
public class AbstractAWSServerMigration implements AWSServerMigration {

    protected AbstractAWSServerMigration() {
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
    public CreateReplicationJobResult createReplicationJob(CreateReplicationJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteReplicationJobResult deleteReplicationJob(DeleteReplicationJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteServerCatalogResult deleteServerCatalog(DeleteServerCatalogRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisassociateConnectorResult disassociateConnector(DisassociateConnectorRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetConnectorsResult getConnectors(GetConnectorsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetReplicationJobsResult getReplicationJobs(GetReplicationJobsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetReplicationRunsResult getReplicationRuns(GetReplicationRunsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetServersResult getServers(GetServersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ImportServerCatalogResult importServerCatalog(ImportServerCatalogRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartOnDemandReplicationRunResult startOnDemandReplicationRun(StartOnDemandReplicationRunRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateReplicationJobResult updateReplicationJob(UpdateReplicationJobRequest request) {
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

}
