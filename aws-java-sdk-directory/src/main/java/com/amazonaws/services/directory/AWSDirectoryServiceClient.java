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
package com.amazonaws.services.directory;

import java.net.*;
import java.util.*;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.regions.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.util.json.*;

import com.amazonaws.services.directory.model.*;
import com.amazonaws.services.directory.model.transform.*;

/**
 * Client for accessing AWSDirectoryService.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * AWS Directory Service <p>
 * This is the <i>AWS Directory Service API Reference</i> . This guide
 * provides detailed information about AWS Directory Service operations,
 * data types, parameters, and errors.
 * </p>
 */
public class AWSDirectoryServiceClient extends AmazonWebServiceClient implements AWSDirectoryService {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSDirectoryService.class);

    /**
     * List of exception unmarshallers for all AWSDirectoryService exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AWSDirectoryService.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSDirectoryServiceClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSDirectoryService.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSDirectoryService
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSDirectoryServiceClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSDirectoryService using the specified AWS account credentials.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AWSDirectoryServiceClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSDirectoryService using the specified AWS account credentials
     * and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSDirectoryService
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSDirectoryServiceClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(adjustClientConfiguration(clientConfiguration));
        
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSDirectoryService using the specified AWS account credentials provider.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AWSDirectoryServiceClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSDirectoryService using the specified AWS account credentials
     * provider and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSDirectoryService
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSDirectoryServiceClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSDirectoryService using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSDirectoryService
     *                       (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    public AWSDirectoryServiceClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);
        
        this.awsCredentialsProvider = awsCredentialsProvider;
        
        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new InsufficientPermissionsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DirectoryLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedOperationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new SnapshotLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidNextTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DirectoryUnavailableExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AuthenticationFailedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new EntityDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new EntityAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidParameterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ClientExceptionUnmarshaller());
        
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());
        
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("ds.us-east-1.amazonaws.com");
        
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/directory/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/directory/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;
        
        return config;
    }

    /**
     * <p>
     * Obtains information about the directory snapshots that belong to this
     * account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <i>NextToken</i> request and response parameters. If more results are
     * available, the <i>DescribeSnapshots.NextToken</i> member contains a
     * token that you pass in the next call to DescribeSnapshots to retrieve
     * the next set of items.
     * </p>
     * <p>
     * You can also specify a maximum number of return results with the
     * <i>Limit</i> parameter.
     * </p>
     *
     * @param describeSnapshotsRequest Container for the necessary parameters
     *           to execute the DescribeSnapshots service method on
     *           AWSDirectoryService.
     * 
     * @return The response from the DescribeSnapshots service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws InvalidParameterException
     * @throws InvalidNextTokenException
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSnapshotsResult describeSnapshots(DescribeSnapshotsRequest describeSnapshotsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSnapshotsRequest> request = null;
        Response<DescribeSnapshotsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSnapshotsRequestMarshaller().marshall(super.beforeMarshalling(describeSnapshotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DescribeSnapshotsResult, JsonUnmarshallerContext> unmarshaller =
                new DescribeSnapshotsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeSnapshotsResult> responseHandler =
                new JsonResponseHandler<DescribeSnapshotsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an alias for a directory and assigns the alias to the
     * directory. The alias is used to construct the access URL for the
     * directory, such as <code>http://<alias>.awsapps.com</code> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b> After an alias has been created, it cannot be
     * deleted or reused, so this operation should only be used when
     * absolutely necessary.
     * </p>
     *
     * @param createAliasRequest Container for the necessary parameters to
     *           execute the CreateAlias service method on AWSDirectoryService.
     * 
     * @return The response from the CreateAlias service method, as returned
     *         by AWSDirectoryService.
     * 
     * @throws InvalidParameterException
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws EntityAlreadyExistsException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateAliasResult createAlias(CreateAliasRequest createAliasRequest) {
        ExecutionContext executionContext = createExecutionContext(createAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAliasRequest> request = null;
        Response<CreateAliasResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAliasRequestMarshaller().marshall(super.beforeMarshalling(createAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<CreateAliasResult, JsonUnmarshallerContext> unmarshaller =
                new CreateAliasResultJsonUnmarshaller();
            JsonResponseHandler<CreateAliasResult> responseHandler =
                new JsonResponseHandler<CreateAliasResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a directory snapshot.
     * </p>
     *
     * @param deleteSnapshotRequest Container for the necessary parameters to
     *           execute the DeleteSnapshot service method on AWSDirectoryService.
     * 
     * @return The response from the DeleteSnapshot service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws InvalidParameterException
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteSnapshotResult deleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSnapshotRequest> request = null;
        Response<DeleteSnapshotResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSnapshotRequestMarshaller().marshall(super.beforeMarshalling(deleteSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DeleteSnapshotResult, JsonUnmarshallerContext> unmarshaller =
                new DeleteSnapshotResultJsonUnmarshaller();
            JsonResponseHandler<DeleteSnapshotResult> responseHandler =
                new JsonResponseHandler<DeleteSnapshotResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the Remote Authentication Dial In User Service (RADIUS)
     * server information for an AD Connector directory.
     * </p>
     *
     * @param updateRadiusRequest Container for the necessary parameters to
     *           execute the UpdateRadius service method on AWSDirectoryService.
     * 
     * @return The response from the UpdateRadius service method, as returned
     *         by AWSDirectoryService.
     * 
     * @throws InvalidParameterException
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateRadiusResult updateRadius(UpdateRadiusRequest updateRadiusRequest) {
        ExecutionContext executionContext = createExecutionContext(updateRadiusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRadiusRequest> request = null;
        Response<UpdateRadiusResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRadiusRequestMarshaller().marshall(super.beforeMarshalling(updateRadiusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<UpdateRadiusResult, JsonUnmarshallerContext> unmarshaller =
                new UpdateRadiusResultJsonUnmarshaller();
            JsonResponseHandler<UpdateRadiusResult> responseHandler =
                new JsonResponseHandler<UpdateRadiusResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Obtains information about the directories that belong to this
     * account.
     * </p>
     * <p>
     * You can retrieve information about specific directories by passing
     * the directory identifiers in the <i>DirectoryIds</i> parameter.
     * Otherwise, all directories that belong to the current account are
     * returned.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <i>NextToken</i> request and response parameters. If more results are
     * available, the <i>DescribeDirectoriesResult.NextToken</i> member
     * contains a token that you pass in the next call to DescribeDirectories
     * to retrieve the next set of items.
     * </p>
     * <p>
     * You can also specify a maximum number of return results with the
     * <i>Limit</i> parameter.
     * </p>
     *
     * @param describeDirectoriesRequest Container for the necessary
     *           parameters to execute the DescribeDirectories service method on
     *           AWSDirectoryService.
     * 
     * @return The response from the DescribeDirectories service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws InvalidParameterException
     * @throws InvalidNextTokenException
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDirectoriesResult describeDirectories(DescribeDirectoriesRequest describeDirectoriesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeDirectoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDirectoriesRequest> request = null;
        Response<DescribeDirectoriesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDirectoriesRequestMarshaller().marshall(super.beforeMarshalling(describeDirectoriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DescribeDirectoriesResult, JsonUnmarshallerContext> unmarshaller =
                new DescribeDirectoriesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDirectoriesResult> responseHandler =
                new JsonResponseHandler<DescribeDirectoriesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an AD Connector to connect an on-premises directory.
     * </p>
     *
     * @param connectDirectoryRequest Container for the necessary parameters
     *           to execute the ConnectDirectory service method on AWSDirectoryService.
     * 
     * @return The response from the ConnectDirectory service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws InvalidParameterException
     * @throws DirectoryLimitExceededException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ConnectDirectoryResult connectDirectory(ConnectDirectoryRequest connectDirectoryRequest) {
        ExecutionContext executionContext = createExecutionContext(connectDirectoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConnectDirectoryRequest> request = null;
        Response<ConnectDirectoryResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConnectDirectoryRequestMarshaller().marshall(super.beforeMarshalling(connectDirectoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<ConnectDirectoryResult, JsonUnmarshallerContext> unmarshaller =
                new ConnectDirectoryResultJsonUnmarshaller();
            JsonResponseHandler<ConnectDirectoryResult> responseHandler =
                new JsonResponseHandler<ConnectDirectoryResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a snapshot of an existing directory.
     * </p>
     * <p>
     * You cannot take snapshots of extended or connected directories.
     * </p>
     *
     * @param createSnapshotRequest Container for the necessary parameters to
     *           execute the CreateSnapshot service method on AWSDirectoryService.
     * 
     * @return The response from the CreateSnapshot service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws InvalidParameterException
     * @throws EntityDoesNotExistException
     * @throws SnapshotLimitExceededException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateSnapshotResult createSnapshot(CreateSnapshotRequest createSnapshotRequest) {
        ExecutionContext executionContext = createExecutionContext(createSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSnapshotRequest> request = null;
        Response<CreateSnapshotResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSnapshotRequestMarshaller().marshall(super.beforeMarshalling(createSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<CreateSnapshotResult, JsonUnmarshallerContext> unmarshaller =
                new CreateSnapshotResultJsonUnmarshaller();
            JsonResponseHandler<CreateSnapshotResult> responseHandler =
                new JsonResponseHandler<CreateSnapshotResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes an AWS Directory Service directory.
     * </p>
     *
     * @param deleteDirectoryRequest Container for the necessary parameters
     *           to execute the DeleteDirectory service method on AWSDirectoryService.
     * 
     * @return The response from the DeleteDirectory service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteDirectoryResult deleteDirectory(DeleteDirectoryRequest deleteDirectoryRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteDirectoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDirectoryRequest> request = null;
        Response<DeleteDirectoryResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDirectoryRequestMarshaller().marshall(super.beforeMarshalling(deleteDirectoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DeleteDirectoryResult, JsonUnmarshallerContext> unmarshaller =
                new DeleteDirectoryResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDirectoryResult> responseHandler =
                new JsonResponseHandler<DeleteDirectoryResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Obtains directory limit information for the current region.
     * </p>
     *
     * @param getDirectoryLimitsRequest Container for the necessary
     *           parameters to execute the GetDirectoryLimits service method on
     *           AWSDirectoryService.
     * 
     * @return The response from the GetDirectoryLimits service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetDirectoryLimitsResult getDirectoryLimits(GetDirectoryLimitsRequest getDirectoryLimitsRequest) {
        ExecutionContext executionContext = createExecutionContext(getDirectoryLimitsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDirectoryLimitsRequest> request = null;
        Response<GetDirectoryLimitsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDirectoryLimitsRequestMarshaller().marshall(super.beforeMarshalling(getDirectoryLimitsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<GetDirectoryLimitsResult, JsonUnmarshallerContext> unmarshaller =
                new GetDirectoryLimitsResultJsonUnmarshaller();
            JsonResponseHandler<GetDirectoryLimitsResult> responseHandler =
                new JsonResponseHandler<GetDirectoryLimitsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Disables single-sign on for a directory.
     * </p>
     *
     * @param disableSsoRequest Container for the necessary parameters to
     *           execute the DisableSso service method on AWSDirectoryService.
     * 
     * @return The response from the DisableSso service method, as returned
     *         by AWSDirectoryService.
     * 
     * @throws InsufficientPermissionsException
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws AuthenticationFailedException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DisableSsoResult disableSso(DisableSsoRequest disableSsoRequest) {
        ExecutionContext executionContext = createExecutionContext(disableSsoRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableSsoRequest> request = null;
        Response<DisableSsoResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableSsoRequestMarshaller().marshall(super.beforeMarshalling(disableSsoRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DisableSsoResult, JsonUnmarshallerContext> unmarshaller =
                new DisableSsoResultJsonUnmarshaller();
            JsonResponseHandler<DisableSsoResult> responseHandler =
                new JsonResponseHandler<DisableSsoResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Enables multi-factor authentication (MFA) with Remote Authentication
     * Dial In User Service (RADIUS) for an AD Connector directory.
     * </p>
     *
     * @param enableRadiusRequest Container for the necessary parameters to
     *           execute the EnableRadius service method on AWSDirectoryService.
     * 
     * @return The response from the EnableRadius service method, as returned
     *         by AWSDirectoryService.
     * 
     * @throws InvalidParameterException
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws EntityAlreadyExistsException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EnableRadiusResult enableRadius(EnableRadiusRequest enableRadiusRequest) {
        ExecutionContext executionContext = createExecutionContext(enableRadiusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableRadiusRequest> request = null;
        Response<EnableRadiusResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableRadiusRequestMarshaller().marshall(super.beforeMarshalling(enableRadiusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<EnableRadiusResult, JsonUnmarshallerContext> unmarshaller =
                new EnableRadiusResultJsonUnmarshaller();
            JsonResponseHandler<EnableRadiusResult> responseHandler =
                new JsonResponseHandler<EnableRadiusResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a computer account in the specified directory, and joins the
     * computer to the directory.
     * </p>
     *
     * @param createComputerRequest Container for the necessary parameters to
     *           execute the CreateComputer service method on AWSDirectoryService.
     * 
     * @return The response from the CreateComputer service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws UnsupportedOperationException
     * @throws InvalidParameterException
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws DirectoryUnavailableException
     * @throws AuthenticationFailedException
     * @throws EntityAlreadyExistsException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateComputerResult createComputer(CreateComputerRequest createComputerRequest) {
        ExecutionContext executionContext = createExecutionContext(createComputerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateComputerRequest> request = null;
        Response<CreateComputerResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateComputerRequestMarshaller().marshall(super.beforeMarshalling(createComputerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<CreateComputerResult, JsonUnmarshallerContext> unmarshaller =
                new CreateComputerResultJsonUnmarshaller();
            JsonResponseHandler<CreateComputerResult> responseHandler =
                new JsonResponseHandler<CreateComputerResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Enables single-sign on for a directory.
     * </p>
     *
     * @param enableSsoRequest Container for the necessary parameters to
     *           execute the EnableSso service method on AWSDirectoryService.
     * 
     * @return The response from the EnableSso service method, as returned by
     *         AWSDirectoryService.
     * 
     * @throws InsufficientPermissionsException
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws AuthenticationFailedException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EnableSsoResult enableSso(EnableSsoRequest enableSsoRequest) {
        ExecutionContext executionContext = createExecutionContext(enableSsoRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableSsoRequest> request = null;
        Response<EnableSsoResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableSsoRequestMarshaller().marshall(super.beforeMarshalling(enableSsoRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<EnableSsoResult, JsonUnmarshallerContext> unmarshaller =
                new EnableSsoResultJsonUnmarshaller();
            JsonResponseHandler<EnableSsoResult> responseHandler =
                new JsonResponseHandler<EnableSsoResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a Simple AD directory.
     * </p>
     *
     * @param createDirectoryRequest Container for the necessary parameters
     *           to execute the CreateDirectory service method on AWSDirectoryService.
     * 
     * @return The response from the CreateDirectory service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws InvalidParameterException
     * @throws DirectoryLimitExceededException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateDirectoryResult createDirectory(CreateDirectoryRequest createDirectoryRequest) {
        ExecutionContext executionContext = createExecutionContext(createDirectoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDirectoryRequest> request = null;
        Response<CreateDirectoryResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDirectoryRequestMarshaller().marshall(super.beforeMarshalling(createDirectoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<CreateDirectoryResult, JsonUnmarshallerContext> unmarshaller =
                new CreateDirectoryResultJsonUnmarshaller();
            JsonResponseHandler<CreateDirectoryResult> responseHandler =
                new JsonResponseHandler<CreateDirectoryResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Restores a directory using an existing directory snapshot.
     * </p>
     * <p>
     * When you restore a directory from a snapshot, any changes made to the
     * directory after the snapshot date are overwritten.
     * </p>
     * <p>
     * This action returns as soon as the restore operation is initiated.
     * You can monitor the progress of the restore operation by calling the
     * DescribeDirectories operation with the directory identifier. When the
     * <b>DirectoryDescription.Stage</b> value changes to <code>Active</code>
     * , the restore operation is complete.
     * </p>
     *
     * @param restoreFromSnapshotRequest Container for the necessary
     *           parameters to execute the RestoreFromSnapshot service method on
     *           AWSDirectoryService.
     * 
     * @return The response from the RestoreFromSnapshot service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws InvalidParameterException
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RestoreFromSnapshotResult restoreFromSnapshot(RestoreFromSnapshotRequest restoreFromSnapshotRequest) {
        ExecutionContext executionContext = createExecutionContext(restoreFromSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreFromSnapshotRequest> request = null;
        Response<RestoreFromSnapshotResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreFromSnapshotRequestMarshaller().marshall(super.beforeMarshalling(restoreFromSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<RestoreFromSnapshotResult, JsonUnmarshallerContext> unmarshaller =
                new RestoreFromSnapshotResultJsonUnmarshaller();
            JsonResponseHandler<RestoreFromSnapshotResult> responseHandler =
                new JsonResponseHandler<RestoreFromSnapshotResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Disables multi-factor authentication (MFA) with Remote Authentication
     * Dial In User Service (RADIUS) for an AD Connector directory.
     * </p>
     *
     * @param disableRadiusRequest Container for the necessary parameters to
     *           execute the DisableRadius service method on AWSDirectoryService.
     * 
     * @return The response from the DisableRadius service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DisableRadiusResult disableRadius(DisableRadiusRequest disableRadiusRequest) {
        ExecutionContext executionContext = createExecutionContext(disableRadiusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableRadiusRequest> request = null;
        Response<DisableRadiusResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableRadiusRequestMarshaller().marshall(super.beforeMarshalling(disableRadiusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DisableRadiusResult, JsonUnmarshallerContext> unmarshaller =
                new DisableRadiusResultJsonUnmarshaller();
            JsonResponseHandler<DisableRadiusResult> responseHandler =
                new JsonResponseHandler<DisableRadiusResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Obtains the manual snapshot limits for a directory.
     * </p>
     *
     * @param getSnapshotLimitsRequest Container for the necessary parameters
     *           to execute the GetSnapshotLimits service method on
     *           AWSDirectoryService.
     * 
     * @return The response from the GetSnapshotLimits service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetSnapshotLimitsResult getSnapshotLimits(GetSnapshotLimitsRequest getSnapshotLimitsRequest) {
        ExecutionContext executionContext = createExecutionContext(getSnapshotLimitsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSnapshotLimitsRequest> request = null;
        Response<GetSnapshotLimitsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSnapshotLimitsRequestMarshaller().marshall(super.beforeMarshalling(getSnapshotLimitsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<GetSnapshotLimitsResult, JsonUnmarshallerContext> unmarshaller =
                new GetSnapshotLimitsResultJsonUnmarshaller();
            JsonResponseHandler<GetSnapshotLimitsResult> responseHandler =
                new JsonResponseHandler<GetSnapshotLimitsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Obtains information about the directory snapshots that belong to this
     * account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <i>NextToken</i> request and response parameters. If more results are
     * available, the <i>DescribeSnapshots.NextToken</i> member contains a
     * token that you pass in the next call to DescribeSnapshots to retrieve
     * the next set of items.
     * </p>
     * <p>
     * You can also specify a maximum number of return results with the
     * <i>Limit</i> parameter.
     * </p>
     * 
     * @return The response from the DescribeSnapshots service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws InvalidParameterException
     * @throws InvalidNextTokenException
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSnapshotsResult describeSnapshots() throws AmazonServiceException, AmazonClientException {
        return describeSnapshots(new DescribeSnapshotsRequest());
    }
    
    /**
     * <p>
     * Obtains information about the directories that belong to this
     * account.
     * </p>
     * <p>
     * You can retrieve information about specific directories by passing
     * the directory identifiers in the <i>DirectoryIds</i> parameter.
     * Otherwise, all directories that belong to the current account are
     * returned.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <i>NextToken</i> request and response parameters. If more results are
     * available, the <i>DescribeDirectoriesResult.NextToken</i> member
     * contains a token that you pass in the next call to DescribeDirectories
     * to retrieve the next set of items.
     * </p>
     * <p>
     * You can also specify a maximum number of return results with the
     * <i>Limit</i> parameter.
     * </p>
     * 
     * @return The response from the DescribeDirectories service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws InvalidParameterException
     * @throws InvalidNextTokenException
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDirectoriesResult describeDirectories() throws AmazonServiceException, AmazonClientException {
        return describeDirectories(new DescribeDirectoriesRequest());
    }
    
    /**
     * <p>
     * Obtains directory limit information for the current region.
     * </p>
     * 
     * @return The response from the GetDirectoryLimits service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetDirectoryLimitsResult getDirectoryLimits() throws AmazonServiceException, AmazonClientException {
        return getDirectoryLimits(new GetDirectoryLimitsRequest());
    }

    @Override
    public void setEndpoint(String endpoint) {
        super.setEndpoint(endpoint);
    }

    @Override
    public void setEndpoint(String endpoint, String serviceName, String regionId) throws IllegalArgumentException {
        super.setEndpoint(endpoint, serviceName, regionId);
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(jsonErrorUnmarshallers);
        Response<X> result = client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        return result;
    }
}
        