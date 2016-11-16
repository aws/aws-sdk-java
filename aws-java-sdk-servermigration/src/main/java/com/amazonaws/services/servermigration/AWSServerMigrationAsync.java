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

/**
 * Interface for accessing SMS asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.servermigration.AbstractAWSServerMigrationAsync} instead.
 * </p>
 * <p>
 * Amazon Server Migration Service automates the process of migrating servers to EC2.
 */
public interface AWSServerMigrationAsync extends AWSServerMigration {

    /**
     * The CreateReplicationJob API is used to create a ReplicationJob to replicate a server on AWS. Call this API to
     * first create a ReplicationJob, which will then schedule periodic ReplicationRuns to replicate your server to AWS.
     * Each ReplicationRun will result in the creation of an AWS AMI.
     * 
     * @param createReplicationJobRequest
     * @return A Java Future containing the result of the CreateReplicationJob operation returned by the service.
     * @sample AWSServerMigrationAsync.CreateReplicationJob
     */
    java.util.concurrent.Future<CreateReplicationJobResult> createReplicationJobAsync(CreateReplicationJobRequest createReplicationJobRequest);

    /**
     * The CreateReplicationJob API is used to create a ReplicationJob to replicate a server on AWS. Call this API to
     * first create a ReplicationJob, which will then schedule periodic ReplicationRuns to replicate your server to AWS.
     * Each ReplicationRun will result in the creation of an AWS AMI.
     * 
     * @param createReplicationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateReplicationJob operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.CreateReplicationJob
     */
    java.util.concurrent.Future<CreateReplicationJobResult> createReplicationJobAsync(CreateReplicationJobRequest createReplicationJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateReplicationJobRequest, CreateReplicationJobResult> asyncHandler);

    /**
     * The DeleteReplicationJob API is used to delete a ReplicationJob, resulting in no further ReplicationRuns. This
     * will delete the contents of the S3 bucket used to store SMS artifacts, but will not delete any AMIs created by
     * the SMS service.
     * 
     * @param deleteReplicationJobRequest
     * @return A Java Future containing the result of the DeleteReplicationJob operation returned by the service.
     * @sample AWSServerMigrationAsync.DeleteReplicationJob
     */
    java.util.concurrent.Future<DeleteReplicationJobResult> deleteReplicationJobAsync(DeleteReplicationJobRequest deleteReplicationJobRequest);

    /**
     * The DeleteReplicationJob API is used to delete a ReplicationJob, resulting in no further ReplicationRuns. This
     * will delete the contents of the S3 bucket used to store SMS artifacts, but will not delete any AMIs created by
     * the SMS service.
     * 
     * @param deleteReplicationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteReplicationJob operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.DeleteReplicationJob
     */
    java.util.concurrent.Future<DeleteReplicationJobResult> deleteReplicationJobAsync(DeleteReplicationJobRequest deleteReplicationJobRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReplicationJobRequest, DeleteReplicationJobResult> asyncHandler);

    /**
     * The DeleteServerCatalog API clears all servers from your server catalog. This means that these servers will no
     * longer be accessible to the Server Migration Service.
     * 
     * @param deleteServerCatalogRequest
     * @return A Java Future containing the result of the DeleteServerCatalog operation returned by the service.
     * @sample AWSServerMigrationAsync.DeleteServerCatalog
     */
    java.util.concurrent.Future<DeleteServerCatalogResult> deleteServerCatalogAsync(DeleteServerCatalogRequest deleteServerCatalogRequest);

    /**
     * The DeleteServerCatalog API clears all servers from your server catalog. This means that these servers will no
     * longer be accessible to the Server Migration Service.
     * 
     * @param deleteServerCatalogRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteServerCatalog operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.DeleteServerCatalog
     */
    java.util.concurrent.Future<DeleteServerCatalogResult> deleteServerCatalogAsync(DeleteServerCatalogRequest deleteServerCatalogRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteServerCatalogRequest, DeleteServerCatalogResult> asyncHandler);

    /**
     * The DisassociateConnector API will disassociate a connector from the Server Migration Service, rendering it
     * unavailable to support replication jobs.
     * 
     * @param disassociateConnectorRequest
     * @return A Java Future containing the result of the DisassociateConnector operation returned by the service.
     * @sample AWSServerMigrationAsync.DisassociateConnector
     */
    java.util.concurrent.Future<DisassociateConnectorResult> disassociateConnectorAsync(DisassociateConnectorRequest disassociateConnectorRequest);

