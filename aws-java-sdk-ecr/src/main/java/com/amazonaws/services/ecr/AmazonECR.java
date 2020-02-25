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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.ecr.model.*;
import com.amazonaws.services.ecr.waiters.AmazonECRWaiters;

/**
 * Interface for accessing Amazon ECR.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ecr.AbstractAmazonECR} instead.
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
public interface AmazonECR {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "api.ecr";

    /**
     * Overrides the default endpoint for this client ("api.ecr.us-east-1.amazonaws.com"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "api.ecr.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "api.ecr.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol
     * from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "api.ecr.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "api.ecr.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonECR#setEndpoint(String)}, sets the regional endpoint for this client's service
     * calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

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
     * @return Result of the BatchCheckLayerAvailability operation returned by the service.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @sample AmazonECR.BatchCheckLayerAvailability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/BatchCheckLayerAvailability"
     *      target="_top">AWS API Documentation</a>
     */
    BatchCheckLayerAvailabilityResult batchCheckLayerAvailability(BatchCheckLayerAvailabilityRequest batchCheckLayerAvailabilityRequest);

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
     * @return Result of the BatchDeleteImage operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @sample AmazonECR.BatchDeleteImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/BatchDeleteImage" target="_top">AWS API
     *      Documentation</a>
     */
    BatchDeleteImageResult batchDeleteImage(BatchDeleteImageRequest batchDeleteImageRequest);

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
     * @return Result of the BatchGetImage operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @sample AmazonECR.BatchGetImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/BatchGetImage" target="_top">AWS API
     *      Documentation</a>
     */
    BatchGetImageResult batchGetImage(BatchGetImageRequest batchGetImageRequest);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/CompleteLayerUpload" target="_top">AWS API
     *      Documentation</a>
     */
    CompleteLayerUploadResult completeLayerUpload(CompleteLayerUploadRequest completeLayerUploadRequest);

    /**
     * <p>
     * Creates a repository. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/Repositories.html">Amazon ECR Repositories</a> in
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
     *         href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/service_limits.html">Amazon ECR Default
     *         Service Limits</a> in the Amazon Elastic Container Registry User Guide.
     * @sample AmazonECR.CreateRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/CreateRepository" target="_top">AWS API
     *      Documentation</a>
     */
    CreateRepositoryResult createRepository(CreateRepositoryRequest createRepositoryRequest);

    /**
     * <p>
     * Deletes the lifecycle policy associated with the specified repository.
     * </p>
     * 
     * @param deleteLifecyclePolicyRequest
     * @return Result of the DeleteLifecyclePolicy operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @throws LifecyclePolicyNotFoundException
     *         The lifecycle policy could not be found, and no policy is set to the repository.
     * @sample AmazonECR.DeleteLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/DeleteLifecyclePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteLifecyclePolicyResult deleteLifecyclePolicy(DeleteLifecyclePolicyRequest deleteLifecyclePolicyRequest);

    /**
     * <p>
     * Deletes a repository. If the repository contains images, you must either delete all images in the repository or
     * use the <code>force</code> option to delete the repository.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/DeleteRepository" target="_top">AWS API
     *      Documentation</a>
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
     * @sample AmazonECR.DeleteRepositoryPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/DeleteRepositoryPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteRepositoryPolicyResult deleteRepositoryPolicy(DeleteRepositoryPolicyRequest deleteRepositoryPolicyRequest);

    /**
     * <p>
     * Returns the scan findings for the specified image.
     * </p>
     * 
     * @param describeImageScanFindingsRequest
     * @return Result of the DescribeImageScanFindings operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @throws ImageNotFoundException
     *         The image requested does not exist in the specified repository.
     * @throws ScanNotFoundException
     *         The specified image scan could not be found. Ensure that image scanning is enabled on the repository and
     *         try again.
     * @sample AmazonECR.DescribeImageScanFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/DescribeImageScanFindings" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeImageScanFindingsResult describeImageScanFindings(DescribeImageScanFindingsRequest describeImageScanFindingsRequest);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/DescribeImages" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeImagesResult describeImages(DescribeImagesRequest describeImagesRequest);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/DescribeRepositories" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeRepositoriesResult describeRepositories(DescribeRepositoriesRequest describeRepositoriesRequest);

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
     * @return Result of the GetAuthorizationToken operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECR.GetAuthorizationToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/GetAuthorizationToken" target="_top">AWS API
     *      Documentation</a>
     */
    GetAuthorizationTokenResult getAuthorizationToken(GetAuthorizationTokenRequest getAuthorizationTokenRequest);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/GetDownloadUrlForLayer" target="_top">AWS API
     *      Documentation</a>
     */
    GetDownloadUrlForLayerResult getDownloadUrlForLayer(GetDownloadUrlForLayerRequest getDownloadUrlForLayerRequest);

    /**
     * <p>
     * Retrieves the lifecycle policy for the specified repository.
     * </p>
     * 
     * @param getLifecyclePolicyRequest
     * @return Result of the GetLifecyclePolicy operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @throws LifecyclePolicyNotFoundException
     *         The lifecycle policy could not be found, and no policy is set to the repository.
     * @sample AmazonECR.GetLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/GetLifecyclePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    GetLifecyclePolicyResult getLifecyclePolicy(GetLifecyclePolicyRequest getLifecyclePolicyRequest);

    /**
     * <p>
     * Retrieves the results of the lifecycle policy preview request for the specified repository.
     * </p>
     * 
     * @param getLifecyclePolicyPreviewRequest
     * @return Result of the GetLifecyclePolicyPreview operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @throws LifecyclePolicyPreviewNotFoundException
     *         There is no dry run for this repository.
     * @sample AmazonECR.GetLifecyclePolicyPreview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/GetLifecyclePolicyPreview" target="_top">AWS
     *      API Documentation</a>
     */
    GetLifecyclePolicyPreviewResult getLifecyclePolicyPreview(GetLifecyclePolicyPreviewRequest getLifecyclePolicyPreviewRequest);

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
     * @sample AmazonECR.GetRepositoryPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/GetRepositoryPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    GetRepositoryPolicyResult getRepositoryPolicy(GetRepositoryPolicyRequest getRepositoryPolicyRequest);

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
     * @return Result of the InitiateLayerUpload operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @sample AmazonECR.InitiateLayerUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/InitiateLayerUpload" target="_top">AWS API
     *      Documentation</a>
     */
    InitiateLayerUploadResult initiateLayerUpload(InitiateLayerUploadRequest initiateLayerUploadRequest);

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
     * @return Result of the ListImages operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @sample AmazonECR.ListImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/ListImages" target="_top">AWS API
     *      Documentation</a>
     */
    ListImagesResult listImages(ListImagesRequest listImagesRequest);

    /**
     * <p>
     * List the tags for an Amazon ECR resource.
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
     * @sample AmazonECR.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

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
     * @throws LimitExceededException
     *         The operation did not succeed because it would have exceeded a service limit for your account. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/service_limits.html">Amazon ECR Default
     *         Service Limits</a> in the Amazon Elastic Container Registry User Guide.
     * @throws ImageTagAlreadyExistsException
     *         The specified image is tagged with a tag that already exists. The repository is configured for tag
     *         immutability.
     * @sample AmazonECR.PutImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/PutImage" target="_top">AWS API
     *      Documentation</a>
     */
    PutImageResult putImage(PutImageRequest putImageRequest);

    /**
     * <p>
     * Updates the image scanning configuration for the specified repository.
     * </p>
     * 
     * @param putImageScanningConfigurationRequest
     * @return Result of the PutImageScanningConfiguration operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @sample AmazonECR.PutImageScanningConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/PutImageScanningConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    PutImageScanningConfigurationResult putImageScanningConfiguration(PutImageScanningConfigurationRequest putImageScanningConfigurationRequest);

    /**
     * <p>
     * Updates the image tag mutability settings for the specified repository. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-tag-mutability.html">Image Tag Mutability</a>
     * in the <i>Amazon Elastic Container Registry User Guide</i>.
     * </p>
     * 
     * @param putImageTagMutabilityRequest
     * @return Result of the PutImageTagMutability operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @sample AmazonECR.PutImageTagMutability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/PutImageTagMutability" target="_top">AWS API
     *      Documentation</a>
     */
    PutImageTagMutabilityResult putImageTagMutability(PutImageTagMutabilityRequest putImageTagMutabilityRequest);

    /**
     * <p>
     * Creates or updates the lifecycle policy for the specified repository. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html">Lifecycle Policy
     * Template</a>.
     * </p>
     * 
     * @param putLifecyclePolicyRequest
     * @return Result of the PutLifecyclePolicy operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @sample AmazonECR.PutLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/PutLifecyclePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    PutLifecyclePolicyResult putLifecyclePolicy(PutLifecyclePolicyRequest putLifecyclePolicyRequest);

    /**
     * <p>
     * Applies a repository policy to the specified repository to control access permissions. For more information, see
     * <a href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/RepositoryPolicies.html">Amazon ECR Repository
     * Policies</a> in the <i>Amazon Elastic Container Registry User Guide</i>.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/SetRepositoryPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    SetRepositoryPolicyResult setRepositoryPolicy(SetRepositoryPolicyRequest setRepositoryPolicyRequest);

    /**
     * <p>
     * Starts an image vulnerability scan. An image scan can only be started once per day on an individual image. This
     * limit includes if an image was scanned on initial push. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-scanning.html">Image Scanning</a> in the
     * <i>Amazon Elastic Container Registry User Guide</i>.
     * </p>
     * 
     * @param startImageScanRequest
     * @return Result of the StartImageScan operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @throws ImageNotFoundException
     *         The image requested does not exist in the specified repository.
     * @sample AmazonECR.StartImageScan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/StartImageScan" target="_top">AWS API
     *      Documentation</a>
     */
    StartImageScanResult startImageScan(StartImageScanRequest startImageScanRequest);

    /**
     * <p>
     * Starts a preview of a lifecycle policy for the specified repository. This allows you to see the results before
     * associating the lifecycle policy with the repository.
     * </p>
     * 
     * @param startLifecyclePolicyPreviewRequest
     * @return Result of the StartLifecyclePolicyPreview operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling of the specified repository and ensure
     *         that you are performing operations on the correct registry.
     * @throws LifecyclePolicyNotFoundException
     *         The lifecycle policy could not be found, and no policy is set to the repository.
     * @throws LifecyclePolicyPreviewInProgressException
     *         The previous lifecycle policy preview request has not completed. Please try again later.
     * @sample AmazonECR.StartLifecyclePolicyPreview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/StartLifecyclePolicyPreview"
     *      target="_top">AWS API Documentation</a>
     */
    StartLifecyclePolicyPreviewResult startLifecyclePolicyPreview(StartLifecyclePolicyPreviewRequest startLifecyclePolicyPreviewRequest);

    /**
     * <p>
     * Adds specified tags to a resource with the specified ARN. Existing tags on a resource are not changed if they are
     * not specified in the request parameters.
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
     * @sample AmazonECR.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/TagResource" target="_top">AWS API
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
     * @sample AmazonECR.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/UntagResource" target="_top">AWS API
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
     * This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling
     * and pushing images. In most cases, you should use the <code>docker</code> CLI to pull, tag, and push images.
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
     *         href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/service_limits.html">Amazon ECR Default
     *         Service Limits</a> in the Amazon Elastic Container Registry User Guide.
     * @sample AmazonECR.UploadLayerPart
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/UploadLayerPart" target="_top">AWS API
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

    AmazonECRWaiters waiters();

}
