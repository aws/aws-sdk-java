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
package com.amazonaws.services.cognitoidentity.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cognitoidentity.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateIdentityPoolResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIdentityPoolResultJsonUnmarshaller implements Unmarshaller<CreateIdentityPoolResult, JsonUnmarshallerContext> {

    public CreateIdentityPoolResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateIdentityPoolResult createIdentityPoolResult = new CreateIdentityPoolResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createIdentityPoolResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("IdentityPoolId", targetDepth)) {
                    context.nextToken();
                    createIdentityPoolResult.setIdentityPoolId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IdentityPoolName", targetDepth)) {
                    context.nextToken();
                    createIdentityPoolResult.setIdentityPoolName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AllowUnauthenticatedIdentities", targetDepth)) {
                    context.nextToken();
                    createIdentityPoolResult.setAllowUnauthenticatedIdentities(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SupportedLoginProviders", targetDepth)) {
                    context.nextToken();
                    createIdentityPoolResult.setSupportedLoginProviders(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("DeveloperProviderName", targetDepth)) {
                    context.nextToken();
                    createIdentityPoolResult.setDeveloperProviderName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OpenIdConnectProviderARNs", targetDepth)) {
                    context.nextToken();
                    createIdentityPoolResult.setOpenIdConnectProviderARNs(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("CognitoIdentityProviders", targetDepth)) {
                    context.nextToken();
                    createIdentityPoolResult.setCognitoIdentityProviders(new ListUnmarshaller<CognitoIdentityProvider>(CognitoIdentityProviderJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("SamlProviderARNs", targetDepth)) {
                    context.nextToken();
                    createIdentityPoolResult.setSamlProviderARNs(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("IdentityPoolTags", targetDepth)) {
                    context.nextToken();
                    createIdentityPoolResult.setIdentityPoolTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
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

        return createIdentityPoolResult;
    }

    private static CreateIdentityPoolResultJsonUnmarshaller instance;

    public static CreateIdentityPoolResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateIdentityPoolResultJsonUnmarshaller();
        return instance;
    }
}
