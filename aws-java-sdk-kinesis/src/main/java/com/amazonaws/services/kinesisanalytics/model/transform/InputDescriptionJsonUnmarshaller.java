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
 * InputDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputDescriptionJsonUnmarshaller implements Unmarshaller<InputDescription, JsonUnmarshallerContext> {

    public InputDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        InputDescription inputDescription = new InputDescription();

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
                if (context.testExpression("InputId", targetDepth)) {
                    context.nextToken();
                    inputDescription.setInputId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NamePrefix", targetDepth)) {
                    context.nextToken();
                    inputDescription.setNamePrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InAppStreamNames", targetDepth)) {
                    context.nextToken();
                    inputDescription.setInAppStreamNames(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("InputProcessingConfigurationDescription", targetDepth)) {
                    context.nextToken();
                    inputDescription.setInputProcessingConfigurationDescription(InputProcessingConfigurationDescriptionJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("KinesisStreamsInputDescription", targetDepth)) {
                    context.nextToken();
                    inputDescription.setKinesisStreamsInputDescription(KinesisStreamsInputDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("KinesisFirehoseInputDescription", targetDepth)) {
                    context.nextToken();
                    inputDescription.setKinesisFirehoseInputDescription(KinesisFirehoseInputDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InputSchema", targetDepth)) {
                    context.nextToken();
                    inputDescription.setInputSchema(SourceSchemaJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InputParallelism", targetDepth)) {
                    context.nextToken();
                    inputDescription.setInputParallelism(InputParallelismJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InputStartingPositionConfiguration", targetDepth)) {
                    context.nextToken();
                    inputDescription
                            .setInputStartingPositionConfiguration(InputStartingPositionConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return inputDescription;
    }

    private static InputDescriptionJsonUnmarshaller instance;

    public static InputDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InputDescriptionJsonUnmarshaller();
        return instance;
    }
}
