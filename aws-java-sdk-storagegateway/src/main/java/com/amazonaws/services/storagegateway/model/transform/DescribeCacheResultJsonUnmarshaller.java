/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeCacheResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCacheResultJsonUnmarshaller implements Unmarshaller<DescribeCacheResult, JsonUnmarshallerContext> {

    public DescribeCacheResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeCacheResult describeCacheResult = new DescribeCacheResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeCacheResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("GatewayARN", targetDepth)) {
                    context.nextToken();
                    describeCacheResult.setGatewayARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DiskIds", targetDepth)) {
                    context.nextToken();
                    describeCacheResult.setDiskIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("CacheAllocatedInBytes", targetDepth)) {
                    context.nextToken();
                    describeCacheResult.setCacheAllocatedInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("CacheUsedPercentage", targetDepth)) {
                    context.nextToken();
                    describeCacheResult.setCacheUsedPercentage(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("CacheDirtyPercentage", targetDepth)) {
                    context.nextToken();
                    describeCacheResult.setCacheDirtyPercentage(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("CacheHitPercentage", targetDepth)) {
                    context.nextToken();
                    describeCacheResult.setCacheHitPercentage(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("CacheMissPercentage", targetDepth)) {
                    context.nextToken();
                    describeCacheResult.setCacheMissPercentage(context.getUnmarshaller(Double.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeCacheResult;
    }

    private static DescribeCacheResultJsonUnmarshaller instance;

    public static DescribeCacheResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeCacheResultJsonUnmarshaller();
        return instance;
    }
}
