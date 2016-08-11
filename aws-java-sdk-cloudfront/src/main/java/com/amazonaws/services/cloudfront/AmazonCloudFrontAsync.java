/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudfront;

import com.amazonaws.services.cloudfront.model.*;

/**
 * Interface for accessing CloudFront asynchronously. Each asynchronous method
 * will return a Java Future object representing the asynchronous operation;
 * overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon CloudFront</fullname>
 * <p>
 * Amazon CloudFront is a global content delivery network (CDN) service that
 * accelerates delivery of your websites, APIs, video content or other web
 * assets. It integrates with other Amazon Web Services products to give
 * developers and businesses an easy way to accelerate content to end users with
 * no minimum usage commitments.
 * </p>
 */
public interface AmazonCloudFrontAsync extends AmazonCloudFront {

    /**
     * Create a new origin access identity.
     * 
     * @param createCloudFrontOriginAccessIdentityRequest
     *        The request to create a new origin access identity.
     * @return A Java Future containing the result of the
     *         CreateCloudFrontOriginAccessIdentity operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.CreateCloudFrontOriginAccessIdentity
     */
    java.util.concurrent.Future<CreateCloudFrontOriginAccessIdentityResult> createCloudFrontOriginAccessIdentityAsync(
            CreateCloudFrontOriginAccessIdentityRequest createCloudFrontOriginAccessIdentityRequest);

    /**
     * Create a new origin access identity.
     * 
     * @param createCloudFrontOriginAccessIdentityRequest
     *        The request to create a new origin access identity.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         CreateCloudFrontOriginAccessIdentity operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.CreateCloudFrontOriginAccessIdentity
     */
    java.util.concurrent.Future<CreateCloudFrontOriginAccessIdentityResult> createCloudFrontOriginAccessIdentityAsync(
            CreateCloudFrontOriginAccessIdentityRequest createCloudFrontOriginAccessIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCloudFrontOriginAccessIdentityRequest, CreateCloudFrontOriginAccessIdentityResult> asyncHandler);

    /**
     * Create a new distribution.
     * 
     * @param createDistributionRequest
     *        The request to create a new distribution.
     * @return A Java Future containing the result of the CreateDistribution
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsync.CreateDistribution
     */
    java.util.concurrent.Future<CreateDistributionResult> createDistributionAsync(
            CreateDistributionRequest createDistributionRequest);

    /**
     * Create a new distribution.
     * 
     * @param createDistributionRequest
     *        The request to create a new distribution.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDistribution
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.CreateDistribution
     */
    java.util.concurrent.Future<CreateDistributionResult> createDistributionAsync(
            CreateDistributionRequest createDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDistributionRequest, CreateDistributionResult> asyncHandler);

    /**
     * Create a new distribution with tags.
     * 
     * @param createDistributionWithTagsRequest
     *        The request to create a new distribution with tags
     * @return A Java Future containing the result of the
     *         CreateDistributionWithTags operation returned by the service.
     * @sample AmazonCloudFrontAsync.CreateDistributionWithTags
     */
    java.util.concurrent.Future<CreateDistributionWithTagsResult> createDistributionWithTagsAsync(
            CreateDistributionWithTagsRequest createDistributionWithTagsRequest);

    /**
     * Create a new distribution with tags.
     * 
     * @param createDistributionWithTagsRequest
     *        The request to create a new distribution with tags
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         CreateDistributionWithTags operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.CreateDistributionWithTags
     */
    java.util.concurrent.Future<CreateDistributionWithTagsResult> createDistributionWithTagsAsync(
            CreateDistributionWithTagsRequest createDistributionWithTagsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDistributionWithTagsRequest, CreateDistributionWithTagsResult> asyncHandler);

    /**
     * Create a new invalidation.
     * 
     * @param createInvalidationRequest
     *        The request to create an invalidation.
     * @return A Java Future containing the result of the CreateInvalidation
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsync.CreateInvalidation
     */
    java.util.concurrent.Future<CreateInvalidationResult> createInvalidationAsync(
            CreateInvalidationRequest createInvalidationRequest);

    /**
     * Create a new invalidation.
     * 
     * @param createInvalidationRequest
     *        The request to create an invalidation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInvalidation
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.CreateInvalidation
     */
    java.util.concurrent.Future<CreateInvalidationResult> createInvalidationAsync(
            CreateInvalidationRequest createInvalidationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInvalidationRequest, CreateInvalidationResult> asyncHandler);

