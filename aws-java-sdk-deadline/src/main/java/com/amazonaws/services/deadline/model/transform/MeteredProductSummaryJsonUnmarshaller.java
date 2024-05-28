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
package com.amazonaws.services.deadline.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.deadline.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MeteredProductSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MeteredProductSummaryJsonUnmarshaller implements Unmarshaller<MeteredProductSummary, JsonUnmarshallerContext> {

    public MeteredProductSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        MeteredProductSummary meteredProductSummary = new MeteredProductSummary();

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
                if (context.testExpression("family", targetDepth)) {
                    context.nextToken();
                    meteredProductSummary.setFamily(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("port", targetDepth)) {
                    context.nextToken();
                    meteredProductSummary.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("productId", targetDepth)) {
                    context.nextToken();
                    meteredProductSummary.setProductId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vendor", targetDepth)) {
                    context.nextToken();
                    meteredProductSummary.setVendor(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return meteredProductSummary;
    }

    private static MeteredProductSummaryJsonUnmarshaller instance;

    public static MeteredProductSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MeteredProductSummaryJsonUnmarshaller();
        return instance;
    }
}
