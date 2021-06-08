/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2instanceconnect;

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

import com.amazonaws.services.ec2instanceconnect.AWSEC2InstanceConnectClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.ec2instanceconnect.model.*;
import com.amazonaws.services.ec2instanceconnect.model.transform.*;

/**
 * Client for accessing EC2 Instance Connect. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Amazon EC2 Instance Connect enables system administrators to publish one-time use SSH public keys to EC2, providing
 * users a simple and secure way to connect to their instances.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSEC2InstanceConnectClient extends AmazonWebServiceClient implements AWSEC2InstanceConnect {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSEC2InstanceConnect.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "ec2-instance-connect";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EC2InstanceTypeInvalidException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ec2instanceconnect.model.transform.EC2InstanceTypeInvalidExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AuthException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ec2instanceconnect.model.transform.AuthExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SerialConsoleSessionLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ec2instanceconnect.model.transform.SerialConsoleSessionLimitExceededExceptionUnmarshaller
                                            .getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SerialConsoleAccessDisabledException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ec2instanceconnect.model.transform.SerialConsoleAccessDisabledExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SerialConsoleSessionUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ec2instanceconnect.model.transform.SerialConsoleSessionUnavailableExceptionUnmarshaller
                                            .getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ec2instanceconnect.model.transform.ServiceExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ec2instanceconnect.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EC2InstanceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ec2instanceconnect.model.transform.EC2InstanceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidArgsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ec2instanceconnect.model.transform.InvalidArgsExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.ec2instanceconnect.model.AWSEC2InstanceConnectException.class));

    public static AWSEC2InstanceConnectClientBuilder builder() {
        return AWSEC2InstanceConnectClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on EC2 Instance Connect using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSEC2InstanceConnectClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on EC2 Instance Connect using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSEC2InstanceConnectClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("ec2-instance-connect.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/ec2instanceconnect/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/ec2instanceconnect/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Pushes an SSH public key to the specified EC2 instance for use by the specified user. The key remains for 60
     * seconds. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Connect-using-EC2-Instance-Connect.html">Connect to
     * your Linux instance using EC2 Instance Connect</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param sendSSHPublicKeyRequest
     * @return Result of the SendSSHPublicKey operation returned by the service.
     * @throws AuthException
     *         Either your AWS credentials are not valid or you do not have access to the EC2 instance.
     * @throws InvalidArgsException
     *         One of the parameters is not valid.
     * @throws ServiceException
     *         The service encountered an error. Follow the instructions in the error message and try again.
     * @throws ThrottlingException
     *         The requests were made too frequently and have been throttled. Wait a while and try again. To increase
     *         the limit on your request frequency, contact AWS Support.
     * @throws EC2InstanceNotFoundException
     *         The specified instance was not found.
     * @sample AWSEC2InstanceConnect.SendSSHPublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-instance-connect-2018-04-02/SendSSHPublicKey"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SendSSHPublicKeyResult sendSSHPublicKey(SendSSHPublicKeyRequest request) {
        request = beforeClientExecution(request);
        return executeSendSSHPublicKey(request);
    }

    @SdkInternalApi
    final SendSSHPublicKeyResult executeSendSSHPublicKey(SendSSHPublicKeyRequest sendSSHPublicKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(sendSSHPublicKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendSSHPublicKeyRequest> request = null;
        Response<SendSSHPublicKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendSSHPublicKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(sendSSHPublicKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EC2 Instance Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendSSHPublicKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendSSHPublicKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SendSSHPublicKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Pushes an SSH public key to the specified EC2 instance. The key remains for 60 seconds, which gives you 60
     * seconds to establish a serial console connection to the instance using SSH. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-serial-console.html">EC2 Serial Console</a> in the
     * <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param sendSerialConsoleSSHPublicKeyRequest
     * @return Result of the SendSerialConsoleSSHPublicKey operation returned by the service.
     * @throws AuthException
     *         Either your AWS credentials are not valid or you do not have access to the EC2 instance.
     * @throws SerialConsoleAccessDisabledException
     *         Your account is not authorized to use the EC2 Serial Console. To authorize your account, run the
     *         EnableSerialConsoleAccess API. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EnableSerialConsoleAccess.html"
     *         >EnableSerialConsoleAccess</a> in the <i>Amazon EC2 API Reference</i>.
     * @throws InvalidArgsException
     *         One of the parameters is not valid.
     * @throws ServiceException
     *         The service encountered an error. Follow the instructions in the error message and try again.
     * @throws ThrottlingException
     *         The requests were made too frequently and have been throttled. Wait a while and try again. To increase
     *         the limit on your request frequency, contact AWS Support.
     * @throws EC2InstanceNotFoundException
     *         The specified instance was not found.
     * @throws EC2InstanceTypeInvalidException
     *         The instance type is not supported for connecting via the serial console. Only Nitro instance types are
     *         currently supported.
     * @throws SerialConsoleSessionLimitExceededException
     *         The instance currently has 1 active serial console session. Only 1 session is supported at a time.
     * @throws SerialConsoleSessionUnavailableException
     *         Unable to start a serial console session. Please try again.
     * @sample AWSEC2InstanceConnect.SendSerialConsoleSSHPublicKey
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/ec2-instance-connect-2018-04-02/SendSerialConsoleSSHPublicKey"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SendSerialConsoleSSHPublicKeyResult sendSerialConsoleSSHPublicKey(SendSerialConsoleSSHPublicKeyRequest request) {
        request = beforeClientExecution(request);
        return executeSendSerialConsoleSSHPublicKey(request);
    }

    @SdkInternalApi
    final SendSerialConsoleSSHPublicKeyResult executeSendSerialConsoleSSHPublicKey(SendSerialConsoleSSHPublicKeyRequest sendSerialConsoleSSHPublicKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(sendSerialConsoleSSHPublicKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendSerialConsoleSSHPublicKeyRequest> request = null;
        Response<SendSerialConsoleSSHPublicKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendSerialConsoleSSHPublicKeyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(sendSerialConsoleSSHPublicKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EC2 Instance Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendSerialConsoleSSHPublicKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendSerialConsoleSSHPublicKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SendSerialConsoleSSHPublicKeyResultJsonUnmarshaller());
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
