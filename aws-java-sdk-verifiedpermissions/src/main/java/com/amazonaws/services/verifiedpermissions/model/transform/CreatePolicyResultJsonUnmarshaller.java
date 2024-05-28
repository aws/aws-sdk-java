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
package com.amazonaws.services.verifiedpermissions.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.verifiedpermissions.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreatePolicyResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePolicyResultJsonUnmarshaller implements Unmarshaller<CreatePolicyResult, JsonUnmarshallerContext> {

    public CreatePolicyResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreatePolicyResult createPolicyResult = new CreatePolicyResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createPolicyResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("policyStoreId", targetDepth)) {
                    context.nextToken();
                    createPolicyResult.setPolicyStoreId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("policyId", targetDepth)) {
                    context.nextToken();
                    createPolicyResult.setPolicyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("policyType", targetDepth)) {
                    context.nextToken();
                    createPolicyResult.setPolicyType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("principal", targetDepth)) {
                    context.nextToken();
                    createPolicyResult.setPrincipal(EntityIdentifierJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("resource", targetDepth)) {
                    context.nextToken();
                    createPolicyResult.setResource(EntityIdentifierJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("actions", targetDepth)) {
                    context.nextToken();
                    createPolicyResult.setActions(new ListUnmarshaller<ActionIdentifier>(ActionIdentifierJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("createdDate", targetDepth)) {
                    context.nextToken();
                    createPolicyResult.setCreatedDate(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDate", targetDepth)) {
                    context.nextToken();
                    createPolicyResult.setLastUpdatedDate(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("effect", targetDepth)) {
                    context.nextToken();
                    createPolicyResult.setEffect(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createPolicyResult;
    }

    private static CreatePolicyResultJsonUnmarshaller instance;

    public static CreatePolicyResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreatePolicyResultJsonUnmarshaller();
        return instance;
    }
}
