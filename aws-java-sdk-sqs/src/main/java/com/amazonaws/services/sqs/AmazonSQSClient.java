/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
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

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.sqs.model.*;
import com.amazonaws.services.sqs.model.transform.*;

/**
 * Client for accessing Amazon SQS. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * Welcome to the <i>Amazon Simple Queue Service API Reference</i>. This section describes who should read this guide,
 * how the guide is organized, and other resources related to the Amazon Simple Queue Service (Amazon SQS).
 * </p>
 * <p>
 * Amazon SQS offers reliable and scalable hosted queues for storing messages as they travel between computers. By using
 * Amazon SQS, you can move data between distributed components of your applications that perform different tasks
 * without losing messages or requiring each component to be always available.
 * </p>
 * <p>
 * Helpful Links:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://queue.amazonaws.com/doc/2012-11-05/QueueService.wsdl">Current WSDL (2012-11-05)</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/MakingRequestsArticle.html">Making
 * API Requests</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/sqs/">Amazon SQS product page</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html">Using
 * Amazon SQS Message Attributes</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html">Using
 * Amazon SQS Dead Letter Queues</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#sqs_region">Regions and Endpoints</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * We also provide SDKs that enable you to access Amazon SQS from your preferred programming language. The SDKs contain
 * functionality that automatically takes care of tasks such as:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Cryptographically signing your service requests
 * </p>
 * </li>
 * <li>
 * <p>
 * Retrying requests
 * </p>
 * </li>
 * <li>
 * <p>
 * Handling error responses
 * </p>
 * </li>
 * </ul>
 * <p>
 * For a list of available SDKs, go to <a href="http://aws.amazon.com/tools/">Tools for Amazon Web Services</a>.
 * </p>
 */
@ThreadSafe
public class AmazonSQSClient extends AmazonWebServiceClient implements AmazonSQS {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonSQS.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "sqs";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final com.amazonaws.services.sqs.AmazonSQSClientConfigurationFactory configFactory = new com.amazonaws.services.sqs.AmazonSQSClientConfigurationFactory();

