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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.servermigration.model.*;

/**
 * Interface for accessing SMS.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.servermigration.AbstractAWSServerMigration} instead.
 * </p>
 * <p>
 * Amazon Server Migration Service automates the process of migrating servers to EC2.
 */
public interface AWSServerMigration {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "sms";

    /**
     * Overrides the default endpoint for this client ("sms.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "sms.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "sms.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol from this
     * client's {@link ClientConfiguration} will be used, which by default is HTTPS.
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
     *        The endpoint (ex: "sms.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "sms.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSServerMigration#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
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
     * The CreateReplicationJob API is used to create a ReplicationJob to replicate a server on AWS. Call this API to
     * first create a ReplicationJob, which will then schedule periodic ReplicationRuns to replicate your server to AWS.
     * Each ReplicationRun will result in the creation of an AWS AMI.
     * 
     * @param createReplicationJobRequest
     * @return Result of the CreateReplicationJob operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in the request is not valid, is unsupported, or cannot be used.
     * @throws MissingRequiredParameterException
     *         The request is missing a required parameter. Ensure that you have supplied all the required parameters
     *         for the request.
     * @throws UnauthorizedOperationException
     *         This user does not have permissions to perform this operation.
     * @throws OperationNotPermittedException
     *         The specified operation is not allowed. This error can occur for a number of reasons; for example, you
     *         might be trying to start a Replication Run before seed Replication Run.
     * @throws ServerCannotBeReplicatedException
     *         The provided server cannot be replicated.
     * @throws ReplicationJobAlreadyExistsException
     *         An active Replication Job already exists for the specified server.
     * @throws NoConnectorsAvailableException
     *         No connectors are available to handle this request. Please associate connector(s) and verify any existing
     *         connectors are healthy and can respond to requests.
     * @throws InternalErrorException
     *         An internal error has occured.
     * @sample AWSServerMigration.CreateReplicationJob
     */
    CreateReplicationJobResult createReplicationJob(CreateReplicationJobRequest createReplicationJobRequest);

    /**
     * The DeleteReplicationJob API is used to delete a ReplicationJob, resulting in no further ReplicationRuns. This
     * will delete the contents of the S3 bucket used to store SMS artifacts, but will not delete any AMIs created by
     * the SMS service.
     * 
     * @param deleteReplicationJobRequest
     * @return Result of the DeleteReplicationJob operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in the request is not valid, is unsupported, or cannot be used.
     * @throws MissingRequiredParameterException
     *         The request is missing a required parameter. Ensure that you have supplied all the required parameters
     *         for the request.
     * @throws UnauthorizedOperationException
     *         This user does not have permissions to perform this operation.
     * @throws OperationNotPermittedException
     *         The specified operation is not allowed. This error can occur for a number of reasons; for example, you
     *         might be trying to start a Replication Run before seed Replication Run.
     * @throws ReplicationJobNotFoundException
     *         The specified Replication Job cannot be found.
     * @sample AWSServerMigration.DeleteReplicationJob
     */
    DeleteReplicationJobResult deleteReplicationJob(DeleteReplicationJobRequest deleteReplicationJobRequest);

    /**
     * The DeleteServerCatalog API clears all servers from your server catalog. This means that these servers will no
     * longer be accessible to the Server Migration Service.
     * 
     * @param deleteServerCatalogRequest
     * @return Result of the DeleteServerCatalog operation returned by the service.
     * @throws UnauthorizedOperationException
     *         This user does not have permissions to perform this operation.
     * @throws OperationNotPermittedException
     *         The specified operation is not allowed. This error can occur for a number of reasons; for example, you
     *         might be trying to start a Replication Run before seed Replication Run.
     * @throws InvalidParameterException
     *         A parameter specified in the request is not valid, is unsupported, or cannot be used.
     * @throws MissingRequiredParameterException
     *         The request is missing a required parameter. Ensure that you have supplied all the required parameters
     *         for the request.
     * @sample AWSServerMigration.DeleteServerCatalog
     */
    DeleteServerCatalogResult deleteServerCatalog(DeleteServerCatalogRequest deleteServerCatalogRequest);

    /**
     * The DisassociateConnector API will disassociate a connector from the Server Migration Service, rendering it
     * unavailable to support replication jobs.
     * 
     * @param disassociateConnectorRequest
     * @return Result of the DisassociateConnector operation returned by the service.
     * @throws MissingRequiredParameterException
     *         The request is missing a required parameter. Ensure that you have supplied all the required parameters
     *         for the request.
     * @throws UnauthorizedOperationException
     *         This user does not have permissions to perform this operation.
     * @throws OperationNotPermittedException
     *         The specified operation is not allowed. This error can occur for a number of reasons; for example, you
     *         might be trying to start a Replication Run before seed Replication Run.
     * @throws InvalidParameterException
     *         A parameter specified in the request is not valid, is unsupported, or cannot be used.
     * @sample AWSServerMigration.DisassociateConnector
     */
    DisassociateConnectorResult disassociateConnector(DisassociateConnectorRequest disassociateConnectorRequest);

    /**
     * The GetConnectors API returns a list of connectors that are registered with the Server Migration Service.
     * 
     * @param getConnectorsRequest
     * @return Result of the GetConnectors operation returned by the service.
     * @throws UnauthorizedOperationException
     *         This user does not have permissions to perform this operation.
     * @sample AWSServerMigration.GetConnectors
     */
    GetConnectorsResult getConnectors(GetConnectorsRequest getConnectorsRequest);

