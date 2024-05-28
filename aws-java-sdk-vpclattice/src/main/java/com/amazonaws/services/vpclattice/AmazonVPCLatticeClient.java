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
package com.amazonaws.services.vpclattice;

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

import com.amazonaws.services.vpclattice.AmazonVPCLatticeClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.vpclattice.model.*;

import com.amazonaws.services.vpclattice.model.transform.*;

/**
 * Client for accessing Amazon VPC Lattice. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Amazon VPC Lattice is a fully managed application networking service that you use to connect, secure, and monitor all
 * of your services across multiple accounts and virtual private clouds (VPCs). Amazon VPC Lattice interconnects your
 * microservices and legacy services within a logical boundary, so that you can discover and manage them more
 * efficiently. For more information, see the <a href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/">Amazon VPC
 * Lattice User Guide</a>
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonVPCLatticeClient extends AmazonWebServiceClient implements AmazonVPCLattice {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonVPCLattice.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "vpc-lattice";

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
                                    com.amazonaws.services.vpclattice.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.vpclattice.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.vpclattice.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.vpclattice.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.vpclattice.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.vpclattice.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.vpclattice.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.vpclattice.model.AmazonVPCLatticeException.class));

    public static AmazonVPCLatticeClientBuilder builder() {
        return AmazonVPCLatticeClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon VPC Lattice using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonVPCLatticeClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon VPC Lattice using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonVPCLatticeClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("vpc-lattice.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/vpclattice/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/vpclattice/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Updates the listener rules in a batch. You can use this operation to change the priority of listener rules. This
     * can be useful when bulk updating or swapping rule priority.
     * </p>
     * <p>
     * <b>Required permissions:</b> <code>vpc-lattice:UpdateRule</code>
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/security_iam_service-with-iam.html">How Amazon VPC
     * Lattice works with IAM</a> in the <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param batchUpdateRuleRequest
     * @return Result of the BatchUpdateRule operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.BatchUpdateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/BatchUpdateRule" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public BatchUpdateRuleResult batchUpdateRule(BatchUpdateRuleRequest request) {
        request = beforeClientExecution(request);
        return executeBatchUpdateRule(request);
    }

    @SdkInternalApi
    final BatchUpdateRuleResult executeBatchUpdateRule(BatchUpdateRuleRequest batchUpdateRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(batchUpdateRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchUpdateRuleRequest> request = null;
        Response<BatchUpdateRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchUpdateRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchUpdateRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchUpdateRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchUpdateRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchUpdateRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables access logs to be sent to Amazon CloudWatch, Amazon S3, and Amazon Kinesis Data Firehose. The service
     * network owner can use the access logs to audit the services in the network. The service network owner can only
     * see access logs from clients and services that are associated with their service network. Access log entries
     * represent traffic originated from VPCs associated with that network. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/monitoring-access-logs.html">Access logs</a> in the
     * <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param createAccessLogSubscriptionRequest
     * @return Result of the CreateAccessLogSubscription operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.CreateAccessLogSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateAccessLogSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAccessLogSubscriptionResult createAccessLogSubscription(CreateAccessLogSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAccessLogSubscription(request);
    }

    @SdkInternalApi
    final CreateAccessLogSubscriptionResult executeCreateAccessLogSubscription(CreateAccessLogSubscriptionRequest createAccessLogSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(createAccessLogSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAccessLogSubscriptionRequest> request = null;
        Response<CreateAccessLogSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAccessLogSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createAccessLogSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAccessLogSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAccessLogSubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateAccessLogSubscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a listener for a service. Before you start using your Amazon VPC Lattice service, you must add one or
     * more listeners. A listener is a process that checks for connection requests to your services. For more
     * information, see <a href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/listeners.html">Listeners</a> in the
     * <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param createListenerRequest
     * @return Result of the CreateListener operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.CreateListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateListener" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateListenerResult createListener(CreateListenerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateListener(request);
    }

    @SdkInternalApi
    final CreateListenerResult executeCreateListener(CreateListenerRequest createListenerRequest) {

        ExecutionContext executionContext = createExecutionContext(createListenerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateListenerRequest> request = null;
        Response<CreateListenerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateListenerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createListenerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateListener");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateListenerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateListenerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a listener rule. Each listener has a default rule for checking connection requests, but you can define
     * additional rules. Each rule consists of a priority, one or more actions, and one or more conditions. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/listeners.html#listener-rules">Listener rules</a> in the
     * <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param createRuleRequest
     * @return Result of the CreateRule operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.CreateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateRuleResult createRule(CreateRuleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRule(request);
    }

    @SdkInternalApi
    final CreateRuleResult executeCreateRule(CreateRuleRequest createRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(createRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRuleRequest> request = null;
        Response<CreateRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRuleResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a service. A service is any software application that can run on instances containers, or serverless
     * functions within an account or virtual private cloud (VPC).
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/services.html">Services</a>
     * in the <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param createServiceRequest
     * @return Result of the CreateService operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.CreateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateService" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateServiceResult createService(CreateServiceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateService(request);
    }

    @SdkInternalApi
    final CreateServiceResult executeCreateService(CreateServiceRequest createServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(createServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateServiceRequest> request = null;
        Response<CreateServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateServiceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateServiceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a service network. A service network is a logical boundary for a collection of services. You can
     * associate services and VPCs with a service network.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/service-networks.html">Service networks</a> in the
     * <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param createServiceNetworkRequest
     * @return Result of the CreateServiceNetwork operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.CreateServiceNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateServiceNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateServiceNetworkResult createServiceNetwork(CreateServiceNetworkRequest request) {
        request = beforeClientExecution(request);
        return executeCreateServiceNetwork(request);
    }

    @SdkInternalApi
    final CreateServiceNetworkResult executeCreateServiceNetwork(CreateServiceNetworkRequest createServiceNetworkRequest) {

        ExecutionContext executionContext = createExecutionContext(createServiceNetworkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateServiceNetworkRequest> request = null;
        Response<CreateServiceNetworkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateServiceNetworkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createServiceNetworkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateServiceNetwork");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateServiceNetworkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateServiceNetworkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a service with a service network. For more information, see <a href=
     * "https://docs.aws.amazon.com/vpc-lattice/latest/ug/service-network-associations.html#service-network-service-associations"
     * >Manage service associations</a> in the <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * <p>
     * You can't use this operation if the service and service network are already associated or if there is a
     * disassociation or deletion in progress. If the association fails, you can retry the operation by deleting the
     * association and recreating it.
     * </p>
     * <p>
     * You cannot associate a service and service network that are shared with a caller. The caller must own either the
     * service or the service network.
     * </p>
     * <p>
     * As a result of this operation, the association is created in the service network account and the association
     * owner account.
     * </p>
     * 
     * @param createServiceNetworkServiceAssociationRequest
     * @return Result of the CreateServiceNetworkServiceAssociation operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.CreateServiceNetworkServiceAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateServiceNetworkServiceAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateServiceNetworkServiceAssociationResult createServiceNetworkServiceAssociation(CreateServiceNetworkServiceAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateServiceNetworkServiceAssociation(request);
    }

    @SdkInternalApi
    final CreateServiceNetworkServiceAssociationResult executeCreateServiceNetworkServiceAssociation(
            CreateServiceNetworkServiceAssociationRequest createServiceNetworkServiceAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(createServiceNetworkServiceAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateServiceNetworkServiceAssociationRequest> request = null;
        Response<CreateServiceNetworkServiceAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateServiceNetworkServiceAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createServiceNetworkServiceAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateServiceNetworkServiceAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateServiceNetworkServiceAssociationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateServiceNetworkServiceAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a VPC with a service network. When you associate a VPC with the service network, it enables all the
     * resources within that VPC to be clients and communicate with other services in the service network. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/vpc-lattice/latest/ug/service-network-associations.html#service-network-vpc-associations"
     * >Manage VPC associations</a> in the <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * <p>
     * You can't use this operation if there is a disassociation in progress. If the association fails, retry by
     * deleting the association and recreating it.
     * </p>
     * <p>
     * As a result of this operation, the association gets created in the service network account and the VPC owner
     * account.
     * </p>
     * <p>
     * If you add a security group to the service network and VPC association, the association must continue to always
     * have at least one security group. You can add or edit security groups at any time. However, to remove all
     * security groups, you must first delete the association and recreate it without security groups.
     * </p>
     * 
     * @param createServiceNetworkVpcAssociationRequest
     * @return Result of the CreateServiceNetworkVpcAssociation operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.CreateServiceNetworkVpcAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateServiceNetworkVpcAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateServiceNetworkVpcAssociationResult createServiceNetworkVpcAssociation(CreateServiceNetworkVpcAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateServiceNetworkVpcAssociation(request);
    }

    @SdkInternalApi
    final CreateServiceNetworkVpcAssociationResult executeCreateServiceNetworkVpcAssociation(
            CreateServiceNetworkVpcAssociationRequest createServiceNetworkVpcAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(createServiceNetworkVpcAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateServiceNetworkVpcAssociationRequest> request = null;
        Response<CreateServiceNetworkVpcAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateServiceNetworkVpcAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createServiceNetworkVpcAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateServiceNetworkVpcAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateServiceNetworkVpcAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateServiceNetworkVpcAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a target group. A target group is a collection of targets, or compute resources, that run your
     * application or service. A target group can only be used by a single service.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/target-groups.html">Target
     * groups</a> in the <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param createTargetGroupRequest
     * @return Result of the CreateTargetGroup operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.CreateTargetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateTargetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateTargetGroupResult createTargetGroup(CreateTargetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTargetGroup(request);
    }

    @SdkInternalApi
    final CreateTargetGroupResult executeCreateTargetGroup(CreateTargetGroupRequest createTargetGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createTargetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTargetGroupRequest> request = null;
        Response<CreateTargetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTargetGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTargetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTargetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTargetGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTargetGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified access log subscription.
     * </p>
     * 
     * @param deleteAccessLogSubscriptionRequest
     * @return Result of the DeleteAccessLogSubscription operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.DeleteAccessLogSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteAccessLogSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAccessLogSubscriptionResult deleteAccessLogSubscription(DeleteAccessLogSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAccessLogSubscription(request);
    }

    @SdkInternalApi
    final DeleteAccessLogSubscriptionResult executeDeleteAccessLogSubscription(DeleteAccessLogSubscriptionRequest deleteAccessLogSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAccessLogSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccessLogSubscriptionRequest> request = null;
        Response<DeleteAccessLogSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccessLogSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteAccessLogSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAccessLogSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAccessLogSubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteAccessLogSubscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified auth policy. If an auth is set to <code>AWS_IAM</code> and the auth policy is deleted, all
     * requests are denied. If you are trying to remove the auth policy completely, you must set the auth type to
     * <code>NONE</code>. If auth is enabled on the resource, but no auth policy is set, all requests are denied.
     * </p>
     * 
     * @param deleteAuthPolicyRequest
     * @return Result of the DeleteAuthPolicy operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.DeleteAuthPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteAuthPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteAuthPolicyResult deleteAuthPolicy(DeleteAuthPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAuthPolicy(request);
    }

    @SdkInternalApi
    final DeleteAuthPolicyResult executeDeleteAuthPolicy(DeleteAuthPolicyRequest deleteAuthPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAuthPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAuthPolicyRequest> request = null;
        Response<DeleteAuthPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAuthPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAuthPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAuthPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAuthPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAuthPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified listener.
     * </p>
     * 
     * @param deleteListenerRequest
     * @return Result of the DeleteListener operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.DeleteListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteListener" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteListenerResult deleteListener(DeleteListenerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteListener(request);
    }

    @SdkInternalApi
    final DeleteListenerResult executeDeleteListener(DeleteListenerRequest deleteListenerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteListenerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteListenerRequest> request = null;
        Response<DeleteListenerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteListenerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteListenerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteListener");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteListenerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteListenerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified resource policy.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return Result of the DeleteResourcePolicy operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteResourcePolicyResult deleteResourcePolicy(DeleteResourcePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteResourcePolicy(request);
    }

    @SdkInternalApi
    final DeleteResourcePolicyResult executeDeleteResourcePolicy(DeleteResourcePolicyRequest deleteResourcePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResourcePolicyRequest> request = null;
        Response<DeleteResourcePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResourcePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteResourcePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteResourcePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteResourcePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteResourcePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a listener rule. Each listener has a default rule for checking connection requests, but you can define
     * additional rules. Each rule consists of a priority, one or more actions, and one or more conditions. You can
     * delete additional listener rules, but you cannot delete the default rule.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/listeners.html#listener-rules">Listener rules</a> in the
     * <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param deleteRuleRequest
     * @return Result of the DeleteRule operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteRuleResult deleteRule(DeleteRuleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRule(request);
    }

    @SdkInternalApi
    final DeleteRuleResult executeDeleteRule(DeleteRuleRequest deleteRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRuleRequest> request = null;
        Response<DeleteRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRuleResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a service. A service can't be deleted if it's associated with a service network. If you delete a service,
     * all resources related to the service, such as the resource policy, auth policy, listeners, listener rules, and
     * access log subscriptions, are also deleted. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/services.html#delete-service">Delete a service</a> in the
     * <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param deleteServiceRequest
     * @return Result of the DeleteService operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.DeleteService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteService" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteServiceResult deleteService(DeleteServiceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteService(request);
    }

    @SdkInternalApi
    final DeleteServiceResult executeDeleteService(DeleteServiceRequest deleteServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteServiceRequest> request = null;
        Response<DeleteServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteServiceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteServiceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a service network. You can only delete the service network if there is no service or VPC associated with
     * it. If you delete a service network, all resources related to the service network, such as the resource policy,
     * auth policy, and access log subscriptions, are also deleted. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/service-networks.html#delete-service-network">Delete a
     * service network</a> in the <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param deleteServiceNetworkRequest
     * @return Result of the DeleteServiceNetwork operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.DeleteServiceNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteServiceNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteServiceNetworkResult deleteServiceNetwork(DeleteServiceNetworkRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteServiceNetwork(request);
    }

    @SdkInternalApi
    final DeleteServiceNetworkResult executeDeleteServiceNetwork(DeleteServiceNetworkRequest deleteServiceNetworkRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteServiceNetworkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteServiceNetworkRequest> request = null;
        Response<DeleteServiceNetworkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteServiceNetworkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteServiceNetworkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteServiceNetwork");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteServiceNetworkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteServiceNetworkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the association between a specified service and the specific service network. This operation fails if an
     * association is still in progress.
     * </p>
     * 
     * @param deleteServiceNetworkServiceAssociationRequest
     * @return Result of the DeleteServiceNetworkServiceAssociation operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.DeleteServiceNetworkServiceAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteServiceNetworkServiceAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteServiceNetworkServiceAssociationResult deleteServiceNetworkServiceAssociation(DeleteServiceNetworkServiceAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteServiceNetworkServiceAssociation(request);
    }

    @SdkInternalApi
    final DeleteServiceNetworkServiceAssociationResult executeDeleteServiceNetworkServiceAssociation(
            DeleteServiceNetworkServiceAssociationRequest deleteServiceNetworkServiceAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteServiceNetworkServiceAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteServiceNetworkServiceAssociationRequest> request = null;
        Response<DeleteServiceNetworkServiceAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteServiceNetworkServiceAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteServiceNetworkServiceAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteServiceNetworkServiceAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteServiceNetworkServiceAssociationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteServiceNetworkServiceAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates the VPC from the service network. You can't disassociate the VPC if there is a create or update
     * association in progress.
     * </p>
     * 
     * @param deleteServiceNetworkVpcAssociationRequest
     * @return Result of the DeleteServiceNetworkVpcAssociation operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.DeleteServiceNetworkVpcAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteServiceNetworkVpcAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteServiceNetworkVpcAssociationResult deleteServiceNetworkVpcAssociation(DeleteServiceNetworkVpcAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteServiceNetworkVpcAssociation(request);
    }

    @SdkInternalApi
    final DeleteServiceNetworkVpcAssociationResult executeDeleteServiceNetworkVpcAssociation(
            DeleteServiceNetworkVpcAssociationRequest deleteServiceNetworkVpcAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteServiceNetworkVpcAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteServiceNetworkVpcAssociationRequest> request = null;
        Response<DeleteServiceNetworkVpcAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteServiceNetworkVpcAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteServiceNetworkVpcAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteServiceNetworkVpcAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteServiceNetworkVpcAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteServiceNetworkVpcAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a target group. You can't delete a target group if it is used in a listener rule or if the target group
     * creation is in progress.
     * </p>
     * 
     * @param deleteTargetGroupRequest
     * @return Result of the DeleteTargetGroup operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.DeleteTargetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteTargetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteTargetGroupResult deleteTargetGroup(DeleteTargetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTargetGroup(request);
    }

    @SdkInternalApi
    final DeleteTargetGroupResult executeDeleteTargetGroup(DeleteTargetGroupRequest deleteTargetGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTargetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTargetGroupRequest> request = null;
        Response<DeleteTargetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTargetGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTargetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTargetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTargetGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTargetGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deregisters the specified targets from the specified target group.
     * </p>
     * 
     * @param deregisterTargetsRequest
     * @return Result of the DeregisterTargets operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.DeregisterTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeregisterTargets" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeregisterTargetsResult deregisterTargets(DeregisterTargetsRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterTargets(request);
    }

    @SdkInternalApi
    final DeregisterTargetsResult executeDeregisterTargets(DeregisterTargetsRequest deregisterTargetsRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterTargetsRequest> request = null;
        Response<DeregisterTargetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterTargetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deregisterTargetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterTargets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterTargetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeregisterTargetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the specified access log subscription.
     * </p>
     * 
     * @param getAccessLogSubscriptionRequest
     * @return Result of the GetAccessLogSubscription operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.GetAccessLogSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetAccessLogSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAccessLogSubscriptionResult getAccessLogSubscription(GetAccessLogSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccessLogSubscription(request);
    }

    @SdkInternalApi
    final GetAccessLogSubscriptionResult executeGetAccessLogSubscription(GetAccessLogSubscriptionRequest getAccessLogSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccessLogSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccessLogSubscriptionRequest> request = null;
        Response<GetAccessLogSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccessLogSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getAccessLogSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccessLogSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAccessLogSubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetAccessLogSubscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the auth policy for the specified service or service network.
     * </p>
     * 
     * @param getAuthPolicyRequest
     * @return Result of the GetAuthPolicy operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.GetAuthPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetAuthPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAuthPolicyResult getAuthPolicy(GetAuthPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetAuthPolicy(request);
    }

    @SdkInternalApi
    final GetAuthPolicyResult executeGetAuthPolicy(GetAuthPolicyRequest getAuthPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getAuthPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAuthPolicyRequest> request = null;
        Response<GetAuthPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAuthPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAuthPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAuthPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAuthPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAuthPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the specified listener for the specified service.
     * </p>
     * 
     * @param getListenerRequest
     * @return Result of the GetListener operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.GetListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetListener" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetListenerResult getListener(GetListenerRequest request) {
        request = beforeClientExecution(request);
        return executeGetListener(request);
    }

    @SdkInternalApi
    final GetListenerResult executeGetListener(GetListenerRequest getListenerRequest) {

        ExecutionContext executionContext = createExecutionContext(getListenerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetListenerRequest> request = null;
        Response<GetListenerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetListenerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getListenerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetListener");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetListenerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetListenerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the resource policy. The resource policy is an IAM policy created on behalf of the
     * resource owner when they share a resource.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @return Result of the GetResourcePolicy operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetResourcePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetResourcePolicyResult getResourcePolicy(GetResourcePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetResourcePolicy(request);
    }

    @SdkInternalApi
    final GetResourcePolicyResult executeGetResourcePolicy(GetResourcePolicyRequest getResourcePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourcePolicyRequest> request = null;
        Response<GetResourcePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourcePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getResourcePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResourcePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResourcePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetResourcePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about listener rules. You can also retrieve information about the default listener rule.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/listeners.html#listener-rules">Listener rules</a> in the
     * <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param getRuleRequest
     * @return Result of the GetRule operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.GetRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetRuleResult getRule(GetRuleRequest request) {
        request = beforeClientExecution(request);
        return executeGetRule(request);
    }

    @SdkInternalApi
    final GetRuleResult executeGetRule(GetRuleRequest getRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(getRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRuleRequest> request = null;
        Response<GetRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRuleResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the specified service.
     * </p>
     * 
     * @param getServiceRequest
     * @return Result of the GetService operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.GetService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetService" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetServiceResult getService(GetServiceRequest request) {
        request = beforeClientExecution(request);
        return executeGetService(request);
    }

    @SdkInternalApi
    final GetServiceResult executeGetService(GetServiceRequest getServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(getServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServiceRequest> request = null;
        Response<GetServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetServiceResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetServiceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the specified service network.
     * </p>
     * 
     * @param getServiceNetworkRequest
     * @return Result of the GetServiceNetwork operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.GetServiceNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetServiceNetwork" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetServiceNetworkResult getServiceNetwork(GetServiceNetworkRequest request) {
        request = beforeClientExecution(request);
        return executeGetServiceNetwork(request);
    }

    @SdkInternalApi
    final GetServiceNetworkResult executeGetServiceNetwork(GetServiceNetworkRequest getServiceNetworkRequest) {

        ExecutionContext executionContext = createExecutionContext(getServiceNetworkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServiceNetworkRequest> request = null;
        Response<GetServiceNetworkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServiceNetworkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getServiceNetworkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetServiceNetwork");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetServiceNetworkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetServiceNetworkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the specified association between a service network and a service.
     * </p>
     * 
     * @param getServiceNetworkServiceAssociationRequest
     * @return Result of the GetServiceNetworkServiceAssociation operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.GetServiceNetworkServiceAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetServiceNetworkServiceAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetServiceNetworkServiceAssociationResult getServiceNetworkServiceAssociation(GetServiceNetworkServiceAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeGetServiceNetworkServiceAssociation(request);
    }

    @SdkInternalApi
    final GetServiceNetworkServiceAssociationResult executeGetServiceNetworkServiceAssociation(
            GetServiceNetworkServiceAssociationRequest getServiceNetworkServiceAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(getServiceNetworkServiceAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServiceNetworkServiceAssociationRequest> request = null;
        Response<GetServiceNetworkServiceAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServiceNetworkServiceAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getServiceNetworkServiceAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetServiceNetworkServiceAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetServiceNetworkServiceAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetServiceNetworkServiceAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the association between a service network and a VPC.
     * </p>
     * 
     * @param getServiceNetworkVpcAssociationRequest
     * @return Result of the GetServiceNetworkVpcAssociation operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.GetServiceNetworkVpcAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetServiceNetworkVpcAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetServiceNetworkVpcAssociationResult getServiceNetworkVpcAssociation(GetServiceNetworkVpcAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeGetServiceNetworkVpcAssociation(request);
    }

    @SdkInternalApi
    final GetServiceNetworkVpcAssociationResult executeGetServiceNetworkVpcAssociation(
            GetServiceNetworkVpcAssociationRequest getServiceNetworkVpcAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(getServiceNetworkVpcAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServiceNetworkVpcAssociationRequest> request = null;
        Response<GetServiceNetworkVpcAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServiceNetworkVpcAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getServiceNetworkVpcAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetServiceNetworkVpcAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetServiceNetworkVpcAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetServiceNetworkVpcAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the specified target group.
     * </p>
     * 
     * @param getTargetGroupRequest
     * @return Result of the GetTargetGroup operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.GetTargetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetTargetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetTargetGroupResult getTargetGroup(GetTargetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetTargetGroup(request);
    }

    @SdkInternalApi
    final GetTargetGroupResult executeGetTargetGroup(GetTargetGroupRequest getTargetGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getTargetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTargetGroupRequest> request = null;
        Response<GetTargetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTargetGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTargetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTargetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTargetGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTargetGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all access log subscriptions for the specified service network or service.
     * </p>
     * 
     * @param listAccessLogSubscriptionsRequest
     * @return Result of the ListAccessLogSubscriptions operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.ListAccessLogSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListAccessLogSubscriptions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAccessLogSubscriptionsResult listAccessLogSubscriptions(ListAccessLogSubscriptionsRequest request) {
        request = beforeClientExecution(request);
        return executeListAccessLogSubscriptions(request);
    }

    @SdkInternalApi
    final ListAccessLogSubscriptionsResult executeListAccessLogSubscriptions(ListAccessLogSubscriptionsRequest listAccessLogSubscriptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAccessLogSubscriptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccessLogSubscriptionsRequest> request = null;
        Response<ListAccessLogSubscriptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccessLogSubscriptionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAccessLogSubscriptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccessLogSubscriptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAccessLogSubscriptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAccessLogSubscriptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the listeners for the specified service.
     * </p>
     * 
     * @param listListenersRequest
     * @return Result of the ListListeners operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.ListListeners
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListListeners" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListListenersResult listListeners(ListListenersRequest request) {
        request = beforeClientExecution(request);
        return executeListListeners(request);
    }

    @SdkInternalApi
    final ListListenersResult executeListListeners(ListListenersRequest listListenersRequest) {

        ExecutionContext executionContext = createExecutionContext(listListenersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListListenersRequest> request = null;
        Response<ListListenersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListListenersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listListenersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListListeners");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListListenersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListListenersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the rules for the listener.
     * </p>
     * 
     * @param listRulesRequest
     * @return Result of the ListRules operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListRules" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListRulesResult listRules(ListRulesRequest request) {
        request = beforeClientExecution(request);
        return executeListRules(request);
    }

    @SdkInternalApi
    final ListRulesResult executeListRules(ListRulesRequest listRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(listRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRulesRequest> request = null;
        Response<ListRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRulesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRulesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the associations between the service network and the service. You can filter the list either by service or
     * service network. You must provide either the service network identifier or the service identifier.
     * </p>
     * <p>
     * Every association in Amazon VPC Lattice is given a unique Amazon Resource Name (ARN), such as when a service
     * network is associated with a VPC or when a service is associated with a service network. If the association is
     * for a resource that is shared with another account, the association includes the local account ID as the prefix
     * in the ARN for each account the resource is shared with.
     * </p>
     * 
     * @param listServiceNetworkServiceAssociationsRequest
     * @return Result of the ListServiceNetworkServiceAssociations operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.ListServiceNetworkServiceAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListServiceNetworkServiceAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListServiceNetworkServiceAssociationsResult listServiceNetworkServiceAssociations(ListServiceNetworkServiceAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeListServiceNetworkServiceAssociations(request);
    }

    @SdkInternalApi
    final ListServiceNetworkServiceAssociationsResult executeListServiceNetworkServiceAssociations(
            ListServiceNetworkServiceAssociationsRequest listServiceNetworkServiceAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listServiceNetworkServiceAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServiceNetworkServiceAssociationsRequest> request = null;
        Response<ListServiceNetworkServiceAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServiceNetworkServiceAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listServiceNetworkServiceAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListServiceNetworkServiceAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListServiceNetworkServiceAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListServiceNetworkServiceAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the service network and VPC associations. You can filter the list either by VPC or service network. You
     * must provide either the service network identifier or the VPC identifier.
     * </p>
     * 
     * @param listServiceNetworkVpcAssociationsRequest
     * @return Result of the ListServiceNetworkVpcAssociations operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.ListServiceNetworkVpcAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListServiceNetworkVpcAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListServiceNetworkVpcAssociationsResult listServiceNetworkVpcAssociations(ListServiceNetworkVpcAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeListServiceNetworkVpcAssociations(request);
    }

    @SdkInternalApi
    final ListServiceNetworkVpcAssociationsResult executeListServiceNetworkVpcAssociations(
            ListServiceNetworkVpcAssociationsRequest listServiceNetworkVpcAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listServiceNetworkVpcAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServiceNetworkVpcAssociationsRequest> request = null;
        Response<ListServiceNetworkVpcAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServiceNetworkVpcAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listServiceNetworkVpcAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListServiceNetworkVpcAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListServiceNetworkVpcAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListServiceNetworkVpcAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the service networks owned by the caller account or shared with the caller account. Also includes the
     * account ID in the ARN to show which account owns the service network.
     * </p>
     * 
     * @param listServiceNetworksRequest
     * @return Result of the ListServiceNetworks operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.ListServiceNetworks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListServiceNetworks"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListServiceNetworksResult listServiceNetworks(ListServiceNetworksRequest request) {
        request = beforeClientExecution(request);
        return executeListServiceNetworks(request);
    }

    @SdkInternalApi
    final ListServiceNetworksResult executeListServiceNetworks(ListServiceNetworksRequest listServiceNetworksRequest) {

        ExecutionContext executionContext = createExecutionContext(listServiceNetworksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServiceNetworksRequest> request = null;
        Response<ListServiceNetworksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServiceNetworksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listServiceNetworksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListServiceNetworks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListServiceNetworksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListServiceNetworksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the services owned by the caller account or shared with the caller account.
     * </p>
     * 
     * @param listServicesRequest
     * @return Result of the ListServices operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.ListServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListServices" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListServicesResult listServices(ListServicesRequest request) {
        request = beforeClientExecution(request);
        return executeListServices(request);
    }

    @SdkInternalApi
    final ListServicesResult executeListServices(ListServicesRequest listServicesRequest) {

        ExecutionContext executionContext = createExecutionContext(listServicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServicesRequest> request = null;
        Response<ListServicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listServicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListServices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListServicesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListServicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
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
     * Lists your target groups. You can narrow your search by using the filters below in your request.
     * </p>
     * 
     * @param listTargetGroupsRequest
     * @return Result of the ListTargetGroups operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.ListTargetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListTargetGroups" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListTargetGroupsResult listTargetGroups(ListTargetGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListTargetGroups(request);
    }

    @SdkInternalApi
    final ListTargetGroupsResult executeListTargetGroups(ListTargetGroupsRequest listTargetGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTargetGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTargetGroupsRequest> request = null;
        Response<ListTargetGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTargetGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTargetGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTargetGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTargetGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTargetGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the targets for the target group. By default, all targets are included. You can use this API to check the
     * health status of targets. You can also ﬁlter the results by target.
     * </p>
     * 
     * @param listTargetsRequest
     * @return Result of the ListTargets operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.ListTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListTargets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTargetsResult listTargets(ListTargetsRequest request) {
        request = beforeClientExecution(request);
        return executeListTargets(request);
    }

    @SdkInternalApi
    final ListTargetsResult executeListTargets(ListTargetsRequest listTargetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTargetsRequest> request = null;
        Response<ListTargetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTargetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTargetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTargets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTargetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTargetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates the auth policy. The policy string in JSON must not contain newlines or blank lines.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/vpc-lattice/latest/ug/auth-policies.html">Auth
     * policies</a> in the <i>Amazon VPC Lattice User Guide</i>.
     * </p>
     * 
     * @param putAuthPolicyRequest
     * @return Result of the PutAuthPolicy operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.PutAuthPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/PutAuthPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutAuthPolicyResult putAuthPolicy(PutAuthPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutAuthPolicy(request);
    }

    @SdkInternalApi
    final PutAuthPolicyResult executePutAuthPolicy(PutAuthPolicyRequest putAuthPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putAuthPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAuthPolicyRequest> request = null;
        Response<PutAuthPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAuthPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putAuthPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutAuthPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutAuthPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutAuthPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches a resource-based permission policy to a service or service network. The policy must contain the same
     * actions and condition statements as the Amazon Web Services Resource Access Manager permission for sharing
     * services and service networks.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return Result of the PutResourcePolicy operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/PutResourcePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutResourcePolicyResult putResourcePolicy(PutResourcePolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutResourcePolicy(request);
    }

    @SdkInternalApi
    final PutResourcePolicyResult executePutResourcePolicy(PutResourcePolicyRequest putResourcePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutResourcePolicyRequest> request = null;
        Response<PutResourcePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutResourcePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putResourcePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutResourcePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutResourcePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutResourcePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers the targets with the target group. If it's a Lambda target, you can only have one target in a target
     * group.
     * </p>
     * 
     * @param registerTargetsRequest
     * @return Result of the RegisterTargets operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.RegisterTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/RegisterTargets" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RegisterTargetsResult registerTargets(RegisterTargetsRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterTargets(request);
    }

    @SdkInternalApi
    final RegisterTargetsResult executeRegisterTargets(RegisterTargetsRequest registerTargetsRequest) {

        ExecutionContext executionContext = createExecutionContext(registerTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterTargetsRequest> request = null;
        Response<RegisterTargetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterTargetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerTargetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterTargets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterTargetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RegisterTargetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds the specified tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
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
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UntagResource" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
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
     * Updates the specified access log subscription.
     * </p>
     * 
     * @param updateAccessLogSubscriptionRequest
     * @return Result of the UpdateAccessLogSubscription operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.UpdateAccessLogSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateAccessLogSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAccessLogSubscriptionResult updateAccessLogSubscription(UpdateAccessLogSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAccessLogSubscription(request);
    }

    @SdkInternalApi
    final UpdateAccessLogSubscriptionResult executeUpdateAccessLogSubscription(UpdateAccessLogSubscriptionRequest updateAccessLogSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAccessLogSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAccessLogSubscriptionRequest> request = null;
        Response<UpdateAccessLogSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAccessLogSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateAccessLogSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAccessLogSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAccessLogSubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateAccessLogSubscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified listener for the specified service.
     * </p>
     * 
     * @param updateListenerRequest
     * @return Result of the UpdateListener operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.UpdateListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateListener" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateListenerResult updateListener(UpdateListenerRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateListener(request);
    }

    @SdkInternalApi
    final UpdateListenerResult executeUpdateListener(UpdateListenerRequest updateListenerRequest) {

        ExecutionContext executionContext = createExecutionContext(updateListenerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateListenerRequest> request = null;
        Response<UpdateListenerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateListenerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateListenerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateListener");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateListenerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateListenerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a rule for the listener. You can't modify a default listener rule. To modify a default listener rule, use
     * <code>UpdateListener</code>.
     * </p>
     * 
     * @param updateRuleRequest
     * @return Result of the UpdateRule operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.UpdateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateRuleResult updateRule(UpdateRuleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRule(request);
    }

    @SdkInternalApi
    final UpdateRuleResult executeUpdateRule(UpdateRuleRequest updateRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRuleRequest> request = null;
        Response<UpdateRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRuleResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified service.
     * </p>
     * 
     * @param updateServiceRequest
     * @return Result of the UpdateService operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.UpdateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateService" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateServiceResult updateService(UpdateServiceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateService(request);
    }

    @SdkInternalApi
    final UpdateServiceResult executeUpdateService(UpdateServiceRequest updateServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServiceRequest> request = null;
        Response<UpdateServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateServiceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateServiceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified service network.
     * </p>
     * 
     * @param updateServiceNetworkRequest
     * @return Result of the UpdateServiceNetwork operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.UpdateServiceNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateServiceNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateServiceNetworkResult updateServiceNetwork(UpdateServiceNetworkRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateServiceNetwork(request);
    }

    @SdkInternalApi
    final UpdateServiceNetworkResult executeUpdateServiceNetwork(UpdateServiceNetworkRequest updateServiceNetworkRequest) {

        ExecutionContext executionContext = createExecutionContext(updateServiceNetworkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServiceNetworkRequest> request = null;
        Response<UpdateServiceNetworkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServiceNetworkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateServiceNetworkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateServiceNetwork");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateServiceNetworkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateServiceNetworkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the service network and VPC association. If you add a security group to the service network and VPC
     * association, the association must continue to always have at least one security group. You can add or edit
     * security groups at any time. However, to remove all security groups, you must first delete the association and
     * recreate it without security groups.
     * </p>
     * 
     * @param updateServiceNetworkVpcAssociationRequest
     * @return Result of the UpdateServiceNetworkVpcAssociation operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.UpdateServiceNetworkVpcAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateServiceNetworkVpcAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateServiceNetworkVpcAssociationResult updateServiceNetworkVpcAssociation(UpdateServiceNetworkVpcAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateServiceNetworkVpcAssociation(request);
    }

    @SdkInternalApi
    final UpdateServiceNetworkVpcAssociationResult executeUpdateServiceNetworkVpcAssociation(
            UpdateServiceNetworkVpcAssociationRequest updateServiceNetworkVpcAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateServiceNetworkVpcAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServiceNetworkVpcAssociationRequest> request = null;
        Response<UpdateServiceNetworkVpcAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServiceNetworkVpcAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateServiceNetworkVpcAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateServiceNetworkVpcAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateServiceNetworkVpcAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateServiceNetworkVpcAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified target group.
     * </p>
     * 
     * @param updateTargetGroupRequest
     * @return Result of the UpdateTargetGroup operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource. Updating or deleting a resource can cause
     *         an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @sample AmazonVPCLattice.UpdateTargetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateTargetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateTargetGroupResult updateTargetGroup(UpdateTargetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTargetGroup(request);
    }

    @SdkInternalApi
    final UpdateTargetGroupResult executeUpdateTargetGroup(UpdateTargetGroupRequest updateTargetGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTargetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTargetGroupRequest> request = null;
        Response<UpdateTargetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTargetGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTargetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VPC Lattice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTargetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTargetGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTargetGroupResultJsonUnmarshaller());
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