    /**
     * Create a new streaming distribution.
     * 
     * @param createStreamingDistributionRequest
     *        The request to create a new streaming distribution.
     * @return A Java Future containing the result of the
     *         CreateStreamingDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsync.CreateStreamingDistribution
     */
    java.util.concurrent.Future<CreateStreamingDistributionResult> createStreamingDistributionAsync(
            CreateStreamingDistributionRequest createStreamingDistributionRequest);

    /**
     * Create a new streaming distribution.
     * 
     * @param createStreamingDistributionRequest
     *        The request to create a new streaming distribution.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         CreateStreamingDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.CreateStreamingDistribution
     */
    java.util.concurrent.Future<CreateStreamingDistributionResult> createStreamingDistributionAsync(
            CreateStreamingDistributionRequest createStreamingDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStreamingDistributionRequest, CreateStreamingDistributionResult> asyncHandler);

    /**
     * Create a new streaming distribution with tags.
     * 
     * @param createStreamingDistributionWithTagsRequest
     *        The request to create a new streaming distribution with tags.
     * @return A Java Future containing the result of the
     *         CreateStreamingDistributionWithTags operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.CreateStreamingDistributionWithTags
     */
    java.util.concurrent.Future<CreateStreamingDistributionWithTagsResult> createStreamingDistributionWithTagsAsync(
            CreateStreamingDistributionWithTagsRequest createStreamingDistributionWithTagsRequest);

    /**
     * Create a new streaming distribution with tags.
     * 
     * @param createStreamingDistributionWithTagsRequest
     *        The request to create a new streaming distribution with tags.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         CreateStreamingDistributionWithTags operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.CreateStreamingDistributionWithTags
     */
    java.util.concurrent.Future<CreateStreamingDistributionWithTagsResult> createStreamingDistributionWithTagsAsync(
            CreateStreamingDistributionWithTagsRequest createStreamingDistributionWithTagsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStreamingDistributionWithTagsRequest, CreateStreamingDistributionWithTagsResult> asyncHandler);

    /**
     * Delete an origin access identity.
     * 
     * @param deleteCloudFrontOriginAccessIdentityRequest
     *        The request to delete a origin access identity.
     * @return A Java Future containing the result of the
     *         DeleteCloudFrontOriginAccessIdentity operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.DeleteCloudFrontOriginAccessIdentity
     */
    java.util.concurrent.Future<DeleteCloudFrontOriginAccessIdentityResult> deleteCloudFrontOriginAccessIdentityAsync(
            DeleteCloudFrontOriginAccessIdentityRequest deleteCloudFrontOriginAccessIdentityRequest);

    /**
     * Delete an origin access identity.
     * 
     * @param deleteCloudFrontOriginAccessIdentityRequest
     *        The request to delete a origin access identity.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DeleteCloudFrontOriginAccessIdentity operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.DeleteCloudFrontOriginAccessIdentity
     */
    java.util.concurrent.Future<DeleteCloudFrontOriginAccessIdentityResult> deleteCloudFrontOriginAccessIdentityAsync(
            DeleteCloudFrontOriginAccessIdentityRequest deleteCloudFrontOriginAccessIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCloudFrontOriginAccessIdentityRequest, DeleteCloudFrontOriginAccessIdentityResult> asyncHandler);

    /**
     * Delete a distribution.
     * 
     * @param deleteDistributionRequest
     *        The request to delete a distribution.
     * @return A Java Future containing the result of the DeleteDistribution
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsync.DeleteDistribution
     */
    java.util.concurrent.Future<DeleteDistributionResult> deleteDistributionAsync(
            DeleteDistributionRequest deleteDistributionRequest);

    /**
     * Delete a distribution.
     * 
     * @param deleteDistributionRequest
     *        The request to delete a distribution.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDistribution
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.DeleteDistribution
     */
    java.util.concurrent.Future<DeleteDistributionResult> deleteDistributionAsync(
            DeleteDistributionRequest deleteDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDistributionRequest, DeleteDistributionResult> asyncHandler);

