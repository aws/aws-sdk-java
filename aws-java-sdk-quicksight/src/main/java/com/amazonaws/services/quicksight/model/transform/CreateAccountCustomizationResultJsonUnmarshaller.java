/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * CreateAccountCustomizationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAccountCustomizationResultJsonUnmarshaller implements Unmarshaller<CreateAccountCustomizationResult, JsonUnmarshallerContext> {

    public CreateAccountCustomizationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateAccountCustomizationResult createAccountCustomizationResult = new CreateAccountCustomizationResult();

        createAccountCustomizationResult.setStatus(context.getHttpResponse().getStatusCode());

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createAccountCustomizationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    createAccountCustomizationResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AwsAccountId", targetDepth)) {
                    context.nextToken();
                    createAccountCustomizationResult.setAwsAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Namespace", targetDepth)) {
                    context.nextToken();
                    createAccountCustomizationResult.setNamespace(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccountCustomization", targetDepth)) {
                    context.nextToken();
                    createAccountCustomizationResult.setAccountCustomization(AccountCustomizationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RequestId", targetDepth)) {
                    context.nextToken();
                    createAccountCustomizationResult.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createAccountCustomizationResult;
    }

    private static CreateAccountCustomizationResultJsonUnmarshaller instance;

    public static CreateAccountCustomizationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateAccountCustomizationResultJsonUnmarshaller();
        return instance;
    }
}
