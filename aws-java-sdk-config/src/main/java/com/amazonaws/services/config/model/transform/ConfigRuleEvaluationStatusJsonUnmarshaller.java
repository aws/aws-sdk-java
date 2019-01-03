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
package com.amazonaws.services.config.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ConfigRuleEvaluationStatus JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigRuleEvaluationStatusJsonUnmarshaller implements Unmarshaller<ConfigRuleEvaluationStatus, JsonUnmarshallerContext> {

    public ConfigRuleEvaluationStatus unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConfigRuleEvaluationStatus configRuleEvaluationStatus = new ConfigRuleEvaluationStatus();

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
                if (context.testExpression("ConfigRuleName", targetDepth)) {
                    context.nextToken();
                    configRuleEvaluationStatus.setConfigRuleName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConfigRuleArn", targetDepth)) {
                    context.nextToken();
                    configRuleEvaluationStatus.setConfigRuleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConfigRuleId", targetDepth)) {
                    context.nextToken();
                    configRuleEvaluationStatus.setConfigRuleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastSuccessfulInvocationTime", targetDepth)) {
                    context.nextToken();
                    configRuleEvaluationStatus.setLastSuccessfulInvocationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastFailedInvocationTime", targetDepth)) {
                    context.nextToken();
                    configRuleEvaluationStatus.setLastFailedInvocationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastSuccessfulEvaluationTime", targetDepth)) {
                    context.nextToken();
                    configRuleEvaluationStatus.setLastSuccessfulEvaluationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastFailedEvaluationTime", targetDepth)) {
                    context.nextToken();
                    configRuleEvaluationStatus.setLastFailedEvaluationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FirstActivatedTime", targetDepth)) {
                    context.nextToken();
                    configRuleEvaluationStatus.setFirstActivatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastErrorCode", targetDepth)) {
                    context.nextToken();
                    configRuleEvaluationStatus.setLastErrorCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastErrorMessage", targetDepth)) {
                    context.nextToken();
                    configRuleEvaluationStatus.setLastErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FirstEvaluationStarted", targetDepth)) {
                    context.nextToken();
                    configRuleEvaluationStatus.setFirstEvaluationStarted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return configRuleEvaluationStatus;
    }

    private static ConfigRuleEvaluationStatusJsonUnmarshaller instance;

    public static ConfigRuleEvaluationStatusJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConfigRuleEvaluationStatusJsonUnmarshaller();
        return instance;
    }
}
