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
package com.amazonaws.services.cloudfront;

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
 * the CloudFront API actions, data types, and errors. For detailed information about CloudFront features and their
 * associated API calls, see the <i>Amazon CloudFront Developer Guide</i>.
 * </p>
 */
public interface AmazonCloudFrontAsync extends AmazonCloudFront {

    /**
     * <p>
     * Creates a new origin access identity. If you're using Amazon S3 for your origin, you can use an origin access
     * identity to require users to access your content using a CloudFront URL instead of the Amazon S3 URL. For more
     * information about how to use origin access identities, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving Private
     * Content through CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createCloudFrontOriginAccessIdentityRequest
     *        The request to create a new origin access identity.
     * @return A Java Future containing the result of the CreateCloudFrontOriginAccessIdentity operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.CreateCloudFrontOriginAccessIdentity
     */
    java.util.concurrent.Future<CreateCloudFrontOriginAccessIdentityResult> createCloudFrontOriginAccessIdentityAsync(
            CreateCloudFrontOriginAccessIdentityRequest createCloudFrontOriginAccessIdentityRequest);

    /**
     * <p>
     * Creates a new origin access identity. If you're using Amazon S3 for your origin, you can use an origin access
     * identity to require users to access your content using a CloudFront URL instead of the Amazon S3 URL. For more
     * information about how to use origin access identities, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving Private
     * Content through CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createCloudFrontOriginAccessIdentityRequest
     *        The request to create a new origin access identity.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCloudFrontOriginAccessIdentity operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsyncHandler.CreateCloudFrontOriginAccessIdentity
     */
    java.util.concurrent.Future<CreateCloudFrontOriginAccessIdentityResult> createCloudFrontOriginAccessIdentityAsync(
            CreateCloudFrontOriginAccessIdentityRequest createCloudFrontOriginAccessIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCloudFrontOriginAccessIdentityRequest, CreateCloudFrontOriginAccessIdentityResult> asyncHandler);

    /**
     * <p>
     * Creates a new web distribution. Send a <code>GET</code> request to the
     * <code>/<i>CloudFront API version</i>/distribution</code>/<code>distribution ID</code> resource.
     * </p>
     * 
     * @param createDistributionRequest
     *        The request to create a new distribution.
     * @return A Java Future containing the result of the CreateDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsync.CreateDistribution
     */
    java.util.concurrent.Future<CreateDistributionResult> createDistributionAsync(CreateDistributionRequest createDistributionRequest);

    /**
     * <p>
     * Creates a new web distribution. Send a <code>GET</code> request to the
     * <code>/<i>CloudFront API version</i>/distribution</code>/<code>distribution ID</code> resource.
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
     */
    java.util.concurrent.Future<CreateDistributionWithTagsResult> createDistributionWithTagsAsync(
            CreateDistributionWithTagsRequest createDistributionWithTagsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDistributionWithTagsRequest, CreateDistributionWithTagsResult> asyncHandler);

    /**
     * <p>
     * Create a new invalidation.
     * </p>
     * 
     * @param createInvalidationRequest
     *        The request to create an invalidation.
     * @return A Java Future containing the result of the CreateInvalidation operation returned by the service.
     * @sample AmazonCloudFrontAsync.CreateInvalidation
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
     */
    java.util.concurrent.Future<CreateInvalidationResult> createInvalidationAsync(CreateInvalidationRequest createInvalidationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInvalidationRequest, CreateInvalidationResult> asyncHandler);

    /**
     * <p>
     * Creates a new RMTP distribution. An RTMP distribution is similar to a web distribution, but an RTMP distribution
     * streams media files using the Adobe Real-Time Messaging Protocol (RTMP) instead of serving files using HTTP.
     * </p>
     * <p>
     * To create a new web distribution, submit a <code>POST</code> request to the <i>CloudFront API
     * version</i>/distribution resource. The request body must include a document with a
     * <i>StreamingDistributionConfig</i> element. The response echoes the <code>StreamingDistributionConfig</code>
     * element and returns other information about the RTMP distribution.
     * </p>
     * <p>
     * To get the status of your request, use the <i>GET StreamingDistribution</i> API action. When the value of
     * <code>Enabled</code> is <code>true</code> and the value of <code>Status</code> is <code>Deployed</code>, your
     * distribution is ready. A distribution usually deploys in less than 15 minutes.
     * </p>
     * <p>
     * For more information about web distributions, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-rtmp.html">Working with RTMP
     * Distributions</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * Beginning with the 2012-05-05 version of the CloudFront API, we made substantial changes to the format of the XML
     * document that you include in the request body when you create or update a web distribution or an RTMP
     * distribution, and when you invalidate objects. With previous versions of the API, we discovered that it was too
     * easy to accidentally delete one or more values for an element that accepts multiple values, for example, CNAMEs
     * and trusted signers. Our changes for the 2012-05-05 release are intended to prevent these accidental deletions
     * and to notify you when there's a mismatch between the number of values you say you're specifying in the
     * <code>Quantity</code> element and the number of values specified.
     * </p>
     * </important>
     * 
     * @param createStreamingDistributionRequest
     *        The request to create a new streaming distribution.
     * @return A Java Future containing the result of the CreateStreamingDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsync.CreateStreamingDistribution
     */
    java.util.concurrent.Future<CreateStreamingDistributionResult> createStreamingDistributionAsync(
            CreateStreamingDistributionRequest createStreamingDistributionRequest);

