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
package com.amazonaws.services.servicecatalog.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ProvisioningPreferences JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisioningPreferencesJsonUnmarshaller implements Unmarshaller<ProvisioningPreferences, JsonUnmarshallerContext> {

    public ProvisioningPreferences unmarshall(JsonUnmarshallerContext context) throws Exception {
        ProvisioningPreferences provisioningPreferences = new ProvisioningPreferences();

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
                if (context.testExpression("StackSetAccounts", targetDepth)) {
                    context.nextToken();
                    provisioningPreferences.setStackSetAccounts(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("StackSetRegions", targetDepth)) {
                    context.nextToken();
                    provisioningPreferences.setStackSetRegions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("StackSetFailureToleranceCount", targetDepth)) {
                    context.nextToken();
                    provisioningPreferences.setStackSetFailureToleranceCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("StackSetFailureTolerancePercentage", targetDepth)) {
                    context.nextToken();
                    provisioningPreferences.setStackSetFailureTolerancePercentage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("StackSetMaxConcurrencyCount", targetDepth)) {
                    context.nextToken();
                    provisioningPreferences.setStackSetMaxConcurrencyCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("StackSetMaxConcurrencyPercentage", targetDepth)) {
                    context.nextToken();
                    provisioningPreferences.setStackSetMaxConcurrencyPercentage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return provisioningPreferences;
    }

    private static ProvisioningPreferencesJsonUnmarshaller instance;

    public static ProvisioningPreferencesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProvisioningPreferencesJsonUnmarshaller();
        return instance;
    }
}
