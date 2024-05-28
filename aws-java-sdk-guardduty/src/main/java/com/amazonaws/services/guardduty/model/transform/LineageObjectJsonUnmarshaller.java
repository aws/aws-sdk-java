/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.guardduty.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * LineageObject JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LineageObjectJsonUnmarshaller implements Unmarshaller<LineageObject, JsonUnmarshallerContext> {

    public LineageObject unmarshall(JsonUnmarshallerContext context) throws Exception {
        LineageObject lineageObject = new LineageObject();

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
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    lineageObject.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("namespacePid", targetDepth)) {
                    context.nextToken();
                    lineageObject.setNamespacePid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("userId", targetDepth)) {
                    context.nextToken();
                    lineageObject.setUserId(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    lineageObject.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pid", targetDepth)) {
                    context.nextToken();
                    lineageObject.setPid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("uuid", targetDepth)) {
                    context.nextToken();
                    lineageObject.setUuid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("executablePath", targetDepth)) {
                    context.nextToken();
                    lineageObject.setExecutablePath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("euid", targetDepth)) {
                    context.nextToken();
                    lineageObject.setEuid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("parentUuid", targetDepth)) {
                    context.nextToken();
                    lineageObject.setParentUuid(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return lineageObject;
    }

    private static LineageObjectJsonUnmarshaller instance;

    public static LineageObjectJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LineageObjectJsonUnmarshaller();
        return instance;
    }
}
