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
package com.amazonaws.services.backupgateway;

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

import com.amazonaws.services.backupgateway.AWSBackupGatewayClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.backupgateway.model.*;
import com.amazonaws.services.backupgateway.model.transform.*;

/**
 * Client for accessing AWS Backup Gateway. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * <fullname>Backup gateway</fullname>
 * <p>
 * Backup gateway connects Backup to your hypervisor, so you can create, store, and restore backups of your virtual
 * machines (VMs) anywhere, whether on-premises or in the VMware Cloud (VMC) on Amazon Web Services.
 * </p>
 * <p>
 * Add on-premises resources by connecting to a hypervisor through a gateway. Backup will automatically discover the
 * resources in your hypervisor.
 * </p>
 * <p>
 * Use Backup to assign virtual or on-premises resources to a backup plan, or run on-demand backups. Once you have
 * backed up your resources, you can view them and restore them like any resource supported by Backup.
 * </p>
 * <p>
 * To download the Amazon Web Services software to get started, navigate to the Backup console, choose <b>Gateways</b>,
 * then choose <b>Create gateway</b>.
 * </p>
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSBackupGatewayClient extends AmazonWebServiceClient implements AWSBackupGateway {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSBackupGateway.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "backup-gateway";

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
                                    com.amazonaws.services.backupgateway.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.backupgateway.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.backupgateway.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.backupgateway.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.backupgateway.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.backupgateway.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.backupgateway.model.AWSBackupGatewayException.class));

    public static AWSBackupGatewayClientBuilder builder() {
        return AWSBackupGatewayClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Backup Gateway using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSBackupGatewayClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Backup Gateway using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSBackupGatewayClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("backup-gateway.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/backupgateway/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/backupgateway/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates a backup gateway with your server. After you complete the association process, you can back up and
     * restore your VMs through the gateway.
     * </p>
     * 
     * @param associateGatewayToServerRequest
     * @return Result of the AssociateGatewayToServer operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws ConflictException
     *         The operation cannot proceed because it is not supported.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.AssociateGatewayToServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/AssociateGatewayToServer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateGatewayToServerResult associateGatewayToServer(AssociateGatewayToServerRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateGatewayToServer(request);
    }

    @SdkInternalApi
    final AssociateGatewayToServerResult executeAssociateGatewayToServer(AssociateGatewayToServerRequest associateGatewayToServerRequest) {

        ExecutionContext executionContext = createExecutionContext(associateGatewayToServerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateGatewayToServerRequest> request = null;
        Response<AssociateGatewayToServerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateGatewayToServerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateGatewayToServerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateGatewayToServer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateGatewayToServerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateGatewayToServerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a backup gateway. After you create a gateway, you can associate it with a server using the
     * <code>AssociateGatewayToServer</code> operation.
     * </p>
     * 
     * @param createGatewayRequest
     * @return Result of the CreateGateway operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.CreateGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/CreateGateway" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateGatewayResult createGateway(CreateGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGateway(request);
    }

    @SdkInternalApi
    final CreateGatewayResult executeCreateGateway(CreateGatewayRequest createGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(createGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGatewayRequest> request = null;
        Response<CreateGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGatewayRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGatewayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a backup gateway.
     * </p>
     * 
     * @param deleteGatewayRequest
     * @return Result of the DeleteGateway operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.DeleteGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/DeleteGateway" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteGatewayResult deleteGateway(DeleteGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGateway(request);
    }

    @SdkInternalApi
    final DeleteGatewayResult executeDeleteGateway(DeleteGatewayRequest deleteGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGatewayRequest> request = null;
        Response<DeleteGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGatewayRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteGatewayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a hypervisor.
     * </p>
     * 
     * @param deleteHypervisorRequest
     * @return Result of the DeleteHypervisor operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws ConflictException
     *         The operation cannot proceed because it is not supported.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws AccessDeniedException
     *         The operation cannot proceed because you have insufficient permissions.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.DeleteHypervisor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/DeleteHypervisor"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteHypervisorResult deleteHypervisor(DeleteHypervisorRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteHypervisor(request);
    }

    @SdkInternalApi
    final DeleteHypervisorResult executeDeleteHypervisor(DeleteHypervisorRequest deleteHypervisorRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteHypervisorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteHypervisorRequest> request = null;
        Response<DeleteHypervisorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteHypervisorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteHypervisorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteHypervisor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteHypervisorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteHypervisorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a backup gateway from the specified server. After the disassociation process finishes, the gateway
     * can no longer access the virtual machines on the server.
     * </p>
     * 
     * @param disassociateGatewayFromServerRequest
     * @return Result of the DisassociateGatewayFromServer operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws ConflictException
     *         The operation cannot proceed because it is not supported.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.DisassociateGatewayFromServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/DisassociateGatewayFromServer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateGatewayFromServerResult disassociateGatewayFromServer(DisassociateGatewayFromServerRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateGatewayFromServer(request);
    }

    @SdkInternalApi
    final DisassociateGatewayFromServerResult executeDisassociateGatewayFromServer(DisassociateGatewayFromServerRequest disassociateGatewayFromServerRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateGatewayFromServerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateGatewayFromServerRequest> request = null;
        Response<DisassociateGatewayFromServerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateGatewayFromServerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateGatewayFromServerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateGatewayFromServer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateGatewayFromServerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateGatewayFromServerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the bandwidth rate limit schedule for a specified gateway. By default, gateways do not have bandwidth
     * rate limit schedules, which means no bandwidth rate limiting is in effect. Use this to get a gateway's bandwidth
     * rate limit schedule.
     * </p>
     * 
     * @param getBandwidthRateLimitScheduleRequest
     * @return Result of the GetBandwidthRateLimitSchedule operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.GetBandwidthRateLimitSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/GetBandwidthRateLimitSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetBandwidthRateLimitScheduleResult getBandwidthRateLimitSchedule(GetBandwidthRateLimitScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeGetBandwidthRateLimitSchedule(request);
    }

    @SdkInternalApi
    final GetBandwidthRateLimitScheduleResult executeGetBandwidthRateLimitSchedule(GetBandwidthRateLimitScheduleRequest getBandwidthRateLimitScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(getBandwidthRateLimitScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBandwidthRateLimitScheduleRequest> request = null;
        Response<GetBandwidthRateLimitScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBandwidthRateLimitScheduleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getBandwidthRateLimitScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBandwidthRateLimitSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBandwidthRateLimitScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetBandwidthRateLimitScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * By providing the ARN (Amazon Resource Name), this API returns the gateway.
     * </p>
     * 
     * @param getGatewayRequest
     * @return Result of the GetGateway operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.GetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/GetGateway" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetGatewayResult getGateway(GetGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeGetGateway(request);
    }

    @SdkInternalApi
    final GetGatewayResult executeGetGateway(GetGatewayRequest getGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(getGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGatewayRequest> request = null;
        Response<GetGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGatewayRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGatewayResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This action requests information about the specified hypervisor to which the gateway will connect. A hypervisor
     * is hardware, software, or firmware that creates and manages virtual machines, and allocates resources to them.
     * </p>
     * 
     * @param getHypervisorRequest
     * @return Result of the GetHypervisor operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.GetHypervisor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/GetHypervisor" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetHypervisorResult getHypervisor(GetHypervisorRequest request) {
        request = beforeClientExecution(request);
        return executeGetHypervisor(request);
    }

    @SdkInternalApi
    final GetHypervisorResult executeGetHypervisor(GetHypervisorRequest getHypervisorRequest) {

        ExecutionContext executionContext = createExecutionContext(getHypervisorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetHypervisorRequest> request = null;
        Response<GetHypervisorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetHypervisorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getHypervisorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetHypervisor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetHypervisorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetHypervisorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This action retrieves the property mappings for the specified hypervisor. A hypervisor property mapping displays
     * the relationship of entity properties available from the on-premises hypervisor to the properties available in
     * Amazon Web Services.
     * </p>
     * 
     * @param getHypervisorPropertyMappingsRequest
     * @return Result of the GetHypervisorPropertyMappings operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.GetHypervisorPropertyMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/GetHypervisorPropertyMappings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetHypervisorPropertyMappingsResult getHypervisorPropertyMappings(GetHypervisorPropertyMappingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetHypervisorPropertyMappings(request);
    }

    @SdkInternalApi
    final GetHypervisorPropertyMappingsResult executeGetHypervisorPropertyMappings(GetHypervisorPropertyMappingsRequest getHypervisorPropertyMappingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getHypervisorPropertyMappingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetHypervisorPropertyMappingsRequest> request = null;
        Response<GetHypervisorPropertyMappingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetHypervisorPropertyMappingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getHypervisorPropertyMappingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetHypervisorPropertyMappings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetHypervisorPropertyMappingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetHypervisorPropertyMappingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * By providing the ARN (Amazon Resource Name), this API returns the virtual machine.
     * </p>
     * 
     * @param getVirtualMachineRequest
     * @return Result of the GetVirtualMachine operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.GetVirtualMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/GetVirtualMachine"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetVirtualMachineResult getVirtualMachine(GetVirtualMachineRequest request) {
        request = beforeClientExecution(request);
        return executeGetVirtualMachine(request);
    }

    @SdkInternalApi
    final GetVirtualMachineResult executeGetVirtualMachine(GetVirtualMachineRequest getVirtualMachineRequest) {

        ExecutionContext executionContext = createExecutionContext(getVirtualMachineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVirtualMachineRequest> request = null;
        Response<GetVirtualMachineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVirtualMachineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getVirtualMachineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVirtualMachine");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVirtualMachineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetVirtualMachineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Connect to a hypervisor by importing its configuration.
     * </p>
     * 
     * @param importHypervisorConfigurationRequest
     * @return Result of the ImportHypervisorConfiguration operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws ConflictException
     *         The operation cannot proceed because it is not supported.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws AccessDeniedException
     *         The operation cannot proceed because you have insufficient permissions.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.ImportHypervisorConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/ImportHypervisorConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ImportHypervisorConfigurationResult importHypervisorConfiguration(ImportHypervisorConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeImportHypervisorConfiguration(request);
    }

    @SdkInternalApi
    final ImportHypervisorConfigurationResult executeImportHypervisorConfiguration(ImportHypervisorConfigurationRequest importHypervisorConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(importHypervisorConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportHypervisorConfigurationRequest> request = null;
        Response<ImportHypervisorConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportHypervisorConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(importHypervisorConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ImportHypervisorConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportHypervisorConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ImportHypervisorConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists backup gateways owned by an Amazon Web Services account in an Amazon Web Services Region. The returned list
     * is ordered by gateway Amazon Resource Name (ARN).
     * </p>
     * 
     * @param listGatewaysRequest
     * @return Result of the ListGateways operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.ListGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/ListGateways" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListGatewaysResult listGateways(ListGatewaysRequest request) {
        request = beforeClientExecution(request);
        return executeListGateways(request);
    }

    @SdkInternalApi
    final ListGatewaysResult executeListGateways(ListGatewaysRequest listGatewaysRequest) {

        ExecutionContext executionContext = createExecutionContext(listGatewaysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGatewaysRequest> request = null;
        Response<ListGatewaysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGatewaysRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listGatewaysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGateways");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGatewaysResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListGatewaysResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists your hypervisors.
     * </p>
     * 
     * @param listHypervisorsRequest
     * @return Result of the ListHypervisors operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.ListHypervisors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/ListHypervisors" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListHypervisorsResult listHypervisors(ListHypervisorsRequest request) {
        request = beforeClientExecution(request);
        return executeListHypervisors(request);
    }

    @SdkInternalApi
    final ListHypervisorsResult executeListHypervisors(ListHypervisorsRequest listHypervisorsRequest) {

        ExecutionContext executionContext = createExecutionContext(listHypervisorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListHypervisorsRequest> request = null;
        Response<ListHypervisorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListHypervisorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listHypervisorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListHypervisors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListHypervisorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListHypervisorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags applied to the resource identified by its Amazon Resource Name (ARN).
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup Gateway");
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
     * Lists your virtual machines.
     * </p>
     * 
     * @param listVirtualMachinesRequest
     * @return Result of the ListVirtualMachines operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.ListVirtualMachines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/ListVirtualMachines"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListVirtualMachinesResult listVirtualMachines(ListVirtualMachinesRequest request) {
        request = beforeClientExecution(request);
        return executeListVirtualMachines(request);
    }

    @SdkInternalApi
    final ListVirtualMachinesResult executeListVirtualMachines(ListVirtualMachinesRequest listVirtualMachinesRequest) {

        ExecutionContext executionContext = createExecutionContext(listVirtualMachinesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVirtualMachinesRequest> request = null;
        Response<ListVirtualMachinesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVirtualMachinesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listVirtualMachinesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVirtualMachines");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVirtualMachinesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListVirtualMachinesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This action sets the bandwidth rate limit schedule for a specified gateway. By default, gateways do not have a
     * bandwidth rate limit schedule, which means no bandwidth rate limiting is in effect. Use this to initiate a
     * gateway's bandwidth rate limit schedule.
     * </p>
     * 
     * @param putBandwidthRateLimitScheduleRequest
     * @return Result of the PutBandwidthRateLimitSchedule operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.PutBandwidthRateLimitSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/PutBandwidthRateLimitSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutBandwidthRateLimitScheduleResult putBandwidthRateLimitSchedule(PutBandwidthRateLimitScheduleRequest request) {
        request = beforeClientExecution(request);
        return executePutBandwidthRateLimitSchedule(request);
    }

    @SdkInternalApi
    final PutBandwidthRateLimitScheduleResult executePutBandwidthRateLimitSchedule(PutBandwidthRateLimitScheduleRequest putBandwidthRateLimitScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(putBandwidthRateLimitScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutBandwidthRateLimitScheduleRequest> request = null;
        Response<PutBandwidthRateLimitScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutBandwidthRateLimitScheduleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putBandwidthRateLimitScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutBandwidthRateLimitSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutBandwidthRateLimitScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutBandwidthRateLimitScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This action sets the property mappings for the specified hypervisor. A hypervisor property mapping displays the
     * relationship of entity properties available from the on-premises hypervisor to the properties available in Amazon
     * Web Services.
     * </p>
     * 
     * @param putHypervisorPropertyMappingsRequest
     * @return Result of the PutHypervisorPropertyMappings operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws ConflictException
     *         The operation cannot proceed because it is not supported.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws AccessDeniedException
     *         The operation cannot proceed because you have insufficient permissions.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.PutHypervisorPropertyMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/PutHypervisorPropertyMappings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutHypervisorPropertyMappingsResult putHypervisorPropertyMappings(PutHypervisorPropertyMappingsRequest request) {
        request = beforeClientExecution(request);
        return executePutHypervisorPropertyMappings(request);
    }

    @SdkInternalApi
    final PutHypervisorPropertyMappingsResult executePutHypervisorPropertyMappings(PutHypervisorPropertyMappingsRequest putHypervisorPropertyMappingsRequest) {

        ExecutionContext executionContext = createExecutionContext(putHypervisorPropertyMappingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutHypervisorPropertyMappingsRequest> request = null;
        Response<PutHypervisorPropertyMappingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutHypervisorPropertyMappingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putHypervisorPropertyMappingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutHypervisorPropertyMappings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutHypervisorPropertyMappingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutHypervisorPropertyMappingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Set the maintenance start time for a gateway.
     * </p>
     * 
     * @param putMaintenanceStartTimeRequest
     * @return Result of the PutMaintenanceStartTime operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws ConflictException
     *         The operation cannot proceed because it is not supported.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.PutMaintenanceStartTime
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/PutMaintenanceStartTime"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutMaintenanceStartTimeResult putMaintenanceStartTime(PutMaintenanceStartTimeRequest request) {
        request = beforeClientExecution(request);
        return executePutMaintenanceStartTime(request);
    }

    @SdkInternalApi
    final PutMaintenanceStartTimeResult executePutMaintenanceStartTime(PutMaintenanceStartTimeRequest putMaintenanceStartTimeRequest) {

        ExecutionContext executionContext = createExecutionContext(putMaintenanceStartTimeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutMaintenanceStartTimeRequest> request = null;
        Response<PutMaintenanceStartTimeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutMaintenanceStartTimeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putMaintenanceStartTimeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutMaintenanceStartTime");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutMaintenanceStartTimeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutMaintenanceStartTimeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This action sends a request to sync metadata across the specified virtual machines.
     * </p>
     * 
     * @param startVirtualMachinesMetadataSyncRequest
     * @return Result of the StartVirtualMachinesMetadataSync operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws AccessDeniedException
     *         The operation cannot proceed because you have insufficient permissions.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.StartVirtualMachinesMetadataSync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/StartVirtualMachinesMetadataSync"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartVirtualMachinesMetadataSyncResult startVirtualMachinesMetadataSync(StartVirtualMachinesMetadataSyncRequest request) {
        request = beforeClientExecution(request);
        return executeStartVirtualMachinesMetadataSync(request);
    }

    @SdkInternalApi
    final StartVirtualMachinesMetadataSyncResult executeStartVirtualMachinesMetadataSync(
            StartVirtualMachinesMetadataSyncRequest startVirtualMachinesMetadataSyncRequest) {

        ExecutionContext executionContext = createExecutionContext(startVirtualMachinesMetadataSyncRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartVirtualMachinesMetadataSyncRequest> request = null;
        Response<StartVirtualMachinesMetadataSyncResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartVirtualMachinesMetadataSyncRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startVirtualMachinesMetadataSyncRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartVirtualMachinesMetadataSync");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartVirtualMachinesMetadataSyncResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartVirtualMachinesMetadataSyncResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Tag the resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup Gateway");
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
     * Tests your hypervisor configuration to validate that backup gateway can connect with the hypervisor and its
     * resources.
     * </p>
     * 
     * @param testHypervisorConfigurationRequest
     * @return Result of the TestHypervisorConfiguration operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws ConflictException
     *         The operation cannot proceed because it is not supported.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.TestHypervisorConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/TestHypervisorConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public TestHypervisorConfigurationResult testHypervisorConfiguration(TestHypervisorConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeTestHypervisorConfiguration(request);
    }

    @SdkInternalApi
    final TestHypervisorConfigurationResult executeTestHypervisorConfiguration(TestHypervisorConfigurationRequest testHypervisorConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(testHypervisorConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestHypervisorConfigurationRequest> request = null;
        Response<TestHypervisorConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestHypervisorConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(testHypervisorConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TestHypervisorConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TestHypervisorConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new TestHypervisorConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes tags from the resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/UntagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup Gateway");
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
     * Updates a gateway's name. Specify which gateway to update using the Amazon Resource Name (ARN) of the gateway in
     * your request.
     * </p>
     * 
     * @param updateGatewayInformationRequest
     * @return Result of the UpdateGatewayInformation operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws ConflictException
     *         The operation cannot proceed because it is not supported.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.UpdateGatewayInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/UpdateGatewayInformation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateGatewayInformationResult updateGatewayInformation(UpdateGatewayInformationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGatewayInformation(request);
    }

    @SdkInternalApi
    final UpdateGatewayInformationResult executeUpdateGatewayInformation(UpdateGatewayInformationRequest updateGatewayInformationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGatewayInformationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGatewayInformationRequest> request = null;
        Response<UpdateGatewayInformationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGatewayInformationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateGatewayInformationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGatewayInformation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGatewayInformationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateGatewayInformationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the gateway virtual machine (VM) software. The request immediately triggers the software update.
     * </p>
     * <note>
     * <p>
     * When you make this request, you get a <code>200 OK</code> success response immediately. However, it might take
     * some time for the update to complete.
     * </p>
     * </note>
     * 
     * @param updateGatewaySoftwareNowRequest
     * @return Result of the UpdateGatewaySoftwareNow operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.UpdateGatewaySoftwareNow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/UpdateGatewaySoftwareNow"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateGatewaySoftwareNowResult updateGatewaySoftwareNow(UpdateGatewaySoftwareNowRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGatewaySoftwareNow(request);
    }

    @SdkInternalApi
    final UpdateGatewaySoftwareNowResult executeUpdateGatewaySoftwareNow(UpdateGatewaySoftwareNowRequest updateGatewaySoftwareNowRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGatewaySoftwareNowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGatewaySoftwareNowRequest> request = null;
        Response<UpdateGatewaySoftwareNowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGatewaySoftwareNowRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateGatewaySoftwareNowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGatewaySoftwareNow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGatewaySoftwareNowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateGatewaySoftwareNowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a hypervisor metadata, including its host, username, and password. Specify which hypervisor to update
     * using the Amazon Resource Name (ARN) of the hypervisor in your request.
     * </p>
     * 
     * @param updateHypervisorRequest
     * @return Result of the UpdateHypervisor operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws ConflictException
     *         The operation cannot proceed because it is not supported.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws AccessDeniedException
     *         The operation cannot proceed because you have insufficient permissions.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.UpdateHypervisor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/UpdateHypervisor"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateHypervisorResult updateHypervisor(UpdateHypervisorRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateHypervisor(request);
    }

    @SdkInternalApi
    final UpdateHypervisorResult executeUpdateHypervisor(UpdateHypervisorRequest updateHypervisorRequest) {

        ExecutionContext executionContext = createExecutionContext(updateHypervisorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateHypervisorRequest> request = null;
        Response<UpdateHypervisorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateHypervisorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateHypervisorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Backup Gateway");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateHypervisor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateHypervisorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateHypervisorResultJsonUnmarshaller());
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
