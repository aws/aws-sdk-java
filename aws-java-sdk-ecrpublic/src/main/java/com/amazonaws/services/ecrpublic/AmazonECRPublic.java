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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.ecrpublic.model.*;

/**
 * Interface for accessing Amazon ECR Public.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ecrpublic.AbstractAmazonECRPublic} instead.
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
public interface AmazonECRPublic {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "api.ecr-public";

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
    BatchCheckLayerAvailabilityResult batchCheckLayerAvailability(BatchCheckLayerAvailabilityRequest batchCheckLayerAvailabilityRequest);

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
    BatchDeleteImageResult batchDeleteImage(BatchDeleteImageRequest batchDeleteImageRequest);

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
    CompleteLayerUploadResult completeLayerUpload(CompleteLayerUploadRequest completeLayerUploadRequest);

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
    CreateRepositoryResult createRepository(CreateRepositoryRequest createRepositoryRequest);

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
    DeleteRepositoryResult deleteRepository(DeleteRepositoryRequest deleteRepositoryRequest);

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
    DeleteRepositoryPolicyResult deleteRepositoryPolicy(DeleteRepositoryPolicyRequest deleteRepositoryPolicyRequest);

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
    DescribeImageTagsResult describeImageTags(DescribeImageTagsRequest describeImageTagsRequest);

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
    DescribeImagesResult describeImages(DescribeImagesRequest describeImagesRequest);

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
    DescribeRegistriesResult describeRegistries(DescribeRegistriesRequest describeRegistriesRequest);

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
    DescribeRepositoriesResult describeRepositories(DescribeRepositoriesRequest describeRepositoriesRequest);

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
    GetAuthorizationTokenResult getAuthorizationToken(GetAuthorizationTokenRequest getAuthorizationTokenRequest);

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
    GetRegistryCatalogDataResult getRegistryCatalogData(GetRegistryCatalogDataRequest getRegistryCatalogDataRequest);

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
    GetRepositoryCatalogDataResult getRepositoryCatalogData(GetRepositoryCatalogDataRequest getRepositoryCatalogDataRequest);

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
    GetRepositoryPolicyResult getRepositoryPolicy(GetRepositoryPolicyRequest getRepositoryPolicyRequest);

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
    InitiateLayerUploadResult initiateLayerUpload(InitiateLayerUploadRequest initiateLayerUploadRequest);

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
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

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
    PutImageResult putImage(PutImageRequest putImageRequest);

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
    PutRegistryCatalogDataResult putRegistryCatalogData(PutRegistryCatalogDataRequest putRegistryCatalogDataRequest);

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
    PutRepositoryCatalogDataResult putRepositoryCatalogData(PutRepositoryCatalogDataRequest putRepositoryCatalogDataRequest);

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
    SetRepositoryPolicyResult setRepositoryPolicy(SetRepositoryPolicyRequest setRepositoryPolicyRequest);

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
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

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
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
    UploadLayerPartResult uploadLayerPart(UploadLayerPartRequest uploadLayerPartRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
