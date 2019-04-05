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
package com.amazonaws.services.pinpointemail;

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

import com.amazonaws.services.pinpointemail.AmazonPinpointEmailClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.pinpointemail.model.*;
import com.amazonaws.services.pinpointemail.model.transform.*;

/**
 * Client for accessing Pinpoint Email. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <fullname>Amazon Pinpoint Email Service</fullname>
 * <p>
 * This document contains reference information for the <a href="https://aws.amazon.com/pinpoint">Amazon Pinpoint</a>
 * Email API, version 1.0. This document is best used in conjunction with the <a
 * href="https://docs.aws.amazon.com/pinpoint/latest/developerguide/welcome.html">Amazon Pinpoint Developer Guide</a>.
 * </p>
 * <p>
 * The Amazon Pinpoint Email API is available in the US East (N. Virginia), US West (Oregon), EU (Frankfurt), and EU
 * (Ireland) Regions at the following endpoints:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>US East (N. Virginia)</b>: <code>email.us-east-1.amazonaws.com</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>US West (Oregon)</b>: <code>email.us-west-2.amazonaws.com</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>EU (Frankfurt)</b>: <code>email.eu-central-1.amazonaws.com</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>EU (Ireland)</b>: <code>email.eu-west-1.amazonaws.com</code>
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonPinpointEmailClient extends AmazonWebServiceClient implements AmazonPinpointEmail {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonPinpointEmail.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "ses";

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
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentModificationException").withModeledClass(
                                    com.amazonaws.services.pinpointemail.model.ConcurrentModificationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MessageRejected").withModeledClass(
                                    com.amazonaws.services.pinpointemail.model.MessageRejectedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                                    com.amazonaws.services.pinpointemail.model.NotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SendingPausedException").withModeledClass(
                                    com.amazonaws.services.pinpointemail.model.SendingPausedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.pinpointemail.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccountSuspendedException").withModeledClass(
                                    com.amazonaws.services.pinpointemail.model.AccountSuspendedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.pinpointemail.model.AlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withModeledClass(
                                    com.amazonaws.services.pinpointemail.model.TooManyRequestsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MailFromDomainNotVerifiedException").withModeledClass(
                                    com.amazonaws.services.pinpointemail.model.MailFromDomainNotVerifiedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withModeledClass(
                                    com.amazonaws.services.pinpointemail.model.BadRequestException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.pinpointemail.model.AmazonPinpointEmailException.class));

    public static AmazonPinpointEmailClientBuilder builder() {
        return AmazonPinpointEmailClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Pinpoint Email using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonPinpointEmailClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Pinpoint Email using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonPinpointEmailClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("email.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/pinpointemail/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/pinpointemail/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Create a configuration set. <i>Configuration sets</i> are groups of rules that you can apply to the emails you
     * send using Amazon Pinpoint. You apply a configuration set to an email by including a reference to the
     * configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules
     * in that configuration set are applied to the email.
     * </p>
     * 
     * @param createConfigurationSetRequest
     *        A request to create a configuration set.
     * @return Result of the CreateConfigurationSet operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource specified in your request already exists.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @sample AmazonPinpointEmail.CreateConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/CreateConfigurationSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateConfigurationSetResult createConfigurationSet(CreateConfigurationSetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConfigurationSet(request);
    }

    @SdkInternalApi
    final CreateConfigurationSetResult executeCreateConfigurationSet(CreateConfigurationSetRequest createConfigurationSetRequest) {

        ExecutionContext executionContext = createExecutionContext(createConfigurationSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConfigurationSetRequest> request = null;
        Response<CreateConfigurationSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConfigurationSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createConfigurationSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateConfigurationSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateConfigurationSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateConfigurationSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create an event destination. In Amazon Pinpoint, <i>events</i> include message sends, deliveries, opens, clicks,
     * bounces, and complaints. <i>Event destinations</i> are places that you can send information about these events
     * to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or
     * complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
     * </p>
     * <p>
     * A single configuration set can include more than one event destination.
     * </p>
     * 
     * @param createConfigurationSetEventDestinationRequest
     *        A request to add an event destination to a configuration set.
     * @return Result of the CreateConfigurationSetEventDestination operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws AlreadyExistsException
     *         The resource specified in your request already exists.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.CreateConfigurationSetEventDestination
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/CreateConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateConfigurationSetEventDestinationResult createConfigurationSetEventDestination(CreateConfigurationSetEventDestinationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConfigurationSetEventDestination(request);
    }

    @SdkInternalApi
    final CreateConfigurationSetEventDestinationResult executeCreateConfigurationSetEventDestination(
            CreateConfigurationSetEventDestinationRequest createConfigurationSetEventDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(createConfigurationSetEventDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConfigurationSetEventDestinationRequest> request = null;
        Response<CreateConfigurationSetEventDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConfigurationSetEventDestinationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createConfigurationSetEventDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateConfigurationSetEventDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateConfigurationSetEventDestinationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateConfigurationSetEventDestinationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a new pool of dedicated IP addresses. A pool can include one or more dedicated IP addresses that are
     * associated with your Amazon Pinpoint account. You can associate a pool with a configuration set. When you send an
     * email that uses that configuration set, Amazon Pinpoint sends it using only the IP addresses in the associated
     * pool.
     * </p>
     * 
     * @param createDedicatedIpPoolRequest
     *        A request to create a new dedicated IP pool.
     * @return Result of the CreateDedicatedIpPool operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource specified in your request already exists.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @sample AmazonPinpointEmail.CreateDedicatedIpPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/CreateDedicatedIpPool"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDedicatedIpPoolResult createDedicatedIpPool(CreateDedicatedIpPoolRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDedicatedIpPool(request);
    }

    @SdkInternalApi
    final CreateDedicatedIpPoolResult executeCreateDedicatedIpPool(CreateDedicatedIpPoolRequest createDedicatedIpPoolRequest) {

        ExecutionContext executionContext = createExecutionContext(createDedicatedIpPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDedicatedIpPoolRequest> request = null;
        Response<CreateDedicatedIpPoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDedicatedIpPoolRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDedicatedIpPoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDedicatedIpPool");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDedicatedIpPoolResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateDedicatedIpPoolResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a new predictive inbox placement test. Predictive inbox placement tests can help you predict how your
     * messages will be handled by various email providers around the world. When you perform a predictive inbox
     * placement test, you provide a sample message that contains the content that you plan to send to your customers.
     * Amazon Pinpoint then sends that message to special email addresses spread across several major email providers.
     * After about 24 hours, the test is complete, and you can use the <code>GetDeliverabilityTestReport</code>
     * operation to view the results of the test.
     * </p>
     * 
     * @param createDeliverabilityTestReportRequest
     *        A request to perform a predictive inbox placement test. Predictive inbox placement tests can help you
     *        predict how your messages will be handled by various email providers around the world. When you perform a
     *        predictive inbox placement test, you provide a sample message that contains the content that you plan to
     *        send to your customers. Amazon Pinpoint then sends that message to special email addresses spread across
     *        several major email providers. After about 24 hours, the test is complete, and you can use the
     *        <code>GetDeliverabilityTestReport</code> operation to view the results of the test.
     * @return Result of the CreateDeliverabilityTestReport operation returned by the service.
     * @throws AccountSuspendedException
     *         The message can't be sent because the account's ability to send email has been permanently restricted.
     * @throws SendingPausedException
     *         The message can't be sent because the account's ability to send email is currently paused.
     * @throws MessageRejectedException
     *         The message can't be sent because it contains invalid content.
     * @throws MailFromDomainNotVerifiedException
     *         The message can't be sent because the sending domain isn't verified.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @sample AmazonPinpointEmail.CreateDeliverabilityTestReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/CreateDeliverabilityTestReport"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDeliverabilityTestReportResult createDeliverabilityTestReport(CreateDeliverabilityTestReportRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDeliverabilityTestReport(request);
    }

    @SdkInternalApi
    final CreateDeliverabilityTestReportResult executeCreateDeliverabilityTestReport(CreateDeliverabilityTestReportRequest createDeliverabilityTestReportRequest) {

        ExecutionContext executionContext = createExecutionContext(createDeliverabilityTestReportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeliverabilityTestReportRequest> request = null;
        Response<CreateDeliverabilityTestReportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeliverabilityTestReportRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createDeliverabilityTestReportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDeliverabilityTestReport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDeliverabilityTestReportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateDeliverabilityTestReportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Verifies an email identity for use with Amazon Pinpoint. In Amazon Pinpoint, an identity is an email address or
     * domain that you use when you send email. Before you can use an identity to send email with Amazon Pinpoint, you
     * first have to verify it. By verifying an address, you demonstrate that you're the owner of the address, and that
     * you've given Amazon Pinpoint permission to send email from the address.
     * </p>
     * <p>
     * When you verify an email address, Amazon Pinpoint sends an email to the address. Your email address is verified
     * as soon as you follow the link in the verification email.
     * </p>
     * <p>
     * When you verify a domain, this operation provides a set of DKIM tokens, which you can convert into CNAME tokens.
     * You add these CNAME tokens to the DNS configuration for your domain. Your domain is verified when Amazon Pinpoint
     * detects these records in the DNS configuration for your domain. It usually takes around 72 hours to complete the
     * domain verification process.
     * </p>
     * 
     * @param createEmailIdentityRequest
     *        A request to begin the verification process for an email identity (an email address or domain).
     * @return Result of the CreateEmailIdentity operation returned by the service.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @sample AmazonPinpointEmail.CreateEmailIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/CreateEmailIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateEmailIdentityResult createEmailIdentity(CreateEmailIdentityRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEmailIdentity(request);
    }

    @SdkInternalApi
    final CreateEmailIdentityResult executeCreateEmailIdentity(CreateEmailIdentityRequest createEmailIdentityRequest) {

        ExecutionContext executionContext = createExecutionContext(createEmailIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEmailIdentityRequest> request = null;
        Response<CreateEmailIdentityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEmailIdentityRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createEmailIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEmailIdentity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEmailIdentityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateEmailIdentityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete an existing configuration set.
     * </p>
     * <p>
     * In Amazon Pinpoint, <i>configuration sets</i> are groups of rules that you can apply to the emails you send. You
     * apply a configuration set to an email by including a reference to the configuration set in the headers of the
     * email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to
     * the email.
     * </p>
     * 
     * @param deleteConfigurationSetRequest
     *        A request to delete a configuration set.
     * @return Result of the DeleteConfigurationSet operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @sample AmazonPinpointEmail.DeleteConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/DeleteConfigurationSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteConfigurationSetResult deleteConfigurationSet(DeleteConfigurationSetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConfigurationSet(request);
    }

    @SdkInternalApi
    final DeleteConfigurationSetResult executeDeleteConfigurationSet(DeleteConfigurationSetRequest deleteConfigurationSetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConfigurationSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConfigurationSetRequest> request = null;
        Response<DeleteConfigurationSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConfigurationSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteConfigurationSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConfigurationSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConfigurationSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteConfigurationSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete an event destination.
     * </p>
     * <p>
     * In Amazon Pinpoint, <i>events</i> include message sends, deliveries, opens, clicks, bounces, and complaints.
     * <i>Event destinations</i> are places that you can send information about these events to. For example, you can
     * send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use
     * Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
     * </p>
     * 
     * @param deleteConfigurationSetEventDestinationRequest
     *        A request to delete an event destination from a configuration set.
     * @return Result of the DeleteConfigurationSetEventDestination operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.DeleteConfigurationSetEventDestination
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/DeleteConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteConfigurationSetEventDestinationResult deleteConfigurationSetEventDestination(DeleteConfigurationSetEventDestinationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConfigurationSetEventDestination(request);
    }

    @SdkInternalApi
    final DeleteConfigurationSetEventDestinationResult executeDeleteConfigurationSetEventDestination(
            DeleteConfigurationSetEventDestinationRequest deleteConfigurationSetEventDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConfigurationSetEventDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConfigurationSetEventDestinationRequest> request = null;
        Response<DeleteConfigurationSetEventDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConfigurationSetEventDestinationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteConfigurationSetEventDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConfigurationSetEventDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConfigurationSetEventDestinationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteConfigurationSetEventDestinationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a dedicated IP pool.
     * </p>
     * 
     * @param deleteDedicatedIpPoolRequest
     *        A request to delete a dedicated IP pool.
     * @return Result of the DeleteDedicatedIpPool operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @sample AmazonPinpointEmail.DeleteDedicatedIpPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/DeleteDedicatedIpPool"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDedicatedIpPoolResult deleteDedicatedIpPool(DeleteDedicatedIpPoolRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDedicatedIpPool(request);
    }

    @SdkInternalApi
    final DeleteDedicatedIpPoolResult executeDeleteDedicatedIpPool(DeleteDedicatedIpPoolRequest deleteDedicatedIpPoolRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDedicatedIpPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDedicatedIpPoolRequest> request = null;
        Response<DeleteDedicatedIpPoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDedicatedIpPoolRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDedicatedIpPoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDedicatedIpPool");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDedicatedIpPoolResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteDedicatedIpPoolResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an email identity that you previously verified for use with Amazon Pinpoint. An identity can be either an
     * email address or a domain name.
     * </p>
     * 
     * @param deleteEmailIdentityRequest
     *        A request to delete an existing email identity. When you delete an identity, you lose the ability to use
     *        Amazon Pinpoint to send email from that identity. You can restore your ability to send email by completing
     *        the verification process for the identity again.
     * @return Result of the DeleteEmailIdentity operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @sample AmazonPinpointEmail.DeleteEmailIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/DeleteEmailIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteEmailIdentityResult deleteEmailIdentity(DeleteEmailIdentityRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEmailIdentity(request);
    }

    @SdkInternalApi
    final DeleteEmailIdentityResult executeDeleteEmailIdentity(DeleteEmailIdentityRequest deleteEmailIdentityRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEmailIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEmailIdentityRequest> request = null;
        Response<DeleteEmailIdentityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEmailIdentityRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteEmailIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEmailIdentity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEmailIdentityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteEmailIdentityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Obtain information about the email-sending status and capabilities of your Amazon Pinpoint account in the current
     * AWS Region.
     * </p>
     * 
     * @param getAccountRequest
     *        A request to obtain information about the email-sending capabilities of your Amazon Pinpoint account.
     * @return Result of the GetAccount operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.GetAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetAccount" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAccountResult getAccount(GetAccountRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccount(request);
    }

    @SdkInternalApi
    final GetAccountResult executeGetAccount(GetAccountRequest getAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccountRequest> request = null;
        Response<GetAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccountRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAccountResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieve a list of the blacklists that your dedicated IP addresses appear on.
     * </p>
     * 
     * @param getBlacklistReportsRequest
     *        A request to retrieve a list of the blacklists that your dedicated IP addresses appear on.
     * @return Result of the GetBlacklistReports operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.GetBlacklistReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetBlacklistReports"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetBlacklistReportsResult getBlacklistReports(GetBlacklistReportsRequest request) {
        request = beforeClientExecution(request);
        return executeGetBlacklistReports(request);
    }

    @SdkInternalApi
    final GetBlacklistReportsResult executeGetBlacklistReports(GetBlacklistReportsRequest getBlacklistReportsRequest) {

        ExecutionContext executionContext = createExecutionContext(getBlacklistReportsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBlacklistReportsRequest> request = null;
        Response<GetBlacklistReportsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBlacklistReportsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBlacklistReportsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBlacklistReports");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBlacklistReportsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBlacklistReportsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get information about an existing configuration set, including the dedicated IP pool that it's associated with,
     * whether or not it's enabled for sending email, and more.
     * </p>
     * <p>
     * In Amazon Pinpoint, <i>configuration sets</i> are groups of rules that you can apply to the emails you send. You
     * apply a configuration set to an email by including a reference to the configuration set in the headers of the
     * email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to
     * the email.
     * </p>
     * 
     * @param getConfigurationSetRequest
     *        A request to obtain information about a configuration set.
     * @return Result of the GetConfigurationSet operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.GetConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetConfigurationSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetConfigurationSetResult getConfigurationSet(GetConfigurationSetRequest request) {
        request = beforeClientExecution(request);
        return executeGetConfigurationSet(request);
    }

    @SdkInternalApi
    final GetConfigurationSetResult executeGetConfigurationSet(GetConfigurationSetRequest getConfigurationSetRequest) {

        ExecutionContext executionContext = createExecutionContext(getConfigurationSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConfigurationSetRequest> request = null;
        Response<GetConfigurationSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConfigurationSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getConfigurationSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetConfigurationSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConfigurationSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetConfigurationSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieve a list of event destinations that are associated with a configuration set.
     * </p>
     * <p>
     * In Amazon Pinpoint, <i>events</i> include message sends, deliveries, opens, clicks, bounces, and complaints.
     * <i>Event destinations</i> are places that you can send information about these events to. For example, you can
     * send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use
     * Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
     * </p>
     * 
     * @param getConfigurationSetEventDestinationsRequest
     *        A request to obtain information about the event destinations for a configuration set.
     * @return Result of the GetConfigurationSetEventDestinations operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.GetConfigurationSetEventDestinations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetConfigurationSetEventDestinations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetConfigurationSetEventDestinationsResult getConfigurationSetEventDestinations(GetConfigurationSetEventDestinationsRequest request) {
        request = beforeClientExecution(request);
        return executeGetConfigurationSetEventDestinations(request);
    }

    @SdkInternalApi
    final GetConfigurationSetEventDestinationsResult executeGetConfigurationSetEventDestinations(
            GetConfigurationSetEventDestinationsRequest getConfigurationSetEventDestinationsRequest) {

        ExecutionContext executionContext = createExecutionContext(getConfigurationSetEventDestinationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConfigurationSetEventDestinationsRequest> request = null;
        Response<GetConfigurationSetEventDestinationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConfigurationSetEventDestinationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getConfigurationSetEventDestinationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetConfigurationSetEventDestinations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConfigurationSetEventDestinationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetConfigurationSetEventDestinationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get information about a dedicated IP address, including the name of the dedicated IP pool that it's associated
     * with, as well information about the automatic warm-up process for the address.
     * </p>
     * 
     * @param getDedicatedIpRequest
     *        A request to obtain more information about a dedicated IP address.
     * @return Result of the GetDedicatedIp operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.GetDedicatedIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetDedicatedIp" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetDedicatedIpResult getDedicatedIp(GetDedicatedIpRequest request) {
        request = beforeClientExecution(request);
        return executeGetDedicatedIp(request);
    }

    @SdkInternalApi
    final GetDedicatedIpResult executeGetDedicatedIp(GetDedicatedIpRequest getDedicatedIpRequest) {

        ExecutionContext executionContext = createExecutionContext(getDedicatedIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDedicatedIpRequest> request = null;
        Response<GetDedicatedIpResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDedicatedIpRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDedicatedIpRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDedicatedIp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDedicatedIpResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDedicatedIpResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the dedicated IP addresses that are associated with your Amazon Pinpoint account.
     * </p>
     * 
     * @param getDedicatedIpsRequest
     *        A request to obtain more information about dedicated IP pools.
     * @return Result of the GetDedicatedIps operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.GetDedicatedIps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetDedicatedIps" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetDedicatedIpsResult getDedicatedIps(GetDedicatedIpsRequest request) {
        request = beforeClientExecution(request);
        return executeGetDedicatedIps(request);
    }

    @SdkInternalApi
    final GetDedicatedIpsResult executeGetDedicatedIps(GetDedicatedIpsRequest getDedicatedIpsRequest) {

        ExecutionContext executionContext = createExecutionContext(getDedicatedIpsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDedicatedIpsRequest> request = null;
        Response<GetDedicatedIpsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDedicatedIpsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDedicatedIpsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDedicatedIps");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDedicatedIpsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDedicatedIpsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Show the status of the Deliverability dashboard. When the Deliverability dashboard is enabled, you gain access to
     * reputation metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to
     * perform predictive inbox placement tests.
     * </p>
     * <p>
     * When you use the Deliverability dashboard, you pay a monthly charge of USD$1,250.00, in addition to any other
     * fees that you accrue by using Amazon Pinpoint. If you enable the Deliverability dashboard after the first day of
     * a calendar month, AWS prorates the monthly charge based on how many days have elapsed in the current calendar
     * month.
     * </p>
     * 
     * @param getDeliverabilityDashboardOptionsRequest
     *        A request to retrieve the status of the Deliverability dashboard for your account. When the Deliverability
     *        dashboard is enabled, you gain access to reputation metrics for the domains that you use to send email
     *        using Amazon Pinpoint. You also gain the ability to perform predictive inbox placement tests.</p>
     *        <p>
     *        When you use the Deliverability dashboard, you pay a monthly charge of USD$1,250.00, in addition to any
     *        other fees that you accrue by using Amazon Pinpoint. If you enable the Deliverability dashboard after the
     *        first day of a calendar month, AWS prorates the monthly charge based on how many days have elapsed in the
     *        current calendar month.
     * @return Result of the GetDeliverabilityDashboardOptions operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.GetDeliverabilityDashboardOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetDeliverabilityDashboardOptions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDeliverabilityDashboardOptionsResult getDeliverabilityDashboardOptions(GetDeliverabilityDashboardOptionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetDeliverabilityDashboardOptions(request);
    }

    @SdkInternalApi
    final GetDeliverabilityDashboardOptionsResult executeGetDeliverabilityDashboardOptions(
            GetDeliverabilityDashboardOptionsRequest getDeliverabilityDashboardOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getDeliverabilityDashboardOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeliverabilityDashboardOptionsRequest> request = null;
        Response<GetDeliverabilityDashboardOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeliverabilityDashboardOptionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getDeliverabilityDashboardOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDeliverabilityDashboardOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDeliverabilityDashboardOptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDeliverabilityDashboardOptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieve the results of a predictive inbox placement test.
     * </p>
     * 
     * @param getDeliverabilityTestReportRequest
     *        A request to retrieve the results of a predictive inbox placement test.
     * @return Result of the GetDeliverabilityTestReport operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.GetDeliverabilityTestReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetDeliverabilityTestReport"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDeliverabilityTestReportResult getDeliverabilityTestReport(GetDeliverabilityTestReportRequest request) {
        request = beforeClientExecution(request);
        return executeGetDeliverabilityTestReport(request);
    }

    @SdkInternalApi
    final GetDeliverabilityTestReportResult executeGetDeliverabilityTestReport(GetDeliverabilityTestReportRequest getDeliverabilityTestReportRequest) {

        ExecutionContext executionContext = createExecutionContext(getDeliverabilityTestReportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeliverabilityTestReportRequest> request = null;
        Response<GetDeliverabilityTestReportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeliverabilityTestReportRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getDeliverabilityTestReportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDeliverabilityTestReport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDeliverabilityTestReportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDeliverabilityTestReportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieve inbox placement and engagement rates for the domains that you use to send email.
     * </p>
     * 
     * @param getDomainStatisticsReportRequest
     *        A request to obtain deliverability metrics for a domain.
     * @return Result of the GetDomainStatisticsReport operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.GetDomainStatisticsReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetDomainStatisticsReport"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDomainStatisticsReportResult getDomainStatisticsReport(GetDomainStatisticsReportRequest request) {
        request = beforeClientExecution(request);
        return executeGetDomainStatisticsReport(request);
    }

    @SdkInternalApi
    final GetDomainStatisticsReportResult executeGetDomainStatisticsReport(GetDomainStatisticsReportRequest getDomainStatisticsReportRequest) {

        ExecutionContext executionContext = createExecutionContext(getDomainStatisticsReportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDomainStatisticsReportRequest> request = null;
        Response<GetDomainStatisticsReportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDomainStatisticsReportRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getDomainStatisticsReportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDomainStatisticsReport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDomainStatisticsReportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDomainStatisticsReportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about a specific identity associated with your Amazon Pinpoint account, including the
     * identity's verification status, its DKIM authentication status, and its custom Mail-From settings.
     * </p>
     * 
     * @param getEmailIdentityRequest
     *        A request to return details about an email identity.
     * @return Result of the GetEmailIdentity operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.GetEmailIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetEmailIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetEmailIdentityResult getEmailIdentity(GetEmailIdentityRequest request) {
        request = beforeClientExecution(request);
        return executeGetEmailIdentity(request);
    }

    @SdkInternalApi
    final GetEmailIdentityResult executeGetEmailIdentity(GetEmailIdentityRequest getEmailIdentityRequest) {

        ExecutionContext executionContext = createExecutionContext(getEmailIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEmailIdentityRequest> request = null;
        Response<GetEmailIdentityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEmailIdentityRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEmailIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEmailIdentity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEmailIdentityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEmailIdentityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all of the configuration sets associated with your Amazon Pinpoint account in the current region.
     * </p>
     * <p>
     * In Amazon Pinpoint, <i>configuration sets</i> are groups of rules that you can apply to the emails you send. You
     * apply a configuration set to an email by including a reference to the configuration set in the headers of the
     * email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to
     * the email.
     * </p>
     * 
     * @param listConfigurationSetsRequest
     *        A request to obtain a list of configuration sets for your Amazon Pinpoint account in the current AWS
     *        Region.
     * @return Result of the ListConfigurationSets operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.ListConfigurationSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/ListConfigurationSets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListConfigurationSetsResult listConfigurationSets(ListConfigurationSetsRequest request) {
        request = beforeClientExecution(request);
        return executeListConfigurationSets(request);
    }

    @SdkInternalApi
    final ListConfigurationSetsResult executeListConfigurationSets(ListConfigurationSetsRequest listConfigurationSetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listConfigurationSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListConfigurationSetsRequest> request = null;
        Response<ListConfigurationSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListConfigurationSetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listConfigurationSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListConfigurationSets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListConfigurationSetsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListConfigurationSetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all of the dedicated IP pools that exist in your Amazon Pinpoint account in the current AWS Region.
     * </p>
     * 
     * @param listDedicatedIpPoolsRequest
     *        A request to obtain a list of dedicated IP pools.
     * @return Result of the ListDedicatedIpPools operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.ListDedicatedIpPools
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/ListDedicatedIpPools"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDedicatedIpPoolsResult listDedicatedIpPools(ListDedicatedIpPoolsRequest request) {
        request = beforeClientExecution(request);
        return executeListDedicatedIpPools(request);
    }

    @SdkInternalApi
    final ListDedicatedIpPoolsResult executeListDedicatedIpPools(ListDedicatedIpPoolsRequest listDedicatedIpPoolsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDedicatedIpPoolsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDedicatedIpPoolsRequest> request = null;
        Response<ListDedicatedIpPoolsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDedicatedIpPoolsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDedicatedIpPoolsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDedicatedIpPools");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDedicatedIpPoolsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDedicatedIpPoolsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Show a list of the predictive inbox placement tests that you've performed, regardless of their statuses. For
     * predictive inbox placement tests that are complete, you can use the <code>GetDeliverabilityTestReport</code>
     * operation to view the results.
     * </p>
     * 
     * @param listDeliverabilityTestReportsRequest
     *        A request to list all of the predictive inbox placement tests that you've performed.
     * @return Result of the ListDeliverabilityTestReports operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.ListDeliverabilityTestReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/ListDeliverabilityTestReports"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDeliverabilityTestReportsResult listDeliverabilityTestReports(ListDeliverabilityTestReportsRequest request) {
        request = beforeClientExecution(request);
        return executeListDeliverabilityTestReports(request);
    }

    @SdkInternalApi
    final ListDeliverabilityTestReportsResult executeListDeliverabilityTestReports(ListDeliverabilityTestReportsRequest listDeliverabilityTestReportsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDeliverabilityTestReportsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeliverabilityTestReportsRequest> request = null;
        Response<ListDeliverabilityTestReportsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeliverabilityTestReportsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listDeliverabilityTestReportsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDeliverabilityTestReports");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDeliverabilityTestReportsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListDeliverabilityTestReportsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all of the email identities that are associated with your Amazon Pinpoint account. An identity
     * can be either an email address or a domain. This operation returns identities that are verified as well as those
     * that aren't.
     * </p>
     * 
     * @param listEmailIdentitiesRequest
     *        A request to list all of the email identities associated with your Amazon Pinpoint account. This list
     *        includes identities that you've already verified, identities that are unverified, and identities that were
     *        verified in the past, but are no longer verified.
     * @return Result of the ListEmailIdentities operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.ListEmailIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/ListEmailIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEmailIdentitiesResult listEmailIdentities(ListEmailIdentitiesRequest request) {
        request = beforeClientExecution(request);
        return executeListEmailIdentities(request);
    }

    @SdkInternalApi
    final ListEmailIdentitiesResult executeListEmailIdentities(ListEmailIdentitiesRequest listEmailIdentitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(listEmailIdentitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEmailIdentitiesRequest> request = null;
        Response<ListEmailIdentitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEmailIdentitiesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEmailIdentitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEmailIdentities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEmailIdentitiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEmailIdentitiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieve a list of the tags (keys and values) that are associated with a specific resource. A <i>tag</i> is a
     * label that you optionally define and associate with a resource in Amazon Pinpoint. Each tag consists of a
     * required <i>tag key</i> and an optional associated <i>tag value</i>. A tag key is a general label that acts as a
     * category for more specific tag values. A tag value acts as a descriptor within a tag key.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @sample AmazonPinpointEmail.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
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
     * Enable or disable the automatic warm-up feature for dedicated IP addresses.
     * </p>
     * 
     * @param putAccountDedicatedIpWarmupAttributesRequest
     *        A request to enable or disable the automatic IP address warm-up feature.
     * @return Result of the PutAccountDedicatedIpWarmupAttributes operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.PutAccountDedicatedIpWarmupAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutAccountDedicatedIpWarmupAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutAccountDedicatedIpWarmupAttributesResult putAccountDedicatedIpWarmupAttributes(PutAccountDedicatedIpWarmupAttributesRequest request) {
        request = beforeClientExecution(request);
        return executePutAccountDedicatedIpWarmupAttributes(request);
    }

    @SdkInternalApi
    final PutAccountDedicatedIpWarmupAttributesResult executePutAccountDedicatedIpWarmupAttributes(
            PutAccountDedicatedIpWarmupAttributesRequest putAccountDedicatedIpWarmupAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(putAccountDedicatedIpWarmupAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAccountDedicatedIpWarmupAttributesRequest> request = null;
        Response<PutAccountDedicatedIpWarmupAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAccountDedicatedIpWarmupAttributesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putAccountDedicatedIpWarmupAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutAccountDedicatedIpWarmupAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutAccountDedicatedIpWarmupAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutAccountDedicatedIpWarmupAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enable or disable the ability of your account to send email.
     * </p>
     * 
     * @param putAccountSendingAttributesRequest
     *        A request to change the ability of your account to send email.
     * @return Result of the PutAccountSendingAttributes operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.PutAccountSendingAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutAccountSendingAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutAccountSendingAttributesResult putAccountSendingAttributes(PutAccountSendingAttributesRequest request) {
        request = beforeClientExecution(request);
        return executePutAccountSendingAttributes(request);
    }

    @SdkInternalApi
    final PutAccountSendingAttributesResult executePutAccountSendingAttributes(PutAccountSendingAttributesRequest putAccountSendingAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(putAccountSendingAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAccountSendingAttributesRequest> request = null;
        Response<PutAccountSendingAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAccountSendingAttributesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putAccountSendingAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutAccountSendingAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutAccountSendingAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutAccountSendingAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associate a configuration set with a dedicated IP pool. You can use dedicated IP pools to create groups of
     * dedicated IP addresses for sending specific types of email.
     * </p>
     * 
     * @param putConfigurationSetDeliveryOptionsRequest
     *        A request to associate a configuration set with a dedicated IP pool.
     * @return Result of the PutConfigurationSetDeliveryOptions operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.PutConfigurationSetDeliveryOptions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutConfigurationSetDeliveryOptions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutConfigurationSetDeliveryOptionsResult putConfigurationSetDeliveryOptions(PutConfigurationSetDeliveryOptionsRequest request) {
        request = beforeClientExecution(request);
        return executePutConfigurationSetDeliveryOptions(request);
    }

    @SdkInternalApi
    final PutConfigurationSetDeliveryOptionsResult executePutConfigurationSetDeliveryOptions(
            PutConfigurationSetDeliveryOptionsRequest putConfigurationSetDeliveryOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(putConfigurationSetDeliveryOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutConfigurationSetDeliveryOptionsRequest> request = null;
        Response<PutConfigurationSetDeliveryOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutConfigurationSetDeliveryOptionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putConfigurationSetDeliveryOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutConfigurationSetDeliveryOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutConfigurationSetDeliveryOptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutConfigurationSetDeliveryOptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enable or disable collection of reputation metrics for emails that you send using a particular configuration set
     * in a specific AWS Region.
     * </p>
     * 
     * @param putConfigurationSetReputationOptionsRequest
     *        A request to enable or disable tracking of reputation metrics for a configuration set.
     * @return Result of the PutConfigurationSetReputationOptions operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.PutConfigurationSetReputationOptions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutConfigurationSetReputationOptions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutConfigurationSetReputationOptionsResult putConfigurationSetReputationOptions(PutConfigurationSetReputationOptionsRequest request) {
        request = beforeClientExecution(request);
        return executePutConfigurationSetReputationOptions(request);
    }

    @SdkInternalApi
    final PutConfigurationSetReputationOptionsResult executePutConfigurationSetReputationOptions(
            PutConfigurationSetReputationOptionsRequest putConfigurationSetReputationOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(putConfigurationSetReputationOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutConfigurationSetReputationOptionsRequest> request = null;
        Response<PutConfigurationSetReputationOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutConfigurationSetReputationOptionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putConfigurationSetReputationOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutConfigurationSetReputationOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutConfigurationSetReputationOptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutConfigurationSetReputationOptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enable or disable email sending for messages that use a particular configuration set in a specific AWS Region.
     * </p>
     * 
     * @param putConfigurationSetSendingOptionsRequest
     *        A request to enable or disable the ability of Amazon Pinpoint to send emails that use a specific
     *        configuration set.
     * @return Result of the PutConfigurationSetSendingOptions operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.PutConfigurationSetSendingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutConfigurationSetSendingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutConfigurationSetSendingOptionsResult putConfigurationSetSendingOptions(PutConfigurationSetSendingOptionsRequest request) {
        request = beforeClientExecution(request);
        return executePutConfigurationSetSendingOptions(request);
    }

    @SdkInternalApi
    final PutConfigurationSetSendingOptionsResult executePutConfigurationSetSendingOptions(
            PutConfigurationSetSendingOptionsRequest putConfigurationSetSendingOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(putConfigurationSetSendingOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutConfigurationSetSendingOptionsRequest> request = null;
        Response<PutConfigurationSetSendingOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutConfigurationSetSendingOptionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putConfigurationSetSendingOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutConfigurationSetSendingOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutConfigurationSetSendingOptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutConfigurationSetSendingOptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Specify a custom domain to use for open and click tracking elements in email that you send using Amazon Pinpoint.
     * </p>
     * 
     * @param putConfigurationSetTrackingOptionsRequest
     *        A request to add a custom domain for tracking open and click events to a configuration set.
     * @return Result of the PutConfigurationSetTrackingOptions operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.PutConfigurationSetTrackingOptions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutConfigurationSetTrackingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutConfigurationSetTrackingOptionsResult putConfigurationSetTrackingOptions(PutConfigurationSetTrackingOptionsRequest request) {
        request = beforeClientExecution(request);
        return executePutConfigurationSetTrackingOptions(request);
    }

    @SdkInternalApi
    final PutConfigurationSetTrackingOptionsResult executePutConfigurationSetTrackingOptions(
            PutConfigurationSetTrackingOptionsRequest putConfigurationSetTrackingOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(putConfigurationSetTrackingOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutConfigurationSetTrackingOptionsRequest> request = null;
        Response<PutConfigurationSetTrackingOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutConfigurationSetTrackingOptionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putConfigurationSetTrackingOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutConfigurationSetTrackingOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutConfigurationSetTrackingOptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutConfigurationSetTrackingOptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Move a dedicated IP address to an existing dedicated IP pool.
     * </p>
     * <note>
     * <p>
     * The dedicated IP address that you specify must already exist, and must be associated with your Amazon Pinpoint
     * account.
     * </p>
     * <p>
     * The dedicated IP pool you specify must already exist. You can create a new pool by using the
     * <code>CreateDedicatedIpPool</code> operation.
     * </p>
     * </note>
     * 
     * @param putDedicatedIpInPoolRequest
     *        A request to move a dedicated IP address to a dedicated IP pool.
     * @return Result of the PutDedicatedIpInPool operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.PutDedicatedIpInPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutDedicatedIpInPool"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutDedicatedIpInPoolResult putDedicatedIpInPool(PutDedicatedIpInPoolRequest request) {
        request = beforeClientExecution(request);
        return executePutDedicatedIpInPool(request);
    }

    @SdkInternalApi
    final PutDedicatedIpInPoolResult executePutDedicatedIpInPool(PutDedicatedIpInPoolRequest putDedicatedIpInPoolRequest) {

        ExecutionContext executionContext = createExecutionContext(putDedicatedIpInPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutDedicatedIpInPoolRequest> request = null;
        Response<PutDedicatedIpInPoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutDedicatedIpInPoolRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putDedicatedIpInPoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutDedicatedIpInPool");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutDedicatedIpInPoolResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutDedicatedIpInPoolResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p/>
     * 
     * @param putDedicatedIpWarmupAttributesRequest
     *        A request to change the warm-up attributes for a dedicated IP address. This operation is useful when you
     *        want to resume the warm-up process for an existing IP address.
     * @return Result of the PutDedicatedIpWarmupAttributes operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.PutDedicatedIpWarmupAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutDedicatedIpWarmupAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutDedicatedIpWarmupAttributesResult putDedicatedIpWarmupAttributes(PutDedicatedIpWarmupAttributesRequest request) {
        request = beforeClientExecution(request);
        return executePutDedicatedIpWarmupAttributes(request);
    }

    @SdkInternalApi
    final PutDedicatedIpWarmupAttributesResult executePutDedicatedIpWarmupAttributes(PutDedicatedIpWarmupAttributesRequest putDedicatedIpWarmupAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(putDedicatedIpWarmupAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutDedicatedIpWarmupAttributesRequest> request = null;
        Response<PutDedicatedIpWarmupAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutDedicatedIpWarmupAttributesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putDedicatedIpWarmupAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutDedicatedIpWarmupAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutDedicatedIpWarmupAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutDedicatedIpWarmupAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enable or disable the Deliverability dashboard. When you enable the Deliverability dashboard, you gain access to
     * reputation metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to
     * perform predictive inbox placement tests.
     * </p>
     * <p>
     * When you use the Deliverability dashboard, you pay a monthly charge of USD$1,250.00, in addition to any other
     * fees that you accrue by using Amazon Pinpoint. If you enable the Deliverability dashboard after the first day of
     * a calendar month, we prorate the monthly charge based on how many days have elapsed in the current calendar
     * month.
     * </p>
     * 
     * @param putDeliverabilityDashboardOptionRequest
     *        A request to enable or disable the Deliverability dashboard. When you enable the Deliverability dashboard,
     *        you gain access to reputation metrics for the domains that you use to send email using Amazon Pinpoint.
     *        You also gain the ability to perform predictive inbox placement tests.</p>
     *        <p>
     *        When you use the Deliverability dashboard, you pay a monthly charge of USD$1,250.00, in addition to any
     *        other fees that you accrue by using Amazon Pinpoint. If you enable the Deliverability dashboard after the
     *        first day of a calendar month, we prorate the monthly charge based on how many days have elapsed in the
     *        current calendar month.
     * @return Result of the PutDeliverabilityDashboardOption operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource specified in your request already exists.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.PutDeliverabilityDashboardOption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutDeliverabilityDashboardOption"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutDeliverabilityDashboardOptionResult putDeliverabilityDashboardOption(PutDeliverabilityDashboardOptionRequest request) {
        request = beforeClientExecution(request);
        return executePutDeliverabilityDashboardOption(request);
    }

    @SdkInternalApi
    final PutDeliverabilityDashboardOptionResult executePutDeliverabilityDashboardOption(
            PutDeliverabilityDashboardOptionRequest putDeliverabilityDashboardOptionRequest) {

        ExecutionContext executionContext = createExecutionContext(putDeliverabilityDashboardOptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutDeliverabilityDashboardOptionRequest> request = null;
        Response<PutDeliverabilityDashboardOptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutDeliverabilityDashboardOptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putDeliverabilityDashboardOptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutDeliverabilityDashboardOption");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutDeliverabilityDashboardOptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutDeliverabilityDashboardOptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used to enable or disable DKIM authentication for an email identity.
     * </p>
     * 
     * @param putEmailIdentityDkimAttributesRequest
     *        A request to enable or disable DKIM signing of email that you send from an email identity.
     * @return Result of the PutEmailIdentityDkimAttributes operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.PutEmailIdentityDkimAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutEmailIdentityDkimAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutEmailIdentityDkimAttributesResult putEmailIdentityDkimAttributes(PutEmailIdentityDkimAttributesRequest request) {
        request = beforeClientExecution(request);
        return executePutEmailIdentityDkimAttributes(request);
    }

    @SdkInternalApi
    final PutEmailIdentityDkimAttributesResult executePutEmailIdentityDkimAttributes(PutEmailIdentityDkimAttributesRequest putEmailIdentityDkimAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(putEmailIdentityDkimAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutEmailIdentityDkimAttributesRequest> request = null;
        Response<PutEmailIdentityDkimAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutEmailIdentityDkimAttributesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putEmailIdentityDkimAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutEmailIdentityDkimAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutEmailIdentityDkimAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutEmailIdentityDkimAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used to enable or disable feedback forwarding for an identity. This setting determines what happens when an
     * identity is used to send an email that results in a bounce or complaint event.
     * </p>
     * <p>
     * When you enable feedback forwarding, Amazon Pinpoint sends you email notifications when bounce or complaint
     * events occur. Amazon Pinpoint sends this notification to the address that you specified in the Return-Path header
     * of the original email.
     * </p>
     * <p>
     * When you disable feedback forwarding, Amazon Pinpoint sends notifications through other mechanisms, such as by
     * notifying an Amazon SNS topic. You're required to have a method of tracking bounces and complaints. If you
     * haven't set up another mechanism for receiving bounce or complaint notifications, Amazon Pinpoint sends an email
     * notification when these events occur (even if this setting is disabled).
     * </p>
     * 
     * @param putEmailIdentityFeedbackAttributesRequest
     *        A request to set the attributes that control how bounce and complaint events are processed.
     * @return Result of the PutEmailIdentityFeedbackAttributes operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.PutEmailIdentityFeedbackAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutEmailIdentityFeedbackAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutEmailIdentityFeedbackAttributesResult putEmailIdentityFeedbackAttributes(PutEmailIdentityFeedbackAttributesRequest request) {
        request = beforeClientExecution(request);
        return executePutEmailIdentityFeedbackAttributes(request);
    }

    @SdkInternalApi
    final PutEmailIdentityFeedbackAttributesResult executePutEmailIdentityFeedbackAttributes(
            PutEmailIdentityFeedbackAttributesRequest putEmailIdentityFeedbackAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(putEmailIdentityFeedbackAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutEmailIdentityFeedbackAttributesRequest> request = null;
        Response<PutEmailIdentityFeedbackAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutEmailIdentityFeedbackAttributesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putEmailIdentityFeedbackAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutEmailIdentityFeedbackAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutEmailIdentityFeedbackAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutEmailIdentityFeedbackAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used to enable or disable the custom Mail-From domain configuration for an email identity.
     * </p>
     * 
     * @param putEmailIdentityMailFromAttributesRequest
     *        A request to configure the custom MAIL FROM domain for a verified identity.
     * @return Result of the PutEmailIdentityMailFromAttributes operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.PutEmailIdentityMailFromAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutEmailIdentityMailFromAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutEmailIdentityMailFromAttributesResult putEmailIdentityMailFromAttributes(PutEmailIdentityMailFromAttributesRequest request) {
        request = beforeClientExecution(request);
        return executePutEmailIdentityMailFromAttributes(request);
    }

    @SdkInternalApi
    final PutEmailIdentityMailFromAttributesResult executePutEmailIdentityMailFromAttributes(
            PutEmailIdentityMailFromAttributesRequest putEmailIdentityMailFromAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(putEmailIdentityMailFromAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutEmailIdentityMailFromAttributesRequest> request = null;
        Response<PutEmailIdentityMailFromAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutEmailIdentityMailFromAttributesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putEmailIdentityMailFromAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutEmailIdentityMailFromAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutEmailIdentityMailFromAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutEmailIdentityMailFromAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends an email message. You can use the Amazon Pinpoint Email API to send two types of messages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Simple</b> – A standard email message. When you create this type of message, you specify the sender, the
     * recipient, and the message body, and Amazon Pinpoint assembles the message for you.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Raw</b> – A raw, MIME-formatted email message. When you send this type of email, you have to specify all of
     * the message headers, as well as the message body. You can use this message type to send messages that contain
     * attachments. The message that you specify has to be a valid MIME message.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sendEmailRequest
     *        A request to send an email message.
     * @return Result of the SendEmail operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws AccountSuspendedException
     *         The message can't be sent because the account's ability to send email has been permanently restricted.
     * @throws SendingPausedException
     *         The message can't be sent because the account's ability to send email is currently paused.
     * @throws MessageRejectedException
     *         The message can't be sent because it contains invalid content.
     * @throws MailFromDomainNotVerifiedException
     *         The message can't be sent because the sending domain isn't verified.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.SendEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/SendEmail" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SendEmailResult sendEmail(SendEmailRequest request) {
        request = beforeClientExecution(request);
        return executeSendEmail(request);
    }

    @SdkInternalApi
    final SendEmailResult executeSendEmail(SendEmailRequest sendEmailRequest) {

        ExecutionContext executionContext = createExecutionContext(sendEmailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendEmailRequest> request = null;
        Response<SendEmailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendEmailRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(sendEmailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendEmail");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendEmailResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new SendEmailResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Add one or more tags (keys and values) to one or more specified resources. A <i>tag</i> is a label that you
     * optionally define and associate with a resource in Amazon Pinpoint. Tags can help you categorize and manage
     * resources in different ways, such as by purpose, owner, environment, or other criteria. A resource can have as
     * many as 50 tags.
     * </p>
     * <p>
     * Each tag consists of a required <i>tag key</i> and an associated <i>tag value</i>, both of which you define. A
     * tag key is a general label that acts as a category for more specific tag values. A tag value acts as a descriptor
     * within a tag key.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @sample AmazonPinpointEmail.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
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
     * Remove one or more tags (keys and values) from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @sample AmazonPinpointEmail.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/UntagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
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
     * Update the configuration of an event destination for a configuration set.
     * </p>
     * <p>
     * In Amazon Pinpoint, <i>events</i> include message sends, deliveries, opens, clicks, bounces, and complaints.
     * <i>Event destinations</i> are places that you can send information about these events to. For example, you can
     * send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use
     * Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
     * </p>
     * 
     * @param updateConfigurationSetEventDestinationRequest
     *        A request to change the settings for an event destination for a configuration set.
     * @return Result of the UpdateConfigurationSetEventDestination operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonPinpointEmail.UpdateConfigurationSetEventDestination
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/UpdateConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateConfigurationSetEventDestinationResult updateConfigurationSetEventDestination(UpdateConfigurationSetEventDestinationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateConfigurationSetEventDestination(request);
    }

    @SdkInternalApi
    final UpdateConfigurationSetEventDestinationResult executeUpdateConfigurationSetEventDestination(
            UpdateConfigurationSetEventDestinationRequest updateConfigurationSetEventDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateConfigurationSetEventDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConfigurationSetEventDestinationRequest> request = null;
        Response<UpdateConfigurationSetEventDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConfigurationSetEventDestinationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateConfigurationSetEventDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint Email");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateConfigurationSetEventDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateConfigurationSetEventDestinationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateConfigurationSetEventDestinationResultJsonUnmarshaller());
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
