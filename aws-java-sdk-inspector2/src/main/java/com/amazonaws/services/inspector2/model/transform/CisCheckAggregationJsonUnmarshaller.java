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
package com.amazonaws.services.inspector2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.inspector2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CisCheckAggregation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CisCheckAggregationJsonUnmarshaller implements Unmarshaller<CisCheckAggregation, JsonUnmarshallerContext> {

    public CisCheckAggregation unmarshall(JsonUnmarshallerContext context) throws Exception {
        CisCheckAggregation cisCheckAggregation = new CisCheckAggregation();

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
                if (context.testExpression("accountId", targetDepth)) {
                    context.nextToken();
                    cisCheckAggregation.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("checkDescription", targetDepth)) {
                    context.nextToken();
                    cisCheckAggregation.setCheckDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("checkId", targetDepth)) {
                    context.nextToken();
                    cisCheckAggregation.setCheckId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("level", targetDepth)) {
                    context.nextToken();
                    cisCheckAggregation.setLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("platform", targetDepth)) {
                    context.nextToken();
                    cisCheckAggregation.setPlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scanArn", targetDepth)) {
                    context.nextToken();
                    cisCheckAggregation.setScanArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusCounts", targetDepth)) {
                    context.nextToken();
                    cisCheckAggregation.setStatusCounts(StatusCountsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("title", targetDepth)) {
                    context.nextToken();
                    cisCheckAggregation.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return cisCheckAggregation;
    }

    private static CisCheckAggregationJsonUnmarshaller instance;

    public static CisCheckAggregationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CisCheckAggregationJsonUnmarshaller();
        return instance;
    }
}
