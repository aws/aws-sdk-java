/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemailv2;

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

import com.amazonaws.services.simpleemailv2.AmazonSimpleEmailServiceV2ClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.simpleemailv2.model.*;
import com.amazonaws.services.simpleemailv2.model.transform.*;

/**
 * Client for accessing Amazon SES V2. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <fullname>Amazon SES API v2</fullname>
 * <p>
 * Welcome to the Amazon SES API v2 Reference. This guide provides information about the Amazon SES API v2, including
 * supported operations, data types, parameters, and schemas.
 * </p>
 * <p>
 * <a href="https://aws.amazon.com/pinpoint">Amazon SES</a> is an AWS service that you can use to send email messages to
 * your customers.
 * </p>
 * <p>
 * If you're new to Amazon SES API v2, you might find it helpful to also review the <a
 * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/">Amazon Simple Email Service Developer Guide</a>. The
 * <i>Amazon SES Developer Guide</i> provides information and code samples that demonstrate how to use Amazon SES API v2
 * features programmatically.
 * </p>
 * <p>
 * The Amazon SES API v2 is available in several AWS Regions and it provides an endpoint for each of these Regions. For
 * a list of all the Regions and endpoints where the API is currently available, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#ses_region">AWS Service Endpoints</a> in the <i>Amazon
 * Web Services General Reference</i>. To learn more about AWS Regions, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html">Managing AWS Regions</a> in the <i>Amazon Web
 * Services General Reference</i>.
 * </p>
 * <p>
 * In each Region, AWS maintains multiple Availability Zones. These Availability Zones are physically isolated from each
 * other, but are united by private, low-latency, high-throughput, and highly redundant network connections. These
 * Availability Zones enable us to provide very high levels of availability and redundancy, while also minimizing
 * latency. To learn more about the number of Availability Zones that are available in each Region, see <a
 * href="http://aws.amazon.com/about-aws/global-infrastructure/">AWS Global Infrastructure</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonSimpleEmailServiceV2Client extends AmazonWebServiceClient implements AmazonSimpleEmailServiceV2 {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonSimpleEmailServiceV2.class);

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
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentModificationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.simpleemailv2.model.transform.ConcurrentModificationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MessageRejected").withExceptionUnmarshaller(
                                    com.amazonaws.services.simpleemailv2.model.transform.MessageRejectedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.simpleemailv2.model.transform.InvalidNextTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.simpleemailv2.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccountSuspendedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.simpleemailv2.model.transform.AccountSuspendedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.simpleemailv2.model.transform.AlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MailFromDomainNotVerifiedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.simpleemailv2.model.transform.MailFromDomainNotVerifiedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.simpleemailv2.model.transform.NotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SendingPausedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.simpleemailv2.model.transform.SendingPausedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.simpleemailv2.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.simpleemailv2.model.transform.TooManyRequestsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.simpleemailv2.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.simpleemailv2.model.AmazonSimpleEmailServiceV2Exception.class));

    public static AmazonSimpleEmailServiceV2ClientBuilder builder() {
        return AmazonSimpleEmailServiceV2ClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SES V2 using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonSimpleEmailServiceV2Client(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SES V2 using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonSimpleEmailServiceV2Client(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
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
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/simpleemailv2/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/simpleemailv2/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Create a configuration set. <i>Configuration sets</i> are groups of rules that you can apply to the emails that
     * you send. You apply a configuration set to an email by specifying the name of the configuration set when you call
     * the Amazon SES API v2. When you apply a configuration set to an email, all of the rules in that configuration set
     * are applied to the email.
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
     * @sample AmazonSimpleEmailServiceV2.CreateConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateConfigurationSet" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * Create an event destination. <i>Events</i> include message sends, deliveries, opens, clicks, bounces, and
     * complaints. <i>Event destinations</i> are places that you can send information about these events to. For
     * example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints,
     * or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
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
     * @sample AmazonSimpleEmailServiceV2.CreateConfigurationSetEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateConfigurationSetEventDestination"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * Creates a new custom verification email template.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-verify-address-custom.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createCustomVerificationEmailTemplateRequest
     *        Represents a request to create a custom verification email template.
     * @return Result of the CreateCustomVerificationEmailTemplate operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws AlreadyExistsException
     *         The resource specified in your request already exists.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @sample AmazonSimpleEmailServiceV2.CreateCustomVerificationEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateCustomVerificationEmailTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateCustomVerificationEmailTemplateResult createCustomVerificationEmailTemplate(CreateCustomVerificationEmailTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCustomVerificationEmailTemplate(request);
    }

    @SdkInternalApi
    final CreateCustomVerificationEmailTemplateResult executeCreateCustomVerificationEmailTemplate(
            CreateCustomVerificationEmailTemplateRequest createCustomVerificationEmailTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(createCustomVerificationEmailTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCustomVerificationEmailTemplateRequest> request = null;
        Response<CreateCustomVerificationEmailTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCustomVerificationEmailTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createCustomVerificationEmailTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCustomVerificationEmailTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCustomVerificationEmailTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateCustomVerificationEmailTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a new pool of dedicated IP addresses. A pool can include one or more dedicated IP addresses that are
     * associated with your AWS account. You can associate a pool with a configuration set. When you send an email that
     * uses that configuration set, the message is sent from one of the addresses in the associated pool.
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
     * @sample AmazonSimpleEmailServiceV2.CreateDedicatedIpPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateDedicatedIpPool" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * Amazon SES then sends that message to special email addresses spread across several major email providers. After
     * about 24 hours, the test is complete, and you can use the <code>GetDeliverabilityTestReport</code> operation to
     * view the results of the test.
     * </p>
     * 
     * @param createDeliverabilityTestReportRequest
     *        A request to perform a predictive inbox placement test. Predictive inbox placement tests can help you
     *        predict how your messages will be handled by various email providers around the world. When you perform a
     *        predictive inbox placement test, you provide a sample message that contains the content that you plan to
     *        send to your customers. We send that message to special email addresses spread across several major email
     *        providers around the world. The test takes about 24 hours to complete. When the test is complete, you can
     *        use the <code>GetDeliverabilityTestReport</code> operation to view the results of the test.
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
     * @sample AmazonSimpleEmailServiceV2.CreateDeliverabilityTestReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateDeliverabilityTestReport"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * Starts the process of verifying an email identity. An <i>identity</i> is an email address or domain that you use
     * when you send email. Before you can use an identity to send email, you first have to verify it. By verifying an
     * identity, you demonstrate that you're the owner of the identity, and that you've given Amazon SES API v2
     * permission to send email from the identity.
     * </p>
     * <p>
     * When you verify an email address, Amazon SES sends an email to the address. Your email address is verified as
     * soon as you follow the link in the verification email.
     * </p>
     * <p>
     * When you verify a domain without specifying the <code>DkimSigningAttributes</code> object, this operation
     * provides a set of DKIM tokens. You can convert these tokens into CNAME records, which you then add to the DNS
     * configuration for your domain. Your domain is verified when Amazon SES detects these records in the DNS
     * configuration for your domain. This verification method is known as <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Easy DKIM</a>.
     * </p>
     * <p>
     * Alternatively, you can perform the verification process by providing your own public-private key pair. This
     * verification method is known as Bring Your Own DKIM (BYODKIM). To use BYODKIM, your call to the
     * <code>CreateEmailIdentity</code> operation has to include the <code>DkimSigningAttributes</code> object. When you
     * specify this object, you provide a selector (a component of the DNS record name that identifies the public key
     * that you want to use for DKIM authentication) and a private key.
     * </p>
     * 
     * @param createEmailIdentityRequest
     *        A request to begin the verification process for an email identity (an email address or domain).
     * @return Result of the CreateEmailIdentity operation returned by the service.
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
     * @sample AmazonSimpleEmailServiceV2.CreateEmailIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateEmailIdentity" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * Creates the specified sending authorization policy for the given identity (an email address or a domain).
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to authorize other senders to use its
     * identities. For information about using sending authorization, see the <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createEmailIdentityPolicyRequest
     *        Represents a request to create a sending authorization policy for an identity. Sending authorization is an
     *        Amazon SES feature that enables you to authorize other senders to use your identities. For information,
     *        see the <a href=
     *        "https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-identity-owner-tasks-management.html"
     *        >Amazon SES Developer Guide</a>.
     * @return Result of the CreateEmailIdentityPolicy operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws AlreadyExistsException
     *         The resource specified in your request already exists.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.CreateEmailIdentityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateEmailIdentityPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateEmailIdentityPolicyResult createEmailIdentityPolicy(CreateEmailIdentityPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEmailIdentityPolicy(request);
    }

    @SdkInternalApi
    final CreateEmailIdentityPolicyResult executeCreateEmailIdentityPolicy(CreateEmailIdentityPolicyRequest createEmailIdentityPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(createEmailIdentityPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEmailIdentityPolicyRequest> request = null;
        Response<CreateEmailIdentityPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEmailIdentityPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createEmailIdentityPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEmailIdentityPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEmailIdentityPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateEmailIdentityPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an email template. Email templates enable you to send personalized email to one or more destinations in a
     * single API operation. For more information, see the <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createEmailTemplateRequest
     *        Represents a request to create an email template. For more information, see the <a
     *        href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the CreateEmailTemplate operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource specified in your request already exists.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @sample AmazonSimpleEmailServiceV2.CreateEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateEmailTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateEmailTemplateResult createEmailTemplate(CreateEmailTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEmailTemplate(request);
    }

    @SdkInternalApi
    final CreateEmailTemplateResult executeCreateEmailTemplate(CreateEmailTemplateRequest createEmailTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(createEmailTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEmailTemplateRequest> request = null;
        Response<CreateEmailTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEmailTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createEmailTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEmailTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEmailTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateEmailTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an import job for a data destination.
     * </p>
     * 
     * @param createImportJobRequest
     *        Represents a request to create an import job from a data source for a data destination.
     * @return Result of the CreateImportJob operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @sample AmazonSimpleEmailServiceV2.CreateImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateImportJobResult createImportJob(CreateImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateImportJob(request);
    }

    @SdkInternalApi
    final CreateImportJobResult executeCreateImportJob(CreateImportJobRequest createImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateImportJobRequest> request = null;
        Response<CreateImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateImportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateImportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateImportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateImportJobResultJsonUnmarshaller());
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
     * <i>Configuration sets</i> are groups of rules that you can apply to the emails you send. You apply a
     * configuration set to an email by including a reference to the configuration set in the headers of the email. When
     * you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
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
     * @sample AmazonSimpleEmailServiceV2.DeleteConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteConfigurationSet" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * <i>Events</i> include message sends, deliveries, opens, clicks, bounces, and complaints. <i>Event
     * destinations</i> are places that you can send information about these events to. For example, you can send event
     * data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis
     * Data Firehose to stream data to Amazon S3 for long-term storage.
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
     * @sample AmazonSimpleEmailServiceV2.DeleteConfigurationSetEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteConfigurationSetEventDestination"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * Deletes an existing custom verification email template.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href="https://docs.aws.amazon.com/es/latest/DeveloperGuide/send-email-verify-address-custom.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteCustomVerificationEmailTemplateRequest
     *        Represents a request to delete an existing custom verification email template.
     * @return Result of the DeleteCustomVerificationEmailTemplate operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.DeleteCustomVerificationEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteCustomVerificationEmailTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteCustomVerificationEmailTemplateResult deleteCustomVerificationEmailTemplate(DeleteCustomVerificationEmailTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCustomVerificationEmailTemplate(request);
    }

    @SdkInternalApi
    final DeleteCustomVerificationEmailTemplateResult executeDeleteCustomVerificationEmailTemplate(
            DeleteCustomVerificationEmailTemplateRequest deleteCustomVerificationEmailTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCustomVerificationEmailTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCustomVerificationEmailTemplateRequest> request = null;
        Response<DeleteCustomVerificationEmailTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCustomVerificationEmailTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteCustomVerificationEmailTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCustomVerificationEmailTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCustomVerificationEmailTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteCustomVerificationEmailTemplateResultJsonUnmarshaller());
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
     * @sample AmazonSimpleEmailServiceV2.DeleteDedicatedIpPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteDedicatedIpPool" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * Deletes an email identity. An identity can be either an email address or a domain name.
     * </p>
     * 
     * @param deleteEmailIdentityRequest
     *        A request to delete an existing email identity. When you delete an identity, you lose the ability to send
     *        email from that identity. You can restore your ability to send email by completing the verification
     *        process for the identity again.
     * @return Result of the DeleteEmailIdentity operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConcurrentModificationException
     *         The resource is being modified by another operation or thread.
     * @sample AmazonSimpleEmailServiceV2.DeleteEmailIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteEmailIdentity" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * Deletes the specified sending authorization policy for the given identity (an email address or a domain). This
     * API returns successfully even if a policy with the specified name does not exist.
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to authorize other senders to use its
     * identities. For information about using sending authorization, see the <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteEmailIdentityPolicyRequest
     *        Represents a request to delete a sending authorization policy for an identity. Sending authorization is an
     *        Amazon SES feature that enables you to authorize other senders to use your identities. For information,
     *        see the <a href=
     *        "https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-identity-owner-tasks-management.html"
     *        >Amazon SES Developer Guide</a>.
     * @return Result of the DeleteEmailIdentityPolicy operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.DeleteEmailIdentityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteEmailIdentityPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteEmailIdentityPolicyResult deleteEmailIdentityPolicy(DeleteEmailIdentityPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEmailIdentityPolicy(request);
    }

    @SdkInternalApi
    final DeleteEmailIdentityPolicyResult executeDeleteEmailIdentityPolicy(DeleteEmailIdentityPolicyRequest deleteEmailIdentityPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEmailIdentityPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEmailIdentityPolicyRequest> request = null;
        Response<DeleteEmailIdentityPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEmailIdentityPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteEmailIdentityPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEmailIdentityPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEmailIdentityPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteEmailIdentityPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an email template.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteEmailTemplateRequest
     *        Represents a request to delete an email template. For more information, see the <a
     *        href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the DeleteEmailTemplate operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.DeleteEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteEmailTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteEmailTemplateResult deleteEmailTemplate(DeleteEmailTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEmailTemplate(request);
    }

    @SdkInternalApi
    final DeleteEmailTemplateResult executeDeleteEmailTemplate(DeleteEmailTemplateRequest deleteEmailTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEmailTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEmailTemplateRequest> request = null;
        Response<DeleteEmailTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEmailTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteEmailTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEmailTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEmailTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteEmailTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes an email address from the suppression list for your account.
     * </p>
     * 
     * @param deleteSuppressedDestinationRequest
     *        A request to remove an email address from the suppression list for your account.
     * @return Result of the DeleteSuppressedDestination operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @sample AmazonSimpleEmailServiceV2.DeleteSuppressedDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteSuppressedDestination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSuppressedDestinationResult deleteSuppressedDestination(DeleteSuppressedDestinationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSuppressedDestination(request);
    }

    @SdkInternalApi
    final DeleteSuppressedDestinationResult executeDeleteSuppressedDestination(DeleteSuppressedDestinationRequest deleteSuppressedDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSuppressedDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSuppressedDestinationRequest> request = null;
        Response<DeleteSuppressedDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSuppressedDestinationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteSuppressedDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSuppressedDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSuppressedDestinationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteSuppressedDestinationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Obtain information about the email-sending status and capabilities of your Amazon SES account in the current AWS
     * Region.
     * </p>
     * 
     * @param getAccountRequest
     *        A request to obtain information about the email-sending capabilities of your Amazon SES account.
     * @return Result of the GetAccount operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.GetAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetAccount" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * @sample AmazonSimpleEmailServiceV2.GetBlacklistReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetBlacklistReports" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * <i>Configuration sets</i> are groups of rules that you can apply to the emails you send. You apply a
     * configuration set to an email by including a reference to the configuration set in the headers of the email. When
     * you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
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
     * @sample AmazonSimpleEmailServiceV2.GetConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetConfigurationSet" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * <i>Events</i> include message sends, deliveries, opens, clicks, bounces, and complaints. <i>Event
     * destinations</i> are places that you can send information about these events to. For example, you can send event
     * data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis
     * Data Firehose to stream data to Amazon S3 for long-term storage.
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
     * @sample AmazonSimpleEmailServiceV2.GetConfigurationSetEventDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetConfigurationSetEventDestinations"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * Returns the custom email verification template for the template name you specify.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-verify-address-custom.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getCustomVerificationEmailTemplateRequest
     *        Represents a request to retrieve an existing custom verification email template.
     * @return Result of the GetCustomVerificationEmailTemplate operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.GetCustomVerificationEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetCustomVerificationEmailTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCustomVerificationEmailTemplateResult getCustomVerificationEmailTemplate(GetCustomVerificationEmailTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGetCustomVerificationEmailTemplate(request);
    }

    @SdkInternalApi
    final GetCustomVerificationEmailTemplateResult executeGetCustomVerificationEmailTemplate(
            GetCustomVerificationEmailTemplateRequest getCustomVerificationEmailTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(getCustomVerificationEmailTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCustomVerificationEmailTemplateRequest> request = null;
        Response<GetCustomVerificationEmailTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCustomVerificationEmailTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getCustomVerificationEmailTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCustomVerificationEmailTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCustomVerificationEmailTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetCustomVerificationEmailTemplateResultJsonUnmarshaller());
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
     * @sample AmazonSimpleEmailServiceV2.GetDedicatedIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetDedicatedIp" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * List the dedicated IP addresses that are associated with your AWS account.
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
     * @sample AmazonSimpleEmailServiceV2.GetDedicatedIps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetDedicatedIps" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * Retrieve information about the status of the Deliverability dashboard for your account. When the Deliverability
     * dashboard is enabled, you gain access to reputation, deliverability, and other metrics for the domains that you
     * use to send email. You also gain the ability to perform predictive inbox placement tests.
     * </p>
     * <p>
     * When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other fees
     * that you accrue by using Amazon SES and other AWS services. For more information about the features and cost of a
     * Deliverability dashboard subscription, see <a href="http://aws.amazon.com/ses/pricing/">Amazon SES Pricing</a>.
     * </p>
     * 
     * @param getDeliverabilityDashboardOptionsRequest
     *        Retrieve information about the status of the Deliverability dashboard for your AWS account. When the
     *        Deliverability dashboard is enabled, you gain access to reputation, deliverability, and other metrics for
     *        your domains. You also gain the ability to perform predictive inbox placement tests.</p>
     *        <p>
     *        When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other
     *        fees that you accrue by using Amazon SES and other AWS services. For more information about the features
     *        and cost of a Deliverability dashboard subscription, see <a
     *        href="http://aws.amazon.com/pinpoint/pricing/">Amazon Pinpoint Pricing</a>.
     * @return Result of the GetDeliverabilityDashboardOptions operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.GetDeliverabilityDashboardOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetDeliverabilityDashboardOptions"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * @sample AmazonSimpleEmailServiceV2.GetDeliverabilityTestReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetDeliverabilityTestReport"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * Retrieve all the deliverability data for a specific campaign. This data is available for a campaign only if the
     * campaign sent email by using a domain that the Deliverability dashboard is enabled for.
     * </p>
     * 
     * @param getDomainDeliverabilityCampaignRequest
     *        Retrieve all the deliverability data for a specific campaign. This data is available for a campaign only
     *        if the campaign sent email by using a domain that the Deliverability dashboard is enabled for (
     *        <code>PutDeliverabilityDashboardOption</code> operation).
     * @return Result of the GetDomainDeliverabilityCampaign operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @sample AmazonSimpleEmailServiceV2.GetDomainDeliverabilityCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetDomainDeliverabilityCampaign"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDomainDeliverabilityCampaignResult getDomainDeliverabilityCampaign(GetDomainDeliverabilityCampaignRequest request) {
        request = beforeClientExecution(request);
        return executeGetDomainDeliverabilityCampaign(request);
    }

    @SdkInternalApi
    final GetDomainDeliverabilityCampaignResult executeGetDomainDeliverabilityCampaign(
            GetDomainDeliverabilityCampaignRequest getDomainDeliverabilityCampaignRequest) {

        ExecutionContext executionContext = createExecutionContext(getDomainDeliverabilityCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDomainDeliverabilityCampaignRequest> request = null;
        Response<GetDomainDeliverabilityCampaignResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDomainDeliverabilityCampaignRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getDomainDeliverabilityCampaignRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDomainDeliverabilityCampaign");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDomainDeliverabilityCampaignResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDomainDeliverabilityCampaignResultJsonUnmarshaller());
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
     * @sample AmazonSimpleEmailServiceV2.GetDomainStatisticsReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetDomainStatisticsReport"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * Provides information about a specific identity, including the identity's verification status, sending
     * authorization policies, its DKIM authentication status, and its custom Mail-From settings.
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
     * @sample AmazonSimpleEmailServiceV2.GetEmailIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetEmailIdentity" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * Returns the requested sending authorization policies for the given identity (an email address or a domain). The
     * policies are returned as a map of policy names to policy contents. You can retrieve a maximum of 20 policies at a
     * time.
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to authorize other senders to use its
     * identities. For information about using sending authorization, see the <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getEmailIdentityPoliciesRequest
     *        A request to return the policies of an email identity.
     * @return Result of the GetEmailIdentityPolicies operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.GetEmailIdentityPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetEmailIdentityPolicies" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetEmailIdentityPoliciesResult getEmailIdentityPolicies(GetEmailIdentityPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeGetEmailIdentityPolicies(request);
    }

    @SdkInternalApi
    final GetEmailIdentityPoliciesResult executeGetEmailIdentityPolicies(GetEmailIdentityPoliciesRequest getEmailIdentityPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(getEmailIdentityPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEmailIdentityPoliciesRequest> request = null;
        Response<GetEmailIdentityPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEmailIdentityPoliciesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getEmailIdentityPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEmailIdentityPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEmailIdentityPoliciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetEmailIdentityPoliciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays the template object (which includes the subject line, HTML part and text part) for the template you
     * specify.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getEmailTemplateRequest
     *        Represents a request to display the template object (which includes the subject line, HTML part and text
     *        part) for the template you specify.
     * @return Result of the GetEmailTemplate operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.GetEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetEmailTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetEmailTemplateResult getEmailTemplate(GetEmailTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGetEmailTemplate(request);
    }

    @SdkInternalApi
    final GetEmailTemplateResult executeGetEmailTemplate(GetEmailTemplateRequest getEmailTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(getEmailTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEmailTemplateRequest> request = null;
        Response<GetEmailTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEmailTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEmailTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEmailTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEmailTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEmailTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about an import job.
     * </p>
     * 
     * @param getImportJobRequest
     *        Represents a request for information about an import job using the import job ID.
     * @return Result of the GetImportJob operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @sample AmazonSimpleEmailServiceV2.GetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetImportJobResult getImportJob(GetImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetImportJob(request);
    }

    @SdkInternalApi
    final GetImportJobResult executeGetImportJob(GetImportJobRequest getImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetImportJobRequest> request = null;
        Response<GetImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetImportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetImportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetImportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a specific email address that's on the suppression list for your account.
     * </p>
     * 
     * @param getSuppressedDestinationRequest
     *        A request to retrieve information about an email address that's on the suppression list for your account.
     * @return Result of the GetSuppressedDestination operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @sample AmazonSimpleEmailServiceV2.GetSuppressedDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetSuppressedDestination" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetSuppressedDestinationResult getSuppressedDestination(GetSuppressedDestinationRequest request) {
        request = beforeClientExecution(request);
        return executeGetSuppressedDestination(request);
    }

    @SdkInternalApi
    final GetSuppressedDestinationResult executeGetSuppressedDestination(GetSuppressedDestinationRequest getSuppressedDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(getSuppressedDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSuppressedDestinationRequest> request = null;
        Response<GetSuppressedDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSuppressedDestinationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getSuppressedDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSuppressedDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSuppressedDestinationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetSuppressedDestinationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all of the configuration sets associated with your account in the current region.
     * </p>
     * <p>
     * <i>Configuration sets</i> are groups of rules that you can apply to the emails you send. You apply a
     * configuration set to an email by including a reference to the configuration set in the headers of the email. When
     * you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
     * </p>
     * 
     * @param listConfigurationSetsRequest
     *        A request to obtain a list of configuration sets for your Amazon SES account in the current AWS Region.
     * @return Result of the ListConfigurationSets operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.ListConfigurationSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListConfigurationSets" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * Lists the existing custom verification email templates for your account in the current AWS Region.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-verify-address-custom.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listCustomVerificationEmailTemplatesRequest
     *        Represents a request to list the existing custom verification email templates for your account.
     * @return Result of the ListCustomVerificationEmailTemplates operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.ListCustomVerificationEmailTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListCustomVerificationEmailTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCustomVerificationEmailTemplatesResult listCustomVerificationEmailTemplates(ListCustomVerificationEmailTemplatesRequest request) {
        request = beforeClientExecution(request);
        return executeListCustomVerificationEmailTemplates(request);
    }

    @SdkInternalApi
    final ListCustomVerificationEmailTemplatesResult executeListCustomVerificationEmailTemplates(
            ListCustomVerificationEmailTemplatesRequest listCustomVerificationEmailTemplatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listCustomVerificationEmailTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCustomVerificationEmailTemplatesRequest> request = null;
        Response<ListCustomVerificationEmailTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCustomVerificationEmailTemplatesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listCustomVerificationEmailTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCustomVerificationEmailTemplates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCustomVerificationEmailTemplatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListCustomVerificationEmailTemplatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all of the dedicated IP pools that exist in your AWS account in the current Region.
     * </p>
     * 
     * @param listDedicatedIpPoolsRequest
     *        A request to obtain a list of dedicated IP pools.
     * @return Result of the ListDedicatedIpPools operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.ListDedicatedIpPools
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListDedicatedIpPools" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * @sample AmazonSimpleEmailServiceV2.ListDeliverabilityTestReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListDeliverabilityTestReports"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * Retrieve deliverability data for all the campaigns that used a specific domain to send email during a specified
     * time range. This data is available for a domain only if you enabled the Deliverability dashboard for the domain.
     * </p>
     * 
     * @param listDomainDeliverabilityCampaignsRequest
     *        Retrieve deliverability data for all the campaigns that used a specific domain to send email during a
     *        specified time range. This data is available for a domain only if you enabled the Deliverability
     *        dashboard.
     * @return Result of the ListDomainDeliverabilityCampaigns operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @sample AmazonSimpleEmailServiceV2.ListDomainDeliverabilityCampaigns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListDomainDeliverabilityCampaigns"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDomainDeliverabilityCampaignsResult listDomainDeliverabilityCampaigns(ListDomainDeliverabilityCampaignsRequest request) {
        request = beforeClientExecution(request);
        return executeListDomainDeliverabilityCampaigns(request);
    }

    @SdkInternalApi
    final ListDomainDeliverabilityCampaignsResult executeListDomainDeliverabilityCampaigns(
            ListDomainDeliverabilityCampaignsRequest listDomainDeliverabilityCampaignsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDomainDeliverabilityCampaignsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDomainDeliverabilityCampaignsRequest> request = null;
        Response<ListDomainDeliverabilityCampaignsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDomainDeliverabilityCampaignsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listDomainDeliverabilityCampaignsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDomainDeliverabilityCampaigns");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDomainDeliverabilityCampaignsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListDomainDeliverabilityCampaignsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all of the email identities that are associated with your AWS account. An identity can be
     * either an email address or a domain. This operation returns identities that are verified as well as those that
     * aren't. This operation returns identities that are associated with Amazon SES and Amazon Pinpoint.
     * </p>
     * 
     * @param listEmailIdentitiesRequest
     *        A request to list all of the email identities associated with your AWS account. This list includes
     *        identities that you've already verified, identities that are unverified, and identities that were verified
     *        in the past, but are no longer verified.
     * @return Result of the ListEmailIdentities operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.ListEmailIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListEmailIdentities" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * Lists the email templates present in your Amazon SES account in the current AWS Region.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listEmailTemplatesRequest
     *        Represents a request to list the email templates present in your Amazon SES account in the current AWS
     *        Region. For more information, see the <a
     *        href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the ListEmailTemplates operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.ListEmailTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListEmailTemplates" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListEmailTemplatesResult listEmailTemplates(ListEmailTemplatesRequest request) {
        request = beforeClientExecution(request);
        return executeListEmailTemplates(request);
    }

    @SdkInternalApi
    final ListEmailTemplatesResult executeListEmailTemplates(ListEmailTemplatesRequest listEmailTemplatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listEmailTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEmailTemplatesRequest> request = null;
        Response<ListEmailTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEmailTemplatesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEmailTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEmailTemplates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEmailTemplatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEmailTemplatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of the import jobs.
     * </p>
     * 
     * @param listImportJobsRequest
     *        Represents a request to list all of the import jobs for a data destination within the specified maximum
     *        number of import jobs.
     * @return Result of the ListImportJobs operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.ListImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListImportJobs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListImportJobsResult listImportJobs(ListImportJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListImportJobs(request);
    }

    @SdkInternalApi
    final ListImportJobsResult executeListImportJobs(ListImportJobsRequest listImportJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listImportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListImportJobsRequest> request = null;
        Response<ListImportJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListImportJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listImportJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListImportJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListImportJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListImportJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of email addresses that are on the suppression list for your account.
     * </p>
     * 
     * @param listSuppressedDestinationsRequest
     *        A request to obtain a list of email destinations that are on the suppression list for your account.
     * @return Result of the ListSuppressedDestinations operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws InvalidNextTokenException
     *         The specified request includes an invalid or expired token.
     * @sample AmazonSimpleEmailServiceV2.ListSuppressedDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListSuppressedDestinations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSuppressedDestinationsResult listSuppressedDestinations(ListSuppressedDestinationsRequest request) {
        request = beforeClientExecution(request);
        return executeListSuppressedDestinations(request);
    }

    @SdkInternalApi
    final ListSuppressedDestinationsResult executeListSuppressedDestinations(ListSuppressedDestinationsRequest listSuppressedDestinationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSuppressedDestinationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSuppressedDestinationsRequest> request = null;
        Response<ListSuppressedDestinationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSuppressedDestinationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSuppressedDestinationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSuppressedDestinations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSuppressedDestinationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSuppressedDestinationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieve a list of the tags (keys and values) that are associated with a specified resource. A <i>tag</i> is a
     * label that you optionally define and associate with a resource. Each tag consists of a required <i>tag
     * key</i> and an optional associated <i>tag value</i>. A tag key is a general label that acts as a category for
     * more specific tag values. A tag value acts as a descriptor within a tag key.
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
     * @sample AmazonSimpleEmailServiceV2.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * @sample AmazonSimpleEmailServiceV2.PutAccountDedicatedIpWarmupAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutAccountDedicatedIpWarmupAttributes"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * Update your Amazon SES account details.
     * </p>
     * 
     * @param putAccountDetailsRequest
     *        A request to submit new account details.
     * @return Result of the PutAccountDetails operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ConflictException
     *         If there is already an ongoing account details update under review.
     * @sample AmazonSimpleEmailServiceV2.PutAccountDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutAccountDetails" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutAccountDetailsResult putAccountDetails(PutAccountDetailsRequest request) {
        request = beforeClientExecution(request);
        return executePutAccountDetails(request);
    }

    @SdkInternalApi
    final PutAccountDetailsResult executePutAccountDetails(PutAccountDetailsRequest putAccountDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(putAccountDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAccountDetailsRequest> request = null;
        Response<PutAccountDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAccountDetailsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putAccountDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutAccountDetails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutAccountDetailsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutAccountDetailsResultJsonUnmarshaller());
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
     * @sample AmazonSimpleEmailServiceV2.PutAccountSendingAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutAccountSendingAttributes"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * Change the settings for the account-level suppression list.
     * </p>
     * 
     * @param putAccountSuppressionAttributesRequest
     *        A request to change your account's suppression preferences.
     * @return Result of the PutAccountSuppressionAttributes operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.PutAccountSuppressionAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutAccountSuppressionAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutAccountSuppressionAttributesResult putAccountSuppressionAttributes(PutAccountSuppressionAttributesRequest request) {
        request = beforeClientExecution(request);
        return executePutAccountSuppressionAttributes(request);
    }

    @SdkInternalApi
    final PutAccountSuppressionAttributesResult executePutAccountSuppressionAttributes(
            PutAccountSuppressionAttributesRequest putAccountSuppressionAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(putAccountSuppressionAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAccountSuppressionAttributesRequest> request = null;
        Response<PutAccountSuppressionAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAccountSuppressionAttributesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putAccountSuppressionAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutAccountSuppressionAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutAccountSuppressionAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutAccountSuppressionAttributesResultJsonUnmarshaller());
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
     * @sample AmazonSimpleEmailServiceV2.PutConfigurationSetDeliveryOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutConfigurationSetDeliveryOptions"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * @sample AmazonSimpleEmailServiceV2.PutConfigurationSetReputationOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutConfigurationSetReputationOptions"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     *        A request to enable or disable the ability of Amazon SES to send emails that use a specific configuration
     *        set.
     * @return Result of the PutConfigurationSetSendingOptions operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.PutConfigurationSetSendingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutConfigurationSetSendingOptions"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * Specify the account suppression list preferences for a configuration set.
     * </p>
     * 
     * @param putConfigurationSetSuppressionOptionsRequest
     *        A request to change the account suppression list preferences for a specific configuration set.
     * @return Result of the PutConfigurationSetSuppressionOptions operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.PutConfigurationSetSuppressionOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutConfigurationSetSuppressionOptions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutConfigurationSetSuppressionOptionsResult putConfigurationSetSuppressionOptions(PutConfigurationSetSuppressionOptionsRequest request) {
        request = beforeClientExecution(request);
        return executePutConfigurationSetSuppressionOptions(request);
    }

    @SdkInternalApi
    final PutConfigurationSetSuppressionOptionsResult executePutConfigurationSetSuppressionOptions(
            PutConfigurationSetSuppressionOptionsRequest putConfigurationSetSuppressionOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(putConfigurationSetSuppressionOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutConfigurationSetSuppressionOptionsRequest> request = null;
        Response<PutConfigurationSetSuppressionOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutConfigurationSetSuppressionOptionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putConfigurationSetSuppressionOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutConfigurationSetSuppressionOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutConfigurationSetSuppressionOptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutConfigurationSetSuppressionOptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Specify a custom domain to use for open and click tracking elements in email that you send.
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
     * @sample AmazonSimpleEmailServiceV2.PutConfigurationSetTrackingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutConfigurationSetTrackingOptions"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * The dedicated IP address that you specify must already exist, and must be associated with your AWS account.
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
     * @sample AmazonSimpleEmailServiceV2.PutDedicatedIpInPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutDedicatedIpInPool" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * @sample AmazonSimpleEmailServiceV2.PutDedicatedIpWarmupAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutDedicatedIpWarmupAttributes"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * reputation, deliverability, and other metrics for the domains that you use to send email. You also gain the
     * ability to perform predictive inbox placement tests.
     * </p>
     * <p>
     * When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other fees
     * that you accrue by using Amazon SES and other AWS services. For more information about the features and cost of a
     * Deliverability dashboard subscription, see <a href="http://aws.amazon.com/ses/pricing/">Amazon SES Pricing</a>.
     * </p>
     * 
     * @param putDeliverabilityDashboardOptionRequest
     *        Enable or disable the Deliverability dashboard. When you enable the Deliverability dashboard, you gain
     *        access to reputation, deliverability, and other metrics for the domains that you use to send email using
     *        Amazon SES API v2. You also gain the ability to perform predictive inbox placement tests.</p>
     *        <p>
     *        When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other
     *        fees that you accrue by using Amazon SES and other AWS services. For more information about the features
     *        and cost of a Deliverability dashboard subscription, see <a
     *        href="http://aws.amazon.com/pinpoint/pricing/">Amazon Pinpoint Pricing</a>.
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
     * @sample AmazonSimpleEmailServiceV2.PutDeliverabilityDashboardOption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutDeliverabilityDashboardOption"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * @sample AmazonSimpleEmailServiceV2.PutEmailIdentityDkimAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutEmailIdentityDkimAttributes"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * Used to configure or change the DKIM authentication settings for an email domain identity. You can use this
     * operation to do any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Update the signing attributes for an identity that uses Bring Your Own DKIM (BYODKIM).
     * </p>
     * </li>
     * <li>
     * <p>
     * Change from using no DKIM authentication to using Easy DKIM.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change from using no DKIM authentication to using BYODKIM.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change from using Easy DKIM to using BYODKIM.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change from using BYODKIM to using Easy DKIM.
     * </p>
     * </li>
     * </ul>
     * 
     * @param putEmailIdentityDkimSigningAttributesRequest
     *        A request to change the DKIM attributes for an email identity.
     * @return Result of the PutEmailIdentityDkimSigningAttributes operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.PutEmailIdentityDkimSigningAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutEmailIdentityDkimSigningAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutEmailIdentityDkimSigningAttributesResult putEmailIdentityDkimSigningAttributes(PutEmailIdentityDkimSigningAttributesRequest request) {
        request = beforeClientExecution(request);
        return executePutEmailIdentityDkimSigningAttributes(request);
    }

    @SdkInternalApi
    final PutEmailIdentityDkimSigningAttributesResult executePutEmailIdentityDkimSigningAttributes(
            PutEmailIdentityDkimSigningAttributesRequest putEmailIdentityDkimSigningAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(putEmailIdentityDkimSigningAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutEmailIdentityDkimSigningAttributesRequest> request = null;
        Response<PutEmailIdentityDkimSigningAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutEmailIdentityDkimSigningAttributesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putEmailIdentityDkimSigningAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutEmailIdentityDkimSigningAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutEmailIdentityDkimSigningAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutEmailIdentityDkimSigningAttributesResultJsonUnmarshaller());
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
     * If the value is <code>true</code>, you receive email notifications when bounce or complaint events occur. These
     * notifications are sent to the address that you specified in the <code>Return-Path</code> header of the original
     * email.
     * </p>
     * <p>
     * You're required to have a method of tracking bounces and complaints. If you haven't set up another mechanism for
     * receiving bounce or complaint notifications (for example, by setting up an event destination), you receive an
     * email notification when these events occur (even if this setting is disabled).
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
     * @sample AmazonSimpleEmailServiceV2.PutEmailIdentityFeedbackAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutEmailIdentityFeedbackAttributes"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * @sample AmazonSimpleEmailServiceV2.PutEmailIdentityMailFromAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutEmailIdentityMailFromAttributes"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * Adds an email address to the suppression list for your account.
     * </p>
     * 
     * @param putSuppressedDestinationRequest
     *        A request to add an email destination to the suppression list for your account.
     * @return Result of the PutSuppressedDestination operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @sample AmazonSimpleEmailServiceV2.PutSuppressedDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutSuppressedDestination" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutSuppressedDestinationResult putSuppressedDestination(PutSuppressedDestinationRequest request) {
        request = beforeClientExecution(request);
        return executePutSuppressedDestination(request);
    }

    @SdkInternalApi
    final PutSuppressedDestinationResult executePutSuppressedDestination(PutSuppressedDestinationRequest putSuppressedDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(putSuppressedDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutSuppressedDestinationRequest> request = null;
        Response<PutSuppressedDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutSuppressedDestinationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putSuppressedDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutSuppressedDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutSuppressedDestinationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutSuppressedDestinationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Composes an email message to multiple destinations.
     * </p>
     * 
     * @param sendBulkEmailRequest
     *        Represents a request to send email messages to multiple destinations using Amazon SES. For more
     *        information, see the <a
     *        href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the SendBulkEmail operation returned by the service.
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
     * @sample AmazonSimpleEmailServiceV2.SendBulkEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/SendBulkEmail" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SendBulkEmailResult sendBulkEmail(SendBulkEmailRequest request) {
        request = beforeClientExecution(request);
        return executeSendBulkEmail(request);
    }

    @SdkInternalApi
    final SendBulkEmailResult executeSendBulkEmail(SendBulkEmailRequest sendBulkEmailRequest) {

        ExecutionContext executionContext = createExecutionContext(sendBulkEmailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendBulkEmailRequest> request = null;
        Response<SendBulkEmailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendBulkEmailRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(sendBulkEmailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendBulkEmail");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendBulkEmailResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SendBulkEmailResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds an email address to the list of identities for your Amazon SES account in the current AWS Region and
     * attempts to verify it. As a result of executing this operation, a customized verification email is sent to the
     * specified address.
     * </p>
     * <p>
     * To use this operation, you must first create a custom verification email template. For more information about
     * creating and using custom verification email templates, see <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-verify-address-custom.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param sendCustomVerificationEmailRequest
     *        Represents a request to send a custom verification email to a specified recipient.
     * @return Result of the SendCustomVerificationEmail operation returned by the service.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws LimitExceededException
     *         There are too many instances of the specified resource type.
     * @throws MessageRejectedException
     *         The message can't be sent because it contains invalid content.
     * @throws SendingPausedException
     *         The message can't be sent because the account's ability to send email is currently paused.
     * @throws MailFromDomainNotVerifiedException
     *         The message can't be sent because the sending domain isn't verified.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.SendCustomVerificationEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/SendCustomVerificationEmail"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SendCustomVerificationEmailResult sendCustomVerificationEmail(SendCustomVerificationEmailRequest request) {
        request = beforeClientExecution(request);
        return executeSendCustomVerificationEmail(request);
    }

    @SdkInternalApi
    final SendCustomVerificationEmailResult executeSendCustomVerificationEmail(SendCustomVerificationEmailRequest sendCustomVerificationEmailRequest) {

        ExecutionContext executionContext = createExecutionContext(sendCustomVerificationEmailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendCustomVerificationEmailRequest> request = null;
        Response<SendCustomVerificationEmailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendCustomVerificationEmailRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(sendCustomVerificationEmailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendCustomVerificationEmail");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendCustomVerificationEmailResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SendCustomVerificationEmailResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends an email message. You can use the Amazon SES API v2 to send two types of messages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Simple</b> – A standard email message. When you create this type of message, you specify the sender, the
     * recipient, and the message body, and Amazon SES assembles the message for you.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Raw</b> – A raw, MIME-formatted email message. When you send this type of email, you have to specify all of
     * the message headers, as well as the message body. You can use this message type to send messages that contain
     * attachments. The message that you specify has to be a valid MIME message.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Templated</b> – A message that contains personalization tags. When you send this type of email, Amazon SES API
     * v2 automatically replaces the tags with values that you specify.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sendEmailRequest
     *        Represents a request to send a single formatted email using Amazon SES. For more information, see the <a
     *        href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-formatted.html">Amazon SES
     *        Developer Guide</a>.
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
     * @sample AmazonSimpleEmailServiceV2.SendEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/SendEmail" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * Add one or more tags (keys and values) to a specified resource. A <i>tag</i> is a label that you optionally
     * define and associate with a resource. Tags can help you categorize and manage resources in different ways, such
     * as by purpose, owner, environment, or other criteria. A resource can have as many as 50 tags.
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
     * @sample AmazonSimpleEmailServiceV2.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * Creates a preview of the MIME content of an email when provided with a template and a set of replacement data.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param testRenderEmailTemplateRequest
     *        &gt;Represents a request to create a preview of the MIME content of an email when provided with a template
     *        and a set of replacement data.
     * @return Result of the TestRenderEmailTemplate operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.TestRenderEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/TestRenderEmailTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public TestRenderEmailTemplateResult testRenderEmailTemplate(TestRenderEmailTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeTestRenderEmailTemplate(request);
    }

    @SdkInternalApi
    final TestRenderEmailTemplateResult executeTestRenderEmailTemplate(TestRenderEmailTemplateRequest testRenderEmailTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(testRenderEmailTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestRenderEmailTemplateRequest> request = null;
        Response<TestRenderEmailTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestRenderEmailTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(testRenderEmailTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TestRenderEmailTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TestRenderEmailTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new TestRenderEmailTemplateResultJsonUnmarshaller());
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
     * @sample AmazonSimpleEmailServiceV2.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * <i>Events</i> include message sends, deliveries, opens, clicks, bounces, and complaints. <i>Event
     * destinations</i> are places that you can send information about these events to. For example, you can send event
     * data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis
     * Data Firehose to stream data to Amazon S3 for long-term storage.
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
     * @sample AmazonSimpleEmailServiceV2.UpdateConfigurationSetEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/UpdateConfigurationSetEventDestination"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
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
     * <p>
     * Updates an existing custom verification email template.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-verify-address-custom.html">Using Custom
     * Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateCustomVerificationEmailTemplateRequest
     *        Represents a request to update an existing custom verification email template.
     * @return Result of the UpdateCustomVerificationEmailTemplate operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @sample AmazonSimpleEmailServiceV2.UpdateCustomVerificationEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/UpdateCustomVerificationEmailTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateCustomVerificationEmailTemplateResult updateCustomVerificationEmailTemplate(UpdateCustomVerificationEmailTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCustomVerificationEmailTemplate(request);
    }

    @SdkInternalApi
    final UpdateCustomVerificationEmailTemplateResult executeUpdateCustomVerificationEmailTemplate(
            UpdateCustomVerificationEmailTemplateRequest updateCustomVerificationEmailTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCustomVerificationEmailTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCustomVerificationEmailTemplateRequest> request = null;
        Response<UpdateCustomVerificationEmailTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCustomVerificationEmailTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateCustomVerificationEmailTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCustomVerificationEmailTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCustomVerificationEmailTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateCustomVerificationEmailTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified sending authorization policy for the given identity (an email address or a domain). This
     * API returns successfully even if a policy with the specified name does not exist.
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to authorize other senders to use its
     * identities. For information about using sending authorization, see the <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateEmailIdentityPolicyRequest
     *        Represents a request to update a sending authorization policy for an identity. Sending authorization is an
     *        Amazon SES feature that enables you to authorize other senders to use your identities. For information,
     *        see the <a href=
     *        "https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-identity-owner-tasks-management.html"
     *        >Amazon SES Developer Guide</a>.
     * @return Result of the UpdateEmailIdentityPolicy operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.UpdateEmailIdentityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/UpdateEmailIdentityPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateEmailIdentityPolicyResult updateEmailIdentityPolicy(UpdateEmailIdentityPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEmailIdentityPolicy(request);
    }

    @SdkInternalApi
    final UpdateEmailIdentityPolicyResult executeUpdateEmailIdentityPolicy(UpdateEmailIdentityPolicyRequest updateEmailIdentityPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEmailIdentityPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEmailIdentityPolicyRequest> request = null;
        Response<UpdateEmailIdentityPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEmailIdentityPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateEmailIdentityPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEmailIdentityPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEmailIdentityPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateEmailIdentityPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an email template. Email templates enable you to send personalized email to one or more destinations in a
     * single API operation. For more information, see the <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateEmailTemplateRequest
     *        Represents a request to update an email template. For more information, see the <a
     *        href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES
     *        Developer Guide</a>.
     * @return Result of the UpdateEmailTemplate operation returned by the service.
     * @throws NotFoundException
     *         The resource you attempted to access doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been made to the operation.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @sample AmazonSimpleEmailServiceV2.UpdateEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/UpdateEmailTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateEmailTemplateResult updateEmailTemplate(UpdateEmailTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEmailTemplate(request);
    }

    @SdkInternalApi
    final UpdateEmailTemplateResult executeUpdateEmailTemplate(UpdateEmailTemplateRequest updateEmailTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEmailTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEmailTemplateRequest> request = null;
        Response<UpdateEmailTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEmailTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateEmailTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SESv2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEmailTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEmailTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateEmailTemplateResultJsonUnmarshaller());
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
