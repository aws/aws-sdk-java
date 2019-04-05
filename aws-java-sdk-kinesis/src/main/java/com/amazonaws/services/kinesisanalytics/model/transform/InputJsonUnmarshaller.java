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
package com.amazonaws.services.kinesisanalytics.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisanalytics.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Input JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputJsonUnmarshaller implements Unmarshaller<Input, JsonUnmarshallerContext> {

    public Input unmarshall(JsonUnmarshallerContext context) throws Exception {
        Input input = new Input();

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
                if (context.testExpression("NamePrefix", targetDepth)) {
                    context.nextToken();
                    input.setNamePrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InputProcessingConfiguration", targetDepth)) {
                    context.nextToken();
                    input.setInputProcessingConfiguration(InputProcessingConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("KinesisStreamsInput", targetDepth)) {
                    context.nextToken();
                    input.setKinesisStreamsInput(KinesisStreamsInputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("KinesisFirehoseInput", targetDepth)) {
                    context.nextToken();
                    input.setKinesisFirehoseInput(KinesisFirehoseInputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InputParallelism", targetDepth)) {
                    context.nextToken();
                    input.setInputParallelism(InputParallelismJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InputSchema", targetDepth)) {
                    context.nextToken();
                    input.setInputSchema(SourceSchemaJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return input;
    }

    private static InputJsonUnmarshaller instance;

    public static InputJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InputJsonUnmarshaller();
        return instance;
    }
}
