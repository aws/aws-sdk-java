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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateDynamicThingGroupResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDynamicThingGroupResultJsonUnmarshaller implements Unmarshaller<CreateDynamicThingGroupResult, JsonUnmarshallerContext> {

    public CreateDynamicThingGroupResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateDynamicThingGroupResult createDynamicThingGroupResult = new CreateDynamicThingGroupResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createDynamicThingGroupResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("thingGroupName", targetDepth)) {
                    context.nextToken();
                    createDynamicThingGroupResult.setThingGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("thingGroupArn", targetDepth)) {
                    context.nextToken();
                    createDynamicThingGroupResult.setThingGroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("thingGroupId", targetDepth)) {
                    context.nextToken();
                    createDynamicThingGroupResult.setThingGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("indexName", targetDepth)) {
                    context.nextToken();
                    createDynamicThingGroupResult.setIndexName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("queryString", targetDepth)) {
                    context.nextToken();
                    createDynamicThingGroupResult.setQueryString(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("queryVersion", targetDepth)) {
                    context.nextToken();
                    createDynamicThingGroupResult.setQueryVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createDynamicThingGroupResult;
    }

    private static CreateDynamicThingGroupResultJsonUnmarshaller instance;

    public static CreateDynamicThingGroupResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateDynamicThingGroupResultJsonUnmarshaller();
        return instance;
    }
}
