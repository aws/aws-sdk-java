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

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.auth.presign.PresignerParams;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.servermigration.model.*;
import com.amazonaws.services.servermigration.model.transform.*;

/**
 * Client for accessing SMS. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * Amazon Server Migration Service automates the process of migrating servers to EC2.
 */
@ThreadSafe
public class AWSServerMigrationClient extends AmazonWebServiceClient implements AWSServerMigration {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSServerMigration.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "sms";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(new JsonClientMetadata()
            .withProtocolVersion("1.1")
            .withSupportsCbor(false)
            .withSupportsIon(false)
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ReplicationJobAlreadyExistsException").withModeledClass(
                            com.amazonaws.services.servermigration.model.ReplicationJobAlreadyExistsException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("MissingRequiredParameterException").withModeledClass(
                            com.amazonaws.services.servermigration.model.MissingRequiredParameterException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ServerCannotBeReplicatedException").withModeledClass(
                            com.amazonaws.services.servermigration.model.ServerCannotBeReplicatedException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withModeledClass(
                            com.amazonaws.services.servermigration.model.InvalidParameterException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ReplicationJobNotFoundException").withModeledClass(
                            com.amazonaws.services.servermigration.model.ReplicationJobNotFoundException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ReplicationRunLimitExceededException").withModeledClass(
                            com.amazonaws.services.servermigration.model.ReplicationRunLimitExceededException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("OperationNotPermittedException").withModeledClass(
                            com.amazonaws.services.servermigration.model.OperationNotPermittedException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("UnauthorizedOperationException").withModeledClass(
                            com.amazonaws.services.servermigration.model.UnauthorizedOperationException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InternalError").withModeledClass(
                            com.amazonaws.services.servermigration.model.InternalErrorException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("NoConnectorsAvailableException").withModeledClass(
                            com.amazonaws.services.servermigration.model.NoConnectorsAvailableException.class))
            .withBaseServiceExceptionClass(com.amazonaws.services.servermigration.model.AWSServerMigrationException.class));

    /**
     * Constructs a new client to invoke service methods on SMS. A credentials provider chain will be used that searches
     * for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSServerMigrationClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on SMS. A credentials provider chain will be used that searches
     * for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to SMS (ex: proxy settings, retry
     *        counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSServerMigrationClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on SMS using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     */
    public AWSServerMigrationClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on SMS using the specified AWS account credentials and client
     * configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to SMS (ex: proxy settings, retry
     *        counts, etc.).
     */
    public AWSServerMigrationClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on SMS using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     */
    public AWSServerMigrationClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on SMS using the specified AWS account credentials provider and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to SMS (ex: proxy settings, retry
     *        counts, etc.).
     */
    public AWSServerMigrationClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on SMS using the specified AWS account credentials provider,
     * client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to SMS (ex: proxy settings, retry
     *        counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AWSServerMigrationClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on SMS using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSServerMigrationClient(AwsSyncClientParams clientParams) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("sms.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/servermigration/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/servermigration/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

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
    @Override
    public CreateReplicationJobResult createReplicationJob(CreateReplicationJobRequest createReplicationJobRequest) {
        ExecutionContext executionContext = createExecutionContext(createReplicationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReplicationJobRequest> request = null;
        Response<CreateReplicationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReplicationJobRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createReplicationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateReplicationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateReplicationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DeleteReplicationJobResult deleteReplicationJob(DeleteReplicationJobRequest deleteReplicationJobRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteReplicationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReplicationJobRequest> request = null;
        Response<DeleteReplicationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReplicationJobRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteReplicationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteReplicationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteReplicationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DeleteServerCatalogResult deleteServerCatalog(DeleteServerCatalogRequest deleteServerCatalogRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteServerCatalogRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteServerCatalogRequest> request = null;
        Response<DeleteServerCatalogResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteServerCatalogRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteServerCatalogRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteServerCatalogResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteServerCatalogResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DisassociateConnectorResult disassociateConnector(DisassociateConnectorRequest disassociateConnectorRequest) {
        ExecutionContext executionContext = createExecutionContext(disassociateConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateConnectorRequest> request = null;
        Response<DisassociateConnectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateConnectorRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateConnectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateConnectorResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DisassociateConnectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * The GetConnectors API returns a list of connectors that are registered with the Server Migration Service.
     * 
     * @param getConnectorsRequest
     * @return Result of the GetConnectors operation returned by the service.
     * @throws UnauthorizedOperationException
     *         This user does not have permissions to perform this operation.
     * @sample AWSServerMigration.GetConnectors
     */
    @Override
    public GetConnectorsResult getConnectors(GetConnectorsRequest getConnectorsRequest) {
        ExecutionContext executionContext = createExecutionContext(getConnectorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConnectorsRequest> request = null;
        Response<GetConnectorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConnectorsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getConnectorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConnectorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetConnectorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetReplicationJobsResult getReplicationJobs(GetReplicationJobsRequest getReplicationJobsRequest) {
        ExecutionContext executionContext = createExecutionContext(getReplicationJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReplicationJobsRequest> request = null;
        Response<GetReplicationJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReplicationJobsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getReplicationJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetReplicationJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetReplicationJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetReplicationRunsResult getReplicationRuns(GetReplicationRunsRequest getReplicationRunsRequest) {
        ExecutionContext executionContext = createExecutionContext(getReplicationRunsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReplicationRunsRequest> request = null;
        Response<GetReplicationRunsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReplicationRunsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getReplicationRunsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetReplicationRunsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetReplicationRunsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetServersResult getServers(GetServersRequest getServersRequest) {
        ExecutionContext executionContext = createExecutionContext(getServersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServersRequest> request = null;
        Response<GetServersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServersRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getServersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetServersResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetServersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ImportServerCatalogResult importServerCatalog(ImportServerCatalogRequest importServerCatalogRequest) {
        ExecutionContext executionContext = createExecutionContext(importServerCatalogRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportServerCatalogRequest> request = null;
        Response<ImportServerCatalogResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportServerCatalogRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(importServerCatalogRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportServerCatalogResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ImportServerCatalogResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public StartOnDemandReplicationRunResult startOnDemandReplicationRun(StartOnDemandReplicationRunRequest startOnDemandReplicationRunRequest) {
        ExecutionContext executionContext = createExecutionContext(startOnDemandReplicationRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartOnDemandReplicationRunRequest> request = null;
        Response<StartOnDemandReplicationRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartOnDemandReplicationRunRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startOnDemandReplicationRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartOnDemandReplicationRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartOnDemandReplicationRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public UpdateReplicationJobResult updateReplicationJob(UpdateReplicationJobRequest updateReplicationJobRequest) {
        ExecutionContext executionContext = createExecutionContext(updateReplicationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateReplicationJobRequest> request = null;
        Response<UpdateReplicationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateReplicationJobRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateReplicationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateReplicationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateReplicationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

}
