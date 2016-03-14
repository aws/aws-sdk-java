/*
 * Copyright 2016-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.regions;


import com.amazonaws.annotation.SdkInternalApi;

import java.util.Collection;

/**
 * Interface for an region implementation.
 */
@SdkInternalApi
public interface RegionImpl {

    /**
     * The unique system ID for this region; ex: &quot;us-east-1&quot;.
     *
     * @return The unique system ID for this region.
     */
    String getName();

    /**
     * Returns the domain for this region; ex: &quot;amazonaws.com&quot;.
     *
     * @return The domain for this region.
     */
    String getDomain();

    /**
     * Returns the partition this region is in. I.E. 'aws' or 'aws-cn'
     *
     * @return The partition this region is in.
     */
    String getPartition();

    /**
     * Returns whether the given service is supported in this region.
     *
     * @see ServiceAbbreviations
     */
    boolean isServiceSupported(String serviceName);

    /**
     * Returns the endpoint for the service given.
     *
     * @see ServiceAbbreviations
     */
    String getServiceEndpoint(String serviceName);

    /**
     * Returns whether the given service support the https protocol in this region.
     *
     * @see ServiceAbbreviations
     */
    boolean hasHttpEndpoint(String serviceName);

    /**
     * Returns whether the given service support the http protocol in this region.
     *
     * @see ServiceAbbreviations
     */
    boolean hasHttpsEndpoint(String serviceName);

    /**
     * Returns an immutable collection of all the endpoints available in the
     * region
     * metadata.
     */
    Collection<String> getAvailableEndpoints();
}
