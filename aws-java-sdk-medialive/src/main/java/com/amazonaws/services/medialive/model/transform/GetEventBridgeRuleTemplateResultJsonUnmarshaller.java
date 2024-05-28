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
package com.amazonaws.services.medialive.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetEventBridgeRuleTemplateResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEventBridgeRuleTemplateResultJsonUnmarshaller implements Unmarshaller<GetEventBridgeRuleTemplateResult, JsonUnmarshallerContext> {

    public GetEventBridgeRuleTemplateResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetEventBridgeRuleTemplateResult getEventBridgeRuleTemplateResult = new GetEventBridgeRuleTemplateResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getEventBridgeRuleTemplateResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    getEventBridgeRuleTemplateResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    getEventBridgeRuleTemplateResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getEventBridgeRuleTemplateResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventTargets", targetDepth)) {
                    context.nextToken();
                    getEventBridgeRuleTemplateResult.setEventTargets(new ListUnmarshaller<EventBridgeRuleTemplateTarget>(
                            EventBridgeRuleTemplateTargetJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("eventType", targetDepth)) {
                    context.nextToken();
                    getEventBridgeRuleTemplateResult.setEventType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("groupId", targetDepth)) {
                    context.nextToken();
                    getEventBridgeRuleTemplateResult.setGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    getEventBridgeRuleTemplateResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("modifiedAt", targetDepth)) {
                    context.nextToken();
                    getEventBridgeRuleTemplateResult.setModifiedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getEventBridgeRuleTemplateResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    getEventBridgeRuleTemplateResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getEventBridgeRuleTemplateResult;
    }

    private static GetEventBridgeRuleTemplateResultJsonUnmarshaller instance;

    public static GetEventBridgeRuleTemplateResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetEventBridgeRuleTemplateResultJsonUnmarshaller();
        return instance;
    }
}
