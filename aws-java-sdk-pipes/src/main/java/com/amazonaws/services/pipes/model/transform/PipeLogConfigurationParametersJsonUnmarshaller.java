/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * PipeLogConfigurationParameters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipeLogConfigurationParametersJsonUnmarshaller implements Unmarshaller<PipeLogConfigurationParameters, JsonUnmarshallerContext> {

    public PipeLogConfigurationParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        PipeLogConfigurationParameters pipeLogConfigurationParameters = new PipeLogConfigurationParameters();

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
                if (context.testExpression("CloudwatchLogsLogDestination", targetDepth)) {
                    context.nextToken();
                    pipeLogConfigurationParameters.setCloudwatchLogsLogDestination(CloudwatchLogsLogDestinationParametersJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("FirehoseLogDestination", targetDepth)) {
                    context.nextToken();
                    pipeLogConfigurationParameters
                            .setFirehoseLogDestination(FirehoseLogDestinationParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IncludeExecutionData", targetDepth)) {
                    context.nextToken();
                    pipeLogConfigurationParameters.setIncludeExecutionData(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Level", targetDepth)) {
                    context.nextToken();
                    pipeLogConfigurationParameters.setLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3LogDestination", targetDepth)) {
                    context.nextToken();
                    pipeLogConfigurationParameters.setS3LogDestination(S3LogDestinationParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return pipeLogConfigurationParameters;
    }

    private static PipeLogConfigurationParametersJsonUnmarshaller instance;

    public static PipeLogConfigurationParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PipeLogConfigurationParametersJsonUnmarshaller();
        return instance;
    }
}
