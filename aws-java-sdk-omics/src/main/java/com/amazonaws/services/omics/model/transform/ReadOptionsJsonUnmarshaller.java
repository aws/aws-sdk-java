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
package com.amazonaws.services.omics.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.omics.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReadOptions JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReadOptionsJsonUnmarshaller implements Unmarshaller<ReadOptions, JsonUnmarshallerContext> {

    public ReadOptions unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReadOptions readOptions = new ReadOptions();

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
                if (context.testExpression("comment", targetDepth)) {
                    context.nextToken();
                    readOptions.setComment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("encoding", targetDepth)) {
                    context.nextToken();
                    readOptions.setEncoding(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("escape", targetDepth)) {
                    context.nextToken();
                    readOptions.setEscape(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("escapeQuotes", targetDepth)) {
                    context.nextToken();
                    readOptions.setEscapeQuotes(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("header", targetDepth)) {
                    context.nextToken();
                    readOptions.setHeader(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("lineSep", targetDepth)) {
                    context.nextToken();
                    readOptions.setLineSep(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("quote", targetDepth)) {
                    context.nextToken();
                    readOptions.setQuote(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("quoteAll", targetDepth)) {
                    context.nextToken();
                    readOptions.setQuoteAll(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("sep", targetDepth)) {
                    context.nextToken();
                    readOptions.setSep(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return readOptions;
    }

    private static ReadOptionsJsonUnmarshaller instance;

    public static ReadOptionsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReadOptionsJsonUnmarshaller();
        return instance;
    }
}
