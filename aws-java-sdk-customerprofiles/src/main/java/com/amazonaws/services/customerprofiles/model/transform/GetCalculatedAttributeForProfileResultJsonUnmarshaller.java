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
package com.amazonaws.services.customerprofiles.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.customerprofiles.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetCalculatedAttributeForProfileResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCalculatedAttributeForProfileResultJsonUnmarshaller implements Unmarshaller<GetCalculatedAttributeForProfileResult, JsonUnmarshallerContext> {

    public GetCalculatedAttributeForProfileResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetCalculatedAttributeForProfileResult getCalculatedAttributeForProfileResult = new GetCalculatedAttributeForProfileResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getCalculatedAttributeForProfileResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("CalculatedAttributeName", targetDepth)) {
                    context.nextToken();
                    getCalculatedAttributeForProfileResult.setCalculatedAttributeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisplayName", targetDepth)) {
                    context.nextToken();
                    getCalculatedAttributeForProfileResult.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsDataPartial", targetDepth)) {
                    context.nextToken();
                    getCalculatedAttributeForProfileResult.setIsDataPartial(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Value", targetDepth)) {
                    context.nextToken();
                    getCalculatedAttributeForProfileResult.setValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getCalculatedAttributeForProfileResult;
    }

    private static GetCalculatedAttributeForProfileResultJsonUnmarshaller instance;

    public static GetCalculatedAttributeForProfileResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetCalculatedAttributeForProfileResultJsonUnmarshaller();
        return instance;
    }
}
