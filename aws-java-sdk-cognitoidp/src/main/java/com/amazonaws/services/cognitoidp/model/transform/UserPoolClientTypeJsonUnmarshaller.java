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
package com.amazonaws.services.cognitoidp.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UserPoolClientType JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserPoolClientTypeJsonUnmarshaller implements Unmarshaller<UserPoolClientType, JsonUnmarshallerContext> {

    public UserPoolClientType unmarshall(JsonUnmarshallerContext context) throws Exception {
        UserPoolClientType userPoolClientType = new UserPoolClientType();

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
                if (context.testExpression("UserPoolId", targetDepth)) {
                    context.nextToken();
                    userPoolClientType.setUserPoolId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClientName", targetDepth)) {
                    context.nextToken();
                    userPoolClientType.setClientName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClientId", targetDepth)) {
                    context.nextToken();
                    userPoolClientType.setClientId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClientSecret", targetDepth)) {
                    context.nextToken();
                    userPoolClientType.setClientSecret(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedDate", targetDepth)) {
                    context.nextToken();
                    userPoolClientType.setLastModifiedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    context.nextToken();
                    userPoolClientType.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("RefreshTokenValidity", targetDepth)) {
                    context.nextToken();
                    userPoolClientType.setRefreshTokenValidity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ReadAttributes", targetDepth)) {
                    context.nextToken();
                    userPoolClientType.setReadAttributes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("WriteAttributes", targetDepth)) {
                    context.nextToken();
                    userPoolClientType.setWriteAttributes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("ExplicitAuthFlows", targetDepth)) {
                    context.nextToken();
                    userPoolClientType.setExplicitAuthFlows(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("SupportedIdentityProviders", targetDepth)) {
                    context.nextToken();
                    userPoolClientType.setSupportedIdentityProviders(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("CallbackURLs", targetDepth)) {
                    context.nextToken();
                    userPoolClientType.setCallbackURLs(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("LogoutURLs", targetDepth)) {
                    context.nextToken();
                    userPoolClientType.setLogoutURLs(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("DefaultRedirectURI", targetDepth)) {
                    context.nextToken();
                    userPoolClientType.setDefaultRedirectURI(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AllowedOAuthFlows", targetDepth)) {
                    context.nextToken();
                    userPoolClientType.setAllowedOAuthFlows(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("AllowedOAuthScopes", targetDepth)) {
                    context.nextToken();
                    userPoolClientType.setAllowedOAuthScopes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("AllowedOAuthFlowsUserPoolClient", targetDepth)) {
                    context.nextToken();
                    userPoolClientType.setAllowedOAuthFlowsUserPoolClient(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("AnalyticsConfiguration", targetDepth)) {
                    context.nextToken();
                    userPoolClientType.setAnalyticsConfiguration(AnalyticsConfigurationTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return userPoolClientType;
    }

    private static UserPoolClientTypeJsonUnmarshaller instance;

    public static UserPoolClientTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UserPoolClientTypeJsonUnmarshaller();
        return instance;
    }
}
