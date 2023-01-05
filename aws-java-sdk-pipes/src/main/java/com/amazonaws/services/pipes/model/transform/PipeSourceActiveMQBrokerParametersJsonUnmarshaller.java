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
 * PipeSourceActiveMQBrokerParameters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipeSourceActiveMQBrokerParametersJsonUnmarshaller implements Unmarshaller<PipeSourceActiveMQBrokerParameters, JsonUnmarshallerContext> {

    public PipeSourceActiveMQBrokerParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        PipeSourceActiveMQBrokerParameters pipeSourceActiveMQBrokerParameters = new PipeSourceActiveMQBrokerParameters();

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
                if (context.testExpression("BatchSize", targetDepth)) {
                    context.nextToken();
                    pipeSourceActiveMQBrokerParameters.setBatchSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Credentials", targetDepth)) {
                    context.nextToken();
                    pipeSourceActiveMQBrokerParameters.setCredentials(MQBrokerAccessCredentialsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MaximumBatchingWindowInSeconds", targetDepth)) {
                    context.nextToken();
                    pipeSourceActiveMQBrokerParameters.setMaximumBatchingWindowInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("QueueName", targetDepth)) {
                    context.nextToken();
                    pipeSourceActiveMQBrokerParameters.setQueueName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return pipeSourceActiveMQBrokerParameters;
    }

    private static PipeSourceActiveMQBrokerParametersJsonUnmarshaller instance;

    public static PipeSourceActiveMQBrokerParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PipeSourceActiveMQBrokerParametersJsonUnmarshaller();
        return instance;
    }
}
