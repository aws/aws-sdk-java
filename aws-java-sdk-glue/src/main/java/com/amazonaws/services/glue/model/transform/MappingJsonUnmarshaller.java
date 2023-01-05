/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Mapping JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MappingJsonUnmarshaller implements Unmarshaller<Mapping, JsonUnmarshallerContext> {

    public Mapping unmarshall(JsonUnmarshallerContext context) throws Exception {
        Mapping mapping = new Mapping();

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
                if (context.testExpression("ToKey", targetDepth)) {
                    context.nextToken();
                    mapping.setToKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FromPath", targetDepth)) {
                    context.nextToken();
                    mapping.setFromPath(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("FromType", targetDepth)) {
                    context.nextToken();
                    mapping.setFromType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ToType", targetDepth)) {
                    context.nextToken();
                    mapping.setToType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Dropped", targetDepth)) {
                    context.nextToken();
                    mapping.setDropped(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Children", targetDepth)) {
                    context.nextToken();
                    mapping.setChildren(new ListUnmarshaller<Mapping>(MappingJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return mapping;
    }

    private static MappingJsonUnmarshaller instance;

    public static MappingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MappingJsonUnmarshaller();
        return instance;
    }
}
