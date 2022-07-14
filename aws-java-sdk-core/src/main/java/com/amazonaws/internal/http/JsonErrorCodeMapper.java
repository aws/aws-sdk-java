/*
 * Copyright 2015-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.internal.http;

import com.amazonaws.annotation.SdkInternalApi;

import java.util.Map;
import java.util.Collections;

@SdkProtectedApi
public class JsonErrorCodeMapper {
    private final Map<String, String> awsQueryCompatibleErrorMapping;

    public JsonErrorCodeMapper(Map<String, String> awsQueryCompatibleErrorMapping) {
        this.awsQueryCompatibleErrorMapping = awsQueryCompatibleErrorMapping == null ? Collections.<String, String>emptyMap() : awsQueryCompatibleErrorMapping;
    }

    public String mapErrorCode(String errorCode) {
        if (awsQueryCompatibleErrorMapping == null) return errorCode;
        return awsQueryCompatibleErrorMapping.getOrDefault(errorCode, errorCode);
    }
}