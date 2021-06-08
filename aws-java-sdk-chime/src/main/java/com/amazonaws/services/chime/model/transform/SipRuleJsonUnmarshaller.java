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
package com.amazonaws.services.chime.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.chime.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SipRule JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SipRuleJsonUnmarshaller implements Unmarshaller<SipRule, JsonUnmarshallerContext> {

    public SipRule unmarshall(JsonUnmarshallerContext context) throws Exception {
        SipRule sipRule = new SipRule();

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
                if (context.testExpression("SipRuleId", targetDepth)) {
                    context.nextToken();
                    sipRule.setSipRuleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    sipRule.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Disabled", targetDepth)) {
                    context.nextToken();
                    sipRule.setDisabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("TriggerType", targetDepth)) {
                    context.nextToken();
                    sipRule.setTriggerType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TriggerValue", targetDepth)) {
                    context.nextToken();
                    sipRule.setTriggerValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetApplications", targetDepth)) {
                    context.nextToken();
                    sipRule.setTargetApplications(new ListUnmarshaller<SipRuleTargetApplication>(SipRuleTargetApplicationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    context.nextToken();
                    sipRule.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("UpdatedTimestamp", targetDepth)) {
                    context.nextToken();
                    sipRule.setUpdatedTimestamp(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return sipRule;
    }

    private static SipRuleJsonUnmarshaller instance;

    public static SipRuleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SipRuleJsonUnmarshaller();
        return instance;
    }
}
