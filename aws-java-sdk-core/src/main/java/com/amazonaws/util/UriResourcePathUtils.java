/*
 * Copyright 2015-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.Request;

public final class UriResourcePathUtils {

    /**
     * Identifies the static query parameters in Uri resource path for and adds it to
     * request.
     *
     * Returns the updated uriResourcePath.
     */
    public static String addStaticQueryParamtersToRequest(final Request<?> request,
                                                        final String uriResourcePath) {

        if (request == null || uriResourcePath == null) {
            return null;
        }

        String resourcePath = uriResourcePath;

        int index = resourcePath.indexOf("?");
        if (index != -1) {
            String queryString = resourcePath.substring(index + 1);
            resourcePath = resourcePath.substring(0, index);

            for (String s : queryString.split("[;&]")) {
                index = s.indexOf("=");
                if (index != -1) {
                    request.addParameter(s.substring(0, index), s.substring(index + 1));
                } else {
                    request.addParameter(s, (String)null);
                }
            }
        }
        return resourcePath;
    }
}
