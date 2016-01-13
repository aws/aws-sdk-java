/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.directory.model.*;
import com.amazonaws.services.directory.model.transform.*;

/**
 * Client for accessing Directory Service. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS Directory Service</fullname>
 * <p>
 * This is the <i>AWS Directory Service API Reference</i>. This guide provides
 * detailed information about AWS Directory Service operations, data types,
 * parameters, and errors.
 * </p>
 */
public class AWSDirectoryServiceClient extends AmazonWebServiceClient implements
        AWSDirectoryService {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSDirectoryService.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "ds";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "ds";

    /**
     * List of exception unmarshallers for all Directory Service exceptions.
     */
    protected List<JsonErrorUnmarshallerV2> jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshallerV2>();

    /**
     * Constructs a new client to invoke service methods on Directory Service. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSDirectoryServiceClient() {
        this(new DefaultAWSCredentialsProviderChain(),
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Directory Service. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Directory Service (ex: proxy settings, retry counts,
     *        etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSDirectoryServiceClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Directory Service
     * using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     */
    public AWSDirectoryServiceClient(AWSCredentials awsCredentials) {
        this(awsCredentials, com.amazonaws.PredefinedClientConfigurations
                .defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Directory Service
     * using the specified AWS account credentials and client configuration
     * options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Directory Service (ex: proxy settings, retry counts,
     *        etc.).
     */
    public AWSDirectoryServiceClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Directory Service
     * using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     */
    public AWSDirectoryServiceClient(
            AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider,
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Directory Service
     * using the specified AWS account credentials provider and client
     * configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Directory Service (ex: proxy settings, retry counts,
     *        etc.).
     */
    public AWSDirectoryServiceClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Directory Service
     * using the specified AWS account credentials provider, client
     * configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Directory Service (ex: proxy settings, retry counts,
     *        etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AWSDirectoryServiceClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.directory.model.InvalidNextTokenException.class,
                        "InvalidNextTokenException"));
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshallerV2(
                com.amazonaws.services.directory.model.ServiceException.class,
                "ServiceException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.directory.model.InvalidParameterException.class,
                        "InvalidParameterException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.directory.model.EntityAlreadyExistsException.class,
                        "EntityAlreadyExistsException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.directory.model.SnapshotLimitExceededException.class,
                        "SnapshotLimitExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.directory.model.UnsupportedOperationException.class,
                        "UnsupportedOperationException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.directory.model.EntityDoesNotExistException.class,
                        "EntityDoesNotExistException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.directory.model.InsufficientPermissionsException.class,
                        "InsufficientPermissionsException"));
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshallerV2(
                com.amazonaws.services.directory.model.ClientException.class,
                "ClientException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.directory.model.DirectoryLimitExceededException.class,
                        "DirectoryLimitExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.directory.model.AuthenticationFailedException.class,
                        "AuthenticationFailedException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.directory.model.DirectoryUnavailableException.class,
                        "DirectoryUnavailableException"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://ds.us-east-1.amazonaws.com");
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/directory/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/directory/request.handler2s"));
    }

    /**
     * <p>
     * Creates an AD Connector to connect to an on-premises directory.
     * </p>
     * 
     * @param connectDirectoryRequest
     *        Contains the inputs for the <a>ConnectDirectory</a> operation.
     * @return Result of the ConnectDirectory operation returned by the service.
     * @throws DirectoryLimitExceededException
     *         The maximum number of directories in the region has been reached.
     *         You can use the <a>GetDirectoryLimits</a> operation to determine
     *         your directory limits in the region.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.ConnectDirectory
     */
    @Override
    public ConnectDirectoryResult connectDirectory(
            ConnectDirectoryRequest connectDirectoryRequest) {
        ExecutionContext executionContext = createExecutionContext(connectDirectoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConnectDirectoryRequest> request = null;
        Response<ConnectDirectoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConnectDirectoryRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(connectDirectoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ConnectDirectoryResult> responseHandler = new JsonResponseHandler<ConnectDirectoryResult>(
                    new ConnectDirectoryResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an alias for a directory and assigns the alias to the directory.
     * The alias is used to construct the access URL for the directory, such as
     * <code>http://<![CDATA[&#x3C;]]>alias<![CDATA[&#x3E;]]>.awsapps.com</code>
     * .
     * </p>
     * <important>
     * <p>
     * After an alias has been created, it cannot be deleted or reused, so this
     * operation should only be used when absolutely necessary.
     * </p>
     * </important>
     * 
     * @param createAliasRequest
     *        Contains the inputs for the <a>CreateAlias</a> operation.
     * @return Result of the CreateAlias operation returned by the service.
     * @throws EntityAlreadyExistsException
     *         The specified entity already exists.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.CreateAlias
     */
    @Override
    public CreateAliasResult createAlias(CreateAliasRequest createAliasRequest) {
        ExecutionContext executionContext = createExecutionContext(createAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAliasRequest> request = null;
        Response<CreateAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAliasRequestMarshaller().marshall(super
                        .beforeMarshalling(createAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateAliasResult> responseHandler = new JsonResponseHandler<CreateAliasResult>(
                    new CreateAliasResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a computer account in the specified directory, and joins the
     * computer to the directory.
     * </p>
     * 
     * @param createComputerRequest
     *        Contains the inputs for the <a>CreateComputer</a> operation.
     * @return Result of the CreateComputer operation returned by the service.
     * @throws AuthenticationFailedException
     *         An authentication error occurred.
     * @throws DirectoryUnavailableException
     *         The specified directory is unavailable or could not be found.
     * @throws EntityAlreadyExistsException
     *         The specified entity already exists.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.CreateComputer
     */
    @Override
    public CreateComputerResult createComputer(
            CreateComputerRequest createComputerRequest) {
        ExecutionContext executionContext = createExecutionContext(createComputerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateComputerRequest> request = null;
        Response<CreateComputerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateComputerRequestMarshaller().marshall(super
                        .beforeMarshalling(createComputerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateComputerResult> responseHandler = new JsonResponseHandler<CreateComputerResult>(
                    new CreateComputerResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a Simple AD directory.
     * </p>
     * 
     * @param createDirectoryRequest
     *        Contains the inputs for the <a>CreateDirectory</a> operation.
     * @return Result of the CreateDirectory operation returned by the service.
     * @throws DirectoryLimitExceededException
     *         The maximum number of directories in the region has been reached.
     *         You can use the <a>GetDirectoryLimits</a> operation to determine
     *         your directory limits in the region.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.CreateDirectory
     */
    @Override
    public CreateDirectoryResult createDirectory(
            CreateDirectoryRequest createDirectoryRequest) {
        ExecutionContext executionContext = createExecutionContext(createDirectoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDirectoryRequest> request = null;
        Response<CreateDirectoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDirectoryRequestMarshaller().marshall(super
                        .beforeMarshalling(createDirectoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateDirectoryResult> responseHandler = new JsonResponseHandler<CreateDirectoryResult>(
                    new CreateDirectoryResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Creates a Microsoft AD in the AWS cloud.
     * 
     * @param createMicrosoftADRequest
     *        Creates a Microsoft AD in the AWS cloud.
     * @return Result of the CreateMicrosoftAD operation returned by the
     *         service.
     * @throws DirectoryLimitExceededException
     *         The maximum number of directories in the region has been reached.
     *         You can use the <a>GetDirectoryLimits</a> operation to determine
     *         your directory limits in the region.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @sample AWSDirectoryService.CreateMicrosoftAD
     */
    @Override
    public CreateMicrosoftADResult createMicrosoftAD(
            CreateMicrosoftADRequest createMicrosoftADRequest) {
        ExecutionContext executionContext = createExecutionContext(createMicrosoftADRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMicrosoftADRequest> request = null;
        Response<CreateMicrosoftADResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMicrosoftADRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createMicrosoftADRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateMicrosoftADResult> responseHandler = new JsonResponseHandler<CreateMicrosoftADResult>(
                    new CreateMicrosoftADResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a snapshot of a Simple AD or Microsoft AD directory in the AWS
     * cloud.
     * </p>
     * <note>
     * <p>
     * You cannot take snapshots of AD Connector directories.
     * </p>
     * </note>
     * 
     * @param createSnapshotRequest
     *        Contains the inputs for the <a>CreateSnapshot</a> operation.
     * @return Result of the CreateSnapshot operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws SnapshotLimitExceededException
     *         The maximum number of manual snapshots for the directory has been
     *         reached. You can use the <a>GetSnapshotLimits</a> operation to
     *         determine the snapshot limits for a directory.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.CreateSnapshot
     */
    @Override
    public CreateSnapshotResult createSnapshot(
            CreateSnapshotRequest createSnapshotRequest) {
        ExecutionContext executionContext = createExecutionContext(createSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSnapshotRequest> request = null;
        Response<CreateSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSnapshotRequestMarshaller().marshall(super
                        .beforeMarshalling(createSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateSnapshotResult> responseHandler = new JsonResponseHandler<CreateSnapshotResult>(
                    new CreateSnapshotResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * AWS Directory Service for Microsoft Active Directory allows you to
     * configure trust relationships. For example, you can establish a trust
     * between your Microsoft AD in the AWS cloud, and your existing on-premises
     * Microsoft Active Directory. This would allow you to provide users and
     * groups access to resources in either domain, with a single set of
     * credentials.
     * </p>
     * <p>
     * This action initiates the creation of the AWS side of a trust
     * relationship between a Microsoft AD in the AWS cloud and an external
     * domain.
     * </p>
     * 
     * @param createTrustRequest
     *        AWS Directory Service for Microsoft Active Directory allows you to
     *        configure trust relationships. For example, you can establish a
     *        trust between your Microsoft AD in the AWS cloud, and your
     *        existing on-premises Microsoft Active Directory. This would allow
     *        you to provide users and groups access to resources in either
     *        domain, with a single set of credentials.</p>
     *        <p>
     *        This action initiates the creation of the AWS side of a trust
     *        relationship between a Microsoft AD in the AWS cloud and an
     *        external domain.
     * @return Result of the CreateTrust operation returned by the service.
     * @throws EntityAlreadyExistsException
     *         The specified entity already exists.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @sample AWSDirectoryService.CreateTrust
     */
    @Override
    public CreateTrustResult createTrust(CreateTrustRequest createTrustRequest) {
        ExecutionContext executionContext = createExecutionContext(createTrustRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTrustRequest> request = null;
        Response<CreateTrustResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTrustRequestMarshaller().marshall(super
                        .beforeMarshalling(createTrustRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateTrustResult> responseHandler = new JsonResponseHandler<CreateTrustResult>(
                    new CreateTrustResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an AWS Directory Service directory.
     * </p>
     * 
     * @param deleteDirectoryRequest
     *        Contains the inputs for the <a>DeleteDirectory</a> operation.
     * @return Result of the DeleteDirectory operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DeleteDirectory
     */
    @Override
    public DeleteDirectoryResult deleteDirectory(
            DeleteDirectoryRequest deleteDirectoryRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteDirectoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDirectoryRequest> request = null;
        Response<DeleteDirectoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDirectoryRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteDirectoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteDirectoryResult> responseHandler = new JsonResponseHandler<DeleteDirectoryResult>(
                    new DeleteDirectoryResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a directory snapshot.
     * </p>
     * 
     * @param deleteSnapshotRequest
     *        Contains the inputs for the <a>DeleteSnapshot</a> operation.
     * @return Result of the DeleteSnapshot operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DeleteSnapshot
     */
    @Override
    public DeleteSnapshotResult deleteSnapshot(
            DeleteSnapshotRequest deleteSnapshotRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSnapshotRequest> request = null;
        Response<DeleteSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSnapshotRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteSnapshotResult> responseHandler = new JsonResponseHandler<DeleteSnapshotResult>(
                    new DeleteSnapshotResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Deletes an existing trust relationship between your Microsoft AD in the
     * AWS cloud and an external domain.
     * 
     * @param deleteTrustRequest
     *        Deletes the local side of an existing trust relationship between
     *        the Microsoft AD in the AWS cloud and the external domain.
     * @return Result of the DeleteTrust operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @sample AWSDirectoryService.DeleteTrust
     */
    @Override
    public DeleteTrustResult deleteTrust(DeleteTrustRequest deleteTrustRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteTrustRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTrustRequest> request = null;
        Response<DeleteTrustResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTrustRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteTrustRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteTrustResult> responseHandler = new JsonResponseHandler<DeleteTrustResult>(
                    new DeleteTrustResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Obtains information about the directories that belong to this account.
     * </p>
     * <p>
     * You can retrieve information about specific directories by passing the
     * directory identifiers in the <i>DirectoryIds</i> parameter. Otherwise,
     * all directories that belong to the current account are returned.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <i>NextToken</i>
     * request and response parameters. If more results are available, the
     * <i>DescribeDirectoriesResult.NextToken</i> member contains a token that
     * you pass in the next call to <a>DescribeDirectories</a> to retrieve the
     * next set of items.
     * </p>
     * <p>
     * You can also specify a maximum number of return results with the
     * <i>Limit</i> parameter.
     * </p>
     * 
     * @param describeDirectoriesRequest
     *        Contains the inputs for the <a>DescribeDirectories</a> operation.
     * @return Result of the DescribeDirectories operation returned by the
     *         service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws InvalidNextTokenException
     *         The <i>NextToken</i> value is not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DescribeDirectories
     */
    @Override
    public DescribeDirectoriesResult describeDirectories(
            DescribeDirectoriesRequest describeDirectoriesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeDirectoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDirectoriesRequest> request = null;
        Response<DescribeDirectoriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDirectoriesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeDirectoriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeDirectoriesResult> responseHandler = new JsonResponseHandler<DescribeDirectoriesResult>(
                    new DescribeDirectoriesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeDirectoriesResult describeDirectories() {
        return describeDirectories(new DescribeDirectoriesRequest());
    }

    /**
     * <p>
     * Obtains information about the directory snapshots that belong to this
     * account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <i>NextToken</i>
     * request and response parameters. If more results are available, the
     * <i>DescribeSnapshots.NextToken</i> member contains a token that you pass
     * in the next call to <a>DescribeSnapshots</a> to retrieve the next set of
     * items.
     * </p>
     * <p>
     * You can also specify a maximum number of return results with the
     * <i>Limit</i> parameter.
     * </p>
     * 
     * @param describeSnapshotsRequest
     *        Contains the inputs for the <a>DescribeSnapshots</a> operation.
     * @return Result of the DescribeSnapshots operation returned by the
     *         service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws InvalidNextTokenException
     *         The <i>NextToken</i> value is not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DescribeSnapshots
     */
    @Override
    public DescribeSnapshotsResult describeSnapshots(
            DescribeSnapshotsRequest describeSnapshotsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSnapshotsRequest> request = null;
        Response<DescribeSnapshotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSnapshotsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeSnapshotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeSnapshotsResult> responseHandler = new JsonResponseHandler<DescribeSnapshotsResult>(
                    new DescribeSnapshotsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeSnapshotsResult describeSnapshots() {
        return describeSnapshots(new DescribeSnapshotsRequest());
    }

    /**
     * <p>
     * Obtains information about the trust relationships for this account.
     * </p>
     * <p>
     * If no input parameters are provided, such as DirectoryId or TrustIds,
     * this request describes all the trust relationships belonging to the
     * account.
     * </p>
     * 
     * @param describeTrustsRequest
     *        Describes the trust relationships for a particular Microsoft AD in
     *        the AWS cloud. If no input parameters are are provided, such as
     *        directory ID or trust ID, this request describes all the trust
     *        relationships.
     * @return Result of the DescribeTrusts operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidNextTokenException
     *         The <i>NextToken</i> value is not valid.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @sample AWSDirectoryService.DescribeTrusts
     */
    @Override
    public DescribeTrustsResult describeTrusts(
            DescribeTrustsRequest describeTrustsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeTrustsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTrustsRequest> request = null;
        Response<DescribeTrustsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTrustsRequestMarshaller().marshall(super
                        .beforeMarshalling(describeTrustsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeTrustsResult> responseHandler = new JsonResponseHandler<DescribeTrustsResult>(
                    new DescribeTrustsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables multi-factor authentication (MFA) with the Remote Authentication
     * Dial In User Service (RADIUS) server for an AD Connector directory.
     * </p>
     * 
     * @param disableRadiusRequest
     *        Contains the inputs for the <a>DisableRadius</a> operation.
     * @return Result of the DisableRadius operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DisableRadius
     */
    @Override
    public DisableRadiusResult disableRadius(
            DisableRadiusRequest disableRadiusRequest) {
        ExecutionContext executionContext = createExecutionContext(disableRadiusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableRadiusRequest> request = null;
        Response<DisableRadiusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableRadiusRequestMarshaller().marshall(super
                        .beforeMarshalling(disableRadiusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DisableRadiusResult> responseHandler = new JsonResponseHandler<DisableRadiusResult>(
                    new DisableRadiusResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables single-sign on for a directory.
     * </p>
     * 
     * @param disableSsoRequest
     *        Contains the inputs for the <a>DisableSso</a> operation.
     * @return Result of the DisableSso operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InsufficientPermissionsException
     *         The account does not have sufficient permission to perform the
     *         operation.
     * @throws AuthenticationFailedException
     *         An authentication error occurred.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DisableSso
     */
    @Override
    public DisableSsoResult disableSso(DisableSsoRequest disableSsoRequest) {
        ExecutionContext executionContext = createExecutionContext(disableSsoRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableSsoRequest> request = null;
        Response<DisableSsoResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableSsoRequestMarshaller().marshall(super
                        .beforeMarshalling(disableSsoRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DisableSsoResult> responseHandler = new JsonResponseHandler<DisableSsoResult>(
                    new DisableSsoResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables multi-factor authentication (MFA) with the Remote Authentication
     * Dial In User Service (RADIUS) server for an AD Connector directory.
     * </p>
     * 
     * @param enableRadiusRequest
     *        Contains the inputs for the <a>EnableRadius</a> operation.
     * @return Result of the EnableRadius operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws EntityAlreadyExistsException
     *         The specified entity already exists.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.EnableRadius
     */
    @Override
    public EnableRadiusResult enableRadius(
            EnableRadiusRequest enableRadiusRequest) {
        ExecutionContext executionContext = createExecutionContext(enableRadiusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableRadiusRequest> request = null;
        Response<EnableRadiusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableRadiusRequestMarshaller().marshall(super
                        .beforeMarshalling(enableRadiusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<EnableRadiusResult> responseHandler = new JsonResponseHandler<EnableRadiusResult>(
                    new EnableRadiusResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables single-sign on for a directory.
     * </p>
     * 
     * @param enableSsoRequest
     *        Contains the inputs for the <a>EnableSso</a> operation.
     * @return Result of the EnableSso operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InsufficientPermissionsException
     *         The account does not have sufficient permission to perform the
     *         operation.
     * @throws AuthenticationFailedException
     *         An authentication error occurred.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.EnableSso
     */
    @Override
    public EnableSsoResult enableSso(EnableSsoRequest enableSsoRequest) {
        ExecutionContext executionContext = createExecutionContext(enableSsoRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableSsoRequest> request = null;
        Response<EnableSsoResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableSsoRequestMarshaller().marshall(super
                        .beforeMarshalling(enableSsoRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<EnableSsoResult> responseHandler = new JsonResponseHandler<EnableSsoResult>(
                    new EnableSsoResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Obtains directory limit information for the current region.
     * </p>
     * 
     * @param getDirectoryLimitsRequest
     *        Contains the inputs for the <a>GetDirectoryLimits</a> operation.
     * @return Result of the GetDirectoryLimits operation returned by the
     *         service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.GetDirectoryLimits
     */
    @Override
    public GetDirectoryLimitsResult getDirectoryLimits(
            GetDirectoryLimitsRequest getDirectoryLimitsRequest) {
        ExecutionContext executionContext = createExecutionContext(getDirectoryLimitsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDirectoryLimitsRequest> request = null;
        Response<GetDirectoryLimitsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDirectoryLimitsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getDirectoryLimitsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetDirectoryLimitsResult> responseHandler = new JsonResponseHandler<GetDirectoryLimitsResult>(
                    new GetDirectoryLimitsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public GetDirectoryLimitsResult getDirectoryLimits() {
        return getDirectoryLimits(new GetDirectoryLimitsRequest());
    }

    /**
     * <p>
     * Obtains the manual snapshot limits for a directory.
     * </p>
     * 
     * @param getSnapshotLimitsRequest
     *        Contains the inputs for the <a>GetSnapshotLimits</a> operation.
     * @return Result of the GetSnapshotLimits operation returned by the
     *         service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.GetSnapshotLimits
     */
    @Override
    public GetSnapshotLimitsResult getSnapshotLimits(
            GetSnapshotLimitsRequest getSnapshotLimitsRequest) {
        ExecutionContext executionContext = createExecutionContext(getSnapshotLimitsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSnapshotLimitsRequest> request = null;
        Response<GetSnapshotLimitsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSnapshotLimitsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getSnapshotLimitsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetSnapshotLimitsResult> responseHandler = new JsonResponseHandler<GetSnapshotLimitsResult>(
                    new GetSnapshotLimitsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
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
     * This action returns as soon as the restore operation is initiated. You
     * can monitor the progress of the restore operation by calling the
     * <a>DescribeDirectories</a> operation with the directory identifier. When
     * the <b>DirectoryDescription.Stage</b> value changes to
     * <code>Active</code>, the restore operation is complete.
     * </p>
     * 
     * @param restoreFromSnapshotRequest
     *        An object representing the inputs for the
     *        <a>RestoreFromSnapshot</a> operation.
     * @return Result of the RestoreFromSnapshot operation returned by the
     *         service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.RestoreFromSnapshot
     */
    @Override
    public RestoreFromSnapshotResult restoreFromSnapshot(
            RestoreFromSnapshotRequest restoreFromSnapshotRequest) {
        ExecutionContext executionContext = createExecutionContext(restoreFromSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreFromSnapshotRequest> request = null;
        Response<RestoreFromSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreFromSnapshotRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(restoreFromSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<RestoreFromSnapshotResult> responseHandler = new JsonResponseHandler<RestoreFromSnapshotResult>(
                    new RestoreFromSnapshotResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the Remote Authentication Dial In User Service (RADIUS) server
     * information for an AD Connector directory.
     * </p>
     * 
     * @param updateRadiusRequest
     *        Contains the inputs for the <a>UpdateRadius</a> operation.
     * @return Result of the UpdateRadius operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.UpdateRadius
     */
    @Override
    public UpdateRadiusResult updateRadius(
            UpdateRadiusRequest updateRadiusRequest) {
        ExecutionContext executionContext = createExecutionContext(updateRadiusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRadiusRequest> request = null;
        Response<UpdateRadiusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRadiusRequestMarshaller().marshall(super
                        .beforeMarshalling(updateRadiusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateRadiusResult> responseHandler = new JsonResponseHandler<UpdateRadiusResult>(
                    new UpdateRadiusResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * AWS Directory Service for Microsoft Active Directory allows you to
     * configure and verify trust relationships.
     * </p>
     * <p>
     * This action verifies a trust relationship between your Microsoft AD in
     * the AWS cloud and an external domain.
     * </p>
     * 
     * @param verifyTrustRequest
     *        Initiates the verification of an existing trust relationship
     *        between a Microsoft AD in the AWS cloud and an external domain.
     * @return Result of the VerifyTrust operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @sample AWSDirectoryService.VerifyTrust
     */
    @Override
    public VerifyTrustResult verifyTrust(VerifyTrustRequest verifyTrustRequest) {
        ExecutionContext executionContext = createExecutionContext(verifyTrustRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<VerifyTrustRequest> request = null;
        Response<VerifyTrustResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new VerifyTrustRequestMarshaller().marshall(super
                        .beforeMarshalling(verifyTrustRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<VerifyTrustResult> responseHandler = new JsonResponseHandler<VerifyTrustResult>(
                    new VerifyTrustResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful,
     * request, typically used for debugging issues where a service isn't acting
     * as expected. This data isn't considered part of the result data returned
     * by an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(
            AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(
            Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null
                && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);

        JsonErrorResponseHandlerV2 errorResponseHandler = new JsonErrorResponseHandlerV2(
                jsonErrorUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

}