    /**
     * Delete a streaming distribution.
     * 
     * @param deleteStreamingDistributionRequest
     *        The request to delete a streaming distribution.
     * @return A Java Future containing the result of the
     *         DeleteStreamingDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsync.DeleteStreamingDistribution
     */
    java.util.concurrent.Future<DeleteStreamingDistributionResult> deleteStreamingDistributionAsync(
            DeleteStreamingDistributionRequest deleteStreamingDistributionRequest);

    /**
     * Delete a streaming distribution.
     * 
     * @param deleteStreamingDistributionRequest
     *        The request to delete a streaming distribution.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DeleteStreamingDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.DeleteStreamingDistribution
     */
    java.util.concurrent.Future<DeleteStreamingDistributionResult> deleteStreamingDistributionAsync(
            DeleteStreamingDistributionRequest deleteStreamingDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStreamingDistributionRequest, DeleteStreamingDistributionResult> asyncHandler);

    /**
     * Get the information about an origin access identity.
     * 
     * @param getCloudFrontOriginAccessIdentityRequest
     *        The request to get an origin access identity's information.
     * @return A Java Future containing the result of the
     *         GetCloudFrontOriginAccessIdentity operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.GetCloudFrontOriginAccessIdentity
     */
    java.util.concurrent.Future<GetCloudFrontOriginAccessIdentityResult> getCloudFrontOriginAccessIdentityAsync(
            GetCloudFrontOriginAccessIdentityRequest getCloudFrontOriginAccessIdentityRequest);

    /**
     * Get the information about an origin access identity.
     * 
     * @param getCloudFrontOriginAccessIdentityRequest
     *        The request to get an origin access identity's information.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         GetCloudFrontOriginAccessIdentity operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.GetCloudFrontOriginAccessIdentity
     */
    java.util.concurrent.Future<GetCloudFrontOriginAccessIdentityResult> getCloudFrontOriginAccessIdentityAsync(
            GetCloudFrontOriginAccessIdentityRequest getCloudFrontOriginAccessIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<GetCloudFrontOriginAccessIdentityRequest, GetCloudFrontOriginAccessIdentityResult> asyncHandler);

    /**
     * Get the configuration information about an origin access identity.
     * 
     * @param getCloudFrontOriginAccessIdentityConfigRequest
     *        The request to get an origin access identity's configuration.
     * @return A Java Future containing the result of the
     *         GetCloudFrontOriginAccessIdentityConfig operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.GetCloudFrontOriginAccessIdentityConfig
     */
    java.util.concurrent.Future<GetCloudFrontOriginAccessIdentityConfigResult> getCloudFrontOriginAccessIdentityConfigAsync(
            GetCloudFrontOriginAccessIdentityConfigRequest getCloudFrontOriginAccessIdentityConfigRequest);

    /**
     * Get the configuration information about an origin access identity.
     * 
     * @param getCloudFrontOriginAccessIdentityConfigRequest
     *        The request to get an origin access identity's configuration.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         GetCloudFrontOriginAccessIdentityConfig operation returned by the
     *         service.
     * @sample 
     *         AmazonCloudFrontAsyncHandler.GetCloudFrontOriginAccessIdentityConfig
     */
    java.util.concurrent.Future<GetCloudFrontOriginAccessIdentityConfigResult> getCloudFrontOriginAccessIdentityConfigAsync(
            GetCloudFrontOriginAccessIdentityConfigRequest getCloudFrontOriginAccessIdentityConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetCloudFrontOriginAccessIdentityConfigRequest, GetCloudFrontOriginAccessIdentityConfigResult> asyncHandler);

    /**
     * Get the information about a distribution.
     * 
     * @param getDistributionRequest
     *        The request to get a distribution's information.
     * @return A Java Future containing the result of the GetDistribution
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetDistribution
     */
    java.util.concurrent.Future<GetDistributionResult> getDistributionAsync(
            GetDistributionRequest getDistributionRequest);

    /**
     * Get the information about a distribution.
     * 
     * @param getDistributionRequest
     *        The request to get a distribution's information.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDistribution
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.GetDistribution
     */
    java.util.concurrent.Future<GetDistributionResult> getDistributionAsync(
            GetDistributionRequest getDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<GetDistributionRequest, GetDistributionResult> asyncHandler);

