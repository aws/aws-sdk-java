/*
 * Copyright 2012-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.net.URI;

public class AwsHostNameUtils {
    public static String parseRegionName(URI endpoint) {
        String host = endpoint.getHost();

        // If we don't recognize the domain, just return the default
        if (!host.endsWith(".amazonaws.com")) return "us-east-1";

        String serviceAndRegion = host.substring(0, host.indexOf(".amazonaws.com"));


        // S3 is different from other services, which supports virtual host and
        // use '-' as separator, the host may look like
        // 'bucketName.s3-us-west-2.amazonaws.com'
        if (serviceAndRegion.contains("s3-")) {
            return serviceAndRegion.substring(serviceAndRegion.lastIndexOf("s3-") + 3);
        }

        char separator = '.';

        if (serviceAndRegion.indexOf(separator) == -1) return "us-east-1";

        String region = serviceAndRegion.substring(serviceAndRegion.indexOf(separator) + 1);
        if ("us-gov".equals(region)) {
            return "us-gov-west-1";
        }

        return region;
    }

    public static String parseServiceName(URI endpoint) {
        String host = endpoint.getHost();

        // If we don't recognize the domain, throw an exception.
        if (!host.endsWith(".amazonaws.com")) {
            throw new IllegalArgumentException(
                    "Cannot parse the service name by an unrecognized endpoint("
                            + host
                            + "). Please specify the service name by setEndpoint(String endpoint, String serviceName, String regionId).");
        }

        String serviceAndRegion = host.substring(0, host.indexOf(".amazonaws.com"));

        // S3 is different from other services, which supports virtual host and
        // use '-' as separator, the host may look like
        // 'bucketName.s3-us-west-2.amazonaws.com'
        if (serviceAndRegion.contains("s3-")) {
            return "s3";
        }

        char separator = '.';

        // If we don't detect a separator between service name and region, then
        // assume that the region is not included in the hostname, and it's only
        // the service name (ex: "http://iam.amazonaws.com").
        if (serviceAndRegion.indexOf(separator) == -1) return serviceAndRegion;

        String service = serviceAndRegion.substring(0, serviceAndRegion.indexOf(separator));
        return service;
    }
}