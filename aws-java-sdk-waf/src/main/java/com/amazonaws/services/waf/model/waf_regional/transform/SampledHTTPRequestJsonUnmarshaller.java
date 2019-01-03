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
 * SampledHTTPRequest JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SampledHTTPRequestJsonUnmarshaller implements Unmarshaller<SampledHTTPRequest, JsonUnmarshallerContext> {

    public SampledHTTPRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        SampledHTTPRequest sampledHTTPRequest = new SampledHTTPRequest();

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
                if (context.testExpression("Request", targetDepth)) {
                    context.nextToken();
                    sampledHTTPRequest.setRequest(HTTPRequestJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Weight", targetDepth)) {
                    context.nextToken();
                    sampledHTTPRequest.setWeight(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Timestamp", targetDepth)) {
                    context.nextToken();
                    sampledHTTPRequest.setTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Action", targetDepth)) {
                    context.nextToken();
                    sampledHTTPRequest.setAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RuleWithinRuleGroup", targetDepth)) {
                    context.nextToken();
                    sampledHTTPRequest.setRuleWithinRuleGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return sampledHTTPRequest;
    }

    private static SampledHTTPRequestJsonUnmarshaller instance;

    public static SampledHTTPRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SampledHTTPRequestJsonUnmarshaller();
        return instance;
    }
}
