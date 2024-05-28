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
package com.amazonaws.services.paymentcryptographydata.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.paymentcryptographydata.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Ibm3624PinVerification JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ibm3624PinVerificationJsonUnmarshaller implements Unmarshaller<Ibm3624PinVerification, JsonUnmarshallerContext> {

    public Ibm3624PinVerification unmarshall(JsonUnmarshallerContext context) throws Exception {
        Ibm3624PinVerification ibm3624PinVerification = new Ibm3624PinVerification();

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
                if (context.testExpression("DecimalizationTable", targetDepth)) {
                    context.nextToken();
                    ibm3624PinVerification.setDecimalizationTable(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PinOffset", targetDepth)) {
                    context.nextToken();
                    ibm3624PinVerification.setPinOffset(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PinValidationData", targetDepth)) {
                    context.nextToken();
                    ibm3624PinVerification.setPinValidationData(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PinValidationDataPadCharacter", targetDepth)) {
                    context.nextToken();
                    ibm3624PinVerification.setPinValidationDataPadCharacter(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return ibm3624PinVerification;
    }

    private static Ibm3624PinVerificationJsonUnmarshaller instance;

    public static Ibm3624PinVerificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Ibm3624PinVerificationJsonUnmarshaller();
        return instance;
    }
}
