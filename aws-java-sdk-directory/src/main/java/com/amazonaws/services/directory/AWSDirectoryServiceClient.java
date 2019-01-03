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
package com.amazonaws.services.directory;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

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
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.directory.AWSDirectoryServiceClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.directory.model.*;
import com.amazonaws.services.directory.model.transform.*;

/**
 * Client for accessing Directory Service. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname>AWS Directory Service</fullname>
 * <p>
 * AWS Directory Service is a web service that makes it easy for you to setup and run directories in the AWS cloud, or
 * connect your AWS resources with an existing on-premises Microsoft Active Directory. This guide provides detailed
 * information about AWS Directory Service operations, data types, parameters, and errors. For information about AWS
 * Directory Services features, see <a href="https://aws.amazon.com/directoryservice/">AWS Directory Service</a> and the
 * <a href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/what_is.html">AWS Directory Service
 * Administration Guide</a>.
 * </p>
 * <note>
 * <p>
 * AWS provides SDKs that consist of libraries and sample code for various programming languages and platforms (Java,
 * Ruby, .Net, iOS, Android, etc.). The SDKs provide a convenient way to create programmatic access to AWS Directory
 * Service and other AWS services. For more information about the AWS SDKs, including how to download and install them,
 * see <a href="http://aws.amazon.com/tools/">Tools for Amazon Web Services</a>.
 * </p>
 * </note>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSDirectoryServiceClient extends AmazonWebServiceClient implements AWSDirectoryService {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSDirectoryService.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "ds";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DirectoryAlreadySharedException").withModeledClass(
                                    com.amazonaws.services.directory.model.DirectoryAlreadySharedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DirectoryUnavailableException").withModeledClass(
                                    com.amazonaws.services.directory.model.DirectoryUnavailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withModeledClass(
                                    com.amazonaws.services.directory.model.InvalidParameterException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DirectoryNotSharedException").withModeledClass(
                                    com.amazonaws.services.directory.model.DirectoryNotSharedException.class))
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
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withModeledClass(
                                    com.amazonaws.services.directory.model.AccessDeniedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DomainControllerLimitExceededException").withModeledClass(
                                    com.amazonaws.services.directory.model.DomainControllerLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UserDoesNotExistException").withModeledClass(
                                    com.amazonaws.services.directory.model.UserDoesNotExistException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPasswordException").withModeledClass(
                                    com.amazonaws.services.directory.model.InvalidPasswordException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedOperationException").withModeledClass(
                                    com.amazonaws.services.directory.model.UnsupportedOperationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTargetException").withModeledClass(
                                    com.amazonaws.services.directory.model.InvalidTargetException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ClientException").withModeledClass(
                                    com.amazonaws.services.directory.model.ClientException.class))
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
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ShareLimitExceededException").withModeledClass(
                                    com.amazonaws.services.directory.model.ShareLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OrganizationsException").withModeledClass(
                                    com.amazonaws.services.directory.model.OrganizationsException.class))
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
     * @deprecated use {@link AWSDirectoryServiceClientBuilder#defaultClient()}
     */
    @Deprecated
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
     * @deprecated use {@link AWSDirectoryServiceClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
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
     * @deprecated use {@link AWSDirectoryServiceClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSDirectoryServiceClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
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
     * @deprecated use {@link AWSDirectoryServiceClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSDirectoryServiceClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSDirectoryServiceClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
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
     * @deprecated use {@link AWSDirectoryServiceClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
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
     * @deprecated use {@link AWSDirectoryServiceClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSDirectoryServiceClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
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
     * @deprecated use {@link AWSDirectoryServiceClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSDirectoryServiceClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSDirectoryServiceClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSDirectoryServiceClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSDirectoryServiceClientBuilder builder() {
        return AWSDirectoryServiceClientBuilder.standard();
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
        this(clientParams, false);
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
    AWSDirectoryServiceClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
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
     * Accepts a directory sharing request that was sent from the directory owner account.
     * </p>
     * 
     * @param acceptSharedDirectoryRequest
     * @return Result of the AcceptSharedDirectory operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws DirectoryAlreadySharedException
     *         The specified directory has already been shared with this AWS account.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.AcceptSharedDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/AcceptSharedDirectory" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AcceptSharedDirectoryResult acceptSharedDirectory(AcceptSharedDirectoryRequest request) {
        request = beforeClientExecution(request);
        return executeAcceptSharedDirectory(request);
    }

    @SdkInternalApi
    final AcceptSharedDirectoryResult executeAcceptSharedDirectory(AcceptSharedDirectoryRequest acceptSharedDirectoryRequest) {

        ExecutionContext executionContext = createExecutionContext(acceptSharedDirectoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptSharedDirectoryRequest> request = null;
        Response<AcceptSharedDirectoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptSharedDirectoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(acceptSharedDirectoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AcceptSharedDirectory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AcceptSharedDirectoryResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new AcceptSharedDirectoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/AddIpRoutes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AddIpRoutesResult addIpRoutes(AddIpRoutesRequest request) {
        request = beforeClientExecution(request);
        return executeAddIpRoutes(request);
    }

    @SdkInternalApi
    final AddIpRoutesResult executeAddIpRoutes(AddIpRoutesRequest addIpRoutesRequest) {

        ExecutionContext executionContext = createExecutionContext(addIpRoutesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddIpRoutesRequest> request = null;
        Response<AddIpRoutesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddIpRoutesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addIpRoutesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddIpRoutes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Adds or overwrites one or more tags for the specified directory. Each directory can have a maximum of 50 tags.
     * Each tag consists of a key and optional value. Tag keys must be unique to each resource.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/AddTagsToResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest request) {
        request = beforeClientExecution(request);
        return executeAddTagsToResource(request);
    }

    @SdkInternalApi
    final AddTagsToResourceResult executeAddTagsToResource(AddTagsToResourceRequest addTagsToResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(addTagsToResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsToResourceRequest> request = null;
        Response<AddTagsToResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsToResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addTagsToResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddTagsToResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CancelSchemaExtension" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CancelSchemaExtensionResult cancelSchemaExtension(CancelSchemaExtensionRequest request) {
        request = beforeClientExecution(request);
        return executeCancelSchemaExtension(request);
    }

    @SdkInternalApi
    final CancelSchemaExtensionResult executeCancelSchemaExtension(CancelSchemaExtensionRequest cancelSchemaExtensionRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelSchemaExtensionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelSchemaExtensionRequest> request = null;
        Response<CancelSchemaExtensionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelSchemaExtensionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelSchemaExtensionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelSchemaExtension");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Before you call <code>ConnectDirectory</code>, ensure that all of the required permissions have been explicitly
     * granted through a policy. For details about what permissions are required to run the
     * <code>ConnectDirectory</code> operation, see <a
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ConnectDirectory" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ConnectDirectoryResult connectDirectory(ConnectDirectoryRequest request) {
        request = beforeClientExecution(request);
        return executeConnectDirectory(request);
    }

    @SdkInternalApi
    final ConnectDirectoryResult executeConnectDirectory(ConnectDirectoryRequest connectDirectoryRequest) {

        ExecutionContext executionContext = createExecutionContext(connectDirectoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConnectDirectoryRequest> request = null;
        Response<ConnectDirectoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConnectDirectoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(connectDirectoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ConnectDirectory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CreateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAliasResult createAlias(CreateAliasRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAlias(request);
    }

    @SdkInternalApi
    final CreateAliasResult executeCreateAlias(CreateAliasRequest createAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(createAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAliasRequest> request = null;
        Response<CreateAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CreateComputer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateComputerResult createComputer(CreateComputerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateComputer(request);
    }

    @SdkInternalApi
    final CreateComputerResult executeCreateComputer(CreateComputerRequest createComputerRequest) {

        ExecutionContext executionContext = createExecutionContext(createComputerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateComputerRequest> request = null;
        Response<CreateComputerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateComputerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createComputerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateComputer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CreateConditionalForwarder" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateConditionalForwarderResult createConditionalForwarder(CreateConditionalForwarderRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConditionalForwarder(request);
    }

    @SdkInternalApi
    final CreateConditionalForwarderResult executeCreateConditionalForwarder(CreateConditionalForwarderRequest createConditionalForwarderRequest) {

        ExecutionContext executionContext = createExecutionContext(createConditionalForwarderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConditionalForwarderRequest> request = null;
        Response<CreateConditionalForwarderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConditionalForwarderRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createConditionalForwarderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateConditionalForwarder");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Before you call <code>CreateDirectory</code>, ensure that all of the required permissions have been explicitly
     * granted through a policy. For details about what permissions are required to run the <code>CreateDirectory</code>
     * operation, see <a
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CreateDirectory" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateDirectoryResult createDirectory(CreateDirectoryRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDirectory(request);
    }

    @SdkInternalApi
    final CreateDirectoryResult executeCreateDirectory(CreateDirectoryRequest createDirectoryRequest) {

        ExecutionContext executionContext = createExecutionContext(createDirectoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDirectoryRequest> request = null;
        Response<CreateDirectoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDirectoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDirectoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDirectory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Creates a subscription to forward real time Directory Service domain controller security logs to the specified
     * CloudWatch log group in your AWS account.
     * </p>
     * 
     * @param createLogSubscriptionRequest
     * @return Result of the CreateLogSubscription operation returned by the service.
     * @throws EntityAlreadyExistsException
     *         The specified entity already exists.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @throws InsufficientPermissionsException
     *         The account does not have sufficient permission to perform the operation.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.CreateLogSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CreateLogSubscription" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateLogSubscriptionResult createLogSubscription(CreateLogSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLogSubscription(request);
    }

    @SdkInternalApi
    final CreateLogSubscriptionResult executeCreateLogSubscription(CreateLogSubscriptionRequest createLogSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(createLogSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLogSubscriptionRequest> request = null;
        Response<CreateLogSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLogSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLogSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLogSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLogSubscriptionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateLogSubscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an AWS Managed Microsoft AD directory.
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
     *        Creates an AWS Managed Microsoft AD directory.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CreateMicrosoftAD" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateMicrosoftADResult createMicrosoftAD(CreateMicrosoftADRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMicrosoftAD(request);
    }

    @SdkInternalApi
    final CreateMicrosoftADResult executeCreateMicrosoftAD(CreateMicrosoftADRequest createMicrosoftADRequest) {

        ExecutionContext executionContext = createExecutionContext(createMicrosoftADRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMicrosoftADRequest> request = null;
        Response<CreateMicrosoftADResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMicrosoftADRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createMicrosoftADRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMicrosoftAD");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CreateSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateSnapshotResult createSnapshot(CreateSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSnapshot(request);
    }

    @SdkInternalApi
    final CreateSnapshotResult executeCreateSnapshot(CreateSnapshotRequest createSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(createSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSnapshotRequest> request = null;
        Response<CreateSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * you can establish a trust between your AWS Managed Microsoft AD directory, and your existing on-premises
     * Microsoft Active Directory. This would allow you to provide users and groups access to resources in either
     * domain, with a single set of credentials.
     * </p>
     * <p>
     * This action initiates the creation of the AWS side of a trust relationship between an AWS Managed Microsoft AD
     * directory and an external domain. You can create either a forest trust or an external trust.
     * </p>
     * 
     * @param createTrustRequest
     *        AWS Directory Service for Microsoft Active Directory allows you to configure trust relationships. For
     *        example, you can establish a trust between your AWS Managed Microsoft AD directory, and your existing
     *        on-premises Microsoft Active Directory. This would allow you to provide users and groups access to
     *        resources in either domain, with a single set of credentials.</p>
     *        <p>
     *        This action initiates the creation of the AWS side of a trust relationship between an AWS Managed
     *        Microsoft AD directory and an external domain.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CreateTrust" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateTrustResult createTrust(CreateTrustRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTrust(request);
    }

    @SdkInternalApi
    final CreateTrustResult executeCreateTrust(CreateTrustRequest createTrustRequest) {

        ExecutionContext executionContext = createExecutionContext(createTrustRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTrustRequest> request = null;
        Response<CreateTrustResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTrustRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTrustRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTrust");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DeleteConditionalForwarder" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteConditionalForwarderResult deleteConditionalForwarder(DeleteConditionalForwarderRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConditionalForwarder(request);
    }

    @SdkInternalApi
    final DeleteConditionalForwarderResult executeDeleteConditionalForwarder(DeleteConditionalForwarderRequest deleteConditionalForwarderRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConditionalForwarderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConditionalForwarderRequest> request = null;
        Response<DeleteConditionalForwarderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConditionalForwarderRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteConditionalForwarderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConditionalForwarder");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Before you call <code>DeleteDirectory</code>, ensure that all of the required permissions have been explicitly
     * granted through a policy. For details about what permissions are required to run the <code>DeleteDirectory</code>
     * operation, see <a
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DeleteDirectory" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDirectoryResult deleteDirectory(DeleteDirectoryRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDirectory(request);
    }

    @SdkInternalApi
    final DeleteDirectoryResult executeDeleteDirectory(DeleteDirectoryRequest deleteDirectoryRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDirectoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDirectoryRequest> request = null;
        Response<DeleteDirectoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDirectoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDirectoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDirectory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Deletes the specified log subscription.
     * </p>
     * 
     * @param deleteLogSubscriptionRequest
     * @return Result of the DeleteLogSubscription operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DeleteLogSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DeleteLogSubscription" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteLogSubscriptionResult deleteLogSubscription(DeleteLogSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLogSubscription(request);
    }

    @SdkInternalApi
    final DeleteLogSubscriptionResult executeDeleteLogSubscription(DeleteLogSubscriptionRequest deleteLogSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLogSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLogSubscriptionRequest> request = null;
        Response<DeleteLogSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLogSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLogSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLogSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLogSubscriptionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteLogSubscriptionResultJsonUnmarshaller());
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DeleteSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteSnapshotResult deleteSnapshot(DeleteSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSnapshot(request);
    }

    @SdkInternalApi
    final DeleteSnapshotResult executeDeleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSnapshotRequest> request = null;
        Response<DeleteSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Deletes an existing trust relationship between your AWS Managed Microsoft AD directory and an external domain.
     * </p>
     * 
     * @param deleteTrustRequest
     *        Deletes the local side of an existing trust relationship between the AWS Managed Microsoft AD directory
     *        and the external domain.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DeleteTrust" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteTrustResult deleteTrust(DeleteTrustRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTrust(request);
    }

    @SdkInternalApi
    final DeleteTrustResult executeDeleteTrust(DeleteTrustRequest deleteTrustRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTrustRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTrustRequest> request = null;
        Response<DeleteTrustResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTrustRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTrustRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTrust");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DeregisterEventTopic" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeregisterEventTopicResult deregisterEventTopic(DeregisterEventTopicRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterEventTopic(request);
    }

    @SdkInternalApi
    final DeregisterEventTopicResult executeDeregisterEventTopic(DeregisterEventTopicRequest deregisterEventTopicRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterEventTopicRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterEventTopicRequest> request = null;
        Response<DeregisterEventTopicResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterEventTopicRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deregisterEventTopicRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterEventTopic");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeConditionalForwarders"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeConditionalForwardersResult describeConditionalForwarders(DescribeConditionalForwardersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConditionalForwarders(request);
    }

    @SdkInternalApi
    final DescribeConditionalForwardersResult executeDescribeConditionalForwarders(DescribeConditionalForwardersRequest describeConditionalForwardersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConditionalForwardersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConditionalForwardersRequest> request = null;
        Response<DescribeConditionalForwardersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConditionalForwardersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeConditionalForwardersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConditionalForwarders");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * <code>DirectoryIds</code> parameter. Otherwise, all directories that belong to the current account are returned.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <code>NextToken</code> request and response parameters. If
     * more results are available, the <code>DescribeDirectoriesResult.NextToken</code> member contains a token that you
     * pass in the next call to <a>DescribeDirectories</a> to retrieve the next set of items.
     * </p>
     * <p>
     * You can also specify a maximum number of return results with the <code>Limit</code> parameter.
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
     *         The <code>NextToken</code> value is not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DescribeDirectories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeDirectories" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeDirectoriesResult describeDirectories(DescribeDirectoriesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDirectories(request);
    }

    @SdkInternalApi
    final DescribeDirectoriesResult executeDescribeDirectories(DescribeDirectoriesRequest describeDirectoriesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDirectoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDirectoriesRequest> request = null;
        Response<DescribeDirectoriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDirectoriesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDirectoriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDirectories");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Provides information about any domain controllers in your directory.
     * </p>
     * 
     * @param describeDomainControllersRequest
     * @return Result of the DescribeDomainControllers operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @sample AWSDirectoryService.DescribeDomainControllers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeDomainControllers" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeDomainControllersResult describeDomainControllers(DescribeDomainControllersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDomainControllers(request);
    }

    @SdkInternalApi
    final DescribeDomainControllersResult executeDescribeDomainControllers(DescribeDomainControllersRequest describeDomainControllersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDomainControllersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDomainControllersRequest> request = null;
        Response<DescribeDomainControllersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDomainControllersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDomainControllersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDomainControllers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDomainControllersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeDomainControllersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeEventTopics" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeEventTopicsResult describeEventTopics(DescribeEventTopicsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEventTopics(request);
    }

    @SdkInternalApi
    final DescribeEventTopicsResult executeDescribeEventTopics(DescribeEventTopicsRequest describeEventTopicsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEventTopicsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventTopicsRequest> request = null;
        Response<DescribeEventTopicsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventTopicsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeEventTopicsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEventTopics");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Returns the shared directories in your account.
     * </p>
     * 
     * @param describeSharedDirectoriesRequest
     * @return Result of the DescribeSharedDirectories operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DescribeSharedDirectories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeSharedDirectories" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeSharedDirectoriesResult describeSharedDirectories(DescribeSharedDirectoriesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSharedDirectories(request);
    }

    @SdkInternalApi
    final DescribeSharedDirectoriesResult executeDescribeSharedDirectories(DescribeSharedDirectoriesRequest describeSharedDirectoriesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSharedDirectoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSharedDirectoriesRequest> request = null;
        Response<DescribeSharedDirectoriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSharedDirectoriesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeSharedDirectoriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSharedDirectories");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSharedDirectoriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeSharedDirectoriesResultJsonUnmarshaller());
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
     *         The <code>NextToken</code> value is not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DescribeSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeSnapshotsResult describeSnapshots(DescribeSnapshotsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSnapshots(request);
    }

    @SdkInternalApi
    final DescribeSnapshotsResult executeDescribeSnapshots(DescribeSnapshotsRequest describeSnapshotsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSnapshotsRequest> request = null;
        Response<DescribeSnapshotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSnapshotsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeSnapshotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSnapshots");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     *        Describes the trust relationships for a particular AWS Managed Microsoft AD directory. If no input
     *        parameters are are provided, such as directory ID or trust ID, this request describes all the trust
     *        relationships.
     * @return Result of the DescribeTrusts operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @sample AWSDirectoryService.DescribeTrusts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeTrusts" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeTrustsResult describeTrusts(DescribeTrustsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTrusts(request);
    }

    @SdkInternalApi
    final DescribeTrustsResult executeDescribeTrusts(DescribeTrustsRequest describeTrustsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTrustsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTrustsRequest> request = null;
        Response<DescribeTrustsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTrustsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTrustsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTrusts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * for an AD Connector or Microsoft AD directory.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DisableRadius" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DisableRadiusResult disableRadius(DisableRadiusRequest request) {
        request = beforeClientExecution(request);
        return executeDisableRadius(request);
    }

    @SdkInternalApi
    final DisableRadiusResult executeDisableRadius(DisableRadiusRequest disableRadiusRequest) {

        ExecutionContext executionContext = createExecutionContext(disableRadiusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableRadiusRequest> request = null;
        Response<DisableRadiusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableRadiusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disableRadiusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableRadius");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DisableSso" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DisableSsoResult disableSso(DisableSsoRequest request) {
        request = beforeClientExecution(request);
        return executeDisableSso(request);
    }

    @SdkInternalApi
    final DisableSsoResult executeDisableSso(DisableSsoRequest disableSsoRequest) {

        ExecutionContext executionContext = createExecutionContext(disableSsoRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableSsoRequest> request = null;
        Response<DisableSsoResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableSsoRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disableSsoRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableSso");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * an AD Connector or Microsoft AD directory.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/EnableRadius" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public EnableRadiusResult enableRadius(EnableRadiusRequest request) {
        request = beforeClientExecution(request);
        return executeEnableRadius(request);
    }

    @SdkInternalApi
    final EnableRadiusResult executeEnableRadius(EnableRadiusRequest enableRadiusRequest) {

        ExecutionContext executionContext = createExecutionContext(enableRadiusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableRadiusRequest> request = null;
        Response<EnableRadiusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableRadiusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(enableRadiusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableRadius");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Enables single sign-on for a directory.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/EnableSso" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public EnableSsoResult enableSso(EnableSsoRequest request) {
        request = beforeClientExecution(request);
        return executeEnableSso(request);
    }

    @SdkInternalApi
    final EnableSsoResult executeEnableSso(EnableSsoRequest enableSsoRequest) {

        ExecutionContext executionContext = createExecutionContext(enableSsoRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableSsoRequest> request = null;
        Response<EnableSsoResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableSsoRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(enableSsoRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableSso");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/GetDirectoryLimits" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDirectoryLimitsResult getDirectoryLimits(GetDirectoryLimitsRequest request) {
        request = beforeClientExecution(request);
        return executeGetDirectoryLimits(request);
    }

    @SdkInternalApi
    final GetDirectoryLimitsResult executeGetDirectoryLimits(GetDirectoryLimitsRequest getDirectoryLimitsRequest) {

        ExecutionContext executionContext = createExecutionContext(getDirectoryLimitsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDirectoryLimitsRequest> request = null;
        Response<GetDirectoryLimitsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDirectoryLimitsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDirectoryLimitsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDirectoryLimits");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/GetSnapshotLimits" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSnapshotLimitsResult getSnapshotLimits(GetSnapshotLimitsRequest request) {
        request = beforeClientExecution(request);
        return executeGetSnapshotLimits(request);
    }

    @SdkInternalApi
    final GetSnapshotLimitsResult executeGetSnapshotLimits(GetSnapshotLimitsRequest getSnapshotLimitsRequest) {

        ExecutionContext executionContext = createExecutionContext(getSnapshotLimitsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSnapshotLimitsRequest> request = null;
        Response<GetSnapshotLimitsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSnapshotLimitsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSnapshotLimitsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSnapshotLimits");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     *         The <code>NextToken</code> value is not valid.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.ListIpRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ListIpRoutes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListIpRoutesResult listIpRoutes(ListIpRoutesRequest request) {
        request = beforeClientExecution(request);
        return executeListIpRoutes(request);
    }

    @SdkInternalApi
    final ListIpRoutesResult executeListIpRoutes(ListIpRoutesRequest listIpRoutesRequest) {

        ExecutionContext executionContext = createExecutionContext(listIpRoutesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIpRoutesRequest> request = null;
        Response<ListIpRoutesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIpRoutesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listIpRoutesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListIpRoutes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Lists the active log subscriptions for the AWS account.
     * </p>
     * 
     * @param listLogSubscriptionsRequest
     * @return Result of the ListLogSubscriptions operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.ListLogSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ListLogSubscriptions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListLogSubscriptionsResult listLogSubscriptions(ListLogSubscriptionsRequest request) {
        request = beforeClientExecution(request);
        return executeListLogSubscriptions(request);
    }

    @SdkInternalApi
    final ListLogSubscriptionsResult executeListLogSubscriptions(ListLogSubscriptionsRequest listLogSubscriptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listLogSubscriptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLogSubscriptionsRequest> request = null;
        Response<ListLogSubscriptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLogSubscriptionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLogSubscriptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLogSubscriptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLogSubscriptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLogSubscriptionsResultJsonUnmarshaller());
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
     *         The <code>NextToken</code> value is not valid.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.ListSchemaExtensions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ListSchemaExtensions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSchemaExtensionsResult listSchemaExtensions(ListSchemaExtensionsRequest request) {
        request = beforeClientExecution(request);
        return executeListSchemaExtensions(request);
    }

    @SdkInternalApi
    final ListSchemaExtensionsResult executeListSchemaExtensions(ListSchemaExtensionsRequest listSchemaExtensionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSchemaExtensionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSchemaExtensionsRequest> request = null;
        Response<ListSchemaExtensionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSchemaExtensionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSchemaExtensionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSchemaExtensions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Lists all tags on a directory.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForResource(request);
    }

    @SdkInternalApi
    final ListTagsForResourceResult executeListTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/RegisterEventTopic" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RegisterEventTopicResult registerEventTopic(RegisterEventTopicRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterEventTopic(request);
    }

    @SdkInternalApi
    final RegisterEventTopicResult executeRegisterEventTopic(RegisterEventTopicRequest registerEventTopicRequest) {

        ExecutionContext executionContext = createExecutionContext(registerEventTopicRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterEventTopicRequest> request = null;
        Response<RegisterEventTopicResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterEventTopicRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerEventTopicRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterEventTopic");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Rejects a directory sharing request that was sent from the directory owner account.
     * </p>
     * 
     * @param rejectSharedDirectoryRequest
     * @return Result of the RejectSharedDirectory operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws DirectoryAlreadySharedException
     *         The specified directory has already been shared with this AWS account.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.RejectSharedDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/RejectSharedDirectory" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RejectSharedDirectoryResult rejectSharedDirectory(RejectSharedDirectoryRequest request) {
        request = beforeClientExecution(request);
        return executeRejectSharedDirectory(request);
    }

    @SdkInternalApi
    final RejectSharedDirectoryResult executeRejectSharedDirectory(RejectSharedDirectoryRequest rejectSharedDirectoryRequest) {

        ExecutionContext executionContext = createExecutionContext(rejectSharedDirectoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RejectSharedDirectoryRequest> request = null;
        Response<RejectSharedDirectoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RejectSharedDirectoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(rejectSharedDirectoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RejectSharedDirectory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RejectSharedDirectoryResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new RejectSharedDirectoryResultJsonUnmarshaller());
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/RemoveIpRoutes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RemoveIpRoutesResult removeIpRoutes(RemoveIpRoutesRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveIpRoutes(request);
    }

    @SdkInternalApi
    final RemoveIpRoutesResult executeRemoveIpRoutes(RemoveIpRoutesRequest removeIpRoutesRequest) {

        ExecutionContext executionContext = createExecutionContext(removeIpRoutesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveIpRoutesRequest> request = null;
        Response<RemoveIpRoutesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveIpRoutesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(removeIpRoutesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveIpRoutes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Removes tags from a directory.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/RemoveTagsFromResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RemoveTagsFromResourceResult removeTagsFromResource(RemoveTagsFromResourceRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveTagsFromResource(request);
    }

    @SdkInternalApi
    final RemoveTagsFromResourceResult executeRemoveTagsFromResource(RemoveTagsFromResourceRequest removeTagsFromResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(removeTagsFromResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsFromResourceRequest> request = null;
        Response<RemoveTagsFromResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsFromResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(removeTagsFromResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveTagsFromResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Resets the password for any user in your AWS Managed Microsoft AD or Simple AD directory.
     * </p>
     * 
     * @param resetUserPasswordRequest
     * @return Result of the ResetUserPassword operation returned by the service.
     * @throws DirectoryUnavailableException
     *         The specified directory is unavailable or could not be found.
     * @throws UserDoesNotExistException
     *         The user provided a username that does not exist in your directory.
     * @throws InvalidPasswordException
     *         The new password provided by the user does not meet the password complexity requirements defined in your
     *         directory.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.ResetUserPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ResetUserPassword" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ResetUserPasswordResult resetUserPassword(ResetUserPasswordRequest request) {
        request = beforeClientExecution(request);
        return executeResetUserPassword(request);
    }

    @SdkInternalApi
    final ResetUserPasswordResult executeResetUserPassword(ResetUserPasswordRequest resetUserPasswordRequest) {

        ExecutionContext executionContext = createExecutionContext(resetUserPasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetUserPasswordRequest> request = null;
        Response<ResetUserPasswordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResetUserPasswordRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(resetUserPasswordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResetUserPassword");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResetUserPasswordResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ResetUserPasswordResultJsonUnmarshaller());
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/RestoreFromSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RestoreFromSnapshotResult restoreFromSnapshot(RestoreFromSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeRestoreFromSnapshot(request);
    }

    @SdkInternalApi
    final RestoreFromSnapshotResult executeRestoreFromSnapshot(RestoreFromSnapshotRequest restoreFromSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(restoreFromSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreFromSnapshotRequest> request = null;
        Response<RestoreFromSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreFromSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(restoreFromSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RestoreFromSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Shares a specified directory (<code>DirectoryId</code>) in your AWS account (directory owner) with another AWS
     * account (directory consumer). With this operation you can use your directory from any AWS account and from any
     * Amazon VPC within an AWS Region.
     * </p>
     * <p>
     * When you share your AWS Managed Microsoft AD directory, AWS Directory Service creates a shared directory in the
     * directory consumer account. This shared directory contains the metadata to provide access to the directory within
     * the directory owner account. The shared directory is visible in all VPCs in the directory consumer account.
     * </p>
     * <p>
     * The <code>ShareMethod</code> parameter determines whether the specified directory can be shared between AWS
     * accounts inside the same AWS organization (<code>ORGANIZATIONS</code>). It also determines whether you can share
     * the directory with any other AWS account either inside or outside of the organization (<code>HANDSHAKE</code>).
     * </p>
     * <p>
     * The <code>ShareNotes</code> parameter is only used when <code>HANDSHAKE</code> is called, which sends a directory
     * sharing request to the directory consumer.
     * </p>
     * 
     * @param shareDirectoryRequest
     * @return Result of the ShareDirectory operation returned by the service.
     * @throws DirectoryAlreadySharedException
     *         The specified directory has already been shared with this AWS account.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidTargetException
     *         The specified shared target is not valid.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ShareLimitExceededException
     *         The maximum number of AWS accounts that you can share with this directory has been reached.
     * @throws OrganizationsException
     *         Exception encountered while trying to access your AWS organization.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.ShareDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ShareDirectory" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ShareDirectoryResult shareDirectory(ShareDirectoryRequest request) {
        request = beforeClientExecution(request);
        return executeShareDirectory(request);
    }

    @SdkInternalApi
    final ShareDirectoryResult executeShareDirectory(ShareDirectoryRequest shareDirectoryRequest) {

        ExecutionContext executionContext = createExecutionContext(shareDirectoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ShareDirectoryRequest> request = null;
        Response<ShareDirectoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ShareDirectoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(shareDirectoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ShareDirectory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ShareDirectoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ShareDirectoryResultJsonUnmarshaller());
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/StartSchemaExtension" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartSchemaExtensionResult startSchemaExtension(StartSchemaExtensionRequest request) {
        request = beforeClientExecution(request);
        return executeStartSchemaExtension(request);
    }

    @SdkInternalApi
    final StartSchemaExtensionResult executeStartSchemaExtension(StartSchemaExtensionRequest startSchemaExtensionRequest) {

        ExecutionContext executionContext = createExecutionContext(startSchemaExtensionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartSchemaExtensionRequest> request = null;
        Response<StartSchemaExtensionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartSchemaExtensionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startSchemaExtensionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartSchemaExtension");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Stops the directory sharing between the directory owner and consumer accounts.
     * </p>
     * 
     * @param unshareDirectoryRequest
     * @return Result of the UnshareDirectory operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidTargetException
     *         The specified shared target is not valid.
     * @throws DirectoryNotSharedException
     *         The specified directory has not been shared with this AWS account.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.UnshareDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/UnshareDirectory" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UnshareDirectoryResult unshareDirectory(UnshareDirectoryRequest request) {
        request = beforeClientExecution(request);
        return executeUnshareDirectory(request);
    }

    @SdkInternalApi
    final UnshareDirectoryResult executeUnshareDirectory(UnshareDirectoryRequest unshareDirectoryRequest) {

        ExecutionContext executionContext = createExecutionContext(unshareDirectoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnshareDirectoryRequest> request = null;
        Response<UnshareDirectoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UnshareDirectoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(unshareDirectoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UnshareDirectory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UnshareDirectoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UnshareDirectoryResultJsonUnmarshaller());
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/UpdateConditionalForwarder" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateConditionalForwarderResult updateConditionalForwarder(UpdateConditionalForwarderRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateConditionalForwarder(request);
    }

    @SdkInternalApi
    final UpdateConditionalForwarderResult executeUpdateConditionalForwarder(UpdateConditionalForwarderRequest updateConditionalForwarderRequest) {

        ExecutionContext executionContext = createExecutionContext(updateConditionalForwarderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConditionalForwarderRequest> request = null;
        Response<UpdateConditionalForwarderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConditionalForwarderRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateConditionalForwarderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateConditionalForwarder");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Adds or removes domain controllers to or from the directory. Based on the difference between current value and
     * new value (provided through this API call), domain controllers will be added or removed. It may take up to 45
     * minutes for any new domain controllers to become fully active once the requested number of domain controllers is
     * updated. During this time, you cannot make another update request.
     * </p>
     * 
     * @param updateNumberOfDomainControllersRequest
     * @return Result of the UpdateNumberOfDomainControllers operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws DirectoryUnavailableException
     *         The specified directory is unavailable or could not be found.
     * @throws DomainControllerLimitExceededException
     *         The maximum allowed number of domain controllers per directory was exceeded. The default limit per
     *         directory is 20 domain controllers.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.UpdateNumberOfDomainControllers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/UpdateNumberOfDomainControllers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateNumberOfDomainControllersResult updateNumberOfDomainControllers(UpdateNumberOfDomainControllersRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateNumberOfDomainControllers(request);
    }

    @SdkInternalApi
    final UpdateNumberOfDomainControllersResult executeUpdateNumberOfDomainControllers(
            UpdateNumberOfDomainControllersRequest updateNumberOfDomainControllersRequest) {

        ExecutionContext executionContext = createExecutionContext(updateNumberOfDomainControllersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateNumberOfDomainControllersRequest> request = null;
        Response<UpdateNumberOfDomainControllersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateNumberOfDomainControllersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateNumberOfDomainControllersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateNumberOfDomainControllers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateNumberOfDomainControllersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateNumberOfDomainControllersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the Remote Authentication Dial In User Service (RADIUS) server information for an AD Connector or
     * Microsoft AD directory.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/UpdateRadius" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateRadiusResult updateRadius(UpdateRadiusRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRadius(request);
    }

    @SdkInternalApi
    final UpdateRadiusResult executeUpdateRadius(UpdateRadiusRequest updateRadiusRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRadiusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRadiusRequest> request = null;
        Response<UpdateRadiusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRadiusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRadiusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRadius");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Updates the trust that has been set up between your AWS Managed Microsoft AD directory and an on-premises Active
     * Directory.
     * </p>
     * 
     * @param updateTrustRequest
     * @return Result of the UpdateTrust operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.UpdateTrust
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/UpdateTrust" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateTrustResult updateTrust(UpdateTrustRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTrust(request);
    }

    @SdkInternalApi
    final UpdateTrustResult executeUpdateTrust(UpdateTrustRequest updateTrustRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTrustRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTrustRequest> request = null;
        Response<UpdateTrustResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTrustRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTrustRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTrust");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTrustResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTrustResultJsonUnmarshaller());
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
     * This action verifies a trust relationship between your AWS Managed Microsoft AD directory and an external domain.
     * </p>
     * 
     * @param verifyTrustRequest
     *        Initiates the verification of an existing trust relationship between an AWS Managed Microsoft AD directory
     *        and an external domain.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/VerifyTrust" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public VerifyTrustResult verifyTrust(VerifyTrustRequest request) {
        request = beforeClientExecution(request);
        return executeVerifyTrust(request);
    }

    @SdkInternalApi
    final VerifyTrustResult executeVerifyTrust(VerifyTrustRequest verifyTrustRequest) {

        ExecutionContext executionContext = createExecutionContext(verifyTrustRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<VerifyTrustRequest> request = null;
        Response<VerifyTrustResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new VerifyTrustRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(verifyTrustRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Directory Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "VerifyTrust");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

}
