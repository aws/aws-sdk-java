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
package com.amazonaws.services.iotfleetwise.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotfleetwise.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SignalDecoder JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SignalDecoderJsonUnmarshaller implements Unmarshaller<SignalDecoder, JsonUnmarshallerContext> {

    public SignalDecoder unmarshall(JsonUnmarshallerContext context) throws Exception {
        SignalDecoder signalDecoder = new SignalDecoder();

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
                if (context.testExpression("fullyQualifiedName", targetDepth)) {
                    context.nextToken();
                    signalDecoder.setFullyQualifiedName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    signalDecoder.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("interfaceId", targetDepth)) {
                    context.nextToken();
                    signalDecoder.setInterfaceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("canSignal", targetDepth)) {
                    context.nextToken();
                    signalDecoder.setCanSignal(CanSignalJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("obdSignal", targetDepth)) {
                    context.nextToken();
                    signalDecoder.setObdSignal(ObdSignalJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return signalDecoder;
    }

    private static SignalDecoderJsonUnmarshaller instance;

    public static SignalDecoderJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SignalDecoderJsonUnmarshaller();
        return instance;
    }
}
