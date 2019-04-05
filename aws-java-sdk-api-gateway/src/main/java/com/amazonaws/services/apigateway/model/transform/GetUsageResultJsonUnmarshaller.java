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
package com.amazonaws.services.apigateway.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetUsageResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUsageResultJsonUnmarshaller implements Unmarshaller<GetUsageResult, JsonUnmarshallerContext> {

    public GetUsageResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetUsageResult getUsageResult = new GetUsageResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getUsageResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("usagePlanId", targetDepth)) {
                    context.nextToken();
                    getUsageResult.setUsagePlanId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startDate", targetDepth)) {
                    context.nextToken();
                    getUsageResult.setStartDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("endDate", targetDepth)) {
                    context.nextToken();
                    getUsageResult.setEndDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("position", targetDepth)) {
                    context.nextToken();
                    getUsageResult.setPosition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("values", targetDepth)) {
                    context.nextToken();
                    getUsageResult.setItems(new MapUnmarshaller<String, java.util.List<java.util.List<Long>>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<java.util.List<Long>>(new ListUnmarshaller<Long>(context.getUnmarshaller(Long.class)))).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getUsageResult;
    }

    private static GetUsageResultJsonUnmarshaller instance;

    public static GetUsageResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetUsageResultJsonUnmarshaller();
        return instance;
    }
}
