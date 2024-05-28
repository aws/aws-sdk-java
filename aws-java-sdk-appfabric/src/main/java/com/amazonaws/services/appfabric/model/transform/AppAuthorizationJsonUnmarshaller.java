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
 * AppAuthorization JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppAuthorizationJsonUnmarshaller implements Unmarshaller<AppAuthorization, JsonUnmarshallerContext> {

    public AppAuthorization unmarshall(JsonUnmarshallerContext context) throws Exception {
        AppAuthorization appAuthorization = new AppAuthorization();

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
                    appAuthorization.setAppAuthorizationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("appBundleArn", targetDepth)) {
                    context.nextToken();
                    appAuthorization.setAppBundleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("app", targetDepth)) {
                    context.nextToken();
                    appAuthorization.setApp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tenant", targetDepth)) {
                    context.nextToken();
                    appAuthorization.setTenant(TenantJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("authType", targetDepth)) {
                    context.nextToken();
                    appAuthorization.setAuthType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    appAuthorization.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    appAuthorization.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    appAuthorization.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("persona", targetDepth)) {
                    context.nextToken();
                    appAuthorization.setPersona(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("authUrl", targetDepth)) {
                    context.nextToken();
                    appAuthorization.setAuthUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return appAuthorization;
    }

    private static AppAuthorizationJsonUnmarshaller instance;

    public static AppAuthorizationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AppAuthorizationJsonUnmarshaller();
        return instance;
    }
}
