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
 * Ibm3624NaturalPin JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ibm3624NaturalPinJsonUnmarshaller implements Unmarshaller<Ibm3624NaturalPin, JsonUnmarshallerContext> {

    public Ibm3624NaturalPin unmarshall(JsonUnmarshallerContext context) throws Exception {
        Ibm3624NaturalPin ibm3624NaturalPin = new Ibm3624NaturalPin();

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
                    ibm3624NaturalPin.setDecimalizationTable(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PinValidationData", targetDepth)) {
                    context.nextToken();
                    ibm3624NaturalPin.setPinValidationData(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PinValidationDataPadCharacter", targetDepth)) {
                    context.nextToken();
                    ibm3624NaturalPin.setPinValidationDataPadCharacter(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return ibm3624NaturalPin;
    }

    private static Ibm3624NaturalPinJsonUnmarshaller instance;

    public static Ibm3624NaturalPinJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Ibm3624NaturalPinJsonUnmarshaller();
        return instance;
    }
}
