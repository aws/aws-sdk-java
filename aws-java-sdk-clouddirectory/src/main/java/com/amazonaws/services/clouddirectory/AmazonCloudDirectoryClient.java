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
package com.amazonaws.services.clouddirectory;

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

import com.amazonaws.services.clouddirectory.AmazonCloudDirectoryClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.clouddirectory.model.*;
import com.amazonaws.services.clouddirectory.model.transform.*;

/**
 * Client for accessing Amazon CloudDirectory. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <fullname>Amazon Cloud Directory</fullname>
 * <p>
 * Amazon Cloud Directory is a component of the AWS Directory Service that simplifies the development and management of
 * cloud-scale web, mobile, and IoT applications. This guide describes the Cloud Directory operations that you can call
 * programmatically and includes detailed information on data types and errors. For information about Cloud Directory
 * features, see <a href="https://aws.amazon.com/directoryservice/">AWS Directory Service</a> and the <a
 * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/what_is_cloud_directory.html">Amazon Cloud
 * Directory Developer Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCloudDirectoryClient extends AmazonWebServiceClient implements AmazonCloudDirectory {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonCloudDirectory.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "clouddirectory";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidArnException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.InvalidArnException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FacetInUseException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.FacetInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidAttachmentException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.InvalidAttachmentException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IndexedAttributeMissingException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.IndexedAttributeMissingException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IncompatibleSchemaException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.IncompatibleSchemaException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.InvalidNextTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SchemaAlreadyPublishedException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.SchemaAlreadyPublishedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("StillContainsLinksException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.StillContainsLinksException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRuleException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.InvalidRuleException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DirectoryNotEnabledException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.DirectoryNotEnabledException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FacetValidationException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.FacetValidationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidFacetUpdateException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.InvalidFacetUpdateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SchemaAlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.SchemaAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.ValidationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.InternalServiceException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FacetAlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.FacetAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotIndexException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.NotIndexException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ObjectAlreadyDetachedException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.ObjectAlreadyDetachedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DirectoryDeletedException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.DirectoryDeletedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RetryableConflictException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.RetryableConflictException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BatchWriteException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.BatchWriteException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTaggingRequestException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.InvalidTaggingRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotNodeException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.NotNodeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DirectoryAlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.DirectoryAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.AccessDeniedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DirectoryNotDisabledException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.DirectoryNotDisabledException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSchemaDocException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.InvalidSchemaDocException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ObjectNotDetachedException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.ObjectNotDetachedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LinkNameAlreadyInUseException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.LinkNameAlreadyInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CannotListParentOfRootException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.CannotListParentOfRootException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotPolicyException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.NotPolicyException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FacetNotFoundException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.FacetNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedIndexTypeException").withModeledClass(
                                    com.amazonaws.services.clouddirectory.model.UnsupportedIndexTypeException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.clouddirectory.model.AmazonCloudDirectoryException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon CloudDirectory. A credentials provider chain will be
     * used that searches for credentials in this order:
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
     * @deprecated use {@link AmazonCloudDirectoryClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonCloudDirectoryClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudDirectory. A credentials provider chain will be
     * used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Amazon CloudDirectory (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonCloudDirectoryClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudDirectoryClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudDirectory using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonCloudDirectoryClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonCloudDirectoryClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonCloudDirectoryClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudDirectory using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon CloudDirectory (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonCloudDirectoryClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudDirectoryClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudDirectoryClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudDirectory using the specified AWS account
     * credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonCloudDirectoryClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonCloudDirectoryClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudDirectory using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon CloudDirectory (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonCloudDirectoryClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudDirectoryClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudDirectoryClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudDirectory using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon CloudDirectory (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonCloudDirectoryClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudDirectoryClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonCloudDirectoryClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonCloudDirectoryClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonCloudDirectoryClientBuilder builder() {
        return AmazonCloudDirectoryClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudDirectory using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonCloudDirectoryClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudDirectory using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonCloudDirectoryClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("clouddirectory.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/clouddirectory/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/clouddirectory/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds a new <a>Facet</a> to an object. An object can have more than one facet applied on it.
     * </p>
     * 
     * @param addFacetToObjectRequest
     * @return Result of the AddFacetToObject operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @sample AmazonCloudDirectory.AddFacetToObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/AddFacetToObject"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AddFacetToObjectResult addFacetToObject(AddFacetToObjectRequest request) {
        request = beforeClientExecution(request);
        return executeAddFacetToObject(request);
    }

    @SdkInternalApi
    final AddFacetToObjectResult executeAddFacetToObject(AddFacetToObjectRequest addFacetToObjectRequest) {

        ExecutionContext executionContext = createExecutionContext(addFacetToObjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddFacetToObjectRequest> request = null;
        Response<AddFacetToObjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddFacetToObjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addFacetToObjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddFacetToObject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddFacetToObjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddFacetToObjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Copies the input published schema, at the specified version, into the <a>Directory</a> with the same name and
     * version as that of the published schema.
     * </p>
     * 
     * @param applySchemaRequest
     * @return Result of the ApplySchema operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws SchemaAlreadyExistsException
     *         Indicates that a schema could not be created due to a naming conflict. Please select a different name and
     *         then try again.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidAttachmentException
     *         Indicates that an attempt to make an attachment was invalid. For example, attaching two nodes with a link
     *         type that is not applicable to the nodes or attempting to apply a schema to a directory a second time.
     * @sample AmazonCloudDirectory.ApplySchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ApplySchema" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ApplySchemaResult applySchema(ApplySchemaRequest request) {
        request = beforeClientExecution(request);
        return executeApplySchema(request);
    }

    @SdkInternalApi
    final ApplySchemaResult executeApplySchema(ApplySchemaRequest applySchemaRequest) {

        ExecutionContext executionContext = createExecutionContext(applySchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ApplySchemaRequest> request = null;
        Response<ApplySchemaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ApplySchemaRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(applySchemaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ApplySchema");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ApplySchemaResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ApplySchemaResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches an existing object to another object. An object can be accessed in two ways:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Using the path
     * </p>
     * </li>
     * <li>
     * <p>
     * Using <code>ObjectIdentifier</code>
     * </p>
     * </li>
     * </ol>
     * 
     * @param attachObjectRequest
     * @return Result of the AttachObject operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws LinkNameAlreadyInUseException
     *         Indicates that a link could not be created due to a naming conflict. Choose a different name and then try
     *         again.
     * @throws InvalidAttachmentException
     *         Indicates that an attempt to make an attachment was invalid. For example, attaching two nodes with a link
     *         type that is not applicable to the nodes or attempting to apply a schema to a directory a second time.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @sample AmazonCloudDirectory.AttachObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/AttachObject" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AttachObjectResult attachObject(AttachObjectRequest request) {
        request = beforeClientExecution(request);
        return executeAttachObject(request);
    }

    @SdkInternalApi
    final AttachObjectResult executeAttachObject(AttachObjectRequest attachObjectRequest) {

        ExecutionContext executionContext = createExecutionContext(attachObjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachObjectRequest> request = null;
        Response<AttachObjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachObjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(attachObjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AttachObject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AttachObjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AttachObjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches a policy object to a regular object. An object can have a limited number of attached policies.
     * </p>
     * 
     * @param attachPolicyRequest
     * @return Result of the AttachPolicy operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws NotPolicyException
     *         Indicates that the requested operation can only operate on policy objects.
     * @sample AmazonCloudDirectory.AttachPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/AttachPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AttachPolicyResult attachPolicy(AttachPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeAttachPolicy(request);
    }

    @SdkInternalApi
    final AttachPolicyResult executeAttachPolicy(AttachPolicyRequest attachPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(attachPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachPolicyRequest> request = null;
        Response<AttachPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(attachPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AttachPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AttachPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AttachPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches the specified object to the specified index.
     * </p>
     * 
     * @param attachToIndexRequest
     * @return Result of the AttachToIndex operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws InvalidAttachmentException
     *         Indicates that an attempt to make an attachment was invalid. For example, attaching two nodes with a link
     *         type that is not applicable to the nodes or attempting to apply a schema to a directory a second time.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws LinkNameAlreadyInUseException
     *         Indicates that a link could not be created due to a naming conflict. Choose a different name and then try
     *         again.
     * @throws IndexedAttributeMissingException
     *         An object has been attempted to be attached to an object that does not have the appropriate attribute
     *         value.
     * @throws NotIndexException
     *         Indicates that the requested operation can only operate on index objects.
     * @sample AmazonCloudDirectory.AttachToIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/AttachToIndex" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AttachToIndexResult attachToIndex(AttachToIndexRequest request) {
        request = beforeClientExecution(request);
        return executeAttachToIndex(request);
    }

    @SdkInternalApi
    final AttachToIndexResult executeAttachToIndex(AttachToIndexRequest attachToIndexRequest) {

        ExecutionContext executionContext = createExecutionContext(attachToIndexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachToIndexRequest> request = null;
        Response<AttachToIndexResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachToIndexRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(attachToIndexRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AttachToIndex");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AttachToIndexResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AttachToIndexResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches a typed link to a specified source and target object. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param attachTypedLinkRequest
     * @return Result of the AttachTypedLink operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidAttachmentException
     *         Indicates that an attempt to make an attachment was invalid. For example, attaching two nodes with a link
     *         type that is not applicable to the nodes or attempting to apply a schema to a directory a second time.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @sample AmazonCloudDirectory.AttachTypedLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/AttachTypedLink" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AttachTypedLinkResult attachTypedLink(AttachTypedLinkRequest request) {
        request = beforeClientExecution(request);
        return executeAttachTypedLink(request);
    }

    @SdkInternalApi
    final AttachTypedLinkResult executeAttachTypedLink(AttachTypedLinkRequest attachTypedLinkRequest) {

        ExecutionContext executionContext = createExecutionContext(attachTypedLinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachTypedLinkRequest> request = null;
        Response<AttachTypedLinkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachTypedLinkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(attachTypedLinkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AttachTypedLink");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AttachTypedLinkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AttachTypedLinkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Performs all the read operations in a batch.
     * </p>
     * 
     * @param batchReadRequest
     * @return Result of the BatchRead operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @sample AmazonCloudDirectory.BatchRead
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchRead" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchReadResult batchRead(BatchReadRequest request) {
        request = beforeClientExecution(request);
        return executeBatchRead(request);
    }

    @SdkInternalApi
    final BatchReadResult executeBatchRead(BatchReadRequest batchReadRequest) {

        ExecutionContext executionContext = createExecutionContext(batchReadRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchReadRequest> request = null;
        Response<BatchReadResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchReadRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchReadRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchRead");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchReadResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchReadResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Performs all the write operations in a batch. Either all the operations succeed or none.
     * </p>
     * 
     * @param batchWriteRequest
     * @return Result of the BatchWrite operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws BatchWriteException
     *         A <code>BatchWrite</code> exception has occurred.
     * @sample AmazonCloudDirectory.BatchWrite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchWrite" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchWriteResult batchWrite(BatchWriteRequest request) {
        request = beforeClientExecution(request);
        return executeBatchWrite(request);
    }

    @SdkInternalApi
    final BatchWriteResult executeBatchWrite(BatchWriteRequest batchWriteRequest) {

        ExecutionContext executionContext = createExecutionContext(batchWriteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchWriteRequest> request = null;
        Response<BatchWriteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchWriteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchWriteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchWrite");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchWriteResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchWriteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <a>Directory</a> by copying the published schema into the directory. A directory cannot be created
     * without a schema.
     * </p>
     * <p>
     * You can also quickly create a directory using a managed schema, called the <code>QuickStartSchema</code>. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_managed.html">Managed Schema</a>
     * in the <i>Amazon Cloud Directory Developer Guide</i>.
     * </p>
     * 
     * @param createDirectoryRequest
     * @return Result of the CreateDirectory operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryAlreadyExistsException
     *         Indicates that a <a>Directory</a> could not be created due to a naming conflict. Choose a different name
     *         and try again.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @sample AmazonCloudDirectory.CreateDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/CreateDirectory" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
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
     * Creates a new <a>Facet</a> in a schema. Facet creation is allowed only in development or applied schemas.
     * </p>
     * 
     * @param createFacetRequest
     * @return Result of the CreateFacet operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetAlreadyExistsException
     *         A facet with the same name already exists.
     * @throws InvalidRuleException
     *         Occurs when any of the rule parameter keys or values are invalid.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @sample AmazonCloudDirectory.CreateFacet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/CreateFacet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateFacetResult createFacet(CreateFacetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFacet(request);
    }

    @SdkInternalApi
    final CreateFacetResult executeCreateFacet(CreateFacetRequest createFacetRequest) {

        ExecutionContext executionContext = createExecutionContext(createFacetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFacetRequest> request = null;
        Response<CreateFacetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFacetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFacetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFacet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFacetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFacetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an index object. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/indexing_search.html">Indexing and
     * search</a> for more information.
     * </p>
     * 
     * @param createIndexRequest
     * @return Result of the CreateIndex operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @throws LinkNameAlreadyInUseException
     *         Indicates that a link could not be created due to a naming conflict. Choose a different name and then try
     *         again.
     * @throws UnsupportedIndexTypeException
     *         Indicates that the requested index type is not supported.
     * @sample AmazonCloudDirectory.CreateIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/CreateIndex" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateIndexResult createIndex(CreateIndexRequest request) {
        request = beforeClientExecution(request);
        return executeCreateIndex(request);
    }

    @SdkInternalApi
    final CreateIndexResult executeCreateIndex(CreateIndexRequest createIndexRequest) {

        ExecutionContext executionContext = createExecutionContext(createIndexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIndexRequest> request = null;
        Response<CreateIndexResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIndexRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createIndexRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateIndex");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateIndexResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateIndexResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an object in a <a>Directory</a>. Additionally attaches the object to a parent, if a parent reference and
     * <code>LinkName</code> is specified. An object is simply a collection of <a>Facet</a> attributes. You can also use
     * this API call to create a policy object, if the facet from which you create the object is a policy facet.
     * </p>
     * 
     * @param createObjectRequest
     * @return Result of the CreateObject operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @throws LinkNameAlreadyInUseException
     *         Indicates that a link could not be created due to a naming conflict. Choose a different name and then try
     *         again.
     * @throws UnsupportedIndexTypeException
     *         Indicates that the requested index type is not supported.
     * @sample AmazonCloudDirectory.CreateObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/CreateObject" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateObjectResult createObject(CreateObjectRequest request) {
        request = beforeClientExecution(request);
        return executeCreateObject(request);
    }

    @SdkInternalApi
    final CreateObjectResult executeCreateObject(CreateObjectRequest createObjectRequest) {

        ExecutionContext executionContext = createExecutionContext(createObjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateObjectRequest> request = null;
        Response<CreateObjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateObjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createObjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateObject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateObjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateObjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new schema in a development state. A schema can exist in three phases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Development:</i> This is a mutable phase of the schema. All new schemas are in the development phase. Once the
     * schema is finalized, it can be published.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Published:</i> Published schemas are immutable and have a version associated with them.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Applied:</i> Applied schemas are mutable in a way that allows you to add new schema facets. You can also add
     * new, nonrequired attributes to existing schema facets. You can apply only published schemas to directories.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createSchemaRequest
     * @return Result of the CreateSchema operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws SchemaAlreadyExistsException
     *         Indicates that a schema could not be created due to a naming conflict. Please select a different name and
     *         then try again.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @sample AmazonCloudDirectory.CreateSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/CreateSchema" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateSchemaResult createSchema(CreateSchemaRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSchema(request);
    }

    @SdkInternalApi
    final CreateSchemaResult executeCreateSchema(CreateSchemaRequest createSchemaRequest) {

        ExecutionContext executionContext = createExecutionContext(createSchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSchemaRequest> request = null;
        Response<CreateSchemaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSchemaRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSchemaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSchema");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSchemaResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSchemaResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <a>TypedLinkFacet</a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param createTypedLinkFacetRequest
     * @return Result of the CreateTypedLinkFacet operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetAlreadyExistsException
     *         A facet with the same name already exists.
     * @throws InvalidRuleException
     *         Occurs when any of the rule parameter keys or values are invalid.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @sample AmazonCloudDirectory.CreateTypedLinkFacet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/CreateTypedLinkFacet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateTypedLinkFacetResult createTypedLinkFacet(CreateTypedLinkFacetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTypedLinkFacet(request);
    }

    @SdkInternalApi
    final CreateTypedLinkFacetResult executeCreateTypedLinkFacet(CreateTypedLinkFacetRequest createTypedLinkFacetRequest) {

        ExecutionContext executionContext = createExecutionContext(createTypedLinkFacetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTypedLinkFacetRequest> request = null;
        Response<CreateTypedLinkFacetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTypedLinkFacetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTypedLinkFacetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTypedLinkFacet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTypedLinkFacetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTypedLinkFacetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a directory. Only disabled directories can be deleted. A deleted directory cannot be undone. Exercise
     * extreme caution when deleting directories.
     * </p>
     * 
     * @param deleteDirectoryRequest
     * @return Result of the DeleteDirectory operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws DirectoryNotDisabledException
     *         An operation can only operate on a disabled directory.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryDeletedException
     *         A directory that has been deleted and to which access has been attempted. Note: The requested resource
     *         will eventually cease to exist.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @sample AmazonCloudDirectory.DeleteDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/DeleteDirectory" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
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
     * Deletes a given <a>Facet</a>. All attributes and <a>Rule</a>s that are associated with the facet will be deleted.
     * Only development schema facets are allowed deletion.
     * </p>
     * 
     * @param deleteFacetRequest
     * @return Result of the DeleteFacet operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetNotFoundException
     *         The specified <a>Facet</a> could not be found.
     * @throws FacetInUseException
     *         Occurs when deleting a facet that contains an attribute that is a target to an attribute reference in a
     *         different facet.
     * @sample AmazonCloudDirectory.DeleteFacet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/DeleteFacet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteFacetResult deleteFacet(DeleteFacetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFacet(request);
    }

    @SdkInternalApi
    final DeleteFacetResult executeDeleteFacet(DeleteFacetRequest deleteFacetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFacetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFacetRequest> request = null;
        Response<DeleteFacetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFacetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFacetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFacet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFacetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFacetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an object and its associated attributes. Only objects with no children and no parents can be deleted. The
     * maximum number of attributes that can be deleted during an object deletion is 30. For more information, see <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Amazon Cloud Directory
     * Limits</a>.
     * </p>
     * 
     * @param deleteObjectRequest
     * @return Result of the DeleteObject operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ObjectNotDetachedException
     *         Indicates that the requested operation cannot be completed because the object has not been detached from
     *         the tree.
     * @sample AmazonCloudDirectory.DeleteObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/DeleteObject" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteObjectResult deleteObject(DeleteObjectRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteObject(request);
    }

    @SdkInternalApi
    final DeleteObjectResult executeDeleteObject(DeleteObjectRequest deleteObjectRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteObjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteObjectRequest> request = null;
        Response<DeleteObjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteObjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteObjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteObject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteObjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteObjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a given schema. Schemas in a development and published state can only be deleted.
     * </p>
     * 
     * @param deleteSchemaRequest
     * @return Result of the DeleteSchema operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws StillContainsLinksException
     *         The object could not be deleted because links still exist. Remove the links and then try the operation
     *         again.
     * @sample AmazonCloudDirectory.DeleteSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/DeleteSchema" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteSchemaResult deleteSchema(DeleteSchemaRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSchema(request);
    }

    @SdkInternalApi
    final DeleteSchemaResult executeDeleteSchema(DeleteSchemaRequest deleteSchemaRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSchemaRequest> request = null;
        Response<DeleteSchemaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSchemaRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSchemaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSchema");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSchemaResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSchemaResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a <a>TypedLinkFacet</a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param deleteTypedLinkFacetRequest
     * @return Result of the DeleteTypedLinkFacet operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetNotFoundException
     *         The specified <a>Facet</a> could not be found.
     * @sample AmazonCloudDirectory.DeleteTypedLinkFacet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/DeleteTypedLinkFacet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteTypedLinkFacetResult deleteTypedLinkFacet(DeleteTypedLinkFacetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTypedLinkFacet(request);
    }

    @SdkInternalApi
    final DeleteTypedLinkFacetResult executeDeleteTypedLinkFacet(DeleteTypedLinkFacetRequest deleteTypedLinkFacetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTypedLinkFacetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTypedLinkFacetRequest> request = null;
        Response<DeleteTypedLinkFacetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTypedLinkFacetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTypedLinkFacetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTypedLinkFacet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTypedLinkFacetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTypedLinkFacetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detaches the specified object from the specified index.
     * </p>
     * 
     * @param detachFromIndexRequest
     * @return Result of the DetachFromIndex operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ObjectAlreadyDetachedException
     *         Indicates that the object is not attached to the index.
     * @throws NotIndexException
     *         Indicates that the requested operation can only operate on index objects.
     * @sample AmazonCloudDirectory.DetachFromIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/DetachFromIndex" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DetachFromIndexResult detachFromIndex(DetachFromIndexRequest request) {
        request = beforeClientExecution(request);
        return executeDetachFromIndex(request);
    }

    @SdkInternalApi
    final DetachFromIndexResult executeDetachFromIndex(DetachFromIndexRequest detachFromIndexRequest) {

        ExecutionContext executionContext = createExecutionContext(detachFromIndexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachFromIndexRequest> request = null;
        Response<DetachFromIndexResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachFromIndexRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(detachFromIndexRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetachFromIndex");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetachFromIndexResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DetachFromIndexResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detaches a given object from the parent object. The object that is to be detached from the parent is specified by
     * the link name.
     * </p>
     * 
     * @param detachObjectRequest
     * @return Result of the DetachObject operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws NotNodeException
     *         Occurs when any invalid operations are performed on an object that is not a node, such as calling
     *         <code>ListObjectChildren</code> for a leaf node object.
     * @sample AmazonCloudDirectory.DetachObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/DetachObject" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DetachObjectResult detachObject(DetachObjectRequest request) {
        request = beforeClientExecution(request);
        return executeDetachObject(request);
    }

    @SdkInternalApi
    final DetachObjectResult executeDetachObject(DetachObjectRequest detachObjectRequest) {

        ExecutionContext executionContext = createExecutionContext(detachObjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachObjectRequest> request = null;
        Response<DetachObjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachObjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(detachObjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetachObject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetachObjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DetachObjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detaches a policy from an object.
     * </p>
     * 
     * @param detachPolicyRequest
     * @return Result of the DetachPolicy operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws NotPolicyException
     *         Indicates that the requested operation can only operate on policy objects.
     * @sample AmazonCloudDirectory.DetachPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/DetachPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DetachPolicyResult detachPolicy(DetachPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDetachPolicy(request);
    }

    @SdkInternalApi
    final DetachPolicyResult executeDetachPolicy(DetachPolicyRequest detachPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(detachPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachPolicyRequest> request = null;
        Response<DetachPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(detachPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetachPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetachPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DetachPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detaches a typed link from a specified source and target object. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param detachTypedLinkRequest
     * @return Result of the DetachTypedLink operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @sample AmazonCloudDirectory.DetachTypedLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/DetachTypedLink" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DetachTypedLinkResult detachTypedLink(DetachTypedLinkRequest request) {
        request = beforeClientExecution(request);
        return executeDetachTypedLink(request);
    }

    @SdkInternalApi
    final DetachTypedLinkResult executeDetachTypedLink(DetachTypedLinkRequest detachTypedLinkRequest) {

        ExecutionContext executionContext = createExecutionContext(detachTypedLinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachTypedLinkRequest> request = null;
        Response<DetachTypedLinkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachTypedLinkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(detachTypedLinkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetachTypedLink");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetachTypedLinkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DetachTypedLinkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables the specified directory. Disabled directories cannot be read or written to. Only enabled directories can
     * be disabled. Disabled directories may be reenabled.
     * </p>
     * 
     * @param disableDirectoryRequest
     * @return Result of the DisableDirectory operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws DirectoryDeletedException
     *         A directory that has been deleted and to which access has been attempted. Note: The requested resource
     *         will eventually cease to exist.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @sample AmazonCloudDirectory.DisableDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/DisableDirectory"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisableDirectoryResult disableDirectory(DisableDirectoryRequest request) {
        request = beforeClientExecution(request);
        return executeDisableDirectory(request);
    }

    @SdkInternalApi
    final DisableDirectoryResult executeDisableDirectory(DisableDirectoryRequest disableDirectoryRequest) {

        ExecutionContext executionContext = createExecutionContext(disableDirectoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableDirectoryRequest> request = null;
        Response<DisableDirectoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableDirectoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disableDirectoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableDirectory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableDirectoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisableDirectoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the specified directory. Only disabled directories can be enabled. Once enabled, the directory can then
     * be read and written to.
     * </p>
     * 
     * @param enableDirectoryRequest
     * @return Result of the EnableDirectory operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws DirectoryDeletedException
     *         A directory that has been deleted and to which access has been attempted. Note: The requested resource
     *         will eventually cease to exist.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @sample AmazonCloudDirectory.EnableDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/EnableDirectory" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public EnableDirectoryResult enableDirectory(EnableDirectoryRequest request) {
        request = beforeClientExecution(request);
        return executeEnableDirectory(request);
    }

    @SdkInternalApi
    final EnableDirectoryResult executeEnableDirectory(EnableDirectoryRequest enableDirectoryRequest) {

        ExecutionContext executionContext = createExecutionContext(enableDirectoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableDirectoryRequest> request = null;
        Response<EnableDirectoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableDirectoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(enableDirectoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableDirectory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableDirectoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new EnableDirectoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns current applied schema version ARN, including the minor version in use.
     * </p>
     * 
     * @param getAppliedSchemaVersionRequest
     * @return Result of the GetAppliedSchemaVersion operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @sample AmazonCloudDirectory.GetAppliedSchemaVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/GetAppliedSchemaVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAppliedSchemaVersionResult getAppliedSchemaVersion(GetAppliedSchemaVersionRequest request) {
        request = beforeClientExecution(request);
        return executeGetAppliedSchemaVersion(request);
    }

    @SdkInternalApi
    final GetAppliedSchemaVersionResult executeGetAppliedSchemaVersion(GetAppliedSchemaVersionRequest getAppliedSchemaVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(getAppliedSchemaVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAppliedSchemaVersionRequest> request = null;
        Response<GetAppliedSchemaVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAppliedSchemaVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getAppliedSchemaVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAppliedSchemaVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAppliedSchemaVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetAppliedSchemaVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves metadata about a directory.
     * </p>
     * 
     * @param getDirectoryRequest
     * @return Result of the GetDirectory operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @sample AmazonCloudDirectory.GetDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/GetDirectory" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetDirectoryResult getDirectory(GetDirectoryRequest request) {
        request = beforeClientExecution(request);
        return executeGetDirectory(request);
    }

    @SdkInternalApi
    final GetDirectoryResult executeGetDirectory(GetDirectoryRequest getDirectoryRequest) {

        ExecutionContext executionContext = createExecutionContext(getDirectoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDirectoryRequest> request = null;
        Response<GetDirectoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDirectoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDirectoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDirectory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDirectoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDirectoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets details of the <a>Facet</a>, such as facet name, attributes, <a>Rule</a>s, or <code>ObjectType</code>. You
     * can call this on all kinds of schema facets -- published, development, or applied.
     * </p>
     * 
     * @param getFacetRequest
     * @return Result of the GetFacet operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetNotFoundException
     *         The specified <a>Facet</a> could not be found.
     * @sample AmazonCloudDirectory.GetFacet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/GetFacet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetFacetResult getFacet(GetFacetRequest request) {
        request = beforeClientExecution(request);
        return executeGetFacet(request);
    }

    @SdkInternalApi
    final GetFacetResult executeGetFacet(GetFacetRequest getFacetRequest) {

        ExecutionContext executionContext = createExecutionContext(getFacetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFacetRequest> request = null;
        Response<GetFacetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFacetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFacetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFacet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFacetResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFacetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves attributes that are associated with a typed link.
     * </p>
     * 
     * @param getLinkAttributesRequest
     * @return Result of the GetLinkAttributes operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @sample AmazonCloudDirectory.GetLinkAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/GetLinkAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetLinkAttributesResult getLinkAttributes(GetLinkAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeGetLinkAttributes(request);
    }

    @SdkInternalApi
    final GetLinkAttributesResult executeGetLinkAttributes(GetLinkAttributesRequest getLinkAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(getLinkAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLinkAttributesRequest> request = null;
        Response<GetLinkAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLinkAttributesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLinkAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLinkAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLinkAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLinkAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves attributes within a facet that are associated with an object.
     * </p>
     * 
     * @param getObjectAttributesRequest
     * @return Result of the GetObjectAttributes operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @sample AmazonCloudDirectory.GetObjectAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/GetObjectAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetObjectAttributesResult getObjectAttributes(GetObjectAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeGetObjectAttributes(request);
    }

    @SdkInternalApi
    final GetObjectAttributesResult executeGetObjectAttributes(GetObjectAttributesRequest getObjectAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(getObjectAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetObjectAttributesRequest> request = null;
        Response<GetObjectAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetObjectAttributesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getObjectAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetObjectAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetObjectAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetObjectAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves metadata about an object.
     * </p>
     * 
     * @param getObjectInformationRequest
     * @return Result of the GetObjectInformation operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @sample AmazonCloudDirectory.GetObjectInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/GetObjectInformation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetObjectInformationResult getObjectInformation(GetObjectInformationRequest request) {
        request = beforeClientExecution(request);
        return executeGetObjectInformation(request);
    }

    @SdkInternalApi
    final GetObjectInformationResult executeGetObjectInformation(GetObjectInformationRequest getObjectInformationRequest) {

        ExecutionContext executionContext = createExecutionContext(getObjectInformationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetObjectInformationRequest> request = null;
        Response<GetObjectInformationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetObjectInformationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getObjectInformationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetObjectInformation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetObjectInformationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetObjectInformationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a JSON representation of the schema. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_jsonformat.html#schemas_json">JSON
     * Schema Format</a> for more information.
     * </p>
     * 
     * @param getSchemaAsJsonRequest
     * @return Result of the GetSchemaAsJson operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @sample AmazonCloudDirectory.GetSchemaAsJson
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/GetSchemaAsJson" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetSchemaAsJsonResult getSchemaAsJson(GetSchemaAsJsonRequest request) {
        request = beforeClientExecution(request);
        return executeGetSchemaAsJson(request);
    }

    @SdkInternalApi
    final GetSchemaAsJsonResult executeGetSchemaAsJson(GetSchemaAsJsonRequest getSchemaAsJsonRequest) {

        ExecutionContext executionContext = createExecutionContext(getSchemaAsJsonRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSchemaAsJsonRequest> request = null;
        Response<GetSchemaAsJsonResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSchemaAsJsonRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSchemaAsJsonRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSchemaAsJson");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSchemaAsJsonResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSchemaAsJsonResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the identity attribute order for a specific <a>TypedLinkFacet</a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param getTypedLinkFacetInformationRequest
     * @return Result of the GetTypedLinkFacetInformation operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @throws FacetNotFoundException
     *         The specified <a>Facet</a> could not be found.
     * @sample AmazonCloudDirectory.GetTypedLinkFacetInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/GetTypedLinkFacetInformation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetTypedLinkFacetInformationResult getTypedLinkFacetInformation(GetTypedLinkFacetInformationRequest request) {
        request = beforeClientExecution(request);
        return executeGetTypedLinkFacetInformation(request);
    }

    @SdkInternalApi
    final GetTypedLinkFacetInformationResult executeGetTypedLinkFacetInformation(GetTypedLinkFacetInformationRequest getTypedLinkFacetInformationRequest) {

        ExecutionContext executionContext = createExecutionContext(getTypedLinkFacetInformationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTypedLinkFacetInformationRequest> request = null;
        Response<GetTypedLinkFacetInformationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTypedLinkFacetInformationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getTypedLinkFacetInformationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTypedLinkFacetInformation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTypedLinkFacetInformationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetTypedLinkFacetInformationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists schema major versions applied to a directory. If <code>SchemaArn</code> is provided, lists the minor
     * version.
     * </p>
     * 
     * @param listAppliedSchemaArnsRequest
     * @return Result of the ListAppliedSchemaArns operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @sample AmazonCloudDirectory.ListAppliedSchemaArns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListAppliedSchemaArns"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAppliedSchemaArnsResult listAppliedSchemaArns(ListAppliedSchemaArnsRequest request) {
        request = beforeClientExecution(request);
        return executeListAppliedSchemaArns(request);
    }

    @SdkInternalApi
    final ListAppliedSchemaArnsResult executeListAppliedSchemaArns(ListAppliedSchemaArnsRequest listAppliedSchemaArnsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAppliedSchemaArnsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAppliedSchemaArnsRequest> request = null;
        Response<ListAppliedSchemaArnsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAppliedSchemaArnsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAppliedSchemaArnsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAppliedSchemaArns");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAppliedSchemaArnsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListAppliedSchemaArnsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists indices attached to the specified object.
     * </p>
     * 
     * @param listAttachedIndicesRequest
     * @return Result of the ListAttachedIndices operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @sample AmazonCloudDirectory.ListAttachedIndices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListAttachedIndices"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAttachedIndicesResult listAttachedIndices(ListAttachedIndicesRequest request) {
        request = beforeClientExecution(request);
        return executeListAttachedIndices(request);
    }

    @SdkInternalApi
    final ListAttachedIndicesResult executeListAttachedIndices(ListAttachedIndicesRequest listAttachedIndicesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAttachedIndicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAttachedIndicesRequest> request = null;
        Response<ListAttachedIndicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAttachedIndicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAttachedIndicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAttachedIndices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAttachedIndicesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAttachedIndicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves each Amazon Resource Name (ARN) of schemas in the development state.
     * </p>
     * 
     * @param listDevelopmentSchemaArnsRequest
     * @return Result of the ListDevelopmentSchemaArns operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @sample AmazonCloudDirectory.ListDevelopmentSchemaArns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListDevelopmentSchemaArns"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDevelopmentSchemaArnsResult listDevelopmentSchemaArns(ListDevelopmentSchemaArnsRequest request) {
        request = beforeClientExecution(request);
        return executeListDevelopmentSchemaArns(request);
    }

    @SdkInternalApi
    final ListDevelopmentSchemaArnsResult executeListDevelopmentSchemaArns(ListDevelopmentSchemaArnsRequest listDevelopmentSchemaArnsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDevelopmentSchemaArnsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDevelopmentSchemaArnsRequest> request = null;
        Response<ListDevelopmentSchemaArnsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDevelopmentSchemaArnsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listDevelopmentSchemaArnsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDevelopmentSchemaArns");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDevelopmentSchemaArnsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListDevelopmentSchemaArnsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists directories created within an account.
     * </p>
     * 
     * @param listDirectoriesRequest
     * @return Result of the ListDirectories operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @sample AmazonCloudDirectory.ListDirectories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListDirectories" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListDirectoriesResult listDirectories(ListDirectoriesRequest request) {
        request = beforeClientExecution(request);
        return executeListDirectories(request);
    }

    @SdkInternalApi
    final ListDirectoriesResult executeListDirectories(ListDirectoriesRequest listDirectoriesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDirectoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDirectoriesRequest> request = null;
        Response<ListDirectoriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDirectoriesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDirectoriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDirectories");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDirectoriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDirectoriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves attributes attached to the facet.
     * </p>
     * 
     * @param listFacetAttributesRequest
     * @return Result of the ListFacetAttributes operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetNotFoundException
     *         The specified <a>Facet</a> could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @sample AmazonCloudDirectory.ListFacetAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListFacetAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListFacetAttributesResult listFacetAttributes(ListFacetAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeListFacetAttributes(request);
    }

    @SdkInternalApi
    final ListFacetAttributesResult executeListFacetAttributes(ListFacetAttributesRequest listFacetAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(listFacetAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFacetAttributesRequest> request = null;
        Response<ListFacetAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFacetAttributesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFacetAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFacetAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFacetAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFacetAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the names of facets that exist in a schema.
     * </p>
     * 
     * @param listFacetNamesRequest
     * @return Result of the ListFacetNames operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @sample AmazonCloudDirectory.ListFacetNames
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListFacetNames" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListFacetNamesResult listFacetNames(ListFacetNamesRequest request) {
        request = beforeClientExecution(request);
        return executeListFacetNames(request);
    }

    @SdkInternalApi
    final ListFacetNamesResult executeListFacetNames(ListFacetNamesRequest listFacetNamesRequest) {

        ExecutionContext executionContext = createExecutionContext(listFacetNamesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFacetNamesRequest> request = null;
        Response<ListFacetNamesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFacetNamesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFacetNamesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFacetNames");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFacetNamesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFacetNamesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a paginated list of all the incoming <a>TypedLinkSpecifier</a> information for an object. It also
     * supports filtering by typed link facet and identity attributes. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param listIncomingTypedLinksRequest
     * @return Result of the ListIncomingTypedLinks operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @sample AmazonCloudDirectory.ListIncomingTypedLinks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListIncomingTypedLinks"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListIncomingTypedLinksResult listIncomingTypedLinks(ListIncomingTypedLinksRequest request) {
        request = beforeClientExecution(request);
        return executeListIncomingTypedLinks(request);
    }

    @SdkInternalApi
    final ListIncomingTypedLinksResult executeListIncomingTypedLinks(ListIncomingTypedLinksRequest listIncomingTypedLinksRequest) {

        ExecutionContext executionContext = createExecutionContext(listIncomingTypedLinksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIncomingTypedLinksRequest> request = null;
        Response<ListIncomingTypedLinksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIncomingTypedLinksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listIncomingTypedLinksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListIncomingTypedLinks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListIncomingTypedLinksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListIncomingTypedLinksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists objects attached to the specified index.
     * </p>
     * 
     * @param listIndexRequest
     * @return Result of the ListIndex operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws NotIndexException
     *         Indicates that the requested operation can only operate on index objects.
     * @sample AmazonCloudDirectory.ListIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListIndex" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListIndexResult listIndex(ListIndexRequest request) {
        request = beforeClientExecution(request);
        return executeListIndex(request);
    }

    @SdkInternalApi
    final ListIndexResult executeListIndex(ListIndexRequest listIndexRequest) {

        ExecutionContext executionContext = createExecutionContext(listIndexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIndexRequest> request = null;
        Response<ListIndexResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIndexRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listIndexRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListIndex");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListIndexResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListIndexResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the major version families of each managed schema. If a major version ARN is provided as SchemaArn, the
     * minor version revisions in that family are listed instead.
     * </p>
     * 
     * @param listManagedSchemaArnsRequest
     * @return Result of the ListManagedSchemaArns operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @sample AmazonCloudDirectory.ListManagedSchemaArns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListManagedSchemaArns"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListManagedSchemaArnsResult listManagedSchemaArns(ListManagedSchemaArnsRequest request) {
        request = beforeClientExecution(request);
        return executeListManagedSchemaArns(request);
    }

    @SdkInternalApi
    final ListManagedSchemaArnsResult executeListManagedSchemaArns(ListManagedSchemaArnsRequest listManagedSchemaArnsRequest) {

        ExecutionContext executionContext = createExecutionContext(listManagedSchemaArnsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListManagedSchemaArnsRequest> request = null;
        Response<ListManagedSchemaArnsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListManagedSchemaArnsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listManagedSchemaArnsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListManagedSchemaArns");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListManagedSchemaArnsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListManagedSchemaArnsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all attributes that are associated with an object.
     * </p>
     * 
     * @param listObjectAttributesRequest
     * @return Result of the ListObjectAttributes operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @sample AmazonCloudDirectory.ListObjectAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListObjectAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListObjectAttributesResult listObjectAttributes(ListObjectAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeListObjectAttributes(request);
    }

    @SdkInternalApi
    final ListObjectAttributesResult executeListObjectAttributes(ListObjectAttributesRequest listObjectAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(listObjectAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListObjectAttributesRequest> request = null;
        Response<ListObjectAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListObjectAttributesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listObjectAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListObjectAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListObjectAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListObjectAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a paginated list of child objects that are associated with a given object.
     * </p>
     * 
     * @param listObjectChildrenRequest
     * @return Result of the ListObjectChildren operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @throws NotNodeException
     *         Occurs when any invalid operations are performed on an object that is not a node, such as calling
     *         <code>ListObjectChildren</code> for a leaf node object.
     * @sample AmazonCloudDirectory.ListObjectChildren
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListObjectChildren"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListObjectChildrenResult listObjectChildren(ListObjectChildrenRequest request) {
        request = beforeClientExecution(request);
        return executeListObjectChildren(request);
    }

    @SdkInternalApi
    final ListObjectChildrenResult executeListObjectChildren(ListObjectChildrenRequest listObjectChildrenRequest) {

        ExecutionContext executionContext = createExecutionContext(listObjectChildrenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListObjectChildrenRequest> request = null;
        Response<ListObjectChildrenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListObjectChildrenRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listObjectChildrenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListObjectChildren");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListObjectChildrenResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListObjectChildrenResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node
     * objects. For more information about objects, see <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directorystructure.html"
     * >Directory Structure</a>.
     * </p>
     * <p>
     * Use this API to evaluate all parents for an object. The call returns all objects from the root of the directory
     * up to the requested object. The API returns the number of paths based on user-defined <code>MaxResults</code>, in
     * case there are multiple paths to the parent. The order of the paths and nodes returned is consistent among
     * multiple API calls unless the objects are deleted or moved. Paths not leading to the directory root are ignored
     * from the target object.
     * </p>
     * 
     * @param listObjectParentPathsRequest
     * @return Result of the ListObjectParentPaths operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @sample AmazonCloudDirectory.ListObjectParentPaths
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListObjectParentPaths"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListObjectParentPathsResult listObjectParentPaths(ListObjectParentPathsRequest request) {
        request = beforeClientExecution(request);
        return executeListObjectParentPaths(request);
    }

    @SdkInternalApi
    final ListObjectParentPathsResult executeListObjectParentPaths(ListObjectParentPathsRequest listObjectParentPathsRequest) {

        ExecutionContext executionContext = createExecutionContext(listObjectParentPathsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListObjectParentPathsRequest> request = null;
        Response<ListObjectParentPathsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListObjectParentPathsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listObjectParentPathsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListObjectParentPaths");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListObjectParentPathsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListObjectParentPathsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists parent objects that are associated with a given object in pagination fashion.
     * </p>
     * 
     * @param listObjectParentsRequest
     * @return Result of the ListObjectParents operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @throws CannotListParentOfRootException
     *         Cannot list the parents of a <a>Directory</a> root.
     * @sample AmazonCloudDirectory.ListObjectParents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListObjectParents"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListObjectParentsResult listObjectParents(ListObjectParentsRequest request) {
        request = beforeClientExecution(request);
        return executeListObjectParents(request);
    }

    @SdkInternalApi
    final ListObjectParentsResult executeListObjectParents(ListObjectParentsRequest listObjectParentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listObjectParentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListObjectParentsRequest> request = null;
        Response<ListObjectParentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListObjectParentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listObjectParentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListObjectParents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListObjectParentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListObjectParentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns policies attached to an object in pagination fashion.
     * </p>
     * 
     * @param listObjectPoliciesRequest
     * @return Result of the ListObjectPolicies operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @sample AmazonCloudDirectory.ListObjectPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListObjectPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListObjectPoliciesResult listObjectPolicies(ListObjectPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeListObjectPolicies(request);
    }

    @SdkInternalApi
    final ListObjectPoliciesResult executeListObjectPolicies(ListObjectPoliciesRequest listObjectPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(listObjectPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListObjectPoliciesRequest> request = null;
        Response<ListObjectPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListObjectPoliciesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listObjectPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListObjectPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListObjectPoliciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListObjectPoliciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a paginated list of all the outgoing <a>TypedLinkSpecifier</a> information for an object. It also
     * supports filtering by typed link facet and identity attributes. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param listOutgoingTypedLinksRequest
     * @return Result of the ListOutgoingTypedLinks operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @sample AmazonCloudDirectory.ListOutgoingTypedLinks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListOutgoingTypedLinks"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListOutgoingTypedLinksResult listOutgoingTypedLinks(ListOutgoingTypedLinksRequest request) {
        request = beforeClientExecution(request);
        return executeListOutgoingTypedLinks(request);
    }

    @SdkInternalApi
    final ListOutgoingTypedLinksResult executeListOutgoingTypedLinks(ListOutgoingTypedLinksRequest listOutgoingTypedLinksRequest) {

        ExecutionContext executionContext = createExecutionContext(listOutgoingTypedLinksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOutgoingTypedLinksRequest> request = null;
        Response<ListOutgoingTypedLinksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOutgoingTypedLinksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listOutgoingTypedLinksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListOutgoingTypedLinks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListOutgoingTypedLinksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListOutgoingTypedLinksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns all of the <code>ObjectIdentifiers</code> to which a given policy is attached.
     * </p>
     * 
     * @param listPolicyAttachmentsRequest
     * @return Result of the ListPolicyAttachments operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws NotPolicyException
     *         Indicates that the requested operation can only operate on policy objects.
     * @sample AmazonCloudDirectory.ListPolicyAttachments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListPolicyAttachments"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPolicyAttachmentsResult listPolicyAttachments(ListPolicyAttachmentsRequest request) {
        request = beforeClientExecution(request);
        return executeListPolicyAttachments(request);
    }

    @SdkInternalApi
    final ListPolicyAttachmentsResult executeListPolicyAttachments(ListPolicyAttachmentsRequest listPolicyAttachmentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPolicyAttachmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPolicyAttachmentsRequest> request = null;
        Response<ListPolicyAttachmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPolicyAttachmentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPolicyAttachmentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPolicyAttachments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPolicyAttachmentsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListPolicyAttachmentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the major version families of each published schema. If a major version ARN is provided as
     * <code>SchemaArn</code>, the minor version revisions in that family are listed instead.
     * </p>
     * 
     * @param listPublishedSchemaArnsRequest
     * @return Result of the ListPublishedSchemaArns operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @sample AmazonCloudDirectory.ListPublishedSchemaArns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListPublishedSchemaArns"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPublishedSchemaArnsResult listPublishedSchemaArns(ListPublishedSchemaArnsRequest request) {
        request = beforeClientExecution(request);
        return executeListPublishedSchemaArns(request);
    }

    @SdkInternalApi
    final ListPublishedSchemaArnsResult executeListPublishedSchemaArns(ListPublishedSchemaArnsRequest listPublishedSchemaArnsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPublishedSchemaArnsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPublishedSchemaArnsRequest> request = null;
        Response<ListPublishedSchemaArnsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPublishedSchemaArnsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listPublishedSchemaArnsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPublishedSchemaArns");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPublishedSchemaArnsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListPublishedSchemaArnsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns tags for a resource. Tagging is currently supported only for directories with a limit of 50 tags per
     * directory. All 50 tags are returned for a given directory with this API call.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidTaggingRequestException
     *         Can occur for multiple reasons such as when you tag a resource that doesn’t exist or if you specify a
     *         higher number of tags for a resource than the allowed limit. Allowed limit is 50 tags per resource.
     * @sample AmazonCloudDirectory.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
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
     * Returns a paginated list of all attribute definitions for a particular <a>TypedLinkFacet</a>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param listTypedLinkFacetAttributesRequest
     * @return Result of the ListTypedLinkFacetAttributes operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetNotFoundException
     *         The specified <a>Facet</a> could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @sample AmazonCloudDirectory.ListTypedLinkFacetAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListTypedLinkFacetAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTypedLinkFacetAttributesResult listTypedLinkFacetAttributes(ListTypedLinkFacetAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeListTypedLinkFacetAttributes(request);
    }

    @SdkInternalApi
    final ListTypedLinkFacetAttributesResult executeListTypedLinkFacetAttributes(ListTypedLinkFacetAttributesRequest listTypedLinkFacetAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(listTypedLinkFacetAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTypedLinkFacetAttributesRequest> request = null;
        Response<ListTypedLinkFacetAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTypedLinkFacetAttributesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listTypedLinkFacetAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTypedLinkFacetAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTypedLinkFacetAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListTypedLinkFacetAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a paginated list of <code>TypedLink</code> facet names for a particular schema. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param listTypedLinkFacetNamesRequest
     * @return Result of the ListTypedLinkFacetNames operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @sample AmazonCloudDirectory.ListTypedLinkFacetNames
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListTypedLinkFacetNames"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTypedLinkFacetNamesResult listTypedLinkFacetNames(ListTypedLinkFacetNamesRequest request) {
        request = beforeClientExecution(request);
        return executeListTypedLinkFacetNames(request);
    }

    @SdkInternalApi
    final ListTypedLinkFacetNamesResult executeListTypedLinkFacetNames(ListTypedLinkFacetNamesRequest listTypedLinkFacetNamesRequest) {

        ExecutionContext executionContext = createExecutionContext(listTypedLinkFacetNamesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTypedLinkFacetNamesRequest> request = null;
        Response<ListTypedLinkFacetNamesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTypedLinkFacetNamesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listTypedLinkFacetNamesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTypedLinkFacetNames");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTypedLinkFacetNamesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListTypedLinkFacetNamesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all policies from the root of the <a>Directory</a> to the object specified. If there are no policies
     * present, an empty list is returned. If policies are present, and if some objects don't have the policies
     * attached, it returns the <code>ObjectIdentifier</code> for such objects. If policies are present, it returns
     * <code>ObjectIdentifier</code>, <code>policyId</code>, and <code>policyType</code>. Paths that don't lead to the
     * root from the target object are ignored. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
     * >Policies</a>.
     * </p>
     * 
     * @param lookupPolicyRequest
     * @return Result of the LookupPolicy operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @sample AmazonCloudDirectory.LookupPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/LookupPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public LookupPolicyResult lookupPolicy(LookupPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeLookupPolicy(request);
    }

    @SdkInternalApi
    final LookupPolicyResult executeLookupPolicy(LookupPolicyRequest lookupPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(lookupPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<LookupPolicyRequest> request = null;
        Response<LookupPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new LookupPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(lookupPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "LookupPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<LookupPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new LookupPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Publishes a development schema with a major version and a recommended minor version.
     * </p>
     * 
     * @param publishSchemaRequest
     * @return Result of the PublishSchema operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws SchemaAlreadyPublishedException
     *         Indicates that a schema is already published.
     * @sample AmazonCloudDirectory.PublishSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/PublishSchema" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PublishSchemaResult publishSchema(PublishSchemaRequest request) {
        request = beforeClientExecution(request);
        return executePublishSchema(request);
    }

    @SdkInternalApi
    final PublishSchemaResult executePublishSchema(PublishSchemaRequest publishSchemaRequest) {

        ExecutionContext executionContext = createExecutionContext(publishSchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PublishSchemaRequest> request = null;
        Response<PublishSchemaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PublishSchemaRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(publishSchemaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PublishSchema");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PublishSchemaResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PublishSchemaResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows a schema to be updated using JSON upload. Only available for development schemas. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_jsonformat.html#schemas_json">JSON
     * Schema Format</a> for more information.
     * </p>
     * 
     * @param putSchemaFromJsonRequest
     * @return Result of the PutSchemaFromJson operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws InvalidSchemaDocException
     *         Indicates that the provided <code>SchemaDoc</code> value is not valid.
     * @throws InvalidRuleException
     *         Occurs when any of the rule parameter keys or values are invalid.
     * @sample AmazonCloudDirectory.PutSchemaFromJson
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/PutSchemaFromJson"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutSchemaFromJsonResult putSchemaFromJson(PutSchemaFromJsonRequest request) {
        request = beforeClientExecution(request);
        return executePutSchemaFromJson(request);
    }

    @SdkInternalApi
    final PutSchemaFromJsonResult executePutSchemaFromJson(PutSchemaFromJsonRequest putSchemaFromJsonRequest) {

        ExecutionContext executionContext = createExecutionContext(putSchemaFromJsonRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutSchemaFromJsonRequest> request = null;
        Response<PutSchemaFromJsonResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutSchemaFromJsonRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putSchemaFromJsonRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutSchemaFromJson");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutSchemaFromJsonResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutSchemaFromJsonResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified facet from the specified object.
     * </p>
     * 
     * @param removeFacetFromObjectRequest
     * @return Result of the RemoveFacetFromObject operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @sample AmazonCloudDirectory.RemoveFacetFromObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/RemoveFacetFromObject"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RemoveFacetFromObjectResult removeFacetFromObject(RemoveFacetFromObjectRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveFacetFromObject(request);
    }

    @SdkInternalApi
    final RemoveFacetFromObjectResult executeRemoveFacetFromObject(RemoveFacetFromObjectRequest removeFacetFromObjectRequest) {

        ExecutionContext executionContext = createExecutionContext(removeFacetFromObjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveFacetFromObjectRequest> request = null;
        Response<RemoveFacetFromObjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveFacetFromObjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(removeFacetFromObjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveFacetFromObject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveFacetFromObjectResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new RemoveFacetFromObjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * An API operation for adding tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidTaggingRequestException
     *         Can occur for multiple reasons such as when you tag a resource that doesn’t exist or if you specify a
     *         higher number of tags for a resource than the allowed limit. Allowed limit is 50 tags per resource.
     * @sample AmazonCloudDirectory.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeTagResource(request);
    }

    @SdkInternalApi
    final TagResourceResult executeTagResource(TagResourceRequest tagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * An API operation for removing tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidTaggingRequestException
     *         Can occur for multiple reasons such as when you tag a resource that doesn’t exist or if you specify a
     *         higher number of tags for a resource than the allowed limit. Allowed limit is 50 tags per resource.
     * @sample AmazonCloudDirectory.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResource(request);
    }

    @SdkInternalApi
    final UntagResourceResult executeUntagResource(UntagResourceRequest untagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Does the following:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Adds new <code>Attributes</code>, <code>Rules</code>, or <code>ObjectTypes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Updates existing <code>Attributes</code>, <code>Rules</code>, or <code>ObjectTypes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deletes existing <code>Attributes</code>, <code>Rules</code>, or <code>ObjectTypes</code>.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateFacetRequest
     * @return Result of the UpdateFacet operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws InvalidFacetUpdateException
     *         An attempt to modify a <a>Facet</a> resulted in an invalid schema exception.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetNotFoundException
     *         The specified <a>Facet</a> could not be found.
     * @throws InvalidRuleException
     *         Occurs when any of the rule parameter keys or values are invalid.
     * @sample AmazonCloudDirectory.UpdateFacet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/UpdateFacet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateFacetResult updateFacet(UpdateFacetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFacet(request);
    }

    @SdkInternalApi
    final UpdateFacetResult executeUpdateFacet(UpdateFacetRequest updateFacetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFacetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFacetRequest> request = null;
        Response<UpdateFacetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFacetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFacetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFacet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFacetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFacetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a given typed link’s attributes. Attributes to be updated must not contribute to the typed link’s
     * identity, as defined by its <code>IdentityAttributeOrder</code>.
     * </p>
     * 
     * @param updateLinkAttributesRequest
     * @return Result of the UpdateLinkAttributes operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @sample AmazonCloudDirectory.UpdateLinkAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/UpdateLinkAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateLinkAttributesResult updateLinkAttributes(UpdateLinkAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLinkAttributes(request);
    }

    @SdkInternalApi
    final UpdateLinkAttributesResult executeUpdateLinkAttributes(UpdateLinkAttributesRequest updateLinkAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLinkAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLinkAttributesRequest> request = null;
        Response<UpdateLinkAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLinkAttributesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateLinkAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLinkAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLinkAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateLinkAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a given object's attributes.
     * </p>
     * 
     * @param updateObjectAttributesRequest
     * @return Result of the UpdateObjectAttributes operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws LinkNameAlreadyInUseException
     *         Indicates that a link could not be created due to a naming conflict. Choose a different name and then try
     *         again.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @sample AmazonCloudDirectory.UpdateObjectAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/UpdateObjectAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateObjectAttributesResult updateObjectAttributes(UpdateObjectAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateObjectAttributes(request);
    }

    @SdkInternalApi
    final UpdateObjectAttributesResult executeUpdateObjectAttributes(UpdateObjectAttributesRequest updateObjectAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(updateObjectAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateObjectAttributesRequest> request = null;
        Response<UpdateObjectAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateObjectAttributesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateObjectAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateObjectAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateObjectAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateObjectAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the schema name with a new name. Only development schema names can be updated.
     * </p>
     * 
     * @param updateSchemaRequest
     * @return Result of the UpdateSchema operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @sample AmazonCloudDirectory.UpdateSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/UpdateSchema" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateSchemaResult updateSchema(UpdateSchemaRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSchema(request);
    }

    @SdkInternalApi
    final UpdateSchemaResult executeUpdateSchema(UpdateSchemaRequest updateSchemaRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSchemaRequest> request = null;
        Response<UpdateSchemaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSchemaRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSchemaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSchema");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSchemaResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSchemaResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a <a>TypedLinkFacet</a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param updateTypedLinkFacetRequest
     * @return Result of the UpdateTypedLinkFacet operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @throws InvalidFacetUpdateException
     *         An attempt to modify a <a>Facet</a> resulted in an invalid schema exception.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetNotFoundException
     *         The specified <a>Facet</a> could not be found.
     * @throws InvalidRuleException
     *         Occurs when any of the rule parameter keys or values are invalid.
     * @sample AmazonCloudDirectory.UpdateTypedLinkFacet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/UpdateTypedLinkFacet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateTypedLinkFacetResult updateTypedLinkFacet(UpdateTypedLinkFacetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTypedLinkFacet(request);
    }

    @SdkInternalApi
    final UpdateTypedLinkFacetResult executeUpdateTypedLinkFacet(UpdateTypedLinkFacetRequest updateTypedLinkFacetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTypedLinkFacetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTypedLinkFacetRequest> request = null;
        Response<UpdateTypedLinkFacetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTypedLinkFacetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTypedLinkFacetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTypedLinkFacet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTypedLinkFacetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTypedLinkFacetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Upgrades a single directory in-place using the <code>PublishedSchemaArn</code> with schema updates found in
     * <code>MinorVersion</code>. Backwards-compatible minor version upgrades are instantaneously available for readers
     * on all objects in the directory. Note: This is a synchronous API call and upgrades only one schema on a given
     * directory per call. To upgrade multiple directories from one schema, you would need to call this API on each
     * directory.
     * </p>
     * 
     * @param upgradeAppliedSchemaRequest
     * @return Result of the UpgradeAppliedSchema operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws IncompatibleSchemaException
     *         Indicates a failure occurred while performing a check for backward compatibility between the specified
     *         schema and the schema that is currently applied to the directory.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidAttachmentException
     *         Indicates that an attempt to make an attachment was invalid. For example, attaching two nodes with a link
     *         type that is not applicable to the nodes or attempting to apply a schema to a directory a second time.
     * @throws SchemaAlreadyExistsException
     *         Indicates that a schema could not be created due to a naming conflict. Please select a different name and
     *         then try again.
     * @sample AmazonCloudDirectory.UpgradeAppliedSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/UpgradeAppliedSchema"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpgradeAppliedSchemaResult upgradeAppliedSchema(UpgradeAppliedSchemaRequest request) {
        request = beforeClientExecution(request);
        return executeUpgradeAppliedSchema(request);
    }

    @SdkInternalApi
    final UpgradeAppliedSchemaResult executeUpgradeAppliedSchema(UpgradeAppliedSchemaRequest upgradeAppliedSchemaRequest) {

        ExecutionContext executionContext = createExecutionContext(upgradeAppliedSchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpgradeAppliedSchemaRequest> request = null;
        Response<UpgradeAppliedSchemaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpgradeAppliedSchemaRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(upgradeAppliedSchemaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpgradeAppliedSchema");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpgradeAppliedSchemaResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpgradeAppliedSchemaResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Upgrades a published schema under a new minor version revision using the current contents of
     * <code>DevelopmentSchemaArn</code>.
     * </p>
     * 
     * @param upgradePublishedSchemaRequest
     * @return Result of the UpgradePublishedSchema operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws IncompatibleSchemaException
     *         Indicates a failure occurred while performing a check for backward compatibility between the specified
     *         schema and the schema that is currently applied to the directory.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidAttachmentException
     *         Indicates that an attempt to make an attachment was invalid. For example, attaching two nodes with a link
     *         type that is not applicable to the nodes or attempting to apply a schema to a directory a second time.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @sample AmazonCloudDirectory.UpgradePublishedSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/UpgradePublishedSchema"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpgradePublishedSchemaResult upgradePublishedSchema(UpgradePublishedSchemaRequest request) {
        request = beforeClientExecution(request);
        return executeUpgradePublishedSchema(request);
    }

    @SdkInternalApi
    final UpgradePublishedSchemaResult executeUpgradePublishedSchema(UpgradePublishedSchemaRequest upgradePublishedSchemaRequest) {

        ExecutionContext executionContext = createExecutionContext(upgradePublishedSchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpgradePublishedSchemaRequest> request = null;
        Response<UpgradePublishedSchemaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpgradePublishedSchemaRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(upgradePublishedSchemaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudDirectory");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpgradePublishedSchema");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpgradePublishedSchemaResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpgradePublishedSchemaResultJsonUnmarshaller());
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
