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
package com.amazonaws.services.mailmanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mailmanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetRuleSetResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRuleSetResultJsonUnmarshaller implements Unmarshaller<GetRuleSetResult, JsonUnmarshallerContext> {

    public GetRuleSetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetRuleSetResult getRuleSetResult = new GetRuleSetResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getRuleSetResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("CreatedDate", targetDepth)) {
                    context.nextToken();
                    getRuleSetResult.setCreatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModificationDate", targetDepth)) {
                    context.nextToken();
                    getRuleSetResult.setLastModificationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("RuleSetArn", targetDepth)) {
                    context.nextToken();
                    getRuleSetResult.setRuleSetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RuleSetId", targetDepth)) {
                    context.nextToken();
                    getRuleSetResult.setRuleSetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RuleSetName", targetDepth)) {
                    context.nextToken();
                    getRuleSetResult.setRuleSetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Rules", targetDepth)) {
                    context.nextToken();
                    getRuleSetResult.setRules(new ListUnmarshaller<Rule>(RuleJsonUnmarshaller.getInstance())

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

        return getRuleSetResult;
    }

    private static GetRuleSetResultJsonUnmarshaller instance;

    public static GetRuleSetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetRuleSetResultJsonUnmarshaller();
        return instance;
    }
}
