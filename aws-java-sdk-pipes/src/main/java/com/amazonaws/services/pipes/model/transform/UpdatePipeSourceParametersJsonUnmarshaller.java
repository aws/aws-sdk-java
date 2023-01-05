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
 * UpdatePipeSourceParameters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePipeSourceParametersJsonUnmarshaller implements Unmarshaller<UpdatePipeSourceParameters, JsonUnmarshallerContext> {

    public UpdatePipeSourceParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdatePipeSourceParameters updatePipeSourceParameters = new UpdatePipeSourceParameters();

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
                    updatePipeSourceParameters.setActiveMQBrokerParameters(UpdatePipeSourceActiveMQBrokerParametersJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("DynamoDBStreamParameters", targetDepth)) {
                    context.nextToken();
                    updatePipeSourceParameters.setDynamoDBStreamParameters(UpdatePipeSourceDynamoDBStreamParametersJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("FilterCriteria", targetDepth)) {
                    context.nextToken();
                    updatePipeSourceParameters.setFilterCriteria(FilterCriteriaJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("KinesisStreamParameters", targetDepth)) {
                    context.nextToken();
                    updatePipeSourceParameters.setKinesisStreamParameters(UpdatePipeSourceKinesisStreamParametersJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("ManagedStreamingKafkaParameters", targetDepth)) {
                    context.nextToken();
                    updatePipeSourceParameters.setManagedStreamingKafkaParameters(UpdatePipeSourceManagedStreamingKafkaParametersJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("RabbitMQBrokerParameters", targetDepth)) {
                    context.nextToken();
                    updatePipeSourceParameters.setRabbitMQBrokerParameters(UpdatePipeSourceRabbitMQBrokerParametersJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("SelfManagedKafkaParameters", targetDepth)) {
                    context.nextToken();
                    updatePipeSourceParameters.setSelfManagedKafkaParameters(UpdatePipeSourceSelfManagedKafkaParametersJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("SqsQueueParameters", targetDepth)) {
                    context.nextToken();
                    updatePipeSourceParameters.setSqsQueueParameters(UpdatePipeSourceSqsQueueParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updatePipeSourceParameters;
    }

    private static UpdatePipeSourceParametersJsonUnmarshaller instance;

    public static UpdatePipeSourceParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdatePipeSourceParametersJsonUnmarshaller();
        return instance;
    }
}
