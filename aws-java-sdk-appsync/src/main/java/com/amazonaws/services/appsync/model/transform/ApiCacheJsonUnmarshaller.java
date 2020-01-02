/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appsync.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appsync.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ApiCache JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApiCacheJsonUnmarshaller implements Unmarshaller<ApiCache, JsonUnmarshallerContext> {

    public ApiCache unmarshall(JsonUnmarshallerContext context) throws Exception {
        ApiCache apiCache = new ApiCache();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ttl", targetDepth)) {
                    context.nextToken();
                    apiCache.setTtl(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("apiCachingBehavior", targetDepth)) {
                    context.nextToken();
                    apiCache.setApiCachingBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("transitEncryptionEnabled", targetDepth)) {
                    context.nextToken();
                    apiCache.setTransitEncryptionEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("atRestEncryptionEnabled", targetDepth)) {
                    context.nextToken();
                    apiCache.setAtRestEncryptionEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    apiCache.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    apiCache.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return apiCache;
    }

    private static ApiCacheJsonUnmarshaller instance;

    public static ApiCacheJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ApiCacheJsonUnmarshaller();
        return instance;
    }
}
