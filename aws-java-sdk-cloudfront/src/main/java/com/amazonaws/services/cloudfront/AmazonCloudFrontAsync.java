/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
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
 */
public interface AmazonCloudFrontAsync extends AmazonCloudFront {

    /**
     * @param createCloudFrontOriginAccessIdentityRequest
     * @return A Java Future containing the result of the
     *         CreateCloudFrontOriginAccessIdentity operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.CreateCloudFrontOriginAccessIdentity
     */
    java.util.concurrent.Future<CreateCloudFrontOriginAccessIdentityResult> createCloudFrontOriginAccessIdentityAsync(
            CreateCloudFrontOriginAccessIdentityRequest createCloudFrontOriginAccessIdentityRequest);

    /**
     * @param createCloudFrontOriginAccessIdentityRequest
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
     * @param createDistributionRequest
     * @return A Java Future containing the result of the CreateDistribution
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsync.CreateDistribution
     */
    java.util.concurrent.Future<CreateDistributionResult> createDistributionAsync(
            CreateDistributionRequest createDistributionRequest);

    /**
     * @param createDistributionRequest
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
     * @param createInvalidationRequest
     * @return A Java Future containing the result of the CreateInvalidation
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsync.CreateInvalidation
     */
    java.util.concurrent.Future<CreateInvalidationResult> createInvalidationAsync(
            CreateInvalidationRequest createInvalidationRequest);

    /**
     * @param createInvalidationRequest
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
     * @param createStreamingDistributionRequest
     * @return A Java Future containing the result of the
     *         CreateStreamingDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsync.CreateStreamingDistribution
     */
    java.util.concurrent.Future<CreateStreamingDistributionResult> createStreamingDistributionAsync(
            CreateStreamingDistributionRequest createStreamingDistributionRequest);

    /**
     * @param createStreamingDistributionRequest
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
     * @param deleteCloudFrontOriginAccessIdentityRequest
     * @sample AmazonCloudFrontAsync.DeleteCloudFrontOriginAccessIdentity
     */
    java.util.concurrent.Future<Void> deleteCloudFrontOriginAccessIdentityAsync(
            DeleteCloudFrontOriginAccessIdentityRequest deleteCloudFrontOriginAccessIdentityRequest);

    /**
     * @param deleteCloudFrontOriginAccessIdentityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonCloudFrontAsyncHandler.DeleteCloudFrontOriginAccessIdentity
     */
    java.util.concurrent.Future<Void> deleteCloudFrontOriginAccessIdentityAsync(
            DeleteCloudFrontOriginAccessIdentityRequest deleteCloudFrontOriginAccessIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCloudFrontOriginAccessIdentityRequest, Void> asyncHandler);

    /**
     * @param deleteDistributionRequest
     * @sample AmazonCloudFrontAsync.DeleteDistribution
     */
    java.util.concurrent.Future<Void> deleteDistributionAsync(
            DeleteDistributionRequest deleteDistributionRequest);

    /**
     * @param deleteDistributionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonCloudFrontAsyncHandler.DeleteDistribution
     */
    java.util.concurrent.Future<Void> deleteDistributionAsync(
            DeleteDistributionRequest deleteDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDistributionRequest, Void> asyncHandler);

    /**
     * @param deleteStreamingDistributionRequest
     * @sample AmazonCloudFrontAsync.DeleteStreamingDistribution
     */
    java.util.concurrent.Future<Void> deleteStreamingDistributionAsync(
            DeleteStreamingDistributionRequest deleteStreamingDistributionRequest);

    /**
     * @param deleteStreamingDistributionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonCloudFrontAsyncHandler.DeleteStreamingDistribution
     */
    java.util.concurrent.Future<Void> deleteStreamingDistributionAsync(
            DeleteStreamingDistributionRequest deleteStreamingDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStreamingDistributionRequest, Void> asyncHandler);

    /**
     * @param getCloudFrontOriginAccessIdentityRequest
     * @return A Java Future containing the result of the
     *         GetCloudFrontOriginAccessIdentity operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.GetCloudFrontOriginAccessIdentity
     */
    java.util.concurrent.Future<GetCloudFrontOriginAccessIdentityResult> getCloudFrontOriginAccessIdentityAsync(
            GetCloudFrontOriginAccessIdentityRequest getCloudFrontOriginAccessIdentityRequest);

    /**
     * @param getCloudFrontOriginAccessIdentityRequest
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
     * @param getCloudFrontOriginAccessIdentityConfigRequest
     * @return A Java Future containing the result of the
     *         GetCloudFrontOriginAccessIdentityConfig operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.GetCloudFrontOriginAccessIdentityConfig
     */
    java.util.concurrent.Future<GetCloudFrontOriginAccessIdentityConfigResult> getCloudFrontOriginAccessIdentityConfigAsync(
            GetCloudFrontOriginAccessIdentityConfigRequest getCloudFrontOriginAccessIdentityConfigRequest);

    /**
     * @param getCloudFrontOriginAccessIdentityConfigRequest
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
     * @param getDistributionRequest
     * @return A Java Future containing the result of the GetDistribution
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetDistribution
     */
    java.util.concurrent.Future<GetDistributionResult> getDistributionAsync(
            GetDistributionRequest getDistributionRequest);