    /**
     * <p>
     * Creates a new RMTP distribution. An RTMP distribution is similar to a web distribution, but an RTMP distribution
     * streams media files using the Adobe Real-Time Messaging Protocol (RTMP) instead of serving files using HTTP.
     * </p>
     * <p>
     * To create a new web distribution, submit a <code>POST</code> request to the <i>CloudFront API
     * version</i>/distribution resource. The request body must include a document with a
     * <i>StreamingDistributionConfig</i> element. The response echoes the <code>StreamingDistributionConfig</code>
     * element and returns other information about the RTMP distribution.
     * </p>
     * <p>
     * To get the status of your request, use the <i>GET StreamingDistribution</i> API action. When the value of
     * <code>Enabled</code> is <code>true</code> and the value of <code>Status</code> is <code>Deployed</code>, your
     * distribution is ready. A distribution usually deploys in less than 15 minutes.
     * </p>
     * <p>
     * For more information about web distributions, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-rtmp.html">Working with RTMP
     * Distributions</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * Beginning with the 2012-05-05 version of the CloudFront API, we made substantial changes to the format of the XML
     * document that you include in the request body when you create or update a web distribution or an RTMP
     * distribution, and when you invalidate objects. With previous versions of the API, we discovered that it was too
     * easy to accidentally delete one or more values for an element that accepts multiple values, for example, CNAMEs
     * and trusted signers. Our changes for the 2012-05-05 release are intended to prevent these accidental deletions
     * and to notify you when there's a mismatch between the number of values you say you're specifying in the
     * <code>Quantity</code> element and the number of values specified.
     * </p>
     * </important>
     * 
     * @param createStreamingDistributionRequest
     *        The request to create a new streaming distribution.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStreamingDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.CreateStreamingDistribution
     */
    java.util.concurrent.Future<CreateStreamingDistributionResult> createStreamingDistributionAsync(
            CreateStreamingDistributionRequest createStreamingDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStreamingDistributionRequest, CreateStreamingDistributionResult> asyncHandler);

    /**
     * <p>
     * Create a new streaming distribution with tags.
     * </p>
     * 
     * @param createStreamingDistributionWithTagsRequest
     *        The request to create a new streaming distribution with tags.
     * @return A Java Future containing the result of the CreateStreamingDistributionWithTags operation returned by the
     *         service.
     * @sample AmazonCloudFrontAsync.CreateStreamingDistributionWithTags
     */
    java.util.concurrent.Future<CreateStreamingDistributionWithTagsResult> createStreamingDistributionWithTagsAsync(
            CreateStreamingDistributionWithTagsRequest createStreamingDistributionWithTagsRequest);

