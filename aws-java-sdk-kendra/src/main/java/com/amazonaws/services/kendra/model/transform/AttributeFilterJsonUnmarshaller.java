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
package com.amazonaws.services.kendra.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kendra.model.*;
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
                if (context.testExpression("AndAllFilters", targetDepth)) {
                    context.nextToken();
                    attributeFilter.setAndAllFilters(new ListUnmarshaller<AttributeFilter>(AttributeFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("OrAllFilters", targetDepth)) {
                    context.nextToken();
                    attributeFilter.setOrAllFilters(new ListUnmarshaller<AttributeFilter>(AttributeFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("NotFilter", targetDepth)) {
                    context.nextToken();
                    attributeFilter.setNotFilter(AttributeFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EqualsTo", targetDepth)) {
                    context.nextToken();
                    attributeFilter.setEqualsTo(DocumentAttributeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ContainsAll", targetDepth)) {
                    context.nextToken();
                    attributeFilter.setContainsAll(DocumentAttributeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ContainsAny", targetDepth)) {
                    context.nextToken();
                    attributeFilter.setContainsAny(DocumentAttributeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GreaterThan", targetDepth)) {
                    context.nextToken();
                    attributeFilter.setGreaterThan(DocumentAttributeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GreaterThanOrEquals", targetDepth)) {
                    context.nextToken();
                    attributeFilter.setGreaterThanOrEquals(DocumentAttributeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LessThan", targetDepth)) {
                    context.nextToken();
                    attributeFilter.setLessThan(DocumentAttributeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LessThanOrEquals", targetDepth)) {
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
