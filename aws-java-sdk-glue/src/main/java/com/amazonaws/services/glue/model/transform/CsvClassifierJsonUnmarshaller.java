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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CsvClassifier JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CsvClassifierJsonUnmarshaller implements Unmarshaller<CsvClassifier, JsonUnmarshallerContext> {

    public CsvClassifier unmarshall(JsonUnmarshallerContext context) throws Exception {
        CsvClassifier csvClassifier = new CsvClassifier();

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
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    csvClassifier.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    csvClassifier.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdated", targetDepth)) {
                    context.nextToken();
                    csvClassifier.setLastUpdated(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Version", targetDepth)) {
                    context.nextToken();
                    csvClassifier.setVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Delimiter", targetDepth)) {
                    context.nextToken();
                    csvClassifier.setDelimiter(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QuoteSymbol", targetDepth)) {
                    context.nextToken();
                    csvClassifier.setQuoteSymbol(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContainsHeader", targetDepth)) {
                    context.nextToken();
                    csvClassifier.setContainsHeader(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Header", targetDepth)) {
                    context.nextToken();
                    csvClassifier.setHeader(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("DisableValueTrimming", targetDepth)) {
                    context.nextToken();
                    csvClassifier.setDisableValueTrimming(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("AllowSingleColumn", targetDepth)) {
                    context.nextToken();
                    csvClassifier.setAllowSingleColumn(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return csvClassifier;
    }

    private static CsvClassifierJsonUnmarshaller instance;

    public static CsvClassifierJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CsvClassifierJsonUnmarshaller();
        return instance;
    }
}
