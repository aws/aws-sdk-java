/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.marketplaceagreement;

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

import com.amazonaws.services.marketplaceagreement.AWSMarketplaceAgreementClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.marketplaceagreement.model.*;

import com.amazonaws.services.marketplaceagreement.model.transform.*;

/**
 * Client for accessing Agreement Service. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * AWS Marketplace is a curated digital catalog that customers can use to find, buy, deploy, and manage third-party
 * software, data, and services to build solutions and run their businesses. The AWS Marketplace Agreement Service
 * provides an API interface that helps AWS Marketplace sellers manage their product-related agreements, including
 * listing, searching, and filtering agreements.
 * </p>
 * <p>
 * To manage agreements in AWS Marketplace, you must ensure that your AWS Identity and Access Management (IAM) policies
 * and roles are set up. The user must have the required policies/permissions that allow them to carry out the actions
 * in AWS:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>DescribeAgreement</code> – Grants permission to users to obtain detailed meta data about any of their
 * agreements.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>GetAgreementTerms</code> – Grants permission to users to obtain details about the terms of an agreement.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>SearchAgreements</code> – Grants permission to users to search through all their agreements.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMarketplaceAgreementClient extends AmazonWebServiceClient implements AWSMarketplaceAgreement {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSMarketplaceAgreement.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "aws-marketplace";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.0")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.marketplaceagreement.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.marketplaceagreement.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.marketplaceagreement.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.marketplaceagreement.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.marketplaceagreement.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.marketplaceagreement.model.AWSMarketplaceAgreementException.class));

    public static AWSMarketplaceAgreementClientBuilder builder() {
        return AWSMarketplaceAgreementClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Agreement Service using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMarketplaceAgreementClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Agreement Service using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMarketplaceAgreementClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("agreement-marketplace.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/marketplaceagreement/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/marketplaceagreement/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Provides details about an agreement, such as the proposer, acceptor, start date, and end date.
     * </p>
     * 
     * @param describeAgreementRequest
     * @return Result of the DescribeAgreement operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AWSMarketplaceAgreement.DescribeAgreement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/DescribeAgreement"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAgreementResult describeAgreement(DescribeAgreementRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAgreement(request);
    }

    @SdkInternalApi
    final DescribeAgreementResult executeDescribeAgreement(DescribeAgreementRequest describeAgreementRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAgreementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAgreementRequest> request = null;
        Response<DescribeAgreementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAgreementRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAgreementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Marketplace Agreement");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAgreement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAgreementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAgreementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Obtains details about the terms in an agreement that you participated in as proposer or acceptor.
     * </p>
     * <p>
     * The details include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TermType</code> – The type of term, such as <code>LegalTerm</code>, <code>RenewalTerm</code>, or
     * <code>ConfigurableUpfrontPricingTerm</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TermID</code> – The ID of the particular term, which is common between offer and agreement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TermPayload</code> – The key information contained in the term, such as the EULA for <code>LegalTerm</code>
     * or pricing and dimensions for various pricing terms, such as <code>ConfigurableUpfrontPricingTerm</code> or
     * <code>UsageBasedPricingTerm</code>.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>Configuration</code> – The buyer/acceptor's selection at the time of agreement creation, such as the number
     * of units purchased for a dimension or setting the <code>EnableAutoRenew</code> flag.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAgreementTermsRequest
     * @return Result of the GetAgreementTerms operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AWSMarketplaceAgreement.GetAgreementTerms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/GetAgreementTerms"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAgreementTermsResult getAgreementTerms(GetAgreementTermsRequest request) {
        request = beforeClientExecution(request);
        return executeGetAgreementTerms(request);
    }

    @SdkInternalApi
    final GetAgreementTermsResult executeGetAgreementTerms(GetAgreementTermsRequest getAgreementTermsRequest) {

        ExecutionContext executionContext = createExecutionContext(getAgreementTermsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAgreementTermsRequest> request = null;
        Response<GetAgreementTermsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAgreementTermsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAgreementTermsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Marketplace Agreement");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAgreementTerms");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAgreementTermsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAgreementTermsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches across all agreements that a proposer or an acceptor has in AWS Marketplace. The search returns a list
     * of agreements with basic agreement information.
     * </p>
     * <p>
     * The following filter combinations are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PartyType</code> as <code>Proposer</code> + <code>AgreementType</code> + <code>ResourceIdentifier</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> as <code>Proposer</code> + <code>AgreementType</code> + <code>OfferId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> as <code>Proposer</code> + <code>AgreementType</code> + <code>AcceptorAccountId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> as <code>Proposer</code> + <code>AgreementType</code> + <code>Status</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> as <code>Proposer</code> + <code>AgreementType</code> + <code>ResourceIdentifier</code> +
     * <code>Status</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> as <code>Proposer</code> + <code>AgreementType</code> + <code>OfferId</code> +
     * <code>Status</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> as <code>Proposer</code> + <code>AgreementType</code> + <code>AcceptorAccountId</code> +
     * <code>Status</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> as <code>Proposer</code> + <code>AgreementType</code> + <code>ResourceType</code> +
     * <code>Status</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> as <code>Proposer</code> + <code>AgreementType</code> + <code>AcceptorAccountId</code> +
     * <code>ResourceType</code> + <code>Status</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> as <code>Proposer</code> + <code>AgreementType</code> + <code>AcceptorAccountId</code> +
     * <code>OfferId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> as <code>Proposer</code> + <code>AgreementType</code> + <code>AcceptorAccountId</code> +
     * <code>OfferId</code> + <code>Status</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> as <code>Proposer</code> + <code>AgreementType</code> + <code>AcceptorAccountId</code> +
     * <code>ResourceIdentifier</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> as <code>Proposer</code> + <code>AgreementType</code> + <code>AcceptorAccountId</code> +
     * <code>ResourceIdentifier</code> + <code>Status</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> as <code>Proposer</code> + <code>AgreementType</code> + <code>AcceptorAccountId</code> +
     * <code>ResourceType</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param searchAgreementsRequest
     * @return Result of the SearchAgreements operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AWSMarketplaceAgreement.SearchAgreements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/SearchAgreements"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchAgreementsResult searchAgreements(SearchAgreementsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchAgreements(request);
    }

    @SdkInternalApi
    final SearchAgreementsResult executeSearchAgreements(SearchAgreementsRequest searchAgreementsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchAgreementsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchAgreementsRequest> request = null;
        Response<SearchAgreementsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchAgreementsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchAgreementsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Marketplace Agreement");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchAgreements");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchAgreementsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchAgreementsResultJsonUnmarshaller());
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

    @Override
    public void shutdown() {
        super.shutdown();
    }

}
