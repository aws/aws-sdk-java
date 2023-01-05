/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * KafkaStreamingSourceOptions JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KafkaStreamingSourceOptionsJsonUnmarshaller implements Unmarshaller<KafkaStreamingSourceOptions, JsonUnmarshallerContext> {

    public KafkaStreamingSourceOptions unmarshall(JsonUnmarshallerContext context) throws Exception {
        KafkaStreamingSourceOptions kafkaStreamingSourceOptions = new KafkaStreamingSourceOptions();

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
                if (context.testExpression("BootstrapServers", targetDepth)) {
                    context.nextToken();
                    kafkaStreamingSourceOptions.setBootstrapServers(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityProtocol", targetDepth)) {
                    context.nextToken();
                    kafkaStreamingSourceOptions.setSecurityProtocol(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConnectionName", targetDepth)) {
                    context.nextToken();
                    kafkaStreamingSourceOptions.setConnectionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TopicName", targetDepth)) {
                    context.nextToken();
                    kafkaStreamingSourceOptions.setTopicName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Assign", targetDepth)) {
                    context.nextToken();
                    kafkaStreamingSourceOptions.setAssign(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubscribePattern", targetDepth)) {
                    context.nextToken();
                    kafkaStreamingSourceOptions.setSubscribePattern(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Classification", targetDepth)) {
                    context.nextToken();
                    kafkaStreamingSourceOptions.setClassification(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Delimiter", targetDepth)) {
                    context.nextToken();
                    kafkaStreamingSourceOptions.setDelimiter(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartingOffsets", targetDepth)) {
                    context.nextToken();
                    kafkaStreamingSourceOptions.setStartingOffsets(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndingOffsets", targetDepth)) {
                    context.nextToken();
                    kafkaStreamingSourceOptions.setEndingOffsets(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PollTimeoutMs", targetDepth)) {
                    context.nextToken();
                    kafkaStreamingSourceOptions.setPollTimeoutMs(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("NumRetries", targetDepth)) {
                    context.nextToken();
                    kafkaStreamingSourceOptions.setNumRetries(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("RetryIntervalMs", targetDepth)) {
                    context.nextToken();
                    kafkaStreamingSourceOptions.setRetryIntervalMs(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("MaxOffsetsPerTrigger", targetDepth)) {
                    context.nextToken();
                    kafkaStreamingSourceOptions.setMaxOffsetsPerTrigger(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("MinPartitions", targetDepth)) {
                    context.nextToken();
                    kafkaStreamingSourceOptions.setMinPartitions(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return kafkaStreamingSourceOptions;
    }

    private static KafkaStreamingSourceOptionsJsonUnmarshaller instance;

    public static KafkaStreamingSourceOptionsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new KafkaStreamingSourceOptionsJsonUnmarshaller();
        return instance;
    }
}
