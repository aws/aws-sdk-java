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
package com.amazonaws.services.ecr;

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

import com.amazonaws.services.ecr.model.*;
import com.amazonaws.services.ecr.model.transform.*;

/**
 * Client for accessing Amazon ECR. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * Amazon EC2 Container Registry (Amazon ECR) is a managed AWS Docker registry service. Customers can use the familiar
 * Docker CLI to push, pull, and manage images. Amazon ECR provides a secure, scalable, and reliable registry. Amazon
 * ECR supports private Docker repositories with resource-based permissions using AWS IAM so that specific users or
 * Amazon EC2 instances can access repositories and images. Developers can use the Docker CLI to author and manage
 * images.
 * </p>
 */
@ThreadSafe
public class AmazonECRClient extends AmazonWebServiceClient implements AmazonECR {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonECR.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "ecr";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(new JsonClientMetadata()
            .withProtocolVersion("1.1")
            .withSupportsCbor(false)
            .withSupportsIon(false)
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("LayerPartTooSmallException").withModeledClass(
                            com.amazonaws.services.ecr.model.LayerPartTooSmallException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidLayerPartException").withModeledClass(
                            com.amazonaws.services.ecr.model.InvalidLayerPartException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withModeledClass(
                            com.amazonaws.services.ecr.model.InvalidParameterException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ServerException").withModeledClass(com.amazonaws.services.ecr.model.ServerException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("RepositoryNotEmptyException").withModeledClass(
                            com.amazonaws.services.ecr.model.RepositoryNotEmptyException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("LayerAlreadyExistsException").withModeledClass(
                            com.amazonaws.services.ecr.model.LayerAlreadyExistsException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("EmptyUploadException").withModeledClass(
                            com.amazonaws.services.ecr.model.EmptyUploadException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ImageNotFoundException").withModeledClass(
                            com.amazonaws.services.ecr.model.ImageNotFoundException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("LayersNotFoundException").withModeledClass(
                            com.amazonaws.services.ecr.model.LayersNotFoundException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidLayerException").withModeledClass(
                            com.amazonaws.services.ecr.model.InvalidLayerException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("RepositoryNotFoundException").withModeledClass(
                            com.amazonaws.services.ecr.model.RepositoryNotFoundException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("RepositoryAlreadyExistsException").withModeledClass(
                            com.amazonaws.services.ecr.model.RepositoryAlreadyExistsException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("RepositoryPolicyNotFoundException").withModeledClass(
                            com.amazonaws.services.ecr.model.RepositoryPolicyNotFoundException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ImageAlreadyExistsException").withModeledClass(
                            com.amazonaws.services.ecr.model.ImageAlreadyExistsException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("LayerInaccessibleException").withModeledClass(
                            com.amazonaws.services.ecr.model.LayerInaccessibleException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                            com.amazonaws.services.ecr.model.LimitExceededException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("UploadNotFoundException").withModeledClass(
                            com.amazonaws.services.ecr.model.UploadNotFoundException.class))
            .withBaseServiceExceptionClass(com.amazonaws.services.ecr.model.AmazonECRException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon ECR. A credentials provider chain will be used that
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
    public AmazonECRClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ECR. A credentials provider chain will be used that
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
     *        The client configuration options controlling how this client connects to Amazon ECR (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonECRClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ECR using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     */
    public AmazonECRClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ECR using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon ECR (ex: proxy settings,
     *        retry counts, etc.).
     */
    public AmazonECRClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ECR using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     */
    public AmazonECRClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ECR using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon ECR (ex: proxy settings,
     *        retry counts, etc.).
     */
    public AmazonECRClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ECR using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon ECR (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AmazonECRClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ECR using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonECRClient(AwsSyncClientParams clientParams) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("ecr.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/ecr/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/ecr/request.handler2s"));
    }

    /**
     * <p>
     * Check the availability of multiple image layers in a specified registry and repository.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers. Use the
     * <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param batchCheckLayerAvailabilityRequest
     * @return Result of the BatchCheckLayerAvailability operation returned by the service.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @sample AmazonECR.BatchCheckLayerAvailability
     */
    @Override
    public BatchCheckLayerAvailabilityResult batchCheckLayerAvailability(BatchCheckLayerAvailabilityRequest batchCheckLayerAvailabilityRequest) {
        ExecutionContext executionContext = createExecutionContext(batchCheckLayerAvailabilityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchCheckLayerAvailabilityRequest> request = null;
        Response<BatchCheckLayerAvailabilityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchCheckLayerAvailabilityRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchCheckLayerAvailabilityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchCheckLayerAvailabilityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchCheckLayerAvailabilityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a list of specified images within a specified repository. Images are specified with either
     * <code>imageTag</code> or <code>imageDigest</code>.
     * </p>
     * 
     * @param batchDeleteImageRequest
     *        Deletes specified images within a specified repository. Images are specified with either the
     *        <code>imageTag</code> or <code>imageDigest</code>.
     * @return Result of the BatchDeleteImage operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @sample AmazonECR.BatchDeleteImage
     */
    @Override
    public BatchDeleteImageResult batchDeleteImage(BatchDeleteImageRequest batchDeleteImageRequest) {
        ExecutionContext executionContext = createExecutionContext(batchDeleteImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeleteImageRequest> request = null;
        Response<BatchDeleteImageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeleteImageRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchDeleteImageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDeleteImageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchDeleteImageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets detailed information for specified images within a specified repository. Images are specified with either
     * <code>imageTag</code> or <code>imageDigest</code>.
     * </p>
     * 
     * @param batchGetImageRequest
     * @return Result of the BatchGetImage operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @sample AmazonECR.BatchGetImage
     */
    @Override
    public BatchGetImageResult batchGetImage(BatchGetImageRequest batchGetImageRequest) {
        ExecutionContext executionContext = createExecutionContext(batchGetImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetImageRequest> request = null;
        Response<BatchGetImageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetImageRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetImageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetImageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchGetImageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Inform Amazon ECR that the image layer upload for a specified registry, repository name, and upload ID, has
     * completed. You can optionally provide a <code>sha256</code> digest of the image layer for data validation
     * purposes.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers. Use the
     * <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param completeLayerUploadRequest
     * @return Result of the CompleteLayerUpload operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @throws UploadNotFoundException
     *         The upload could not be found, or the specified upload id is not valid for this repository.
     * @throws InvalidLayerException
     *         The layer digest calculation performed by Amazon ECR upon receipt of the image layer does not match the
     *         digest specified.
     * @throws LayerPartTooSmallException
     *         Layer parts must be at least 5 MiB in size.
     * @throws LayerAlreadyExistsException
     *         The image layer already exists in the associated repository.
     * @throws EmptyUploadException
     *         The specified layer upload does not contain any layer parts.
     * @sample AmazonECR.CompleteLayerUpload
     */
    @Override
    public CompleteLayerUploadResult completeLayerUpload(CompleteLayerUploadRequest completeLayerUploadRequest) {
        ExecutionContext executionContext = createExecutionContext(completeLayerUploadRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CompleteLayerUploadRequest> request = null;
        Response<CompleteLayerUploadResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CompleteLayerUploadRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(completeLayerUploadRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CompleteLayerUploadResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CompleteLayerUploadResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an image repository.
     * </p>
     * 
     * @param createRepositoryRequest
     * @return Result of the CreateRepository operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryAlreadyExistsException
     *         The specified repository already exists in the specified registry.
     * @throws LimitExceededException
     *         The operation did not succeed because it would have exceeded a service limit for your account. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AmazonECR/latest/userguide/service_limits.html">Amazon ECR Default
     *         Service Limits</a> in the Amazon EC2 Container Registry User Guide.
     * @sample AmazonECR.CreateRepository
     */
    @Override
    public CreateRepositoryResult createRepository(CreateRepositoryRequest createRepositoryRequest) {
        ExecutionContext executionContext = createExecutionContext(createRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRepositoryRequest> request = null;
        Response<CreateRepositoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRepositoryRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRepositoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRepositoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRepositoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing image repository. If a repository contains images, you must use the <code>force</code> option
     * to delete it.
     * </p>
     * 
     * @param deleteRepositoryRequest
     * @return Result of the DeleteRepository operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @throws RepositoryNotEmptyException
     *         The specified repository contains images. To delete a repository that contains images, you must force the
     *         deletion with the <code>force</code> parameter.
     * @sample AmazonECR.DeleteRepository
     */
    @Override
    public DeleteRepositoryResult deleteRepository(DeleteRepositoryRequest deleteRepositoryRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRepositoryRequest> request = null;
        Response<DeleteRepositoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRepositoryRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRepositoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRepositoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRepositoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the repository policy from a specified repository.
     * </p>
     * 
     * @param deleteRepositoryPolicyRequest
     * @return Result of the DeleteRepositoryPolicy operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @throws RepositoryPolicyNotFoundException
     *         The specified repository and registry combination does not have an associated repository policy.
     * @sample AmazonECR.DeleteRepositoryPolicy
     */
    @Override
    public DeleteRepositoryPolicyResult deleteRepositoryPolicy(DeleteRepositoryPolicyRequest deleteRepositoryPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteRepositoryPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRepositoryPolicyRequest> request = null;
        Response<DeleteRepositoryPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRepositoryPolicyRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRepositoryPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRepositoryPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteRepositoryPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns metadata about the images in a repository, including image size and creation date.
     * </p>
     * <note>
     * <p>
     * Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker
     * registry. The output of the <code>docker images</code> command shows the uncompressed image size, so it may
     * return a larger image size than the image sizes returned by <a>DescribeImages</a>.
     * </p>
     * </note>
     * 
     * @param describeImagesRequest
     * @return Result of the DescribeImages operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @throws ImageNotFoundException
     *         The image requested does not exist in the specified repository.
     * @sample AmazonECR.DescribeImages
     */
    @Override
    public DescribeImagesResult describeImages(DescribeImagesRequest describeImagesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeImagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeImagesRequest> request = null;
        Response<DescribeImagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeImagesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeImagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeImagesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeImagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes image repositories in a registry.
     * </p>
     * 
     * @param describeRepositoriesRequest
     * @return Result of the DescribeRepositories operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @sample AmazonECR.DescribeRepositories
     */
    @Override
    public DescribeRepositoriesResult describeRepositories(DescribeRepositoriesRequest describeRepositoriesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeRepositoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRepositoriesRequest> request = null;
        Response<DescribeRepositoriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRepositoriesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeRepositoriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRepositoriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeRepositoriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a token that is valid for a specified registry for 12 hours. This command allows you to use the
     * <code>docker</code> CLI to push and pull images with Amazon ECR. If you do not specify a registry, the default
     * registry is assumed.
     * </p>
     * <p>
     * The <code>authorizationToken</code> returned for each registry specified is a base64 encoded string that can be
     * decoded and used in a <code>docker login</code> command to authenticate to a registry. The AWS CLI offers an
     * <code>aws ecr get-login</code> command that simplifies the login process.
     * </p>
     * 
     * @param getAuthorizationTokenRequest
     * @return Result of the GetAuthorizationToken operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECR.GetAuthorizationToken
     */
    @Override
    public GetAuthorizationTokenResult getAuthorizationToken(GetAuthorizationTokenRequest getAuthorizationTokenRequest) {
        ExecutionContext executionContext = createExecutionContext(getAuthorizationTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAuthorizationTokenRequest> request = null;
        Response<GetAuthorizationTokenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAuthorizationTokenRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAuthorizationTokenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAuthorizationTokenResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetAuthorizationTokenResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the pre-signed Amazon S3 download URL corresponding to an image layer. You can only get URLs for image
     * layers that are referenced in an image.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers. Use the
     * <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param getDownloadUrlForLayerRequest
     * @return Result of the GetDownloadUrlForLayer operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws LayersNotFoundException
     *         The specified layers could not be found, or the specified layer is not valid for this repository.
     * @throws LayerInaccessibleException
     *         The specified layer is not available because it is not associated with an image. Unassociated image
     *         layers may be cleaned up at any time.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @sample AmazonECR.GetDownloadUrlForLayer
     */
    @Override
    public GetDownloadUrlForLayerResult getDownloadUrlForLayer(GetDownloadUrlForLayerRequest getDownloadUrlForLayerRequest) {
        ExecutionContext executionContext = createExecutionContext(getDownloadUrlForLayerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDownloadUrlForLayerRequest> request = null;
        Response<GetDownloadUrlForLayerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDownloadUrlForLayerRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDownloadUrlForLayerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDownloadUrlForLayerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDownloadUrlForLayerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the repository policy for a specified repository.
     * </p>
     * 
     * @param getRepositoryPolicyRequest
     * @return Result of the GetRepositoryPolicy operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @throws RepositoryPolicyNotFoundException
     *         The specified repository and registry combination does not have an associated repository policy.
     * @sample AmazonECR.GetRepositoryPolicy
     */
    @Override
    public GetRepositoryPolicyResult getRepositoryPolicy(GetRepositoryPolicyRequest getRepositoryPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(getRepositoryPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRepositoryPolicyRequest> request = null;
        Response<GetRepositoryPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRepositoryPolicyRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRepositoryPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRepositoryPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRepositoryPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Notify Amazon ECR that you intend to upload an image layer.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers. Use the
     * <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param initiateLayerUploadRequest
     * @return Result of the InitiateLayerUpload operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @sample AmazonECR.InitiateLayerUpload
     */
    @Override
    public InitiateLayerUploadResult initiateLayerUpload(InitiateLayerUploadRequest initiateLayerUploadRequest) {
        ExecutionContext executionContext = createExecutionContext(initiateLayerUploadRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InitiateLayerUploadRequest> request = null;
        Response<InitiateLayerUploadResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InitiateLayerUploadRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(initiateLayerUploadRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<InitiateLayerUploadResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new InitiateLayerUploadResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the image IDs for a given repository.
     * </p>
     * <p>
     * You can filter images based on whether or not they are tagged by setting the <code>tagStatus</code> parameter to
     * <code>TAGGED</code> or <code>UNTAGGED</code>. For example, you can filter your results to return only
     * <code>UNTAGGED</code> images and then pipe that result to a <a>BatchDeleteImage</a> operation to delete them. Or,
     * you can filter your results to return only <code>TAGGED</code> images to list all of the tags in your repository.
     * </p>
     * 
     * @param listImagesRequest
     * @return Result of the ListImages operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @sample AmazonECR.ListImages
     */
    @Override
    public ListImagesResult listImages(ListImagesRequest listImagesRequest) {
        ExecutionContext executionContext = createExecutionContext(listImagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListImagesRequest> request = null;
        Response<ListImagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListImagesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listImagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListImagesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListImagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates the image manifest associated with an image.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers. Use the
     * <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param putImageRequest
     * @return Result of the PutImage operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @throws ImageAlreadyExistsException
     *         The specified image has already been pushed, and there are no changes to the manifest or image tag since
     *         the last push.
     * @throws LayersNotFoundException
     *         The specified layers could not be found, or the specified layer is not valid for this repository.
     * @throws LimitExceededException
     *         The operation did not succeed because it would have exceeded a service limit for your account. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AmazonECR/latest/userguide/service_limits.html">Amazon ECR Default
     *         Service Limits</a> in the Amazon EC2 Container Registry User Guide.
     * @sample AmazonECR.PutImage
     */
    @Override
    public PutImageResult putImage(PutImageRequest putImageRequest) {
        ExecutionContext executionContext = createExecutionContext(putImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutImageRequest> request = null;
        Response<PutImageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutImageRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(putImageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutImageResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutImageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Applies a repository policy on a specified repository to control access permissions.
     * </p>
     * 
     * @param setRepositoryPolicyRequest
     * @return Result of the SetRepositoryPolicy operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @sample AmazonECR.SetRepositoryPolicy
     */
    @Override
    public SetRepositoryPolicyResult setRepositoryPolicy(SetRepositoryPolicyRequest setRepositoryPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(setRepositoryPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetRepositoryPolicyRequest> request = null;
        Response<SetRepositoryPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetRepositoryPolicyRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(setRepositoryPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetRepositoryPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SetRepositoryPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Uploads an image layer part to Amazon ECR.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers. Use the
     * <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param uploadLayerPartRequest
     * @return Result of the UploadLayerPart operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws InvalidLayerPartException
     *         The layer part size is not valid, or the first byte specified is not consecutive to the last byte of a
     *         previous layer part upload.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @throws UploadNotFoundException
     *         The upload could not be found, or the specified upload id is not valid for this repository.
     * @throws LimitExceededException
     *         The operation did not succeed because it would have exceeded a service limit for your account. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AmazonECR/latest/userguide/service_limits.html">Amazon ECR Default
     *         Service Limits</a> in the Amazon EC2 Container Registry User Guide.
     * @sample AmazonECR.UploadLayerPart
     */
    @Override
    public UploadLayerPartResult uploadLayerPart(UploadLayerPartRequest uploadLayerPartRequest) {
        ExecutionContext executionContext = createExecutionContext(uploadLayerPartRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UploadLayerPartRequest> request = null;
        Response<UploadLayerPartResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UploadLayerPartRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(uploadLayerPartRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UploadLayerPartResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UploadLayerPartResultJsonUnmarshaller());
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