    /**
     * The DisassociateConnector API will disassociate a connector from the Server Migration Service, rendering it
     * unavailable to support replication jobs.
     * 
     * @param disassociateConnectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateConnector operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.DisassociateConnector
     */
    java.util.concurrent.Future<DisassociateConnectorResult> disassociateConnectorAsync(DisassociateConnectorRequest disassociateConnectorRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateConnectorRequest, DisassociateConnectorResult> asyncHandler);

    /**
     * The GetConnectors API returns a list of connectors that are registered with the Server Migration Service.
     * 
     * @param getConnectorsRequest
     * @return A Java Future containing the result of the GetConnectors operation returned by the service.
     * @sample AWSServerMigrationAsync.GetConnectors
     */
    java.util.concurrent.Future<GetConnectorsResult> getConnectorsAsync(GetConnectorsRequest getConnectorsRequest);

    /**
     * The GetConnectors API returns a list of connectors that are registered with the Server Migration Service.
     * 
     * @param getConnectorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConnectors operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.GetConnectors
     */
    java.util.concurrent.Future<GetConnectorsResult> getConnectorsAsync(GetConnectorsRequest getConnectorsRequest,
            com.amazonaws.handlers.AsyncHandler<GetConnectorsRequest, GetConnectorsResult> asyncHandler);

    /**
     * The GetReplicationJobs API will return all of your ReplicationJobs and their details. This API returns a
     * paginated list, that may be consecutively called with nextToken to retrieve all ReplicationJobs.
     * 
     * @param getReplicationJobsRequest
     * @return A Java Future containing the result of the GetReplicationJobs operation returned by the service.
     * @sample AWSServerMigrationAsync.GetReplicationJobs
     */
    java.util.concurrent.Future<GetReplicationJobsResult> getReplicationJobsAsync(GetReplicationJobsRequest getReplicationJobsRequest);

    /**
     * The GetReplicationJobs API will return all of your ReplicationJobs and their details. This API returns a
     * paginated list, that may be consecutively called with nextToken to retrieve all ReplicationJobs.
     * 
     * @param getReplicationJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReplicationJobs operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.GetReplicationJobs
     */
    java.util.concurrent.Future<GetReplicationJobsResult> getReplicationJobsAsync(GetReplicationJobsRequest getReplicationJobsRequest,
            com.amazonaws.handlers.AsyncHandler<GetReplicationJobsRequest, GetReplicationJobsResult> asyncHandler);

    /**
     * The GetReplicationRuns API will return all ReplicationRuns for a given ReplicationJob. This API returns a
     * paginated list, that may be consecutively called with nextToken to retrieve all ReplicationRuns for a
     * ReplicationJob.
     * 
     * @param getReplicationRunsRequest
     * @return A Java Future containing the result of the GetReplicationRuns operation returned by the service.
     * @sample AWSServerMigrationAsync.GetReplicationRuns
     */
    java.util.concurrent.Future<GetReplicationRunsResult> getReplicationRunsAsync(GetReplicationRunsRequest getReplicationRunsRequest);

    /**
     * The GetReplicationRuns API will return all ReplicationRuns for a given ReplicationJob. This API returns a
     * paginated list, that may be consecutively called with nextToken to retrieve all ReplicationRuns for a
     * ReplicationJob.
     * 
     * @param getReplicationRunsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReplicationRuns operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.GetReplicationRuns
     */
    java.util.concurrent.Future<GetReplicationRunsResult> getReplicationRunsAsync(GetReplicationRunsRequest getReplicationRunsRequest,
            com.amazonaws.handlers.AsyncHandler<GetReplicationRunsRequest, GetReplicationRunsResult> asyncHandler);

    /**
     * The GetServers API returns a list of all servers in your server catalog. For this call to succeed, you must
     * previously have called ImportServerCatalog.
     * 
     * @param getServersRequest
     * @return A Java Future containing the result of the GetServers operation returned by the service.
     * @sample AWSServerMigrationAsync.GetServers
     */
    java.util.concurrent.Future<GetServersResult> getServersAsync(GetServersRequest getServersRequest);