    /**
     * <p>
     * Create a new streaming distribution with tags.
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
     */
    java.util.concurrent.Future<CreateStreamingDistributionWithTagsResult> createStreamingDistributionWithTagsAsync(
            CreateStreamingDistributionWithTagsRequest createStreamingDistributionWithTagsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStreamingDistributionWithTagsRequest, CreateStreamingDistributionWithTagsResult> asyncHandler);

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
     */
    java.util.concurrent.Future<DeleteCloudFrontOriginAccessIdentityResult> deleteCloudFrontOriginAccessIdentityAsync(
            DeleteCloudFrontOriginAccessIdentityRequest deleteCloudFrontOriginAccessIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCloudFrontOriginAccessIdentityRequest, DeleteCloudFrontOriginAccessIdentityResult> asyncHandler);

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
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/HowToDeleteDistribution.html"
     *        >Deleting a Distribution</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return A Java Future containing the result of the DeleteDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsync.DeleteDistribution
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
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/HowToDeleteDistribution.html"
     *        >Deleting a Distribution</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.DeleteDistribution
     */
    java.util.concurrent.Future<DeleteDistributionResult> deleteDistributionAsync(DeleteDistributionRequest deleteDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDistributionRequest, DeleteDistributionResult> asyncHandler);

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
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/HowToDeleteDistribution.html">Deleting a
     * Distribution</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param deleteStreamingDistributionRequest
     *        The request to delete a streaming distribution.
     * @return A Java Future containing the result of the DeleteStreamingDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsync.DeleteStreamingDistribution
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
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/HowToDeleteDistribution.html">Deleting a
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
     */
    java.util.concurrent.Future<DeleteStreamingDistributionResult> deleteStreamingDistributionAsync(
            DeleteStreamingDistributionRequest deleteStreamingDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStreamingDistributionRequest, DeleteStreamingDistributionResult> asyncHandler);

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
     *        The origin access identity's configuration information. For more information, see
     *        <a>CloudFrontOriginAccessIdentityConfigComplexType</a>.
     * @return A Java Future containing the result of the GetCloudFrontOriginAccessIdentityConfig operation returned by
     *         the service.
     * @sample AmazonCloudFrontAsync.GetCloudFrontOriginAccessIdentityConfig
     */
    java.util.concurrent.Future<GetCloudFrontOriginAccessIdentityConfigResult> getCloudFrontOriginAccessIdentityConfigAsync(
            GetCloudFrontOriginAccessIdentityConfigRequest getCloudFrontOriginAccessIdentityConfigRequest);

    /**
     * <p>
     * Get the configuration information about an origin access identity.
     * </p>
     * 
     * @param getCloudFrontOriginAccessIdentityConfigRequest
     *        The origin access identity's configuration information. For more information, see
     *        <a>CloudFrontOriginAccessIdentityConfigComplexType</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCloudFrontOriginAccessIdentityConfig operation returned by
     *         the service.
     * @sample AmazonCloudFrontAsyncHandler.GetCloudFrontOriginAccessIdentityConfig
     */
    java.util.concurrent.Future<GetCloudFrontOriginAccessIdentityConfigResult> getCloudFrontOriginAccessIdentityConfigAsync(
            GetCloudFrontOriginAccessIdentityConfigRequest getCloudFrontOriginAccessIdentityConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetCloudFrontOriginAccessIdentityConfigRequest, GetCloudFrontOriginAccessIdentityConfigResult> asyncHandler);

    /**
     * <p>
     * Get the information about a distribution.
     * </p>
     * 
     * @param getDistributionRequest
     *        The request to get a distribution's information.
     * @return A Java Future containing the result of the GetDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetDistribution
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
     */
    java.util.concurrent.Future<GetDistributionConfigResult> getDistributionConfigAsync(GetDistributionConfigRequest getDistributionConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetDistributionConfigRequest, GetDistributionConfigResult> asyncHandler);

    /**
     * <p>
     * Get the information about an invalidation.
     * </p>
     * 
     * @param getInvalidationRequest
     *        The request to get an invalidation's information.
     * @return A Java Future containing the result of the GetInvalidation operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetInvalidation
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
     */
    java.util.concurrent.Future<GetInvalidationResult> getInvalidationAsync(GetInvalidationRequest getInvalidationRequest,
            com.amazonaws.handlers.AsyncHandler<GetInvalidationRequest, GetInvalidationResult> asyncHandler);

    /**
     * <p>
     * Gets information about a specified RTMP distribution, including the distribution configuration.
     * </p>
     * 
     * @param getStreamingDistributionRequest
     *        The request to get a streaming distribution's information.
     * @return A Java Future containing the result of the GetStreamingDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsync.GetStreamingDistribution
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
     */
    java.util.concurrent.Future<GetStreamingDistributionConfigResult> getStreamingDistributionConfigAsync(
            GetStreamingDistributionConfigRequest getStreamingDistributionConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetStreamingDistributionConfigRequest, GetStreamingDistributionConfigResult> asyncHandler);

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
     */
    java.util.concurrent.Future<ListCloudFrontOriginAccessIdentitiesResult> listCloudFrontOriginAccessIdentitiesAsync(
            ListCloudFrontOriginAccessIdentitiesRequest listCloudFrontOriginAccessIdentitiesRequest,
            com.amazonaws.handlers.AsyncHandler<ListCloudFrontOriginAccessIdentitiesRequest, ListCloudFrontOriginAccessIdentitiesResult> asyncHandler);

    /**
     * <p>
     * List distributions.
     * </p>
     * 
     * @param listDistributionsRequest
     *        The request to list your distributions.
     * @return A Java Future containing the result of the ListDistributions operation returned by the service.
     * @sample AmazonCloudFrontAsync.ListDistributions
     */
    java.util.concurrent.Future<ListDistributionsResult> listDistributionsAsync(ListDistributionsRequest listDistributionsRequest);

