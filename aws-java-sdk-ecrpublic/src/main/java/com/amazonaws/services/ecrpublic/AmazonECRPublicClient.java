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
package com.amazonaws.services.ecrpublic;

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

import com.amazonaws.services.ecrpublic.AmazonECRPublicClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.ecrpublic.model.*;
import com.amazonaws.services.ecrpublic.model.transform.*;

/**
 * Client for accessing Amazon ECR Public. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname>Amazon Elastic Container Registry Public</fullname>
 * <p>
 * Amazon Elastic Container Registry (Amazon ECR) is a managed container image registry service. Amazon ECR provides
 * both public and private registries to host your container images. You can use the familiar Docker CLI, or their
 * preferred client, to push, pull, and manage images. Amazon ECR provides a secure, scalable, and reliable registry for
 * your Docker or Open Container Initiative (OCI) images. Amazon ECR supports public repositories with this API. For
 * information about the Amazon ECR API for private repositories, see <a
 * href="https://docs.aws.amazon.com/AmazonECR/latest/APIReference/Welcome.html">Amazon Elastic Container Registry API
 * Reference</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonECRPublicClient extends AmazonWebServiceClient implements AmazonECRPublic {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonECRPublic.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "ecr-public";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedCommandException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ecrpublic.model.transform.UnsupportedCommandExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyTagsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ecrpublic.model.transform.TooManyTagsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LayerPartTooSmallException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ecrpublic.model.transform.LayerPartTooSmallExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidLayerPartException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ecrpublic.model.transform.InvalidLayerPartExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ImageTagAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ecrpublic.model.transform.ImageTagAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ecrpublic.model.transform.InvalidParameterExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ecrpublic.model.transform.ServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RepositoryNotEmptyException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ecrpublic.model.transform.RepositoryNotEmptyExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LayerAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ecrpublic.model.transform.LayerAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ImageDigestDoesNotMatchException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ecrpublic.model.transform.ImageDigestDoesNotMatchExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RegistryNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ecrpublic.model.transform.RegistryNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EmptyUploadException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ecrpublic.model.transform.EmptyUploadExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTagParameterException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ecrpublic.model.transform.InvalidTagParameterExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ImageNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ecrpublic.model.transform.ImageNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LayersNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ecrpublic.model.transform.LayersNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ReferencedImagesNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ecrpublic.model.transform.ReferencedImagesNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidLayerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ecrpublic.model.transform.InvalidLayerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RepositoryNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ecrpublic.model.transform.RepositoryNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RepositoryAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ecrpublic.model.transform.RepositoryAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RepositoryPolicyNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ecrpublic.model.transform.RepositoryPolicyNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ImageAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ecrpublic.model.transform.ImageAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ecrpublic.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UploadNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ecrpublic.model.transform.UploadNotFoundExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.ecrpublic.model.AmazonECRPublicException.class));

    public static AmazonECRPublicClientBuilder builder() {
        return AmazonECRPublicClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ECR Public using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonECRPublicClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ECR Public using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonECRPublicClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("api.ecr-public.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/ecrpublic/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/ecrpublic/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Checks the availability of one or more image layers within a repository in a public registry. When an image is
     * pushed to a repository, each image layer is checked to verify if it has been uploaded before. If it has been
     * uploaded, then the image layer is skipped.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy and is not generally used by customers for pulling and pushing
     * images. In most cases, you should use the <code>docker</code> CLI to pull, tag, and push images.
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
     * @throws RegistryNotFoundException
     *         The registry does not exist.
     * @sample AmazonECRPublic.BatchCheckLayerAvailability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/BatchCheckLayerAvailability"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchCheckLayerAvailabilityResult batchCheckLayerAvailability(BatchCheckLayerAvailabilityRequest request) {
        request = beforeClientExecution(request);
        return executeBatchCheckLayerAvailability(request);
    }

    @SdkInternalApi
    final BatchCheckLayerAvailabilityResult executeBatchCheckLayerAvailability(BatchCheckLayerAvailabilityRequest batchCheckLayerAvailabilityRequest) {

        ExecutionContext executionContext = createExecutionContext(batchCheckLayerAvailabilityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchCheckLayerAvailabilityRequest> request = null;
        Response<BatchCheckLayerAvailabilityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchCheckLayerAvailabilityRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchCheckLayerAvailabilityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECR PUBLIC");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchCheckLayerAvailability");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Deletes a list of specified images within a repository in a public registry. Images are specified with either an
     * <code>imageTag</code> or <code>imageDigest</code>.
     * </p>
     * <p>
     * You can remove a tag from an image by specifying the image's tag in your request. When you remove the last tag
     * from an image, the image is deleted from your repository.
     * </p>
     * <p>
     * You can completely delete an image (and all of its tags) by specifying the image's digest in your request.
     * </p>
     * 
     * @param batchDeleteImageRequest
     * @return Result of the BatchDeleteImage operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @sample AmazonECRPublic.BatchDeleteImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/BatchDeleteImage" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public BatchDeleteImageResult batchDeleteImage(BatchDeleteImageRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDeleteImage(request);
    }

    @SdkInternalApi
    final BatchDeleteImageResult executeBatchDeleteImage(BatchDeleteImageRequest batchDeleteImageRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDeleteImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeleteImageRequest> request = null;
        Response<BatchDeleteImageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeleteImageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchDeleteImageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECR PUBLIC");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDeleteImage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Informs Amazon ECR that the image layer upload has completed for a specified public registry, repository name,
     * and upload ID. You can optionally provide a <code>sha256</code> digest of the image layer for data validation
     * purposes.
     * </p>
     * <p>
     * When an image is pushed, the CompleteLayerUpload API is called once per each new image layer to verify that the
     * upload has completed.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy and is not generally used by customers for pulling and pushing
     * images. In most cases, you should use the <code>docker</code> CLI to pull, tag, and push images.
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
     *         The upload could not be found, or the specified upload ID is not valid for this repository.
     * @throws InvalidLayerException
     *         The layer digest calculation performed by Amazon ECR upon receipt of the image layer does not match the
     *         digest specified.
     * @throws LayerPartTooSmallException
     *         Layer parts must be at least 5 MiB in size.
     * @throws LayerAlreadyExistsException
     *         The image layer already exists in the associated repository.
     * @throws EmptyUploadException
     *         The specified layer upload does not contain any layer parts.
     * @throws RegistryNotFoundException
     *         The registry does not exist.
     * @throws UnsupportedCommandException
     *         The action is not supported in this Region.
     * @sample AmazonECRPublic.CompleteLayerUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/CompleteLayerUpload" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CompleteLayerUploadResult completeLayerUpload(CompleteLayerUploadRequest request) {
        request = beforeClientExecution(request);
        return executeCompleteLayerUpload(request);
    }

    @SdkInternalApi
    final CompleteLayerUploadResult executeCompleteLayerUpload(CompleteLayerUploadRequest completeLayerUploadRequest) {

        ExecutionContext executionContext = createExecutionContext(completeLayerUploadRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CompleteLayerUploadRequest> request = null;
        Response<CompleteLayerUploadResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CompleteLayerUploadRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(completeLayerUploadRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECR PUBLIC");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CompleteLayerUpload");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Creates a repository in a public registry. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/Repositories.html">Amazon ECR repositories</a> in
     * the <i>Amazon Elastic Container Registry User Guide</i>.
     * </p>
     * 
     * @param createRepositoryRequest
     * @return Result of the CreateRepository operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws InvalidTagParameterException
     *         An invalid parameter has been specified. Tag keys can have a maximum character length of 128 characters,
     *         and tag values can have a maximum length of 256 characters.
     * @throws TooManyTagsException
     *         The list of tags on the repository is over the limit. The maximum number of tags that can be applied to a
     *         repository is 50.
     * @throws RepositoryAlreadyExistsException
     *         The specified repository already exists in the specified registry.
     * @throws LimitExceededException
     *         The operation did not succeed because it would have exceeded a service limit for your account. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/service-quotas.html">Amazon ECR Service
     *         Quotas</a> in the Amazon Elastic Container Registry User Guide.
     * @sample AmazonECRPublic.CreateRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/CreateRepository" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateRepositoryResult createRepository(CreateRepositoryRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRepository(request);
    }

    @SdkInternalApi
    final CreateRepositoryResult executeCreateRepository(CreateRepositoryRequest createRepositoryRequest) {

        ExecutionContext executionContext = createExecutionContext(createRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRepositoryRequest> request = null;
        Response<CreateRepositoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRepositoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRepositoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECR PUBLIC");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRepository");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Deletes a repository in a public registry. If the repository contains images, you must either delete all images
     * in the repository or use the <code>force</code> option which deletes all images on your behalf before deleting
     * the repository.
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
     * @sample AmazonECRPublic.DeleteRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/DeleteRepository" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteRepositoryResult deleteRepository(DeleteRepositoryRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRepository(request);
    }

    @SdkInternalApi
    final DeleteRepositoryResult executeDeleteRepository(DeleteRepositoryRequest deleteRepositoryRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRepositoryRequest> request = null;
        Response<DeleteRepositoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRepositoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRepositoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECR PUBLIC");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRepository");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Deletes the repository policy associated with the specified repository.
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
     * @sample AmazonECRPublic.DeleteRepositoryPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/DeleteRepositoryPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteRepositoryPolicyResult deleteRepositoryPolicy(DeleteRepositoryPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRepositoryPolicy(request);
    }

    @SdkInternalApi
    final DeleteRepositoryPolicyResult executeDeleteRepositoryPolicy(DeleteRepositoryPolicyRequest deleteRepositoryPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRepositoryPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRepositoryPolicyRequest> request = null;
        Response<DeleteRepositoryPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRepositoryPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRepositoryPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECR PUBLIC");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRepositoryPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Returns the image tag details for a repository in a public registry.
     * </p>
     * 
     * @param describeImageTagsRequest
     * @return Result of the DescribeImageTags operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @sample AmazonECRPublic.DescribeImageTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/DescribeImageTags" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeImageTagsResult describeImageTags(DescribeImageTagsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeImageTags(request);
    }

    @SdkInternalApi
    final DescribeImageTagsResult executeDescribeImageTags(DescribeImageTagsRequest describeImageTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeImageTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeImageTagsRequest> request = null;
        Response<DescribeImageTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeImageTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeImageTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECR PUBLIC");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeImageTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeImageTagsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeImageTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns metadata about the images in a repository in a public registry.
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
     * @sample AmazonECRPublic.DescribeImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/DescribeImages" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeImagesResult describeImages(DescribeImagesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeImages(request);
    }

    @SdkInternalApi
    final DescribeImagesResult executeDescribeImages(DescribeImagesRequest describeImagesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeImagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeImagesRequest> request = null;
        Response<DescribeImagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeImagesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeImagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECR PUBLIC");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeImages");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Returns details for a public registry.
     * </p>
     * 
     * @param describeRegistriesRequest
     * @return Result of the DescribeRegistries operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws UnsupportedCommandException
     *         The action is not supported in this Region.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @sample AmazonECRPublic.DescribeRegistries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/DescribeRegistries" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeRegistriesResult describeRegistries(DescribeRegistriesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRegistries(request);
    }

    @SdkInternalApi
    final DescribeRegistriesResult executeDescribeRegistries(DescribeRegistriesRequest describeRegistriesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRegistriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRegistriesRequest> request = null;
        Response<DescribeRegistriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRegistriesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeRegistriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECR PUBLIC");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRegistries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRegistriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeRegistriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes repositories in a public registry.
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
     * @sample AmazonECRPublic.DescribeRepositories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/DescribeRepositories"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeRepositoriesResult describeRepositories(DescribeRepositoriesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRepositories(request);
    }

    @SdkInternalApi
    final DescribeRepositoriesResult executeDescribeRepositories(DescribeRepositoriesRequest describeRepositoriesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRepositoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRepositoriesRequest> request = null;
        Response<DescribeRepositoriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRepositoriesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeRepositoriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECR PUBLIC");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRepositories");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Retrieves an authorization token. An authorization token represents your IAM authentication credentials and can
     * be used to access any Amazon ECR registry that your IAM principal has access to. The authorization token is valid
     * for 12 hours. This API requires the <code>ecr-public:GetAuthorizationToken</code> and
     * <code>sts:GetServiceBearerToken</code> permissions.
     * </p>
     * 
     * @param getAuthorizationTokenRequest
     * @return Result of the GetAuthorizationToken operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECRPublic.GetAuthorizationToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/GetAuthorizationToken"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAuthorizationTokenResult getAuthorizationToken(GetAuthorizationTokenRequest request) {
        request = beforeClientExecution(request);
        return executeGetAuthorizationToken(request);
    }

    @SdkInternalApi
    final GetAuthorizationTokenResult executeGetAuthorizationToken(GetAuthorizationTokenRequest getAuthorizationTokenRequest) {

        ExecutionContext executionContext = createExecutionContext(getAuthorizationTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAuthorizationTokenRequest> request = null;
        Response<GetAuthorizationTokenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAuthorizationTokenRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAuthorizationTokenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECR PUBLIC");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAuthorizationToken");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Retrieves catalog metadata for a public registry.
     * </p>
     * 
     * @param getRegistryCatalogDataRequest
     * @return Result of the GetRegistryCatalogData operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws UnsupportedCommandException
     *         The action is not supported in this Region.
     * @sample AmazonECRPublic.GetRegistryCatalogData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/GetRegistryCatalogData"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRegistryCatalogDataResult getRegistryCatalogData(GetRegistryCatalogDataRequest request) {
        request = beforeClientExecution(request);
        return executeGetRegistryCatalogData(request);
    }

    @SdkInternalApi
    final GetRegistryCatalogDataResult executeGetRegistryCatalogData(GetRegistryCatalogDataRequest getRegistryCatalogDataRequest) {

        ExecutionContext executionContext = createExecutionContext(getRegistryCatalogDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRegistryCatalogDataRequest> request = null;
        Response<GetRegistryCatalogDataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRegistryCatalogDataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRegistryCatalogDataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECR PUBLIC");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRegistryCatalogData");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRegistryCatalogDataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetRegistryCatalogDataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieve catalog metadata for a repository in a public registry. This metadata is displayed publicly in the
     * Amazon ECR Public Gallery.
     * </p>
     * 
     * @param getRepositoryCatalogDataRequest
     * @return Result of the GetRepositoryCatalogData operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @sample AmazonECRPublic.GetRepositoryCatalogData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/GetRepositoryCatalogData"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRepositoryCatalogDataResult getRepositoryCatalogData(GetRepositoryCatalogDataRequest request) {
        request = beforeClientExecution(request);
        return executeGetRepositoryCatalogData(request);
    }

    @SdkInternalApi
    final GetRepositoryCatalogDataResult executeGetRepositoryCatalogData(GetRepositoryCatalogDataRequest getRepositoryCatalogDataRequest) {

        ExecutionContext executionContext = createExecutionContext(getRepositoryCatalogDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRepositoryCatalogDataRequest> request = null;
        Response<GetRepositoryCatalogDataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRepositoryCatalogDataRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getRepositoryCatalogDataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECR PUBLIC");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRepositoryCatalogData");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRepositoryCatalogDataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetRepositoryCatalogDataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the repository policy for the specified repository.
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
     * @sample AmazonECRPublic.GetRepositoryPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/GetRepositoryPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetRepositoryPolicyResult getRepositoryPolicy(GetRepositoryPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetRepositoryPolicy(request);
    }

    @SdkInternalApi
    final GetRepositoryPolicyResult executeGetRepositoryPolicy(GetRepositoryPolicyRequest getRepositoryPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getRepositoryPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRepositoryPolicyRequest> request = null;
        Response<GetRepositoryPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRepositoryPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRepositoryPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECR PUBLIC");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRepositoryPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Notifies Amazon ECR that you intend to upload an image layer.
     * </p>
     * <p>
     * When an image is pushed, the InitiateLayerUpload API is called once per image layer that has not already been
     * uploaded. Whether or not an image layer has been uploaded is determined by the BatchCheckLayerAvailability API
     * action.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy and is not generally used by customers for pulling and pushing
     * images. In most cases, you should use the <code>docker</code> CLI to pull, tag, and push images.
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
     * @throws RegistryNotFoundException
     *         The registry does not exist.
     * @throws UnsupportedCommandException
     *         The action is not supported in this Region.
     * @sample AmazonECRPublic.InitiateLayerUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/InitiateLayerUpload" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public InitiateLayerUploadResult initiateLayerUpload(InitiateLayerUploadRequest request) {
        request = beforeClientExecution(request);
        return executeInitiateLayerUpload(request);
    }

    @SdkInternalApi
    final InitiateLayerUploadResult executeInitiateLayerUpload(InitiateLayerUploadRequest initiateLayerUploadRequest) {

        ExecutionContext executionContext = createExecutionContext(initiateLayerUploadRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InitiateLayerUploadRequest> request = null;
        Response<InitiateLayerUploadResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InitiateLayerUploadRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(initiateLayerUploadRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECR PUBLIC");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "InitiateLayerUpload");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * List the tags for an Amazon ECR Public resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @sample AmazonECRPublic.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECR PUBLIC");
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
     * Creates or updates the image manifest and tags associated with an image.
     * </p>
     * <p>
     * When an image is pushed and all new image layers have been uploaded, the PutImage API is called once to create or
     * update the image manifest and the tags associated with the image.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy and is not generally used by customers for pulling and pushing
     * images. In most cases, you should use the <code>docker</code> CLI to pull, tag, and push images.
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
     *         The specified image has already been pushed, and there were no changes to the manifest or image tag after
     *         the last push.
     * @throws LayersNotFoundException
     *         The specified layers could not be found, or the specified layer is not valid for this repository.
     * @throws ReferencedImagesNotFoundException
     *         The manifest list is referencing an image that does not exist.
     * @throws LimitExceededException
     *         The operation did not succeed because it would have exceeded a service limit for your account. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/service-quotas.html">Amazon ECR Service
     *         Quotas</a> in the Amazon Elastic Container Registry User Guide.
     * @throws ImageTagAlreadyExistsException
     *         The specified image is tagged with a tag that already exists. The repository is configured for tag
     *         immutability.
     * @throws ImageDigestDoesNotMatchException
     *         The specified image digest does not match the digest that Amazon ECR calculated for the image.
     * @throws RegistryNotFoundException
     *         The registry does not exist.
     * @throws UnsupportedCommandException
     *         The action is not supported in this Region.
     * @sample AmazonECRPublic.PutImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/PutImage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutImageResult putImage(PutImageRequest request) {
        request = beforeClientExecution(request);
        return executePutImage(request);
    }

    @SdkInternalApi
    final PutImageResult executePutImage(PutImageRequest putImageRequest) {

        ExecutionContext executionContext = createExecutionContext(putImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutImageRequest> request = null;
        Response<PutImageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutImageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putImageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECR PUBLIC");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutImage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Create or updates the catalog data for a public registry.
     * </p>
     * 
     * @param putRegistryCatalogDataRequest
     * @return Result of the PutRegistryCatalogData operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws UnsupportedCommandException
     *         The action is not supported in this Region.
     * @sample AmazonECRPublic.PutRegistryCatalogData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/PutRegistryCatalogData"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutRegistryCatalogDataResult putRegistryCatalogData(PutRegistryCatalogDataRequest request) {
        request = beforeClientExecution(request);
        return executePutRegistryCatalogData(request);
    }

    @SdkInternalApi
    final PutRegistryCatalogDataResult executePutRegistryCatalogData(PutRegistryCatalogDataRequest putRegistryCatalogDataRequest) {

        ExecutionContext executionContext = createExecutionContext(putRegistryCatalogDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRegistryCatalogDataRequest> request = null;
        Response<PutRegistryCatalogDataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRegistryCatalogDataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putRegistryCatalogDataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECR PUBLIC");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutRegistryCatalogData");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutRegistryCatalogDataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutRegistryCatalogDataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates the catalog data for a repository in a public registry.
     * </p>
     * 
     * @param putRepositoryCatalogDataRequest
     * @return Result of the PutRepositoryCatalogData operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @sample AmazonECRPublic.PutRepositoryCatalogData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/PutRepositoryCatalogData"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutRepositoryCatalogDataResult putRepositoryCatalogData(PutRepositoryCatalogDataRequest request) {
        request = beforeClientExecution(request);
        return executePutRepositoryCatalogData(request);
    }

    @SdkInternalApi
    final PutRepositoryCatalogDataResult executePutRepositoryCatalogData(PutRepositoryCatalogDataRequest putRepositoryCatalogDataRequest) {

        ExecutionContext executionContext = createExecutionContext(putRepositoryCatalogDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRepositoryCatalogDataRequest> request = null;
        Response<PutRepositoryCatalogDataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRepositoryCatalogDataRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putRepositoryCatalogDataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECR PUBLIC");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutRepositoryCatalogData");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutRepositoryCatalogDataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutRepositoryCatalogDataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Applies a repository policy to the specified public repository to control access permissions. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/repository-policies.html">Amazon
     * ECR Repository Policies</a> in the <i>Amazon Elastic Container Registry User Guide</i>.
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
     * @sample AmazonECRPublic.SetRepositoryPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/SetRepositoryPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SetRepositoryPolicyResult setRepositoryPolicy(SetRepositoryPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeSetRepositoryPolicy(request);
    }

    @SdkInternalApi
    final SetRepositoryPolicyResult executeSetRepositoryPolicy(SetRepositoryPolicyRequest setRepositoryPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(setRepositoryPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetRepositoryPolicyRequest> request = null;
        Response<SetRepositoryPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetRepositoryPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(setRepositoryPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECR PUBLIC");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetRepositoryPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Associates the specified tags to a resource with the specified <code>resourceArn</code>. If existing tags on a
     * resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags
     * associated with that resource are deleted as well.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws InvalidTagParameterException
     *         An invalid parameter has been specified. Tag keys can have a maximum character length of 128 characters,
     *         and tag values can have a maximum length of 256 characters.
     * @throws TooManyTagsException
     *         The list of tags on the repository is over the limit. The maximum number of tags that can be applied to a
     *         repository is 50.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @sample AmazonECRPublic.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECR PUBLIC");
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
     * Deletes specified tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws InvalidTagParameterException
     *         An invalid parameter has been specified. Tag keys can have a maximum character length of 128 characters,
     *         and tag values can have a maximum length of 256 characters.
     * @throws TooManyTagsException
     *         The list of tags on the repository is over the limit. The maximum number of tags that can be applied to a
     *         repository is 50.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @sample AmazonECRPublic.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECR PUBLIC");
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
     * Uploads an image layer part to Amazon ECR.
     * </p>
     * <p>
     * When an image is pushed, each new image layer is uploaded in parts. The maximum size of each image layer part can
     * be 20971520 bytes (or about 20MB). The UploadLayerPart API is called once per each new image layer part.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy and is not generally used by customers for pulling and pushing
     * images. In most cases, you should use the <code>docker</code> CLI to pull, tag, and push images.
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
     *         The upload could not be found, or the specified upload ID is not valid for this repository.
     * @throws LimitExceededException
     *         The operation did not succeed because it would have exceeded a service limit for your account. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/service-quotas.html">Amazon ECR Service
     *         Quotas</a> in the Amazon Elastic Container Registry User Guide.
     * @throws RegistryNotFoundException
     *         The registry does not exist.
     * @throws UnsupportedCommandException
     *         The action is not supported in this Region.
     * @sample AmazonECRPublic.UploadLayerPart
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/UploadLayerPart" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UploadLayerPartResult uploadLayerPart(UploadLayerPartRequest request) {
        request = beforeClientExecution(request);
        return executeUploadLayerPart(request);
    }

    @SdkInternalApi
    final UploadLayerPartResult executeUploadLayerPart(UploadLayerPartRequest uploadLayerPartRequest) {

        ExecutionContext executionContext = createExecutionContext(uploadLayerPartRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UploadLayerPartRequest> request = null;
        Response<UploadLayerPartResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UploadLayerPartRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(uploadLayerPartRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECR PUBLIC");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UploadLayerPart");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
