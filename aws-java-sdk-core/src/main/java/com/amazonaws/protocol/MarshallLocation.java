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
package com.amazonaws.protocol;

import com.amazonaws.annotation.SdkProtectedApi;

/**
 * Enum representing the various locations data can be marshalled to.
 */
@SdkProtectedApi
public enum MarshallLocation {

    /**
     * Payload of the request (format depends on the protocol/content-type)
     */
    PAYLOAD,

    /**
     * Add as a query parameter.
     */
    QUERY_PARAM,

    /**
     * HTTP header.
     */
    HEADER,

    /**
     * Replace the placeholder in the request URI (non-greedy).
     */
    PATH,

    /**
     * Replace the placeholder in the request URI (greedy). This location is really the same as {@link #PATH},
     * the only difference is whether it's URL encoded or not. Members bound to the {@link #PATH} will be URL
     * encoded before replacing, members bound to {@link #GREEDY_PATH} will not be URL encoded.
     */
    GREEDY_PATH
}
