/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.eks.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.eks.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * OidcIdentityProviderConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OidcIdentityProviderConfigJsonUnmarshaller implements Unmarshaller<OidcIdentityProviderConfig, JsonUnmarshallerContext> {

    public OidcIdentityProviderConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        OidcIdentityProviderConfig oidcIdentityProviderConfig = new OidcIdentityProviderConfig();

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
                if (context.testExpression("identityProviderConfigName", targetDepth)) {
                    context.nextToken();
                    oidcIdentityProviderConfig.setIdentityProviderConfigName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("identityProviderConfigArn", targetDepth)) {
                    context.nextToken();
                    oidcIdentityProviderConfig.setIdentityProviderConfigArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clusterName", targetDepth)) {
                    context.nextToken();
                    oidcIdentityProviderConfig.setClusterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("issuerUrl", targetDepth)) {
                    context.nextToken();
                    oidcIdentityProviderConfig.setIssuerUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clientId", targetDepth)) {
                    context.nextToken();
                    oidcIdentityProviderConfig.setClientId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("usernameClaim", targetDepth)) {
                    context.nextToken();
                    oidcIdentityProviderConfig.setUsernameClaim(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("usernamePrefix", targetDepth)) {
                    context.nextToken();
                    oidcIdentityProviderConfig.setUsernamePrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("groupsClaim", targetDepth)) {
                    context.nextToken();
                    oidcIdentityProviderConfig.setGroupsClaim(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("groupsPrefix", targetDepth)) {
                    context.nextToken();
                    oidcIdentityProviderConfig.setGroupsPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("requiredClaims", targetDepth)) {
                    context.nextToken();
                    oidcIdentityProviderConfig.setRequiredClaims(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    oidcIdentityProviderConfig.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    oidcIdentityProviderConfig.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return oidcIdentityProviderConfig;
    }

    private static OidcIdentityProviderConfigJsonUnmarshaller instance;

    public static OidcIdentityProviderConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OidcIdentityProviderConfigJsonUnmarshaller();
        return instance;
    }
}