    /**
     * <p>
     * List distributions.
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
     */
    java.util.concurrent.Future<ListDistributionsResult> listDistributionsAsync(ListDistributionsRequest listDistributionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDistributionsRequest, ListDistributionsResult> asyncHandler);

    /**
     * <p>
     * List the distributions that are associated with a specified AWS WAF web ACL.
     * </p>
     * 
     * @param listDistributionsByWebACLIdRequest
     *        The request to list distributions that are associated with a specified AWS WAF web ACL.
     * @return A Java Future containing the result of the ListDistributionsByWebACLId operation returned by the service.
     * @sample AmazonCloudFrontAsync.ListDistributionsByWebACLId
     */
    java.util.concurrent.Future<ListDistributionsByWebACLIdResult> listDistributionsByWebACLIdAsync(
            ListDistributionsByWebACLIdRequest listDistributionsByWebACLIdRequest);

    /**
     * <p>
     * List the distributions that are associated with a specified AWS WAF web ACL.
     * </p>
     * 
     * @param listDistributionsByWebACLIdRequest
     *        The request to list distributions that are associated with a specified AWS WAF web ACL.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDistributionsByWebACLId operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.ListDistributionsByWebACLId
     */
    java.util.concurrent.Future<ListDistributionsByWebACLIdResult> listDistributionsByWebACLIdAsync(
            ListDistributionsByWebACLIdRequest listDistributionsByWebACLIdRequest,
            com.amazonaws.handlers.AsyncHandler<ListDistributionsByWebACLIdRequest, ListDistributionsByWebACLIdResult> asyncHandler);

    /**
     * <p>
     * Lists invalidation batches.
     * </p>
     * 
     * @param listInvalidationsRequest
     *        The request to list invalidations.
     * @return A Java Future containing the result of the ListInvalidations operation returned by the service.
     * @sample AmazonCloudFrontAsync.ListInvalidations
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
     */
    java.util.concurrent.Future<ListInvalidationsResult> listInvalidationsAsync(ListInvalidationsRequest listInvalidationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInvalidationsRequest, ListInvalidationsResult> asyncHandler);

    /**
     * <p>
     * List streaming distributions.
     * </p>
     * 
     * @param listStreamingDistributionsRequest
     *        The request to list your streaming distributions.
     * @return A Java Future containing the result of the ListStreamingDistributions operation returned by the service.
     * @sample AmazonCloudFrontAsync.ListStreamingDistributions
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
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Add tags to a CloudFront resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        The request to add tags to a CloudFront resource.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonCloudFrontAsync.TagResource
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
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Remove tags from a CloudFront resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        The request to remove tags from a CloudFront resource.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonCloudFrontAsync.UntagResource
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
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

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
     */
    java.util.concurrent.Future<UpdateCloudFrontOriginAccessIdentityResult> updateCloudFrontOriginAccessIdentityAsync(
            UpdateCloudFrontOriginAccessIdentityRequest updateCloudFrontOriginAccessIdentityRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCloudFrontOriginAccessIdentityRequest, UpdateCloudFrontOriginAccessIdentityResult> asyncHandler);

    /**
     * <p>
     * Update a distribution.
     * </p>
     * 
     * @param updateDistributionRequest
     *        The request to update a distribution.
     * @return A Java Future containing the result of the UpdateDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsync.UpdateDistribution
     */
    java.util.concurrent.Future<UpdateDistributionResult> updateDistributionAsync(UpdateDistributionRequest updateDistributionRequest);

    /**
     * <p>
     * Update a distribution.
     * </p>
     * 
     * @param updateDistributionRequest
     *        The request to update a distribution.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsyncHandler.UpdateDistribution
     */
    java.util.concurrent.Future<UpdateDistributionResult> updateDistributionAsync(UpdateDistributionRequest updateDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDistributionRequest, UpdateDistributionResult> asyncHandler);

    /**
     * <p>
     * Update a streaming distribution.
     * </p>
     * 
     * @param updateStreamingDistributionRequest
     *        The request to update a streaming distribution.
     * @return A Java Future containing the result of the UpdateStreamingDistribution operation returned by the service.
     * @sample AmazonCloudFrontAsync.UpdateStreamingDistribution
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
     */
    java.util.concurrent.Future<UpdateStreamingDistributionResult> updateStreamingDistributionAsync(
            UpdateStreamingDistributionRequest updateStreamingDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateStreamingDistributionRequest, UpdateStreamingDistributionResult> asyncHandler);

}
