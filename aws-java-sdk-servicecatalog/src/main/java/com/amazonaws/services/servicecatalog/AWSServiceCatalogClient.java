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
package com.amazonaws.services.servicecatalog;

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

import com.amazonaws.services.servicecatalog.AWSServiceCatalogClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.services.servicecatalog.model.transform.*;

/**
 * Client for accessing AWS Service Catalog. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname>AWS Service Catalog</fullname>
 * <p>
 * <a href="https://aws.amazon.com/servicecatalog/">AWS Service Catalog</a> enables organizations to create and manage
 * catalogs of IT services that are approved for use on AWS. To get the most out of this documentation, you should be
 * familiar with the terminology discussed in <a
 * href="http://docs.aws.amazon.com/servicecatalog/latest/adminguide/what-is_concepts.html">AWS Service Catalog
 * Concepts</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSServiceCatalogClient extends AmazonWebServiceClient implements AWSServiceCatalog {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSServiceCatalog.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "servicecatalog";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParametersException").withModeledClass(
                                    com.amazonaws.services.servicecatalog.model.InvalidParametersException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OperationNotSupportedException").withModeledClass(
                                    com.amazonaws.services.servicecatalog.model.OperationNotSupportedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidStateException").withModeledClass(
                                    com.amazonaws.services.servicecatalog.model.InvalidStateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DuplicateResourceException").withModeledClass(
                                    com.amazonaws.services.servicecatalog.model.DuplicateResourceException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.servicecatalog.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.servicecatalog.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TagOptionNotMigratedException").withModeledClass(
                                    com.amazonaws.services.servicecatalog.model.TagOptionNotMigratedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withModeledClass(
                                    com.amazonaws.services.servicecatalog.model.ResourceInUseException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.servicecatalog.model.AWSServiceCatalogException.class));

    /**
     * Constructs a new client to invoke service methods on AWS Service Catalog. A credentials provider chain will be
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
     * @deprecated use {@link AWSServiceCatalogClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSServiceCatalogClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Service Catalog. A credentials provider chain will be
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
     *        The client configuration options controlling how this client connects to AWS Service Catalog (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSServiceCatalogClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSServiceCatalogClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Service Catalog using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSServiceCatalogClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSServiceCatalogClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSServiceCatalogClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Service Catalog using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Service Catalog (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AWSServiceCatalogClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSServiceCatalogClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSServiceCatalogClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Service Catalog using the specified AWS account
     * credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSServiceCatalogClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSServiceCatalogClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Service Catalog using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Service Catalog (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AWSServiceCatalogClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSServiceCatalogClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSServiceCatalogClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Service Catalog using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Service Catalog (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSServiceCatalogClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSServiceCatalogClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSServiceCatalogClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSServiceCatalogClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSServiceCatalogClientBuilder builder() {
        return AWSServiceCatalogClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Service Catalog using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSServiceCatalogClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Service Catalog using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSServiceCatalogClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("servicecatalog.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/servicecatalog/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/servicecatalog/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Accepts an offer to share the specified portfolio.
     * </p>
     * 
     * @param acceptPortfolioShareRequest
     * @return Result of the AcceptPortfolioShare operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Decrease your resource use
     *         or increase your service limits and retry the operation.
     * @sample AWSServiceCatalog.AcceptPortfolioShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/AcceptPortfolioShare"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AcceptPortfolioShareResult acceptPortfolioShare(AcceptPortfolioShareRequest request) {
        request = beforeClientExecution(request);
        return executeAcceptPortfolioShare(request);
    }

    @SdkInternalApi
    final AcceptPortfolioShareResult executeAcceptPortfolioShare(AcceptPortfolioShareRequest acceptPortfolioShareRequest) {

        ExecutionContext executionContext = createExecutionContext(acceptPortfolioShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptPortfolioShareRequest> request = null;
        Response<AcceptPortfolioShareResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptPortfolioShareRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(acceptPortfolioShareRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AcceptPortfolioShare");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AcceptPortfolioShareResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AcceptPortfolioShareResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates the specified principal ARN with the specified portfolio.
     * </p>
     * 
     * @param associatePrincipalWithPortfolioRequest
     * @return Result of the AssociatePrincipalWithPortfolio operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Decrease your resource use
     *         or increase your service limits and retry the operation.
     * @sample AWSServiceCatalog.AssociatePrincipalWithPortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/AssociatePrincipalWithPortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociatePrincipalWithPortfolioResult associatePrincipalWithPortfolio(AssociatePrincipalWithPortfolioRequest request) {
        request = beforeClientExecution(request);
        return executeAssociatePrincipalWithPortfolio(request);
    }

    @SdkInternalApi
    final AssociatePrincipalWithPortfolioResult executeAssociatePrincipalWithPortfolio(
            AssociatePrincipalWithPortfolioRequest associatePrincipalWithPortfolioRequest) {

        ExecutionContext executionContext = createExecutionContext(associatePrincipalWithPortfolioRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociatePrincipalWithPortfolioRequest> request = null;
        Response<AssociatePrincipalWithPortfolioResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociatePrincipalWithPortfolioRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associatePrincipalWithPortfolioRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociatePrincipalWithPortfolio");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociatePrincipalWithPortfolioResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociatePrincipalWithPortfolioResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates the specified product with the specified portfolio.
     * </p>
     * 
     * @param associateProductWithPortfolioRequest
     * @return Result of the AssociateProductWithPortfolio operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Decrease your resource use
     *         or increase your service limits and retry the operation.
     * @sample AWSServiceCatalog.AssociateProductWithPortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/AssociateProductWithPortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateProductWithPortfolioResult associateProductWithPortfolio(AssociateProductWithPortfolioRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateProductWithPortfolio(request);
    }

    @SdkInternalApi
    final AssociateProductWithPortfolioResult executeAssociateProductWithPortfolio(AssociateProductWithPortfolioRequest associateProductWithPortfolioRequest) {

        ExecutionContext executionContext = createExecutionContext(associateProductWithPortfolioRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateProductWithPortfolioRequest> request = null;
        Response<AssociateProductWithPortfolioResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateProductWithPortfolioRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateProductWithPortfolioRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateProductWithPortfolio");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateProductWithPortfolioResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateProductWithPortfolioResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a self-service action with a provisioning artifact.
     * </p>
     * 
     * @param associateServiceActionWithProvisioningArtifactRequest
     * @return Result of the AssociateServiceActionWithProvisioningArtifact operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws DuplicateResourceException
     *         The specified resource is a duplicate.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Decrease your resource use
     *         or increase your service limits and retry the operation.
     * @sample AWSServiceCatalog.AssociateServiceActionWithProvisioningArtifact
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/AssociateServiceActionWithProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateServiceActionWithProvisioningArtifactResult associateServiceActionWithProvisioningArtifact(
            AssociateServiceActionWithProvisioningArtifactRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateServiceActionWithProvisioningArtifact(request);
    }

    @SdkInternalApi
    final AssociateServiceActionWithProvisioningArtifactResult executeAssociateServiceActionWithProvisioningArtifact(
            AssociateServiceActionWithProvisioningArtifactRequest associateServiceActionWithProvisioningArtifactRequest) {

        ExecutionContext executionContext = createExecutionContext(associateServiceActionWithProvisioningArtifactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateServiceActionWithProvisioningArtifactRequest> request = null;
        Response<AssociateServiceActionWithProvisioningArtifactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateServiceActionWithProvisioningArtifactRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateServiceActionWithProvisioningArtifactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateServiceActionWithProvisioningArtifact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateServiceActionWithProvisioningArtifactResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new AssociateServiceActionWithProvisioningArtifactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associate the specified TagOption with the specified portfolio or product.
     * </p>
     * 
     * @param associateTagOptionWithResourceRequest
     * @return Result of the AssociateTagOptionWithResource operation returned by the service.
     * @throws TagOptionNotMigratedException
     *         An operation requiring TagOptions failed because the TagOptions migration process has not been performed
     *         for this account. Please use the AWS console to perform the migration process before retrying the
     *         operation.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Decrease your resource use
     *         or increase your service limits and retry the operation.
     * @throws DuplicateResourceException
     *         The specified resource is a duplicate.
     * @throws InvalidStateException
     *         An attempt was made to modify a resource that is in a state that is not valid. Check your resources to
     *         ensure that they are in valid states before retrying the operation.
     * @sample AWSServiceCatalog.AssociateTagOptionWithResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/AssociateTagOptionWithResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateTagOptionWithResourceResult associateTagOptionWithResource(AssociateTagOptionWithResourceRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateTagOptionWithResource(request);
    }

    @SdkInternalApi
    final AssociateTagOptionWithResourceResult executeAssociateTagOptionWithResource(AssociateTagOptionWithResourceRequest associateTagOptionWithResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(associateTagOptionWithResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateTagOptionWithResourceRequest> request = null;
        Response<AssociateTagOptionWithResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateTagOptionWithResourceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateTagOptionWithResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateTagOptionWithResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateTagOptionWithResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateTagOptionWithResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates multiple self-service actions with provisioning artifacts.
     * </p>
     * 
     * @param batchAssociateServiceActionWithProvisioningArtifactRequest
     * @return Result of the BatchAssociateServiceActionWithProvisioningArtifact operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.BatchAssociateServiceActionWithProvisioningArtifact
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/BatchAssociateServiceActionWithProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchAssociateServiceActionWithProvisioningArtifactResult batchAssociateServiceActionWithProvisioningArtifact(
            BatchAssociateServiceActionWithProvisioningArtifactRequest request) {
        request = beforeClientExecution(request);
        return executeBatchAssociateServiceActionWithProvisioningArtifact(request);
    }

    @SdkInternalApi
    final BatchAssociateServiceActionWithProvisioningArtifactResult executeBatchAssociateServiceActionWithProvisioningArtifact(
            BatchAssociateServiceActionWithProvisioningArtifactRequest batchAssociateServiceActionWithProvisioningArtifactRequest) {

        ExecutionContext executionContext = createExecutionContext(batchAssociateServiceActionWithProvisioningArtifactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchAssociateServiceActionWithProvisioningArtifactRequest> request = null;
        Response<BatchAssociateServiceActionWithProvisioningArtifactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchAssociateServiceActionWithProvisioningArtifactRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchAssociateServiceActionWithProvisioningArtifactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchAssociateServiceActionWithProvisioningArtifact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchAssociateServiceActionWithProvisioningArtifactResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new BatchAssociateServiceActionWithProvisioningArtifactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a batch of self-service actions from the specified provisioning artifact.
     * </p>
     * 
     * @param batchDisassociateServiceActionFromProvisioningArtifactRequest
     * @return Result of the BatchDisassociateServiceActionFromProvisioningArtifact operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.BatchDisassociateServiceActionFromProvisioningArtifact
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/BatchDisassociateServiceActionFromProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchDisassociateServiceActionFromProvisioningArtifactResult batchDisassociateServiceActionFromProvisioningArtifact(
            BatchDisassociateServiceActionFromProvisioningArtifactRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDisassociateServiceActionFromProvisioningArtifact(request);
    }

    @SdkInternalApi
    final BatchDisassociateServiceActionFromProvisioningArtifactResult executeBatchDisassociateServiceActionFromProvisioningArtifact(
            BatchDisassociateServiceActionFromProvisioningArtifactRequest batchDisassociateServiceActionFromProvisioningArtifactRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDisassociateServiceActionFromProvisioningArtifactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDisassociateServiceActionFromProvisioningArtifactRequest> request = null;
        Response<BatchDisassociateServiceActionFromProvisioningArtifactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDisassociateServiceActionFromProvisioningArtifactRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchDisassociateServiceActionFromProvisioningArtifactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDisassociateServiceActionFromProvisioningArtifact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDisassociateServiceActionFromProvisioningArtifactResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new BatchDisassociateServiceActionFromProvisioningArtifactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Copies the specified source product to the specified target product or a new product.
     * </p>
     * <p>
     * You can copy a product to the same account or another account. You can copy a product to the same region or
     * another region.
     * </p>
     * <p>
     * This operation is performed asynchronously. To track the progress of the operation, use
     * <a>DescribeCopyProductStatus</a>.
     * </p>
     * 
     * @param copyProductRequest
     * @return Result of the CopyProduct operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.CopyProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CopyProduct" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CopyProductResult copyProduct(CopyProductRequest request) {
        request = beforeClientExecution(request);
        return executeCopyProduct(request);
    }

    @SdkInternalApi
    final CopyProductResult executeCopyProduct(CopyProductRequest copyProductRequest) {

        ExecutionContext executionContext = createExecutionContext(copyProductRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopyProductRequest> request = null;
        Response<CopyProductResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CopyProductRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(copyProductRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CopyProduct");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CopyProductResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CopyProductResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a constraint.
     * </p>
     * 
     * @param createConstraintRequest
     * @return Result of the CreateConstraint operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Decrease your resource use
     *         or increase your service limits and retry the operation.
     * @throws DuplicateResourceException
     *         The specified resource is a duplicate.
     * @sample AWSServiceCatalog.CreateConstraint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreateConstraint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateConstraintResult createConstraint(CreateConstraintRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConstraint(request);
    }

    @SdkInternalApi
    final CreateConstraintResult executeCreateConstraint(CreateConstraintRequest createConstraintRequest) {

        ExecutionContext executionContext = createExecutionContext(createConstraintRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConstraintRequest> request = null;
        Response<CreateConstraintResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConstraintRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createConstraintRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateConstraint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateConstraintResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateConstraintResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a portfolio.
     * </p>
     * 
     * @param createPortfolioRequest
     * @return Result of the CreatePortfolio operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Decrease your resource use
     *         or increase your service limits and retry the operation.
     * @throws TagOptionNotMigratedException
     *         An operation requiring TagOptions failed because the TagOptions migration process has not been performed
     *         for this account. Please use the AWS console to perform the migration process before retrying the
     *         operation.
     * @sample AWSServiceCatalog.CreatePortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreatePortfolio" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreatePortfolioResult createPortfolio(CreatePortfolioRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePortfolio(request);
    }

    @SdkInternalApi
    final CreatePortfolioResult executeCreatePortfolio(CreatePortfolioRequest createPortfolioRequest) {

        ExecutionContext executionContext = createExecutionContext(createPortfolioRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePortfolioRequest> request = null;
        Response<CreatePortfolioResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePortfolioRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPortfolioRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePortfolio");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePortfolioResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePortfolioResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Shares the specified portfolio with the specified account or organization node. Shares to an organization node
     * can only be created by the master account of an Organization. AWSOrganizationsAccess must be enabled in order to
     * create a portfolio share to an organization node.
     * </p>
     * 
     * @param createPortfolioShareRequest
     * @return Result of the CreatePortfolioShare operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Decrease your resource use
     *         or increase your service limits and retry the operation.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws OperationNotSupportedException
     *         The operation is not supported.
     * @sample AWSServiceCatalog.CreatePortfolioShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreatePortfolioShare"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreatePortfolioShareResult createPortfolioShare(CreatePortfolioShareRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePortfolioShare(request);
    }

    @SdkInternalApi
    final CreatePortfolioShareResult executeCreatePortfolioShare(CreatePortfolioShareRequest createPortfolioShareRequest) {

        ExecutionContext executionContext = createExecutionContext(createPortfolioShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePortfolioShareRequest> request = null;
        Response<CreatePortfolioShareResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePortfolioShareRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPortfolioShareRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePortfolioShare");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePortfolioShareResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePortfolioShareResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a product.
     * </p>
     * 
     * @param createProductRequest
     * @return Result of the CreateProduct operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Decrease your resource use
     *         or increase your service limits and retry the operation.
     * @throws TagOptionNotMigratedException
     *         An operation requiring TagOptions failed because the TagOptions migration process has not been performed
     *         for this account. Please use the AWS console to perform the migration process before retrying the
     *         operation.
     * @sample AWSServiceCatalog.CreateProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreateProduct" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateProductResult createProduct(CreateProductRequest request) {
        request = beforeClientExecution(request);
        return executeCreateProduct(request);
    }

    @SdkInternalApi
    final CreateProductResult executeCreateProduct(CreateProductRequest createProductRequest) {

        ExecutionContext executionContext = createExecutionContext(createProductRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProductRequest> request = null;
        Response<CreateProductResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProductRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createProductRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateProduct");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateProductResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateProductResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a plan. A plan includes the list of resources to be created (when provisioning a new product) or modified
     * (when updating a provisioned product) when the plan is executed.
     * </p>
     * <p>
     * You can create one plan per provisioned product. To create a plan for an existing provisioned product, the
     * product status must be AVAILBLE or TAINTED.
     * </p>
     * <p>
     * To view the resource changes in the change set, use <a>DescribeProvisionedProductPlan</a>. To create or modify
     * the provisioned product, use <a>ExecuteProvisionedProductPlan</a>.
     * </p>
     * 
     * @param createProvisionedProductPlanRequest
     * @return Result of the CreateProvisionedProductPlan operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidStateException
     *         An attempt was made to modify a resource that is in a state that is not valid. Check your resources to
     *         ensure that they are in valid states before retrying the operation.
     * @sample AWSServiceCatalog.CreateProvisionedProductPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreateProvisionedProductPlan"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateProvisionedProductPlanResult createProvisionedProductPlan(CreateProvisionedProductPlanRequest request) {
        request = beforeClientExecution(request);
        return executeCreateProvisionedProductPlan(request);
    }

    @SdkInternalApi
    final CreateProvisionedProductPlanResult executeCreateProvisionedProductPlan(CreateProvisionedProductPlanRequest createProvisionedProductPlanRequest) {

        ExecutionContext executionContext = createExecutionContext(createProvisionedProductPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProvisionedProductPlanRequest> request = null;
        Response<CreateProvisionedProductPlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProvisionedProductPlanRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createProvisionedProductPlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateProvisionedProductPlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateProvisionedProductPlanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateProvisionedProductPlanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a provisioning artifact (also known as a version) for the specified product.
     * </p>
     * <p>
     * You cannot create a provisioning artifact for a product that was shared with you.
     * </p>
     * 
     * @param createProvisioningArtifactRequest
     * @return Result of the CreateProvisioningArtifact operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Decrease your resource use
     *         or increase your service limits and retry the operation.
     * @sample AWSServiceCatalog.CreateProvisioningArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreateProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateProvisioningArtifactResult createProvisioningArtifact(CreateProvisioningArtifactRequest request) {
        request = beforeClientExecution(request);
        return executeCreateProvisioningArtifact(request);
    }

    @SdkInternalApi
    final CreateProvisioningArtifactResult executeCreateProvisioningArtifact(CreateProvisioningArtifactRequest createProvisioningArtifactRequest) {

        ExecutionContext executionContext = createExecutionContext(createProvisioningArtifactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProvisioningArtifactRequest> request = null;
        Response<CreateProvisioningArtifactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProvisioningArtifactRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createProvisioningArtifactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateProvisioningArtifact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateProvisioningArtifactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateProvisioningArtifactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a self-service action.
     * </p>
     * 
     * @param createServiceActionRequest
     * @return Result of the CreateServiceAction operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Decrease your resource use
     *         or increase your service limits and retry the operation.
     * @sample AWSServiceCatalog.CreateServiceAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreateServiceAction"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateServiceActionResult createServiceAction(CreateServiceActionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateServiceAction(request);
    }

    @SdkInternalApi
    final CreateServiceActionResult executeCreateServiceAction(CreateServiceActionRequest createServiceActionRequest) {

        ExecutionContext executionContext = createExecutionContext(createServiceActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateServiceActionRequest> request = null;
        Response<CreateServiceActionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateServiceActionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createServiceActionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateServiceAction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateServiceActionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateServiceActionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a TagOption.
     * </p>
     * 
     * @param createTagOptionRequest
     * @return Result of the CreateTagOption operation returned by the service.
     * @throws TagOptionNotMigratedException
     *         An operation requiring TagOptions failed because the TagOptions migration process has not been performed
     *         for this account. Please use the AWS console to perform the migration process before retrying the
     *         operation.
     * @throws DuplicateResourceException
     *         The specified resource is a duplicate.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Decrease your resource use
     *         or increase your service limits and retry the operation.
     * @sample AWSServiceCatalog.CreateTagOption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreateTagOption" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateTagOptionResult createTagOption(CreateTagOptionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTagOption(request);
    }

    @SdkInternalApi
    final CreateTagOptionResult executeCreateTagOption(CreateTagOptionRequest createTagOptionRequest) {

        ExecutionContext executionContext = createExecutionContext(createTagOptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTagOptionRequest> request = null;
        Response<CreateTagOptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTagOptionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTagOptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTagOption");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTagOptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTagOptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified constraint.
     * </p>
     * 
     * @param deleteConstraintRequest
     * @return Result of the DeleteConstraint operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.DeleteConstraint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeleteConstraint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteConstraintResult deleteConstraint(DeleteConstraintRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConstraint(request);
    }

    @SdkInternalApi
    final DeleteConstraintResult executeDeleteConstraint(DeleteConstraintRequest deleteConstraintRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConstraintRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConstraintRequest> request = null;
        Response<DeleteConstraintResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConstraintRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteConstraintRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConstraint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConstraintResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteConstraintResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified portfolio.
     * </p>
     * <p>
     * You cannot delete a portfolio if it was shared with you or if it has associated products, users, constraints, or
     * shared accounts.
     * </p>
     * 
     * @param deletePortfolioRequest
     * @return Result of the DeletePortfolio operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws ResourceInUseException
     *         A resource that is currently in use. Ensure that the resource is not in use and retry the operation.
     * @throws TagOptionNotMigratedException
     *         An operation requiring TagOptions failed because the TagOptions migration process has not been performed
     *         for this account. Please use the AWS console to perform the migration process before retrying the
     *         operation.
     * @sample AWSServiceCatalog.DeletePortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeletePortfolio" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeletePortfolioResult deletePortfolio(DeletePortfolioRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePortfolio(request);
    }

    @SdkInternalApi
    final DeletePortfolioResult executeDeletePortfolio(DeletePortfolioRequest deletePortfolioRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePortfolioRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePortfolioRequest> request = null;
        Response<DeletePortfolioResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePortfolioRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePortfolioRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePortfolio");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePortfolioResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePortfolioResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops sharing the specified portfolio with the specified account or organization node. Shares to an organization
     * node can only be deleted by the master account of an Organization.
     * </p>
     * 
     * @param deletePortfolioShareRequest
     * @return Result of the DeletePortfolioShare operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws OperationNotSupportedException
     *         The operation is not supported.
     * @sample AWSServiceCatalog.DeletePortfolioShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeletePortfolioShare"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeletePortfolioShareResult deletePortfolioShare(DeletePortfolioShareRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePortfolioShare(request);
    }

    @SdkInternalApi
    final DeletePortfolioShareResult executeDeletePortfolioShare(DeletePortfolioShareRequest deletePortfolioShareRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePortfolioShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePortfolioShareRequest> request = null;
        Response<DeletePortfolioShareResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePortfolioShareRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePortfolioShareRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePortfolioShare");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePortfolioShareResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePortfolioShareResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified product.
     * </p>
     * <p>
     * You cannot delete a product if it was shared with you or is associated with a portfolio.
     * </p>
     * 
     * @param deleteProductRequest
     * @return Result of the DeleteProduct operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceInUseException
     *         A resource that is currently in use. Ensure that the resource is not in use and retry the operation.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws TagOptionNotMigratedException
     *         An operation requiring TagOptions failed because the TagOptions migration process has not been performed
     *         for this account. Please use the AWS console to perform the migration process before retrying the
     *         operation.
     * @sample AWSServiceCatalog.DeleteProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeleteProduct" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteProductResult deleteProduct(DeleteProductRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProduct(request);
    }

    @SdkInternalApi
    final DeleteProductResult executeDeleteProduct(DeleteProductRequest deleteProductRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProductRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProductRequest> request = null;
        Response<DeleteProductResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProductRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteProductRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProduct");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProductResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteProductResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified plan.
     * </p>
     * 
     * @param deleteProvisionedProductPlanRequest
     * @return Result of the DeleteProvisionedProductPlan operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DeleteProvisionedProductPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeleteProvisionedProductPlan"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteProvisionedProductPlanResult deleteProvisionedProductPlan(DeleteProvisionedProductPlanRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProvisionedProductPlan(request);
    }

    @SdkInternalApi
    final DeleteProvisionedProductPlanResult executeDeleteProvisionedProductPlan(DeleteProvisionedProductPlanRequest deleteProvisionedProductPlanRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProvisionedProductPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProvisionedProductPlanRequest> request = null;
        Response<DeleteProvisionedProductPlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProvisionedProductPlanRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteProvisionedProductPlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProvisionedProductPlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProvisionedProductPlanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteProvisionedProductPlanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified provisioning artifact (also known as a version) for the specified product.
     * </p>
     * <p>
     * You cannot delete a provisioning artifact associated with a product that was shared with you. You cannot delete
     * the last provisioning artifact for a product, because a product must have at least one provisioning artifact.
     * </p>
     * 
     * @param deleteProvisioningArtifactRequest
     * @return Result of the DeleteProvisioningArtifact operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceInUseException
     *         A resource that is currently in use. Ensure that the resource is not in use and retry the operation.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.DeleteProvisioningArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeleteProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteProvisioningArtifactResult deleteProvisioningArtifact(DeleteProvisioningArtifactRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProvisioningArtifact(request);
    }

    @SdkInternalApi
    final DeleteProvisioningArtifactResult executeDeleteProvisioningArtifact(DeleteProvisioningArtifactRequest deleteProvisioningArtifactRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProvisioningArtifactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProvisioningArtifactRequest> request = null;
        Response<DeleteProvisioningArtifactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProvisioningArtifactRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteProvisioningArtifactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProvisioningArtifact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProvisioningArtifactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteProvisioningArtifactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a self-service action.
     * </p>
     * 
     * @param deleteServiceActionRequest
     * @return Result of the DeleteServiceAction operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceInUseException
     *         A resource that is currently in use. Ensure that the resource is not in use and retry the operation.
     * @sample AWSServiceCatalog.DeleteServiceAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeleteServiceAction"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteServiceActionResult deleteServiceAction(DeleteServiceActionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteServiceAction(request);
    }

    @SdkInternalApi
    final DeleteServiceActionResult executeDeleteServiceAction(DeleteServiceActionRequest deleteServiceActionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteServiceActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteServiceActionRequest> request = null;
        Response<DeleteServiceActionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteServiceActionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteServiceActionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteServiceAction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteServiceActionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteServiceActionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified TagOption.
     * </p>
     * <p>
     * You cannot delete a TagOption if it is associated with a product or portfolio.
     * </p>
     * 
     * @param deleteTagOptionRequest
     * @return Result of the DeleteTagOption operation returned by the service.
     * @throws TagOptionNotMigratedException
     *         An operation requiring TagOptions failed because the TagOptions migration process has not been performed
     *         for this account. Please use the AWS console to perform the migration process before retrying the
     *         operation.
     * @throws ResourceInUseException
     *         A resource that is currently in use. Ensure that the resource is not in use and retry the operation.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DeleteTagOption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeleteTagOption" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteTagOptionResult deleteTagOption(DeleteTagOptionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTagOption(request);
    }

    @SdkInternalApi
    final DeleteTagOptionResult executeDeleteTagOption(DeleteTagOptionRequest deleteTagOptionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTagOptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTagOptionRequest> request = null;
        Response<DeleteTagOptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTagOptionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTagOptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTagOption");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTagOptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTagOptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the specified constraint.
     * </p>
     * 
     * @param describeConstraintRequest
     * @return Result of the DescribeConstraint operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DescribeConstraint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeConstraint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeConstraintResult describeConstraint(DescribeConstraintRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConstraint(request);
    }

    @SdkInternalApi
    final DescribeConstraintResult executeDescribeConstraint(DescribeConstraintRequest describeConstraintRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConstraintRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConstraintRequest> request = null;
        Response<DescribeConstraintResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConstraintRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeConstraintRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConstraint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeConstraintResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeConstraintResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the status of the specified copy product operation.
     * </p>
     * 
     * @param describeCopyProductStatusRequest
     * @return Result of the DescribeCopyProductStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DescribeCopyProductStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeCopyProductStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeCopyProductStatusResult describeCopyProductStatus(DescribeCopyProductStatusRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCopyProductStatus(request);
    }

    @SdkInternalApi
    final DescribeCopyProductStatusResult executeDescribeCopyProductStatus(DescribeCopyProductStatusRequest describeCopyProductStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCopyProductStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCopyProductStatusRequest> request = null;
        Response<DescribeCopyProductStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCopyProductStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeCopyProductStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCopyProductStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCopyProductStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeCopyProductStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the specified portfolio.
     * </p>
     * 
     * @param describePortfolioRequest
     * @return Result of the DescribePortfolio operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DescribePortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribePortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribePortfolioResult describePortfolio(DescribePortfolioRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePortfolio(request);
    }

    @SdkInternalApi
    final DescribePortfolioResult executeDescribePortfolio(DescribePortfolioRequest describePortfolioRequest) {

        ExecutionContext executionContext = createExecutionContext(describePortfolioRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePortfolioRequest> request = null;
        Response<DescribePortfolioResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePortfolioRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describePortfolioRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePortfolio");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePortfolioResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribePortfolioResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the status of the specified portfolio share operation. This API can only be called by the master account in
     * the organization.
     * </p>
     * 
     * @param describePortfolioShareStatusRequest
     * @return Result of the DescribePortfolioShareStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws OperationNotSupportedException
     *         The operation is not supported.
     * @sample AWSServiceCatalog.DescribePortfolioShareStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribePortfolioShareStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribePortfolioShareStatusResult describePortfolioShareStatus(DescribePortfolioShareStatusRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePortfolioShareStatus(request);
    }

    @SdkInternalApi
    final DescribePortfolioShareStatusResult executeDescribePortfolioShareStatus(DescribePortfolioShareStatusRequest describePortfolioShareStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(describePortfolioShareStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePortfolioShareStatusRequest> request = null;
        Response<DescribePortfolioShareStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePortfolioShareStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describePortfolioShareStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePortfolioShareStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePortfolioShareStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribePortfolioShareStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the specified product.
     * </p>
     * 
     * @param describeProductRequest
     * @return Result of the DescribeProduct operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.DescribeProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProduct" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeProductResult describeProduct(DescribeProductRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeProduct(request);
    }

    @SdkInternalApi
    final DescribeProductResult executeDescribeProduct(DescribeProductRequest describeProductRequest) {

        ExecutionContext executionContext = createExecutionContext(describeProductRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProductRequest> request = null;
        Response<DescribeProductResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProductRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeProductRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeProduct");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeProductResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeProductResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the specified product. This operation is run with administrator access.
     * </p>
     * 
     * @param describeProductAsAdminRequest
     * @return Result of the DescribeProductAsAdmin operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DescribeProductAsAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProductAsAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeProductAsAdminResult describeProductAsAdmin(DescribeProductAsAdminRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeProductAsAdmin(request);
    }

    @SdkInternalApi
    final DescribeProductAsAdminResult executeDescribeProductAsAdmin(DescribeProductAsAdminRequest describeProductAsAdminRequest) {

        ExecutionContext executionContext = createExecutionContext(describeProductAsAdminRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProductAsAdminRequest> request = null;
        Response<DescribeProductAsAdminResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProductAsAdminRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeProductAsAdminRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeProductAsAdmin");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeProductAsAdminResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeProductAsAdminResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the specified product.
     * </p>
     * 
     * @param describeProductViewRequest
     * @return Result of the DescribeProductView operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.DescribeProductView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProductView"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeProductViewResult describeProductView(DescribeProductViewRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeProductView(request);
    }

    @SdkInternalApi
    final DescribeProductViewResult executeDescribeProductView(DescribeProductViewRequest describeProductViewRequest) {

        ExecutionContext executionContext = createExecutionContext(describeProductViewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProductViewRequest> request = null;
        Response<DescribeProductViewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProductViewRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeProductViewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeProductView");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeProductViewResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeProductViewResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the specified provisioned product.
     * </p>
     * 
     * @param describeProvisionedProductRequest
     * @return Result of the DescribeProvisionedProduct operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DescribeProvisionedProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProvisionedProduct"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeProvisionedProductResult describeProvisionedProduct(DescribeProvisionedProductRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeProvisionedProduct(request);
    }

    @SdkInternalApi
    final DescribeProvisionedProductResult executeDescribeProvisionedProduct(DescribeProvisionedProductRequest describeProvisionedProductRequest) {

        ExecutionContext executionContext = createExecutionContext(describeProvisionedProductRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProvisionedProductRequest> request = null;
        Response<DescribeProvisionedProductResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProvisionedProductRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeProvisionedProductRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeProvisionedProduct");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeProvisionedProductResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeProvisionedProductResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the resource changes for the specified plan.
     * </p>
     * 
     * @param describeProvisionedProductPlanRequest
     * @return Result of the DescribeProvisionedProductPlan operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.DescribeProvisionedProductPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProvisionedProductPlan"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeProvisionedProductPlanResult describeProvisionedProductPlan(DescribeProvisionedProductPlanRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeProvisionedProductPlan(request);
    }

    @SdkInternalApi
    final DescribeProvisionedProductPlanResult executeDescribeProvisionedProductPlan(DescribeProvisionedProductPlanRequest describeProvisionedProductPlanRequest) {

        ExecutionContext executionContext = createExecutionContext(describeProvisionedProductPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProvisionedProductPlanRequest> request = null;
        Response<DescribeProvisionedProductPlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProvisionedProductPlanRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeProvisionedProductPlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeProvisionedProductPlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeProvisionedProductPlanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeProvisionedProductPlanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the specified provisioning artifact (also known as a version) for the specified product.
     * </p>
     * 
     * @param describeProvisioningArtifactRequest
     * @return Result of the DescribeProvisioningArtifact operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DescribeProvisioningArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeProvisioningArtifactResult describeProvisioningArtifact(DescribeProvisioningArtifactRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeProvisioningArtifact(request);
    }

    @SdkInternalApi
    final DescribeProvisioningArtifactResult executeDescribeProvisioningArtifact(DescribeProvisioningArtifactRequest describeProvisioningArtifactRequest) {

        ExecutionContext executionContext = createExecutionContext(describeProvisioningArtifactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProvisioningArtifactRequest> request = null;
        Response<DescribeProvisioningArtifactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProvisioningArtifactRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeProvisioningArtifactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeProvisioningArtifact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeProvisioningArtifactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeProvisioningArtifactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the configuration required to provision the specified product using the specified
     * provisioning artifact.
     * </p>
     * <p>
     * If the output contains a TagOption key with an empty list of values, there is a TagOption conflict for that key.
     * The end user cannot take action to fix the conflict, and launch is not blocked. In subsequent calls to
     * <a>ProvisionProduct</a>, do not include conflicted TagOption keys as tags, or this causes the error
     * "Parameter validation failed: Missing required parameter in Tags[<i>N</i>]:<i>Value</i>". Tag the provisioned
     * product with the value <code>sc-tagoption-conflict-portfolioId-productId</code>.
     * </p>
     * 
     * @param describeProvisioningParametersRequest
     * @return Result of the DescribeProvisioningParameters operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DescribeProvisioningParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProvisioningParameters"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeProvisioningParametersResult describeProvisioningParameters(DescribeProvisioningParametersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeProvisioningParameters(request);
    }

    @SdkInternalApi
    final DescribeProvisioningParametersResult executeDescribeProvisioningParameters(DescribeProvisioningParametersRequest describeProvisioningParametersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeProvisioningParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProvisioningParametersRequest> request = null;
        Response<DescribeProvisioningParametersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProvisioningParametersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeProvisioningParametersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeProvisioningParameters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeProvisioningParametersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeProvisioningParametersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the specified request operation.
     * </p>
     * <p>
     * Use this operation after calling a request operation (for example, <a>ProvisionProduct</a>,
     * <a>TerminateProvisionedProduct</a>, or <a>UpdateProvisionedProduct</a>).
     * </p>
     * 
     * @param describeRecordRequest
     * @return Result of the DescribeRecord operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DescribeRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeRecord" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeRecordResult describeRecord(DescribeRecordRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRecord(request);
    }

    @SdkInternalApi
    final DescribeRecordResult executeDescribeRecord(DescribeRecordRequest describeRecordRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRecordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRecordRequest> request = null;
        Response<DescribeRecordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRecordRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeRecordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRecord");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRecordResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeRecordResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a self-service action.
     * </p>
     * 
     * @param describeServiceActionRequest
     * @return Result of the DescribeServiceAction operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DescribeServiceAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeServiceAction"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeServiceActionResult describeServiceAction(DescribeServiceActionRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeServiceAction(request);
    }

    @SdkInternalApi
    final DescribeServiceActionResult executeDescribeServiceAction(DescribeServiceActionRequest describeServiceActionRequest) {

        ExecutionContext executionContext = createExecutionContext(describeServiceActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeServiceActionRequest> request = null;
        Response<DescribeServiceActionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeServiceActionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeServiceActionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeServiceAction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeServiceActionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeServiceActionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the specified TagOption.
     * </p>
     * 
     * @param describeTagOptionRequest
     * @return Result of the DescribeTagOption operation returned by the service.
     * @throws TagOptionNotMigratedException
     *         An operation requiring TagOptions failed because the TagOptions migration process has not been performed
     *         for this account. Please use the AWS console to perform the migration process before retrying the
     *         operation.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DescribeTagOption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeTagOption"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeTagOptionResult describeTagOption(DescribeTagOptionRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTagOption(request);
    }

    @SdkInternalApi
    final DescribeTagOptionResult executeDescribeTagOption(DescribeTagOptionRequest describeTagOptionRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTagOptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTagOptionRequest> request = null;
        Response<DescribeTagOptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTagOptionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTagOptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTagOption");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTagOptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeTagOptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disable portfolio sharing through AWS Organizations feature. This feature will not delete your current shares but
     * it will prevent you from creating new shares throughout your organization. Current shares will not be in sync
     * with your organization structure if it changes after calling this API. This API can only be called by the master
     * account in the organization.
     * </p>
     * 
     * @param disableAWSOrganizationsAccessRequest
     * @return Result of the DisableAWSOrganizationsAccess operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidStateException
     *         An attempt was made to modify a resource that is in a state that is not valid. Check your resources to
     *         ensure that they are in valid states before retrying the operation.
     * @throws OperationNotSupportedException
     *         The operation is not supported.
     * @sample AWSServiceCatalog.DisableAWSOrganizationsAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DisableAWSOrganizationsAccess"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisableAWSOrganizationsAccessResult disableAWSOrganizationsAccess(DisableAWSOrganizationsAccessRequest request) {
        request = beforeClientExecution(request);
        return executeDisableAWSOrganizationsAccess(request);
    }

    @SdkInternalApi
    final DisableAWSOrganizationsAccessResult executeDisableAWSOrganizationsAccess(DisableAWSOrganizationsAccessRequest disableAWSOrganizationsAccessRequest) {

        ExecutionContext executionContext = createExecutionContext(disableAWSOrganizationsAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableAWSOrganizationsAccessRequest> request = null;
        Response<DisableAWSOrganizationsAccessResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableAWSOrganizationsAccessRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disableAWSOrganizationsAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableAWSOrganizationsAccess");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableAWSOrganizationsAccessResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisableAWSOrganizationsAccessResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a previously associated principal ARN from a specified portfolio.
     * </p>
     * 
     * @param disassociatePrincipalFromPortfolioRequest
     * @return Result of the DisassociatePrincipalFromPortfolio operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DisassociatePrincipalFromPortfolio
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DisassociatePrincipalFromPortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociatePrincipalFromPortfolioResult disassociatePrincipalFromPortfolio(DisassociatePrincipalFromPortfolioRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociatePrincipalFromPortfolio(request);
    }

    @SdkInternalApi
    final DisassociatePrincipalFromPortfolioResult executeDisassociatePrincipalFromPortfolio(
            DisassociatePrincipalFromPortfolioRequest disassociatePrincipalFromPortfolioRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociatePrincipalFromPortfolioRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociatePrincipalFromPortfolioRequest> request = null;
        Response<DisassociatePrincipalFromPortfolioResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociatePrincipalFromPortfolioRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociatePrincipalFromPortfolioRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociatePrincipalFromPortfolio");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociatePrincipalFromPortfolioResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociatePrincipalFromPortfolioResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates the specified product from the specified portfolio.
     * </p>
     * 
     * @param disassociateProductFromPortfolioRequest
     * @return Result of the DisassociateProductFromPortfolio operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceInUseException
     *         A resource that is currently in use. Ensure that the resource is not in use and retry the operation.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.DisassociateProductFromPortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DisassociateProductFromPortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateProductFromPortfolioResult disassociateProductFromPortfolio(DisassociateProductFromPortfolioRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateProductFromPortfolio(request);
    }

    @SdkInternalApi
    final DisassociateProductFromPortfolioResult executeDisassociateProductFromPortfolio(
            DisassociateProductFromPortfolioRequest disassociateProductFromPortfolioRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateProductFromPortfolioRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateProductFromPortfolioRequest> request = null;
        Response<DisassociateProductFromPortfolioResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateProductFromPortfolioRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateProductFromPortfolioRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateProductFromPortfolio");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateProductFromPortfolioResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateProductFromPortfolioResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates the specified self-service action association from the specified provisioning artifact.
     * </p>
     * 
     * @param disassociateServiceActionFromProvisioningArtifactRequest
     * @return Result of the DisassociateServiceActionFromProvisioningArtifact operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DisassociateServiceActionFromProvisioningArtifact
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DisassociateServiceActionFromProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateServiceActionFromProvisioningArtifactResult disassociateServiceActionFromProvisioningArtifact(
            DisassociateServiceActionFromProvisioningArtifactRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateServiceActionFromProvisioningArtifact(request);
    }

    @SdkInternalApi
    final DisassociateServiceActionFromProvisioningArtifactResult executeDisassociateServiceActionFromProvisioningArtifact(
            DisassociateServiceActionFromProvisioningArtifactRequest disassociateServiceActionFromProvisioningArtifactRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateServiceActionFromProvisioningArtifactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateServiceActionFromProvisioningArtifactRequest> request = null;
        Response<DisassociateServiceActionFromProvisioningArtifactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateServiceActionFromProvisioningArtifactRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateServiceActionFromProvisioningArtifactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateServiceActionFromProvisioningArtifact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateServiceActionFromProvisioningArtifactResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DisassociateServiceActionFromProvisioningArtifactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates the specified TagOption from the specified resource.
     * </p>
     * 
     * @param disassociateTagOptionFromResourceRequest
     * @return Result of the DisassociateTagOptionFromResource operation returned by the service.
     * @throws TagOptionNotMigratedException
     *         An operation requiring TagOptions failed because the TagOptions migration process has not been performed
     *         for this account. Please use the AWS console to perform the migration process before retrying the
     *         operation.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DisassociateTagOptionFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DisassociateTagOptionFromResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateTagOptionFromResourceResult disassociateTagOptionFromResource(DisassociateTagOptionFromResourceRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateTagOptionFromResource(request);
    }

    @SdkInternalApi
    final DisassociateTagOptionFromResourceResult executeDisassociateTagOptionFromResource(
            DisassociateTagOptionFromResourceRequest disassociateTagOptionFromResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateTagOptionFromResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateTagOptionFromResourceRequest> request = null;
        Response<DisassociateTagOptionFromResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateTagOptionFromResourceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateTagOptionFromResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateTagOptionFromResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateTagOptionFromResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateTagOptionFromResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enable portfolio sharing feature through AWS Organizations. This API will allow Service Catalog to receive
     * updates on your organization in order to sync your shares with the current structure. This API can only be called
     * by the master account in the organization.
     * </p>
     * <p>
     * By calling this API Service Catalog will make a call to organizations:EnableAWSServiceAccess on your behalf so
     * that your shares can be in sync with any changes in your AWS Organizations structure.
     * </p>
     * 
     * @param enableAWSOrganizationsAccessRequest
     * @return Result of the EnableAWSOrganizationsAccess operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidStateException
     *         An attempt was made to modify a resource that is in a state that is not valid. Check your resources to
     *         ensure that they are in valid states before retrying the operation.
     * @throws OperationNotSupportedException
     *         The operation is not supported.
     * @sample AWSServiceCatalog.EnableAWSOrganizationsAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/EnableAWSOrganizationsAccess"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public EnableAWSOrganizationsAccessResult enableAWSOrganizationsAccess(EnableAWSOrganizationsAccessRequest request) {
        request = beforeClientExecution(request);
        return executeEnableAWSOrganizationsAccess(request);
    }

    @SdkInternalApi
    final EnableAWSOrganizationsAccessResult executeEnableAWSOrganizationsAccess(EnableAWSOrganizationsAccessRequest enableAWSOrganizationsAccessRequest) {

        ExecutionContext executionContext = createExecutionContext(enableAWSOrganizationsAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableAWSOrganizationsAccessRequest> request = null;
        Response<EnableAWSOrganizationsAccessResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableAWSOrganizationsAccessRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(enableAWSOrganizationsAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableAWSOrganizationsAccess");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableAWSOrganizationsAccessResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new EnableAWSOrganizationsAccessResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provisions or modifies a product based on the resource changes for the specified plan.
     * </p>
     * 
     * @param executeProvisionedProductPlanRequest
     * @return Result of the ExecuteProvisionedProductPlan operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidStateException
     *         An attempt was made to modify a resource that is in a state that is not valid. Check your resources to
     *         ensure that they are in valid states before retrying the operation.
     * @sample AWSServiceCatalog.ExecuteProvisionedProductPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ExecuteProvisionedProductPlan"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ExecuteProvisionedProductPlanResult executeProvisionedProductPlan(ExecuteProvisionedProductPlanRequest request) {
        request = beforeClientExecution(request);
        return executeExecuteProvisionedProductPlan(request);
    }

    @SdkInternalApi
    final ExecuteProvisionedProductPlanResult executeExecuteProvisionedProductPlan(ExecuteProvisionedProductPlanRequest executeProvisionedProductPlanRequest) {

        ExecutionContext executionContext = createExecutionContext(executeProvisionedProductPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExecuteProvisionedProductPlanRequest> request = null;
        Response<ExecuteProvisionedProductPlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExecuteProvisionedProductPlanRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(executeProvisionedProductPlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExecuteProvisionedProductPlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExecuteProvisionedProductPlanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ExecuteProvisionedProductPlanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Executes a self-service action against a provisioned product.
     * </p>
     * 
     * @param executeProvisionedProductServiceActionRequest
     * @return Result of the ExecuteProvisionedProductServiceAction operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidStateException
     *         An attempt was made to modify a resource that is in a state that is not valid. Check your resources to
     *         ensure that they are in valid states before retrying the operation.
     * @sample AWSServiceCatalog.ExecuteProvisionedProductServiceAction
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ExecuteProvisionedProductServiceAction"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ExecuteProvisionedProductServiceActionResult executeProvisionedProductServiceAction(ExecuteProvisionedProductServiceActionRequest request) {
        request = beforeClientExecution(request);
        return executeExecuteProvisionedProductServiceAction(request);
    }

    @SdkInternalApi
    final ExecuteProvisionedProductServiceActionResult executeExecuteProvisionedProductServiceAction(
            ExecuteProvisionedProductServiceActionRequest executeProvisionedProductServiceActionRequest) {

        ExecutionContext executionContext = createExecutionContext(executeProvisionedProductServiceActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExecuteProvisionedProductServiceActionRequest> request = null;
        Response<ExecuteProvisionedProductServiceActionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExecuteProvisionedProductServiceActionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(executeProvisionedProductServiceActionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExecuteProvisionedProductServiceAction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExecuteProvisionedProductServiceActionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ExecuteProvisionedProductServiceActionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the Access Status for AWS Organization portfolio share feature. This API can only be called by the master
     * account in the organization.
     * </p>
     * 
     * @param getAWSOrganizationsAccessStatusRequest
     * @return Result of the GetAWSOrganizationsAccessStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws OperationNotSupportedException
     *         The operation is not supported.
     * @sample AWSServiceCatalog.GetAWSOrganizationsAccessStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/GetAWSOrganizationsAccessStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAWSOrganizationsAccessStatusResult getAWSOrganizationsAccessStatus(GetAWSOrganizationsAccessStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetAWSOrganizationsAccessStatus(request);
    }

    @SdkInternalApi
    final GetAWSOrganizationsAccessStatusResult executeGetAWSOrganizationsAccessStatus(
            GetAWSOrganizationsAccessStatusRequest getAWSOrganizationsAccessStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getAWSOrganizationsAccessStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAWSOrganizationsAccessStatusRequest> request = null;
        Response<GetAWSOrganizationsAccessStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAWSOrganizationsAccessStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getAWSOrganizationsAccessStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAWSOrganizationsAccessStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAWSOrganizationsAccessStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetAWSOrganizationsAccessStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all portfolios for which sharing was accepted by this account.
     * </p>
     * 
     * @param listAcceptedPortfolioSharesRequest
     * @return Result of the ListAcceptedPortfolioShares operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws OperationNotSupportedException
     *         The operation is not supported.
     * @sample AWSServiceCatalog.ListAcceptedPortfolioShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListAcceptedPortfolioShares"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAcceptedPortfolioSharesResult listAcceptedPortfolioShares(ListAcceptedPortfolioSharesRequest request) {
        request = beforeClientExecution(request);
        return executeListAcceptedPortfolioShares(request);
    }

    @SdkInternalApi
    final ListAcceptedPortfolioSharesResult executeListAcceptedPortfolioShares(ListAcceptedPortfolioSharesRequest listAcceptedPortfolioSharesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAcceptedPortfolioSharesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAcceptedPortfolioSharesRequest> request = null;
        Response<ListAcceptedPortfolioSharesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAcceptedPortfolioSharesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAcceptedPortfolioSharesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAcceptedPortfolioShares");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAcceptedPortfolioSharesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAcceptedPortfolioSharesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the constraints for the specified portfolio and product.
     * </p>
     * 
     * @param listConstraintsForPortfolioRequest
     * @return Result of the ListConstraintsForPortfolio operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.ListConstraintsForPortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListConstraintsForPortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListConstraintsForPortfolioResult listConstraintsForPortfolio(ListConstraintsForPortfolioRequest request) {
        request = beforeClientExecution(request);
        return executeListConstraintsForPortfolio(request);
    }

    @SdkInternalApi
    final ListConstraintsForPortfolioResult executeListConstraintsForPortfolio(ListConstraintsForPortfolioRequest listConstraintsForPortfolioRequest) {

        ExecutionContext executionContext = createExecutionContext(listConstraintsForPortfolioRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListConstraintsForPortfolioRequest> request = null;
        Response<ListConstraintsForPortfolioResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListConstraintsForPortfolioRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listConstraintsForPortfolioRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListConstraintsForPortfolio");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListConstraintsForPortfolioResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListConstraintsForPortfolioResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the paths to the specified product. A path is how the user has access to a specified product, and is
     * necessary when provisioning a product. A path also determines the constraints put on the product.
     * </p>
     * 
     * @param listLaunchPathsRequest
     * @return Result of the ListLaunchPaths operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.ListLaunchPaths
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListLaunchPaths" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListLaunchPathsResult listLaunchPaths(ListLaunchPathsRequest request) {
        request = beforeClientExecution(request);
        return executeListLaunchPaths(request);
    }

    @SdkInternalApi
    final ListLaunchPathsResult executeListLaunchPaths(ListLaunchPathsRequest listLaunchPathsRequest) {

        ExecutionContext executionContext = createExecutionContext(listLaunchPathsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLaunchPathsRequest> request = null;
        Response<ListLaunchPathsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLaunchPathsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLaunchPathsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLaunchPaths");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLaunchPathsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLaunchPathsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the organization nodes that have access to the specified portfolio. This API can only be called by the
     * master account in the organization.
     * </p>
     * 
     * @param listOrganizationPortfolioAccessRequest
     * @return Result of the ListOrganizationPortfolioAccess operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws OperationNotSupportedException
     *         The operation is not supported.
     * @sample AWSServiceCatalog.ListOrganizationPortfolioAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListOrganizationPortfolioAccess"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListOrganizationPortfolioAccessResult listOrganizationPortfolioAccess(ListOrganizationPortfolioAccessRequest request) {
        request = beforeClientExecution(request);
        return executeListOrganizationPortfolioAccess(request);
    }

    @SdkInternalApi
    final ListOrganizationPortfolioAccessResult executeListOrganizationPortfolioAccess(
            ListOrganizationPortfolioAccessRequest listOrganizationPortfolioAccessRequest) {

        ExecutionContext executionContext = createExecutionContext(listOrganizationPortfolioAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOrganizationPortfolioAccessRequest> request = null;
        Response<ListOrganizationPortfolioAccessResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOrganizationPortfolioAccessRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listOrganizationPortfolioAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListOrganizationPortfolioAccess");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListOrganizationPortfolioAccessResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListOrganizationPortfolioAccessResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the account IDs that have access to the specified portfolio.
     * </p>
     * 
     * @param listPortfolioAccessRequest
     * @return Result of the ListPortfolioAccess operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.ListPortfolioAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListPortfolioAccess"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPortfolioAccessResult listPortfolioAccess(ListPortfolioAccessRequest request) {
        request = beforeClientExecution(request);
        return executeListPortfolioAccess(request);
    }

    @SdkInternalApi
    final ListPortfolioAccessResult executeListPortfolioAccess(ListPortfolioAccessRequest listPortfolioAccessRequest) {

        ExecutionContext executionContext = createExecutionContext(listPortfolioAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPortfolioAccessRequest> request = null;
        Response<ListPortfolioAccessResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPortfolioAccessRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPortfolioAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPortfolioAccess");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPortfolioAccessResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPortfolioAccessResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all portfolios in the catalog.
     * </p>
     * 
     * @param listPortfoliosRequest
     * @return Result of the ListPortfolios operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.ListPortfolios
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListPortfolios" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListPortfoliosResult listPortfolios(ListPortfoliosRequest request) {
        request = beforeClientExecution(request);
        return executeListPortfolios(request);
    }

    @SdkInternalApi
    final ListPortfoliosResult executeListPortfolios(ListPortfoliosRequest listPortfoliosRequest) {

        ExecutionContext executionContext = createExecutionContext(listPortfoliosRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPortfoliosRequest> request = null;
        Response<ListPortfoliosResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPortfoliosRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPortfoliosRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPortfolios");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPortfoliosResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPortfoliosResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all portfolios that the specified product is associated with.
     * </p>
     * 
     * @param listPortfoliosForProductRequest
     * @return Result of the ListPortfoliosForProduct operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.ListPortfoliosForProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListPortfoliosForProduct"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPortfoliosForProductResult listPortfoliosForProduct(ListPortfoliosForProductRequest request) {
        request = beforeClientExecution(request);
        return executeListPortfoliosForProduct(request);
    }

    @SdkInternalApi
    final ListPortfoliosForProductResult executeListPortfoliosForProduct(ListPortfoliosForProductRequest listPortfoliosForProductRequest) {

        ExecutionContext executionContext = createExecutionContext(listPortfoliosForProductRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPortfoliosForProductRequest> request = null;
        Response<ListPortfoliosForProductResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPortfoliosForProductRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listPortfoliosForProductRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPortfoliosForProduct");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPortfoliosForProductResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListPortfoliosForProductResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all principal ARNs associated with the specified portfolio.
     * </p>
     * 
     * @param listPrincipalsForPortfolioRequest
     * @return Result of the ListPrincipalsForPortfolio operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.ListPrincipalsForPortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListPrincipalsForPortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPrincipalsForPortfolioResult listPrincipalsForPortfolio(ListPrincipalsForPortfolioRequest request) {
        request = beforeClientExecution(request);
        return executeListPrincipalsForPortfolio(request);
    }

    @SdkInternalApi
    final ListPrincipalsForPortfolioResult executeListPrincipalsForPortfolio(ListPrincipalsForPortfolioRequest listPrincipalsForPortfolioRequest) {

        ExecutionContext executionContext = createExecutionContext(listPrincipalsForPortfolioRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPrincipalsForPortfolioRequest> request = null;
        Response<ListPrincipalsForPortfolioResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPrincipalsForPortfolioRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listPrincipalsForPortfolioRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPrincipalsForPortfolio");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPrincipalsForPortfolioResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListPrincipalsForPortfolioResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the plans for the specified provisioned product or all plans to which the user has access.
     * </p>
     * 
     * @param listProvisionedProductPlansRequest
     * @return Result of the ListProvisionedProductPlans operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.ListProvisionedProductPlans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListProvisionedProductPlans"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListProvisionedProductPlansResult listProvisionedProductPlans(ListProvisionedProductPlansRequest request) {
        request = beforeClientExecution(request);
        return executeListProvisionedProductPlans(request);
    }

    @SdkInternalApi
    final ListProvisionedProductPlansResult executeListProvisionedProductPlans(ListProvisionedProductPlansRequest listProvisionedProductPlansRequest) {

        ExecutionContext executionContext = createExecutionContext(listProvisionedProductPlansRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProvisionedProductPlansRequest> request = null;
        Response<ListProvisionedProductPlansResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProvisionedProductPlansRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listProvisionedProductPlansRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProvisionedProductPlans");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProvisionedProductPlansResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListProvisionedProductPlansResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all provisioning artifacts (also known as versions) for the specified product.
     * </p>
     * 
     * @param listProvisioningArtifactsRequest
     * @return Result of the ListProvisioningArtifacts operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.ListProvisioningArtifacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListProvisioningArtifacts"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListProvisioningArtifactsResult listProvisioningArtifacts(ListProvisioningArtifactsRequest request) {
        request = beforeClientExecution(request);
        return executeListProvisioningArtifacts(request);
    }

    @SdkInternalApi
    final ListProvisioningArtifactsResult executeListProvisioningArtifacts(ListProvisioningArtifactsRequest listProvisioningArtifactsRequest) {

        ExecutionContext executionContext = createExecutionContext(listProvisioningArtifactsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProvisioningArtifactsRequest> request = null;
        Response<ListProvisioningArtifactsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProvisioningArtifactsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listProvisioningArtifactsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProvisioningArtifacts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProvisioningArtifactsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListProvisioningArtifactsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all provisioning artifacts (also known as versions) for the specified self-service action.
     * </p>
     * 
     * @param listProvisioningArtifactsForServiceActionRequest
     * @return Result of the ListProvisioningArtifactsForServiceAction operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.ListProvisioningArtifactsForServiceAction
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListProvisioningArtifactsForServiceAction"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListProvisioningArtifactsForServiceActionResult listProvisioningArtifactsForServiceAction(ListProvisioningArtifactsForServiceActionRequest request) {
        request = beforeClientExecution(request);
        return executeListProvisioningArtifactsForServiceAction(request);
    }

    @SdkInternalApi
    final ListProvisioningArtifactsForServiceActionResult executeListProvisioningArtifactsForServiceAction(
            ListProvisioningArtifactsForServiceActionRequest listProvisioningArtifactsForServiceActionRequest) {

        ExecutionContext executionContext = createExecutionContext(listProvisioningArtifactsForServiceActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProvisioningArtifactsForServiceActionRequest> request = null;
        Response<ListProvisioningArtifactsForServiceActionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProvisioningArtifactsForServiceActionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listProvisioningArtifactsForServiceActionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProvisioningArtifactsForServiceAction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProvisioningArtifactsForServiceActionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListProvisioningArtifactsForServiceActionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the specified requests or all performed requests.
     * </p>
     * 
     * @param listRecordHistoryRequest
     * @return Result of the ListRecordHistory operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.ListRecordHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListRecordHistory"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListRecordHistoryResult listRecordHistory(ListRecordHistoryRequest request) {
        request = beforeClientExecution(request);
        return executeListRecordHistory(request);
    }

    @SdkInternalApi
    final ListRecordHistoryResult executeListRecordHistory(ListRecordHistoryRequest listRecordHistoryRequest) {

        ExecutionContext executionContext = createExecutionContext(listRecordHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRecordHistoryRequest> request = null;
        Response<ListRecordHistoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRecordHistoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRecordHistoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRecordHistory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRecordHistoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRecordHistoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the resources associated with the specified TagOption.
     * </p>
     * 
     * @param listResourcesForTagOptionRequest
     * @return Result of the ListResourcesForTagOption operation returned by the service.
     * @throws TagOptionNotMigratedException
     *         An operation requiring TagOptions failed because the TagOptions migration process has not been performed
     *         for this account. Please use the AWS console to perform the migration process before retrying the
     *         operation.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.ListResourcesForTagOption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListResourcesForTagOption"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListResourcesForTagOptionResult listResourcesForTagOption(ListResourcesForTagOptionRequest request) {
        request = beforeClientExecution(request);
        return executeListResourcesForTagOption(request);
    }

    @SdkInternalApi
    final ListResourcesForTagOptionResult executeListResourcesForTagOption(ListResourcesForTagOptionRequest listResourcesForTagOptionRequest) {

        ExecutionContext executionContext = createExecutionContext(listResourcesForTagOptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResourcesForTagOptionRequest> request = null;
        Response<ListResourcesForTagOptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResourcesForTagOptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listResourcesForTagOptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListResourcesForTagOption");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListResourcesForTagOptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListResourcesForTagOptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all self-service actions.
     * </p>
     * 
     * @param listServiceActionsRequest
     * @return Result of the ListServiceActions operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.ListServiceActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListServiceActions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListServiceActionsResult listServiceActions(ListServiceActionsRequest request) {
        request = beforeClientExecution(request);
        return executeListServiceActions(request);
    }

    @SdkInternalApi
    final ListServiceActionsResult executeListServiceActions(ListServiceActionsRequest listServiceActionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listServiceActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServiceActionsRequest> request = null;
        Response<ListServiceActionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServiceActionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listServiceActionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListServiceActions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListServiceActionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListServiceActionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a paginated list of self-service actions associated with the specified Product ID and Provisioning
     * Artifact ID.
     * </p>
     * 
     * @param listServiceActionsForProvisioningArtifactRequest
     * @return Result of the ListServiceActionsForProvisioningArtifact operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.ListServiceActionsForProvisioningArtifact
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListServiceActionsForProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListServiceActionsForProvisioningArtifactResult listServiceActionsForProvisioningArtifact(ListServiceActionsForProvisioningArtifactRequest request) {
        request = beforeClientExecution(request);
        return executeListServiceActionsForProvisioningArtifact(request);
    }

    @SdkInternalApi
    final ListServiceActionsForProvisioningArtifactResult executeListServiceActionsForProvisioningArtifact(
            ListServiceActionsForProvisioningArtifactRequest listServiceActionsForProvisioningArtifactRequest) {

        ExecutionContext executionContext = createExecutionContext(listServiceActionsForProvisioningArtifactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServiceActionsForProvisioningArtifactRequest> request = null;
        Response<ListServiceActionsForProvisioningArtifactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServiceActionsForProvisioningArtifactRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listServiceActionsForProvisioningArtifactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListServiceActionsForProvisioningArtifact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListServiceActionsForProvisioningArtifactResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListServiceActionsForProvisioningArtifactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the specified TagOptions or all TagOptions.
     * </p>
     * 
     * @param listTagOptionsRequest
     * @return Result of the ListTagOptions operation returned by the service.
     * @throws TagOptionNotMigratedException
     *         An operation requiring TagOptions failed because the TagOptions migration process has not been performed
     *         for this account. Please use the AWS console to perform the migration process before retrying the
     *         operation.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.ListTagOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListTagOptions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListTagOptionsResult listTagOptions(ListTagOptionsRequest request) {
        request = beforeClientExecution(request);
        return executeListTagOptions(request);
    }

    @SdkInternalApi
    final ListTagOptionsResult executeListTagOptions(ListTagOptionsRequest listTagOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagOptionsRequest> request = null;
        Response<ListTagOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagOptionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagOptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagOptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provisions the specified product.
     * </p>
     * <p>
     * A provisioned product is a resourced instance of a product. For example, provisioning a product based on a
     * CloudFormation template launches a CloudFormation stack and its underlying resources. You can check the status of
     * this request using <a>DescribeRecord</a>.
     * </p>
     * <p>
     * If the request contains a tag key with an empty list of values, there is a tag conflict for that key. Do not
     * include conflicted keys as tags, or this causes the error
     * "Parameter validation failed: Missing required parameter in Tags[<i>N</i>]:<i>Value</i>".
     * </p>
     * 
     * @param provisionProductRequest
     * @return Result of the ProvisionProduct operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws DuplicateResourceException
     *         The specified resource is a duplicate.
     * @sample AWSServiceCatalog.ProvisionProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ProvisionProduct"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ProvisionProductResult provisionProduct(ProvisionProductRequest request) {
        request = beforeClientExecution(request);
        return executeProvisionProduct(request);
    }

    @SdkInternalApi
    final ProvisionProductResult executeProvisionProduct(ProvisionProductRequest provisionProductRequest) {

        ExecutionContext executionContext = createExecutionContext(provisionProductRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ProvisionProductRequest> request = null;
        Response<ProvisionProductResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ProvisionProductRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(provisionProductRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ProvisionProduct");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ProvisionProductResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ProvisionProductResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Rejects an offer to share the specified portfolio.
     * </p>
     * 
     * @param rejectPortfolioShareRequest
     * @return Result of the RejectPortfolioShare operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.RejectPortfolioShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/RejectPortfolioShare"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RejectPortfolioShareResult rejectPortfolioShare(RejectPortfolioShareRequest request) {
        request = beforeClientExecution(request);
        return executeRejectPortfolioShare(request);
    }

    @SdkInternalApi
    final RejectPortfolioShareResult executeRejectPortfolioShare(RejectPortfolioShareRequest rejectPortfolioShareRequest) {

        ExecutionContext executionContext = createExecutionContext(rejectPortfolioShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RejectPortfolioShareRequest> request = null;
        Response<RejectPortfolioShareResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RejectPortfolioShareRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(rejectPortfolioShareRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RejectPortfolioShare");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RejectPortfolioShareResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RejectPortfolioShareResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the provisioned products that are available (not terminated).
     * </p>
     * <p>
     * To use additional filtering, see <a>SearchProvisionedProducts</a>.
     * </p>
     * 
     * @param scanProvisionedProductsRequest
     * @return Result of the ScanProvisionedProducts operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.ScanProvisionedProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ScanProvisionedProducts"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ScanProvisionedProductsResult scanProvisionedProducts(ScanProvisionedProductsRequest request) {
        request = beforeClientExecution(request);
        return executeScanProvisionedProducts(request);
    }

    @SdkInternalApi
    final ScanProvisionedProductsResult executeScanProvisionedProducts(ScanProvisionedProductsRequest scanProvisionedProductsRequest) {

        ExecutionContext executionContext = createExecutionContext(scanProvisionedProductsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ScanProvisionedProductsRequest> request = null;
        Response<ScanProvisionedProductsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ScanProvisionedProductsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(scanProvisionedProductsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ScanProvisionedProducts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ScanProvisionedProductsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ScanProvisionedProductsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the products to which the caller has access.
     * </p>
     * 
     * @param searchProductsRequest
     * @return Result of the SearchProducts operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.SearchProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/SearchProducts" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SearchProductsResult searchProducts(SearchProductsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchProducts(request);
    }

    @SdkInternalApi
    final SearchProductsResult executeSearchProducts(SearchProductsRequest searchProductsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchProductsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchProductsRequest> request = null;
        Response<SearchProductsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchProductsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchProductsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchProducts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchProductsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchProductsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the products for the specified portfolio or all products.
     * </p>
     * 
     * @param searchProductsAsAdminRequest
     * @return Result of the SearchProductsAsAdmin operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.SearchProductsAsAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/SearchProductsAsAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchProductsAsAdminResult searchProductsAsAdmin(SearchProductsAsAdminRequest request) {
        request = beforeClientExecution(request);
        return executeSearchProductsAsAdmin(request);
    }

    @SdkInternalApi
    final SearchProductsAsAdminResult executeSearchProductsAsAdmin(SearchProductsAsAdminRequest searchProductsAsAdminRequest) {

        ExecutionContext executionContext = createExecutionContext(searchProductsAsAdminRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchProductsAsAdminRequest> request = null;
        Response<SearchProductsAsAdminResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchProductsAsAdminRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchProductsAsAdminRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchProductsAsAdmin");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchProductsAsAdminResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new SearchProductsAsAdminResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the provisioned products that meet the specified criteria.
     * </p>
     * 
     * @param searchProvisionedProductsRequest
     * @return Result of the SearchProvisionedProducts operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.SearchProvisionedProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/SearchProvisionedProducts"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchProvisionedProductsResult searchProvisionedProducts(SearchProvisionedProductsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchProvisionedProducts(request);
    }

    @SdkInternalApi
    final SearchProvisionedProductsResult executeSearchProvisionedProducts(SearchProvisionedProductsRequest searchProvisionedProductsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchProvisionedProductsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchProvisionedProductsRequest> request = null;
        Response<SearchProvisionedProductsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchProvisionedProductsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(searchProvisionedProductsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchProvisionedProducts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchProvisionedProductsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SearchProvisionedProductsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Terminates the specified provisioned product.
     * </p>
     * <p>
     * This operation does not delete any records associated with the provisioned product.
     * </p>
     * <p>
     * You can check the status of this request using <a>DescribeRecord</a>.
     * </p>
     * 
     * @param terminateProvisionedProductRequest
     * @return Result of the TerminateProvisionedProduct operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.TerminateProvisionedProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/TerminateProvisionedProduct"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public TerminateProvisionedProductResult terminateProvisionedProduct(TerminateProvisionedProductRequest request) {
        request = beforeClientExecution(request);
        return executeTerminateProvisionedProduct(request);
    }

    @SdkInternalApi
    final TerminateProvisionedProductResult executeTerminateProvisionedProduct(TerminateProvisionedProductRequest terminateProvisionedProductRequest) {

        ExecutionContext executionContext = createExecutionContext(terminateProvisionedProductRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TerminateProvisionedProductRequest> request = null;
        Response<TerminateProvisionedProductResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TerminateProvisionedProductRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(terminateProvisionedProductRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TerminateProvisionedProduct");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TerminateProvisionedProductResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new TerminateProvisionedProductResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified constraint.
     * </p>
     * 
     * @param updateConstraintRequest
     * @return Result of the UpdateConstraint operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.UpdateConstraint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateConstraint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateConstraintResult updateConstraint(UpdateConstraintRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateConstraint(request);
    }

    @SdkInternalApi
    final UpdateConstraintResult executeUpdateConstraint(UpdateConstraintRequest updateConstraintRequest) {

        ExecutionContext executionContext = createExecutionContext(updateConstraintRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConstraintRequest> request = null;
        Response<UpdateConstraintResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConstraintRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateConstraintRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateConstraint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateConstraintResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateConstraintResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified portfolio.
     * </p>
     * <p>
     * You cannot update a product that was shared with you.
     * </p>
     * 
     * @param updatePortfolioRequest
     * @return Result of the UpdatePortfolio operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Decrease your resource use
     *         or increase your service limits and retry the operation.
     * @throws TagOptionNotMigratedException
     *         An operation requiring TagOptions failed because the TagOptions migration process has not been performed
     *         for this account. Please use the AWS console to perform the migration process before retrying the
     *         operation.
     * @sample AWSServiceCatalog.UpdatePortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdatePortfolio" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdatePortfolioResult updatePortfolio(UpdatePortfolioRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePortfolio(request);
    }

    @SdkInternalApi
    final UpdatePortfolioResult executeUpdatePortfolio(UpdatePortfolioRequest updatePortfolioRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePortfolioRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePortfolioRequest> request = null;
        Response<UpdatePortfolioResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePortfolioRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePortfolioRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePortfolio");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePortfolioResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePortfolioResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified product.
     * </p>
     * 
     * @param updateProductRequest
     * @return Result of the UpdateProduct operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws TagOptionNotMigratedException
     *         An operation requiring TagOptions failed because the TagOptions migration process has not been performed
     *         for this account. Please use the AWS console to perform the migration process before retrying the
     *         operation.
     * @sample AWSServiceCatalog.UpdateProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateProduct" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateProductResult updateProduct(UpdateProductRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateProduct(request);
    }

    @SdkInternalApi
    final UpdateProductResult executeUpdateProduct(UpdateProductRequest updateProductRequest) {

        ExecutionContext executionContext = createExecutionContext(updateProductRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProductRequest> request = null;
        Response<UpdateProductResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProductRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateProductRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateProduct");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateProductResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateProductResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Requests updates to the configuration of the specified provisioned product.
     * </p>
     * <p>
     * If there are tags associated with the object, they cannot be updated or added. Depending on the specific updates
     * requested, this operation can update with no interruption, with some interruption, or replace the provisioned
     * product entirely.
     * </p>
     * <p>
     * You can check the status of this request using <a>DescribeRecord</a>.
     * </p>
     * 
     * @param updateProvisionedProductRequest
     * @return Result of the UpdateProvisionedProduct operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.UpdateProvisionedProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateProvisionedProduct"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateProvisionedProductResult updateProvisionedProduct(UpdateProvisionedProductRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateProvisionedProduct(request);
    }

    @SdkInternalApi
    final UpdateProvisionedProductResult executeUpdateProvisionedProduct(UpdateProvisionedProductRequest updateProvisionedProductRequest) {

        ExecutionContext executionContext = createExecutionContext(updateProvisionedProductRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProvisionedProductRequest> request = null;
        Response<UpdateProvisionedProductResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProvisionedProductRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateProvisionedProductRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateProvisionedProduct");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateProvisionedProductResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateProvisionedProductResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified provisioning artifact (also known as a version) for the specified product.
     * </p>
     * <p>
     * You cannot update a provisioning artifact for a product that was shared with you.
     * </p>
     * 
     * @param updateProvisioningArtifactRequest
     * @return Result of the UpdateProvisioningArtifact operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.UpdateProvisioningArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateProvisioningArtifactResult updateProvisioningArtifact(UpdateProvisioningArtifactRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateProvisioningArtifact(request);
    }

    @SdkInternalApi
    final UpdateProvisioningArtifactResult executeUpdateProvisioningArtifact(UpdateProvisioningArtifactRequest updateProvisioningArtifactRequest) {

        ExecutionContext executionContext = createExecutionContext(updateProvisioningArtifactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProvisioningArtifactRequest> request = null;
        Response<UpdateProvisioningArtifactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProvisioningArtifactRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateProvisioningArtifactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateProvisioningArtifact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateProvisioningArtifactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateProvisioningArtifactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a self-service action.
     * </p>
     * 
     * @param updateServiceActionRequest
     * @return Result of the UpdateServiceAction operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.UpdateServiceAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateServiceAction"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateServiceActionResult updateServiceAction(UpdateServiceActionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateServiceAction(request);
    }

    @SdkInternalApi
    final UpdateServiceActionResult executeUpdateServiceAction(UpdateServiceActionRequest updateServiceActionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateServiceActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServiceActionRequest> request = null;
        Response<UpdateServiceActionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServiceActionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateServiceActionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateServiceAction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateServiceActionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateServiceActionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified TagOption.
     * </p>
     * 
     * @param updateTagOptionRequest
     * @return Result of the UpdateTagOption operation returned by the service.
     * @throws TagOptionNotMigratedException
     *         An operation requiring TagOptions failed because the TagOptions migration process has not been performed
     *         for this account. Please use the AWS console to perform the migration process before retrying the
     *         operation.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws DuplicateResourceException
     *         The specified resource is a duplicate.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.UpdateTagOption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateTagOption" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateTagOptionResult updateTagOption(UpdateTagOptionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTagOption(request);
    }

    @SdkInternalApi
    final UpdateTagOptionResult executeUpdateTagOption(UpdateTagOptionRequest updateTagOptionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTagOptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTagOptionRequest> request = null;
        Response<UpdateTagOptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTagOptionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTagOptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Service Catalog");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTagOption");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTagOptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTagOptionResultJsonUnmarshaller());
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
