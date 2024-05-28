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
 * PinGenerationAttributes JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PinGenerationAttributesJsonUnmarshaller implements Unmarshaller<PinGenerationAttributes, JsonUnmarshallerContext> {

    public PinGenerationAttributes unmarshall(JsonUnmarshallerContext context) throws Exception {
        PinGenerationAttributes pinGenerationAttributes = new PinGenerationAttributes();

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
                if (context.testExpression("Ibm3624NaturalPin", targetDepth)) {
                    context.nextToken();
                    pinGenerationAttributes.setIbm3624NaturalPin(Ibm3624NaturalPinJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Ibm3624PinFromOffset", targetDepth)) {
                    context.nextToken();
                    pinGenerationAttributes.setIbm3624PinFromOffset(Ibm3624PinFromOffsetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Ibm3624PinOffset", targetDepth)) {
                    context.nextToken();
                    pinGenerationAttributes.setIbm3624PinOffset(Ibm3624PinOffsetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Ibm3624RandomPin", targetDepth)) {
                    context.nextToken();
                    pinGenerationAttributes.setIbm3624RandomPin(Ibm3624RandomPinJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VisaPin", targetDepth)) {
                    context.nextToken();
                    pinGenerationAttributes.setVisaPin(VisaPinJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VisaPinVerificationValue", targetDepth)) {
                    context.nextToken();
                    pinGenerationAttributes.setVisaPinVerificationValue(VisaPinVerificationValueJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return pinGenerationAttributes;
    }

    private static PinGenerationAttributesJsonUnmarshaller instance;

    public static PinGenerationAttributesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PinGenerationAttributesJsonUnmarshaller();
        return instance;
    }
}
