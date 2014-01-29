/*
 * Copyright 2012-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.util;

import java.net.InetAddress;
import java.net.URI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.logging.LogFactory;

public class AwsHostNameUtils {

    private static final Pattern S3_ENDPOINT_PATTERN =
        Pattern.compile("^(?:.+\\.)?s3[.-]([a-z0-9-]+)$");

    /**
     * @deprecated in favor of {@link #parseRegionName(String, String)}.
     */
    @Deprecated
    public static String parseRegionName(URI endpoint) {
        return parseRegionName(endpoint.getHost(), null);
    }

    /**
     * Attempts to parse the region name from an endpoint based on conventions
     * about the endpoint format.
     *
     * @param host         the hostname to parse
     * @param serviceHint  an optional hint about the service for the endpoint
     * @return             the region parsed from the hostname, or
     *                     &quot;us-east-1&quot; if no region information
     *                     could be found
     */
    public static String parseRegionName(final String host,
                                         final String serviceHint) {

        if (host.endsWith(".amazonaws.com")) {
            int index = host.length() - ".amazonaws.com".length();
            return parseStandardRegionName(host.substring(0, index));
        }

        if (serviceHint != null) {
            // If we have a service hint, look for 'service.[region]' or
            // 'service-[region]' in the endpoint's hostname.
            Pattern pattern = Pattern.compile(
                "^(?:.+\\.)?"
                + Pattern.quote(serviceHint)
                + "[.-]([a-z0-9-]+)\\."
            );

            Matcher matcher = pattern.matcher(host);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }

        // Endpoint is totally non-standard; guess us-east-1 for lack of a
        // better option.

        return "us-east-1";
    }

    /**
     * Parses the region name from a standard (*.amazonaws.com) endpoint.
     *
     * @param fragment  the portion of the endpoint excluding
     *                  &quot;.amazonaws.com&quot;
     * @return          the parsed region name (or &quot;us-east-1&quot; as a
     *                  best guess if we can't tell for sure)
     */
    private static String parseStandardRegionName(final String fragment) {

        if (fragment.endsWith(".s3")
                || fragment.endsWith(".s3-external-1")) {
            // host was 'bucket.s3.amazonaws.com' or 'bucket.s3-external-1.amazonaws.com',
            // which is us-east-1.
            return "us-east-1";
        }

        Matcher matcher = S3_ENDPOINT_PATTERN.matcher(fragment);
        if (matcher.matches()) {
            // host was 'bucket.s3-[region].amazonaws.com'.
            return matcher.group(1);
        }

        int index = fragment.lastIndexOf('.');
        if (index == -1) {
            // host was 'service.amazonaws.com', guess us-east-1
            // for lack of a better option.
            return "us-east-1";
        }

        // host was 'service.[region].amazonaws.com'.
        String region = fragment.substring(index + 1);

        // Special case for iam.us-gov.amazonaws.com, which is actually
        // us-gov-west-1.
        if ("us-gov".equals(region)) {
            region = "us-gov-west-1";
        }

        return region;
    }

    /**
     * Parses the service name from an endpoint. Can only handle endpoints of
     * the form 'service.[region.]amazonaws.com'.
     *
     * @deprecated because it's no longer needed by the SDK, and therefore not
     *             maintained.
     */
    @Deprecated
    public static String parseServiceName(URI endpoint) {
        String host = endpoint.getHost();

        // If we don't recognize the domain, throw an exception.
        if (!host.endsWith(".amazonaws.com")) {
            throw new IllegalArgumentException(
                "Cannot parse a service name from an unrecognized endpoint ("
                + host
                + ").");
        }

        String serviceAndRegion =
            host.substring(0, host.indexOf(".amazonaws.com"));

        // Special cases for S3 endpoints with bucket names embedded.
        if (serviceAndRegion.endsWith(".s3")
            || S3_ENDPOINT_PATTERN.matcher(serviceAndRegion).matches()) {
            return "s3";
        }

        char separator = '.';

        // If we don't detect a separator between service name and region, then
        // assume that the region is not included in the hostname, and it's only
        // the service name (ex: "http://iam.amazonaws.com").
        if (serviceAndRegion.indexOf(separator) == -1) {
            return serviceAndRegion;
        }

        String service =
            serviceAndRegion.substring(0, serviceAndRegion.indexOf(separator));

        return service;
    }

    /**
     * Returns the host name for the local host. If the operation is not allowed
     * by the security check, the textual representation of the IP address of
     * the local host is returned instead. If the ip address of the local host
     * cannot be resolved or if there is any other failure, "localhost" is
     * returned as a fallback.
     */
    public static String localHostName() {
        try {
            InetAddress localhost = InetAddress.getLocalHost();
            return localhost.getHostName();
        } catch (Exception e) {
            LogFactory
                .getLog(AwsHostNameUtils.class)
                .debug("Failed to determine the local hostname; fall back to "
                       + "use \"localhost\".", e);
            return "localhost";
        }
    }
}