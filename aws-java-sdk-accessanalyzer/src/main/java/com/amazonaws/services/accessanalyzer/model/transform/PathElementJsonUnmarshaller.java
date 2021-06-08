/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.accessanalyzer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.accessanalyzer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PathElement JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PathElementJsonUnmarshaller implements Unmarshaller<PathElement, JsonUnmarshallerContext> {

    public PathElement unmarshall(JsonUnmarshallerContext context) throws Exception {
        PathElement pathElement = new PathElement();

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
                if (context.testExpression("index", targetDepth)) {
                    context.nextToken();
                    pathElement.setIndex(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("key", targetDepth)) {
                    context.nextToken();
                    pathElement.setKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("substring", targetDepth)) {
                    context.nextToken();
                    pathElement.setSubstring(SubstringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("value", targetDepth)) {
                    context.nextToken();
                    pathElement.setValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return pathElement;
    }

    private static PathElementJsonUnmarshaller instance;

    public static PathElementJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PathElementJsonUnmarshaller();
        return instance;
    }
}
