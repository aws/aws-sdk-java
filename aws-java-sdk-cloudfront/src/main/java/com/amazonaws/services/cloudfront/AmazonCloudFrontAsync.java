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
package com.amazonaws.services.cloudfront;

import javax.annotation.Generated;

import com.amazonaws.services.cloudfront.model.*;

/**
 * Interface for accessing CloudFront asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudfront.AbstractAmazonCloudFrontAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon CloudFront</fullname>
 * <p>
 * This is the <i>Amazon CloudFront API Reference</i>. This guide is for developers who need detailed information about
 * CloudFront API actions, data types, and errors. For detailed information about CloudFront features, see the <i>Amazon
 * CloudFront Developer Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonCloudFrontAsync extends AmazonCloudFront {

    /**
     * <p>
     * Associates an alias (also known as a CNAME or an alternate domain name) with a CloudFront distribution.
     * </p>
     * <p>
     * With this operation you can move an alias that's already in use on a CloudFront distribution to a different
     * distribution in one step. This prevents the downtime that could occur if you first remove the alias from one
     * distribution and then separately add the alias to another distribution.
     * </p>
     * <p>
     * To use this operation to associate an alias with a distribution, you provide the alias and the ID of the target
     * distribution for the alias. For more information, including how to set up the target distribution, prerequisites
     * that you must complete, and other restrictions, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html#alternate-domain-names-move"
     * >Moving an alternate domain name to a different distribution</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param associateAliasRequest
     * @return A Java Future containing the result of the AssociateAlias operation returned by the service.
     * @sample AmazonCloudFrontAsync.AssociateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/AssociateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateAliasResult> associateAliasAsync(AssociateAliasRequest associateAliasRequest);

    /**
     * <p>
     * Associates an alias (also known as a CNAME or an alternate domain name) with a CloudFront distribution.
     * </p>
     * <p>
     * With this operation you can move an alias that's already in use on a CloudFront distribution to a different
     * distribution in one step. This prevents the downtime that could occur if you first remove the alias from one
     * distribution and then separately add the alias to another distribution.
     * </p>
     * <p>
     * To use this operation to associate an alias with a distribution, you provide the alias and the ID of the target
     * distribution for the alias. For more information, including how to set up the target distribution, prerequisites
     * that you must complete, and other restrictions, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html#alternate-domain-names-move"
     * >Moving an alternate domain name to a different distribution</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param associateAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateAlias operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.AssociateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/AssociateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateAliasResult> associateAliasAsync(AssociateAliasRequest associateAliasRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateAliasRequest, AssociateAliasResult> asyncHandler);

    /**
     * <p>
     * Creates a staging distribution using the configuration of the provided primary distribution. A staging
     * distribution is a copy of an existing distribution (called the primary distribution) that you can use in a
     * continuous deployment workflow.
     * </p>
     * <p>
     * After you create a staging distribution, you can use <code>UpdateDistribution</code> to modify the staging
     * distribution's configuration. Then you can use <code>CreateContinuousDeploymentPolicy</code> to incrementally
     * move traffic to the staging distribution.
     * </p>
     * 
     * @param copyDistributionRequest
     * @return A Java Future containing the result of the CopyDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsync.CopyDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CopyDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CopyDistributionResult> copyDistributionAsync(CopyDistributionRequest copyDistributionRequest);

    /**
     * <p>
     * Creates a staging distribution using the configuration of the provided primary distribution. A staging
     * distribution is a copy of an existing distribution (called the primary distribution) that you can use in a
     * continuous deployment workflow.
     * </p>
     * <p>
     * After you create a staging distribution, you can use <code>UpdateDistribution</code> to modify the staging
     * distribution's configuration. Then you can use <code>CreateContinuousDeploymentPolicy</code> to incrementally
     * move traffic to the staging distribution.
     * </p>
     * 
     * @param copyDistributionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CopyDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.CopyDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CopyDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CopyDistributionResult> copyDistributionAsync(CopyDistributionRequest copyDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<CopyDistributionRequest, CopyDistributionResult> asyncHandler);

    /**
     * <p>
     * Creates a cache policy.
     * </p>
     * <p>
     * After you create a cache policy, you can attach it to one or more cache behaviors. When it's attached to a cache
     * behavior, the cache policy determines the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The values that CloudFront includes in the <i>cache key</i>. These values can include HTTP headers, cookies, and
     * URL query strings. CloudFront uses the cache key to find an object in its cache that it can return to the viewer.
     * </p>
     * </li>
     * <li>
     * <p>
     * The default, minimum, and maximum time to live (TTL) values that you want objects to stay in the CloudFront
     * cache.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The headers, cookies, and query strings that are included in the cache key are automatically included in requests
     * that CloudFront sends to the origin. CloudFront sends a request when it can't find an object in its cache that
     * matches the request's cache key. If you want to send values to the origin but <i>not</i> include them in the
     * cache key, use <code>OriginRequestPolicy</code>.
     * </p>
     * <p>
     * For more information about cache policies, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html"
     * >Controlling the cache key</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createCachePolicyRequest
     * @return A Java Future containing the result of the CreateCachePolicy operation returned by the service.
     * @sample AmazonCloudFrontAsync.CreateCachePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateCachePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateCachePolicyResult> createCachePolicyAsync(CreateCachePolicyRequest createCachePolicyRequest);

    /**
     * <p>
     * Creates a cache policy.
     * </p>
     * <p>
     * After you create a cache policy, you can attach it to one or more cache behaviors. When it's attached to a cache
     * behavior, the cache policy determines the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The values that CloudFront includes in the <i>cache key</i>. These values can include HTTP headers, cookies, and
     * URL query strings. CloudFront uses the cache key to find an object in its cache that it can return to the viewer.
     * </p>
     * </li>
     * <li>
     * <p>
     * The default, minimum, and maximum time to live (TTL) values that you want objects to stay in the CloudFront
     * cache.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The headers, cookies, and query strings that are included in the cache key are automatically included in requests
     * that CloudFront sends to the origin. CloudFront sends a request when it can't find an object in its cache that
     * matches the request's cache key. If you want to send values to the origin but <i>not</i> include them in the
     * cache key, use <code>OriginRequestPolicy</code>.
     * </p>
     * <p>
     * For more information about cache policies, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html"
     * >Controlling the cache key</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createCachePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCachePolicy operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.CreateCachePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateCachePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateCachePolicyResult> createCachePolicyAsync(CreateCachePolicyRequest createCachePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCachePolicyRequest, CreateCachePolicyResult> asyncHandler);

    /**
     * <p>
     * Creates a new origin access identity. If you're using Amazon S3 for your origin, you can use an origin access
     * identity to require users to access your content using a CloudFront URL instead of the Amazon S3 URL. For more
     * information about how to use origin access identities, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving Private
     * Content through CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createCloudFrontOriginAccessIdentityRequest
     *        The request to create a new origin access identity (OAI). An origin access identity is a special
     *        CloudFront user that you can associate with Amazon S3 origins, so that you can secure all or just some of
     *        your Amazon S3 content. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html"
     *        > Restricting Access to Amazon S3 Content by Using an Origin Access Identity</a> in the <i>Amazon
     *        CloudFront Developer Guide</i>.
     * @return A Java Future containing the result of the CreateCloudFrontOriginAccessIdentity operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.CreateCloudFrontOriginAccessIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateCloudFrontOriginAccessIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCloudFrontOriginAccessIdentityResult> createCloudFrontOriginAccessIdentityAsync(
            CreateCloudFrontOriginAccessIdentityRequest createCloudFrontOriginAccessIdentityRequest);

    /**
     * <p>
     * Creates a new origin access identity. If you're using Amazon S3 for your origin, you can use an origin access
     * identity to require users to access your content using a CloudFront URL instead of the Amazon S3 URL. For more
     * information about how to use origin access identities, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving Private
     * Content through CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createCloudFrontOriginAccessIdentityRequest
     *        The request to create a new origin access identity (OAI). An origin access identity is a special
     *        CloudFront user that you can associate with Amazon S3 origins, so that you can secure all or just some of
     *        your Amazon S3 content. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html"
     *        > Restricting Access to Amazon S3 Content by Using an Origin Access Identity</a> in the <i>Amazon
     *        CloudFront Developer Guide</i>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCloudFrontOriginAccessIdentity operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.CreateCloudFrontOriginAccessIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateCloudFrontOriginAccessIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCloudFrontOriginAccessIdentityResult> createCloudFrontOriginAccessIdentityAsync(
            CreateCloudFrontOriginAccessIdentityRequest createCloudFrontOriginAccessIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCloudFrontOriginAccessIdentityRequest, CreateCloudFrontOriginAccessIdentityResult> asyncHandler);

    /**
     * <p>
     * Creates a continuous deployment policy that distributes traffic for a custom domain name to two different
     * CloudFront distributions.
     * </p>
     * <p>
     * To use a continuous deployment policy, first use <code>CopyDistribution</code> to create a staging distribution,
     * then use <code>UpdateDistribution</code> to modify the staging distribution's configuration.
     * </p>
     * <p>
     * After you create and update a staging distribution, you can use a continuous deployment policy to incrementally
     * move traffic to the staging distribution. This workflow enables you to test changes to a distribution's
     * configuration before moving all of your domain's production traffic to the new configuration.
     * </p>
     * 
     * @param createContinuousDeploymentPolicyRequest
     * @return A Java Future containing the result of the CreateContinuousDeploymentPolicy operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.CreateContinuousDeploymentPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateContinuousDeploymentPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateContinuousDeploymentPolicyResult> createContinuousDeploymentPolicyAsync(
            CreateContinuousDeploymentPolicyRequest createContinuousDeploymentPolicyRequest);

    /**
     * <p>
     * Creates a continuous deployment policy that distributes traffic for a custom domain name to two different
     * CloudFront distributions.
     * </p>
     * <p>
     * To use a continuous deployment policy, first use <code>CopyDistribution</code> to create a staging distribution,
     * then use <code>UpdateDistribution</code> to modify the staging distribution's configuration.
     * </p>
     * <p>
     * After you create and update a staging distribution, you can use a continuous deployment policy to incrementally
     * move traffic to the staging distribution. This workflow enables you to test changes to a distribution's
     * configuration before moving all of your domain's production traffic to the new configuration.
     * </p>
     * 
     * @param createContinuousDeploymentPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateContinuousDeploymentPolicy operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.CreateContinuousDeploymentPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateContinuousDeploymentPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateContinuousDeploymentPolicyResult> createContinuousDeploymentPolicyAsync(
            CreateContinuousDeploymentPolicyRequest createContinuousDeploymentPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateContinuousDeploymentPolicyRequest, CreateContinuousDeploymentPolicyResult> asyncHandler);

    /**
     * <p>
     * Creates a CloudFront distribution.
     * </p>
     * 
     * @param createDistributionRequest
     *        The request to create a new distribution.
     * @return A Java Future containing the result of the CreateDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsync.CreateDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDistributionResult> createDistributionAsync(CreateDistributionRequest createDistributionRequest);

    /**
     * <p>
     * Creates a CloudFront distribution.
     * </p>
     * 
     * @param createDistributionRequest
     *        The request to create a new distribution.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.CreateDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDistributionResult> createDistributionAsync(CreateDistributionRequest createDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDistributionRequest, CreateDistributionResult> asyncHandler);

    /**
     * <p>
     * Create a new distribution with tags.
     * </p>
     * 
     * @param createDistributionWithTagsRequest
     *        The request to create a new distribution with tags.
     * @return A Java Future containing the result of the CreateDistributionWithTags operation returned by the service.
     * @sample AmazonCloudFrontAsync.CreateDistributionWithTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateDistributionWithTags"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDistributionWithTagsResult> createDistributionWithTagsAsync(
            CreateDistributionWithTagsRequest createDistributionWithTagsRequest);

    /**
     * <p>
     * Create a new distribution with tags.
     * </p>
     * 
     * @param createDistributionWithTagsRequest
     *        The request to create a new distribution with tags.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDistributionWithTags operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.CreateDistributionWithTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateDistributionWithTags"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDistributionWithTagsResult> createDistributionWithTagsAsync(
            CreateDistributionWithTagsRequest createDistributionWithTagsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDistributionWithTagsRequest, CreateDistributionWithTagsResult> asyncHandler);

    /**
     * <p>
     * Create a new field-level encryption configuration.
     * </p>
     * 
     * @param createFieldLevelEncryptionConfigRequest
     * @return A Java Future containing the result of the CreateFieldLevelEncryptionConfig operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.CreateFieldLevelEncryptionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateFieldLevelEncryptionConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateFieldLevelEncryptionConfigResult> createFieldLevelEncryptionConfigAsync(
            CreateFieldLevelEncryptionConfigRequest createFieldLevelEncryptionConfigRequest);

    /**
     * <p>
     * Create a new field-level encryption configuration.
     * </p>
     * 
     * @param createFieldLevelEncryptionConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFieldLevelEncryptionConfig operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.CreateFieldLevelEncryptionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateFieldLevelEncryptionConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateFieldLevelEncryptionConfigResult> createFieldLevelEncryptionConfigAsync(
            CreateFieldLevelEncryptionConfigRequest createFieldLevelEncryptionConfigRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFieldLevelEncryptionConfigRequest, CreateFieldLevelEncryptionConfigResult> asyncHandler);

    /**
     * <p>
     * Create a field-level encryption profile.
     * </p>
     * 
     * @param createFieldLevelEncryptionProfileRequest
     * @return A Java Future containing the result of the CreateFieldLevelEncryptionProfile operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.CreateFieldLevelEncryptionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateFieldLevelEncryptionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateFieldLevelEncryptionProfileResult> createFieldLevelEncryptionProfileAsync(
            CreateFieldLevelEncryptionProfileRequest createFieldLevelEncryptionProfileRequest);

    /**
     * <p>
     * Create a field-level encryption profile.
     * </p>
     * 
     * @param createFieldLevelEncryptionProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFieldLevelEncryptionProfile operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.CreateFieldLevelEncryptionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateFieldLevelEncryptionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateFieldLevelEncryptionProfileResult> createFieldLevelEncryptionProfileAsync(
            CreateFieldLevelEncryptionProfileRequest createFieldLevelEncryptionProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFieldLevelEncryptionProfileRequest, CreateFieldLevelEncryptionProfileResult> asyncHandler);

    /**
     * <p>
     * Creates a CloudFront function.
     * </p>
     * <p>
     * To create a function, you provide the function code and some configuration information about the function. The
     * response contains an Amazon Resource Name (ARN) that uniquely identifies the function.
     * </p>
     * <p>
     * When you create a function, it's in the <code>DEVELOPMENT</code> stage. In this stage, you can test the function
     * with <code>TestFunction</code>, and update it with <code>UpdateFunction</code>.
     * </p>
     * <p>
     * When you're ready to use your function with a CloudFront distribution, use <code>PublishFunction</code> to copy
     * the function from the <code>DEVELOPMENT</code> stage to <code>LIVE</code>. When it's live, you can attach the
     * function to a distribution's cache behavior, using the function's ARN.
     * </p>
     * 
     * @param createFunctionRequest
     * @return A Java Future containing the result of the CreateFunction operation returned by the service.
     * @sample AmazonCloudFrontAsync.CreateFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateFunction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFunctionResult> createFunctionAsync(CreateFunctionRequest createFunctionRequest);

    /**
     * <p>
     * Creates a CloudFront function.
     * </p>
     * <p>
     * To create a function, you provide the function code and some configuration information about the function. The
     * response contains an Amazon Resource Name (ARN) that uniquely identifies the function.
     * </p>
     * <p>
     * When you create a function, it's in the <code>DEVELOPMENT</code> stage. In this stage, you can test the function
     * with <code>TestFunction</code>, and update it with <code>UpdateFunction</code>.
     * </p>
     * <p>
     * When you're ready to use your function with a CloudFront distribution, use <code>PublishFunction</code> to copy
     * the function from the <code>DEVELOPMENT</code> stage to <code>LIVE</code>. When it's live, you can attach the
     * function to a distribution's cache behavior, using the function's ARN.
     * </p>
     * 
     * @param createFunctionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFunction operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.CreateFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateFunction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFunctionResult> createFunctionAsync(CreateFunctionRequest createFunctionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFunctionRequest, CreateFunctionResult> asyncHandler);

    /**
     * <p>
     * Create a new invalidation.
     * </p>
     * 
     * @param createInvalidationRequest
     *        The request to create an invalidation.
     * @return A Java Future containing the result of the CreateInvalidation operation returned by the service.
     * @sample AmazonCloudFrontAsync.CreateInvalidation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateInvalidation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateInvalidationResult> createInvalidationAsync(CreateInvalidationRequest createInvalidationRequest);

    /**
     * <p>
     * Create a new invalidation.
     * </p>
     * 
     * @param createInvalidationRequest
     *        The request to create an invalidation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInvalidation operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.CreateInvalidation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateInvalidation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateInvalidationResult> createInvalidationAsync(CreateInvalidationRequest createInvalidationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInvalidationRequest, CreateInvalidationResult> asyncHandler);

    /**
     * <p>
     * Creates a key group that you can use with <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">CloudFront signed
     * URLs and signed cookies</a>.
     * </p>
     * <p>
     * To create a key group, you must specify at least one public key for the key group. After you create a key group,
     * you can reference it from one or more cache behaviors. When you reference a key group in a cache behavior,
     * CloudFront requires signed URLs or signed cookies for all requests that match the cache behavior. The URLs or
     * cookies must be signed with a private key whose corresponding public key is in the key group. The signed URL or
     * cookie contains information about which public key CloudFront should use to verify the signature. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving private
     * content</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createKeyGroupRequest
     * @return A Java Future containing the result of the CreateKeyGroup operation returned by the service.
     * @sample AmazonCloudFrontAsync.CreateKeyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateKeyGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateKeyGroupResult> createKeyGroupAsync(CreateKeyGroupRequest createKeyGroupRequest);

    /**
     * <p>
     * Creates a key group that you can use with <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">CloudFront signed
     * URLs and signed cookies</a>.
     * </p>
     * <p>
     * To create a key group, you must specify at least one public key for the key group. After you create a key group,
     * you can reference it from one or more cache behaviors. When you reference a key group in a cache behavior,
     * CloudFront requires signed URLs or signed cookies for all requests that match the cache behavior. The URLs or
     * cookies must be signed with a private key whose corresponding public key is in the key group. The signed URL or
     * cookie contains information about which public key CloudFront should use to verify the signature. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving private
     * content</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createKeyGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateKeyGroup operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.CreateKeyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateKeyGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateKeyGroupResult> createKeyGroupAsync(CreateKeyGroupRequest createKeyGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateKeyGroupRequest, CreateKeyGroupResult> asyncHandler);

    /**
     * <p>
     * Enables additional CloudWatch metrics for the specified CloudFront distribution. The additional metrics incur an
     * additional cost.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/viewing-cloudfront-metrics.html#monitoring-console.distributions-additional"
     * >Viewing additional CloudFront distribution metrics</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createMonitoringSubscriptionRequest
     * @return A Java Future containing the result of the CreateMonitoringSubscription operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.CreateMonitoringSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateMonitoringSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMonitoringSubscriptionResult> createMonitoringSubscriptionAsync(
            CreateMonitoringSubscriptionRequest createMonitoringSubscriptionRequest);

    /**
     * <p>
     * Enables additional CloudWatch metrics for the specified CloudFront distribution. The additional metrics incur an
     * additional cost.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/viewing-cloudfront-metrics.html#monitoring-console.distributions-additional"
     * >Viewing additional CloudFront distribution metrics</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createMonitoringSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMonitoringSubscription operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.CreateMonitoringSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateMonitoringSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMonitoringSubscriptionResult> createMonitoringSubscriptionAsync(
            CreateMonitoringSubscriptionRequest createMonitoringSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMonitoringSubscriptionRequest, CreateMonitoringSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Creates a new origin access control in CloudFront. After you create an origin access control, you can add it to
     * an origin in a CloudFront distribution so that CloudFront sends authenticated (signed) requests to the origin.
     * </p>
     * <p>
     * For an Amazon S3 origin, this makes it possible to block public access to the Amazon S3 bucket so that viewers
     * (users) can access the content in the bucket only through CloudFront.
     * </p>
     * <p>
     * For more information about using a CloudFront origin access control, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html"
     * >Restricting access to an Amazon S3 origin</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createOriginAccessControlRequest
     * @return A Java Future containing the result of the CreateOriginAccessControl operation returned by the service.
     * @sample AmazonCloudFrontAsync.CreateOriginAccessControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateOriginAccessControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateOriginAccessControlResult> createOriginAccessControlAsync(
            CreateOriginAccessControlRequest createOriginAccessControlRequest);

    /**
     * <p>
     * Creates a new origin access control in CloudFront. After you create an origin access control, you can add it to
     * an origin in a CloudFront distribution so that CloudFront sends authenticated (signed) requests to the origin.
     * </p>
     * <p>
     * For an Amazon S3 origin, this makes it possible to block public access to the Amazon S3 bucket so that viewers
     * (users) can access the content in the bucket only through CloudFront.
     * </p>
     * <p>
     * For more information about using a CloudFront origin access control, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html"
     * >Restricting access to an Amazon S3 origin</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createOriginAccessControlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateOriginAccessControl operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.CreateOriginAccessControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateOriginAccessControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateOriginAccessControlResult> createOriginAccessControlAsync(
            CreateOriginAccessControlRequest createOriginAccessControlRequest,
            com.amazonaws.handlers.AsyncHandler<CreateOriginAccessControlRequest, CreateOriginAccessControlResult> asyncHandler);

    /**
     * <p>
     * Creates an origin request policy.
     * </p>
     * <p>
     * After you create an origin request policy, you can attach it to one or more cache behaviors. When it's attached
     * to a cache behavior, the origin request policy determines the values that CloudFront includes in requests that it
     * sends to the origin. Each request that CloudFront sends to the origin includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The request body and the URL path (without the domain name) from the viewer request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The headers that CloudFront automatically includes in every origin request, including <code>Host</code>,
     * <code>User-Agent</code>, and <code>X-Amz-Cf-Id</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * All HTTP headers, cookies, and URL query strings that are specified in the cache policy or the origin request
     * policy. These can include items from the viewer request and, in the case of headers, additional ones that are
     * added by CloudFront.
     * </p>
     * </li>
     * </ul>
     * <p>
     * CloudFront sends a request when it can't find a valid object in its cache that matches the request. If you want
     * to send values to the origin and also include them in the cache key, use <code>CachePolicy</code>.
     * </p>
     * <p>
     * For more information about origin request policies, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html"
     * >Controlling origin requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createOriginRequestPolicyRequest
     * @return A Java Future containing the result of the CreateOriginRequestPolicy operation returned by the service.
     * @sample AmazonCloudFrontAsync.CreateOriginRequestPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateOriginRequestPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateOriginRequestPolicyResult> createOriginRequestPolicyAsync(
            CreateOriginRequestPolicyRequest createOriginRequestPolicyRequest);

    /**
     * <p>
     * Creates an origin request policy.
     * </p>
     * <p>
     * After you create an origin request policy, you can attach it to one or more cache behaviors. When it's attached
     * to a cache behavior, the origin request policy determines the values that CloudFront includes in requests that it
     * sends to the origin. Each request that CloudFront sends to the origin includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The request body and the URL path (without the domain name) from the viewer request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The headers that CloudFront automatically includes in every origin request, including <code>Host</code>,
     * <code>User-Agent</code>, and <code>X-Amz-Cf-Id</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * All HTTP headers, cookies, and URL query strings that are specified in the cache policy or the origin request
     * policy. These can include items from the viewer request and, in the case of headers, additional ones that are
     * added by CloudFront.
     * </p>
     * </li>
     * </ul>
     * <p>
     * CloudFront sends a request when it can't find a valid object in its cache that matches the request. If you want
     * to send values to the origin and also include them in the cache key, use <code>CachePolicy</code>.
     * </p>
     * <p>
     * For more information about origin request policies, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html"
     * >Controlling origin requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createOriginRequestPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateOriginRequestPolicy operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.CreateOriginRequestPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateOriginRequestPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateOriginRequestPolicyResult> createOriginRequestPolicyAsync(
            CreateOriginRequestPolicyRequest createOriginRequestPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateOriginRequestPolicyRequest, CreateOriginRequestPolicyResult> asyncHandler);

    /**
     * <p>
     * Uploads a public key to CloudFront that you can use with <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">signed URLs and
     * signed cookies</a>, or with <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html">field-level
     * encryption</a>.
     * </p>
     * 
     * @param createPublicKeyRequest
     * @return A Java Future containing the result of the CreatePublicKey operation returned by the service.
     * @sample AmazonCloudFrontAsync.CreatePublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreatePublicKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePublicKeyResult> createPublicKeyAsync(CreatePublicKeyRequest createPublicKeyRequest);

    /**
     * <p>
     * Uploads a public key to CloudFront that you can use with <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">signed URLs and
     * signed cookies</a>, or with <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html">field-level
     * encryption</a>.
     * </p>
     * 
     * @param createPublicKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePublicKey operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.CreatePublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreatePublicKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePublicKeyResult> createPublicKeyAsync(CreatePublicKeyRequest createPublicKeyRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePublicKeyRequest, CreatePublicKeyResult> asyncHandler);

    /**
     * <p>
     * Creates a real-time log configuration.
     * </p>
     * <p>
     * After you create a real-time log configuration, you can attach it to one or more cache behaviors to send
     * real-time log data to the specified Amazon Kinesis data stream.
     * </p>
     * <p>
     * For more information about real-time log configurations, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html">Real-time logs</a>
     * in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createRealtimeLogConfigRequest
     * @return A Java Future containing the result of the CreateRealtimeLogConfig operation returned by the service.
     * @sample AmazonCloudFrontAsync.CreateRealtimeLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateRealtimeLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRealtimeLogConfigResult> createRealtimeLogConfigAsync(CreateRealtimeLogConfigRequest createRealtimeLogConfigRequest);

    /**
     * <p>
     * Creates a real-time log configuration.
     * </p>
     * <p>
     * After you create a real-time log configuration, you can attach it to one or more cache behaviors to send
     * real-time log data to the specified Amazon Kinesis data stream.
     * </p>
     * <p>
     * For more information about real-time log configurations, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html">Real-time logs</a>
     * in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createRealtimeLogConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRealtimeLogConfig operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.CreateRealtimeLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateRealtimeLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRealtimeLogConfigResult> createRealtimeLogConfigAsync(CreateRealtimeLogConfigRequest createRealtimeLogConfigRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRealtimeLogConfigRequest, CreateRealtimeLogConfigResult> asyncHandler);

    /**
     * <p>
     * Creates a response headers policy.
     * </p>
     * <p>
     * A response headers policy contains information about a set of HTTP headers. To create a response headers policy,
     * you provide some metadata about the policy and a set of configurations that specify the headers.
     * </p>
     * <p>
     * After you create a response headers policy, you can use its ID to attach it to one or more cache behaviors in a
     * CloudFront distribution. When it's attached to a cache behavior, the response headers policy affects the HTTP
     * headers that CloudFront includes in HTTP responses to requests that match the cache behavior. CloudFront adds or
     * removes response headers according to the configuration of the response headers policy.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/modifying-response-headers.html">Adding
     * or removing HTTP headers in CloudFront responses</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createResponseHeadersPolicyRequest
     * @return A Java Future containing the result of the CreateResponseHeadersPolicy operation returned by the service.
     * @sample AmazonCloudFrontAsync.CreateResponseHeadersPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateResponseHeadersPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateResponseHeadersPolicyResult> createResponseHeadersPolicyAsync(
            CreateResponseHeadersPolicyRequest createResponseHeadersPolicyRequest);

    /**
     * <p>
     * Creates a response headers policy.
     * </p>
     * <p>
     * A response headers policy contains information about a set of HTTP headers. To create a response headers policy,
     * you provide some metadata about the policy and a set of configurations that specify the headers.
     * </p>
     * <p>
     * After you create a response headers policy, you can use its ID to attach it to one or more cache behaviors in a
     * CloudFront distribution. When it's attached to a cache behavior, the response headers policy affects the HTTP
     * headers that CloudFront includes in HTTP responses to requests that match the cache behavior. CloudFront adds or
     * removes response headers according to the configuration of the response headers policy.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/modifying-response-headers.html">Adding
     * or removing HTTP headers in CloudFront responses</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createResponseHeadersPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateResponseHeadersPolicy operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.CreateResponseHeadersPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateResponseHeadersPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateResponseHeadersPolicyResult> createResponseHeadersPolicyAsync(
            CreateResponseHeadersPolicyRequest createResponseHeadersPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateResponseHeadersPolicyRequest, CreateResponseHeadersPolicyResult> asyncHandler);

    /**
     * <p>
     * This API is deprecated. Amazon CloudFront is deprecating real-time messaging protocol (RTMP) distributions on
     * December 31, 2020. For more information, <a href="http://forums.aws.amazon.com/ann.jspa?annID=7356">read the
     * announcement</a> on the Amazon CloudFront discussion forum.
     * </p>
     * 
     * @param createStreamingDistributionRequest
     *        The request to create a new streaming distribution.
     * @return A Java Future containing the result of the CreateStreamingDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsync.CreateStreamingDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateStreamingDistribution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateStreamingDistributionResult> createStreamingDistributionAsync(
            CreateStreamingDistributionRequest createStreamingDistributionRequest);

    /**
     * <p>
     * This API is deprecated. Amazon CloudFront is deprecating real-time messaging protocol (RTMP) distributions on
     * December 31, 2020. For more information, <a href="http://forums.aws.amazon.com/ann.jspa?annID=7356">read the
     * announcement</a> on the Amazon CloudFront discussion forum.
     * </p>
     * 
     * @param createStreamingDistributionRequest
     *        The request to create a new streaming distribution.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStreamingDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.CreateStreamingDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateStreamingDistribution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateStreamingDistributionResult> createStreamingDistributionAsync(
            CreateStreamingDistributionRequest createStreamingDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStreamingDistributionRequest, CreateStreamingDistributionResult> asyncHandler);

    /**
     * <p>
     * This API is deprecated. Amazon CloudFront is deprecating real-time messaging protocol (RTMP) distributions on
     * December 31, 2020. For more information, <a href="http://forums.aws.amazon.com/ann.jspa?annID=7356">read the
     * announcement</a> on the Amazon CloudFront discussion forum.
     * </p>
     * 
     * @param createStreamingDistributionWithTagsRequest
     *        The request to create a new streaming distribution with tags.
     * @return A Java Future containing the result of the CreateStreamingDistributionWithTags operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.CreateStreamingDistributionWithTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateStreamingDistributionWithTags"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateStreamingDistributionWithTagsResult> createStreamingDistributionWithTagsAsync(
            CreateStreamingDistributionWithTagsRequest createStreamingDistributionWithTagsRequest);

    /**
     * <p>
     * This API is deprecated. Amazon CloudFront is deprecating real-time messaging protocol (RTMP) distributions on
     * December 31, 2020. For more information, <a href="http://forums.aws.amazon.com/ann.jspa?annID=7356">read the
     * announcement</a> on the Amazon CloudFront discussion forum.
     * </p>
     * 
     * @param createStreamingDistributionWithTagsRequest
     *        The request to create a new streaming distribution with tags.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStreamingDistributionWithTags operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.CreateStreamingDistributionWithTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateStreamingDistributionWithTags"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateStreamingDistributionWithTagsResult> createStreamingDistributionWithTagsAsync(
            CreateStreamingDistributionWithTagsRequest createStreamingDistributionWithTagsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStreamingDistributionWithTagsRequest, CreateStreamingDistributionWithTagsResult> asyncHandler);

    /**
     * <p>
     * Deletes a cache policy.
     * </p>
     * <p>
     * You cannot delete a cache policy if it's attached to a cache behavior. First update your distributions to remove
     * the cache policy from all cache behaviors, then delete the cache policy.
     * </p>
     * <p>
     * To delete a cache policy, you must provide the policy's identifier and version. To get these values, you can use
     * <code>ListCachePolicies</code> or <code>GetCachePolicy</code>.
     * </p>
     * 
     * @param deleteCachePolicyRequest
     * @return A Java Future containing the result of the DeleteCachePolicy operation returned by the service.
     * @sample AmazonCloudFrontAsync.DeleteCachePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteCachePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCachePolicyResult> deleteCachePolicyAsync(DeleteCachePolicyRequest deleteCachePolicyRequest);

    /**
     * <p>
     * Deletes a cache policy.
     * </p>
     * <p>
     * You cannot delete a cache policy if it's attached to a cache behavior. First update your distributions to remove
     * the cache policy from all cache behaviors, then delete the cache policy.
     * </p>
     * <p>
     * To delete a cache policy, you must provide the policy's identifier and version. To get these values, you can use
     * <code>ListCachePolicies</code> or <code>GetCachePolicy</code>.
     * </p>
     * 
     * @param deleteCachePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCachePolicy operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.DeleteCachePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteCachePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCachePolicyResult> deleteCachePolicyAsync(DeleteCachePolicyRequest deleteCachePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCachePolicyRequest, DeleteCachePolicyResult> asyncHandler);

    /**
     * <p>
     * Delete an origin access identity.
     * </p>
     * 
     * @param deleteCloudFrontOriginAccessIdentityRequest
     *        Deletes a origin access identity.
     * @return A Java Future containing the result of the DeleteCloudFrontOriginAccessIdentity operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.DeleteCloudFrontOriginAccessIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteCloudFrontOriginAccessIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCloudFrontOriginAccessIdentityResult> deleteCloudFrontOriginAccessIdentityAsync(
            DeleteCloudFrontOriginAccessIdentityRequest deleteCloudFrontOriginAccessIdentityRequest);

    /**
     * <p>
     * Delete an origin access identity.
     * </p>
     * 
     * @param deleteCloudFrontOriginAccessIdentityRequest
     *        Deletes a origin access identity.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCloudFrontOriginAccessIdentity operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.DeleteCloudFrontOriginAccessIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteCloudFrontOriginAccessIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCloudFrontOriginAccessIdentityResult> deleteCloudFrontOriginAccessIdentityAsync(
            DeleteCloudFrontOriginAccessIdentityRequest deleteCloudFrontOriginAccessIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCloudFrontOriginAccessIdentityRequest, DeleteCloudFrontOriginAccessIdentityResult> asyncHandler);

    /**
     * <p>
     * Deletes a continuous deployment policy.
     * </p>
     * <p>
     * You cannot delete a continuous deployment policy that's attached to a primary distribution. First update your
     * distribution to remove the continuous deployment policy, then you can delete the policy.
     * </p>
     * 
     * @param deleteContinuousDeploymentPolicyRequest
     * @return A Java Future containing the result of the DeleteContinuousDeploymentPolicy operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.DeleteContinuousDeploymentPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteContinuousDeploymentPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteContinuousDeploymentPolicyResult> deleteContinuousDeploymentPolicyAsync(
            DeleteContinuousDeploymentPolicyRequest deleteContinuousDeploymentPolicyRequest);

    /**
     * <p>
     * Deletes a continuous deployment policy.
     * </p>
     * <p>
     * You cannot delete a continuous deployment policy that's attached to a primary distribution. First update your
     * distribution to remove the continuous deployment policy, then you can delete the policy.
     * </p>
     * 
     * @param deleteContinuousDeploymentPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteContinuousDeploymentPolicy operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.DeleteContinuousDeploymentPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteContinuousDeploymentPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteContinuousDeploymentPolicyResult> deleteContinuousDeploymentPolicyAsync(
            DeleteContinuousDeploymentPolicyRequest deleteContinuousDeploymentPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteContinuousDeploymentPolicyRequest, DeleteContinuousDeploymentPolicyResult> asyncHandler);

    /**
     * <p>
     * Delete a distribution.
     * </p>
     * 
     * @param deleteDistributionRequest
     *        This action deletes a web distribution. To delete a web distribution using the CloudFront API, perform the
     *        following steps.</p>
     *        <p>
     *        <b>To delete a web distribution using the CloudFront API:</b>
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        Disable the web distribution
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Submit a <code>GET Distribution Config</code> request to get the current configuration and the
     *        <code>Etag</code> header for the distribution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Update the XML document that was returned in the response to your <code>GET Distribution Config</code>
     *        request to change the value of <code>Enabled</code> to <code>false</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Submit a <code>PUT Distribution Config</code> request to update the configuration for your distribution.
     *        In the request body, include the XML document that you updated in Step 3. Set the value of the HTTP
     *        <code>If-Match</code> header to the value of the <code>ETag</code> header that CloudFront returned when
     *        you submitted the <code>GET Distribution Config</code> request in Step 2.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Review the response to the <code>PUT Distribution Config</code> request to confirm that the distribution
     *        was successfully disabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Submit a <code>GET Distribution</code> request to confirm that your changes have propagated. When
     *        propagation is complete, the value of <code>Status</code> is <code>Deployed</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Submit a <code>DELETE Distribution</code> request. Set the value of the HTTP <code>If-Match</code> header
     *        to the value of the <code>ETag</code> header that CloudFront returned when you submitted the
     *        <code>GET Distribution Config</code> request in Step 6.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Review the response to your <code>DELETE Distribution</code> request to confirm that the distribution was
     *        successfully deleted.
     *        </p>
     *        </li>
     *        </ol>
     *        <p>
     *        For information about deleting a distribution using the CloudFront console, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/HowToDeleteDistribution.html"
     *        >Deleting a Distribution</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return A Java Future containing the result of the DeleteDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsync.DeleteDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDistributionResult> deleteDistributionAsync(DeleteDistributionRequest deleteDistributionRequest);

    /**
     * <p>
     * Delete a distribution.
     * </p>
     * 
     * @param deleteDistributionRequest
     *        This action deletes a web distribution. To delete a web distribution using the CloudFront API, perform the
     *        following steps.</p>
     *        <p>
     *        <b>To delete a web distribution using the CloudFront API:</b>
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        Disable the web distribution
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Submit a <code>GET Distribution Config</code> request to get the current configuration and the
     *        <code>Etag</code> header for the distribution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Update the XML document that was returned in the response to your <code>GET Distribution Config</code>
     *        request to change the value of <code>Enabled</code> to <code>false</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Submit a <code>PUT Distribution Config</code> request to update the configuration for your distribution.
     *        In the request body, include the XML document that you updated in Step 3. Set the value of the HTTP
     *        <code>If-Match</code> header to the value of the <code>ETag</code> header that CloudFront returned when
     *        you submitted the <code>GET Distribution Config</code> request in Step 2.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Review the response to the <code>PUT Distribution Config</code> request to confirm that the distribution
     *        was successfully disabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Submit a <code>GET Distribution</code> request to confirm that your changes have propagated. When
     *        propagation is complete, the value of <code>Status</code> is <code>Deployed</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Submit a <code>DELETE Distribution</code> request. Set the value of the HTTP <code>If-Match</code> header
     *        to the value of the <code>ETag</code> header that CloudFront returned when you submitted the
     *        <code>GET Distribution Config</code> request in Step 6.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Review the response to your <code>DELETE Distribution</code> request to confirm that the distribution was
     *        successfully deleted.
     *        </p>
     *        </li>
     *        </ol>
     *        <p>
     *        For information about deleting a distribution using the CloudFront console, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/HowToDeleteDistribution.html"
     *        >Deleting a Distribution</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.DeleteDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDistributionResult> deleteDistributionAsync(DeleteDistributionRequest deleteDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDistributionRequest, DeleteDistributionResult> asyncHandler);

    /**
     * <p>
     * Remove a field-level encryption configuration.
     * </p>
     * 
     * @param deleteFieldLevelEncryptionConfigRequest
     * @return A Java Future containing the result of the DeleteFieldLevelEncryptionConfig operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.DeleteFieldLevelEncryptionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteFieldLevelEncryptionConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFieldLevelEncryptionConfigResult> deleteFieldLevelEncryptionConfigAsync(
            DeleteFieldLevelEncryptionConfigRequest deleteFieldLevelEncryptionConfigRequest);

    /**
     * <p>
     * Remove a field-level encryption configuration.
     * </p>
     * 
     * @param deleteFieldLevelEncryptionConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFieldLevelEncryptionConfig operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.DeleteFieldLevelEncryptionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteFieldLevelEncryptionConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFieldLevelEncryptionConfigResult> deleteFieldLevelEncryptionConfigAsync(
            DeleteFieldLevelEncryptionConfigRequest deleteFieldLevelEncryptionConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFieldLevelEncryptionConfigRequest, DeleteFieldLevelEncryptionConfigResult> asyncHandler);

    /**
     * <p>
     * Remove a field-level encryption profile.
     * </p>
     * 
     * @param deleteFieldLevelEncryptionProfileRequest
     * @return A Java Future containing the result of the DeleteFieldLevelEncryptionProfile operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.DeleteFieldLevelEncryptionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteFieldLevelEncryptionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFieldLevelEncryptionProfileResult> deleteFieldLevelEncryptionProfileAsync(
            DeleteFieldLevelEncryptionProfileRequest deleteFieldLevelEncryptionProfileRequest);

    /**
     * <p>
     * Remove a field-level encryption profile.
     * </p>
     * 
     * @param deleteFieldLevelEncryptionProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFieldLevelEncryptionProfile operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.DeleteFieldLevelEncryptionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteFieldLevelEncryptionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFieldLevelEncryptionProfileResult> deleteFieldLevelEncryptionProfileAsync(
            DeleteFieldLevelEncryptionProfileRequest deleteFieldLevelEncryptionProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFieldLevelEncryptionProfileRequest, DeleteFieldLevelEncryptionProfileResult> asyncHandler);

    /**
     * <p>
     * Deletes a CloudFront function.
     * </p>
     * <p>
     * You cannot delete a function if it's associated with a cache behavior. First, update your distributions to remove
     * the function association from all cache behaviors, then delete the function.
     * </p>
     * <p>
     * To delete a function, you must provide the function's name and version (<code>ETag</code> value). To get these
     * values, you can use <code>ListFunctions</code> and <code>DescribeFunction</code>.
     * </p>
     * 
     * @param deleteFunctionRequest
     * @return A Java Future containing the result of the DeleteFunction operation returned by the service.
     * @sample AmazonCloudFrontAsync.DeleteFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteFunction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFunctionResult> deleteFunctionAsync(DeleteFunctionRequest deleteFunctionRequest);

    /**
     * <p>
     * Deletes a CloudFront function.
     * </p>
     * <p>
     * You cannot delete a function if it's associated with a cache behavior. First, update your distributions to remove
     * the function association from all cache behaviors, then delete the function.
     * </p>
     * <p>
     * To delete a function, you must provide the function's name and version (<code>ETag</code> value). To get these
     * values, you can use <code>ListFunctions</code> and <code>DescribeFunction</code>.
     * </p>
     * 
     * @param deleteFunctionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFunction operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.DeleteFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteFunction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFunctionResult> deleteFunctionAsync(DeleteFunctionRequest deleteFunctionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFunctionRequest, DeleteFunctionResult> asyncHandler);

    /**
     * <p>
     * Deletes a key group.
     * </p>
     * <p>
     * You cannot delete a key group that is referenced in a cache behavior. First update your distributions to remove
     * the key group from all cache behaviors, then delete the key group.
     * </p>
     * <p>
     * To delete a key group, you must provide the key group's identifier and version. To get these values, use
     * <code>ListKeyGroups</code> followed by <code>GetKeyGroup</code> or <code>GetKeyGroupConfig</code>.
     * </p>
     * 
     * @param deleteKeyGroupRequest
     * @return A Java Future containing the result of the DeleteKeyGroup operation returned by the service.
     * @sample AmazonCloudFrontAsync.DeleteKeyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteKeyGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteKeyGroupResult> deleteKeyGroupAsync(DeleteKeyGroupRequest deleteKeyGroupRequest);

    /**
     * <p>
     * Deletes a key group.
     * </p>
     * <p>
     * You cannot delete a key group that is referenced in a cache behavior. First update your distributions to remove
     * the key group from all cache behaviors, then delete the key group.
     * </p>
     * <p>
     * To delete a key group, you must provide the key group's identifier and version. To get these values, use
     * <code>ListKeyGroups</code> followed by <code>GetKeyGroup</code> or <code>GetKeyGroupConfig</code>.
     * </p>
     * 
     * @param deleteKeyGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteKeyGroup operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.DeleteKeyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteKeyGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteKeyGroupResult> deleteKeyGroupAsync(DeleteKeyGroupRequest deleteKeyGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteKeyGroupRequest, DeleteKeyGroupResult> asyncHandler);

    /**
     * <p>
     * Disables additional CloudWatch metrics for the specified CloudFront distribution.
     * </p>
     * 
     * @param deleteMonitoringSubscriptionRequest
     * @return A Java Future containing the result of the DeleteMonitoringSubscription operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.DeleteMonitoringSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteMonitoringSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMonitoringSubscriptionResult> deleteMonitoringSubscriptionAsync(
            DeleteMonitoringSubscriptionRequest deleteMonitoringSubscriptionRequest);

    /**
     * <p>
     * Disables additional CloudWatch metrics for the specified CloudFront distribution.
     * </p>
     * 
     * @param deleteMonitoringSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMonitoringSubscription operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.DeleteMonitoringSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteMonitoringSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMonitoringSubscriptionResult> deleteMonitoringSubscriptionAsync(
            DeleteMonitoringSubscriptionRequest deleteMonitoringSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMonitoringSubscriptionRequest, DeleteMonitoringSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Deletes a CloudFront origin access control.
     * </p>
     * <p>
     * You cannot delete an origin access control if it's in use. First, update all distributions to remove the origin
     * access control from all origins, then delete the origin access control.
     * </p>
     * 
     * @param deleteOriginAccessControlRequest
     * @return A Java Future containing the result of the DeleteOriginAccessControl operation returned by the service.
     * @sample AmazonCloudFrontAsync.DeleteOriginAccessControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteOriginAccessControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteOriginAccessControlResult> deleteOriginAccessControlAsync(
            DeleteOriginAccessControlRequest deleteOriginAccessControlRequest);

    /**
     * <p>
     * Deletes a CloudFront origin access control.
     * </p>
     * <p>
     * You cannot delete an origin access control if it's in use. First, update all distributions to remove the origin
     * access control from all origins, then delete the origin access control.
     * </p>
     * 
     * @param deleteOriginAccessControlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteOriginAccessControl operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.DeleteOriginAccessControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteOriginAccessControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteOriginAccessControlResult> deleteOriginAccessControlAsync(
            DeleteOriginAccessControlRequest deleteOriginAccessControlRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteOriginAccessControlRequest, DeleteOriginAccessControlResult> asyncHandler);

    /**
     * <p>
     * Deletes an origin request policy.
     * </p>
     * <p>
     * You cannot delete an origin request policy if it's attached to any cache behaviors. First update your
     * distributions to remove the origin request policy from all cache behaviors, then delete the origin request
     * policy.
     * </p>
     * <p>
     * To delete an origin request policy, you must provide the policy's identifier and version. To get the identifier,
     * you can use <code>ListOriginRequestPolicies</code> or <code>GetOriginRequestPolicy</code>.
     * </p>
     * 
     * @param deleteOriginRequestPolicyRequest
     * @return A Java Future containing the result of the DeleteOriginRequestPolicy operation returned by the service.
     * @sample AmazonCloudFrontAsync.DeleteOriginRequestPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteOriginRequestPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteOriginRequestPolicyResult> deleteOriginRequestPolicyAsync(
            DeleteOriginRequestPolicyRequest deleteOriginRequestPolicyRequest);

    /**
     * <p>
     * Deletes an origin request policy.
     * </p>
     * <p>
     * You cannot delete an origin request policy if it's attached to any cache behaviors. First update your
     * distributions to remove the origin request policy from all cache behaviors, then delete the origin request
     * policy.
     * </p>
     * <p>
     * To delete an origin request policy, you must provide the policy's identifier and version. To get the identifier,
     * you can use <code>ListOriginRequestPolicies</code> or <code>GetOriginRequestPolicy</code>.
     * </p>
     * 
     * @param deleteOriginRequestPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteOriginRequestPolicy operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.DeleteOriginRequestPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteOriginRequestPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteOriginRequestPolicyResult> deleteOriginRequestPolicyAsync(
            DeleteOriginRequestPolicyRequest deleteOriginRequestPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteOriginRequestPolicyRequest, DeleteOriginRequestPolicyResult> asyncHandler);

    /**
     * <p>
     * Remove a public key you previously added to CloudFront.
     * </p>
     * 
     * @param deletePublicKeyRequest
     * @return A Java Future containing the result of the DeletePublicKey operation returned by the service.
     * @sample AmazonCloudFrontAsync.DeletePublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeletePublicKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePublicKeyResult> deletePublicKeyAsync(DeletePublicKeyRequest deletePublicKeyRequest);

    /**
     * <p>
     * Remove a public key you previously added to CloudFront.
     * </p>
     * 
     * @param deletePublicKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePublicKey operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.DeletePublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeletePublicKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePublicKeyResult> deletePublicKeyAsync(DeletePublicKeyRequest deletePublicKeyRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePublicKeyRequest, DeletePublicKeyResult> asyncHandler);

    /**
     * <p>
     * Deletes a real-time log configuration.
     * </p>
     * <p>
     * You cannot delete a real-time log configuration if it's attached to a cache behavior. First update your
     * distributions to remove the real-time log configuration from all cache behaviors, then delete the real-time log
     * configuration.
     * </p>
     * <p>
     * To delete a real-time log configuration, you can provide the configuration's name or its Amazon Resource Name
     * (ARN). You must provide at least one. If you provide both, CloudFront uses the name to identify the real-time log
     * configuration to delete.
     * </p>
     * 
     * @param deleteRealtimeLogConfigRequest
     * @return A Java Future containing the result of the DeleteRealtimeLogConfig operation returned by the service.
     * @sample AmazonCloudFrontAsync.DeleteRealtimeLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteRealtimeLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRealtimeLogConfigResult> deleteRealtimeLogConfigAsync(DeleteRealtimeLogConfigRequest deleteRealtimeLogConfigRequest);

    /**
     * <p>
     * Deletes a real-time log configuration.
     * </p>
     * <p>
     * You cannot delete a real-time log configuration if it's attached to a cache behavior. First update your
     * distributions to remove the real-time log configuration from all cache behaviors, then delete the real-time log
     * configuration.
     * </p>
     * <p>
     * To delete a real-time log configuration, you can provide the configuration's name or its Amazon Resource Name
     * (ARN). You must provide at least one. If you provide both, CloudFront uses the name to identify the real-time log
     * configuration to delete.
     * </p>
     * 
     * @param deleteRealtimeLogConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRealtimeLogConfig operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.DeleteRealtimeLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteRealtimeLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRealtimeLogConfigResult> deleteRealtimeLogConfigAsync(DeleteRealtimeLogConfigRequest deleteRealtimeLogConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRealtimeLogConfigRequest, DeleteRealtimeLogConfigResult> asyncHandler);

    /**
     * <p>
     * Deletes a response headers policy.
     * </p>
     * <p>
     * You cannot delete a response headers policy if it's attached to a cache behavior. First update your distributions
     * to remove the response headers policy from all cache behaviors, then delete the response headers policy.
     * </p>
     * <p>
     * To delete a response headers policy, you must provide the policy's identifier and version. To get these values,
     * you can use <code>ListResponseHeadersPolicies</code> or <code>GetResponseHeadersPolicy</code>.
     * </p>
     * 
     * @param deleteResponseHeadersPolicyRequest
     * @return A Java Future containing the result of the DeleteResponseHeadersPolicy operation returned by the service.
     * @sample AmazonCloudFrontAsync.DeleteResponseHeadersPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteResponseHeadersPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResponseHeadersPolicyResult> deleteResponseHeadersPolicyAsync(
            DeleteResponseHeadersPolicyRequest deleteResponseHeadersPolicyRequest);

    /**
     * <p>
     * Deletes a response headers policy.
     * </p>
     * <p>
     * You cannot delete a response headers policy if it's attached to a cache behavior. First update your distributions
     * to remove the response headers policy from all cache behaviors, then delete the response headers policy.
     * </p>
     * <p>
     * To delete a response headers policy, you must provide the policy's identifier and version. To get these values,
     * you can use <code>ListResponseHeadersPolicies</code> or <code>GetResponseHeadersPolicy</code>.
     * </p>
     * 
     * @param deleteResponseHeadersPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResponseHeadersPolicy operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.DeleteResponseHeadersPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteResponseHeadersPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResponseHeadersPolicyResult> deleteResponseHeadersPolicyAsync(
            DeleteResponseHeadersPolicyRequest deleteResponseHeadersPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResponseHeadersPolicyRequest, DeleteResponseHeadersPolicyResult> asyncHandler);

    /**
     * <p>
     * Delete a streaming distribution. To delete an RTMP distribution using the CloudFront API, perform the following
     * steps.
     * </p>
     * <p>
     * <b>To delete an RTMP distribution using the CloudFront API</b>:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Disable the RTMP distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>GET Streaming Distribution Config</code> request to get the current configuration and the
     * <code>Etag</code> header for the distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * Update the XML document that was returned in the response to your <code>GET Streaming Distribution Config</code>
     * request to change the value of <code>Enabled</code> to <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>PUT Streaming Distribution Config</code> request to update the configuration for your
     * distribution. In the request body, include the XML document that you updated in Step 3. Then set the value of the
     * HTTP <code>If-Match</code> header to the value of the <code>ETag</code> header that CloudFront returned when you
     * submitted the <code>GET Streaming Distribution Config</code> request in Step 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * Review the response to the <code>PUT Streaming Distribution Config</code> request to confirm that the
     * distribution was successfully disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>GET Streaming Distribution Config</code> request to confirm that your changes have propagated.
     * When propagation is complete, the value of <code>Status</code> is <code>Deployed</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DELETE Streaming Distribution</code> request. Set the value of the HTTP <code>If-Match</code>
     * header to the value of the <code>ETag</code> header that CloudFront returned when you submitted the
     * <code>GET Streaming Distribution Config</code> request in Step 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * Review the response to your <code>DELETE Streaming Distribution</code> request to confirm that the distribution
     * was successfully deleted.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For information about deleting a distribution using the CloudFront console, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/HowToDeleteDistribution.html">Deleting a
     * Distribution</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param deleteStreamingDistributionRequest
     *        The request to delete a streaming distribution.
     * @return A Java Future containing the result of the DeleteStreamingDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsync.DeleteStreamingDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteStreamingDistribution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteStreamingDistributionResult> deleteStreamingDistributionAsync(
            DeleteStreamingDistributionRequest deleteStreamingDistributionRequest);

    /**
     * <p>
     * Delete a streaming distribution. To delete an RTMP distribution using the CloudFront API, perform the following
     * steps.
     * </p>
     * <p>
     * <b>To delete an RTMP distribution using the CloudFront API</b>:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Disable the RTMP distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>GET Streaming Distribution Config</code> request to get the current configuration and the
     * <code>Etag</code> header for the distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * Update the XML document that was returned in the response to your <code>GET Streaming Distribution Config</code>
     * request to change the value of <code>Enabled</code> to <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>PUT Streaming Distribution Config</code> request to update the configuration for your
     * distribution. In the request body, include the XML document that you updated in Step 3. Then set the value of the
     * HTTP <code>If-Match</code> header to the value of the <code>ETag</code> header that CloudFront returned when you
     * submitted the <code>GET Streaming Distribution Config</code> request in Step 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * Review the response to the <code>PUT Streaming Distribution Config</code> request to confirm that the
     * distribution was successfully disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>GET Streaming Distribution Config</code> request to confirm that your changes have propagated.
     * When propagation is complete, the value of <code>Status</code> is <code>Deployed</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DELETE Streaming Distribution</code> request. Set the value of the HTTP <code>If-Match</code>
     * header to the value of the <code>ETag</code> header that CloudFront returned when you submitted the
     * <code>GET Streaming Distribution Config</code> request in Step 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * Review the response to your <code>DELETE Streaming Distribution</code> request to confirm that the distribution
     * was successfully deleted.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For information about deleting a distribution using the CloudFront console, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/HowToDeleteDistribution.html">Deleting a
     * Distribution</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param deleteStreamingDistributionRequest
     *        The request to delete a streaming distribution.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteStreamingDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.DeleteStreamingDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteStreamingDistribution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteStreamingDistributionResult> deleteStreamingDistributionAsync(
            DeleteStreamingDistributionRequest deleteStreamingDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStreamingDistributionRequest, DeleteStreamingDistributionResult> asyncHandler);

    /**
     * <p>
     * Gets configuration information and metadata about a CloudFront function, but not the function's code. To get a
     * function's code, use <code>GetFunction</code>.
     * </p>
     * <p>
     * To get configuration information and metadata about a function, you must provide the function's name and stage.
     * To get these values, you can use <code>ListFunctions</code>.
     * </p>
     * 
     * @param describeFunctionRequest
     * @return A Java Future containing the result of the DescribeFunction operation returned by the service.
     * @sample AmazonCloudFrontAsync.DescribeFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DescribeFunction" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFunctionResult> describeFunctionAsync(DescribeFunctionRequest describeFunctionRequest);

    /**
     * <p>
     * Gets configuration information and metadata about a CloudFront function, but not the function's code. To get a
     * function's code, use <code>GetFunction</code>.
     * </p>
     * <p>
     * To get configuration information and metadata about a function, you must provide the function's name and stage.
     * To get these values, you can use <code>ListFunctions</code>.
     * </p>
     * 
     * @param describeFunctionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFunction operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.DescribeFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DescribeFunction" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFunctionResult> describeFunctionAsync(DescribeFunctionRequest describeFunctionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFunctionRequest, DescribeFunctionResult> asyncHandler);

    /**
     * <p>
     * Gets a cache policy, including the following metadata:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The policy's identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * The date and time when the policy was last modified.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get a cache policy, you must provide the policy's identifier. If the cache policy is attached to a
     * distribution's cache behavior, you can get the policy's identifier using <code>ListDistributions</code> or
     * <code>GetDistribution</code>. If the cache policy is not attached to a cache behavior, you can get the identifier
     * using <code>ListCachePolicies</code>.
     * </p>
     * 
     * @param getCachePolicyRequest
     * @return A Java Future containing the result of the GetCachePolicy operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetCachePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetCachePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCachePolicyResult> getCachePolicyAsync(GetCachePolicyRequest getCachePolicyRequest);

    /**
     * <p>
     * Gets a cache policy, including the following metadata:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The policy's identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * The date and time when the policy was last modified.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get a cache policy, you must provide the policy's identifier. If the cache policy is attached to a
     * distribution's cache behavior, you can get the policy's identifier using <code>ListDistributions</code> or
     * <code>GetDistribution</code>. If the cache policy is not attached to a cache behavior, you can get the identifier
     * using <code>ListCachePolicies</code>.
     * </p>
     * 
     * @param getCachePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCachePolicy operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.GetCachePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetCachePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCachePolicyResult> getCachePolicyAsync(GetCachePolicyRequest getCachePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetCachePolicyRequest, GetCachePolicyResult> asyncHandler);

    /**
     * <p>
     * Gets a cache policy configuration.
     * </p>
     * <p>
     * To get a cache policy configuration, you must provide the policy's identifier. If the cache policy is attached to
     * a distribution's cache behavior, you can get the policy's identifier using <code>ListDistributions</code> or
     * <code>GetDistribution</code>. If the cache policy is not attached to a cache behavior, you can get the identifier
     * using <code>ListCachePolicies</code>.
     * </p>
     * 
     * @param getCachePolicyConfigRequest
     * @return A Java Future containing the result of the GetCachePolicyConfig operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetCachePolicyConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetCachePolicyConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCachePolicyConfigResult> getCachePolicyConfigAsync(GetCachePolicyConfigRequest getCachePolicyConfigRequest);

    /**
     * <p>
     * Gets a cache policy configuration.
     * </p>
     * <p>
     * To get a cache policy configuration, you must provide the policy's identifier. If the cache policy is attached to
     * a distribution's cache behavior, you can get the policy's identifier using <code>ListDistributions</code> or
     * <code>GetDistribution</code>. If the cache policy is not attached to a cache behavior, you can get the identifier
     * using <code>ListCachePolicies</code>.
     * </p>
     * 
     * @param getCachePolicyConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCachePolicyConfig operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.GetCachePolicyConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetCachePolicyConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCachePolicyConfigResult> getCachePolicyConfigAsync(GetCachePolicyConfigRequest getCachePolicyConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetCachePolicyConfigRequest, GetCachePolicyConfigResult> asyncHandler);

    /**
     * <p>
     * Get the information about an origin access identity.
     * </p>
     * 
     * @param getCloudFrontOriginAccessIdentityRequest
     *        The request to get an origin access identity's information.
     * @return A Java Future containing the result of the GetCloudFrontOriginAccessIdentity operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.GetCloudFrontOriginAccessIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetCloudFrontOriginAccessIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCloudFrontOriginAccessIdentityResult> getCloudFrontOriginAccessIdentityAsync(
            GetCloudFrontOriginAccessIdentityRequest getCloudFrontOriginAccessIdentityRequest);

    /**
     * <p>
     * Get the information about an origin access identity.
     * </p>
     * 
     * @param getCloudFrontOriginAccessIdentityRequest
     *        The request to get an origin access identity's information.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCloudFrontOriginAccessIdentity operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.GetCloudFrontOriginAccessIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetCloudFrontOriginAccessIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCloudFrontOriginAccessIdentityResult> getCloudFrontOriginAccessIdentityAsync(
            GetCloudFrontOriginAccessIdentityRequest getCloudFrontOriginAccessIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<GetCloudFrontOriginAccessIdentityRequest, GetCloudFrontOriginAccessIdentityResult> asyncHandler);

    /**
     * <p>
     * Get the configuration information about an origin access identity.
     * </p>
     * 
     * @param getCloudFrontOriginAccessIdentityConfigRequest
     *        The origin access identity's configuration information. For more information, see <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_CloudFrontOriginAccessIdentityConfig.html"
     *        >CloudFrontOriginAccessIdentityConfig</a>.
     * @return A Java Future containing the result of the GetCloudFrontOriginAccessIdentityConfig operation returned by
     *         the service.
     * @sample AmazonCloudFrontAsync.GetCloudFrontOriginAccessIdentityConfig
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetCloudFrontOriginAccessIdentityConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCloudFrontOriginAccessIdentityConfigResult> getCloudFrontOriginAccessIdentityConfigAsync(
            GetCloudFrontOriginAccessIdentityConfigRequest getCloudFrontOriginAccessIdentityConfigRequest);

    /**
     * <p>
     * Get the configuration information about an origin access identity.
     * </p>
     * 
     * @param getCloudFrontOriginAccessIdentityConfigRequest
     *        The origin access identity's configuration information. For more information, see <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_CloudFrontOriginAccessIdentityConfig.html"
     *        >CloudFrontOriginAccessIdentityConfig</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCloudFrontOriginAccessIdentityConfig operation returned by
     *         the service.
     * @sample AmazonCloudFrontAsyncHandler.GetCloudFrontOriginAccessIdentityConfig
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetCloudFrontOriginAccessIdentityConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCloudFrontOriginAccessIdentityConfigResult> getCloudFrontOriginAccessIdentityConfigAsync(
            GetCloudFrontOriginAccessIdentityConfigRequest getCloudFrontOriginAccessIdentityConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetCloudFrontOriginAccessIdentityConfigRequest, GetCloudFrontOriginAccessIdentityConfigResult> asyncHandler);

    /**
     * <p>
     * Gets a continuous deployment policy, including metadata (the policy's identifier and the date and time when the
     * policy was last modified).
     * </p>
     * 
     * @param getContinuousDeploymentPolicyRequest
     * @return A Java Future containing the result of the GetContinuousDeploymentPolicy operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.GetContinuousDeploymentPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetContinuousDeploymentPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetContinuousDeploymentPolicyResult> getContinuousDeploymentPolicyAsync(
            GetContinuousDeploymentPolicyRequest getContinuousDeploymentPolicyRequest);

    /**
     * <p>
     * Gets a continuous deployment policy, including metadata (the policy's identifier and the date and time when the
     * policy was last modified).
     * </p>
     * 
     * @param getContinuousDeploymentPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetContinuousDeploymentPolicy operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.GetContinuousDeploymentPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetContinuousDeploymentPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetContinuousDeploymentPolicyResult> getContinuousDeploymentPolicyAsync(
            GetContinuousDeploymentPolicyRequest getContinuousDeploymentPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetContinuousDeploymentPolicyRequest, GetContinuousDeploymentPolicyResult> asyncHandler);

    /**
     * <p>
     * Gets configuration information about a continuous deployment policy.
     * </p>
     * 
     * @param getContinuousDeploymentPolicyConfigRequest
     * @return A Java Future containing the result of the GetContinuousDeploymentPolicyConfig operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.GetContinuousDeploymentPolicyConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetContinuousDeploymentPolicyConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetContinuousDeploymentPolicyConfigResult> getContinuousDeploymentPolicyConfigAsync(
            GetContinuousDeploymentPolicyConfigRequest getContinuousDeploymentPolicyConfigRequest);

    /**
     * <p>
     * Gets configuration information about a continuous deployment policy.
     * </p>
     * 
     * @param getContinuousDeploymentPolicyConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetContinuousDeploymentPolicyConfig operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.GetContinuousDeploymentPolicyConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetContinuousDeploymentPolicyConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetContinuousDeploymentPolicyConfigResult> getContinuousDeploymentPolicyConfigAsync(
            GetContinuousDeploymentPolicyConfigRequest getContinuousDeploymentPolicyConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetContinuousDeploymentPolicyConfigRequest, GetContinuousDeploymentPolicyConfigResult> asyncHandler);

    /**
     * <p>
     * Get the information about a distribution.
     * </p>
     * 
     * @param getDistributionRequest
     *        The request to get a distribution's information.
     * @return A Java Future containing the result of the GetDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetDistribution" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDistributionResult> getDistributionAsync(GetDistributionRequest getDistributionRequest);

    /**
     * <p>
     * Get the information about a distribution.
     * </p>
     * 
     * @param getDistributionRequest
     *        The request to get a distribution's information.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.GetDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetDistribution" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDistributionResult> getDistributionAsync(GetDistributionRequest getDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<GetDistributionRequest, GetDistributionResult> asyncHandler);

    /**
     * <p>
     * Get the configuration information about a distribution.
     * </p>
     * 
     * @param getDistributionConfigRequest
     *        The request to get a distribution configuration.
     * @return A Java Future containing the result of the GetDistributionConfig operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetDistributionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetDistributionConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDistributionConfigResult> getDistributionConfigAsync(GetDistributionConfigRequest getDistributionConfigRequest);

    /**
     * <p>
     * Get the configuration information about a distribution.
     * </p>
     * 
     * @param getDistributionConfigRequest
     *        The request to get a distribution configuration.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDistributionConfig operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.GetDistributionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetDistributionConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDistributionConfigResult> getDistributionConfigAsync(GetDistributionConfigRequest getDistributionConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetDistributionConfigRequest, GetDistributionConfigResult> asyncHandler);

    /**
     * <p>
     * Get the field-level encryption configuration information.
     * </p>
     * 
     * @param getFieldLevelEncryptionRequest
     * @return A Java Future containing the result of the GetFieldLevelEncryption operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetFieldLevelEncryption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetFieldLevelEncryption"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFieldLevelEncryptionResult> getFieldLevelEncryptionAsync(GetFieldLevelEncryptionRequest getFieldLevelEncryptionRequest);

    /**
     * <p>
     * Get the field-level encryption configuration information.
     * </p>
     * 
     * @param getFieldLevelEncryptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFieldLevelEncryption operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.GetFieldLevelEncryption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetFieldLevelEncryption"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFieldLevelEncryptionResult> getFieldLevelEncryptionAsync(GetFieldLevelEncryptionRequest getFieldLevelEncryptionRequest,
            com.amazonaws.handlers.AsyncHandler<GetFieldLevelEncryptionRequest, GetFieldLevelEncryptionResult> asyncHandler);

    /**
     * <p>
     * Get the field-level encryption configuration information.
     * </p>
     * 
     * @param getFieldLevelEncryptionConfigRequest
     * @return A Java Future containing the result of the GetFieldLevelEncryptionConfig operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.GetFieldLevelEncryptionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetFieldLevelEncryptionConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFieldLevelEncryptionConfigResult> getFieldLevelEncryptionConfigAsync(
            GetFieldLevelEncryptionConfigRequest getFieldLevelEncryptionConfigRequest);

    /**
     * <p>
     * Get the field-level encryption configuration information.
     * </p>
     * 
     * @param getFieldLevelEncryptionConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFieldLevelEncryptionConfig operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.GetFieldLevelEncryptionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetFieldLevelEncryptionConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFieldLevelEncryptionConfigResult> getFieldLevelEncryptionConfigAsync(
            GetFieldLevelEncryptionConfigRequest getFieldLevelEncryptionConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetFieldLevelEncryptionConfigRequest, GetFieldLevelEncryptionConfigResult> asyncHandler);

    /**
     * <p>
     * Get the field-level encryption profile information.
     * </p>
     * 
     * @param getFieldLevelEncryptionProfileRequest
     * @return A Java Future containing the result of the GetFieldLevelEncryptionProfile operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.GetFieldLevelEncryptionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetFieldLevelEncryptionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFieldLevelEncryptionProfileResult> getFieldLevelEncryptionProfileAsync(
            GetFieldLevelEncryptionProfileRequest getFieldLevelEncryptionProfileRequest);

    /**
     * <p>
     * Get the field-level encryption profile information.
     * </p>
     * 
     * @param getFieldLevelEncryptionProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFieldLevelEncryptionProfile operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.GetFieldLevelEncryptionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetFieldLevelEncryptionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFieldLevelEncryptionProfileResult> getFieldLevelEncryptionProfileAsync(
            GetFieldLevelEncryptionProfileRequest getFieldLevelEncryptionProfileRequest,
            com.amazonaws.handlers.AsyncHandler<GetFieldLevelEncryptionProfileRequest, GetFieldLevelEncryptionProfileResult> asyncHandler);

    /**
     * <p>
     * Get the field-level encryption profile configuration information.
     * </p>
     * 
     * @param getFieldLevelEncryptionProfileConfigRequest
     * @return A Java Future containing the result of the GetFieldLevelEncryptionProfileConfig operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.GetFieldLevelEncryptionProfileConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetFieldLevelEncryptionProfileConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFieldLevelEncryptionProfileConfigResult> getFieldLevelEncryptionProfileConfigAsync(
            GetFieldLevelEncryptionProfileConfigRequest getFieldLevelEncryptionProfileConfigRequest);

    /**
     * <p>
     * Get the field-level encryption profile configuration information.
     * </p>
     * 
     * @param getFieldLevelEncryptionProfileConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFieldLevelEncryptionProfileConfig operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.GetFieldLevelEncryptionProfileConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetFieldLevelEncryptionProfileConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFieldLevelEncryptionProfileConfigResult> getFieldLevelEncryptionProfileConfigAsync(
            GetFieldLevelEncryptionProfileConfigRequest getFieldLevelEncryptionProfileConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetFieldLevelEncryptionProfileConfigRequest, GetFieldLevelEncryptionProfileConfigResult> asyncHandler);

    /**
     * <p>
     * Gets the code of a CloudFront function. To get configuration information and metadata about a function, use
     * <code>DescribeFunction</code>.
     * </p>
     * <p>
     * To get a function's code, you must provide the function's name and stage. To get these values, you can use
     * <code>ListFunctions</code>.
     * </p>
     * 
     * @param getFunctionRequest
     * @return A Java Future containing the result of the GetFunction operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetFunction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFunctionResult> getFunctionAsync(GetFunctionRequest getFunctionRequest);

    /**
     * <p>
     * Gets the code of a CloudFront function. To get configuration information and metadata about a function, use
     * <code>DescribeFunction</code>.
     * </p>
     * <p>
     * To get a function's code, you must provide the function's name and stage. To get these values, you can use
     * <code>ListFunctions</code>.
     * </p>
     * 
     * @param getFunctionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFunction operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.GetFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetFunction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFunctionResult> getFunctionAsync(GetFunctionRequest getFunctionRequest,
            com.amazonaws.handlers.AsyncHandler<GetFunctionRequest, GetFunctionResult> asyncHandler);

    /**
     * <p>
     * Get the information about an invalidation.
     * </p>
     * 
     * @param getInvalidationRequest
     *        The request to get an invalidation's information.
     * @return A Java Future containing the result of the GetInvalidation operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetInvalidation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetInvalidation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInvalidationResult> getInvalidationAsync(GetInvalidationRequest getInvalidationRequest);

    /**
     * <p>
     * Get the information about an invalidation.
     * </p>
     * 
     * @param getInvalidationRequest
     *        The request to get an invalidation's information.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInvalidation operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.GetInvalidation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetInvalidation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInvalidationResult> getInvalidationAsync(GetInvalidationRequest getInvalidationRequest,
            com.amazonaws.handlers.AsyncHandler<GetInvalidationRequest, GetInvalidationResult> asyncHandler);

    /**
     * <p>
     * Gets a key group, including the date and time when the key group was last modified.
     * </p>
     * <p>
     * To get a key group, you must provide the key group's identifier. If the key group is referenced in a
     * distribution's cache behavior, you can get the key group's identifier using <code>ListDistributions</code> or
     * <code>GetDistribution</code>. If the key group is not referenced in a cache behavior, you can get the identifier
     * using <code>ListKeyGroups</code>.
     * </p>
     * 
     * @param getKeyGroupRequest
     * @return A Java Future containing the result of the GetKeyGroup operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetKeyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetKeyGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetKeyGroupResult> getKeyGroupAsync(GetKeyGroupRequest getKeyGroupRequest);

    /**
     * <p>
     * Gets a key group, including the date and time when the key group was last modified.
     * </p>
     * <p>
     * To get a key group, you must provide the key group's identifier. If the key group is referenced in a
     * distribution's cache behavior, you can get the key group's identifier using <code>ListDistributions</code> or
     * <code>GetDistribution</code>. If the key group is not referenced in a cache behavior, you can get the identifier
     * using <code>ListKeyGroups</code>.
     * </p>
     * 
     * @param getKeyGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetKeyGroup operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.GetKeyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetKeyGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetKeyGroupResult> getKeyGroupAsync(GetKeyGroupRequest getKeyGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetKeyGroupRequest, GetKeyGroupResult> asyncHandler);

    /**
     * <p>
     * Gets a key group configuration.
     * </p>
     * <p>
     * To get a key group configuration, you must provide the key group's identifier. If the key group is referenced in
     * a distribution's cache behavior, you can get the key group's identifier using <code>ListDistributions</code> or
     * <code>GetDistribution</code>. If the key group is not referenced in a cache behavior, you can get the identifier
     * using <code>ListKeyGroups</code>.
     * </p>
     * 
     * @param getKeyGroupConfigRequest
     * @return A Java Future containing the result of the GetKeyGroupConfig operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetKeyGroupConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetKeyGroupConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetKeyGroupConfigResult> getKeyGroupConfigAsync(GetKeyGroupConfigRequest getKeyGroupConfigRequest);

    /**
     * <p>
     * Gets a key group configuration.
     * </p>
     * <p>
     * To get a key group configuration, you must provide the key group's identifier. If the key group is referenced in
     * a distribution's cache behavior, you can get the key group's identifier using <code>ListDistributions</code> or
     * <code>GetDistribution</code>. If the key group is not referenced in a cache behavior, you can get the identifier
     * using <code>ListKeyGroups</code>.
     * </p>
     * 
     * @param getKeyGroupConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetKeyGroupConfig operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.GetKeyGroupConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetKeyGroupConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetKeyGroupConfigResult> getKeyGroupConfigAsync(GetKeyGroupConfigRequest getKeyGroupConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetKeyGroupConfigRequest, GetKeyGroupConfigResult> asyncHandler);

    /**
     * <p>
     * Gets information about whether additional CloudWatch metrics are enabled for the specified CloudFront
     * distribution.
     * </p>
     * 
     * @param getMonitoringSubscriptionRequest
     * @return A Java Future containing the result of the GetMonitoringSubscription operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetMonitoringSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetMonitoringSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMonitoringSubscriptionResult> getMonitoringSubscriptionAsync(
            GetMonitoringSubscriptionRequest getMonitoringSubscriptionRequest);

    /**
     * <p>
     * Gets information about whether additional CloudWatch metrics are enabled for the specified CloudFront
     * distribution.
     * </p>
     * 
     * @param getMonitoringSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMonitoringSubscription operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.GetMonitoringSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetMonitoringSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMonitoringSubscriptionResult> getMonitoringSubscriptionAsync(
            GetMonitoringSubscriptionRequest getMonitoringSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<GetMonitoringSubscriptionRequest, GetMonitoringSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Gets a CloudFront origin access control, including its unique identifier.
     * </p>
     * 
     * @param getOriginAccessControlRequest
     * @return A Java Future containing the result of the GetOriginAccessControl operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetOriginAccessControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetOriginAccessControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOriginAccessControlResult> getOriginAccessControlAsync(GetOriginAccessControlRequest getOriginAccessControlRequest);

    /**
     * <p>
     * Gets a CloudFront origin access control, including its unique identifier.
     * </p>
     * 
     * @param getOriginAccessControlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOriginAccessControl operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.GetOriginAccessControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetOriginAccessControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOriginAccessControlResult> getOriginAccessControlAsync(GetOriginAccessControlRequest getOriginAccessControlRequest,
            com.amazonaws.handlers.AsyncHandler<GetOriginAccessControlRequest, GetOriginAccessControlResult> asyncHandler);

    /**
     * <p>
     * Gets a CloudFront origin access control configuration.
     * </p>
     * 
     * @param getOriginAccessControlConfigRequest
     * @return A Java Future containing the result of the GetOriginAccessControlConfig operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.GetOriginAccessControlConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetOriginAccessControlConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOriginAccessControlConfigResult> getOriginAccessControlConfigAsync(
            GetOriginAccessControlConfigRequest getOriginAccessControlConfigRequest);

    /**
     * <p>
     * Gets a CloudFront origin access control configuration.
     * </p>
     * 
     * @param getOriginAccessControlConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOriginAccessControlConfig operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.GetOriginAccessControlConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetOriginAccessControlConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOriginAccessControlConfigResult> getOriginAccessControlConfigAsync(
            GetOriginAccessControlConfigRequest getOriginAccessControlConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetOriginAccessControlConfigRequest, GetOriginAccessControlConfigResult> asyncHandler);

    /**
     * <p>
     * Gets an origin request policy, including the following metadata:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The policy's identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * The date and time when the policy was last modified.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get an origin request policy, you must provide the policy's identifier. If the origin request policy is
     * attached to a distribution's cache behavior, you can get the policy's identifier using
     * <code>ListDistributions</code> or <code>GetDistribution</code>. If the origin request policy is not attached to a
     * cache behavior, you can get the identifier using <code>ListOriginRequestPolicies</code>.
     * </p>
     * 
     * @param getOriginRequestPolicyRequest
     * @return A Java Future containing the result of the GetOriginRequestPolicy operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetOriginRequestPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetOriginRequestPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOriginRequestPolicyResult> getOriginRequestPolicyAsync(GetOriginRequestPolicyRequest getOriginRequestPolicyRequest);

    /**
     * <p>
     * Gets an origin request policy, including the following metadata:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The policy's identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * The date and time when the policy was last modified.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get an origin request policy, you must provide the policy's identifier. If the origin request policy is
     * attached to a distribution's cache behavior, you can get the policy's identifier using
     * <code>ListDistributions</code> or <code>GetDistribution</code>. If the origin request policy is not attached to a
     * cache behavior, you can get the identifier using <code>ListOriginRequestPolicies</code>.
     * </p>
     * 
     * @param getOriginRequestPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOriginRequestPolicy operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.GetOriginRequestPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetOriginRequestPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOriginRequestPolicyResult> getOriginRequestPolicyAsync(GetOriginRequestPolicyRequest getOriginRequestPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetOriginRequestPolicyRequest, GetOriginRequestPolicyResult> asyncHandler);

    /**
     * <p>
     * Gets an origin request policy configuration.
     * </p>
     * <p>
     * To get an origin request policy configuration, you must provide the policy's identifier. If the origin request
     * policy is attached to a distribution's cache behavior, you can get the policy's identifier using
     * <code>ListDistributions</code> or <code>GetDistribution</code>. If the origin request policy is not attached to a
     * cache behavior, you can get the identifier using <code>ListOriginRequestPolicies</code>.
     * </p>
     * 
     * @param getOriginRequestPolicyConfigRequest
     * @return A Java Future containing the result of the GetOriginRequestPolicyConfig operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.GetOriginRequestPolicyConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetOriginRequestPolicyConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOriginRequestPolicyConfigResult> getOriginRequestPolicyConfigAsync(
            GetOriginRequestPolicyConfigRequest getOriginRequestPolicyConfigRequest);

    /**
     * <p>
     * Gets an origin request policy configuration.
     * </p>
     * <p>
     * To get an origin request policy configuration, you must provide the policy's identifier. If the origin request
     * policy is attached to a distribution's cache behavior, you can get the policy's identifier using
     * <code>ListDistributions</code> or <code>GetDistribution</code>. If the origin request policy is not attached to a
     * cache behavior, you can get the identifier using <code>ListOriginRequestPolicies</code>.
     * </p>
     * 
     * @param getOriginRequestPolicyConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOriginRequestPolicyConfig operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.GetOriginRequestPolicyConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetOriginRequestPolicyConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOriginRequestPolicyConfigResult> getOriginRequestPolicyConfigAsync(
            GetOriginRequestPolicyConfigRequest getOriginRequestPolicyConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetOriginRequestPolicyConfigRequest, GetOriginRequestPolicyConfigResult> asyncHandler);

    /**
     * <p>
     * Gets a public key.
     * </p>
     * 
     * @param getPublicKeyRequest
     * @return A Java Future containing the result of the GetPublicKey operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetPublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetPublicKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPublicKeyResult> getPublicKeyAsync(GetPublicKeyRequest getPublicKeyRequest);

    /**
     * <p>
     * Gets a public key.
     * </p>
     * 
     * @param getPublicKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPublicKey operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.GetPublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetPublicKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPublicKeyResult> getPublicKeyAsync(GetPublicKeyRequest getPublicKeyRequest,
            com.amazonaws.handlers.AsyncHandler<GetPublicKeyRequest, GetPublicKeyResult> asyncHandler);

    /**
     * <p>
     * Gets a public key configuration.
     * </p>
     * 
     * @param getPublicKeyConfigRequest
     * @return A Java Future containing the result of the GetPublicKeyConfig operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetPublicKeyConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetPublicKeyConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPublicKeyConfigResult> getPublicKeyConfigAsync(GetPublicKeyConfigRequest getPublicKeyConfigRequest);

    /**
     * <p>
     * Gets a public key configuration.
     * </p>
     * 
     * @param getPublicKeyConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPublicKeyConfig operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.GetPublicKeyConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetPublicKeyConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPublicKeyConfigResult> getPublicKeyConfigAsync(GetPublicKeyConfigRequest getPublicKeyConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetPublicKeyConfigRequest, GetPublicKeyConfigResult> asyncHandler);

    /**
     * <p>
     * Gets a real-time log configuration.
     * </p>
     * <p>
     * To get a real-time log configuration, you can provide the configuration's name or its Amazon Resource Name (ARN).
     * You must provide at least one. If you provide both, CloudFront uses the name to identify the real-time log
     * configuration to get.
     * </p>
     * 
     * @param getRealtimeLogConfigRequest
     * @return A Java Future containing the result of the GetRealtimeLogConfig operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetRealtimeLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetRealtimeLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRealtimeLogConfigResult> getRealtimeLogConfigAsync(GetRealtimeLogConfigRequest getRealtimeLogConfigRequest);

    /**
     * <p>
     * Gets a real-time log configuration.
     * </p>
     * <p>
     * To get a real-time log configuration, you can provide the configuration's name or its Amazon Resource Name (ARN).
     * You must provide at least one. If you provide both, CloudFront uses the name to identify the real-time log
     * configuration to get.
     * </p>
     * 
     * @param getRealtimeLogConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRealtimeLogConfig operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.GetRealtimeLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetRealtimeLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRealtimeLogConfigResult> getRealtimeLogConfigAsync(GetRealtimeLogConfigRequest getRealtimeLogConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetRealtimeLogConfigRequest, GetRealtimeLogConfigResult> asyncHandler);

    /**
     * <p>
     * Gets a response headers policy, including metadata (the policy's identifier and the date and time when the policy
     * was last modified).
     * </p>
     * <p>
     * To get a response headers policy, you must provide the policy's identifier. If the response headers policy is
     * attached to a distribution's cache behavior, you can get the policy's identifier using
     * <code>ListDistributions</code> or <code>GetDistribution</code>. If the response headers policy is not attached to
     * a cache behavior, you can get the identifier using <code>ListResponseHeadersPolicies</code>.
     * </p>
     * 
     * @param getResponseHeadersPolicyRequest
     * @return A Java Future containing the result of the GetResponseHeadersPolicy operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetResponseHeadersPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetResponseHeadersPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResponseHeadersPolicyResult> getResponseHeadersPolicyAsync(GetResponseHeadersPolicyRequest getResponseHeadersPolicyRequest);

    /**
     * <p>
     * Gets a response headers policy, including metadata (the policy's identifier and the date and time when the policy
     * was last modified).
     * </p>
     * <p>
     * To get a response headers policy, you must provide the policy's identifier. If the response headers policy is
     * attached to a distribution's cache behavior, you can get the policy's identifier using
     * <code>ListDistributions</code> or <code>GetDistribution</code>. If the response headers policy is not attached to
     * a cache behavior, you can get the identifier using <code>ListResponseHeadersPolicies</code>.
     * </p>
     * 
     * @param getResponseHeadersPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResponseHeadersPolicy operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.GetResponseHeadersPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetResponseHeadersPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResponseHeadersPolicyResult> getResponseHeadersPolicyAsync(GetResponseHeadersPolicyRequest getResponseHeadersPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetResponseHeadersPolicyRequest, GetResponseHeadersPolicyResult> asyncHandler);

    /**
     * <p>
     * Gets a response headers policy configuration.
     * </p>
     * <p>
     * To get a response headers policy configuration, you must provide the policy's identifier. If the response headers
     * policy is attached to a distribution's cache behavior, you can get the policy's identifier using
     * <code>ListDistributions</code> or <code>GetDistribution</code>. If the response headers policy is not attached to
     * a cache behavior, you can get the identifier using <code>ListResponseHeadersPolicies</code>.
     * </p>
     * 
     * @param getResponseHeadersPolicyConfigRequest
     * @return A Java Future containing the result of the GetResponseHeadersPolicyConfig operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.GetResponseHeadersPolicyConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetResponseHeadersPolicyConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResponseHeadersPolicyConfigResult> getResponseHeadersPolicyConfigAsync(
            GetResponseHeadersPolicyConfigRequest getResponseHeadersPolicyConfigRequest);

    /**
     * <p>
     * Gets a response headers policy configuration.
     * </p>
     * <p>
     * To get a response headers policy configuration, you must provide the policy's identifier. If the response headers
     * policy is attached to a distribution's cache behavior, you can get the policy's identifier using
     * <code>ListDistributions</code> or <code>GetDistribution</code>. If the response headers policy is not attached to
     * a cache behavior, you can get the identifier using <code>ListResponseHeadersPolicies</code>.
     * </p>
     * 
     * @param getResponseHeadersPolicyConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResponseHeadersPolicyConfig operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.GetResponseHeadersPolicyConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetResponseHeadersPolicyConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResponseHeadersPolicyConfigResult> getResponseHeadersPolicyConfigAsync(
            GetResponseHeadersPolicyConfigRequest getResponseHeadersPolicyConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetResponseHeadersPolicyConfigRequest, GetResponseHeadersPolicyConfigResult> asyncHandler);

    /**
     * <p>
     * Gets information about a specified RTMP distribution, including the distribution configuration.
     * </p>
     * 
     * @param getStreamingDistributionRequest
     *        The request to get a streaming distribution's information.
     * @return A Java Future containing the result of the GetStreamingDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetStreamingDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetStreamingDistribution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetStreamingDistributionResult> getStreamingDistributionAsync(GetStreamingDistributionRequest getStreamingDistributionRequest);

    /**
     * <p>
     * Gets information about a specified RTMP distribution, including the distribution configuration.
     * </p>
     * 
     * @param getStreamingDistributionRequest
     *        The request to get a streaming distribution's information.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStreamingDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.GetStreamingDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetStreamingDistribution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetStreamingDistributionResult> getStreamingDistributionAsync(GetStreamingDistributionRequest getStreamingDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<GetStreamingDistributionRequest, GetStreamingDistributionResult> asyncHandler);

    /**
     * <p>
     * Get the configuration information about a streaming distribution.
     * </p>
     * 
     * @param getStreamingDistributionConfigRequest
     *        To request to get a streaming distribution configuration.
     * @return A Java Future containing the result of the GetStreamingDistributionConfig operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.GetStreamingDistributionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetStreamingDistributionConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetStreamingDistributionConfigResult> getStreamingDistributionConfigAsync(
            GetStreamingDistributionConfigRequest getStreamingDistributionConfigRequest);

    /**
     * <p>
     * Get the configuration information about a streaming distribution.
     * </p>
     * 
     * @param getStreamingDistributionConfigRequest
     *        To request to get a streaming distribution configuration.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStreamingDistributionConfig operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.GetStreamingDistributionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetStreamingDistributionConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetStreamingDistributionConfigResult> getStreamingDistributionConfigAsync(
            GetStreamingDistributionConfigRequest getStreamingDistributionConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetStreamingDistributionConfigRequest, GetStreamingDistributionConfigResult> asyncHandler);

    /**
     * <p>
     * Gets a list of cache policies.
     * </p>
     * <p>
     * You can optionally apply a filter to return only the managed policies created by Amazon Web Services, or only the
     * custom policies created in your Amazon Web Services account.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listCachePoliciesRequest
     * @return A Java Future containing the result of the ListCachePolicies operation returned by the service.
     * @sample AmazonCloudFrontAsync.ListCachePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListCachePolicies" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListCachePoliciesResult> listCachePoliciesAsync(ListCachePoliciesRequest listCachePoliciesRequest);

    /**
     * <p>
     * Gets a list of cache policies.
     * </p>
     * <p>
     * You can optionally apply a filter to return only the managed policies created by Amazon Web Services, or only the
     * custom policies created in your Amazon Web Services account.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listCachePoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCachePolicies operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.ListCachePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListCachePolicies" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListCachePoliciesResult> listCachePoliciesAsync(ListCachePoliciesRequest listCachePoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListCachePoliciesRequest, ListCachePoliciesResult> asyncHandler);

    /**
     * <p>
     * Lists origin access identities.
     * </p>
     * 
     * @param listCloudFrontOriginAccessIdentitiesRequest
     *        The request to list origin access identities.
     * @return A Java Future containing the result of the ListCloudFrontOriginAccessIdentities operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.ListCloudFrontOriginAccessIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListCloudFrontOriginAccessIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCloudFrontOriginAccessIdentitiesResult> listCloudFrontOriginAccessIdentitiesAsync(
            ListCloudFrontOriginAccessIdentitiesRequest listCloudFrontOriginAccessIdentitiesRequest);

    /**
     * <p>
     * Lists origin access identities.
     * </p>
     * 
     * @param listCloudFrontOriginAccessIdentitiesRequest
     *        The request to list origin access identities.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCloudFrontOriginAccessIdentities operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.ListCloudFrontOriginAccessIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListCloudFrontOriginAccessIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCloudFrontOriginAccessIdentitiesResult> listCloudFrontOriginAccessIdentitiesAsync(
            ListCloudFrontOriginAccessIdentitiesRequest listCloudFrontOriginAccessIdentitiesRequest,
            com.amazonaws.handlers.AsyncHandler<ListCloudFrontOriginAccessIdentitiesRequest, ListCloudFrontOriginAccessIdentitiesResult> asyncHandler);

    /**
     * <p>
     * Gets a list of aliases (also called CNAMEs or alternate domain names) that conflict or overlap with the provided
     * alias, and the associated CloudFront distributions and Amazon Web Services accounts for each conflicting alias.
     * In the returned list, the distribution and account IDs are partially hidden, which allows you to identify the
     * distributions and accounts that you own, but helps to protect the information of ones that you don't own.
     * </p>
     * <p>
     * Use this operation to find aliases that are in use in CloudFront that conflict or overlap with the provided
     * alias. For example, if you provide <code>www.example.com</code> as input, the returned list can include
     * <code>www.example.com</code> and the overlapping wildcard alternate domain name (<code>*.example.com</code>), if
     * they exist. If you provide <code>*.example.com</code> as input, the returned list can include
     * <code>*.example.com</code> and any alternate domain names covered by that wildcard (for example,
     * <code>www.example.com</code>, <code>test.example.com</code>, <code>dev.example.com</code>, and so on), if they
     * exist.
     * </p>
     * <p>
     * To list conflicting aliases, you provide the alias to search and the ID of a distribution in your account that
     * has an attached SSL/TLS certificate that includes the provided alias. For more information, including how to set
     * up the distribution and certificate, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html#alternate-domain-names-move"
     * >Moving an alternate domain name to a different distribution</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listConflictingAliasesRequest
     * @return A Java Future containing the result of the ListConflictingAliases operation returned by the service.
     * @sample AmazonCloudFrontAsync.ListConflictingAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListConflictingAliases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConflictingAliasesResult> listConflictingAliasesAsync(ListConflictingAliasesRequest listConflictingAliasesRequest);

    /**
     * <p>
     * Gets a list of aliases (also called CNAMEs or alternate domain names) that conflict or overlap with the provided
     * alias, and the associated CloudFront distributions and Amazon Web Services accounts for each conflicting alias.
     * In the returned list, the distribution and account IDs are partially hidden, which allows you to identify the
     * distributions and accounts that you own, but helps to protect the information of ones that you don't own.
     * </p>
     * <p>
     * Use this operation to find aliases that are in use in CloudFront that conflict or overlap with the provided
     * alias. For example, if you provide <code>www.example.com</code> as input, the returned list can include
     * <code>www.example.com</code> and the overlapping wildcard alternate domain name (<code>*.example.com</code>), if
     * they exist. If you provide <code>*.example.com</code> as input, the returned list can include
     * <code>*.example.com</code> and any alternate domain names covered by that wildcard (for example,
     * <code>www.example.com</code>, <code>test.example.com</code>, <code>dev.example.com</code>, and so on), if they
     * exist.
     * </p>
     * <p>
     * To list conflicting aliases, you provide the alias to search and the ID of a distribution in your account that
     * has an attached SSL/TLS certificate that includes the provided alias. For more information, including how to set
     * up the distribution and certificate, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html#alternate-domain-names-move"
     * >Moving an alternate domain name to a different distribution</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listConflictingAliasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConflictingAliases operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.ListConflictingAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListConflictingAliases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConflictingAliasesResult> listConflictingAliasesAsync(ListConflictingAliasesRequest listConflictingAliasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListConflictingAliasesRequest, ListConflictingAliasesResult> asyncHandler);

    /**
     * <p>
     * Gets a list of the continuous deployment policies in your Amazon Web Services account.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listContinuousDeploymentPoliciesRequest
     * @return A Java Future containing the result of the ListContinuousDeploymentPolicies operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.ListContinuousDeploymentPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListContinuousDeploymentPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListContinuousDeploymentPoliciesResult> listContinuousDeploymentPoliciesAsync(
            ListContinuousDeploymentPoliciesRequest listContinuousDeploymentPoliciesRequest);

    /**
     * <p>
     * Gets a list of the continuous deployment policies in your Amazon Web Services account.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listContinuousDeploymentPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListContinuousDeploymentPolicies operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.ListContinuousDeploymentPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListContinuousDeploymentPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListContinuousDeploymentPoliciesResult> listContinuousDeploymentPoliciesAsync(
            ListContinuousDeploymentPoliciesRequest listContinuousDeploymentPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListContinuousDeploymentPoliciesRequest, ListContinuousDeploymentPoliciesResult> asyncHandler);

    /**
     * <p>
     * List CloudFront distributions.
     * </p>
     * 
     * @param listDistributionsRequest
     *        The request to list your distributions.
     * @return A Java Future containing the result of the ListDistributions operation returned by the service.
     * @sample AmazonCloudFrontAsync.ListDistributions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListDistributions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDistributionsResult> listDistributionsAsync(ListDistributionsRequest listDistributionsRequest);

    /**
     * <p>
     * List CloudFront distributions.
     * </p>
     * 
     * @param listDistributionsRequest
     *        The request to list your distributions.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDistributions operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.ListDistributions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListDistributions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDistributionsResult> listDistributionsAsync(ListDistributionsRequest listDistributionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDistributionsRequest, ListDistributionsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of distribution IDs for distributions that have a cache behavior that's associated with the specified
     * cache policy.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listDistributionsByCachePolicyIdRequest
     * @return A Java Future containing the result of the ListDistributionsByCachePolicyId operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.ListDistributionsByCachePolicyId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListDistributionsByCachePolicyId"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDistributionsByCachePolicyIdResult> listDistributionsByCachePolicyIdAsync(
            ListDistributionsByCachePolicyIdRequest listDistributionsByCachePolicyIdRequest);

    /**
     * <p>
     * Gets a list of distribution IDs for distributions that have a cache behavior that's associated with the specified
     * cache policy.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listDistributionsByCachePolicyIdRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDistributionsByCachePolicyId operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.ListDistributionsByCachePolicyId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListDistributionsByCachePolicyId"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDistributionsByCachePolicyIdResult> listDistributionsByCachePolicyIdAsync(
            ListDistributionsByCachePolicyIdRequest listDistributionsByCachePolicyIdRequest,
            com.amazonaws.handlers.AsyncHandler<ListDistributionsByCachePolicyIdRequest, ListDistributionsByCachePolicyIdResult> asyncHandler);

    /**
     * <p>
     * Gets a list of distribution IDs for distributions that have a cache behavior that references the specified key
     * group.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listDistributionsByKeyGroupRequest
     * @return A Java Future containing the result of the ListDistributionsByKeyGroup operation returned by the service.
     * @sample AmazonCloudFrontAsync.ListDistributionsByKeyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListDistributionsByKeyGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDistributionsByKeyGroupResult> listDistributionsByKeyGroupAsync(
            ListDistributionsByKeyGroupRequest listDistributionsByKeyGroupRequest);

    /**
     * <p>
     * Gets a list of distribution IDs for distributions that have a cache behavior that references the specified key
     * group.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listDistributionsByKeyGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDistributionsByKeyGroup operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.ListDistributionsByKeyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListDistributionsByKeyGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDistributionsByKeyGroupResult> listDistributionsByKeyGroupAsync(
            ListDistributionsByKeyGroupRequest listDistributionsByKeyGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ListDistributionsByKeyGroupRequest, ListDistributionsByKeyGroupResult> asyncHandler);

    /**
     * <p>
     * Gets a list of distribution IDs for distributions that have a cache behavior that's associated with the specified
     * origin request policy.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listDistributionsByOriginRequestPolicyIdRequest
     * @return A Java Future containing the result of the ListDistributionsByOriginRequestPolicyId operation returned by
     *         the service.
     * @sample AmazonCloudFrontAsync.ListDistributionsByOriginRequestPolicyId
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListDistributionsByOriginRequestPolicyId"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDistributionsByOriginRequestPolicyIdResult> listDistributionsByOriginRequestPolicyIdAsync(
            ListDistributionsByOriginRequestPolicyIdRequest listDistributionsByOriginRequestPolicyIdRequest);

    /**
     * <p>
     * Gets a list of distribution IDs for distributions that have a cache behavior that's associated with the specified
     * origin request policy.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listDistributionsByOriginRequestPolicyIdRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDistributionsByOriginRequestPolicyId operation returned by
     *         the service.
     * @sample AmazonCloudFrontAsyncHandler.ListDistributionsByOriginRequestPolicyId
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListDistributionsByOriginRequestPolicyId"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDistributionsByOriginRequestPolicyIdResult> listDistributionsByOriginRequestPolicyIdAsync(
            ListDistributionsByOriginRequestPolicyIdRequest listDistributionsByOriginRequestPolicyIdRequest,
            com.amazonaws.handlers.AsyncHandler<ListDistributionsByOriginRequestPolicyIdRequest, ListDistributionsByOriginRequestPolicyIdResult> asyncHandler);

    /**
     * <p>
     * Gets a list of distributions that have a cache behavior that's associated with the specified real-time log
     * configuration.
     * </p>
     * <p>
     * You can specify the real-time log configuration by its name or its Amazon Resource Name (ARN). You must provide
     * at least one. If you provide both, CloudFront uses the name to identify the real-time log configuration to list
     * distributions for.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listDistributionsByRealtimeLogConfigRequest
     * @return A Java Future containing the result of the ListDistributionsByRealtimeLogConfig operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.ListDistributionsByRealtimeLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListDistributionsByRealtimeLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDistributionsByRealtimeLogConfigResult> listDistributionsByRealtimeLogConfigAsync(
            ListDistributionsByRealtimeLogConfigRequest listDistributionsByRealtimeLogConfigRequest);

    /**
     * <p>
     * Gets a list of distributions that have a cache behavior that's associated with the specified real-time log
     * configuration.
     * </p>
     * <p>
     * You can specify the real-time log configuration by its name or its Amazon Resource Name (ARN). You must provide
     * at least one. If you provide both, CloudFront uses the name to identify the real-time log configuration to list
     * distributions for.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listDistributionsByRealtimeLogConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDistributionsByRealtimeLogConfig operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.ListDistributionsByRealtimeLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListDistributionsByRealtimeLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDistributionsByRealtimeLogConfigResult> listDistributionsByRealtimeLogConfigAsync(
            ListDistributionsByRealtimeLogConfigRequest listDistributionsByRealtimeLogConfigRequest,
            com.amazonaws.handlers.AsyncHandler<ListDistributionsByRealtimeLogConfigRequest, ListDistributionsByRealtimeLogConfigResult> asyncHandler);

    /**
     * <p>
     * Gets a list of distribution IDs for distributions that have a cache behavior that's associated with the specified
     * response headers policy.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listDistributionsByResponseHeadersPolicyIdRequest
     * @return A Java Future containing the result of the ListDistributionsByResponseHeadersPolicyId operation returned
     *         by the service.
     * @sample AmazonCloudFrontAsync.ListDistributionsByResponseHeadersPolicyId
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListDistributionsByResponseHeadersPolicyId"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDistributionsByResponseHeadersPolicyIdResult> listDistributionsByResponseHeadersPolicyIdAsync(
            ListDistributionsByResponseHeadersPolicyIdRequest listDistributionsByResponseHeadersPolicyIdRequest);

    /**
     * <p>
     * Gets a list of distribution IDs for distributions that have a cache behavior that's associated with the specified
     * response headers policy.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listDistributionsByResponseHeadersPolicyIdRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDistributionsByResponseHeadersPolicyId operation returned
     *         by the service.
     * @sample AmazonCloudFrontAsyncHandler.ListDistributionsByResponseHeadersPolicyId
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListDistributionsByResponseHeadersPolicyId"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDistributionsByResponseHeadersPolicyIdResult> listDistributionsByResponseHeadersPolicyIdAsync(
            ListDistributionsByResponseHeadersPolicyIdRequest listDistributionsByResponseHeadersPolicyIdRequest,
            com.amazonaws.handlers.AsyncHandler<ListDistributionsByResponseHeadersPolicyIdRequest, ListDistributionsByResponseHeadersPolicyIdResult> asyncHandler);

    /**
     * <p>
     * List the distributions that are associated with a specified WAF web ACL.
     * </p>
     * 
     * @param listDistributionsByWebACLIdRequest
     *        The request to list distributions that are associated with a specified WAF web ACL.
     * @return A Java Future containing the result of the ListDistributionsByWebACLId operation returned by the service.
     * @sample AmazonCloudFrontAsync.ListDistributionsByWebACLId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListDistributionsByWebACLId"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDistributionsByWebACLIdResult> listDistributionsByWebACLIdAsync(
            ListDistributionsByWebACLIdRequest listDistributionsByWebACLIdRequest);

    /**
     * <p>
     * List the distributions that are associated with a specified WAF web ACL.
     * </p>
     * 
     * @param listDistributionsByWebACLIdRequest
     *        The request to list distributions that are associated with a specified WAF web ACL.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDistributionsByWebACLId operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.ListDistributionsByWebACLId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListDistributionsByWebACLId"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDistributionsByWebACLIdResult> listDistributionsByWebACLIdAsync(
            ListDistributionsByWebACLIdRequest listDistributionsByWebACLIdRequest,
            com.amazonaws.handlers.AsyncHandler<ListDistributionsByWebACLIdRequest, ListDistributionsByWebACLIdResult> asyncHandler);

    /**
     * <p>
     * List all field-level encryption configurations that have been created in CloudFront for this account.
     * </p>
     * 
     * @param listFieldLevelEncryptionConfigsRequest
     * @return A Java Future containing the result of the ListFieldLevelEncryptionConfigs operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.ListFieldLevelEncryptionConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListFieldLevelEncryptionConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFieldLevelEncryptionConfigsResult> listFieldLevelEncryptionConfigsAsync(
            ListFieldLevelEncryptionConfigsRequest listFieldLevelEncryptionConfigsRequest);

    /**
     * <p>
     * List all field-level encryption configurations that have been created in CloudFront for this account.
     * </p>
     * 
     * @param listFieldLevelEncryptionConfigsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFieldLevelEncryptionConfigs operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.ListFieldLevelEncryptionConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListFieldLevelEncryptionConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFieldLevelEncryptionConfigsResult> listFieldLevelEncryptionConfigsAsync(
            ListFieldLevelEncryptionConfigsRequest listFieldLevelEncryptionConfigsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFieldLevelEncryptionConfigsRequest, ListFieldLevelEncryptionConfigsResult> asyncHandler);

    /**
     * <p>
     * Request a list of field-level encryption profiles that have been created in CloudFront for this account.
     * </p>
     * 
     * @param listFieldLevelEncryptionProfilesRequest
     * @return A Java Future containing the result of the ListFieldLevelEncryptionProfiles operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.ListFieldLevelEncryptionProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListFieldLevelEncryptionProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFieldLevelEncryptionProfilesResult> listFieldLevelEncryptionProfilesAsync(
            ListFieldLevelEncryptionProfilesRequest listFieldLevelEncryptionProfilesRequest);

    /**
     * <p>
     * Request a list of field-level encryption profiles that have been created in CloudFront for this account.
     * </p>
     * 
     * @param listFieldLevelEncryptionProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFieldLevelEncryptionProfiles operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.ListFieldLevelEncryptionProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListFieldLevelEncryptionProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFieldLevelEncryptionProfilesResult> listFieldLevelEncryptionProfilesAsync(
            ListFieldLevelEncryptionProfilesRequest listFieldLevelEncryptionProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<ListFieldLevelEncryptionProfilesRequest, ListFieldLevelEncryptionProfilesResult> asyncHandler);

    /**
     * <p>
     * Gets a list of all CloudFront functions in your Amazon Web Services account.
     * </p>
     * <p>
     * You can optionally apply a filter to return only the functions that are in the specified stage, either
     * <code>DEVELOPMENT</code> or <code>LIVE</code>.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listFunctionsRequest
     * @return A Java Future containing the result of the ListFunctions operation returned by the service.
     * @sample AmazonCloudFrontAsync.ListFunctions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListFunctions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFunctionsResult> listFunctionsAsync(ListFunctionsRequest listFunctionsRequest);

    /**
     * <p>
     * Gets a list of all CloudFront functions in your Amazon Web Services account.
     * </p>
     * <p>
     * You can optionally apply a filter to return only the functions that are in the specified stage, either
     * <code>DEVELOPMENT</code> or <code>LIVE</code>.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listFunctionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFunctions operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.ListFunctions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListFunctions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFunctionsResult> listFunctionsAsync(ListFunctionsRequest listFunctionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFunctionsRequest, ListFunctionsResult> asyncHandler);

    /**
     * <p>
     * Lists invalidation batches.
     * </p>
     * 
     * @param listInvalidationsRequest
     *        The request to list invalidations.
     * @return A Java Future containing the result of the ListInvalidations operation returned by the service.
     * @sample AmazonCloudFrontAsync.ListInvalidations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListInvalidations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListInvalidationsResult> listInvalidationsAsync(ListInvalidationsRequest listInvalidationsRequest);

    /**
     * <p>
     * Lists invalidation batches.
     * </p>
     * 
     * @param listInvalidationsRequest
     *        The request to list invalidations.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInvalidations operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.ListInvalidations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListInvalidations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListInvalidationsResult> listInvalidationsAsync(ListInvalidationsRequest listInvalidationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInvalidationsRequest, ListInvalidationsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of key groups.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listKeyGroupsRequest
     * @return A Java Future containing the result of the ListKeyGroups operation returned by the service.
     * @sample AmazonCloudFrontAsync.ListKeyGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListKeyGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListKeyGroupsResult> listKeyGroupsAsync(ListKeyGroupsRequest listKeyGroupsRequest);

    /**
     * <p>
     * Gets a list of key groups.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listKeyGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListKeyGroups operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.ListKeyGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListKeyGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListKeyGroupsResult> listKeyGroupsAsync(ListKeyGroupsRequest listKeyGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListKeyGroupsRequest, ListKeyGroupsResult> asyncHandler);

    /**
     * <p>
     * Gets the list of CloudFront origin access controls in this Amazon Web Services account.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send another request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the next request.
     * </p>
     * 
     * @param listOriginAccessControlsRequest
     * @return A Java Future containing the result of the ListOriginAccessControls operation returned by the service.
     * @sample AmazonCloudFrontAsync.ListOriginAccessControls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListOriginAccessControls"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOriginAccessControlsResult> listOriginAccessControlsAsync(ListOriginAccessControlsRequest listOriginAccessControlsRequest);

    /**
     * <p>
     * Gets the list of CloudFront origin access controls in this Amazon Web Services account.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send another request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the next request.
     * </p>
     * 
     * @param listOriginAccessControlsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOriginAccessControls operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.ListOriginAccessControls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListOriginAccessControls"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOriginAccessControlsResult> listOriginAccessControlsAsync(ListOriginAccessControlsRequest listOriginAccessControlsRequest,
            com.amazonaws.handlers.AsyncHandler<ListOriginAccessControlsRequest, ListOriginAccessControlsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of origin request policies.
     * </p>
     * <p>
     * You can optionally apply a filter to return only the managed policies created by Amazon Web Services, or only the
     * custom policies created in your Amazon Web Services account.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listOriginRequestPoliciesRequest
     * @return A Java Future containing the result of the ListOriginRequestPolicies operation returned by the service.
     * @sample AmazonCloudFrontAsync.ListOriginRequestPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListOriginRequestPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOriginRequestPoliciesResult> listOriginRequestPoliciesAsync(
            ListOriginRequestPoliciesRequest listOriginRequestPoliciesRequest);

    /**
     * <p>
     * Gets a list of origin request policies.
     * </p>
     * <p>
     * You can optionally apply a filter to return only the managed policies created by Amazon Web Services, or only the
     * custom policies created in your Amazon Web Services account.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listOriginRequestPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOriginRequestPolicies operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.ListOriginRequestPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListOriginRequestPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOriginRequestPoliciesResult> listOriginRequestPoliciesAsync(
            ListOriginRequestPoliciesRequest listOriginRequestPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListOriginRequestPoliciesRequest, ListOriginRequestPoliciesResult> asyncHandler);

    /**
     * <p>
     * List all public keys that have been added to CloudFront for this account.
     * </p>
     * 
     * @param listPublicKeysRequest
     * @return A Java Future containing the result of the ListPublicKeys operation returned by the service.
     * @sample AmazonCloudFrontAsync.ListPublicKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListPublicKeys" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPublicKeysResult> listPublicKeysAsync(ListPublicKeysRequest listPublicKeysRequest);

    /**
     * <p>
     * List all public keys that have been added to CloudFront for this account.
     * </p>
     * 
     * @param listPublicKeysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPublicKeys operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.ListPublicKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListPublicKeys" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPublicKeysResult> listPublicKeysAsync(ListPublicKeysRequest listPublicKeysRequest,
            com.amazonaws.handlers.AsyncHandler<ListPublicKeysRequest, ListPublicKeysResult> asyncHandler);

    /**
     * <p>
     * Gets a list of real-time log configurations.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listRealtimeLogConfigsRequest
     * @return A Java Future containing the result of the ListRealtimeLogConfigs operation returned by the service.
     * @sample AmazonCloudFrontAsync.ListRealtimeLogConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListRealtimeLogConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRealtimeLogConfigsResult> listRealtimeLogConfigsAsync(ListRealtimeLogConfigsRequest listRealtimeLogConfigsRequest);

    /**
     * <p>
     * Gets a list of real-time log configurations.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listRealtimeLogConfigsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRealtimeLogConfigs operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.ListRealtimeLogConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListRealtimeLogConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRealtimeLogConfigsResult> listRealtimeLogConfigsAsync(ListRealtimeLogConfigsRequest listRealtimeLogConfigsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRealtimeLogConfigsRequest, ListRealtimeLogConfigsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of response headers policies.
     * </p>
     * <p>
     * You can optionally apply a filter to get only the managed policies created by Amazon Web Services, or only the
     * custom policies created in your Amazon Web Services account.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listResponseHeadersPoliciesRequest
     * @return A Java Future containing the result of the ListResponseHeadersPolicies operation returned by the service.
     * @sample AmazonCloudFrontAsync.ListResponseHeadersPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListResponseHeadersPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResponseHeadersPoliciesResult> listResponseHeadersPoliciesAsync(
            ListResponseHeadersPoliciesRequest listResponseHeadersPoliciesRequest);

    /**
     * <p>
     * Gets a list of response headers policies.
     * </p>
     * <p>
     * You can optionally apply a filter to get only the managed policies created by Amazon Web Services, or only the
     * custom policies created in your Amazon Web Services account.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listResponseHeadersPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResponseHeadersPolicies operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.ListResponseHeadersPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListResponseHeadersPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResponseHeadersPoliciesResult> listResponseHeadersPoliciesAsync(
            ListResponseHeadersPoliciesRequest listResponseHeadersPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListResponseHeadersPoliciesRequest, ListResponseHeadersPoliciesResult> asyncHandler);

    /**
     * <p>
     * List streaming distributions.
     * </p>
     * 
     * @param listStreamingDistributionsRequest
     *        The request to list your streaming distributions.
     * @return A Java Future containing the result of the ListStreamingDistributions operation returned by the service.
     * @sample AmazonCloudFrontAsync.ListStreamingDistributions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListStreamingDistributions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListStreamingDistributionsResult> listStreamingDistributionsAsync(
            ListStreamingDistributionsRequest listStreamingDistributionsRequest);

    /**
     * <p>
     * List streaming distributions.
     * </p>
     * 
     * @param listStreamingDistributionsRequest
     *        The request to list your streaming distributions.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStreamingDistributions operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.ListStreamingDistributions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListStreamingDistributions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListStreamingDistributionsResult> listStreamingDistributionsAsync(
            ListStreamingDistributionsRequest listStreamingDistributionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListStreamingDistributionsRequest, ListStreamingDistributionsResult> asyncHandler);

    /**
     * <p>
     * List tags for a CloudFront resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        The request to list tags for a CloudFront resource.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonCloudFrontAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * List tags for a CloudFront resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        The request to list tags for a CloudFront resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Publishes a CloudFront function by copying the function code from the <code>DEVELOPMENT</code> stage to
     * <code>LIVE</code>. This automatically updates all cache behaviors that are using this function to use the newly
     * published copy in the <code>LIVE</code> stage.
     * </p>
     * <p>
     * When a function is published to the <code>LIVE</code> stage, you can attach the function to a distribution's
     * cache behavior, using the function's Amazon Resource Name (ARN).
     * </p>
     * <p>
     * To publish a function, you must provide the function's name and version (<code>ETag</code> value). To get these
     * values, you can use <code>ListFunctions</code> and <code>DescribeFunction</code>.
     * </p>
     * 
     * @param publishFunctionRequest
     * @return A Java Future containing the result of the PublishFunction operation returned by the service.
     * @sample AmazonCloudFrontAsync.PublishFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/PublishFunction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PublishFunctionResult> publishFunctionAsync(PublishFunctionRequest publishFunctionRequest);

    /**
     * <p>
     * Publishes a CloudFront function by copying the function code from the <code>DEVELOPMENT</code> stage to
     * <code>LIVE</code>. This automatically updates all cache behaviors that are using this function to use the newly
     * published copy in the <code>LIVE</code> stage.
     * </p>
     * <p>
     * When a function is published to the <code>LIVE</code> stage, you can attach the function to a distribution's
     * cache behavior, using the function's Amazon Resource Name (ARN).
     * </p>
     * <p>
     * To publish a function, you must provide the function's name and version (<code>ETag</code> value). To get these
     * values, you can use <code>ListFunctions</code> and <code>DescribeFunction</code>.
     * </p>
     * 
     * @param publishFunctionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PublishFunction operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.PublishFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/PublishFunction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PublishFunctionResult> publishFunctionAsync(PublishFunctionRequest publishFunctionRequest,
            com.amazonaws.handlers.AsyncHandler<PublishFunctionRequest, PublishFunctionResult> asyncHandler);

    /**
     * <p>
     * Add tags to a CloudFront resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        The request to add tags to a CloudFront resource.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonCloudFrontAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Add tags to a CloudFront resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        The request to add tags to a CloudFront resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Tests a CloudFront function.
     * </p>
     * <p>
     * To test a function, you provide an <i>event object</i> that represents an HTTP request or response that your
     * CloudFront distribution could receive in production. CloudFront runs the function, passing it the event object
     * that you provided, and returns the function's result (the modified event object) in the response. The response
     * also contains function logs and error messages, if any exist. For more information about testing functions, see
     * <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/managing-functions.html#test-function"
     * >Testing functions</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * To test a function, you provide the function's name and version (<code>ETag</code> value) along with the event
     * object. To get the function's name and version, you can use <code>ListFunctions</code> and
     * <code>DescribeFunction</code>.
     * </p>
     * 
     * @param testFunctionRequest
     * @return A Java Future containing the result of the TestFunction operation returned by the service.
     * @sample AmazonCloudFrontAsync.TestFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/TestFunction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TestFunctionResult> testFunctionAsync(TestFunctionRequest testFunctionRequest);

    /**
     * <p>
     * Tests a CloudFront function.
     * </p>
     * <p>
     * To test a function, you provide an <i>event object</i> that represents an HTTP request or response that your
     * CloudFront distribution could receive in production. CloudFront runs the function, passing it the event object
     * that you provided, and returns the function's result (the modified event object) in the response. The response
     * also contains function logs and error messages, if any exist. For more information about testing functions, see
     * <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/managing-functions.html#test-function"
     * >Testing functions</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * To test a function, you provide the function's name and version (<code>ETag</code> value) along with the event
     * object. To get the function's name and version, you can use <code>ListFunctions</code> and
     * <code>DescribeFunction</code>.
     * </p>
     * 
     * @param testFunctionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TestFunction operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.TestFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/TestFunction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TestFunctionResult> testFunctionAsync(TestFunctionRequest testFunctionRequest,
            com.amazonaws.handlers.AsyncHandler<TestFunctionRequest, TestFunctionResult> asyncHandler);

    /**
     * <p>
     * Remove tags from a CloudFront resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        The request to remove tags from a CloudFront resource.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonCloudFrontAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Remove tags from a CloudFront resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        The request to remove tags from a CloudFront resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a cache policy configuration.
     * </p>
     * <p>
     * When you update a cache policy configuration, all the fields are updated with the values provided in the request.
     * You cannot update some fields independent of others. To update a cache policy configuration:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <code>GetCachePolicyConfig</code> to get the current configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Locally modify the fields in the cache policy configuration that you want to update.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call <code>UpdateCachePolicy</code> by providing the entire cache policy configuration, including the fields that
     * you modified and those that you didn't.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateCachePolicyRequest
     * @return A Java Future containing the result of the UpdateCachePolicy operation returned by the service.
     * @sample AmazonCloudFrontAsync.UpdateCachePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateCachePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCachePolicyResult> updateCachePolicyAsync(UpdateCachePolicyRequest updateCachePolicyRequest);

    /**
     * <p>
     * Updates a cache policy configuration.
     * </p>
     * <p>
     * When you update a cache policy configuration, all the fields are updated with the values provided in the request.
     * You cannot update some fields independent of others. To update a cache policy configuration:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <code>GetCachePolicyConfig</code> to get the current configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Locally modify the fields in the cache policy configuration that you want to update.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call <code>UpdateCachePolicy</code> by providing the entire cache policy configuration, including the fields that
     * you modified and those that you didn't.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateCachePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCachePolicy operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.UpdateCachePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateCachePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCachePolicyResult> updateCachePolicyAsync(UpdateCachePolicyRequest updateCachePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCachePolicyRequest, UpdateCachePolicyResult> asyncHandler);

    /**
     * <p>
     * Update an origin access identity.
     * </p>
     * 
     * @param updateCloudFrontOriginAccessIdentityRequest
     *        The request to update an origin access identity.
     * @return A Java Future containing the result of the UpdateCloudFrontOriginAccessIdentity operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.UpdateCloudFrontOriginAccessIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateCloudFrontOriginAccessIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCloudFrontOriginAccessIdentityResult> updateCloudFrontOriginAccessIdentityAsync(
            UpdateCloudFrontOriginAccessIdentityRequest updateCloudFrontOriginAccessIdentityRequest);

    /**
     * <p>
     * Update an origin access identity.
     * </p>
     * 
     * @param updateCloudFrontOriginAccessIdentityRequest
     *        The request to update an origin access identity.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCloudFrontOriginAccessIdentity operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.UpdateCloudFrontOriginAccessIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateCloudFrontOriginAccessIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCloudFrontOriginAccessIdentityResult> updateCloudFrontOriginAccessIdentityAsync(
            UpdateCloudFrontOriginAccessIdentityRequest updateCloudFrontOriginAccessIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCloudFrontOriginAccessIdentityRequest, UpdateCloudFrontOriginAccessIdentityResult> asyncHandler);

    /**
     * <p>
     * Updates a continuous deployment policy. You can update a continuous deployment policy to enable or disable it, to
     * change the percentage of traffic that it sends to the staging distribution, or to change the staging distribution
     * that it sends traffic to.
     * </p>
     * <p>
     * When you update a continuous deployment policy configuration, all the fields are updated with the values that are
     * provided in the request. You cannot update some fields independent of others. To update a continuous deployment
     * policy configuration:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <code>GetContinuousDeploymentPolicyConfig</code> to get the current configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Locally modify the fields in the continuous deployment policy configuration that you want to update.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>UpdateContinuousDeploymentPolicy</code>, providing the entire continuous deployment policy
     * configuration, including the fields that you modified and those that you didn't.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateContinuousDeploymentPolicyRequest
     * @return A Java Future containing the result of the UpdateContinuousDeploymentPolicy operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.UpdateContinuousDeploymentPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateContinuousDeploymentPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateContinuousDeploymentPolicyResult> updateContinuousDeploymentPolicyAsync(
            UpdateContinuousDeploymentPolicyRequest updateContinuousDeploymentPolicyRequest);

    /**
     * <p>
     * Updates a continuous deployment policy. You can update a continuous deployment policy to enable or disable it, to
     * change the percentage of traffic that it sends to the staging distribution, or to change the staging distribution
     * that it sends traffic to.
     * </p>
     * <p>
     * When you update a continuous deployment policy configuration, all the fields are updated with the values that are
     * provided in the request. You cannot update some fields independent of others. To update a continuous deployment
     * policy configuration:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <code>GetContinuousDeploymentPolicyConfig</code> to get the current configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Locally modify the fields in the continuous deployment policy configuration that you want to update.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>UpdateContinuousDeploymentPolicy</code>, providing the entire continuous deployment policy
     * configuration, including the fields that you modified and those that you didn't.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateContinuousDeploymentPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateContinuousDeploymentPolicy operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.UpdateContinuousDeploymentPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateContinuousDeploymentPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateContinuousDeploymentPolicyResult> updateContinuousDeploymentPolicyAsync(
            UpdateContinuousDeploymentPolicyRequest updateContinuousDeploymentPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateContinuousDeploymentPolicyRequest, UpdateContinuousDeploymentPolicyResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration for a CloudFront distribution.
     * </p>
     * <p>
     * The update process includes getting the current distribution configuration, updating it to make your changes, and
     * then submitting an <code>UpdateDistribution</code> request to make the updates.
     * </p>
     * <p>
     * <b>To update a web distribution using the CloudFront API</b>
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <code>GetDistributionConfig</code> to get the current configuration, including the version identifier (
     * <code>ETag</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * Update the distribution configuration that was returned in the response. Note the following important
     * requirements and restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must rename the <code>ETag</code> field to <code>IfMatch</code>, leaving the value unchanged. (Set the value
     * of <code>IfMatch</code> to the value of <code>ETag</code>, then remove the <code>ETag</code> field.)
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't change the value of <code>CallerReference</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateDistribution</code> request, providing the distribution configuration. The new
     * configuration replaces the existing configuration. The values that you specify in an
     * <code>UpdateDistribution</code> request are not merged into your existing configuration. Make sure to include all
     * fields: the ones that you modified and also the ones that you didn't.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateDistributionRequest
     *        The request to update a distribution.
     * @return A Java Future containing the result of the UpdateDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsync.UpdateDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDistributionResult> updateDistributionAsync(UpdateDistributionRequest updateDistributionRequest);

    /**
     * <p>
     * Updates the configuration for a CloudFront distribution.
     * </p>
     * <p>
     * The update process includes getting the current distribution configuration, updating it to make your changes, and
     * then submitting an <code>UpdateDistribution</code> request to make the updates.
     * </p>
     * <p>
     * <b>To update a web distribution using the CloudFront API</b>
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <code>GetDistributionConfig</code> to get the current configuration, including the version identifier (
     * <code>ETag</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * Update the distribution configuration that was returned in the response. Note the following important
     * requirements and restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must rename the <code>ETag</code> field to <code>IfMatch</code>, leaving the value unchanged. (Set the value
     * of <code>IfMatch</code> to the value of <code>ETag</code>, then remove the <code>ETag</code> field.)
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't change the value of <code>CallerReference</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateDistribution</code> request, providing the distribution configuration. The new
     * configuration replaces the existing configuration. The values that you specify in an
     * <code>UpdateDistribution</code> request are not merged into your existing configuration. Make sure to include all
     * fields: the ones that you modified and also the ones that you didn't.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateDistributionRequest
     *        The request to update a distribution.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.UpdateDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDistributionResult> updateDistributionAsync(UpdateDistributionRequest updateDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDistributionRequest, UpdateDistributionResult> asyncHandler);

    /**
     * <p>
     * Copies the staging distribution's configuration to its corresponding primary distribution. The primary
     * distribution retains its <code>Aliases</code> (also known as alternate domain names or CNAMEs) and
     * <code>ContinuousDeploymentPolicyId</code> value, but otherwise its configuration is overwritten to match the
     * staging distribution.
     * </p>
     * <p>
     * You can use this operation in a continuous deployment workflow after you have tested configuration changes on the
     * staging distribution. After using a continuous deployment policy to move a portion of your domain name's traffic
     * to the staging distribution and verifying that it works as intended, you can use this operation to copy the
     * staging distribution's configuration to the primary distribution. This action will disable the continuous
     * deployment policy and move your domain's traffic back to the primary distribution.
     * </p>
     * 
     * @param updateDistributionWithStagingConfigRequest
     * @return A Java Future containing the result of the UpdateDistributionWithStagingConfig operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.UpdateDistributionWithStagingConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateDistributionWithStagingConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDistributionWithStagingConfigResult> updateDistributionWithStagingConfigAsync(
            UpdateDistributionWithStagingConfigRequest updateDistributionWithStagingConfigRequest);

    /**
     * <p>
     * Copies the staging distribution's configuration to its corresponding primary distribution. The primary
     * distribution retains its <code>Aliases</code> (also known as alternate domain names or CNAMEs) and
     * <code>ContinuousDeploymentPolicyId</code> value, but otherwise its configuration is overwritten to match the
     * staging distribution.
     * </p>
     * <p>
     * You can use this operation in a continuous deployment workflow after you have tested configuration changes on the
     * staging distribution. After using a continuous deployment policy to move a portion of your domain name's traffic
     * to the staging distribution and verifying that it works as intended, you can use this operation to copy the
     * staging distribution's configuration to the primary distribution. This action will disable the continuous
     * deployment policy and move your domain's traffic back to the primary distribution.
     * </p>
     * 
     * @param updateDistributionWithStagingConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDistributionWithStagingConfig operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.UpdateDistributionWithStagingConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateDistributionWithStagingConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDistributionWithStagingConfigResult> updateDistributionWithStagingConfigAsync(
            UpdateDistributionWithStagingConfigRequest updateDistributionWithStagingConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDistributionWithStagingConfigRequest, UpdateDistributionWithStagingConfigResult> asyncHandler);

    /**
     * <p>
     * Update a field-level encryption configuration.
     * </p>
     * 
     * @param updateFieldLevelEncryptionConfigRequest
     * @return A Java Future containing the result of the UpdateFieldLevelEncryptionConfig operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.UpdateFieldLevelEncryptionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateFieldLevelEncryptionConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFieldLevelEncryptionConfigResult> updateFieldLevelEncryptionConfigAsync(
            UpdateFieldLevelEncryptionConfigRequest updateFieldLevelEncryptionConfigRequest);

    /**
     * <p>
     * Update a field-level encryption configuration.
     * </p>
     * 
     * @param updateFieldLevelEncryptionConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFieldLevelEncryptionConfig operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.UpdateFieldLevelEncryptionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateFieldLevelEncryptionConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFieldLevelEncryptionConfigResult> updateFieldLevelEncryptionConfigAsync(
            UpdateFieldLevelEncryptionConfigRequest updateFieldLevelEncryptionConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFieldLevelEncryptionConfigRequest, UpdateFieldLevelEncryptionConfigResult> asyncHandler);

    /**
     * <p>
     * Update a field-level encryption profile.
     * </p>
     * 
     * @param updateFieldLevelEncryptionProfileRequest
     * @return A Java Future containing the result of the UpdateFieldLevelEncryptionProfile operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.UpdateFieldLevelEncryptionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateFieldLevelEncryptionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFieldLevelEncryptionProfileResult> updateFieldLevelEncryptionProfileAsync(
            UpdateFieldLevelEncryptionProfileRequest updateFieldLevelEncryptionProfileRequest);

    /**
     * <p>
     * Update a field-level encryption profile.
     * </p>
     * 
     * @param updateFieldLevelEncryptionProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFieldLevelEncryptionProfile operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.UpdateFieldLevelEncryptionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateFieldLevelEncryptionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFieldLevelEncryptionProfileResult> updateFieldLevelEncryptionProfileAsync(
            UpdateFieldLevelEncryptionProfileRequest updateFieldLevelEncryptionProfileRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFieldLevelEncryptionProfileRequest, UpdateFieldLevelEncryptionProfileResult> asyncHandler);

    /**
     * <p>
     * Updates a CloudFront function.
     * </p>
     * <p>
     * You can update a function's code or the comment that describes the function. You cannot update a function's name.
     * </p>
     * <p>
     * To update a function, you provide the function's name and version (<code>ETag</code> value) along with the
     * updated function code. To get the name and version, you can use <code>ListFunctions</code> and
     * <code>DescribeFunction</code>.
     * </p>
     * 
     * @param updateFunctionRequest
     * @return A Java Future containing the result of the UpdateFunction operation returned by the service.
     * @sample AmazonCloudFrontAsync.UpdateFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateFunction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFunctionResult> updateFunctionAsync(UpdateFunctionRequest updateFunctionRequest);

    /**
     * <p>
     * Updates a CloudFront function.
     * </p>
     * <p>
     * You can update a function's code or the comment that describes the function. You cannot update a function's name.
     * </p>
     * <p>
     * To update a function, you provide the function's name and version (<code>ETag</code> value) along with the
     * updated function code. To get the name and version, you can use <code>ListFunctions</code> and
     * <code>DescribeFunction</code>.
     * </p>
     * 
     * @param updateFunctionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFunction operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.UpdateFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateFunction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFunctionResult> updateFunctionAsync(UpdateFunctionRequest updateFunctionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFunctionRequest, UpdateFunctionResult> asyncHandler);

    /**
     * <p>
     * Updates a key group.
     * </p>
     * <p>
     * When you update a key group, all the fields are updated with the values provided in the request. You cannot
     * update some fields independent of others. To update a key group:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Get the current key group with <code>GetKeyGroup</code> or <code>GetKeyGroupConfig</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Locally modify the fields in the key group that you want to update. For example, add or remove public key IDs.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call <code>UpdateKeyGroup</code> with the entire key group object, including the fields that you modified and
     * those that you didn't.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateKeyGroupRequest
     * @return A Java Future containing the result of the UpdateKeyGroup operation returned by the service.
     * @sample AmazonCloudFrontAsync.UpdateKeyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateKeyGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateKeyGroupResult> updateKeyGroupAsync(UpdateKeyGroupRequest updateKeyGroupRequest);

    /**
     * <p>
     * Updates a key group.
     * </p>
     * <p>
     * When you update a key group, all the fields are updated with the values provided in the request. You cannot
     * update some fields independent of others. To update a key group:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Get the current key group with <code>GetKeyGroup</code> or <code>GetKeyGroupConfig</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Locally modify the fields in the key group that you want to update. For example, add or remove public key IDs.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call <code>UpdateKeyGroup</code> with the entire key group object, including the fields that you modified and
     * those that you didn't.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateKeyGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateKeyGroup operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.UpdateKeyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateKeyGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateKeyGroupResult> updateKeyGroupAsync(UpdateKeyGroupRequest updateKeyGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateKeyGroupRequest, UpdateKeyGroupResult> asyncHandler);

    /**
     * <p>
     * Updates a CloudFront origin access control.
     * </p>
     * 
     * @param updateOriginAccessControlRequest
     * @return A Java Future containing the result of the UpdateOriginAccessControl operation returned by the service.
     * @sample AmazonCloudFrontAsync.UpdateOriginAccessControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateOriginAccessControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateOriginAccessControlResult> updateOriginAccessControlAsync(
            UpdateOriginAccessControlRequest updateOriginAccessControlRequest);

    /**
     * <p>
     * Updates a CloudFront origin access control.
     * </p>
     * 
     * @param updateOriginAccessControlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateOriginAccessControl operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.UpdateOriginAccessControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateOriginAccessControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateOriginAccessControlResult> updateOriginAccessControlAsync(
            UpdateOriginAccessControlRequest updateOriginAccessControlRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateOriginAccessControlRequest, UpdateOriginAccessControlResult> asyncHandler);

    /**
     * <p>
     * Updates an origin request policy configuration.
     * </p>
     * <p>
     * When you update an origin request policy configuration, all the fields are updated with the values provided in
     * the request. You cannot update some fields independent of others. To update an origin request policy
     * configuration:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <code>GetOriginRequestPolicyConfig</code> to get the current configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Locally modify the fields in the origin request policy configuration that you want to update.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call <code>UpdateOriginRequestPolicy</code> by providing the entire origin request policy configuration,
     * including the fields that you modified and those that you didn't.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateOriginRequestPolicyRequest
     * @return A Java Future containing the result of the UpdateOriginRequestPolicy operation returned by the service.
     * @sample AmazonCloudFrontAsync.UpdateOriginRequestPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateOriginRequestPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateOriginRequestPolicyResult> updateOriginRequestPolicyAsync(
            UpdateOriginRequestPolicyRequest updateOriginRequestPolicyRequest);

    /**
     * <p>
     * Updates an origin request policy configuration.
     * </p>
     * <p>
     * When you update an origin request policy configuration, all the fields are updated with the values provided in
     * the request. You cannot update some fields independent of others. To update an origin request policy
     * configuration:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <code>GetOriginRequestPolicyConfig</code> to get the current configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Locally modify the fields in the origin request policy configuration that you want to update.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call <code>UpdateOriginRequestPolicy</code> by providing the entire origin request policy configuration,
     * including the fields that you modified and those that you didn't.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateOriginRequestPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateOriginRequestPolicy operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.UpdateOriginRequestPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateOriginRequestPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateOriginRequestPolicyResult> updateOriginRequestPolicyAsync(
            UpdateOriginRequestPolicyRequest updateOriginRequestPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateOriginRequestPolicyRequest, UpdateOriginRequestPolicyResult> asyncHandler);

    /**
     * <p>
     * Update public key information. Note that the only value you can change is the comment.
     * </p>
     * 
     * @param updatePublicKeyRequest
     * @return A Java Future containing the result of the UpdatePublicKey operation returned by the service.
     * @sample AmazonCloudFrontAsync.UpdatePublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdatePublicKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePublicKeyResult> updatePublicKeyAsync(UpdatePublicKeyRequest updatePublicKeyRequest);

    /**
     * <p>
     * Update public key information. Note that the only value you can change is the comment.
     * </p>
     * 
     * @param updatePublicKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePublicKey operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.UpdatePublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdatePublicKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePublicKeyResult> updatePublicKeyAsync(UpdatePublicKeyRequest updatePublicKeyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePublicKeyRequest, UpdatePublicKeyResult> asyncHandler);

    /**
     * <p>
     * Updates a real-time log configuration.
     * </p>
     * <p>
     * When you update a real-time log configuration, all the parameters are updated with the values provided in the
     * request. You cannot update some parameters independent of others. To update a real-time log configuration:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Call <code>GetRealtimeLogConfig</code> to get the current real-time log configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Locally modify the parameters in the real-time log configuration that you want to update.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call this API (<code>UpdateRealtimeLogConfig</code>) by providing the entire real-time log configuration,
     * including the parameters that you modified and those that you didn't.
     * </p>
     * </li>
     * </ol>
     * <p>
     * You cannot update a real-time log configuration's <code>Name</code> or <code>ARN</code>.
     * </p>
     * 
     * @param updateRealtimeLogConfigRequest
     * @return A Java Future containing the result of the UpdateRealtimeLogConfig operation returned by the service.
     * @sample AmazonCloudFrontAsync.UpdateRealtimeLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateRealtimeLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRealtimeLogConfigResult> updateRealtimeLogConfigAsync(UpdateRealtimeLogConfigRequest updateRealtimeLogConfigRequest);

    /**
     * <p>
     * Updates a real-time log configuration.
     * </p>
     * <p>
     * When you update a real-time log configuration, all the parameters are updated with the values provided in the
     * request. You cannot update some parameters independent of others. To update a real-time log configuration:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Call <code>GetRealtimeLogConfig</code> to get the current real-time log configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Locally modify the parameters in the real-time log configuration that you want to update.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call this API (<code>UpdateRealtimeLogConfig</code>) by providing the entire real-time log configuration,
     * including the parameters that you modified and those that you didn't.
     * </p>
     * </li>
     * </ol>
     * <p>
     * You cannot update a real-time log configuration's <code>Name</code> or <code>ARN</code>.
     * </p>
     * 
     * @param updateRealtimeLogConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRealtimeLogConfig operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.UpdateRealtimeLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateRealtimeLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRealtimeLogConfigResult> updateRealtimeLogConfigAsync(UpdateRealtimeLogConfigRequest updateRealtimeLogConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRealtimeLogConfigRequest, UpdateRealtimeLogConfigResult> asyncHandler);

    /**
     * <p>
     * Updates a response headers policy.
     * </p>
     * <p>
     * When you update a response headers policy, the entire policy is replaced. You cannot update some policy fields
     * independent of others. To update a response headers policy configuration:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <code>GetResponseHeadersPolicyConfig</code> to get the current policy's configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Modify the fields in the response headers policy configuration that you want to update.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call <code>UpdateResponseHeadersPolicy</code>, providing the entire response headers policy configuration,
     * including the fields that you modified and those that you didn't.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateResponseHeadersPolicyRequest
     * @return A Java Future containing the result of the UpdateResponseHeadersPolicy operation returned by the service.
     * @sample AmazonCloudFrontAsync.UpdateResponseHeadersPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateResponseHeadersPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResponseHeadersPolicyResult> updateResponseHeadersPolicyAsync(
            UpdateResponseHeadersPolicyRequest updateResponseHeadersPolicyRequest);

    /**
     * <p>
     * Updates a response headers policy.
     * </p>
     * <p>
     * When you update a response headers policy, the entire policy is replaced. You cannot update some policy fields
     * independent of others. To update a response headers policy configuration:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <code>GetResponseHeadersPolicyConfig</code> to get the current policy's configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Modify the fields in the response headers policy configuration that you want to update.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call <code>UpdateResponseHeadersPolicy</code>, providing the entire response headers policy configuration,
     * including the fields that you modified and those that you didn't.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateResponseHeadersPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateResponseHeadersPolicy operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.UpdateResponseHeadersPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateResponseHeadersPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResponseHeadersPolicyResult> updateResponseHeadersPolicyAsync(
            UpdateResponseHeadersPolicyRequest updateResponseHeadersPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateResponseHeadersPolicyRequest, UpdateResponseHeadersPolicyResult> asyncHandler);

    /**
     * <p>
     * Update a streaming distribution.
     * </p>
     * 
     * @param updateStreamingDistributionRequest
     *        The request to update a streaming distribution.
     * @return A Java Future containing the result of the UpdateStreamingDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsync.UpdateStreamingDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateStreamingDistribution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateStreamingDistributionResult> updateStreamingDistributionAsync(
            UpdateStreamingDistributionRequest updateStreamingDistributionRequest);

    /**
     * <p>
     * Update a streaming distribution.
     * </p>
     * 
     * @param updateStreamingDistributionRequest
     *        The request to update a streaming distribution.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateStreamingDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.UpdateStreamingDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateStreamingDistribution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateStreamingDistributionResult> updateStreamingDistributionAsync(
            UpdateStreamingDistributionRequest updateStreamingDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateStreamingDistributionRequest, UpdateStreamingDistributionResult> asyncHandler);

}
