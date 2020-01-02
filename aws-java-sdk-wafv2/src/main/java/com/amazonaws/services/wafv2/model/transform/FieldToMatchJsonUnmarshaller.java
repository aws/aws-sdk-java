/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wafv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.wafv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * FieldToMatch JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldToMatchJsonUnmarshaller implements Unmarshaller<FieldToMatch, JsonUnmarshallerContext> {

    public FieldToMatch unmarshall(JsonUnmarshallerContext context) throws Exception {
        FieldToMatch fieldToMatch = new FieldToMatch();

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
                if (context.testExpression("SingleHeader", targetDepth)) {
                    context.nextToken();
                    fieldToMatch.setSingleHeader(SingleHeaderJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SingleQueryArgument", targetDepth)) {
                    context.nextToken();
                    fieldToMatch.setSingleQueryArgument(SingleQueryArgumentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AllQueryArguments", targetDepth)) {
                    context.nextToken();
                    fieldToMatch.setAllQueryArguments(AllQueryArgumentsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("UriPath", targetDepth)) {
                    context.nextToken();
                    fieldToMatch.setUriPath(UriPathJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("QueryString", targetDepth)) {
                    context.nextToken();
                    fieldToMatch.setQueryString(QueryStringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Body", targetDepth)) {
                    context.nextToken();
                    fieldToMatch.setBody(BodyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Method", targetDepth)) {
                    context.nextToken();
                    fieldToMatch.setMethod(MethodJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return fieldToMatch;
    }

    private static FieldToMatchJsonUnmarshaller instance;

    public static FieldToMatchJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FieldToMatchJsonUnmarshaller();
        return instance;
    }
}
