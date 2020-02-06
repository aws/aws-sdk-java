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
package com.amazonaws.services.ecr;

import javax.annotation.Generated;

import com.amazonaws.services.ecr.model.*;

/**
 * Interface for accessing Amazon ECR asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ecr.AbstractAmazonECRAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon Elastic Container Registry</fullname>
 * <p>
 * Amazon Elastic Container Registry (Amazon ECR) is a managed Docker registry service. Customers can use the familiar
 * Docker CLI to push, pull, and manage images. Amazon ECR provides a secure, scalable, and reliable registry. Amazon
 * ECR supports private Docker repositories with resource-based permissions using IAM so that specific users or Amazon
 * EC2 instances can access repositories and images. Developers can use the Docker CLI to author and manage images.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonECRAsync extends AmazonECR {

    /**
     * <p>
     * Checks the availability of one or more image layers in a repository.
     * </p>
     * <p>
     * When an image is pushed to a repository, each image layer is checked to verify if it has been uploaded before. If
     * it is, then the image layer is skipped.
     * </p>
     * <p>
     * When an image is pulled from a repository, each image layer is checked once to verify it is available to be
     * pulled.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
     * and pushing images. In most cases, you should use the <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param batchCheckLayerAvailabilityRequest
     * @return A Java Future containing the result of the BatchCheckLayerAvailability operation returned by the service.
     * @sample AmazonECRAsync.BatchCheckLayerAvailability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/BatchCheckLayerAvailability"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchCheckLayerAvailabilityResult> batchCheckLayerAvailabilityAsync(
            BatchCheckLayerAvailabilityRequest batchCheckLayerAvailabilityRequest);

    /**
     * <p>
     * Checks the availability of one or more image layers in a repository.
     * </p>
     * <p>
     * When an image is pushed to a repository, each image layer is checked to verify if it has been uploaded before. If
     * it is, then the image layer is skipped.
     * </p>
     * <p>
     * When an image is pulled from a repository, each image layer is checked once to verify it is available to be
     * pulled.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
     * and pushing images. In most cases, you should use the <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param batchCheckLayerAvailabilityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchCheckLayerAvailability operation returned by the service.
     * @sample AmazonECRAsyncHandler.BatchCheckLayerAvailability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/BatchCheckLayerAvailability"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchCheckLayerAvailabilityResult> batchCheckLayerAvailabilityAsync(
            BatchCheckLayerAvailabilityRequest batchCheckLayerAvailabilityRequest,
            com.amazonaws.handlers.AsyncHandler<BatchCheckLayerAvailabilityRequest, BatchCheckLayerAvailabilityResult> asyncHandler);

    /**
     * <p>
     * Deletes a list of specified images within a repository. Images are specified with either an <code>imageTag</code>
     * or <code>imageDigest</code>.
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
     *        Deletes specified images within a specified repository. Images are specified with either the
     *        <code>imageTag</code> or <code>imageDigest</code>.
     * @return A Java Future containing the result of the BatchDeleteImage operation returned by the service.
     * @sample AmazonECRAsync.BatchDeleteImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/BatchDeleteImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteImageResult> batchDeleteImageAsync(BatchDeleteImageRequest batchDeleteImageRequest);

    /**
     * <p>
     * Deletes a list of specified images within a repository. Images are specified with either an <code>imageTag</code>
     * or <code>imageDigest</code>.
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
     *        Deletes specified images within a specified repository. Images are specified with either the
     *        <code>imageTag</code> or <code>imageDigest</code>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDeleteImage operation returned by the service.
     * @sample AmazonECRAsyncHandler.BatchDeleteImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/BatchDeleteImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteImageResult> batchDeleteImageAsync(BatchDeleteImageRequest batchDeleteImageRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteImageRequest, BatchDeleteImageResult> asyncHandler);

    /**
     * <p>
     * Gets detailed information for an image. Images are specified with either an <code>imageTag</code> or
     * <code>imageDigest</code>.
     * </p>
     * <p>
     * When an image is pulled, the BatchGetImage API is called once to retrieve the image manifest.
     * </p>
     * 
     * @param batchGetImageRequest
     * @return A Java Future containing the result of the BatchGetImage operation returned by the service.
     * @sample AmazonECRAsync.BatchGetImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/BatchGetImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetImageResult> batchGetImageAsync(BatchGetImageRequest batchGetImageRequest);

    /**
     * <p>
     * Gets detailed information for an image. Images are specified with either an <code>imageTag</code> or
     * <code>imageDigest</code>.
     * </p>
     * <p>
     * When an image is pulled, the BatchGetImage API is called once to retrieve the image manifest.
     * </p>
     * 
     * @param batchGetImageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetImage operation returned by the service.
     * @sample AmazonECRAsyncHandler.BatchGetImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/BatchGetImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetImageResult> batchGetImageAsync(BatchGetImageRequest batchGetImageRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetImageRequest, BatchGetImageResult> asyncHandler);

    /**
     * <p>
     * Informs Amazon ECR that the image layer upload has completed for a specified registry, repository name, and
     * upload ID. You can optionally provide a <code>sha256</code> digest of the image layer for data validation
     * purposes.
     * </p>
     * <p>
     * When an image is pushed, the CompleteLayerUpload API is called once per each new image layer to verify that the
     * upload has completed.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
     * and pushing images. In most cases, you should use the <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param completeLayerUploadRequest
     * @return A Java Future containing the result of the CompleteLayerUpload operation returned by the service.
     * @sample AmazonECRAsync.CompleteLayerUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/CompleteLayerUpload" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CompleteLayerUploadResult> completeLayerUploadAsync(CompleteLayerUploadRequest completeLayerUploadRequest);

    /**
     * <p>
     * Informs Amazon ECR that the image layer upload has completed for a specified registry, repository name, and
     * upload ID. You can optionally provide a <code>sha256</code> digest of the image layer for data validation
     * purposes.
     * </p>
     * <p>
     * When an image is pushed, the CompleteLayerUpload API is called once per each new image layer to verify that the
     * upload has completed.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
     * and pushing images. In most cases, you should use the <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param completeLayerUploadRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CompleteLayerUpload operation returned by the service.
     * @sample AmazonECRAsyncHandler.CompleteLayerUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/CompleteLayerUpload" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CompleteLayerUploadResult> completeLayerUploadAsync(CompleteLayerUploadRequest completeLayerUploadRequest,
            com.amazonaws.handlers.AsyncHandler<CompleteLayerUploadRequest, CompleteLayerUploadResult> asyncHandler);

    /**
     * <p>
     * Creates a repository. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/Repositories.html">Amazon ECR Repositories</a> in
     * the <i>Amazon Elastic Container Registry User Guide</i>.
     * </p>
     * 
     * @param createRepositoryRequest
     * @return A Java Future containing the result of the CreateRepository operation returned by the service.
     * @sample AmazonECRAsync.CreateRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/CreateRepository" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(CreateRepositoryRequest createRepositoryRequest);

    /**
     * <p>
     * Creates a repository. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/Repositories.html">Amazon ECR Repositories</a> in
     * the <i>Amazon Elastic Container Registry User Guide</i>.
     * </p>
     * 
     * @param createRepositoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRepository operation returned by the service.
     * @sample AmazonECRAsyncHandler.CreateRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/CreateRepository" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(CreateRepositoryRequest createRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRepositoryRequest, CreateRepositoryResult> asyncHandler);

    /**
     * <p>
     * Deletes the lifecycle policy associated with the specified repository.
     * </p>
     * 
     * @param deleteLifecyclePolicyRequest
     * @return A Java Future containing the result of the DeleteLifecyclePolicy operation returned by the service.
     * @sample AmazonECRAsync.DeleteLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/DeleteLifecyclePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLifecyclePolicyResult> deleteLifecyclePolicyAsync(DeleteLifecyclePolicyRequest deleteLifecyclePolicyRequest);

    /**
     * <p>
     * Deletes the lifecycle policy associated with the specified repository.
     * </p>
     * 
     * @param deleteLifecyclePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLifecyclePolicy operation returned by the service.
     * @sample AmazonECRAsyncHandler.DeleteLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/DeleteLifecyclePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLifecyclePolicyResult> deleteLifecyclePolicyAsync(DeleteLifecyclePolicyRequest deleteLifecyclePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLifecyclePolicyRequest, DeleteLifecyclePolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes a repository. If the repository contains images, you must either delete all images in the repository or
     * use the <code>force</code> option to delete the repository.
     * </p>
     * 
     * @param deleteRepositoryRequest
     * @return A Java Future containing the result of the DeleteRepository operation returned by the service.
     * @sample AmazonECRAsync.DeleteRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/DeleteRepository" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(DeleteRepositoryRequest deleteRepositoryRequest);

    /**
     * <p>
     * Deletes a repository. If the repository contains images, you must either delete all images in the repository or
     * use the <code>force</code> option to delete the repository.
     * </p>
     * 
     * @param deleteRepositoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRepository operation returned by the service.
     * @sample AmazonECRAsyncHandler.DeleteRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/DeleteRepository" target="_top">AWS API
     *      Documentation</a>
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
     * @sample AmazonECRAsync.DeleteRepositoryPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/DeleteRepositoryPolicy" target="_top">AWS API
     *      Documentation</a>
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
     * @sample AmazonECRAsyncHandler.DeleteRepositoryPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/DeleteRepositoryPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRepositoryPolicyResult> deleteRepositoryPolicyAsync(DeleteRepositoryPolicyRequest deleteRepositoryPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRepositoryPolicyRequest, DeleteRepositoryPolicyResult> asyncHandler);

    /**
     * <p>
     * Returns the scan findings for the specified image.
     * </p>
     * 
     * @param describeImageScanFindingsRequest
     * @return A Java Future containing the result of the DescribeImageScanFindings operation returned by the service.
     * @sample AmazonECRAsync.DescribeImageScanFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/DescribeImageScanFindings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeImageScanFindingsResult> describeImageScanFindingsAsync(
            DescribeImageScanFindingsRequest describeImageScanFindingsRequest);

    /**
     * <p>
     * Returns the scan findings for the specified image.
     * </p>
     * 
     * @param describeImageScanFindingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeImageScanFindings operation returned by the service.
     * @sample AmazonECRAsyncHandler.DescribeImageScanFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/DescribeImageScanFindings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeImageScanFindingsResult> describeImageScanFindingsAsync(
            DescribeImageScanFindingsRequest describeImageScanFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeImageScanFindingsRequest, DescribeImageScanFindingsResult> asyncHandler);

    /**
     * <p>
     * Returns metadata about the images in a repository.
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
     * @sample AmazonECRAsync.DescribeImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/DescribeImages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync(DescribeImagesRequest describeImagesRequest);

    /**
     * <p>
     * Returns metadata about the images in a repository.
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
     * @sample AmazonECRAsyncHandler.DescribeImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/DescribeImages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync(DescribeImagesRequest describeImagesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeImagesRequest, DescribeImagesResult> asyncHandler);

    /**
     * <p>
     * Describes image repositories in a registry.
     * </p>
     * 
     * @param describeRepositoriesRequest
     * @return A Java Future containing the result of the DescribeRepositories operation returned by the service.
     * @sample AmazonECRAsync.DescribeRepositories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/DescribeRepositories" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeRepositoriesResult> describeRepositoriesAsync(DescribeRepositoriesRequest describeRepositoriesRequest);

    /**
     * <p>
     * Describes image repositories in a registry.
     * </p>
     * 
     * @param describeRepositoriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRepositories operation returned by the service.
     * @sample AmazonECRAsyncHandler.DescribeRepositories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/DescribeRepositories" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeRepositoriesResult> describeRepositoriesAsync(DescribeRepositoriesRequest describeRepositoriesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRepositoriesRequest, DescribeRepositoriesResult> asyncHandler);

    /**
     * <p>
     * Retrieves an authorization token. An authorization token represents your IAM authentication credentials and can
     * be used to access any Amazon ECR registry that your IAM principal has access to. The authorization token is valid
     * for 12 hours.
     * </p>
     * <p>
     * The <code>authorizationToken</code> returned is a base64 encoded string that can be decoded and used in a
     * <code>docker login</code> command to authenticate to a registry. The AWS CLI offers an
     * <code>get-login-password</code> command that simplifies the login process. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/Registries.html#registry_auth">Registry
     * Authentication</a> in the <i>Amazon Elastic Container Registry User Guide</i>.
     * </p>
     * 
     * @param getAuthorizationTokenRequest
     * @return A Java Future containing the result of the GetAuthorizationToken operation returned by the service.
     * @sample AmazonECRAsync.GetAuthorizationToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/GetAuthorizationToken" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAuthorizationTokenResult> getAuthorizationTokenAsync(GetAuthorizationTokenRequest getAuthorizationTokenRequest);

    /**
     * <p>
     * Retrieves an authorization token. An authorization token represents your IAM authentication credentials and can
     * be used to access any Amazon ECR registry that your IAM principal has access to. The authorization token is valid
     * for 12 hours.
     * </p>
     * <p>
     * The <code>authorizationToken</code> returned is a base64 encoded string that can be decoded and used in a
     * <code>docker login</code> command to authenticate to a registry. The AWS CLI offers an
     * <code>get-login-password</code> command that simplifies the login process. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/Registries.html#registry_auth">Registry
     * Authentication</a> in the <i>Amazon Elastic Container Registry User Guide</i>.
     * </p>
     * 
     * @param getAuthorizationTokenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAuthorizationToken operation returned by the service.
     * @sample AmazonECRAsyncHandler.GetAuthorizationToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/GetAuthorizationToken" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAuthorizationTokenResult> getAuthorizationTokenAsync(GetAuthorizationTokenRequest getAuthorizationTokenRequest,
            com.amazonaws.handlers.AsyncHandler<GetAuthorizationTokenRequest, GetAuthorizationTokenResult> asyncHandler);

    /**
     * <p>
     * Retrieves the pre-signed Amazon S3 download URL corresponding to an image layer. You can only get URLs for image
     * layers that are referenced in an image.
     * </p>
     * <p>
     * When an image is pulled, the GetDownloadUrlForLayer API is called once per image layer.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
     * and pushing images. In most cases, you should use the <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param getDownloadUrlForLayerRequest
     * @return A Java Future containing the result of the GetDownloadUrlForLayer operation returned by the service.
     * @sample AmazonECRAsync.GetDownloadUrlForLayer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/GetDownloadUrlForLayer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDownloadUrlForLayerResult> getDownloadUrlForLayerAsync(GetDownloadUrlForLayerRequest getDownloadUrlForLayerRequest);

    /**
     * <p>
     * Retrieves the pre-signed Amazon S3 download URL corresponding to an image layer. You can only get URLs for image
     * layers that are referenced in an image.
     * </p>
     * <p>
     * When an image is pulled, the GetDownloadUrlForLayer API is called once per image layer.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
     * and pushing images. In most cases, you should use the <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param getDownloadUrlForLayerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDownloadUrlForLayer operation returned by the service.
     * @sample AmazonECRAsyncHandler.GetDownloadUrlForLayer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/GetDownloadUrlForLayer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDownloadUrlForLayerResult> getDownloadUrlForLayerAsync(GetDownloadUrlForLayerRequest getDownloadUrlForLayerRequest,
            com.amazonaws.handlers.AsyncHandler<GetDownloadUrlForLayerRequest, GetDownloadUrlForLayerResult> asyncHandler);

    /**
     * <p>
     * Retrieves the lifecycle policy for the specified repository.
     * </p>
     * 
     * @param getLifecyclePolicyRequest
     * @return A Java Future containing the result of the GetLifecyclePolicy operation returned by the service.
     * @sample AmazonECRAsync.GetLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/GetLifecyclePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLifecyclePolicyResult> getLifecyclePolicyAsync(GetLifecyclePolicyRequest getLifecyclePolicyRequest);

    /**
     * <p>
     * Retrieves the lifecycle policy for the specified repository.
     * </p>
     * 
     * @param getLifecyclePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLifecyclePolicy operation returned by the service.
     * @sample AmazonECRAsyncHandler.GetLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/GetLifecyclePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLifecyclePolicyResult> getLifecyclePolicyAsync(GetLifecyclePolicyRequest getLifecyclePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetLifecyclePolicyRequest, GetLifecyclePolicyResult> asyncHandler);

    /**
     * <p>
     * Retrieves the results of the lifecycle policy preview request for the specified repository.
     * </p>
     * 
     * @param getLifecyclePolicyPreviewRequest
     * @return A Java Future containing the result of the GetLifecyclePolicyPreview operation returned by the service.
     * @sample AmazonECRAsync.GetLifecyclePolicyPreview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/GetLifecyclePolicyPreview" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetLifecyclePolicyPreviewResult> getLifecyclePolicyPreviewAsync(
            GetLifecyclePolicyPreviewRequest getLifecyclePolicyPreviewRequest);

    /**
     * <p>
     * Retrieves the results of the lifecycle policy preview request for the specified repository.
     * </p>
     * 
     * @param getLifecyclePolicyPreviewRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLifecyclePolicyPreview operation returned by the service.
     * @sample AmazonECRAsyncHandler.GetLifecyclePolicyPreview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/GetLifecyclePolicyPreview" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetLifecyclePolicyPreviewResult> getLifecyclePolicyPreviewAsync(
            GetLifecyclePolicyPreviewRequest getLifecyclePolicyPreviewRequest,
            com.amazonaws.handlers.AsyncHandler<GetLifecyclePolicyPreviewRequest, GetLifecyclePolicyPreviewResult> asyncHandler);

    /**
     * <p>
     * Retrieves the repository policy for the specified repository.
     * </p>
     * 
     * @param getRepositoryPolicyRequest
     * @return A Java Future containing the result of the GetRepositoryPolicy operation returned by the service.
     * @sample AmazonECRAsync.GetRepositoryPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/GetRepositoryPolicy" target="_top">AWS API
     *      Documentation</a>
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
     * @sample AmazonECRAsyncHandler.GetRepositoryPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/GetRepositoryPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRepositoryPolicyResult> getRepositoryPolicyAsync(GetRepositoryPolicyRequest getRepositoryPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetRepositoryPolicyRequest, GetRepositoryPolicyResult> asyncHandler);

    /**
     * <p>
     * Notifies Amazon ECR that you intend to upload an image layer.
     * </p>
     * <p>
     * When an image is pushed, the InitiateLayerUpload API is called once per image layer that has not already been
     * uploaded. Whether an image layer has been uploaded before is determined by the <a>BatchCheckLayerAvailability</a>
     * API action.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
     * and pushing images. In most cases, you should use the <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param initiateLayerUploadRequest
     * @return A Java Future containing the result of the InitiateLayerUpload operation returned by the service.
     * @sample AmazonECRAsync.InitiateLayerUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/InitiateLayerUpload" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<InitiateLayerUploadResult> initiateLayerUploadAsync(InitiateLayerUploadRequest initiateLayerUploadRequest);

    /**
     * <p>
     * Notifies Amazon ECR that you intend to upload an image layer.
     * </p>
     * <p>
     * When an image is pushed, the InitiateLayerUpload API is called once per image layer that has not already been
     * uploaded. Whether an image layer has been uploaded before is determined by the <a>BatchCheckLayerAvailability</a>
     * API action.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
     * and pushing images. In most cases, you should use the <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param initiateLayerUploadRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InitiateLayerUpload operation returned by the service.
     * @sample AmazonECRAsyncHandler.InitiateLayerUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/InitiateLayerUpload" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<InitiateLayerUploadResult> initiateLayerUploadAsync(InitiateLayerUploadRequest initiateLayerUploadRequest,
            com.amazonaws.handlers.AsyncHandler<InitiateLayerUploadRequest, InitiateLayerUploadResult> asyncHandler);

    /**
     * <p>
     * Lists all the image IDs for the specified repository.
     * </p>
     * <p>
     * You can filter images based on whether or not they are tagged by using the <code>tagStatus</code> filter and
     * specifying either <code>TAGGED</code>, <code>UNTAGGED</code> or <code>ANY</code>. For example, you can filter
     * your results to return only <code>UNTAGGED</code> images and then pipe that result to a <a>BatchDeleteImage</a>
     * operation to delete them. Or, you can filter your results to return only <code>TAGGED</code> images to list all
     * of the tags in your repository.
     * </p>
     * 
     * @param listImagesRequest
     * @return A Java Future containing the result of the ListImages operation returned by the service.
     * @sample AmazonECRAsync.ListImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/ListImages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListImagesResult> listImagesAsync(ListImagesRequest listImagesRequest);

    /**
     * <p>
     * Lists all the image IDs for the specified repository.
     * </p>
     * <p>
     * You can filter images based on whether or not they are tagged by using the <code>tagStatus</code> filter and
     * specifying either <code>TAGGED</code>, <code>UNTAGGED</code> or <code>ANY</code>. For example, you can filter
     * your results to return only <code>UNTAGGED</code> images and then pipe that result to a <a>BatchDeleteImage</a>
     * operation to delete them. Or, you can filter your results to return only <code>TAGGED</code> images to list all
     * of the tags in your repository.
     * </p>
     * 
     * @param listImagesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListImages operation returned by the service.
     * @sample AmazonECRAsyncHandler.ListImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/ListImages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListImagesResult> listImagesAsync(ListImagesRequest listImagesRequest,
            com.amazonaws.handlers.AsyncHandler<ListImagesRequest, ListImagesResult> asyncHandler);

    /**
     * <p>
     * List the tags for an Amazon ECR resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonECRAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * List the tags for an Amazon ECR resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonECRAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Creates or updates the image manifest and tags associated with an image.
     * </p>
     * <p>
     * When an image is pushed and all new image layers have been uploaded, the PutImage API is called once to create or
     * update the image manifest and tags associated with the image.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
     * and pushing images. In most cases, you should use the <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param putImageRequest
     * @return A Java Future containing the result of the PutImage operation returned by the service.
     * @sample AmazonECRAsync.PutImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/PutImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutImageResult> putImageAsync(PutImageRequest putImageRequest);

    /**
     * <p>
     * Creates or updates the image manifest and tags associated with an image.
     * </p>
     * <p>
     * When an image is pushed and all new image layers have been uploaded, the PutImage API is called once to create or
     * update the image manifest and tags associated with the image.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
     * and pushing images. In most cases, you should use the <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param putImageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutImage operation returned by the service.
     * @sample AmazonECRAsyncHandler.PutImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/PutImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutImageResult> putImageAsync(PutImageRequest putImageRequest,
            com.amazonaws.handlers.AsyncHandler<PutImageRequest, PutImageResult> asyncHandler);

    /**
     * <p>
     * Updates the image scanning configuration for the specified repository.
     * </p>
     * 
     * @param putImageScanningConfigurationRequest
     * @return A Java Future containing the result of the PutImageScanningConfiguration operation returned by the
     *         service.
     * @sample AmazonECRAsync.PutImageScanningConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/PutImageScanningConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutImageScanningConfigurationResult> putImageScanningConfigurationAsync(
            PutImageScanningConfigurationRequest putImageScanningConfigurationRequest);

    /**
     * <p>
     * Updates the image scanning configuration for the specified repository.
     * </p>
     * 
     * @param putImageScanningConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutImageScanningConfiguration operation returned by the
     *         service.
     * @sample AmazonECRAsyncHandler.PutImageScanningConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/PutImageScanningConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutImageScanningConfigurationResult> putImageScanningConfigurationAsync(
            PutImageScanningConfigurationRequest putImageScanningConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutImageScanningConfigurationRequest, PutImageScanningConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates the image tag mutability settings for the specified repository. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-tag-mutability.html">Image Tag Mutability</a>
     * in the <i>Amazon Elastic Container Registry User Guide</i>.
     * </p>
     * 
     * @param putImageTagMutabilityRequest
     * @return A Java Future containing the result of the PutImageTagMutability operation returned by the service.
     * @sample AmazonECRAsync.PutImageTagMutability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/PutImageTagMutability" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutImageTagMutabilityResult> putImageTagMutabilityAsync(PutImageTagMutabilityRequest putImageTagMutabilityRequest);

    /**
     * <p>
     * Updates the image tag mutability settings for the specified repository. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-tag-mutability.html">Image Tag Mutability</a>
     * in the <i>Amazon Elastic Container Registry User Guide</i>.
     * </p>
     * 
     * @param putImageTagMutabilityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutImageTagMutability operation returned by the service.
     * @sample AmazonECRAsyncHandler.PutImageTagMutability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/PutImageTagMutability" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutImageTagMutabilityResult> putImageTagMutabilityAsync(PutImageTagMutabilityRequest putImageTagMutabilityRequest,
            com.amazonaws.handlers.AsyncHandler<PutImageTagMutabilityRequest, PutImageTagMutabilityResult> asyncHandler);

    /**
     * <p>
     * Creates or updates the lifecycle policy for the specified repository. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html">Lifecycle Policy
     * Template</a>.
     * </p>
     * 
     * @param putLifecyclePolicyRequest
     * @return A Java Future containing the result of the PutLifecyclePolicy operation returned by the service.
     * @sample AmazonECRAsync.PutLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/PutLifecyclePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutLifecyclePolicyResult> putLifecyclePolicyAsync(PutLifecyclePolicyRequest putLifecyclePolicyRequest);

    /**
     * <p>
     * Creates or updates the lifecycle policy for the specified repository. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html">Lifecycle Policy
     * Template</a>.
     * </p>
     * 
     * @param putLifecyclePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutLifecyclePolicy operation returned by the service.
     * @sample AmazonECRAsyncHandler.PutLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/PutLifecyclePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutLifecyclePolicyResult> putLifecyclePolicyAsync(PutLifecyclePolicyRequest putLifecyclePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutLifecyclePolicyRequest, PutLifecyclePolicyResult> asyncHandler);

    /**
     * <p>
     * Applies a repository policy to the specified repository to control access permissions. For more information, see
     * <a href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/RepositoryPolicies.html">Amazon ECR Repository
     * Policies</a> in the <i>Amazon Elastic Container Registry User Guide</i>.
     * </p>
     * 
     * @param setRepositoryPolicyRequest
     * @return A Java Future containing the result of the SetRepositoryPolicy operation returned by the service.
     * @sample AmazonECRAsync.SetRepositoryPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/SetRepositoryPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SetRepositoryPolicyResult> setRepositoryPolicyAsync(SetRepositoryPolicyRequest setRepositoryPolicyRequest);

    /**
     * <p>
     * Applies a repository policy to the specified repository to control access permissions. For more information, see
     * <a href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/RepositoryPolicies.html">Amazon ECR Repository
     * Policies</a> in the <i>Amazon Elastic Container Registry User Guide</i>.
     * </p>
     * 
     * @param setRepositoryPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetRepositoryPolicy operation returned by the service.
     * @sample AmazonECRAsyncHandler.SetRepositoryPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/SetRepositoryPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SetRepositoryPolicyResult> setRepositoryPolicyAsync(SetRepositoryPolicyRequest setRepositoryPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<SetRepositoryPolicyRequest, SetRepositoryPolicyResult> asyncHandler);

    /**
     * <p>
     * Starts an image vulnerability scan. An image scan can only be started once per day on an individual image. This
     * limit includes if an image was scanned on initial push. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-scanning.html">Image Scanning</a> in the
     * <i>Amazon Elastic Container Registry User Guide</i>.
     * </p>
     * 
     * @param startImageScanRequest
     * @return A Java Future containing the result of the StartImageScan operation returned by the service.
     * @sample AmazonECRAsync.StartImageScan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/StartImageScan" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartImageScanResult> startImageScanAsync(StartImageScanRequest startImageScanRequest);

    /**
     * <p>
     * Starts an image vulnerability scan. An image scan can only be started once per day on an individual image. This
     * limit includes if an image was scanned on initial push. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-scanning.html">Image Scanning</a> in the
     * <i>Amazon Elastic Container Registry User Guide</i>.
     * </p>
     * 
     * @param startImageScanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartImageScan operation returned by the service.
     * @sample AmazonECRAsyncHandler.StartImageScan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/StartImageScan" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartImageScanResult> startImageScanAsync(StartImageScanRequest startImageScanRequest,
            com.amazonaws.handlers.AsyncHandler<StartImageScanRequest, StartImageScanResult> asyncHandler);

    /**
     * <p>
     * Starts a preview of a lifecycle policy for the specified repository. This allows you to see the results before
     * associating the lifecycle policy with the repository.
     * </p>
     * 
     * @param startLifecyclePolicyPreviewRequest
     * @return A Java Future containing the result of the StartLifecyclePolicyPreview operation returned by the service.
     * @sample AmazonECRAsync.StartLifecyclePolicyPreview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/StartLifecyclePolicyPreview"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartLifecyclePolicyPreviewResult> startLifecyclePolicyPreviewAsync(
            StartLifecyclePolicyPreviewRequest startLifecyclePolicyPreviewRequest);

    /**
     * <p>
     * Starts a preview of a lifecycle policy for the specified repository. This allows you to see the results before
     * associating the lifecycle policy with the repository.
     * </p>
     * 
     * @param startLifecyclePolicyPreviewRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartLifecyclePolicyPreview operation returned by the service.
     * @sample AmazonECRAsyncHandler.StartLifecyclePolicyPreview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/StartLifecyclePolicyPreview"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartLifecyclePolicyPreviewResult> startLifecyclePolicyPreviewAsync(
            StartLifecyclePolicyPreviewRequest startLifecyclePolicyPreviewRequest,
            com.amazonaws.handlers.AsyncHandler<StartLifecyclePolicyPreviewRequest, StartLifecyclePolicyPreviewResult> asyncHandler);

    /**
     * <p>
     * Adds specified tags to a resource with the specified ARN. Existing tags on a resource are not changed if they are
     * not specified in the request parameters.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonECRAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds specified tags to a resource with the specified ARN. Existing tags on a resource are not changed if they are
     * not specified in the request parameters.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonECRAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/TagResource" target="_top">AWS API
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
     * @sample AmazonECRAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/UntagResource" target="_top">AWS API
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
     * @sample AmazonECRAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/UntagResource" target="_top">AWS API
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
     * This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
     * and pushing images. In most cases, you should use the <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param uploadLayerPartRequest
     * @return A Java Future containing the result of the UploadLayerPart operation returned by the service.
     * @sample AmazonECRAsync.UploadLayerPart
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/UploadLayerPart" target="_top">AWS API
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
     * This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
     * and pushing images. In most cases, you should use the <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param uploadLayerPartRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UploadLayerPart operation returned by the service.
     * @sample AmazonECRAsyncHandler.UploadLayerPart
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/UploadLayerPart" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UploadLayerPartResult> uploadLayerPartAsync(UploadLayerPartRequest uploadLayerPartRequest,
            com.amazonaws.handlers.AsyncHandler<UploadLayerPartRequest, UploadLayerPartResult> asyncHandler);

}
