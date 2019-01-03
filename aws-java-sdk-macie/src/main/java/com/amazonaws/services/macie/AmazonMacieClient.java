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
package com.amazonaws.services.macie;

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

import com.amazonaws.services.macie.AmazonMacieClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.macie.model.*;
import com.amazonaws.services.macie.model.transform.*;

/**
 * Client for accessing Amazon Macie. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <fullname>Amazon Macie</fullname>
 * <p>
 * Amazon Macie is a security service that uses machine learning to automatically discover, classify, and protect
 * sensitive data in AWS. Macie recognizes sensitive data such as personally identifiable information (PII) or
 * intellectual property, and provides you with dashboards and alerts that give visibility into how this data is being
 * accessed or moved. For more information, see the <a
 * href="https://docs.aws.amazon.com/macie/latest/userguide/what-is-macie.html">Macie User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonMacieClient extends AmazonWebServiceClient implements AmazonMacie {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonMacie.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "macie";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withModeledClass(
                                    com.amazonaws.services.macie.model.AccessDeniedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInputException").withModeledClass(
                                    com.amazonaws.services.macie.model.InvalidInputException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalException").withModeledClass(
                                    com.amazonaws.services.macie.model.InternalException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.macie.model.LimitExceededException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.macie.model.AmazonMacieException.class));

    public static AmazonMacieClientBuilder builder() {
        return AmazonMacieClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Macie using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonMacieClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Macie using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonMacieClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("macie.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/macie/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/macie/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates a specified AWS account with Amazon Macie as a member account.
     * </p>
     * 
     * @param associateMemberAccountRequest
     * @return Result of the AssociateMemberAccount operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws InternalException
     *         Internal server error.
     * @sample AmazonMacie.AssociateMemberAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/AssociateMemberAccount" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AssociateMemberAccountResult associateMemberAccount(AssociateMemberAccountRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateMemberAccount(request);
    }

    @SdkInternalApi
    final AssociateMemberAccountResult executeAssociateMemberAccount(AssociateMemberAccountRequest associateMemberAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(associateMemberAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateMemberAccountRequest> request = null;
        Response<AssociateMemberAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateMemberAccountRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateMemberAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateMemberAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateMemberAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateMemberAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates specified S3 resources with Amazon Macie for monitoring and data classification. If memberAccountId
     * isn't specified, the action associates specified S3 resources with Macie for the current master account. If
     * memberAccountId is specified, the action associates specified S3 resources with Macie for the specified member
     * account.
     * </p>
     * 
     * @param associateS3ResourcesRequest
     * @return Result of the AssociateS3Resources operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws InternalException
     *         Internal server error.
     * @sample AmazonMacie.AssociateS3Resources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/AssociateS3Resources" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AssociateS3ResourcesResult associateS3Resources(AssociateS3ResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateS3Resources(request);
    }

    @SdkInternalApi
    final AssociateS3ResourcesResult executeAssociateS3Resources(AssociateS3ResourcesRequest associateS3ResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(associateS3ResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateS3ResourcesRequest> request = null;
        Response<AssociateS3ResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateS3ResourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateS3ResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateS3Resources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateS3ResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateS3ResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified member account from Amazon Macie.
     * </p>
     * 
     * @param disassociateMemberAccountRequest
     * @return Result of the DisassociateMemberAccount operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InternalException
     *         Internal server error.
     * @sample AmazonMacie.DisassociateMemberAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/DisassociateMemberAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateMemberAccountResult disassociateMemberAccount(DisassociateMemberAccountRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateMemberAccount(request);
    }

    @SdkInternalApi
    final DisassociateMemberAccountResult executeDisassociateMemberAccount(DisassociateMemberAccountRequest disassociateMemberAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateMemberAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateMemberAccountRequest> request = null;
        Response<DisassociateMemberAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateMemberAccountRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateMemberAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateMemberAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateMemberAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateMemberAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes specified S3 resources from being monitored by Amazon Macie. If memberAccountId isn't specified, the
     * action removes specified S3 resources from Macie for the current master account. If memberAccountId is specified,
     * the action removes specified S3 resources from Macie for the specified member account.
     * </p>
     * 
     * @param disassociateS3ResourcesRequest
     * @return Result of the DisassociateS3Resources operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws InternalException
     *         Internal server error.
     * @sample AmazonMacie.DisassociateS3Resources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/DisassociateS3Resources" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DisassociateS3ResourcesResult disassociateS3Resources(DisassociateS3ResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateS3Resources(request);
    }

    @SdkInternalApi
    final DisassociateS3ResourcesResult executeDisassociateS3Resources(DisassociateS3ResourcesRequest disassociateS3ResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateS3ResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateS3ResourcesRequest> request = null;
        Response<DisassociateS3ResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateS3ResourcesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateS3ResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateS3Resources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateS3ResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateS3ResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all Amazon Macie member accounts for the current Amazon Macie master account.
     * </p>
     * 
     * @param listMemberAccountsRequest
     * @return Result of the ListMemberAccounts operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonMacie.ListMemberAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/ListMemberAccounts" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListMemberAccountsResult listMemberAccounts(ListMemberAccountsRequest request) {
        request = beforeClientExecution(request);
        return executeListMemberAccounts(request);
    }

    @SdkInternalApi
    final ListMemberAccountsResult executeListMemberAccounts(ListMemberAccountsRequest listMemberAccountsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMemberAccountsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMemberAccountsRequest> request = null;
        Response<ListMemberAccountsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMemberAccountsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMemberAccountsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMemberAccounts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMemberAccountsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListMemberAccountsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the S3 resources associated with Amazon Macie. If memberAccountId isn't specified, the action lists the
     * S3 resources associated with Amazon Macie for the current master account. If memberAccountId is specified, the
     * action lists the S3 resources associated with Amazon Macie for the specified member account.
     * </p>
     * 
     * @param listS3ResourcesRequest
     * @return Result of the ListS3Resources operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws InternalException
     *         Internal server error.
     * @sample AmazonMacie.ListS3Resources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/ListS3Resources" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListS3ResourcesResult listS3Resources(ListS3ResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListS3Resources(request);
    }

    @SdkInternalApi
    final ListS3ResourcesResult executeListS3Resources(ListS3ResourcesRequest listS3ResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listS3ResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListS3ResourcesRequest> request = null;
        Response<ListS3ResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListS3ResourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listS3ResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListS3Resources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListS3ResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListS3ResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the classification types for the specified S3 resources. If memberAccountId isn't specified, the action
     * updates the classification types of the S3 resources associated with Amazon Macie for the current master account.
     * If memberAccountId is specified, the action updates the classification types of the S3 resources associated with
     * Amazon Macie for the specified member account.
     * </p>
     * 
     * @param updateS3ResourcesRequest
     * @return Result of the UpdateS3Resources operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws InternalException
     *         Internal server error.
     * @sample AmazonMacie.UpdateS3Resources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/UpdateS3Resources" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateS3ResourcesResult updateS3Resources(UpdateS3ResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateS3Resources(request);
    }

    @SdkInternalApi
    final UpdateS3ResourcesResult executeUpdateS3Resources(UpdateS3ResourcesRequest updateS3ResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(updateS3ResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateS3ResourcesRequest> request = null;
        Response<UpdateS3ResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateS3ResourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateS3ResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateS3Resources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateS3ResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateS3ResourcesResultJsonUnmarshaller());
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
