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
package com.amazonaws.services.networkfirewall.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.networkfirewall.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateFirewallEncryptionConfigurationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFirewallEncryptionConfigurationResultJsonUnmarshaller implements
        Unmarshaller<UpdateFirewallEncryptionConfigurationResult, JsonUnmarshallerContext> {

    public UpdateFirewallEncryptionConfigurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateFirewallEncryptionConfigurationResult updateFirewallEncryptionConfigurationResult = new UpdateFirewallEncryptionConfigurationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateFirewallEncryptionConfigurationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("FirewallArn", targetDepth)) {
                    context.nextToken();
                    updateFirewallEncryptionConfigurationResult.setFirewallArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FirewallName", targetDepth)) {
                    context.nextToken();
                    updateFirewallEncryptionConfigurationResult.setFirewallName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UpdateToken", targetDepth)) {
                    context.nextToken();
                    updateFirewallEncryptionConfigurationResult.setUpdateToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EncryptionConfiguration", targetDepth)) {
                    context.nextToken();
                    updateFirewallEncryptionConfigurationResult.setEncryptionConfiguration(EncryptionConfigurationJsonUnmarshaller.getInstance().unmarshall(
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

        return updateFirewallEncryptionConfigurationResult;
    }

    private static UpdateFirewallEncryptionConfigurationResultJsonUnmarshaller instance;

    public static UpdateFirewallEncryptionConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateFirewallEncryptionConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
