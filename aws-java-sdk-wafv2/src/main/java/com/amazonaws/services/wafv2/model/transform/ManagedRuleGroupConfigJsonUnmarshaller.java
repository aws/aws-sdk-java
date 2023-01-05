/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wafv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.wafv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ManagedRuleGroupConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedRuleGroupConfigJsonUnmarshaller implements Unmarshaller<ManagedRuleGroupConfig, JsonUnmarshallerContext> {

    public ManagedRuleGroupConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        ManagedRuleGroupConfig managedRuleGroupConfig = new ManagedRuleGroupConfig();

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
                if (context.testExpression("LoginPath", targetDepth)) {
                    context.nextToken();
                    managedRuleGroupConfig.setLoginPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PayloadType", targetDepth)) {
                    context.nextToken();
                    managedRuleGroupConfig.setPayloadType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UsernameField", targetDepth)) {
                    context.nextToken();
                    managedRuleGroupConfig.setUsernameField(UsernameFieldJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PasswordField", targetDepth)) {
                    context.nextToken();
                    managedRuleGroupConfig.setPasswordField(PasswordFieldJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AWSManagedRulesBotControlRuleSet", targetDepth)) {
                    context.nextToken();
                    managedRuleGroupConfig.setAWSManagedRulesBotControlRuleSet(AWSManagedRulesBotControlRuleSetJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return managedRuleGroupConfig;
    }

    private static ManagedRuleGroupConfigJsonUnmarshaller instance;

    public static ManagedRuleGroupConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ManagedRuleGroupConfigJsonUnmarshaller();
        return instance;
    }
}
