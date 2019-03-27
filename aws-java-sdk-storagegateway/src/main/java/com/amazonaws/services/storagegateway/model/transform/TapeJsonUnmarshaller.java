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
package com.amazonaws.services.storagegateway.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Tape JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TapeJsonUnmarshaller implements Unmarshaller<Tape, JsonUnmarshallerContext> {

    public Tape unmarshall(JsonUnmarshallerContext context) throws Exception {
        Tape tape = new Tape();

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
                if (context.testExpression("TapeARN", targetDepth)) {
                    context.nextToken();
                    tape.setTapeARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TapeBarcode", targetDepth)) {
                    context.nextToken();
                    tape.setTapeBarcode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TapeCreatedDate", targetDepth)) {
                    context.nextToken();
                    tape.setTapeCreatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TapeSizeInBytes", targetDepth)) {
                    context.nextToken();
                    tape.setTapeSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("TapeStatus", targetDepth)) {
                    context.nextToken();
                    tape.setTapeStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VTLDevice", targetDepth)) {
                    context.nextToken();
                    tape.setVTLDevice(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Progress", targetDepth)) {
                    context.nextToken();
                    tape.setProgress(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("TapeUsedInBytes", targetDepth)) {
                    context.nextToken();
                    tape.setTapeUsedInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("KMSKey", targetDepth)) {
                    context.nextToken();
                    tape.setKMSKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PoolId", targetDepth)) {
                    context.nextToken();
                    tape.setPoolId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return tape;
    }

    private static TapeJsonUnmarshaller instance;

    public static TapeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TapeJsonUnmarshaller();
        return instance;
    }
}
