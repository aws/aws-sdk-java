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
package com.amazonaws.services.pipes.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pipes.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PipeSourceParameters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipeSourceParametersJsonUnmarshaller implements Unmarshaller<PipeSourceParameters, JsonUnmarshallerContext> {

    public PipeSourceParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        PipeSourceParameters pipeSourceParameters = new PipeSourceParameters();

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
                if (context.testExpression("ActiveMQBrokerParameters", targetDepth)) {
                    context.nextToken();
                    pipeSourceParameters.setActiveMQBrokerParameters(PipeSourceActiveMQBrokerParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DynamoDBStreamParameters", targetDepth)) {
                    context.nextToken();
                    pipeSourceParameters.setDynamoDBStreamParameters(PipeSourceDynamoDBStreamParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FilterCriteria", targetDepth)) {
                    context.nextToken();
                    pipeSourceParameters.setFilterCriteria(FilterCriteriaJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("KinesisStreamParameters", targetDepth)) {
                    context.nextToken();
                    pipeSourceParameters.setKinesisStreamParameters(PipeSourceKinesisStreamParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ManagedStreamingKafkaParameters", targetDepth)) {
                    context.nextToken();
                    pipeSourceParameters.setManagedStreamingKafkaParameters(PipeSourceManagedStreamingKafkaParametersJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("RabbitMQBrokerParameters", targetDepth)) {
                    context.nextToken();
                    pipeSourceParameters.setRabbitMQBrokerParameters(PipeSourceRabbitMQBrokerParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SelfManagedKafkaParameters", targetDepth)) {
                    context.nextToken();
                    pipeSourceParameters.setSelfManagedKafkaParameters(PipeSourceSelfManagedKafkaParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SqsQueueParameters", targetDepth)) {
                    context.nextToken();
                    pipeSourceParameters.setSqsQueueParameters(PipeSourceSqsQueueParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return pipeSourceParameters;
    }

    private static PipeSourceParametersJsonUnmarshaller instance;

    public static PipeSourceParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PipeSourceParametersJsonUnmarshaller();
        return instance;
    }
}
