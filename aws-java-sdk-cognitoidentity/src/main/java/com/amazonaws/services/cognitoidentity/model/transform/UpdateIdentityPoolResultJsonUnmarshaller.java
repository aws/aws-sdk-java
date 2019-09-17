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
 * UpdateIdentityPoolResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateIdentityPoolResultJsonUnmarshaller implements Unmarshaller<UpdateIdentityPoolResult, JsonUnmarshallerContext> {

    public UpdateIdentityPoolResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateIdentityPoolResult updateIdentityPoolResult = new UpdateIdentityPoolResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateIdentityPoolResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("IdentityPoolId", targetDepth)) {
                    context.nextToken();
                    updateIdentityPoolResult.setIdentityPoolId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IdentityPoolName", targetDepth)) {
                    context.nextToken();
                    updateIdentityPoolResult.setIdentityPoolName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AllowUnauthenticatedIdentities", targetDepth)) {
                    context.nextToken();
                    updateIdentityPoolResult.setAllowUnauthenticatedIdentities(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SupportedLoginProviders", targetDepth)) {
                    context.nextToken();
                    updateIdentityPoolResult.setSupportedLoginProviders(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("DeveloperProviderName", targetDepth)) {
                    context.nextToken();
                    updateIdentityPoolResult.setDeveloperProviderName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OpenIdConnectProviderARNs", targetDepth)) {
                    context.nextToken();
                    updateIdentityPoolResult.setOpenIdConnectProviderARNs(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("CognitoIdentityProviders", targetDepth)) {
                    context.nextToken();
                    updateIdentityPoolResult.setCognitoIdentityProviders(new ListUnmarshaller<CognitoIdentityProvider>(CognitoIdentityProviderJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("SamlProviderARNs", targetDepth)) {
                    context.nextToken();
                    updateIdentityPoolResult.setSamlProviderARNs(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("IdentityPoolTags", targetDepth)) {
                    context.nextToken();
                    updateIdentityPoolResult.setIdentityPoolTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
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

        return updateIdentityPoolResult;
    }

    private static UpdateIdentityPoolResultJsonUnmarshaller instance;

    public static UpdateIdentityPoolResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateIdentityPoolResultJsonUnmarshaller();
        return instance;
    }
}
