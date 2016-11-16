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
package com.amazonaws.services.directory;

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

import com.amazonaws.services.directory.model.*;
import com.amazonaws.services.directory.model.transform.*;

/**
 * Client for accessing Directory Service. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname>AWS Directory Service</fullname>
 * <p>
 * This is the <i>AWS Directory Service API Reference</i>. This guide provides detailed information about AWS Directory
 * Service operations, data types, parameters, and errors.
 * </p>
 */
@ThreadSafe
public class AWSDirectoryServiceClient extends AmazonWebServiceClient implements AWSDirectoryService {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSDirectoryService.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "ds";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(new JsonClientMetadata()
            .withProtocolVersion("1.1")
            .withSupportsCbor(false)
            .withSupportsIon(false)
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("DirectoryUnavailableException").withModeledClass(
                            com.amazonaws.services.directory.model.DirectoryUnavailableException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withModeledClass(
                            com.amazonaws.services.directory.model.InvalidParameterException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ServiceException").withModeledClass(
                            com.amazonaws.services.directory.model.ServiceException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("SnapshotLimitExceededException").withModeledClass(
                            com.amazonaws.services.directory.model.SnapshotLimitExceededException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("EntityAlreadyExistsException").withModeledClass(
                            com.amazonaws.services.directory.model.EntityAlreadyExistsException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("EntityDoesNotExistException").withModeledClass(
                            com.amazonaws.services.directory.model.EntityDoesNotExistException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("DirectoryLimitExceededException").withModeledClass(
                            com.amazonaws.services.directory.model.DirectoryLimitExceededException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withModeledClass(
                            com.amazonaws.services.directory.model.InvalidNextTokenException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("UnsupportedOperationException").withModeledClass(
                            com.amazonaws.services.directory.model.UnsupportedOperationException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ClientException")
                            .withModeledClass(com.amazonaws.services.directory.model.ClientException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("IpRouteLimitExceededException").withModeledClass(
                            com.amazonaws.services.directory.model.IpRouteLimitExceededException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("AuthenticationFailedException").withModeledClass(
                            com.amazonaws.services.directory.model.AuthenticationFailedException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InsufficientPermissionsException").withModeledClass(
                            com.amazonaws.services.directory.model.InsufficientPermissionsException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("TagLimitExceededException").withModeledClass(
                            com.amazonaws.services.directory.model.TagLimitExceededException.class))
            .withBaseServiceExceptionClass(com.amazonaws.services.directory.model.AWSDirectoryServiceException.class));

    /**
     * Constructs a new client to invoke service methods on Directory Service. A credentials provider chain will be used
     * that searches for credentials in this order:
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
    public AWSDirectoryServiceClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Directory Service. A credentials provider chain will be used
     * that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Directory Service (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSDirectoryServiceClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Directory Service using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     */
    public AWSDirectoryServiceClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Directory Service using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Directory Service (ex: proxy
     *        settings, retry counts, etc.).
     */
    public AWSDirectoryServiceClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Directory Service using the specified AWS account
     * credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     */
    public AWSDirectoryServiceClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Directory Service using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Directory Service (ex: proxy
     *        settings, retry counts, etc.).
     */
    public AWSDirectoryServiceClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Directory Service using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Directory Service (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AWSDirectoryServiceClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Directory Service using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSDirectoryServiceClient(AwsSyncClientParams clientParams) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://ds.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/directory/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/directory/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * If the DNS server for your on-premises domain uses a publicly addressable IP address, you must add a CIDR address
     * block to correctly route traffic to and from your Microsoft AD on Amazon Web Services. <i>AddIpRoutes</i> adds
     * this address block. You can also use <i>AddIpRoutes</i> to facilitate routing traffic that uses public IP ranges
     * from your Microsoft AD on AWS to a peer VPC.
     * </p>
     * <p>
     * Before you call <i>AddIpRoutes</i>, ensure that all of the required permissions have been explicitly granted
     * through a policy. For details about what permissions are required to run the <i>AddIpRoutes</i> operation, see <a
     * href
     * ="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/UsingWithDS_IAM_ResourcePermissions.html">AWS
     * Directory Service API Permissions: Actions, Resources, and Conditions Reference</a>.
     * </p>
     * 
     * @param addIpRoutesRequest
     * @return Result of the AddIpRoutes operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws EntityAlreadyExistsException
     *         The specified entity already exists.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws DirectoryUnavailableException
     *         The specified directory is unavailable or could not be found.
     * @throws IpRouteLimitExceededException
     *         The maximum allowed number of IP addresses was exceeded. The default limit is 100 IP address blocks.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.AddIpRoutes
     */
    @Override
    public AddIpRoutesResult addIpRoutes(AddIpRoutesRequest addIpRoutesRequest) {
        ExecutionContext executionContext = createExecutionContext(addIpRoutesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddIpRoutesRequest> request = null;
        Response<AddIpRoutesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddIpRoutesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(addIpRoutesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddIpRoutesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddIpRoutesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified Amazon Directory Services directory. Each directory can
     * have a maximum of 50 tags. Each tag consists of a key and optional value. Tag keys must be unique to each
     * resource.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @return Result of the AddTagsToResource operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws TagLimitExceededException
     *         The maximum allowed number of tags was exceeded.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.AddTagsToResource
     */
    @Override
    public AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest addTagsToResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(addTagsToResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsToResourceRequest> request = null;
        Response<AddTagsToResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsToResourceRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(addTagsToResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddTagsToResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddTagsToResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels an in-progress schema extension to a Microsoft AD directory. Once a schema extension has started
     * replicating to all domain controllers, the task can no longer be canceled. A schema extension can be canceled
     * during any of the following states; <code>Initializing</code>, <code>CreatingSnapshot</code>, and
     * <code>UpdatingSchema</code>.
     * </p>
     * 
     * @param cancelSchemaExtensionRequest
     * @return Result of the CancelSchemaExtension operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.CancelSchemaExtension
     */
    @Override
    public CancelSchemaExtensionResult cancelSchemaExtension(CancelSchemaExtensionRequest cancelSchemaExtensionRequest) {
        ExecutionContext executionContext = createExecutionContext(cancelSchemaExtensionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelSchemaExtensionRequest> request = null;
        Response<CancelSchemaExtensionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelSchemaExtensionRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelSchemaExtensionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelSchemaExtensionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CancelSchemaExtensionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an AD Connector to connect to an on-premises directory.
     * </p>
     * <p>
     * Before you call <i>ConnectDirectory</i>, ensure that all of the required permissions have been explicitly granted
     * through a policy. For details about what permissions are required to run the <i>ConnectDirectory</i> operation,
     * see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/UsingWithDS_IAM_ResourcePermissions.html"
     * >AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference</a>.
     * </p>
     * 
     * @param connectDirectoryRequest
     *        Contains the inputs for the <a>ConnectDirectory</a> operation.
     * @return Result of the ConnectDirectory operation returned by the service.
     * @throws DirectoryLimitExceededException
     *         The maximum number of directories in the region has been reached. You can use the
     *         <a>GetDirectoryLimits</a> operation to determine your directory limits in the region.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.ConnectDirectory
     */
    @Override
    public ConnectDirectoryResult connectDirectory(ConnectDirectoryRequest connectDirectoryRequest) {
        ExecutionContext executionContext = createExecutionContext(connectDirectoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConnectDirectoryRequest> request = null;
        Response<ConnectDirectoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConnectDirectoryRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(connectDirectoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ConnectDirectoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ConnectDirectoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an alias for a directory and assigns the alias to the directory. The alias is used to construct the
     * access URL for the directory, such as <code>http://&lt;alias&gt;.awsapps.com</code>.
     * </p>
     * <important>
     * <p>
     * After an alias has been created, it cannot be deleted or reused, so this operation should only be used when
     * absolutely necessary.
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
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAliasRequest> request = null;
        Response<CreateAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAliasRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a computer account in the specified directory, and joins the computer to the directory.
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
    public CreateComputerResult createComputer(CreateComputerRequest createComputerRequest) {
        ExecutionContext executionContext = createExecutionContext(createComputerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateComputerRequest> request = null;
        Response<CreateComputerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateComputerRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createComputerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateComputerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateComputerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a conditional forwarder associated with your AWS directory. Conditional forwarders are required in order
     * to set up a trust relationship with another domain. The conditional forwarder points to the trusted domain.
     * </p>
     * 
     * @param createConditionalForwarderRequest
     *        Initiates the creation of a conditional forwarder for your AWS Directory Service for Microsoft Active
     *        Directory. Conditional forwarders are required in order to set up a trust relationship with another
     *        domain.
     * @return Result of the CreateConditionalForwarder operation returned by the service.
     * @throws EntityAlreadyExistsException
     *         The specified entity already exists.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws DirectoryUnavailableException
     *         The specified directory is unavailable or could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.CreateConditionalForwarder
     */
    @Override
    public CreateConditionalForwarderResult createConditionalForwarder(CreateConditionalForwarderRequest createConditionalForwarderRequest) {
        ExecutionContext executionContext = createExecutionContext(createConditionalForwarderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConditionalForwarderRequest> request = null;
        Response<CreateConditionalForwarderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConditionalForwarderRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createConditionalForwarderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateConditionalForwarderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateConditionalForwarderResultJsonUnmarshaller());
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
     * <p>
     * Before you call <i>CreateDirectory</i>, ensure that all of the required permissions have been explicitly granted
     * through a policy. For details about what permissions are required to run the <i>CreateDirectory</i> operation,
     * see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/UsingWithDS_IAM_ResourcePermissions.html"
     * >AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference</a>.
     * </p>
     * 
     * @param createDirectoryRequest
     *        Contains the inputs for the <a>CreateDirectory</a> operation.
     * @return Result of the CreateDirectory operation returned by the service.
     * @throws DirectoryLimitExceededException
     *         The maximum number of directories in the region has been reached. You can use the
     *         <a>GetDirectoryLimits</a> operation to determine your directory limits in the region.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.CreateDirectory
     */
    @Override
    public CreateDirectoryResult createDirectory(CreateDirectoryRequest createDirectoryRequest) {
        ExecutionContext executionContext = createExecutionContext(createDirectoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDirectoryRequest> request = null;
        Response<CreateDirectoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDirectoryRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDirectoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDirectoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDirectoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a Microsoft AD in the AWS cloud.
     * </p>
     * <p>
     * Before you call <i>CreateMicrosoftAD</i>, ensure that all of the required permissions have been explicitly
     * granted through a policy. For details about what permissions are required to run the <i>CreateMicrosoftAD</i>
     * operation, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/UsingWithDS_IAM_ResourcePermissions.html"
     * >AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference</a>.
     * </p>
     * 
     * @param createMicrosoftADRequest
     *        Creates a Microsoft AD in the AWS cloud.
     * @return Result of the CreateMicrosoftAD operation returned by the service.
     * @throws DirectoryLimitExceededException
     *         The maximum number of directories in the region has been reached. You can use the
     *         <a>GetDirectoryLimits</a> operation to determine your directory limits in the region.
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
    public CreateMicrosoftADResult createMicrosoftAD(CreateMicrosoftADRequest createMicrosoftADRequest) {
        ExecutionContext executionContext = createExecutionContext(createMicrosoftADRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMicrosoftADRequest> request = null;
        Response<CreateMicrosoftADResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMicrosoftADRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createMicrosoftADRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMicrosoftADResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateMicrosoftADResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a snapshot of a Simple AD or Microsoft AD directory in the AWS cloud.
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
     *         The maximum number of manual snapshots for the directory has been reached. You can use the
     *         <a>GetSnapshotLimits</a> operation to determine the snapshot limits for a directory.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.CreateSnapshot
     */
    @Override
    public CreateSnapshotResult createSnapshot(CreateSnapshotRequest createSnapshotRequest) {
        ExecutionContext executionContext = createExecutionContext(createSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSnapshotRequest> request = null;
        Response<CreateSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSnapshotRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * AWS Directory Service for Microsoft Active Directory allows you to configure trust relationships. For example,
     * you can establish a trust between your Microsoft AD in the AWS cloud, and your existing on-premises Microsoft
     * Active Directory. This would allow you to provide users and groups access to resources in either domain, with a
     * single set of credentials.
     * </p>
     * <p>
     * This action initiates the creation of the AWS side of a trust relationship between a Microsoft AD in the AWS
     * cloud and an external domain.
     * </p>
     * 
     * @param createTrustRequest
     *        AWS Directory Service for Microsoft Active Directory allows you to configure trust relationships. For
     *        example, you can establish a trust between your Microsoft AD in the AWS cloud, and your existing
     *        on-premises Microsoft Active Directory. This would allow you to provide users and groups access to
     *        resources in either domain, with a single set of credentials.</p>
     *        <p>
     *        This action initiates the creation of the AWS side of a trust relationship between a Microsoft AD in the
     *        AWS cloud and an external domain.
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
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTrustRequest> request = null;
        Response<CreateTrustResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTrustRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTrustRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTrustResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTrustResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a conditional forwarder that has been set up for your AWS directory.
     * </p>
     * 
     * @param deleteConditionalForwarderRequest
     *        Deletes a conditional forwarder.
     * @return Result of the DeleteConditionalForwarder operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws DirectoryUnavailableException
     *         The specified directory is unavailable or could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DeleteConditionalForwarder
     */
    @Override
    public DeleteConditionalForwarderResult deleteConditionalForwarder(DeleteConditionalForwarderRequest deleteConditionalForwarderRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteConditionalForwarderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConditionalForwarderRequest> request = null;
        Response<DeleteConditionalForwarderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConditionalForwarderRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteConditionalForwarderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConditionalForwarderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteConditionalForwarderResultJsonUnmarshaller());
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
     * <p>
     * Before you call <i>DeleteDirectory</i>, ensure that all of the required permissions have been explicitly granted
     * through a policy. For details about what permissions are required to run the <i>DeleteDirectory</i> operation,
     * see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/UsingWithDS_IAM_ResourcePermissions.html"
     * >AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference</a>.
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
    public DeleteDirectoryResult deleteDirectory(DeleteDirectoryRequest deleteDirectoryRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteDirectoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDirectoryRequest> request = null;
        Response<DeleteDirectoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDirectoryRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDirectoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDirectoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDirectoryResultJsonUnmarshaller());
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
    public DeleteSnapshotResult deleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSnapshotRequest> request = null;
        Response<DeleteSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSnapshotRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing trust relationship between your Microsoft AD in the AWS cloud and an external domain.
     * </p>
     * 
     * @param deleteTrustRequest
     *        Deletes the local side of an existing trust relationship between the Microsoft AD in the AWS cloud and the
     *        external domain.
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
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTrustRequest> request = null;
        Response<DeleteTrustResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTrustRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTrustRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTrustResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTrustResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified directory as a publisher to the specified SNS topic.
     * </p>
     * 
     * @param deregisterEventTopicRequest
     *        Removes the specified directory as a publisher to the specified SNS topic.
     * @return Result of the DeregisterEventTopic operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DeregisterEventTopic
     */
    @Override
    public DeregisterEventTopicResult deregisterEventTopic(DeregisterEventTopicRequest deregisterEventTopicRequest) {
        ExecutionContext executionContext = createExecutionContext(deregisterEventTopicRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterEventTopicRequest> request = null;
        Response<DeregisterEventTopicResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterEventTopicRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deregisterEventTopicRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterEventTopicResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeregisterEventTopicResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Obtains information about the conditional forwarders for this account.
     * </p>
     * <p>
     * If no input parameters are provided for RemoteDomainNames, this request describes all conditional forwarders for
     * the specified directory ID.
     * </p>
     * 
     * @param describeConditionalForwardersRequest
     *        Describes a conditional forwarder.
     * @return Result of the DescribeConditionalForwarders operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws DirectoryUnavailableException
     *         The specified directory is unavailable or could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DescribeConditionalForwarders
     */
    @Override
    public DescribeConditionalForwardersResult describeConditionalForwarders(DescribeConditionalForwardersRequest describeConditionalForwardersRequest) {
        ExecutionContext executionContext = createExecutionContext(describeConditionalForwardersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConditionalForwardersRequest> request = null;
        Response<DescribeConditionalForwardersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConditionalForwardersRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeConditionalForwardersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeConditionalForwardersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeConditionalForwardersResultJsonUnmarshaller());
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
     * You can retrieve information about specific directories by passing the directory identifiers in the
     * <i>DirectoryIds</i> parameter. Otherwise, all directories that belong to the current account are returned.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <i>NextToken</i> request and response parameters. If more
     * results are available, the <i>DescribeDirectoriesResult.NextToken</i> member contains a token that you pass in
     * the next call to <a>DescribeDirectories</a> to retrieve the next set of items.
     * </p>
     * <p>
     * You can also specify a maximum number of return results with the <i>Limit</i> parameter.
     * </p>
     * 
     * @param describeDirectoriesRequest
     *        Contains the inputs for the <a>DescribeDirectories</a> operation.
     * @return Result of the DescribeDirectories operation returned by the service.
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
    public DescribeDirectoriesResult describeDirectories(DescribeDirectoriesRequest describeDirectoriesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeDirectoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDirectoriesRequest> request = null;
        Response<DescribeDirectoriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDirectoriesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDirectoriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDirectoriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDirectoriesResultJsonUnmarshaller());
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
     * Obtains information about which SNS topics receive status messages from the specified directory.
     * </p>
     * <p>
     * If no input parameters are provided, such as DirectoryId or TopicName, this request describes all of the
     * associations in the account.
     * </p>
     * 
     * @param describeEventTopicsRequest
     *        Describes event topics.
     * @return Result of the DescribeEventTopics operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DescribeEventTopics
     */
    @Override
    public DescribeEventTopicsResult describeEventTopics(DescribeEventTopicsRequest describeEventTopicsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeEventTopicsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventTopicsRequest> request = null;
        Response<DescribeEventTopicsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventTopicsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeEventTopicsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEventTopicsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeEventTopicsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Obtains information about the directory snapshots that belong to this account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <i>NextToken</i> request and response parameters. If more
     * results are available, the <i>DescribeSnapshots.NextToken</i> member contains a token that you pass in the next
     * call to <a>DescribeSnapshots</a> to retrieve the next set of items.
     * </p>
     * <p>
     * You can also specify a maximum number of return results with the <i>Limit</i> parameter.
     * </p>
     * 
     * @param describeSnapshotsRequest
     *        Contains the inputs for the <a>DescribeSnapshots</a> operation.
     * @return Result of the DescribeSnapshots operation returned by the service.
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
    public DescribeSnapshotsResult describeSnapshots(DescribeSnapshotsRequest describeSnapshotsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSnapshotsRequest> request = null;
        Response<DescribeSnapshotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSnapshotsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeSnapshotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSnapshotsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeSnapshotsResultJsonUnmarshaller());
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
     * If no input parameters are provided, such as DirectoryId or TrustIds, this request describes all the trust
     * relationships belonging to the account.
     * </p>
     * 
     * @param describeTrustsRequest
     *        Describes the trust relationships for a particular Microsoft AD in the AWS cloud. If no input parameters
     *        are are provided, such as directory ID or trust ID, this request describes all the trust relationships.
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
    public DescribeTrustsResult describeTrusts(DescribeTrustsRequest describeTrustsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeTrustsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTrustsRequest> request = null;
        Response<DescribeTrustsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTrustsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTrustsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTrustsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeTrustsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server
     * for an AD Connector directory.
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
    public DisableRadiusResult disableRadius(DisableRadiusRequest disableRadiusRequest) {
        ExecutionContext executionContext = createExecutionContext(disableRadiusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableRadiusRequest> request = null;
        Response<DisableRadiusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableRadiusRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(disableRadiusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableRadiusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisableRadiusResultJsonUnmarshaller());
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
     *         The account does not have sufficient permission to perform the operation.
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
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableSsoRequest> request = null;
        Response<DisableSsoResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableSsoRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(disableSsoRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableSsoResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisableSsoResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server for
     * an AD Connector directory.
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
    public EnableRadiusResult enableRadius(EnableRadiusRequest enableRadiusRequest) {
        ExecutionContext executionContext = createExecutionContext(enableRadiusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableRadiusRequest> request = null;
        Response<EnableRadiusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableRadiusRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(enableRadiusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableRadiusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new EnableRadiusResultJsonUnmarshaller());
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
     *         The account does not have sufficient permission to perform the operation.
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
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableSsoRequest> request = null;
        Response<EnableSsoResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableSsoRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(enableSsoRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableSsoResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new EnableSsoResultJsonUnmarshaller());
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
     * @return Result of the GetDirectoryLimits operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.GetDirectoryLimits
     */
    @Override
    public GetDirectoryLimitsResult getDirectoryLimits(GetDirectoryLimitsRequest getDirectoryLimitsRequest) {
        ExecutionContext executionContext = createExecutionContext(getDirectoryLimitsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDirectoryLimitsRequest> request = null;
        Response<GetDirectoryLimitsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDirectoryLimitsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDirectoryLimitsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDirectoryLimitsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDirectoryLimitsResultJsonUnmarshaller());
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
     * @return Result of the GetSnapshotLimits operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.GetSnapshotLimits
     */
    @Override
    public GetSnapshotLimitsResult getSnapshotLimits(GetSnapshotLimitsRequest getSnapshotLimitsRequest) {
        ExecutionContext executionContext = createExecutionContext(getSnapshotLimitsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSnapshotLimitsRequest> request = null;
        Response<GetSnapshotLimitsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSnapshotLimitsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSnapshotLimitsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSnapshotLimitsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSnapshotLimitsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the address blocks that you have added to a directory.
     * </p>
     * 
     * @param listIpRoutesRequest
     * @return Result of the ListIpRoutes operation returned by the service.
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
     * @sample AWSDirectoryService.ListIpRoutes
     */
    @Override
    public ListIpRoutesResult listIpRoutes(ListIpRoutesRequest listIpRoutesRequest) {
        ExecutionContext executionContext = createExecutionContext(listIpRoutesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIpRoutesRequest> request = null;
        Response<ListIpRoutesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIpRoutesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listIpRoutesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListIpRoutesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListIpRoutesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all schema extensions applied to a Microsoft AD Directory.
     * </p>
     * 
     * @param listSchemaExtensionsRequest
     * @return Result of the ListSchemaExtensions operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <i>NextToken</i> value is not valid.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.ListSchemaExtensions
     */
    @Override
    public ListSchemaExtensionsResult listSchemaExtensions(ListSchemaExtensionsRequest listSchemaExtensionsRequest) {
        ExecutionContext executionContext = createExecutionContext(listSchemaExtensionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSchemaExtensionsRequest> request = null;
        Response<ListSchemaExtensionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSchemaExtensionsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSchemaExtensionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSchemaExtensionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSchemaExtensionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all tags on an Amazon Directory Services directory.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
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
     * @sample AWSDirectoryService.ListTagsForResource
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a directory with an SNS topic. This establishes the directory as a publisher to the specified SNS
     * topic. You can then receive email or text (SMS) messages when the status of your directory changes. You get
     * notified if your directory goes from an Active status to an Impaired or Inoperable status. You also receive a
     * notification when the directory returns to an Active status.
     * </p>
     * 
     * @param registerEventTopicRequest
     *        Registers a new event topic.
     * @return Result of the RegisterEventTopic operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.RegisterEventTopic
     */
    @Override
    public RegisterEventTopicResult registerEventTopic(RegisterEventTopicRequest registerEventTopicRequest) {
        ExecutionContext executionContext = createExecutionContext(registerEventTopicRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterEventTopicRequest> request = null;
        Response<RegisterEventTopicResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterEventTopicRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerEventTopicRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterEventTopicResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RegisterEventTopicResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes IP address blocks from a directory.
     * </p>
     * 
     * @param removeIpRoutesRequest
     * @return Result of the RemoveIpRoutes operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws DirectoryUnavailableException
     *         The specified directory is unavailable or could not be found.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.RemoveIpRoutes
     */
    @Override
    public RemoveIpRoutesResult removeIpRoutes(RemoveIpRoutesRequest removeIpRoutesRequest) {
        ExecutionContext executionContext = createExecutionContext(removeIpRoutesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveIpRoutesRequest> request = null;
        Response<RemoveIpRoutesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveIpRoutesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(removeIpRoutesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveIpRoutesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RemoveIpRoutesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes tags from an Amazon Directory Services directory.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @return Result of the RemoveTagsFromResource operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.RemoveTagsFromResource
     */
    @Override
    public RemoveTagsFromResourceResult removeTagsFromResource(RemoveTagsFromResourceRequest removeTagsFromResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(removeTagsFromResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsFromResourceRequest> request = null;
        Response<RemoveTagsFromResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsFromResourceRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(removeTagsFromResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveTagsFromResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RemoveTagsFromResourceResultJsonUnmarshaller());
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
     * When you restore a directory from a snapshot, any changes made to the directory after the snapshot date are
     * overwritten.
     * </p>
     * <p>
     * This action returns as soon as the restore operation is initiated. You can monitor the progress of the restore
     * operation by calling the <a>DescribeDirectories</a> operation with the directory identifier. When the
     * <b>DirectoryDescription.Stage</b> value changes to <code>Active</code>, the restore operation is complete.
     * </p>
     * 
     * @param restoreFromSnapshotRequest
     *        An object representing the inputs for the <a>RestoreFromSnapshot</a> operation.
     * @return Result of the RestoreFromSnapshot operation returned by the service.
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
    public RestoreFromSnapshotResult restoreFromSnapshot(RestoreFromSnapshotRequest restoreFromSnapshotRequest) {
        ExecutionContext executionContext = createExecutionContext(restoreFromSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreFromSnapshotRequest> request = null;
        Response<RestoreFromSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreFromSnapshotRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(restoreFromSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RestoreFromSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RestoreFromSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Applies a schema extension to a Microsoft AD directory.
     * </p>
     * 
     * @param startSchemaExtensionRequest
     * @return Result of the StartSchemaExtension operation returned by the service.
     * @throws DirectoryUnavailableException
     *         The specified directory is unavailable or could not be found.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws SnapshotLimitExceededException
     *         The maximum number of manual snapshots for the directory has been reached. You can use the
     *         <a>GetSnapshotLimits</a> operation to determine the snapshot limits for a directory.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.StartSchemaExtension
     */
    @Override
    public StartSchemaExtensionResult startSchemaExtension(StartSchemaExtensionRequest startSchemaExtensionRequest) {
        ExecutionContext executionContext = createExecutionContext(startSchemaExtensionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartSchemaExtensionRequest> request = null;
        Response<StartSchemaExtensionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartSchemaExtensionRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(startSchemaExtensionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartSchemaExtensionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartSchemaExtensionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a conditional forwarder that has been set up for your AWS directory.
     * </p>
     * 
     * @param updateConditionalForwarderRequest
     *        Updates a conditional forwarder.
     * @return Result of the UpdateConditionalForwarder operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws DirectoryUnavailableException
     *         The specified directory is unavailable or could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.UpdateConditionalForwarder
     */
    @Override
    public UpdateConditionalForwarderResult updateConditionalForwarder(UpdateConditionalForwarderRequest updateConditionalForwarderRequest) {
        ExecutionContext executionContext = createExecutionContext(updateConditionalForwarderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConditionalForwarderRequest> request = null;
        Response<UpdateConditionalForwarderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConditionalForwarderRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateConditionalForwarderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateConditionalForwarderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateConditionalForwarderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the Remote Authentication Dial In User Service (RADIUS) server information for an AD Connector directory.
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
    public UpdateRadiusResult updateRadius(UpdateRadiusRequest updateRadiusRequest) {
        ExecutionContext executionContext = createExecutionContext(updateRadiusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRadiusRequest> request = null;
        Response<UpdateRadiusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRadiusRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRadiusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRadiusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRadiusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * AWS Directory Service for Microsoft Active Directory allows you to configure and verify trust relationships.
     * </p>
     * <p>
     * This action verifies a trust relationship between your Microsoft AD in the AWS cloud and an external domain.
     * </p>
     * 
     * @param verifyTrustRequest
     *        Initiates the verification of an existing trust relationship between a Microsoft AD in the AWS cloud and
     *        an external domain.
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
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<VerifyTrustRequest> request = null;
        Response<VerifyTrustResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new VerifyTrustRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(verifyTrustRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<VerifyTrustResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new VerifyTrustResultJsonUnmarshaller());
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
