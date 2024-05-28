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
package com.amazonaws.services.appfabric.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appfabric.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AppAuthorizationSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppAuthorizationSummaryJsonUnmarshaller implements Unmarshaller<AppAuthorizationSummary, JsonUnmarshallerContext> {

    public AppAuthorizationSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AppAuthorizationSummary appAuthorizationSummary = new AppAuthorizationSummary();

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
                if (context.testExpression("appAuthorizationArn", targetDepth)) {
                    context.nextToken();
                    appAuthorizationSummary.setAppAuthorizationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("appBundleArn", targetDepth)) {
                    context.nextToken();
                    appAuthorizationSummary.setAppBundleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("app", targetDepth)) {
                    context.nextToken();
                    appAuthorizationSummary.setApp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tenant", targetDepth)) {
                    context.nextToken();
                    appAuthorizationSummary.setTenant(TenantJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    appAuthorizationSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    appAuthorizationSummary.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return appAuthorizationSummary;
    }

    private static AppAuthorizationSummaryJsonUnmarshaller instance;

    public static AppAuthorizationSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AppAuthorizationSummaryJsonUnmarshaller();
        return instance;
    }
}
