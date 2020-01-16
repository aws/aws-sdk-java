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
package com.amazonaws.auth;

import com.amazonaws.util.endpoint.RegionFromEndpointResolver;

/**
 * A signer that is aware of a {@link RegionFromEndpointResolver} that it can use for converting an endpoint
 * into a signing region. This is usually done when the specific region of a signing request isn't known, but
 * the endpoint is.
 */
public interface RegionFromEndpointResolverAwareSigner extends Signer {
    /**
     * Set the {@link RegionFromEndpointResolver} to use when converting an endpoint into a region.
     */
    void setRegionFromEndpointResolver(RegionFromEndpointResolver resolver);
}
