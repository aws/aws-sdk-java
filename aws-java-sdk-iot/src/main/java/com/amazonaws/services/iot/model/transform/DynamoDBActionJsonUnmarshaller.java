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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DynamoDBAction JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DynamoDBActionJsonUnmarshaller implements Unmarshaller<DynamoDBAction, JsonUnmarshallerContext> {

    public DynamoDBAction unmarshall(JsonUnmarshallerContext context) throws Exception {
        DynamoDBAction dynamoDBAction = new DynamoDBAction();

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
                if (context.testExpression("tableName", targetDepth)) {
                    context.nextToken();
                    dynamoDBAction.setTableName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    dynamoDBAction.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("operation", targetDepth)) {
                    context.nextToken();
                    dynamoDBAction.setOperation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hashKeyField", targetDepth)) {
                    context.nextToken();
                    dynamoDBAction.setHashKeyField(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hashKeyValue", targetDepth)) {
                    context.nextToken();
                    dynamoDBAction.setHashKeyValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hashKeyType", targetDepth)) {
                    context.nextToken();
                    dynamoDBAction.setHashKeyType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("rangeKeyField", targetDepth)) {
                    context.nextToken();
                    dynamoDBAction.setRangeKeyField(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("rangeKeyValue", targetDepth)) {
                    context.nextToken();
                    dynamoDBAction.setRangeKeyValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("rangeKeyType", targetDepth)) {
                    context.nextToken();
                    dynamoDBAction.setRangeKeyType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("payloadField", targetDepth)) {
                    context.nextToken();
                    dynamoDBAction.setPayloadField(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return dynamoDBAction;
    }

    private static DynamoDBActionJsonUnmarshaller instance;

    public static DynamoDBActionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DynamoDBActionJsonUnmarshaller();
        return instance;
    }
}
