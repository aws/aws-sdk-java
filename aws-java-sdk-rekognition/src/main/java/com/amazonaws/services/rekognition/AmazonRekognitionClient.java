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
import com.amazonaws.services.rekognition.waiters.AmazonRekognitionWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.services.rekognition.model.transform.*;

/**
 * Client for accessing Amazon Rekognition. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * This is the API Reference for <a href="https://docs.aws.amazon.com/rekognition/latest/dg/images.html">Amazon
 * Rekognition Image</a>, <a href="https://docs.aws.amazon.com/rekognition/latest/customlabels-dg/what-is.html">Amazon
 * Rekognition Custom Labels</a>, <a href="https://docs.aws.amazon.com/rekognition/latest/dg/video.html">Amazon
 * Rekognition Stored Video</a>, <a href="https://docs.aws.amazon.com/rekognition/latest/dg/streaming-video.html">Amazon
 * Rekognition Streaming Video</a>. It provides descriptions of actions, data types, common parameters, and common
 * errors.
 * </p>
 * <p>
 * <b>Amazon Rekognition Image</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CompareFaces.html">CompareFaces</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateCollection.html">CreateCollection</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DeleteCollection.html">DeleteCollection</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DeleteFaces.html">DeleteFaces</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DescribeCollection.html">DescribeCollection</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DetectFaces.html">DetectFaces</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DetectLabels.html">DetectLabels</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DetectModerationLabels.html">
 * DetectModerationLabels</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DetectProtectiveEquipment.html">
 * DetectProtectiveEquipment</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DetectText.html">DetectText</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_GetCelebrityInfo.html">GetCelebrityInfo</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_IndexFaces.html">IndexFaces</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_ListCollections.html">ListCollections</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_ListFaces.html">ListFaces</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_RecognizeCelebrities.html">
 * RecognizeCelebrities</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_SearchFaces.html">SearchFaces</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_SearchFacesByImage.html">SearchFacesByImage</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Amazon Rekognition Custom Labels</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CopyProjectVersion.html">CopyProjectVersion</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateDataset.html">CreateDataset</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateProject.html">CreateProject</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateProjectVersion.html">
 * CreateProjectVersion</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DeleteDataset.html">DeleteDataset</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DeleteProject.html">DeleteProject</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DeleteProjectPolicy.html">DeleteProjectPolicy
 * </a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DeleteProjectVersion.html">
 * DeleteProjectVersion</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DescribeDataset.html">DescribeDataset</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DescribeProjects.html">DescribeProjects</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DescribeProjectVersions.html">
 * DescribeProjectVersions</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DetectCustomLabels.html">DetectCustomLabels</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DistributeDatasetEntries.html">
 * DistributeDatasetEntries</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_ListDatasetEntries.html">ListDatasetEntries</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_ListDatasetLabels.html">ListDatasetLabels</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_ListProjectPolicies.html">ListProjectPolicies
 * </a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_PutProjectPolicy.html">PutProjectPolicy</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StartProjectVersion.html">StartProjectVersion
 * </a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StopProjectVersion.html">StopProjectVersion</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_UpdateDatasetEntries.html">
 * UpdateDatasetEntries</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Amazon Rekognition Video Stored Video</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_GetCelebrityRecognition.html">
 * GetCelebrityRecognition</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_GetContentModeration.html">
 * GetContentModeration</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_GetFaceDetection.html">GetFaceDetection</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_GetFaceSearch.html">GetFaceSearch</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_GetLabelDetection.html">GetLabelDetection</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_GetPersonTracking.html">GetPersonTracking</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_GetSegmentDetection.html">GetSegmentDetection
 * </a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_GetTextDetection.html">GetTextDetection</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StartCelebrityRecognition.html">
 * StartCelebrityRecognition</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StartContentModeration.html">
 * StartContentModeration</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StartFaceDetection.html">StartFaceDetection</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StartFaceSearch.html">StartFaceSearch</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StartLabelDetection.html">StartLabelDetection
 * </a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StartPersonTracking.html">StartPersonTracking
 * </a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StartSegmentDetection.html">
 * StartSegmentDetection</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StartTextDetection.html">StartTextDetection</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Amazon Rekognition Video Streaming Video</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_CreateStreamProcessor.html">
 * CreateStreamProcessor</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DeleteStreamProcessor.html">
 * DeleteStreamProcessor</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DescribeStreamProcessor.html">
 * DescribeStreamProcessor</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_ListStreamProcessors.html">
 * ListStreamProcessors</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StartStreamProcessor.html">
 * StartStreamProcessor</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StopStreamProcessor.html">StopStreamProcessor
 * </a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rekognition/latest/APIReference/API_UpdateStreamProcessor.html">
 * UpdateStreamProcessor</a>
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonRekognitionClient extends AmazonWebServiceClient implements AmazonRekognition {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonRekognition.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "rekognition";

    private volatile AmazonRekognitionWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MalformedPolicyDocumentException").withExceptionUnmarshaller(
                                    com.amazonaws.services.rekognition.model.transform.MalformedPolicyDocumentExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotReadyException").withExceptionUnmarshaller(
                                    com.amazonaws.services.rekognition.model.transform.ResourceNotReadyExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPolicyRevisionIdException").withExceptionUnmarshaller(
                                    com.amazonaws.services.rekognition.model.transform.InvalidPolicyRevisionIdExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("HumanLoopQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.rekognition.model.transform.HumanLoopQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.rekognition.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.rekognition.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.rekognition.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IdempotentParameterMismatchException").withExceptionUnmarshaller(
                                    com.amazonaws.services.rekognition.model.transform.IdempotentParameterMismatchExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ProvisionedThroughputExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.rekognition.model.transform.ProvisionedThroughputExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.rekognition.model.transform.ResourceAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPaginationTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.rekognition.model.transform.InvalidPaginationTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withExceptionUnmarshaller(
                                    com.amazonaws.services.rekognition.model.transform.InvalidParameterExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.rekognition.model.transform.ResourceInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidImageFormatException").withExceptionUnmarshaller(
                                    com.amazonaws.services.rekognition.model.transform.InvalidImageFormatExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.rekognition.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidS3ObjectException").withExceptionUnmarshaller(
                                    com.amazonaws.services.rekognition.model.transform.InvalidS3ObjectExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("VideoTooLargeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.rekognition.model.transform.VideoTooLargeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.rekognition.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ImageTooLargeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.rekognition.model.transform.ImageTooLargeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerError").withExceptionUnmarshaller(
                                    com.amazonaws.services.rekognition.model.transform.InternalServerErrorExceptionUnmarshaller.getInstance()))
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
     * <p>
     * If the source image contains multiple faces, the service detects the largest face and compares it with each face
     * detected in the target image.
     * </p>
     * <note>
     * <p>
     * CompareFaces uses machine learning algorithms, which are probabilistic. A false negative is an incorrect
     * prediction that a face in the target image has a low similarity confidence score when compared to the face in the
     * source image. To reduce the probability of false negatives, we recommend that you compare the target image
     * against multiple source images. If you plan to use <code>CompareFaces</code> to make a decision that impacts an
     * individual's rights, privacy, or access to services, we recommend that you pass the result to a human for review
     * and further validation before taking action.
     * </p>
     * </note>
     * <p>
     * You pass the input and target images either as base64-encoded image bytes or as references to images in an Amazon
     * S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes isn't supported. The
     * image must be formatted as a PNG or JPEG file.
     * </p>
     * <p>
     * In response, the operation returns an array of face matches ordered by similarity score in descending order. For
     * each face match, the response provides a bounding box of the face, facial landmarks, pose details (pitch, roll,
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
     * The <code>QualityFilter</code> input parameter allows you to filter out detected faces that don’t meet a required
     * quality bar. The quality bar is based on a variety of common use cases. Use <code>QualityFilter</code> to set the
     * quality bar by specifying <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>. If you do not want to
     * filter detected faces, specify <code>NONE</code>. The default value is <code>NONE</code>.
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
     *         The input image size exceeds the allowed limit. If you are calling DetectProtectiveEquipment, the image
     *         size or resolution exceeds the allowed limit. For more information, see Guidelines and quotas in Amazon
     *         Rekognition in the Amazon Rekognition Developer Guide.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Copies a version of an Amazon Rekognition Custom Labels model from a source project to a destination project. The
     * source and destination projects can be in different AWS accounts but must be in the same AWS Region. You can't
     * copy a model to another AWS service.
     * </p>
     * <p>
     * To copy a model version to a different AWS account, you need to create a resource-based policy known as a
     * <i>project policy</i>. You attach the project policy to the source project by calling <a>PutProjectPolicy</a>.
     * The project policy gives permission to copy the model version from a trusting AWS account to a trusted account.
     * </p>
     * <p>
     * For more information creating and attaching a project policy, see Attaching a project policy (SDK) in the
     * <i>Amazon Rekognition Custom Labels Developer Guide</i>.
     * </p>
     * <p>
     * If you are copying a model version to a project in the same AWS account, you don't need to create a project
     * policy.
     * </p>
     * <note>
     * <p>
     * To copy a model, the destination project, source project, and source model version must already exist.
     * </p>
     * </note>
     * <p>
     * Copying a model version takes a while to complete. To get the current status, call <a>DescribeProjectVersions</a>
     * and check the value of <code>Status</code> in the <a>ProjectVersionDescription</a> object. The copy operation has
     * finished when the value of <code>Status</code> is <code>COPYING_COMPLETED</code>.
     * </p>
     * 
     * @param copyProjectVersionRequest
     * @return Result of the CopyProjectVersion operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws LimitExceededException
     *         An Amazon Rekognition service limit was exceeded. For example, if you start too many Amazon Rekognition
     *         Video jobs concurrently, calls to start operations (<code>StartLabelDetection</code>, for example) will
     *         raise a <code>LimitExceededException</code> exception (HTTP status code: 400) until the number of
     *         concurrently running jobs is below the Amazon Rekognition service limit.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws ServiceQuotaExceededException
     *         <p>
     *         The size of the collection exceeds the allowed limit. For more information, see Guidelines and quotas in
     *         Amazon Rekognition in the Amazon Rekognition Developer Guide.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws ResourceInUseException
     *         The specified resource is already being used.
     * @sample AmazonRekognition.CopyProjectVersion
     */
    @Override
    public CopyProjectVersionResult copyProjectVersion(CopyProjectVersionRequest request) {
        request = beforeClientExecution(request);
        return executeCopyProjectVersion(request);
    }

    @SdkInternalApi
    final CopyProjectVersionResult executeCopyProjectVersion(CopyProjectVersionRequest copyProjectVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(copyProjectVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopyProjectVersionRequest> request = null;
        Response<CopyProjectVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CopyProjectVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(copyProjectVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CopyProjectVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CopyProjectVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CopyProjectVersionResultJsonUnmarshaller());
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
     * This operation requires permissions to perform the <code>rekognition:CreateCollection</code> action. If you want
     * to tag your collection, you also require permission to perform the <code>rekognition:TagResource</code>
     * operation.
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
     *         A resource with the specified ID already exists.
     * @throws ServiceQuotaExceededException
     *         <p>
     *         The size of the collection exceeds the allowed limit. For more information, see Guidelines and quotas in
     *         Amazon Rekognition in the Amazon Rekognition Developer Guide.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Creates a new Amazon Rekognition Custom Labels dataset. You can create a dataset by using an Amazon Sagemaker
     * format manifest file or by copying an existing Amazon Rekognition Custom Labels dataset.
     * </p>
     * <p>
     * To create a training dataset for a project, specify <code>train</code> for the value of <code>DatasetType</code>.
     * To create the test dataset for a project, specify <code>test</code> for the value of <code>DatasetType</code>.
     * </p>
     * <p>
     * The response from <code>CreateDataset</code> is the Amazon Resource Name (ARN) for the dataset. Creating a
     * dataset takes a while to complete. Use <a>DescribeDataset</a> to check the current status. The dataset created
     * successfully if the value of <code>Status</code> is <code>CREATE_COMPLETE</code>.
     * </p>
     * <p>
     * To check if any non-terminal errors occurred, call <a>ListDatasetEntries</a> and check for the presence of
     * <code>errors</code> lists in the JSON Lines.
     * </p>
     * <p>
     * Dataset creation fails if a terminal error occurs (<code>Status</code> = <code>CREATE_FAILED</code>). Currently,
     * you can't access the terminal error information.
     * </p>
     * <p>
     * For more information, see Creating dataset in the <i>Amazon Rekognition Custom Labels Developer Guide</i>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:CreateDataset</code> action. If you want to
     * copy an existing dataset, you also require permission to perform the <code>rekognition:ListDatasetEntries</code>
     * action.
     * </p>
     * 
     * @param createDatasetRequest
     * @return Result of the CreateDataset operation returned by the service.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws LimitExceededException
     *         An Amazon Rekognition service limit was exceeded. For example, if you start too many Amazon Rekognition
     *         Video jobs concurrently, calls to start operations (<code>StartLabelDetection</code>, for example) will
     *         raise a <code>LimitExceededException</code> exception (HTTP status code: 400) until the number of
     *         concurrently running jobs is below the Amazon Rekognition service limit.
     * @throws InvalidS3ObjectException
     *         Amazon Rekognition is unable to access the S3 object specified in the request.
     * @throws ResourceAlreadyExistsException
     *         A resource with the specified ID already exists.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @sample AmazonRekognition.CreateDataset
     */
    @Override
    public CreateDatasetResult createDataset(CreateDatasetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDataset(request);
    }

    @SdkInternalApi
    final CreateDatasetResult executeCreateDataset(CreateDatasetRequest createDatasetRequest) {

        ExecutionContext executionContext = createExecutionContext(createDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDatasetRequest> request = null;
        Response<CreateDatasetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDatasetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDataset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDatasetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDatasetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Amazon Rekognition Custom Labels project. A project is a group of resources (datasets, model
     * versions) that you use to create and manage Amazon Rekognition Custom Labels models.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:CreateProject</code> action.
     * </p>
     * 
     * @param createProjectRequest
     * @return Result of the CreateProject operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is already being used.
     * @throws LimitExceededException
     *         An Amazon Rekognition service limit was exceeded. For example, if you start too many Amazon Rekognition
     *         Video jobs concurrently, calls to start operations (<code>StartLabelDetection</code>, for example) will
     *         raise a <code>LimitExceededException</code> exception (HTTP status code: 400) until the number of
     *         concurrently running jobs is below the Amazon Rekognition service limit.
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
     * @sample AmazonRekognition.CreateProject
     */
    @Override
    public CreateProjectResult createProject(CreateProjectRequest request) {
        request = beforeClientExecution(request);
        return executeCreateProject(request);
    }

    @SdkInternalApi
    final CreateProjectResult executeCreateProject(CreateProjectRequest createProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(createProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProjectRequest> request = null;
        Response<CreateProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new version of a model and begins training. Models are managed as part of an Amazon Rekognition Custom
     * Labels project. The response from <code>CreateProjectVersion</code> is an Amazon Resource Name (ARN) for the
     * version of the model.
     * </p>
     * <p>
     * Training uses the training and test datasets associated with the project. For more information, see Creating
     * training and test dataset in the <i>Amazon Rekognition Custom Labels Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * You can train a model in a project that doesn't have associated datasets by specifying manifest files in the
     * <code>TrainingData</code> and <code>TestingData</code> fields.
     * </p>
     * <p>
     * If you open the console after training a model with manifest files, Amazon Rekognition Custom Labels creates the
     * datasets for you using the most recent manifest files. You can no longer train a model version for the project by
     * specifying manifest files.
     * </p>
     * <p>
     * Instead of training with a project without associated datasets, we recommend that you use the manifest files to
     * create training and test datasets for the project.
     * </p>
     * </note>
     * <p>
     * Training takes a while to complete. You can get the current status by calling <a>DescribeProjectVersions</a>.
     * Training completed successfully if the value of the <code>Status</code> field is <code>TRAINING_COMPLETED</code>.
     * </p>
     * <p>
     * If training fails, see Debugging a failed model training in the <i>Amazon Rekognition Custom Labels</i> developer
     * guide.
     * </p>
     * <p>
     * Once training has successfully completed, call <a>DescribeProjectVersions</a> to get the training results and
     * evaluate the model. For more information, see Improving a trained Amazon Rekognition Custom Labels model in the
     * <i>Amazon Rekognition Custom Labels</i> developers guide.
     * </p>
     * <p>
     * After evaluating the model, you start the model by calling <a>StartProjectVersion</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:CreateProjectVersion</code> action.
     * </p>
     * 
     * @param createProjectVersionRequest
     * @return Result of the CreateProjectVersion operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is already being used.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws LimitExceededException
     *         An Amazon Rekognition service limit was exceeded. For example, if you start too many Amazon Rekognition
     *         Video jobs concurrently, calls to start operations (<code>StartLabelDetection</code>, for example) will
     *         raise a <code>LimitExceededException</code> exception (HTTP status code: 400) until the number of
     *         concurrently running jobs is below the Amazon Rekognition service limit.
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
     * @throws ServiceQuotaExceededException
     *         <p>
     *         The size of the collection exceeds the allowed limit. For more information, see Guidelines and quotas in
     *         Amazon Rekognition in the Amazon Rekognition Developer Guide.
     * @sample AmazonRekognition.CreateProjectVersion
     */
    @Override
    public CreateProjectVersionResult createProjectVersion(CreateProjectVersionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateProjectVersion(request);
    }

    @SdkInternalApi
    final CreateProjectVersionResult executeCreateProjectVersion(CreateProjectVersionRequest createProjectVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(createProjectVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProjectVersionRequest> request = null;
        Response<CreateProjectVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProjectVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createProjectVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateProjectVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateProjectVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateProjectVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Rekognition stream processor that you can use to detect and recognize faces or to detect labels
     * in a streaming video.
     * </p>
     * <p>
     * Amazon Rekognition Video is a consumer of live video from Amazon Kinesis Video Streams. There are two different
     * settings for stream processors in Amazon Rekognition: detecting faces and detecting labels.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are creating a stream processor for detecting faces, you provide as input a Kinesis video stream (
     * <code>Input</code>) and a Kinesis data stream (<code>Output</code>) stream. You also specify the face recognition
     * criteria in <code>Settings</code>. For example, the collection containing faces that you want to recognize. After
     * you have finished analyzing a streaming video, use <a>StopStreamProcessor</a> to stop processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are creating a stream processor to detect labels, you provide as input a Kinesis video stream (
     * <code>Input</code>), Amazon S3 bucket information (<code>Output</code>), and an Amazon SNS topic ARN (
     * <code>NotificationChannel</code>). You can also provide a KMS key ID to encrypt the data sent to your Amazon S3
     * bucket. You specify what you want to detect in <code>ConnectedHomeSettings</code>, such as people, packages and
     * people, or pets, people, and packages. You can also specify where in the frame you want Amazon Rekognition to
     * monitor with <code>RegionsOfInterest</code>. When you run the <a>StartStreamProcessor</a> operation on a label
     * detection stream processor, you input start and stop information to determine the length of the processing time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use <code>Name</code> to assign an identifier for the stream processor. You use <code>Name</code> to manage the
     * stream processor. For example, you can start processing the source video by calling <a>StartStreamProcessor</a>
     * with the <code>Name</code> field.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:CreateStreamProcessor</code> action. If you
     * want to tag your stream processor, you also require permission to perform the
     * <code>rekognition:TagResource</code> operation.
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
     *         The specified resource is already being used.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws ServiceQuotaExceededException
     *         <p>
     *         The size of the collection exceeds the allowed limit. For more information, see Guidelines and quotas in
     *         Amazon Rekognition in the Amazon Rekognition Developer Guide.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * see <a href="https://docs.aws.amazon.com/rekognition/latest/dg/delete-collection-procedure.html">Deleting a
     * collection</a>.
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
     *         The resource specified in the request cannot be found.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Deletes an existing Amazon Rekognition Custom Labels dataset. Deleting a dataset might take while. Use
     * <a>DescribeDataset</a> to check the current status. The dataset is still deleting if the value of
     * <code>Status</code> is <code>DELETE_IN_PROGRESS</code>. If you try to access the dataset after it is deleted, you
     * get a <code>ResourceNotFoundException</code> exception.
     * </p>
     * <p>
     * You can't delete a dataset while it is creating (<code>Status</code> = <code>CREATE_IN_PROGRESS</code>) or if the
     * dataset is updating (<code>Status</code> = <code>UPDATE_IN_PROGRESS</code>).
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DeleteDataset</code> action.
     * </p>
     * 
     * @param deleteDatasetRequest
     * @return Result of the DeleteDataset operation returned by the service.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws LimitExceededException
     *         An Amazon Rekognition service limit was exceeded. For example, if you start too many Amazon Rekognition
     *         Video jobs concurrently, calls to start operations (<code>StartLabelDetection</code>, for example) will
     *         raise a <code>LimitExceededException</code> exception (HTTP status code: 400) until the number of
     *         concurrently running jobs is below the Amazon Rekognition service limit.
     * @throws ResourceInUseException
     *         The specified resource is already being used.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @sample AmazonRekognition.DeleteDataset
     */
    @Override
    public DeleteDatasetResult deleteDataset(DeleteDatasetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDataset(request);
    }

    @SdkInternalApi
    final DeleteDatasetResult executeDeleteDataset(DeleteDatasetRequest deleteDatasetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDatasetRequest> request = null;
        Response<DeleteDatasetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDatasetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDataset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDatasetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDatasetResultJsonUnmarshaller());
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
     *         The resource specified in the request cannot be found.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Deletes an Amazon Rekognition Custom Labels project. To delete a project you must first delete all models
     * associated with the project. To delete a model, see <a>DeleteProjectVersion</a>.
     * </p>
     * <p>
     * <code>DeleteProject</code> is an asynchronous operation. To check if the project is deleted, call
     * <a>DescribeProjects</a>. The project is deleted when the project no longer appears in the response. Be aware that
     * deleting a given project will also delete any <code>ProjectPolicies</code> associated with that project.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DeleteProject</code> action.
     * </p>
     * 
     * @param deleteProjectRequest
     * @return Result of the DeleteProject operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is already being used.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
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
     * @sample AmazonRekognition.DeleteProject
     */
    @Override
    public DeleteProjectResult deleteProject(DeleteProjectRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProject(request);
    }

    @SdkInternalApi
    final DeleteProjectResult executeDeleteProject(DeleteProjectRequest deleteProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProjectRequest> request = null;
        Response<DeleteProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing project policy.
     * </p>
     * <p>
     * To get a list of project policies attached to a project, call <a>ListProjectPolicies</a>. To attach a project
     * policy to a project, call <a>PutProjectPolicy</a>.
     * </p>
     * 
     * @param deleteProjectPolicyRequest
     * @return Result of the DeleteProjectPolicy operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws InvalidPolicyRevisionIdException
     *         The supplied revision id for the project policy is invalid.
     * @sample AmazonRekognition.DeleteProjectPolicy
     */
    @Override
    public DeleteProjectPolicyResult deleteProjectPolicy(DeleteProjectPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProjectPolicy(request);
    }

    @SdkInternalApi
    final DeleteProjectPolicyResult executeDeleteProjectPolicy(DeleteProjectPolicyRequest deleteProjectPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProjectPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProjectPolicyRequest> request = null;
        Response<DeleteProjectPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProjectPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteProjectPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProjectPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProjectPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteProjectPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon Rekognition Custom Labels model.
     * </p>
     * <p>
     * You can't delete a model if it is running or if it is training. To check the status of a model, use the
     * <code>Status</code> field returned from <a>DescribeProjectVersions</a>. To stop a running model call
     * <a>StopProjectVersion</a>. If the model is training, wait until it finishes.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DeleteProjectVersion</code> action.
     * </p>
     * 
     * @param deleteProjectVersionRequest
     * @return Result of the DeleteProjectVersion operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws ResourceInUseException
     *         The specified resource is already being used.
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
     * @sample AmazonRekognition.DeleteProjectVersion
     */
    @Override
    public DeleteProjectVersionResult deleteProjectVersion(DeleteProjectVersionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProjectVersion(request);
    }

    @SdkInternalApi
    final DeleteProjectVersionResult executeDeleteProjectVersion(DeleteProjectVersionRequest deleteProjectVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProjectVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProjectVersionRequest> request = null;
        Response<DeleteProjectVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProjectVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteProjectVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProjectVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProjectVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteProjectVersionResultJsonUnmarshaller());
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
     *         The resource specified in the request cannot be found.
     * @throws ResourceInUseException
     *         The specified resource is already being used.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     *         The resource specified in the request cannot be found.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Describes an Amazon Rekognition Custom Labels dataset. You can get information such as the current status of a
     * dataset and statistics about the images and labels in a dataset.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DescribeDataset</code> action.
     * </p>
     * 
     * @param describeDatasetRequest
     * @return Result of the DescribeDataset operation returned by the service.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @sample AmazonRekognition.DescribeDataset
     */
    @Override
    public DescribeDatasetResult describeDataset(DescribeDatasetRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDataset(request);
    }

    @SdkInternalApi
    final DescribeDatasetResult executeDescribeDataset(DescribeDatasetRequest describeDatasetRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDatasetRequest> request = null;
        Response<DescribeDatasetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDatasetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDataset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDatasetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDatasetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists and describes the versions of a model in an Amazon Rekognition Custom Labels project. You can specify up to
     * 10 model versions in <code>ProjectVersionArns</code>. If you don't specify a value, descriptions for all model
     * versions in the project are returned.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DescribeProjectVersions</code> action.
     * </p>
     * 
     * @param describeProjectVersionsRequest
     * @return Result of the DescribeProjectVersions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws InvalidPaginationTokenException
     *         Pagination token in the request is not valid.
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
     * @sample AmazonRekognition.DescribeProjectVersions
     */
    @Override
    public DescribeProjectVersionsResult describeProjectVersions(DescribeProjectVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeProjectVersions(request);
    }

    @SdkInternalApi
    final DescribeProjectVersionsResult executeDescribeProjectVersions(DescribeProjectVersionsRequest describeProjectVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeProjectVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProjectVersionsRequest> request = null;
        Response<DescribeProjectVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProjectVersionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeProjectVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeProjectVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeProjectVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeProjectVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about your Amazon Rekognition Custom Labels projects.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DescribeProjects</code> action.
     * </p>
     * 
     * @param describeProjectsRequest
     * @return Result of the DescribeProjects operation returned by the service.
     * @throws InvalidPaginationTokenException
     *         Pagination token in the request is not valid.
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
     * @sample AmazonRekognition.DescribeProjects
     */
    @Override
    public DescribeProjectsResult describeProjects(DescribeProjectsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeProjects(request);
    }

    @SdkInternalApi
    final DescribeProjectsResult executeDescribeProjects(DescribeProjectsRequest describeProjectsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeProjectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProjectsRequest> request = null;
        Response<DescribeProjectsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProjectsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeProjectsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeProjects");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeProjectsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeProjectsResultJsonUnmarshaller());
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
     *         The resource specified in the request cannot be found.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Detects custom labels in a supplied image by using an Amazon Rekognition Custom Labels model.
     * </p>
     * <p>
     * You specify which version of a model version to use by using the <code>ProjectVersionArn</code> input parameter.
     * </p>
     * <p>
     * You pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If
     * you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must
     * be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * For each object that the model version detects on an image, the API returns a (<code>CustomLabel</code>) object
     * in an array (<code>CustomLabels</code>). Each <code>CustomLabel</code> object provides the label name (
     * <code>Name</code>), the level of confidence that the image contains the object (<code>Confidence</code>), and
     * object location information, if it exists, for the label on the image (<code>Geometry</code>).
     * </p>
     * <p>
     * To filter labels that are returned, specify a value for <code>MinConfidence</code>.
     * <code>DetectCustomLabelsLabels</code> only returns labels with a confidence that's higher than the specified
     * value. The value of <code>MinConfidence</code> maps to the assumed threshold values created during training. For
     * more information, see <i>Assumed threshold</i> in the Amazon Rekognition Custom Labels Developer Guide. Amazon
     * Rekognition Custom Labels metrics expresses an assumed threshold as a floating point value between 0-1. The range
     * of <code>MinConfidence</code> normalizes the threshold value to a percentage value (0-100). Confidence responses
     * from <code>DetectCustomLabels</code> are also returned as a percentage. You can use <code>MinConfidence</code> to
     * change the precision and recall or your model. For more information, see <i>Analyzing an image</i> in the Amazon
     * Rekognition Custom Labels Developer Guide.
     * </p>
     * <p>
     * If you don't specify a value for <code>MinConfidence</code>, <code>DetectCustomLabels</code> returns labels based
     * on the assumed threshold of each label.
     * </p>
     * <p>
     * This is a stateless API operation. That is, the operation does not persist any data.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DetectCustomLabels</code> action.
     * </p>
     * <p>
     * For more information, see <i>Analyzing an image</i> in the Amazon Rekognition Custom Labels Developer Guide.
     * </p>
     * 
     * @param detectCustomLabelsRequest
     * @return Result of the DetectCustomLabels operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws ResourceNotReadyException
     *         The requested resource isn't ready. For example, this exception occurs when you call
     *         <code>DetectCustomLabels</code> with a model version that isn't deployed.
     * @throws InvalidS3ObjectException
     *         Amazon Rekognition is unable to access the S3 object specified in the request.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws ImageTooLargeException
     *         The input image size exceeds the allowed limit. If you are calling DetectProtectiveEquipment, the image
     *         size or resolution exceeds the allowed limit. For more information, see Guidelines and quotas in Amazon
     *         Rekognition in the Amazon Rekognition Developer Guide.
     * @throws LimitExceededException
     *         An Amazon Rekognition service limit was exceeded. For example, if you start too many Amazon Rekognition
     *         Video jobs concurrently, calls to start operations (<code>StartLabelDetection</code>, for example) will
     *         raise a <code>LimitExceededException</code> exception (HTTP status code: 400) until the number of
     *         concurrently running jobs is below the Amazon Rekognition service limit.
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
     * @sample AmazonRekognition.DetectCustomLabels
     */
    @Override
    public DetectCustomLabelsResult detectCustomLabels(DetectCustomLabelsRequest request) {
        request = beforeClientExecution(request);
        return executeDetectCustomLabels(request);
    }

    @SdkInternalApi
    final DetectCustomLabelsResult executeDetectCustomLabels(DetectCustomLabelsRequest detectCustomLabelsRequest) {

        ExecutionContext executionContext = createExecutionContext(detectCustomLabelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectCustomLabelsRequest> request = null;
        Response<DetectCustomLabelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectCustomLabelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(detectCustomLabelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetectCustomLabels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetectCustomLabelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DetectCustomLabelsResultJsonUnmarshaller());
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
     * mouth), presence of beard, sunglasses, and so on.
     * </p>
     * <p>
     * The face-detection algorithm is most effective on frontal faces. For non-frontal or obscured faces, the algorithm
     * might not detect the faces or might detect faces with lower confidence.
     * </p>
     * <p>
     * You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3
     * bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The
     * image must be either a PNG or JPEG formatted file.
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
     *         The input image size exceeds the allowed limit. If you are calling DetectProtectiveEquipment, the image
     *         size or resolution exceeds the allowed limit. For more information, see Guidelines and quotas in Amazon
     *         Rekognition in the Amazon Rekognition Developer Guide.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * For an example, see Analyzing images stored in an Amazon S3 bucket in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * You pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If
     * you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must
     * be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * <b>Optional Parameters</b>
     * </p>
     * <p>
     * You can specify one or both of the <code>GENERAL_LABELS</code> and <code>IMAGE_PROPERTIES</code> feature types
     * when calling the DetectLabels API. Including <code>GENERAL_LABELS</code> will ensure the response includes the
     * labels detected in the input image, while including <code>IMAGE_PROPERTIES </code>will ensure the response
     * includes information about the image quality and color.
     * </p>
     * <p>
     * When using <code>GENERAL_LABELS</code> and/or <code>IMAGE_PROPERTIES</code> you can provide filtering criteria to
     * the Settings parameter. You can filter with sets of individual labels or with label categories. You can specify
     * inclusive filters, exclusive filters, or a combination of inclusive and exclusive filters. For more information
     * on filtering see <a
     * href="https://docs.aws.amazon.com/rekognition/latest/dg/labels-detect-labels-image.html">Detecting Labels in an
     * Image</a>.
     * </p>
     * <p>
     * You can specify <code>MinConfidence</code> to control the confidence threshold for the labels returned. The
     * default is 55%. You can also add the <code>MaxLabels</code> parameter to limit the number of labels returned. The
     * default and upper limit is 1000 labels.
     * </p>
     * <p>
     * <b>Response Elements</b>
     * </p>
     * <p>
     * For each object, scene, and concept the API returns one or more labels. The API returns the following types of
     * information regarding labels:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Name - The name of the detected label.
     * </p>
     * </li>
     * <li>
     * <p>
     * Confidence - The level of confidence in the label assigned to a detected object.
     * </p>
     * </li>
     * <li>
     * <p>
     * Parents - The ancestor labels for a detected label. DetectLabels returns a hierarchical taxonomy of detected
     * labels. For example, a detected car might be assigned the label car. The label car has two parent labels: Vehicle
     * (its parent) and Transportation (its grandparent). The response includes the all ancestors for a label, where
     * every ancestor is a unique label. In the previous example, Car, Vehicle, and Transportation are returned as
     * unique labels in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * Aliases - Possible Aliases for the label.
     * </p>
     * </li>
     * <li>
     * <p>
     * Categories - The label categories that the detected label belongs to.
     * </p>
     * </li>
     * <li>
     * <p>
     * BoundingBox — Bounding boxes are described for all instances of detected common object labels, returned in an
     * array of Instance objects. An Instance object contains a BoundingBox object, describing the location of the label
     * on the input image. It also includes the confidence for the accuracy of the detected bounding box.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The API returns the following information regarding the image, as part of the ImageProperties structure:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Quality - Information about the Sharpness, Brightness, and Contrast of the input image, scored between 0 to 100.
     * Image quality is returned for the entire image, as well as the background and the foreground.
     * </p>
     * </li>
     * <li>
     * <p>
     * Dominant Color - An array of the dominant colors in the image.
     * </p>
     * </li>
     * <li>
     * <p>
     * Foreground - Information about the sharpness, brightness, and dominant colors of the input image’s foreground.
     * </p>
     * </li>
     * <li>
     * <p>
     * Background - Information about the sharpness, brightness, and dominant colors of the input image’s background.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The list of returned labels will include at least one label for every detected object, along with information
     * about that label. In the following example, suppose the input image has a lighthouse, the sea, and a rock. The
     * response includes all three labels, one for each object, as well as the confidence in the label:
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
     * The list of labels can include multiple labels for the same object. For example, if the input image shows a
     * flower (for example, a tulip), the operation might return the following three labels.
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
     * <note>
     * <p>
     * If the object detected is a person, the operation doesn't provide the same facial details that the
     * <a>DetectFaces</a> operation provides.
     * </p>
     * </note>
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
     *         The input image size exceeds the allowed limit. If you are calling DetectProtectiveEquipment, the image
     *         size or resolution exceeds the allowed limit. For more information, see Guidelines and quotas in Amazon
     *         Rekognition in the Amazon Rekognition Developer Guide.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Detects unsafe content in a specified JPEG or PNG format image. Use <code>DetectModerationLabels</code> to
     * moderate images depending on your requirements. For example, you might want to filter images that contain nudity,
     * but not images containing suggestive content.
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
     *         The input image size exceeds the allowed limit. If you are calling DetectProtectiveEquipment, the image
     *         size or resolution exceeds the allowed limit. For more information, see Guidelines and quotas in Amazon
     *         Rekognition in the Amazon Rekognition Developer Guide.
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
     * @throws HumanLoopQuotaExceededException
     *         The number of in-progress human reviews you have has exceeded the number allowed.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Detects Personal Protective Equipment (PPE) worn by people detected in an image. Amazon Rekognition can detect
     * the following types of PPE.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Face cover
     * </p>
     * </li>
     * <li>
     * <p>
     * Hand cover
     * </p>
     * </li>
     * <li>
     * <p>
     * Head cover
     * </p>
     * </li>
     * </ul>
     * <p>
     * You pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. The
     * image must be either a PNG or JPG formatted file.
     * </p>
     * <p>
     * <code>DetectProtectiveEquipment</code> detects PPE worn by up to 15 persons detected in an image.
     * </p>
     * <p>
     * For each person detected in the image the API returns an array of body parts (face, head, left-hand, right-hand).
     * For each body part, an array of detected items of PPE is returned, including an indicator of whether or not the
     * PPE covers the body part. The API returns the confidence it has in each detection (person, PPE, body part and
     * body part coverage). It also returns a bounding box (<a>BoundingBox</a>) for each detected person and each
     * detected item of PPE.
     * </p>
     * <p>
     * You can optionally request a summary of detected PPE items with the <code>SummarizationAttributes</code> input
     * parameter. The summary provides the following information.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The persons detected as wearing all of the types of PPE that you specify.
     * </p>
     * </li>
     * <li>
     * <p>
     * The persons detected as not wearing all of the types PPE that you specify.
     * </p>
     * </li>
     * <li>
     * <p>
     * The persons detected where PPE adornment could not be determined.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This is a stateless API operation. That is, the operation does not persist any data.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DetectProtectiveEquipment</code> action.
     * </p>
     * 
     * @param detectProtectiveEquipmentRequest
     * @return Result of the DetectProtectiveEquipment operation returned by the service.
     * @throws InvalidS3ObjectException
     *         Amazon Rekognition is unable to access the S3 object specified in the request.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws ImageTooLargeException
     *         The input image size exceeds the allowed limit. If you are calling DetectProtectiveEquipment, the image
     *         size or resolution exceeds the allowed limit. For more information, see Guidelines and quotas in Amazon
     *         Rekognition in the Amazon Rekognition Developer Guide.
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
     * @sample AmazonRekognition.DetectProtectiveEquipment
     */
    @Override
    public DetectProtectiveEquipmentResult detectProtectiveEquipment(DetectProtectiveEquipmentRequest request) {
        request = beforeClientExecution(request);
        return executeDetectProtectiveEquipment(request);
    }

    @SdkInternalApi
    final DetectProtectiveEquipmentResult executeDetectProtectiveEquipment(DetectProtectiveEquipmentRequest detectProtectiveEquipmentRequest) {

        ExecutionContext executionContext = createExecutionContext(detectProtectiveEquipmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectProtectiveEquipmentRequest> request = null;
        Response<DetectProtectiveEquipmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectProtectiveEquipmentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(detectProtectiveEquipmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetectProtectiveEquipment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetectProtectiveEquipmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DetectProtectiveEquipmentResultJsonUnmarshaller());
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
     * A word is one or more script characters that are not separated by spaces. <code>DetectText</code> can detect up
     * to 100 words in an image.
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
     * For more information, see Detecting text in the Amazon Rekognition Developer Guide.
     * </p>
     * 
     * @param detectTextRequest
     * @return Result of the DetectText operation returned by the service.
     * @throws InvalidS3ObjectException
     *         Amazon Rekognition is unable to access the S3 object specified in the request.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws ImageTooLargeException
     *         The input image size exceeds the allowed limit. If you are calling DetectProtectiveEquipment, the image
     *         size or resolution exceeds the allowed limit. For more information, see Guidelines and quotas in Amazon
     *         Rekognition in the Amazon Rekognition Developer Guide.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Distributes the entries (images) in a training dataset across the training dataset and the test dataset for a
     * project. <code>DistributeDatasetEntries</code> moves 20% of the training dataset images to the test dataset. An
     * entry is a JSON Line that describes an image.
     * </p>
     * <p>
     * You supply the Amazon Resource Names (ARN) of a project's training dataset and test dataset. The training dataset
     * must contain the images that you want to split. The test dataset must be empty. The datasets must belong to the
     * same project. To create training and test datasets for a project, call <a>CreateDataset</a>.
     * </p>
     * <p>
     * Distributing a dataset takes a while to complete. To check the status call <code>DescribeDataset</code>. The
     * operation is complete when the <code>Status</code> field for the training dataset and the test dataset is
     * <code>UPDATE_COMPLETE</code>. If the dataset split fails, the value of <code>Status</code> is
     * <code>UPDATE_FAILED</code>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DistributeDatasetEntries</code> action.
     * </p>
     * 
     * @param distributeDatasetEntriesRequest
     * @return Result of the DistributeDatasetEntries operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
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
     * @throws ResourceNotReadyException
     *         The requested resource isn't ready. For example, this exception occurs when you call
     *         <code>DetectCustomLabels</code> with a model version that isn't deployed.
     * @sample AmazonRekognition.DistributeDatasetEntries
     */
    @Override
    public DistributeDatasetEntriesResult distributeDatasetEntries(DistributeDatasetEntriesRequest request) {
        request = beforeClientExecution(request);
        return executeDistributeDatasetEntries(request);
    }

    @SdkInternalApi
    final DistributeDatasetEntriesResult executeDistributeDatasetEntries(DistributeDatasetEntriesRequest distributeDatasetEntriesRequest) {

        ExecutionContext executionContext = createExecutionContext(distributeDatasetEntriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DistributeDatasetEntriesRequest> request = null;
        Response<DistributeDatasetEntriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DistributeDatasetEntriesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(distributeDatasetEntriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DistributeDatasetEntries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DistributeDatasetEntriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DistributeDatasetEntriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the name and additional information about a celebrity based on their Amazon Rekognition ID. The additional
     * information is returned as an array of URLs. If there is no additional information about the celebrity, this list
     * is empty.
     * </p>
     * <p>
     * For more information, see Getting information about a celebrity in the Amazon Rekognition Developer Guide.
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
     *         The resource specified in the request cannot be found.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * <a>StartCelebrityRecognition</a> which returns a job identifier (<code>JobId</code>).
     * </p>
     * <p>
     * When the celebrity recognition operation finishes, Amazon Rekognition Video publishes a completion status to the
     * Amazon Simple Notification Service topic registered in the initial call to <code>StartCelebrityRecognition</code>
     * . To get the results of the celebrity recognition analysis, first check that the status value published to the
     * Amazon SNS topic is <code>SUCCEEDED</code>. If so, call <code>GetCelebrityDetection</code> and pass the job
     * identifier (<code>JobId</code>) from the initial call to <code>StartCelebrityDetection</code>.
     * </p>
     * <p>
     * For more information, see Working With Stored Videos in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * <code>GetCelebrityRecognition</code> returns detected celebrities and the time(s) they are detected in an array (
     * <code>Celebrities</code>) of <a>CelebrityRecognition</a> objects. Each <code>CelebrityRecognition</code> contains
     * information about the celebrity in a <a>CelebrityDetail</a> object and the time, <code>Timestamp</code>, the
     * celebrity was detected. This <a>CelebrityDetail</a> object stores information about the detected celebrity's face
     * attributes, a face bounding box, known gender, the celebrity's name, and a confidence estimate.
     * </p>
     * <note>
     * <p>
     * <code>GetCelebrityRecognition</code> only returns the default facial attributes (<code>BoundingBox</code>,
     * <code>Confidence</code>, <code>Landmarks</code>, <code>Pose</code>, and <code>Quality</code>). The
     * <code>BoundingBox</code> field only applies to the detected face instance. The other facial attributes listed in
     * the <code>Face</code> object of the following response syntax are not returned. For more information, see
     * FaceDetail in the Amazon Rekognition Developer Guide.
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
     *         The resource specified in the request cannot be found.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Gets the inappropriate, unwanted, or offensive content analysis results for a Amazon Rekognition Video analysis
     * started by <a>StartContentModeration</a>. For a list of moderation labels in Amazon Rekognition, see <a
     * href="https://docs.aws.amazon.com/rekognition/latest/dg/moderation.html#moderation-api">Using the image and video
     * moderation APIs</a>.
     * </p>
     * <p>
     * Amazon Rekognition Video inappropriate or offensive content detection in a stored video is an asynchronous
     * operation. You start analysis by calling <a>StartContentModeration</a> which returns a job identifier (
     * <code>JobId</code>). When analysis finishes, Amazon Rekognition Video publishes a completion status to the Amazon
     * Simple Notification Service topic registered in the initial call to <code>StartContentModeration</code>. To get
     * the results of the content analysis, first check that the status value published to the Amazon SNS topic is
     * <code>SUCCEEDED</code>. If so, call <code>GetContentModeration</code> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartContentModeration</code>.
     * </p>
     * <p>
     * For more information, see Working with Stored Videos in the Amazon Rekognition Devlopers Guide.
     * </p>
     * <p>
     * <code>GetContentModeration</code> returns detected inappropriate, unwanted, or offensive content moderation
     * labels, and the time they are detected, in an array, <code>ModerationLabels</code>, of
     * <a>ContentModerationDetection</a> objects.
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
     * For more information, see moderating content in the Amazon Rekognition Developer Guide.
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
     *         The resource specified in the request cannot be found.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     *         The resource specified in the request cannot be found.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     *         The resource specified in the request cannot be found.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * <code>StartlabelDetection</code>.
     * </p>
     * <p>
     * To get the results of the label detection operation, first check that the status value published to the Amazon
     * SNS topic is <code>SUCCEEDED</code>. If so, call <a>GetLabelDetection</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartLabelDetection</code>.
     * </p>
     * <p>
     * <code>GetLabelDetection</code> returns an array of detected labels (<code>Labels</code>) sorted by the time the
     * labels were detected. You can also sort by the label name by specifying <code>NAME</code> for the
     * <code>SortBy</code> input parameter. If there is no <code>NAME</code> specified, the default sort is by
     * timestamp.
     * </p>
     * <p>
     * You can select how results are aggregated by using the <code>AggregateBy</code> input parameter. The default
     * aggregation method is <code>TIMESTAMPS</code>. You can also aggregate by <code>SEGMENTS</code>, which aggregates
     * all instances of labels detected in a given segment.
     * </p>
     * <p>
     * The returned Labels array may include the following attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Name - The name of the detected label.
     * </p>
     * </li>
     * <li>
     * <p>
     * Confidence - The level of confidence in the label assigned to a detected object.
     * </p>
     * </li>
     * <li>
     * <p>
     * Parents - The ancestor labels for a detected label. GetLabelDetection returns a hierarchical taxonomy of detected
     * labels. For example, a detected car might be assigned the label car. The label car has two parent labels: Vehicle
     * (its parent) and Transportation (its grandparent). The response includes the all ancestors for a label, where
     * every ancestor is a unique label. In the previous example, Car, Vehicle, and Transportation are returned as
     * unique labels in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * Aliases - Possible Aliases for the label.
     * </p>
     * </li>
     * <li>
     * <p>
     * Categories - The label categories that the detected label belongs to.
     * </p>
     * </li>
     * <li>
     * <p>
     * BoundingBox — Bounding boxes are described for all instances of detected common object labels, returned in an
     * array of Instance objects. An Instance object contains a BoundingBox object, describing the location of the label
     * on the input image. It also includes the confidence for the accuracy of the detected bounding box.
     * </p>
     * </li>
     * <li>
     * <p>
     * Timestamp - Time, in milliseconds from the start of the video, that the label was detected. For aggregation by
     * <code>SEGMENTS</code>, the <code>StartTimestampMillis</code>, <code>EndTimestampMillis</code>, and
     * <code>DurationMillis</code> structures are what define a segment. Although the “Timestamp” structure is still
     * returned with each label, its value is set to be the same as <code>StartTimestampMillis</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Timestamp and Bounding box information are returned for detected Instances, only if aggregation is done by
     * <code>TIMESTAMPS</code>. If aggregating by <code>SEGMENTS</code>, information about detected instances isn’t
     * returned.
     * </p>
     * <p>
     * The version of the label model used for the detection is also returned.
     * </p>
     * <p>
     * <b>Note <code>DominantColors</code> isn't returned for <code>Instances</code>, although it is shown as part of
     * the response in the sample seen below.</b>
     * </p>
     * <p>
     * Use <code>MaxResults</code> parameter to limit the number of labels returned. If there are more results than
     * specified in <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a
     * pagination token for getting the next set of results. To get the next page of results, call
     * <code>GetlabelDetection</code> and populate the <code>NextToken</code> request parameter with the token value
     * returned from the previous call to <code>GetLabelDetection</code>.
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
     *         The resource specified in the request cannot be found.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     *         The resource specified in the request cannot be found.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Gets the segment detection results of a Amazon Rekognition Video analysis started by
     * <a>StartSegmentDetection</a>.
     * </p>
     * <p>
     * Segment detection with Amazon Rekognition Video is an asynchronous operation. You start segment detection by
     * calling <a>StartSegmentDetection</a> which returns a job identifier (<code>JobId</code>). When the segment
     * detection operation finishes, Amazon Rekognition publishes a completion status to the Amazon Simple Notification
     * Service topic registered in the initial call to <code>StartSegmentDetection</code>. To get the results of the
     * segment detection operation, first check that the status value published to the Amazon SNS topic is
     * <code>SUCCEEDED</code>. if so, call <code>GetSegmentDetection</code> and pass the job identifier (
     * <code>JobId</code>) from the initial call of <code>StartSegmentDetection</code>.
     * </p>
     * <p>
     * <code>GetSegmentDetection</code> returns detected segments in an array (<code>Segments</code>) of
     * <a>SegmentDetection</a> objects. <code>Segments</code> is sorted by the segment types specified in the
     * <code>SegmentTypes</code> input parameter of <code>StartSegmentDetection</code>. Each element of the array
     * includes the detected segment, the precentage confidence in the acuracy of the detected segment, the type of the
     * segment, and the frame in which the segment was detected.
     * </p>
     * <p>
     * Use <code>SelectedSegmentTypes</code> to find out the type of segment detection requested in the call to
     * <code>StartSegmentDetection</code>.
     * </p>
     * <p>
     * Use the <code>MaxResults</code> parameter to limit the number of segment detections returned. If there are more
     * results than specified in <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response
     * contains a pagination token for getting the next set of results. To get the next page of results, call
     * <code>GetSegmentDetection</code> and populate the <code>NextToken</code> request parameter with the token value
     * returned from the previous call to <code>GetSegmentDetection</code>.
     * </p>
     * <p>
     * For more information, see Detecting video segments in stored video in the Amazon Rekognition Developer Guide.
     * </p>
     * 
     * @param getSegmentDetectionRequest
     * @return Result of the GetSegmentDetection operation returned by the service.
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
     *         The resource specified in the request cannot be found.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @sample AmazonRekognition.GetSegmentDetection
     */
    @Override
    public GetSegmentDetectionResult getSegmentDetection(GetSegmentDetectionRequest request) {
        request = beforeClientExecution(request);
        return executeGetSegmentDetection(request);
    }

    @SdkInternalApi
    final GetSegmentDetectionResult executeGetSegmentDetection(GetSegmentDetectionRequest getSegmentDetectionRequest) {

        ExecutionContext executionContext = createExecutionContext(getSegmentDetectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSegmentDetectionRequest> request = null;
        Response<GetSegmentDetectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSegmentDetectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSegmentDetectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSegmentDetection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSegmentDetectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSegmentDetectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the text detection results of a Amazon Rekognition Video analysis started by <a>StartTextDetection</a>.
     * </p>
     * <p>
     * Text detection with Amazon Rekognition Video is an asynchronous operation. You start text detection by calling
     * <a>StartTextDetection</a> which returns a job identifier (<code>JobId</code>) When the text detection operation
     * finishes, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic
     * registered in the initial call to <code>StartTextDetection</code>. To get the results of the text detection
     * operation, first check that the status value published to the Amazon SNS topic is <code>SUCCEEDED</code>. if so,
     * call <code>GetTextDetection</code> and pass the job identifier (<code>JobId</code>) from the initial call of
     * <code>StartLabelDetection</code>.
     * </p>
     * <p>
     * <code>GetTextDetection</code> returns an array of detected text (<code>TextDetections</code>) sorted by the time
     * the text was detected, up to 50 words per frame of video.
     * </p>
     * <p>
     * Each element of the array includes the detected text, the precentage confidence in the acuracy of the detected
     * text, the time the text was detected, bounding box information for where the text was located, and unique
     * identifiers for words and their lines.
     * </p>
     * <p>
     * Use MaxResults parameter to limit the number of text detections returned. If there are more results than
     * specified in <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a
     * pagination token for getting the next set of results. To get the next page of results, call
     * <code>GetTextDetection</code> and populate the <code>NextToken</code> request parameter with the token value
     * returned from the previous call to <code>GetTextDetection</code>.
     * </p>
     * 
     * @param getTextDetectionRequest
     * @return Result of the GetTextDetection operation returned by the service.
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
     *         The resource specified in the request cannot be found.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @sample AmazonRekognition.GetTextDetection
     */
    @Override
    public GetTextDetectionResult getTextDetection(GetTextDetectionRequest request) {
        request = beforeClientExecution(request);
        return executeGetTextDetection(request);
    }

    @SdkInternalApi
    final GetTextDetectionResult executeGetTextDetection(GetTextDetectionRequest getTextDetectionRequest) {

        ExecutionContext executionContext = createExecutionContext(getTextDetectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTextDetectionRequest> request = null;
        Response<GetTextDetectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTextDetectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTextDetectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTextDetection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTextDetectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTextDetectionResultJsonUnmarshaller());
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
     * For more information, see Adding faces to a collection in the Amazon Rekognition Developer Guide.
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
     * If you provide the optional <code>ExternalImageId</code> for the input image you provided, Amazon Rekognition
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
     * The <code>QualityFilter</code> input parameter allows you to filter out detected faces that don’t meet a required
     * quality bar. The quality bar is based on a variety of common use cases. By default, <code>IndexFaces</code>
     * chooses the quality bar that's used to filter faces. You can also explicitly choose the quality bar. Use
     * <code>QualityFilter</code>, to set the quality bar by specifying <code>LOW</code>, <code>MEDIUM</code>, or
     * <code>HIGH</code>. If you do not want to filter detected faces, specify <code>NONE</code>.
     * </p>
     * <note>
     * <p>
     * To use quality filtering, you need a collection associated with version 3 of the face model or higher. To get the
     * version of the face model associated with a collection, call <a>DescribeCollection</a>.
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
     * <li>
     * <p>
     * The face doesn’t have enough detail to be suitable for face search.
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
     * and other facial attributes. If you provide the same image, specify the same collection, and use the same
     * external ID in the <code>IndexFaces</code> operation, Amazon Rekognition doesn't save duplicate face metadata.
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
     *         The input image size exceeds the allowed limit. If you are calling DetectProtectiveEquipment, the image
     *         size or resolution exceeds the allowed limit. For more information, see Guidelines and quotas in Amazon
     *         Rekognition in the Amazon Rekognition Developer Guide.
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
     *         The resource specified in the request cannot be found.
     * @throws InvalidImageFormatException
     *         The provided image format is not supported.
     * @throws ServiceQuotaExceededException
     *         <p>
     *         The size of the collection exceeds the allowed limit. For more information, see Guidelines and quotas in
     *         Amazon Rekognition in the Amazon Rekognition Developer Guide.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * For an example, see Listing collections in the Amazon Rekognition Developer Guide.
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
     *         The resource specified in the request cannot be found.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Lists the entries (images) within a dataset. An entry is a JSON Line that contains the information for a single
     * image, including the image location, assigned labels, and object location bounding boxes. For more information,
     * see <a href="https://docs.aws.amazon.com/rekognition/latest/customlabels-dg/md-manifest-files.html">Creating a
     * manifest file</a>.
     * </p>
     * <p>
     * JSON Lines in the response include information about non-terminal errors found in the dataset. Non terminal
     * errors are reported in <code>errors</code> lists within each JSON Line. The same information is reported in the
     * training and testing validation result manifests that Amazon Rekognition Custom Labels creates during model
     * training.
     * </p>
     * <p>
     * You can filter the response in variety of ways, such as choosing which labels to return and returning JSON Lines
     * created after a specific date.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:ListDatasetEntries</code> action.
     * </p>
     * 
     * @param listDatasetEntriesRequest
     * @return Result of the ListDatasetEntries operation returned by the service.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws ResourceInUseException
     *         The specified resource is already being used.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws InvalidPaginationTokenException
     *         Pagination token in the request is not valid.
     * @throws ResourceNotReadyException
     *         The requested resource isn't ready. For example, this exception occurs when you call
     *         <code>DetectCustomLabels</code> with a model version that isn't deployed.
     * @sample AmazonRekognition.ListDatasetEntries
     */
    @Override
    public ListDatasetEntriesResult listDatasetEntries(ListDatasetEntriesRequest request) {
        request = beforeClientExecution(request);
        return executeListDatasetEntries(request);
    }

    @SdkInternalApi
    final ListDatasetEntriesResult executeListDatasetEntries(ListDatasetEntriesRequest listDatasetEntriesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDatasetEntriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDatasetEntriesRequest> request = null;
        Response<ListDatasetEntriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDatasetEntriesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDatasetEntriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDatasetEntries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDatasetEntriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDatasetEntriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the labels in a dataset. Amazon Rekognition Custom Labels uses labels to describe images. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/rekognition/latest/customlabels-dg/md-labeling-images.html">Labeling
     * images</a>.
     * </p>
     * <p>
     * Lists the labels in a dataset. Amazon Rekognition Custom Labels uses labels to describe images. For more
     * information, see Labeling images in the <i>Amazon Rekognition Custom Labels Developer Guide</i>.
     * </p>
     * 
     * @param listDatasetLabelsRequest
     * @return Result of the ListDatasetLabels operation returned by the service.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws ResourceInUseException
     *         The specified resource is already being used.
     * @throws InvalidPaginationTokenException
     *         Pagination token in the request is not valid.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws ResourceNotReadyException
     *         The requested resource isn't ready. For example, this exception occurs when you call
     *         <code>DetectCustomLabels</code> with a model version that isn't deployed.
     * @sample AmazonRekognition.ListDatasetLabels
     */
    @Override
    public ListDatasetLabelsResult listDatasetLabels(ListDatasetLabelsRequest request) {
        request = beforeClientExecution(request);
        return executeListDatasetLabels(request);
    }

    @SdkInternalApi
    final ListDatasetLabelsResult executeListDatasetLabels(ListDatasetLabelsRequest listDatasetLabelsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDatasetLabelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDatasetLabelsRequest> request = null;
        Response<ListDatasetLabelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDatasetLabelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDatasetLabelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDatasetLabels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDatasetLabelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDatasetLabelsResultJsonUnmarshaller());
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
     *         The resource specified in the request cannot be found.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Gets a list of the project policies attached to a project.
     * </p>
     * <p>
     * To attach a project policy to a project, call <a>PutProjectPolicy</a>. To remove a project policy from a project,
     * call <a>DeleteProjectPolicy</a>.
     * </p>
     * 
     * @param listProjectPoliciesRequest
     * @return Result of the ListProjectPolicies operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws InvalidPaginationTokenException
     *         Pagination token in the request is not valid.
     * @sample AmazonRekognition.ListProjectPolicies
     */
    @Override
    public ListProjectPoliciesResult listProjectPolicies(ListProjectPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeListProjectPolicies(request);
    }

    @SdkInternalApi
    final ListProjectPoliciesResult executeListProjectPolicies(ListProjectPoliciesRequest listProjectPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(listProjectPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProjectPoliciesRequest> request = null;
        Response<ListProjectPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProjectPoliciesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProjectPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProjectPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProjectPoliciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListProjectPoliciesResultJsonUnmarshaller());
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Returns a list of tags in an Amazon Rekognition collection, stream processor, or Custom Labels model.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:ListTagsForResource</code> action.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
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
     * @sample AmazonRekognition.ListTagsForResource
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
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
     * Attaches a project policy to a Amazon Rekognition Custom Labels project in a trusting AWS account. A project
     * policy specifies that a trusted AWS account can copy a model version from a trusting AWS account to a project in
     * the trusted AWS account. To copy a model version you use the <a>CopyProjectVersion</a> operation.
     * </p>
     * <p>
     * For more information about the format of a project policy document, see Attaching a project policy (SDK) in the
     * <i>Amazon Rekognition Custom Labels Developer Guide</i>.
     * </p>
     * <p>
     * The response from <code>PutProjectPolicy</code> is a revision ID for the project policy. You can attach multiple
     * project policies to a project. You can also update an existing project policy by specifying the policy revision
     * ID of the existing policy.
     * </p>
     * <p>
     * To remove a project policy from a project, call <a>DeleteProjectPolicy</a>. To get a list of project policies
     * attached to a project, call <a>ListProjectPolicies</a>.
     * </p>
     * <p>
     * You copy a model version by calling <a>CopyProjectVersion</a>.
     * </p>
     * 
     * @param putProjectPolicyRequest
     * @return Result of the PutProjectPolicy operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws InvalidPolicyRevisionIdException
     *         The supplied revision id for the project policy is invalid.
     * @throws MalformedPolicyDocumentException
     *         The format of the project policy document that you supplied to <code>PutProjectPolicy</code> is
     *         incorrect.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws ResourceAlreadyExistsException
     *         A resource with the specified ID already exists.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws ServiceQuotaExceededException
     *         <p>
     *         The size of the collection exceeds the allowed limit. For more information, see Guidelines and quotas in
     *         Amazon Rekognition in the Amazon Rekognition Developer Guide.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws LimitExceededException
     *         An Amazon Rekognition service limit was exceeded. For example, if you start too many Amazon Rekognition
     *         Video jobs concurrently, calls to start operations (<code>StartLabelDetection</code>, for example) will
     *         raise a <code>LimitExceededException</code> exception (HTTP status code: 400) until the number of
     *         concurrently running jobs is below the Amazon Rekognition service limit.
     * @sample AmazonRekognition.PutProjectPolicy
     */
    @Override
    public PutProjectPolicyResult putProjectPolicy(PutProjectPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutProjectPolicy(request);
    }

    @SdkInternalApi
    final PutProjectPolicyResult executePutProjectPolicy(PutProjectPolicyRequest putProjectPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putProjectPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutProjectPolicyRequest> request = null;
        Response<PutProjectPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutProjectPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putProjectPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutProjectPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutProjectPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutProjectPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of celebrities recognized in the input image. For more information, see Recognizing celebrities
     * in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * <code>RecognizeCelebrities</code> returns the 64 largest faces in the image. It lists the recognized celebrities
     * in the <code>CelebrityFaces</code> array and any unrecognized faces in the <code>UnrecognizedFaces</code> array.
     * <code>RecognizeCelebrities</code> doesn't return celebrities whose faces aren't among the largest 64 faces in the
     * image.
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
     * For an example, see Recognizing celebrities in an image in the Amazon Rekognition Developer Guide.
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
     *         The input image size exceeds the allowed limit. If you are calling DetectProtectiveEquipment, the image
     *         size or resolution exceeds the allowed limit. For more information, see Guidelines and quotas in Amazon
     *         Rekognition in the Amazon Rekognition Developer Guide.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * For an example, see Searching for a face using its face ID in the Amazon Rekognition Developer Guide.
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
     *         The resource specified in the request cannot be found.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * If no faces are detected in the input image, <code>SearchFacesByImage</code> returns an
     * <code>InvalidParameterException</code> error.
     * </p>
     * <p>
     * For an example, Searching for a Face Using an Image in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * The <code>QualityFilter</code> input parameter allows you to filter out detected faces that don’t meet a required
     * quality bar. The quality bar is based on a variety of common use cases. Use <code>QualityFilter</code> to set the
     * quality bar for filtering by specifying <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>. If you do
     * not want to filter detected faces, specify <code>NONE</code>. The default value is <code>NONE</code>.
     * </p>
     * <note>
     * <p>
     * To use quality filtering, you need a collection associated with version 3 of the face model or higher. To get the
     * version of the face model associated with a collection, call <a>DescribeCollection</a>.
     * </p>
     * </note>
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
     *         The input image size exceeds the allowed limit. If you are calling DetectProtectiveEquipment, the image
     *         size or resolution exceeds the allowed limit. For more information, see Guidelines and quotas in Amazon
     *         Rekognition in the Amazon Rekognition Developer Guide.
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
     *         The resource specified in the request cannot be found.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * For more information, see Recognizing celebrities in the Amazon Rekognition Developer Guide.
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
     *         The file size or duration of the supplied media is too large. The maximum file size is 10GB. The maximum
     *         duration is 6 hours.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Starts asynchronous detection of inappropriate, unwanted, or offensive content in a stored video. For a list of
     * moderation labels in Amazon Rekognition, see <a
     * href="https://docs.aws.amazon.com/rekognition/latest/dg/moderation.html#moderation-api">Using the image and video
     * moderation APIs</a>.
     * </p>
     * <p>
     * Amazon Rekognition Video can moderate content in a video stored in an Amazon S3 bucket. Use <a>Video</a> to
     * specify the bucket name and the filename of the video. <code>StartContentModeration</code> returns a job
     * identifier (<code>JobId</code>) which you use to get the results of the analysis. When content analysis is
     * finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic
     * that you specify in <code>NotificationChannel</code>.
     * </p>
     * <p>
     * To get the results of the content analysis, first check that the status value published to the Amazon SNS topic
     * is <code>SUCCEEDED</code>. If so, call <a>GetContentModeration</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartContentModeration</code>.
     * </p>
     * <p>
     * For more information, see Moderating content in the Amazon Rekognition Developer Guide.
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
     *         The file size or duration of the supplied media is too large. The maximum file size is 10GB. The maximum
     *         duration is 6 hours.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * For more information, see Detecting faces in a stored video in the Amazon Rekognition Developer Guide.
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
     *         The file size or duration of the supplied media is too large. The maximum file size is 10GB. The maximum
     *         duration is 6 hours.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * <code>JobId</code>) from the initial call to <code>StartFaceSearch</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/rekognition/latest/dg/procedure-person-search-videos.html">Searching stored
     * videos for faces</a>.
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
     *         The file size or duration of the supplied media is too large. The maximum file size is 10GB. The maximum
     *         duration is 6 hours.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws LimitExceededException
     *         An Amazon Rekognition service limit was exceeded. For example, if you start too many Amazon Rekognition
     *         Video jobs concurrently, calls to start operations (<code>StartLabelDetection</code>, for example) will
     *         raise a <code>LimitExceededException</code> exception (HTTP status code: 400) until the number of
     *         concurrently running jobs is below the Amazon Rekognition service limit.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * <p>
     * <i>Optional Parameters</i>
     * </p>
     * <p>
     * <code>StartLabelDetection</code> has the <code>GENERAL_LABELS</code> Feature applied by default. This feature
     * allows you to provide filtering criteria to the <code>Settings</code> parameter. You can filter with sets of
     * individual labels or with label categories. You can specify inclusive filters, exclusive filters, or a
     * combination of inclusive and exclusive filters. For more information on filtering, see <a
     * href="https://docs.aws.amazon.com/rekognition/latest/dg/labels-detecting-labels-video.html">Detecting labels in a
     * video</a>.
     * </p>
     * <p>
     * You can specify <code>MinConfidence</code> to control the confidence threshold for the labels returned. The
     * default is 50.
     * </p>
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
     *         The file size or duration of the supplied media is too large. The maximum file size is 10GB. The maximum
     *         duration is 6 hours.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     *         The file size or duration of the supplied media is too large. The maximum file size is 10GB. The maximum
     *         duration is 6 hours.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Starts the running of the version of a model. Starting a model takes a while to complete. To check the current
     * state of the model, use <a>DescribeProjectVersions</a>.
     * </p>
     * <p>
     * Once the model is running, you can detect custom labels in new images by calling <a>DetectCustomLabels</a>.
     * </p>
     * <note>
     * <p>
     * You are charged for the amount of time that the model is running. To stop a running model, call
     * <a>StopProjectVersion</a>.
     * </p>
     * </note>
     * <p>
     * For more information, see <i>Running a trained Amazon Rekognition Custom Labels model</i> in the Amazon
     * Rekognition Custom Labels Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:StartProjectVersion</code> action.
     * </p>
     * 
     * @param startProjectVersionRequest
     * @return Result of the StartProjectVersion operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws ResourceInUseException
     *         The specified resource is already being used.
     * @throws LimitExceededException
     *         An Amazon Rekognition service limit was exceeded. For example, if you start too many Amazon Rekognition
     *         Video jobs concurrently, calls to start operations (<code>StartLabelDetection</code>, for example) will
     *         raise a <code>LimitExceededException</code> exception (HTTP status code: 400) until the number of
     *         concurrently running jobs is below the Amazon Rekognition service limit.
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
     * @sample AmazonRekognition.StartProjectVersion
     */
    @Override
    public StartProjectVersionResult startProjectVersion(StartProjectVersionRequest request) {
        request = beforeClientExecution(request);
        return executeStartProjectVersion(request);
    }

    @SdkInternalApi
    final StartProjectVersionResult executeStartProjectVersion(StartProjectVersionRequest startProjectVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(startProjectVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartProjectVersionRequest> request = null;
        Response<StartProjectVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartProjectVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startProjectVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartProjectVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartProjectVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartProjectVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts asynchronous detection of segment detection in a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can detect segments in a video stored in an Amazon S3 bucket. Use <a>Video</a> to
     * specify the bucket name and the filename of the video. <code>StartSegmentDetection</code> returns a job
     * identifier (<code>JobId</code>) which you use to get the results of the operation. When segment detection is
     * finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic
     * that you specify in <code>NotificationChannel</code>.
     * </p>
     * <p>
     * You can use the <code>Filters</code> (<a>StartSegmentDetectionFilters</a>) input parameter to specify the minimum
     * detection confidence returned in the response. Within <code>Filters</code>, use <code>ShotFilter</code>
     * (<a>StartShotDetectionFilter</a>) to filter detected shots. Use <code>TechnicalCueFilter</code>
     * (<a>StartTechnicalCueDetectionFilter</a>) to filter technical cues.
     * </p>
     * <p>
     * To get the results of the segment detection operation, first check that the status value published to the Amazon
     * SNS topic is <code>SUCCEEDED</code>. if so, call <a>GetSegmentDetection</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartSegmentDetection</code>.
     * </p>
     * <p>
     * For more information, see Detecting video segments in stored video in the Amazon Rekognition Developer Guide.
     * </p>
     * 
     * @param startSegmentDetectionRequest
     * @return Result of the StartSegmentDetection operation returned by the service.
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
     *         The file size or duration of the supplied media is too large. The maximum file size is 10GB. The maximum
     *         duration is 6 hours.
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
     * @sample AmazonRekognition.StartSegmentDetection
     */
    @Override
    public StartSegmentDetectionResult startSegmentDetection(StartSegmentDetectionRequest request) {
        request = beforeClientExecution(request);
        return executeStartSegmentDetection(request);
    }

    @SdkInternalApi
    final StartSegmentDetectionResult executeStartSegmentDetection(StartSegmentDetectionRequest startSegmentDetectionRequest) {

        ExecutionContext executionContext = createExecutionContext(startSegmentDetectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartSegmentDetectionRequest> request = null;
        Response<StartSegmentDetectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartSegmentDetectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startSegmentDetectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartSegmentDetection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartSegmentDetectionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StartSegmentDetectionResultJsonUnmarshaller());
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
     * <p>
     * If you are using a label detection stream processor to detect labels, you need to provide a
     * <code>Start selector</code> and a <code>Stop selector</code> to determine the length of the stream processing
     * time.
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
     *         The resource specified in the request cannot be found.
     * @throws ResourceInUseException
     *         The specified resource is already being used.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Starts asynchronous detection of text in a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can detect text in a video stored in an Amazon S3 bucket. Use <a>Video</a> to specify
     * the bucket name and the filename of the video. <code>StartTextDetection</code> returns a job identifier (
     * <code>JobId</code>) which you use to get the results of the operation. When text detection is finished, Amazon
     * Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify
     * in <code>NotificationChannel</code>.
     * </p>
     * <p>
     * To get the results of the text detection operation, first check that the status value published to the Amazon SNS
     * topic is <code>SUCCEEDED</code>. if so, call <a>GetTextDetection</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartTextDetection</code>.
     * </p>
     * 
     * @param startTextDetectionRequest
     * @return Result of the StartTextDetection operation returned by the service.
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
     *         The file size or duration of the supplied media is too large. The maximum file size is 10GB. The maximum
     *         duration is 6 hours.
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
     * @sample AmazonRekognition.StartTextDetection
     */
    @Override
    public StartTextDetectionResult startTextDetection(StartTextDetectionRequest request) {
        request = beforeClientExecution(request);
        return executeStartTextDetection(request);
    }

    @SdkInternalApi
    final StartTextDetectionResult executeStartTextDetection(StartTextDetectionRequest startTextDetectionRequest) {

        ExecutionContext executionContext = createExecutionContext(startTextDetectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartTextDetectionRequest> request = null;
        Response<StartTextDetectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartTextDetectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startTextDetectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartTextDetection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartTextDetectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartTextDetectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a running model. The operation might take a while to complete. To check the current status, call
     * <a>DescribeProjectVersions</a>.
     * </p>
     * 
     * @param stopProjectVersionRequest
     * @return Result of the StopProjectVersion operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws ResourceInUseException
     *         The specified resource is already being used.
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
     * @sample AmazonRekognition.StopProjectVersion
     */
    @Override
    public StopProjectVersionResult stopProjectVersion(StopProjectVersionRequest request) {
        request = beforeClientExecution(request);
        return executeStopProjectVersion(request);
    }

    @SdkInternalApi
    final StopProjectVersionResult executeStopProjectVersion(StopProjectVersionRequest stopProjectVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(stopProjectVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopProjectVersionRequest> request = null;
        Response<StopProjectVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopProjectVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopProjectVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopProjectVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopProjectVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopProjectVersionResultJsonUnmarshaller());
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
     *         The resource specified in the request cannot be found.
     * @throws ResourceInUseException
     *         The specified resource is already being used.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * <p>
     * Adds one or more key-value tags to an Amazon Rekognition collection, stream processor, or Custom Labels model.
     * For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS
     * Resources</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:TagResource</code> action.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws ServiceQuotaExceededException
     *         <p>
     *         The size of the collection exceeds the allowed limit. For more information, see Guidelines and quotas in
     *         Amazon Rekognition in the Amazon Rekognition Developer Guide.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @sample AmazonRekognition.TagResource
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
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
     * Removes one or more tags from an Amazon Rekognition collection, stream processor, or Custom Labels model.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:UntagResource</code> action.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
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
     * @sample AmazonRekognition.UntagResource
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
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
     * Adds or updates one or more entries (images) in a dataset. An entry is a JSON Line which contains the information
     * for a single image, including the image location, assigned labels, and object location bounding boxes. For more
     * information, see Image-Level labels in manifest files and Object localization in manifest files in the <i>Amazon
     * Rekognition Custom Labels Developer Guide</i>.
     * </p>
     * <p>
     * If the <code>source-ref</code> field in the JSON line references an existing image, the existing image in the
     * dataset is updated. If <code>source-ref</code> field doesn't reference an existing image, the image is added as a
     * new image to the dataset.
     * </p>
     * <p>
     * You specify the changes that you want to make in the <code>Changes</code> input parameter. There isn't a limit to
     * the number JSON Lines that you can change, but the size of <code>Changes</code> must be less than 5MB.
     * </p>
     * <p>
     * <code>UpdateDatasetEntries</code> returns immediatly, but the dataset update might take a while to complete. Use
     * <a>DescribeDataset</a> to check the current status. The dataset updated successfully if the value of
     * <code>Status</code> is <code>UPDATE_COMPLETE</code>.
     * </p>
     * <p>
     * To check if any non-terminal errors occured, call <a>ListDatasetEntries</a> and check for the presence of
     * <code>errors</code> lists in the JSON Lines.
     * </p>
     * <p>
     * Dataset update fails if a terminal error occurs (<code>Status</code> = <code>UPDATE_FAILED</code>). Currently,
     * you can't access the terminal error information from the Amazon Rekognition Custom Labels SDK.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:UpdateDatasetEntries</code> action.
     * </p>
     * 
     * @param updateDatasetEntriesRequest
     * @return Result of the UpdateDatasetEntries operation returned by the service.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws LimitExceededException
     *         An Amazon Rekognition service limit was exceeded. For example, if you start too many Amazon Rekognition
     *         Video jobs concurrently, calls to start operations (<code>StartLabelDetection</code>, for example) will
     *         raise a <code>LimitExceededException</code> exception (HTTP status code: 400) until the number of
     *         concurrently running jobs is below the Amazon Rekognition service limit.
     * @throws ResourceInUseException
     *         The specified resource is already being used.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @sample AmazonRekognition.UpdateDatasetEntries
     */
    @Override
    public UpdateDatasetEntriesResult updateDatasetEntries(UpdateDatasetEntriesRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDatasetEntries(request);
    }

    @SdkInternalApi
    final UpdateDatasetEntriesResult executeUpdateDatasetEntries(UpdateDatasetEntriesRequest updateDatasetEntriesRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDatasetEntriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDatasetEntriesRequest> request = null;
        Response<UpdateDatasetEntriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDatasetEntriesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDatasetEntriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDatasetEntries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDatasetEntriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDatasetEntriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows you to update a stream processor. You can change some settings and regions of interest and delete certain
     * parameters.
     * </p>
     * 
     * @param updateStreamProcessorRequest
     * @return Result of the UpdateStreamProcessor operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerErrorException
     *         Amazon Rekognition experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Rekognition is temporarily unable to process the request. Try your call again.
     * @throws InvalidParameterException
     *         Input parameter violated a constraint. Validate your parameter before calling the API operation again.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Rekognition.
     * @sample AmazonRekognition.UpdateStreamProcessor
     */
    @Override
    public UpdateStreamProcessorResult updateStreamProcessor(UpdateStreamProcessorRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateStreamProcessor(request);
    }

    @SdkInternalApi
    final UpdateStreamProcessorResult executeUpdateStreamProcessor(UpdateStreamProcessorRequest updateStreamProcessorRequest) {

        ExecutionContext executionContext = createExecutionContext(updateStreamProcessorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStreamProcessorRequest> request = null;
        Response<UpdateStreamProcessorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateStreamProcessorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateStreamProcessorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Rekognition");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateStreamProcessor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateStreamProcessorResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateStreamProcessorResultJsonUnmarshaller());
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
    public AmazonRekognitionWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AmazonRekognitionWaiters(this);
                }
            }
        }
        return waiters;
    }

    @Override
    public void shutdown() {
        super.shutdown();
        if (waiters != null) {
            waiters.shutdown();
        }
    }

}
