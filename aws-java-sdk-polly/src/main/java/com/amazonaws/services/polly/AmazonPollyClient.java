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
package com.amazonaws.services.polly;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;
import com.amazonaws.auth.presign.PresignerParams;
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

import com.amazonaws.services.polly.AmazonPollyClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.polly.model.*;
import com.amazonaws.services.polly.model.transform.*;

/**
 * Client for accessing Amazon Polly. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * Amazon Polly is a web service that makes it easy to synthesize speech from text.
 * </p>
 * <p>
 * The Amazon Polly service provides API operations for synthesizing high-quality speech from plain text and Speech
 * Synthesis Markup Language (SSML), along with managing pronunciations lexicons that enable you to get the best results
 * for your application domain.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonPollyClient extends AmazonWebServiceClient implements AmazonPolly {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonPolly.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "polly";

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
                            new JsonErrorShapeMetadata().withErrorCode("InvalidS3BucketException").withModeledClass(
                                    com.amazonaws.services.polly.model.InvalidS3BucketException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSampleRateException").withModeledClass(
                                    com.amazonaws.services.polly.model.InvalidSampleRateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SynthesisTaskNotFoundException").withModeledClass(
                                    com.amazonaws.services.polly.model.SynthesisTaskNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MaxLexiconsNumberExceededException").withModeledClass(
                                    com.amazonaws.services.polly.model.MaxLexiconsNumberExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MaxLexemeLengthExceededException").withModeledClass(
                                    com.amazonaws.services.polly.model.MaxLexemeLengthExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedPlsAlphabetException").withModeledClass(
                                    com.amazonaws.services.polly.model.UnsupportedPlsAlphabetException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LanguageNotSupportedException").withModeledClass(
                                    com.amazonaws.services.polly.model.LanguageNotSupportedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TextLengthExceededException").withModeledClass(
                                    com.amazonaws.services.polly.model.TextLengthExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidLexiconException").withModeledClass(
                                    com.amazonaws.services.polly.model.InvalidLexiconException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SsmlMarksNotSupportedForTextTypeException").withModeledClass(
                                    com.amazonaws.services.polly.model.SsmlMarksNotSupportedForTextTypeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidS3KeyException").withModeledClass(
                                    com.amazonaws.services.polly.model.InvalidS3KeyException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSnsTopicArnException").withModeledClass(
                                    com.amazonaws.services.polly.model.InvalidSnsTopicArnException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MarksNotSupportedForFormatException").withModeledClass(
                                    com.amazonaws.services.polly.model.MarksNotSupportedForFormatException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTaskIdException").withModeledClass(
                                    com.amazonaws.services.polly.model.InvalidTaskIdException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedPlsLanguageException").withModeledClass(
                                    com.amazonaws.services.polly.model.UnsupportedPlsLanguageException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LexiconNotFoundException").withModeledClass(
                                    com.amazonaws.services.polly.model.LexiconNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LexiconSizeExceededException").withModeledClass(
                                    com.amazonaws.services.polly.model.LexiconSizeExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSsmlException").withModeledClass(
                                    com.amazonaws.services.polly.model.InvalidSsmlException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withModeledClass(
                                    com.amazonaws.services.polly.model.InvalidNextTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceFailureException").withModeledClass(
                                    com.amazonaws.services.polly.model.ServiceFailureException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.polly.model.AmazonPollyException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon Polly. A credentials provider chain will be used that
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
     * @deprecated use {@link AmazonPollyClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonPollyClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Polly. A credentials provider chain will be used that
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
     *        The client configuration options controlling how this client connects to Amazon Polly (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonPollyClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonPollyClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Polly using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonPollyClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonPollyClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonPollyClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Polly using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Polly (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AmazonPollyClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonPollyClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonPollyClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Polly using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonPollyClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonPollyClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Polly using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Polly (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AmazonPollyClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonPollyClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonPollyClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Polly using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Polly (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonPollyClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonPollyClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonPollyClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonPollyClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonPollyClientBuilder builder() {
        return AmazonPollyClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Polly using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonPollyClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Polly using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonPollyClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("polly.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/polly/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/polly/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Deletes the specified pronunciation lexicon stored in an AWS Region. A lexicon which has been deleted is not
     * available for speech synthesis, nor is it possible to retrieve it using either the <code>GetLexicon</code> or
     * <code>ListLexicon</code> APIs.
     * </p>
     * <p>
     * For more information, see <a href="http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html">Managing
     * Lexicons</a>.
     * </p>
     * 
     * @param deleteLexiconRequest
     * @return Result of the DeleteLexicon operation returned by the service.
     * @throws LexiconNotFoundException
     *         Amazon Polly can't find the specified lexicon. This could be caused by a lexicon that is missing, its
     *         name is misspelled or specifying a lexicon that is in a different region.</p>
     *         <p>
     *         Verify that the lexicon exists, is in the region (see <a>ListLexicons</a>) and that you spelled its name
     *         is spelled correctly. Then try again.
     * @throws ServiceFailureException
     *         An unknown condition has caused a service failure.
     * @sample AmazonPolly.DeleteLexicon
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/DeleteLexicon" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteLexiconResult deleteLexicon(DeleteLexiconRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLexicon(request);
    }

    @SdkInternalApi
    final DeleteLexiconResult executeDeleteLexicon(DeleteLexiconRequest deleteLexiconRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLexiconRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLexiconRequest> request = null;
        Response<DeleteLexiconResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLexiconRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLexiconRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Polly");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLexicon");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLexiconResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteLexiconResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the list of voices that are available for use when requesting speech synthesis. Each voice speaks a
     * specified language, is either male or female, and is identified by an ID, which is the ASCII version of the voice
     * name.
     * </p>
     * <p>
     * When synthesizing speech ( <code>SynthesizeSpeech</code> ), you provide the voice ID for the voice you want from
     * the list of voices returned by <code>DescribeVoices</code>.
     * </p>
     * <p>
     * For example, you want your news reader application to read news in a specific language, but giving a user the
     * option to choose the voice. Using the <code>DescribeVoices</code> operation you can provide the user with a list
     * of available voices to select from.
     * </p>
     * <p>
     * You can optionally specify a language code to filter the available voices. For example, if you specify
     * <code>en-US</code>, the operation returns a list of all available US English voices.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>polly:DescribeVoices</code> action.
     * </p>
     * 
     * @param describeVoicesRequest
     * @return Result of the DescribeVoices operation returned by the service.
     * @throws InvalidNextTokenException
     *         The NextToken is invalid. Verify that it's spelled correctly, and then try again.
     * @throws ServiceFailureException
     *         An unknown condition has caused a service failure.
     * @sample AmazonPolly.DescribeVoices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/DescribeVoices" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeVoicesResult describeVoices(DescribeVoicesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeVoices(request);
    }

    @SdkInternalApi
    final DescribeVoicesResult executeDescribeVoices(DescribeVoicesRequest describeVoicesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeVoicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVoicesRequest> request = null;
        Response<DescribeVoicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVoicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeVoicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Polly");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeVoices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeVoicesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeVoicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the content of the specified pronunciation lexicon stored in an AWS Region. For more information, see <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html">Managing Lexicons</a>.
     * </p>
     * 
     * @param getLexiconRequest
     * @return Result of the GetLexicon operation returned by the service.
     * @throws LexiconNotFoundException
     *         Amazon Polly can't find the specified lexicon. This could be caused by a lexicon that is missing, its
     *         name is misspelled or specifying a lexicon that is in a different region.</p>
     *         <p>
     *         Verify that the lexicon exists, is in the region (see <a>ListLexicons</a>) and that you spelled its name
     *         is spelled correctly. Then try again.
     * @throws ServiceFailureException
     *         An unknown condition has caused a service failure.
     * @sample AmazonPolly.GetLexicon
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/GetLexicon" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetLexiconResult getLexicon(GetLexiconRequest request) {
        request = beforeClientExecution(request);
        return executeGetLexicon(request);
    }

    @SdkInternalApi
    final GetLexiconResult executeGetLexicon(GetLexiconRequest getLexiconRequest) {

        ExecutionContext executionContext = createExecutionContext(getLexiconRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLexiconRequest> request = null;
        Response<GetLexiconResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLexiconRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLexiconRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Polly");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLexicon");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLexiconResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLexiconResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a specific SpeechSynthesisTask object based on its TaskID. This object contains information about the
     * given speech synthesis task, including the status of the task, and a link to the S3 bucket containing the output
     * of the task.
     * </p>
     * 
     * @param getSpeechSynthesisTaskRequest
     * @return Result of the GetSpeechSynthesisTask operation returned by the service.
     * @throws InvalidTaskIdException
     *         The provided Task ID is not valid. Please provide a valid Task ID and try again.
     * @throws ServiceFailureException
     *         An unknown condition has caused a service failure.
     * @throws SynthesisTaskNotFoundException
     *         The Speech Synthesis task with requested Task ID cannot be found.
     * @sample AmazonPolly.GetSpeechSynthesisTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/GetSpeechSynthesisTask" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetSpeechSynthesisTaskResult getSpeechSynthesisTask(GetSpeechSynthesisTaskRequest request) {
        request = beforeClientExecution(request);
        return executeGetSpeechSynthesisTask(request);
    }

    @SdkInternalApi
    final GetSpeechSynthesisTaskResult executeGetSpeechSynthesisTask(GetSpeechSynthesisTaskRequest getSpeechSynthesisTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(getSpeechSynthesisTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSpeechSynthesisTaskRequest> request = null;
        Response<GetSpeechSynthesisTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSpeechSynthesisTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSpeechSynthesisTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Polly");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSpeechSynthesisTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSpeechSynthesisTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetSpeechSynthesisTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of pronunciation lexicons stored in an AWS Region. For more information, see <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html">Managing Lexicons</a>.
     * </p>
     * 
     * @param listLexiconsRequest
     * @return Result of the ListLexicons operation returned by the service.
     * @throws InvalidNextTokenException
     *         The NextToken is invalid. Verify that it's spelled correctly, and then try again.
     * @throws ServiceFailureException
     *         An unknown condition has caused a service failure.
     * @sample AmazonPolly.ListLexicons
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/ListLexicons" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListLexiconsResult listLexicons(ListLexiconsRequest request) {
        request = beforeClientExecution(request);
        return executeListLexicons(request);
    }

    @SdkInternalApi
    final ListLexiconsResult executeListLexicons(ListLexiconsRequest listLexiconsRequest) {

        ExecutionContext executionContext = createExecutionContext(listLexiconsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLexiconsRequest> request = null;
        Response<ListLexiconsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLexiconsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLexiconsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Polly");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLexicons");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLexiconsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLexiconsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of SpeechSynthesisTask objects ordered by their creation date. This operation can filter the tasks
     * by their status, for example, allowing users to list only tasks that are completed.
     * </p>
     * 
     * @param listSpeechSynthesisTasksRequest
     * @return Result of the ListSpeechSynthesisTasks operation returned by the service.
     * @throws InvalidNextTokenException
     *         The NextToken is invalid. Verify that it's spelled correctly, and then try again.
     * @throws ServiceFailureException
     *         An unknown condition has caused a service failure.
     * @sample AmazonPolly.ListSpeechSynthesisTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/ListSpeechSynthesisTasks" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListSpeechSynthesisTasksResult listSpeechSynthesisTasks(ListSpeechSynthesisTasksRequest request) {
        request = beforeClientExecution(request);
        return executeListSpeechSynthesisTasks(request);
    }

    @SdkInternalApi
    final ListSpeechSynthesisTasksResult executeListSpeechSynthesisTasks(ListSpeechSynthesisTasksRequest listSpeechSynthesisTasksRequest) {

        ExecutionContext executionContext = createExecutionContext(listSpeechSynthesisTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSpeechSynthesisTasksRequest> request = null;
        Response<ListSpeechSynthesisTasksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSpeechSynthesisTasksRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSpeechSynthesisTasksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Polly");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSpeechSynthesisTasks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSpeechSynthesisTasksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSpeechSynthesisTasksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stores a pronunciation lexicon in an AWS Region. If a lexicon with the same name already exists in the region, it
     * is overwritten by the new lexicon. Lexicon operations have eventual consistency, therefore, it might take some
     * time before the lexicon is available to the SynthesizeSpeech operation.
     * </p>
     * <p>
     * For more information, see <a href="http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html">Managing
     * Lexicons</a>.
     * </p>
     * 
     * @param putLexiconRequest
     * @return Result of the PutLexicon operation returned by the service.
     * @throws InvalidLexiconException
     *         Amazon Polly can't find the specified lexicon. Verify that the lexicon's name is spelled correctly, and
     *         then try again.
     * @throws UnsupportedPlsAlphabetException
     *         The alphabet specified by the lexicon is not a supported alphabet. Valid values are <code>x-sampa</code>
     *         and <code>ipa</code>.
     * @throws UnsupportedPlsLanguageException
     *         The language specified in the lexicon is unsupported. For a list of supported languages, see <a
     *         href="http://docs.aws.amazon.com/polly/latest/dg/API_LexiconAttributes.html">Lexicon Attributes</a>.
     * @throws LexiconSizeExceededException
     *         The maximum size of the specified lexicon would be exceeded by this operation.
     * @throws MaxLexemeLengthExceededException
     *         The maximum size of the lexeme would be exceeded by this operation.
     * @throws MaxLexiconsNumberExceededException
     *         The maximum number of lexicons would be exceeded by this operation.
     * @throws ServiceFailureException
     *         An unknown condition has caused a service failure.
     * @sample AmazonPolly.PutLexicon
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/PutLexicon" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutLexiconResult putLexicon(PutLexiconRequest request) {
        request = beforeClientExecution(request);
        return executePutLexicon(request);
    }

    @SdkInternalApi
    final PutLexiconResult executePutLexicon(PutLexiconRequest putLexiconRequest) {

        ExecutionContext executionContext = createExecutionContext(putLexiconRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutLexiconRequest> request = null;
        Response<PutLexiconResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutLexiconRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putLexiconRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Polly");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutLexicon");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutLexiconResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutLexiconResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows the creation of an asynchronous synthesis task, by starting a new <code>SpeechSynthesisTask</code>. This
     * operation requires all the standard information needed for speech synthesis, plus the name of an Amazon S3 bucket
     * for the service to store the output of the synthesis task and two optional parameters (OutputS3KeyPrefix and
     * SnsTopicArn). Once the synthesis task is created, this operation will return a SpeechSynthesisTask object, which
     * will include an identifier of this task as well as the current status.
     * </p>
     * 
     * @param startSpeechSynthesisTaskRequest
     * @return Result of the StartSpeechSynthesisTask operation returned by the service.
     * @throws TextLengthExceededException
     *         The value of the "Text" parameter is longer than the accepted limits. For the
     *         <code>SynthesizeSpeech</code> API, the limit for input text is a maximum of 6000 characters total, of
     *         which no more than 3000 can be billed characters. For the <code>StartSpeechSynthesisTask</code> API, the
     *         maximum is 200,000 characters, of which no more than 100,000 can be billed characters. SSML tags are not
     *         counted as billed characters.
     * @throws InvalidS3BucketException
     *         The provided Amazon S3 bucket name is invalid. Please check your input with S3 bucket naming requirements
     *         and try again.
     * @throws InvalidS3KeyException
     *         The provided Amazon S3 key prefix is invalid. Please provide a valid S3 object key name.
     * @throws InvalidSampleRateException
     *         The specified sample rate is not valid.
     * @throws InvalidSnsTopicArnException
     *         The provided SNS topic ARN is invalid. Please provide a valid SNS topic ARN and try again.
     * @throws InvalidSsmlException
     *         The SSML you provided is invalid. Verify the SSML syntax, spelling of tags and values, and then try
     *         again.
     * @throws LexiconNotFoundException
     *         Amazon Polly can't find the specified lexicon. This could be caused by a lexicon that is missing, its
     *         name is misspelled or specifying a lexicon that is in a different region.</p>
     *         <p>
     *         Verify that the lexicon exists, is in the region (see <a>ListLexicons</a>) and that you spelled its name
     *         is spelled correctly. Then try again.
     * @throws ServiceFailureException
     *         An unknown condition has caused a service failure.
     * @throws MarksNotSupportedForFormatException
     *         Speech marks are not supported for the <code>OutputFormat</code> selected. Speech marks are only
     *         available for content in <code>json</code> format.
     * @throws SsmlMarksNotSupportedForTextTypeException
     *         SSML speech marks are not supported for plain text-type input.
     * @throws LanguageNotSupportedException
     *         The language specified is not currently supported by Amazon Polly in this capacity.
     * @sample AmazonPolly.StartSpeechSynthesisTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/StartSpeechSynthesisTask" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartSpeechSynthesisTaskResult startSpeechSynthesisTask(StartSpeechSynthesisTaskRequest request) {
        request = beforeClientExecution(request);
        return executeStartSpeechSynthesisTask(request);
    }

    @SdkInternalApi
    final StartSpeechSynthesisTaskResult executeStartSpeechSynthesisTask(StartSpeechSynthesisTaskRequest startSpeechSynthesisTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(startSpeechSynthesisTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartSpeechSynthesisTaskRequest> request = null;
        Response<StartSpeechSynthesisTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartSpeechSynthesisTaskRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startSpeechSynthesisTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Polly");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartSpeechSynthesisTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartSpeechSynthesisTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartSpeechSynthesisTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Synthesizes UTF-8 input, plain text or SSML, to a stream of bytes. SSML input must be valid, well-formed SSML.
     * Some alphabets might not be available with all the voices (for example, Cyrillic might not be read at all by
     * English voices) unless phoneme mapping is used. For more information, see <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/how-text-to-speech-works.html">How it Works</a>.
     * </p>
     * 
     * @param synthesizeSpeechRequest
     * @return Result of the SynthesizeSpeech operation returned by the service.
     * @throws TextLengthExceededException
     *         The value of the "Text" parameter is longer than the accepted limits. For the
     *         <code>SynthesizeSpeech</code> API, the limit for input text is a maximum of 6000 characters total, of
     *         which no more than 3000 can be billed characters. For the <code>StartSpeechSynthesisTask</code> API, the
     *         maximum is 200,000 characters, of which no more than 100,000 can be billed characters. SSML tags are not
     *         counted as billed characters.
     * @throws InvalidSampleRateException
     *         The specified sample rate is not valid.
     * @throws InvalidSsmlException
     *         The SSML you provided is invalid. Verify the SSML syntax, spelling of tags and values, and then try
     *         again.
     * @throws LexiconNotFoundException
     *         Amazon Polly can't find the specified lexicon. This could be caused by a lexicon that is missing, its
     *         name is misspelled or specifying a lexicon that is in a different region.</p>
     *         <p>
     *         Verify that the lexicon exists, is in the region (see <a>ListLexicons</a>) and that you spelled its name
     *         is spelled correctly. Then try again.
     * @throws ServiceFailureException
     *         An unknown condition has caused a service failure.
     * @throws MarksNotSupportedForFormatException
     *         Speech marks are not supported for the <code>OutputFormat</code> selected. Speech marks are only
     *         available for content in <code>json</code> format.
     * @throws SsmlMarksNotSupportedForTextTypeException
     *         SSML speech marks are not supported for plain text-type input.
     * @throws LanguageNotSupportedException
     *         The language specified is not currently supported by Amazon Polly in this capacity.
     * @sample AmazonPolly.SynthesizeSpeech
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/SynthesizeSpeech" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SynthesizeSpeechResult synthesizeSpeech(SynthesizeSpeechRequest request) {
        request = beforeClientExecution(request);
        return executeSynthesizeSpeech(request);
    }

    @SdkInternalApi
    final SynthesizeSpeechResult executeSynthesizeSpeech(SynthesizeSpeechRequest synthesizeSpeechRequest) {

        ExecutionContext executionContext = createExecutionContext(synthesizeSpeechRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SynthesizeSpeechRequest> request = null;
        Response<SynthesizeSpeechResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SynthesizeSpeechRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(synthesizeSpeechRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Polly");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SynthesizeSpeech");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SynthesizeSpeechResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(true), new SynthesizeSpeechResultJsonUnmarshaller());
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
    public com.amazonaws.services.polly.presign.AmazonPollyPresigners presigners() {
        return new com.amazonaws.services.polly.presign.AmazonPollyPresigners(PresignerParams.builder().endpoint(endpoint)
                .credentialsProvider(awsCredentialsProvider).signerProvider(getSignerProvider()).build());
    }

}
