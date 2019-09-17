/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediapackage;

import javax.annotation.Generated;

import com.amazonaws.services.mediapackage.model.*;

/**
 * Interface for accessing MediaPackage asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mediapackage.AbstractAWSMediaPackageAsync} instead.
 * </p>
 * <p>
 * AWS Elemental MediaPackage
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMediaPackageAsync extends AWSMediaPackage {

    /**
     * Creates a new Channel.
     * 
     * @param createChannelRequest
     *        A new Channel configuration.
     * @return A Java Future containing the result of the CreateChannel operation returned by the service.
     * @sample AWSMediaPackageAsync.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/CreateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelResult> createChannelAsync(CreateChannelRequest createChannelRequest);

    /**
     * Creates a new Channel.
     * 
     * @param createChannelRequest
     *        A new Channel configuration.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateChannel operation returned by the service.
     * @sample AWSMediaPackageAsyncHandler.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/CreateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelResult> createChannelAsync(CreateChannelRequest createChannelRequest,
            com.amazonaws.handlers.AsyncHandler<CreateChannelRequest, CreateChannelResult> asyncHandler);

    /**
     * Creates a new OriginEndpoint record.
     * 
     * @param createOriginEndpointRequest
     *        Configuration parameters used to create a new OriginEndpoint.
     * @return A Java Future containing the result of the CreateOriginEndpoint operation returned by the service.
     * @sample AWSMediaPackageAsync.CreateOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/CreateOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateOriginEndpointResult> createOriginEndpointAsync(CreateOriginEndpointRequest createOriginEndpointRequest);

    /**
     * Creates a new OriginEndpoint record.
     * 
     * @param createOriginEndpointRequest
     *        Configuration parameters used to create a new OriginEndpoint.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateOriginEndpoint operation returned by the service.
     * @sample AWSMediaPackageAsyncHandler.CreateOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/CreateOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateOriginEndpointResult> createOriginEndpointAsync(CreateOriginEndpointRequest createOriginEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<CreateOriginEndpointRequest, CreateOriginEndpointResult> asyncHandler);

    /**
     * Deletes an existing Channel.
     * 
     * @param deleteChannelRequest
     * @return A Java Future containing the result of the DeleteChannel operation returned by the service.
     * @sample AWSMediaPackageAsync.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/DeleteChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(DeleteChannelRequest deleteChannelRequest);

    /**
     * Deletes an existing Channel.
     * 
     * @param deleteChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteChannel operation returned by the service.
     * @sample AWSMediaPackageAsyncHandler.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/DeleteChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(DeleteChannelRequest deleteChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteChannelRequest, DeleteChannelResult> asyncHandler);

    /**
     * Deletes an existing OriginEndpoint.
     * 
     * @param deleteOriginEndpointRequest
     * @return A Java Future containing the result of the DeleteOriginEndpoint operation returned by the service.
     * @sample AWSMediaPackageAsync.DeleteOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/DeleteOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteOriginEndpointResult> deleteOriginEndpointAsync(DeleteOriginEndpointRequest deleteOriginEndpointRequest);

    /**
     * Deletes an existing OriginEndpoint.
     * 
     * @param deleteOriginEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteOriginEndpoint operation returned by the service.
     * @sample AWSMediaPackageAsyncHandler.DeleteOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/DeleteOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteOriginEndpointResult> deleteOriginEndpointAsync(DeleteOriginEndpointRequest deleteOriginEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteOriginEndpointRequest, DeleteOriginEndpointResult> asyncHandler);

    /**
     * Gets details about a Channel.
     * 
     * @param describeChannelRequest
     * @return A Java Future containing the result of the DescribeChannel operation returned by the service.
     * @sample AWSMediaPackageAsync.DescribeChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/DescribeChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeChannelResult> describeChannelAsync(DescribeChannelRequest describeChannelRequest);

    /**
     * Gets details about a Channel.
     * 
     * @param describeChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeChannel operation returned by the service.
     * @sample AWSMediaPackageAsyncHandler.DescribeChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/DescribeChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeChannelResult> describeChannelAsync(DescribeChannelRequest describeChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeChannelRequest, DescribeChannelResult> asyncHandler);

    /**
     * Gets details about an existing OriginEndpoint.
     * 
     * @param describeOriginEndpointRequest
     * @return A Java Future containing the result of the DescribeOriginEndpoint operation returned by the service.
     * @sample AWSMediaPackageAsync.DescribeOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/DescribeOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOriginEndpointResult> describeOriginEndpointAsync(DescribeOriginEndpointRequest describeOriginEndpointRequest);

    /**
     * Gets details about an existing OriginEndpoint.
     * 
     * @param describeOriginEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOriginEndpoint operation returned by the service.
     * @sample AWSMediaPackageAsyncHandler.DescribeOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/DescribeOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOriginEndpointResult> describeOriginEndpointAsync(DescribeOriginEndpointRequest describeOriginEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOriginEndpointRequest, DescribeOriginEndpointResult> asyncHandler);

    /**
     * Returns a collection of Channels.
     * 
     * @param listChannelsRequest
     * @return A Java Future containing the result of the ListChannels operation returned by the service.
     * @sample AWSMediaPackageAsync.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/ListChannels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest listChannelsRequest);

    /**
     * Returns a collection of Channels.
     * 
     * @param listChannelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListChannels operation returned by the service.
     * @sample AWSMediaPackageAsyncHandler.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/ListChannels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest listChannelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListChannelsRequest, ListChannelsResult> asyncHandler);

    /**
     * Returns a collection of OriginEndpoint records.
     * 
     * @param listOriginEndpointsRequest
     * @return A Java Future containing the result of the ListOriginEndpoints operation returned by the service.
     * @sample AWSMediaPackageAsync.ListOriginEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/ListOriginEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOriginEndpointsResult> listOriginEndpointsAsync(ListOriginEndpointsRequest listOriginEndpointsRequest);

    /**
     * Returns a collection of OriginEndpoint records.
     * 
     * @param listOriginEndpointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOriginEndpoints operation returned by the service.
     * @sample AWSMediaPackageAsyncHandler.ListOriginEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/ListOriginEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOriginEndpointsResult> listOriginEndpointsAsync(ListOriginEndpointsRequest listOriginEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<ListOriginEndpointsRequest, ListOriginEndpointsResult> asyncHandler);

    /**
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSMediaPackageAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSMediaPackageAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * Changes the Channel's first IngestEndpoint's username and password. WARNING - This API is deprecated. Please use
     * RotateIngestEndpointCredentials instead
     * 
     * @param rotateChannelCredentialsRequest
     * @return A Java Future containing the result of the RotateChannelCredentials operation returned by the service.
     * @sample AWSMediaPackageAsync.RotateChannelCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/RotateChannelCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<RotateChannelCredentialsResult> rotateChannelCredentialsAsync(RotateChannelCredentialsRequest rotateChannelCredentialsRequest);

    /**
     * Changes the Channel's first IngestEndpoint's username and password. WARNING - This API is deprecated. Please use
     * RotateIngestEndpointCredentials instead
     * 
     * @param rotateChannelCredentialsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RotateChannelCredentials operation returned by the service.
     * @sample AWSMediaPackageAsyncHandler.RotateChannelCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/RotateChannelCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<RotateChannelCredentialsResult> rotateChannelCredentialsAsync(RotateChannelCredentialsRequest rotateChannelCredentialsRequest,
            com.amazonaws.handlers.AsyncHandler<RotateChannelCredentialsRequest, RotateChannelCredentialsResult> asyncHandler);

    /**
     * Rotate the IngestEndpoint's username and password, as specified by the IngestEndpoint's id.
     * 
     * @param rotateIngestEndpointCredentialsRequest
     * @return A Java Future containing the result of the RotateIngestEndpointCredentials operation returned by the
     *         service.
     * @sample AWSMediaPackageAsync.RotateIngestEndpointCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/RotateIngestEndpointCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RotateIngestEndpointCredentialsResult> rotateIngestEndpointCredentialsAsync(
            RotateIngestEndpointCredentialsRequest rotateIngestEndpointCredentialsRequest);

    /**
     * Rotate the IngestEndpoint's username and password, as specified by the IngestEndpoint's id.
     * 
     * @param rotateIngestEndpointCredentialsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RotateIngestEndpointCredentials operation returned by the
     *         service.
     * @sample AWSMediaPackageAsyncHandler.RotateIngestEndpointCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/RotateIngestEndpointCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RotateIngestEndpointCredentialsResult> rotateIngestEndpointCredentialsAsync(
            RotateIngestEndpointCredentialsRequest rotateIngestEndpointCredentialsRequest,
            com.amazonaws.handlers.AsyncHandler<RotateIngestEndpointCredentialsRequest, RotateIngestEndpointCredentialsResult> asyncHandler);

    /**
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSMediaPackageAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSMediaPackageAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSMediaPackageAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSMediaPackageAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * Updates an existing Channel.
     * 
     * @param updateChannelRequest
     *        Configuration parameters used to update the Channel.
     * @return A Java Future containing the result of the UpdateChannel operation returned by the service.
     * @sample AWSMediaPackageAsync.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/UpdateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateChannelResult> updateChannelAsync(UpdateChannelRequest updateChannelRequest);

    /**
     * Updates an existing Channel.
     * 
     * @param updateChannelRequest
     *        Configuration parameters used to update the Channel.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateChannel operation returned by the service.
     * @sample AWSMediaPackageAsyncHandler.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/UpdateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateChannelResult> updateChannelAsync(UpdateChannelRequest updateChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateChannelRequest, UpdateChannelResult> asyncHandler);

    /**
     * Updates an existing OriginEndpoint.
     * 
     * @param updateOriginEndpointRequest
     *        Configuration parameters used to update an existing OriginEndpoint.
     * @return A Java Future containing the result of the UpdateOriginEndpoint operation returned by the service.
     * @sample AWSMediaPackageAsync.UpdateOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/UpdateOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateOriginEndpointResult> updateOriginEndpointAsync(UpdateOriginEndpointRequest updateOriginEndpointRequest);

    /**
     * Updates an existing OriginEndpoint.
     * 
     * @param updateOriginEndpointRequest
     *        Configuration parameters used to update an existing OriginEndpoint.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateOriginEndpoint operation returned by the service.
     * @sample AWSMediaPackageAsyncHandler.UpdateOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/UpdateOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateOriginEndpointResult> updateOriginEndpointAsync(UpdateOriginEndpointRequest updateOriginEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateOriginEndpointRequest, UpdateOriginEndpointResult> asyncHandler);

}
