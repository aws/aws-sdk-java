/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.http.request;

import com.amazonaws.Request;
import com.amazonaws.annotation.Beta;
import com.amazonaws.http.settings.HttpClientSettings;

import java.io.IOException;

/**
 * An interface that can be used to create the http requests that is
 * understood by the http client.
 *
 * @param <T> Request class that is accepted by the underlying http client.
 */
@Beta
public interface HttpRequestFactory<T> {

    /**
     * A factory method for creating http requests accepted by the underlying
     * http client from the sdk request objects.
     *
     * @param request sdk request object.
     * @param settings configuration to be set for the http request.
     * @return an instance of request that is accepted by the underlying
     * http client that SDK uses.
     */
    T create(Request<?> request, HttpClientSettings settings) throws IOException;
}
