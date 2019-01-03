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
package com.amazonaws.services.xray.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.xray.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SamplingRule JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SamplingRuleJsonUnmarshaller implements Unmarshaller<SamplingRule, JsonUnmarshallerContext> {

    public SamplingRule unmarshall(JsonUnmarshallerContext context) throws Exception {
        SamplingRule samplingRule = new SamplingRule();

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
                if (context.testExpression("RuleName", targetDepth)) {
                    context.nextToken();
                    samplingRule.setRuleName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RuleARN", targetDepth)) {
                    context.nextToken();
                    samplingRule.setRuleARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceARN", targetDepth)) {
                    context.nextToken();
                    samplingRule.setResourceARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Priority", targetDepth)) {
                    context.nextToken();
                    samplingRule.setPriority(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("FixedRate", targetDepth)) {
                    context.nextToken();
                    samplingRule.setFixedRate(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("ReservoirSize", targetDepth)) {
                    context.nextToken();
                    samplingRule.setReservoirSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ServiceName", targetDepth)) {
                    context.nextToken();
                    samplingRule.setServiceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceType", targetDepth)) {
                    context.nextToken();
                    samplingRule.setServiceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Host", targetDepth)) {
                    context.nextToken();
                    samplingRule.setHost(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HTTPMethod", targetDepth)) {
                    context.nextToken();
                    samplingRule.setHTTPMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("URLPath", targetDepth)) {
                    context.nextToken();
                    samplingRule.setURLPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Version", targetDepth)) {
                    context.nextToken();
                    samplingRule.setVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Attributes", targetDepth)) {
                    context.nextToken();
                    samplingRule
                            .setAttributes(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return samplingRule;
    }

    private static SamplingRuleJsonUnmarshaller instance;

    public static SamplingRuleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SamplingRuleJsonUnmarshaller();
        return instance;
    }
}
