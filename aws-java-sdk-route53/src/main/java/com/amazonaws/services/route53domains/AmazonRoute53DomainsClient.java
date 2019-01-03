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
package com.amazonaws.services.route53domains;

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

import com.amazonaws.services.route53domains.AmazonRoute53DomainsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.route53domains.model.*;
import com.amazonaws.services.route53domains.model.transform.*;

/**
 * Client for accessing Amazon Route 53 Domains. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * Amazon Route 53 API actions let you register domain names and perform related operations.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonRoute53DomainsClient extends AmazonWebServiceClient implements AmazonRoute53Domains {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonRoute53Domains.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "route53domains";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DuplicateRequest").withModeledClass(
                                    com.amazonaws.services.route53domains.model.DuplicateRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInput").withModeledClass(
                                    com.amazonaws.services.route53domains.model.InvalidInputException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TLDRulesViolation").withModeledClass(
                                    com.amazonaws.services.route53domains.model.TLDRulesViolationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DomainLimitExceeded").withModeledClass(
                                    com.amazonaws.services.route53domains.model.DomainLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedTLD").withModeledClass(
                                    com.amazonaws.services.route53domains.model.UnsupportedTLDException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OperationLimitExceeded").withModeledClass(
                                    com.amazonaws.services.route53domains.model.OperationLimitExceededException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.route53domains.model.AmazonRoute53DomainsException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon Route 53 Domains. A credentials provider chain will
     * be used that searches for credentials in this order:
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
     * @deprecated use {@link AmazonRoute53DomainsClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonRoute53DomainsClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Route 53 Domains. A credentials provider chain will
     * be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Amazon Route 53 Domains (ex:
     *        proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonRoute53DomainsClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonRoute53DomainsClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Route 53 Domains using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonRoute53DomainsClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonRoute53DomainsClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonRoute53DomainsClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Route 53 Domains using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Route 53 Domains (ex:
     *        proxy settings, retry counts, etc.).
     * @deprecated use {@link AmazonRoute53DomainsClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRoute53DomainsClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonRoute53DomainsClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Route 53 Domains using the specified AWS account
     * credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonRoute53DomainsClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonRoute53DomainsClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Route 53 Domains using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Route 53 Domains (ex:
     *        proxy settings, retry counts, etc.).
     * @deprecated use {@link AmazonRoute53DomainsClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRoute53DomainsClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonRoute53DomainsClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Route 53 Domains using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Route 53 Domains (ex:
     *        proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonRoute53DomainsClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRoute53DomainsClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonRoute53DomainsClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonRoute53DomainsClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonRoute53DomainsClientBuilder builder() {
        return AmazonRoute53DomainsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Route 53 Domains using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonRoute53DomainsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Route 53 Domains using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonRoute53DomainsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://route53domains.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/route53domains/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/route53domains/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * This operation checks the availability of one domain name. Note that if the availability status of a domain is
     * pending, you must submit another request to determine the availability of the domain name.
     * </p>
     * 
     * @param checkDomainAvailabilityRequest
     *        The CheckDomainAvailability request contains the following elements.
     * @return Result of the CheckDomainAvailability operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.CheckDomainAvailability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/CheckDomainAvailability"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CheckDomainAvailabilityResult checkDomainAvailability(CheckDomainAvailabilityRequest request) {
        request = beforeClientExecution(request);
        return executeCheckDomainAvailability(request);
    }

    @SdkInternalApi
    final CheckDomainAvailabilityResult executeCheckDomainAvailability(CheckDomainAvailabilityRequest checkDomainAvailabilityRequest) {

        ExecutionContext executionContext = createExecutionContext(checkDomainAvailabilityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CheckDomainAvailabilityRequest> request = null;
        Response<CheckDomainAvailabilityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CheckDomainAvailabilityRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(checkDomainAvailabilityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route 53 Domains");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CheckDomainAvailability");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CheckDomainAvailabilityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CheckDomainAvailabilityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Checks whether a domain name can be transferred to Amazon Route 53.
     * </p>
     * 
     * @param checkDomainTransferabilityRequest
     *        The CheckDomainTransferability request contains the following elements.
     * @return Result of the CheckDomainTransferability operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.CheckDomainTransferability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/CheckDomainTransferability"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CheckDomainTransferabilityResult checkDomainTransferability(CheckDomainTransferabilityRequest request) {
        request = beforeClientExecution(request);
        return executeCheckDomainTransferability(request);
    }

    @SdkInternalApi
    final CheckDomainTransferabilityResult executeCheckDomainTransferability(CheckDomainTransferabilityRequest checkDomainTransferabilityRequest) {

        ExecutionContext executionContext = createExecutionContext(checkDomainTransferabilityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CheckDomainTransferabilityRequest> request = null;
        Response<CheckDomainTransferabilityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CheckDomainTransferabilityRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(checkDomainTransferabilityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route 53 Domains");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CheckDomainTransferability");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CheckDomainTransferabilityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CheckDomainTransferabilityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation deletes the specified tags for a domain.
     * </p>
     * <p>
     * All tag operations are eventually consistent; subsequent operations might not immediately represent all issued
     * operations.
     * </p>
     * 
     * @param deleteTagsForDomainRequest
     *        The DeleteTagsForDomainRequest includes the following elements.
     * @return Result of the DeleteTagsForDomain operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed threshold for the account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.DeleteTagsForDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/DeleteTagsForDomain"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteTagsForDomainResult deleteTagsForDomain(DeleteTagsForDomainRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTagsForDomain(request);
    }

    @SdkInternalApi
    final DeleteTagsForDomainResult executeDeleteTagsForDomain(DeleteTagsForDomainRequest deleteTagsForDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTagsForDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTagsForDomainRequest> request = null;
        Response<DeleteTagsForDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTagsForDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTagsForDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route 53 Domains");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTagsForDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTagsForDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTagsForDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation disables automatic renewal of domain registration for the specified domain.
     * </p>
     * 
     * @param disableDomainAutoRenewRequest
     * @return Result of the DisableDomainAutoRenew operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.DisableDomainAutoRenew
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/DisableDomainAutoRenew"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisableDomainAutoRenewResult disableDomainAutoRenew(DisableDomainAutoRenewRequest request) {
        request = beforeClientExecution(request);
        return executeDisableDomainAutoRenew(request);
    }

    @SdkInternalApi
    final DisableDomainAutoRenewResult executeDisableDomainAutoRenew(DisableDomainAutoRenewRequest disableDomainAutoRenewRequest) {

        ExecutionContext executionContext = createExecutionContext(disableDomainAutoRenewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableDomainAutoRenewRequest> request = null;
        Response<DisableDomainAutoRenewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableDomainAutoRenewRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disableDomainAutoRenewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route 53 Domains");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableDomainAutoRenew");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableDomainAutoRenewResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisableDomainAutoRenewResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation removes the transfer lock on the domain (specifically the <code>clientTransferProhibited</code>
     * status) to allow domain transfers. We recommend you refrain from performing this action unless you intend to
     * transfer the domain to a different registrar. Successful submission returns an operation ID that you can use to
     * track the progress and completion of the action. If the request is not completed successfully, the domain
     * registrant will be notified by email.
     * </p>
     * 
     * @param disableDomainTransferLockRequest
     *        The DisableDomainTransferLock request includes the following element.
     * @return Result of the DisableDomainTransferLock operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws DuplicateRequestException
     *         The request is already in progress for the domain.
     * @throws TLDRulesViolationException
     *         The top-level domain does not support this operation.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed threshold for the account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.DisableDomainTransferLock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/DisableDomainTransferLock"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisableDomainTransferLockResult disableDomainTransferLock(DisableDomainTransferLockRequest request) {
        request = beforeClientExecution(request);
        return executeDisableDomainTransferLock(request);
    }

    @SdkInternalApi
    final DisableDomainTransferLockResult executeDisableDomainTransferLock(DisableDomainTransferLockRequest disableDomainTransferLockRequest) {

        ExecutionContext executionContext = createExecutionContext(disableDomainTransferLockRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableDomainTransferLockRequest> request = null;
        Response<DisableDomainTransferLockResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableDomainTransferLockRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disableDomainTransferLockRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route 53 Domains");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableDomainTransferLock");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableDomainTransferLockResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisableDomainTransferLockResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation configures Amazon Route 53 to automatically renew the specified domain before the domain
     * registration expires. The cost of renewing your domain registration is billed to your AWS account.
     * </p>
     * <p>
     * The period during which you can renew a domain name varies by TLD. For a list of TLDs and their renewal policies,
     * see <a href="http://wiki.gandi.net/en/domains/renew#renewal_restoration_and_deletion_times">
     * "Renewal, restoration, and deletion times"</a> on the website for our registrar associate, Gandi. Amazon Route 53
     * requires that you renew before the end of the renewal period that is listed on the Gandi website so we can
     * complete processing before the deadline.
     * </p>
     * 
     * @param enableDomainAutoRenewRequest
     * @return Result of the EnableDomainAutoRenew operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @throws TLDRulesViolationException
     *         The top-level domain does not support this operation.
     * @sample AmazonRoute53Domains.EnableDomainAutoRenew
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/EnableDomainAutoRenew"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public EnableDomainAutoRenewResult enableDomainAutoRenew(EnableDomainAutoRenewRequest request) {
        request = beforeClientExecution(request);
        return executeEnableDomainAutoRenew(request);
    }

    @SdkInternalApi
    final EnableDomainAutoRenewResult executeEnableDomainAutoRenew(EnableDomainAutoRenewRequest enableDomainAutoRenewRequest) {

        ExecutionContext executionContext = createExecutionContext(enableDomainAutoRenewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableDomainAutoRenewRequest> request = null;
        Response<EnableDomainAutoRenewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableDomainAutoRenewRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(enableDomainAutoRenewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route 53 Domains");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableDomainAutoRenew");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableDomainAutoRenewResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new EnableDomainAutoRenewResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation sets the transfer lock on the domain (specifically the <code>clientTransferProhibited</code>
     * status) to prevent domain transfers. Successful submission returns an operation ID that you can use to track the
     * progress and completion of the action. If the request is not completed successfully, the domain registrant will
     * be notified by email.
     * </p>
     * 
     * @param enableDomainTransferLockRequest
     *        A request to set the transfer lock for the specified domain.
     * @return Result of the EnableDomainTransferLock operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws DuplicateRequestException
     *         The request is already in progress for the domain.
     * @throws TLDRulesViolationException
     *         The top-level domain does not support this operation.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed threshold for the account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.EnableDomainTransferLock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/EnableDomainTransferLock"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public EnableDomainTransferLockResult enableDomainTransferLock(EnableDomainTransferLockRequest request) {
        request = beforeClientExecution(request);
        return executeEnableDomainTransferLock(request);
    }

    @SdkInternalApi
    final EnableDomainTransferLockResult executeEnableDomainTransferLock(EnableDomainTransferLockRequest enableDomainTransferLockRequest) {

        ExecutionContext executionContext = createExecutionContext(enableDomainTransferLockRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableDomainTransferLockRequest> request = null;
        Response<EnableDomainTransferLockResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableDomainTransferLockRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(enableDomainTransferLockRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route 53 Domains");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableDomainTransferLock");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableDomainTransferLockResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new EnableDomainTransferLockResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * For operations that require confirmation that the email address for the registrant contact is valid, such as
     * registering a new domain, this operation returns information about whether the registrant contact has responded.
     * </p>
     * <p>
     * If you want us to resend the email, use the <code>ResendContactReachabilityEmail</code> operation.
     * </p>
     * 
     * @param getContactReachabilityStatusRequest
     * @return Result of the GetContactReachabilityStatus operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed threshold for the account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.GetContactReachabilityStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/GetContactReachabilityStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetContactReachabilityStatusResult getContactReachabilityStatus(GetContactReachabilityStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetContactReachabilityStatus(request);
    }

    @SdkInternalApi
    final GetContactReachabilityStatusResult executeGetContactReachabilityStatus(GetContactReachabilityStatusRequest getContactReachabilityStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getContactReachabilityStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContactReachabilityStatusRequest> request = null;
        Response<GetContactReachabilityStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContactReachabilityStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getContactReachabilityStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route 53 Domains");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetContactReachabilityStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetContactReachabilityStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetContactReachabilityStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation returns detailed information about a specified domain that is associated with the current AWS
     * account. Contact information for the domain is also returned as part of the output.
     * </p>
     * 
     * @param getDomainDetailRequest
     *        The GetDomainDetail request includes the following element.
     * @return Result of the GetDomainDetail operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.GetDomainDetail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/GetDomainDetail" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetDomainDetailResult getDomainDetail(GetDomainDetailRequest request) {
        request = beforeClientExecution(request);
        return executeGetDomainDetail(request);
    }

    @SdkInternalApi
    final GetDomainDetailResult executeGetDomainDetail(GetDomainDetailRequest getDomainDetailRequest) {

        ExecutionContext executionContext = createExecutionContext(getDomainDetailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDomainDetailRequest> request = null;
        Response<GetDomainDetailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDomainDetailRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDomainDetailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route 53 Domains");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDomainDetail");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDomainDetailResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDomainDetailResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The GetDomainSuggestions operation returns a list of suggested domain names given a string, which can either be a
     * domain name or simply a word or phrase (without spaces).
     * </p>
     * 
     * @param getDomainSuggestionsRequest
     * @return Result of the GetDomainSuggestions operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.GetDomainSuggestions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/GetDomainSuggestions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDomainSuggestionsResult getDomainSuggestions(GetDomainSuggestionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetDomainSuggestions(request);
    }

    @SdkInternalApi
    final GetDomainSuggestionsResult executeGetDomainSuggestions(GetDomainSuggestionsRequest getDomainSuggestionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getDomainSuggestionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDomainSuggestionsRequest> request = null;
        Response<GetDomainSuggestionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDomainSuggestionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDomainSuggestionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route 53 Domains");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDomainSuggestions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDomainSuggestionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDomainSuggestionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation returns the current status of an operation that is not completed.
     * </p>
     * 
     * @param getOperationDetailRequest
     *        The <a>GetOperationDetail</a> request includes the following element.
     * @return Result of the GetOperationDetail operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @sample AmazonRoute53Domains.GetOperationDetail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/GetOperationDetail"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetOperationDetailResult getOperationDetail(GetOperationDetailRequest request) {
        request = beforeClientExecution(request);
        return executeGetOperationDetail(request);
    }

    @SdkInternalApi
    final GetOperationDetailResult executeGetOperationDetail(GetOperationDetailRequest getOperationDetailRequest) {

        ExecutionContext executionContext = createExecutionContext(getOperationDetailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOperationDetailRequest> request = null;
        Response<GetOperationDetailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOperationDetailRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getOperationDetailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route 53 Domains");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetOperationDetail");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetOperationDetailResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetOperationDetailResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation returns all the domain names registered with Amazon Route 53 for the current AWS account.
     * </p>
     * 
     * @param listDomainsRequest
     *        The ListDomains request includes the following elements.
     * @return Result of the ListDomains operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @sample AmazonRoute53Domains.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDomainsResult listDomains(ListDomainsRequest request) {
        request = beforeClientExecution(request);
        return executeListDomains(request);
    }

    @SdkInternalApi
    final ListDomainsResult executeListDomains(ListDomainsRequest listDomainsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDomainsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDomainsRequest> request = null;
        Response<ListDomainsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDomainsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDomainsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route 53 Domains");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDomains");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDomainsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDomainsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListDomainsResult listDomains() {
        return listDomains(new ListDomainsRequest());
    }

    /**
     * <p>
     * This operation returns the operation IDs of operations that are not yet complete.
     * </p>
     * 
     * @param listOperationsRequest
     *        The ListOperations request includes the following elements.
     * @return Result of the ListOperations operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @sample AmazonRoute53Domains.ListOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/ListOperations" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListOperationsResult listOperations(ListOperationsRequest request) {
        request = beforeClientExecution(request);
        return executeListOperations(request);
    }

    @SdkInternalApi
    final ListOperationsResult executeListOperations(ListOperationsRequest listOperationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listOperationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOperationsRequest> request = null;
        Response<ListOperationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOperationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listOperationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route 53 Domains");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListOperations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListOperationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListOperationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListOperationsResult listOperations() {
        return listOperations(new ListOperationsRequest());
    }

    /**
     * <p>
     * This operation returns all of the tags that are associated with the specified domain.
     * </p>
     * <p>
     * All tag operations are eventually consistent; subsequent operations might not immediately represent all issued
     * operations.
     * </p>
     * 
     * @param listTagsForDomainRequest
     *        The ListTagsForDomainRequest includes the following elements.
     * @return Result of the ListTagsForDomain operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed threshold for the account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.ListTagsForDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/ListTagsForDomain"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTagsForDomainResult listTagsForDomain(ListTagsForDomainRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForDomain(request);
    }

    @SdkInternalApi
    final ListTagsForDomainResult executeListTagsForDomain(ListTagsForDomainRequest listTagsForDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForDomainRequest> request = null;
        Response<ListTagsForDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route 53 Domains");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation registers a domain. Domains are registered either by Amazon Registrar (for .com, .net, and .org
     * domains) or by our registrar associate, Gandi (for all other domains). For some top-level domains (TLDs), this
     * operation requires extra parameters.
     * </p>
     * <p>
     * When you register a domain, Amazon Route 53 does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a Amazon Route 53 hosted zone that has the same name as the domain. Amazon Route 53 assigns four name
     * servers to your hosted zone and automatically updates your domain registration with the names of these name
     * servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Enables autorenew, so your domain registration will renew automatically each year. We'll notify you in advance of
     * the renewal date so you can choose whether to renew the registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optionally enables privacy protection, so WHOIS queries return contact information either for Amazon Registrar
     * (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you don't
     * enable privacy protection, WHOIS queries return the information that you entered for the registrant, admin, and
     * tech contacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * If registration is successful, returns an operation ID that you can use to track the progress and completion of
     * the action. If the request is not completed successfully, the domain registrant is notified by email.
     * </p>
     * </li>
     * <li>
     * <p>
     * Charges your AWS account an amount based on the top-level domain. For more information, see <a
     * href="http://aws.amazon.com/route53/pricing/">Amazon Route 53 Pricing</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param registerDomainRequest
     *        The RegisterDomain request includes the following elements.
     * @return Result of the RegisterDomain operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @throws DuplicateRequestException
     *         The request is already in progress for the domain.
     * @throws TLDRulesViolationException
     *         The top-level domain does not support this operation.
     * @throws DomainLimitExceededException
     *         The number of domains has exceeded the allowed threshold for the account.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed threshold for the account.
     * @sample AmazonRoute53Domains.RegisterDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/RegisterDomain" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RegisterDomainResult registerDomain(RegisterDomainRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterDomain(request);
    }

    @SdkInternalApi
    final RegisterDomainResult executeRegisterDomain(RegisterDomainRequest registerDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(registerDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterDomainRequest> request = null;
        Response<RegisterDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route 53 Domains");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RegisterDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation renews a domain for the specified number of years. The cost of renewing your domain is billed to
     * your AWS account.
     * </p>
     * <p>
     * We recommend that you renew your domain several weeks before the expiration date. Some TLD registries delete
     * domains before the expiration date if you haven't renewed far enough in advance. For more information about
     * renewing domain registration, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/domain-renew.html">Renewing Registration for a
     * Domain</a> in the Amazon Route 53 Developer Guide.
     * </p>
     * 
     * @param renewDomainRequest
     *        A <code>RenewDomain</code> request includes the number of years that you want to renew for and the current
     *        expiration year.
     * @return Result of the RenewDomain operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @throws DuplicateRequestException
     *         The request is already in progress for the domain.
     * @throws TLDRulesViolationException
     *         The top-level domain does not support this operation.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed threshold for the account.
     * @sample AmazonRoute53Domains.RenewDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/RenewDomain" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RenewDomainResult renewDomain(RenewDomainRequest request) {
        request = beforeClientExecution(request);
        return executeRenewDomain(request);
    }

    @SdkInternalApi
    final RenewDomainResult executeRenewDomain(RenewDomainRequest renewDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(renewDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RenewDomainRequest> request = null;
        Response<RenewDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RenewDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(renewDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route 53 Domains");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RenewDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RenewDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RenewDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * For operations that require confirmation that the email address for the registrant contact is valid, such as
     * registering a new domain, this operation resends the confirmation email to the current email address for the
     * registrant contact.
     * </p>
     * 
     * @param resendContactReachabilityEmailRequest
     * @return Result of the ResendContactReachabilityEmail operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed threshold for the account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.ResendContactReachabilityEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/ResendContactReachabilityEmail"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ResendContactReachabilityEmailResult resendContactReachabilityEmail(ResendContactReachabilityEmailRequest request) {
        request = beforeClientExecution(request);
        return executeResendContactReachabilityEmail(request);
    }

    @SdkInternalApi
    final ResendContactReachabilityEmailResult executeResendContactReachabilityEmail(ResendContactReachabilityEmailRequest resendContactReachabilityEmailRequest) {

        ExecutionContext executionContext = createExecutionContext(resendContactReachabilityEmailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResendContactReachabilityEmailRequest> request = null;
        Response<ResendContactReachabilityEmailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResendContactReachabilityEmailRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(resendContactReachabilityEmailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route 53 Domains");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResendContactReachabilityEmail");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResendContactReachabilityEmailResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ResendContactReachabilityEmailResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation returns the AuthCode for the domain. To transfer a domain to another registrar, you provide this
     * value to the new registrar.
     * </p>
     * 
     * @param retrieveDomainAuthCodeRequest
     *        A request for the authorization code for the specified domain. To transfer a domain to another registrar,
     *        you provide this value to the new registrar.
     * @return Result of the RetrieveDomainAuthCode operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.RetrieveDomainAuthCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/RetrieveDomainAuthCode"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RetrieveDomainAuthCodeResult retrieveDomainAuthCode(RetrieveDomainAuthCodeRequest request) {
        request = beforeClientExecution(request);
        return executeRetrieveDomainAuthCode(request);
    }

    @SdkInternalApi
    final RetrieveDomainAuthCodeResult executeRetrieveDomainAuthCode(RetrieveDomainAuthCodeRequest retrieveDomainAuthCodeRequest) {

        ExecutionContext executionContext = createExecutionContext(retrieveDomainAuthCodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RetrieveDomainAuthCodeRequest> request = null;
        Response<RetrieveDomainAuthCodeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RetrieveDomainAuthCodeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(retrieveDomainAuthCodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route 53 Domains");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RetrieveDomainAuthCode");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RetrieveDomainAuthCodeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RetrieveDomainAuthCodeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation transfers a domain from another registrar to Amazon Route 53. When the transfer is complete, the
     * domain is registered either with Amazon Registrar (for .com, .net, and .org domains) or with our registrar
     * associate, Gandi (for all other TLDs).
     * </p>
     * <p>
     * For transfer requirements, a detailed procedure, and information about viewing the status of a domain transfer,
     * see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/domain-transfer-to-route-53.html">Transferring
     * Registration for a Domain to Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * If the registrar for your domain is also the DNS service provider for the domain, we highly recommend that you
     * consider transferring your DNS service to Amazon Route 53 or to another DNS service provider before you transfer
     * your registration. Some registrars provide free DNS service when you purchase a domain registration. When you
     * transfer the registration, the previous registrar will not renew your domain registration and could end your DNS
     * service at any time.
     * </p>
     * <important>
     * <p>
     * If the registrar for your domain is also the DNS service provider for the domain and you don't transfer DNS
     * service to another provider, your website, email, and the web applications associated with the domain might
     * become unavailable.
     * </p>
     * </important>
     * <p>
     * If the transfer is successful, this method returns an operation ID that you can use to track the progress and
     * completion of the action. If the transfer doesn't complete successfully, the domain registrant will be notified
     * by email.
     * </p>
     * 
     * @param transferDomainRequest
     *        The TransferDomain request includes the following elements.
     * @return Result of the TransferDomain operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @throws DuplicateRequestException
     *         The request is already in progress for the domain.
     * @throws TLDRulesViolationException
     *         The top-level domain does not support this operation.
     * @throws DomainLimitExceededException
     *         The number of domains has exceeded the allowed threshold for the account.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed threshold for the account.
     * @sample AmazonRoute53Domains.TransferDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/TransferDomain" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public TransferDomainResult transferDomain(TransferDomainRequest request) {
        request = beforeClientExecution(request);
        return executeTransferDomain(request);
    }

    @SdkInternalApi
    final TransferDomainResult executeTransferDomain(TransferDomainRequest transferDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(transferDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TransferDomainRequest> request = null;
        Response<TransferDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TransferDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(transferDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route 53 Domains");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TransferDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TransferDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TransferDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation updates the contact information for a particular domain. You must specify information for at least
     * one contact: registrant, administrator, or technical.
     * </p>
     * <p>
     * If the update is successful, this method returns an operation ID that you can use to track the progress and
     * completion of the action. If the request is not completed successfully, the domain registrant will be notified by
     * email.
     * </p>
     * 
     * @param updateDomainContactRequest
     *        The UpdateDomainContact request includes the following elements.
     * @return Result of the UpdateDomainContact operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws DuplicateRequestException
     *         The request is already in progress for the domain.
     * @throws TLDRulesViolationException
     *         The top-level domain does not support this operation.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed threshold for the account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.UpdateDomainContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/UpdateDomainContact"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDomainContactResult updateDomainContact(UpdateDomainContactRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDomainContact(request);
    }

    @SdkInternalApi
    final UpdateDomainContactResult executeUpdateDomainContact(UpdateDomainContactRequest updateDomainContactRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDomainContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDomainContactRequest> request = null;
        Response<UpdateDomainContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDomainContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDomainContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route 53 Domains");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDomainContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDomainContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDomainContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation updates the specified domain contact's privacy setting. When privacy protection is enabled,
     * contact information such as email address is replaced either with contact information for Amazon Registrar (for
     * .com, .net, and .org domains) or with contact information for our registrar associate, Gandi.
     * </p>
     * <p>
     * This operation affects only the contact information for the specified contact type (registrant, administrator, or
     * tech). If the request succeeds, Amazon Route 53 returns an operation ID that you can use with
     * <a>GetOperationDetail</a> to track the progress and completion of the action. If the request doesn't complete
     * successfully, the domain registrant will be notified by email.
     * </p>
     * 
     * @param updateDomainContactPrivacyRequest
     *        The UpdateDomainContactPrivacy request includes the following elements.
     * @return Result of the UpdateDomainContactPrivacy operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws DuplicateRequestException
     *         The request is already in progress for the domain.
     * @throws TLDRulesViolationException
     *         The top-level domain does not support this operation.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed threshold for the account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.UpdateDomainContactPrivacy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/UpdateDomainContactPrivacy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDomainContactPrivacyResult updateDomainContactPrivacy(UpdateDomainContactPrivacyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDomainContactPrivacy(request);
    }

    @SdkInternalApi
    final UpdateDomainContactPrivacyResult executeUpdateDomainContactPrivacy(UpdateDomainContactPrivacyRequest updateDomainContactPrivacyRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDomainContactPrivacyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDomainContactPrivacyRequest> request = null;
        Response<UpdateDomainContactPrivacyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDomainContactPrivacyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateDomainContactPrivacyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route 53 Domains");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDomainContactPrivacy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDomainContactPrivacyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateDomainContactPrivacyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation replaces the current set of name servers for the domain with the specified set of name servers. If
     * you use Amazon Route 53 as your DNS service, specify the four name servers in the delegation set for the hosted
     * zone for the domain.
     * </p>
     * <p>
     * If successful, this operation returns an operation ID that you can use to track the progress and completion of
     * the action. If the request is not completed successfully, the domain registrant will be notified by email.
     * </p>
     * 
     * @param updateDomainNameserversRequest
     *        Replaces the current set of name servers for the domain with the specified set of name servers. If you use
     *        Amazon Route 53 as your DNS service, specify the four name servers in the delegation set for the hosted
     *        zone for the domain.</p>
     *        <p>
     *        If successful, this operation returns an operation ID that you can use to track the progress and
     *        completion of the action. If the request is not completed successfully, the domain registrant will be
     *        notified by email.
     * @return Result of the UpdateDomainNameservers operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws DuplicateRequestException
     *         The request is already in progress for the domain.
     * @throws TLDRulesViolationException
     *         The top-level domain does not support this operation.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed threshold for the account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.UpdateDomainNameservers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/UpdateDomainNameservers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDomainNameserversResult updateDomainNameservers(UpdateDomainNameserversRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDomainNameservers(request);
    }

    @SdkInternalApi
    final UpdateDomainNameserversResult executeUpdateDomainNameservers(UpdateDomainNameserversRequest updateDomainNameserversRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDomainNameserversRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDomainNameserversRequest> request = null;
        Response<UpdateDomainNameserversResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDomainNameserversRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateDomainNameserversRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route 53 Domains");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDomainNameservers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDomainNameserversResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateDomainNameserversResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation adds or updates tags for a specified domain.
     * </p>
     * <p>
     * All tag operations are eventually consistent; subsequent operations might not immediately represent all issued
     * operations.
     * </p>
     * 
     * @param updateTagsForDomainRequest
     *        The UpdateTagsForDomainRequest includes the following elements.
     * @return Result of the UpdateTagsForDomain operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed threshold for the account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.UpdateTagsForDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/UpdateTagsForDomain"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateTagsForDomainResult updateTagsForDomain(UpdateTagsForDomainRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTagsForDomain(request);
    }

    @SdkInternalApi
    final UpdateTagsForDomainResult executeUpdateTagsForDomain(UpdateTagsForDomainRequest updateTagsForDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTagsForDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTagsForDomainRequest> request = null;
        Response<UpdateTagsForDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTagsForDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTagsForDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route 53 Domains");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTagsForDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTagsForDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTagsForDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns all the domain-related billing records for the current AWS account for a specified period
     * </p>
     * 
     * @param viewBillingRequest
     *        The ViewBilling request includes the following elements.
     * @return Result of the ViewBilling operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @sample AmazonRoute53Domains.ViewBilling
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/ViewBilling" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ViewBillingResult viewBilling(ViewBillingRequest request) {
        request = beforeClientExecution(request);
        return executeViewBilling(request);
    }

    @SdkInternalApi
    final ViewBillingResult executeViewBilling(ViewBillingRequest viewBillingRequest) {

        ExecutionContext executionContext = createExecutionContext(viewBillingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ViewBillingRequest> request = null;
        Response<ViewBillingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ViewBillingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(viewBillingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route 53 Domains");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ViewBilling");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ViewBillingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ViewBillingResultJsonUnmarshaller());
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