    /**
     * List of exception unmarshallers for all modeled exceptions
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

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
     */
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
     */
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
     */
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
     */
    public AmazonSQSClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
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
     */
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
     */
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
     */
    public AmazonSQSClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
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
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new PurgeQueueInProgressExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidAttributeNameExceptionUnmarshaller());
        exceptionUnmarshallers.add(new BatchEntryIdsNotDistinctExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyEntriesInBatchRequestExceptionUnmarshaller());
        exceptionUnmarshallers.add(new BatchRequestTooLongExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UnsupportedOperationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidIdFormatExceptionUnmarshaller());
        exceptionUnmarshallers.add(new OverLimitExceptionUnmarshaller());
        exceptionUnmarshallers.add(new QueueDoesNotExistExceptionUnmarshaller());
        exceptionUnmarshallers.add(new QueueNameExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MessageNotInflightExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReceiptHandleIsInvalidExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidMessageContentsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new QueueDeletedRecentlyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new EmptyBatchRequestExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidBatchEntryIdExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller(com.amazonaws.services.sqs.model.AmazonSQSException.class));

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("https://sqs.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/sqs/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/sqs/request.handler2s"));
    }

    /**
     * <p>
     * Adds a permission to a queue for a specific <a
     * href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P">principal</a>. This allows for sharing
     * access to the queue.
     * </p>
     * <p>
     * When you create a queue, you have full control access rights for the queue. Only you (as owner of the queue) can
     * grant or deny permissions to the queue. For more information about these permissions, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html">Shared
     * Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <code>AddPermission</code> writes an Amazon SQS-generated policy. If you want to write your own policy, use
     * <a>SetQueueAttributes</a> to upload your policy. For more information about writing your own policy, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AccessPolicyLanguage.html">Using
     * The Access Policy Language</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </note> <note>
     * <p>
     * Some API actions take lists of parameters. These lists are specified using the <code>param.n</code> notation.
     * Values of <code>n</code> are integers starting from 1. For example, a parameter list with two elements looks like
     * this:
     * </p>
     * </note>
     * <p>
     * <code><![CDATA[&amp;Attribute.1=this]]></code>
     * </p>
     * <p>
     * <code><![CDATA[&amp;Attribute.2=that]]></code>
     * </p>
     * 
     * @param addPermissionRequest
     * @return Result of the AddPermission operation returned by the service.
     * @throws OverLimitException
     *         The action that you requested would violate a limit. For example, ReceiveMessage returns this error if
     *         the maximum number of messages inflight has already been reached. <a>AddPermission</a> returns this error
     *         if the maximum number of permissions for the queue has already been reached.
     * @sample AmazonSQS.AddPermission
     */
    @Override
    public AddPermissionResult addPermission(AddPermissionRequest addPermissionRequest) {
        ExecutionContext executionContext = createExecutionContext(addPermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddPermissionRequest> request = null;
        Response<AddPermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddPermissionRequestMarshaller().marshall(super.beforeMarshalling(addPermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<AddPermissionResult> responseHandler = new StaxResponseHandler<AddPermissionResult>(new AddPermissionResultStaxUnmarshaller());
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
     * Changes the visibility timeout of a specified message in a queue to a new value. The maximum allowed timeout
     * value you can set the value to is 12 hours. This means you can't extend the timeout of a message in an existing
     * queue to more than a total visibility timeout of 12 hours. (For more information visibility timeout, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html">Visibility
     * Timeout</a> in the <i>Amazon SQS Developer Guide</i>.)
     * </p>
     * <p>
     * For example, let's say you have a message and its default message visibility timeout is 5 minutes. After 3
     * minutes, you call <code>ChangeMessageVisiblity</code> with a timeout of 10 minutes. At that time, the timeout for
     * the message would be extended by 10 minutes beyond the time of the ChangeMessageVisibility call. This results in
     * a total visibility timeout of 13 minutes. You can continue to call ChangeMessageVisibility to extend the
     * visibility timeout to a maximum of 12 hours. If you try to extend beyond 12 hours, the request will be rejected.
     * </p>
     * <note>
     * <p>
     * There is a 120,000 limit for the number of inflight messages per queue. Messages are inflight after they have
     * been received from the queue by a consuming component, but have not yet been deleted from the queue. If you reach
     * the 120,000 limit, you will receive an OverLimit error message from Amazon SQS. To help avoid reaching the limit,
     * you should delete the messages from the queue after they have been processed. You can also increase the number of
     * queues you use to process the messages.
     * </p>
     * </note> <important>
     * <p>
     * If you attempt to set the <code>VisibilityTimeout</code> to an amount more than the maximum time left, Amazon SQS
     * returns an error. It will not automatically recalculate and increase the timeout to the maximum time remaining.
     * </p>
     * </important> <important>
     * <p>
     * Unlike with a queue, when you change the visibility timeout for a specific message, that timeout value is applied
     * immediately but is not saved in memory for that message. If you don't delete a message after it is received, the
     * visibility timeout for the message the next time it is received reverts to the original timeout value, not the
     * value you set with the <code>ChangeMessageVisibility</code> action.
     * </p>
     * </important>
     * 
     * @param changeMessageVisibilityRequest
     * @return Result of the ChangeMessageVisibility operation returned by the service.
     * @throws MessageNotInflightException
     *         The message referred to is not in flight.
     * @throws ReceiptHandleIsInvalidException
     *         The receipt handle provided is not valid.
     * @sample AmazonSQS.ChangeMessageVisibility
     */
    @Override
    public ChangeMessageVisibilityResult changeMessageVisibility(ChangeMessageVisibilityRequest changeMessageVisibilityRequest) {
        ExecutionContext executionContext = createExecutionContext(changeMessageVisibilityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ChangeMessageVisibilityRequest> request = null;
        Response<ChangeMessageVisibilityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ChangeMessageVisibilityRequestMarshaller().marshall(super.beforeMarshalling(changeMessageVisibilityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ChangeMessageVisibilityResult> responseHandler = new StaxResponseHandler<ChangeMessageVisibilityResult>(
                    new ChangeMessageVisibilityResultStaxUnmarshaller());
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
     * Changes the visibility timeout of multiple messages. This is a batch version of <a>ChangeMessageVisibility</a>.
     * The result of the action on each message is reported individually in the response. You can send up to 10
     * <a>ChangeMessageVisibility</a> requests with each <code>ChangeMessageVisibilityBatch</code> action.
     * </p>
     * <important>
     * <p>
     * Because the batch request can result in a combination of successful and unsuccessful actions, you should check
     * for batch errors even when the call returns an HTTP status code of 200.
     * </p>
     * </important> <note>
     * <p>
     * Some API actions take lists of parameters. These lists are specified using the <code>param.n</code> notation.
     * Values of <code>n</code> are integers starting from 1. For example, a parameter list with two elements looks like
     * this:
     * </p>
     * </note>
     * <p>
     * <code><![CDATA[&amp;Attribute.1=this]]></code>
     * </p>
     * <p>
     * <code><![CDATA[&amp;Attribute.2=that]]></code>
     * </p>
     * 
     * @param changeMessageVisibilityBatchRequest
     * @return Result of the ChangeMessageVisibilityBatch operation returned by the service.
     * @throws TooManyEntriesInBatchRequestException
     *         Batch request contains more number of entries than permissible.
     * @throws EmptyBatchRequestException
     *         Batch request does not contain an entry.
     * @throws BatchEntryIdsNotDistinctException
     *         Two or more batch entries have the same <code>Id</code> in the request.
     * @throws InvalidBatchEntryIdException
     *         The <code>Id</code> of a batch entry in a batch request does not abide by the specification.
     * @sample AmazonSQS.ChangeMessageVisibilityBatch
     */
    @Override
    public ChangeMessageVisibilityBatchResult changeMessageVisibilityBatch(ChangeMessageVisibilityBatchRequest changeMessageVisibilityBatchRequest) {
        ExecutionContext executionContext = createExecutionContext(changeMessageVisibilityBatchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ChangeMessageVisibilityBatchRequest> request = null;
        Response<ChangeMessageVisibilityBatchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ChangeMessageVisibilityBatchRequestMarshaller().marshall(super.beforeMarshalling(changeMessageVisibilityBatchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ChangeMessageVisibilityBatchResult> responseHandler = new StaxResponseHandler<ChangeMessageVisibilityBatchResult>(
                    new ChangeMessageVisibilityBatchResultStaxUnmarshaller());
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
     * Creates a new queue, or returns the URL of an existing one. When you request <code>CreateQueue</code>, you
     * provide a name for the queue. To successfully create a new queue, you must provide a name that is unique within
     * the scope of your own queues.
     * </p>
     * <note>
     * <p>
     * If you delete a queue, you must wait at least 60 seconds before creating a queue with the same name.
     * </p>
     * </note>
     * <p>
     * You may pass one or more attributes in the request. If you do not provide a value for any attribute, the queue
     * will have the default value for that attribute.
     * </p>
     * <note>
     * <p>
     * Use <a>GetQueueUrl</a> to get a queue's URL. <a>GetQueueUrl</a> requires only the <code>QueueName</code>
     * parameter.
     * </p>
     * </note>
     * <p>
     * If you provide the name of an existing queue, along with the exact names and values of all the queue's
     * attributes, <code>CreateQueue</code> returns the queue URL for the existing queue. If the queue name, attribute
     * names, or attribute values do not match an existing queue, <code>CreateQueue</code> returns an error.
     * </p>
     * <note>
     * <p>
     * Some API actions take lists of parameters. These lists are specified using the <code>param.n</code> notation.
     * Values of <code>n</code> are integers starting from 1. For example, a parameter list with two elements looks like
     * this:
     * </p>
     * </note>
     * <p>
     * <code><![CDATA[&amp;Attribute.1=this]]></code>
     * </p>
     * <p>
     * <code><![CDATA[&amp;Attribute.2=that]]></code>
     * </p>
     * 
     * @param createQueueRequest
     * @return Result of the CreateQueue operation returned by the service.
     * @throws QueueDeletedRecentlyException
     *         You must wait 60 seconds after deleting a queue before you can create another with the same name.
     * @throws QueueNameExistsException
     *         A queue already exists with this name. Amazon SQS returns this error only if the request includes
     *         attributes whose values differ from those of the existing queue.
     * @sample AmazonSQS.CreateQueue
     */
    @Override
    public CreateQueueResult createQueue(CreateQueueRequest createQueueRequest) {
        ExecutionContext executionContext = createExecutionContext(createQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateQueueRequest> request = null;
        Response<CreateQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateQueueRequestMarshaller().marshall(super.beforeMarshalling(createQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateQueueResult> responseHandler = new StaxResponseHandler<CreateQueueResult>(new CreateQueueResultStaxUnmarshaller());
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
     * Deletes the specified message from the specified queue. You specify the message by using the message's
     * <code>receipt handle</code> and not the <code>message ID</code> you received when you sent the message. Even if
     * the message is locked by another reader due to the visibility timeout setting, it is still deleted from the
     * queue. If you leave a message in the queue for longer than the queue's configured retention period, Amazon SQS
     * automatically deletes it.
     * </p>
     * <note>
     * <p>
     * The receipt handle is associated with a specific instance of receiving the message. If you receive a message more
     * than once, the receipt handle you get each time you receive the message is different. When you request
     * <code>DeleteMessage</code>, if you don't provide the most recently received receipt handle for the message, the
     * request will still succeed, but the message might not be deleted.
     * </p>
     * </note> <important>
     * <p>
     * It is possible you will receive a message even after you have deleted it. This might happen on rare occasions if
     * one of the servers storing a copy of the message is unavailable when you request to delete the message. The copy
     * remains on the server and might be returned to you again on a subsequent receive request. You should create your
     * system to be idempotent so that receiving a particular message more than once is not a problem.
     * </p>
     * </important>
     * 
     * @param deleteMessageRequest
     * @return Result of the DeleteMessage operation returned by the service.
     * @throws InvalidIdFormatException
     *         The receipt handle is not valid for the current version.
     * @throws ReceiptHandleIsInvalidException
     *         The receipt handle provided is not valid.
     * @sample AmazonSQS.DeleteMessage
     */
    @Override
    public DeleteMessageResult deleteMessage(DeleteMessageRequest deleteMessageRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMessageRequest> request = null;
        Response<DeleteMessageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMessageRequestMarshaller().marshall(super.beforeMarshalling(deleteMessageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteMessageResult> responseHandler = new StaxResponseHandler<DeleteMessageResult>(new DeleteMessageResultStaxUnmarshaller());
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
     * Deletes up to ten messages from the specified queue. This is a batch version of <a>DeleteMessage</a>. The result
     * of the delete action on each message is reported individually in the response.
     * </p>
     * <important>
     * <p>
     * Because the batch request can result in a combination of successful and unsuccessful actions, you should check
     * for batch errors even when the call returns an HTTP status code of 200.
     * </p>
     * </important> <note>
     * <p>
     * Some API actions take lists of parameters. These lists are specified using the <code>param.n</code> notation.
     * Values of <code>n</code> are integers starting from 1. For example, a parameter list with two elements looks like
     * this:
     * </p>
     * </note>
     * <p>
     * <code><![CDATA[&amp;Attribute.1=this]]></code>
     * </p>
     * <p>
     * <code><![CDATA[&amp;Attribute.2=that]]></code>
     * </p>
     * 
     * @param deleteMessageBatchRequest
     * @return Result of the DeleteMessageBatch operation returned by the service.
     * @throws TooManyEntriesInBatchRequestException
     *         Batch request contains more number of entries than permissible.
     * @throws EmptyBatchRequestException
     *         Batch request does not contain an entry.
     * @throws BatchEntryIdsNotDistinctException
     *         Two or more batch entries have the same <code>Id</code> in the request.
     * @throws InvalidBatchEntryIdException
     *         The <code>Id</code> of a batch entry in a batch request does not abide by the specification.
     * @sample AmazonSQS.DeleteMessageBatch
     */
    @Override
    public DeleteMessageBatchResult deleteMessageBatch(DeleteMessageBatchRequest deleteMessageBatchRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteMessageBatchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMessageBatchRequest> request = null;
        Response<DeleteMessageBatchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMessageBatchRequestMarshaller().marshall(super.beforeMarshalling(deleteMessageBatchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteMessageBatchResult> responseHandler = new StaxResponseHandler<DeleteMessageBatchResult>(
                    new DeleteMessageBatchResultStaxUnmarshaller());
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
     * Deletes the queue specified by the <b>queue URL</b>, regardless of whether the queue is empty. If the specified
     * queue does not exist, Amazon SQS returns a successful response.
     * </p>
     * <important>
     * <p>
     * Use <code>DeleteQueue</code> with care; once you delete your queue, any messages in the queue are no longer
     * available.
     * </p>
     * </important>
     * <p>
     * When you delete a queue, the deletion process takes up to 60 seconds. Requests you send involving that queue
     * during the 60 seconds might succeed. For example, a <a>SendMessage</a> request might succeed, but after the 60
     * seconds, the queue and that message you sent no longer exist. Also, when you delete a queue, you must wait at
     * least 60 seconds before creating a queue with the same name.
     * </p>
     * <p>
     * We reserve the right to delete queues that have had no activity for more than 30 days. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSConcepts.html">How Amazon
     * SQS Queues Work</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * 
     * @param deleteQueueRequest
     * @return Result of the DeleteQueue operation returned by the service.
     * @sample AmazonSQS.DeleteQueue
     */
    @Override
    public DeleteQueueResult deleteQueue(DeleteQueueRequest deleteQueueRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteQueueRequest> request = null;
        Response<DeleteQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteQueueRequestMarshaller().marshall(super.beforeMarshalling(deleteQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteQueueResult> responseHandler = new StaxResponseHandler<DeleteQueueResult>(new DeleteQueueResultStaxUnmarshaller());
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
     * Some API actions take lists of parameters. These lists are specified using the <code>param.n</code> notation.
     * Values of <code>n</code> are integers starting from 1. For example, a parameter list with two elements looks like
     * this:
     * </p>
     * </note>
     * <p>
     * <code><![CDATA[&amp;Attribute.1=this]]></code>
     * </p>
     * <p>
     * <code><![CDATA[&amp;Attribute.2=that]]></code>
     * </p>
     * 
     * @param getQueueAttributesRequest
     * @return Result of the GetQueueAttributes operation returned by the service.
     * @throws InvalidAttributeNameException
     *         The attribute referred to does not exist.
     * @sample AmazonSQS.GetQueueAttributes
     */
    @Override
    public GetQueueAttributesResult getQueueAttributes(GetQueueAttributesRequest getQueueAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(getQueueAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetQueueAttributesRequest> request = null;
        Response<GetQueueAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetQueueAttributesRequestMarshaller().marshall(super.beforeMarshalling(getQueueAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetQueueAttributesResult> responseHandler = new StaxResponseHandler<GetQueueAttributesResult>(
                    new GetQueueAttributesResultStaxUnmarshaller());
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
     * Returns the URL of an existing queue. This action provides a simple way to retrieve the URL of an Amazon SQS
     * queue.
     * </p>
     * <p>
     * To access a queue that belongs to another AWS account, use the <code>QueueOwnerAWSAccountId</code> parameter to
     * specify the account ID of the queue's owner. The queue's owner must grant you permission to access the queue. For
     * more information about shared queue access, see <a>AddPermission</a> or go to <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html">Shared
     * Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * 
     * @param getQueueUrlRequest
     * @return Result of the GetQueueUrl operation returned by the service.
     * @throws QueueDoesNotExistException
     *         The queue referred to does not exist.
     * @sample AmazonSQS.GetQueueUrl
     */
    @Override
    public GetQueueUrlResult getQueueUrl(GetQueueUrlRequest getQueueUrlRequest) {
        ExecutionContext executionContext = createExecutionContext(getQueueUrlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetQueueUrlRequest> request = null;
        Response<GetQueueUrlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetQueueUrlRequestMarshaller().marshall(super.beforeMarshalling(getQueueUrlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetQueueUrlResult> responseHandler = new StaxResponseHandler<GetQueueUrlResult>(new GetQueueUrlResultStaxUnmarshaller());
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
     * Returns a list of your queues that have the RedrivePolicy queue attribute configured with a dead letter queue.
     * </p>
     * <p>
     * For more information about using dead letter queues, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html">Using
     * Amazon SQS Dead Letter Queues</a>.
     * </p>
     * 
     * @param listDeadLetterSourceQueuesRequest
     * @return Result of the ListDeadLetterSourceQueues operation returned by the service.
     * @throws QueueDoesNotExistException
     *         The queue referred to does not exist.
     * @sample AmazonSQS.ListDeadLetterSourceQueues
     */
    @Override
    public ListDeadLetterSourceQueuesResult listDeadLetterSourceQueues(ListDeadLetterSourceQueuesRequest listDeadLetterSourceQueuesRequest) {
        ExecutionContext executionContext = createExecutionContext(listDeadLetterSourceQueuesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeadLetterSourceQueuesRequest> request = null;
        Response<ListDeadLetterSourceQueuesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeadLetterSourceQueuesRequestMarshaller().marshall(super.beforeMarshalling(listDeadLetterSourceQueuesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListDeadLetterSourceQueuesResult> responseHandler = new StaxResponseHandler<ListDeadLetterSourceQueuesResult>(
                    new ListDeadLetterSourceQueuesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of your queues. The maximum number of queues that can be returned is 1000. If you specify a value
     * for the optional <code>QueueNamePrefix</code> parameter, only queues with a name beginning with the specified
     * value are returned.
     * </p>
     * 
     * @param listQueuesRequest
     * @return Result of the ListQueues operation returned by the service.
     * @sample AmazonSQS.ListQueues
     */
    @Override
    public ListQueuesResult listQueues(ListQueuesRequest listQueuesRequest) {
        ExecutionContext executionContext = createExecutionContext(listQueuesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListQueuesRequest> request = null;
        Response<ListQueuesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListQueuesRequestMarshaller().marshall(super.beforeMarshalling(listQueuesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListQueuesResult> responseHandler = new StaxResponseHandler<ListQueuesResult>(new ListQueuesResultStaxUnmarshaller());
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
     * Deletes the messages in a queue specified by the <b>queue URL</b>.
     * </p>
     * <important>
     * <p>
     * When you use the <code>PurgeQueue</code> API, the deleted messages in the queue cannot be retrieved.
     * </p>
     * </important>
     * <p>
     * When you purge a queue, the message deletion process takes up to 60 seconds. All messages sent to the queue
     * before calling <code>PurgeQueue</code> will be deleted; messages sent to the queue while it is being purged may
     * be deleted. While the queue is being purged, messages sent to the queue before <code>PurgeQueue</code> was called
     * may be received, but will be deleted within the next minute.
     * </p>
     * 
     * @param purgeQueueRequest
     * @return Result of the PurgeQueue operation returned by the service.
     * @throws QueueDoesNotExistException
     *         The queue referred to does not exist.
     * @throws PurgeQueueInProgressException
     *         Indicates that the specified queue previously received a <code>PurgeQueue</code> request within the last
     *         60 seconds, the time it can take to delete the messages in the queue.
     * @sample AmazonSQS.PurgeQueue
     */
    @Override
    public PurgeQueueResult purgeQueue(PurgeQueueRequest purgeQueueRequest) {
        ExecutionContext executionContext = createExecutionContext(purgeQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PurgeQueueRequest> request = null;
        Response<PurgeQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PurgeQueueRequestMarshaller().marshall(super.beforeMarshalling(purgeQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<PurgeQueueResult> responseHandler = new StaxResponseHandler<PurgeQueueResult>(new PurgeQueueResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves one or more messages, with a maximum limit of 10 messages, from the specified queue. Long poll support
     * is enabled by using the <code>WaitTimeSeconds</code> parameter. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-long-polling.html">Amazon SQS
     * Long Poll</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <p>
     * Short poll is the default behavior where a weighted random set of machines is sampled on a
     * <code>ReceiveMessage</code> call. This means only the messages on the sampled machines are returned. If the
     * number of messages in the queue is small (less than 1000), it is likely you will get fewer messages than you
     * requested per <code>ReceiveMessage</code> call. If the number of messages in the queue is extremely small, you
     * might not receive any messages in a particular <code>ReceiveMessage</code> response; in which case you should
     * repeat the request.
     * </p>
     * <p>
     * For each message returned, the response includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Message body
     * </p>
     * </li>
     * <li>
     * <p>
     * MD5 digest of the message body. For information about MD5, go to <a
     * href="http://www.faqs.org/rfcs/rfc1321.html">http://www.faqs.org/rfcs/rfc1321.html</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Message ID you received when you sent the message to the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * Receipt handle.
     * </p>
     * </li>
     * <li>
     * <p>
     * Message attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * MD5 digest of the message attributes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The receipt handle is the identifier you must provide when deleting the message. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ImportantIdentifiers.html">Queue
     * and Message Identifiers</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <p>
     * You can provide the <code>VisibilityTimeout</code> parameter in your request, which will be applied to the
     * messages that Amazon SQS returns in the response. If you do not include the parameter, the overall visibility
     * timeout for the queue is used for the returned messages. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html">Visibility
     * Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Going forward, new attributes might be added. If you are writing code that calls this action, we recommend that
     * you structure your code so that it can handle new attributes gracefully.
     * </p>
     * </note>
     * 
     * @param receiveMessageRequest
     * @return Result of the ReceiveMessage operation returned by the service.
     * @throws OverLimitException
     *         The action that you requested would violate a limit. For example, ReceiveMessage returns this error if
     *         the maximum number of messages inflight has already been reached. <a>AddPermission</a> returns this error
     *         if the maximum number of permissions for the queue has already been reached.
     * @sample AmazonSQS.ReceiveMessage
     */
    @Override
    public ReceiveMessageResult receiveMessage(ReceiveMessageRequest receiveMessageRequest) {
        ExecutionContext executionContext = createExecutionContext(receiveMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReceiveMessageRequest> request = null;
        Response<ReceiveMessageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReceiveMessageRequestMarshaller().marshall(super.beforeMarshalling(receiveMessageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ReceiveMessageResult> responseHandler = new StaxResponseHandler<ReceiveMessageResult>(
                    new ReceiveMessageResultStaxUnmarshaller());
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
     * Revokes any permissions in the queue policy that matches the specified <code>Label</code> parameter. Only the
     * owner of the queue can remove permissions.
     * </p>
     * 
     * @param removePermissionRequest
     * @return Result of the RemovePermission operation returned by the service.
     * @sample AmazonSQS.RemovePermission
     */
    @Override
    public RemovePermissionResult removePermission(RemovePermissionRequest removePermissionRequest) {
        ExecutionContext executionContext = createExecutionContext(removePermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemovePermissionRequest> request = null;
        Response<RemovePermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemovePermissionRequestMarshaller().marshall(super.beforeMarshalling(removePermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<RemovePermissionResult> responseHandler = new StaxResponseHandler<RemovePermissionResult>(
                    new RemovePermissionResultStaxUnmarshaller());
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
     * Delivers a message to the specified queue. With Amazon SQS, you now have the ability to send large payload
     * messages that are up to 256KB (262,144 bytes) in size. To send large payloads, you must use an AWS SDK that
     * supports SigV4 signing. To verify whether SigV4 is supported for an AWS SDK, check the SDK release notes.
     * </p>
     * <important>
     * <p>
     * The following list shows the characters (in Unicode) allowed in your message, according to the W3C XML
     * specification. For more information, go to <a
     * href="http://www.w3.org/TR/REC-xml/#charsets">http://www.w3.org/TR/REC-xml/#charsets</a> If you send any
     * characters not included in the list, your request will be rejected.
     * </p>
     * <p>
     * #x9 | #xA | #xD | [#x20 to #xD7FF] | [#xE000 to #xFFFD] | [#x10000 to #x10FFFF]
     * </p>
     * </important>
     * 
     * @param sendMessageRequest
     * @return Result of the SendMessage operation returned by the service.
     * @throws InvalidMessageContentsException
     *         The message contains characters outside the allowed set.
     * @throws UnsupportedOperationException
     *         Error code 400. Unsupported operation.
     * @sample AmazonSQS.SendMessage
     */
    @Override
    public SendMessageResult sendMessage(SendMessageRequest sendMessageRequest) {
        ExecutionContext executionContext = createExecutionContext(sendMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendMessageRequest> request = null;
        Response<SendMessageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendMessageRequestMarshaller().marshall(super.beforeMarshalling(sendMessageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SendMessageResult> responseHandler = new StaxResponseHandler<SendMessageResult>(new SendMessageResultStaxUnmarshaller());
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
     * Delivers up to ten messages to the specified queue. This is a batch version of <a>SendMessage</a>. The result of
     * the send action on each message is reported individually in the response. The maximum allowed individual message
     * size is 256 KB (262,144 bytes).
     * </p>
     * <p>
     * The maximum total payload size (i.e., the sum of all a batch's individual message lengths) is also 256 KB
     * (262,144 bytes).
     * </p>
     * <p>
     * If the <code>DelaySeconds</code> parameter is not specified for an entry, the default for the queue is used.
     * </p>
     * <important>
     * <p>
     * The following list shows the characters (in Unicode) that are allowed in your message, according to the W3C XML
     * specification. For more information, go to <a
     * href="http://www.faqs.org/rfcs/rfc1321.html">http://www.faqs.org/rfcs/rfc1321.html</a>. If you send any
     * characters that are not included in the list, your request will be rejected.
     * </p>
     * <p>
     * #x9 | #xA | #xD | [#x20 to #xD7FF] | [#xE000 to #xFFFD] | [#x10000 to #x10FFFF]
     * </p>
     * </important> <important>
     * <p>
     * Because the batch request can result in a combination of successful and unsuccessful actions, you should check
     * for batch errors even when the call returns an HTTP status code of 200.
     * </p>
     * </important> <note>
     * <p>
     * Some API actions take lists of parameters. These lists are specified using the <code>param.n</code> notation.
     * Values of <code>n</code> are integers starting from 1. For example, a parameter list with two elements looks like
     * this:
     * </p>
     * </note>
     * <p>
     * <code><![CDATA[&amp;Attribute.1=this]]></code>
     * </p>
     * <p>
     * <code><![CDATA[&amp;Attribute.2=that]]></code>
     * </p>
     * 
     * @param sendMessageBatchRequest
     * @return Result of the SendMessageBatch operation returned by the service.
     * @throws TooManyEntriesInBatchRequestException
     *         Batch request contains more number of entries than permissible.
     * @throws EmptyBatchRequestException
     *         Batch request does not contain an entry.
     * @throws BatchEntryIdsNotDistinctException
     *         Two or more batch entries have the same <code>Id</code> in the request.
     * @throws BatchRequestTooLongException
     *         The length of all the messages put together is more than the limit.
     * @throws InvalidBatchEntryIdException
     *         The <code>Id</code> of a batch entry in a batch request does not abide by the specification.
     * @throws UnsupportedOperationException
     *         Error code 400. Unsupported operation.
     * @sample AmazonSQS.SendMessageBatch
     */
    @Override
    public SendMessageBatchResult sendMessageBatch(SendMessageBatchRequest sendMessageBatchRequest) {
        ExecutionContext executionContext = createExecutionContext(sendMessageBatchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendMessageBatchRequest> request = null;
        Response<SendMessageBatchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendMessageBatchRequestMarshaller().marshall(super.beforeMarshalling(sendMessageBatchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SendMessageBatchResult> responseHandler = new StaxResponseHandler<SendMessageBatchResult>(
                    new SendMessageBatchResultStaxUnmarshaller());
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
     * Sets the value of one or more queue attributes. When you change a queue's attributes, the change can take up to
     * 60 seconds for most of the attributes to propagate throughout the SQS system. Changes made to the
     * <code>MessageRetentionPeriod</code> attribute can take up to 15 minutes.
     * </p>
     * <note>
     * <p>
     * Going forward, new attributes might be added. If you are writing code that calls this action, we recommend that
     * you structure your code so that it can handle new attributes gracefully.
     * </p>
     * </note>
     * 
     * @param setQueueAttributesRequest
     * @return Result of the SetQueueAttributes operation returned by the service.
     * @throws InvalidAttributeNameException
     *         The attribute referred to does not exist.
     * @sample AmazonSQS.SetQueueAttributes
     */
    @Override
    public SetQueueAttributesResult setQueueAttributes(SetQueueAttributesRequest setQueueAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(setQueueAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetQueueAttributesRequest> request = null;
        Response<SetQueueAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetQueueAttributesRequestMarshaller().marshall(super.beforeMarshalling(setQueueAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SetQueueAttributesResult> responseHandler = new StaxResponseHandler<SetQueueAttributesResult>(
                    new SetQueueAttributesResultStaxUnmarshaller());
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

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

}
