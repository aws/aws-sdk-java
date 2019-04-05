/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.internal;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.internal.ServiceEndpointBuilder;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.util.SdkHttpUtils;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Sets endpoint and resource path on a request object
 */
public class S3RequestEndpointResolver {

    private final ServiceEndpointBuilder endpointBuilder;
    private final boolean isPathStyleAccess;
    private final String bucketName;
    private final String key;

    public S3RequestEndpointResolver(ServiceEndpointBuilder endpointBuilder, boolean isPathStyleAccess,
                                     String bucketName, String key) {
        this.endpointBuilder = endpointBuilder;
        this.isPathStyleAccess = isPathStyleAccess;
        this.bucketName = bucketName;
        this.key = key;
    }

    static boolean isValidIpV4Address(String ipAddr) {
        if (ipAddr == null) {
            return false;
        }
        String[] tokens = ipAddr.split("\\.");
        if (tokens.length != 4) {
            return false;
        }
        for (String token : tokens) {
            try {
                int tokenInt = Integer.parseInt(token);
                if (tokenInt < 0 || tokenInt > 255) {
                    return false;
                }
            } catch (NumberFormatException ase) {
                return false;
            }
        }
        return true;
    }

    /**
     * Converts the current endpoint set for this client into virtual addressing style, by placing
     * the name of the specified bucket before the S3 service endpoint.
     *
     * @param bucketName The name of the bucket to use in the virtual addressing style of the returned URI.
     * @return A new URI, creating from the current service endpoint URI and the specified bucket.
     */
    private static URI convertToVirtualHostEndpoint(URI endpoint, String bucketName) {
        try {
            return new URI(String.format("%s://%s.%s", endpoint.getScheme(), bucketName, endpoint.getAuthority()));
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Invalid bucket name: " + bucketName, e);
        }
    }

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * Set the request's endpoint and resource path with the same region it was originally
     * configured for
     *
     * @param request Request to set endpoint for
     */
    public void resolveRequestEndpoint(Request<?> request) {
        resolveRequestEndpoint(request, null);
    }

    /**
     * Set the request's endpoint and resource path with the new region provided
     *
     * @param request Request to set endpoint for
     * @param regionString  New region to determine endpoint to hit
     */
    public void resolveRequestEndpoint(Request<?> request, String regionString) {
        if (regionString != null) {
            final Region r = RegionUtils.getRegion(regionString);

            if (r == null) {
                throw new SdkClientException("Not able to determine region" +
                        " for " + regionString + ".Please upgrade to a newer " +
                        "version of the SDK");
            }

            endpointBuilder.withRegion(r);
        }
        final URI endpoint = endpointBuilder.getServiceEndpoint();
        if (shouldUseVirtualAddressing(endpoint)) {
            request.setEndpoint(convertToVirtualHostEndpoint(endpoint, bucketName));
            request.setResourcePath(SdkHttpUtils.urlEncode(getHostStyleResourcePath(), true));
        } else {
            request.setEndpoint(endpoint);
            if (bucketName != null) {
                request.setResourcePath(SdkHttpUtils.urlEncode(getPathStyleResourcePath(), true));
            }
        }
    }

    private boolean shouldUseVirtualAddressing(final URI endpoint) {
        return !isPathStyleAccess && BucketNameUtils.isDNSBucketName(bucketName)
                && !isValidIpV4Address(endpoint.getHost());
    }

    private String getHostStyleResourcePath() {
        String resourcePath = key;
        /*
         * If the key name starts with a slash character, in order to prevent it being treated as a
         * path delimiter, we need to add another slash before the key name. {@see
         * com.amazonaws.http.HttpRequestFactory#createHttpRequest}
         */
        if (key != null && key.startsWith("/")) {
            resourcePath = "/" + key;
        }
        return resourcePath;
    }

    private String getPathStyleResourcePath() {
        return bucketName + "/" + (key != null ? key : "");
    }
}
