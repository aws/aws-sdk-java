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
 * TopicRule JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicRuleJsonUnmarshaller implements Unmarshaller<TopicRule, JsonUnmarshallerContext> {

    public TopicRule unmarshall(JsonUnmarshallerContext context) throws Exception {
        TopicRule topicRule = new TopicRule();

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
                if (context.testExpression("ruleName", targetDepth)) {
                    context.nextToken();
                    topicRule.setRuleName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sql", targetDepth)) {
                    context.nextToken();
                    topicRule.setSql(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    topicRule.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    topicRule.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("actions", targetDepth)) {
                    context.nextToken();
                    topicRule.setActions(new ListUnmarshaller<Action>(ActionJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ruleDisabled", targetDepth)) {
                    context.nextToken();
                    topicRule.setRuleDisabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("awsIotSqlVersion", targetDepth)) {
                    context.nextToken();
                    topicRule.setAwsIotSqlVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errorAction", targetDepth)) {
                    context.nextToken();
                    topicRule.setErrorAction(ActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return topicRule;
    }

    private static TopicRuleJsonUnmarshaller instance;

    public static TopicRuleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TopicRuleJsonUnmarshaller();
        return instance;
    }
}
