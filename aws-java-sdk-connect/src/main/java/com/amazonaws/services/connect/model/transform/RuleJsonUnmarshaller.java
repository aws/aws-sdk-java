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
package com.amazonaws.services.connect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Rule JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleJsonUnmarshaller implements Unmarshaller<Rule, JsonUnmarshallerContext> {

    public Rule unmarshall(JsonUnmarshallerContext context) throws Exception {
        Rule rule = new Rule();

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
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    rule.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RuleId", targetDepth)) {
                    context.nextToken();
                    rule.setRuleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RuleArn", targetDepth)) {
                    context.nextToken();
                    rule.setRuleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TriggerEventSource", targetDepth)) {
                    context.nextToken();
                    rule.setTriggerEventSource(RuleTriggerEventSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Function", targetDepth)) {
                    context.nextToken();
                    rule.setFunction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Actions", targetDepth)) {
                    context.nextToken();
                    rule.setActions(new ListUnmarshaller<RuleAction>(RuleActionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("PublishStatus", targetDepth)) {
                    context.nextToken();
                    rule.setPublishStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    rule.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTime", targetDepth)) {
                    context.nextToken();
                    rule.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedBy", targetDepth)) {
                    context.nextToken();
                    rule.setLastUpdatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    rule.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return rule;
    }

    private static RuleJsonUnmarshaller instance;

    public static RuleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RuleJsonUnmarshaller();
        return instance;
    }
}
