/*
 * Copyright 2020-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.util.endpoint.RegionFromEndpointResolver;

/**
 * An implementation of {@link RegionFromEndpointResolver} that is supported by region metadata files.
 * 
 * @see EndpointToRegion#guessRegionNameForEndpoint(String, String)
 */
public class MetadataSupportedRegionFromEndpointProvider implements RegionFromEndpointResolver {
    @Override
    public String guessRegionFromEndpoint(String host, String serviceHint) {
        return EndpointToRegion.guessRegionNameForEndpoint(host, serviceHint);
    }
}
