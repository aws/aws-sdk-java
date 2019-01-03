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
 * StreamRecord JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamRecordJsonUnmarshaller implements Unmarshaller<StreamRecord, JsonUnmarshallerContext> {

    public StreamRecord unmarshall(JsonUnmarshallerContext context) throws Exception {
        StreamRecord streamRecord = new StreamRecord();

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
                if (context.testExpression("ApproximateCreationDateTime", targetDepth)) {
                    context.nextToken();
                    streamRecord.setApproximateCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Keys", targetDepth)) {
                    context.nextToken();
                    streamRecord.setKeys(new MapUnmarshaller<String, AttributeValue>(context.getUnmarshaller(String.class), AttributeValueJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("NewImage", targetDepth)) {
                    context.nextToken();
                    streamRecord.setNewImage(new MapUnmarshaller<String, AttributeValue>(context.getUnmarshaller(String.class), AttributeValueJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("OldImage", targetDepth)) {
                    context.nextToken();
                    streamRecord.setOldImage(new MapUnmarshaller<String, AttributeValue>(context.getUnmarshaller(String.class), AttributeValueJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("SequenceNumber", targetDepth)) {
                    context.nextToken();
                    streamRecord.setSequenceNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SizeBytes", targetDepth)) {
                    context.nextToken();
                    streamRecord.setSizeBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("StreamViewType", targetDepth)) {
                    context.nextToken();
                    streamRecord.setStreamViewType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return streamRecord;
    }

    private static StreamRecordJsonUnmarshaller instance;

    public static StreamRecordJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StreamRecordJsonUnmarshaller();
        return instance;
    }
}
