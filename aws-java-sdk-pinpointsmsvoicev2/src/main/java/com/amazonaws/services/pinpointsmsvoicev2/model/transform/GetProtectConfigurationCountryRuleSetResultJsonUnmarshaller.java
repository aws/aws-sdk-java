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
package com.amazonaws.services.pinpointsmsvoicev2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpointsmsvoicev2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetProtectConfigurationCountryRuleSetResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProtectConfigurationCountryRuleSetResultJsonUnmarshaller implements
        Unmarshaller<GetProtectConfigurationCountryRuleSetResult, JsonUnmarshallerContext> {

    public GetProtectConfigurationCountryRuleSetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetProtectConfigurationCountryRuleSetResult getProtectConfigurationCountryRuleSetResult = new GetProtectConfigurationCountryRuleSetResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getProtectConfigurationCountryRuleSetResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ProtectConfigurationArn", targetDepth)) {
                    context.nextToken();
                    getProtectConfigurationCountryRuleSetResult.setProtectConfigurationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProtectConfigurationId", targetDepth)) {
                    context.nextToken();
                    getProtectConfigurationCountryRuleSetResult.setProtectConfigurationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NumberCapability", targetDepth)) {
                    context.nextToken();
                    getProtectConfigurationCountryRuleSetResult.setNumberCapability(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CountryRuleSet", targetDepth)) {
                    context.nextToken();
                    getProtectConfigurationCountryRuleSetResult.setCountryRuleSet(new MapUnmarshaller<String, ProtectConfigurationCountryRuleSetInformation>(
                            context.getUnmarshaller(String.class), ProtectConfigurationCountryRuleSetInformationJsonUnmarshaller.getInstance())
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

        return getProtectConfigurationCountryRuleSetResult;
    }

    private static GetProtectConfigurationCountryRuleSetResultJsonUnmarshaller instance;

    public static GetProtectConfigurationCountryRuleSetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetProtectConfigurationCountryRuleSetResultJsonUnmarshaller();
        return instance;
    }
}
