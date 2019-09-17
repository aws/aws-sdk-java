/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Portions copyright 2006-2009 James Murty. Please see LICENSE.txt
 * for applicable license terms and NOTICE.txt for applicable notices.
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

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import com.amazonaws.Request;
import com.amazonaws.SignableRequest;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.model.ResponseHeaderOverrides;
import com.amazonaws.util.StringUtils;

/**
 * Utilities useful for REST/HTTP S3Service implementations.
 */
public class RestUtils {

    /**
     * The set of request parameters which must be included in the canonical
     * string to sign.
     */
    private static final List<String> SIGNED_PARAMETERS = Arrays.asList(new String[] {
            "acl", "torrent", "logging", "location", "policy", "requestPayment", "versioning",
            "versions", "versionId", "notification", "uploadId", "uploads", "partNumber", "website",
            "delete", "lifecycle", "tagging", "cors", "restore", "replication", "accelerate",
            "inventory", "analytics", "metrics",
            ResponseHeaderOverrides.RESPONSE_HEADER_CACHE_CONTROL,
            ResponseHeaderOverrides.RESPONSE_HEADER_CONTENT_DISPOSITION,
            ResponseHeaderOverrides.RESPONSE_HEADER_CONTENT_ENCODING,
            ResponseHeaderOverrides.RESPONSE_HEADER_CONTENT_LANGUAGE,
            ResponseHeaderOverrides.RESPONSE_HEADER_CONTENT_TYPE,
            ResponseHeaderOverrides.RESPONSE_HEADER_EXPIRES,
    });

    /**
     * Calculate the canonical string for a REST/HTTP request to S3 by only
     * including query parameters that are mentioned in SIGNED_PARAMETERS.
     *
     * @see RestUtils#makeS3CanonicalString(String, String, Request, String, boolean)
     */
    public static <T> String makeS3CanonicalString(String method,
            String resource, SignableRequest<T> request, String expires) {
        return makeS3CanonicalString(method, resource, request, expires, null);
    }

    /**
     * Calculate the canonical string for a REST/HTTP request to S3.
     *
     * @param method
     *            The HTTP verb.
     * @param resource
     *            The HTTP-encoded resource path.
     * @param request
     *            The request to be canonicalized.
     * @param expires
     *            When expires is non-null, it will be used instead of the Date
     *            header.
     * @param additionalQueryParamsToSign
     *            A collection of user-specified query parameters that should be
     *            included in the canonical request, in addition to those
     *            default parameters that are always signed.
     * @return The canonical string representation for the given S3 request.
     */
    public static <T> String makeS3CanonicalString(String method,
            String resource, SignableRequest<T> request, String expires,
            Collection<String> additionalQueryParamsToSign) {

        StringBuilder buf = new StringBuilder();
        buf.append(method + "\n");

        // Add all interesting headers to a list, then sort them.  "Interesting"
        // is defined as Content-MD5, Content-Type, Date, and x-amz-
        Map<String, String> headersMap = request.getHeaders();
        SortedMap<String, String> interestingHeaders = new TreeMap<String, String>();
        if (headersMap != null && headersMap.size() > 0) {
            Iterator<Map.Entry<String, String>> headerIter = headersMap.entrySet().iterator();
            while (headerIter.hasNext()) {
                Map.Entry<String, String> entry = (Map.Entry<String, String>) headerIter.next();
                String key = entry.getKey();
                String value = entry.getValue();

                if (key == null) continue;
                String lk = StringUtils.lowerCase(key);

                // Ignore any headers that are not particularly interesting.
                if (lk.equals("content-type") || lk.equals("content-md5") || lk.equals("date") ||
                    lk.startsWith(Headers.AMAZON_PREFIX))
                {
                    interestingHeaders.put(lk, value);
                }
            }
        }

        // Remove default date timestamp if "x-amz-date" is set.
        if (interestingHeaders.containsKey(Headers.S3_ALTERNATE_DATE)) {
            interestingHeaders.put("date", "");
        }

        // Use the expires value as the timestamp if it is available. This trumps both the default
        // "date" timestamp, and the "x-amz-date" header.
        if (expires != null) {
            interestingHeaders.put("date", expires);
        }

        // These headers require that we still put a new line in after them,
        // even if they don't exist.
        if (! interestingHeaders.containsKey("content-type")) {
            interestingHeaders.put("content-type", "");
        }
        if (! interestingHeaders.containsKey("content-md5")) {
            interestingHeaders.put("content-md5", "");
        }

        // Any parameters that are prefixed with "x-amz-" need to be included
        // in the headers section of the canonical string to sign
        final Map<String, List<String>> requestParameters = request
                .getParameters();
        for (Map.Entry<String, List<String>> parameter : requestParameters
                .entrySet()) {
            if (parameter.getKey().startsWith("x-amz-")) {
                StringBuilder parameterValueBuilder = new StringBuilder();
                /**
                 *
                 * We don't need to url encode here. If a parameter has multiple
                 * values, then those values needs to be combined to a comma
                 * separated list and assigned to the header.
                 *
                 * Reference : http://docs.aws.amazon.com/AmazonS3/latest/dev/
                 * RESTAuthentication
                 * .html#RESTAuthenticationRequestCanonicalization
                 */
                for (String value : parameter.getValue()) {
                    if (parameterValueBuilder.length() > 0) {
                        parameterValueBuilder.append(",");
                    }
                    parameterValueBuilder.append(value);
                }
                interestingHeaders.put(parameter.getKey(),
                        parameterValueBuilder.toString());
            }
        }

        // Add all the interesting headers (i.e.: all that startwith x-amz- ;-))
        for (Iterator<Map.Entry<String, String>> i = interestingHeaders.entrySet().iterator(); i.hasNext(); ) {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) i.next();
            String key = (String) entry.getKey();
            String value = entry.getValue();

            if (key.startsWith(Headers.AMAZON_PREFIX)) {
                buf.append(key).append(':');
                if (value != null) {
                    buf.append(value);
                }
            } else if (value != null) {
                buf.append(value);
            }
            buf.append("\n");
        }

        // Add all the interesting parameters
        buf.append(resource);
        String[] parameterNames = requestParameters.keySet().toArray(
                                new String[request.getParameters().size()]);
        Arrays.sort(parameterNames);

        StringBuilder queryParams = new StringBuilder();
        for (String parameterName : parameterNames) {
            if ( !SIGNED_PARAMETERS.contains(parameterName)
                 &&
                 (additionalQueryParamsToSign == null ||
                 !additionalQueryParamsToSign.contains(parameterName))
               ) {
                continue;
            }

            /**
             * As per the spec given in the below URL, it is not clear as to
             * whether we need to sort the parameter values when forming the
             * string to sign. This is something that needs to be watched if we
             * receive signing problems.
             *
             * Reference : http://docs.aws.amazon.com/AmazonS3/latest/dev/
             * RESTAuthentication
             * .html#RESTAuthenticationRequestCanonicalization
             */
            List<String> values = requestParameters.get(parameterName);
            for (String value : values) {
                queryParams = queryParams.length() > 0 ? queryParams
                        .append("&") : queryParams.append("?");

                queryParams.append(parameterName);
                if (value != null) {
                    queryParams.append("=").append(value);
                }
            }
        }
        buf.append(queryParams.toString());

        return buf.toString();
    }

}
