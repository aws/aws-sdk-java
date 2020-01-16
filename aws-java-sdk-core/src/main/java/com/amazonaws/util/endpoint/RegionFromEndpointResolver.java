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
package com.amazonaws.util.endpoint;

/**
 * A resolver that attempts to guess the region based on a service's host name.
 */
public interface RegionFromEndpointResolver {
    /**
     * Guess the region of a service, based on its endpoint/hostname.
     *
     * @param host The hostname or endpoint of a service.
     * @param serviceHint The endpoint prefix of the service, or null if it's not known.
     * @return The best-guess of a region based on the endpoint, or null if there's no good guess.
     */
    String guessRegionFromEndpoint(String host, String serviceHint);
}
