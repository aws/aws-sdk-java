/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sns.message;

import com.amazonaws.SdkBaseException;
import com.amazonaws.util.IOUtils;
import java.io.IOException;
import org.apache.http.HttpResponse;

/**
 * Exception when a non-2xx HTTP response is received.
 */
public final class HttpException extends SdkBaseException {

    private final int statusCode;

    HttpException(String message, HttpResponse response) {
        super(String.format("%s: %d %s.%n%s",
                            message,
                            response.getStatusLine().getStatusCode(),
                            response.getStatusLine().getReasonPhrase(),
                            trySlurpContent(response)));
        this.statusCode = response.getStatusLine().getStatusCode();
    }

    /**
     * @return Status code of HTTP response.
     */
    public int getStatusCode() {
        return this.statusCode;
    }

    /**
     * Tries to read all the content from the HTTP response into a string. If an IO failure occurs while reading content,
     * empty string is returned instead.
     *
     * @param response Response to slurp content for.
     * @return String containing response content, empty string if failure occurs.
     */
    private static String trySlurpContent(HttpResponse response) {
        try {
            return IOUtils.toString(response.getEntity().getContent());
        } catch (IOException e) {
            return "";
        }
    }
}
