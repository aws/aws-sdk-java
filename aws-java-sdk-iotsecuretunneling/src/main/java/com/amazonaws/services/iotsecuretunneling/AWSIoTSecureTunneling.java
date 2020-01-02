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
package com.amazonaws.services.iotsecuretunneling;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.iotsecuretunneling.model.*;

/**
 * Interface for accessing AWS IoT Secure Tunneling.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iotsecuretunneling.AbstractAWSIoTSecureTunneling} instead.
 * </p>
 * <p>
 * <fullname>AWS IoT Secure Tunneling</fullname>
 * <p>
 * AWS IoT Secure Tunnling enables you to create remote connections to devices deployed in the field.
 * </p>
 * <p>
 * For more information about how AWS IoT Secure Tunneling works, see the <a
 * href="https://docs.aws.amazon.com/secure-tunneling/latest/ug/what-is-secure-tunneling.html">User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIoTSecureTunneling {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "api.tunneling.iot";

    /**
     * <p>
     * Closes a tunnel identified by the unique tunnel id. When a <code>CloseTunnel</code> request is received, we close
     * the WebSocket connections between the client and proxy server so no data can be transmitted.
     * </p>
     * 
     * @param closeTunnelRequest
     * @return Result of the CloseTunnel operation returned by the service.
     * @throws ResourceNotFoundException
     *         Thrown when an operation is attempted on a resource that does not exist.
     * @sample AWSIoTSecureTunneling.CloseTunnel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/CloseTunnel" target="_top">AWS
     *      API Documentation</a>
     */
    CloseTunnelResult closeTunnel(CloseTunnelRequest closeTunnelRequest);

    /**
     * <p>
     * Gets information about a tunnel identified by the unique tunnel id.
     * </p>
     * 
     * @param describeTunnelRequest
     * @return Result of the DescribeTunnel operation returned by the service.
     * @throws ResourceNotFoundException
     *         Thrown when an operation is attempted on a resource that does not exist.
     * @sample AWSIoTSecureTunneling.DescribeTunnel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/DescribeTunnel"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeTunnelResult describeTunnel(DescribeTunnelRequest describeTunnelRequest);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Thrown when an operation is attempted on a resource that does not exist.
     * @sample AWSIoTSecureTunneling.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * List all tunnels for an AWS account. Tunnels are listed by creation time in descending order, newer tunnels will
     * be listed before older tunnels.
     * </p>
     * 
     * @param listTunnelsRequest
     * @return Result of the ListTunnels operation returned by the service.
     * @sample AWSIoTSecureTunneling.ListTunnels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/ListTunnels" target="_top">AWS
     *      API Documentation</a>
     */
    ListTunnelsResult listTunnels(ListTunnelsRequest listTunnelsRequest);

    /**
     * <p>
     * Creates a new tunnel, and returns two client access tokens for clients to use to connect to the AWS IoT Secure
     * Tunneling proxy server. .
     * </p>
     * 
     * @param openTunnelRequest
     * @return Result of the OpenTunnel operation returned by the service.
     * @throws LimitExceededException
     *         Thrown when a tunnel limit is exceeded.
     * @sample AWSIoTSecureTunneling.OpenTunnel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/OpenTunnel" target="_top">AWS
     *      API Documentation</a>
     */
    OpenTunnelResult openTunnel(OpenTunnelRequest openTunnelRequest);

    /**
     * <p>
     * A resource tag.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Thrown when an operation is attempted on a resource that does not exist.
     * @sample AWSIoTSecureTunneling.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a tag from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Thrown when an operation is attempted on a resource that does not exist.
     * @sample AWSIoTSecureTunneling.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
