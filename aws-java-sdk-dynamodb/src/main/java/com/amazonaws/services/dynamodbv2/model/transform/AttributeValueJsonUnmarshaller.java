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
package com.amazonaws.services.dynamodbv2.model.transform;

import java.math.*;
import java.nio.ByteBuffer;
import javax.annotation.Generated;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AttributeValue JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttributeValueJsonUnmarshaller implements Unmarshaller<AttributeValue, JsonUnmarshallerContext> {

    public AttributeValue unmarshall(JsonUnmarshallerContext context) throws Exception {
        AttributeValue attributeValue = new AttributeValue();

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
                if (context.testExpression("S", targetDepth)) {
                    context.nextToken();
                    attributeValue.setS(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("N", targetDepth)) {
                    context.nextToken();
                    attributeValue.setN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("B", targetDepth)) {
                    context.nextToken();
                    attributeValue.setB(context.getUnmarshaller(java.nio.ByteBuffer.class).unmarshall(context));
                }
                if (context.testExpression("SS", targetDepth)) {
                    context.nextToken();
                    attributeValue.setSS(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("NS", targetDepth)) {
                    context.nextToken();
                    attributeValue.setNS(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("BS", targetDepth)) {
                    context.nextToken();
                    attributeValue.setBS(new ListUnmarshaller<java.nio.ByteBuffer>(context.getUnmarshaller(java.nio.ByteBuffer.class)).unmarshall(context));
                }
                if (context.testExpression("M", targetDepth)) {
                    context.nextToken();
                    attributeValue.setM(new MapUnmarshaller<String, AttributeValue>(context.getUnmarshaller(String.class), AttributeValueJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("L", targetDepth)) {
                    context.nextToken();
                    attributeValue.setL(new ListUnmarshaller<AttributeValue>(AttributeValueJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("NULL", targetDepth)) {
                    context.nextToken();
                    attributeValue.setNULL(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("BOOL", targetDepth)) {
                    context.nextToken();
                    attributeValue.setBOOL(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return attributeValue;
    }

    private static AttributeValueJsonUnmarshaller instance;

    public static AttributeValueJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AttributeValueJsonUnmarshaller();
        return instance;
    }
}
