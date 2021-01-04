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
package com.amazonaws.services.ssoadmin.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ssoadmin.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AccountAssignmentOperationStatus JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountAssignmentOperationStatusJsonUnmarshaller implements Unmarshaller<AccountAssignmentOperationStatus, JsonUnmarshallerContext> {

    public AccountAssignmentOperationStatus unmarshall(JsonUnmarshallerContext context) throws Exception {
        AccountAssignmentOperationStatus accountAssignmentOperationStatus = new AccountAssignmentOperationStatus();

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
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    accountAssignmentOperationStatus.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RequestId", targetDepth)) {
                    context.nextToken();
                    accountAssignmentOperationStatus.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    accountAssignmentOperationStatus.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetId", targetDepth)) {
                    context.nextToken();
                    accountAssignmentOperationStatus.setTargetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetType", targetDepth)) {
                    context.nextToken();
                    accountAssignmentOperationStatus.setTargetType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PermissionSetArn", targetDepth)) {
                    context.nextToken();
                    accountAssignmentOperationStatus.setPermissionSetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PrincipalType", targetDepth)) {
                    context.nextToken();
                    accountAssignmentOperationStatus.setPrincipalType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PrincipalId", targetDepth)) {
                    context.nextToken();
                    accountAssignmentOperationStatus.setPrincipalId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedDate", targetDepth)) {
                    context.nextToken();
                    accountAssignmentOperationStatus.setCreatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return accountAssignmentOperationStatus;
    }

    private static AccountAssignmentOperationStatusJsonUnmarshaller instance;

    public static AccountAssignmentOperationStatusJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AccountAssignmentOperationStatusJsonUnmarshaller();
        return instance;
    }
}
