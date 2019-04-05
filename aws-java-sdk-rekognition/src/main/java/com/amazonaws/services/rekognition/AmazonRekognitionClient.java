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
package com.amazonaws.services.rekognition;

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

import com.amazonaws.services.rekognition.AmazonRekognitionClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.services.rekognition.model.transform.*;

/**
 * Client for accessing Amazon Rekognition. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * This is the Amazon Rekognition API reference.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonRekognitionClient extends AmazonWebServiceClient implements AmazonRekognition {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonRekognition.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "rekognition";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withModeledClass(
                                    com.amazonaws.services.rekognition.model.InvalidParameterException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withModeledClass(
                                    com.amazonaws.services.rekognition.model.ResourceInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidImageFormatException").withModeledClass(
                                    com.amazonaws.services.rekognition.model.InvalidImageFormatException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withModeledClass(
                                    com.amazonaws.services.rekognition.model.ThrottlingException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidS3ObjectException").withModeledClass(
                                    com.amazonaws.services.rekognition.model.InvalidS3ObjectException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.rekognition.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("VideoTooLargeException").withModeledClass(
                                    com.amazonaws.services.rekognition.model.VideoTooLargeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withModeledClass(
                                    com.amazonaws.services.rekognition.model.AccessDeniedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.rekognition.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IdempotentParameterMismatchException").withModeledClass(
                                    com.amazonaws.services.rekognition.model.IdempotentParameterMismatchException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ProvisionedThroughputExceededException").withModeledClass(
                                    com.amazonaws.services.rekognition.model.ProvisionedThroughputExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ImageTooLargeException").withModeledClass(
                                    com.amazonaws.services.rekognition.model.ImageTooLargeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.rekognition.model.ResourceAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPaginationTokenException").withModeledClass(
                                    com.amazonaws.services.rekognition.model.InvalidPaginationTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerError").withModeledClass(
                                    com.amazonaws.services.rekognition.model.InternalServerErrorException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.rekognition.model.AmazonRekognitionException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon Rekognition. A credentials provider chain will be
     * used that searches for credentials in this order:
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
     * @deprecated use {@link AmazonRekognitionClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonRekognitionClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Rekognition. A credentials provider chain will be
     * used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Amazon Rekognition (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonRekognitionClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonRekognitionClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Rekognition using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonRekognitionClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonRekognitionClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonRekognitionClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Rekognition using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Rekognition (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonRekognitionClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRekognitionClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonRekognitionClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Rekognition using the specified AWS account
     * credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonRekognitionClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonRekognitionClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Rekognition using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Rekognition (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonRekognitionClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRekognitionClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonRekognitionClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Rekognition using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Rekognition (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonRekognitionClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRekognitionClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonRekognitionClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonRekognitionClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonRekognitionClientBuilder builder() {
        return AmazonRekognitionClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Rekognition using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonRekognitionClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Rekognition using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonRekognitionClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("rekognition.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/rekognition/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/rekognition/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Compares a face in the <i>source</i> input image with each of the 100 largest faces detected in the <i>target</i>
     * input image.
     * </p>
     * <note>
     * <p>
     * If the source image contains multiple faces, the service detects the largest face and compares it with each face
     * detected in the target image.
     * </p>
     * </note>
     * <p>
     * You pass the input and target images either as base64-encoded image bytes or as references to images in an Amazon
     * S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes isn't supported. The
     * image must be formatted as a PNG or JPEG file.
     * </p>
     * <p>
     * In response, the operation returns an array of face matches ordered by similarity score in descending order. For
     * each face match, the response provides a bounding box of the face, facial landmarks, pose details (pitch, role,
     * and yaw), quality (brightness and sharpness), and confidence value (indicating the level of confidence that the
     * bounding box contains a face). The response also provides a similarity score, which indicates how closely the
     * faces match.
     * </p>
     * <note>
     * <p>
     * By default, only faces with a similarity score of greater than or equal to 80% are returned in the response. You
     * can change this value by specifying the <code>SimilarityThreshold</code> parameter.
     * </p>
     * </note>
     * <p>
     * <code>CompareFaces</code> also returns an array of faces that don't match the source image. For each face, it
     * returns a bounding box, confidence value, landmarks, pose details, and quality. The response also returns
     * information about the face in the source image, including the bounding box of the face and confidence value.
     * </p>
     * <p>
     * If the image doesn't contain Exif metadata, <code>CompareFaces</code> returns orientation information for the
     * source and target images. Use these values to display the images with the correct image orientation.
     * </p>
     * <p>
     * If no faces are detected in the source or target images, <code>CompareFaces</code> returns an
     * <code>InvalidParameterException</code> error.
     * </p>
     * <note>
     * <p>
     * This is a stateless API operation. That is, data returned by this operation doesn't persist.
     * </p>
     * </note>
     * <p>
     * For an example, see Comparing Faces in Images in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:CompareFaces</code> action.
     * </p>
     * 
     * @param compareFacesRequest
     * @return Result of the CompareFaces operation returned by the service.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws InvalidS3ObjectException
     *         Amazon Rekognition is unable to access the S3 object specified in the request.
     * @throws ImageTooLargeException
     *         The input image size exceeds the allowed limit. For more information, see Limits in Amazon Rekognition in
     *         the Amazon Rekognition Developer Guide.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws InvalidImageFormatException
     *         The provided image format is not supported.
     * @sample AmazonRekognition.CompareFaces
     */
    @Override
    public CompareFacesResult compareFaces(CompareFacesRequest request) {
        request = beforeClientExecution(request);
        return executeCompareFaces(request);
    }

    @SdkInternalApi
    final CompareFacesResult executeCompareFaces(CompareFacesRequest compareFacesRequest) {

        ExecutionContext executionContext = createExecutionContext(compareFacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CompareFacesRequest> request = null;
        Response<CompareFacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CompareFacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(compareFacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CompareFaces");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CompareFacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CompareFacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a collection in an AWS Region. You can add faces to the collection using the <a>IndexFaces</a> operation.
     * </p>
     * <p>
     * For example, you might create collections, one for each of your application users. A user can then index faces
     * using the <code>IndexFaces</code> operation and persist results in a specific collection. Then, a user can search
     * the collection for faces in the user-specific container.
     * </p>
     * <p>
     * When you create a collection, it is associated with the latest version of the face model version.
     * </p>
     * <note>
     * <p>
     * Collection names are case-sensitive.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:CreateCollection</code> action.
     * </p>
     * 
     * @param createCollectionRequest
     * @return Result of the CreateCollection operation returned by the service.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws ResourceAlreadyExistsException
     *         A collection with the specified ID already exists.
     * @sample AmazonRekognition.CreateCollection
     */
    @Override
    public CreateCollectionResult createCollection(CreateCollectionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCollection(request);
    }

    @SdkInternalApi
    final CreateCollectionResult executeCreateCollection(CreateCollectionRequest createCollectionRequest) {

        ExecutionContext executionContext = createExecutionContext(createCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCollectionRequest> request = null;
        Response<CreateCollectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCollectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createCollectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCollection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCollectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateCollectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Rekognition stream processor that you can use to detect and recognize faces in a streaming
     * video.
     * </p>
     * <p>
     * Amazon Rekognition Video is a consumer of live video from Amazon Kinesis Video Streams. Amazon Rekognition Video
     * sends analysis results to Amazon Kinesis Data Streams.
     * </p>
     * <p>
     * You provide as input a Kinesis video stream (<code>Input</code>) and a Kinesis data stream (<code>Output</code>)
     * stream. You also specify the face recognition criteria in <code>Settings</code>. For example, the collection
     * containing faces that you want to recognize. Use <code>Name</code> to assign an identifier for the stream
     * processor. You use <code>Name</code> to manage the stream processor. For example, you can start processing the
     * source video by calling <a>StartStreamProcessor</a> with the <code>Name</code> field.
     * </p>
     * <p>
     * After you have finished analyzing a streaming video, use <a>StopStreamProcessor</a> to stop processing. You can
     * delete the stream processor by calling <a>DeleteStreamProcessor</a>.
     * </p>
     * 
     * @param createStreamProcessorRequest
     * @return Result of the CreateStreamProcessor operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws LimitExceededException
     *         An Amazon Rekognition service limit was exceeded. For example, if you start too many Amazon Rekognition
     *         Video jobs concurrently, calls to start operations (<code>StartLabelDetection</code>, for example) will
     *         raise a <code>LimitExceededException</code> exception (HTTP status code: 400) until the number of
     *         concurrently running jobs is below the Amazon Rekognition service limit.
     * @throws ResourceInUseException
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @sample AmazonRekognition.CreateStreamProcessor
     */
    @Override
    public CreateStreamProcessorResult createStreamProcessor(CreateStreamProcessorRequest request) {
        request = beforeClientExecution(request);
        return executeCreateStreamProcessor(request);
    }

    @SdkInternalApi
    final CreateStreamProcessorResult executeCreateStreamProcessor(CreateStreamProcessorRequest createStreamProcessorRequest) {

        ExecutionContext executionContext = createExecutionContext(createStreamProcessorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStreamProcessorRequest> request = null;
        Response<CreateStreamProcessorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStreamProcessorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createStreamProcessorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateStreamProcessor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateStreamProcessorResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateStreamProcessorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified collection. Note that this operation removes all faces in the collection. For an example,
     * see <a>delete-collection-procedure</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DeleteCollection</code> action.
     * </p>
     * 
     * @param deleteCollectionRequest
     * @return Result of the DeleteCollection operation returned by the service.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws ResourceNotFoundException
     *         The collection specified in the request cannot be found.
     * @sample AmazonRekognition.DeleteCollection
     */
    @Override
    public DeleteCollectionResult deleteCollection(DeleteCollectionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCollection(request);
    }

    @SdkInternalApi
    final DeleteCollectionResult executeDeleteCollection(DeleteCollectionRequest deleteCollectionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCollectionRequest> request = null;
        Response<DeleteCollectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCollectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCollectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCollection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCollectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteCollectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes faces from a collection. You specify a collection ID and an array of face IDs to remove from the
     * collection.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DeleteFaces</code> action.
     * </p>
     * 
     * @param deleteFacesRequest
     * @return Result of the DeleteFaces operation returned by the service.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws ResourceNotFoundException
     *         The collection specified in the request cannot be found.
     * @sample AmazonRekognition.DeleteFaces
     */
    @Override
    public DeleteFacesResult deleteFaces(DeleteFacesRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFaces(request);
    }

    @SdkInternalApi
    final DeleteFacesResult executeDeleteFaces(DeleteFacesRequest deleteFacesRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFacesRequest> request = null;
        Response<DeleteFacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFaces");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the stream processor identified by <code>Name</code>. You assign the value for <code>Name</code> when you
     * create the stream processor with <a>CreateStreamProcessor</a>. You might not be able to use the same name for a
     * stream processor for a few seconds after calling <code>DeleteStreamProcessor</code>.
     * </p>
     * 
     * @param deleteStreamProcessorRequest
     * @return Result of the DeleteStreamProcessor operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws ResourceNotFoundException
     *         The collection specified in the request cannot be found.
     * @throws ResourceInUseException
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @sample AmazonRekognition.DeleteStreamProcessor
     */
    @Override
    public DeleteStreamProcessorResult deleteStreamProcessor(DeleteStreamProcessorRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStreamProcessor(request);
    }

    @SdkInternalApi
    final DeleteStreamProcessorResult executeDeleteStreamProcessor(DeleteStreamProcessorRequest deleteStreamProcessorRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStreamProcessorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStreamProcessorRequest> request = null;
        Response<DeleteStreamProcessorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStreamProcessorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteStreamProcessorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteStreamProcessor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteStreamProcessorResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteStreamProcessorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified collection. You can use <code>DescribeCollection</code> to get information, such as the
     * number of faces indexed into a collection and the version of the model used by the collection for face detection.
     * </p>
     * <p>
     * For more information, see Describing a Collection in the Amazon Rekognition Developer Guide.
     * </p>
     * 
     * @param describeCollectionRequest
     * @return Result of the DescribeCollection operation returned by the service.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws ResourceNotFoundException
     *         The collection specified in the request cannot be found.
     * @sample AmazonRekognition.DescribeCollection
     */
    @Override
    public DescribeCollectionResult describeCollection(DescribeCollectionRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCollection(request);
    }

    @SdkInternalApi
    final DescribeCollectionResult executeDescribeCollection(DescribeCollectionRequest describeCollectionRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCollectionRequest> request = null;
        Response<DescribeCollectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCollectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeCollectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCollection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCollectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeCollectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about a stream processor created by <a>CreateStreamProcessor</a>. You can get information
     * about the input and output streams, the input parameters for the face recognition being performed, and the
     * current status of the stream processor.
     * </p>
     * 
     * @param describeStreamProcessorRequest
     * @return Result of the DescribeStreamProcessor operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws ResourceNotFoundException
     *         The collection specified in the request cannot be found.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @sample AmazonRekognition.DescribeStreamProcessor
     */
    @Override
    public DescribeStreamProcessorResult describeStreamProcessor(DescribeStreamProcessorRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeStreamProcessor(request);
    }

    @SdkInternalApi
    final DescribeStreamProcessorResult executeDescribeStreamProcessor(DescribeStreamProcessorRequest describeStreamProcessorRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStreamProcessorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStreamProcessorRequest> request = null;
        Response<DescribeStreamProcessorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStreamProcessorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeStreamProcessorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeStreamProcessor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeStreamProcessorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeStreamProcessorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detects faces within an image that is provided as input.
     * </p>
     * <p>
     * <code>DetectFaces</code> detects the 100 largest faces in the image. For each face detected, the operation
     * returns face details. These details include a bounding box of the face, a confidence value (that the bounding box
     * contains a face), and a fixed set of attributes such as facial landmarks (for example, coordinates of eye and
     * mouth), gender, presence of beard, sunglasses, and so on.
     * </p>
     * <p>
     * The face-detection algorithm is most effective on frontal faces. For non-frontal or obscured faces, the algorithm
     * might not detect the faces or might detect faces with lower confidence.
     * </p>
     * <p>
     * You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3
     * bucket. If you use the to call Amazon Rekognition operations, passing image bytes is not supported. The image
     * must be either a PNG or JPEG formatted file.
     * </p>
     * <note>
     * <p>
     * This is a stateless API operation. That is, the operation does not persist any data.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DetectFaces</code> action.
     * </p>
     * 
     * @param detectFacesRequest
     * @return Result of the DetectFaces operation returned by the service.
     * @throws InvalidS3ObjectException
     *         Amazon Rekognition is unable to access the S3 object specified in the request.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws ImageTooLargeException
     *         The input image size exceeds the allowed limit. For more information, see Limits in Amazon Rekognition in
     *         the Amazon Rekognition Developer Guide.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws InvalidImageFormatException
     *         The provided image format is not supported.
     * @sample AmazonRekognition.DetectFaces
     */
    @Override
    public DetectFacesResult detectFaces(DetectFacesRequest request) {
        request = beforeClientExecution(request);
        return executeDetectFaces(request);
    }

    @SdkInternalApi
    final DetectFacesResult executeDetectFaces(DetectFacesRequest detectFacesRequest) {

        ExecutionContext executionContext = createExecutionContext(detectFacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectFacesRequest> request = null;
        Response<DetectFacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectFacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(detectFacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetectFaces");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetectFacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DetectFacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detects instances of real-world entities within an image (JPEG or PNG) provided as input. This includes objects
     * like flower, tree, and table; events like wedding, graduation, and birthday party; and concepts like landscape,
     * evening, and nature.
     * </p>
     * <p>
     * For an example, see Analyzing Images Stored in an Amazon S3 Bucket in the Amazon Rekognition Developer Guide.
     * </p>
     * <note>
     * <p>
     * <code>DetectLabels</code> does not support the detection of activities. However, activity detection is supported
     * for label detection in videos. For more information, see StartLabelDetection in the Amazon Rekognition Developer
     * Guide.
     * </p>
     * </note>
     * <p>
     * You pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If
     * you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must
     * be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * For each object, scene, and concept the API returns one or more labels. Each label provides the object name, and
     * the level of confidence that the image contains the object. For example, suppose the input image has a
     * lighthouse, the sea, and a rock. The response includes all three labels, one for each object.
     * </p>
     * <p>
     * <code>{Name: lighthouse, Confidence: 98.4629}</code>
     * </p>
     * <p>
     * <code>{Name: rock,Confidence: 79.2097}</code>
     * </p>
     * <p>
     * <code> {Name: sea,Confidence: 75.061}</code>
     * </p>
     * <p>
     * In the preceding example, the operation returns one label for each of the three objects. The operation can also
     * return multiple labels for the same object in the image. For example, if the input image shows a flower (for
     * example, a tulip), the operation might return the following three labels.
     * </p>
     * <p>
     * <code>{Name: flower,Confidence: 99.0562}</code>
     * </p>
     * <p>
     * <code>{Name: plant,Confidence: 99.0562}</code>
     * </p>
     * <p>
     * <code>{Name: tulip,Confidence: 99.0562}</code>
     * </p>
     * <p>
     * In this example, the detection algorithm more precisely identifies the flower as a tulip.
     * </p>
     * <p>
     * In response, the API returns an array of labels. In addition, the response also includes the orientation
     * correction. Optionally, you can specify <code>MinConfidence</code> to control the confidence threshold for the
     * labels returned. The default is 55%. You can also add the <code>MaxLabels</code> parameter to limit the number of
     * labels returned.
     * </p>
     * <note>
     * <p>
     * If the object detected is a person, the operation doesn't provide the same facial details that the
     * <a>DetectFaces</a> operation provides.
     * </p>
     * </note>
     * <p>
     * <code>DetectLabels</code> returns bounding boxes for instances of common object labels in an array of
     * <a>Instance</a> objects. An <code>Instance</code> object contains a <a>BoundingBox</a> object, for the location
     * of the label on the image. It also includes the confidence by which the bounding box was detected.
     * </p>
     * <p>
     * <code>DetectLabels</code> also returns a hierarchical taxonomy of detected labels. For example, a detected car
     * might be assigned the label <i>car</i>. The label <i>car</i> has two parent labels: <i>Vehicle</i> (its parent)
     * and <i>Transportation</i> (its grandparent). The response returns the entire list of ancestors for a label. Each
     * ancestor is a unique label in the response. In the previous example, <i>Car</i>, <i>Vehicle</i>, and
     * <i>Transportation</i> are returned as unique labels in the response.
     * </p>
     * <p>
     * This is a stateless API operation. That is, the operation does not persist any data.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DetectLabels</code> action.
     * </p>
     * 
     * @param detectLabelsRequest
     * @return Result of the DetectLabels operation returned by the service.
     * @throws InvalidS3ObjectException
     *         Amazon Rekognition is unable to access the S3 object specified in the request.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws ImageTooLargeException
     *         The input image size exceeds the allowed limit. For more information, see Limits in Amazon Rekognition in
     *         the Amazon Rekognition Developer Guide.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws InvalidImageFormatException
     *         The provided image format is not supported.
     * @sample AmazonRekognition.DetectLabels
     */
    @Override
    public DetectLabelsResult detectLabels(DetectLabelsRequest request) {
        request = beforeClientExecution(request);
        return executeDetectLabels(request);
    }

    @SdkInternalApi
    final DetectLabelsResult executeDetectLabels(DetectLabelsRequest detectLabelsRequest) {

        ExecutionContext executionContext = createExecutionContext(detectLabelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectLabelsRequest> request = null;
        Response<DetectLabelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectLabelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(detectLabelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetectLabels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetectLabelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DetectLabelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detects explicit or suggestive adult content in a specified JPEG or PNG format image. Use
     * <code>DetectModerationLabels</code> to moderate images depending on your requirements. For example, you might
     * want to filter images that contain nudity, but not images containing suggestive content.
     * </p>
     * <p>
     * To filter images, use the labels returned by <code>DetectModerationLabels</code> to determine which types of
     * content are appropriate.
     * </p>
     * <p>
     * For information about moderation labels, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3
     * bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The
     * image must be either a PNG or JPEG formatted file.
     * </p>
     * 
     * @param detectModerationLabelsRequest
     * @return Result of the DetectModerationLabels operation returned by the service.
     * @throws InvalidS3ObjectException
     *         Amazon Rekognition is unable to access the S3 object specified in the request.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws ImageTooLargeException
     *         The input image size exceeds the allowed limit. For more information, see Limits in Amazon Rekognition in
     *         the Amazon Rekognition Developer Guide.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws InvalidImageFormatException
     *         The provided image format is not supported.
     * @sample AmazonRekognition.DetectModerationLabels
     */
    @Override
    public DetectModerationLabelsResult detectModerationLabels(DetectModerationLabelsRequest request) {
        request = beforeClientExecution(request);
        return executeDetectModerationLabels(request);
    }

    @SdkInternalApi
    final DetectModerationLabelsResult executeDetectModerationLabels(DetectModerationLabelsRequest detectModerationLabelsRequest) {

        ExecutionContext executionContext = createExecutionContext(detectModerationLabelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectModerationLabelsRequest> request = null;
        Response<DetectModerationLabelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectModerationLabelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(detectModerationLabelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetectModerationLabels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetectModerationLabelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DetectModerationLabelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detects text in the input image and converts it into machine-readable text.
     * </p>
     * <p>
     * Pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you
     * use the AWS CLI to call Amazon Rekognition operations, you must pass it as a reference to an image in an Amazon
     * S3 bucket. For the AWS CLI, passing image bytes is not supported. The image must be either a .png or .jpeg
     * formatted file.
     * </p>
     * <p>
     * The <code>DetectText</code> operation returns text in an array of <a>TextDetection</a> elements,
     * <code>TextDetections</code>. Each <code>TextDetection</code> element provides information about a single word or
     * line of text that was detected in the image.
     * </p>
     * <p>
     * A word is one or more ISO basic latin script characters that are not separated by spaces. <code>DetectText</code>
     * can detect up to 50 words in an image.
     * </p>
     * <p>
     * A line is a string of equally spaced words. A line isn't necessarily a complete sentence. For example, a driver's
     * license number is detected as a line. A line ends when there is no aligned text after it. Also, a line ends when
     * there is a large gap between words, relative to the length of the words. This means, depending on the gap between
     * words, Amazon Rekognition may detect multiple lines in text aligned in the same direction. Periods don't
     * represent the end of a line. If a sentence spans multiple lines, the <code>DetectText</code> operation returns
     * multiple lines.
     * </p>
     * <p>
     * To determine whether a <code>TextDetection</code> element is a line of text or a word, use the
     * <code>TextDetection</code> object <code>Type</code> field.
     * </p>
     * <p>
     * To be detected, text must be within +/- 90 degrees orientation of the horizontal axis.
     * </p>
     * <p>
     * For more information, see DetectText in the Amazon Rekognition Developer Guide.
     * </p>
     * 
     * @param detectTextRequest
     * @return Result of the DetectText operation returned by the service.
     * @throws InvalidS3ObjectException
     *         Amazon Rekognition is unable to access the S3 object specified in the request.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws ImageTooLargeException
     *         The input image size exceeds the allowed limit. For more information, see Limits in Amazon Rekognition in
     *         the Amazon Rekognition Developer Guide.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws InvalidImageFormatException
     *         The provided image format is not supported.
     * @sample AmazonRekognition.DetectText
     */
    @Override
    public DetectTextResult detectText(DetectTextRequest request) {
        request = beforeClientExecution(request);
        return executeDetectText(request);
    }

    @SdkInternalApi
    final DetectTextResult executeDetectText(DetectTextRequest detectTextRequest) {

        ExecutionContext executionContext = createExecutionContext(detectTextRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectTextRequest> request = null;
        Response<DetectTextResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectTextRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(detectTextRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetectText");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetectTextResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DetectTextResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the name and additional information about a celebrity based on his or her Amazon Rekognition ID. The
     * additional information is returned as an array of URLs. If there is no additional information about the
     * celebrity, this list is empty.
     * </p>
     * <p>
     * For more information, see Recognizing Celebrities in an Image in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:GetCelebrityInfo</code> action.
     * </p>
     * 
     * @param getCelebrityInfoRequest
     * @return Result of the GetCelebrityInfo operation returned by the service.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws ResourceNotFoundException
     *         The collection specified in the request cannot be found.
     * @sample AmazonRekognition.GetCelebrityInfo
     */
    @Override
    public GetCelebrityInfoResult getCelebrityInfo(GetCelebrityInfoRequest request) {
        request = beforeClientExecution(request);
        return executeGetCelebrityInfo(request);
    }

    @SdkInternalApi
    final GetCelebrityInfoResult executeGetCelebrityInfo(GetCelebrityInfoRequest getCelebrityInfoRequest) {

        ExecutionContext executionContext = createExecutionContext(getCelebrityInfoRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCelebrityInfoRequest> request = null;
        Response<GetCelebrityInfoResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCelebrityInfoRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCelebrityInfoRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCelebrityInfo");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCelebrityInfoResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCelebrityInfoResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the celebrity recognition results for a Amazon Rekognition Video analysis started by
     * <a>StartCelebrityRecognition</a>.
     * </p>
     * <p>
     * Celebrity recognition in a video is an asynchronous operation. Analysis is started by a call to
     * <a>StartCelebrityRecognition</a> which returns a job identifier (<code>JobId</code>). When the celebrity
     * recognition operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple
     * Notification Service topic registered in the initial call to <code>StartCelebrityRecognition</code>. To get the
     * results of the celebrity recognition analysis, first check that the status value published to the Amazon SNS
     * topic is <code>SUCCEEDED</code>. If so, call <code>GetCelebrityDetection</code> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartCelebrityDetection</code>.
     * </p>
     * <p>
     * For more information, see Working With Stored Videos in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * <code>GetCelebrityRecognition</code> returns detected celebrities and the time(s) they are detected in an array (
     * <code>Celebrities</code>) of <a>CelebrityRecognition</a> objects. Each <code>CelebrityRecognition</code> contains
     * information about the celebrity in a <a>CelebrityDetail</a> object and the time, <code>Timestamp</code>, the
     * celebrity was detected.
     * </p>
     * <note>
     * <p>
     * <code>GetCelebrityRecognition</code> only returns the default facial attributes (<code>BoundingBox</code>,
     * <code>Confidence</code>, <code>Landmarks</code>, <code>Pose</code>, and <code>Quality</code>). The other facial
     * attributes listed in the <code>Face</code> object of the following response syntax are not returned. For more
     * information, see FaceDetail in the Amazon Rekognition Developer Guide.
     * </p>
     * </note>
     * <p>
     * By default, the <code>Celebrities</code> array is sorted by time (milliseconds from the start of the video). You
     * can also sort the array by celebrity by specifying the value <code>ID</code> in the <code>SortBy</code> input
     * parameter.
     * </p>
     * <p>
     * The <code>CelebrityDetail</code> object includes the celebrity identifer and additional information urls. If you
     * don't store the additional information urls, you can get them later by calling <a>GetCelebrityInfo</a> with the
     * celebrity identifer.
     * </p>
     * <p>
     * No information is returned for faces not recognized as celebrities.
     * </p>
     * <p>
     * Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in
     * <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a pagination
     * token for getting the next set of results. To get the next page of results, call
     * <code>GetCelebrityDetection</code> and populate the <code>NextToken</code> request parameter with the token value
     * returned from the previous call to <code>GetCelebrityRecognition</code>.
     * </p>
     * 
     * @param getCelebrityRecognitionRequest
     * @return Result of the GetCelebrityRecognition operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws InvalidPaginationTokenException
     *         Pagination token in the request is not valid.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws ResourceNotFoundException
     *         The collection specified in the request cannot be found.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @sample AmazonRekognition.GetCelebrityRecognition
     */
    @Override
    public GetCelebrityRecognitionResult getCelebrityRecognition(GetCelebrityRecognitionRequest request) {
        request = beforeClientExecution(request);
        return executeGetCelebrityRecognition(request);
    }

    @SdkInternalApi
    final GetCelebrityRecognitionResult executeGetCelebrityRecognition(GetCelebrityRecognitionRequest getCelebrityRecognitionRequest) {

        ExecutionContext executionContext = createExecutionContext(getCelebrityRecognitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCelebrityRecognitionRequest> request = null;
        Response<GetCelebrityRecognitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCelebrityRecognitionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getCelebrityRecognitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCelebrityRecognition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCelebrityRecognitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetCelebrityRecognitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the content moderation analysis results for a Amazon Rekognition Video analysis started by
     * <a>StartContentModeration</a>.
     * </p>
     * <p>
     * Content moderation analysis of a video is an asynchronous operation. You start analysis by calling
     * <a>StartContentModeration</a> which returns a job identifier (<code>JobId</code>). When analysis finishes, Amazon
     * Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the
     * initial call to <code>StartContentModeration</code>. To get the results of the content moderation analysis, first
     * check that the status value published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
     * <code>GetContentModeration</code> and pass the job identifier (<code>JobId</code>) from the initial call to
     * <code>StartContentModeration</code>.
     * </p>
     * <p>
     * For more information, see Working with Stored Videos in the Amazon Rekognition Devlopers Guide.
     * </p>
     * <p>
     * <code>GetContentModeration</code> returns detected content moderation labels, and the time they are detected, in
     * an array, <code>ModerationLabels</code>, of <a>ContentModerationDetection</a> objects.
     * </p>
     * <p>
     * By default, the moderated labels are returned sorted by time, in milliseconds from the start of the video. You
     * can also sort them by moderated label by specifying <code>NAME</code> for the <code>SortBy</code> input
     * parameter.
     * </p>
     * <p>
     * Since video analysis can return a large number of results, use the <code>MaxResults</code> parameter to limit the
     * number of labels returned in a single call to <code>GetContentModeration</code>. If there are more results than
     * specified in <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a
     * pagination token for getting the next set of results. To get the next page of results, call
     * <code>GetContentModeration</code> and populate the <code>NextToken</code> request parameter with the value of
     * <code>NextToken</code> returned from the previous call to <code>GetContentModeration</code>.
     * </p>
     * <p>
     * For more information, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide.
     * </p>
     * 
     * @param getContentModerationRequest
     * @return Result of the GetContentModeration operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws InvalidPaginationTokenException
     *         Pagination token in the request is not valid.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws ResourceNotFoundException
     *         The collection specified in the request cannot be found.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @sample AmazonRekognition.GetContentModeration
     */
    @Override
    public GetContentModerationResult getContentModeration(GetContentModerationRequest request) {
        request = beforeClientExecution(request);
        return executeGetContentModeration(request);
    }

    @SdkInternalApi
    final GetContentModerationResult executeGetContentModeration(GetContentModerationRequest getContentModerationRequest) {

        ExecutionContext executionContext = createExecutionContext(getContentModerationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContentModerationRequest> request = null;
        Response<GetContentModerationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContentModerationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getContentModerationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetContentModeration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetContentModerationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetContentModerationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets face detection results for a Amazon Rekognition Video analysis started by <a>StartFaceDetection</a>.
     * </p>
     * <p>
     * Face detection with Amazon Rekognition Video is an asynchronous operation. You start face detection by calling
     * <a>StartFaceDetection</a> which returns a job identifier (<code>JobId</code>). When the face detection operation
     * finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic
     * registered in the initial call to <code>StartFaceDetection</code>. To get the results of the face detection
     * operation, first check that the status value published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so,
     * call <a>GetFaceDetection</a> and pass the job identifier (<code>JobId</code>) from the initial call to
     * <code>StartFaceDetection</code>.
     * </p>
     * <p>
     * <code>GetFaceDetection</code> returns an array of detected faces (<code>Faces</code>) sorted by the time the
     * faces were detected.
     * </p>
     * <p>
     * Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in
     * <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a pagination
     * token for getting the next set of results. To get the next page of results, call <code>GetFaceDetection</code>
     * and populate the <code>NextToken</code> request parameter with the token value returned from the previous call to
     * <code>GetFaceDetection</code>.
     * </p>
     * 
     * @param getFaceDetectionRequest
     * @return Result of the GetFaceDetection operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws InvalidPaginationTokenException
     *         Pagination token in the request is not valid.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws ResourceNotFoundException
     *         The collection specified in the request cannot be found.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @sample AmazonRekognition.GetFaceDetection
     */
    @Override
    public GetFaceDetectionResult getFaceDetection(GetFaceDetectionRequest request) {
        request = beforeClientExecution(request);
        return executeGetFaceDetection(request);
    }

    @SdkInternalApi
    final GetFaceDetectionResult executeGetFaceDetection(GetFaceDetectionRequest getFaceDetectionRequest) {

        ExecutionContext executionContext = createExecutionContext(getFaceDetectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFaceDetectionRequest> request = null;
        Response<GetFaceDetectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFaceDetectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFaceDetectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFaceDetection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFaceDetectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFaceDetectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the face search results for Amazon Rekognition Video face search started by <a>StartFaceSearch</a>. The
     * search returns faces in a collection that match the faces of persons detected in a video. It also includes the
     * time(s) that faces are matched in the video.
     * </p>
     * <p>
     * Face search in a video is an asynchronous operation. You start face search by calling to <a>StartFaceSearch</a>
     * which returns a job identifier (<code>JobId</code>). When the search operation finishes, Amazon Rekognition Video
     * publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to
     * <code>StartFaceSearch</code>. To get the search results, first check that the status value published to the
     * Amazon SNS topic is <code>SUCCEEDED</code>. If so, call <code>GetFaceSearch</code> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartFaceSearch</code>.
     * </p>
     * <p>
     * For more information, see Searching Faces in a Collection in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * The search results are retured in an array, <code>Persons</code>, of <a>PersonMatch</a> objects. Each
     * <code>PersonMatch</code> element contains details about the matching faces in the input collection, person
     * information (facial attributes, bounding boxes, and person identifer) for the matched person, and the time the
     * person was matched in the video.
     * </p>
     * <note>
     * <p>
     * <code>GetFaceSearch</code> only returns the default facial attributes (<code>BoundingBox</code>,
     * <code>Confidence</code>, <code>Landmarks</code>, <code>Pose</code>, and <code>Quality</code>). The other facial
     * attributes listed in the <code>Face</code> object of the following response syntax are not returned. For more
     * information, see FaceDetail in the Amazon Rekognition Developer Guide.
     * </p>
     * </note>
     * <p>
     * By default, the <code>Persons</code> array is sorted by the time, in milliseconds from the start of the video,
     * persons are matched. You can also sort by persons by specifying <code>INDEX</code> for the <code>SORTBY</code>
     * input parameter.
     * </p>
     * 
     * @param getFaceSearchRequest
     * @return Result of the GetFaceSearch operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws InvalidPaginationTokenException
     *         Pagination token in the request is not valid.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws ResourceNotFoundException
     *         The collection specified in the request cannot be found.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @sample AmazonRekognition.GetFaceSearch
     */
    @Override
    public GetFaceSearchResult getFaceSearch(GetFaceSearchRequest request) {
        request = beforeClientExecution(request);
        return executeGetFaceSearch(request);
    }

    @SdkInternalApi
    final GetFaceSearchResult executeGetFaceSearch(GetFaceSearchRequest getFaceSearchRequest) {

        ExecutionContext executionContext = createExecutionContext(getFaceSearchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFaceSearchRequest> request = null;
        Response<GetFaceSearchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFaceSearchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFaceSearchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFaceSearch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFaceSearchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFaceSearchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the label detection results of a Amazon Rekognition Video analysis started by <a>StartLabelDetection</a>.
     * </p>
     * <p>
     * The label detection operation is started by a call to <a>StartLabelDetection</a> which returns a job identifier (
     * <code>JobId</code>). When the label detection operation finishes, Amazon Rekognition publishes a completion
     * status to the Amazon Simple Notification Service topic registered in the initial call to
     * <code>StartlabelDetection</code>. To get the results of the label detection operation, first check that the
     * status value published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call <a>GetLabelDetection</a>
     * and pass the job identifier (<code>JobId</code>) from the initial call to <code>StartLabelDetection</code>.
     * </p>
     * <p>
     * <code>GetLabelDetection</code> returns an array of detected labels (<code>Labels</code>) sorted by the time the
     * labels were detected. You can also sort by the label name by specifying <code>NAME</code> for the
     * <code>SortBy</code> input parameter.
     * </p>
     * <p>
     * The labels returned include the label name, the percentage confidence in the accuracy of the detected label, and
     * the time the label was detected in the video.
     * </p>
     * <p>
     * The returned labels also include bounding box information for common objects, a hierarchical taxonomy of detected
     * labels, and the version of the label model used for detection.
     * </p>
     * <p>
     * Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in
     * <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a pagination
     * token for getting the next set of results. To get the next page of results, call <code>GetlabelDetection</code>
     * and populate the <code>NextToken</code> request parameter with the token value returned from the previous call to
     * <code>GetLabelDetection</code>.
     * </p>
     * 
     * @param getLabelDetectionRequest
     * @return Result of the GetLabelDetection operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws InvalidPaginationTokenException
     *         Pagination token in the request is not valid.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws ResourceNotFoundException
     *         The collection specified in the request cannot be found.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @sample AmazonRekognition.GetLabelDetection
     */
    @Override
    public GetLabelDetectionResult getLabelDetection(GetLabelDetectionRequest request) {
        request = beforeClientExecution(request);
        return executeGetLabelDetection(request);
    }

    @SdkInternalApi
    final GetLabelDetectionResult executeGetLabelDetection(GetLabelDetectionRequest getLabelDetectionRequest) {

        ExecutionContext executionContext = createExecutionContext(getLabelDetectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLabelDetectionRequest> request = null;
        Response<GetLabelDetectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLabelDetectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLabelDetectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLabelDetection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLabelDetectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLabelDetectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the path tracking results of a Amazon Rekognition Video analysis started by <a>StartPersonTracking</a>.
     * </p>
     * <p>
     * The person path tracking operation is started by a call to <code>StartPersonTracking</code> which returns a job
     * identifier (<code>JobId</code>). When the operation finishes, Amazon Rekognition Video publishes a completion
     * status to the Amazon Simple Notification Service topic registered in the initial call to
     * <code>StartPersonTracking</code>.
     * </p>
     * <p>
     * To get the results of the person path tracking operation, first check that the status value published to the
     * Amazon SNS topic is <code>SUCCEEDED</code>. If so, call <a>GetPersonTracking</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartPersonTracking</code>.
     * </p>
     * <p>
     * <code>GetPersonTracking</code> returns an array, <code>Persons</code>, of tracked persons and the time(s) their
     * paths were tracked in the video.
     * </p>
     * <note>
     * <p>
     * <code>GetPersonTracking</code> only returns the default facial attributes (<code>BoundingBox</code>,
     * <code>Confidence</code>, <code>Landmarks</code>, <code>Pose</code>, and <code>Quality</code>). The other facial
     * attributes listed in the <code>Face</code> object of the following response syntax are not returned.
     * </p>
     * <p>
     * For more information, see FaceDetail in the Amazon Rekognition Developer Guide.
     * </p>
     * </note>
     * <p>
     * By default, the array is sorted by the time(s) a person's path is tracked in the video. You can sort by tracked
     * persons by specifying <code>INDEX</code> for the <code>SortBy</code> input parameter.
     * </p>
     * <p>
     * Use the <code>MaxResults</code> parameter to limit the number of items returned. If there are more results than
     * specified in <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a
     * pagination token for getting the next set of results. To get the next page of results, call
     * <code>GetPersonTracking</code> and populate the <code>NextToken</code> request parameter with the token value
     * returned from the previous call to <code>GetPersonTracking</code>.
     * </p>
     * 
     * @param getPersonTrackingRequest
     * @return Result of the GetPersonTracking operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws InvalidPaginationTokenException
     *         Pagination token in the request is not valid.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws ResourceNotFoundException
     *         The collection specified in the request cannot be found.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @sample AmazonRekognition.GetPersonTracking
     */
    @Override
    public GetPersonTrackingResult getPersonTracking(GetPersonTrackingRequest request) {
        request = beforeClientExecution(request);
        return executeGetPersonTracking(request);
    }

    @SdkInternalApi
    final GetPersonTrackingResult executeGetPersonTracking(GetPersonTrackingRequest getPersonTrackingRequest) {

        ExecutionContext executionContext = createExecutionContext(getPersonTrackingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPersonTrackingRequest> request = null;
        Response<GetPersonTrackingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPersonTrackingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPersonTrackingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPersonTracking");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPersonTrackingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPersonTrackingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detects faces in the input image and adds them to the specified collection.
     * </p>
     * <p>
     * Amazon Rekognition doesn't save the actual faces that are detected. Instead, the underlying detection algorithm
     * first detects the faces in the input image. For each face, the algorithm extracts facial features into a feature
     * vector, and stores it in the backend database. Amazon Rekognition uses feature vectors when it performs face
     * match and search operations using the <a>SearchFaces</a> and <a>SearchFacesByImage</a> operations.
     * </p>
     * <p>
     * For more information, see Adding Faces to a Collection in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * To get the number of faces in a collection, call <a>DescribeCollection</a>.
     * </p>
     * <p>
     * If you're using version 1.0 of the face detection model, <code>IndexFaces</code> indexes the 15 largest faces in
     * the input image. Later versions of the face detection model index the 100 largest faces in the input image.
     * </p>
     * <p>
     * If you're using version 4 or later of the face model, image orientation information is not returned in the
     * <code>OrientationCorrection</code> field.
     * </p>
     * <p>
     * To determine which version of the model you're using, call <a>DescribeCollection</a> and supply the collection
     * ID. You can also get the model version from the value of <code>FaceModelVersion</code> in the response from
     * <code>IndexFaces</code>
     * </p>
     * <p>
     * For more information, see Model Versioning in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * If you provide the optional <code>ExternalImageID</code> for the input image you provided, Amazon Rekognition
     * associates this ID with all faces that it detects. When you call the <a>ListFaces</a> operation, the response
     * returns the external ID. You can use this external image ID to create a client-side index to associate the faces
     * with each image. You can then use the index to find all faces in an image.
     * </p>
     * <p>
     * You can specify the maximum number of faces to index with the <code>MaxFaces</code> input parameter. This is
     * useful when you want to index the largest faces in an image and don't want to index smaller faces, such as those
     * belonging to people standing in the background.
     * </p>
     * <p>
     * The <code>QualityFilter</code> input parameter allows you to filter out detected faces that don’t meet the
     * required quality bar chosen by Amazon Rekognition. The quality bar is based on a variety of common use cases. By
     * default, <code>IndexFaces</code> filters detected faces. You can also explicitly filter detected faces by
     * specifying <code>AUTO</code> for the value of <code>QualityFilter</code>. If you do not want to filter detected
     * faces, specify <code>NONE</code>.
     * </p>
     * <note>
     * <p>
     * To use quality filtering, you need a collection associated with version 3 of the face model. To get the version
     * of the face model associated with a collection, call <a>DescribeCollection</a>.
     * </p>
     * </note>
     * <p>
     * Information about faces detected in an image, but not indexed, is returned in an array of <a>UnindexedFace</a>
     * objects, <code>UnindexedFaces</code>. Faces aren't indexed for reasons such as:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The number of faces detected exceeds the value of the <code>MaxFaces</code> request parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * The face is too small compared to the image dimensions.
     * </p>
     * </li>
     * <li>
     * <p>
     * The face is too blurry.
     * </p>
     * </li>
     * <li>
     * <p>
     * The image is too dark.
     * </p>
     * </li>
     * <li>
     * <p>
     * The face has an extreme pose.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In response, the <code>IndexFaces</code> operation returns an array of metadata for all detected faces,
     * <code>FaceRecords</code>. This includes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The bounding box, <code>BoundingBox</code>, of the detected face.
     * </p>
     * </li>
     * <li>
     * <p>
     * A confidence value, <code>Confidence</code>, which indicates the confidence that the bounding box contains a
     * face.
     * </p>
     * </li>
     * <li>
     * <p>
     * A face ID, <code>FaceId</code>, assigned by the service for each face that's detected and stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * An image ID, <code>ImageId</code>, assigned by the service for the input image.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you request all facial attributes (by using the <code>detectionAttributes</code> parameter), Amazon
     * Rekognition returns detailed facial attributes, such as facial landmarks (for example, location of eye and mouth)
     * and other facial attributes like gender. If you provide the same image, specify the same collection, and use the
     * same external ID in the <code>IndexFaces</code> operation, Amazon Rekognition doesn't save duplicate face
     * metadata.
     * </p>
     * <p/>
     * <p>
     * The input image is passed either as base64-encoded image bytes, or as a reference to an image in an Amazon S3
     * bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes isn't supported. The
     * image must be formatted as a PNG or JPEG file.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:IndexFaces</code> action.
     * </p>
     * 
     * @param indexFacesRequest
     * @return Result of the IndexFaces operation returned by the service.
     * @throws InvalidS3ObjectException
     *         Amazon Rekognition is unable to access the S3 object specified in the request.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws ImageTooLargeException
     *         The input image size exceeds the allowed limit. For more information, see Limits in Amazon Rekognition in
     *         the Amazon Rekognition Developer Guide.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws ResourceNotFoundException
     *         The collection specified in the request cannot be found.
     * @throws InvalidImageFormatException
     *         The provided image format is not supported.
     * @sample AmazonRekognition.IndexFaces
     */
    @Override
    public IndexFacesResult indexFaces(IndexFacesRequest request) {
        request = beforeClientExecution(request);
        return executeIndexFaces(request);
    }

    @SdkInternalApi
    final IndexFacesResult executeIndexFaces(IndexFacesRequest indexFacesRequest) {

        ExecutionContext executionContext = createExecutionContext(indexFacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<IndexFacesRequest> request = null;
        Response<IndexFacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new IndexFacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(indexFacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "IndexFaces");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<IndexFacesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new IndexFacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns list of collection IDs in your account. If the result is truncated, the response also provides a
     * <code>NextToken</code> that you can use in the subsequent request to fetch the next set of collection IDs.
     * </p>
     * <p>
     * For an example, see Listing Collections in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:ListCollections</code> action.
     * </p>
     * 
     * @param listCollectionsRequest
     * @return Result of the ListCollections operation returned by the service.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws InvalidPaginationTokenException
     *         Pagination token in the request is not valid.
     * @throws ResourceNotFoundException
     *         The collection specified in the request cannot be found.
     * @sample AmazonRekognition.ListCollections
     */
    @Override
    public ListCollectionsResult listCollections(ListCollectionsRequest request) {
        request = beforeClientExecution(request);
        return executeListCollections(request);
    }

    @SdkInternalApi
    final ListCollectionsResult executeListCollections(ListCollectionsRequest listCollectionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCollectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCollectionsRequest> request = null;
        Response<ListCollectionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCollectionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCollectionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCollections");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCollectionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCollectionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns metadata for faces in the specified collection. This metadata includes information such as the bounding
     * box coordinates, the confidence (that the bounding box contains a face), and face ID. For an example, see Listing
     * Faces in a Collection in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:ListFaces</code> action.
     * </p>
     * 
     * @param listFacesRequest
     * @return Result of the ListFaces operation returned by the service.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws InvalidPaginationTokenException
     *         Pagination token in the request is not valid.
     * @throws ResourceNotFoundException
     *         The collection specified in the request cannot be found.
     * @sample AmazonRekognition.ListFaces
     */
    @Override
    public ListFacesResult listFaces(ListFacesRequest request) {
        request = beforeClientExecution(request);
        return executeListFaces(request);
    }

    @SdkInternalApi
    final ListFacesResult executeListFaces(ListFacesRequest listFacesRequest) {

        ExecutionContext executionContext = createExecutionContext(listFacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFacesRequest> request = null;
        Response<ListFacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFaces");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFacesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of stream processors that you have created with <a>CreateStreamProcessor</a>.
     * </p>
     * 
     * @param listStreamProcessorsRequest
     * @return Result of the ListStreamProcessors operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws InvalidPaginationTokenException
     *         Pagination token in the request is not valid.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @sample AmazonRekognition.ListStreamProcessors
     */
    @Override
    public ListStreamProcessorsResult listStreamProcessors(ListStreamProcessorsRequest request) {
        request = beforeClientExecution(request);
        return executeListStreamProcessors(request);
    }

    @SdkInternalApi
    final ListStreamProcessorsResult executeListStreamProcessors(ListStreamProcessorsRequest listStreamProcessorsRequest) {

        ExecutionContext executionContext = createExecutionContext(listStreamProcessorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStreamProcessorsRequest> request = null;
        Response<ListStreamProcessorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStreamProcessorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listStreamProcessorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStreamProcessors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStreamProcessorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListStreamProcessorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of celebrities recognized in the input image. For more information, see Recognizing Celebrities
     * in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * <code>RecognizeCelebrities</code> returns the 100 largest faces in the image. It lists recognized celebrities in
     * the <code>CelebrityFaces</code> array and unrecognized faces in the <code>UnrecognizedFaces</code> array.
     * <code>RecognizeCelebrities</code> doesn't return celebrities whose faces aren't among the largest 100 faces in
     * the image.
     * </p>
     * <p>
     * For each celebrity recognized, <code>RecognizeCelebrities</code> returns a <code>Celebrity</code> object. The
     * <code>Celebrity</code> object contains the celebrity name, ID, URL links to additional information, match
     * confidence, and a <code>ComparedFace</code> object that you can use to locate the celebrity's face on the image.
     * </p>
     * <p>
     * Amazon Rekognition doesn't retain information about which images a celebrity has been recognized in. Your
     * application must store this information and use the <code>Celebrity</code> ID property as a unique identifier for
     * the celebrity. If you don't store the celebrity name or additional information URLs returned by
     * <code>RecognizeCelebrities</code>, you will need the ID to identify the celebrity in a call to the
     * <a>GetCelebrityInfo</a> operation.
     * </p>
     * <p>
     * You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3
     * bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The
     * image must be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * For an example, see Recognizing Celebrities in an Image in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:RecognizeCelebrities</code> operation.
     * </p>
     * 
     * @param recognizeCelebritiesRequest
     * @return Result of the RecognizeCelebrities operation returned by the service.
     * @throws InvalidS3ObjectException
     *         Amazon Rekognition is unable to access the S3 object specified in the request.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws InvalidImageFormatException
     *         The provided image format is not supported.
     * @throws ImageTooLargeException
     *         The input image size exceeds the allowed limit. For more information, see Limits in Amazon Rekognition in
     *         the Amazon Rekognition Developer Guide.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws InvalidImageFormatException
     *         The provided image format is not supported.
     * @sample AmazonRekognition.RecognizeCelebrities
     */
    @Override
    public RecognizeCelebritiesResult recognizeCelebrities(RecognizeCelebritiesRequest request) {
        request = beforeClientExecution(request);
        return executeRecognizeCelebrities(request);
    }

    @SdkInternalApi
    final RecognizeCelebritiesResult executeRecognizeCelebrities(RecognizeCelebritiesRequest recognizeCelebritiesRequest) {

        ExecutionContext executionContext = createExecutionContext(recognizeCelebritiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RecognizeCelebritiesRequest> request = null;
        Response<RecognizeCelebritiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RecognizeCelebritiesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(recognizeCelebritiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RecognizeCelebrities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RecognizeCelebritiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RecognizeCelebritiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * For a given input face ID, searches for matching faces in the collection the face belongs to. You get a face ID
     * when you add a face to the collection using the <a>IndexFaces</a> operation. The operation compares the features
     * of the input face with faces in the specified collection.
     * </p>
     * <note>
     * <p>
     * You can also search faces without indexing faces by using the <code>SearchFacesByImage</code> operation.
     * </p>
     * </note>
     * <p>
     * The operation response returns an array of faces that match, ordered by similarity score with the highest
     * similarity first. More specifically, it is an array of metadata for each face match that is found. Along with the
     * metadata, the response also includes a <code>confidence</code> value for each face match, indicating the
     * confidence that the specific face matches the input face.
     * </p>
     * <p>
     * For an example, see Searching for a Face Using Its Face ID in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:SearchFaces</code> action.
     * </p>
     * 
     * @param searchFacesRequest
     * @return Result of the SearchFaces operation returned by the service.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws ResourceNotFoundException
     *         The collection specified in the request cannot be found.
     * @sample AmazonRekognition.SearchFaces
     */
    @Override
    public SearchFacesResult searchFaces(SearchFacesRequest request) {
        request = beforeClientExecution(request);
        return executeSearchFaces(request);
    }

    @SdkInternalApi
    final SearchFacesResult executeSearchFaces(SearchFacesRequest searchFacesRequest) {

        ExecutionContext executionContext = createExecutionContext(searchFacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchFacesRequest> request = null;
        Response<SearchFacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchFacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchFacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchFaces");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchFacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchFacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * For a given input image, first detects the largest face in the image, and then searches the specified collection
     * for matching faces. The operation compares the features of the input face with faces in the specified collection.
     * </p>
     * <note>
     * <p>
     * To search for all faces in an input image, you might first call the <a>IndexFaces</a> operation, and then use the
     * face IDs returned in subsequent calls to the <a>SearchFaces</a> operation.
     * </p>
     * <p>
     * You can also call the <code>DetectFaces</code> operation and use the bounding boxes in the response to make face
     * crops, which then you can pass in to the <code>SearchFacesByImage</code> operation.
     * </p>
     * </note>
     * <p>
     * You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3
     * bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The
     * image must be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * The response returns an array of faces that match, ordered by similarity score with the highest similarity first.
     * More specifically, it is an array of metadata for each face match found. Along with the metadata, the response
     * also includes a <code>similarity</code> indicating how similar the face is to the input face. In the response,
     * the operation also returns the bounding box (and a confidence level that the bounding box contains a face) of the
     * face that Amazon Rekognition used for the input image.
     * </p>
     * <p>
     * For an example, Searching for a Face Using an Image in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:SearchFacesByImage</code> action.
     * </p>
     * 
     * @param searchFacesByImageRequest
     * @return Result of the SearchFacesByImage operation returned by the service.
     * @throws InvalidS3ObjectException
     *         Amazon Rekognition is unable to access the S3 object specified in the request.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws ImageTooLargeException
     *         The input image size exceeds the allowed limit. For more information, see Limits in Amazon Rekognition in
     *         the Amazon Rekognition Developer Guide.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws ResourceNotFoundException
     *         The collection specified in the request cannot be found.
     * @throws InvalidImageFormatException
     *         The provided image format is not supported.
     * @sample AmazonRekognition.SearchFacesByImage
     */
    @Override
    public SearchFacesByImageResult searchFacesByImage(SearchFacesByImageRequest request) {
        request = beforeClientExecution(request);
        return executeSearchFacesByImage(request);
    }

    @SdkInternalApi
    final SearchFacesByImageResult executeSearchFacesByImage(SearchFacesByImageRequest searchFacesByImageRequest) {

        ExecutionContext executionContext = createExecutionContext(searchFacesByImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchFacesByImageRequest> request = null;
        Response<SearchFacesByImageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchFacesByImageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchFacesByImageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchFacesByImage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchFacesByImageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchFacesByImageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts asynchronous recognition of celebrities in a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can detect celebrities in a video must be stored in an Amazon S3 bucket. Use
     * <a>Video</a> to specify the bucket name and the filename of the video. <code>StartCelebrityRecognition</code>
     * returns a job identifier (<code>JobId</code>) which you use to get the results of the analysis. When celebrity
     * recognition analysis is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple
     * Notification Service topic that you specify in <code>NotificationChannel</code>. To get the results of the
     * celebrity recognition analysis, first check that the status value published to the Amazon SNS topic is
     * <code>SUCCEEDED</code>. If so, call <a>GetCelebrityRecognition</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartCelebrityRecognition</code>.
     * </p>
     * <p>
     * For more information, see Recognizing Celebrities in the Amazon Rekognition Developer Guide.
     * </p>
     * 
     * @param startCelebrityRecognitionRequest
     * @return Result of the StartCelebrityRecognition operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws IdempotentParameterMismatchException
     *         A <code>ClientRequestToken</code> input parameter was reused with an operation, but at least one of the
     *         other input parameters is different from the previous call to the operation.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws InvalidS3ObjectException
     *         Amazon Rekognition is unable to access the S3 object specified in the request.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws VideoTooLargeException
     *         The file size or duration of the supplied media is too large. The maximum file size is 8GB. The maximum
     *         duration is 2 hours.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws LimitExceededException
     *         An Amazon Rekognition service limit was exceeded. For example, if you start too many Amazon Rekognition
     *         Video jobs concurrently, calls to start operations (<code>StartLabelDetection</code>, for example) will
     *         raise a <code>LimitExceededException</code> exception (HTTP status code: 400) until the number of
     *         concurrently running jobs is below the Amazon Rekognition service limit.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @sample AmazonRekognition.StartCelebrityRecognition
     */
    @Override
    public StartCelebrityRecognitionResult startCelebrityRecognition(StartCelebrityRecognitionRequest request) {
        request = beforeClientExecution(request);
        return executeStartCelebrityRecognition(request);
    }

    @SdkInternalApi
    final StartCelebrityRecognitionResult executeStartCelebrityRecognition(StartCelebrityRecognitionRequest startCelebrityRecognitionRequest) {

        ExecutionContext executionContext = createExecutionContext(startCelebrityRecognitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartCelebrityRecognitionRequest> request = null;
        Response<StartCelebrityRecognitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartCelebrityRecognitionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startCelebrityRecognitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartCelebrityRecognition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartCelebrityRecognitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartCelebrityRecognitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts asynchronous detection of explicit or suggestive adult content in a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can moderate content in a video stored in an Amazon S3 bucket. Use <a>Video</a> to
     * specify the bucket name and the filename of the video. <code>StartContentModeration</code> returns a job
     * identifier (<code>JobId</code>) which you use to get the results of the analysis. When content moderation
     * analysis is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification
     * Service topic that you specify in <code>NotificationChannel</code>.
     * </p>
     * <p>
     * To get the results of the content moderation analysis, first check that the status value published to the Amazon
     * SNS topic is <code>SUCCEEDED</code>. If so, call <a>GetContentModeration</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartContentModeration</code>.
     * </p>
     * <p>
     * For more information, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide.
     * </p>
     * 
     * @param startContentModerationRequest
     * @return Result of the StartContentModeration operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws IdempotentParameterMismatchException
     *         A <code>ClientRequestToken</code> input parameter was reused with an operation, but at least one of the
     *         other input parameters is different from the previous call to the operation.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws InvalidS3ObjectException
     *         Amazon Rekognition is unable to access the S3 object specified in the request.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws VideoTooLargeException
     *         The file size or duration of the supplied media is too large. The maximum file size is 8GB. The maximum
     *         duration is 2 hours.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws LimitExceededException
     *         An Amazon Rekognition service limit was exceeded. For example, if you start too many Amazon Rekognition
     *         Video jobs concurrently, calls to start operations (<code>StartLabelDetection</code>, for example) will
     *         raise a <code>LimitExceededException</code> exception (HTTP status code: 400) until the number of
     *         concurrently running jobs is below the Amazon Rekognition service limit.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @sample AmazonRekognition.StartContentModeration
     */
    @Override
    public StartContentModerationResult startContentModeration(StartContentModerationRequest request) {
        request = beforeClientExecution(request);
        return executeStartContentModeration(request);
    }

    @SdkInternalApi
    final StartContentModerationResult executeStartContentModeration(StartContentModerationRequest startContentModerationRequest) {

        ExecutionContext executionContext = createExecutionContext(startContentModerationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartContentModerationRequest> request = null;
        Response<StartContentModerationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartContentModerationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startContentModerationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartContentModeration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartContentModerationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartContentModerationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts asynchronous detection of faces in a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can detect faces in a video stored in an Amazon S3 bucket. Use <a>Video</a> to specify
     * the bucket name and the filename of the video. <code>StartFaceDetection</code> returns a job identifier (
     * <code>JobId</code>) that you use to get the results of the operation. When face detection is finished, Amazon
     * Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify
     * in <code>NotificationChannel</code>. To get the results of the face detection operation, first check that the
     * status value published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call <a>GetFaceDetection</a> and
     * pass the job identifier (<code>JobId</code>) from the initial call to <code>StartFaceDetection</code>.
     * </p>
     * <p>
     * For more information, see Detecting Faces in a Stored Video in the Amazon Rekognition Developer Guide.
     * </p>
     * 
     * @param startFaceDetectionRequest
     * @return Result of the StartFaceDetection operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws IdempotentParameterMismatchException
     *         A <code>ClientRequestToken</code> input parameter was reused with an operation, but at least one of the
     *         other input parameters is different from the previous call to the operation.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws InvalidS3ObjectException
     *         Amazon Rekognition is unable to access the S3 object specified in the request.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws VideoTooLargeException
     *         The file size or duration of the supplied media is too large. The maximum file size is 8GB. The maximum
     *         duration is 2 hours.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws LimitExceededException
     *         An Amazon Rekognition service limit was exceeded. For example, if you start too many Amazon Rekognition
     *         Video jobs concurrently, calls to start operations (<code>StartLabelDetection</code>, for example) will
     *         raise a <code>LimitExceededException</code> exception (HTTP status code: 400) until the number of
     *         concurrently running jobs is below the Amazon Rekognition service limit.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @sample AmazonRekognition.StartFaceDetection
     */
    @Override
    public StartFaceDetectionResult startFaceDetection(StartFaceDetectionRequest request) {
        request = beforeClientExecution(request);
        return executeStartFaceDetection(request);
    }

    @SdkInternalApi
    final StartFaceDetectionResult executeStartFaceDetection(StartFaceDetectionRequest startFaceDetectionRequest) {

        ExecutionContext executionContext = createExecutionContext(startFaceDetectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartFaceDetectionRequest> request = null;
        Response<StartFaceDetectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartFaceDetectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startFaceDetectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartFaceDetection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartFaceDetectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartFaceDetectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts the asynchronous search for faces in a collection that match the faces of persons detected in a stored
     * video.
     * </p>
     * <p>
     * The video must be stored in an Amazon S3 bucket. Use <a>Video</a> to specify the bucket name and the filename of
     * the video. <code>StartFaceSearch</code> returns a job identifier (<code>JobId</code>) which you use to get the
     * search results once the search has completed. When searching is finished, Amazon Rekognition Video publishes a
     * completion status to the Amazon Simple Notification Service topic that you specify in
     * <code>NotificationChannel</code>. To get the search results, first check that the status value published to the
     * Amazon SNS topic is <code>SUCCEEDED</code>. If so, call <a>GetFaceSearch</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartFaceSearch</code>. For more information, see
     * <a>procedure-person-search-videos</a>.
     * </p>
     * 
     * @param startFaceSearchRequest
     * @return Result of the StartFaceSearch operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws IdempotentParameterMismatchException
     *         A <code>ClientRequestToken</code> input parameter was reused with an operation, but at least one of the
     *         other input parameters is different from the previous call to the operation.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws InvalidS3ObjectException
     *         Amazon Rekognition is unable to access the S3 object specified in the request.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws VideoTooLargeException
     *         The file size or duration of the supplied media is too large. The maximum file size is 8GB. The maximum
     *         duration is 2 hours.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws LimitExceededException
     *         An Amazon Rekognition service limit was exceeded. For example, if you start too many Amazon Rekognition
     *         Video jobs concurrently, calls to start operations (<code>StartLabelDetection</code>, for example) will
     *         raise a <code>LimitExceededException</code> exception (HTTP status code: 400) until the number of
     *         concurrently running jobs is below the Amazon Rekognition service limit.
     * @throws ResourceNotFoundException
     *         The collection specified in the request cannot be found.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @sample AmazonRekognition.StartFaceSearch
     */
    @Override
    public StartFaceSearchResult startFaceSearch(StartFaceSearchRequest request) {
        request = beforeClientExecution(request);
        return executeStartFaceSearch(request);
    }

    @SdkInternalApi
    final StartFaceSearchResult executeStartFaceSearch(StartFaceSearchRequest startFaceSearchRequest) {

        ExecutionContext executionContext = createExecutionContext(startFaceSearchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartFaceSearchRequest> request = null;
        Response<StartFaceSearchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartFaceSearchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startFaceSearchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartFaceSearch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartFaceSearchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartFaceSearchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts asynchronous detection of labels in a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can detect labels in a video. Labels are instances of real-world entities. This includes
     * objects like flower, tree, and table; events like wedding, graduation, and birthday party; concepts like
     * landscape, evening, and nature; and activities like a person getting out of a car or a person skiing.
     * </p>
     * <p>
     * The video must be stored in an Amazon S3 bucket. Use <a>Video</a> to specify the bucket name and the filename of
     * the video. <code>StartLabelDetection</code> returns a job identifier (<code>JobId</code>) which you use to get
     * the results of the operation. When label detection is finished, Amazon Rekognition Video publishes a completion
     * status to the Amazon Simple Notification Service topic that you specify in <code>NotificationChannel</code>.
     * </p>
     * <p>
     * To get the results of the label detection operation, first check that the status value published to the Amazon
     * SNS topic is <code>SUCCEEDED</code>. If so, call <a>GetLabelDetection</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartLabelDetection</code>.
     * </p>
     * <p/>
     * 
     * @param startLabelDetectionRequest
     * @return Result of the StartLabelDetection operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws IdempotentParameterMismatchException
     *         A <code>ClientRequestToken</code> input parameter was reused with an operation, but at least one of the
     *         other input parameters is different from the previous call to the operation.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws InvalidS3ObjectException
     *         Amazon Rekognition is unable to access the S3 object specified in the request.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws VideoTooLargeException
     *         The file size or duration of the supplied media is too large. The maximum file size is 8GB. The maximum
     *         duration is 2 hours.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws LimitExceededException
     *         An Amazon Rekognition service limit was exceeded. For example, if you start too many Amazon Rekognition
     *         Video jobs concurrently, calls to start operations (<code>StartLabelDetection</code>, for example) will
     *         raise a <code>LimitExceededException</code> exception (HTTP status code: 400) until the number of
     *         concurrently running jobs is below the Amazon Rekognition service limit.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @sample AmazonRekognition.StartLabelDetection
     */
    @Override
    public StartLabelDetectionResult startLabelDetection(StartLabelDetectionRequest request) {
        request = beforeClientExecution(request);
        return executeStartLabelDetection(request);
    }

    @SdkInternalApi
    final StartLabelDetectionResult executeStartLabelDetection(StartLabelDetectionRequest startLabelDetectionRequest) {

        ExecutionContext executionContext = createExecutionContext(startLabelDetectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartLabelDetectionRequest> request = null;
        Response<StartLabelDetectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartLabelDetectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startLabelDetectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartLabelDetection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartLabelDetectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartLabelDetectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts the asynchronous tracking of a person's path in a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can track the path of people in a video stored in an Amazon S3 bucket. Use <a>Video</a>
     * to specify the bucket name and the filename of the video. <code>StartPersonTracking</code> returns a job
     * identifier (<code>JobId</code>) which you use to get the results of the operation. When label detection is
     * finished, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic that
     * you specify in <code>NotificationChannel</code>.
     * </p>
     * <p>
     * To get the results of the person detection operation, first check that the status value published to the Amazon
     * SNS topic is <code>SUCCEEDED</code>. If so, call <a>GetPersonTracking</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartPersonTracking</code>.
     * </p>
     * 
     * @param startPersonTrackingRequest
     * @return Result of the StartPersonTracking operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws IdempotentParameterMismatchException
     *         A <code>ClientRequestToken</code> input parameter was reused with an operation, but at least one of the
     *         other input parameters is different from the previous call to the operation.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws InvalidS3ObjectException
     *         Amazon Rekognition is unable to access the S3 object specified in the request.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws VideoTooLargeException
     *         The file size or duration of the supplied media is too large. The maximum file size is 8GB. The maximum
     *         duration is 2 hours.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws LimitExceededException
     *         An Amazon Rekognition service limit was exceeded. For example, if you start too many Amazon Rekognition
     *         Video jobs concurrently, calls to start operations (<code>StartLabelDetection</code>, for example) will
     *         raise a <code>LimitExceededException</code> exception (HTTP status code: 400) until the number of
     *         concurrently running jobs is below the Amazon Rekognition service limit.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @sample AmazonRekognition.StartPersonTracking
     */
    @Override
    public StartPersonTrackingResult startPersonTracking(StartPersonTrackingRequest request) {
        request = beforeClientExecution(request);
        return executeStartPersonTracking(request);
    }

    @SdkInternalApi
    final StartPersonTrackingResult executeStartPersonTracking(StartPersonTrackingRequest startPersonTrackingRequest) {

        ExecutionContext executionContext = createExecutionContext(startPersonTrackingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartPersonTrackingRequest> request = null;
        Response<StartPersonTrackingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartPersonTrackingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startPersonTrackingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartPersonTracking");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartPersonTrackingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartPersonTrackingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts processing a stream processor. You create a stream processor by calling <a>CreateStreamProcessor</a>. To
     * tell <code>StartStreamProcessor</code> which stream processor to start, use the value of the <code>Name</code>
     * field specified in the call to <code>CreateStreamProcessor</code>.
     * </p>
     * 
     * @param startStreamProcessorRequest
     * @return Result of the StartStreamProcessor operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws ResourceNotFoundException
     *         The collection specified in the request cannot be found.
     * @throws ResourceInUseException
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @sample AmazonRekognition.StartStreamProcessor
     */
    @Override
    public StartStreamProcessorResult startStreamProcessor(StartStreamProcessorRequest request) {
        request = beforeClientExecution(request);
        return executeStartStreamProcessor(request);
    }

    @SdkInternalApi
    final StartStreamProcessorResult executeStartStreamProcessor(StartStreamProcessorRequest startStreamProcessorRequest) {

        ExecutionContext executionContext = createExecutionContext(startStreamProcessorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartStreamProcessorRequest> request = null;
        Response<StartStreamProcessorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartStreamProcessorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startStreamProcessorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartStreamProcessor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartStreamProcessorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartStreamProcessorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a running stream processor that was created by <a>CreateStreamProcessor</a>.
     * </p>
     * 
     * @param stopStreamProcessorRequest
     * @return Result of the StopStreamProcessor operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws ResourceNotFoundException
     *         The collection specified in the request cannot be found.
     * @throws ResourceInUseException
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @sample AmazonRekognition.StopStreamProcessor
     */
    @Override
    public StopStreamProcessorResult stopStreamProcessor(StopStreamProcessorRequest request) {
        request = beforeClientExecution(request);
        return executeStopStreamProcessor(request);
    }

    @SdkInternalApi
    final StopStreamProcessorResult executeStopStreamProcessor(StopStreamProcessorRequest stopStreamProcessorRequest) {

        ExecutionContext executionContext = createExecutionContext(stopStreamProcessorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopStreamProcessorRequest> request = null;
        Response<StopStreamProcessorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopStreamProcessorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopStreamProcessorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopStreamProcessor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopStreamProcessorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopStreamProcessorResultJsonUnmarshaller());
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
