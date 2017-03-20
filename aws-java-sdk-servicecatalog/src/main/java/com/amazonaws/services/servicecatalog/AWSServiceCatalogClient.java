/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <b>Overview</b>
 * </p>
 * <p>
 * <a href="https://aws.amazon.com/servicecatalog/">AWS Service Catalog</a> allows organizations to create and manage
 * catalogs of IT services that are approved for use on AWS. This documentation provides reference material for the AWS
 * Service Catalog end user API. To get the most out of this documentation, you need to be familiar with the terminology
 * discussed in <a href="http://docs.aws.amazon.com/servicecatalog/latest/userguide/what-is_concepts.html">AWS Service
 * Catalog Concepts</a>.
 * </p>
 * <p>
 * <i>Additional Resources</i>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html">AWS Service Catalog
 * Administrator Guide</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/servicecatalog/latest/userguide/introduction.html">AWS Service Catalog User
 * Guide</a>
 * </p>
 * </li>
 * </ul>
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

    private final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withModeledClass(
                                    com.amazonaws.services.servicecatalog.model.ResourceInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParametersException").withModeledClass(
                                    com.amazonaws.services.servicecatalog.model.InvalidParametersException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DuplicateResourceException").withModeledClass(
                                    com.amazonaws.services.servicecatalog.model.DuplicateResourceException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.servicecatalog.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.servicecatalog.model.ResourceNotFoundException.class))
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
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
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
     * Accepts an offer to share a portfolio.
     * </p>
     * 
     * @param acceptPortfolioShareRequest
     * @return Result of the AcceptPortfolioShare operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Reduce the resource use or
     *         increase the service limits and retry the operation.
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
     *         One or more parameters provided to the operation are invalid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Reduce the resource use or
     *         increase the service limits and retry the operation.
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
     * Associates a product with a portfolio.
     * </p>
     * 
     * @param associateProductWithPortfolioRequest
     * @return Result of the AssociateProductWithPortfolio operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Reduce the resource use or
     *         increase the service limits and retry the operation.
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
     * Creates a new constraint.
     * </p>
     * 
     * @param createConstraintRequest
     * @return Result of the CreateConstraint operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Reduce the resource use or
     *         increase the service limits and retry the operation.
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
     * Creates a new portfolio.
     * </p>
     * 
     * @param createPortfolioRequest
     * @return Result of the CreatePortfolio operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Reduce the resource use or
     *         increase the service limits and retry the operation.
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
     * Creates a new portfolio share.
     * </p>
     * 
     * @param createPortfolioShareRequest
     * @return Result of the CreatePortfolioShare operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Reduce the resource use or
     *         increase the service limits and retry the operation.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
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
     * Creates a new product.
     * </p>
     * 
     * @param createProductRequest
     * @return Result of the CreateProduct operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Reduce the resource use or
     *         increase the service limits and retry the operation.
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
     * Create a new provisioning artifact for the specified product. This operation will not work with a product that
     * has been shared with you.
     * </p>
     * 
     * @param createProvisioningArtifactRequest
     * @return Result of the CreateProvisioningArtifact operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Reduce the resource use or
     *         increase the service limits and retry the operation.
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
     * Deletes the specified constraint.
     * </p>
     * 
     * @param deleteConstraintRequest
     * @return Result of the DeleteConstraint operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
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
     * Deletes the specified portfolio. This operation will not work with a portfolio that has been shared with you or
     * if it has products, users, constraints, or shared accounts associated with it.
     * </p>
     * 
     * @param deletePortfolioRequest
     * @return Result of the DeletePortfolio operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @throws ResourceInUseException
     *         The operation was requested against a resource that is currently in use. Free the resource from use and
     *         retry the operation.
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
     * Deletes the specified portfolio share.
     * </p>
     * 
     * @param deletePortfolioShareRequest
     * @return Result of the DeletePortfolioShare operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
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
     * Deletes the specified product. This operation will not work with a product that has been shared with you or is
     * associated with a portfolio.
     * </p>
     * 
     * @param deleteProductRequest
     * @return Result of the DeleteProduct operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceInUseException
     *         The operation was requested against a resource that is currently in use. Free the resource from use and
     *         retry the operation.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
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
     * Deletes the specified provisioning artifact. This operation will not work on a provisioning artifact associated
     * with a product that has been shared with you, or on the last provisioning artifact associated with a product (a
     * product must have at least one provisioning artifact).
     * </p>
     * 
     * @param deleteProvisioningArtifactRequest
     * @return Result of the DeleteProvisioningArtifact operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceInUseException
     *         The operation was requested against a resource that is currently in use. Free the resource from use and
     *         retry the operation.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
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
     * Retrieves detailed information for a specified constraint.
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
     * Retrieves detailed information and any tags associated with the specified portfolio.
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
     * Retrieves information about a specified product.
     * </p>
     * <p>
     * This operation is functionally identical to <a>DescribeProductView</a> except that it takes as input
     * <code>ProductId</code> instead of <code>ProductViewId</code>.
     * </p>
     * 
     * @param describeProductRequest
     * @return Result of the DescribeProduct operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
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
     * Retrieves information about a specified product, run with administrator access.
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
     * Retrieves information about a specified product.
     * </p>
     * <p>
     * This operation is functionally identical to <a>DescribeProduct</a> except that it takes as input
     * <code>ProductViewId</code> instead of <code>ProductId</code>.
     * </p>
     * 
     * @param describeProductViewRequest
     * @return Result of the DescribeProductView operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
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
     * Retrieves detailed information about the specified provisioning artifact.
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
     * Provides information about parameters required to provision a specified product in a specified manner. Use this
     * operation to obtain the list of <code>ProvisioningArtifactParameters</code> parameters available to call the
     * <a>ProvisionProduct</a> operation for the specified product.
     * </p>
     * 
     * @param describeProvisioningParametersRequest
     * @return Result of the DescribeProvisioningParameters operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
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
     * Retrieves a paginated list of the full details of a specific request. Use this operation after calling a request
     * operation (<a>ProvisionProduct</a>, <a>TerminateProvisionedProduct</a>, or <a>UpdateProvisionedProduct</a>).
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
     * Disassociates a previously associated principal ARN from a specified portfolio.
     * </p>
     * 
     * @param disassociatePrincipalFromPortfolioRequest
     * @return Result of the DisassociatePrincipalFromPortfolio operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
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
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
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
     * Lists details of all portfolios for which sharing was accepted by this account.
     * </p>
     * 
     * @param listAcceptedPortfolioSharesRequest
     * @return Result of the ListAcceptedPortfolioShares operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
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
     * Retrieves detailed constraint information for the specified portfolio and product.
     * </p>
     * 
     * @param listConstraintsForPortfolioRequest
     * @return Result of the ListConstraintsForPortfolio operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
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
     * Returns a paginated list of all paths to a specified product. A path is how the user has access to a specified
     * product, and is necessary when provisioning a product. A path also determines the constraints put on the product.
     * </p>
     * 
     * @param listLaunchPathsRequest
     * @return Result of the ListLaunchPaths operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
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
     * Lists the account IDs that have been authorized sharing of the specified portfolio.
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
     *         One or more parameters provided to the operation are invalid.
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
     *         One or more parameters provided to the operation are invalid.
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
     *         One or more parameters provided to the operation are invalid.
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
     * Lists all provisioning artifacts associated with the specified product.
     * </p>
     * 
     * @param listProvisioningArtifactsRequest
     * @return Result of the ListProvisioningArtifacts operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
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
     * Returns a paginated list of all performed requests, in the form of RecordDetails objects that are filtered as
     * specified.
     * </p>
     * 
     * @param listRecordHistoryRequest
     * @return Result of the ListRecordHistory operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
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
     * Requests a <i>Provision</i> of a specified product. A <i>ProvisionedProduct</i> is a resourced instance for a
     * product. For example, provisioning a CloudFormation-template-backed product results in launching a CloudFormation
     * stack and all the underlying resources that come with it.
     * </p>
     * <p>
     * You can check the status of this request using the <a>DescribeRecord</a> operation.
     * </p>
     * 
     * @param provisionProductRequest
     * @return Result of the ProvisionProduct operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
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
     * Rejects an offer to share a portfolio.
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
     * Returns a paginated list of all the ProvisionedProduct objects that are currently available (not terminated).
     * </p>
     * 
     * @param scanProvisionedProductsRequest
     * @return Result of the ScanProvisionedProducts operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
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
     * Returns a paginated list all of the <code>Products</code> objects to which the caller has access.
     * </p>
     * <p>
     * The output of this operation can be used as input for other operations, such as <a>DescribeProductView</a>.
     * </p>
     * 
     * @param searchProductsRequest
     * @return Result of the SearchProducts operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
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
     * Retrieves summary and status information about all products created within the caller's account. If a portfolio
     * ID is provided, this operation retrieves information for only those products that are associated with the
     * specified portfolio.
     * </p>
     * 
     * @param searchProductsAsAdminRequest
     * @return Result of the SearchProductsAsAdmin operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
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
     * Requests termination of an existing ProvisionedProduct object. If there are <code>Tags</code> associated with the
     * object, they are terminated when the ProvisionedProduct object is terminated.
     * </p>
     * <p>
     * This operation does not delete any records associated with the ProvisionedProduct object.
     * </p>
     * <p>
     * You can check the status of this request using the <a>DescribeRecord</a> operation.
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
     * Updates an existing constraint.
     * </p>
     * 
     * @param updateConstraintRequest
     * @return Result of the UpdateConstraint operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
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
     * Updates the specified portfolio's details. This operation will not work with a product that has been shared with
     * you.
     * </p>
     * 
     * @param updatePortfolioRequest
     * @return Result of the UpdatePortfolio operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Reduce the resource use or
     *         increase the service limits and retry the operation.
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
     * Updates an existing product.
     * </p>
     * 
     * @param updateProductRequest
     * @return Result of the UpdateProduct operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
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
     * Requests updates to the configuration of an existing ProvisionedProduct object. If there are tags associated with
     * the object, they cannot be updated or added with this operation. Depending on the specific updates requested,
     * this operation may update with no interruption, with some interruption, or replace the ProvisionedProduct object
     * entirely.
     * </p>
     * <p>
     * You can check the status of this request using the <a>DescribeRecord</a> operation.
     * </p>
     * 
     * @param updateProvisionedProductRequest
     * @return Result of the UpdateProvisionedProduct operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
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
     * Updates an existing provisioning artifact's information. This operation will not work on a provisioning artifact
     * associated with a product that has been shared with you.
     * </p>
     * 
     * @param updateProvisioningArtifactRequest
     * @return Result of the UpdateProvisioningArtifact operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
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