    /**
     * @param getDistributionRequest
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
     * @param getDistributionConfigRequest
     * @return A Java Future containing the result of the GetDistributionConfig
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetDistributionConfig
     */
    java.util.concurrent.Future<GetDistributionConfigResult> getDistributionConfigAsync(
            GetDistributionConfigRequest getDistributionConfigRequest);

    /**
     * @param getDistributionConfigRequest
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
     * @param getInvalidationRequest
     * @return A Java Future containing the result of the GetInvalidation
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetInvalidation
     */
    java.util.concurrent.Future<GetInvalidationResult> getInvalidationAsync(
            GetInvalidationRequest getInvalidationRequest);

    /**
     * @param getInvalidationRequest
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
     * @param getStreamingDistributionRequest
     * @return A Java Future containing the result of the
     *         GetStreamingDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetStreamingDistribution
     */
    java.util.concurrent.Future<GetStreamingDistributionResult> getStreamingDistributionAsync(
            GetStreamingDistributionRequest getStreamingDistributionRequest);

    /**
     * @param getStreamingDistributionRequest
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
     * @param getStreamingDistributionConfigRequest
     * @return A Java Future containing the result of the
     *         GetStreamingDistributionConfig operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetStreamingDistributionConfig
     */
    java.util.concurrent.Future<GetStreamingDistributionConfigResult> getStreamingDistributionConfigAsync(
            GetStreamingDistributionConfigRequest getStreamingDistributionConfigRequest);

    /**
     * @param getStreamingDistributionConfigRequest
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
     * @param listCloudFrontOriginAccessIdentitiesRequest
     * @return A Java Future containing the result of the
     *         ListCloudFrontOriginAccessIdentities operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.ListCloudFrontOriginAccessIdentities
     */
    java.util.concurrent.Future<ListCloudFrontOriginAccessIdentitiesResult> listCloudFrontOriginAccessIdentitiesAsync(
            ListCloudFrontOriginAccessIdentitiesRequest listCloudFrontOriginAccessIdentitiesRequest);

    /**
     * @param listCloudFrontOriginAccessIdentitiesRequest
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
     * @param listDistributionsRequest
     * @return A Java Future containing the result of the ListDistributions
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsync.ListDistributions
     */
    java.util.concurrent.Future<ListDistributionsResult> listDistributionsAsync(
            ListDistributionsRequest listDistributionsRequest);

    /**
     * @param listDistributionsRequest
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
     * @param listDistributionsByWebACLIdRequest
     * @return A Java Future containing the result of the
     *         ListDistributionsByWebACLId operation returned by the service.
     * @sample AmazonCloudFrontAsync.ListDistributionsByWebACLId
     */
    java.util.concurrent.Future<ListDistributionsByWebACLIdResult> listDistributionsByWebACLIdAsync(
            ListDistributionsByWebACLIdRequest listDistributionsByWebACLIdRequest);

    /**
     * @param listDistributionsByWebACLIdRequest
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
     * @param listInvalidationsRequest
     * @return A Java Future containing the result of the ListInvalidations
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsync.ListInvalidations
     */
    java.util.concurrent.Future<ListInvalidationsResult> listInvalidationsAsync(
            ListInvalidationsRequest listInvalidationsRequest);

    /**
     * @param listInvalidationsRequest
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
     * @param listStreamingDistributionsRequest
     * @return A Java Future containing the result of the
     *         ListStreamingDistributions operation returned by the service.
     * @sample AmazonCloudFrontAsync.ListStreamingDistributions
     */
    java.util.concurrent.Future<ListStreamingDistributionsResult> listStreamingDistributionsAsync(
            ListStreamingDistributionsRequest listStreamingDistributionsRequest);

    /**
     * @param listStreamingDistributionsRequest
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
     * @param updateCloudFrontOriginAccessIdentityRequest
     * @return A Java Future containing the result of the
     *         UpdateCloudFrontOriginAccessIdentity operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.UpdateCloudFrontOriginAccessIdentity
     */
    java.util.concurrent.Future<UpdateCloudFrontOriginAccessIdentityResult> updateCloudFrontOriginAccessIdentityAsync(
            UpdateCloudFrontOriginAccessIdentityRequest updateCloudFrontOriginAccessIdentityRequest);

    /**
     * @param updateCloudFrontOriginAccessIdentityRequest
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
     * @param updateDistributionRequest
     * @return A Java Future containing the result of the UpdateDistribution
     *         operation returned by the service.
     * @sample AmazonCloudFrontAsync.UpdateDistribution
     */
    java.util.concurrent.Future<UpdateDistributionResult> updateDistributionAsync(
            UpdateDistributionRequest updateDistributionRequest);

    /**
     * @param updateDistributionRequest
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
     * @param updateStreamingDistributionRequest
     * @return A Java Future containing the result of the
     *         UpdateStreamingDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsync.UpdateStreamingDistribution
     */
    java.util.concurrent.Future<UpdateStreamingDistributionResult> updateStreamingDistributionAsync(
            UpdateStreamingDistributionRequest updateStreamingDistributionRequest);

    /**
     * @param updateStreamingDistributionRequest
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
