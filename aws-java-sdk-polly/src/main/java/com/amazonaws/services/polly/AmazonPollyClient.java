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
package com.amazonaws.services.polly;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
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
public class AmazonPollyClient extends AmazonWebServiceClient implements AmazonPolly {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonPolly.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "polly";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(new JsonClientMetadata()
            .withProtocolVersion("1.1")
            .withSupportsCbor(false)
            .withSupportsIon(false)
            .withContentTypeOverride("")
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidSampleRateException").withModeledClass(
                            com.amazonaws.services.polly.model.InvalidSampleRateException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("MaxLexiconsNumberExceededException").withModeledClass(
                            com.amazonaws.services.polly.model.MaxLexiconsNumberExceededException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("MaxLexemeLengthExceededException").withModeledClass(
                            com.amazonaws.services.polly.model.MaxLexemeLengthExceededException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("UnsupportedPlsLanguageException").withModeledClass(
                            com.amazonaws.services.polly.model.UnsupportedPlsLanguageException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("UnsupportedPlsAlphabetException").withModeledClass(
                            com.amazonaws.services.polly.model.UnsupportedPlsAlphabetException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("TextLengthExceededException").withModeledClass(
                            com.amazonaws.services.polly.model.TextLengthExceededException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("LexiconNotFoundException").withModeledClass(
                            com.amazonaws.services.polly.model.LexiconNotFoundException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("LexiconSizeExceededException").withModeledClass(
                            com.amazonaws.services.polly.model.LexiconSizeExceededException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidLexiconException").withModeledClass(
                            com.amazonaws.services.polly.model.InvalidLexiconException.class))
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
     */
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
     */
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
     */
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
     */
    public AmazonPollyClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
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
     */
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
     */
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
     */
    public AmazonPollyClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
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
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
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
     */
    @Override
    public DeleteLexiconResult deleteLexicon(DeleteLexiconRequest deleteLexiconRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteLexiconRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLexiconRequest> request = null;
        Response<DeleteLexiconResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLexiconRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLexiconRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     */
    @Override
    public DescribeVoicesResult describeVoices(DescribeVoicesRequest describeVoicesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeVoicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVoicesRequest> request = null;
        Response<DescribeVoicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVoicesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeVoicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     */
    @Override
    public GetLexiconResult getLexicon(GetLexiconRequest getLexiconRequest) {
        ExecutionContext executionContext = createExecutionContext(getLexiconRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLexiconRequest> request = null;
        Response<GetLexiconResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLexiconRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLexiconRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     */
    @Override
    public ListLexiconsResult listLexicons(ListLexiconsRequest listLexiconsRequest) {
        ExecutionContext executionContext = createExecutionContext(listLexiconsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLexiconsRequest> request = null;
        Response<ListLexiconsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLexiconsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLexiconsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     */
    @Override
    public PutLexiconResult putLexicon(PutLexiconRequest putLexiconRequest) {
        ExecutionContext executionContext = createExecutionContext(putLexiconRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutLexiconRequest> request = null;
        Response<PutLexiconResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutLexiconRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(putLexiconRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Synthesizes UTF-8 input, plain text or SSML, to a stream of bytes. SSML input must be valid, well-formed SSML.
     * Some alphabets might not be available with all the voices (for example, Cyrillic might not be read at all by
     * English voices) unless phoneme mapping is used. For more information, see <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/how-text-to-speech-works.html">How it Works</a>.
     * </p>
     * 
     * @param synthesizeSpeechRequest
     * @return Result of the SynthesizeSpeech operation returned by the service.
     * @throws TextLengthExceededException
     *         The value of the "Text" parameter is longer than the accepted limits. The limit for input text is a
     *         maximum of 3000 characters total, of which no more than 1500 can be billed characters. SSML tags are not
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
     * @sample AmazonPolly.SynthesizeSpeech
     */
    @Override
    public SynthesizeSpeechResult synthesizeSpeech(SynthesizeSpeechRequest synthesizeSpeechRequest) {
        ExecutionContext executionContext = createExecutionContext(synthesizeSpeechRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SynthesizeSpeechRequest> request = null;
        Response<SynthesizeSpeechResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SynthesizeSpeechRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(synthesizeSpeechRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

}
