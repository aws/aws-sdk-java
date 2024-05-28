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
 * IsAuthorizedWithTokenResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IsAuthorizedWithTokenResultJsonUnmarshaller implements Unmarshaller<IsAuthorizedWithTokenResult, JsonUnmarshallerContext> {

    public IsAuthorizedWithTokenResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        IsAuthorizedWithTokenResult isAuthorizedWithTokenResult = new IsAuthorizedWithTokenResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return isAuthorizedWithTokenResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("decision", targetDepth)) {
                    context.nextToken();
                    isAuthorizedWithTokenResult.setDecision(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("determiningPolicies", targetDepth)) {
                    context.nextToken();
                    isAuthorizedWithTokenResult.setDeterminingPolicies(new ListUnmarshaller<DeterminingPolicyItem>(DeterminingPolicyItemJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("errors", targetDepth)) {
                    context.nextToken();
                    isAuthorizedWithTokenResult.setErrors(new ListUnmarshaller<EvaluationErrorItem>(EvaluationErrorItemJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("principal", targetDepth)) {
                    context.nextToken();
                    isAuthorizedWithTokenResult.setPrincipal(EntityIdentifierJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return isAuthorizedWithTokenResult;
    }

    private static IsAuthorizedWithTokenResultJsonUnmarshaller instance;

    public static IsAuthorizedWithTokenResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new IsAuthorizedWithTokenResultJsonUnmarshaller();
        return instance;
    }
}
