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
package com.amazonaws.services.qbusiness.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.qbusiness.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AttributeFilter JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttributeFilterJsonUnmarshaller implements Unmarshaller<AttributeFilter, JsonUnmarshallerContext> {

    public AttributeFilter unmarshall(JsonUnmarshallerContext context) throws Exception {
        AttributeFilter attributeFilter = new AttributeFilter();

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
                if (context.testExpression("andAllFilters", targetDepth)) {
                    context.nextToken();
                    attributeFilter.setAndAllFilters(new ListUnmarshaller<AttributeFilter>(AttributeFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("orAllFilters", targetDepth)) {
                    context.nextToken();
                    attributeFilter.setOrAllFilters(new ListUnmarshaller<AttributeFilter>(AttributeFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("notFilter", targetDepth)) {
                    context.nextToken();
                    attributeFilter.setNotFilter(AttributeFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("equalsTo", targetDepth)) {
                    context.nextToken();
                    attributeFilter.setEqualsTo(DocumentAttributeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("containsAll", targetDepth)) {
                    context.nextToken();
                    attributeFilter.setContainsAll(DocumentAttributeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("containsAny", targetDepth)) {
                    context.nextToken();
                    attributeFilter.setContainsAny(DocumentAttributeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("greaterThan", targetDepth)) {
                    context.nextToken();
                    attributeFilter.setGreaterThan(DocumentAttributeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("greaterThanOrEquals", targetDepth)) {
                    context.nextToken();
                    attributeFilter.setGreaterThanOrEquals(DocumentAttributeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lessThan", targetDepth)) {
                    context.nextToken();
                    attributeFilter.setLessThan(DocumentAttributeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lessThanOrEquals", targetDepth)) {
                    context.nextToken();
                    attributeFilter.setLessThanOrEquals(DocumentAttributeJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return attributeFilter;
    }

    private static AttributeFilterJsonUnmarshaller instance;

    public static AttributeFilterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AttributeFilterJsonUnmarshaller();
        return instance;
    }
}
