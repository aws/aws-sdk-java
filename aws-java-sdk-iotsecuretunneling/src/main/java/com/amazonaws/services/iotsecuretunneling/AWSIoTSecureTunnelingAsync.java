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
package com.amazonaws.services.iotsecuretunneling;

import javax.annotation.Generated;

import com.amazonaws.services.iotsecuretunneling.model.*;

/**
 * Interface for accessing AWS IoT Secure Tunneling asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iotsecuretunneling.AbstractAWSIoTSecureTunnelingAsync} instead.
 * </p>
 * <p>
 * <fullname>IoT Secure Tunneling</fullname>
 * <p>
 * IoT Secure Tunneling creates remote connections to devices deployed in the field.
 * </p>
 * <p>
 * For more information about how IoT Secure Tunneling works, see <a
 * href="https://docs.aws.amazon.com/iot/latest/developerguide/secure-tunneling.html">IoT Secure Tunneling</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIoTSecureTunnelingAsync extends AWSIoTSecureTunneling {

    /**
     * <p>
     * Closes a tunnel identified by the unique tunnel id. When a <code>CloseTunnel</code> request is received, we close
     * the WebSocket connections between the client and proxy server so no data can be transmitted.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CloseTunnel</a> action.
     * </p>
     * 
     * @param closeTunnelRequest
     * @return A Java Future containing the result of the CloseTunnel operation returned by the service.
     * @sample AWSIoTSecureTunnelingAsync.CloseTunnel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/CloseTunnel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CloseTunnelResult> closeTunnelAsync(CloseTunnelRequest closeTunnelRequest);

    /**
     * <p>
     * Closes a tunnel identified by the unique tunnel id. When a <code>CloseTunnel</code> request is received, we close
     * the WebSocket connections between the client and proxy server so no data can be transmitted.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >CloseTunnel</a> action.
     * </p>
     * 
     * @param closeTunnelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CloseTunnel operation returned by the service.
     * @sample AWSIoTSecureTunnelingAsyncHandler.CloseTunnel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/CloseTunnel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CloseTunnelResult> closeTunnelAsync(CloseTunnelRequest closeTunnelRequest,
            com.amazonaws.handlers.AsyncHandler<CloseTunnelRequest, CloseTunnelResult> asyncHandler);

    /**
     * <p>
     * Gets information about a tunnel identified by the unique tunnel id.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeTunnel</a> action.
     * </p>
     * 
     * @param describeTunnelRequest
     * @return A Java Future containing the result of the DescribeTunnel operation returned by the service.
     * @sample AWSIoTSecureTunnelingAsync.DescribeTunnel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/DescribeTunnel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTunnelResult> describeTunnelAsync(DescribeTunnelRequest describeTunnelRequest);

    /**
     * <p>
     * Gets information about a tunnel identified by the unique tunnel id.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DescribeTunnel</a> action.
     * </p>
     * 
     * @param describeTunnelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTunnel operation returned by the service.
     * @sample AWSIoTSecureTunnelingAsyncHandler.DescribeTunnel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/DescribeTunnel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTunnelResult> describeTunnelAsync(DescribeTunnelRequest describeTunnelRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTunnelRequest, DescribeTunnelResult> asyncHandler);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSIoTSecureTunnelingAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSIoTSecureTunnelingAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * List all tunnels for an Amazon Web Services account. Tunnels are listed by creation time in descending order,
     * newer tunnels will be listed before older tunnels.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListTunnels</a> action.
     * </p>
     * 
     * @param listTunnelsRequest
     * @return A Java Future containing the result of the ListTunnels operation returned by the service.
     * @sample AWSIoTSecureTunnelingAsync.ListTunnels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/ListTunnels" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTunnelsResult> listTunnelsAsync(ListTunnelsRequest listTunnelsRequest);

    /**
     * <p>
     * List all tunnels for an Amazon Web Services account. Tunnels are listed by creation time in descending order,
     * newer tunnels will be listed before older tunnels.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListTunnels</a> action.
     * </p>
     * 
     * @param listTunnelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTunnels operation returned by the service.
     * @sample AWSIoTSecureTunnelingAsyncHandler.ListTunnels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/ListTunnels" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTunnelsResult> listTunnelsAsync(ListTunnelsRequest listTunnelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTunnelsRequest, ListTunnelsResult> asyncHandler);

    /**
     * <p>
     * Creates a new tunnel, and returns two client access tokens for clients to use to connect to the IoT Secure
     * Tunneling proxy server.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >OpenTunnel</a> action.
     * </p>
     * 
     * @param openTunnelRequest
     * @return A Java Future containing the result of the OpenTunnel operation returned by the service.
     * @sample AWSIoTSecureTunnelingAsync.OpenTunnel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/OpenTunnel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<OpenTunnelResult> openTunnelAsync(OpenTunnelRequest openTunnelRequest);

    /**
     * <p>
     * Creates a new tunnel, and returns two client access tokens for clients to use to connect to the IoT Secure
     * Tunneling proxy server.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >OpenTunnel</a> action.
     * </p>
     * 
     * @param openTunnelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the OpenTunnel operation returned by the service.
     * @sample AWSIoTSecureTunnelingAsyncHandler.OpenTunnel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/OpenTunnel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<OpenTunnelResult> openTunnelAsync(OpenTunnelRequest openTunnelRequest,
            com.amazonaws.handlers.AsyncHandler<OpenTunnelRequest, OpenTunnelResult> asyncHandler);

    /**
     * <p>
     * Revokes the current client access token (CAT) and returns new CAT for clients to use when reconnecting to secure
     * tunneling to access the same tunnel.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >RotateTunnelAccessToken</a> action.
     * </p>
     * <note>
     * <p>
     * Rotating the CAT doesn't extend the tunnel duration. For example, say the tunnel duration is 12 hours and the
     * tunnel has already been open for 4 hours. When you rotate the access tokens, the new tokens that are generated
     * can only be used for the remaining 8 hours.
     * </p>
     * </note>
     * 
     * @param rotateTunnelAccessTokenRequest
     * @return A Java Future containing the result of the RotateTunnelAccessToken operation returned by the service.
     * @sample AWSIoTSecureTunnelingAsync.RotateTunnelAccessToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/RotateTunnelAccessToken"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RotateTunnelAccessTokenResult> rotateTunnelAccessTokenAsync(RotateTunnelAccessTokenRequest rotateTunnelAccessTokenRequest);

    /**
     * <p>
     * Revokes the current client access token (CAT) and returns new CAT for clients to use when reconnecting to secure
     * tunneling to access the same tunnel.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >RotateTunnelAccessToken</a> action.
     * </p>
     * <note>
     * <p>
     * Rotating the CAT doesn't extend the tunnel duration. For example, say the tunnel duration is 12 hours and the
     * tunnel has already been open for 4 hours. When you rotate the access tokens, the new tokens that are generated
     * can only be used for the remaining 8 hours.
     * </p>
     * </note>
     * 
     * @param rotateTunnelAccessTokenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RotateTunnelAccessToken operation returned by the service.
     * @sample AWSIoTSecureTunnelingAsyncHandler.RotateTunnelAccessToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/RotateTunnelAccessToken"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RotateTunnelAccessTokenResult> rotateTunnelAccessTokenAsync(RotateTunnelAccessTokenRequest rotateTunnelAccessTokenRequest,
            com.amazonaws.handlers.AsyncHandler<RotateTunnelAccessTokenRequest, RotateTunnelAccessTokenResult> asyncHandler);

    /**
     * <p>
     * A resource tag.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSIoTSecureTunnelingAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * A resource tag.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSIoTSecureTunnelingAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a tag from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSIoTSecureTunnelingAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a tag from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSIoTSecureTunnelingAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

}
