/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.qldb.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.qldb.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * JournalKinesisStreamDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JournalKinesisStreamDescriptionJsonUnmarshaller implements Unmarshaller<JournalKinesisStreamDescription, JsonUnmarshallerContext> {

    public JournalKinesisStreamDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        JournalKinesisStreamDescription journalKinesisStreamDescription = new JournalKinesisStreamDescription();

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
                if (context.testExpression("LedgerName", targetDepth)) {
                    context.nextToken();
                    journalKinesisStreamDescription.setLedgerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    journalKinesisStreamDescription.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("InclusiveStartTime", targetDepth)) {
                    context.nextToken();
                    journalKinesisStreamDescription.setInclusiveStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ExclusiveEndTime", targetDepth)) {
                    context.nextToken();
                    journalKinesisStreamDescription.setExclusiveEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    journalKinesisStreamDescription.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StreamId", targetDepth)) {
                    context.nextToken();
                    journalKinesisStreamDescription.setStreamId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    journalKinesisStreamDescription.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    journalKinesisStreamDescription.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KinesisConfiguration", targetDepth)) {
                    context.nextToken();
                    journalKinesisStreamDescription.setKinesisConfiguration(KinesisConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ErrorCause", targetDepth)) {
                    context.nextToken();
                    journalKinesisStreamDescription.setErrorCause(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StreamName", targetDepth)) {
                    context.nextToken();
                    journalKinesisStreamDescription.setStreamName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return journalKinesisStreamDescription;
    }

    private static JournalKinesisStreamDescriptionJsonUnmarshaller instance;

    public static JournalKinesisStreamDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JournalKinesisStreamDescriptionJsonUnmarshaller();
        return instance;
    }
}
