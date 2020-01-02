/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.frauddetector.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.frauddetector.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RuleDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleDetailJsonUnmarshaller implements Unmarshaller<RuleDetail, JsonUnmarshallerContext> {

    public RuleDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        RuleDetail ruleDetail = new RuleDetail();

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
                if (context.testExpression("ruleId", targetDepth)) {
                    context.nextToken();
                    ruleDetail.setRuleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    ruleDetail.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("detectorId", targetDepth)) {
                    context.nextToken();
                    ruleDetail.setDetectorId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ruleVersion", targetDepth)) {
                    context.nextToken();
                    ruleDetail.setRuleVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("expression", targetDepth)) {
                    context.nextToken();
                    ruleDetail.setExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("language", targetDepth)) {
                    context.nextToken();
                    ruleDetail.setLanguage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outcomes", targetDepth)) {
                    context.nextToken();
                    ruleDetail.setOutcomes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedTime", targetDepth)) {
                    context.nextToken();
                    ruleDetail.setLastUpdatedTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdTime", targetDepth)) {
                    context.nextToken();
                    ruleDetail.setCreatedTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return ruleDetail;
    }

    private static RuleDetailJsonUnmarshaller instance;

    public static RuleDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RuleDetailJsonUnmarshaller();
        return instance;
    }
}