    /**
     * Get the configuration information about a distribution.
     * 
     * @param getDistributionConfigRequest
     *        The request to get a distribution configuration.
     * @return A Java Future containing the result of the GetDistributionConfig
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetDistributionConfig
     */
    java.util.concurrent.Future<GetDistributionConfigResult> getDistributionConfigAsync(
            GetDistributionConfigRequest getDistributionConfigRequest);

    /**
     * Get the configuration information about a distribution.
     * 
     * @param getDistributionConfigRequest
     *        The request to get a distribution configuration.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDistributionConfig
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.GetDistributionConfig
     */
    java.util.concurrent.Future<GetDistributionConfigResult> getDistributionConfigAsync(
            GetDistributionConfigRequest getDistributionConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetDistributionConfigRequest, GetDistributionConfigResult> asyncHandler);

    /**
     * Get the information about an invalidation.
     * 
     * @param getInvalidationRequest
     *        The request to get an invalidation's information.
     * @return A Java Future containing the result of the GetInvalidation
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetInvalidation
     */
    java.util.concurrent.Future<GetInvalidationResult> getInvalidationAsync(
            GetInvalidationRequest getInvalidationRequest);

    /**
     * Get the information about an invalidation.
     * 
     * @param getInvalidationRequest
     *        The request to get an invalidation's information.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInvalidation
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.GetInvalidation
     */
    java.util.concurrent.Future<GetInvalidationResult> getInvalidationAsync(
            GetInvalidationRequest getInvalidationRequest,
            com.amazonaws.handlers.AsyncHandler<GetInvalidationRequest, GetInvalidationResult> asyncHandler);

    /**
     * Get the information about a streaming distribution.
     * 
     * @param getStreamingDistributionRequest
     *        The request to get a streaming distribution's information.
     * @return A Java Future containing the result of the
     *         GetStreamingDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetStreamingDistribution
     */
    java.util.concurrent.Future<GetStreamingDistributionResult> getStreamingDistributionAsync(
            GetStreamingDistributionRequest getStreamingDistributionRequest);

    /**
     * Get the information about a streaming distribution.
     * 
     * @param getStreamingDistributionRequest
     *        The request to get a streaming distribution's information.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         GetStreamingDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.GetStreamingDistribution
     */
    java.util.concurrent.Future<GetStreamingDistributionResult> getStreamingDistributionAsync(
            GetStreamingDistributionRequest getStreamingDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<GetStreamingDistributionRequest, GetStreamingDistributionResult> asyncHandler);

    /**
     * Get the configuration information about a streaming distribution.
     * 
     * @param getStreamingDistributionConfigRequest
     *        To request to get a streaming distribution configuration.
     * @return A Java Future containing the result of the
     *         GetStreamingDistributionConfig operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetStreamingDistributionConfig
     */
    java.util.concurrent.Future<GetStreamingDistributionConfigResult> getStreamingDistributionConfigAsync(
            GetStreamingDistributionConfigRequest getStreamingDistributionConfigRequest);

    /**
     * Get the configuration information about a streaming distribution.
     * 
     * @param getStreamingDistributionConfigRequest
     *        To request to get a streaming distribution configuration.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         GetStreamingDistributionConfig operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.GetStreamingDistributionConfig
     */
    java.util.concurrent.Future<GetStreamingDistributionConfigResult> getStreamingDistributionConfigAsync(
            GetStreamingDistributionConfigRequest getStreamingDistributionConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetStreamingDistributionConfigRequest, GetStreamingDistributionConfigResult> asyncHandler);

    /**
     * List origin access identities.
     * 
     * @param listCloudFrontOriginAccessIdentitiesRequest
     *        The request to list origin access identities.
     * @return A Java Future containing the result of the
     *         ListCloudFrontOriginAccessIdentities operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.ListCloudFrontOriginAccessIdentities
     */
    java.util.concurrent.Future<ListCloudFrontOriginAccessIdentitiesResult> listCloudFrontOriginAccessIdentitiesAsync(
            ListCloudFrontOriginAccessIdentitiesRequest listCloudFrontOriginAccessIdentitiesRequest);

