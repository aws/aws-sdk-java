/*
 * Copyright 2011-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;

import com.amazonaws.annotation.SdkInternalApi;

@SdkInternalApi
public class ConnectionUtils {

    private static ConnectionUtils instance;

    private ConnectionUtils() {

    }

    public static ConnectionUtils getInstance() {
        if (instance == null) {
            instance = new ConnectionUtils();
        }
        return instance;
    }

    public HttpURLConnection connectToEndpoint(URI endpoint) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) endpoint.toURL().openConnection();
        connection.setConnectTimeout(1000 * 2);
        connection.setReadTimeout(1000 * 5);
        connection.setRequestMethod("GET");
        connection.setDoOutput(true);
        // TODO should we autoredirect 3xx
        // connection.setInstanceFollowRedirects(false);
        connection.connect();

        return connection;
    }

}
