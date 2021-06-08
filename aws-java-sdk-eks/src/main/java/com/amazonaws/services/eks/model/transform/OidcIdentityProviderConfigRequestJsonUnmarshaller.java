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
 * OidcIdentityProviderConfigRequest JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OidcIdentityProviderConfigRequestJsonUnmarshaller implements Unmarshaller<OidcIdentityProviderConfigRequest, JsonUnmarshallerContext> {

    public OidcIdentityProviderConfigRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        OidcIdentityProviderConfigRequest oidcIdentityProviderConfigRequest = new OidcIdentityProviderConfigRequest();

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
                    oidcIdentityProviderConfigRequest.setIdentityProviderConfigName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("issuerUrl", targetDepth)) {
                    context.nextToken();
                    oidcIdentityProviderConfigRequest.setIssuerUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clientId", targetDepth)) {
                    context.nextToken();
                    oidcIdentityProviderConfigRequest.setClientId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("usernameClaim", targetDepth)) {
                    context.nextToken();
                    oidcIdentityProviderConfigRequest.setUsernameClaim(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("usernamePrefix", targetDepth)) {
                    context.nextToken();
                    oidcIdentityProviderConfigRequest.setUsernamePrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("groupsClaim", targetDepth)) {
                    context.nextToken();
                    oidcIdentityProviderConfigRequest.setGroupsClaim(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("groupsPrefix", targetDepth)) {
                    context.nextToken();
                    oidcIdentityProviderConfigRequest.setGroupsPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("requiredClaims", targetDepth)) {
                    context.nextToken();
                    oidcIdentityProviderConfigRequest.setRequiredClaims(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
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

        return oidcIdentityProviderConfigRequest;
    }

    private static OidcIdentityProviderConfigRequestJsonUnmarshaller instance;

    public static OidcIdentityProviderConfigRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OidcIdentityProviderConfigRequestJsonUnmarshaller();
        return instance;
    }
}
