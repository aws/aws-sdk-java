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
 * CardGenerationAttributes JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CardGenerationAttributesJsonUnmarshaller implements Unmarshaller<CardGenerationAttributes, JsonUnmarshallerContext> {

    public CardGenerationAttributes unmarshall(JsonUnmarshallerContext context) throws Exception {
        CardGenerationAttributes cardGenerationAttributes = new CardGenerationAttributes();

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
                if (context.testExpression("AmexCardSecurityCodeVersion1", targetDepth)) {
                    context.nextToken();
                    cardGenerationAttributes.setAmexCardSecurityCodeVersion1(AmexCardSecurityCodeVersion1JsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AmexCardSecurityCodeVersion2", targetDepth)) {
                    context.nextToken();
                    cardGenerationAttributes.setAmexCardSecurityCodeVersion2(AmexCardSecurityCodeVersion2JsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CardHolderVerificationValue", targetDepth)) {
                    context.nextToken();
                    cardGenerationAttributes.setCardHolderVerificationValue(CardHolderVerificationValueJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CardVerificationValue1", targetDepth)) {
                    context.nextToken();
                    cardGenerationAttributes.setCardVerificationValue1(CardVerificationValue1JsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CardVerificationValue2", targetDepth)) {
                    context.nextToken();
                    cardGenerationAttributes.setCardVerificationValue2(CardVerificationValue2JsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DynamicCardVerificationCode", targetDepth)) {
                    context.nextToken();
                    cardGenerationAttributes.setDynamicCardVerificationCode(DynamicCardVerificationCodeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DynamicCardVerificationValue", targetDepth)) {
                    context.nextToken();
                    cardGenerationAttributes.setDynamicCardVerificationValue(DynamicCardVerificationValueJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return cardGenerationAttributes;
    }

    private static CardGenerationAttributesJsonUnmarshaller instance;

    public static CardGenerationAttributesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CardGenerationAttributesJsonUnmarshaller();
        return instance;
    }
}
