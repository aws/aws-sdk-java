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
package com.amazonaws.services.waf.model.waf_regional.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.waf.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ActivatedRule JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActivatedRuleJsonUnmarshaller implements Unmarshaller<ActivatedRule, JsonUnmarshallerContext> {

    public ActivatedRule unmarshall(JsonUnmarshallerContext context) throws Exception {
        ActivatedRule activatedRule = new ActivatedRule();

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
                if (context.testExpression("Priority", targetDepth)) {
                    context.nextToken();
                    activatedRule.setPriority(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("RuleId", targetDepth)) {
                    context.nextToken();
                    activatedRule.setRuleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Action", targetDepth)) {
                    context.nextToken();
                    activatedRule.setAction(WafActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OverrideAction", targetDepth)) {
                    context.nextToken();
                    activatedRule.setOverrideAction(WafOverrideActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    activatedRule.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExcludedRules", targetDepth)) {
                    context.nextToken();
                    activatedRule.setExcludedRules(new ListUnmarshaller<ExcludedRule>(ExcludedRuleJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return activatedRule;
    }

    private static ActivatedRuleJsonUnmarshaller instance;

    public static ActivatedRuleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ActivatedRuleJsonUnmarshaller();
        return instance;
    }
}
