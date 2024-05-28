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
package com.amazonaws.services.timestreamwrite.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.timestreamwrite.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CsvConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CsvConfigurationJsonUnmarshaller implements Unmarshaller<CsvConfiguration, JsonUnmarshallerContext> {

    public CsvConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        CsvConfiguration csvConfiguration = new CsvConfiguration();

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
                if (context.testExpression("ColumnSeparator", targetDepth)) {
                    context.nextToken();
                    csvConfiguration.setColumnSeparator(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EscapeChar", targetDepth)) {
                    context.nextToken();
                    csvConfiguration.setEscapeChar(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QuoteChar", targetDepth)) {
                    context.nextToken();
                    csvConfiguration.setQuoteChar(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NullValue", targetDepth)) {
                    context.nextToken();
                    csvConfiguration.setNullValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TrimWhiteSpace", targetDepth)) {
                    context.nextToken();
                    csvConfiguration.setTrimWhiteSpace(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return csvConfiguration;
    }

    private static CsvConfigurationJsonUnmarshaller instance;

    public static CsvConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CsvConfigurationJsonUnmarshaller();
        return instance;
    }
}
