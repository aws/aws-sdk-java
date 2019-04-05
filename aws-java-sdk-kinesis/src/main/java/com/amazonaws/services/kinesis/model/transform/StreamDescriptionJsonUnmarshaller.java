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
package com.amazonaws.services.kinesis.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kinesis.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StreamDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamDescriptionJsonUnmarshaller implements Unmarshaller<StreamDescription, JsonUnmarshallerContext> {

    public StreamDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        StreamDescription streamDescription = new StreamDescription();

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
                if (context.testExpression("StreamName", targetDepth)) {
                    context.nextToken();
                    streamDescription.setStreamName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StreamARN", targetDepth)) {
                    context.nextToken();
                    streamDescription.setStreamARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StreamStatus", targetDepth)) {
                    context.nextToken();
                    streamDescription.setStreamStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Shards", targetDepth)) {
                    context.nextToken();
                    streamDescription.setShards(new ListUnmarshaller<Shard>(ShardJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("HasMoreShards", targetDepth)) {
                    context.nextToken();
                    streamDescription.setHasMoreShards(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RetentionPeriodHours", targetDepth)) {
                    context.nextToken();
                    streamDescription.setRetentionPeriodHours(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("StreamCreationTimestamp", targetDepth)) {
                    context.nextToken();
                    streamDescription.setStreamCreationTimestamp(context.getUnmarshaller(java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("EnhancedMonitoring", targetDepth)) {
                    context.nextToken();
                    streamDescription.setEnhancedMonitoring(new ListUnmarshaller<EnhancedMetrics>(EnhancedMetricsJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("EncryptionType", targetDepth)) {
                    context.nextToken();
                    streamDescription.setEncryptionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeyId", targetDepth)) {
                    context.nextToken();
                    streamDescription.setKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return streamDescription;
    }

    private static StreamDescriptionJsonUnmarshaller instance;

    public static StreamDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StreamDescriptionJsonUnmarshaller();
        return instance;
    }
}
