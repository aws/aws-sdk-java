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
package com.amazonaws.services.waf.model.waf.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.waf.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RateBasedRule JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RateBasedRuleJsonUnmarshaller implements Unmarshaller<RateBasedRule, JsonUnmarshallerContext> {

    public RateBasedRule unmarshall(JsonUnmarshallerContext context) throws Exception {
        RateBasedRule rateBasedRule = new RateBasedRule();

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
                if (context.testExpression("RuleId", targetDepth)) {
                    context.nextToken();
                    rateBasedRule.setRuleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    rateBasedRule.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MetricName", targetDepth)) {
                    context.nextToken();
                    rateBasedRule.setMetricName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MatchPredicates", targetDepth)) {
                    context.nextToken();
                    rateBasedRule.setMatchPredicates(new ListUnmarshaller<Predicate>(PredicateJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("RateKey", targetDepth)) {
                    context.nextToken();
                    rateBasedRule.setRateKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RateLimit", targetDepth)) {
                    context.nextToken();
                    rateBasedRule.setRateLimit(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return rateBasedRule;
    }

    private static RateBasedRuleJsonUnmarshaller instance;

    public static RateBasedRuleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RateBasedRuleJsonUnmarshaller();
        return instance;
    }
}
