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
package com.amazonaws.services.licensemanagerlinuxsubscriptions.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.licensemanagerlinuxsubscriptions.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateServiceSettingsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServiceSettingsResultJsonUnmarshaller implements Unmarshaller<UpdateServiceSettingsResult, JsonUnmarshallerContext> {

    public UpdateServiceSettingsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateServiceSettingsResult updateServiceSettingsResult = new UpdateServiceSettingsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateServiceSettingsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("HomeRegions", targetDepth)) {
                    context.nextToken();
                    updateServiceSettingsResult.setHomeRegions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("LinuxSubscriptionsDiscovery", targetDepth)) {
                    context.nextToken();
                    updateServiceSettingsResult.setLinuxSubscriptionsDiscovery(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LinuxSubscriptionsDiscoverySettings", targetDepth)) {
                    context.nextToken();
                    updateServiceSettingsResult.setLinuxSubscriptionsDiscoverySettings(LinuxSubscriptionsDiscoverySettingsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    updateServiceSettingsResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    context.nextToken();
                    updateServiceSettingsResult.setStatusMessage(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateServiceSettingsResult;
    }

    private static UpdateServiceSettingsResultJsonUnmarshaller instance;

    public static UpdateServiceSettingsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateServiceSettingsResultJsonUnmarshaller();
        return instance;
    }
}
