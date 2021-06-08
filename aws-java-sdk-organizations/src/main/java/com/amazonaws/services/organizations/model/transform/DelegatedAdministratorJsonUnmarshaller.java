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
package com.amazonaws.services.organizations.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.organizations.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DelegatedAdministrator JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DelegatedAdministratorJsonUnmarshaller implements Unmarshaller<DelegatedAdministrator, JsonUnmarshallerContext> {

    public DelegatedAdministrator unmarshall(JsonUnmarshallerContext context) throws Exception {
        DelegatedAdministrator delegatedAdministrator = new DelegatedAdministrator();

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
                    delegatedAdministrator.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    delegatedAdministrator.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Email", targetDepth)) {
                    context.nextToken();
                    delegatedAdministrator.setEmail(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    delegatedAdministrator.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    delegatedAdministrator.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JoinedMethod", targetDepth)) {
                    context.nextToken();
                    delegatedAdministrator.setJoinedMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JoinedTimestamp", targetDepth)) {
                    context.nextToken();
                    delegatedAdministrator.setJoinedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DelegationEnabledDate", targetDepth)) {
                    context.nextToken();
                    delegatedAdministrator.setDelegationEnabledDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return delegatedAdministrator;
    }

    private static DelegatedAdministratorJsonUnmarshaller instance;

    public static DelegatedAdministratorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DelegatedAdministratorJsonUnmarshaller();
        return instance;
    }
}
