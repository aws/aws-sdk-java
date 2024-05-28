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
package com.amazonaws.services.sqs;

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

import com.amazonaws.services.sqs.AmazonSQSClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.sqs.model.*;

import com.amazonaws.services.sqs.model.transform.*;

/**
 * Client for accessing Amazon SQS. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * Welcome to the <i>Amazon SQS API Reference</i>.
 * </p>
 * <p>
 * Amazon SQS is a reliable, highly-scalable hosted queue for storing messages as they travel between applications or
 * microservices. Amazon SQS moves data between distributed application components and helps you decouple these
 * components.
 * </p>
 * <p>
 * For information on the permissions you need to use this API, see <a href=
 * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-authentication-and-access-control.html"
 * >Identity and access management</a> in the <i>Amazon SQS Developer Guide.</i>
 * </p>
 * <p>
 * You can use <a href="http://aws.amazon.com/tools/#sdk">Amazon Web Services SDKs</a> to access Amazon SQS using your
 * favorite programming language. The SDKs perform tasks such as the following automatically:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Cryptographically sign your service requests
 * </p>
 * </li>
 * <li>
 * <p>
 * Retry requests
 * </p>
 * </li>
 * <li>
 * <p>
 * Handle error responses
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Additional information</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/sqs/">Amazon SQS Product Page</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Amazon SQS Developer Guide</i>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-making-api-requests.html">
 * Making API Requests</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-metadata.html#sqs-message-attributes"
 * >Amazon SQS Message Attributes</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html">
 * Amazon SQS Dead-Letter Queues</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/cli/latest/reference/sqs/index.html">Amazon SQS in the <i>Command Line
 * Interface</i> </a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Amazon Web Services General Reference</i>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#sqs_region">Regions and Endpoints</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonSQSClient extends AmazonWebServiceClient implements AmazonSQS {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonSQS.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "sqs";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final com.amazonaws.services.sqs.AmazonSQSClientConfigurationFactory configFactory = new com.amazonaws.services.sqs.AmazonSQSClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.0")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PurgeQueueInProgress").withExceptionUnmarshaller(
                                    com.amazonaws.services.sqs.model.transform.PurgeQueueInProgressExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KmsInvalidKeyUsage").withExceptionUnmarshaller(
                                    com.amazonaws.services.sqs.model.transform.KmsInvalidKeyUsageExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidAttributeName").withExceptionUnmarshaller(
                                    com.amazonaws.services.sqs.model.transform.InvalidAttributeNameExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RequestThrottled").withExceptionUnmarshaller(
                                    com.amazonaws.services.sqs.model.transform.RequestThrottledExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BatchEntryIdsNotDistinct").withExceptionUnmarshaller(
                                    com.amazonaws.services.sqs.model.transform.BatchEntryIdsNotDistinctExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyEntriesInBatchRequest").withExceptionUnmarshaller(
                                    com.amazonaws.services.sqs.model.transform.TooManyEntriesInBatchRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.sqs.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BatchRequestTooLong").withExceptionUnmarshaller(
                                    com.amazonaws.services.sqs.model.transform.BatchRequestTooLongExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedOperation").withExceptionUnmarshaller(
                                    com.amazonaws.services.sqs.model.transform.UnsupportedOperationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KmsInvalidState").withExceptionUnmarshaller(
                                    com.amazonaws.services.sqs.model.transform.KmsInvalidStateExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidIdFormat").withExceptionUnmarshaller(
                                    com.amazonaws.services.sqs.model.transform.InvalidIdFormatExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KmsNotFound").withExceptionUnmarshaller(
                                    com.amazonaws.services.sqs.model.transform.KmsNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KmsThrottled").withExceptionUnmarshaller(
                                    com.amazonaws.services.sqs.model.transform.KmsThrottledExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KmsOptInRequired").withExceptionUnmarshaller(
                                    com.amazonaws.services.sqs.model.transform.KmsOptInRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KmsAccessDenied").withExceptionUnmarshaller(
                                    com.amazonaws.services.sqs.model.transform.KmsAccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OverLimit").withExceptionUnmarshaller(
                                    com.amazonaws.services.sqs.model.transform.OverLimitExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("QueueDoesNotExist").withExceptionUnmarshaller(
                                    com.amazonaws.services.sqs.model.transform.QueueDoesNotExistExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KmsDisabled").withExceptionUnmarshaller(
                                    com.amazonaws.services.sqs.model.transform.KmsDisabledExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("QueueNameExists").withExceptionUnmarshaller(
                                    com.amazonaws.services.sqs.model.transform.QueueNameExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MessageNotInflight").withExceptionUnmarshaller(
                                    com.amazonaws.services.sqs.model.transform.MessageNotInflightExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ReceiptHandleIsInvalid").withExceptionUnmarshaller(
                                    com.amazonaws.services.sqs.model.transform.ReceiptHandleIsInvalidExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidAttributeValue").withExceptionUnmarshaller(
                                    com.amazonaws.services.sqs.model.transform.InvalidAttributeValueExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidMessageContents").withExceptionUnmarshaller(
                                    com.amazonaws.services.sqs.model.transform.InvalidMessageContentsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("QueueDeletedRecently").withExceptionUnmarshaller(
                                    com.amazonaws.services.sqs.model.transform.QueueDeletedRecentlyExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EmptyBatchRequest").withExceptionUnmarshaller(
                                    com.amazonaws.services.sqs.model.transform.EmptyBatchRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSecurity").withExceptionUnmarshaller(
                                    com.amazonaws.services.sqs.model.transform.InvalidSecurityExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidAddress").withExceptionUnmarshaller(
                                    com.amazonaws.services.sqs.model.transform.InvalidAddressExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidBatchEntryId").withExceptionUnmarshaller(
                                    com.amazonaws.services.sqs.model.transform.InvalidBatchEntryIdExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.sqs.model.AmazonSQSException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon SQS. A credentials provider chain will be used that
     * searches for credentials in this order:
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
     * @deprecated use {@link AmazonSQSClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonSQSClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SQS. A credentials provider chain will be used that
     * searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Amazon SQS (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonSQSClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonSQSClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SQS using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonSQSClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonSQSClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonSQSClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SQS using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon SQS (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AmazonSQSClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSQSClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonSQSClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SQS using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonSQSClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonSQSClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SQS using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon SQS (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AmazonSQSClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSQSClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonSQSClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SQS using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon SQS (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonSQSClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSQSClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonSQSClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonSQSClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonSQSClientBuilder builder() {
        return AmazonSQSClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SQS using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonSQSClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SQS using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonSQSClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://sqs.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/sqs/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/sqs/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds a permission to a queue for a specific <a
     * href="https://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P">principal</a>. This allows sharing access
     * to the queue.
     * </p>
     * <p>
     * When you create a queue, you have full control access rights for the queue. Only you, the owner of the queue, can
     * grant or deny permissions to the queue. For more information about these permissions, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-writing-an-sqs-policy.html#write-messages-to-shared-queue"
     * >Allow Developers to Write Messages to a Shared Queue</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * <code>AddPermission</code> generates a policy for you. You can use <code> <a>SetQueueAttributes</a> </code> to
     * upload your policy. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-creating-custom-policies.html"
     * >Using Custom Policies with the Amazon SQS Access Policy Language</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * An Amazon SQS policy can have a maximum of seven actions per statement.
     * </p>
     * </li>
     * <li>
     * <p>
     * To remove the ability to change queue permissions, you must deny permission to the <code>AddPermission</code>,
     * <code>RemovePermission</code>, and <code>SetQueueAttributes</code> actions in your IAM policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SQS <code>AddPermission</code> does not support adding a non-account principal.
     * </p>
     * </li>
     * </ul>
     * </note> <note>
     * <p>
     * Cross-account permissions don't apply to this action. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name"
     * >Grant cross-account permissions to a role and a username</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param addPermissionRequest
     * @return Result of the AddPermission operation returned by the service.
     * @throws OverLimitException
     *         The specified action violates a limit. For example, <code>ReceiveMessage</code> returns this error if the
     *         maximum number of in flight messages is reached and <code>AddPermission</code> returns this error if the
     *         maximum number of permissions for the queue is reached.
     * @throws RequestThrottledException
     *         The request was denied due to request throttling.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The rate of requests per second exceeds the Amazon Web Services KMS request quota for an account and
     *         Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A burst or sustained high rate of requests to change the state of the same KMS key. This condition is
     *         often known as a "hot key."
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Requests for operations on KMS keys in a Amazon Web Services CloudHSM key store might be throttled at a
     *         lower-than-expected rate when the Amazon Web Services CloudHSM cluster associated with the Amazon Web
     *         Services CloudHSM key store is processing numerous commands, including those unrelated to the Amazon Web
     *         Services CloudHSM key store.
     *         </p>
     *         </li>
     * @throws QueueDoesNotExistException
     *         The specified queue doesn't exist.
     * @throws InvalidAddressException
     *         The <code>accountId</code> is invalid.
     * @throws InvalidSecurityException
     *         When the request to a queue is not HTTPS and SigV4.
     * @throws UnsupportedOperationException
     *         Error code 400. Unsupported operation.
     * @sample AmazonSQS.AddPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/AddPermission" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AddPermissionResult addPermission(AddPermissionRequest request) {
        request = beforeClientExecution(request);
        return executeAddPermission(request);
    }

    @SdkInternalApi
    final AddPermissionResult executeAddPermission(AddPermissionRequest addPermissionRequest) {

        ExecutionContext executionContext = createExecutionContext(addPermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddPermissionRequest> request = null;
        Response<AddPermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddPermissionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addPermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SQS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddPermission");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddPermissionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddPermissionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public AddPermissionResult addPermission(String queueUrl, String label, java.util.List<String> aWSAccountIds, java.util.List<String> actions) {
        return addPermission(new AddPermissionRequest().withQueueUrl(queueUrl).withLabel(label).withAWSAccountIds(aWSAccountIds).withActions(actions));
    }

    /**
     * <p>
     * Cancels a specified message movement task. A message movement can only be cancelled when the current status is
     * RUNNING. Cancelling a message movement task does not revert the messages that have already been moved. It can
     * only stop the messages that have not been moved yet.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * This action is currently limited to supporting message redrive from <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     * >dead-letter queues (DLQs)</a> only. In this context, the source queue is the dead-letter queue (DLQ), while the
     * destination queue can be the original source queue (from which the messages were driven to the
     * dead-letter-queue), or a custom destination queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * Only one active message movement task is supported per queue at any given time.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param cancelMessageMoveTaskRequest
     * @return Result of the CancelMessageMoveTask operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more specified resources don't exist.
     * @throws RequestThrottledException
     *         The request was denied due to request throttling.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The rate of requests per second exceeds the Amazon Web Services KMS request quota for an account and
     *         Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A burst or sustained high rate of requests to change the state of the same KMS key. This condition is
     *         often known as a "hot key."
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Requests for operations on KMS keys in a Amazon Web Services CloudHSM key store might be throttled at a
     *         lower-than-expected rate when the Amazon Web Services CloudHSM cluster associated with the Amazon Web
     *         Services CloudHSM key store is processing numerous commands, including those unrelated to the Amazon Web
     *         Services CloudHSM key store.
     *         </p>
     *         </li>
     * @throws InvalidAddressException
     *         The <code>accountId</code> is invalid.
     * @throws InvalidSecurityException
     *         When the request to a queue is not HTTPS and SigV4.
     * @throws UnsupportedOperationException
     *         Error code 400. Unsupported operation.
     * @sample AmazonSQS.CancelMessageMoveTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/CancelMessageMoveTask" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CancelMessageMoveTaskResult cancelMessageMoveTask(CancelMessageMoveTaskRequest request) {
        request = beforeClientExecution(request);
        return executeCancelMessageMoveTask(request);
    }

    @SdkInternalApi
    final CancelMessageMoveTaskResult executeCancelMessageMoveTask(CancelMessageMoveTaskRequest cancelMessageMoveTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelMessageMoveTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelMessageMoveTaskRequest> request = null;
        Response<CancelMessageMoveTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelMessageMoveTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelMessageMoveTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SQS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelMessageMoveTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelMessageMoveTaskResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CancelMessageMoveTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes the visibility timeout of a specified message in a queue to a new value. The default visibility timeout
     * for a message is 30 seconds. The minimum is 0 seconds. The maximum is 12 hours. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html">
     * Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <p>
     * For example, if the default timeout for a queue is 60 seconds, 15 seconds have elapsed since you received the
     * message, and you send a ChangeMessageVisibility call with <code>VisibilityTimeout</code> set to 10 seconds, the
     * 10 seconds begin to count from the time that you make the <code>ChangeMessageVisibility</code> call. Thus, any
     * attempt to change the visibility timeout or to delete that message 10 seconds after you initially change the
     * visibility timeout (a total of 25 seconds) might result in an error.
     * </p>
     * <p>
     * An Amazon SQS message has three basic states:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Sent to a queue by a producer.
     * </p>
     * </li>
     * <li>
     * <p>
     * Received from the queue by a consumer.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deleted from the queue.
     * </p>
     * </li>
     * </ol>
     * <p>
     * A message is considered to be <i>stored</i> after it is sent to a queue by a producer, but not yet received from
     * the queue by a consumer (that is, between states 1 and 2). There is no limit to the number of stored messages. A
     * message is considered to be <i>in flight</i> after it is received from a queue by a consumer, but not yet deleted
     * from the queue (that is, between states 2 and 3). There is a limit to the number of in flight messages.
     * </p>
     * <p>
     * Limits that apply to in flight messages are unrelated to the <i>unlimited</i> number of stored messages.
     * </p>
     * <p>
     * For most standard queues (depending on queue traffic and message backlog), there can be a maximum of
     * approximately 120,000 in flight messages (received from a queue by a consumer, but not yet deleted from the
     * queue). If you reach this limit, Amazon SQS returns the <code>OverLimit</code> error message. To avoid reaching
     * the limit, you should delete messages from the queue after they're processed. You can also increase the number of
     * queues you use to process your messages. To request a limit increase, <a href=
     * "https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase&amp;limitType=service-code-sqs"
     * >file a support request</a>.
     * </p>
     * <p>
     * For FIFO queues, there can be a maximum of 20,000 in flight messages (received from a queue by a consumer, but
     * not yet deleted from the queue). If you reach this limit, Amazon SQS returns no error messages.
     * </p>
     * <important>
     * <p>
     * If you attempt to set the <code>VisibilityTimeout</code> to a value greater than the maximum time left, Amazon
     * SQS returns an error. Amazon SQS doesn't automatically recalculate and increase the timeout to the maximum
     * remaining time.
     * </p>
     * <p>
     * Unlike with a queue, when you change the visibility timeout for a specific message the timeout value is applied
     * immediately but isn't saved in memory for that message. If you don't delete a message after it is received, the
     * visibility timeout for the message reverts to the original timeout value (not to the value you set using the
     * <code>ChangeMessageVisibility</code> action) the next time the message is received.
     * </p>
     * </important>
     * 
     * @param changeMessageVisibilityRequest
     * @return Result of the ChangeMessageVisibility operation returned by the service.
     * @throws MessageNotInflightException
     *         The specified message isn't in flight.
     * @throws ReceiptHandleIsInvalidException
     *         The specified receipt handle isn't valid.
     * @throws RequestThrottledException
     *         The request was denied due to request throttling.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The rate of requests per second exceeds the Amazon Web Services KMS request quota for an account and
     *         Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A burst or sustained high rate of requests to change the state of the same KMS key. This condition is
     *         often known as a "hot key."
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Requests for operations on KMS keys in a Amazon Web Services CloudHSM key store might be throttled at a
     *         lower-than-expected rate when the Amazon Web Services CloudHSM cluster associated with the Amazon Web
     *         Services CloudHSM key store is processing numerous commands, including those unrelated to the Amazon Web
     *         Services CloudHSM key store.
     *         </p>
     *         </li>
     * @throws QueueDoesNotExistException
     *         The specified queue doesn't exist.
     * @throws UnsupportedOperationException
     *         Error code 400. Unsupported operation.
     * @throws InvalidAddressException
     *         The <code>accountId</code> is invalid.
     * @throws InvalidSecurityException
     *         When the request to a queue is not HTTPS and SigV4.
     * @sample AmazonSQS.ChangeMessageVisibility
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/ChangeMessageVisibility" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ChangeMessageVisibilityResult changeMessageVisibility(ChangeMessageVisibilityRequest request) {
        request = beforeClientExecution(request);
        return executeChangeMessageVisibility(request);
    }

    @SdkInternalApi
    final ChangeMessageVisibilityResult executeChangeMessageVisibility(ChangeMessageVisibilityRequest changeMessageVisibilityRequest) {

        ExecutionContext executionContext = createExecutionContext(changeMessageVisibilityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ChangeMessageVisibilityRequest> request = null;
        Response<ChangeMessageVisibilityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ChangeMessageVisibilityRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(changeMessageVisibilityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SQS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ChangeMessageVisibility");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ChangeMessageVisibilityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ChangeMessageVisibilityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ChangeMessageVisibilityResult changeMessageVisibility(String queueUrl, String receiptHandle, Integer visibilityTimeout) {
        return changeMessageVisibility(new ChangeMessageVisibilityRequest().withQueueUrl(queueUrl).withReceiptHandle(receiptHandle)
                .withVisibilityTimeout(visibilityTimeout));
    }

    /**
     * <p>
     * Changes the visibility timeout of multiple messages. This is a batch version of
     * <code> <a>ChangeMessageVisibility</a>.</code> The result of the action on each message is reported individually
     * in the response. You can send up to 10 <code> <a>ChangeMessageVisibility</a> </code> requests with each
     * <code>ChangeMessageVisibilityBatch</code> action.
     * </p>
     * <important>
     * <p>
     * Because the batch request can result in a combination of successful and unsuccessful actions, you should check
     * for batch errors even when the call returns an HTTP status code of <code>200</code>.
     * </p>
     * </important>
     * 
     * @param changeMessageVisibilityBatchRequest
     * @return Result of the ChangeMessageVisibilityBatch operation returned by the service.
     * @throws TooManyEntriesInBatchRequestException
     *         The batch request contains more entries than permissible.
     * @throws EmptyBatchRequestException
     *         The batch request doesn't contain any entries.
     * @throws BatchEntryIdsNotDistinctException
     *         Two or more batch entries in the request have the same <code>Id</code>.
     * @throws InvalidBatchEntryIdException
     *         The <code>Id</code> of a batch entry in a batch request doesn't abide by the specification.
     * @throws RequestThrottledException
     *         The request was denied due to request throttling.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The rate of requests per second exceeds the Amazon Web Services KMS request quota for an account and
     *         Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A burst or sustained high rate of requests to change the state of the same KMS key. This condition is
     *         often known as a "hot key."
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Requests for operations on KMS keys in a Amazon Web Services CloudHSM key store might be throttled at a
     *         lower-than-expected rate when the Amazon Web Services CloudHSM cluster associated with the Amazon Web
     *         Services CloudHSM key store is processing numerous commands, including those unrelated to the Amazon Web
     *         Services CloudHSM key store.
     *         </p>
     *         </li>
     * @throws QueueDoesNotExistException
     *         The specified queue doesn't exist.
     * @throws UnsupportedOperationException
     *         Error code 400. Unsupported operation.
     * @throws InvalidAddressException
     *         The <code>accountId</code> is invalid.
     * @throws InvalidSecurityException
     *         When the request to a queue is not HTTPS and SigV4.
     * @sample AmazonSQS.ChangeMessageVisibilityBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/ChangeMessageVisibilityBatch"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ChangeMessageVisibilityBatchResult changeMessageVisibilityBatch(ChangeMessageVisibilityBatchRequest request) {
        request = beforeClientExecution(request);
        return executeChangeMessageVisibilityBatch(request);
    }

    @SdkInternalApi
    final ChangeMessageVisibilityBatchResult executeChangeMessageVisibilityBatch(ChangeMessageVisibilityBatchRequest changeMessageVisibilityBatchRequest) {

        ExecutionContext executionContext = createExecutionContext(changeMessageVisibilityBatchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ChangeMessageVisibilityBatchRequest> request = null;
        Response<ChangeMessageVisibilityBatchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ChangeMessageVisibilityBatchRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(changeMessageVisibilityBatchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SQS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ChangeMessageVisibilityBatch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ChangeMessageVisibilityBatchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ChangeMessageVisibilityBatchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ChangeMessageVisibilityBatchResult changeMessageVisibilityBatch(String queueUrl, java.util.List<ChangeMessageVisibilityBatchRequestEntry> entries) {
        return changeMessageVisibilityBatch(new ChangeMessageVisibilityBatchRequest().withQueueUrl(queueUrl).withEntries(entries));
    }

    /**
     * <p>
     * Creates a new standard or FIFO queue. You can pass one or more attributes in the request. Keep the following in
     * mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't specify the <code>FifoQueue</code> attribute, Amazon SQS creates a standard queue.
     * </p>
     * <note>
     * <p>
     * You can't change the queue type after you create it and you can't convert an existing standard queue into a FIFO
     * queue. You must either create a new FIFO queue for your application or delete your existing standard queue and
     * recreate it as a FIFO queue. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-moving"
     * >Moving From a Standard Queue to a FIFO Queue</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * If you don't provide a value for an attribute, the queue is created with the default value for the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you delete a queue, you must wait at least 60 seconds before creating a queue with the same name.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To successfully create a new queue, you must provide a queue name that adheres to the <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/limits-queues.html">limits
     * related to queues</a> and is unique within the scope of your queues.
     * </p>
     * <note>
     * <p>
     * After you create a queue, you must wait at least one second after the queue is created to be able to use the
     * queue.
     * </p>
     * </note>
     * <p>
     * To get the queue URL, use the <code> <a>GetQueueUrl</a> </code> action. <code> <a>GetQueueUrl</a> </code>
     * requires only the <code>QueueName</code> parameter. be aware of existing queue names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you provide the name of an existing queue along with the exact names and values of all the queue's attributes,
     * <code>CreateQueue</code> returns the queue URL for the existing queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the queue name, attribute names, or attribute values don't match an existing queue, <code>CreateQueue</code>
     * returns an error.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Cross-account permissions don't apply to this action. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name"
     * >Grant cross-account permissions to a role and a username</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param createQueueRequest
     * @return Result of the CreateQueue operation returned by the service.
     * @throws QueueDeletedRecentlyException
     *         You must wait 60 seconds after deleting a queue before you can create another queue with the same name.
     * @throws QueueNameExistsException
     *         A queue with this name already exists. Amazon SQS returns this error only if the request includes
     *         attributes whose values differ from those of the existing queue.
     * @throws RequestThrottledException
     *         The request was denied due to request throttling.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The rate of requests per second exceeds the Amazon Web Services KMS request quota for an account and
     *         Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A burst or sustained high rate of requests to change the state of the same KMS key. This condition is
     *         often known as a "hot key."
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Requests for operations on KMS keys in a Amazon Web Services CloudHSM key store might be throttled at a
     *         lower-than-expected rate when the Amazon Web Services CloudHSM cluster associated with the Amazon Web
     *         Services CloudHSM key store is processing numerous commands, including those unrelated to the Amazon Web
     *         Services CloudHSM key store.
     *         </p>
     *         </li>
     * @throws InvalidAddressException
     *         The <code>accountId</code> is invalid.
     * @throws InvalidAttributeNameException
     *         The specified attribute doesn't exist.
     * @throws InvalidAttributeValueException
     *         A queue attribute value is invalid.
     * @throws UnsupportedOperationException
     *         Error code 400. Unsupported operation.
     * @throws InvalidSecurityException
     *         When the request to a queue is not HTTPS and SigV4.
     * @sample AmazonSQS.CreateQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/CreateQueue" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateQueueResult createQueue(CreateQueueRequest request) {
        request = beforeClientExecution(request);
        return executeCreateQueue(request);
    }

    @SdkInternalApi
    final CreateQueueResult executeCreateQueue(CreateQueueRequest createQueueRequest) {

        ExecutionContext executionContext = createExecutionContext(createQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateQueueRequest> request = null;
        Response<CreateQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateQueueRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SQS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateQueue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateQueueResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateQueueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public CreateQueueResult createQueue(String queueName) {
        return createQueue(new CreateQueueRequest().withQueueName(queueName));
    }

    /**
     * <p>
     * Deletes the specified message from the specified queue. To select the message to delete, use the
     * <code>ReceiptHandle</code> of the message (<i>not</i> the <code>MessageId</code> which you receive when you send
     * the message). Amazon SQS can delete a message from a queue even if a visibility timeout setting causes the
     * message to be locked by another consumer. Amazon SQS automatically deletes messages left in a queue longer than
     * the retention period configured for the queue.
     * </p>
     * <note>
     * <p>
     * The <code>ReceiptHandle</code> is associated with a <i>specific instance</i> of receiving a message. If you
     * receive a message more than once, the <code>ReceiptHandle</code> is different each time you receive a message.
     * When you use the <code>DeleteMessage</code> action, you must provide the most recently received
     * <code>ReceiptHandle</code> for the message (otherwise, the request succeeds, but the message will not be
     * deleted).
     * </p>
     * <p>
     * For standard queues, it is possible to receive a message even after you delete it. This might happen on rare
     * occasions if one of the servers which stores a copy of the message is unavailable when you send the request to
     * delete the message. The copy remains on the server and might be returned to you during a subsequent receive
     * request. You should ensure that your application is idempotent, so that receiving a message more than once does
     * not cause issues.
     * </p>
     * </note>
     * 
     * @param deleteMessageRequest
     * @return Result of the DeleteMessage operation returned by the service.
     * @throws InvalidIdFormatException
     *         The specified receipt handle isn't valid for the current version.
     * @throws ReceiptHandleIsInvalidException
     *         The specified receipt handle isn't valid.
     * @throws RequestThrottledException
     *         The request was denied due to request throttling.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The rate of requests per second exceeds the Amazon Web Services KMS request quota for an account and
     *         Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A burst or sustained high rate of requests to change the state of the same KMS key. This condition is
     *         often known as a "hot key."
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Requests for operations on KMS keys in a Amazon Web Services CloudHSM key store might be throttled at a
     *         lower-than-expected rate when the Amazon Web Services CloudHSM cluster associated with the Amazon Web
     *         Services CloudHSM key store is processing numerous commands, including those unrelated to the Amazon Web
     *         Services CloudHSM key store.
     *         </p>
     *         </li>
     * @throws QueueDoesNotExistException
     *         The specified queue doesn't exist.
     * @throws UnsupportedOperationException
     *         Error code 400. Unsupported operation.
     * @throws InvalidSecurityException
     *         When the request to a queue is not HTTPS and SigV4.
     * @throws InvalidAddressException
     *         The <code>accountId</code> is invalid.
     * @sample AmazonSQS.DeleteMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/DeleteMessage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteMessageResult deleteMessage(DeleteMessageRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMessage(request);
    }

    @SdkInternalApi
    final DeleteMessageResult executeDeleteMessage(DeleteMessageRequest deleteMessageRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMessageRequest> request = null;
        Response<DeleteMessageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMessageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteMessageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SQS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMessage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMessageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteMessageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DeleteMessageResult deleteMessage(String queueUrl, String receiptHandle) {
        return deleteMessage(new DeleteMessageRequest().withQueueUrl(queueUrl).withReceiptHandle(receiptHandle));
    }

    /**
     * <p>
     * Deletes up to ten messages from the specified queue. This is a batch version of
     * <code> <a>DeleteMessage</a>.</code> The result of the action on each message is reported individually in the
     * response.
     * </p>
     * <important>
     * <p>
     * Because the batch request can result in a combination of successful and unsuccessful actions, you should check
     * for batch errors even when the call returns an HTTP status code of <code>200</code>.
     * </p>
     * </important>
     * 
     * @param deleteMessageBatchRequest
     * @return Result of the DeleteMessageBatch operation returned by the service.
     * @throws TooManyEntriesInBatchRequestException
     *         The batch request contains more entries than permissible.
     * @throws EmptyBatchRequestException
     *         The batch request doesn't contain any entries.
     * @throws BatchEntryIdsNotDistinctException
     *         Two or more batch entries in the request have the same <code>Id</code>.
     * @throws InvalidBatchEntryIdException
     *         The <code>Id</code> of a batch entry in a batch request doesn't abide by the specification.
     * @throws RequestThrottledException
     *         The request was denied due to request throttling.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The rate of requests per second exceeds the Amazon Web Services KMS request quota for an account and
     *         Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A burst or sustained high rate of requests to change the state of the same KMS key. This condition is
     *         often known as a "hot key."
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Requests for operations on KMS keys in a Amazon Web Services CloudHSM key store might be throttled at a
     *         lower-than-expected rate when the Amazon Web Services CloudHSM cluster associated with the Amazon Web
     *         Services CloudHSM key store is processing numerous commands, including those unrelated to the Amazon Web
     *         Services CloudHSM key store.
     *         </p>
     *         </li>
     * @throws QueueDoesNotExistException
     *         The specified queue doesn't exist.
     * @throws UnsupportedOperationException
     *         Error code 400. Unsupported operation.
     * @throws InvalidAddressException
     *         The <code>accountId</code> is invalid.
     * @throws InvalidSecurityException
     *         When the request to a queue is not HTTPS and SigV4.
     * @sample AmazonSQS.DeleteMessageBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/DeleteMessageBatch" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteMessageBatchResult deleteMessageBatch(DeleteMessageBatchRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMessageBatch(request);
    }

    @SdkInternalApi
    final DeleteMessageBatchResult executeDeleteMessageBatch(DeleteMessageBatchRequest deleteMessageBatchRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMessageBatchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMessageBatchRequest> request = null;
        Response<DeleteMessageBatchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMessageBatchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteMessageBatchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SQS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMessageBatch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMessageBatchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteMessageBatchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DeleteMessageBatchResult deleteMessageBatch(String queueUrl, java.util.List<DeleteMessageBatchRequestEntry> entries) {
        return deleteMessageBatch(new DeleteMessageBatchRequest().withQueueUrl(queueUrl).withEntries(entries));
    }

    /**
     * <p>
     * Deletes the queue specified by the <code>QueueUrl</code>, regardless of the queue's contents.
     * </p>
     * <important>
     * <p>
     * Be careful with the <code>DeleteQueue</code> action: When you delete a queue, any messages in the queue are no
     * longer available.
     * </p>
     * </important>
     * <p>
     * When you delete a queue, the deletion process takes up to 60 seconds. Requests you send involving that queue
     * during the 60 seconds might succeed. For example, a <code> <a>SendMessage</a> </code> request might succeed, but
     * after 60 seconds the queue and the message you sent no longer exist.
     * </p>
     * <p>
     * When you delete a queue, you must wait at least 60 seconds before creating a queue with the same name.
     * </p>
     * <note>
     * <p>
     * Cross-account permissions don't apply to this action. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name"
     * >Grant cross-account permissions to a role and a username</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <p>
     * The delete operation uses the HTTP <code>GET</code> verb.
     * </p>
     * </note>
     * 
     * @param deleteQueueRequest
     * @return Result of the DeleteQueue operation returned by the service.
     * @throws RequestThrottledException
     *         The request was denied due to request throttling.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The rate of requests per second exceeds the Amazon Web Services KMS request quota for an account and
     *         Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A burst or sustained high rate of requests to change the state of the same KMS key. This condition is
     *         often known as a "hot key."
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Requests for operations on KMS keys in a Amazon Web Services CloudHSM key store might be throttled at a
     *         lower-than-expected rate when the Amazon Web Services CloudHSM cluster associated with the Amazon Web
     *         Services CloudHSM key store is processing numerous commands, including those unrelated to the Amazon Web
     *         Services CloudHSM key store.
     *         </p>
     *         </li>
     * @throws QueueDoesNotExistException
     *         The specified queue doesn't exist.
     * @throws InvalidAddressException
     *         The <code>accountId</code> is invalid.
     * @throws UnsupportedOperationException
     *         Error code 400. Unsupported operation.
     * @throws InvalidSecurityException
     *         When the request to a queue is not HTTPS and SigV4.
     * @sample AmazonSQS.DeleteQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/DeleteQueue" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteQueueResult deleteQueue(DeleteQueueRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteQueue(request);
    }

    @SdkInternalApi
    final DeleteQueueResult executeDeleteQueue(DeleteQueueRequest deleteQueueRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteQueueRequest> request = null;
        Response<DeleteQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteQueueRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SQS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteQueue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteQueueResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteQueueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DeleteQueueResult deleteQueue(String queueUrl) {
        return deleteQueue(new DeleteQueueRequest().withQueueUrl(queueUrl));
    }

    /**
     * <p>
     * Gets attributes for the specified queue.
     * </p>
     * <note>
     * <p>
     * To determine whether a queue is <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO</a>, you
     * can check whether <code>QueueName</code> ends with the <code>.fifo</code> suffix.
     * </p>
     * </note>
     * 
     * @param getQueueAttributesRequest
     * @return Result of the GetQueueAttributes operation returned by the service.
     * @throws InvalidAttributeNameException
     *         The specified attribute doesn't exist.
     * @throws RequestThrottledException
     *         The request was denied due to request throttling.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The rate of requests per second exceeds the Amazon Web Services KMS request quota for an account and
     *         Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A burst or sustained high rate of requests to change the state of the same KMS key. This condition is
     *         often known as a "hot key."
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Requests for operations on KMS keys in a Amazon Web Services CloudHSM key store might be throttled at a
     *         lower-than-expected rate when the Amazon Web Services CloudHSM cluster associated with the Amazon Web
     *         Services CloudHSM key store is processing numerous commands, including those unrelated to the Amazon Web
     *         Services CloudHSM key store.
     *         </p>
     *         </li>
     * @throws QueueDoesNotExistException
     *         The specified queue doesn't exist.
     * @throws UnsupportedOperationException
     *         Error code 400. Unsupported operation.
     * @throws InvalidSecurityException
     *         When the request to a queue is not HTTPS and SigV4.
     * @throws InvalidAddressException
     *         The <code>accountId</code> is invalid.
     * @sample AmazonSQS.GetQueueAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/GetQueueAttributes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetQueueAttributesResult getQueueAttributes(GetQueueAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeGetQueueAttributes(request);
    }

    @SdkInternalApi
    final GetQueueAttributesResult executeGetQueueAttributes(GetQueueAttributesRequest getQueueAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(getQueueAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetQueueAttributesRequest> request = null;
        Response<GetQueueAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetQueueAttributesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getQueueAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SQS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetQueueAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetQueueAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetQueueAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public GetQueueAttributesResult getQueueAttributes(String queueUrl, java.util.List<String> attributeNames) {
        return getQueueAttributes(new GetQueueAttributesRequest().withQueueUrl(queueUrl).withAttributeNames(attributeNames));
    }

    /**
     * <p>
     * Returns the URL of an existing Amazon SQS queue.
     * </p>
     * <p>
     * To access a queue that belongs to another AWS account, use the <code>QueueOwnerAWSAccountId</code> parameter to
     * specify the account ID of the queue's owner. The queue's owner must grant you permission to access the queue. For
     * more information about shared queue access, see <code> <a>AddPermission</a> </code> or see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-writing-an-sqs-policy.html#write-messages-to-shared-queue"
     * >Allow Developers to Write Messages to a Shared Queue</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * 
     * @param getQueueUrlRequest
     * @return Result of the GetQueueUrl operation returned by the service.
     * @throws RequestThrottledException
     *         The request was denied due to request throttling.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The rate of requests per second exceeds the Amazon Web Services KMS request quota for an account and
     *         Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A burst or sustained high rate of requests to change the state of the same KMS key. This condition is
     *         often known as a "hot key."
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Requests for operations on KMS keys in a Amazon Web Services CloudHSM key store might be throttled at a
     *         lower-than-expected rate when the Amazon Web Services CloudHSM cluster associated with the Amazon Web
     *         Services CloudHSM key store is processing numerous commands, including those unrelated to the Amazon Web
     *         Services CloudHSM key store.
     *         </p>
     *         </li>
     * @throws QueueDoesNotExistException
     *         The specified queue doesn't exist.
     * @throws InvalidAddressException
     *         The <code>accountId</code> is invalid.
     * @throws InvalidSecurityException
     *         When the request to a queue is not HTTPS and SigV4.
     * @throws UnsupportedOperationException
     *         Error code 400. Unsupported operation.
     * @sample AmazonSQS.GetQueueUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/GetQueueUrl" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetQueueUrlResult getQueueUrl(GetQueueUrlRequest request) {
        request = beforeClientExecution(request);
        return executeGetQueueUrl(request);
    }

    @SdkInternalApi
    final GetQueueUrlResult executeGetQueueUrl(GetQueueUrlRequest getQueueUrlRequest) {

        ExecutionContext executionContext = createExecutionContext(getQueueUrlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetQueueUrlRequest> request = null;
        Response<GetQueueUrlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetQueueUrlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getQueueUrlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SQS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetQueueUrl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetQueueUrlResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetQueueUrlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public GetQueueUrlResult getQueueUrl(String queueName) {
        return getQueueUrl(new GetQueueUrlRequest().withQueueName(queueName));
    }

    /**
     * <p>
     * Returns a list of your queues that have the <code>RedrivePolicy</code> queue attribute configured with a
     * dead-letter queue.
     * </p>
     * <p>
     * The <code>ListDeadLetterSourceQueues</code> methods supports pagination. Set parameter <code>MaxResults</code> in
     * the request to specify the maximum number of results to be returned in the response. If you do not set
     * <code>MaxResults</code>, the response includes a maximum of 1,000 results. If you set <code>MaxResults</code> and
     * there are additional results to display, the response includes a value for <code>NextToken</code>. Use
     * <code>NextToken</code> as a parameter in your next request to <code>ListDeadLetterSourceQueues</code> to receive
     * the next page of results.
     * </p>
     * <p>
     * For more information about using dead-letter queues, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     * >Using Amazon SQS Dead-Letter Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * 
     * @param listDeadLetterSourceQueuesRequest
     * @return Result of the ListDeadLetterSourceQueues operation returned by the service.
     * @throws QueueDoesNotExistException
     *         The specified queue doesn't exist.
     * @throws RequestThrottledException
     *         The request was denied due to request throttling.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The rate of requests per second exceeds the Amazon Web Services KMS request quota for an account and
     *         Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A burst or sustained high rate of requests to change the state of the same KMS key. This condition is
     *         often known as a "hot key."
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Requests for operations on KMS keys in a Amazon Web Services CloudHSM key store might be throttled at a
     *         lower-than-expected rate when the Amazon Web Services CloudHSM cluster associated with the Amazon Web
     *         Services CloudHSM key store is processing numerous commands, including those unrelated to the Amazon Web
     *         Services CloudHSM key store.
     *         </p>
     *         </li>
     * @throws InvalidSecurityException
     *         When the request to a queue is not HTTPS and SigV4.
     * @throws InvalidAddressException
     *         The <code>accountId</code> is invalid.
     * @throws UnsupportedOperationException
     *         Error code 400. Unsupported operation.
     * @sample AmazonSQS.ListDeadLetterSourceQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/ListDeadLetterSourceQueues" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListDeadLetterSourceQueuesResult listDeadLetterSourceQueues(ListDeadLetterSourceQueuesRequest request) {
        request = beforeClientExecution(request);
        return executeListDeadLetterSourceQueues(request);
    }

    @SdkInternalApi
    final ListDeadLetterSourceQueuesResult executeListDeadLetterSourceQueues(ListDeadLetterSourceQueuesRequest listDeadLetterSourceQueuesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDeadLetterSourceQueuesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeadLetterSourceQueuesRequest> request = null;
        Response<ListDeadLetterSourceQueuesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeadLetterSourceQueuesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listDeadLetterSourceQueuesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SQS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDeadLetterSourceQueues");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDeadLetterSourceQueuesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListDeadLetterSourceQueuesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the most recent message movement tasks (up to 10) under a specific source queue.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * This action is currently limited to supporting message redrive from <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     * >dead-letter queues (DLQs)</a> only. In this context, the source queue is the dead-letter queue (DLQ), while the
     * destination queue can be the original source queue (from which the messages were driven to the
     * dead-letter-queue), or a custom destination queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * Only one active message movement task is supported per queue at any given time.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param listMessageMoveTasksRequest
     * @return Result of the ListMessageMoveTasks operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more specified resources don't exist.
     * @throws RequestThrottledException
     *         The request was denied due to request throttling.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The rate of requests per second exceeds the Amazon Web Services KMS request quota for an account and
     *         Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A burst or sustained high rate of requests to change the state of the same KMS key. This condition is
     *         often known as a "hot key."
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Requests for operations on KMS keys in a Amazon Web Services CloudHSM key store might be throttled at a
     *         lower-than-expected rate when the Amazon Web Services CloudHSM cluster associated with the Amazon Web
     *         Services CloudHSM key store is processing numerous commands, including those unrelated to the Amazon Web
     *         Services CloudHSM key store.
     *         </p>
     *         </li>
     * @throws InvalidAddressException
     *         The <code>accountId</code> is invalid.
     * @throws InvalidSecurityException
     *         When the request to a queue is not HTTPS and SigV4.
     * @throws UnsupportedOperationException
     *         Error code 400. Unsupported operation.
     * @sample AmazonSQS.ListMessageMoveTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/ListMessageMoveTasks" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListMessageMoveTasksResult listMessageMoveTasks(ListMessageMoveTasksRequest request) {
        request = beforeClientExecution(request);
        return executeListMessageMoveTasks(request);
    }

    @SdkInternalApi
    final ListMessageMoveTasksResult executeListMessageMoveTasks(ListMessageMoveTasksRequest listMessageMoveTasksRequest) {

        ExecutionContext executionContext = createExecutionContext(listMessageMoveTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMessageMoveTasksRequest> request = null;
        Response<ListMessageMoveTasksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMessageMoveTasksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMessageMoveTasksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SQS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMessageMoveTasks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMessageMoveTasksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListMessageMoveTasksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all cost allocation tags added to the specified Amazon SQS queue. For an overview, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-tags.html">Tagging
     * Your Amazon SQS Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Cross-account permissions don't apply to this action. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name"
     * >Grant cross-account permissions to a role and a username</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param listQueueTagsRequest
     * @return Result of the ListQueueTags operation returned by the service.
     * @throws RequestThrottledException
     *         The request was denied due to request throttling.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The rate of requests per second exceeds the Amazon Web Services KMS request quota for an account and
     *         Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A burst or sustained high rate of requests to change the state of the same KMS key. This condition is
     *         often known as a "hot key."
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Requests for operations on KMS keys in a Amazon Web Services CloudHSM key store might be throttled at a
     *         lower-than-expected rate when the Amazon Web Services CloudHSM cluster associated with the Amazon Web
     *         Services CloudHSM key store is processing numerous commands, including those unrelated to the Amazon Web
     *         Services CloudHSM key store.
     *         </p>
     *         </li>
     * @throws QueueDoesNotExistException
     *         The specified queue doesn't exist.
     * @throws UnsupportedOperationException
     *         Error code 400. Unsupported operation.
     * @throws InvalidAddressException
     *         The <code>accountId</code> is invalid.
     * @throws InvalidSecurityException
     *         When the request to a queue is not HTTPS and SigV4.
     * @sample AmazonSQS.ListQueueTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/ListQueueTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListQueueTagsResult listQueueTags(ListQueueTagsRequest request) {
        request = beforeClientExecution(request);
        return executeListQueueTags(request);
    }

    @SdkInternalApi
    final ListQueueTagsResult executeListQueueTags(ListQueueTagsRequest listQueueTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(listQueueTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListQueueTagsRequest> request = null;
        Response<ListQueueTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListQueueTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listQueueTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SQS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListQueueTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListQueueTagsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListQueueTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListQueueTagsResult listQueueTags(String queueUrl) {
        return listQueueTags(new ListQueueTagsRequest().withQueueUrl(queueUrl));
    }

    /**
     * <p>
     * Returns a list of your queues in the current region. The response includes a maximum of 1,000 results. If you
     * specify a value for the optional <code>QueueNamePrefix</code> parameter, only queues with a name that begins with
     * the specified value are returned.
     * </p>
     * <p>
     * The <code>listQueues</code> methods supports pagination. Set parameter <code>MaxResults</code> in the request to
     * specify the maximum number of results to be returned in the response. If you do not set <code>MaxResults</code>,
     * the response includes a maximum of 1,000 results. If you set <code>MaxResults</code> and there are additional
     * results to display, the response includes a value for <code>NextToken</code>. Use <code>NextToken</code> as a
     * parameter in your next request to <code>listQueues</code> to receive the next page of results.
     * </p>
     * <note>
     * <p>
     * Cross-account permissions don't apply to this action. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name"
     * >Grant cross-account permissions to a role and a username</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param listQueuesRequest
     * @return Result of the ListQueues operation returned by the service.
     * @throws RequestThrottledException
     *         The request was denied due to request throttling.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The rate of requests per second exceeds the Amazon Web Services KMS request quota for an account and
     *         Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A burst or sustained high rate of requests to change the state of the same KMS key. This condition is
     *         often known as a "hot key."
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Requests for operations on KMS keys in a Amazon Web Services CloudHSM key store might be throttled at a
     *         lower-than-expected rate when the Amazon Web Services CloudHSM cluster associated with the Amazon Web
     *         Services CloudHSM key store is processing numerous commands, including those unrelated to the Amazon Web
     *         Services CloudHSM key store.
     *         </p>
     *         </li>
     * @throws InvalidSecurityException
     *         When the request to a queue is not HTTPS and SigV4.
     * @throws InvalidAddressException
     *         The <code>accountId</code> is invalid.
     * @throws UnsupportedOperationException
     *         Error code 400. Unsupported operation.
     * @sample AmazonSQS.ListQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/ListQueues" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListQueuesResult listQueues(ListQueuesRequest request) {
        request = beforeClientExecution(request);
        return executeListQueues(request);
    }

    @SdkInternalApi
    final ListQueuesResult executeListQueues(ListQueuesRequest listQueuesRequest) {

        ExecutionContext executionContext = createExecutionContext(listQueuesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListQueuesRequest> request = null;
        Response<ListQueuesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListQueuesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listQueuesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SQS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListQueues");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListQueuesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListQueuesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListQueuesResult listQueues() {
        return listQueues(new ListQueuesRequest());
    }

    @Override
    public ListQueuesResult listQueues(String queueNamePrefix) {
        return listQueues(new ListQueuesRequest().withQueueNamePrefix(queueNamePrefix));
    }

    /**
     * <p>
     * Deletes available messages in a queue (including in-flight messages) specified by the <code>QueueURL</code>
     * parameter.
     * </p>
     * <important>
     * <p>
     * When you use the <code>PurgeQueue</code> action, you can't retrieve any messages deleted from a queue.
     * </p>
     * <p>
     * The message deletion process takes up to 60 seconds. We recommend waiting for 60 seconds regardless of your
     * queue's size.
     * </p>
     * </important>
     * <p>
     * Messages sent to the queue <i>before</i> you call <code>PurgeQueue</code> might be received but are deleted
     * within the next minute.
     * </p>
     * <p>
     * Messages sent to the queue <i>after</i> you call <code>PurgeQueue</code> might be deleted while the queue is
     * being purged.
     * </p>
     * 
     * @param purgeQueueRequest
     * @return Result of the PurgeQueue operation returned by the service.
     * @throws QueueDoesNotExistException
     *         The specified queue doesn't exist.
     * @throws PurgeQueueInProgressException
     *         Indicates that the specified queue previously received a <code>PurgeQueue</code> request within the last
     *         60 seconds (the time it can take to delete the messages in the queue).
     * @throws RequestThrottledException
     *         The request was denied due to request throttling.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The rate of requests per second exceeds the Amazon Web Services KMS request quota for an account and
     *         Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A burst or sustained high rate of requests to change the state of the same KMS key. This condition is
     *         often known as a "hot key."
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Requests for operations on KMS keys in a Amazon Web Services CloudHSM key store might be throttled at a
     *         lower-than-expected rate when the Amazon Web Services CloudHSM cluster associated with the Amazon Web
     *         Services CloudHSM key store is processing numerous commands, including those unrelated to the Amazon Web
     *         Services CloudHSM key store.
     *         </p>
     *         </li>
     * @throws InvalidAddressException
     *         The <code>accountId</code> is invalid.
     * @throws InvalidSecurityException
     *         When the request to a queue is not HTTPS and SigV4.
     * @throws UnsupportedOperationException
     *         Error code 400. Unsupported operation.
     * @sample AmazonSQS.PurgeQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/PurgeQueue" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PurgeQueueResult purgeQueue(PurgeQueueRequest request) {
        request = beforeClientExecution(request);
        return executePurgeQueue(request);
    }

    @SdkInternalApi
    final PurgeQueueResult executePurgeQueue(PurgeQueueRequest purgeQueueRequest) {

        ExecutionContext executionContext = createExecutionContext(purgeQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PurgeQueueRequest> request = null;
        Response<PurgeQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PurgeQueueRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(purgeQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SQS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PurgeQueue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PurgeQueueResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PurgeQueueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves one or more messages (up to 10), from the specified queue. Using the <code>WaitTimeSeconds</code>
     * parameter enables long-poll support. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-long-polling.html">Amazon
     * SQS Long Polling</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <p>
     * Short poll is the default behavior where a weighted random set of machines is sampled on a
     * <code>ReceiveMessage</code> call. Thus, only the messages on the sampled machines are returned. If the number of
     * messages in the queue is small (fewer than 1,000), you most likely get fewer messages than you requested per
     * <code>ReceiveMessage</code> call. If the number of messages in the queue is extremely small, you might not
     * receive any messages in a particular <code>ReceiveMessage</code> response. If this happens, repeat the request.
     * </p>
     * <p>
     * For each message returned, the response includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The message body.
     * </p>
     * </li>
     * <li>
     * <p>
     * An MD5 digest of the message body. For information about MD5, see <a
     * href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>MessageId</code> you received when you sent the message to the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * The receipt handle.
     * </p>
     * </li>
     * <li>
     * <p>
     * The message attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * An MD5 digest of the message attributes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The receipt handle is the identifier you must provide when deleting the message. For more information, see <a
     * href
     * ="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-message-identifiers.html"
     * >Queue and Message Identifiers</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <p>
     * You can provide the <code>VisibilityTimeout</code> parameter in your request. The parameter is applied to the
     * messages that Amazon SQS returns in the response. If you don't include the parameter, the overall visibility
     * timeout for the queue is used for the returned messages. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <p>
     * A message that isn't deleted or a message whose visibility isn't extended before the visibility timeout expires
     * counts as a failed receive. Depending on the configuration of the queue, the message might be sent to the
     * dead-letter queue.
     * </p>
     * <note>
     * <p>
     * In the future, new attributes might be added. If you write code that calls this action, we recommend that you
     * structure your code so that it can handle new attributes gracefully.
     * </p>
     * </note>
     * 
     * @param receiveMessageRequest
     * @return Result of the ReceiveMessage operation returned by the service.
     * @throws UnsupportedOperationException
     *         Error code 400. Unsupported operation.
     * @throws OverLimitException
     *         The specified action violates a limit. For example, <code>ReceiveMessage</code> returns this error if the
     *         maximum number of in flight messages is reached and <code>AddPermission</code> returns this error if the
     *         maximum number of permissions for the queue is reached.
     * @throws RequestThrottledException
     *         The request was denied due to request throttling.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The rate of requests per second exceeds the Amazon Web Services KMS request quota for an account and
     *         Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A burst or sustained high rate of requests to change the state of the same KMS key. This condition is
     *         often known as a "hot key."
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Requests for operations on KMS keys in a Amazon Web Services CloudHSM key store might be throttled at a
     *         lower-than-expected rate when the Amazon Web Services CloudHSM cluster associated with the Amazon Web
     *         Services CloudHSM key store is processing numerous commands, including those unrelated to the Amazon Web
     *         Services CloudHSM key store.
     *         </p>
     *         </li>
     * @throws QueueDoesNotExistException
     *         The specified queue doesn't exist.
     * @throws InvalidSecurityException
     *         When the request to a queue is not HTTPS and SigV4.
     * @throws KmsDisabledException
     *         The request was denied due to request throttling.
     * @throws KmsInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.
     * @throws KmsNotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws KmsOptInRequiredException
     *         The request was rejected because the specified key policy isn't syntactically or semantically correct.
     * @throws KmsThrottledException
     *         Amazon Web Services KMS throttles requests for the following conditions.
     * @throws KmsAccessDeniedException
     *         The caller doesn't have the required KMS access.
     * @throws KmsInvalidKeyUsageException
     *         The request was rejected for one of the following reasons:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The KeyUsage value of the KMS key is incompatible with the API operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The encryption algorithm or signing algorithm specified for the operation is incompatible with the type
     *         of key material in the KMS key (KeySpec).
     *         </p>
     *         </li>
     * @throws InvalidAddressException
     *         The <code>accountId</code> is invalid.
     * @sample AmazonSQS.ReceiveMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/ReceiveMessage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ReceiveMessageResult receiveMessage(ReceiveMessageRequest request) {
        request = beforeClientExecution(request);
        return executeReceiveMessage(request);
    }

    @SdkInternalApi
    final ReceiveMessageResult executeReceiveMessage(ReceiveMessageRequest receiveMessageRequest) {

        ExecutionContext executionContext = createExecutionContext(receiveMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReceiveMessageRequest> request = null;
        Response<ReceiveMessageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReceiveMessageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(receiveMessageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SQS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ReceiveMessage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ReceiveMessageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ReceiveMessageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ReceiveMessageResult receiveMessage(String queueUrl) {
        return receiveMessage(new ReceiveMessageRequest().withQueueUrl(queueUrl));
    }

    /**
     * <p>
     * Revokes any permissions in the queue policy that matches the specified <code>Label</code> parameter.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Only the owner of a queue can remove permissions from it.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cross-account permissions don't apply to this action. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name"
     * >Grant cross-account permissions to a role and a username</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To remove the ability to change queue permissions, you must deny permission to the <code>AddPermission</code>,
     * <code>RemovePermission</code>, and <code>SetQueueAttributes</code> actions in your IAM policy.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param removePermissionRequest
     * @return Result of the RemovePermission operation returned by the service.
     * @throws InvalidAddressException
     *         The <code>accountId</code> is invalid.
     * @throws RequestThrottledException
     *         The request was denied due to request throttling.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The rate of requests per second exceeds the Amazon Web Services KMS request quota for an account and
     *         Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A burst or sustained high rate of requests to change the state of the same KMS key. This condition is
     *         often known as a "hot key."
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Requests for operations on KMS keys in a Amazon Web Services CloudHSM key store might be throttled at a
     *         lower-than-expected rate when the Amazon Web Services CloudHSM cluster associated with the Amazon Web
     *         Services CloudHSM key store is processing numerous commands, including those unrelated to the Amazon Web
     *         Services CloudHSM key store.
     *         </p>
     *         </li>
     * @throws QueueDoesNotExistException
     *         The specified queue doesn't exist.
     * @throws InvalidSecurityException
     *         When the request to a queue is not HTTPS and SigV4.
     * @throws UnsupportedOperationException
     *         Error code 400. Unsupported operation.
     * @sample AmazonSQS.RemovePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/RemovePermission" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RemovePermissionResult removePermission(RemovePermissionRequest request) {
        request = beforeClientExecution(request);
        return executeRemovePermission(request);
    }

    @SdkInternalApi
    final RemovePermissionResult executeRemovePermission(RemovePermissionRequest removePermissionRequest) {

        ExecutionContext executionContext = createExecutionContext(removePermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemovePermissionRequest> request = null;
        Response<RemovePermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemovePermissionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(removePermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SQS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemovePermission");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemovePermissionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RemovePermissionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public RemovePermissionResult removePermission(String queueUrl, String label) {
        return removePermission(new RemovePermissionRequest().withQueueUrl(queueUrl).withLabel(label));
    }

    /**
     * <p>
     * Delivers a message to the specified queue.
     * </p>
     * <important>
     * <p>
     * A message can include only XML, JSON, and unformatted text. The following Unicode characters are allowed:
     * </p>
     * <p>
     * <code>#x9</code> | <code>#xA</code> | <code>#xD</code> | <code>#x20</code> to <code>#xD7FF</code> |
     * <code>#xE000</code> to <code>#xFFFD</code> | <code>#x10000</code> to <code>#x10FFFF</code>
     * </p>
     * <p>
     * Any characters not included in this list will be rejected. For more information, see the <a
     * href="http://www.w3.org/TR/REC-xml/#charsets">W3C specification for characters</a>.
     * </p>
     * </important>
     * 
     * @param sendMessageRequest
     * @return Result of the SendMessage operation returned by the service.
     * @throws InvalidMessageContentsException
     *         The message contains characters outside the allowed set.
     * @throws UnsupportedOperationException
     *         Error code 400. Unsupported operation.
     * @throws RequestThrottledException
     *         The request was denied due to request throttling.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The rate of requests per second exceeds the Amazon Web Services KMS request quota for an account and
     *         Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A burst or sustained high rate of requests to change the state of the same KMS key. This condition is
     *         often known as a "hot key."
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Requests for operations on KMS keys in a Amazon Web Services CloudHSM key store might be throttled at a
     *         lower-than-expected rate when the Amazon Web Services CloudHSM cluster associated with the Amazon Web
     *         Services CloudHSM key store is processing numerous commands, including those unrelated to the Amazon Web
     *         Services CloudHSM key store.
     *         </p>
     *         </li>
     * @throws QueueDoesNotExistException
     *         The specified queue doesn't exist.
     * @throws InvalidSecurityException
     *         When the request to a queue is not HTTPS and SigV4.
     * @throws KmsDisabledException
     *         The request was denied due to request throttling.
     * @throws KmsInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.
     * @throws KmsNotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws KmsOptInRequiredException
     *         The request was rejected because the specified key policy isn't syntactically or semantically correct.
     * @throws KmsThrottledException
     *         Amazon Web Services KMS throttles requests for the following conditions.
     * @throws KmsAccessDeniedException
     *         The caller doesn't have the required KMS access.
     * @throws KmsInvalidKeyUsageException
     *         The request was rejected for one of the following reasons:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The KeyUsage value of the KMS key is incompatible with the API operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The encryption algorithm or signing algorithm specified for the operation is incompatible with the type
     *         of key material in the KMS key (KeySpec).
     *         </p>
     *         </li>
     * @throws InvalidAddressException
     *         The <code>accountId</code> is invalid.
     * @sample AmazonSQS.SendMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/SendMessage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SendMessageResult sendMessage(SendMessageRequest request) {
        request = beforeClientExecution(request);
        return executeSendMessage(request);
    }

    @SdkInternalApi
    final SendMessageResult executeSendMessage(SendMessageRequest sendMessageRequest) {

        ExecutionContext executionContext = createExecutionContext(sendMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendMessageRequest> request = null;
        Response<SendMessageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendMessageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(sendMessageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SQS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendMessage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendMessageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SendMessageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public SendMessageResult sendMessage(String queueUrl, String messageBody) {
        return sendMessage(new SendMessageRequest().withQueueUrl(queueUrl).withMessageBody(messageBody));
    }

    /**
     * <p>
     * You can use <code>SendMessageBatch</code> to send up to 10 messages to the specified queue by assigning either
     * identical or different values to each message (or by not assigning values at all). This is a batch version of
     * <code> <a>SendMessage</a>.</code> For a FIFO queue, multiple messages within a single batch are enqueued in the
     * order they are sent.
     * </p>
     * <p>
     * The result of sending each message is reported individually in the response. Because the batch request can result
     * in a combination of successful and unsuccessful actions, you should check for batch errors even when the call
     * returns an HTTP status code of <code>200</code>.
     * </p>
     * <p>
     * The maximum allowed individual message size and the maximum total payload size (the sum of the individual lengths
     * of all of the batched messages) are both 256 KiB (262,144 bytes).
     * </p>
     * <important>
     * <p>
     * A message can include only XML, JSON, and unformatted text. The following Unicode characters are allowed:
     * </p>
     * <p>
     * <code>#x9</code> | <code>#xA</code> | <code>#xD</code> | <code>#x20</code> to <code>#xD7FF</code> |
     * <code>#xE000</code> to <code>#xFFFD</code> | <code>#x10000</code> to <code>#x10FFFF</code>
     * </p>
     * <p>
     * Any characters not included in this list will be rejected. For more information, see the <a
     * href="http://www.w3.org/TR/REC-xml/#charsets">W3C specification for characters</a>.
     * </p>
     * </important>
     * <p>
     * If you don't specify the <code>DelaySeconds</code> parameter for an entry, Amazon SQS uses the default value for
     * the queue.
     * </p>
     * 
     * @param sendMessageBatchRequest
     * @return Result of the SendMessageBatch operation returned by the service.
     * @throws TooManyEntriesInBatchRequestException
     *         The batch request contains more entries than permissible.
     * @throws EmptyBatchRequestException
     *         The batch request doesn't contain any entries.
     * @throws BatchEntryIdsNotDistinctException
     *         Two or more batch entries in the request have the same <code>Id</code>.
     * @throws BatchRequestTooLongException
     *         The length of all the messages put together is more than the limit.
     * @throws InvalidBatchEntryIdException
     *         The <code>Id</code> of a batch entry in a batch request doesn't abide by the specification.
     * @throws UnsupportedOperationException
     *         Error code 400. Unsupported operation.
     * @throws RequestThrottledException
     *         The request was denied due to request throttling.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The rate of requests per second exceeds the Amazon Web Services KMS request quota for an account and
     *         Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A burst or sustained high rate of requests to change the state of the same KMS key. This condition is
     *         often known as a "hot key."
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Requests for operations on KMS keys in a Amazon Web Services CloudHSM key store might be throttled at a
     *         lower-than-expected rate when the Amazon Web Services CloudHSM cluster associated with the Amazon Web
     *         Services CloudHSM key store is processing numerous commands, including those unrelated to the Amazon Web
     *         Services CloudHSM key store.
     *         </p>
     *         </li>
     * @throws QueueDoesNotExistException
     *         The specified queue doesn't exist.
     * @throws InvalidSecurityException
     *         When the request to a queue is not HTTPS and SigV4.
     * @throws KmsDisabledException
     *         The request was denied due to request throttling.
     * @throws KmsInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.
     * @throws KmsNotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws KmsOptInRequiredException
     *         The request was rejected because the specified key policy isn't syntactically or semantically correct.
     * @throws KmsThrottledException
     *         Amazon Web Services KMS throttles requests for the following conditions.
     * @throws KmsAccessDeniedException
     *         The caller doesn't have the required KMS access.
     * @throws KmsInvalidKeyUsageException
     *         The request was rejected for one of the following reasons:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The KeyUsage value of the KMS key is incompatible with the API operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The encryption algorithm or signing algorithm specified for the operation is incompatible with the type
     *         of key material in the KMS key (KeySpec).
     *         </p>
     *         </li>
     * @throws InvalidAddressException
     *         The <code>accountId</code> is invalid.
     * @sample AmazonSQS.SendMessageBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/SendMessageBatch" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SendMessageBatchResult sendMessageBatch(SendMessageBatchRequest request) {
        request = beforeClientExecution(request);
        return executeSendMessageBatch(request);
    }

    @SdkInternalApi
    final SendMessageBatchResult executeSendMessageBatch(SendMessageBatchRequest sendMessageBatchRequest) {

        ExecutionContext executionContext = createExecutionContext(sendMessageBatchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendMessageBatchRequest> request = null;
        Response<SendMessageBatchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendMessageBatchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(sendMessageBatchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SQS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendMessageBatch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendMessageBatchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SendMessageBatchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public SendMessageBatchResult sendMessageBatch(String queueUrl, java.util.List<SendMessageBatchRequestEntry> entries) {
        return sendMessageBatch(new SendMessageBatchRequest().withQueueUrl(queueUrl).withEntries(entries));
    }

    /**
     * <p>
     * Sets the value of one or more queue attributes, like a policy. When you change a queue's attributes, the change
     * can take up to 60 seconds for most of the attributes to propagate throughout the Amazon SQS system. Changes made
     * to the <code>MessageRetentionPeriod</code> attribute can take up to 15 minutes and will impact existing messages
     * in the queue potentially causing them to be expired and deleted if the <code>MessageRetentionPeriod</code> is
     * reduced below the age of existing messages.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * In the future, new attributes might be added. If you write code that calls this action, we recommend that you
     * structure your code so that it can handle new attributes gracefully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cross-account permissions don't apply to this action. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name"
     * >Grant cross-account permissions to a role and a username</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To remove the ability to change queue permissions, you must deny permission to the <code>AddPermission</code>,
     * <code>RemovePermission</code>, and <code>SetQueueAttributes</code> actions in your IAM policy.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param setQueueAttributesRequest
     * @return Result of the SetQueueAttributes operation returned by the service.
     * @throws InvalidAttributeNameException
     *         The specified attribute doesn't exist.
     * @throws InvalidAttributeValueException
     *         A queue attribute value is invalid.
     * @throws RequestThrottledException
     *         The request was denied due to request throttling.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The rate of requests per second exceeds the Amazon Web Services KMS request quota for an account and
     *         Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A burst or sustained high rate of requests to change the state of the same KMS key. This condition is
     *         often known as a "hot key."
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Requests for operations on KMS keys in a Amazon Web Services CloudHSM key store might be throttled at a
     *         lower-than-expected rate when the Amazon Web Services CloudHSM cluster associated with the Amazon Web
     *         Services CloudHSM key store is processing numerous commands, including those unrelated to the Amazon Web
     *         Services CloudHSM key store.
     *         </p>
     *         </li>
     * @throws QueueDoesNotExistException
     *         The specified queue doesn't exist.
     * @throws UnsupportedOperationException
     *         Error code 400. Unsupported operation.
     * @throws OverLimitException
     *         The specified action violates a limit. For example, <code>ReceiveMessage</code> returns this error if the
     *         maximum number of in flight messages is reached and <code>AddPermission</code> returns this error if the
     *         maximum number of permissions for the queue is reached.
     * @throws InvalidAddressException
     *         The <code>accountId</code> is invalid.
     * @throws InvalidSecurityException
     *         When the request to a queue is not HTTPS and SigV4.
     * @sample AmazonSQS.SetQueueAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/SetQueueAttributes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SetQueueAttributesResult setQueueAttributes(SetQueueAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeSetQueueAttributes(request);
    }

    @SdkInternalApi
    final SetQueueAttributesResult executeSetQueueAttributes(SetQueueAttributesRequest setQueueAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(setQueueAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetQueueAttributesRequest> request = null;
        Response<SetQueueAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetQueueAttributesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(setQueueAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SQS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetQueueAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetQueueAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SetQueueAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public SetQueueAttributesResult setQueueAttributes(String queueUrl, java.util.Map<String, String> attributes) {
        return setQueueAttributes(new SetQueueAttributesRequest().withQueueUrl(queueUrl).withAttributes(attributes));
    }

    /**
     * <p>
     * Starts an asynchronous task to move messages from a specified source queue to a specified destination queue.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * This action is currently limited to supporting message redrive from queues that are configured as <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     * >dead-letter queues (DLQs)</a> of other Amazon SQS queues only. Non-SQS queue sources of dead-letter queues, such
     * as Lambda or Amazon SNS topics, are currently not supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * In dead-letter queues redrive context, the <code>StartMessageMoveTask</code> the source queue is the DLQ, while
     * the destination queue can be the original source queue (from which the messages were driven to the
     * dead-letter-queue), or a custom destination queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * Only one active message movement task is supported per queue at any given time.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param startMessageMoveTaskRequest
     * @return Result of the StartMessageMoveTask operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more specified resources don't exist.
     * @throws RequestThrottledException
     *         The request was denied due to request throttling.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The rate of requests per second exceeds the Amazon Web Services KMS request quota for an account and
     *         Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A burst or sustained high rate of requests to change the state of the same KMS key. This condition is
     *         often known as a "hot key."
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Requests for operations on KMS keys in a Amazon Web Services CloudHSM key store might be throttled at a
     *         lower-than-expected rate when the Amazon Web Services CloudHSM cluster associated with the Amazon Web
     *         Services CloudHSM key store is processing numerous commands, including those unrelated to the Amazon Web
     *         Services CloudHSM key store.
     *         </p>
     *         </li>
     * @throws InvalidAddressException
     *         The <code>accountId</code> is invalid.
     * @throws InvalidSecurityException
     *         When the request to a queue is not HTTPS and SigV4.
     * @throws UnsupportedOperationException
     *         Error code 400. Unsupported operation.
     * @sample AmazonSQS.StartMessageMoveTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/StartMessageMoveTask" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartMessageMoveTaskResult startMessageMoveTask(StartMessageMoveTaskRequest request) {
        request = beforeClientExecution(request);
        return executeStartMessageMoveTask(request);
    }

    @SdkInternalApi
    final StartMessageMoveTaskResult executeStartMessageMoveTask(StartMessageMoveTaskRequest startMessageMoveTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(startMessageMoveTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartMessageMoveTaskRequest> request = null;
        Response<StartMessageMoveTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartMessageMoveTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startMessageMoveTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SQS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartMessageMoveTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartMessageMoveTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartMessageMoveTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Add cost allocation tags to the specified Amazon SQS queue. For an overview, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-tags.html">Tagging
     * Your Amazon SQS Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <p>
     * When you use queue tags, keep the following guidelines in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Adding more than 50 tags to a queue isn't recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags don't have any semantic meaning. Amazon SQS interprets tags as character strings.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * A new tag with a key identical to that of an existing tag overwrites the existing tag.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a full list of tag restrictions, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-limits.html#limits-queues"
     * >Quotas related to queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Cross-account permissions don't apply to this action. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name"
     * >Grant cross-account permissions to a role and a username</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param tagQueueRequest
     * @return Result of the TagQueue operation returned by the service.
     * @throws InvalidAddressException
     *         The <code>accountId</code> is invalid.
     * @throws RequestThrottledException
     *         The request was denied due to request throttling.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The rate of requests per second exceeds the Amazon Web Services KMS request quota for an account and
     *         Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A burst or sustained high rate of requests to change the state of the same KMS key. This condition is
     *         often known as a "hot key."
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Requests for operations on KMS keys in a Amazon Web Services CloudHSM key store might be throttled at a
     *         lower-than-expected rate when the Amazon Web Services CloudHSM cluster associated with the Amazon Web
     *         Services CloudHSM key store is processing numerous commands, including those unrelated to the Amazon Web
     *         Services CloudHSM key store.
     *         </p>
     *         </li>
     * @throws QueueDoesNotExistException
     *         The specified queue doesn't exist.
     * @throws InvalidSecurityException
     *         When the request to a queue is not HTTPS and SigV4.
     * @throws UnsupportedOperationException
     *         Error code 400. Unsupported operation.
     * @sample AmazonSQS.TagQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/TagQueue" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TagQueueResult tagQueue(TagQueueRequest request) {
        request = beforeClientExecution(request);
        return executeTagQueue(request);
    }

    @SdkInternalApi
    final TagQueueResult executeTagQueue(TagQueueRequest tagQueueRequest) {

        ExecutionContext executionContext = createExecutionContext(tagQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagQueueRequest> request = null;
        Response<TagQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagQueueRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SQS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagQueue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagQueueResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagQueueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public TagQueueResult tagQueue(String queueUrl, java.util.Map<String, String> tags) {
        return tagQueue(new TagQueueRequest().withQueueUrl(queueUrl).withTags(tags));
    }

    /**
     * <p>
     * Remove cost allocation tags from the specified Amazon SQS queue. For an overview, see <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-tags.html">Tagging
     * Your Amazon SQS Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Cross-account permissions don't apply to this action. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name"
     * >Grant cross-account permissions to a role and a username</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param untagQueueRequest
     * @return Result of the UntagQueue operation returned by the service.
     * @throws InvalidAddressException
     *         The <code>accountId</code> is invalid.
     * @throws RequestThrottledException
     *         The request was denied due to request throttling.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The rate of requests per second exceeds the Amazon Web Services KMS request quota for an account and
     *         Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A burst or sustained high rate of requests to change the state of the same KMS key. This condition is
     *         often known as a "hot key."
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Requests for operations on KMS keys in a Amazon Web Services CloudHSM key store might be throttled at a
     *         lower-than-expected rate when the Amazon Web Services CloudHSM cluster associated with the Amazon Web
     *         Services CloudHSM key store is processing numerous commands, including those unrelated to the Amazon Web
     *         Services CloudHSM key store.
     *         </p>
     *         </li>
     * @throws QueueDoesNotExistException
     *         The specified queue doesn't exist.
     * @throws InvalidSecurityException
     *         When the request to a queue is not HTTPS and SigV4.
     * @throws UnsupportedOperationException
     *         Error code 400. Unsupported operation.
     * @sample AmazonSQS.UntagQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/UntagQueue" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UntagQueueResult untagQueue(UntagQueueRequest request) {
        request = beforeClientExecution(request);
        return executeUntagQueue(request);
    }

    @SdkInternalApi
    final UntagQueueResult executeUntagQueue(UntagQueueRequest untagQueueRequest) {

        ExecutionContext executionContext = createExecutionContext(untagQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagQueueRequest> request = null;
        Response<UntagQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagQueueRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SQS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagQueue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagQueueResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagQueueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public UntagQueueResult untagQueue(String queueUrl, java.util.List<String> tagKeys) {
        return untagQueue(new UntagQueueRequest().withQueueUrl(queueUrl).withTagKeys(tagKeys));
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

    @Override
    protected final SignerProvider createSignerProvider(Signer signer) {
        return new com.amazonaws.services.sqs.internal.auth.SQSSignerProvider(this, signer);
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

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata()
                .withAwsQueryCompatible(true));

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
