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
 * Record JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecordJsonUnmarshaller implements Unmarshaller<Record, JsonUnmarshallerContext> {

    public Record unmarshall(JsonUnmarshallerContext context) throws Exception {
        Record record = new Record();

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
                if (context.testExpression("eventID", targetDepth)) {
                    context.nextToken();
                    record.setEventID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventName", targetDepth)) {
                    context.nextToken();
                    record.setEventName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventVersion", targetDepth)) {
                    context.nextToken();
                    record.setEventVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventSource", targetDepth)) {
                    context.nextToken();
                    record.setEventSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsRegion", targetDepth)) {
                    context.nextToken();
                    record.setAwsRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dynamodb", targetDepth)) {
                    context.nextToken();
                    record.setDynamodb(StreamRecordJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("userIdentity", targetDepth)) {
                    context.nextToken();
                    record.setUserIdentity(IdentityJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return record;
    }

    private static RecordJsonUnmarshaller instance;

    public static RecordJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecordJsonUnmarshaller();
        return instance;
    }
}
