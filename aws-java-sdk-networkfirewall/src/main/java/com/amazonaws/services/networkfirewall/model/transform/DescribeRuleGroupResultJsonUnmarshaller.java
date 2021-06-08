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
package com.amazonaws.services.networkfirewall.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.networkfirewall.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeRuleGroupResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRuleGroupResultJsonUnmarshaller implements Unmarshaller<DescribeRuleGroupResult, JsonUnmarshallerContext> {

    public DescribeRuleGroupResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeRuleGroupResult describeRuleGroupResult = new DescribeRuleGroupResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeRuleGroupResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("UpdateToken", targetDepth)) {
                    context.nextToken();
                    describeRuleGroupResult.setUpdateToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RuleGroup", targetDepth)) {
                    context.nextToken();
                    describeRuleGroupResult.setRuleGroup(RuleGroupJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RuleGroupResponse", targetDepth)) {
                    context.nextToken();
                    describeRuleGroupResult.setRuleGroupResponse(RuleGroupResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeRuleGroupResult;
    }

    private static DescribeRuleGroupResultJsonUnmarshaller instance;

    public static DescribeRuleGroupResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeRuleGroupResultJsonUnmarshaller();
        return instance;
    }
}
