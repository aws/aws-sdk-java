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
 * UpdateProvisioningPreferences JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProvisioningPreferencesJsonUnmarshaller implements Unmarshaller<UpdateProvisioningPreferences, JsonUnmarshallerContext> {

    public UpdateProvisioningPreferences unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateProvisioningPreferences updateProvisioningPreferences = new UpdateProvisioningPreferences();

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
                    updateProvisioningPreferences.setStackSetAccounts(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("StackSetRegions", targetDepth)) {
                    context.nextToken();
                    updateProvisioningPreferences.setStackSetRegions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("StackSetFailureToleranceCount", targetDepth)) {
                    context.nextToken();
                    updateProvisioningPreferences.setStackSetFailureToleranceCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("StackSetFailureTolerancePercentage", targetDepth)) {
                    context.nextToken();
                    updateProvisioningPreferences.setStackSetFailureTolerancePercentage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("StackSetMaxConcurrencyCount", targetDepth)) {
                    context.nextToken();
                    updateProvisioningPreferences.setStackSetMaxConcurrencyCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("StackSetMaxConcurrencyPercentage", targetDepth)) {
                    context.nextToken();
                    updateProvisioningPreferences.setStackSetMaxConcurrencyPercentage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("StackSetOperationType", targetDepth)) {
                    context.nextToken();
                    updateProvisioningPreferences.setStackSetOperationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateProvisioningPreferences;
    }

    private static UpdateProvisioningPreferencesJsonUnmarshaller instance;

    public static UpdateProvisioningPreferencesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateProvisioningPreferencesJsonUnmarshaller();
        return instance;
    }
}
