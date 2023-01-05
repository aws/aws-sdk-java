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
package com.amazonaws.services.quicksight.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CurrencyDisplayFormatConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CurrencyDisplayFormatConfigurationJsonUnmarshaller implements Unmarshaller<CurrencyDisplayFormatConfiguration, JsonUnmarshallerContext> {

    public CurrencyDisplayFormatConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        CurrencyDisplayFormatConfiguration currencyDisplayFormatConfiguration = new CurrencyDisplayFormatConfiguration();

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
                if (context.testExpression("Prefix", targetDepth)) {
                    context.nextToken();
                    currencyDisplayFormatConfiguration.setPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Suffix", targetDepth)) {
                    context.nextToken();
                    currencyDisplayFormatConfiguration.setSuffix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SeparatorConfiguration", targetDepth)) {
                    context.nextToken();
                    currencyDisplayFormatConfiguration.setSeparatorConfiguration(NumericSeparatorConfigurationJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("Symbol", targetDepth)) {
                    context.nextToken();
                    currencyDisplayFormatConfiguration.setSymbol(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DecimalPlacesConfiguration", targetDepth)) {
                    context.nextToken();
                    currencyDisplayFormatConfiguration.setDecimalPlacesConfiguration(DecimalPlacesConfigurationJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("NumberScale", targetDepth)) {
                    context.nextToken();
                    currencyDisplayFormatConfiguration.setNumberScale(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NegativeValueConfiguration", targetDepth)) {
                    context.nextToken();
                    currencyDisplayFormatConfiguration.setNegativeValueConfiguration(NegativeValueConfigurationJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("NullValueFormatConfiguration", targetDepth)) {
                    context.nextToken();
                    currencyDisplayFormatConfiguration.setNullValueFormatConfiguration(NullValueFormatConfigurationJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return currencyDisplayFormatConfiguration;
    }

    private static CurrencyDisplayFormatConfigurationJsonUnmarshaller instance;

    public static CurrencyDisplayFormatConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CurrencyDisplayFormatConfigurationJsonUnmarshaller();
        return instance;
    }
}
