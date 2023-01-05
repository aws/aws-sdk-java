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
package com.amazonaws.services.cloudwatchrum.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudwatchrum.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AppMonitorConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppMonitorConfigurationJsonUnmarshaller implements Unmarshaller<AppMonitorConfiguration, JsonUnmarshallerContext> {

    public AppMonitorConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        AppMonitorConfiguration appMonitorConfiguration = new AppMonitorConfiguration();

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
                if (context.testExpression("AllowCookies", targetDepth)) {
                    context.nextToken();
                    appMonitorConfiguration.setAllowCookies(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EnableXRay", targetDepth)) {
                    context.nextToken();
                    appMonitorConfiguration.setEnableXRay(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ExcludedPages", targetDepth)) {
                    context.nextToken();
                    appMonitorConfiguration.setExcludedPages(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("FavoritePages", targetDepth)) {
                    context.nextToken();
                    appMonitorConfiguration.setFavoritePages(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("GuestRoleArn", targetDepth)) {
                    context.nextToken();
                    appMonitorConfiguration.setGuestRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IdentityPoolId", targetDepth)) {
                    context.nextToken();
                    appMonitorConfiguration.setIdentityPoolId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IncludedPages", targetDepth)) {
                    context.nextToken();
                    appMonitorConfiguration.setIncludedPages(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SessionSampleRate", targetDepth)) {
                    context.nextToken();
                    appMonitorConfiguration.setSessionSampleRate(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("Telemetries", targetDepth)) {
                    context.nextToken();
                    appMonitorConfiguration.setTelemetries(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return appMonitorConfiguration;
    }

    private static AppMonitorConfigurationJsonUnmarshaller instance;

    public static AppMonitorConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AppMonitorConfigurationJsonUnmarshaller();
        return instance;
    }
}
