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
package com.amazonaws.services.macie2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UserIdentity JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserIdentityJsonUnmarshaller implements Unmarshaller<UserIdentity, JsonUnmarshallerContext> {

    public UserIdentity unmarshall(JsonUnmarshallerContext context) throws Exception {
        UserIdentity userIdentity = new UserIdentity();

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
                if (context.testExpression("assumedRole", targetDepth)) {
                    context.nextToken();
                    userIdentity.setAssumedRole(AssumedRoleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("awsAccount", targetDepth)) {
                    context.nextToken();
                    userIdentity.setAwsAccount(AwsAccountJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("awsService", targetDepth)) {
                    context.nextToken();
                    userIdentity.setAwsService(AwsServiceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("federatedUser", targetDepth)) {
                    context.nextToken();
                    userIdentity.setFederatedUser(FederatedUserJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("iamUser", targetDepth)) {
                    context.nextToken();
                    userIdentity.setIamUser(IamUserJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("root", targetDepth)) {
                    context.nextToken();
                    userIdentity.setRoot(UserIdentityRootJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    userIdentity.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return userIdentity;
    }

    private static UserIdentityJsonUnmarshaller instance;

    public static UserIdentityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UserIdentityJsonUnmarshaller();
        return instance;
    }
}