    /**
     * List origin access identities.
     * 
     * @param listCloudFrontOriginAccessIdentitiesRequest
     *        The request to list origin access identities.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         ListCloudFrontOriginAccessIdentities operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.ListCloudFrontOriginAccessIdentities
     */
    java.util.concurrent.Future<ListCloudFrontOriginAccessIdentitiesResult> listCloudFrontOriginAccessIdentitiesAsync(
            ListCloudFrontOriginAccessIdentitiesRequest listCloudFrontOriginAccessIdentitiesRequest,
            com.amazonaws.handlers.AsyncHandler<ListCloudFrontOriginAccessIdentitiesRequest, ListCloudFrontOriginAccessIdentitiesResult> asyncHandler);

    /**
     * List distributions.
     * 
     * @param listDistributionsRequest
     *        The request to list your distributions.
     * @return A Java Future containing the result of the ListDistributions
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsync.ListDistributions
     */
    java.util.concurrent.Future<ListDistributionsResult> listDistributionsAsync(
            ListDistributionsRequest listDistributionsRequest);

    /**
     * List distributions.
     * 
     * @param listDistributionsRequest
     *        The request to list your distributions.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDistributions
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.ListDistributions
     */
    java.util.concurrent.Future<ListDistributionsResult> listDistributionsAsync(
            ListDistributionsRequest listDistributionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDistributionsRequest, ListDistributionsResult> asyncHandler);

    /**
     * List the distributions that are associated with a specified AWS WAF web
     * ACL.
     * 
     * @param listDistributionsByWebACLIdRequest
     *        The request to list distributions that are associated with a
     *        specified AWS WAF web ACL.
     * @return A Java Future containing the result of the
     *         ListDistributionsByWebACLId operation returned by the service.
     * @sample AmazonCloudFrontAsync.ListDistributionsByWebACLId
     */
    java.util.concurrent.Future<ListDistributionsByWebACLIdResult> listDistributionsByWebACLIdAsync(
            ListDistributionsByWebACLIdRequest listDistributionsByWebACLIdRequest);

    /**
     * List the distributions that are associated with a specified AWS WAF web
     * ACL.
     * 
     * @param listDistributionsByWebACLIdRequest
     *        The request to list distributions that are associated with a
     *        specified AWS WAF web ACL.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         ListDistributionsByWebACLId operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.ListDistributionsByWebACLId
     */
    java.util.concurrent.Future<ListDistributionsByWebACLIdResult> listDistributionsByWebACLIdAsync(
            ListDistributionsByWebACLIdRequest listDistributionsByWebACLIdRequest,
            com.amazonaws.handlers.AsyncHandler<ListDistributionsByWebACLIdRequest, ListDistributionsByWebACLIdResult> asyncHandler);

    /**
     * List invalidation batches.
     * 
     * @param listInvalidationsRequest
     *        The request to list invalidations.
     * @return A Java Future containing the result of the ListInvalidations
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsync.ListInvalidations
     */
    java.util.concurrent.Future<ListInvalidationsResult> listInvalidationsAsync(
            ListInvalidationsRequest listInvalidationsRequest);

    /**
     * List invalidation batches.
     * 
     * @param listInvalidationsRequest
     *        The request to list invalidations.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInvalidations
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.ListInvalidations
     */
    java.util.concurrent.Future<ListInvalidationsResult> listInvalidationsAsync(
            ListInvalidationsRequest listInvalidationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInvalidationsRequest, ListInvalidationsResult> asyncHandler);

    /**
     * List streaming distributions.
     * 
     * @param listStreamingDistributionsRequest
     *        The request to list your streaming distributions.
     * @return A Java Future containing the result of the
     *         ListStreamingDistributions operation returned by the service.
     * @sample AmazonCloudFrontAsync.ListStreamingDistributions
     */
    java.util.concurrent.Future<ListStreamingDistributionsResult> listStreamingDistributionsAsync(
            ListStreamingDistributionsRequest listStreamingDistributionsRequest);

    /**
     * List streaming distributions.
     * 
     * @param listStreamingDistributionsRequest
     *        The request to list your streaming distributions.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         ListStreamingDistributions operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.ListStreamingDistributions
     */
    java.util.concurrent.Future<ListStreamingDistributionsResult> listStreamingDistributionsAsync(
            ListStreamingDistributionsRequest listStreamingDistributionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListStreamingDistributionsRequest, ListStreamingDistributionsResult> asyncHandler);