    /**
     * The GetServers API returns a list of all servers in your server catalog. For this call to succeed, you must
     * previously have called ImportServerCatalog.
     * 
     * @param getServersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetServers operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.GetServers
     */
    java.util.concurrent.Future<GetServersResult> getServersAsync(GetServersRequest getServersRequest,
            com.amazonaws.handlers.AsyncHandler<GetServersRequest, GetServersResult> asyncHandler);

    /**
     * The ImportServerCatalog API is used to gather the complete list of on-premises servers on your premises. This API
     * call requires connectors to be installed and monitoring all servers you would like imported. This API call
     * returns immediately, but may take some time to retrieve all of the servers.
     * 
     * @param importServerCatalogRequest
     * @return A Java Future containing the result of the ImportServerCatalog operation returned by the service.
     * @sample AWSServerMigrationAsync.ImportServerCatalog
     */
    java.util.concurrent.Future<ImportServerCatalogResult> importServerCatalogAsync(ImportServerCatalogRequest importServerCatalogRequest);

    /**
     * The ImportServerCatalog API is used to gather the complete list of on-premises servers on your premises. This API
     * call requires connectors to be installed and monitoring all servers you would like imported. This API call
     * returns immediately, but may take some time to retrieve all of the servers.
     * 
     * @param importServerCatalogRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportServerCatalog operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.ImportServerCatalog
     */
    java.util.concurrent.Future<ImportServerCatalogResult> importServerCatalogAsync(ImportServerCatalogRequest importServerCatalogRequest,
            com.amazonaws.handlers.AsyncHandler<ImportServerCatalogRequest, ImportServerCatalogResult> asyncHandler);

    /**
     * The StartOnDemandReplicationRun API is used to start a ReplicationRun on demand (in addition to those that are
     * scheduled based on your frequency). This ReplicationRun will start immediately. StartOnDemandReplicationRun is
     * subject to limits on how many on demand ReplicationRuns you may call per 24-hour period.
     * 
     * @param startOnDemandReplicationRunRequest
     * @return A Java Future containing the result of the StartOnDemandReplicationRun operation returned by the service.
     * @sample AWSServerMigrationAsync.StartOnDemandReplicationRun
     */
    java.util.concurrent.Future<StartOnDemandReplicationRunResult> startOnDemandReplicationRunAsync(
            StartOnDemandReplicationRunRequest startOnDemandReplicationRunRequest);

    /**
     * The StartOnDemandReplicationRun API is used to start a ReplicationRun on demand (in addition to those that are
     * scheduled based on your frequency). This ReplicationRun will start immediately. StartOnDemandReplicationRun is
     * subject to limits on how many on demand ReplicationRuns you may call per 24-hour period.
     * 
     * @param startOnDemandReplicationRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartOnDemandReplicationRun operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.StartOnDemandReplicationRun
     */
    java.util.concurrent.Future<StartOnDemandReplicationRunResult> startOnDemandReplicationRunAsync(
            StartOnDemandReplicationRunRequest startOnDemandReplicationRunRequest,
            com.amazonaws.handlers.AsyncHandler<StartOnDemandReplicationRunRequest, StartOnDemandReplicationRunResult> asyncHandler);

    /**
     * The UpdateReplicationJob API is used to change the settings of your existing ReplicationJob created using
     * CreateReplicationJob. Calling this API will affect the next scheduled ReplicationRun.
     * 
     * @param updateReplicationJobRequest
     * @return A Java Future containing the result of the UpdateReplicationJob operation returned by the service.
     * @sample AWSServerMigrationAsync.UpdateReplicationJob
     */
    java.util.concurrent.Future<UpdateReplicationJobResult> updateReplicationJobAsync(UpdateReplicationJobRequest updateReplicationJobRequest);

    /**
     * The UpdateReplicationJob API is used to change the settings of your existing ReplicationJob created using
     * CreateReplicationJob. Calling this API will affect the next scheduled ReplicationRun.
     * 
     * @param updateReplicationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateReplicationJob operation returned by the service.
     * @sample AWSServerMigrationAsyncHandler.UpdateReplicationJob
     */
    java.util.concurrent.Future<UpdateReplicationJobResult> updateReplicationJobAsync(UpdateReplicationJobRequest updateReplicationJobRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateReplicationJobRequest, UpdateReplicationJobResult> asyncHandler);

}
