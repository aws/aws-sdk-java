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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * OpsAggregator JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpsAggregatorJsonUnmarshaller implements Unmarshaller<OpsAggregator, JsonUnmarshallerContext> {

    public OpsAggregator unmarshall(JsonUnmarshallerContext context) throws Exception {
        OpsAggregator opsAggregator = new OpsAggregator();

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
                if (context.testExpression("AggregatorType", targetDepth)) {
                    context.nextToken();
                    opsAggregator.setAggregatorType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TypeName", targetDepth)) {
                    context.nextToken();
                    opsAggregator.setTypeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AttributeName", targetDepth)) {
                    context.nextToken();
                    opsAggregator.setAttributeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Values", targetDepth)) {
                    context.nextToken();
                    opsAggregator.setValues(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("Filters", targetDepth)) {
                    context.nextToken();
                    opsAggregator.setFilters(new ListUnmarshaller<OpsFilter>(OpsFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Aggregators", targetDepth)) {
                    context.nextToken();
                    opsAggregator.setAggregators(new ListUnmarshaller<OpsAggregator>(OpsAggregatorJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return opsAggregator;
    }

    private static OpsAggregatorJsonUnmarshaller instance;

    public static OpsAggregatorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OpsAggregatorJsonUnmarshaller();
        return instance;
    }
}
