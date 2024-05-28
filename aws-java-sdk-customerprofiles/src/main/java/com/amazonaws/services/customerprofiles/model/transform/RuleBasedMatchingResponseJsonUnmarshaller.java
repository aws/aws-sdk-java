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
package com.amazonaws.services.customerprofiles.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.customerprofiles.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RuleBasedMatchingResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleBasedMatchingResponseJsonUnmarshaller implements Unmarshaller<RuleBasedMatchingResponse, JsonUnmarshallerContext> {

    public RuleBasedMatchingResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        RuleBasedMatchingResponse ruleBasedMatchingResponse = new RuleBasedMatchingResponse();

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
                if (context.testExpression("Enabled", targetDepth)) {
                    context.nextToken();
                    ruleBasedMatchingResponse.setEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("MatchingRules", targetDepth)) {
                    context.nextToken();
                    ruleBasedMatchingResponse.setMatchingRules(new ListUnmarshaller<MatchingRule>(MatchingRuleJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    ruleBasedMatchingResponse.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxAllowedRuleLevelForMerging", targetDepth)) {
                    context.nextToken();
                    ruleBasedMatchingResponse.setMaxAllowedRuleLevelForMerging(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaxAllowedRuleLevelForMatching", targetDepth)) {
                    context.nextToken();
                    ruleBasedMatchingResponse.setMaxAllowedRuleLevelForMatching(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AttributeTypesSelector", targetDepth)) {
                    context.nextToken();
                    ruleBasedMatchingResponse.setAttributeTypesSelector(AttributeTypesSelectorJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ConflictResolution", targetDepth)) {
                    context.nextToken();
                    ruleBasedMatchingResponse.setConflictResolution(ConflictResolutionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ExportingConfig", targetDepth)) {
                    context.nextToken();
                    ruleBasedMatchingResponse.setExportingConfig(ExportingConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return ruleBasedMatchingResponse;
    }

    private static RuleBasedMatchingResponseJsonUnmarshaller instance;

    public static RuleBasedMatchingResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RuleBasedMatchingResponseJsonUnmarshaller();
        return instance;
    }
}
