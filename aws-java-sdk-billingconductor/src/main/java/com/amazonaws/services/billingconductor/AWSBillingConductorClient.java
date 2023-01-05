/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.billingconductor;

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

import com.amazonaws.services.billingconductor.AWSBillingConductorClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.billingconductor.model.*;
import com.amazonaws.services.billingconductor.model.transform.*;

/**
 * Client for accessing AWSBillingConductor. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Amazon Web Services Billing Conductor is a fully managed service that you can use to customize a <a
 * href="https://docs.aws.amazon.com/billingconductor/latest/userguide/understanding-eb.html#eb-other-definitions">pro
 * forma</a> version of your billing data each month, to accurately show or chargeback your end customers. Amazon Web
 * Services Billing Conductor doesn't change the way you're billed by Amazon Web Services each month by design. Instead,
 * it provides you with a mechanism to configure, generate, and display rates to certain customers over a given billing
 * period. You can also analyze the difference between the rates you apply to your accounting groupings relative to your
 * actual rates from Amazon Web Services. As a result of your Amazon Web Services Billing Conductor configuration, the
 * payer account can also see the custom rate applied on the billing details page of the <a
 * href="https://console.aws.amazon.com/billing">Amazon Web Services Billing console</a>, or configure a cost and usage
 * report per billing group.
 * </p>
 * <p>
 * This documentation shows how you can configure Amazon Web Services Billing Conductor using its API. For more
 * information about using the <a href="https://console.aws.amazon.com/billingconductor/">Amazon Web Services Billing
 * Conductor</a> user interface, see the <a
 * href="https://docs.aws.amazon.com/billingconductor/latest/userguide/what-is-billingconductor.html"> Amazon Web
 * Services Billing Conductor User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSBillingConductorClient extends AmazonWebServiceClient implements AWSBillingConductor {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSBillingConductor.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "billingconductor";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("application/json")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.billingconductor.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.billingconductor.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.billingconductor.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.billingconductor.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.billingconductor.model.transform.ServiceLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.billingconductor.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.billingconductor.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.billingconductor.model.AWSBillingConductorException.class));

    public static AWSBillingConductorClientBuilder builder() {
        return AWSBillingConductorClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWSBillingConductor using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSBillingConductorClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWSBillingConductor using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSBillingConductorClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("billingconductor.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/billingconductor/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/billingconductor/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Connects an array of account IDs in a consolidated billing family to a predefined billing group. The account IDs
     * must be a part of the consolidated billing family during the current month, and not already associated with
     * another billing group. The maximum number of accounts that can be associated in one call is 30.
     * </p>
     * 
     * @param associateAccountsRequest
     * @return Result of the AssociateAccounts operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws ServiceLimitExceededException
     *         The request would cause a service limit to exceed.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.AssociateAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/AssociateAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateAccountsResult associateAccounts(AssociateAccountsRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateAccounts(request);
    }

    @SdkInternalApi
    final AssociateAccountsResult executeAssociateAccounts(AssociateAccountsRequest associateAccountsRequest) {

        ExecutionContext executionContext = createExecutionContext(associateAccountsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateAccountsRequest> request = null;
        Response<AssociateAccountsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateAccountsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateAccountsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateAccounts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateAccountsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateAccountsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Connects an array of <code>PricingRuleArns</code> to a defined <code>PricingPlan</code>. The maximum number
     * <code>PricingRuleArn</code> that can be associated in one call is 30.
     * </p>
     * 
     * @param associatePricingRulesRequest
     * @return Result of the AssociatePricingRules operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws ServiceLimitExceededException
     *         The request would cause a service limit to exceed.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.AssociatePricingRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/AssociatePricingRules"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociatePricingRulesResult associatePricingRules(AssociatePricingRulesRequest request) {
        request = beforeClientExecution(request);
        return executeAssociatePricingRules(request);
    }

    @SdkInternalApi
    final AssociatePricingRulesResult executeAssociatePricingRules(AssociatePricingRulesRequest associatePricingRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(associatePricingRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociatePricingRulesRequest> request = null;
        Response<AssociatePricingRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociatePricingRulesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associatePricingRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociatePricingRules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociatePricingRulesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new AssociatePricingRulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a batch of resources to a percentage custom line item.
     * </p>
     * 
     * @param batchAssociateResourcesToCustomLineItemRequest
     * @return Result of the BatchAssociateResourcesToCustomLineItem operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws ServiceLimitExceededException
     *         The request would cause a service limit to exceed.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.BatchAssociateResourcesToCustomLineItem
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/BatchAssociateResourcesToCustomLineItem"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchAssociateResourcesToCustomLineItemResult batchAssociateResourcesToCustomLineItem(BatchAssociateResourcesToCustomLineItemRequest request) {
        request = beforeClientExecution(request);
        return executeBatchAssociateResourcesToCustomLineItem(request);
    }

    @SdkInternalApi
    final BatchAssociateResourcesToCustomLineItemResult executeBatchAssociateResourcesToCustomLineItem(
            BatchAssociateResourcesToCustomLineItemRequest batchAssociateResourcesToCustomLineItemRequest) {

        ExecutionContext executionContext = createExecutionContext(batchAssociateResourcesToCustomLineItemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchAssociateResourcesToCustomLineItemRequest> request = null;
        Response<BatchAssociateResourcesToCustomLineItemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchAssociateResourcesToCustomLineItemRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchAssociateResourcesToCustomLineItemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchAssociateResourcesToCustomLineItem");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchAssociateResourcesToCustomLineItemResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new BatchAssociateResourcesToCustomLineItemResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a batch of resources from a percentage custom line item.
     * </p>
     * 
     * @param batchDisassociateResourcesFromCustomLineItemRequest
     * @return Result of the BatchDisassociateResourcesFromCustomLineItem operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.BatchDisassociateResourcesFromCustomLineItem
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/BatchDisassociateResourcesFromCustomLineItem"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchDisassociateResourcesFromCustomLineItemResult batchDisassociateResourcesFromCustomLineItem(
            BatchDisassociateResourcesFromCustomLineItemRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDisassociateResourcesFromCustomLineItem(request);
    }

    @SdkInternalApi
    final BatchDisassociateResourcesFromCustomLineItemResult executeBatchDisassociateResourcesFromCustomLineItem(
            BatchDisassociateResourcesFromCustomLineItemRequest batchDisassociateResourcesFromCustomLineItemRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDisassociateResourcesFromCustomLineItemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDisassociateResourcesFromCustomLineItemRequest> request = null;
        Response<BatchDisassociateResourcesFromCustomLineItemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDisassociateResourcesFromCustomLineItemRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchDisassociateResourcesFromCustomLineItemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDisassociateResourcesFromCustomLineItem");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDisassociateResourcesFromCustomLineItemResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new BatchDisassociateResourcesFromCustomLineItemResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a billing group that resembles a consolidated billing family that Amazon Web Services charges, based off
     * of the predefined pricing plan computation.
     * </p>
     * 
     * @param createBillingGroupRequest
     * @return Result of the CreateBillingGroup operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws ServiceLimitExceededException
     *         The request would cause a service limit to exceed.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSBillingConductor.CreateBillingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/CreateBillingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateBillingGroupResult createBillingGroup(CreateBillingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBillingGroup(request);
    }

    @SdkInternalApi
    final CreateBillingGroupResult executeCreateBillingGroup(CreateBillingGroupRequest createBillingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createBillingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBillingGroupRequest> request = null;
        Response<CreateBillingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBillingGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBillingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBillingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBillingGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateBillingGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a custom line item that can be used to create a one-time fixed charge that can be applied to a single
     * billing group for the current or previous billing period. The one-time fixed charge is either a fee or discount.
     * </p>
     * 
     * @param createCustomLineItemRequest
     * @return Result of the CreateCustomLineItem operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws ServiceLimitExceededException
     *         The request would cause a service limit to exceed.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSBillingConductor.CreateCustomLineItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/CreateCustomLineItem"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateCustomLineItemResult createCustomLineItem(CreateCustomLineItemRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCustomLineItem(request);
    }

    @SdkInternalApi
    final CreateCustomLineItemResult executeCreateCustomLineItem(CreateCustomLineItemRequest createCustomLineItemRequest) {

        ExecutionContext executionContext = createExecutionContext(createCustomLineItemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCustomLineItemRequest> request = null;
        Response<CreateCustomLineItemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCustomLineItemRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createCustomLineItemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCustomLineItem");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCustomLineItemResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateCustomLineItemResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a pricing plan that is used for computing Amazon Web Services charges for billing groups.
     * </p>
     * 
     * @param createPricingPlanRequest
     * @return Result of the CreatePricingPlan operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws ServiceLimitExceededException
     *         The request would cause a service limit to exceed.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.CreatePricingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/CreatePricingPlan"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreatePricingPlanResult createPricingPlan(CreatePricingPlanRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePricingPlan(request);
    }

    @SdkInternalApi
    final CreatePricingPlanResult executeCreatePricingPlan(CreatePricingPlanRequest createPricingPlanRequest) {

        ExecutionContext executionContext = createExecutionContext(createPricingPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePricingPlanRequest> request = null;
        Response<CreatePricingPlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePricingPlanRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPricingPlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePricingPlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePricingPlanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePricingPlanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a pricing rule can be associated to a pricing plan, or a set of pricing plans.
     * </p>
     * 
     * @param createPricingRuleRequest
     * @return Result of the CreatePricingRule operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws ServiceLimitExceededException
     *         The request would cause a service limit to exceed.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSBillingConductor.CreatePricingRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/CreatePricingRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreatePricingRuleResult createPricingRule(CreatePricingRuleRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePricingRule(request);
    }

    @SdkInternalApi
    final CreatePricingRuleResult executeCreatePricingRule(CreatePricingRuleRequest createPricingRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(createPricingRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePricingRuleRequest> request = null;
        Response<CreatePricingRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePricingRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPricingRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePricingRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePricingRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePricingRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a billing group.
     * </p>
     * 
     * @param deleteBillingGroupRequest
     * @return Result of the DeleteBillingGroup operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSBillingConductor.DeleteBillingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/DeleteBillingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteBillingGroupResult deleteBillingGroup(DeleteBillingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBillingGroup(request);
    }

    @SdkInternalApi
    final DeleteBillingGroupResult executeDeleteBillingGroup(DeleteBillingGroupRequest deleteBillingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBillingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBillingGroupRequest> request = null;
        Response<DeleteBillingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBillingGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBillingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBillingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBillingGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteBillingGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the custom line item identified by the given ARN in the current, or previous billing period.
     * </p>
     * 
     * @param deleteCustomLineItemRequest
     * @return Result of the DeleteCustomLineItem operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSBillingConductor.DeleteCustomLineItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/DeleteCustomLineItem"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteCustomLineItemResult deleteCustomLineItem(DeleteCustomLineItemRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCustomLineItem(request);
    }

    @SdkInternalApi
    final DeleteCustomLineItemResult executeDeleteCustomLineItem(DeleteCustomLineItemRequest deleteCustomLineItemRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCustomLineItemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCustomLineItemRequest> request = null;
        Response<DeleteCustomLineItemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCustomLineItemRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCustomLineItemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCustomLineItem");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCustomLineItemResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteCustomLineItemResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a pricing plan. The pricing plan must not be associated with any billing groups to delete successfully.
     * </p>
     * 
     * @param deletePricingPlanRequest
     * @return Result of the DeletePricingPlan operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSBillingConductor.DeletePricingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/DeletePricingPlan"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeletePricingPlanResult deletePricingPlan(DeletePricingPlanRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePricingPlan(request);
    }

    @SdkInternalApi
    final DeletePricingPlanResult executeDeletePricingPlan(DeletePricingPlanRequest deletePricingPlanRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePricingPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePricingPlanRequest> request = null;
        Response<DeletePricingPlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePricingPlanRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePricingPlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePricingPlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePricingPlanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePricingPlanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the pricing rule that's identified by the input Amazon Resource Name (ARN).
     * </p>
     * 
     * @param deletePricingRuleRequest
     * @return Result of the DeletePricingRule operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSBillingConductor.DeletePricingRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/DeletePricingRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeletePricingRuleResult deletePricingRule(DeletePricingRuleRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePricingRule(request);
    }

    @SdkInternalApi
    final DeletePricingRuleResult executeDeletePricingRule(DeletePricingRuleRequest deletePricingRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePricingRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePricingRuleRequest> request = null;
        Response<DeletePricingRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePricingRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePricingRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePricingRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePricingRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePricingRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified list of account IDs from the given billing group.
     * </p>
     * 
     * @param disassociateAccountsRequest
     * @return Result of the DisassociateAccounts operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.DisassociateAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/DisassociateAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateAccountsResult disassociateAccounts(DisassociateAccountsRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateAccounts(request);
    }

    @SdkInternalApi
    final DisassociateAccountsResult executeDisassociateAccounts(DisassociateAccountsRequest disassociateAccountsRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateAccountsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateAccountsRequest> request = null;
        Response<DisassociateAccountsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateAccountsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateAccountsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateAccounts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateAccountsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisassociateAccountsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a list of pricing rules from a pricing plan.
     * </p>
     * 
     * @param disassociatePricingRulesRequest
     * @return Result of the DisassociatePricingRules operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.DisassociatePricingRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/DisassociatePricingRules"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociatePricingRulesResult disassociatePricingRules(DisassociatePricingRulesRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociatePricingRules(request);
    }

    @SdkInternalApi
    final DisassociatePricingRulesResult executeDisassociatePricingRules(DisassociatePricingRulesRequest disassociatePricingRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociatePricingRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociatePricingRulesRequest> request = null;
        Response<DisassociatePricingRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociatePricingRulesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociatePricingRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociatePricingRules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociatePricingRulesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociatePricingRulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This is a paginated call to list linked accounts that are linked to the payer account for the specified time
     * period. If no information is provided, the current billing period is used. The response will optionally include
     * the billing group that's associated with the linked account.
     * </p>
     * 
     * @param listAccountAssociationsRequest
     * @return Result of the ListAccountAssociations operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.ListAccountAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListAccountAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAccountAssociationsResult listAccountAssociations(ListAccountAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeListAccountAssociations(request);
    }

    @SdkInternalApi
    final ListAccountAssociationsResult executeListAccountAssociations(ListAccountAssociationsRequest listAccountAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAccountAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccountAssociationsRequest> request = null;
        Response<ListAccountAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccountAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAccountAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccountAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAccountAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAccountAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A paginated call to retrieve a summary report of actual Amazon Web Services charges and the calculated Amazon Web
     * Services charges based on the associated pricing plan of a billing group.
     * </p>
     * 
     * @param listBillingGroupCostReportsRequest
     * @return Result of the ListBillingGroupCostReports operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.ListBillingGroupCostReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListBillingGroupCostReports"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListBillingGroupCostReportsResult listBillingGroupCostReports(ListBillingGroupCostReportsRequest request) {
        request = beforeClientExecution(request);
        return executeListBillingGroupCostReports(request);
    }

    @SdkInternalApi
    final ListBillingGroupCostReportsResult executeListBillingGroupCostReports(ListBillingGroupCostReportsRequest listBillingGroupCostReportsRequest) {

        ExecutionContext executionContext = createExecutionContext(listBillingGroupCostReportsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBillingGroupCostReportsRequest> request = null;
        Response<ListBillingGroupCostReportsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBillingGroupCostReportsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listBillingGroupCostReportsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBillingGroupCostReports");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBillingGroupCostReportsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListBillingGroupCostReportsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A paginated call to retrieve a list of billing groups for the given billing period. If you don't provide a
     * billing group, the current billing period is used.
     * </p>
     * 
     * @param listBillingGroupsRequest
     * @return Result of the ListBillingGroups operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.ListBillingGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListBillingGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListBillingGroupsResult listBillingGroups(ListBillingGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListBillingGroups(request);
    }

    @SdkInternalApi
    final ListBillingGroupsResult executeListBillingGroups(ListBillingGroupsRequest listBillingGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listBillingGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBillingGroupsRequest> request = null;
        Response<ListBillingGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBillingGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBillingGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBillingGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBillingGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBillingGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A paginated call to get a list of all custom line item versions.
     * </p>
     * 
     * @param listCustomLineItemVersionsRequest
     * @return Result of the ListCustomLineItemVersions operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSBillingConductor.ListCustomLineItemVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListCustomLineItemVersions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCustomLineItemVersionsResult listCustomLineItemVersions(ListCustomLineItemVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListCustomLineItemVersions(request);
    }

    @SdkInternalApi
    final ListCustomLineItemVersionsResult executeListCustomLineItemVersions(ListCustomLineItemVersionsRequest listCustomLineItemVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCustomLineItemVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCustomLineItemVersionsRequest> request = null;
        Response<ListCustomLineItemVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCustomLineItemVersionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listCustomLineItemVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCustomLineItemVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCustomLineItemVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListCustomLineItemVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A paginated call to get a list of all custom line items (FFLIs) for the given billing period. If you don't
     * provide a billing period, the current billing period is used.
     * </p>
     * 
     * @param listCustomLineItemsRequest
     * @return Result of the ListCustomLineItems operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.ListCustomLineItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListCustomLineItems"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCustomLineItemsResult listCustomLineItems(ListCustomLineItemsRequest request) {
        request = beforeClientExecution(request);
        return executeListCustomLineItems(request);
    }

    @SdkInternalApi
    final ListCustomLineItemsResult executeListCustomLineItems(ListCustomLineItemsRequest listCustomLineItemsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCustomLineItemsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCustomLineItemsRequest> request = null;
        Response<ListCustomLineItemsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCustomLineItemsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCustomLineItemsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCustomLineItems");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCustomLineItemsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCustomLineItemsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A paginated call to get pricing plans for the given billing period. If you don't provide a billing period, the
     * current billing period is used.
     * </p>
     * 
     * @param listPricingPlansRequest
     * @return Result of the ListPricingPlans operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSBillingConductor.ListPricingPlans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListPricingPlans"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPricingPlansResult listPricingPlans(ListPricingPlansRequest request) {
        request = beforeClientExecution(request);
        return executeListPricingPlans(request);
    }

    @SdkInternalApi
    final ListPricingPlansResult executeListPricingPlans(ListPricingPlansRequest listPricingPlansRequest) {

        ExecutionContext executionContext = createExecutionContext(listPricingPlansRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPricingPlansRequest> request = null;
        Response<ListPricingPlansResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPricingPlansRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPricingPlansRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPricingPlans");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPricingPlansResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPricingPlansResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A list of the pricing plans that are associated with a pricing rule.
     * </p>
     * 
     * @param listPricingPlansAssociatedWithPricingRuleRequest
     * @return Result of the ListPricingPlansAssociatedWithPricingRule operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.ListPricingPlansAssociatedWithPricingRule
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListPricingPlansAssociatedWithPricingRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPricingPlansAssociatedWithPricingRuleResult listPricingPlansAssociatedWithPricingRule(ListPricingPlansAssociatedWithPricingRuleRequest request) {
        request = beforeClientExecution(request);
        return executeListPricingPlansAssociatedWithPricingRule(request);
    }

    @SdkInternalApi
    final ListPricingPlansAssociatedWithPricingRuleResult executeListPricingPlansAssociatedWithPricingRule(
            ListPricingPlansAssociatedWithPricingRuleRequest listPricingPlansAssociatedWithPricingRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(listPricingPlansAssociatedWithPricingRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPricingPlansAssociatedWithPricingRuleRequest> request = null;
        Response<ListPricingPlansAssociatedWithPricingRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPricingPlansAssociatedWithPricingRuleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listPricingPlansAssociatedWithPricingRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPricingPlansAssociatedWithPricingRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPricingPlansAssociatedWithPricingRuleResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListPricingPlansAssociatedWithPricingRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a pricing rule that can be associated to a pricing plan, or set of pricing plans.
     * </p>
     * 
     * @param listPricingRulesRequest
     * @return Result of the ListPricingRules operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSBillingConductor.ListPricingRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListPricingRules"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPricingRulesResult listPricingRules(ListPricingRulesRequest request) {
        request = beforeClientExecution(request);
        return executeListPricingRules(request);
    }

    @SdkInternalApi
    final ListPricingRulesResult executeListPricingRules(ListPricingRulesRequest listPricingRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(listPricingRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPricingRulesRequest> request = null;
        Response<ListPricingRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPricingRulesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPricingRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPricingRules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPricingRulesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPricingRulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the pricing rules that are associated with a pricing plan.
     * </p>
     * 
     * @param listPricingRulesAssociatedToPricingPlanRequest
     * @return Result of the ListPricingRulesAssociatedToPricingPlan operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.ListPricingRulesAssociatedToPricingPlan
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListPricingRulesAssociatedToPricingPlan"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPricingRulesAssociatedToPricingPlanResult listPricingRulesAssociatedToPricingPlan(ListPricingRulesAssociatedToPricingPlanRequest request) {
        request = beforeClientExecution(request);
        return executeListPricingRulesAssociatedToPricingPlan(request);
    }

    @SdkInternalApi
    final ListPricingRulesAssociatedToPricingPlanResult executeListPricingRulesAssociatedToPricingPlan(
            ListPricingRulesAssociatedToPricingPlanRequest listPricingRulesAssociatedToPricingPlanRequest) {

        ExecutionContext executionContext = createExecutionContext(listPricingRulesAssociatedToPricingPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPricingRulesAssociatedToPricingPlanRequest> request = null;
        Response<ListPricingRulesAssociatedToPricingPlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPricingRulesAssociatedToPricingPlanRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listPricingRulesAssociatedToPricingPlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPricingRulesAssociatedToPricingPlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPricingRulesAssociatedToPricingPlanResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListPricingRulesAssociatedToPricingPlanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the resources that are associated to a custom line item.
     * </p>
     * 
     * @param listResourcesAssociatedToCustomLineItemRequest
     * @return Result of the ListResourcesAssociatedToCustomLineItem operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.ListResourcesAssociatedToCustomLineItem
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListResourcesAssociatedToCustomLineItem"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListResourcesAssociatedToCustomLineItemResult listResourcesAssociatedToCustomLineItem(ListResourcesAssociatedToCustomLineItemRequest request) {
        request = beforeClientExecution(request);
        return executeListResourcesAssociatedToCustomLineItem(request);
    }

    @SdkInternalApi
    final ListResourcesAssociatedToCustomLineItemResult executeListResourcesAssociatedToCustomLineItem(
            ListResourcesAssociatedToCustomLineItemRequest listResourcesAssociatedToCustomLineItemRequest) {

        ExecutionContext executionContext = createExecutionContext(listResourcesAssociatedToCustomLineItemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResourcesAssociatedToCustomLineItemRequest> request = null;
        Response<ListResourcesAssociatedToCustomLineItemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResourcesAssociatedToCustomLineItemRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listResourcesAssociatedToCustomLineItemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListResourcesAssociatedToCustomLineItem");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListResourcesAssociatedToCustomLineItemResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListResourcesAssociatedToCustomLineItemResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A list the tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
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
     * Associates the specified tags to a resource with the specified <code>resourceArn</code>. If existing tags on a
     * resource are not specified in the request parameters, they are not changed.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/TagResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
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
     * Deletes specified tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/UntagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
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
     * This updates an existing billing group.
     * </p>
     * 
     * @param updateBillingGroupRequest
     * @return Result of the UpdateBillingGroup operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.UpdateBillingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/UpdateBillingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateBillingGroupResult updateBillingGroup(UpdateBillingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBillingGroup(request);
    }

    @SdkInternalApi
    final UpdateBillingGroupResult executeUpdateBillingGroup(UpdateBillingGroupRequest updateBillingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBillingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBillingGroupRequest> request = null;
        Response<UpdateBillingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBillingGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateBillingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateBillingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBillingGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateBillingGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update an existing custom line item in the current or previous billing period.
     * </p>
     * 
     * @param updateCustomLineItemRequest
     * @return Result of the UpdateCustomLineItem operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.UpdateCustomLineItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/UpdateCustomLineItem"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateCustomLineItemResult updateCustomLineItem(UpdateCustomLineItemRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCustomLineItem(request);
    }

    @SdkInternalApi
    final UpdateCustomLineItemResult executeUpdateCustomLineItem(UpdateCustomLineItemRequest updateCustomLineItemRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCustomLineItemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCustomLineItemRequest> request = null;
        Response<UpdateCustomLineItemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCustomLineItemRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateCustomLineItemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCustomLineItem");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCustomLineItemResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateCustomLineItemResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This updates an existing pricing plan.
     * </p>
     * 
     * @param updatePricingPlanRequest
     * @return Result of the UpdatePricingPlan operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.UpdatePricingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/UpdatePricingPlan"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdatePricingPlanResult updatePricingPlan(UpdatePricingPlanRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePricingPlan(request);
    }

    @SdkInternalApi
    final UpdatePricingPlanResult executeUpdatePricingPlan(UpdatePricingPlanRequest updatePricingPlanRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePricingPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePricingPlanRequest> request = null;
        Response<UpdatePricingPlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePricingPlanRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePricingPlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePricingPlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePricingPlanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePricingPlanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing pricing rule.
     * </p>
     * 
     * @param updatePricingRuleRequest
     * @return Result of the UpdatePricingRule operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         You can cause an inconsistent state by updating or deleting a resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input doesn't match with the constraints specified by Amazon Web Services services.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that doesn't exist.
     * @sample AWSBillingConductor.UpdatePricingRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/UpdatePricingRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdatePricingRuleResult updatePricingRule(UpdatePricingRuleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePricingRule(request);
    }

    @SdkInternalApi
    final UpdatePricingRuleResult executeUpdatePricingRule(UpdatePricingRuleRequest updatePricingRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePricingRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePricingRuleRequest> request = null;
        Response<UpdatePricingRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePricingRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePricingRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "billingconductor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePricingRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePricingRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePricingRuleResultJsonUnmarshaller());
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
