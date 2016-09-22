/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.apigateway.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetResourceResult JSON Unmarshaller
 */
public class GetResourceResultJsonUnmarshaller implements Unmarshaller<GetResourceResult, JsonUnmarshallerContext> {

    public GetResourceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetResourceResult getResourceResult = new GetResourceResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    getResourceResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parentId", targetDepth)) {
                    context.nextToken();
                    getResourceResult.setParentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pathPart", targetDepth)) {
                    context.nextToken();
                    getResourceResult.setPathPart(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("path", targetDepth)) {
                    context.nextToken();
                    getResourceResult.setPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceMethods", targetDepth)) {
                    context.nextToken();
                    getResourceResult.setResourceMethods(new MapUnmarshaller<String, Method>(context.getUnmarshaller(String.class), MethodJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getResourceResult;
    }

    private static GetResourceResultJsonUnmarshaller instance;

    public static GetResourceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetResourceResultJsonUnmarshaller();
        return instance;
    }
}
