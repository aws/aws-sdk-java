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
package com.amazonaws.services.kendra.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DocumentAttributeValue JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentAttributeValueJsonUnmarshaller implements Unmarshaller<DocumentAttributeValue, JsonUnmarshallerContext> {

    public DocumentAttributeValue unmarshall(JsonUnmarshallerContext context) throws Exception {
        DocumentAttributeValue documentAttributeValue = new DocumentAttributeValue();

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
                if (context.testExpression("StringValue", targetDepth)) {
                    context.nextToken();
                    documentAttributeValue.setStringValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StringListValue", targetDepth)) {
                    context.nextToken();
                    documentAttributeValue.setStringListValue(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("LongValue", targetDepth)) {
                    context.nextToken();
                    documentAttributeValue.setLongValue(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("DateValue", targetDepth)) {
                    context.nextToken();
                    documentAttributeValue.setDateValue(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return documentAttributeValue;
    }

    private static DocumentAttributeValueJsonUnmarshaller instance;

    public static DocumentAttributeValueJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DocumentAttributeValueJsonUnmarshaller();
        return instance;
    }
}