    /**
     * The GetReplicationJobs API will return all of your ReplicationJobs and their details. This API returns a
     * paginated list, that may be consecutively called with nextToken to retrieve all ReplicationJobs.
     * 
     * @param getReplicationJobsRequest
     * @return Result of the GetReplicationJobs operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in the request is not valid, is unsupported, or cannot be used.
     * @throws MissingRequiredParameterException
     *         The request is missing a required parameter. Ensure that you have supplied all the required parameters
     *         for the request.
     * @throws UnauthorizedOperationException
     *         This user does not have permissions to perform this operation.
     * @sample AWSServerMigration.GetReplicationJobs
     */
    GetReplicationJobsResult getReplicationJobs(GetReplicationJobsRequest getReplicationJobsRequest);

    /**
     * The GetReplicationRuns API will return all ReplicationRuns for a given ReplicationJob. This API returns a
     * paginated list, that may be consecutively called with nextToken to retrieve all ReplicationRuns for a
     * ReplicationJob.
     * 
     * @param getReplicationRunsRequest
     * @return Result of the GetReplicationRuns operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in the request is not valid, is unsupported, or cannot be used.
     * @throws MissingRequiredParameterException
     *         The request is missing a required parameter. Ensure that you have supplied all the required parameters
     *         for the request.
     * @throws UnauthorizedOperationException
     *         This user does not have permissions to perform this operation.
     * @sample AWSServerMigration.GetReplicationRuns
     */
    GetReplicationRunsResult getReplicationRuns(GetReplicationRunsRequest getReplicationRunsRequest);

    /**
     * The GetServers API returns a list of all servers in your server catalog. For this call to succeed, you must
     * previously have called ImportServerCatalog.
     * 
     * @param getServersRequest
     * @return Result of the GetServers operation returned by the service.
     * @throws UnauthorizedOperationException
     *         This user does not have permissions to perform this operation.
     * @sample AWSServerMigration.GetServers
     */
    GetServersResult getServers(GetServersRequest getServersRequest);

    /**
     * The ImportServerCatalog API is used to gather the complete list of on-premises servers on your premises. This API
     * call requires connectors to be installed and monitoring all servers you would like imported. This API call
     * returns immediately, but may take some time to retrieve all of the servers.
     * 
     * @param importServerCatalogRequest
     * @return Result of the ImportServerCatalog operation returned by the service.
     * @throws UnauthorizedOperationException
     *         This user does not have permissions to perform this operation.
     * @throws OperationNotPermittedException
     *         The specified operation is not allowed. This error can occur for a number of reasons; for example, you
     *         might be trying to start a Replication Run before seed Replication Run.
     * @throws InvalidParameterException
     *         A parameter specified in the request is not valid, is unsupported, or cannot be used.
     * @throws MissingRequiredParameterException
     *         The request is missing a required parameter. Ensure that you have supplied all the required parameters
     *         for the request.
     * @throws NoConnectorsAvailableException
     *         No connectors are available to handle this request. Please associate connector(s) and verify any existing
     *         connectors are healthy and can respond to requests.
     * @sample AWSServerMigration.ImportServerCatalog
     */
    ImportServerCatalogResult importServerCatalog(ImportServerCatalogRequest importServerCatalogRequest);

    /**
     * The StartOnDemandReplicationRun API is used to start a ReplicationRun on demand (in addition to those that are
     * scheduled based on your frequency). This ReplicationRun will start immediately. StartOnDemandReplicationRun is
     * subject to limits on how many on demand ReplicationRuns you may call per 24-hour period.
     * 
     * @param startOnDemandReplicationRunRequest
     * @return Result of the StartOnDemandReplicationRun operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in the request is not valid, is unsupported, or cannot be used.
     * @throws MissingRequiredParameterException
     *         The request is missing a required parameter. Ensure that you have supplied all the required parameters
     *         for the request.
     * @throws UnauthorizedOperationException
     *         This user does not have permissions to perform this operation.
     * @throws OperationNotPermittedException
     *         The specified operation is not allowed. This error can occur for a number of reasons; for example, you
     *         might be trying to start a Replication Run before seed Replication Run.
     * @throws ReplicationRunLimitExceededException
     *         This user has exceeded the maximum allowed Replication Run limit.
     * @sample AWSServerMigration.StartOnDemandReplicationRun
     */
    StartOnDemandReplicationRunResult startOnDemandReplicationRun(StartOnDemandReplicationRunRequest startOnDemandReplicationRunRequest);

    /**
     * The UpdateReplicationJob API is used to change the settings of your existing ReplicationJob created using
     * CreateReplicationJob. Calling this API will affect the next scheduled ReplicationRun.
     * 
     * @param updateReplicationJobRequest
     * @return Result of the UpdateReplicationJob operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter specified in the request is not valid, is unsupported, or cannot be used.
     * @throws MissingRequiredParameterException
     *         The request is missing a required parameter. Ensure that you have supplied all the required parameters
     *         for the request.
     * @throws OperationNotPermittedException
     *         The specified operation is not allowed. This error can occur for a number of reasons; for example, you
     *         might be trying to start a Replication Run before seed Replication Run.
     * @throws UnauthorizedOperationException
     *         This user does not have permissions to perform this operation.
     * @throws ServerCannotBeReplicatedException
     *         The provided server cannot be replicated.
     * @throws ReplicationJobNotFoundException
     *         The specified Replication Job cannot be found.
     * @throws InternalErrorException
     *         An internal error has occured.
     * @sample AWSServerMigration.UpdateReplicationJob
     */
    UpdateReplicationJobResult updateReplicationJob(UpdateReplicationJobRequest updateReplicationJobRequest);

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
