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
package com.amazonaws.services.pinpoint.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ApplicationSettingsResource JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationSettingsResourceJsonUnmarshaller implements Unmarshaller<ApplicationSettingsResource, JsonUnmarshallerContext> {

    public ApplicationSettingsResource unmarshall(JsonUnmarshallerContext context) throws Exception {
        ApplicationSettingsResource applicationSettingsResource = new ApplicationSettingsResource();

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
                if (context.testExpression("ApplicationId", targetDepth)) {
                    context.nextToken();
                    applicationSettingsResource.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CampaignHook", targetDepth)) {
                    context.nextToken();
                    applicationSettingsResource.setCampaignHook(CampaignHookJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastModifiedDate", targetDepth)) {
                    context.nextToken();
                    applicationSettingsResource.setLastModifiedDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Limits", targetDepth)) {
                    context.nextToken();
                    applicationSettingsResource.setLimits(CampaignLimitsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("QuietTime", targetDepth)) {
                    context.nextToken();
                    applicationSettingsResource.setQuietTime(QuietTimeJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return applicationSettingsResource;
    }

    private static ApplicationSettingsResourceJsonUnmarshaller instance;

    public static ApplicationSettingsResourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ApplicationSettingsResourceJsonUnmarshaller();
        return instance;
    }
}
