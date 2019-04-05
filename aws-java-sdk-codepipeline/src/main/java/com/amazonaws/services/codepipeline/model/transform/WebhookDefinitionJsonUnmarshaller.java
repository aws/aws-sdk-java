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
package com.amazonaws.services.codepipeline.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * WebhookDefinition JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WebhookDefinitionJsonUnmarshaller implements Unmarshaller<WebhookDefinition, JsonUnmarshallerContext> {

    public WebhookDefinition unmarshall(JsonUnmarshallerContext context) throws Exception {
        WebhookDefinition webhookDefinition = new WebhookDefinition();

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
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    webhookDefinition.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targetPipeline", targetDepth)) {
                    context.nextToken();
                    webhookDefinition.setTargetPipeline(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targetAction", targetDepth)) {
                    context.nextToken();
                    webhookDefinition.setTargetAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("filters", targetDepth)) {
                    context.nextToken();
                    webhookDefinition.setFilters(new ListUnmarshaller<WebhookFilterRule>(WebhookFilterRuleJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("authentication", targetDepth)) {
                    context.nextToken();
                    webhookDefinition.setAuthentication(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("authenticationConfiguration", targetDepth)) {
                    context.nextToken();
                    webhookDefinition.setAuthenticationConfiguration(WebhookAuthConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return webhookDefinition;
    }

    private static WebhookDefinitionJsonUnmarshaller instance;

    public static WebhookDefinitionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WebhookDefinitionJsonUnmarshaller();
        return instance;
    }
}
