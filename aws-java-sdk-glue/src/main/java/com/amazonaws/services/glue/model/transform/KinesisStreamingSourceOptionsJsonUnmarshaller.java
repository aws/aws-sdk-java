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
 * KinesisStreamingSourceOptions JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KinesisStreamingSourceOptionsJsonUnmarshaller implements Unmarshaller<KinesisStreamingSourceOptions, JsonUnmarshallerContext> {

    public KinesisStreamingSourceOptions unmarshall(JsonUnmarshallerContext context) throws Exception {
        KinesisStreamingSourceOptions kinesisStreamingSourceOptions = new KinesisStreamingSourceOptions();

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
                if (context.testExpression("EndpointUrl", targetDepth)) {
                    context.nextToken();
                    kinesisStreamingSourceOptions.setEndpointUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StreamName", targetDepth)) {
                    context.nextToken();
                    kinesisStreamingSourceOptions.setStreamName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Classification", targetDepth)) {
                    context.nextToken();
                    kinesisStreamingSourceOptions.setClassification(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Delimiter", targetDepth)) {
                    context.nextToken();
                    kinesisStreamingSourceOptions.setDelimiter(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartingPosition", targetDepth)) {
                    context.nextToken();
                    kinesisStreamingSourceOptions.setStartingPosition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxFetchTimeInMs", targetDepth)) {
                    context.nextToken();
                    kinesisStreamingSourceOptions.setMaxFetchTimeInMs(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("MaxFetchRecordsPerShard", targetDepth)) {
                    context.nextToken();
                    kinesisStreamingSourceOptions.setMaxFetchRecordsPerShard(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("MaxRecordPerRead", targetDepth)) {
                    context.nextToken();
                    kinesisStreamingSourceOptions.setMaxRecordPerRead(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("AddIdleTimeBetweenReads", targetDepth)) {
                    context.nextToken();
                    kinesisStreamingSourceOptions.setAddIdleTimeBetweenReads(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IdleTimeBetweenReadsInMs", targetDepth)) {
                    context.nextToken();
                    kinesisStreamingSourceOptions.setIdleTimeBetweenReadsInMs(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("DescribeShardInterval", targetDepth)) {
                    context.nextToken();
                    kinesisStreamingSourceOptions.setDescribeShardInterval(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("NumRetries", targetDepth)) {
                    context.nextToken();
                    kinesisStreamingSourceOptions.setNumRetries(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("RetryIntervalMs", targetDepth)) {
                    context.nextToken();
                    kinesisStreamingSourceOptions.setRetryIntervalMs(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("MaxRetryIntervalMs", targetDepth)) {
                    context.nextToken();
                    kinesisStreamingSourceOptions.setMaxRetryIntervalMs(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("AvoidEmptyBatches", targetDepth)) {
                    context.nextToken();
                    kinesisStreamingSourceOptions.setAvoidEmptyBatches(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("StreamArn", targetDepth)) {
                    context.nextToken();
                    kinesisStreamingSourceOptions.setStreamArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    kinesisStreamingSourceOptions.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleSessionName", targetDepth)) {
                    context.nextToken();
                    kinesisStreamingSourceOptions.setRoleSessionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return kinesisStreamingSourceOptions;
    }

    private static KinesisStreamingSourceOptionsJsonUnmarshaller instance;

    public static KinesisStreamingSourceOptionsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new KinesisStreamingSourceOptionsJsonUnmarshaller();
        return instance;
    }
}
