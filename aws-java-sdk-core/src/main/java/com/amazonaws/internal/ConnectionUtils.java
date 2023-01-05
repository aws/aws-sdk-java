/*
 * Copyright 2011-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.internal;

import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.SdkTestInternalApi;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.ValidationUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URI;
import java.util.Map;

@SdkInternalApi
public class ConnectionUtils {
    private static final int DEFAULT_TIMEOUT_MILLIS = 1000;
    private final int timeoutMillis;

    @SdkTestInternalApi
    ConnectionUtils() {
        this.timeoutMillis = ValidationUtils.assertIsPositive(readTimeoutMillisConfiguration(),
                                                              SDKGlobalConfiguration.AWS_METADATA_SERVICE_TIMEOUT_ENV_VAR);
    }

    public static ConnectionUtils getInstance() {
        return ConnectionUtilsSingletonHolder.INSTANCE;
    }

    private static int readTimeoutMillisConfiguration() {
        String stringTimeout = System.getenv(SDKGlobalConfiguration.AWS_METADATA_SERVICE_TIMEOUT_ENV_VAR);

        if (StringUtils.isNullOrEmpty(stringTimeout)) {
            return DEFAULT_TIMEOUT_MILLIS;
        }

        // To match the CLI behavior, we need to support both integers and doubles. We try int first so that we can get exact
        // values, and fall back to double if it doesn't seem to be an int.
        try {
            int timeoutSeconds = Integer.parseInt(stringTimeout);
            return timeoutSeconds * 1000;
        } catch (NumberFormatException e) {
            try {
                double timeoutSeconds = Double.parseDouble(stringTimeout);
                return toIntExact(Math.round(timeoutSeconds * 1000));
            } catch (NumberFormatException ignored) {
                throw new IllegalStateException(SDKGlobalConfiguration.AWS_METADATA_SERVICE_TIMEOUT_ENV_VAR + " environment "
                                                + "variable value does not appear to be an integer or a double: " +
                                                stringTimeout);
            }
        }
    }

    private static int toIntExact(long value) {
        if ((int) value != value) {
            throw new ArithmeticException("integer overflow");
        }
        return (int) value;
    }

    public int getTimeoutMillis() {
        return timeoutMillis;
    }

    public HttpURLConnection connectToEndpoint(URI endpoint, Map<String, String> headers) throws IOException {
        return connectToEndpoint(endpoint, headers, "GET");
    }

    public HttpURLConnection connectToEndpoint(URI endpoint, Map<String, String> headers, String method) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) endpoint.toURL().openConnection(Proxy.NO_PROXY);
        connection.setConnectTimeout(timeoutMillis);
        connection.setReadTimeout(timeoutMillis);
        connection.setRequestMethod(method);
        connection.setDoOutput(true);

        for (Map.Entry<String, String> header : headers.entrySet()) {
            connection.addRequestProperty(header.getKey(), header.getValue());
        }

        // TODO should we autoredirect 3xx
        // connection.setInstanceFollowRedirects(false);
        connection.connect();

        return connection;
    }

    private static final class ConnectionUtilsSingletonHolder {
        private static final ConnectionUtils INSTANCE = new ConnectionUtils();
    }
}
