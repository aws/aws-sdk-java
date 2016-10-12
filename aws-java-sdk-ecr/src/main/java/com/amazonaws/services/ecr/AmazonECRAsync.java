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

import com.amazonaws.services.ecr.model.*;

/**
 * Interface for accessing Amazon ECR asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon EC2 Container Registry (Amazon ECR) is a managed AWS Docker registry service. Customers can use the familiar
 * Docker CLI to push, pull, and manage images. Amazon ECR provides a secure, scalable, and reliable registry. Amazon
 * ECR supports private Docker repositories with resource-based permissions using AWS IAM so that specific users or
 * Amazon EC2 instances can access repositories and images. Developers can use the Docker CLI to author and manage
 * images.
 * </p>
 */
public interface AmazonECRAsync extends AmazonECR {

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
     * @return A Java Future containing the result of the BatchCheckLayerAvailability operation returned by the service.
     * @sample AmazonECRAsync.BatchCheckLayerAvailability
     */
    java.util.concurrent.Future<BatchCheckLayerAvailabilityResult> batchCheckLayerAvailabilityAsync(
            BatchCheckLayerAvailabilityRequest batchCheckLayerAvailabilityRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchCheckLayerAvailability operation returned by the service.
     * @sample AmazonECRAsyncHandler.BatchCheckLayerAvailability
     */
    java.util.concurrent.Future<BatchCheckLayerAvailabilityResult> batchCheckLayerAvailabilityAsync(
            BatchCheckLayerAvailabilityRequest batchCheckLayerAvailabilityRequest,
            com.amazonaws.handlers.AsyncHandler<BatchCheckLayerAvailabilityRequest, BatchCheckLayerAvailabilityResult> asyncHandler);

    /**
     * <p>
     * Deletes a list of specified images within a specified repository. Images are specified with either
     * <code>imageTag</code> or <code>imageDigest</code>.
     * </p>
     * 
     * @param batchDeleteImageRequest
     *        Deletes specified images within a specified repository. Images are specified with either the
     *        <code>imageTag</code> or <code>imageDigest</code>.
     * @return A Java Future containing the result of the BatchDeleteImage operation returned by the service.
     * @sample AmazonECRAsync.BatchDeleteImage
     */
    java.util.concurrent.Future<BatchDeleteImageResult> batchDeleteImageAsync(BatchDeleteImageRequest batchDeleteImageRequest);

    /**
     * <p>
     * Deletes a list of specified images within a specified repository. Images are specified with either
     * <code>imageTag</code> or <code>imageDigest</code>.
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
     */
    java.util.concurrent.Future<BatchDeleteImageResult> batchDeleteImageAsync(BatchDeleteImageRequest batchDeleteImageRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteImageRequest, BatchDeleteImageResult> asyncHandler);

    /**
     * <p>
     * Gets detailed information for specified images within a specified repository. Images are specified with either
     * <code>imageTag</code> or <code>imageDigest</code>.
     * </p>
     * 
     * @param batchGetImageRequest
     * @return A Java Future containing the result of the BatchGetImage operation returned by the service.
     * @sample AmazonECRAsync.BatchGetImage
     */
    java.util.concurrent.Future<BatchGetImageResult> batchGetImageAsync(BatchGetImageRequest batchGetImageRequest);

    /**
     * <p>
     * Gets detailed information for specified images within a specified repository. Images are specified with either
     * <code>imageTag</code> or <code>imageDigest</code>.
     * </p>
     * 
     * @param batchGetImageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetImage operation returned by the service.
     * @sample AmazonECRAsyncHandler.BatchGetImage
     */
    java.util.concurrent.Future<BatchGetImageResult> batchGetImageAsync(BatchGetImageRequest batchGetImageRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetImageRequest, BatchGetImageResult> asyncHandler);

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
     * @return A Java Future containing the result of the CompleteLayerUpload operation returned by the service.
     * @sample AmazonECRAsync.CompleteLayerUpload
     */
    java.util.concurrent.Future<CompleteLayerUploadResult> completeLayerUploadAsync(CompleteLayerUploadRequest completeLayerUploadRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CompleteLayerUpload operation returned by the service.
     * @sample AmazonECRAsyncHandler.CompleteLayerUpload
     */
    java.util.concurrent.Future<CompleteLayerUploadResult> completeLayerUploadAsync(CompleteLayerUploadRequest completeLayerUploadRequest,
            com.amazonaws.handlers.AsyncHandler<CompleteLayerUploadRequest, CompleteLayerUploadResult> asyncHandler);

    /**
     * <p>
     * Creates an image repository.
     * </p>
     * 
     * @param createRepositoryRequest
     * @return A Java Future containing the result of the CreateRepository operation returned by the service.
     * @sample AmazonECRAsync.CreateRepository
     */
    java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(CreateRepositoryRequest createRepositoryRequest);

    /**
     * <p>
     * Creates an image repository.
     * </p>
     * 
     * @param createRepositoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRepository operation returned by the service.
     * @sample AmazonECRAsyncHandler.CreateRepository
     */
    java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(CreateRepositoryRequest createRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRepositoryRequest, CreateRepositoryResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing image repository. If a repository contains images, you must use the <code>force</code> option
     * to delete it.
     * </p>
     * 
     * @param deleteRepositoryRequest
     * @return A Java Future containing the result of the DeleteRepository operation returned by the service.
     * @sample AmazonECRAsync.DeleteRepository
     */
    java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(DeleteRepositoryRequest deleteRepositoryRequest);

    /**
     * <p>
     * Deletes an existing image repository. If a repository contains images, you must use the <code>force</code> option
     * to delete it.
     * </p>
     * 
     * @param deleteRepositoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRepository operation returned by the service.
     * @sample AmazonECRAsyncHandler.DeleteRepository
     */
    java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(DeleteRepositoryRequest deleteRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRepositoryRequest, DeleteRepositoryResult> asyncHandler);

    /**
     * <p>
     * Deletes the repository policy from a specified repository.
     * </p>
     * 
     * @param deleteRepositoryPolicyRequest
     * @return A Java Future containing the result of the DeleteRepositoryPolicy operation returned by the service.
     * @sample AmazonECRAsync.DeleteRepositoryPolicy
     */
    java.util.concurrent.Future<DeleteRepositoryPolicyResult> deleteRepositoryPolicyAsync(DeleteRepositoryPolicyRequest deleteRepositoryPolicyRequest);

    /**
     * <p>
     * Deletes the repository policy from a specified repository.
     * </p>
     * 
     * @param deleteRepositoryPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRepositoryPolicy operation returned by the service.
     * @sample AmazonECRAsyncHandler.DeleteRepositoryPolicy
     */
    java.util.concurrent.Future<DeleteRepositoryPolicyResult> deleteRepositoryPolicyAsync(DeleteRepositoryPolicyRequest deleteRepositoryPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRepositoryPolicyRequest, DeleteRepositoryPolicyResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeImages operation returned by the service.
     * @sample AmazonECRAsync.DescribeImages
     */
    java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync(DescribeImagesRequest describeImagesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeImages operation returned by the service.
     * @sample AmazonECRAsyncHandler.DescribeImages
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
     */
    java.util.concurrent.Future<DescribeRepositoriesResult> describeRepositoriesAsync(DescribeRepositoriesRequest describeRepositoriesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRepositoriesRequest, DescribeRepositoriesResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetAuthorizationToken operation returned by the service.
     * @sample AmazonECRAsync.GetAuthorizationToken
     */
    java.util.concurrent.Future<GetAuthorizationTokenResult> getAuthorizationTokenAsync(GetAuthorizationTokenRequest getAuthorizationTokenRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAuthorizationToken operation returned by the service.
     * @sample AmazonECRAsyncHandler.GetAuthorizationToken
     */
    java.util.concurrent.Future<GetAuthorizationTokenResult> getAuthorizationTokenAsync(GetAuthorizationTokenRequest getAuthorizationTokenRequest,
            com.amazonaws.handlers.AsyncHandler<GetAuthorizationTokenRequest, GetAuthorizationTokenResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetDownloadUrlForLayer operation returned by the service.
     * @sample AmazonECRAsync.GetDownloadUrlForLayer
     */
    java.util.concurrent.Future<GetDownloadUrlForLayerResult> getDownloadUrlForLayerAsync(GetDownloadUrlForLayerRequest getDownloadUrlForLayerRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDownloadUrlForLayer operation returned by the service.
     * @sample AmazonECRAsyncHandler.GetDownloadUrlForLayer
     */
    java.util.concurrent.Future<GetDownloadUrlForLayerResult> getDownloadUrlForLayerAsync(GetDownloadUrlForLayerRequest getDownloadUrlForLayerRequest,
            com.amazonaws.handlers.AsyncHandler<GetDownloadUrlForLayerRequest, GetDownloadUrlForLayerResult> asyncHandler);

    /**
     * <p>
     * Retrieves the repository policy for a specified repository.
     * </p>
     * 
     * @param getRepositoryPolicyRequest
     * @return A Java Future containing the result of the GetRepositoryPolicy operation returned by the service.
     * @sample AmazonECRAsync.GetRepositoryPolicy
     */
    java.util.concurrent.Future<GetRepositoryPolicyResult> getRepositoryPolicyAsync(GetRepositoryPolicyRequest getRepositoryPolicyRequest);

    /**
     * <p>
     * Retrieves the repository policy for a specified repository.
     * </p>
     * 
     * @param getRepositoryPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRepositoryPolicy operation returned by the service.
     * @sample AmazonECRAsyncHandler.GetRepositoryPolicy
     */
    java.util.concurrent.Future<GetRepositoryPolicyResult> getRepositoryPolicyAsync(GetRepositoryPolicyRequest getRepositoryPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetRepositoryPolicyRequest, GetRepositoryPolicyResult> asyncHandler);

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
     * @return A Java Future containing the result of the InitiateLayerUpload operation returned by the service.
     * @sample AmazonECRAsync.InitiateLayerUpload
     */
    java.util.concurrent.Future<InitiateLayerUploadResult> initiateLayerUploadAsync(InitiateLayerUploadRequest initiateLayerUploadRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InitiateLayerUpload operation returned by the service.
     * @sample AmazonECRAsyncHandler.InitiateLayerUpload
     */
    java.util.concurrent.Future<InitiateLayerUploadResult> initiateLayerUploadAsync(InitiateLayerUploadRequest initiateLayerUploadRequest,
            com.amazonaws.handlers.AsyncHandler<InitiateLayerUploadRequest, InitiateLayerUploadResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListImages operation returned by the service.
     * @sample AmazonECRAsync.ListImages
     */
    java.util.concurrent.Future<ListImagesResult> listImagesAsync(ListImagesRequest listImagesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListImages operation returned by the service.
     * @sample AmazonECRAsyncHandler.ListImages
     */
    java.util.concurrent.Future<ListImagesResult> listImagesAsync(ListImagesRequest listImagesRequest,
            com.amazonaws.handlers.AsyncHandler<ListImagesRequest, ListImagesResult> asyncHandler);

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
     * @return A Java Future containing the result of the PutImage operation returned by the service.
     * @sample AmazonECRAsync.PutImage
     */
    java.util.concurrent.Future<PutImageResult> putImageAsync(PutImageRequest putImageRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutImage operation returned by the service.
     * @sample AmazonECRAsyncHandler.PutImage
     */
    java.util.concurrent.Future<PutImageResult> putImageAsync(PutImageRequest putImageRequest,
            com.amazonaws.handlers.AsyncHandler<PutImageRequest, PutImageResult> asyncHandler);

    /**
     * <p>
     * Applies a repository policy on a specified repository to control access permissions.
     * </p>
     * 
     * @param setRepositoryPolicyRequest
     * @return A Java Future containing the result of the SetRepositoryPolicy operation returned by the service.
     * @sample AmazonECRAsync.SetRepositoryPolicy
     */
    java.util.concurrent.Future<SetRepositoryPolicyResult> setRepositoryPolicyAsync(SetRepositoryPolicyRequest setRepositoryPolicyRequest);

    /**
     * <p>
     * Applies a repository policy on a specified repository to control access permissions.
     * </p>
     * 
     * @param setRepositoryPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetRepositoryPolicy operation returned by the service.
     * @sample AmazonECRAsyncHandler.SetRepositoryPolicy
     */
    java.util.concurrent.Future<SetRepositoryPolicyResult> setRepositoryPolicyAsync(SetRepositoryPolicyRequest setRepositoryPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<SetRepositoryPolicyRequest, SetRepositoryPolicyResult> asyncHandler);

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
     * @return A Java Future containing the result of the UploadLayerPart operation returned by the service.
     * @sample AmazonECRAsync.UploadLayerPart
     */
    java.util.concurrent.Future<UploadLayerPartResult> uploadLayerPartAsync(UploadLayerPartRequest uploadLayerPartRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UploadLayerPart operation returned by the service.
     * @sample AmazonECRAsyncHandler.UploadLayerPart
     */
    java.util.concurrent.Future<UploadLayerPartResult> uploadLayerPartAsync(UploadLayerPartRequest uploadLayerPartRequest,
            com.amazonaws.handlers.AsyncHandler<UploadLayerPartRequest, UploadLayerPartResult> asyncHandler);

}
