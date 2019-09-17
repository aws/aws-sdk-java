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
package com.amazonaws.services.organizations.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.organizations.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateAccountStatus JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAccountStatusJsonUnmarshaller implements Unmarshaller<CreateAccountStatus, JsonUnmarshallerContext> {

    public CreateAccountStatus unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateAccountStatus createAccountStatus = new CreateAccountStatus();

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
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    createAccountStatus.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccountName", targetDepth)) {
                    context.nextToken();
                    createAccountStatus.setAccountName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    createAccountStatus.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RequestedTimestamp", targetDepth)) {
                    context.nextToken();
                    createAccountStatus.setRequestedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompletedTimestamp", targetDepth)) {
                    context.nextToken();
                    createAccountStatus.setCompletedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AccountId", targetDepth)) {
                    context.nextToken();
                    createAccountStatus.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GovCloudAccountId", targetDepth)) {
                    context.nextToken();
                    createAccountStatus.setGovCloudAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    createAccountStatus.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createAccountStatus;
    }

    private static CreateAccountStatusJsonUnmarshaller instance;

    public static CreateAccountStatusJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateAccountStatusJsonUnmarshaller();
        return instance;
    }
}
