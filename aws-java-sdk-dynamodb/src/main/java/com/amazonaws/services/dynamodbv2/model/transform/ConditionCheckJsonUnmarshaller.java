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

import javax.annotation.Generated;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ConditionCheck JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConditionCheckJsonUnmarshaller implements Unmarshaller<ConditionCheck, JsonUnmarshallerContext> {

    public ConditionCheck unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConditionCheck conditionCheck = new ConditionCheck();

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
                if (context.testExpression("Key", targetDepth)) {
                    context.nextToken();
                    conditionCheck.setKey(new MapUnmarshaller<String, AttributeValue>(context.getUnmarshaller(String.class), AttributeValueJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("TableName", targetDepth)) {
                    context.nextToken();
                    conditionCheck.setTableName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConditionExpression", targetDepth)) {
                    context.nextToken();
                    conditionCheck.setConditionExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExpressionAttributeNames", targetDepth)) {
                    context.nextToken();
                    conditionCheck.setExpressionAttributeNames(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("ExpressionAttributeValues", targetDepth)) {
                    context.nextToken();
                    conditionCheck.setExpressionAttributeValues(new MapUnmarshaller<String, AttributeValue>(context.getUnmarshaller(String.class),
                            AttributeValueJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ReturnValuesOnConditionCheckFailure", targetDepth)) {
                    context.nextToken();
                    conditionCheck.setReturnValuesOnConditionCheckFailure(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return conditionCheck;
    }

    private static ConditionCheckJsonUnmarshaller instance;

    public static ConditionCheckJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConditionCheckJsonUnmarshaller();
        return instance;
    }
}
