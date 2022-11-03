/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workmail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.workmail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetImpersonationRoleEffectResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetImpersonationRoleEffectResultJsonUnmarshaller implements Unmarshaller<GetImpersonationRoleEffectResult, JsonUnmarshallerContext> {

    public GetImpersonationRoleEffectResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetImpersonationRoleEffectResult getImpersonationRoleEffectResult = new GetImpersonationRoleEffectResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getImpersonationRoleEffectResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    getImpersonationRoleEffectResult.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Effect", targetDepth)) {
                    context.nextToken();
                    getImpersonationRoleEffectResult.setEffect(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MatchedRules", targetDepth)) {
                    context.nextToken();
                    getImpersonationRoleEffectResult.setMatchedRules(new ListUnmarshaller<ImpersonationMatchedRule>(ImpersonationMatchedRuleJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getImpersonationRoleEffectResult;
    }

    private static GetImpersonationRoleEffectResultJsonUnmarshaller instance;

    public static GetImpersonationRoleEffectResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetImpersonationRoleEffectResultJsonUnmarshaller();
        return instance;
    }
}
