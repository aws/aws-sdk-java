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

import javax.annotation.Generated;

import com.amazonaws.services.ecrpublic.model.*;

/**
 * Interface for accessing Amazon ECR Public asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ecrpublic.AbstractAmazonECRPublicAsync} instead.
 * </p>
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
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonECRPublicAsync extends AmazonECRPublic {

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
     * @return A Java Future containing the result of the BatchCheckLayerAvailability operation returned by the service.
     * @sample AmazonECRPublicAsync.BatchCheckLayerAvailability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/BatchCheckLayerAvailability"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchCheckLayerAvailabilityResult> batchCheckLayerAvailabilityAsync(
            BatchCheckLayerAvailabilityRequest batchCheckLayerAvailabilityRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchCheckLayerAvailability operation returned by the service.
     * @sample AmazonECRPublicAsyncHandler.BatchCheckLayerAvailability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/BatchCheckLayerAvailability"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchCheckLayerAvailabilityResult> batchCheckLayerAvailabilityAsync(
            BatchCheckLayerAvailabilityRequest batchCheckLayerAvailabilityRequest,
            com.amazonaws.handlers.AsyncHandler<BatchCheckLayerAvailabilityRequest, BatchCheckLayerAvailabilityResult> asyncHandler);

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
     * @return A Java Future containing the result of the BatchDeleteImage operation returned by the service.
     * @sample AmazonECRPublicAsync.BatchDeleteImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/BatchDeleteImage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteImageResult> batchDeleteImageAsync(BatchDeleteImageRequest batchDeleteImageRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDeleteImage operation returned by the service.
     * @sample AmazonECRPublicAsyncHandler.BatchDeleteImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/BatchDeleteImage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteImageResult> batchDeleteImageAsync(BatchDeleteImageRequest batchDeleteImageRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteImageRequest, BatchDeleteImageResult> asyncHandler);

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
     * @return A Java Future containing the result of the CompleteLayerUpload operation returned by the service.
     * @sample AmazonECRPublicAsync.CompleteLayerUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/CompleteLayerUpload" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CompleteLayerUploadResult> completeLayerUploadAsync(CompleteLayerUploadRequest completeLayerUploadRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CompleteLayerUpload operation returned by the service.
     * @sample AmazonECRPublicAsyncHandler.CompleteLayerUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/CompleteLayerUpload" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CompleteLayerUploadResult> completeLayerUploadAsync(CompleteLayerUploadRequest completeLayerUploadRequest,
            com.amazonaws.handlers.AsyncHandler<CompleteLayerUploadRequest, CompleteLayerUploadResult> asyncHandler);

    /**
     * <p>
     * Creates a repository in a public registry. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/Repositories.html">Amazon ECR repositories</a> in
     * the <i>Amazon Elastic Container Registry User Guide</i>.
     * </p>
     * 
     * @param createRepositoryRequest
     * @return A Java Future containing the result of the CreateRepository operation returned by the service.
     * @sample AmazonECRPublicAsync.CreateRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/CreateRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(CreateRepositoryRequest createRepositoryRequest);

    /**
     * <p>
     * Creates a repository in a public registry. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/Repositories.html">Amazon ECR repositories</a> in
     * the <i>Amazon Elastic Container Registry User Guide</i>.
     * </p>
     * 
     * @param createRepositoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRepository operation returned by the service.
     * @sample AmazonECRPublicAsyncHandler.CreateRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/CreateRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(CreateRepositoryRequest createRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRepositoryRequest, CreateRepositoryResult> asyncHandler);

    /**
     * <p>
     * Deletes a repository in a public registry. If the repository contains images, you must either delete all images
     * in the repository or use the <code>force</code> option which deletes all images on your behalf before deleting
     * the repository.
     * </p>
     * 
     * @param deleteRepositoryRequest
     * @return A Java Future containing the result of the DeleteRepository operation returned by the service.
     * @sample AmazonECRPublicAsync.DeleteRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/DeleteRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(DeleteRepositoryRequest deleteRepositoryRequest);

    /**
     * <p>
     * Deletes a repository in a public registry. If the repository contains images, you must either delete all images
     * in the repository or use the <code>force</code> option which deletes all images on your behalf before deleting
     * the repository.
     * </p>
     * 
     * @param deleteRepositoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRepository operation returned by the service.
     * @sample AmazonECRPublicAsyncHandler.DeleteRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/DeleteRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(DeleteRepositoryRequest deleteRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRepositoryRequest, DeleteRepositoryResult> asyncHandler);

    /**
     * <p>
     * Deletes the repository policy associated with the specified repository.
     * </p>
     * 
     * @param deleteRepositoryPolicyRequest
     * @return A Java Future containing the result of the DeleteRepositoryPolicy operation returned by the service.
     * @sample AmazonECRPublicAsync.DeleteRepositoryPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/DeleteRepositoryPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRepositoryPolicyResult> deleteRepositoryPolicyAsync(DeleteRepositoryPolicyRequest deleteRepositoryPolicyRequest);

    /**
     * <p>
     * Deletes the repository policy associated with the specified repository.
     * </p>
     * 
     * @param deleteRepositoryPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRepositoryPolicy operation returned by the service.
     * @sample AmazonECRPublicAsyncHandler.DeleteRepositoryPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/DeleteRepositoryPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRepositoryPolicyResult> deleteRepositoryPolicyAsync(DeleteRepositoryPolicyRequest deleteRepositoryPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRepositoryPolicyRequest, DeleteRepositoryPolicyResult> asyncHandler);

    /**
     * <p>
     * Returns the image tag details for a repository in a public registry.
     * </p>
     * 
     * @param describeImageTagsRequest
     * @return A Java Future containing the result of the DescribeImageTags operation returned by the service.
     * @sample AmazonECRPublicAsync.DescribeImageTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/DescribeImageTags" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeImageTagsResult> describeImageTagsAsync(DescribeImageTagsRequest describeImageTagsRequest);

    /**
     * <p>
     * Returns the image tag details for a repository in a public registry.
     * </p>
     * 
     * @param describeImageTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeImageTags operation returned by the service.
     * @sample AmazonECRPublicAsyncHandler.DescribeImageTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/DescribeImageTags" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeImageTagsResult> describeImageTagsAsync(DescribeImageTagsRequest describeImageTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeImageTagsRequest, DescribeImageTagsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeImages operation returned by the service.
     * @sample AmazonECRPublicAsync.DescribeImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/DescribeImages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync(DescribeImagesRequest describeImagesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeImages operation returned by the service.
     * @sample AmazonECRPublicAsyncHandler.DescribeImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/DescribeImages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync(DescribeImagesRequest describeImagesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeImagesRequest, DescribeImagesResult> asyncHandler);

    /**
     * <p>
     * Returns details for a public registry.
     * </p>
     * 
     * @param describeRegistriesRequest
     * @return A Java Future containing the result of the DescribeRegistries operation returned by the service.
     * @sample AmazonECRPublicAsync.DescribeRegistries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/DescribeRegistries" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRegistriesResult> describeRegistriesAsync(DescribeRegistriesRequest describeRegistriesRequest);

    /**
     * <p>
     * Returns details for a public registry.
     * </p>
     * 
     * @param describeRegistriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRegistries operation returned by the service.
     * @sample AmazonECRPublicAsyncHandler.DescribeRegistries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/DescribeRegistries" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRegistriesResult> describeRegistriesAsync(DescribeRegistriesRequest describeRegistriesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRegistriesRequest, DescribeRegistriesResult> asyncHandler);

    /**
     * <p>
     * Describes repositories in a public registry.
     * </p>
     * 
     * @param describeRepositoriesRequest
     * @return A Java Future containing the result of the DescribeRepositories operation returned by the service.
     * @sample AmazonECRPublicAsync.DescribeRepositories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/DescribeRepositories"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRepositoriesResult> describeRepositoriesAsync(DescribeRepositoriesRequest describeRepositoriesRequest);

    /**
     * <p>
     * Describes repositories in a public registry.
     * </p>
     * 
     * @param describeRepositoriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRepositories operation returned by the service.
     * @sample AmazonECRPublicAsyncHandler.DescribeRepositories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/DescribeRepositories"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRepositoriesResult> describeRepositoriesAsync(DescribeRepositoriesRequest describeRepositoriesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRepositoriesRequest, DescribeRepositoriesResult> asyncHandler);

    /**
     * <p>
     * Retrieves an authorization token. An authorization token represents your IAM authentication credentials and can
     * be used to access any Amazon ECR registry that your IAM principal has access to. The authorization token is valid
     * for 12 hours. This API requires the <code>ecr-public:GetAuthorizationToken</code> and
     * <code>sts:GetServiceBearerToken</code> permissions.
     * </p>
     * 
     * @param getAuthorizationTokenRequest
     * @return A Java Future containing the result of the GetAuthorizationToken operation returned by the service.
     * @sample AmazonECRPublicAsync.GetAuthorizationToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/GetAuthorizationToken"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAuthorizationTokenResult> getAuthorizationTokenAsync(GetAuthorizationTokenRequest getAuthorizationTokenRequest);

    /**
     * <p>
     * Retrieves an authorization token. An authorization token represents your IAM authentication credentials and can
     * be used to access any Amazon ECR registry that your IAM principal has access to. The authorization token is valid
     * for 12 hours. This API requires the <code>ecr-public:GetAuthorizationToken</code> and
     * <code>sts:GetServiceBearerToken</code> permissions.
     * </p>
     * 
     * @param getAuthorizationTokenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAuthorizationToken operation returned by the service.
     * @sample AmazonECRPublicAsyncHandler.GetAuthorizationToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/GetAuthorizationToken"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAuthorizationTokenResult> getAuthorizationTokenAsync(GetAuthorizationTokenRequest getAuthorizationTokenRequest,
            com.amazonaws.handlers.AsyncHandler<GetAuthorizationTokenRequest, GetAuthorizationTokenResult> asyncHandler);

    /**
     * <p>
     * Retrieves catalog metadata for a public registry.
     * </p>
     * 
     * @param getRegistryCatalogDataRequest
     * @return A Java Future containing the result of the GetRegistryCatalogData operation returned by the service.
     * @sample AmazonECRPublicAsync.GetRegistryCatalogData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/GetRegistryCatalogData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRegistryCatalogDataResult> getRegistryCatalogDataAsync(GetRegistryCatalogDataRequest getRegistryCatalogDataRequest);

    /**
     * <p>
     * Retrieves catalog metadata for a public registry.
     * </p>
     * 
     * @param getRegistryCatalogDataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRegistryCatalogData operation returned by the service.
     * @sample AmazonECRPublicAsyncHandler.GetRegistryCatalogData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/GetRegistryCatalogData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRegistryCatalogDataResult> getRegistryCatalogDataAsync(GetRegistryCatalogDataRequest getRegistryCatalogDataRequest,
            com.amazonaws.handlers.AsyncHandler<GetRegistryCatalogDataRequest, GetRegistryCatalogDataResult> asyncHandler);

    /**
     * <p>
     * Retrieve catalog metadata for a repository in a public registry. This metadata is displayed publicly in the
     * Amazon ECR Public Gallery.
     * </p>
     * 
     * @param getRepositoryCatalogDataRequest
     * @return A Java Future containing the result of the GetRepositoryCatalogData operation returned by the service.
     * @sample AmazonECRPublicAsync.GetRepositoryCatalogData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/GetRepositoryCatalogData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRepositoryCatalogDataResult> getRepositoryCatalogDataAsync(GetRepositoryCatalogDataRequest getRepositoryCatalogDataRequest);

    /**
     * <p>
     * Retrieve catalog metadata for a repository in a public registry. This metadata is displayed publicly in the
     * Amazon ECR Public Gallery.
     * </p>
     * 
     * @param getRepositoryCatalogDataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRepositoryCatalogData operation returned by the service.
     * @sample AmazonECRPublicAsyncHandler.GetRepositoryCatalogData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/GetRepositoryCatalogData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRepositoryCatalogDataResult> getRepositoryCatalogDataAsync(GetRepositoryCatalogDataRequest getRepositoryCatalogDataRequest,
            com.amazonaws.handlers.AsyncHandler<GetRepositoryCatalogDataRequest, GetRepositoryCatalogDataResult> asyncHandler);

    /**
     * <p>
     * Retrieves the repository policy for the specified repository.
     * </p>
     * 
     * @param getRepositoryPolicyRequest
     * @return A Java Future containing the result of the GetRepositoryPolicy operation returned by the service.
     * @sample AmazonECRPublicAsync.GetRepositoryPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/GetRepositoryPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetRepositoryPolicyResult> getRepositoryPolicyAsync(GetRepositoryPolicyRequest getRepositoryPolicyRequest);

    /**
     * <p>
     * Retrieves the repository policy for the specified repository.
     * </p>
     * 
     * @param getRepositoryPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRepositoryPolicy operation returned by the service.
     * @sample AmazonECRPublicAsyncHandler.GetRepositoryPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/GetRepositoryPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetRepositoryPolicyResult> getRepositoryPolicyAsync(GetRepositoryPolicyRequest getRepositoryPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetRepositoryPolicyRequest, GetRepositoryPolicyResult> asyncHandler);

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
     * @return A Java Future containing the result of the InitiateLayerUpload operation returned by the service.
     * @sample AmazonECRPublicAsync.InitiateLayerUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/InitiateLayerUpload" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<InitiateLayerUploadResult> initiateLayerUploadAsync(InitiateLayerUploadRequest initiateLayerUploadRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InitiateLayerUpload operation returned by the service.
     * @sample AmazonECRPublicAsyncHandler.InitiateLayerUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/InitiateLayerUpload" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<InitiateLayerUploadResult> initiateLayerUploadAsync(InitiateLayerUploadRequest initiateLayerUploadRequest,
            com.amazonaws.handlers.AsyncHandler<InitiateLayerUploadRequest, InitiateLayerUploadResult> asyncHandler);

    /**
     * <p>
     * List the tags for an Amazon ECR Public resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonECRPublicAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * List the tags for an Amazon ECR Public resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonECRPublicAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the PutImage operation returned by the service.
     * @sample AmazonECRPublicAsync.PutImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/PutImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutImageResult> putImageAsync(PutImageRequest putImageRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutImage operation returned by the service.
     * @sample AmazonECRPublicAsyncHandler.PutImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/PutImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutImageResult> putImageAsync(PutImageRequest putImageRequest,
            com.amazonaws.handlers.AsyncHandler<PutImageRequest, PutImageResult> asyncHandler);

    /**
     * <p>
     * Create or updates the catalog data for a public registry.
     * </p>
     * 
     * @param putRegistryCatalogDataRequest
     * @return A Java Future containing the result of the PutRegistryCatalogData operation returned by the service.
     * @sample AmazonECRPublicAsync.PutRegistryCatalogData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/PutRegistryCatalogData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutRegistryCatalogDataResult> putRegistryCatalogDataAsync(PutRegistryCatalogDataRequest putRegistryCatalogDataRequest);

    /**
     * <p>
     * Create or updates the catalog data for a public registry.
     * </p>
     * 
     * @param putRegistryCatalogDataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutRegistryCatalogData operation returned by the service.
     * @sample AmazonECRPublicAsyncHandler.PutRegistryCatalogData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/PutRegistryCatalogData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutRegistryCatalogDataResult> putRegistryCatalogDataAsync(PutRegistryCatalogDataRequest putRegistryCatalogDataRequest,
            com.amazonaws.handlers.AsyncHandler<PutRegistryCatalogDataRequest, PutRegistryCatalogDataResult> asyncHandler);

    /**
     * <p>
     * Creates or updates the catalog data for a repository in a public registry.
     * </p>
     * 
     * @param putRepositoryCatalogDataRequest
     * @return A Java Future containing the result of the PutRepositoryCatalogData operation returned by the service.
     * @sample AmazonECRPublicAsync.PutRepositoryCatalogData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/PutRepositoryCatalogData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutRepositoryCatalogDataResult> putRepositoryCatalogDataAsync(PutRepositoryCatalogDataRequest putRepositoryCatalogDataRequest);

    /**
     * <p>
     * Creates or updates the catalog data for a repository in a public registry.
     * </p>
     * 
     * @param putRepositoryCatalogDataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutRepositoryCatalogData operation returned by the service.
     * @sample AmazonECRPublicAsyncHandler.PutRepositoryCatalogData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/PutRepositoryCatalogData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutRepositoryCatalogDataResult> putRepositoryCatalogDataAsync(PutRepositoryCatalogDataRequest putRepositoryCatalogDataRequest,
            com.amazonaws.handlers.AsyncHandler<PutRepositoryCatalogDataRequest, PutRepositoryCatalogDataResult> asyncHandler);

    /**
     * <p>
     * Applies a repository policy to the specified public repository to control access permissions. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/repository-policies.html">Amazon
     * ECR Repository Policies</a> in the <i>Amazon Elastic Container Registry User Guide</i>.
     * </p>
     * 
     * @param setRepositoryPolicyRequest
     * @return A Java Future containing the result of the SetRepositoryPolicy operation returned by the service.
     * @sample AmazonECRPublicAsync.SetRepositoryPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/SetRepositoryPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SetRepositoryPolicyResult> setRepositoryPolicyAsync(SetRepositoryPolicyRequest setRepositoryPolicyRequest);

    /**
     * <p>
     * Applies a repository policy to the specified public repository to control access permissions. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/repository-policies.html">Amazon
     * ECR Repository Policies</a> in the <i>Amazon Elastic Container Registry User Guide</i>.
     * </p>
     * 
     * @param setRepositoryPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetRepositoryPolicy operation returned by the service.
     * @sample AmazonECRPublicAsyncHandler.SetRepositoryPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/SetRepositoryPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SetRepositoryPolicyResult> setRepositoryPolicyAsync(SetRepositoryPolicyRequest setRepositoryPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<SetRepositoryPolicyRequest, SetRepositoryPolicyResult> asyncHandler);

    /**
     * <p>
     * Associates the specified tags to a resource with the specified <code>resourceArn</code>. If existing tags on a
     * resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags
     * associated with that resource are deleted as well.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonECRPublicAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Associates the specified tags to a resource with the specified <code>resourceArn</code>. If existing tags on a
     * resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags
     * associated with that resource are deleted as well.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonECRPublicAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Deletes specified tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonECRPublicAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Deletes specified tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonECRPublicAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the UploadLayerPart operation returned by the service.
     * @sample AmazonECRPublicAsync.UploadLayerPart
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/UploadLayerPart" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UploadLayerPartResult> uploadLayerPartAsync(UploadLayerPartRequest uploadLayerPartRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UploadLayerPart operation returned by the service.
     * @sample AmazonECRPublicAsyncHandler.UploadLayerPart
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/UploadLayerPart" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UploadLayerPartResult> uploadLayerPartAsync(UploadLayerPartRequest uploadLayerPartRequest,
            com.amazonaws.handlers.AsyncHandler<UploadLayerPartRequest, UploadLayerPartResult> asyncHandler);

}