    /**
     * List tags for a CloudFront resource.
     * 
     * @param listTagsForResourceRequest
     *        The request to list tags for a CloudFront resource.
     * @return A Java Future containing the result of the ListTagsForResource
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsync.ListTagsForResource
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(
            ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * List tags for a CloudFront resource.
     * 
     * @param listTagsForResourceRequest
     *        The request to list tags for a CloudFront resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.ListTagsForResource
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(
            ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * Add tags to a CloudFront resource.
     * 
     * @param tagResourceRequest
     *        The request to add tags to a CloudFront resource.
     * @return A Java Future containing the result of the TagResource operation
     *         returned by the service.
     * @sample AmazonCloudFrontAsync.TagResource
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(
            TagResourceRequest tagResourceRequest);

    /**
     * Add tags to a CloudFront resource.
     * 
     * @param tagResourceRequest
     *        The request to add tags to a CloudFront resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation
     *         returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.TagResource
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(
            TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * Remove tags from a CloudFront resource.
     * 
     * @param untagResourceRequest
     *        The request to remove tags from a CloudFront resource.
     * @return A Java Future containing the result of the UntagResource
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsync.UntagResource
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(
            UntagResourceRequest untagResourceRequest);

    /**
     * Remove tags from a CloudFront resource.
     * 
     * @param untagResourceRequest
     *        The request to remove tags from a CloudFront resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.UntagResource
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(
            UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * Update an origin access identity.
     * 
     * @param updateCloudFrontOriginAccessIdentityRequest
     *        The request to update an origin access identity.
     * @return A Java Future containing the result of the
     *         UpdateCloudFrontOriginAccessIdentity operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.UpdateCloudFrontOriginAccessIdentity
     */
    java.util.concurrent.Future<UpdateCloudFrontOriginAccessIdentityResult> updateCloudFrontOriginAccessIdentityAsync(
            UpdateCloudFrontOriginAccessIdentityRequest updateCloudFrontOriginAccessIdentityRequest);

    /**
     * Update an origin access identity.
     * 
     * @param updateCloudFrontOriginAccessIdentityRequest
     *        The request to update an origin access identity.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         UpdateCloudFrontOriginAccessIdentity operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.UpdateCloudFrontOriginAccessIdentity
     */
    java.util.concurrent.Future<UpdateCloudFrontOriginAccessIdentityResult> updateCloudFrontOriginAccessIdentityAsync(
            UpdateCloudFrontOriginAccessIdentityRequest updateCloudFrontOriginAccessIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCloudFrontOriginAccessIdentityRequest, UpdateCloudFrontOriginAccessIdentityResult> asyncHandler);

    /**
     * Update a distribution.
     * 
     * @param updateDistributionRequest
     *        The request to update a distribution.
     * @return A Java Future containing the result of the UpdateDistribution
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsync.UpdateDistribution
     */
    java.util.concurrent.Future<UpdateDistributionResult> updateDistributionAsync(
            UpdateDistributionRequest updateDistributionRequest);

    /**
     * Update a distribution.
     * 
     * @param updateDistributionRequest
     *        The request to update a distribution.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDistribution
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.UpdateDistribution
     */
    java.util.concurrent.Future<UpdateDistributionResult> updateDistributionAsync(
            UpdateDistributionRequest updateDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDistributionRequest, UpdateDistributionResult> asyncHandler);

    /**
     * Update a streaming distribution.
     * 
     * @param updateStreamingDistributionRequest
     *        The request to update a streaming distribution.
     * @return A Java Future containing the result of the
     *         UpdateStreamingDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsync.UpdateStreamingDistribution
     */
    java.util.concurrent.Future<UpdateStreamingDistributionResult> updateStreamingDistributionAsync(
            UpdateStreamingDistributionRequest updateStreamingDistributionRequest);

    /**
     * Update a streaming distribution.
     * 
     * @param updateStreamingDistributionRequest
     *        The request to update a streaming distribution.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         UpdateStreamingDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.UpdateStreamingDistribution
     */
    java.util.concurrent.Future<UpdateStreamingDistributionResult> updateStreamingDistributionAsync(
            UpdateStreamingDistributionRequest updateStreamingDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateStreamingDistributionRequest, UpdateStreamingDistributionResult> asyncHandler);

}
